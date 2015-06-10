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

import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.ui.dmx.controller.DXMCuesDetailsContentProvider;
import net.sf.smbt.ui.dmx.controller.DXMFixturesDetailsContentProvider;
import net.sf.smbt.ui.dmx.controller.OpenDMXCompseableAdapterFactory;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class DMXCuePropertySection extends AbstractPropertySection {
	private DMXProject dmxPrject;
	private FilteredTree cueFilteredTree, cueValuesFilteredTree;
	
	public DMXCuePropertySection() {}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);

		SashForm container = new SashForm(parent, SWT.HORIZONTAL);
		
		container.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(ColorConstants.gray);
		
		createCuesView(container);
		createDetailsView(container);
		
		container.setWeights(new int[]{1,3});
	}

	private void createCuesView(Composite container) {
		cueFilteredTree = GUIToolkit.INSTANCE.createFilteredTree(container, SWT.NONE, new PatternFilter(), true);
		cueFilteredTree.getViewer().getControl().setLayoutData(
			GridDataFactory.fillDefaults().grab(true, true).create()
		);
		cueFilteredTree.getViewer().setContentProvider(new DXMCuesDetailsContentProvider(false));
		cueFilteredTree.getViewer().setLabelProvider(
			new AdapterFactoryLabelProvider(
				new OpenDMXCompseableAdapterFactory()
			)
		);
		cueFilteredTree.getViewer().addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					ISelection sel = event.getSelection();
					if (sel instanceof StructuredSelection) {
						Object obj = ((StructuredSelection)sel).getFirstElement();
						if (obj instanceof DMXFixture) {
							cueValuesFilteredTree.getViewer().setInput(((DMXFixture)obj).getValues());
							cueValuesFilteredTree.getViewer().refresh(true);
						}
					}
				}
			}
		);
	}
	
	private void createDetailsView(Composite container) {
		cueValuesFilteredTree = GUIToolkit.INSTANCE.createFilteredTree(container, SWT.NONE, new PatternFilter(), true);
		cueValuesFilteredTree.getViewer().getControl().setLayoutData(
			GridDataFactory.fillDefaults().grab(true, true).create()
		);
		cueValuesFilteredTree.getViewer().setContentProvider(new DXMFixturesDetailsContentProvider(false));
		cueValuesFilteredTree.getViewer().setLabelProvider(
			new AdapterFactoryLabelProvider(
				new OpenDMXCompseableAdapterFactory()
			)
		);
	}

	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof DMXProject) {
			dmxPrject = (DMXProject) o;
			cueFilteredTree.getViewer().setInput(dmxPrject.getUniverses().get(0).getCues());
			cueFilteredTree.getViewer().refresh(true);
		}
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
