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

package net.sf.smbt.jazzmutant.diagram.outline;

import net.sf.smbt.jzmui.diagram.part.JzmuiDiagramEditorPlugin;

import org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage;
import org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractModelNavigator;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.IPageSite;

public class JZUIOutlinePage extends AbstractDiagramsOutlinePage {

	/**
	 * Constructor
	 * 
	 * @param editor
	 *            the Editor
	 */
	public JZUIOutlinePage(DiagramEditor editor) {
		super(editor);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage#createNavigator(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.part.IPageSite)
	 */
	@Override
	protected AbstractModelNavigator createNavigator(Composite parent, IPageSite pageSite) {
		return new JZUIModelNavigator(parent, getEditor(), pageSite);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage#getPreferenceStore()
	 */
	@Override
	protected IPreferenceStore getPreferenceStore() {
		return JzmuiDiagramEditorPlugin.getInstance().getPreferenceStore();
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage#getEditorID()
	 */
	@Override
	protected String getEditorID() {
		return "net.sf.smbt.jzmui.diagram.part.JzmuiDiagramEditorID"; //$NON-NLS-1$
	}

	/**
	 * Open the new diagram in the same editor
	 */
	@Override
	protected void handleDoubleClickEvent() {
		IStructuredSelection selection = (IStructuredSelection) getSelection();
		Object selectedObject = selection.getFirstElement();
		if (selectedObject != null && selectedObject instanceof Diagram && getEditor().getDiagram() != selectedObject
				&& getEditor().getDiagram().eResource().equals(((Diagram) selectedObject).eResource())) {
			//((JzmuiDiagramEditor) getEditor()).setDiagram((Diagram) selectedObject);
		}
	}

}
