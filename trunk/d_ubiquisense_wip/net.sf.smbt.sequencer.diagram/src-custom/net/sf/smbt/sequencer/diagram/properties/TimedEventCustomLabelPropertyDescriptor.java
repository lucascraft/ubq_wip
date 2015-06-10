/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
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

package net.sf.smbt.sequencer.diagram.properties;

import java.util.List;

import net.sf.smbt.sequencer.diagram.custom.dialogs.XCmdChooserDialog;
import net.sf.smbt.sequencer.diagram.utils.SequencerUtils;
import net.sf.xqz.model.cmd.XCmd;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class TimedEventCustomLabelPropertyDescriptor extends PropertyDescriptor {
	private AdapterFactory af;
	public TimedEventCustomLabelPropertyDescriptor(
			Object object,
			AdapterFactory af,
			IItemPropertyDescriptor itemPropertyDescriptor
	) {
		super(object, itemPropertyDescriptor);
		this.af = af;
	}
	
	@Override
	public CellEditor createPropertyEditor(Composite composite) {
		ILabelProvider editLabelProvider = getEditLabelProvider();
		return new ExtendedDialogCellEditor(composite, editLabelProvider) {
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				XCmdChooserDialog dialog = new XCmdChooserDialog(cellEditorWindow.getShell(), true);
				dialog.open();
				Object[] results = dialog.getResult();
				return results;
			}
		};
	}
	
	@Override
	protected ILabelProvider getEditLabelProvider() {
		return new AdapterFactoryLabelProvider(new ComposedAdapterFactory(SequencerUtils.INSTANCE.getEMFEditfactoriesAsMap().values())){
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return super.toString();
			}
			@Override
			public String getColumnText(Object object, int columnIndex) {
				// TODO Auto-generated method stub
				return super.getColumnText(object, columnIndex);
			}
			@Override
			public String getText(Object object) {
				String disp  = "";
				if (object instanceof List) {
					for (Object o : ((List)object)) {
						if (o instanceof XCmd) {
							disp += ((XCmd)o).eClass().getName() + ", ";
						}
					}
					return disp.length() > 1 ? disp.substring(0, disp.length()-3) : disp;
				}
				return super.getText(object);
			}
		};
	}

	
	@Override
	public ILabelProvider getLabelProvider() {
		return new AdapterFactoryLabelProvider(new ComposedAdapterFactory(SequencerUtils.INSTANCE.getEMFEditfactoriesAsMap().values())){
			@Override
			public String getText(Object object) {
				String disp  = "";
				if (object instanceof List) {
					for (Object o : ((List)object)) {
						if (o instanceof XCmd) {
							disp += ((XCmd)o).eClass().getName() + ", ";
						}
					}
					return disp.length() > 1 ? disp.substring(0, disp.length()-3) : disp;
				}
				return super.getText(object);
			}
		};
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public String getDescription() {
		return "Commands to be triggered by sequencer TimedBox::TimedEvents are selected from here." +
				"\nYou can select any command contributed to command set extension point.";
	}
	
	@Override
	public String getDisplayName() {
		if (object instanceof EObject) {
			EObject eObj = (EObject) object;
			
			//if (eObj.eClass().equals()
		}
		return "select a command to be triggered ...";
	}
}
