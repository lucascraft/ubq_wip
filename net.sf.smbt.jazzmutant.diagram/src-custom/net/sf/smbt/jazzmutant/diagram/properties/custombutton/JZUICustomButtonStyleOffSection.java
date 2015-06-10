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
import net.sf.smbt.jzmui.LEMUR_STYLE;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractEnumerationPropertySection;

public class JZUICustomButtonStyleOffSection extends AbstractEnumerationPropertySection {

	@Override
	protected EStructuralFeature getFeature() {
		return JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__STYLE_OFF;
	}

	@Override
	protected String getLabelText() {
		return "Style Off";
	}
	
	private static String[] choices =  new String[] { 
		LEMUR_STYLE.TEXT.getLiteral(), 
		LEMUR_STYLE.BANG.getLiteral(), 
		LEMUR_STYLE.CIRCLE.getLiteral(), 
		LEMUR_STYLE.CIRCLE_BOLD.getLiteral(), 
		LEMUR_STYLE.DECREASE.getLiteral(), 
		LEMUR_STYLE.DELETE.getLiteral(), 
		LEMUR_STYLE.DOWN.getLiteral(), 
		LEMUR_STYLE.UP.getLiteral(), 
		LEMUR_STYLE.RIGHT.getLiteral(), 
		LEMUR_STYLE.LEFT.getLiteral(), 
		LEMUR_STYLE.BEGINING_CURSOR.getLiteral(), 
		LEMUR_STYLE.NEXT_CURSOR.getLiteral(), 
		LEMUR_STYLE.PREV_CURSOR.getLiteral(), 
		LEMUR_STYLE.END_CURSOR.getLiteral(), 
		LEMUR_STYLE.FWD_CURSOR.getLiteral(), 
		LEMUR_STYLE.RWD_CURSOR.getLiteral(), 
		LEMUR_STYLE.UP_CURSOR.getLiteral(), 
		LEMUR_STYLE.DOWN_CURSOR.getLiteral(), 
		LEMUR_STYLE.EAST_WEST.getLiteral(), 
		LEMUR_STYLE.NORTH_SOUTH.getLiteral(), 
		LEMUR_STYLE.TRI.getLiteral(), 
		LEMUR_STYLE.SIN.getLiteral(), 
		LEMUR_STYLE.SAW_INV.getLiteral(), 
		LEMUR_STYLE.FILL_RECT.getLiteral(), 
		LEMUR_STYLE.REFRESH.getLiteral(), 
		LEMUR_STYLE.RAISE_DOWN.getLiteral(), 
		LEMUR_STYLE.RAISE_UP.getLiteral(), 
		LEMUR_STYLE.QUIT.getLiteral(), 
		LEMUR_STYLE.PLUS.getLiteral(), 
		LEMUR_STYLE.MINUS.getLiteral() 
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
		return getCombo().getSelectionIndex() >= 0 ? LEMUR_STYLE.VALUES.get(getCombo().getSelectionIndex()) : LEMUR_STYLE.NONE;
	}

	@Override
	protected Object getOldFeatureValue() {
		return getEObject() instanceof JZCustomButton ? 
				((JZCustomButton)getEObject()).getStyleOff()
					: "";
	}

}
