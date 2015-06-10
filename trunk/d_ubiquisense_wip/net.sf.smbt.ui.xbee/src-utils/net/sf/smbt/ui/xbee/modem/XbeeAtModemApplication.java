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

package net.sf.smbt.ui.xbee.modem;

import net.sf.smbt.at.atcmdset.ATRetCmd;
import net.sf.smbt.at.utils.ATCmdUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

public class XbeeAtModemApplication implements IApplication {

	private void dumpATCmd(Cmd cmd) {
		if (cmd instanceof ATRetCmd) {
			byte[] bytes = ((ATRetCmd)cmd).getData();
			if (bytes != null) {
				System.out.println("!!! " + new String(bytes) + " !!!");
			}
		}
	}
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		CmdPipe xbeeModem = QuanticMojo.INSTANCE.openUsbPipe("at", "/dev/tty.usbserial-A6007to3", 19200);
		xbeeModem.getRx().setTtl(1000);
		xbeeModem.getTx().setTtl(1000);
		
		dumpATCmd((ATRetCmd) xbeeModem.syncSend(ATCmdUtils.INSTANCE.createATPlusPlusPlus(), 1500));
		dumpATCmd((ATRetCmd) xbeeModem.syncSend(ATCmdUtils.INSTANCE.createATBD(), 1500));
		dumpATCmd((ATRetCmd) xbeeModem.syncSend(ATCmdUtils.INSTANCE.createATID(), 1500));
		dumpATCmd((ATRetCmd) xbeeModem.syncSend(ATCmdUtils.INSTANCE.createATMY(), 1500));
		
		return new Object();
	}

	@Override
	public void stop() {}
}
