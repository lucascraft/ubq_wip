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

package net.sf.smbt.i2c.wii.nunchuck;

import net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

public class NunchukQxEventHandler extends AbstractQxEventHandlerImpl {

	public NunchukQxEventHandler() {
	}

	@Override
	public void handleQxEvent(Event event) {
		if(event.getKind()==EVENT_KIND.RX_DONE || event.getKind()==EVENT_KIND.RX_READY) {
			if (event.getCmd() instanceof Get3DAccelValuesCmd) {
				Get3DAccelValuesCmd cmd = (Get3DAccelValuesCmd) event.getCmd();
				
				System.out.println(
						"Nunchuk  : JOYSTICK[" + cmd.getJoyX() + "," + cmd.getJoyY() + "], XYZ[" + cmd.getXAccel() + ", "  + cmd.getYAccel() + ", "  + cmd.getZAccel() + "] with C button " + (cmd.isCButtonDown()?"DOWN":"UP") + " & Z button " + (cmd.isZButtonDown()?"DOWN":"UP"));
			}
		}
	}
}
