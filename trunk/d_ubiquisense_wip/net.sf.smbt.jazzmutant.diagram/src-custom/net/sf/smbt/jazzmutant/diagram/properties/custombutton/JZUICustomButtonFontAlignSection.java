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

package net.sf.smbt.jazzmutant.diagram.properties.custombutton;

import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.TEXT_ALIGN;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractEnumerationPropertySection;

public class JZUICustomButtonFontAlignSection extends AbstractEnumerationPropertySection {

	@Override
	protected EStructuralFeature getFeature() {
		return JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__TEXT_ALIGN;
	}

	@Override
	protected String getLabelText() {
		return "Align";
	}
	
	private static String[] choices =  new String[] { 
		TEXT_ALIGN.E.getLiteral(), 
		TEXT_ALIGN.S.getLiteral(), 
		TEXT_ALIGN.W.getLiteral(), 
		TEXT_ALIGN.N.getLiteral(), 
		TEXT_ALIGN.NE.getLiteral(), 
		TEXT_ALIGN.NW.getLiteral(), 
		TEXT_ALIGN.SE.getLiteral(), 
		TEXT_ALIGN.SW.getLiteral(), 
		TEXT_ALIGN.CENTER.getLiteral() 
	};
	

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
		return getCombo().getSelectionIndex() >= 0 ? TEXT_ALIGN.VALUES.get(getCombo().getSelectionIndex()) : TEXT_ALIGN.NONE;
	}

	@Override
	protected Object getOldFeatureValue() {
		return getEObject() instanceof JZCustomButton ? 
				((JZCustomButton)getEObject()).getTextAlign()
					: "";
	}

}
