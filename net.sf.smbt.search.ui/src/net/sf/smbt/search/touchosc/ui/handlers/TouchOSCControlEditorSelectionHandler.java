/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * GenModelEditorSelectionHandler.java
 * 
 * Contributors: 
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.ui.handlers;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.search.ui.handlers.AbstractModelElementEditorSelectionHandler;
import org.eclipse.ui.IEditorPart;

public class TouchOSCControlEditorSelectionHandler extends AbstractModelElementEditorSelectionHandler {

	public boolean isCompatibleModelElementEditorSelectionHandler(IEditorPart part) {
		return false; //part instanceof TouchoscguiEditor;
	}

	public IStatus handleOpenTreeEditorWithSelection(IEditorPart part,
			Object selection) {
		//if (part instanceof TouchoscguiEditor) {
		//	((TouchoscguiE)part).setSelectionToViewer(Arrays.asList(new Object[]{selection}));
		//	return Status.OK_STATUS;
		//}
		return Status.CANCEL_STATUS;
	}

	@Override
	protected String getNsURI() {
		return TouchoscguiPackage.eNS_URI;
	}
}