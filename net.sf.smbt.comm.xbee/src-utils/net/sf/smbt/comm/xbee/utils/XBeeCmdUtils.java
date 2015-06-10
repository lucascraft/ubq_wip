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

package net.sf.smbt.comm.xbee.utils;

import net.sf.smbt.xbeecmd.RxResponse16;
import net.sf.smbt.xbeecmd.RxResponse64;
import net.sf.smbt.xbeecmd.TxRequest16;
import net.sf.smbt.xbeecmd.TxRequest64;
import net.sf.smbt.xbeecmd.XBeeAtRcvCmd;
import net.sf.smbt.xbeecmd.XBeeAtSndCmd;
import net.sf.smbt.xbeecmd.XbeecmdFactory;
import net.sf.smbt.xbeecmd.XbeecmdPackage;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClassifier;

public class XBeeCmdUtils {
	public final static XBeeCmdUtils INSTANCE = new XBeeCmdUtils();
	
	public XBeeCmdUtils() {
	}
	
	public Cmd creatXBeeCmd(EClassifier classifier) {
		if (classifier.equals(XbeecmdPackage.Literals.RX_RESPONSE16)) {
			
		} else if (classifier.equals(XbeecmdPackage.Literals.RX_RESPONSE64)) {
			
		} else if (classifier.equals(XbeecmdPackage.Literals.TX_REQUEST16)) {
			
		} else if (classifier.equals(XbeecmdPackage.Literals.TX_REQUEST64)) {
			
		}
		return null;
	}
	
	public TxRequest16 createTxRequest16() {
		return XbeecmdFactory.eINSTANCE.createTxRequest16();
	}
	
	public TxRequest64 createTxRequest64() {
		return null;
	}
	
	public XBeeAtSndCmd createATRequest() {
		return null;
	}
	
	public RxResponse16 createRxResponse16() {
		return null;
	}
	
	public RxResponse64 createRxResponse64() {
		return null;
	}
	public XBeeAtRcvCmd createATResponse() {
		return null;
	}
	
}
