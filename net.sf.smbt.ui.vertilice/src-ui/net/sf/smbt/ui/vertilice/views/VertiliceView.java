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

package net.sf.smbt.ui.vertilice.views;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.leds.DotMatrixUtils;
import net.sf.smbt.ui.widgets.vu.DotMatrixCharDisplay;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;

public class VertiliceView extends ViewPart {

	private Font mediumFont = new Font(Display.getDefault(), "tahoma", 16, SWT.BOLD);
	private Action connectAction;
	
	@SuppressWarnings("unused")
	private CmdPipe xbeePipe;

	@Override
	public void createPartControl(Composite parent) {
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		final Button connectLabel = new Button(container, SWT.PUSH);
		connectLabel.setLayoutData(GridDataFactory.swtDefaults().grab(false, false).align(SWT.END, SWT.CENTER).hint(200, 80).minSize(200, 80).create());
		connectLabel.setBackground(ColorConstants.orange);
		connectLabel.setForeground(ColorsUtil.BG);
		connectLabel.setFont(mediumFont);
		connectLabel.setText("Connect");
		connectLabel.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				connectAction.run();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		connectAction = new Action() {
			public void run() {
				CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"at"});
				if (dlg.open() == Window.OK) {
					Object[] results = dlg.getResult();
					if (results != null) {
						for (Object obj : results) {
							if (obj instanceof CmdPipe) {
								CmdPipe p = (CmdPipe) obj;
								xbeePipe = p;
								//textViewer.getDocument().set("Connected to Vertilice wind turbine [" + p.getAddr() + "] at " + p.getSpeed() + " bauds");
							}
						}
					} else {
						CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"at"});
						int status = pipeConfigWizardDialog.open();
						if (status == Window.OK) {
							CmdPipe pipe = pipeConfigWizardDialog.getSelection();
							if (pipe != null) {
								xbeePipe = pipe;
							}
						}
					}
				}
			}
		};	
		
		connectAction.setText("Connection To Vertilice wind turbine over USB/Arduino");
		connectAction.setToolTipText("Connection To Vertilice wind turbine over USB/Arduino");
		
		Composite bottomContainer = GUIToolkit.INSTANCE.createComposite(container);
		bottomContainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		bottomContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		DotMatrixCharDisplay dotMatrixDisplay = new DotMatrixCharDisplay(container, DotMatrixUtils.DOT_MATRIX_CHAR_12X12_DIM);
		
		dotMatrixDisplay.setText(0, "VERTILICE");
		dotMatrixDisplay.setText(1, "214 rpm");
		dotMatrixDisplay.setText(2, "456 Watts (instant)");
		dotMatrixDisplay.setText(3, "3.65 kW");
		dotMatrixDisplay.setText(4, "Since 23/08/2012 12:23:54");
		dotMatrixDisplay.setBackground(ColorsUtil.BG);
		dotMatrixDisplay.setForeground(ColorConstants.orange);
		dotMatrixDisplay.setLayout(GridLayoutFactory.fillDefaults().margins(25, 20).create());
		dotMatrixDisplay.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).hint(500, 200).grab(true, true).create());
	}

	@Override
	public void setFocus() {}
}
