/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * GenModelSearchParticipantAreaFactory.java
 * 
 * Contributors: 
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.ui.factories;

import net.sf.smbt.search.touchosc.ui.areas.TouchOSCControlSearchParticipantArea;

import org.eclipse.emf.search.ui.areas.IModelSearchArea;
import org.eclipse.emf.search.ui.areas.IModelSearchAreaFactory;
import org.eclipse.emf.search.ui.pages.AbstractModelSearchPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public final class TouchOSCControlSearchParticipantAreaFactory implements IModelSearchAreaFactory {
	public IModelSearchArea createArea(Composite parent, AbstractModelSearchPage searchPage) {
		return new TouchOSCControlSearchParticipantArea(parent, searchPage, SWT.NONE);
	}
	public IModelSearchArea createArea(Composite parent, AbstractModelSearchPage searchPage, String nsURI) {
		return new TouchOSCControlSearchParticipantArea(parent, searchPage, SWT.NONE);
	}
}
