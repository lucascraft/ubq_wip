/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.osc.wiimote.cmd.handlers;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd;
import net.sf.smbt.osccmd.OscRcvCmd;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.Platform;

/**
 * Basically scan the Wiimote commands raised events and decode them as proper input for a 
 * Java usage.
 * 
 * It has to be said that Ubqt currently supports OSCulator wiimote stuff only (although it is the full stuff).
 * 
 * @author lucas
 *
 */
public class WiimoteOscCmdHandler extends AbstractQxEventHandlerImpl {
	@Override
	public void handleQxEvent(Event event) {
		if(event.getKind()==EVENT_KIND.RX_DONE || event.getKind()==EVENT_KIND.RX_READY) {
			if (event.getCmd() instanceof WiimoteCmd) {
				OscRcvCmd cmd = (OscRcvCmd) event.getCmd();
				if (Platform.inDebugMode()) { // Display Wiimote
					if (cmd instanceof WiiAccelPryCmd) { // Wiimote accelerations Pitch/Roll/Yaw
						float roll = ((WiiAccelPryCmd)cmd).getRoll();
						float pitch = ((WiiAccelPryCmd)cmd).getPitch();
						float yaw = ((WiiAccelPryCmd)cmd).getYaw();
						System.err.println("Wii Acell PRY [pitch:"+pitch+"][roll:"+roll+"][yaw:"+yaw+"]");
					} else if (cmd instanceof WiiAccelXYZCmd) { // Wiimote accelerations XYZ
						float x = ((WiiAccelXYZCmd)cmd).getX();
						float y = ((WiiAccelXYZCmd)cmd).getY();
						float z = ((WiiAccelXYZCmd)cmd).getZ();
						System.err.println("Wii Acell XYZ [x:"+x+"][y:"+y+"][z:"+z+"]");
					} else if (cmd instanceof WiiAnglesCmd) { // Wiimote accelerations Angles
						float roll = ((WiiAnglesCmd)cmd).getRoll();
						float pitch = ((WiiAnglesCmd)cmd).getPitch();
						float yaw = ((WiiAnglesCmd)cmd).getYaw();
						System.err.println("Wii Angles PRY [pitch:"+pitch+"][roll:"+roll+"][yaw:"+yaw+"]");
					} else if (cmd instanceof WiiMotionVeloCmd) { // Wiimote velocities Pitch/Roll/Yaw 
						float roll_velo = ((WiiMotionVeloCmd)cmd).getPitch_velocity();
						float pitch_velo = ((WiiMotionVeloCmd)cmd).getRoll_velocity();
						float yaw_velo = ((WiiMotionVeloCmd)cmd).getYaw_velocity();
						System.err.println("Wii Motion Velocities [pitch:"+pitch_velo+"][roll:"+roll_velo+"][yaw:"+yaw_velo+"]");
					} else if (cmd instanceof WiiMotionAnglesCmd) {
						float pitch_velo = ((WiiMotionAnglesCmd)cmd).getPitch();
						float roll_velo = ((WiiMotionAnglesCmd)cmd).getRoll();
						float yaw_velo = ((WiiMotionAnglesCmd)cmd).getYaw();
						System.err.println("Wii Motion Angles [pitch:"+pitch_velo+"][roll:"+roll_velo+"][yaw:"+yaw_velo+"]");
					} else if (cmd instanceof WiiNunchukAccelPryCmd) {
						float pitch = ((WiiNunchukAccelPryCmd)cmd).getPitch();
						float roll = ((WiiNunchukAccelPryCmd)cmd).getRoll();
						float yaw = ((WiiNunchukAccelPryCmd)cmd).getYaw();
						System.err.println("Wii Nunchuk Acell PRY [pitch:"+pitch+"][roll:"+roll+"][yaw:"+yaw+"]");
					} else if (cmd instanceof WiiNunchukAccelXyzCmd) {
						float x = ((WiiNunchukAccelXyzCmd)cmd).getX();
						float y = ((WiiNunchukAccelXyzCmd)cmd).getY();
						float z = ((WiiNunchukAccelXyzCmd)cmd).getZ();
						System.err.println("Wii Nunchuk Acell XYZ [x:"+x+"][y:"+y+"][z:"+z+"]");
					} else if (cmd instanceof WiiIrCmd) {
						float x = ((WiiIrCmd)cmd).getX();
						float y = ((WiiIrCmd)cmd).getY();
						System.err.println("Wii IR  [x:"+x+"][y:"+y+"]");
					} else if (cmd instanceof WiiNunchukJoyCmd) {
						float x = ((WiiNunchukJoyCmd)cmd).getX();
						float y = ((WiiNunchukJoyCmd)cmd).getY();
						System.err.println("Wii Nunchuk Joystick  [x:"+x+"][y:"+y+"]");
					} else if (cmd instanceof WiiButtonCmd) {
						System.err.println("Wiimote Button  [" + ((WiiButtonCmd)cmd).getKind().getName() + "]");
					} else if (cmd instanceof WiiNunchukButtonCmd) {
						System.err.println("Wiimote Button  [" + ((WiiNunchukButtonCmd)cmd).getKind().getName() + "]");
					}
				}
			}
		}
	}
}
