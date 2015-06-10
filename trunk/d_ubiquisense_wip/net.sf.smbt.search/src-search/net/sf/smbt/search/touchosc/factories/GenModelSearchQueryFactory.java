/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * GenModelSearchQueryFactory.java
 * 
 * Contributors: 
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.factories;

import net.sf.smbt.search.touchosc.engine.GenModelSearchQuery;

import org.eclipse.emf.search.core.engine.AbstractModelSearchQuery;
import org.eclipse.emf.search.core.factories.IModelSearchQueryFactory;
import org.eclipse.emf.search.core.parameters.IModelSearchQueryParameters;

public class GenModelSearchQueryFactory implements IModelSearchQueryFactory {
	private static GenModelSearchQueryFactory instance;
	public GenModelSearchQueryFactory() {}
	public static GenModelSearchQueryFactory getInstance() {
		return instance == null ? instance = new GenModelSearchQueryFactory() : instance;
	}
	public AbstractModelSearchQuery createModelSearchQuery(String expr, IModelSearchQueryParameters p) {
		return new GenModelSearchQuery(expr, p);
	}

}
