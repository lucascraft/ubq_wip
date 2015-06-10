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

package net.sf.smbt.osc.ableton.cmd;

import java.util.List;

import net.sf.smbt.ezableton.AbletonLiveSndCmd;
import net.sf.smbt.osc.ableton.utils.AbletonLive8Utils;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl;

import org.eclipse.core.runtime.Platform;

import com.illposed.osc.OSCPacket;
import com.illposed.osc.utility.OSCByteArrayToJavaConverter;

public class AbletonLiveFrameInterpreter extends AbstractFrameInterpreterImpl {
	private OSCByteArrayToJavaConverter oscByte2JavaConverter;
	public AbletonLiveFrameInterpreter() {
		oscByte2JavaConverter = new OSCByteArrayToJavaConverter();
	}
	@Override
	public synchronized Cmd byteArray2Cmd(final byte[] stream) {
		if (stream != null && stream.length>2) {
			try {
				OSCPacket packet = oscByte2JavaConverter.convert(stream, stream.length);
				if (Platform.inDebugMode()) {
					System.out.println(packet.toString());
				}
				CompoundCmd compoundCmd = CmdFactory.eINSTANCE.createCompoundCmd();
				List<AbletonLiveSndCmd> lst = AbletonLive8Utils.INSTANCE.handleAbletonLiveOSCPacket(packet);
				for (AbletonLiveSndCmd c : lst) {
					compoundCmd.add(c);
				}
				return compoundCmd;
			} catch (Exception e) {
				System.err.println(e);
			}
		}
		return null;
	}
}
