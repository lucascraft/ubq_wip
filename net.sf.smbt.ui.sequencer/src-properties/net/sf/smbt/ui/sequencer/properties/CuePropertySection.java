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

import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezsequence.CUE_TYPE;
import net.sf.smbt.ezsequence.EventCue;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class CuePropertySection extends AbstractPropertySection {
	private EventCue cue;
	
	public CuePropertySection() {}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);
	
		createContent(parent);
	}
	
	
	private static ComboViewer cueKindComboViewer;
	
	private void createContent(Composite parent) {
		Composite container = createDefaultComposite(parent);
		
		Label speedLabel = new Label(container, SWT.READ_ONLY);
		speedLabel.setText("Speed :");
		speedLabel.setForeground(GUIToolkit.FG);
		speedLabel.setBackground(GUIToolkit.BG);

		cueKindComboViewer = new ComboViewer(new Combo(container, SWT.READ_ONLY));
		cueKindComboViewer.getCombo().setLayoutData(
			GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).minSize(200, SWT.DEFAULT).hint(200, SWT.DEFAULT).grab(true, false).create()
		);
		cueKindComboViewer.setLabelProvider(
			new LabelProvider() {
				@Override
				public Image getImage(Object element) {
					return super.getImage(element);
				}
				public String getText(Object element) {
					return ((CUE_TYPE)element).getLiteral();
				};
			}
		);
		cueKindComboViewer.setContentProvider(new ArrayContentProvider());
		cueKindComboViewer.setInput(CUE_TYPE.values());
		cueKindComboViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					Object o = unwrap(event.getSelection());
					if (o instanceof CUE_TYPE) {
						cue.setKind((CUE_TYPE)o);
					}
				}
			}
		);
	   
	   
	   container.layout(true);
	   container.pack(true);
	}
	
	void updateTargetDetails(EZMojoTarget target) {
		
	}
	
	void updateCommandDetails(Cmd cmd) {
		
	}
	
	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		//addFirstSection(composite);
		//addSeparator(composite);
		createContent(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(true, true).create());
		container.setBackground(GUIToolkit.BG);

		return container;
	}

	
	//
	//
	//
	
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
	    Object o = unwrap(selection);
		if (o instanceof EventCue) {
			cue = (EventCue) o;
			
			cueKindComboViewer.setSelection(
				new StructuredSelection(((EventCue) o).getKind())
			);

			refreshContent();
		}
	}
	
	private void refreshContent() {}
	
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
