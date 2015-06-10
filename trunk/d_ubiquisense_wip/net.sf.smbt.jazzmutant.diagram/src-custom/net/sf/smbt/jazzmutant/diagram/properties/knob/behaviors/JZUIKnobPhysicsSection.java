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

package net.sf.smbt.jazzmutant.diagram.properties.knob.behaviors;

import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KNOB_PHYSICS;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractEnumerationPropertySection;

public class JZUIKnobPhysicsSection extends AbstractEnumerationPropertySection {

	@Override
	protected EStructuralFeature getFeature() {
		return JzmuiPackage.Literals.JZ_KNOB__PHYSICS;
	}

	@Override
	protected String getLabelText() {
		return "Physics";
	}
	
	private static String[] choices =  new String[] { 
		KNOB_PHYSICS.NONE.getLiteral(), 
		KNOB_PHYSICS.INTERPOLATE.getLiteral(), 
		KNOB_PHYSICS.MASS_SPRING.getLiteral()
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
		return getCombo().getSelectionIndex() >= 0 ? KNOB_PHYSICS.VALUES.get(getCombo().getSelectionIndex()) : KNOB_PHYSICS.NONE;
	}

	@Override
	protected Object getOldFeatureValue() {
		return getEObject() instanceof JZKnob ? 
				((JZKnob)getEObject()).getControlMode()
					: "";
	}

}
