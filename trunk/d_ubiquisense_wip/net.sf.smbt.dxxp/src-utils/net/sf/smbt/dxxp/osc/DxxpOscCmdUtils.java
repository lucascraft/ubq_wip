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

package net.sf.smbt.dxxp.osc;

import net.sf.smbt.dxxp.daap.DaapCmdUtils;
import net.sf.smbt.ezdxxp.DaapCmdChunk;
import net.sf.xqz.model.cmd.Cmd;

public class DxxpOscCmdUtils {
	public final static DxxpOscCmdUtils INSTANCE = new DxxpOscCmdUtils();

	public byte[] dumpDxxPCmd(Cmd cmd) {
		if (cmd instanceof DaapCmdChunk) {
			return DaapCmdUtils.INSTANCE.dumpDaapCmd(cmd);
		} 
		/* else if (cmd instanceof DacpCmdChunk) {
			return DacpCmdUtils.INSTANCE.dumpDacpCmd(cmd);
		} else if (cmd instanceof DmapCmdChunk) {
			return DmapCmdUtils.INSTANCE.dumpDmapCmd(cmd);
		} else if (cmd instanceof DpapCmdChunk) {
			return DpapCmdUtils.INSTANCE.dumpDpapCmd(cmd);
		}
		*/
		return new byte[0];
	}
	
	public Cmd handleDxxPFrame(byte[] frame) {
		if (isAMatchingDaapFrame(frame)) {
			return DaapCmdUtils.INSTANCE.handleDaapFrame(frame);
		}
		return null;
	}
	
	public boolean isAMatchingDaapFrame(byte[] frame) {
		return true; // FIXME : change that on the future
	}
	public boolean isAMatchingDacpFrame(byte[] frame) {
		return false;
	}
	public boolean isAMatchingDmapFrame(byte[] frame) {
		return false;
	}
	public boolean isAMatchingDpapFrame(byte[] frame) {
		return false;
	}
}
