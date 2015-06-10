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

package net.sf.smbt.jazzmutant.diagram.properties.text;

import net.sf.smbt.jzmui.FONT_SIZE;
import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.jzmui.JzmuiPackage;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractEnumerationPropertySection;

public class JZUITextFontSizeSection extends AbstractEnumerationPropertySection {

	@Override
	protected EStructuralFeature getFeature() {
		return JzmuiPackage.Literals.JZ_TEXT__FONT_SIZE;
	}

	@Override
	protected String getLabelText() {
		return "Font Size";
	}
	
	private static String[] choices =  new String[] { 
		FONT_SIZE.FONT_8PT.getLiteral(), 
		FONT_SIZE.FONT_9PT.getLiteral(), 
		FONT_SIZE.FONT_10_PT.getLiteral(), 
		FONT_SIZE.FONT_11_PT.getLiteral(), 
		FONT_SIZE.FONT_12_PT.getLiteral(), 
		FONT_SIZE.FONT_12_PT.getLiteral(), 
		FONT_SIZE.FONT_14_PT.getLiteral(), 
		FONT_SIZE.FONT_15_PT.getLiteral(), 
		FONT_SIZE.FONT_16_PT.getLiteral(), 
		FONT_SIZE.FONT_17_PT.getLiteral(), 
		FONT_SIZE.FONT_18_PT.getLiteral(), 
		FONT_SIZE.FONT_19_PT.getLiteral(), 
		FONT_SIZE.FONT_20_PT.getLiteral(), 
		FONT_SIZE.FONT_21_PT.getLiteral(), 
		FONT_SIZE.FONT_22_PT.getLiteral(), 
		FONT_SIZE.FONT_23_PT.getLiteral(), 
		FONT_SIZE.FONT_24_PT.getLiteral() 
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
		return getCombo().getSelectionIndex() >= 0 ? FONT_SIZE.VALUES.get(getCombo().getSelectionIndex()) : FONT_SIZE.NONE;
	}

	@Override
	protected Object getOldFeatureValue() {
		return getEObject() instanceof JZText ? 
				((JZText)getEObject()).getFontSize()
					: "";
	}

}
