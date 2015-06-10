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

package net.sf.smbt.ui.thingm.wizards;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.thingmcfg.ThingMDevice;
import net.sf.smbt.ui.Activator;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ThingMConfigurationWizardPage extends WizardPage {

	private Map<String, Image> images;
	private Label image;
	
	public ThingMConfigurationWizardPage() {
		super("Arduino Configuration");
	    setTitle("Select Arduino board settings");
	    setMessage("Select among available Arduino kind and communication settings");
	    
	    loadImages();
	}
	
	private void loadImages() {
		images = new HashMap<String, Image>();
		
		images.put(
			ThingMDevice.BLINK_M.getLiteral(), 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/arduino_mini.jpg"
			).createImage(true)
		);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());
		
		ComboViewer arduinoKindChoices = new ComboViewer(container);
		arduinoKindChoices.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof ThingMDevice) {
					return ((ThingMDevice)element).getLiteral();
				}
				return super.getText(element);
			}
		});
		arduinoKindChoices.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,	false).create());
		arduinoKindChoices.setContentProvider(new ArrayContentProvider());
		arduinoKindChoices.setInput(ThingMDevice.values());
		arduinoKindChoices.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						((ThingMConnectionSelectionWizard)getWizard()).cfg.setDevice((ThingMDevice) obj);
						/*if (images.containsKey(((ThingMDevice) obj).getLiteral())) {
							image.setImage(images.get(((ThingMDevice) obj).getLiteral()));
						} else { */
							try {
								image.setImage(null);
							} catch (Throwable t) {
								// ugly but harmless
							}
						/* } */
					}
				}
			}
		);
		
		arduinoKindChoices.setSelection(
			new StructuredSelection(
				ThingMDevice.get(0)
			)
		);
		
		ComboViewer arduinoCommChoices = new ComboViewer(container);
		arduinoCommChoices.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof ThingMDevice) {
					return ((ThingMDevice)element).getLiteral();
				}
				return super.getText(element);
			}
		});
		
		arduinoCommChoices.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,	false).create());
		arduinoCommChoices.setContentProvider(new ArrayContentProvider());
		arduinoCommChoices.setInput(ThingMDevice.values());
		arduinoCommChoices.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						((ThingMConnectionSelectionWizard)getWizard()).cfg.setDevice((ThingMDevice) obj);
					}
				}
			}
		);
		arduinoCommChoices.setSelection(
			new StructuredSelection(
				ThingMDevice.BLINK_M
			)
		);
		arduinoCommChoices.getControl().setEnabled(false);
		
		Integer[] usbSpeeds = new Integer[] {
			300, 
			1200, 
			2400, 
			4800, 
			9600, 
			14400, 
			19200, 
			28800, 
			38400, 
			57600, 
			115200
		};
		
		ComboViewer arduinoCommSpeedChoices = new ComboViewer(container);
		arduinoCommSpeedChoices.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof Integer) {
					return ((Integer)element).intValue() + " bauds";
				}
				return super.getText(element);
			}
		});
		
		arduinoCommSpeedChoices.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		arduinoCommSpeedChoices.setContentProvider(new ArrayContentProvider());
		arduinoCommSpeedChoices.setInput(usbSpeeds);
		arduinoCommSpeedChoices.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						((ThingMConnectionSelectionWizard)getWizard()).cfg.setSpeed(((Integer)obj).intValue());
					}
				}
			}
		);
		arduinoCommSpeedChoices.setSelection(
			new StructuredSelection(
				usbSpeeds[9]
			)
		);
		
		image =  new Label(container, SWT.NONE);
		image.setSize(400, 300);
		image.setLayoutData(
			GridDataFactory.fillDefaults().
				grab(true, true).hint(400, 300).
					minSize(400, 300).create()
		);
		
		setControl(container);
	}
}
