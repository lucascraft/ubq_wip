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

package net.sf.smbt.vertilice.cmd;

import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd;
import net.sf.xqz.model.cmd.Cmd;

public class VertiliceCmdUtils {
	private final static String VERTILICE_ADDR = "/vertilice";
	
	public final static VertiliceCmdUtils INSTANCE = new VertiliceCmdUtils();
	
	public byte[] dumpVertiliceCmd(Cmd cmd) {
		if (cmd instanceof VertiliceBatteryStatusCmd) {
			return new byte[0];
		} else if (cmd instanceof VertiliceInstantStatusCmd) {
			return new byte[0];
		}
		return new byte[0];
	}

	public VertiliceCmd getVertiliceCmdFromFrame(byte[] frame) {
		byte[] addrBytes = VERTILICE_ADDR.getBytes();
		if (frame != null && frame.length >= addrBytes.length) {
			byte[] tmpBytes = new byte[addrBytes.length];
			System.arraycopy(frame, 0, tmpBytes, 0, addrBytes.length);
			String fAddr = new String(tmpBytes);
			if (fAddr.equals(VERTILICE_ADDR)) {
				
			}
		}
		return null;
	}


}
