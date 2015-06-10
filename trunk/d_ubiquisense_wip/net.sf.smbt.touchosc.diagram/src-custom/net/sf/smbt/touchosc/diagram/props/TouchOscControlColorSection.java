
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

package net.sf.smbt.touchosc.diagram.props;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractEnumerationPropertySection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class TouchOscControlColorSection extends AbstractEnumerationPropertySection {

	private static String[] choices =  new String[]{
		"red",
		"green",
		"blue",
		"gray",
		"yellow",
		"purple",
		"orange"
	};
	
	@Override
	protected EStructuralFeature getFeature() {
		return TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__FG;
	}
	
	@Override
	protected String getLabelText() {
		return "Color";
	}
	
	@Override
	protected void handleModelChanged(Notification msg) {
		super.handleModelChanged(msg);
		getCombo().setText(((TouchOscControl)getEObject()).getFg());
	}

	@Override
	public void refresh() {
		super.refresh();
		getCombo().setText(((TouchOscControl)getEObject()).getFg());
	}
	@Override
	protected void handleComboModified() {
		super.handleComboModified();
		getCombo().setText(getCombo().getSelectionIndex() >= 0 ? choices[getCombo().getSelectionIndex()] : "");
	}
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
			getCombo().setText(((TouchOscControl)getEObject()).getFg());
	}
	@Override
	protected String[] getEnumerationFeatureValues() {
		return choices;
	}

	@Override
	protected String getFeatureAsText() {
		return getCombo().getSelectionIndex() >= 0 ? choices[getCombo().getSelectionIndex()] : "";
	}

	@Override
	protected Object getFeatureValue(int index) {
		return getCombo().getSelectionIndex() >= 0 ? choices[getCombo().getSelectionIndex()] : "";
	}

	@Override
	protected Object getOldFeatureValue() {
		Object obj = getEObject() instanceof TouchOscControl ? 
			((TouchOscControl)getEObject()).getFg()
				: "";
		return obj == null ? choices[0] : obj;
	}
}
