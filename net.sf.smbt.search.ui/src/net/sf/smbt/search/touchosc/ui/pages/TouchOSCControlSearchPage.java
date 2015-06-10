/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * GenModelSearchPage.java
 * 
 * Contributors: 
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.ui.pages;

import net.sf.smbt.search.touchosc.provisional.GenModelRegexReplaceTransformation;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.search.core.engine.IModelSearchQuery;
import org.eclipse.emf.search.core.internal.replace.provisional.ITransformation;
import org.eclipse.emf.search.core.results.IModelResultEntry;
import org.eclipse.emf.search.ui.pages.AbstractModelSearchPage;

public class TouchOSCControlSearchPage extends AbstractModelSearchPage {
	@Override
	public String getModelSearchPageID() {
		return "net.sf.smbt.search.touchosc.ui.pages.GenModelSearchPage"; //$NON-NLS-1$
	}
	public String getOccurenceLabel(IModelResultEntry entry) {
		Object obejct = entry.getSource();
		if (obejct instanceof TouchOscControl) {
			EObject elem = ((TouchOscControl)obejct);
			if (elem instanceof ENamedElement) {
				((ENamedElement)elem).getName(); 
			}
		}
		return "ERROR"; //$NON-NLS-1$
	}
	@Override
	public ITransformation<EObject, IModelSearchQuery, String, String> getTransformation(
			EObject element, IModelSearchQuery query, String value) {
		return new GenModelRegexReplaceTransformation((TouchOscControl)element, query,  value);
	}
}
