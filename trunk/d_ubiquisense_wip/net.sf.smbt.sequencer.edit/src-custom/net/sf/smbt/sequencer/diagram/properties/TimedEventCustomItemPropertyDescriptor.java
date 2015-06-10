/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.sequencer.diagram.properties;

import java.util.Collection;

import net.sf.smbt.ezsequence.EzsequencePackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

public class TimedEventCustomItemPropertyDescriptor extends ItemPropertyDescriptor {
	
	public TimedEventCustomItemPropertyDescriptor(AdapterFactory adapterFactory,
			String displayName, String description, EStructuralFeature feature, boolean isSettable) {
		super(adapterFactory, displayName, description, feature, isSettable);
	}

	@Override
	protected Collection<?> getComboBoxObjects(Object object) {
		EObject eObject = (EObject) object;
		if (eObject.eClass().equals(EzsequencePackage.Literals.TIMED_EVENT__COMMAND)) {
			return (Collection<?>) eObject.eGet(EzsequencePackage.Literals.TIMED_EVENT__COMMAND);
		}
		return super.getComboBoxObjects(object);
	}

	@Override
	public Object getPropertyValue(Object object) {
		EObject eObject = (EObject) object;
		if (eObject.eClass().equals(EzsequencePackage.Literals.TIMED_EVENT)) {
			return createPropertyValueWrapper(eObject, eObject.eGet(EzsequencePackage.Literals.TIMED_EVENT__COMMAND));
		}
		return super.getPropertyValue(object);
	}

	@Override
	public void setPropertyValue(Object object, Object value) {
		EObject eObject = (EObject) object;
		if (eObject.eClass().equals(EzsequencePackage.Literals.TIMED_EVENT__COMMAND)) {
			eObject.eSet(EzsequencePackage.Literals.TIMED_EVENT__COMMAND, value);
		}
	}

	@Override
	protected Object createPropertyValueWrapper(Object object, Object propertyValue) {
		return new PropertyValueWrapper(this.adapterFactory, object, propertyValue, null);
	}
	
	@Override
	public String getDisplayName(Object object) {
		return super.getDisplayName(object);
	}
	
	@Override
	public IItemLabelProvider getLabelProvider(Object object) {
		IItemLabelProvider labelProvider = super.getLabelProvider(object);		
		return labelProvider;
	}
	
	@Override
	public String getDescription(Object object) {
		return super.getDescription(object);
	}
}
