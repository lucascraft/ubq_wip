/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.ui.dmx.views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.smbt.dmx.ezdmxctrl.ChannelValues;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlFactory;
import net.sf.smbt.dmx.model.qxf.Capability;
import net.sf.smbt.dmx.model.qxf.Channel;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.utils.OpenDmxCmdUtils;
import net.sf.smbt.dmx.utils.QxfUtils;
import net.sf.smbt.ui.colors.UbiColorWheel;
import net.sf.smbt.ui.colors.UbiWheelColorPickedListener;
import net.sf.smbt.ui.dmx.Activator;
import net.sf.smbt.ui.dmx.editors.DMXMultiPageEditor;
import net.sf.smbt.ui.dmx.utils.DMXFixturesUtil;
import net.sf.smbt.ui.dmx.utils.DMXGraphicsUtil;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.vu.UbiButton;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiSlider;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class DMXSceneWidget extends Composite {
	private Map<FixtureDefinition, List<Integer>> fixtureValues;
	private Map<FixtureDefinition, Map<Integer, UbiSlider>> slidersMap;
	private Map<FixtureDefinition, Map<Integer, Label>> labelsMap;
	private Map<FixtureDefinition, Map<Integer, UbiButton>> buttonsMap;
	
	private DMXMultiPageEditor dmxEditor;
	private DMXProject dmxProject;
	private CmdPipe dmxPipe;
	private TabFolder folder;
	private Image beamerImage;
	private Font smallFont;
	
	public class DMXSliderSelectionListener implements UbiSelectionListener {
		private UbiSlider slider;
		public DMXSliderSelectionListener(UbiSlider slider) {
			this.slider = slider;
		}
		@Override
		public void handle() {
			new UbiJob("DMX Slider Update") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					if (!slider.isDisposed() ) {
						final FixtureDefinition fix = (FixtureDefinition) slider.getData("fixture");
						final Integer position = (Integer) slider.getData("position");
						
						if (!labelsMap.get(fix).get(position).isDisposed()) {
							fixtureValues.get(fix).set(position, slider.getSelection());
							labelsMap.get(fix).get(position).setText(""+slider.getSelection());
							if (dmxPipe != null) {
								byte[] bytes = DMXFixturesUtil.INSTANCE.getDMXUniverseFrame(fixtureValues);
								if (Platform.inDebugMode()) {
									System.out.println(CmdUtil.INSTANCE.getFrameHexInfo(bytes));
								}
								dmxPipe.send(
									OpenDmxCmdUtils.INSTANCE.createOpenDMXCmd(
										bytes	
									)
								);
							}
						}
					}
					return Status.OK_STATUS;
				}
			}.schedule();
		}
	}
	
	public void setDMXPipe(CmdPipe pipe) {
		dmxPipe = pipe;
	}
	public TabFolder getTabFolder() {
		return folder;
	}
	public DMXSceneWidget(Composite parent, final DMXMultiPageEditor dmxEditor, final DMXProject dmxProject, CmdPipe dmxPipe) {
		super(parent, SWT.NONE);
		
		FontData fData = new FontData("Lucida Grande", 9, SWT.NORMAL);
		smallFont = new Font(Display.getDefault(), fData);
	
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		fixtureValues 	= new HashMap<FixtureDefinition, List<Integer>>();
		slidersMap		= new HashMap<FixtureDefinition, Map<Integer, UbiSlider>>();
		labelsMap		= new HashMap<FixtureDefinition, Map<Integer, Label>>();
		buttonsMap		= new HashMap<FixtureDefinition, Map<Integer, UbiButton>>();

		beamerImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.dmx", "icons/beamer.gif").createImage();
		
		this.dmxEditor	= dmxEditor;
		this.dmxProject = dmxProject;
		this.dmxPipe 	= dmxPipe;

		setLayout(GridLayoutFactory.fillDefaults().create());
		setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		folder = new TabFolder(this, SWT.BOTTOM);
		folder.setLayout(GridLayoutFactory.fillDefaults().create());
		folder.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		folder.setBackground(GUIToolkit.BG);
		
		folder.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				TabItem item = (TabItem) event.item;
				dmxEditor.setActivePage(1);
				dmxEditor.setSelection(new StructuredSelection(dmxProject));
				folder.setSelection(item);
				//dmxEditor.setActivePage(0);
				/*
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.eclipse.ui.views.PropertySheet");
				} catch (PartInitException e) {
					e.printStackTrace();
				}
				*/
			}
		});
		
		createContent();
		
		dmxEditor.setSelection(new StructuredSelection(dmxProject));
	}
	
	private void createContent() {
		
		for (final FixtureDefinition def : dmxProject.getFixtureDefinitions()) {
			if (def.getChannel() == null || def.getChannel().isEmpty()) { continue; }
			
			TabItem tab = new TabItem(folder, SWT.BOTTOM);
			
			final Composite bag = new Composite(folder, SWT.NONE);
			bag.setBackground(GUIToolkit.BG);
			bag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			bag.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
			bag.addControlListener(new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {
					bag.setSize(folder.getSize().x - 20, folder.getSize().y - 30);
					bag.layout(true);
				}
				@Override
				public void controlMoved(ControlEvent e) {}
			});

			//
			// Controls & Info
			//
			
			final Composite leftBag = new Composite(bag, SWT.NONE);
			leftBag.setBackground(GUIToolkit.BG);
			leftBag.setLayout(GridLayoutFactory.fillDefaults().margins(0, 10).create());
			leftBag.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
			
			CLabel jumpers = new CLabel(leftBag, SWT.NONE);
			jumpers.setBackground(GUIToolkit.BG);
			jumpers.setImage(DMXGraphicsUtil.INSTANCE.createDMXFixtureJumpersImage(dmxProject, def));
			
			Button addCue = new Button(leftBag, SWT.PUSH);
			addCue.setText("Add Cue");
			addCue.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
			addCue.addSelectionListener(
				new SelectionListener() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						handleAddCue();
					}
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);
					}
				}
			);
			
			//
			// Fixtures sliders
			//
			
			final ScrolledComposite scXui = GUIToolkit.INSTANCE.createScrolledComposite(bag);
			scXui.setLayout(GridLayoutFactory.fillDefaults().create());
			scXui.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
			scXui.getParent().setBackground(GUIToolkit.BG);

			Composite g = new Composite(scXui, SWT.NONE);
			
			g.setBackground(GUIToolkit.BG);
			g.setLayout(GridLayoutFactory.fillDefaults().numColumns(1 + def.getChannel().size()).create());
			g.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

			scXui.setExpandVertical(true);
			scXui.setExpandHorizontal(true);
			scXui.setAlwaysShowScrollBars(true);
			scXui.setOrientation(SWT.HORIZONTAL);

			scXui.setContent(g);
			scXui.addControlListener(new ControlAdapter() {
				public void controlResized(ControlEvent e) {
					if (bag !=null && bag.getBounds() != null) {
						Rectangle r = bag.getBounds();
						scXui.setMinSize(r.width, SWT.DEFAULT);
					}
				}
			});
			
			tab.setData("fixture", def);
			
			List<Integer> values = new ArrayList<Integer>();
			fixtureValues.put(def, values);
			Integer pos = 0;
			
			Comparator<Integer> keyComparator = new Comparator<Integer>() {
				@Override
				public int compare(Integer arg0, Integer arg1) {
					return arg0.compareTo(arg1);
				}
			};
			
			Map<Integer, UbiSlider> slm 	= new TreeMap<Integer, UbiSlider>(keyComparator);
			slidersMap.put(def, slm);
			
			Map<Integer, Label> llm 		= new TreeMap<Integer, Label>(keyComparator);
			labelsMap.put(def, llm);
			
			Map<Integer, UbiButton> blm 	= new TreeMap<Integer, UbiButton>(keyComparator);
			buttonsMap.put(def, blm);
			

			Collection<Channel> channels = def.getChannel();
			if(!def.getMode().isEmpty()) {
				channels = QxfUtils.INSTANCE.getChannelsMapFromModeID(def, def.getMode().get(0).getName()).values();
			}
			for (final Channel channel : channels) {
				pos = channel.getNumber().intValue();
				
				final Composite vPanel = new Composite(g, SWT.NONE);
				vPanel.setLayout(GridLayoutFactory.fillDefaults().margins(0, 10).create());
				vPanel.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
				vPanel.setBackground(GUIToolkit.BG);
				
				String name = channel.getName();
				
				String gID = "";
				if (channel.getGroup() != null && channel.getGroup().getByte() != null) {
					gID = channel.getGroup().getValue();
				}
				Image img = DMXGraphicsUtil.INSTANCE.getDMXGroupImage(gID);
				final UbiButton button = new UbiButton(vPanel);
				if (img != null) {
					button.setImage(img);
				}
				//button.setLayout(GridLayoutFactory.fillDefaults().create());
				button.setLayoutData(GridDataFactory.fillDefaults().hint(24, 24).minSize(SWT.DEFAULT, 24).create());
				button.setBackground(ColorConstants.darkGray);
				button.setForeground(ColorConstants.darkGray);
				
				blm.put(pos, button);

				final UbiSlider s = new UbiSlider(vPanel, SWT.VERTICAL, false, UbiSlider.UBI_SLIDER_RICH_LOOK);
				
				slm.put(pos, s);

				button.addSelectionListener(
					new UbiSelectionListener() {
						@Override
						public void handle() {
							final Shell shell = new Shell (vPanel.getShell() , (SWT.NO_TRIM | SWT.APPLICATION_MODAL | SWT.TOOL) );
							Point pt = button.toDisplay(button.getLocation());
							handleChannelSettingWidget(shell, pt, s, def, channel);
						}
					}
				);
				
				values.add(0);
				
				
				s.setToolTipText(name);
				s.setData("channel", channel);
				s.setData("fixture", def);
				s.setData("position", pos);
//				s.setLayout(GridLayoutFactory.fillDefaults().create());
				s.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).hint(21, 150).minSize(SWT.DEFAULT, 50).align(SWT.CENTER, SWT.TOP).create());
				
				for (Capability capability : channel.getCapability()) {
					//s.setMin(Float.parseFloat(capability.getMin()));
					s.setMax(Float.parseFloat(capability.getMax()));
				}
				
				DMXSliderSelectionListener listener = new DMXSliderSelectionListener(s);
				s.addSelectionListener(listener);
				s.setData("listener", listener);
				
				Label label = new Label(vPanel, SWT.NONE);
				label.setLayoutData(GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.TOP).create());
				label.setForeground(ColorConstants.lightGray);
				label.setFont(smallFont);
				
				llm.put(pos, label);

				tab.setControl(bag);
				tab.setText(def.getModel());
				tab.setImage(beamerImage);
				
				folder.layout(true);
				g.layout(true);
				g.update();
				g.redraw();
				
				for (UbiSlider slider : slidersMap.get(def).values()) {
					DMXSliderSelectionListener l = (DMXSliderSelectionListener) slider.getData("listener");
					slider.removeSelectionListener(l);
					
					final FixtureDefinition fix = (FixtureDefinition) slider.getData("fixture");
					final Integer position = (Integer) slider.getData("position");
					
					if (!labelsMap.get(fix).get(position).isDisposed()) {
						fixtureValues.get(fix).set(position, slider.getSelection());
						labelsMap.get(fix).get(position).setText(""+(slider.getSelection()==0?"0.00":slider.getSelection()));
					}

					slider.setSelection(0);
					slider.setValue(0);
					
					slider.addSelectionListener(l);
				}
			}

			TabItem tabGeneral = new TabItem(folder, SWT.BOTTOM);
			tabGeneral.setText("General");
			tabGeneral.setImage(
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/categories/preferences-system.png"
				).createImage()
			);
			Composite container = new Composite(folder, SWT.NONE);
			container.setBackground(GUIToolkit.BG);
			container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
			
			final Composite gg = new Composite(container, SWT.NONE);
			
			gg.setBackground(GUIToolkit.BG);
			gg.setLayout(GridLayoutFactory.fillDefaults().create());
			gg.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

			gg.addControlListener(new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {
					gg.setSize(folder.getSize().x - 20, folder.getSize().y - 30);
					gg.layout(true);
				}
				@Override
				public void controlMoved(ControlEvent e) {}
			});
			
			final UbiSlider gs = new UbiSlider(gg, SWT.VERTICAL, false, UbiSlider.UBI_SLIDER_RICH_LOOK);
			gs.setLayout(GridLayoutFactory.fillDefaults().create());
			gs.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).hint(21, 250).align(SWT.CENTER, SWT.TOP).create());
			gs.setMax(255f);
			gs.setValue(255f);
			
			Label text = new Label(gg, SWT.NONE);
			text.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
			text.setBackground(GUIToolkit.BG);
			text.setForeground(ColorConstants.lightGray);
			text.setText("Main");
			
			final Composite gg2 = new Composite(container, SWT.NONE);
			
			gg2.setBackground(GUIToolkit.BG);
			gg2.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
			gg2.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
			
			Button addCueButton = new Button(gg2, SWT.PUSH);
			addCueButton.setForeground(ColorConstants.lightGray);
			addCueButton.setText("Add Cue");
			addCueButton.addSelectionListener(
				new SelectionListener() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						handleAddCue();
					}
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);
					}
				}
			);
			
			Button removeCueButton = new Button(gg2, SWT.PUSH);
			removeCueButton.setForeground(ColorConstants.lightGray);
			removeCueButton.setText("Remove Cue");
			removeCueButton.addSelectionListener(
				new SelectionListener() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						handleRemoveCue();
					}
					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						widgetSelected(e);
					}
				}
			);

			tabGeneral.setControl(container);
		}
	}
	
	
	private void handleChannelSettingWidget(final Shell shell, final Point pt, UbiSlider slider, FixtureDefinition fixture, Channel channel) {
		shell.setLayout(GridLayoutFactory.fillDefaults().create());
		shell.setLayoutData(GridDataFactory.fillDefaults().hint(200, 200).create());
		
		handleWidgetFromChannelDefinition(shell, slider, fixture, channel);

		shell.setLocation(pt.x - 90, pt.y - 90);
		shell.pack();
		shell.open();
	}

	
	
	private void handleWidgetFromChannelDefinition(final Shell shell, UbiSlider slider, FixtureDefinition fixture, Channel channel) {
		if (channel != null && channel.getGroup() != null && channel.getGroup().getValue() != null) {
			String type = channel.getGroup().getValue();
			if ("Colour".equals(type)) {
				handleRGBWidget(shell, slider, fixture, channel);
			} else if ("Maintenance".equals(type)) {
				
			} else if ("Ext".equals(type)) {
				
			} else if ("Intensity".equals(type)) {
				
			} else if ("Effect".equals(type)) {
				
			} else if ("Pan".equals(type)) {
				
			} else if ("Tilt".equals(type)) {
				
			} else if ("Beam".equals(type)) {
				
			} else if ("Nothing".equals(type)) {
				
			} else if ("Gobo".equals(type)) {
				
			} else if ("Prism".equals(type)) {
				
			} else if ("Speed".equals(type)) {
				
			}
		}
	}
	
	
	
	
	private void handleRGBWidget(final Shell shell, final UbiSlider slider, final FixtureDefinition fixture, final Channel channel) {
		UbiColorWheel wheel = new UbiColorWheel(shell);
		wheel.setLayout(GridLayoutFactory.fillDefaults().create());
		wheel.setLayoutData(GridDataFactory.fillDefaults().hint(200, 200).create());
		wheel.addMouseTrackListener(new MouseTrackListener() {
			@Override
			public void mouseHover(MouseEvent e) {}
			@Override
			public void mouseExit(MouseEvent e) {
				shell.close();
			}
			@Override
			public void mouseEnter(MouseEvent e) {}
		});
		wheel.addColorPickedListener(new UbiWheelColorPickedListener() {
			@Override
			public void rgbPicked(RGB picked, List<RGB> lastColors) {
				computeSliderValueFromFixtureDefinitionAndChannel(picked, slider, fixture, channel);
				shell.close();
			}
		});
	}
	
	
	private void computeSliderValueFromFixtureDefinitionAndChannel(RGB picked, UbiSlider slider, FixtureDefinition fixture, Channel channel) {
		
	}
	
	
	
	
	
	
	
	
	private void handleRemoveCue() {
		// 
	}
	
	private void handleAddCue() {
		if (dmxProject.getUniverses() != null && !dmxProject.getUniverses().isEmpty()) {
			int selection	= folder.getSelectionIndex();
			TabItem item	= folder.getItem(selection);
			if (selection > 0) {
				if (item.getData("fixture") instanceof FixtureDefinition) {
					FixtureDefinition defintion = (FixtureDefinition)item.getData("fixture");
					DMXFixture cueFixture = EzdmxctrlFactory.eINSTANCE.createDMXFixture();
					cueFixture.setDefinition(defintion);
					dmxProject.getUniverses().get(0).getCues().add(cueFixture);
					
					for (UbiSlider s : slidersMap.get(defintion).values()) {
						Channel channel 				= (Channel) s.getData("channel");
						//FixtureDefinition definition 	= (FixtureDefinition) s.getData("fixture");
						@SuppressWarnings("unused")
						Integer position 				= (Integer) s.getData("position");
						ChannelValues v					= EzdmxctrlFactory.eINSTANCE.createChannelValues();
						
						v.setChannel(channel);
						v.setValue(s.getSelection());
						cueFixture.getValues().add(v);
					}
					dmxEditor.setActivePage(1);
					folder.setSelection(item);
					dmxEditor.setSelection(new StructuredSelection(defintion));
				}
			}
		}
	}
	
	public void reset() {
		for (TabItem g : folder.getItems()) {
			g.dispose();
		}
		fixtureValues.clear();
		createContent();
	}
}
