/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * UML2ModelSearchQueryLauncherHelper.java
 * 
 * Contributors:
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.launcher;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.search.core.engine.IModelSearchQuery;
import org.eclipse.emf.search.core.results.IModelSearchResult;
import org.eclipse.emf.search.core.scope.IModelSearchScope;
import org.eclipse.emf.search.ecore.helper.launcher.EcoreModelSearchQueryLauncherHelper;
import org.eclipse.emf.search.ecore.regex.ModelSearchQueryTextualExpressionEnum;

public class GenModelModelSearchQueryLauncherHelper extends EcoreModelSearchQueryLauncherHelper {

	//
	// NORMAL TEXT
	//
	public IModelSearchResult launchGlobalTextualModelSearchQuery(String pattern, IModelSearchScope<Object, Resource> scope, String nsURI) {
		IModelSearchQuery q = buildTextualModelSearchQuery(pattern, TouchoscguiPackage.eINSTANCE.getEClassifiers(), ModelSearchQueryTextualExpressionEnum.NORMAL_TEXT, scope, TouchoscguiPackage.eNS_URI);
		q.run(new NullProgressMonitor());
		return q.getModelSearchResult();
	}

	//
	// REGEX
	//
	public IModelSearchResult launchGlobalRegexModelSearchQuery(String pattern, IModelSearchScope<Object, Resource> scope) {
		IModelSearchQuery q = buildTextualModelSearchQuery(pattern, TouchoscguiPackage.eINSTANCE.getEClassifiers(), ModelSearchQueryTextualExpressionEnum.REGULAR_EXPRESSION, scope, TouchoscguiPackage.eNS_URI);
		q.run(new NullProgressMonitor());
		return q.getModelSearchResult();
	}
	
	//
	// CASE SENSITIVE
	//
	public IModelSearchResult launchGlobalCaseSensitiveModelSearchQuery(String pattern, IModelSearchScope<Object, Resource> scope) {
		IModelSearchQuery q = buildTextualModelSearchQuery(pattern, TouchoscguiPackage.eINSTANCE.getEClassifiers(), ModelSearchQueryTextualExpressionEnum.CASE_SENSITIVE, scope, TouchoscguiPackage.eNS_URI);
		q.run(new NullProgressMonitor());
		return q.getModelSearchResult();
	}
}
