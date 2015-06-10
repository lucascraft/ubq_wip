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

package net.sf.smbt.ui.touchosc.gui.views;

import net.sf.smbt.ui.touchosc.actions.ImportTouchOscConfigAction;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class TouchOscView extends ViewPart {
	private ImportTouchOscConfigAction openTouchOscTemplateAction; 
	
	//
	// Rx/Tx command queue
	//
	@SuppressWarnings("unused")
	private CmdPipe ezMojoAgentEngine;


	
	@Override
	public void setFocus() {
		
	}

	@Override
	public void createPartControl(Composite parent) {
		createControlUI();
		makeActions();
		contributeToActionBars();
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(openTouchOscTemplateAction);
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(openTouchOscTemplateAction);
	}

	private void makeActions() {
		openTouchOscTemplateAction  = new ImportTouchOscConfigAction();
	}
	
	private void createControlUI() {
		
	}
}
