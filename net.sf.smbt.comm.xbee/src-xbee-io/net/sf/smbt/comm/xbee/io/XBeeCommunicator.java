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

package net.sf.smbt.comm.xbee.io;

import java.io.IOException;
import java.nio.charset.Charset;

import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.impl.IChannelImpl;

import com.rapplogic.xbee.api.PacketListener;
import com.rapplogic.xbee.api.XBee;
import com.rapplogic.xbee.api.XBeeException;
import com.rapplogic.xbee.api.XBeeResponse;
import com.rapplogic.xbee.util.ByteUtils;

public class XBeeCommunicator extends IChannelImpl {
	private XBee xbee;
	private CmdPipe engine;
	
	public XBeeCommunicator(CmdPipe _engine, String portID, int speed) {
		xbee = new XBee();
		engine = _engine;

		try {
			xbee.open(portID, speed);
		} catch (XBeeException e) {
			e.printStackTrace();
		}

		initXbeeComm();
	}
	
	private void initXbeeComm() {
		xbee.addPacketListener(new PacketListener() {
			public void processResponse(XBeeResponse response) {
				int[] ints = response.getPacketBytes();
				
				//
				// FIXME : wrong for sure, lets implement it then test it ...
				// - what about different comm configurations ?
				//
				engine.receive(
					ByteUtils.toString(ints).getBytes(Charset.defaultCharset())
				);
			}
		});
	}
	
	
	@Override
	public void send(byte[] bytes) {

		int[] ints = ByteUtils.stringToIntArray(new String(bytes));
		
//		XBeeAddress16 xBeeAddress16 = new XBeeAddress16();
//		
//		TxRequest16 txReq16 = new TxRequest16(xBeeAddress16, ints);
		
		try {
			xbee.sendPacket(ints);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
