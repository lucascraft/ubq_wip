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

package net.sf.smbt.jazzmutant.diagram.properties.mappings;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.jazzmutant.utils.JZMappingUtils;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LEMUR_OSC_TARGET;
import net.sf.smbt.jzmui.LemurTrigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecoretools.tabbedproperties.EMFRecordingChangeCommand;
import org.eclipse.emf.ecoretools.tabbedproperties.sections.AbstractTabbedPropertySection;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public abstract class AbstractJZOscPropertySection extends AbstractTabbedPropertySection {
	private ComboViewer oscTargets, params, triggers;
	private Button customMsgRadio;
	private Text oscMsgText;
	
	private ISelectionChangedListener triggersListener, oscTargetsListener, paramsListener;
	private SelectionListener customMsgRadioListener;
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		
		mergeOscVars();
		
		if (getDefaultOscVar() != null) {
			oscTargets.removeSelectionChangedListener(oscTargetsListener);
			oscTargets.setSelection(new StructuredSelection(getDefaultOscVar().getOscTarget()));
			oscTargets.addSelectionChangedListener(oscTargetsListener);
			
			params.removeSelectionChangedListener(paramsListener);
			params.setSelection(new StructuredSelection(getDefaultOscVar().getAttribute()));
			params.addSelectionChangedListener(paramsListener);
			
			triggers.removeSelectionChangedListener(triggersListener);
			triggers.setSelection(new StructuredSelection(getDefaultOscVar().getTrigger()));
			triggers.addSelectionChangedListener(triggersListener);
			
			customMsgRadio.removeSelectionListener(customMsgRadioListener);
			customMsgRadio.setSelection(getDefaultOscVar().getCustomMsg()!=null && getDefaultOscVar().getCustomMsg()!="");
			customMsgRadio.addSelectionListener(customMsgRadioListener);
		}
	}
	
	protected abstract EClass getEClass();
	
	
	private void mergeOscVars() {
		if (getJZUIElem() != null) {
			final List<JzOscVar> lst = new ArrayList<JzOscVar>();
			
			for (EStructuralFeature f : JZMappingUtils.INSTANCE.getParamters(getEClass())) {
				boolean missing = true;
				for (JzOscVar v : getJZUIElem().getOscProps()) {
					if (v.getAttribute().equals(f)) {
						missing = false;
					}
				}
				if (missing) {
					lst.add(JZMappingUtils.INSTANCE.initOscVar(getEClass(), f));
				}
			}
			if (getJZUIElem().getOscProps() != null && !getJZUIElem().getOscProps().isEmpty()) {
				lst.addAll(getJZUIElem().getOscProps());
			}
			
			if (!lst.isEmpty()) {
				if (getEditingDomain() != null && getEditingDomain().getCommandStack() != null) {
					if (getEObject() != null && getEObject().eResource() != null) {
						getEditingDomain().getCommandStack().execute(
							new EMFRecordingChangeCommand(getEObject().eResource()) {
								@Override
								protected void doExecute() {
									boolean deliver = getJZUIElem().eDeliver();
									getJZUIElem().eSetDeliver(false);
									getJZUIElem().eSet(JzmuiPackage.Literals.JZUI_ELEM__OSC_PROPS, lst);
									getJZUIElem().eSetDeliver(deliver);
								}
							}
						);
					}
				}
			}
		}
	}

	@Override
	protected EStructuralFeature getFeature() {
		return JzmuiPackage.Literals.JZUI_ELEM__OSC_PROPS;
	}
	
	protected List<EStructuralFeature> getParamFeatures() {
		return JZMappingUtils.INSTANCE.getParamters(getEClass());
	}
	
	protected EStructuralFeature getDefaultFeature() {
		return JZMappingUtils.INSTANCE.getDefaultParamter(getEClass());
	}
	
	protected JZUIElem getJZUIElem() {
		return (JZUIElem) getEObject(); 
	}
	
	protected JzOscVar getOscVarFromFeature(EStructuralFeature feature) {
		for (JzOscVar v : getJZUIElem().getOscProps()) {
			if (v.getAttribute().equals(feature)) {
				return v;
			}
		}
		return null;
	}
	
	protected JzOscVar getDefaultOscVar() {
		for (JzOscVar v : getJZUIElem().getOscProps()) {
			if (v.getAttribute().equals(JZMappingUtils.INSTANCE.getDefaultParamter(getEClass()))) {
				return v;
			}
		}
		return null;
	}
	
	protected JzOscVar getCurrentOscVar() {
		if (params != null) {
			Object obj = unwrap(params.getSelection());
			return getOscVarFromFeature((EStructuralFeature) obj);
		}
		return null;
	}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
	}
	
	@Override
	protected void createWidgets(Composite composite) {
		Group groupMembers = getWidgetFactory().createGroup(composite, "OSC Properties");
		GridLayout gl = new GridLayout(1, false);
		groupMembers.setLayout(gl);

		Composite compositeListElements = getWidgetFactory().createComposite(groupMembers);
		compositeListElements.setLayout(new GridLayout(2, false));
		compositeListElements.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		compositeListElements.setSize(250, SWT.DEFAULT);
		
		CLabel oscTargetsLabel =  getWidgetFactory().createCLabel(compositeListElements, "OSC Target :");
		
		oscTargets = new ComboViewer(getWidgetFactory().createCCombo(compositeListElements));
		oscTargets.setContentProvider(new ArrayContentProvider());
		oscTargets.setLabelProvider(new LabelProvider());
		oscTargets.setInput(LEMUR_OSC_TARGET.VALUES);
		oscTargetsListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object obj = unwrap(event.getSelection());
				updateOscTarget((LEMUR_OSC_TARGET)obj);
			}
		};
		oscTargets.addSelectionChangedListener(
			oscTargetsListener
		);
		oscTargets.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		CLabel paramsLabel =  getWidgetFactory().createCLabel(compositeListElements, "Value :");

		params = new ComboViewer(getWidgetFactory().createCCombo(compositeListElements));
		params.setContentProvider(new ArrayContentProvider());
		params.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof EStructuralFeature) {
					return ((EStructuralFeature)element).getName();
				}
				return super.getText(element);
			}
		});
		params.setInput(getParamFeatures());
		paramsListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				refresh();
			}
		};
		params.addSelectionChangedListener(
			paramsListener
		);
		params.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		customMsgRadio =  getWidgetFactory().createButton(compositeListElements, "Custom Message :", SWT.CHECK);
		customMsgRadioListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateCustomAddressMode(customMsgRadio.getSelection());
				oscMsgText.setEnabled(true);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		};
		customMsgRadio.addSelectionListener(
			customMsgRadioListener
		);
		customMsgRadio.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		oscMsgText = getWidgetFactory().createText(compositeListElements, "");
		oscMsgText.setEnabled(false);
		
		oscMsgText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				updateCustomMsg(oscMsgText.getText());
			}
		});
		oscMsgText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		CLabel triggersLabel = getWidgetFactory().createCLabel(compositeListElements, "Trigger :");

		triggers = new ComboViewer(getWidgetFactory().createCCombo(compositeListElements));
		triggers.setContentProvider(new ArrayContentProvider());
		triggers.setLabelProvider(new LabelProvider());
		triggers.setInput(LemurTrigger.VALUES);
		triggersListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object obj = unwrap(event.getSelection());
				updateTrigger((LemurTrigger)obj);
			}
		};
		triggers.addSelectionChangedListener(
			triggersListener
		);
		triggers.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

	}
	
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		mergeOscVars();
	}
	
	private void updateCustomAddressMode(final boolean mode) {
		getEditingDomain().getCommandStack().execute(
			new EMFRecordingChangeCommand(getEObject().eResource()) {
				@Override
				protected void doExecute() {
					getCurrentOscVar().eSet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_ADDRESS, mode ? Boolean.TRUE : Boolean.FALSE);
				}
			}
		);
		mergeOscVars();
	}

	private void updateCustomMsg(final String msg) {
		if (getCurrentOscVar() != null) {
			getEditingDomain().getCommandStack().execute(
				new EMFRecordingChangeCommand(getEObject().eResource()) {
					@Override
					protected void doExecute() {
						getCurrentOscVar().eSet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_MSG, msg);
					}
				}
			);
			mergeOscVars();
		}
	}
	
	private void updateOscTarget(final LEMUR_OSC_TARGET obj) {
		if (getCurrentOscVar() != null) {
			getEditingDomain().getCommandStack().execute(
				new EMFRecordingChangeCommand(getEObject().eResource()) {
					@Override
					protected void doExecute() {
						getCurrentOscVar().eSet(JzmuiPackage.Literals.JZ_OSC_VAR__OSC_TARGET, obj);
					}
				}
			);
			mergeOscVars();
		}
	}

	private void updateTrigger(final LemurTrigger obj) {
		if (getCurrentOscVar() != null) {
			getEditingDomain().getCommandStack().execute(
				new EMFRecordingChangeCommand(getEObject().eResource()) {
					@Override
					protected void doExecute() {
						getCurrentOscVar().eSet(JzmuiPackage.Literals.JZ_VAR__TRIGGER, obj);
					}
				}
			);
			mergeOscVars();
		}
	}

	private Object unwrap(ISelection ssel) {
		if (ssel instanceof IStructuredSelection) {
			return ((IStructuredSelection)ssel).getFirstElement();
		}
		return null;
	}
	
	@Override
	public void refresh() {
		//mergeOscVars();
		
		EStructuralFeature f = (EStructuralFeature) unwrap(params.getSelection());
		if (f == null) {
			f = JZMappingUtils.INSTANCE.getDefaultParamter(getEClass());
		}
		if (f instanceof EStructuralFeature) {
			JzOscVar var = null;
			for (JzOscVar v : getJZUIElem().getOscProps()) {
				if (v != null && v.getAttribute() != null && v.getAttribute().equals(f)) {
					var = v;
					break;
				}
			}
			if (var instanceof JzOscVar) {
				triggers.removeSelectionChangedListener(triggersListener);
				triggers.setSelection(new StructuredSelection(var.getTrigger()));
				triggers.addSelectionChangedListener(triggersListener);
				oscTargets.removeSelectionChangedListener(oscTargetsListener);
				oscTargets.setSelection(new StructuredSelection(var.getOscTarget()));
				oscTargets.addSelectionChangedListener(oscTargetsListener);
				customMsgRadio.removeSelectionListener(customMsgRadioListener);
				customMsgRadio.setSelection(var.isCustomAddress());
				customMsgRadio.addSelectionListener(customMsgRadioListener);
			}
		}
	}
}