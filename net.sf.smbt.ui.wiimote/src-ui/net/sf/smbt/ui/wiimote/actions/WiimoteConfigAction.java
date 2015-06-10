/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.wiimote.actions;

import net.sf.smbt.bt.wiimote.utils.BTWiimoteCmdUtils;
import net.sf.smbt.ezwiimote.WiiAccelEvt;
import net.sf.smbt.ezwiimote.WiiAnalogStickEvent;
import net.sf.smbt.ezwiimote.WiiCoreButtonEvt;
import net.sf.smbt.ezwiimote.WiiEvt;
import net.sf.smbt.ezwiimote.WiiNunchukButtonEvt;
import net.sf.smbt.ezwiimote.WiiStatusInfoReport;
import net.sf.smbt.osc.wiimote.cmd.utils.WiimoteCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.wiimote.dialogs.WiimoteConnectionDialog;
import net.sf.smbt.wiimotectrl.WiimoteController;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.AbstractQxEventHandler;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class WiimoteConfigAction extends Action implements IWorkbenchWindowActionDelegate {
	@SuppressWarnings("unused")
	private IWorkbenchWindow window;

	public WiimoteConfigAction() {
		dumpToConsole = true;
	}
	
	private CmdPipe btPipe;
	private boolean dumpToConsole;
	private AbstractQxEventHandlerImpl statusReportListener;

	private WiiAccelEvt accel;
	private WiiCoreButtonEvt buttonEvt;
	private WiiNunchukButtonEvt nunchukButonEvt;
//	private WiiNunchukAccelPryCmd nunchukPRYAccelEvt;
//	private WiiNunchukAccelXyzCmd nunchukXYZAccelEvt;
//	private WiiNunchukJoyCmd nunchukJoyEvt;
	private WiiAnalogStickEvent analogStickEvt;

	@Override
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
				btPipe.send(BTWiimoteCmdUtils.INSTANCE.createWiiReportModeReqCmd((byte) 0x32, true), 250l);
				
				AbstractQxEventHandler evtHandler = new AbstractQxEventHandlerImpl() {
					@Override
					public synchronized void handleQxEvent(Event event) {
						if (event.getCmd() instanceof Cmd) {
							handleCmd(event.getCmd());
						}
					}
				};
				btPipe.addQxEventHandler(evtHandler);

			}
		}
		
		//ConsolePlugin.getDefault().getConsoleManager().showConsoleView(SmbtConsole.getInstance());
	}
			
			

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
								// FIXME : LB to add multi wiimote support
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

	
	public void run(IAction action) {
		run();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}
