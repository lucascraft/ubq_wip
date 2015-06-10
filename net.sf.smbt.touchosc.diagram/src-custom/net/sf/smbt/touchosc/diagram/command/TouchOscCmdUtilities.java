/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.touchosc.diagram.command;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

public class TouchOscCmdUtilities {
	
	public final static TouchOscCmdUtilities INSTANCE = new TouchOscCmdUtilities();
	
	public Command createTouchOscGuiBoundsSetCommand(ShapeEditPart p) {
		
		EObject eObj = p.getNotationView().getElement();

		Point nodeLocation = p.getLocation();
		Dimension nodeSize = p.getSize();

		SetRequest reqX = new SetRequest(
				TransactionUtil.getEditingDomain(eObj), eObj,
				TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__X,
				new Integer(nodeLocation.x));
		SetRequest reqY = new SetRequest(
				TransactionUtil.getEditingDomain(eObj), eObj,
				TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__Y,
				new Integer(nodeLocation.y));
		SetRequest reqW = new SetRequest(
				TransactionUtil.getEditingDomain(eObj), eObj,
				TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__W,
				new Integer(nodeSize.width));
		SetRequest reqH = new SetRequest(
				TransactionUtil.getEditingDomain(eObj), eObj,
				TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__H,
				new Integer(nodeSize.height));

		CompoundCommand cc = new CompoundCommand();

		cc.add(new ICommandProxy(new SetValueCommand(reqX)));
		cc.add(new ICommandProxy(new SetValueCommand(reqY)));
		cc.add(new ICommandProxy(new SetValueCommand(reqW)));
		cc.add(new ICommandProxy(new SetValueCommand(reqH)));

		return cc;

	}

}
