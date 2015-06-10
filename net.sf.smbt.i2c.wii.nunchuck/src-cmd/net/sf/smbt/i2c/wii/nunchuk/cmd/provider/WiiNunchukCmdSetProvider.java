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

package net.sf.smbt.i2c.wii.nunchuk.cmd.provider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.emf.ecore.EClassifier;

public class WiiNunchukCmdSetProvider extends AbstractCmdSetProvider {
	public WiiNunchukCmdSetProvider() {
	}

	@Override
	public String getPartNumber() {
		return super.getPartNumber();
	}
	@Override
	public String getProtocol() {
		return super.getProtocol();
	}
	@Override
	public String getVendor() {
		return super.getVendor();
	}
	@Override
	public String getVersionNumber() {
		return super.getVersionNumber();
	}
	@Override
	public String getUri() {
		return "http://www.sf.net/smbt/thingm/commands/1.0";
	}
	@Override
	public Map<String, List<EClassifier>> getCommandSets() {
		Map<String, List<EClassifier>> commandSets = new HashMap<String, List<EClassifier>>();
		
		commandSets.put(
			"I2C Wii Nunchuk", 
			Arrays.asList(
				new EClassifier[] {
					CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD,
					CommandsPackage.Literals.INIT_NUNCHUK_CMD
				}
			)
		);
		
		return commandSets;
	}
}
