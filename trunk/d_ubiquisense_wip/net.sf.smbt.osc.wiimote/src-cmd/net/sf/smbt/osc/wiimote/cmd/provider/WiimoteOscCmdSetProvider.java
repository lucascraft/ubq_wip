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

package net.sf.smbt.osc.wiimote.cmd.provider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.emf.ecore.EClassifier;

public class WiimoteOscCmdSetProvider extends AbstractCmdSetProvider {
	public WiimoteOscCmdSetProvider() {
	}
	@Override
	public String getPartNumber() {
		return "ACN 060 566 083/FCC ID : CWTSBCN1001 / IC : 1788F-SBCN1001";
	}
	@Override
	public String getProtocol() {
		return "Osc";
	}
	@Override
	public String getVendor() {
		return "Nintendo";
	}
	@Override
	public String getVersionNumber() {
		return "1.0";
	}
	@Override
	public String getUri() {
		return WiimotePackage.eNS_URI;
	}
	@Override
	public Map<String, List<EClassifier>> getCommandSets() {
		Map<String, List<EClassifier>> commandSets = new HashMap<String, List<EClassifier>>();
		
		commandSets.put(
			"Wiimote+Nunchuk+MotionPlus 1.0 Super Set Commands", 
			Arrays.asList(
				new EClassifier[] {
					WiimotePackage.Literals.WII_ACCEL_PRY_CMD,
					WiimotePackage.Literals.WII_ACCEL_XYZ_CMD,
					WiimotePackage.Literals.WII_ANGLES_CMD,
					WiimotePackage.Literals.WII_BUTTON_CMD,
					WiimotePackage.Literals.WII_IR_CMD,
					WiimotePackage.Literals.WII_IR_XY_SPEED_CMD,
					WiimotePackage.Literals.WII_MOTION_ANGLES_CMD,
					WiimotePackage.Literals.WII_MOTION_VELO_CMD,
					WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD,
					WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD,
					WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD,
					WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD
				}
			)
		);
		
		return commandSets;
	}
}
