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

package net.sf.smbt.touchosc.diagram.sheet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.gmf.runtime.emf.ui.properties.sections.UndoableModelPropertySheetEntry;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

public class TouchOscGuiPropertySheetEntry extends
		UndoableModelPropertySheetEntry {

	public TouchOscGuiPropertySheetEntry(IOperationHistory operationHistory) {
		super(operationHistory);
	}

	@Override
	protected List computeMergedPropertyDescriptors() {
		if (values.length == 0)
		     return new ArrayList(0);

		      // get all descriptors from each object
		      Map[] propertyDescriptorMaps = new Map[values.length];
		      for (int i = 0; i < values.length; i++) {
		         Object object = values[i];
		         IPropertySource source = getPropertySource(object);
		         if (source == null) {
		            // if one of the selected items is not a property source
		            // then we show no properties
		            return new ArrayList(0);
		         }
		         // get the property descriptors keyed by id
		         propertyDescriptorMaps[i] = computePropertyDescriptorsFor(source);
		      }

		      // intersect
		      Map intersection = propertyDescriptorMaps[0];
		      for (int i = 1; i < propertyDescriptorMaps.length; i++) {
		         // get the current ids
		         Object[] ids = intersection.keySet().toArray();
		         for (int j = 0; j < ids.length; j++) {
		            Object object = propertyDescriptorMaps[i].get(ids[j]);
		            if (object == null || !((IPropertyDescriptor) intersection.get(ids[j])).isCompatibleWith((IPropertyDescriptor) object)) {
		                intersection.remove(ids[j]);
		            }
		     }
		  }
		  return new ArrayList(intersection.values());
	}
	
	@Override
	protected Map computePropertyDescriptorsFor(IPropertySource source) {
		 IPropertyDescriptor[] descriptors = source.getPropertyDescriptors();
	      
		////////////////////////////////////////////////////////////////////////
		// Use LinkedHashMap instead of HashMap to preserve order
		Map result = new LinkedHashMap();
		////////////////////////////////////////////////////////////////////////
		for (int i = 0; i < descriptors.length; i++)
		{
			result.put(descriptors[i].getId(), descriptors[i]);
		}
		return result;	
	}
}
