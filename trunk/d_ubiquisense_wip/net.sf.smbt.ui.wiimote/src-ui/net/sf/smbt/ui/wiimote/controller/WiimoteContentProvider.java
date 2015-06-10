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

package net.sf.smbt.ui.wiimote.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd;
import net.sf.smbt.wiimotectrl.WiimoteController;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class WiimoteContentProvider implements ITreeContentProvider {

	List<WiimoteController> wiimote;	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof List) {
			wiimote = (List<WiimoteController>) newInput;
		} else if (newInput instanceof Map) {
			wiimote = (List<WiimoteController>) ((Map)newInput).values();
		}
	}

	@SuppressWarnings({  "rawtypes" })
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List) {
			return ((List)inputElement).toArray();
		} else if (inputElement instanceof Map) {
			return ((Map)inputElement).values().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		List<String> lst = new ArrayList<String>();
		if (parentElement instanceof WiimoteController) {
			if (((WiimoteController)parentElement).getProperties() != null) {
				lst.add("Wii ID                         : " + ((WiimoteController)parentElement).getProperties().getWiiid());
				if (((WiimoteController)parentElement).getProperties().getAccelPRY() != null) {
					lst.add("PRY Accel                      : " + ((WiimoteController)parentElement).getProperties().getAccelPRY().getAccel());
					lst.add("PRY Pitch                      : " + ((WiimoteController)parentElement).getProperties().getAccelPRY().getPitch());
					lst.add("PRY Roll                       : " + ((WiimoteController)parentElement).getProperties().getAccelPRY().getRoll());
					lst.add("PRY Yaw                        : " + ((WiimoteController)parentElement).getProperties().getAccelPRY().getYaw());
				}
				if (((WiimoteController)parentElement).getProperties().getAccelXYZ() != null) {
					lst.add("XYZ X                          : " + ((WiimoteController)parentElement).getProperties().getAccelXYZ().getX());
					lst.add("XYZ Y                          : " + ((WiimoteController)parentElement).getProperties().getAccelXYZ().getY());
					lst.add("XYZ Z                          : " + ((WiimoteController)parentElement).getProperties().getAccelXYZ().getZ());
				}
				if (((WiimoteController)parentElement).getProperties().getAngles() != null) {
					lst.add("Angles Pitch                   : " + ((WiimoteController)parentElement).getProperties().getAngles().getPitch());
					lst.add("Angles Roll                    : " + ((WiimoteController)parentElement).getProperties().getAngles().getRoll());
					lst.add("Angles Yaw                     : " + ((WiimoteController)parentElement).getProperties().getAngles().getYaw());
				}
				if (((WiimoteController)parentElement).getProperties().getIr() != null) {
					lst.add("IR X                           : " + ((WiimoteController)parentElement).getProperties().getIr().getX());
					lst.add("IR Y                           : " + ((WiimoteController)parentElement).getProperties().getIr().getY());
				}
				if (((WiimoteController)parentElement).getProperties().getIrXYSpeed() != null) {
					lst.add("IR Speed Speed                 : " + ((WiimoteController)parentElement).getProperties().getIrXYSpeed().getSpeed());
					lst.add("IR Speed X                     : " + ((WiimoteController)parentElement).getProperties().getIrXYSpeed().getX());
					lst.add("IR Speed Y                     : " + ((WiimoteController)parentElement).getProperties().getIrXYSpeed().getY());
				}
				if (((WiimoteController)parentElement).getProperties().getMotionAngles() != null) {
					lst.add("Motion Angles Pitch            : " + ((WiimoteController)parentElement).getProperties().getMotionAngles().getPitch());
					lst.add("Motion Angles Roll             : " + ((WiimoteController)parentElement).getProperties().getMotionAngles().getRoll());
					lst.add("Motion Angles Yaw              : " + ((WiimoteController)parentElement).getProperties().getMotionAngles().getYaw());
				}
				if (((WiimoteController)parentElement).getProperties().getMotionVelocity() != null) {
					lst.add("Motion Velocity Pitch Velocity : " + ((WiimoteController)parentElement).getProperties().getMotionVelocity().getPitch_velocity());
					lst.add("Motion Velocity Roll Velocity  : " + ((WiimoteController)parentElement).getProperties().getMotionVelocity().getRoll_velocity());
					lst.add("Motion Velocity Yaw Velocity   : " + ((WiimoteController)parentElement).getProperties().getMotionVelocity().getYaw_velocity());
				}
				if (((WiimoteController)parentElement).getProperties().getNunchukAccelPRY() != null) {
					lst.add("Nunchuk Accel PRY Accel        : " + ((WiimoteController)parentElement).getProperties().getNunchukAccelPRY().getAccel());
					lst.add("Nunchuk Accel PRY Pitch        : " + ((WiimoteController)parentElement).getProperties().getNunchukAccelPRY().getPitch());
					lst.add("Nunchuk Accel PRY Roll         : " + ((WiimoteController)parentElement).getProperties().getNunchukAccelPRY().getRoll());
					lst.add("Nunchuk Accel PRY Yaw          : " + ((WiimoteController)parentElement).getProperties().getNunchukAccelPRY().getYaw());
				}
				if (((WiimoteController)parentElement).getProperties().getNunchukAccelXYZ() != null) {
					lst.add("Nunchuk Accel X                : " + ((WiimoteController)parentElement).getProperties().getNunchukAccelXYZ().getX());
					lst.add("Nunchuk Accel Y                : " + ((WiimoteController)parentElement).getProperties().getNunchukAccelXYZ().getY());
					lst.add("Nunchuk Accel Z                : " + ((WiimoteController)parentElement).getProperties().getNunchukAccelXYZ().getZ());
				}
		
				if (((WiimoteController)parentElement).getProperties().getNunchukButtons() != null) {
					for (WiiNunchukButtonCmd nb : ((WiimoteController)parentElement).getProperties().getNunchukButtons()) {
						lst.add("" + nb.eClass().getName() + " " + nb.getKind().getLiteral() + " (" + nb.getToggle() + ")");
					}
				}
				
				if (((WiimoteController)parentElement).getProperties().getNunchukJoystickXY() != null) {
					lst.add("Nunchuk Joy X" + ((WiimoteController)parentElement).getProperties().getNunchukJoystickXY().getX());
					lst.add("Nunchuk Joy Y" + ((WiimoteController)parentElement).getProperties().getNunchukJoystickXY().getY());
				}				
				
				if (((WiimoteController)parentElement).getProperties().getWiiButtons() != null) {
					for (WiiButtonCmd wb : ((WiimoteController)parentElement).getProperties().getWiiButtons()) {
						lst.add("" + wb.eClass().getName() + " " + wb.getKind().getLiteral() + " (" + wb.getToggle() + ")");
					}
				}
				
				for (String val : lst) {
					if (Platform.inDebugMode()) {
						System.out.println(val);
					}
				}
			}
		}
		return lst.toArray();
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
		return true;
	}

	@Override
	public void dispose() {
	}

}
