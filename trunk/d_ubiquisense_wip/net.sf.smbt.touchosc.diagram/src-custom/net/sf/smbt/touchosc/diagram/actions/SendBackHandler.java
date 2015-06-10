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

package net.sf.smbt.touchosc.diagram.actions;

import java.util.List;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditor;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;


public class SendBackHandler extends AbstractHandler {
	public Object execute(ExecutionEvent event) throws ExecutionException {
		TouchoscguiDiagramEditor diagramEditor = (TouchoscguiDiagramEditor)HandlerUtil.getActiveEditorChecked(event);
		ISelection selection= diagramEditor.getEditorSite().getSelectionProvider().getSelection();
	
		if (selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection)selection).getFirstElement();
			if (obj instanceof GraphicalEditPart) {
				List<IFigure> eps = ((GraphicalEditPart)obj).getFigure().getParent().getChildren();
				IFigure fig = ((GraphicalEditPart)obj).getFigure();
				eps.remove(fig);
				eps.add(0, fig);
				((GraphicalEditPart)obj).getFigure().getParent().repaint();
			}
		}
		return null;
	}
}

