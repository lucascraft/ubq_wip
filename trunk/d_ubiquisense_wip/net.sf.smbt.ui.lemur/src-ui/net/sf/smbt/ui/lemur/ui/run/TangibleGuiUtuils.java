/***********************************************************************************
 * UBQT - A ubiquitous computing utilities framework 
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

package net.sf.smbt.ui.lemur.ui.run;

import net.sf.smbt.jazzmutant.utils.JzmlUtils;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.smbt.ui.lemur.ui.utils.JzmuiControllerUtils;
import net.sf.smbt.ui.lemur.ui.widgets.LemurSceneWidget;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;

public class TangibleGuiUtuils {
	public static TangibleGuiUtuils INSTANCE = new TangibleGuiUtuils();
	
	public void doIt(JZJazzInterface jzInterface) {
		Display display = Display.getDefault();
		Monitor monitors[] = display.getMonitors();
		
		Monitor ubqtMonitor = monitors[0];
		if (monitors.length>1) {
			ubqtMonitor = monitors[1];
		}
		final Shell shell = new Shell(display, SWT.NONE);
		
		shell.setMaximized(true);
		shell.setFullScreen(true);
		shell.setLayout(new FillLayout());
		shell.setBounds(ubqtMonitor.getBounds());

		final LemurSceneWidget lemurWidget = new LemurSceneWidget(shell, jzInterface);

		KeyListener keyListener = new KeyListener() {
			public void keyReleased(KeyEvent e) {
				if (e.character == SWT.ESC) {
					shell.close();
				} else if (e.character == 'l') {
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
			}
			public void keyPressed(KeyEvent e) {
				keyReleased(e);
			}
		};
		
		lemurWidget.addKeyListener(keyListener);
		
		shell.open ();

	}
}
