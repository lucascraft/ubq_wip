/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010, Lucas Bigeardel
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

package net.sf.smbt.comm.xbee.utils;

import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.at.utils.ATCmdUtils;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

public class XbeeUtils {
	//
	// 
	//
	public final static XbeeUtils INSTANCE = new XbeeUtils();

	
	public void initSerialXbeeModem(CmdPipe xbeeSerialPipe) {
		xbeeSerialPipe.send(ATCmdUtils.INSTANCE.createATPlusPlusPlus());
	}

	public void sendSerialXbeeModem(CmdPipe xbeeSerialPipe,  ATCmd... cmd) {
		for (Cmd c : cmd) {
			xbeeSerialPipe.send(c);
		}
	}
	
}
