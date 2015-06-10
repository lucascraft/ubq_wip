/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.ableton.views;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.smbt.ezableton.CLIP_STATE;
import net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING;
import net.sf.smbt.ezabletonctrl.AbstractLiveDevice;
import net.sf.smbt.ezabletonctrl.LiveClip;
import net.sf.smbt.ezabletonctrl.LiveParam;
import net.sf.smbt.ezabletonctrl.LiveScene;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ezabletonctrl.MASTER_CTRL;
import net.sf.smbt.osc.ableton.utils.AbletonLive8Utils;
import net.sf.smbt.osc.ableton.utils.AbletonLiveControllerUtils;
import net.sf.smbt.ui.ableton.Activator;
import net.sf.smbt.ui.ableton.actions.LinkOscAbletonCommandAction;
import net.sf.smbt.ui.ableton.controller.AbletonLiveDetailsContentProvider;
import net.sf.smbt.ui.ableton.controller.AbletonLiveLabelProvider;
import net.sf.smbt.ui.ableton.dialogs.AbstractDeviceWidget;
import net.sf.smbt.ui.ableton.services.AbletonWidgetManager;
import net.sf.smbt.ui.ableton.widget.XUITrack;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.vu.SevenSegmentsDisplay;
import net.sf.smbt.ui.widgets.vu.UbiDbMeter;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiVuMeter;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

public class AbletonLiveView extends ViewPart {
	public final static String VOID_UTF8_STRING = new String("".getBytes(Charset.availableCharsets().get("UTF-8")), Charset.availableCharsets().get("UTF-8"));
	
	private AbletonLiveControllerUtils liveController;
	private int lastSceneID;
	private Composite detailsPanel;
	private SashForm bottomSash, sash;
	private Composite deviceWidgetContainer;
	
	class LiveUIJob extends UbiJob {
		long loop = 0; 
		public LiveUIJob() {
			super(UUID.randomUUID().toString());
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			int leftMeterLevel = new Float(liveController.getLiveApp().getMasterTrack().getLeftMeter()*100f).intValue();
			if (masterVu.getLLevel() != leftMeterLevel) {
				masterVu.setLLevel(leftMeterLevel);
			}
			int rightMeterLevel = new Float(liveController.getLiveApp().getMasterTrack().getRightMeter()*100f).intValue();
			if (masterVu.getRLevel() != rightMeterLevel) {
				masterVu.setRLevel(rightMeterLevel);
			}
			if (!masterVu.isDisposed()) {
				masterVu.redraw();
			}
			LiveScene currentScene = liveController.getLiveApp().getCurrentScene();
			if (currentScene instanceof LiveScene) {
				int id = currentScene.getSceneID()-1;
				if (lastSceneID <= 0) {
					lastSceneID = id;
				} else {
					if (lastSceneID != id) {
						handleDoubleClickSelection(currentScene, false);
						lastSceneID = id;
					}
				}
			}
			/*
			int tempo = new Float(liveController.getLiveApp().getTempo()).intValue();
			if (tempoValLabel !=null && !tempoValLabel.isDisposed()) {
				tempoValLabel.setText(""+tempo+" Bpm");
			}
			
			int timeSong = new Float(liveController.getLiveApp().getTime()).intValue();
			if (timeSongLCD !=null && !timeSongLCD.isDisposed()) {
				timeSongLCD.setText(""+(timeSong/4));
			}
			 */
			
			int panVal = new Float(liveController.getLiveApp().getMasterTrack().getPan()*100f).intValue();
			if (!masterPan.isDisposed()) {
				if (masterPan.getSelection() != panVal) {
					masterPan.setSelection((panVal+100)/2);
				}
			}
			int volumeVal = new Float(liveController.getLiveApp().getMasterTrack().getVolume()*100f).intValue();
			if (!masterVolume.isDisposed()) {
				if (masterVolume.getSelection() != volumeVal) {
					masterVolume.setSelection(volumeVal);
				}
			}
			
			/*
			int masterMeterLevel = (leftMeterLevel + rightMeterLevel) / 2;
			if (dbMeter.getLevel() != masterMeterLevel) {
				dbMeter.setLevel(masterMeterLevel);
			}
			*/
			
			if (subDetailsViewer != null && subDetailsViewer.getControl() != null && !subDetailsViewer.getControl().isDisposed()) {
				if (subDetailsViewer.getInput() != liveController.getLiveApp()) {
					subDetailsViewer.setInput(liveController.getLiveApp());
					subDetailsViewer.refresh(true);
				}
			}
			
			if (liveController.getLiveApp().getScenes() != null) {
				if (lastSceneID>0 && lastSceneID<liveController.getLiveApp().getScenes().size()) {
					subDetailsViewer.refresh(liveController.getLiveApp().getScenes().get(lastSceneID), true);
				}
			}
			schedule(100);
			return Status.OK_STATUS;
		}
	}
	class LiveUIJob2 extends UIJob {
		long loop = 0; 
		public LiveUIJob2() {
			super(UUID.randomUUID().toString());
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			for (LiveTrack t : xuiTrackMap.keySet()) {
				XUITrack xuiTrack = xuiTrackMap.get(t);
				boolean redraw = false;
				float lVal = t.getLeftMeter() * 100f;
				if (xuiTrack.getVuSlider().getLLevel() != lVal) {
					xuiTrack.getVuSlider().setLLevel(lVal);
					redraw = true;
				}
				float rVal = t.getRightMeter() * 100f;
				if (xuiTrack.getVuSlider().getRLevel() != rVal) {
					xuiTrack.getVuSlider().setRLevel(rVal);
					redraw = true;
				}
				float vVal = t.getVolume() * 100f;
				if (xuiTrack.getVuSlider().getValue() != vVal) {
					xuiTrack.getVuSlider().setValue(vVal);
				}
				float pVal = t.getPan() * 100f;
				if (xuiTrack.getKnobPan().getValue() != pVal) {
					xuiTrack.getKnobPan().setValue(pVal, false);
				}
				if (redraw) {
					xuiTrack.redraw();
				}
			}
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	//
	// Properties
	//
	public static final String P_ABLETON_INPUT_PORT		= "abletonInputPortPreference";
	public static final String P_ABLETON_OUTPUT_PORT	= "abletonOutputPortPreference";
	public static final String P_ABLETON_IP_ADDRESS		= "abletonIPAddressPreference";


	//
	// User double click action handling action
	//
	private Map<LiveTrack, TreeViewerColumn> treeColumnsMap;
	private Map<LiveTrack, XUITrack> xuiTrackMap;
	//
	// Master controls actions
	// 
	private Action masterPlayAction, masterPlayContinueAction, masterStopAction, masterOverdubAction;
	private Action masterNextCueAction, masterPrevCueAction, doubleClickAction2;
	private Action dumpToConsoleAction, monitorDevicesAction;
	//private Action dumpHierarchicalOSCAction;
	//private Action openAbletonPrefsAction;
	
	//private UIAdapterImpl masterUIAdapter;
	@SuppressWarnings("unused")
	private SevenSegmentsDisplay timeSongLCD;
	private UbiKnob masterVolume, masterPan;
	//private CLabel leftVuLevelLabel, rightVuLevelLabel;
	private UbiVuMeter masterVu;
	@SuppressWarnings("unused")
	private UbiDbMeter dbMeter;
	//private Label tempoValLabel;
	private ScrolledComposite sc, scXui;
	private SelectionListener hbarScXui, hbarSc;
	private Composite devicesPanel, xuiPanel;
	private GridLayout xuiPanelLayout;
	private TreeViewer devicesViewer;
	
	//private ISelectionChangedListener tracksViewerSelectionChangedListener;
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.smbt.ui.ableton.LiveView";

	private TreeViewer subDetailsViewer;
	private Image playImage, stopImage, playImageBig, stopImageBig, deviceImage, paramImage;
	
	public AbletonLiveView() {
		treeColumnsMap 	= new ConcurrentHashMap<LiveTrack, TreeViewerColumn>();
		xuiTrackMap		= new HashMap<LiveTrack, XUITrack>();
		playImage		= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui", "icons/actions/media-playback-start-green.png").createImage();
		stopImage		= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui", "icons/actions/media-playback-stop.png").createImage();
		playImageBig	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/play.png").createImage();
		stopImageBig	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/stop.png").createImage();
		deviceImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/device.gif").createImage();
		paramImage		= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui", "icons/parameter.gif").createImage();

		liveController = new AbletonLiveControllerUtils();
		
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
				if (liveController != null) {
					if (liveController.getAbletonOscEngine() instanceof CmdPipe) {
						Integer inPort = 9001;
						if (!liveController.getAbletonOscEngine().getPorts().isEmpty()) {
							inPort = liveController.getAbletonOscEngine().getPorts().get(0);
						}
						String addr = "localhost";
						Integer outPort = 9000;
						if (liveController.getAbletonOscEngine().getAddr() != null) {
							String tmp = liveController.getAbletonOscEngine().getAddr();
							if (tmp.contains(":")) {
								String[] tk = tmp.split(":");
								if (tk != null && tk.length >= 2) {
									addr = tk[0];
									outPort = Integer.parseInt(tk[1]);
								}
							}
						}
						boolean aPropHasChanged = false;
						if (event.getProperty().equals(P_ABLETON_INPUT_PORT)) {
							if (event.getNewValue() instanceof Integer && !inPort.equals(event.getNewValue())) {
								aPropHasChanged = true;
								inPort = (Integer) event.getNewValue();
							}
						} else if (event.getProperty().equals(P_ABLETON_OUTPUT_PORT)) {
							if (event.getNewValue() instanceof Integer && !outPort.equals(event.getNewValue())) {
								aPropHasChanged = true;
								outPort = (Integer) event.getNewValue();
							}
						} else if (event.getProperty().equals(P_ABLETON_IP_ADDRESS)) {
							if (event.getNewValue() instanceof String && !addr.equals(event.getNewValue())) {
								aPropHasChanged = true;
								addr = (String) event.getNewValue();
							}
						}
						if (aPropHasChanged) {
							liveController.resetAbletonOscEngine(
								addr, outPort, inPort
							);
						}
					}
				}
			}
		});
	}
	
	public void createPartControl(Composite parent) {
		parent.setBackground(GUIToolkit.BG);
		
		//
		// GUI refresh job init 
		//
		new LiveUIJob().schedule();
		new LiveUIJob2().schedule();
		
		createDetailsPanel(parent); 

		makeActions();
		contributeToActionBars();
		
		Activator.log("Ableton Live view UI initialized");
	}
	
	private class DevicesContentProvider implements ITreeContentProvider {
		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
		 */
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof AbstractLiveDevice) {
				Object[] params = ((AbstractLiveDevice)parentElement).getParameters().toArray();
				return params;
			}
			return new Object[0];
		}

		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
		 */
		public Object getParent(Object element) {
			if (element instanceof LiveParam) {
				return ((LiveParam)element).eContainer();
			}
			return null;
		}

		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
		 */
		public boolean hasChildren(Object element) {
			if (element instanceof AbstractLiveDevice) {
				return !((AbstractLiveDevice)element).getParameters().isEmpty();
			}
			return false;
		}
		@Override
		public void dispose() {}
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}
		@SuppressWarnings("unchecked")
		@Override
		public Object[] getElements(Object inputElement) {
			return ((List<AbstractLiveDevice>)inputElement).toArray();
		}
	}
	
	private void createDetailsPanel(Composite container) {
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		detailsPanel = GUIToolkit.INSTANCE.createComposite(container, SWT.DOUBLE_BUFFERED);
		detailsPanel.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		detailsPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		sash = new SashForm(detailsPanel, SWT.BORDER | SWT.VERTICAL);
		sash.setLayout(GridLayoutFactory.fillDefaults().create());
		sash.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sash.setBackground(GUIToolkit.FG);
		
		Composite topPanel = GUIToolkit.INSTANCE.createComposite(detailsPanel, SWT.DOUBLE_BUFFERED);
		topPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		topPanel.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).create());
		

		Composite timeDetails = GUIToolkit.INSTANCE.createComposite(topPanel, SWT.DOUBLE_BUFFERED);
		timeDetails.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		timeDetails.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(true, false).create());
		
		// Tempo (BPM) 
		/*
		Label tempoLabel = GUIToolkit.INSTANCE.createLabel(timeDetails, "Tempo: ");
		tempoLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, false).create());

		tempoValLabel = GUIToolkit.INSTANCE.createLabel(timeDetails, "-- Bpm");
		tempoValLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, false).create());
		
		timeSongLCD = new SevenSegmentsDisplay(timeDetails, 5, SWT.NONE);
		timeSongLCD.setLayout(GridLayoutFactory.fillDefaults().create());
		timeSongLCD.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).span(2, 1).hint(300, 75).grab(false, false).create());
		timeSongLCD.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
		 */
		
		Composite masterButtons = GUIToolkit.INSTANCE.createComposite(topPanel, SWT.DOUBLE_BUFFERED);
		masterButtons.setLayout(GridLayoutFactory.fillDefaults().create());
		masterButtons.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(true, false).create());
		
		
		final Button playStopButton = new Button(masterButtons, SWT.TOGGLE);
		playStopButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(64, 64).minSize(64, 64).create());
		playStopButton.setForeground(ColorsUtil.BG);
		playStopButton.setImage(
			playImageBig
		);
		playStopButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (playStopButton.getSelection()) {
					playStopButton.setImage(stopImageBig);
					liveController.handleMasterTrackState(MASTER_CTRL.PLAY);
				} else {
					playStopButton.setImage(playImageBig);
					liveController.handleMasterTrackState(MASTER_CTRL.STOP);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});

		/*
		Composite dbMeterPanel = GUIToolkit.INSTANCE.createComposite(topPanel, SWT.DOUBLE_BUFFERED);
		dbMeterPanel.setLayout(GridLayoutFactory.fillDefaults().create());
		dbMeterPanel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(true, true).create());
		
		
		dbMeter = new UbiDbMeter(dbMeterPanel, SWT.HORIZONTAL);
		dbMeter.setMax(100f);
		dbMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(145, 145).grab(false, false).create());
		*/
		
		//
		// Volume, Pan, Meter (R + L)
		//

		Composite upPanel = GUIToolkit.INSTANCE.createComposite(topPanel, SWT.SHADOW_ETCHED_IN);
		upPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		upPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		Composite vPanel = GUIToolkit.INSTANCE.createComposite(upPanel, SWT.SHADOW_ETCHED_IN);
		vPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		vPanel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(true, false).create());
		
		masterVolume = new UbiKnob(vPanel, SWT.HORIZONTAL);
		masterVolume.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(48, 48).grab(false, false).create());
		masterVolume.setMax(100f);
		masterVolume.setSelection(50);
		masterVolume.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				float value = new Float(masterVolume.getSelection())/100f;
				if (value != liveController.getLiveApp().getMasterTrack().getVolume()) {
					liveController.getLiveApp().getMasterTrack().setVolume(value);
				}
			}
		});
		masterVolume.addMenuAction(new LinkOscAbletonCommandAction(masterVolume, ABLETON_OSC_MAPPING.MASTER_VOLUME.getLiteral(), 100f));

		Label masterVolumeLabel = GUIToolkit.INSTANCE.createLabel(vPanel, "Vol");
		masterVolumeLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(false, false).create());
		
		Composite pPanel = GUIToolkit.INSTANCE.createComposite(upPanel, SWT.DOUBLE_BUFFERED);
		pPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		pPanel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(true, false).create());
		
		masterPan = new UbiKnob(pPanel, SWT.HORIZONTAL);
		masterPan.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(48, 48).grab(false, false).create());
		masterPan.setMax(100f);
		masterPan.setSelection(50);
		masterPan.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				float value = new Float(masterPan.getSelection() - 50) / 50f;
				if (value != liveController.getLiveApp().getMasterTrack().getPan()) {
					liveController.getLiveApp().getMasterTrack().setPan(value);
				}
			}
		});
		masterPan.addMenuAction(
			new LinkOscAbletonCommandAction(
				masterPan, 
				ABLETON_OSC_MAPPING.MASTER_VOLUME.getLiteral(),
				100f
			)
		);
		
		Label masterPanLabel = GUIToolkit.INSTANCE.createLabel(pPanel, "Pan");
		masterPanLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(false, false).create());
		
		//
		// Vu Meters
		//
		
		Composite vuMetersPanel = GUIToolkit.INSTANCE.createComposite(upPanel, SWT.DOUBLE_BUFFERED);
		vuMetersPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).numColumns(2).create());
		vuMetersPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).span(2,1).create());

		//leftMasterVu.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
/*
		Label rightMasterVuLabel = GUIToolkit.INSTANCE.createLabel(vuMetersPanel, "L/R ");
		rightMasterVuLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(false, false).create());
	*/	
		masterVu = new UbiVuMeter(vuMetersPanel, SWT.VERTICAL);
		masterVu.setLevel(0);
		masterVu.setMax(100);
		masterVu.setLayout(GridLayoutFactory.fillDefaults().create());
		masterVu.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(20, 250).grab(true, false).create());

		Composite tracksPanel = GUIToolkit.INSTANCE.createComposite(sash, SWT.DOUBLE_BUFFERED);
		tracksPanel.setLayout(GridLayoutFactory.fillDefaults(). numColumns(2).equalWidth(false).create());
		tracksPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		subDetailsViewer = GUIToolkit.INSTANCE.createTreeViewer(tracksPanel, SWT.FULL_SELECTION);
		subDetailsViewer.getTree().setLinesVisible(true);
		subDetailsViewer.setLabelProvider(			
			new AbletonLiveLabelProvider()
		);
		
		AbletonLiveDetailsContentProvider abletonLiveDetailsContentProvider = new AbletonLiveDetailsContentProvider();
		
		subDetailsViewer.setContentProvider(abletonLiveDetailsContentProvider);
		subDetailsViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		subDetailsViewer.getTree().setHeaderVisible(true);
		subDetailsViewer.getTree().setLinesVisible(true);
		subDetailsViewer.setInput(liveController.getLiveApp());
		
		subDetailsViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction2.run();
			}
		});
		
		/*
		subDetailsViewer.getControl().addListener (SWT.MouseDown, new Listener() {
			public void handleEvent (Event event) {
				Tree tree = (Tree) subDetailsViewer.getControl();
				Rectangle clientArea = tree.getClientArea ();
				Point pt = new Point(event.x, event.y);
				int index = 0;
				while (index < tree.getItemCount ()) {
					boolean visible = false;
					TreeItem item = ((Tree)subDetailsViewer.getControl()).getItem (index);
					for (int i=0; i < tree.getColumnCount(); i++) {
						Rectangle rect = item.getBounds (i);
						rect.width = 16;
						if (rect.contains (pt)) {
							handleToggleClip(index, i, item.getData());
						}
						if (!visible && rect.intersects (clientArea)) {
							visible = true;
						}
					}
					if (!visible) return;
					index++;
				}
			}
		});
		*/
		
		TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(
			subDetailsViewer, 
			new FocusCellOwnerDrawHighlighter(subDetailsViewer) {
				@Override
				public ViewerCell getFocusCell() {
					ViewerCell cell = super.getFocusCell();
					handleClipDetails(cell.getElement(), cell.getColumnIndex());
					return cell;
				}
			}
		);
		
		ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(subDetailsViewer) {
			protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
				return false;
			}
		};
		
		TreeViewerEditor.create(subDetailsViewer, focusCellManager, actSupport, ColumnViewerEditor.KEYBOARD_ACTIVATION);

		scXui = GUIToolkit.INSTANCE.createScrolledComposite(sash);
		scXui.setLayout(GridLayoutFactory.fillDefaults().create());
		scXui.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		scXui.getParent().setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));

		xuiPanel = GUIToolkit.INSTANCE.createComposite(scXui, SWT.DOUBLE_BUFFERED);
		xuiPanelLayout = GridLayoutFactory.fillDefaults().numColumns(16).equalWidth(false).margins(0, 0).extendedMargins(0, 0, 0, 0).spacing(0, 0).create();
		xuiPanel.setLayout(xuiPanelLayout);
		xuiPanel.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());

		scXui.setExpandVertical(true);
		scXui.setExpandHorizontal(true);
		scXui.setAlwaysShowScrollBars(true);
		scXui.setOrientation(SWT.VERTICAL);

		scXui.setContent(xuiPanel);
		scXui.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle r = sash.getClientArea();
				scXui.setMinSize(xuiPanel.computeSize(r.width, SWT.DEFAULT));
			}
		});
		/*
		int realWidth = 0;
		for (TreeViewerColumn c : treeColumnsMap.values()) {
			realWidth += c.getColumn().getWidth();
		}
		
		((GridData)xuiPanel.getLayoutData()).minimumWidth = realWidth;
		
		hbarScXui = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sc.getHorizontalBar().removeSelectionListener(hbarSc);
				sc.getHorizontalBar().setSelection(e.x);
				sc.getHorizontalBar().addSelectionListener(hbarSc);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
		};
		if (scXui.getHorizontalBar() != null) {
			scXui.getHorizontalBar().addSelectionListener(
				hbarScXui
			);
		}
		*/
		
		devicesPanel = GUIToolkit.INSTANCE.createComposite(sash, SWT.DOUBLE_BUFFERED);
		devicesPanel.setLayout(GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).create());
		devicesPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		bottomSash = new SashForm(devicesPanel, SWT.HORIZONTAL);
		bottomSash.setLayout(GridLayoutFactory.fillDefaults().create());
		bottomSash.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		bottomSash.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		
		devicesViewer = GUIToolkit.INSTANCE.createTreeViewer(bottomSash, SWT.FULL_SELECTION);
		devicesViewer.setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				if( element instanceof AbstractLiveDevice ) {
					return deviceImage;
				} else if (element instanceof LiveParam) {
					return paramImage;
				}
				return deviceImage;
			}
			@Override
			public String getText(Object element) {
				if( element instanceof AbstractLiveDevice ) {
					return ((AbstractLiveDevice)element).getDeviceName();
				} else if( element instanceof LiveParam ) {
					LiveParam param = (LiveParam) element;
					return param.getName() + " : " + param.getValue() + " [" + param.getMin() + " .. " + param	.getMax() + "]";
				}
				return "???";
			}
		});
		
		devicesViewer.setContentProvider(new DevicesContentProvider());
		devicesViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		sc = GUIToolkit.INSTANCE.createScrolledComposite(bottomSash);
		sc.setLayout(GridLayoutFactory.fillDefaults().create());
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sc.getParent().setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
			
		
		deviceWidgetContainer = GUIToolkit.INSTANCE.createComposite(sc, SWT.DOUBLE_BUFFERED);
		deviceWidgetContainer.setLayout(GridLayoutFactory.fillDefaults().create());
		deviceWidgetContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		deviceWidgetContainer.getParent().setBackground(GUIToolkit.BG);
		deviceWidgetContainer.addControlListener(
			new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {}
				@Override
				public void controlMoved(ControlEvent e) {
					System.out.println("moved");
				}
			}
		);
		
		sc.setExpandVertical(true);
		sc.setAlwaysShowScrollBars(true);
		sc.setOrientation(SWT.VERTICAL);
		
		sc.setContent(deviceWidgetContainer);
		sc.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle r = sc.getClientArea();
				sc.setMinSize(devicesPanel.computeSize(r.width, SWT.DEFAULT));
			}
		});
		
		hbarSc = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				scXui.getHorizontalBar().removeSelectionListener(hbarScXui);
				scXui.getHorizontalBar().setSelection(e.x);
				scXui.getHorizontalBar().addSelectionListener(hbarScXui);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
		};
		if (scXui.getHorizontalBar() != null) {
			sc.getHorizontalBar().addSelectionListener(
				hbarSc
			);
		}
		Rectangle r = sc.getClientArea();
		sc.setMinSize(devicesPanel.computeSize(r.width, SWT.DEFAULT));
		
		devicesViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = devicesViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					Object obj = null;
					StructuredSelection ssel = (StructuredSelection) selection;
					if (!ssel.isEmpty()) {
						obj = ssel.getFirstElement();
					}
					AbstractDeviceWidget w = AbletonWidgetManager.INSTANCE.getNullWidget();
					AbstractLiveDevice device = null;
					if (obj instanceof AbstractLiveDevice) {
						device = (AbstractLiveDevice) obj;
						w = AbletonWidgetManager.INSTANCE.getWidget(device.getDeviceName());
					}
					
					if (w instanceof AbstractDeviceWidget) {
						deviceWidgetContainer.setVisible(true);
						AbstractDeviceWidget widget = (AbstractDeviceWidget) w;
						for (Control c : deviceWidgetContainer.getChildren()) {
							c.setVisible(false);
							if (!c.isDisposed()) {
								c.dispose();
							}
						}
						Control control = widget.createControl(deviceWidgetContainer, SWT.NONE);
						if (!control.isDisposed() && control != null) {
							control.setVisible(true);
						}
						if (device != null) {
							widget.init(((LiveTrack)device.eContainer()), device);
						}
						deviceWidgetContainer.layout(true);
						widget.redraw();
					} else {
						sc.setVisible(false);
						for (Control c : sc.getChildren()) {
							c.setVisible(false);
							if (!c.isDisposed()) {
								c.dispose();
							}
						}
					}
					sc.redraw();
				} else {
					deviceWidgetContainer.setVisible(false);
					for (Control c : deviceWidgetContainer.getChildren()) {
						c.setVisible(false);
						if (!c.isDisposed()) {
							c.dispose();
						}
					}
				}
			}
		});
		
		bottomSash.setWeights(new int[] {1, 5});
		
		UIJob refreshDetailsJob =  new UbiJob("Refresh Details") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				synchronized (liveController.getLiveApp()) {
					synchronized (liveController.getLiveApp().getTracks()) {
						for (LiveTrack t : treeColumnsMap.keySet()) {
							if (!liveController.getLiveApp().getTracks().contains(t)) {
								TreeViewerColumn col = treeColumnsMap.get(t);
								treeColumnsMap.remove(t);
								col.getColumn().dispose();

								XUITrack xui = xuiTrackMap.get(t);
								xuiTrackMap.remove(t);
								xui.dispose();
							}
						}
						for (LiveTrack track : liveController.getLiveApp().getTracks()) {
							if (!treeColumnsMap.containsKey(track)) {
								TreeViewerColumn tc = createTableViewerColumn(track.getTrackName(), 110);
								treeColumnsMap.put(track, tc);
								xuiTrackMap.put(track, new XUITrack(xuiPanel, track, tc, liveController));
							} else {
								treeColumnsMap.get(track).getColumn().setText(track.getTrackName());
								int w 				= treeColumnsMap.get(track).getColumn().getWidth();
								Rectangle rect 		= xuiTrackMap.get(track).getBounds();
								xuiTrackMap.get(track).setBounds(rect.x, rect.y, w, rect.height);
								GridData gd 		= (GridData) xuiTrackMap.get(track).getLayoutData();
								gd.horizontalIndent = 0;
								gd.widthHint = w;
								gd.minimumWidth = SWT.DEFAULT;
							}
						}
						xuiPanelLayout.numColumns = liveController.getLiveApp().getTracks().size();
						if (xuiPanel!=null&& !xuiPanel.isDisposed()) {
							xuiPanel.layout(true);
							if (subDetailsViewer != null && subDetailsViewer.getControl() != null && !subDetailsViewer.getControl().isDisposed()) {
								if (subDetailsViewer != null && subDetailsViewer.getContentProvider() != null) {
									if (subDetailsViewer.getInput() != liveController.getLiveApp()) {
										subDetailsViewer.setInput(liveController.getLiveApp());
										if (deviceWidgetContainer!= null && ! deviceWidgetContainer.isDisposed()) {
											deviceWidgetContainer.layout(true);
										}
									}
									subDetailsViewer.refresh(true);
								}
								devicesPanel.setVisible(liveController.isMonitorDevices());
							}
						}
					}
				}
				schedule(1000);
				return Status.OK_STATUS;
			}
		};
		refreshDetailsJob.setSystem(true);
		refreshDetailsJob.setPriority(Job.INTERACTIVE);
		refreshDetailsJob.schedule(1000);
		
		
		
		if (liveController != null && liveController.getAbletonOscEngine() != null) {
			liveController.monitorDevices(true);
		}
		if (devicesPanel != null) {
			deviceWidgetContainer.setVisible(true);
			devicesPanel.setVisible(liveController.isMonitorDevices());
			devicesPanel.setSize(sash.getSize().x, 250);
			devicesPanel.layout(true);
			deviceWidgetContainer.setSize(sash.getSize().x, 250);
			deviceWidgetContainer.redraw();
			deviceWidgetContainer.layout(true);
			deviceWidgetContainer.redraw();
			devicesPanel.layout(true);
			devicesPanel.redraw();

			if (devicesViewer.getTree()  != null && devicesViewer.getTree().getItemCount() > 0) {
				@SuppressWarnings({ "rawtypes", "unused" })
				List lst = (List) devicesViewer.getInput();
				devicesViewer.getTree().select(devicesViewer.getTree().getItem(0));
				subDetailsViewer.refresh(true);
			}
			devicesPanel.layout(true);
			devicesPanel.redraw();
			for (Control c : devicesPanel.getChildren()) {
				if (c instanceof Control) {
					c.redraw();
				}
			}
		}

		
		sash.setWeights(new int[] {2, 2, 2});
	}
	
	void handleToggleClip(int r, int colIndex, Object object) {
		if (object instanceof LiveScene) {
			if (liveController.getLiveApp().getTracks().size() > colIndex) {
				LiveTrack track = liveController.getLiveApp().getTracks().get(colIndex);
				if (track != null && lastTrackID != track.getTrackID()) {
					lastTrackID = track.getTrackID();
					for (LiveClip clip : track.getClips()) {
						if (clip.getClipID() == r) {
							liveController.handleClipState(track.getTrackID(), clip.getClipID(), clip.getClipState().equals(CLIP_STATE.PLAYING) ? CLIP_STATE.STOP : CLIP_STATE.PLAYING);
						}
					}
				}
			}	
		}
	}
	
	int lastTrackID = 0;
	private void handleClipDetails(Object object, int colIndex) {
		if (object instanceof LiveScene) {
			if (liveController.getLiveApp().getTracks().size() > colIndex) {
				LiveTrack track = liveController.getLiveApp().getTracks().get(colIndex);
				if (track != null && lastTrackID != track.getTrackID()) {
					lastTrackID = track.getTrackID();
					List<AbstractLiveDevice> devices = track.getDevices();
					devicesViewer.setInput(devices);
					devicesViewer.refresh();
					if (!devices.isEmpty()) {
						devicesViewer.setSelection(new StructuredSelection(devices.get(devices.size()-1)));
					} else {
						devicesViewer.setSelection(new StructuredSelection());
					}
				}
			}	
		}
	}
	
	private TreeViewerColumn createTableViewerColumn(String title, int bound) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(subDetailsViewer, SWT.NONE);
		final TreeColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		viewerColumn.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			protected void paint(Event event, Object element) {	
				if (element instanceof LiveScene) {
					TreeItem treeItem = (TreeItem) event.item;
					Object obj = treeItem.getData(viewerColumn.getColumn().getText()+"#clip");
					if (obj != null) {
						LiveClip c = (LiveClip) obj;
						super.paint(event, element);
						if (((LiveScene)element).getSceneID() == lastSceneID) {
							int width	= 0;
							int height	= event.height-4;
							int x		= event.x;
							int y		= event.y+2;
							float l		= c.getLength();
							float p		= c.getPosition();

							if (p>0 && l>0) {
								float ratio = p / l;
								width		= Float.valueOf(ratio * (float)viewerColumn.getColumn().getWidth()).intValue();
								event.gc.setAlpha(100);
								event.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
								event.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
								event.gc.fillRoundRectangle(x, y, width, height, 2, 2);
								event.gc.setAlpha(255);
								event.gc.drawRoundRectangle(x, y, width, height, 2, 2);
							}
						}
					} else {
						super.paint(event, element);
					}
				} else {
					super.paint(event, element);
				}
			}
			
			@Override
			public void update(ViewerCell cell) {
				super.update(cell);
				if (cell.getElement() instanceof LiveScene) {
					LiveScene scene = (LiveScene) cell.getElement();
					int idx = cell.getColumnIndex();
					if (liveController.getLiveApp().getTracks().size() > idx) {
						LiveTrack track = liveController.getLiveApp().getTracks().get(idx);
						for (LiveClip c : track.getClips()) {
							if (scene.getSceneID() == c.getClipID()) {
								cell.setText(c.getClipName());
								//cell.getStyleRanges();
								/*
								switch(c.getClipState()) {
									case PLAYING:
									case TRIGGERED:
										cell.setImage(playImage);
										//break;
									case STOP:
										cell.setImage(stopImage);
										break;
									default:
										cell.setImage(stopImage);
										break;
								};*/
								
								cell.setImage(lastSceneID==scene.getSceneID()?playImage:stopImage);
								
								if (c.getColor() != null) {
									cell.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
									cell.setBackground(c.getColor());
								}

								
								cell.getItem().setData(track.getTrackName()+"#clip", c);
								break;
							} else {
								cell.setForeground(GUIToolkit.FG);
								cell.setBackground(GUIToolkit.BG);
							}
						}
					}	
				}
			}
		});
		return viewerColumn;
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(dumpHierarchicalOSCAction);
		manager.add(new Separator());
		manager.add(dumpToConsoleAction);
		manager.add(new Separator());
		manager.add(masterPrevCueAction);
		//manager.add(masterPlayAction);
		manager.add(masterPlayContinueAction);
		//manager.add(masterStopAction);
		manager.add(masterNextCueAction);
		manager.add(masterOverdubAction);
		manager.add(new Separator());
	}

	/*
	private void fillContextMenu(IMenuManager manager) {
		manager.add(dumpToConsoleAction);
		manager.add(new Separator());
		manager.add(masterPrevCueAction);
		manager.add(masterPlayAction);
		manager.add(masterPlayContinueAction);
		manager.add(masterStopAction);
		manager.add(masterNextCueAction);
		manager.add(masterOverdubAction);
		manager.add(new Separator());
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	*/
	
	private void fillLocalToolBar(IToolBarManager manager) {
		//manager.add(openAbletonPrefsAction);
	//	manager.add(dumpHierarchicalOSCAction);
		manager.add(new Separator());
		manager.add(monitorDevicesAction);
		manager.add(dumpToConsoleAction);
		manager.add(new Separator());
		manager.add(masterPrevCueAction);
		//manager.add(masterPlayAction);
		manager.add(masterPlayContinueAction);
		//manager.add(masterStopAction);
		manager.add(masterNextCueAction);
		manager.add(masterOverdubAction);
		manager.add(new Separator());
	}

	private void handleDoubleClickSelection(Object obj, boolean forward) {
		if (forward) {
			if (obj instanceof LiveScene) {
				handleLiveSceneDoubleClick((LiveScene) obj);
			} else if (obj instanceof LiveTrack) {
				handleLiveTrackDoubleClick((LiveTrack) obj);
			} else if (obj instanceof LiveClip) {
				handleLiveClipDoubleClick((LiveClip) obj);
			} 
		} else {
			synchronized (liveController.getLiveApp().getScenes()) {
				if (liveController.getLiveApp().getScenes().size() > 1) {
					int idx = liveController.getLiveApp().getScenes().indexOf(obj);
					if (idx >= 0 ) {
						if (idx < liveController.getLiveApp().getScenes().size()-1) {
							Object o = liveController.getLiveApp().getScenes().get(idx);
							subDetailsViewer.setSelection(new StructuredSelection(o));
							subDetailsViewer.refresh(o, true);
						} else {
							Object o = liveController.getLiveApp().getScenes().get(0);
							subDetailsViewer.setSelection(new StructuredSelection(o));
							subDetailsViewer.refresh(o, true);
						}
					}
				}
				subDetailsViewer.refresh(obj, true);
			}
		}
	}

	private void makeActions() {
		/*
		openAbletonPrefsAction= new Action("Open Preferences", SWT.TOGGLE) {
			public void run() {
				PlatformUI.getPreferenceStore().
				if (liveController != null && liveController.getAbletonOscEngine() != null) {
					liveController.monitorDevices(isChecked());
				}
			}
		};*/	

		monitorDevicesAction = new Action("Monitor Devices", SWT.TOGGLE) {
			public void run() {
				if (liveController != null && liveController.getAbletonOscEngine() != null) {
					liveController.monitorDevices(isChecked());
				}
				if (devicesPanel != null) {
					deviceWidgetContainer.setVisible(true);
					devicesPanel.setVisible(liveController.isMonitorDevices());
					devicesPanel.setSize(sash.getSize().x, 250);
					devicesPanel.layout(true);
					deviceWidgetContainer.setSize(sash.getSize().x, 250);
					deviceWidgetContainer.redraw();
					deviceWidgetContainer.layout(true);
					deviceWidgetContainer.redraw();
					devicesPanel.layout(true);
					devicesPanel.redraw();

					if (devicesViewer.getTree()  != null && devicesViewer.getTree().getItemCount() > 0) {
						@SuppressWarnings({ "rawtypes", "unused" })
						List lst = (List) devicesViewer.getInput();
						devicesViewer.getTree().select(devicesViewer.getTree().getItem(0));
						subDetailsViewer.refresh(true);
					}
					devicesPanel.layout(true);
					devicesPanel.redraw();
					for (Control c : devicesPanel.getChildren()) {
						if (c instanceof Control) {
							c.redraw();
						}
					}
					sash.setWeights(new int[] {2, 3, 2});
				}
			}
		};	
		monitorDevicesAction.setImageDescriptor(
				net.sf.smbt.ui.ableton.Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/actions/icon_target.png"
				)
			);
		dumpToConsoleAction = new Action("Dump Console As OSC", SWT.TOGGLE) {
			public void run() {
				if (liveController != null && liveController.getAbletonOscEngine() != null) {
					liveController.dumpToConsole(isChecked());
				}
			}
		};	
		dumpToConsoleAction.setImageDescriptor(
			net.sf.smbt.ui.ableton.Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/status/software-update-available.png"
			)
		);
/*
		dumpHierarchicalOSCAction = new Action("Dump OSC Structure", SWT.PUSH) {
			public void run() {
				if (liveController != null && liveController.getAbletonOscEngine() != null) {
					liveController.structuralDump();
				}
			}
		};	
		dumpHierarchicalOSCAction.setImageDescriptor(
			net.sf.smbt.ui.ableton.Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/new/wand.png"
			)
		);
*/
		doubleClickAction2 = new Action() {
			public void run() {
				ISelection selection = subDetailsViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				handleDoubleClickSelection(obj, true);
			}
		};

		masterPlayAction  = new Action() {
			public void run() {
				liveController.handleMasterTrackState(MASTER_CTRL.PLAY);
			}
		};
		masterPlayAction.setEnabled(true);
		masterPlayAction.setText("Play Live");
		masterPlayAction.setToolTipText("Play Live Tooltip");
		masterPlayAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-start.png"));
		
		masterPrevCueAction  = new Action() {
			public void run() {
				liveController.handleMasterTrackState(MASTER_CTRL.PREC);
			}
		};
		masterPrevCueAction.setEnabled(true);
		masterPrevCueAction.setText("Prev Cue");
		masterPrevCueAction.setToolTipText("Go Prev Cue");
		masterPrevCueAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-skip-backward.png"));
		
		masterNextCueAction  = new Action() {
			public void run() {
				liveController.handleMasterTrackState(MASTER_CTRL.NEXT);
			}
		};
		masterNextCueAction.setEnabled(true);
		masterNextCueAction.setText("Next Cue");
		masterNextCueAction.setToolTipText("Go Next Cue");
		masterNextCueAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-skip-forward.png"));
		
		masterPlayContinueAction  = new Action() {
			public void run() {
				liveController.handleMasterTrackState(MASTER_CTRL.CONTINUE);
			}
		};
		masterPlayContinueAction.setEnabled(true);
		masterPlayContinueAction.setText("Continue Play Live");
		masterPlayContinueAction.setToolTipText("Continue Play Live Tooltip");
		masterPlayContinueAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-continue.png"));
		
		masterStopAction  = new Action() {
			public void run() {
				liveController.handleMasterTrackState(MASTER_CTRL.STOP);
			}
		};
		masterStopAction.setEnabled(true);
		masterStopAction.setText("Stop Live");
		masterStopAction.setToolTipText("Stop Live Tooltip");
		masterStopAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-stop.png"));
		
		masterOverdubAction  = new Action() {
			public void run() {
				liveController.handleOverdub();
			}
		};
		masterOverdubAction.setEnabled(true);
		masterOverdubAction.setText("ToggleOverdub");
		masterOverdubAction.setToolTipText("Toggle Overdub Tooltip");
		masterOverdubAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/new/bell.png"));
	}
	
	void handleLiveSceneDoubleClick(LiveScene scene) {
		CmdPipe engine = liveController.getEngineFromScene(scene);
		lastSceneID = 0;
		if (engine != null) {
			engine.send(
				AbletonLive8Utils.INSTANCE.createLivePlayScene(
					lastSceneID = scene.getSceneID()
				)
			);
			engine.send(
				AbletonLive8Utils.INSTANCE.createLiveScene2(
					scene.getSceneID()
				)
			);
		}
	}

	void handleLiveTrackDoubleClick(LiveTrack track) {
		CmdPipe engine = liveController.getEngineFromTrack(track);
		if (engine != null) {
			// what will I gonna do w/ that ???
		}
	}

	void handleLiveClipDoubleClick(LiveClip clip) {
		CmdPipe engine =liveController.getEngineFromClip(clip);
		if (engine != null) {
			engine.send(
				AbletonLive8Utils.INSTANCE.createLivePlayClipslot(
					clip.getTrack().getTrackID(), 
					clip.getClipID()
				)
			);
		}
	}
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
}