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

package net.sf.smbt.ui.dmx.properties;

import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.ui.dmx.controller.DXMFixturesDetailsContentProvider;
import net.sf.smbt.ui.dmx.controller.OpenDMXCompseableAdapterFactory;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class DMXFixturePropertySection extends AbstractPropertySection {
	private FixtureDefinition fixture;
	private FilteredTree fixtureFilteredTree;
	
	public DMXFixturePropertySection() {}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);

		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		
		createFixturesView(container);
	}

	private void createFixturesView(Composite container) {
		fixtureFilteredTree = GUIToolkit.INSTANCE.createFilteredTree(container, SWT.NONE, new PatternFilter(), true);
		fixtureFilteredTree.getViewer().getControl().setLayoutData(
			GridDataFactory.fillDefaults().grab(true, true).create()
		);
		fixtureFilteredTree.getViewer().setContentProvider(new DXMFixturesDetailsContentProvider(false));
		fixtureFilteredTree.getViewer().setLabelProvider(
			new AdapterFactoryLabelProvider(
				new OpenDMXCompseableAdapterFactory()
			)
		);
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof FixtureDefinition) {
			fixture = (FixtureDefinition) o;
			fixtureFilteredTree.getViewer().setInput(fixture);
			fixtureFilteredTree.getViewer().refresh(true);
		}
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
