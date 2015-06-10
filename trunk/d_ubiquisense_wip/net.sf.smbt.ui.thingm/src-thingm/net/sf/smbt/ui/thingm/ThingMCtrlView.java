/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.thingm;

import java.util.List;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.mappings.thingm.ThingMToOscMapping;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.tests.rgb.rgbargs.RGBStepNDelayArgs;
import net.sf.smbt.tests.rgb.rgbargs.RgbargsFactory;
import net.sf.smbt.ui.colors.UbiWheelColorPickedListener;
import net.sf.smbt.ui.colors.UbiWheelColorPicker;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class ThingMCtrlView extends ViewPart {
	public final static String ID = "net.sf.smbt.ui.blinkm.ThingMCtrlView";
	
	private Font bigFont = new Font(Display.getDefault(), "tahoma", 18, SWT.BOLD);
	@SuppressWarnings("unused")
	private RGBStepNDelayArgs rgbArgs;
	private ThingM48StepSequencer seq;
	private ThingMTick tickListener;
	private EzThingMCmdDumper ezDumper;
	private UbiWheelColorPicker colorPalette;
	
	private Action 	playThingMScriptAction,
					connectArduinoAction, 
					disconnectArduinoAction, 
					uploadThingMScriptAction, 
					dumpEzThingMAction;

	public ThingMCtrlView() {
		ezDumper = new EzThingMCmdDumper();
	}
	
	class EzThingMCmdDumper extends AbstractQxEventHandlerImpl {
		@Override
		public synchronized void handleQxEvent(Event event) {
			if (event.getKind() == EVENT_KIND.TX_DONE) {
				if (event.getCmd() instanceof BlinkMCmd) {
					QuanticMojo.INSTANCE.acceptLocalAgentCmd(
						ThingMToOscMapping.INSTANCE.thingm2osc(((BlinkMCmd)event.getCmd()))
					);
				}
			}
		}
	}
	
	@Override
	public void createPartControl(Composite parent) {
		parent.setBackground(GUIToolkit.BG);
		
		rgbArgs = RgbargsFactory.eINSTANCE.createRGBStepNDelayArgs();
		
		TabFolder folder = new TabFolder(parent, SWT.NONE);
		folder.setBackground(GUIToolkit.BG);
		
		Composite container = GUIToolkit.INSTANCE.createComposite(folder);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		TabItem tabItem = GUIToolkit.INSTANCE.createTabItem(folder, SWT.NONE);

		seq = new ThingM48StepSequencer(container, SWT.NONE);
		seq.setBackground(GUIToolkit.BG);
		
		tickListener = new ThingMTick();
		seq.addThingMTickListener(tickListener);
		
		Composite rightPanel = GUIToolkit.INSTANCE.createComposite(container);
		rightPanel.setLayout(GridLayoutFactory.fillDefaults().create());
		rightPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		final Button connectLabel = new Button(rightPanel, SWT.TOGGLE);
		connectLabel.setLayoutData(GridDataFactory.fillDefaults().hint(200, 80).minSize(200, 80).create());
		connectLabel.setBackground(ColorConstants.orange);
		connectLabel.setForeground(ColorsUtil.BG);
		connectLabel.setFont(bigFont);
		connectLabel.setText("Connect");
		connectLabel.setImage(
			Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, 
				"icons/connect-48x48.png"
			).createImage()
		);
		connectLabel.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				connectArduinoAction.run();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		final Image playImage = Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, 
				"icons/play-48x48.png"
			).createImage();
		final Image pauseImage = Activator.imageDescriptorFromPlugin(
			Activator.PLUGIN_ID, 
			"icons/pause-48x48.png"
		).createImage();
		
		final Button playLabel = new Button(rightPanel, SWT.TOGGLE);
		playLabel.setLayoutData(GridDataFactory.fillDefaults().hint(200, 80).minSize(200, 80).create());
		playLabel.setFont(bigFont);
		playLabel.setBackground(ColorConstants.orange);
		playLabel.setForeground(ColorsUtil.BG);
		playLabel.setText("Play");
		playLabel.setImage(
			playImage
		);
		playLabel.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (playLabel.getSelection()) {
					seq.play();
					playLabel.setText("Pause");
					playLabel.setImage(pauseImage);
				} else {
					seq.pause();
					playLabel.setText("Play");
					playLabel.setImage(playImage);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		Label loopLabel = new Label(rightPanel, SWT.NONE);
		loopLabel.setFont(bigFont);
		loopLabel.setText("Loop Speed");
		loopLabel.setBackground(ColorsUtil.BG);
		loopLabel.setForeground(ColorConstants.lightGray);
		
		String[] durations = new String[] { "3", "30", "100", "300", "600" };
		final ComboViewer durationComboViewer = new ComboViewer(new CCombo(rightPanel, SWT.READ_ONLY));
		durationComboViewer.getCCombo().setLayoutData(GridDataFactory.fillDefaults().hint(200, 50).minSize(200, 50).create());
		durationComboViewer.getCCombo().setFont(bigFont);
		durationComboViewer.getCCombo().setBackground(ColorsUtil.BG);
		durationComboViewer.getCCombo().setForeground(ColorConstants.lightGray);
		durationComboViewer.setContentProvider(new ArrayContentProvider());
		durationComboViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof String) {
					return Long.parseLong((String)element) + " seconds";
				}
				return super.getText(element);
			}
		});
		durationComboViewer.getCCombo().setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 30).minSize(SWT.DEFAULT, 30).create());
		durationComboViewer.setInput(durations);
		durationComboViewer.getCCombo().select(0);
		
		durationComboViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					IStructuredSelection ssel = (IStructuredSelection) durationComboViewer.getSelection();
					String v = (String) ssel.getFirstElement();
					seq.setDuration(Long.parseLong(v)*1000);
				}
			}
		);
		
		/* Color Palette picker */
		
		Composite bottomPanel = GUIToolkit.INSTANCE.createComposite(container);
		bottomPanel.setLayout(GridLayoutFactory.fillDefaults().create());
		bottomPanel.setLayoutData(
			GridDataFactory.fillDefaults().span(2, 1).
				align(SWT.CENTER, SWT.TOP).grab(true, true).create()
		);
		bottomPanel.setBackground(GUIToolkit.BG);
		
		colorPalette = new UbiWheelColorPicker(bottomPanel);
		colorPalette.setBackground(GUIToolkit.BG);
		colorPalette.setLayout(
			GridLayoutFactory.fillDefaults().create()
		);
		colorPalette.setLayoutData(
			GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).
				hint(250, 250).minSize(250, 250).
					grab(true, true).create()
		);
		colorPalette.addColorPickedListener(
			new UbiWheelColorPickedListener() {
				@Override
				public void rgbPicked(RGB picked, List<RGB> lastColors) {
					seq.setSelectedBoxColor(picked);
					colorPalette.setLabelColor(picked);
				}
			}
		);
		
		tabItem.setText("Sequencer");
		tabItem.setControl(container);
		tabItem.setImage(
			Activator.imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, 
				"icons/thingm2.png"
			).createImage()
		);
		
		GUIToolkit.INSTANCE.adapt(seq);
		
		//RGBStepControlUI.createColorContent(folder, rgbArgs);

		makeActions();
		contributeToActionBars();
	}

	@Override
	public void setFocus() {

	}
	
	public void initControl(IFile netConfFile, RGBStepNDelayArgs rgbArgs) {
		RGBStepControlCore.INSTANCE.start(netConfFile, rgbArgs);
	}

	public void terminateControl() {
		RGBStepControlCore.INSTANCE.stop();
	}
	
	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(connectArduinoAction);
		//manager.add(disconnectArduinoAction);
		//manager.add(uploadThingMScriptAction);
		manager.add(new Separator());
		manager.add(dumpEzThingMAction);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		//manager.add(connectArduinoAction);
		//manager.add(disconnectArduinoAction);
		//manager.add(uploadThingMScriptAction);
		manager.add(new Separator());
		manager.add(dumpEzThingMAction);
	}

	private CmdPipe thingmPipe;
	private void makeActions() {
		playThingMScriptAction = new Action("Play ThingM Sequence", SWT.TOGGLE) {
			public void run() {
				if (playThingMScriptAction.isChecked()) {
					seq.pause();
					playThingMScriptAction.setImageDescriptor(
						Activator.imageDescriptorFromPlugin(
							"net.sf.smbt.ui", 
							"icons/actions/media-playback-start.png"
						)
					);
				} else {
					seq.play();
					playThingMScriptAction.setImageDescriptor(
						Activator.imageDescriptorFromPlugin(
							"net.sf.smbt.ui", 
							"icons/actions/media-playback-pause.png"
						)
					);
				}
			}
		};	
		
		playThingMScriptAction.setToolTipText("Play ThingM program");
		playThingMScriptAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/actions/media-playback-start.png"
			)
		);
		
		connectArduinoAction = new Action() {
			public void run() {
				CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"thingm"});
				if (dlg.open() == Window.OK) {
					Object[] results = dlg.getResult();
					if (results != null) {
						for (Object obj : results) {
							if (obj instanceof CmdPipe) {
								CmdPipe p = (CmdPipe) obj;
								thingmPipe = p;
								tickListener.setPipe(p);
								break;
							}
						}
					} else {
						CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"thingm"});
						int status = pipeConfigWizardDialog.open();
						if (status == Window.OK) {
							CmdPipe pipe = pipeConfigWizardDialog.getSelection();
							if (pipe != null) {
								thingmPipe = pipe;
								tickListener.setPipe(pipe);
							}
						}
					}
					if (thingmPipe!=null){
						thingmPipe.setLocked(true);
					}
				}
			}
		};	
		
		connectArduinoAction.setText("Connection To ThingM over USB/Arduino");
		connectArduinoAction.setToolTipText("Connection To ThingM over USB/Arduino Tooltip");
		connectArduinoAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.thingm", 
				"icons/arduino-add.png"
			)
		);
		
		dumpEzThingMAction = new Action("Dump ThingM as OSC", SWT.TOGGLE) {
			public void run() {
				if (isChecked()) {
					if(thingmPipe != null && dumpEzThingMAction.isChecked()) {
						thingmPipe.removeQxEventHandler(ezDumper);
						thingmPipe.addQxEventHandler(ezDumper);
					}
				}
			}
		};
		dumpEzThingMAction.setToolTipText("Dump ThingM as OSC in the console");
		dumpEzThingMAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/status/software-update-available.png"
			)
		);
		
		disconnectArduinoAction = new Action() {
			public void run() {
				QuanticMojo.INSTANCE.closePipe(thingmPipe, true);
			}
		};
		disconnectArduinoAction.setText("Disconnection From ThingM over USB/Arduino");
		disconnectArduinoAction.setToolTipText("Disconnection From ThingM over USB/Arduino Tooltip");
		disconnectArduinoAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.thingm", 
				"icons/arduino-remove.png"
			)
		);

		uploadThingMScriptAction = new Action() {
			public void run() {
				seq.pause();
				if (thingmPipe instanceof CmdPipe) {
					CompoundCmd cCmd = CmdFactory.eINSTANCE.createCompoundCmd();
					cCmd.add(
						BlinkMUtil.INSTANCE.createSetScriptLengthAndRepeatCmd(
							"0x00", 
							0, 
							48, 
							1
						)
					);
					for (Integer l : seq.getValues().keySet()) {
						for (Integer k : seq.getValues().get(l).keySet()) {
							RGB rgb = seq.getValues().get(0).get(k);
							cCmd.add(
								BlinkMUtil.INSTANCE.createWriteScriptCmd(
									"0x00", 
									0, 
									k.intValue(), 
									10, 
									Byte.parseByte("0x63"), 
									(byte) rgb.red, 
									(byte) rgb.green, 
									(byte) rgb.blue
								)
							);
						}
					}
					for (Cmd c : cCmd.getChildren()) {
						thingmPipe.send(
							c,
							20l
						);
					}
				}
			}
		};
		uploadThingMScriptAction.setText("Upload ThingM scipt over USB/Arduino");
		uploadThingMScriptAction.setToolTipText("Upload ThingM scipt over USB/Arduino");
		uploadThingMScriptAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.thingm", 
				"icons/arduino-refresh.png"
			)
		);
	}
}
