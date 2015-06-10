package net.sf.smbt.ui.mppt.editors;
/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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


import net.sf.smbt.ui.mppt.Activator;
import net.sf.smbt.ui.mppt.actions.MpptImportGpxAction;
import net.sf.smbt.ui.mppt.actions.MpptImportKmlAction;
import net.sf.smbt.ui.mppt.actions.CreateMpptFeedAction;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.EditorActionBarContributor;


public class MpptActionBarContributor extends EditorActionBarContributor {
	private CreateMpptFeedAction	createCosmFeedAction;
	private MpptImportGpxAction 	importGpxAction;
	private MpptImportKmlAction 	importKmlAction;
	private MpptEditor 				cosmEditor;
	
	public MpptEditor getCosmEditor() {
		return cosmEditor;
	}

	public MpptActionBarContributor() {
		importKmlAction = new MpptImportKmlAction(MpptImportGpxAction.ID, "Import KML") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				FileDialog dlg = new FileDialog(Display.getDefault().getActiveShell());
				String file = dlg.open();
				if (file != null) {
/*					String kmlString = KmlUtils.INSTANCE.loadKmlAsString(file);
					if (cosmEditor != null) {
						cosmEditor.getGoogleMap().addKmlFromString(kmlString);
					}
*/					
				}
			}
		};	
		importKmlAction.setText("Import KML");
		importKmlAction.setToolTipText("Import KML");
		importKmlAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/cosm-kml.png"
			)
		);
		
		importGpxAction = new MpptImportGpxAction(MpptImportGpxAction.ID, "Import GPX") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
/*				if (file != null) 
				FileDialog dlg = new FileDialog(Display.getDefault().getActiveShell());
				String file = dlg.open();
				{
 					String gpxString = Gpx1Utils.INSTANCE.loadGPXAsPureXML(file);
 
					if (cosmEditor != null) {
						cosmEditor.getGoogleMap().addGpxFromString(gpxString);
					}
				}
 */					
			}
		};	
		importGpxAction.setText("Import GPX");
		importGpxAction.setToolTipText("Import GPX");
		importGpxAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/cosm-gpx.png"
			)
		);
		
		createCosmFeedAction = new CreateMpptFeedAction(CreateMpptFeedAction.ID, "Create Cosm Feed") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
			}
		};	
		createCosmFeedAction.setText("Create Cosm Feed");
		createCosmFeedAction.setToolTipText("Create Cosm Feed");
		createCosmFeedAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/cosm-feed.png"
			)
		);
	}
	
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator());
		toolBarManager.add(importKmlAction);
		toolBarManager.add(importGpxAction);
		toolBarManager.add(createCosmFeedAction);
	}
	
	public void setActiveEditor(IEditorPart part) {
	    IActionBars actionBars = getActionBars();
	    if (actionBars != null && part instanceof MpptEditor) {
	    	cosmEditor = (MpptEditor) part;
	        
	    	// GPX
	    	actionBars.setGlobalActionHandler(MpptImportGpxAction.ID, 	importGpxAction);
	        importGpxAction.setEnabled(true);
	        
	        // KML
	        actionBars.setGlobalActionHandler(MpptImportKmlAction.ID, 	importKmlAction);
	        importKmlAction.setEnabled(true);
	        
	        // Feed
	        actionBars.setGlobalActionHandler(CreateMpptFeedAction.ID, 	createCosmFeedAction);
	        createCosmFeedAction.setEnabled(true);
	    }
	}
	
	public void contributeToMenu(IMenuManager manager) {
		IMenuManager menu = new MenuManager("Cosm");
		manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menu.add(importGpxAction);
		menu.add(importKmlAction);
		menu.add(createCosmFeedAction);
	}
}
