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
import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LEMUR_MIDI_TARGET;
import net.sf.smbt.jzmui.LemurTrigger;
import net.sf.smbt.jzmui.MIDI_MESSAGES;

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
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public abstract class AbstractJZMidiPropertySection extends AbstractTabbedPropertySection {
	private ComboViewer midiTargets, params, triggers, midiMessages;
	
	private ISelectionChangedListener triggersListener, midiTargetsListener, paramsListener, midiMsgListener;
	private SelectionListener customMsgRadioListener;
	private Text pitchFromText, pitchToText, 
				velocityText, 
					scaleFromText, scaleToText, 
						channelFromText, channelToText;
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		
		mergeMidiVars();
		
		if (getDefaultMidiVar() != null) {
			midiTargets.removeSelectionChangedListener(midiTargetsListener);
			midiTargets.setSelection(new StructuredSelection(getDefaultMidiVar().getMidiTarget()));
			midiTargets.addSelectionChangedListener(midiTargetsListener);
			
			midiMessages.removeSelectionChangedListener(midiMsgListener);
			midiMessages.setSelection(new StructuredSelection(getDefaultMidiVar().getMidiMessage()));
			midiMessages.addSelectionChangedListener(midiMsgListener);
			
			params.removeSelectionChangedListener(paramsListener);
			params.setSelection(new StructuredSelection(getDefaultMidiVar().getAttribute()));
			params.addSelectionChangedListener(paramsListener);
			
			triggers.removeSelectionChangedListener(triggersListener);
			triggers.setSelection(new StructuredSelection(getDefaultMidiVar().getTrigger()));
			triggers.addSelectionChangedListener(triggersListener);
		}
	}
	
	protected abstract EClass getEClass();
	
	
	private void mergeMidiVars() {
		if (getJZUIElem() != null) {
			final List<JzMidiVar> lst = new ArrayList<JzMidiVar>();
			
			for (EStructuralFeature f : JZMappingUtils.INSTANCE.getParamters(getEClass())) {
				boolean missing = true;
				for (JzMidiVar v : getJZUIElem().getMidiProps()) {
					if (v.getAttribute().equals(f)) {
						missing = false;
					}
				}
				if (missing) {
					lst.add(JZMappingUtils.INSTANCE.initMidiVar(getEClass(), f));
				}
			}
			if (getJZUIElem().getMidiProps() != null && !getJZUIElem().getMidiProps().isEmpty()) {
				lst.addAll(getJZUIElem().getMidiProps());
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
									getJZUIElem().eSet(JzmuiPackage.Literals.JZUI_ELEM__MIDI_PROPS, lst);
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
	
	protected JzMidiVar getMidiVarFromFeature(EStructuralFeature feature) {
		for (JzMidiVar v : getJZUIElem().getMidiProps()) {
			if (v.getAttribute().equals(feature)) {
				return v;
			}
		}
		return null;
	}
	
	protected JzMidiVar getDefaultMidiVar() {
		for (JzMidiVar v : getJZUIElem().getMidiProps()) {
			if (v.getAttribute().equals(JZMappingUtils.INSTANCE.getDefaultParamter(getEClass()))) {
				return v;
			}
		}
		return null;
	}
	
	protected JzMidiVar getCurrentMidiVar() {
		if (params != null) {
			Object obj = unwrap(params.getSelection());
			return getMidiVarFromFeature((EStructuralFeature) obj);
		}
		return null;
	}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
	}
	
	@Override
	protected void createWidgets(Composite composite) {
		Group groupMembers = getWidgetFactory().createGroup(composite, "Midi Properties");
		GridLayout gl = new GridLayout(1, false);
		groupMembers.setLayout(gl);

		Composite compositeListElements = getWidgetFactory().createComposite(groupMembers);
		compositeListElements.setLayout(new GridLayout(2, false));
		compositeListElements.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		compositeListElements.setSize(250, SWT.DEFAULT);
		
		CLabel midiTargetsLabel =  getWidgetFactory().createCLabel(compositeListElements, "Midi Target :");
		
		midiTargets = new ComboViewer(getWidgetFactory().createCCombo(compositeListElements));
		midiTargets.setContentProvider(new ArrayContentProvider());
		midiTargets.setLabelProvider(new LabelProvider());
		midiTargets.setInput(LEMUR_MIDI_TARGET.VALUES);
		midiTargetsListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object obj = unwrap(event.getSelection());
				updateMidiTarget((LEMUR_MIDI_TARGET)obj);
			}
		};
		midiTargets.addSelectionChangedListener(
			midiTargetsListener
		);
		midiTargets.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		CLabel midiMsg =  getWidgetFactory().createCLabel(compositeListElements, "Message :");

		midiMessages = new ComboViewer(getWidgetFactory().createCCombo(compositeListElements));
		midiMessages.setContentProvider(new ArrayContentProvider());
		midiMessages.setLabelProvider(new LabelProvider());
		midiMessages.setInput(MIDI_MESSAGES.VALUES);
		midiMsgListener = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object obj = unwrap(event.getSelection());
				updateMidiMessage((MIDI_MESSAGES)obj);
			}
		};
		midiMessages.addSelectionChangedListener(
			midiMsgListener
		);
		midiMessages.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());

		
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

		/*
		Composite compositeMidiParams = getWidgetFactory().createComposite(compositeListElements);
		compositeMidiParams.setLayout(new GridLayout(4, false));
		compositeMidiParams.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		compositeMidiParams.setSize(250, SWT.DEFAULT);
		
		CLabel pitchFromLabel = getWidgetFactory().createCLabel(compositeListElements, "Pitch :");
		
		pitchFromText = new Text(compositeMidiParams, SWT.BORDER);
		pitchFromText.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		CLabel pitchToLabel = getWidgetFactory().createCLabel(compositeListElements, "to");

		pitchToText = new Text(compositeMidiParams, SWT.BORDER);
		pitchToText.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		CLabel scaleFromLabel = getWidgetFactory().createCLabel(compositeListElements, "Scale :");
		
		scaleFromText = new Text(compositeMidiParams, SWT.BORDER);
		scaleFromText.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		CLabel scaleToLabel = getWidgetFactory().createCLabel(compositeListElements, "to");

		scaleFromText = new Text(compositeMidiParams, SWT.BORDER);
		scaleFromText.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		CLabel channelFromLabel = getWidgetFactory().createCLabel(compositeListElements, "Channel :");
		
		channelFromText = new Text(compositeMidiParams, SWT.BORDER);
		channelFromText.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		CLabel channelToLabel = getWidgetFactory().createCLabel(compositeListElements, "to");

		channelFromText = new Text(compositeMidiParams, SWT.BORDER);
		channelFromText.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		*/
	}
	
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		mergeMidiVars();
	}
	
	private void updateCustomAddressMode(final boolean mode) {
		getEditingDomain().getCommandStack().execute(
			new EMFRecordingChangeCommand(getEObject().eResource()) {
				@Override
				protected void doExecute() {
					getCurrentMidiVar().eSet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_ADDRESS, mode ? Boolean.TRUE : Boolean.FALSE);
				}
			}
		);
		mergeMidiVars();
	}

	private void updateCustomMsg(final String msg) {
		if (getCurrentMidiVar() != null) {
			getEditingDomain().getCommandStack().execute(
				new EMFRecordingChangeCommand(getEObject().eResource()) {
					@Override
					protected void doExecute() {
						getCurrentMidiVar().eSet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_MSG, msg);
					}
				}
			);
			mergeMidiVars();
		}
	}
	
	
	private void updateMidiMessage(final MIDI_MESSAGES obj) {
		if (getCurrentMidiVar() != null) {
			getEditingDomain().getCommandStack().execute(
				new EMFRecordingChangeCommand(getEObject().eResource()) {
					@Override
					protected void doExecute() {
						getCurrentMidiVar().eSet(JzmuiPackage.Literals.JZ_MIDI_VAR__MIDI_MESSAGE, obj);
					}
				}
			);
			mergeMidiVars();
		}
	}

	private void updateMidiTarget(final LEMUR_MIDI_TARGET obj) {
		if (getCurrentMidiVar() != null) {
			getEditingDomain().getCommandStack().execute(
				new EMFRecordingChangeCommand(getEObject().eResource()) {
					@Override
					protected void doExecute() {
						getCurrentMidiVar().eSet(JzmuiPackage.Literals.JZ_MIDI_VAR__MIDI_TARGET, obj);
					}
				}
			);
			mergeMidiVars();
		}
	}

	private void updateTrigger(final LemurTrigger obj) {
		if (getCurrentMidiVar() != null) {
			getEditingDomain().getCommandStack().execute(
				new EMFRecordingChangeCommand(getEObject().eResource()) {
					@Override
					protected void doExecute() {
						getCurrentMidiVar().eSet(JzmuiPackage.Literals.JZ_VAR__TRIGGER, obj);
					}
				}
			);
			mergeMidiVars();
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
		//mergeMidiVars();
		
		EStructuralFeature f = (EStructuralFeature) unwrap(params.getSelection());
		if (f == null) {
			f = JZMappingUtils.INSTANCE.getDefaultParamter(getEClass());
		}
		if (f instanceof EStructuralFeature) {
			JzMidiVar var = null;
			for (JzMidiVar v : getJZUIElem().getMidiProps()) {
				if (v != null && v.getAttribute() != null && v.getAttribute().equals(f)) {
					var = v;
					break;
				}
			}
			if (var instanceof JzMidiVar) {
				triggers.removeSelectionChangedListener(triggersListener);
				triggers.setSelection(new StructuredSelection(var.getTrigger()));
				triggers.addSelectionChangedListener(triggersListener);
				
				midiTargets.removeSelectionChangedListener(midiTargetsListener);
				midiTargets.setSelection(new StructuredSelection(var.getMidiTarget()));
				midiTargets.addSelectionChangedListener(midiTargetsListener);
			}
		}
	}
}