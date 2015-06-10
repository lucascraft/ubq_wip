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


import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.ezabletonctrl.AbletonLive;
import net.sf.smbt.ezabletonctrl.EzabletonctrlFactory;
import net.sf.smbt.ezabletonctrl.LiveScene;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class AbletonLiveDetailsContentProvider implements ITreeContentProvider {
	@SuppressWarnings("unused")
	private AbletonLive liveApp;
	
	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof AbletonLive) {
			liveApp = newInput == null ? null : (AbletonLive) newInput;
		} 
	}
	
	@SuppressWarnings("unused")
	private LiveScene createDummyStopScene() {
		LiveScene sc = EzabletonctrlFactory.eINSTANCE.createLiveScene();
		sc.setSceneID(-1);
		sc.setSceneName("");
		sc.setMode("");
		sc.setLastSeen(-1l);
		
		
		
		return sc;
	}
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof AbletonLive) {
			AbletonLive _liveApp = (AbletonLive) inputElement;
			List<Object> lst = new ArrayList<Object>();
			lst.addAll(_liveApp.getScenes());
			//lst.add(createDummyStopScene() );
			return lst.toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		/*if (parentElement instanceof LiveMaster) {
			return liveApp.getScenes().toArray();
		} else if (parentElement instanceof LiveTrack) {
			List<Object> lst = new ArrayList<Object>();
			lst.addAll(((LiveTrack)parentElement).getClips());
			lst.addAll(((LiveTrack)parentElement).getDevices());
			return lst.toArray();
		}*/
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
		return false;
	}
}
