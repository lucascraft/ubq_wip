/*******************************************************************************
 * Copyright (c) 2008 Lucas Bigeardel and others. All rights reserved. This program
 * and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * GenModelMetaModelParticipantsItemProvider.java
 * 
 * Contributors: 
 * 		Lucas Bigeardel - initial API and implementation
 * 
 ******************************************************************************/

package net.sf.smbt.search.touchosc.ui.providers;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.emf.search.ui.providers.AbstractMetaModelParticipantsItemProvider;


public final class TouchOSCControlMetaModelParticipantsItemProvider extends AbstractMetaModelParticipantsItemProvider {
	public Object[] getElements(Object inputElement) {
		return TouchoscguiPackage.eINSTANCE.getEClassifiers().toArray();
	}
}
