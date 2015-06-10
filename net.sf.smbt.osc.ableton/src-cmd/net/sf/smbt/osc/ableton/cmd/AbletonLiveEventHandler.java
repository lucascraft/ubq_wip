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

import net.sf.smbt.comm.topology.utils.GenericQxEventHandler;
import net.sf.smbt.ezableton.AbletonLiveSndCmd;
import net.sf.xqz.model.engine.Event;

public class AbletonLiveEventHandler extends GenericQxEventHandler {
	@Override
	public void handleQxEvent(Event evt) {
		if (evt.getCmd() instanceof AbletonLiveSndCmd) {
			try {
				super.handleQxEvent(evt);
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(
					"It's very liekly that no OSC plugin is running on your Ableton Live 8+ ... \n" +
					"Please grab LiveControl OSC python addon from http://liine.net/livecontrol/" +
					""
				);
			}
		}
	}
}
