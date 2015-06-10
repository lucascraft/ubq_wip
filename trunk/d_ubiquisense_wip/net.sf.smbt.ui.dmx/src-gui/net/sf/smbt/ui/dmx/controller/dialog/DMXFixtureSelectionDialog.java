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

package net.sf.smbt.ui.dmx.controller.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlFactory;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.dmx.controller.DMXUniverseContentProvider;
import net.sf.smbt.ui.dmx.controller.OpenDMXCompseableAdapterFactory;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.dialogs.SelectionDialog;

public class DMXFixtureSelectionDialog extends SelectionDialog {
	private List<DMXFixture> fixtures;
	private DMXLibrary dmxLib;
	
	public DMXFixtureSelectionDialog(Shell parentShell, String shellTitle, String shellMessage, DMXLibrary dmxLibrary) {
		super(parentShell);
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	    
	    setDefaultImage(
	    	Activator.imageDescriptorFromPlugin(
	    		Activator.PLUGIN_ID, 
	    		"icons/ubiquisense.png"
	    	).createImage()
	    );

	    initFixtures(dmxLibrary);
	}
	
	private void initFixtures(DMXLibrary dmxLibrary) {
		fixtures = new ArrayList<DMXFixture>();
	    dmxLib = dmxLibrary;
		for (FixtureDefinition def : dmxLib.getFixtures()) {
			DMXFixture fixture = EzdmxctrlFactory.eINSTANCE.createDMXFixture();
			fixture.setDefinition(def);
			fixture.setVendor(def.getManufacturer());
			dmxLib.getFixtures().add(def);
			fixtures.add(fixture);
		}
	}
	
	/*
	private void initFixtures() {
		fixtures = new ArrayList<DMXFixture>();
	    dmxLib = DMXUtils.INSTANCE.initDMX();
		for (FixtureDefinition def : dmxLib.getFixtures()) {
			DMXFixture fixture = EzdmxctrlFactory.eINSTANCE.createDMXFixture();
			fixture.setDefinition(def);
			fixture.setVendor(def.getManufacturer());
			dmxLib.getFixtures().add(def);
			fixtures.add(fixture);
		}
	}
	*/

	@Override
	protected Point getInitialSize() {
		Point size = super.getInitialSize();
		size.x = 300;
		return size;
	}
	
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        container.setLayout(GridLayoutFactory.fillDefaults().create());
        container.setLayoutData(GridDataFactory.fillDefaults().hint(200, 350).grab(true, true).create());

		final FilteredTree filteredTree = GUIToolkit.INSTANCE.createFilteredTree(
			container, SWT.MULTI | SWT.FULL_SELECTION,
			new PatternFilter(),
			true
		);
		filteredTree.setLayout(GridLayoutFactory.fillDefaults().create());
		filteredTree.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		
		filteredTree.getViewer().setContentProvider(new DMXUniverseContentProvider());
		filteredTree.getViewer().setLabelProvider(new AdapterFactoryLabelProvider(
			new OpenDMXCompseableAdapterFactory()
		));
		
		filteredTree.getViewer().addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					ISelection sel = event.getSelection();
					if (sel instanceof StructuredSelection) {
						StructuredSelection ssel = (StructuredSelection) sel;
						if (!ssel.isEmpty()) {
							Object obj = ssel.getFirstElement();
							if (obj instanceof FixtureDefinition) {
								FixtureDefinition fixture = (FixtureDefinition) obj;
								setResult(Arrays.asList(new FixtureDefinition[]{fixture}));
							}
						}
					}
				}
			}
		);
		
		filteredTree.getViewer().setInput(dmxLib);
		
        // Create label
        createMessageArea(container);

        return container;
    }
}
