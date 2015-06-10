/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * GenModelTextualModelSearchQueryEvaluator.java
 * 
 * Contributors: 
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.evaluators;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.search.touchosc.l10n.Messages;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.search.core.engine.IModelSearchQuery;
import org.eclipse.emf.search.ecore.engine.EcoreModelSearchQuery;
import org.eclipse.emf.search.ecore.evaluators.EcoreTextualModelSearchQueryEvaluator;
import org.eclipse.emf.search.ecore.regex.ModelSearchQueryTextualExpressionEnum;
import org.eclipse.emf.search.ecore.regex.ModelSearchQueryTextualExpressionMatchingHelper;

public class GenModelTextualModelSearchQueryEvaluator <Q extends IModelSearchQuery, T> extends
EcoreTextualModelSearchQueryEvaluator<Q, T> {
	@Override
	public List<?> eval(Q query, T target, boolean notifiy) {
		List<Object> results = new ArrayList<Object>();
		ModelSearchQueryTextualExpressionEnum kind = ((EcoreModelSearchQuery)query).getKind();
		for (Object o : query.getValidParticipantMetaElements()) {
			if (o instanceof TouchOscControl) {
				String text = query.getQueryExpression();
				text = (text == "" && kind == ModelSearchQueryTextualExpressionEnum.NORMAL_TEXT) ? "*" : text; //$NON-NLS-1$ //$NON-NLS-2$

				EObject elem = ((TouchOscControl)o);
				if (elem instanceof ENamedElement) {
					String elemName = ((ENamedElement)elem).getName();
					elemName = elemName != null ? elemName : ""; //$NON-NLS-1$
					if (ModelSearchQueryTextualExpressionMatchingHelper.getInstance().lookAt(elemName, text, kind)) {
						results.add(query.processSearchResultMatching(target, o, notifiy));				
					}
				}
			}
		}
		return results;
	}	
	@Override
	public String getLabel() {
		return Messages.getString("GenModelTextualModelSearchQueryEvaluator.Label"); //$NON-NLS-1$
	}
}
