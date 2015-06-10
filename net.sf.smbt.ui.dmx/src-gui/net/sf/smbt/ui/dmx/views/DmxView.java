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

package net.sf.smbt.ui.dmx.views;

import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.utils.DMXUtils;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.dmx.controller.DMXUniverseContentProvider;
import net.sf.smbt.ui.dmx.controller.OpenDMXCompseableAdapterFactory;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.ViewPart;

public class DmxView extends ViewPart {

	private Action connectOpenDMXAction, 
					disconnectArduinoAction, 
					refreshArduinoAction, 
					editArduinoConfigurationAction//, 
					//deployFirmataAction, 
					//doubleClickAction
					;
	
	private DMXLibrary dmxLib;

	private TabFolder tabFolder;
	
	//private Map<String, DMXUniverseCtrl> arduinos;
	//private Map<String, ArduinoBoardControllerTab> pane;
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.smbt.ui.dmx.DmxView";

	public DmxView() {
		dmxLib = DMXUtils.INSTANCE.initDMX();
	}
	
	public void createPartControl(Composite parent) {
		parent.setBackground(GUIToolkit.BG);
		//arduinos = new HashMap<String, DMXUniverseCtrl>();
		//pane = new HashMap<String, ArduinoBoardControllerTab>();
		
		tabFolder = new TabFolder(parent, SWT.BOTTOM);
		tabFolder.setLayout(GridLayoutFactory.fillDefaults().create());
		tabFolder.setLayoutData(GridDataFactory.fillDefaults().create());

		tabFolder.setBackground(GUIToolkit.BG);
		
		TabItem fixturesTab = GUIToolkit.INSTANCE.createTabItem(tabFolder, SWT.NONE);
		
		FilteredTree fixtureFilteredTree = GUIToolkit.INSTANCE.createFilteredTree(tabFolder, SWT.NONE, new PatternFilter(), true);
		
		fixtureFilteredTree.getViewer().getControl().setLayoutData(
			GridDataFactory.fillDefaults().grab(true, true).create()
		);
		
		fixtureFilteredTree.getViewer().setContentProvider(new DMXUniverseContentProvider());
		fixtureFilteredTree.getViewer().setLabelProvider(new AdapterFactoryLabelProvider(
			new OpenDMXCompseableAdapterFactory()
		));
		
		fixturesTab.setText("Fixtures");
		fixturesTab.setImage(
			Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/library_occupied.png").createImage()
		);
		
		fixtureFilteredTree.getViewer().setInput(dmxLib);
		
		fixturesTab.setControl(fixtureFilteredTree);

//		TextCellEditor cellEditor= new TextCellEditor(viewer.getControl().getParent(), SWT.NONE);
//		{
/*
		    protected void doSetFocus() {
		        if (text != null) {
		            text.setFocus();
		            text.setSelection(text.getText().length());
		            checkSelection();
		            checkDeleteable();
		            checkSelectable();
		        }
		    }
*/
//		};
		
/*		
        Text cellEditorText= cellEditor.getText();
		cellEditor.setContentAssistant(contentAssistant);
*/
		
/*		viewer.setCellEditors(new CellEditor[] { cellEditor });
		viewer.setCellModifier(new ICellModifier() {
			public void modify(Object element, String property, Object value) {
				if (element instanceof Item)
					element = ((Item) element).getData();

//				((InterfaceWrapper) element).interfaceName= (String) value;
//				fSuperInterfacesDialogField.elementChanged(element);
			}
			public Object getValue(Object element, String property) {
				return null; //((InterfaceWrapper) element).interfaceName;
			}
			public boolean canModify(Object element, String property) {
				return true;
			}
		});
*/		
		
		//viewer.setInput(getViewSite());
		
		makeActions();
		contributeToActionBars();
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(connectOpenDMXAction);
		manager.add(disconnectArduinoAction);
		manager.add(refreshArduinoAction);
		manager.add(new Separator());
		manager.add(editArduinoConfigurationAction);
	}

	/*
	private void fillContextMenu(IMenuManager manager) {
		manager.add(connectArduinoAction);
		manager.add(disconnectArduinoAction);
		manager.add(refreshArduinoAction);
		manager.add(new Separator());
		manager.add(editArduinoConfigurationAction);
		//drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	*/
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(connectOpenDMXAction);
		manager.add(disconnectArduinoAction);
		manager.add(refreshArduinoAction);
		manager.add(new Separator());
		manager.add(editArduinoConfigurationAction);
		//drillDownAdapter.addNavigationActions(manager);
	}
	
	private void makeActions() {
		connectOpenDMXAction = new Action() {
			public void run() {
				CommPipeSelectionDialog arduinoConfigWizardDialog = new CommPipeSelectionDialog();
				int status = arduinoConfigWizardDialog.open();
				if (status == Window.OK) {
//					ArduinoConfig cfg = arduinoConfigWizardDialog.getArduinoConfiguration();
//					if (cfg != null) {
//						CommPortIdentifier obj = cfg.getUsbComm();
//						if (obj instanceof CommPortIdentifier) {
//							if (checkIfArduinoConnectionAlreadyExistAndAskForReplace(obj)) {
//								CmdPipe arduinoPipe = QuanticMojo.INSTANCE.openUsbPipe(
//									"firmata", 
//									((CommPortIdentifier)obj).getName(), 
//									cfg.getUsbSpeed()
//								);
//								
//								Arduino arduino = UbiquinoUtils.INSTANCE.createArduinoBoard(
//									ARDUINO_BOARD_UID.DIECMILA_ATMEGA_168,
//									ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20,
//									arduinoPipe
//								);
//								
//								arduinos.put(obj.getName(), arduino);
//								pane.put(obj.getName(), new ArduinoBoardControllerTab(tabFolder, arduino, arduinoPipe));
//								if (pane.get(obj.getName()) != null) {
//									pane.get(obj.getName()).setInput(arduinos);
//									pane.get(obj.getName()).refresh(true);
//								}
//							}
//						}		
//					}
				}
			}
		};	
		connectOpenDMXAction.setText("Connection To Arduino");
		connectOpenDMXAction.setToolTipText("Connection To Arduino Tooltip");
		connectOpenDMXAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-add.png"
			)
		);
		
		disconnectArduinoAction = new Action() {
			public void run() {
				showMessage("Disconnection From Arduino Executed");
			}
		};
		disconnectArduinoAction.setText("Disconnection From Arduino");
		disconnectArduinoAction.setToolTipText("Disconnection From Arduino Tooltip");
		disconnectArduinoAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-remove.png"
			)
		);
		/*				
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = pane.get(obj.getName()).getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
		 */

		refreshArduinoAction = new Action() {
			public void run() {
				showMessage("Refresh Arduino Executed");
			}
		};
		refreshArduinoAction.setText("Refresh Arduino");
		refreshArduinoAction.setToolTipText("Refresh Arduino Tooltip");
		refreshArduinoAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-refresh.png"
			)
		);
	
		editArduinoConfigurationAction = new Action() {
			public void run() {
				showMessage("Edit Arduino Properties Executed");
			}
		};
		editArduinoConfigurationAction.setText("Edit Arduino Properties");
		editArduinoConfigurationAction.setToolTipText("Edit Arduino Properties Tooltip");
		editArduinoConfigurationAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-open.png"
			)
		);
	}

	
	private void showMessage(String message) {
		MessageDialog.openInformation(
			Display.getDefault().getActiveShell(),
			"Ubiquino View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//pane.getViewer().getControl().setFocus();
	}
}
