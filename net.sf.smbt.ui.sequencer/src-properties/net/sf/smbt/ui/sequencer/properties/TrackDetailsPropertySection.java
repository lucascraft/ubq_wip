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

package net.sf.smbt.ui.sequencer.properties;

import net.sf.smbt.ezsequence.TimeBar;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiSlider;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class TrackDetailsPropertySection extends AbstractPropertySection {
	private UbiSlider speedSlider;
	private UbiSlider cursorSizeSlider;
	private UbiSlider scaleSlider;
	private Button directionButton;
	private TimeBar track;
	private UbiSelectionListener scaleUbiListener, cursorSizeUbiListener, speedUbiListener; 
	
	public TrackDetailsPropertySection() {}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);

		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);

		Label speedLabel = new Label(container, SWT.READ_ONLY);
		speedLabel.setText("Speed :");
		speedLabel.setForeground(GUIToolkit.FG);
		speedLabel.setBackground(GUIToolkit.BG);
		speedLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(200, 20).hint(200, 20).grab(false, false).create());

		speedSlider = new UbiSlider(container, SWT.NONE, false, UbiSlider.UBI_SLIDER_RICH_LOOK);
		speedSlider.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(200, SWT.DEFAULT).hint(200, SWT.DEFAULT).grab(true, false).create());
		speedSlider.setMax(100);
		
		speedUbiListener = new UbiSelectionListener() {
			@Override
			public void handle() {
				new UbiJob("set Cursor Speed") {
					@Override
					public IStatus runInUIThread(IProgressMonitor monitor) {
						int value = speedSlider.getSelection();
						track.setSpeed(-5f + (new Float(value) / 10f));
						return Status.OK_STATUS;
					}
				}.schedule();
			}
		};

		speedSlider.addSelectionListener(
			speedUbiListener
		);
		speedSlider.setBackground(GUIToolkit.BG);

		
		Label cursorLengthLabel = new Label(container, SWT.READ_ONLY);
		cursorLengthLabel.setText("Cursor Length :");
		cursorLengthLabel.setForeground(GUIToolkit.FG);
		cursorLengthLabel.setBackground(GUIToolkit.BG);
		cursorLengthLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(200, 20).hint(200, 20).grab(false, false).create());

		cursorSizeUbiListener = new UbiSelectionListener() {
			@Override
			public void handle() {
				new UbiJob("set Cursor Length") {
					@Override
					public IStatus runInUIThread(IProgressMonitor monitor) {
						int value = cursorSizeSlider.getSelection();
						track.getTimecursor().setLength(1 + value/10);
						return Status.OK_STATUS;
					}
				}.schedule();
			}
		};

		cursorSizeSlider = new UbiSlider(container, SWT.NONE, false, UbiSlider.UBI_SLIDER_RICH_LOOK);
		cursorSizeSlider.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(200, SWT.DEFAULT).hint(200, SWT.DEFAULT).grab(true, false).create());
		cursorSizeSlider.setMax(100);
		cursorSizeSlider.setBackground(GUIToolkit.BG);
		cursorSizeSlider.addSelectionListener(
			cursorSizeUbiListener
		);
		
		Label scaleLabel = new Label(container, SWT.READ_ONLY);
		scaleLabel.setText("Scale :");
		scaleLabel.setForeground(GUIToolkit.FG);
		scaleLabel.setBackground(GUIToolkit.BG);
		scaleLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(200, 20).hint(200, 20).grab(false, false).create());

		scaleSlider = new UbiSlider(container, SWT.NONE, false, UbiSlider.UBI_SLIDER_RICH_LOOK);
		scaleSlider.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(200, SWT.DEFAULT).hint(200, SWT.DEFAULT).grab(true, false).create());
		scaleSlider.setMax(100);

		scaleUbiListener = new UbiSelectionListener(){
			@Override
			public void handle() {
				new UbiJob("set Scale") {
					@Override
					public IStatus runInUIThread(IProgressMonitor monitor) {
						int value = cursorSizeSlider.getSelection();
						track.setScale(-10f + (new Float(value) / 5f));
						return Status.OK_STATUS;
					}
				}.schedule();
			};
		};

		scaleSlider.addSelectionListener(
			scaleUbiListener
		);
		
		Label directionLabel = new Label(container, SWT.READ_ONLY);
		directionLabel.setText("Direction :");
		directionLabel.setForeground(GUIToolkit.FG);
		directionLabel.setBackground(GUIToolkit.BG);
		directionLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(40, 20).hint(40, 20).grab(false, false).create());

		directionButton = new Button(container, SWT.TOGGLE);
		directionButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(40, SWT.DEFAULT).hint(40, SWT.DEFAULT).grab(true, false).create());
		directionButton.setText("+1");
		directionButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					new UbiJob("set Scale") {
						@Override
						public IStatus runInUIThread(IProgressMonitor monitor) {
							int value = directionButton.getSelection() ? -1 : +1;
							directionButton.setText(directionButton.getSelection() ? "-1" : "+1");
							track.setDirection(value);
							return Status.OK_STATUS;
						}
					}.schedule();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
	}
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof TimeBar) {
			track = (TimeBar) o;
			int direction 		= track.getDirection();
			float scale 		= track.getScale();
			float speed 		= track.getSpeed();
			TimeCursor cursor	= track.getTimecursor();
			int length			= cursor.getLength(); 
			if (cursor != null) {
				cursorSizeSlider.setSelection(cursor.getLength()*10);
			}
			if (track != null) {
				float vSpeed = ((5f + speed)/10f);
				speedSlider.removeSelectionListener(speedUbiListener);
				speedSlider.setSelection(new Float(vSpeed * 100f).intValue());
				speedSlider.addSelectionListener(speedUbiListener);
				
				int vSize = ((-1+length)/10);
				cursorSizeSlider.removeSelectionListener(speedUbiListener);
				cursorSizeSlider.setSelection(vSize * 100);
				cursorSizeSlider.addSelectionListener(speedUbiListener);
				
				float vScale = ((10f + scale)/20f);
				scaleSlider.removeSelectionListener(speedUbiListener);
				scaleSlider.setSelection(new Float(vScale * 100f).intValue());
				scaleSlider.addSelectionListener(speedUbiListener);
				
				directionButton.setSelection(direction == -1);
			}
		}
	}
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
	}
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
	}
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
