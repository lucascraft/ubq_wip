/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
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

package net.sf.smbt.osc.ofx3nity.cmd.provider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.osc.ofx3nity.Ofx3nityPackage;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.emf.ecore.EClassifier;

public class X3nityCmdSetProvider extends AbstractCmdSetProvider {
	public X3nityCmdSetProvider() {
	}
	@Override
	public String getPartNumber() {
		return "N/A";
	}
	@Override
	public String getProtocol() {
		return "x3nity";
	}
	@Override
	public String getVendor() {
		return "ubqt";
	}
	@Override
	public String getVersionNumber() {
		return "0.1";
	}
	@Override
	public String getUri() {
		return "http://www.sf.net/smbt/osc/ofx3nity/1.0";
	}
	@Override
	public Map<String, List<EClassifier>> getCommandSets() {
		Map<String, List<EClassifier>> commandSets = new HashMap<String, List<EClassifier>>();
		
		commandSets.put(
				"Ofx3nity Common Commands", 
				Arrays.asList(
					new EClassifier[] {
						Ofx3nityPackage.Literals.OFX3_RCV_CMD
					}
				)
		);
		
		return commandSets;
	}
}
