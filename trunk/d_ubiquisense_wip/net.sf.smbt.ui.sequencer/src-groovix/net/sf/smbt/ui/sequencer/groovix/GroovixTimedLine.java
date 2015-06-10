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

package net.sf.smbt.ui.sequencer.groovix;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.sf.smbt.ui.controls.UbiWidgetFactory;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.sequencer.Activator;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.vu.SixteenSegmentsDisplay;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiSlider;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

public class GroovixTimedLine extends Composite {
	private SixteenSegmentsDisplay hhmmssmsec;
	private GroovixEditor editor;
	private Image playImageBig, stopImageBig;
	private float speed = 1f;
	private Label lbl;
	private SimpleDateFormat precisionClockDateFormat = new SimpleDateFormat("hh mm ss.SSS");
	
	public GroovixTimedLine(Composite parent, GroovixEditor e) {
		super(parent, SWT.NONE);
		this.editor = e;
		setBackground(GUIToolkit.BG);
		playImageBig	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/play.png").createImage();
		stopImageBig	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/stop.png").createImage();
		
		final Button playStopButton = new Button(this, SWT.TOGGLE);
		playStopButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BOTTOM).hint(64, 64).minSize(64, 64).create());
		playStopButton.setForeground(ColorsUtil.BG);
		playStopButton.setImage(
			playImageBig
		);
		playStopButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (playStopButton.getSelection()) {
					playStopButton.setImage(stopImageBig);
					editor.getEngine().schedule();
					editor.setRunning(true);
				} else {
					playStopButton.setImage(playImageBig);
					editor.getEngine().cancel();
					editor.setRunning(false);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});
		
		final UbiSlider slider = new UbiSlider(this, SWT.HORIZONTAL, false, UbiSlider.UBI_SLIDER_RICH_LOOK);
		slider.setLayout(GridLayoutFactory.fillDefaults().create());
		slider.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).hint(300, 20).minSize(300, 20).create());
		slider.setMax(100f);
		slider.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				float ratio = slider.getValue() / 100f;
				speed  = (ratio * 10f) - 5f;
				editor.getEngine().setSpeed(speed);
				if (lbl != null) {
					lbl.setText(" x " + speed);
				}
			}
		});
		
		lbl = new Label(this, SWT.READ_ONLY);
		lbl.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(150, 20).minSize(150, 20).create());
		lbl.setBackground(ColorsUtil.BG);
		lbl.setForeground(ColorConstants.gray);
		lbl.setFont(new Font(Display.getDefault(), "tahoma", 14, SWT.BOLD));

		slider.setValue(75f);

		hhmmssmsec = UbiWidgetFactory.INSTANCE.createUbiSixteenSegmentsDisplay(this, 15, SWT.NONE);
		hhmmssmsec.setLayoutData(GridLayoutFactory.fillDefaults().create());
		hhmmssmsec.setLayoutData(
			GridDataFactory.fillDefaults().
				grab(true, false).align(SWT.BEGINNING, SWT.BOTTOM).hint(360, 50).minSize(360, 50).create()
		);
		hhmmssmsec.setForeground(ColorConstants.orange);
		hhmmssmsec.setText("                ");
		editor.getEngine().addUpdateListener(new IGroovixUpdater() {
			@Override
			public void update(float speed, float completion, long time) {
				hhmmssmsec.setText(
					precisionClockDateFormat.format(new Date(time))
				);
			}
		});
		
	}
}
