/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * AbstractUML2TextualModelSearchQueryBuilderHelper.java
 * 
 * Contributors:
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.builder;

import java.util.List;

import net.sf.smbt.search.touchosc.evaluators.GenModelTextualModelSearchQueryEvaluator;
import net.sf.smbt.search.touchosc.factories.GenModelSearchQueryFactory;
import net.sf.smbt.search.touchosc.factories.GenModelSearchQueryParametersFactory;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.search.core.engine.IModelSearchQuery;
import org.eclipse.emf.search.core.parameters.IModelSearchQueryParameters;
import org.eclipse.emf.search.core.scope.IModelSearchScope;
import org.eclipse.emf.search.ecore.helper.builder.AbstractEcoreTextualModelSearchQueryBuilderHelper;
import org.eclipse.emf.search.ecore.regex.ModelSearchQueryTextualExpressionEnum;

public abstract class AbstractGenModelTextualModelSearchQueryBuilderHelper 
	extends AbstractEcoreTextualModelSearchQueryBuilderHelper {
	
	protected IModelSearchQueryParameters createParameters(
			IModelSearchScope<Object, Resource> scope,
			List<? extends Object> participants,
			ModelSearchQueryTextualExpressionEnum textualExpression) {
		
		IModelSearchQueryParameters parameters = GenModelSearchQueryParametersFactory.getInstance().createSearchQueryParameters();

		parameters.setEvaluator(new GenModelTextualModelSearchQueryEvaluator<IModelSearchQuery, Object>());
		parameters.setParticipantElements(participants);          
		parameters.setScope(scope);
		
		initTextualQueryParametersFromPatternKind(parameters, textualExpression);

		return parameters;
	}
	
	protected IModelSearchQuery createQuery(String pattern, IModelSearchQueryParameters parameters) {		
		return GenModelSearchQueryFactory.getInstance().createModelSearchQuery(pattern, parameters);
	}
}
