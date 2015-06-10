/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.dmx.controller;


import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.model.qxf.Bulb;
import net.sf.smbt.dmx.model.qxf.Capability;
import net.sf.smbt.dmx.model.qxf.Channel;
import net.sf.smbt.dmx.model.qxf.Dimensions;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.model.qxf.Focus;
import net.sf.smbt.dmx.model.qxf.Lens;
import net.sf.smbt.dmx.model.qxf.Mode;
import net.sf.smbt.dmx.model.qxf.Physical;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class DXMFixturesDetailsContentProvider implements ITreeContentProvider {
	private boolean topNodesOnly;
	private FixtureDefinition fixture;
	
	public DXMFixturesDetailsContentProvider() {
		this(false);
	}
	
	public DXMFixturesDetailsContentProvider(boolean topNodesOnly) {
		this.topNodesOnly = topNodesOnly;
	}
	
	@Override
	public void dispose() {}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof FixtureDefinition) {
			fixture = (FixtureDefinition) newInput;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			return ((List)inputElement).toArray();
		}
		return getChildren(fixture);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (topNodesOnly) {
			return new Object[0];
		} else if (parentElement instanceof FixtureDefinition) {
			List<Object> lst = new ArrayList<Object>();
			lst.add(((FixtureDefinition)parentElement).getCreator());
			lst.add(
				"[" + ((FixtureDefinition)parentElement).getManufacturer() + "][" + 
					((FixtureDefinition)parentElement).getType() + "] : " + ((FixtureDefinition)parentElement).getModel() 
			);
			lst.addAll(((FixtureDefinition)parentElement).getMode());
			lst.addAll(((FixtureDefinition)parentElement).getChannel());
			return lst.toArray();
		} else if (parentElement instanceof Channel) {
			List<Object> lst = new ArrayList<Object>();
			lst.add(((Channel)parentElement).getName());
			//lst.add(((Channel)parentElement).getColour());
			//lst.add(((Channel)parentElement).getGroup());
			lst.addAll(((Channel)parentElement).getCapability());
			return lst.toArray();
		} /* else if (parentElement instanceof Group) {
			List<Object> lst = new ArrayList<Object>();
			lst.add(((Group)parentElement).getByte());
			return lst.toArray();
		} */ else if (parentElement instanceof Mode) {
			List<Object> lst = new ArrayList<Object>();
			lst.addAll(((Mode)parentElement).getChannel());
			lst.add(((Mode)parentElement).getPhysical());
			return lst.toArray();
		} else if (parentElement instanceof Capability) {
			List<Object> lst = new ArrayList<Object>();
			lst.add("Min : " + ((Capability)parentElement).getMin());
			lst.add("Max : " + ((Capability)parentElement).getMax());
			return lst.toArray();
		} else if (parentElement instanceof Physical) {
			List<Object> lst = new ArrayList<Object>();
			lst.add(((Physical)parentElement).getBulb());
			lst.add(((Physical)parentElement).getDimensions());
			lst.add(((Physical)parentElement).getFocus());
			return lst.toArray();
		} else if (parentElement instanceof Dimensions) {
			List<Object> lst = new ArrayList<Object>();
			lst.add("Width " + ((Dimensions)parentElement).getWidth());
			lst.add("Height " + ((Dimensions)parentElement).getHeight());
			lst.add("Depth " + ((Dimensions)parentElement).getDepth());
			lst.add("Weight " + ((Dimensions)parentElement).getWeight());
			return lst.toArray();
		} else if (parentElement instanceof Lens) {
			List<Object> lst = new ArrayList<Object>();
			lst.add("Degrees Min : " + ((Lens)parentElement).getDegreesMin());
			lst.add("Degrees Max : " + ((Lens)parentElement).getDegreesMax());
			return lst.toArray();
		} else if (parentElement instanceof Bulb) {
			List<Object> lst = new ArrayList<Object>();
			lst.add("Colour Temp : " + ((Bulb)parentElement).getColourTemperature());
			lst.add("Lumens : " + ((Bulb)parentElement).getLumens());
			lst.add("Type : " + ((Bulb)parentElement).getType());
			return lst.toArray();
		} else if (parentElement instanceof Focus) {
			List<Object> lst = new ArrayList<Object>();
			lst.add("Pan Max : " + ((Focus)parentElement).getPanMax());
			lst.add("Tilt Max : " + ((Focus)parentElement).getTiltMax());
			lst.add("Type : " + ((Focus)parentElement).getType());
			return lst.toArray();
		} else if (parentElement instanceof DMXFixture) {
			return ((DMXFixture)parentElement).getValues().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			if (((EObject)element).eContainer() != null) {
				return ((EObject)element).eContainer();
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}
}
