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

package net.sf.smbt.ui.wiimote.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.bt.wiimote.utils.BTWiimoteCmdUtils;
import net.sf.smbt.ezwiimote.WiiAccelEvt;
import net.sf.smbt.ezwiimote.WiiAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiCoreButtonEvt;
import net.sf.smbt.ezwiimote.WiiEvt;
import net.sf.smbt.ezwiimote.WiiNunchukButtonEvt;
import net.sf.smbt.ezwiimote.WiiReportModeReqCmd;
import net.sf.smbt.ezwiimote.WiiStatusInfoReport;
import net.sf.smbt.osc.wiimote.cmd.utils.WiimoteCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.vu.UbiVuMeter;
import net.sf.smbt.ui.wiimote.controller.WiimoteComposeableAdapterFactory;
import net.sf.smbt.ui.wiimote.controller.WiimoteContentProvider;
import net.sf.smbt.ui.wiimote.dialogs.WiimoteConnectionDialog;
import net.sf.smbt.wiimotectrl.WiimoteController;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.AbstractQxEventHandler;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IConnectedUnit;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;


public class WiimoteView extends ViewPart {
	@SuppressWarnings("unused")
	private UIJob heartBeat, refreshUI;
	
	private Color PAD_ON_COLOR = ColorConstants.red;
	private Color PAD_OFF_COLOR = ColorConstants.orange;
	private Color BUTTON_ON_COLOR = ColorConstants.red;
	private Color BUTTON_OFF_COLOR = ColorConstants.lightGreen;
	
	private CmdPipe btPipe;
	
	private boolean leds[] = new boolean[] {false, false, false, false};

	private boolean dumpToConsole;
	
	private Action connectWiimoteAction,
					disconnectWiimoteAction,
					dumpToConsoleAction;

	
	private Action led1Action, led2Action, led3Action, led4Action;
	private Action rumbleAction;
	//private Action cameraBasicLvl3Action, cameraExtendedLvl3Action, cameraFullLvl3Action;
	private Action	reportMode0x21Action, 
					reportMode0x30Action, 
					reportMode0x31Action, 
					reportMode0x32Action, 
					reportMode0x33Action, 
					reportMode0x34Action, 
					reportMode0x35Action, 
					reportMode0x36Action, 
					reportMode0x37Action, 
					reportMode0x3dAction, 
					reportMode0x3eAction, 
					reportMode0x3fAction; 
	
	private Map<String, WiimoteController> wiimotes;
	private Map<String, AbstractQxEventHandler> handlers;
	
	private TreeViewer viewer;
//	private WiimoteCtrlWidget ctrlWidget;
	private WiiAccelEvt accel;
	private WiiCoreButtonEvt buttonEvt;
	private WiiNunchukButtonEvt nunchukButonEvt;
//	private WiiNunchukAccelPryCmd nunchukPRYAccelEvt;
//	private WiiNunchukAccelXyzCmd nunchukXYZAccelEvt;
//	private WiiNunchukJoyCmd nunchukJoyEvt;
	private WiiAnalogStickEvent analogStickEvt;
	
	private UIJob refresh;
	
	private Label	wm00_PLUS, 
					wm01_UP, 
					wm02_MINUS, 
					wm10_LEFT, 
					wm11_HOME,
					wm12_RIGHT, 
					wm20_ONE, 
					wm20_DOWN, 
					wm22_TWO, 
					wm30_A, 
					b31, 
					wm32_B;

	private Label 	nc00, 
					nc01_UP, 
					nc02, 
					nc10_LEFT, 
					l11, 
					nc12_RIGHT, 
					nc20_C, 
					nc21_DOWN, 
					nc22_Z;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.smbt.ui.wiimoteView";
	class RefreshUIJob extends UIJob {
		public RefreshUIJob() {
			super("Wiimote XYZ Levels");
			setSystem(true);
			setPriority(Job.INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (accel != null && moteXMeter != null && moteYMeter != null && moteZMeter != null) {
				synchronized(accel) {
					if (moteXMeter.getLevel() != accel.getX()) {
						moteXMeter.setLevel(accel.getX());
					}
					if (moteYMeter.getLevel() != accel.getY()) {
						moteYMeter.setLevel(accel.getY());
					}
					if (moteZMeter.getLevel() != accel.getZ()) {
						moteZMeter.setLevel(accel.getZ());
					}
				}
			}
			if (buttonEvt != null && 
					wm00_PLUS != null && wm01_UP != null && wm02_MINUS != null && 
					wm10_LEFT != null && wm11_HOME != null && wm12_RIGHT != null && 
					wm20_DOWN != null && wm20_ONE != null && wm22_TWO != null && 
					wm30_A != null && wm32_B != null
			) {
				synchronized(buttonEvt) {
					wm30_A.setBackground(buttonEvt.isButtonAPressed()				? BUTTON_ON_COLOR : BUTTON_OFF_COLOR); 
					wm32_B.setBackground(buttonEvt.isButtonBPressed()				? BUTTON_ON_COLOR : BUTTON_OFF_COLOR);
					wm11_HOME.setBackground(buttonEvt.isButtonHomePressed() 		? BUTTON_ON_COLOR : BUTTON_OFF_COLOR);
					wm02_MINUS.setBackground(buttonEvt.isButtonMinusPressed()		? BUTTON_ON_COLOR : BUTTON_OFF_COLOR);
					wm00_PLUS.setBackground(buttonEvt.isButtonPlusPressed()			? BUTTON_ON_COLOR : BUTTON_OFF_COLOR);
					wm20_ONE.setBackground(buttonEvt.isButtonOnePressed()			? BUTTON_ON_COLOR : BUTTON_OFF_COLOR);
					wm22_TWO.setBackground(buttonEvt.isButtonTwoPressed()			? BUTTON_ON_COLOR : BUTTON_OFF_COLOR);
					wm20_DOWN.setBackground(buttonEvt.isButtonPadDownPressed()		? PAD_ON_COLOR : PAD_OFF_COLOR);
					wm10_LEFT.setBackground(buttonEvt.isButtonPadLeftPressed()		? PAD_ON_COLOR : PAD_OFF_COLOR);
					wm12_RIGHT.setBackground(buttonEvt.isButtonPadRightPressed()	? PAD_ON_COLOR : PAD_OFF_COLOR);
					wm01_UP.setBackground(buttonEvt.isButtonPadUpPressed()			? PAD_ON_COLOR : PAD_OFF_COLOR);
					//wm.setBackground(buttonEvt.isButtonNoPressed() ? BUTTON_ON_COLOR : BUTTON_OFF_COLOR);
				}
			}
			/*
			if (analogStickEvt != null) {
				synchronized(analogStickEvt) {
					int sx = analogStickEvt.getX();
					int sy = analogStickEvt.getY();
					if (sx == 0) {

					}
					if (sx == 1) {
						
					}
					if (sx == 2) {
						
					}
					if (sy == 0) {
						
					}
					if (sy == 1) {
						
					}
					if (sy == 2) {
						
					}
				}
			}
			if (nunchukButonEvt != null) {
				synchronized(nunchukButonEvt) {
					nunchukButonEvt.isCButtonPressed();
					nunchukButonEvt.isZButtonPressed();
				}
			}
			if (nunchukPRYAccelEvt != null && nunchuckAccelMeter != null && nunchuckPitchMeter != null && nunchuckRollMeter != null && nunchuckYawMeter != null) {
				synchronized (nunchukPRYAccelEvt) {
					if (nunchuckAccelMeter.getLevel() != nunchukPRYAccelEvt.getAccel()) {
						nunchuckAccelMeter.setLevel(nunchukPRYAccelEvt.getAccel());
					}
					if (nunchuckPitchMeter.getLevel() != nunchukPRYAccelEvt.getPitch()) {
						nunchuckPitchMeter.setLevel(nunchukPRYAccelEvt.getPitch());
					}
					if (nunchuckRollMeter.getLevel() != nunchukPRYAccelEvt.getRoll()) {
						nunchuckRollMeter.setLevel(nunchukPRYAccelEvt.getRoll());
					}
					if (nunchuckYawMeter.getLevel() != nunchukPRYAccelEvt.getYaw()) {
						nunchuckYawMeter.setLevel(nunchukPRYAccelEvt.getYaw());
					}
				}
			}
			if (nunchukXYZAccelEvt != null && nunchukXMeter != null && nunchukYMeter != null && nunchukZMeter != null) {
				synchronized(nunchukXYZAccelEvt) {
					if (nunchukXMeter.getLevel() != nunchukXYZAccelEvt.getX()) {
						nunchukXMeter.setLevel(nunchukXYZAccelEvt.getX());
					}
					if (nunchukYMeter.getLevel() != nunchukXYZAccelEvt.getY()) {
						nunchukYMeter.setLevel(nunchukXYZAccelEvt.getY());
					}
					if (nunchukZMeter.getLevel() != nunchukXYZAccelEvt.getZ()) {
						nunchukZMeter.setLevel(nunchukXYZAccelEvt.getZ());
					}
				}
			}
			if (nunchukJoyEvt != null) {
				synchronized(nunchukJoyEvt) {
					nunchukJoyEvt.getX();
					nunchukJoyEvt.getY();
				}
			}
			*/
			schedule(150);
			return Status.OK_STATUS;
		}
	}
	private UbiVuMeter moteXMeter, moteYMeter, moteZMeter;
	private UbiVuMeter nunchukXMeter,  nunchukYMeter,  nunchukZMeter;
	private UbiVuMeter nunchuckAccelMeter, nunchuckPitchMeter, nunchuckRollMeter, nunchuckYawMeter;
	
	private Image wiimoteImg;
	
	public WiimoteView() {
		wiimoteImg = net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
			"net.sf.smbt.ui", 
			"icons/new/wiimote.png"
		).createImage();
	}
	
	public void createPartControl(Composite parent) {
		dumpToConsole = false;
		
		SashForm sash = new SashForm(parent, SWT.HORIZONTAL);
		
		viewer = GUIToolkit.INSTANCE.createTreeViewer(sash, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new WiimoteContentProvider());
		viewer.setLabelProvider(
			new AdapterFactoryLabelProvider(
				new WiimoteComposeableAdapterFactory()
			) {
				public org.eclipse.swt.graphics.Image getImage(Object object) {
					return wiimoteImg;
				};
			}
		);
		viewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,true).create());
		
		createMoteControls(sash);
		
		refresh = new RefreshUIJob();
		refresh.schedule();

		/*
		ctrlWidget = new WiimoteCtrlWidget(container, SWT.NONE);
		ctrlWidget.setLayout(GridLayoutFactory.fillDefaults().create());
		ctrlWidget.setLayoutData(GridDataFactory.fillDefaults().span(2,1).grab(true,true).create());
		ctrlWidget.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_CYAN));
		*/
		
		wiimotes = new HashMap<String, WiimoteController>();
		handlers = new HashMap<String, AbstractQxEventHandler>();
		
		/*
		List<CmdPipe> pipes = QuanticMojo.INSTANCE.getEnginesByTransportAndCommunication(TRANSPORT_PROTOCOL.BLUETOOTH.getLiteral(), COMM_PROTOCOL.WIIMOTE.getProtocolID());
		for (CmdPipe p : pipes) {
			//wiimotes.put(, value)
		}
		*/
		
		sash.setWeights(new int[]{1, 3});
		viewer.setInput(new ArrayList<WiimoteController>(wiimotes.values()));
		
		makeActions();
		contributeToActionBars();
	}
	
	private void createMoteControls(Composite container) {
		Color bg = GUIToolkit.INSTANCE.getColors().getBackground();
		
		Composite bag = GUIToolkit.INSTANCE.createComposite(container);
		bag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		bag.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		Composite xyzContainer = GUIToolkit.INSTANCE.createComposite(bag);
		xyzContainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		xyzContainer.setLayoutData(GridDataFactory.fillDefaults().indent(15, 15).create());
		
		Label xAccelLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "X Accel");
		xAccelLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		moteXMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		moteXMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		moteXMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		moteXMeter.setMax(255f);

		Label yAccelLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Y Accel");
		yAccelLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		moteYMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		moteYMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		moteYMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		moteYMeter.setMax(255f);

		Label zAccelLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Z Accel");
		zAccelLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		moteZMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		moteZMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		moteZMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		moteZMeter.setMax(255f);
		
		
		Label nunchukAccelLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Nunchuk Accel");
		nunchukAccelLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		nunchuckAccelMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		nunchuckAccelMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		nunchuckAccelMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		nunchuckAccelMeter.setMax(255f);

		Label nunchukPitchLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Nunchuk Pitch");
		nunchukPitchLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		nunchuckPitchMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		nunchuckPitchMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		nunchuckPitchMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		nunchuckPitchMeter.setMax(255f);

		Label nunchukRollLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Nunchuk Roll ");
		nunchukRollLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		nunchuckRollMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		nunchuckRollMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		nunchuckRollMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		nunchuckRollMeter.setMax(255f);

		Label nunchukYawLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Nunchuk YAW  ");
		nunchukYawLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		nunchuckYawMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		nunchuckYawMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		nunchuckYawMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		nunchuckYawMeter.setMax(255f);

		Label nunchukXAccelLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Nunchuk X  ");
		nunchukXAccelLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		nunchukXMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		nunchukXMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		nunchukXMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		nunchukXMeter.setMax(255f);

		Label nunchukYAccelLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Nunchuk Y  ");
		nunchukYAccelLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		nunchukYMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		nunchukYMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		nunchukYMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		nunchukYMeter.setMax(255f);

		Label nunchukZAccelLabel = GUIToolkit.INSTANCE.createLabel(xyzContainer, "Nunchuk Z  ");
		nunchukZAccelLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		
		nunchukZMeter = new UbiVuMeter(xyzContainer, SWT.HORIZONTAL);
		nunchukZMeter.setLayout(GridLayoutFactory.fillDefaults().create());
		nunchukZMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).grab(true, false).create());
		nunchukZMeter.setMax(255f);

		
		Composite buttonsContainer = GUIToolkit.INSTANCE.createComposite(bag);
		buttonsContainer.setLayout(GridLayoutFactory.fillDefaults().create());
		buttonsContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).indent(15, 15).create());
		
		Composite motePadContainer = GUIToolkit.INSTANCE.createComposite(buttonsContainer);
		motePadContainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
		motePadContainer.setLayoutData(GridDataFactory.fillDefaults().create());
		
		Label wiimoteLabel = GUIToolkit.INSTANCE.createLabel(motePadContainer, "Wiimote");
		wiimoteLabel.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).grab(true, false).align(SWT.CENTER, SWT.CENTER).create());
		
		wm00_PLUS = new Label(motePadContainer, SWT.CENTER);
		wm00_PLUS.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm00_PLUS.setBackground(BUTTON_OFF_COLOR);
		wm00_PLUS.setForeground(ColorConstants.darkGray);
		wm00_PLUS.setText("+");
		
		wm01_UP = new Label(motePadContainer, SWT.PUSH);
		wm01_UP.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm01_UP.setBackground(PAD_OFF_COLOR);
		wm01_UP.setForeground(PAD_OFF_COLOR);
		
		wm02_MINUS = new Label(motePadContainer, SWT.CENTER);
		wm02_MINUS.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm02_MINUS.setBackground(BUTTON_OFF_COLOR);
		wm02_MINUS.setForeground(ColorConstants.darkGray);
		wm02_MINUS.setText("-");

		wm10_LEFT = new Label(motePadContainer, SWT.PUSH);
		wm10_LEFT.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm10_LEFT.setBackground(PAD_OFF_COLOR);
		wm10_LEFT.setForeground(PAD_OFF_COLOR);

		wm11_HOME = new Label(motePadContainer, SWT.CENTER);
		wm11_HOME.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm11_HOME.setBackground(BUTTON_OFF_COLOR);
		wm11_HOME.setForeground(ColorConstants.darkGray);
		wm11_HOME.setText("H");

		wm12_RIGHT = new Label(motePadContainer, SWT.PUSH);
		wm12_RIGHT.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm12_RIGHT.setBackground(PAD_OFF_COLOR);
		wm12_RIGHT.setForeground(PAD_OFF_COLOR);

		wm20_ONE = new Label(motePadContainer, SWT.CENTER);
		wm20_ONE.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm20_ONE.setBackground(BUTTON_OFF_COLOR);
		wm20_ONE.setForeground(ColorConstants.darkGray);
		wm20_ONE.setText("1");
		
		wm20_DOWN = new Label(motePadContainer, SWT.PUSH);
		wm20_DOWN.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm20_DOWN.setBackground(PAD_OFF_COLOR);
		wm20_DOWN.setForeground(PAD_OFF_COLOR);

		wm22_TWO = new Label(motePadContainer, SWT.CENTER);
		wm22_TWO.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm22_TWO.setBackground(BUTTON_OFF_COLOR);
		wm22_TWO.setForeground(ColorConstants.darkGray);
		wm22_TWO.setText("2");
		
		wm30_A = new Label(motePadContainer,SWT.CENTER);
		wm30_A.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm30_A.setBackground(BUTTON_OFF_COLOR);
		wm30_A.setForeground(ColorConstants.darkGray);
		wm30_A.setText("A");
		
		b31 = new Label(motePadContainer, SWT.PUSH);
		b31.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		b31.setBackground(bg);
		b31.setForeground(bg);

		wm32_B = new Label(motePadContainer, SWT.CENTER);
		wm32_B.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		wm32_B.setBackground(BUTTON_OFF_COLOR);
		wm32_B.setForeground(ColorConstants.darkGray);
		wm32_B.setText("F");
		
		Composite chukPadContainer = GUIToolkit.INSTANCE.createComposite(buttonsContainer);
		chukPadContainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
		chukPadContainer.setLayoutData(GridDataFactory.fillDefaults().create());

		Label nunchukLabel = GUIToolkit.INSTANCE.createLabel(chukPadContainer, "Nunchuk");
		nunchukLabel.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).grab(true, false).align(SWT.CENTER, SWT.CENTER).create());
		
		nc00 = new Label(chukPadContainer, SWT.NONE);
		nc00.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc00.setBackground(bg);
		nc00.setForeground(bg);
		
		nc01_UP = new Label(chukPadContainer, SWT.PUSH);
		nc01_UP.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc01_UP.setBackground(PAD_OFF_COLOR);
		nc01_UP.setForeground(PAD_OFF_COLOR);
		
		nc02 = new Label(chukPadContainer, SWT.NONE);
		nc02.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc02.setBackground(bg);
		nc02.setForeground(bg);

		nc10_LEFT = new Label(chukPadContainer, SWT.PUSH);
		nc10_LEFT.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc10_LEFT.setBackground(PAD_OFF_COLOR);
		nc10_LEFT.setForeground(PAD_OFF_COLOR);

		l11 = new Label(chukPadContainer, SWT.NONE);
		l11.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		l11.setBackground(bg);
		l11.setForeground(bg);

		nc12_RIGHT = new Label(chukPadContainer, SWT.PUSH);
		nc12_RIGHT.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc12_RIGHT.setBackground(PAD_OFF_COLOR);
		nc12_RIGHT.setForeground(PAD_OFF_COLOR);

		nc20_C = new Label(chukPadContainer, SWT.CENTER);
		nc20_C.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc20_C.setBackground(BUTTON_OFF_COLOR);
		nc20_C.setForeground(ColorConstants.darkGray);
		nc20_C.setText("C");
		
		nc21_DOWN = new Label(chukPadContainer, SWT.PUSH);
		nc21_DOWN.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc21_DOWN.setBackground(PAD_OFF_COLOR);
		nc21_DOWN.setForeground(PAD_OFF_COLOR);

		nc22_Z = new Label(chukPadContainer, SWT.CENTER);
		nc22_Z.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(25, 25).minSize(25, 25).create());
		nc22_Z.setBackground(BUTTON_OFF_COLOR);
		nc22_Z.setForeground(ColorConstants.darkGray);
		nc22_Z.setText("Z");
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(connectWiimoteAction);
		manager.add(disconnectWiimoteAction);
		
		manager.add(led1Action);
		manager.add(led2Action);
		manager.add(led3Action);
		manager.add(led4Action);
		
		manager.add(rumbleAction);
		
		manager.add(reportMode0x21Action);
		manager.add(reportMode0x30Action);
		manager.add(reportMode0x31Action);
		manager.add(reportMode0x32Action);
		manager.add(reportMode0x33Action);
		manager.add(reportMode0x34Action);
		manager.add(reportMode0x35Action);
		manager.add(reportMode0x36Action);
		manager.add(reportMode0x37Action);
		manager.add(reportMode0x3dAction);
		manager.add(reportMode0x3eAction);
		manager.add(reportMode0x3fAction);
	}
	
/*
	private void fillContextMenu(IMenuManager manager) {
		manager.add(connectWiimoteAction);
		manager.add(disconnectWiimoteAction);
		
		manager.add(led1Action);
		manager.add(led2Action);
		manager.add(led3Action);
		manager.add(led4Action);
		
		manager.add(rumbleAction);
		
		manager.add(reportMode0x30);
		manager.add(reportMode0x31);
		manager.add(reportMode0x32);
		manager.add(reportMode0x33);
		manager.add(reportMode0x34);
		manager.add(reportMode0x35);
		manager.add(reportMode0x36);
		manager.add(reportMode0x37);
		manager.add(reportMode0x3d);
		manager.add(reportMode0x3e);
		manager.add(reportMode0x3f);
////		//drillDownAdapter.addNavigationActions(manager);
////		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
*/
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(connectWiimoteAction);
		manager.add(disconnectWiimoteAction);
		
		manager.add(dumpToConsoleAction);

		manager.add(led1Action);
		manager.add(led2Action);
		manager.add(led3Action);
		manager.add(led4Action);
		
		manager.add(rumbleAction);
		
//		//drillDownAdapter.addNavigationActions(manager);
	}
//
//	private boolean checkIfArduinoConnectionAlreadyExistAndAskForReplace(CommPortIdentifier io) {
//		if (!arduinos.containsKey(io.getName())) {
//			return true;
//		} else {
//			MessageDialog dlg = new MessageDialog(
//				Display.getDefault().getActiveShell(),
//				"Arduino connection question",
//				Activator.getImageDescriptor("icons/arduino.png").createImage(),
//				"Arduino connection already active !\nWould you want to replace it ?",
//				MessageDialog.QUESTION_WITH_CANCEL,
//				new String[] { "Yes", "No", "Cancel" },
//				0
//			);
//			return dlg.open() == 0;
//		}
//	}
//	
	
	AbstractQxEventHandlerImpl statusReportListener;

	private void handleCmd(Cmd cmd) {
		if (cmd instanceof CompoundCmd) {
			for (Cmd c : ((CompoundCmd)cmd).getChildren()) {
				handleCmd(c);
			}
		} else {
			if (cmd instanceof WiiEvt) {
				if (Platform.inDebugMode()) {
					System.out.println("Wiimote Event : " + CmdUtil.INSTANCE.getCmdInfo(cmd));
				}
				synchronized(cmd) {
					if (dumpToConsole) {
						OscCmd wiiCmd = WiimoteCmdUtils.INSTANCE.createOscCmdFromWiiEvt((WiiEvt)cmd, 1, true);
						if (wiiCmd instanceof OscCmd) {
							QuanticMojo.INSTANCE.acceptLocalAgentCmd(wiiCmd);
						}
					}
					
					if (cmd instanceof WiiAccelEvt) {
						accel = (WiiAccelEvt) cmd;
						if (Platform.inDebugMode()) {
							String accelInfo = "[X : " + accel.getX() + "][Y : " + accel.getY() + "][Z : " + accel.getZ() + "]";
							System.out.println(accelInfo);
						}
						//ctrlWidget.getAccelPRYOscillo().pushValue(new Float(accel.getX()));
					} else if (cmd instanceof WiiCoreButtonEvt) {
						buttonEvt = (WiiCoreButtonEvt) cmd;
						
						if (Platform.inDebugMode()) {
							String buttonsInfo = "" + 
								(buttonEvt.isButtonAPressed()			? "[A]" : "") +
								(buttonEvt.isButtonBPressed()			? "[B" : "") +
								(buttonEvt.isButtonHomePressed()		? "[Home]" : "") +
								(buttonEvt.isButtonMinusPressed()		? "[-]" : "") +
								(buttonEvt.isButtonPlusPressed()		? "[+]" : "") +
								(buttonEvt.isButtonNoPressed()			? "[No]" : "") +
								(buttonEvt.isButtonOnePressed()			? "[1]" : "") +
								(buttonEvt.isButtonTwoPressed()			? "[2]" : "") +
								(buttonEvt.isButtonPadDownPressed() 	? "[DOWN]" : "") +
								(buttonEvt.isButtonPadLeftPressed() 	? "[LEFT]" : "") +
								(buttonEvt.isButtonPadRightPressed() 	? "[RIGHT]" : "") +
								(buttonEvt.isButtonPadUpPressed() 		? "[UP]" : "")
							;		
							System.out.println(buttonsInfo);
						}
					} else if (cmd instanceof WiiNunchukButtonEvt) {
						nunchukButonEvt = (WiiNunchukButtonEvt) cmd;
						if (Platform.inDebugMode()) {
							String buttonsInfo = "" + 
								(nunchukButonEvt.isCButtonPressed() ? "[C]" : "") +
								(nunchukButonEvt.isZButtonPressed() ? "[Z]" : "")
							;
							System.out.println(buttonsInfo);
						}
					} else if (cmd instanceof WiiAnalogStickEvent) {
						analogStickEvt = (WiiAnalogStickEvent) cmd;
						if (Platform.inDebugMode()) {
							String buttonsInfo = 
								"X : " + analogStickEvt.getX()  + ", " +
								"Y : " + analogStickEvt.getY()
							; 
							System.out.println(buttonsInfo);
						}
					}
				}
			} /* else if (event.getCmd() instanceof WiimoteCmd) {
				WiimoteCmd cmd = (WiimoteCmd) event.getCmd();
				if (cmd.getMsg() instanceof OSCMessage) {
					OSCMessage msg = (OSCMessage) cmd.getMsg();
					String oscAddr = msg.getAddress();
					if (oscAddr.toUpperCase().contains("ACELLPRY")) {
						ctrlWidget.getAccelPRYOscillo().pushValue((Float)msg.getArguments()[0]);
					} else if (oscAddr.toUpperCase().contains("ACCELXYZ")) {
						ctrlWidget.getAccelPRYOscillo().pushValue((Float)msg.getArguments()[0]);
					} else if (oscAddr.toUpperCase().contains("AZERTY")) {
						
					}  
				}
			} */

		}
	}
	
	private void makeActions() {
		connectWiimoteAction = new Action() {
			public void run() {
				WiimoteConnectionDialog wiimoteConnectionDialog = new WiimoteConnectionDialog(
						Display.getDefault().getActiveShell(), 
						"Press 1 + 2 Wiimote Buttons Please", 
						"Press 1 + 2 Wiimote Buttons Please"
	     		);
				int status = wiimoteConnectionDialog.open();
				if(status == Window.OK) {
					Object[] results = wiimoteConnectionDialog.getResult();
					if (results != null && results.length > 0) {
						final WiimoteController ctrl = (WiimoteController) results[0];
						String btaddress = ctrl.getAddr();
							
						btPipe = QuanticMojo.INSTANCE.openBluetoothPipe(
							"wiimote",
							btaddress
						);
						
						ctrl.getEngines().add(btPipe);
						ctrl.setDefault(btPipe);
						
						statusReportListener = new AbstractQxEventHandlerImpl(){
							@Override
							public void handleQxEvent(Event evt) {
								if (evt.getCmd() instanceof WiiStatusInfoReport) {
									@SuppressWarnings("unused")
									WiiStatusInfoReport report = (WiiStatusInfoReport) evt.getCmd();
									
									
									// 1. initialize peripheral (writing zero to 0xa40040) 

									btPipe.send(BTWiimoteCmdUtils.INSTANCE.createWiiWriteRegisterReqCmd(
											new byte[] { (byte) 0xa4, 0x00, 0x40 }, 
											new byte[] { 0x00 })
										);
										
									// 2. read extension ID bytes from wii register (0xa400fe)

									btPipe.send(BTWiimoteCmdUtils.INSTANCE.createWiiReadRegisterReqCmd(
										new byte[] { (byte) 0xa4, 0x00, (byte) 0xfe }, 
										new byte[] { 0x00, 0x02 })
									);
									
									//btPipe.send(BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd((byte)0x32, true));
								}
							}
						};
						
						btPipe.addQxEventHandler(statusReportListener);
						
						btPipe.send(BTWiimoteCmdUtils.INSTANCE.createWiiStatusInfoReqCmd());
						btPipe.send(BTWiimoteCmdUtils.INSTANCE.createWiiCalibrationReqCmd());
						btPipe.send(BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd((byte) 0x31, true), 250l);

						/*
						heartBeat = new UIJob("Wiimote comm Heart Beat ") {
							@Override
							public IStatus runInUIThread(IProgressMonitor monitor) {
								try {
									sendCmdOnCurrentSelection(BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(new boolean[] {false, false, false, false}));
									getThread().sleep(250l);
									sendCmdOnCurrentSelection(BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(new boolean[] {true, true, true, true}));
									getThread().sleep(250l);
									sendCmdOnCurrentSelection(BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(leds));
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								schedule(500l);
								return Status.OK_STATUS;
							}
						};
						heartBeat.schedule();
						*/
						
						refreshUI = new UbiJob("Refresh UI") {
							@Override
							public IStatus runInUIThread(IProgressMonitor monitor) {
								viewer.expandToLevel(2);
								viewer.refresh(true);
								schedule(500l);
								return Status.OK_STATUS;
							}
						};
						refreshUI.schedule();
						
/*						new UIJob("Wiimote comm Heart Beat ") {
							@Override
							public IStatus runInUIThread(IProgressMonitor monitor) {
								try {
									for (int i=0; i<8; i++) {
										sendCmdOnCurrentSelection(
											BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(
												cyclicleds[i]
											)
										);
										getThread().sleep(250l);
									}
									sendCmdOnCurrentSelection(
										BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(
											leds
										)
									);
									getThread().sleep(250l);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								schedule(750l);
								return Status.OK_STATUS;
							}
						}.schedule();
*/						
						wiimotes.put(btaddress, ctrl);
						
						viewer.setInput(new ArrayList<WiimoteController>(wiimotes.values()));
						
						viewer.addSelectionChangedListener(new ISelectionChangedListener() {
							@Override
							public void selectionChanged(SelectionChangedEvent event) {
								ISelection s = event.getSelection();
								if(s instanceof StructuredSelection) {
									Object obj = ((StructuredSelection)s).getFirstElement();
									if (obj instanceof WiimoteController) {
										String addr = ((WiimoteController)obj).getAddr();
										if (!handlers.containsKey(addr)) {
											AbstractQxEventHandler evtHandler = new AbstractQxEventHandlerImpl() {
												@Override
												public synchronized void handleQxEvent(Event event) {
													if (event.getCmd() instanceof Cmd) {
														handleCmd(event.getCmd());
													}
												}
											};
											((WiimoteController)obj).getDefault().addQxEventHandler(evtHandler);
											
											handlers.put(addr, evtHandler);
										} else {
											//((WiimoteController)obj).getDefault().receive()
										}
									}
								}
							}
						});
					}
				}
				
				if (wiimotes.values() != null && wiimotes.values().size()>0) {
					viewer.setSelection(
						new StructuredSelection(
							wiimotes.values().toArray()[0]
						)
					);
				}
				// FIXME : LB to get initialization info from here
			}
		};	
		connectWiimoteAction.setText("Connect Wiimote");
		connectWiimoteAction.setToolTipText("Connection To Wiimote");
		connectWiimoteAction.setImageDescriptor(
				net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/bluetooth-add.png"
				)
			);

		//
		//
		//
		
		disconnectWiimoteAction = new Action() {
			public void run() {
				if (btPipe == null) {
					MessageDialog.openWarning(
						Display.getDefault().getActiveShell(), 
						"Wiimote Connection", 
						"No Wiimote connected so far"
					);
				} else {
					CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(
						btPipe, 
						false
					);
					if (dlg.open() == Window.OK) {
						Object[] results = dlg.getResult();
						if (results != null) {
							for (Object obj : results) {
								if (obj instanceof CmdPipe) {
									QuanticMojo.INSTANCE.closePipe((CmdPipe)obj, true);
								}
							}
						}
					}
				}
			}
		};	
		disconnectWiimoteAction.setText("Disconnect Wiimote");
		disconnectWiimoteAction.setToolTipText("Disconnection From Wiimote");
		disconnectWiimoteAction.setImageDescriptor(
				net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/bluetooth-remove.png"
				)
			);
		
		//
		//
		//
		
		led1Action = new Action() {
			public void run() {
				leds[0] = !leds[0];
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(
						leds
					)
				);
			}
		};	
		led1Action.setText("LED #1");
		led1Action.setToolTipText("Toggle Wiimote's LED #1");
		led1Action.setImageDescriptor(
				net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/led1.png"
				)
			);

		//
		//
		//
		
		dumpToConsoleAction = new Action("Dump Console As OSC", SWT.TOGGLE) {
			public void run() {
				dumpToConsole = isChecked();
			}
		};	
		dumpToConsoleAction.setToolTipText("Dump Console As OSC Messages");
		dumpToConsoleAction.setImageDescriptor(
			net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/status/software-update-available.png"
			)
		);

		//
		//
		//
		
		led2Action = new Action() {
			public void run() {
				leds[1] = !leds[1];
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(
						leds
					)
				);
			}
		};	
		led2Action.setText("LED #2");
		led2Action.setToolTipText("Toggle Wiimote's LED #2");
		led2Action.setImageDescriptor(
				net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/led2.png"
				)
			);
		
		//
		//
		//
		
		led3Action = new Action() {
			public void run() {
				leds[2] = !leds[2];
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(
						leds
					)
				);
			}
		};	
		led3Action.setText("LED #3");
		led3Action.setToolTipText("Toggle Wiimote's LED #3");
		led3Action.setImageDescriptor(
				net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/led3.png"
				)
			);
		
		//
		//
		//
		
		led4Action = new Action() {
			public void run() {
				leds[3] = !leds[3];
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiPlayerLEDReqCmd(
						leds
					)
				);
			}
		};	
		led4Action.setText("LED #4");
		led4Action.setToolTipText("Toggle Wiimote's LED #4");
		led4Action.setImageDescriptor(
				net.sf.smbt.ui.wiimote.Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/led4.png"
				)
			);
		
		//
		//
		//
		
		rumbleAction = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiRumbleReqCmd(
						500, 
						(byte) 0x00
					)
				);
			}
		};	
		rumbleAction.setText("Rumble");
		rumbleAction.setToolTipText("Rumble Wiimote's lil ass");
		
		//
		//
		//
		
		reportMode0x21Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x21, 
						true
					)
				);
			}
		};	
		reportMode0x21Action.setText("0x21");
		reportMode0x21Action.setToolTipText("report mode 0x21");
		
		reportMode0x30Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x30, 
						true
					)
				);
			}
		};	
		reportMode0x30Action.setText("0x30");
		reportMode0x30Action.setToolTipText("report mode 0x30");
		
		//
		//
		//
		
		reportMode0x31Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x31, 
						true
					)
				);
			}
		};	
		reportMode0x31Action.setText("0x31");
		reportMode0x31Action.setToolTipText("report mode 0x31");
		
		//
		//
		//
		
		reportMode0x32Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x32, 
						true
					)
				);
			}
		};	
		reportMode0x32Action.setText("0x32");
		reportMode0x32Action.setToolTipText("report mode 0x32");
		
		//
		//
		//
		
		reportMode0x33Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x33, 
						true
					)
				);
			}
		};	
		reportMode0x33Action.setText("0x33");
		reportMode0x33Action.setToolTipText("report mode 0x33");
		
		//
		//
		//
		
		reportMode0x34Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x34, 
						true
					)
				);
			}
		};	
		reportMode0x34Action.setText("0x34");
		reportMode0x34Action.setToolTipText("report mode 0x34");
		
		//
		//
		//
		
		reportMode0x35Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x35, 
						true
					)
				);
			}
		};	
		reportMode0x35Action.setText("0x35");
		reportMode0x35Action.setToolTipText("report mode 0x35");
		
		//
		//
		//
		
		reportMode0x36Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x36, 
						true
					)
				);
			}
		};	
		reportMode0x36Action.setText("0x36");
		reportMode0x36Action.setToolTipText("report mode 0x36");
		
		//
		//
		//
		
		reportMode0x37Action = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x37, 
						true
					)
				);
			}
		};	
		reportMode0x37Action.setText("0x37");
		reportMode0x37Action.setToolTipText("report mode 0x37");
		
		//
		//
		//
		
		reportMode0x3dAction = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x3d, 
						true
					)
				);
			}
		};	
		reportMode0x3dAction.setText("0x3d");
		reportMode0x3dAction.setToolTipText("report mode 0x3d");
		
		//
		//
		//
		
		reportMode0x3eAction = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x3e, 
						true
					)
				);
			}
		};	
		reportMode0x3eAction.setText("0x3e");
		reportMode0x3eAction.setToolTipText("report mode 0x3e");
		
		//
		//
		//
		
		reportMode0x3fAction = new Action() {
			public void run() {
				sendCmdOnCurrentSelection(
					BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd(
						(byte) 0x3f, 
						true
					)
				);
			}
		};	
		reportMode0x3fAction.setText("0x3f");
		reportMode0x3fAction.setToolTipText("report mode 0x3f");

	}
	
	public String valueOf(byte num) {
		String hex = Integer.toHexString((int) num & 0xFF);
		return "0x" + (hex.length() == 1 ? "0" : "") + hex;
	}
	
	private void sendCmdOnCurrentSelection(Cmd cmd) {
		if (viewer.getSelection() instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection)viewer.getSelection()).getFirstElement();
			if (obj instanceof IConnectedUnit) {
				if(Platform.inDebugMode()) {
					System.out.println("Switching to " +  valueOf(((WiiReportModeReqCmd)cmd).getMode()) + " mode");
				}
				((IConnectedUnit)obj).getDefault().send(cmd);
			}
		}
	}
	
//	private void showMessage(String message) {
//		MessageDialog.openInformation(
//			Display.getDefault().getActiveShell(),
//			"Ubiquino View",
//			message);
//	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//pane.getViewer().getControl().setFocus();
	}
	
	@Override
	public void dispose() {
		// heartBeat.done(Status.OK_STATUS);
		refreshUI.done(Status.OK_STATUS);
		super.dispose();
	}
	
	
}