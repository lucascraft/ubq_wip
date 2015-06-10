/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.thingm;

import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.smbt.motion.engine.IMotionReceiver;
import net.sf.smbt.motion.engine.MotionEngine;
import net.sf.smbt.motion.engine.MotionUtils;
import net.sf.smbt.tests.rgb.rgbargs.RGBStepNDelayArgs;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.thingm.controller.ThingMCompseableAdapterFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;


public class RGBStepControlUI  {
	static RGBStepNDelayArgs rbgStuff;
	static Spinner rFreqSpinner, gFreqSpinner, bFreqSpinner;
	
	final static MotionCinematic[] MOTION_LIST = new MotionCinematic[] {
		MotionCinematic.NONE,
		MotionCinematic.COS, 
		MotionCinematic.SIN, 
		MotionCinematic.SQR, 
		MotionCinematic.SAW, 
		MotionCinematic.TRI
	};
	
	@SuppressWarnings("unused")
	private static MotionEngine rMotionEngine, gMotionEngine, bMotionEngine;
	
	public static RGBStepNDelayArgs getRbgStuff() {
		return rbgStuff;
	}
	
	public RGBStepControlUI() {
		rMotionEngine = new MotionEngine(-1, new Motion[0]);
		gMotionEngine = new MotionEngine(-1, new Motion[0]);
		bMotionEngine = new MotionEngine(-1, new Motion[0]);
	}
	
	public RGBStepControlUI(Display display, RGBStepNDelayArgs rgbSNDArgs) {
		Shell shell = new Shell(display);
		shell.setLayout(GridLayoutFactory.fillDefaults().create());
		
		TabFolder folder = new TabFolder(shell, SWT.TOP);
		
		createColorContent(folder, rgbSNDArgs);

		shell.open ();
		shell.pack(true);
		
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
	}
	
	public static void createColorContent(TabFolder parent, RGBStepNDelayArgs rgb) {
		rbgStuff = rgb;

		rMotionEngine = new MotionEngine(-1, new Motion[0]);
		gMotionEngine = new MotionEngine(-1, new Motion[0]);
		bMotionEngine = new MotionEngine(-1, new Motion[0]);

		TabItem tabItem = new TabItem(parent, SWT.NONE);
		tabItem.setText("Colors");
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(5).create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());

		Group groupR = new Group(container, SWT.NONE);
		groupR.setText("Red");
		groupR.setLayout(GridLayoutFactory.fillDefaults().create());
		groupR.setLayoutData(GridDataFactory.fillDefaults().create());
		
		final Label rLabel = new Label(groupR, SWT.NONE);
		rLabel.setText(rbgStuff.getR() == 0 ? "---" : "" + rbgStuff.getR());
		rLabel.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());

		final Slider sliderR = new Slider(groupR, SWT.VERTICAL);
		sliderR.setMinimum(0);
		sliderR.setMaximum(255);
		sliderR.setSelection(rbgStuff.getR());
		sliderR.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());
		sliderR.addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setR(sliderR.getSelection());	
				rLabel.setText(""+rbgStuff.getR());
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		final Button checboxRMotion = new Button(groupR, SWT.CHECK);
		checboxRMotion.setText("Motion");
		checboxRMotion.setSelection(true);
		checboxRMotion.addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setRMotion(checboxRMotion.isEnabled());				
		}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		final ComboViewer rMotionCombo = new ComboViewer(new CCombo(groupR, SWT.READ_ONLY));
		rMotionCombo.getCCombo().setLayout(GridLayoutFactory.fillDefaults().create());
		rMotionCombo.getCCombo().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		rMotionCombo.setContentProvider(new ArrayContentProvider());
		rMotionCombo.setLabelProvider(
			new AdapterFactoryLabelProvider(
				new ThingMCompseableAdapterFactory()
			)
		);
		rMotionCombo.setInput(MOTION_LIST);
		rMotionCombo.setSelection(new StructuredSelection(MotionCinematic.NONE));
		rMotionCombo.getCCombo().addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rMotionEngine.sleep();
				rMotionEngine.clearMotions();
				Motion motion = MotionUtils.INSTANCE.createMotionFromCinematicKind(
					(MotionCinematic)((StructuredSelection)rMotionCombo.getSelection()).getFirstElement(), 
					1f, 
					(float) rFreqSpinner.getSelection()
				);
				rMotionEngine.addMotion(motion);
				rMotionEngine.registerMotionReceiver(new IMotionReceiver() {
					@Override
					public IStatus getKicked(int step, int min, int max, int incr, final MotionValue val, long time) {
						new UbiJob("THINGM_rMotion") {
							@Override
							public IStatus runInUIThread(IProgressMonitor monitor) {
								sliderR.setSelection((int)val.getX());
								return Status.OK_STATUS;
							}
						}.schedule();
							
						return Status.OK_STATUS;
					}
				});
				rMotionEngine.schedule();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		rFreqSpinner = new Spinner(groupR, SWT.NONE);
		rFreqSpinner.setLayout(GridLayoutFactory.fillDefaults().create());
		rFreqSpinner.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		rFreqSpinner.setIncrement(1);
		rFreqSpinner.setValues(1, 0, 20, 0, 1, 5);

		Group groupG = new Group(container, SWT.NONE);
		groupG.setText("Green");
		groupG.setLayout(GridLayoutFactory.fillDefaults().create());
		groupG.setLayoutData(GridDataFactory.fillDefaults().create());

		final Label gLabel = new Label(groupG, SWT.NONE);
		gLabel.setText(rbgStuff.getG() == 0 ? "---" : "" + rbgStuff.getG());
		gLabel.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());

		final Slider sliderG = new Slider(groupG, SWT.VERTICAL);
		sliderG.setMinimum(0);
		sliderG.setMaximum(255);
		sliderG.setSelection(rbgStuff.getG());
		sliderG.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());
		sliderG.addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setG(sliderG.getSelection());				
				gLabel.setText(""+rbgStuff.getG());
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		final Button checboxGMotion = new Button(groupG, SWT.CHECK);
		checboxGMotion.setText("Motion");
		checboxGMotion.setSelection(rbgStuff.isGMotion());
		checboxGMotion.addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setGMotion(checboxGMotion.isEnabled());				
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		final ComboViewer gMotionCombo = new ComboViewer(new CCombo(groupG, SWT.READ_ONLY));
		gMotionCombo.getCCombo().setLayout(GridLayoutFactory.fillDefaults().create());
		gMotionCombo.getCCombo().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		gMotionCombo.setContentProvider(new ArrayContentProvider());
		gMotionCombo.setLabelProvider(
			new AdapterFactoryLabelProvider(
				new ThingMCompseableAdapterFactory()
			)
		);
		gMotionCombo.setInput(MOTION_LIST);
		gMotionCombo.setSelection(new StructuredSelection(MotionCinematic.NONE));
		gMotionCombo.getCCombo().addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		gFreqSpinner = new Spinner(groupG, SWT.NONE);
		gFreqSpinner.setLayout(GridLayoutFactory.fillDefaults().create());
		gFreqSpinner.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		gFreqSpinner.setIncrement(1);
		gFreqSpinner.setValues(1, 0, 20, 0, 1, 5);

		Group groupB = new Group(container, SWT.NONE);
		groupB.setText("Blue");
		groupB.setLayout(GridLayoutFactory.fillDefaults().create());
		groupB.setLayoutData(GridDataFactory.fillDefaults().create());

		final Label bLabel = new Label(groupB, SWT.NONE);
		bLabel.setText(rbgStuff.getB() == 0 ? "---" : "" + rbgStuff.getB());
		bLabel.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());
		
		final Slider sliderB = new Slider(groupB, SWT.VERTICAL);
		sliderB.setMinimum(0);
		sliderB.setMaximum(255);
		sliderB.setSelection(rbgStuff.getB());
		sliderB.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());
		sliderB.addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setB(sliderB.getSelection());				
				bLabel.setText(""+rbgStuff.getB());
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		final Button checboxBMotion = new Button(groupB, SWT.CHECK);
		checboxBMotion.setText("Motion");
		checboxBMotion.setSelection(rbgStuff.isBMotion());
		checboxBMotion.addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setBMotion(checboxBMotion.isEnabled());				
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		final ComboViewer bMotionCombo = new ComboViewer(new CCombo(groupB, SWT.READ_ONLY));
		bMotionCombo.getCCombo().setLayout(GridLayoutFactory.fillDefaults().create());
		bMotionCombo.getCCombo().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		bMotionCombo.setContentProvider(new ArrayContentProvider());
		bMotionCombo.setLabelProvider(
			new AdapterFactoryLabelProvider(
				new ThingMCompseableAdapterFactory()
			)
		);
		bMotionCombo.setInput(MOTION_LIST);
		bMotionCombo.setSelection(new StructuredSelection(MotionCinematic.NONE));
		bMotionCombo.getCCombo().addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		
		bFreqSpinner = new Spinner(groupB, SWT.NONE);
		bFreqSpinner.setLayout(GridLayoutFactory.fillDefaults().create());
		bFreqSpinner.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		bFreqSpinner.setIncrement(1);
		bFreqSpinner.setValues(1, 0, 20, 0, 1, 5);
		
		Group groupDelay = new Group(container, SWT.NONE);
		groupDelay.setText("Delay in ms");
		groupDelay.setLayout(GridLayoutFactory.fillDefaults().create());
		groupDelay.setLayoutData(GridDataFactory.fillDefaults().create());

		final Slider sliderDelay = new Slider(groupDelay, SWT.VERTICAL);
		sliderDelay.setMinimum(1);
		sliderDelay.setMaximum(1000);
		sliderDelay.setSelection((int)rbgStuff.getDelay());
		sliderDelay.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());
		sliderDelay.addSelectionListener(new SelectionListener(
		) {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setDelay(sliderDelay.getSelection());				
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});

		Group groupIncrement = new Group(container, SWT.NONE);
		groupIncrement.setText("Increment");
		groupIncrement.setLayout(GridLayoutFactory.fillDefaults().create());
		groupIncrement.setLayoutData(GridDataFactory.fillDefaults().create());

		final Slider sliderIncrement = new Slider(groupIncrement, SWT.VERTICAL);
		sliderIncrement.setMinimum(1);
		sliderIncrement.setMaximum(50);
		sliderIncrement.setSelection((int)rbgStuff.getIncrement());
		sliderIncrement.setLayoutData(GridDataFactory.swtDefaults().grab(false, true).create());
		sliderIncrement.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				rbgStuff.setIncrement(sliderIncrement.getSelection());				
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		tabItem.setControl(container);
	}
}
