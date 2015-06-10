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

package net.sf.smbt.i2c.wii.nunchuk.utils;

import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage;
import net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.util.EcoreUtil;

public class NunchukUtil {
	public static NunchukUtil INSTANCE = new NunchukUtil();
	
	static Get3DAccelValuesCmd x3dAccelNunchukCmd = (Get3DAccelValuesCmd) EcoreUtil.create(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD);
	
	public Cmd toCmd(byte[] frame){
		//if (!(frame.length>=8)) return null;

		x3dAccelNunchukCmd.setAddr("0x52");		
		//x3dAccelNunchukCmd.setId(x3dAccelNunchukCmd.eClass().getName());		
		x3dAccelNunchukCmd.setJoyX(new Integer(""+frame[0]));
		x3dAccelNunchukCmd.setJoyY(new Integer(""+frame[1]));
		x3dAccelNunchukCmd.setXAccel(new Integer(""+frame[2]));
		x3dAccelNunchukCmd.setYAccel(new Integer(""+frame[3]));
		x3dAccelNunchukCmd.setZAccel(new Integer(""+frame[4]));
		x3dAccelNunchukCmd.setCButtonDown(new Integer(""+frame[5])==1);
		x3dAccelNunchukCmd.setZButtonDown(new Integer(""+frame[6])==1);
		
		return x3dAccelNunchukCmd;
	}

}
