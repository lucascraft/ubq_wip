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

package net.sf.smbt.ui.ableton.controller;

import java.util.List;

import net.sf.smbt.ezabletonctrl.AbletonLive;
import net.sf.smbt.ezabletonctrl.AbstractLiveDevice;
import net.sf.smbt.ezabletonctrl.LiveClip;
import net.sf.smbt.ezabletonctrl.LiveMaster;
import net.sf.smbt.ezabletonctrl.LiveScene;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ezabletonctrl.provider.EzabletonctrlEditPlugin;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.swt.graphics.Image;

public class AbletonLiveLabelProvider extends AdapterFactoryLabelProvider {

	static AbletonLiveLabelProvider INSTANCE;
	
	public AbletonLiveLabelProvider() {
		super(new AbletonLiveCompseableAdapterFactory());
		INSTANCE = this;
	}
	
	@Override
	public Image getColumnImage(Object object, int columnIndex) {
		return super.getColumnImage(object, columnIndex);
	}
	
	@Override
	public String getColumnText(Object object, int columnIndex) {
		if (object instanceof LiveScene) {
			EObject eObj = ((LiveScene)object).eContainer();
			if (eObj instanceof AbletonLive) {
				synchronized (eObj) {
					List<LiveTrack> tracks = ((AbletonLive)eObj).getTracks();
					if (tracks != null && tracks.size()<columnIndex) {
						return "[" + tracks.get(columnIndex).getTrackID() + "] - " + 
							tracks.get(columnIndex).getTrackName();
					}
				}
			}
		}
		return super.getColumnText(object, columnIndex);
	}
	
	public org.eclipse.swt.graphics.Image getImage(Object object) {
		if (object instanceof LiveMaster) {
			return ExtendedImageRegistry.INSTANCE.getImage(
				EzabletonctrlEditPlugin.INSTANCE.getImage("LiveMaster.png")
			);
		} else if (object instanceof LiveScene) {
			return ExtendedImageRegistry.INSTANCE.getImage(
				EzabletonctrlEditPlugin.INSTANCE.getImage("LiveScene.png")
			);
		} else if (object instanceof LiveTrack) {
			return ExtendedImageRegistry.INSTANCE.getImage(
				EzabletonctrlEditPlugin.INSTANCE.getImage("LiveTrack.png")
			);
		}  else if (object instanceof LiveClip) {
			return ExtendedImageRegistry.INSTANCE.getImage(
				EzabletonctrlEditPlugin.INSTANCE.getImage("LiveClip.png")
			);
		}
		return INSTANCE.getImage(object);
	};
	public String getText(Object object) {
		if (object instanceof LiveMaster) {
			return ((LiveMaster)object).getTrackName();
		} else if (object instanceof LiveScene) {
			return "[" + ((LiveScene)object).getSceneID() + "] - " + ((LiveScene)object).getSceneName();
		} else if (object instanceof LiveTrack) {
			return "[" + ((LiveTrack)object).getTrackID() + "] - " + ((LiveTrack)object).getTrackName();
		}  else if (object instanceof LiveClip) {
			return  "[" + ((LiveClip)object).getClipID() + "] - " + ((LiveClip)object).getClipName();
		}  else if (object instanceof AbstractLiveDevice) {
			return  "[" + ((AbstractLiveDevice)object).getDeviceID() + "] - " + ((AbstractLiveDevice)object).getDeviceName();
		} 
		return INSTANCE.getText(object);
	};

}
