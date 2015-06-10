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

package net.sf.smbt.jazzmutant.utils;

import net.sf.smbt.ezlemur.EzlemurFactory;
import net.sf.smbt.ezlemur.LemurMidiCmd;
import net.sf.smbt.ezlemur.LemurOscCmd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.illposed.osc.OSCMessage;

public class LemurCmdUtils {
	public final static LemurCmdUtils INSTANCE = new LemurCmdUtils();
	
	public LemurOscCmd createLemurOscCmd(String addr, EStructuralFeature eStructuralFeature) {
		LemurOscCmd oscCmd = EzlemurFactory.eINSTANCE.createLemurOscCmd();
	
		oscCmd.setMsg(new OSCMessage(addr));
		oscCmd.setTarget(eStructuralFeature);
		
		return oscCmd;
	}
	
	public LemurMidiCmd createLemurMidiCmd(byte[] b1, byte[] b2, EAttribute eAttribute) {
		LemurMidiCmd midiCmd = EzlemurFactory.eINSTANCE.createLemurMidiCmd();
	
		midiCmd.setTarget(eAttribute);
		
		return midiCmd;
	}
	
/*
 	public LemurOscCmd createLemurKBCmd(String addr, EAttribute eAttribute) {
 
		LemurOscCmd oscCmd = EzlemurFactory.eINSTANCE.createLemurOscCmd();
	
		oscCmd.setMsg(new OSCMessage(addr));
		oscCmd.setTarget(eAttribute);
		
		return oscCmd;
	}
	public LemurOscCmd createLemurDmxCmd(String addr, EAttribute eAttribute) {
		LemurDmxCmd oscCmd = EzlemurFactory.eINSTANCE.createLemurDmxCmd();
	
		oscCmd.setMsg(new OSCMessage(addr));
		oscCmd.setTarget(eAttribute);
		
		return oscCmd;
	}
*/
}
