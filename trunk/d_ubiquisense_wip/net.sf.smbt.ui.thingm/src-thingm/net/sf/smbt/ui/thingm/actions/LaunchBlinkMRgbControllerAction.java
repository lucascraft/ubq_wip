/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.thingm.actions;

import net.sf.smbt.ui.thingm.RGBStepControlUI;
import net.sf.smbt.ui.thingm.ThingMCtrlView;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class LaunchBlinkMRgbControllerAction implements IWorkbenchWindowActionDelegate {
	private IFile netconfFile;
	
	/**
	 * The constructor.
	 */
	public LaunchBlinkMRgbControllerAction() {
	}

	public void run(final IAction action) {
		action.setEnabled(false);
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					ThingMCtrlView wiimoteView = (ThingMCtrlView) page.showView(ThingMCtrlView.ID);
					wiimoteView.initControl(netconfFile, RGBStepControlUI.getRbgStuff());
				} catch (PartInitException e) {
				} finally {
					action.setEnabled(true);
				}
			}
		});
	}

	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection) selection).getFirstElement();
			if (obj instanceof IFile) {
				if (((IFile)obj).getFileExtension().contains("netconf")) {
					netconfFile = (IFile) obj;
					action.setEnabled(true);
				}
			}
		}
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
	}
}