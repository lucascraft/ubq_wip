/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.touchosc.actions;

import net.sf.smbt.quantic.agent.DnsSdUtil;
import net.sf.smbt.quantic.services.ISmartDnsServiceManager;
import net.sf.smbt.touchosc.utils.TouchOscBonjourSync;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class TouchoscSynchroAction implements IObjectActionDelegate {

	private IWorkbenchPart targetPart;
	private String path;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false
				|| selection.isEmpty()) {
			return;
		}
		IFile file = (IFile) ((IStructuredSelection) selection)
				.getFirstElement();
		path = file.getLocation().toOSString();
		
		
		action.setEnabled(true);
		
	}

	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	public void run(IAction action) {
//		ISmartDnsServiceManager dnsService = DnsSdUtil.INSTANCE.getDnsServicesMap().get(TouchOscBonjourSync.ID);
//		if (dnsService instanceof TouchOscBonjourSync) {
//			TouchOscBonjourSync sync = (TouchOscBonjourSync) dnsService;
//			sync.setCurrentTouchOscFileToSync(path);
//		}
//		MessageDialog.openInformation(getShell(), //Display.getDefault().getActiveShell(), 
//			 	"TouchOSC File Synchronization",
//				"1) Connect TouchOSC app on local (wifi) network.\n\n" +
//				"2) Go To TouchOSC > Layout > Add\n\n" +
//				"3) Select [touchosceditor] service to sync"
//			);
	}
}
