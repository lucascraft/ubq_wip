/***********************************************************************************
 * SMBT - A smart ambient utilities framework 
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

package net.sf.smbt.ui.lemur.ui.views;

import net.sf.smbt.jazzmutant.utils.JzmlUtils;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JzOscTarget;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.lemur.Activator;
import net.sf.smbt.ui.lemur.ui.run.TangibleGuiUtuils;
import net.sf.smbt.ui.lemur.ui.utils.JzmuiControllerUtils;
import net.sf.smbt.ui.lemur.ui.widgets.LemurSceneWidget;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.preference.PreferenceDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.dialogs.PreferencesUtil;
import org.eclipse.ui.part.ViewPart;

public class LemurView extends ViewPart {

	public final static String ID = "net.sf.smbt.ui.lemur.lemurView";
	private Action jzmlOpenAction, jzmuiOpenAction, configAction, openIn2ndMonitorAction;
	private LemurSceneWidget lemurWidget;
	private LemurLiveApp lemurLiveApp;
	
	@Override
	public void createPartControl(Composite parent) {

		lemurWidget = new LemurSceneWidget(parent, null);
			//
			// Initialize actions hookups 
			//
			makeActions();
			contributeToActionBars();
			Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
				
				@Override
				public void propertyChange(PropertyChangeEvent event) {
					System.out.println(event.getProperty() + " with [OLD] : " + event.getOldValue() + " and [NEW] : " + event.getNewValue());
				
					if (lemurLiveApp != null) {
						for (JzOscTarget target : lemurLiveApp.getConfigurations().getOscTargets()) {
							if (event.getProperty().contains(target.getId())) {
								for (CmdPipe engine : lemurLiveApp.getEngines()) {
									if (engine.getId().equals("OSC" + target.getId())) {
										lemurLiveApp.getEngines().remove(engine);
										engine.finalize();
									}
								}
								lemurLiveApp.getEngines().add(
									QuanticMojo.INSTANCE.openUdpPipe(
										"osc", 
										"OSC" + target.getId(), 
										target.getAddr()
									)
								);
							}
						}
					}
				}
			});
		}

		private void contributeToActionBars() {
			IActionBars bars = getViewSite().getActionBars();
			fillLocalPullDown(bars.getMenuManager());
			fillLocalToolBar(bars.getToolBarManager());
		}

		private void fillLocalPullDown(IMenuManager manager) {
			manager.add(jzmlOpenAction);
			manager.add(jzmuiOpenAction);
			manager.add(configAction);
			manager.add(openIn2ndMonitorAction);
			manager.add(new Separator());
		}

		
		private void fillLocalToolBar(IToolBarManager manager) {
			manager.add(jzmlOpenAction);
			manager.add(jzmuiOpenAction);
			manager.add(configAction);
			manager.add(openIn2ndMonitorAction);
			manager.add(new Separator());
		}

		private void makeActions() {
			jzmlOpenAction  = new Action() {
				public void run() {
					FileDialog fileSelectionDialog = new FileDialog(Display.getDefault().getActiveShell());
					String jzmlFilePath = fileSelectionDialog.open();
					if (jzmlFilePath != null && !jzmlFilePath.equals("")) {
						LemurLiveApp lemurLiveApp = JzmlUtils.INSTANCE.loadLemurLiveAppFromXML(jzmlFilePath);
						if (lemurLiveApp != null && lemurLiveApp.getElements().size() > 0) {
							JZJazzInterface jzJazzInterface = (JZJazzInterface)lemurLiveApp.getElements().get(0);
							JzmuiControllerUtils.INSTANCE.initConnections(lemurLiveApp);
							JzmuiControllerUtils.INSTANCE.hookAdapters(lemurLiveApp);
							lemurWidget.setContents(jzJazzInterface);
						}
					}
				}
			};
			jzmlOpenAction.setEnabled(true);
			jzmlOpenAction.setText("Open Lemur Legacy Control UI");
			jzmlOpenAction.setToolTipText("Open Lemur Legacy Control UI");
			jzmlOpenAction.setImageDescriptor(
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/world_of_motion_disc.png"
				)
			);

			jzmuiOpenAction  = new Action() {
				public void run() {
					FileDialog fileSelectionDialog = new FileDialog(Display.getDefault().getActiveShell());
					String jzmuiFilePath = fileSelectionDialog.open();
					if (jzmuiFilePath != null && !jzmuiFilePath.equals("")) {
						LemurLiveApp lemurLiveApp = JzmlUtils.INSTANCE.loadLemurLiveAppFromJzmuiXML(jzmuiFilePath);
						if (lemurLiveApp != null && lemurLiveApp.getElements().size() > 0) {
							JZJazzInterface jzJazzInterface = (JZJazzInterface)lemurLiveApp.getElements().get(0);
							JzmuiControllerUtils.INSTANCE.initConnections(lemurLiveApp);
							JzmuiControllerUtils.INSTANCE.hookAdapters(lemurLiveApp);
							lemurWidget.setContents(jzJazzInterface);
						}
					}
				}
			};
			jzmuiOpenAction.setEnabled(true);
			jzmuiOpenAction.setText("Open Ubqt Control UI");
			jzmuiOpenAction.setToolTipText("Open Ubqt Control UI");
			jzmuiOpenAction.setImageDescriptor(
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/new/world_of_motion_volume.png"
				)
			);
			
			configAction  = new Action() {
				public void run() {
					PreferenceDialog dialog = PreferencesUtil.createPreferenceDialogOn(
						Display.getDefault().getActiveShell(), 
						"net.sf.smbt.ui.lemur.ui.prefs.JZMUIPreferencePage", 
						null, 
						null
					);
					if (dialog != null) {
						dialog.open();
					}
				}
			};
			configAction.setEnabled(true);
			configAction.setText("OSC/Midi Configuration");
			configAction.setToolTipText("OSC/Midi Configuration");
			configAction.setImageDescriptor(
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui", 
					"icons/actions/mail-send-receive.png"
				)
			);

			//
			// 2nd monitor
			// 
			
			openIn2ndMonitorAction  = new Action() {
				public void run() {
					FileDialog fileSelectionDialog = new FileDialog(Display.getDefault().getActiveShell());
					String jzmlFilePath = fileSelectionDialog.open();
					if (jzmlFilePath != null && !jzmlFilePath.equals("")) {
						LemurLiveApp lemurLiveApp = JzmlUtils.INSTANCE.loadLemurLiveAppFromXML(jzmlFilePath);
						if (lemurLiveApp != null && lemurLiveApp.getElements().size() > 0) {
							JZJazzInterface jzJazzInterface = (JZJazzInterface)lemurLiveApp.getElements().get(0);
							JzmuiControllerUtils.INSTANCE.initConnections(lemurLiveApp);
							JzmuiControllerUtils.INSTANCE.hookAdapters(lemurLiveApp);
							TangibleGuiUtuils.INSTANCE.doIt(jzJazzInterface);
						}
					}
				}
			};
			openIn2ndMonitorAction.setEnabled(true); // 2+ monitor ???
			openIn2ndMonitorAction.setText("Open in 2nd monitor");
			openIn2ndMonitorAction.setToolTipText("Open in 2nd monitor");
			openIn2ndMonitorAction.setImageDescriptor(
					Activator.imageDescriptorFromPlugin(
							"net.sf.smbt.ui", 
							"icons/new/clapperboard.png"
					)
			);
		}
	@Override
	public void setFocus() {
		lemurWidget.setFocus();
	}

}
