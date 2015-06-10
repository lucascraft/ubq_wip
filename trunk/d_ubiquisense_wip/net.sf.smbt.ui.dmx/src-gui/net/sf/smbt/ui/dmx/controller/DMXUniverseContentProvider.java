/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.model.qxf.Bulb;
import net.sf.smbt.dmx.model.qxf.Capability;
import net.sf.smbt.dmx.model.qxf.Channel;
import net.sf.smbt.dmx.model.qxf.Dimensions;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.model.qxf.Focus;
import net.sf.smbt.dmx.model.qxf.Group;
import net.sf.smbt.dmx.model.qxf.Lens;
import net.sf.smbt.dmx.model.qxf.Mode;
import net.sf.smbt.dmx.model.qxf.Physical;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class DMXUniverseContentProvider implements ITreeContentProvider {
	private DMXLibrary dmxLib;
	private Map<PlaceHolder, List<FixtureDefinition>> fixturesByMAnufacturerMap;
	
	class PlaceHolder implements Comparable<PlaceHolder> {
		public String k; 
		public PlaceHolder(String key) {
			k = key;
		}
		@Override
		public int compareTo(PlaceHolder ph) {
			return k.compareTo(ph.k);
		}
		@Override
		public String toString() {
			return k;
		}
	}
	
	public DMXUniverseContentProvider() {
		fixturesByMAnufacturerMap = new TreeMap<PlaceHolder, List<FixtureDefinition>>(new Comparator<PlaceHolder>() {
			@Override
			public int compare(PlaceHolder o1, PlaceHolder o2) {
				return o1.compareTo(o2);
			}
		});
	}
	
	@Override
	public void dispose() {}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof DMXLibrary) {
			dmxLib = (DMXLibrary) newInput;
			
			fixturesByMAnufacturerMap.clear();
			
			for (FixtureDefinition f : dmxLib.getFixtures()) {
				PlaceHolder ph = new PlaceHolder(f.getManufacturer());
				if (!fixturesByMAnufacturerMap.containsKey(ph)) {
					fixturesByMAnufacturerMap.put(ph, new ArrayList<FixtureDefinition>());
				}
				List<FixtureDefinition> lst = fixturesByMAnufacturerMap.get(ph);
				if (!lst.contains(f)) {
					lst.add(f);
				}
			}
		} else if (newInput instanceof List) {
			
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return fixturesByMAnufacturerMap.keySet().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof PlaceHolder){
			if (fixturesByMAnufacturerMap.containsKey((PlaceHolder)parentElement)) {
				return fixturesByMAnufacturerMap.get((PlaceHolder)parentElement).toArray();
			}
		} else if (parentElement instanceof FixtureDefinition) {
			List<Object> lst = new ArrayList<Object>();
			lst.add(((FixtureDefinition)parentElement).getCreator());
			lst.add(((FixtureDefinition)parentElement).getManufacturer());
			lst.add(((FixtureDefinition)parentElement).getType());
			lst.add(((FixtureDefinition)parentElement).getModel());
			lst.add(((FixtureDefinition)parentElement).getMode());
			lst.addAll(((FixtureDefinition)parentElement).getChannel());
			return lst.toArray();
		} else if (parentElement instanceof Channel) {
			List<Object> lst = new ArrayList<Object>();
			lst.add(((Channel)parentElement).getName() + " [" + ((Channel)parentElement).getGroup().getValue() + "]");
			lst.addAll(((Channel)parentElement).getCapability());
			return lst.toArray();
		} else if (parentElement instanceof Group) {
			List<Object> lst = new ArrayList<Object>();
			lst.add(((Group)parentElement).getByte() + " : " + ((Group)parentElement).getValue());
			return lst.toArray();
		} else if (parentElement instanceof Mode) {
			List<Object> lst = new ArrayList<Object>();
			lst.addAll(((Mode)parentElement).getChannel());
			lst.add(((Mode)parentElement).getPhysical());
			return lst.toArray();
		} else if (parentElement instanceof Capability) {
			List<Object> lst = new ArrayList<Object>();
			lst.add("Name : " + ((Capability)parentElement).getValue());
			lst.add("Min : " + ((Capability)parentElement).getMin());
			lst.add("Max : " + ((Capability)parentElement).getMax());
			return lst.toArray();
		} else if (parentElement instanceof Physical) {
			List<Object> lst = new ArrayList<Object>();
			lst.add("Bulb " + ((Physical)parentElement).getBulb());
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
