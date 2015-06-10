/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.sequencer.groovix;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.part.EditorActionBarContributor;


public class GroovixActionBarContributor extends EditorActionBarContributor {

	public GroovixActionBarContributor() {
	}
	
	
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		super.contributeToToolBar(toolBarManager);
	}
	
	   public void setActiveEditor(IEditorPart part) {
	        IActionBars actionBars = getActionBars();
	        if (actionBars != null && part instanceof GroovixEditor4) {
/*
	        	AddCircleAction aca = ((GroovixEditor) part).getAddCircleAction();
	        	AddPathAction 	apa = ((GroovixEditor) part).getAddPathAction();
	        	
	            actionBars.setGlobalActionHandler(AddCircleAction.ID, 	aca);
	            actionBars.setGlobalActionHandler(AddPathAction.ID,		apa);
	            
	            aca.setEnabled(true);
	            apa.setEnabled(true);
*/
	        }
	    }
}
