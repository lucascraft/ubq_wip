/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
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

package net.sf.smbt.ui.dxxp.controller;

import net.sf.smbt.ezdaap.EZDaapAlbum;
import net.sf.smbt.ezdaap.EZDaapITunesInstance;
import net.sf.smbt.ezdaap.EZDaapLibrary;
import net.sf.smbt.ezdaap.EZDaapPlayList;
import net.sf.smbt.quantic.warp.QuanticMojo;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class DxxpContentProvider implements ITreeContentProvider {
	public DxxpContentProvider() {
	}
	
	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return new Object[0]; //QuanticMojo.INSTANCE.getDxxpResourcesManager().getITunes().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof EZDaapITunesInstance) {
			return ((EZDaapITunesInstance)parentElement).getLibraries().toArray();
		} else if (parentElement instanceof EZDaapLibrary) {
			return ((EZDaapLibrary)parentElement).getElements().toArray();
		} else if (parentElement instanceof EZDaapAlbum) {
			return ((EZDaapAlbum)parentElement).getSongs().toArray();
		} else if (parentElement instanceof EZDaapPlayList) {
			return ((EZDaapPlayList)parentElement).getSongs().toArray();
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
		if (element instanceof EZDaapITunesInstance) {
			return ((EZDaapITunesInstance)element).getLibraries().size()>0;
		} else if (element instanceof EZDaapLibrary) {
			return ((EZDaapLibrary)element).getElements().size()>0;
		} else if (element instanceof EZDaapAlbum) {
			return ((EZDaapAlbum)element).getSongs().size()>0;
		} else if (element instanceof EZDaapPlayList) {
			return ((EZDaapPlayList)element).getSongs().size()>0;
		}
		return false;
	}
}
