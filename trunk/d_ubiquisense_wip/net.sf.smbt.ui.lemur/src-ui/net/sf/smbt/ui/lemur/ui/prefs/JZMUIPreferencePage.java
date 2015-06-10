/***********************************************************************************
 * SMBT - A smart ambient utilities framework 
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

package net.sf.smbt.ui.lemur.ui.prefs;

import net.sf.smbt.jzmui.LemurIncomingPorts;
import net.sf.smbt.jzmui.LemurPreferences;
import net.sf.smbt.ui.lemur.Activator;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class JZMUIPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	
	StringFieldEditor	fieldEditorOSC0, fieldEditorOSC1, fieldEditorOSC2, 
							fieldEditorOSC3, fieldEditorOSC4, fieldEditorOSC5,
								fieldEditorOSC6, fieldEditorOSC7, fieldEditorOSC8, 
									fieldEditorOSC9;
	
	IntegerFieldEditor	fieldEditorOSC0Ports, fieldEditorOSC1Ports, fieldEditorOSC2Ports, 
							fieldEditorOSC3Ports, fieldEditorOSC4Ports, fieldEditorOSC5Ports,
								fieldEditorOSC6Ports, fieldEditorOSC7Ports, fieldEditorOSC8Ports, 
									fieldEditorOSC9Ports;

	public JZMUIPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("JZML predifined OSC targets");
	}
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		fieldEditorOSC0 = new StringFieldEditor(LemurPreferences.LEMUR_OSC0_TARGET_PREF.getLiteral(), "Target OSC0:", getFieldEditorParent());
		fieldEditorOSC0Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC0_PORT_IN_PREF.getLiteral(), "Ports In OSC0:", getFieldEditorParent());
		fieldEditorOSC1 = new StringFieldEditor(LemurPreferences.LEMUR_OSC1_TARGET_PREF.getLiteral(), "Target OSC1:", getFieldEditorParent());
		fieldEditorOSC1Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC1_PORT_IN_PREF.getLiteral(), "Ports In OSC1:", getFieldEditorParent());
		fieldEditorOSC2 = new StringFieldEditor(LemurPreferences.LEMUR_OSC2_TARGET_PREF.getLiteral(), "Target OSC2:", getFieldEditorParent());
		fieldEditorOSC2Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC2_PORT_IN_PREF.getLiteral(), "Ports In OSC2:", getFieldEditorParent());
		fieldEditorOSC3 = new StringFieldEditor(LemurPreferences.LEMUR_OSC3_TARGET_PREF.getLiteral(), "Target OSC3:", getFieldEditorParent());
		fieldEditorOSC3Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC3_PORT_IN_PREF.getLiteral(), "Ports In OSC3:", getFieldEditorParent());
		fieldEditorOSC4 = new StringFieldEditor(LemurPreferences.LEMUR_OSC4_TARGET_PREF.getLiteral(), "Target OSC4:", getFieldEditorParent());
		fieldEditorOSC4Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC4_PORT_IN_PREF.getLiteral(), "Ports In OSC4:", getFieldEditorParent());
		fieldEditorOSC5 = new StringFieldEditor(LemurPreferences.LEMUR_OSC5_TARGET_PREF.getLiteral(), "Target OSC5:", getFieldEditorParent());
		fieldEditorOSC5Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC5_PORT_IN_PREF.getLiteral(), "Ports In OSC5:", getFieldEditorParent());
		fieldEditorOSC6 = new StringFieldEditor(LemurPreferences.LEMUR_OSC6_TARGET_PREF.getLiteral(), "Target OSC6:", getFieldEditorParent());
		fieldEditorOSC6Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC6_PORT_IN_PREF.getLiteral(), "Ports In OSC6:", getFieldEditorParent());
		fieldEditorOSC7 = new StringFieldEditor(LemurPreferences.LEMUR_OSC7_TARGET_PREF.getLiteral(), "Target OSC7:", getFieldEditorParent());
		fieldEditorOSC7Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC7_PORT_IN_PREF.getLiteral(), "Ports In OSC7:", getFieldEditorParent());
		fieldEditorOSC8 = new StringFieldEditor(LemurPreferences.LEMUR_OSC8_TARGET_PREF.getLiteral(), "Target OSC8:", getFieldEditorParent());
		fieldEditorOSC8Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC8_PORT_IN_PREF.getLiteral(), "Ports In OSC8:", getFieldEditorParent());
		fieldEditorOSC9 = new StringFieldEditor(LemurPreferences.LEMUR_OSC9_TARGET_PREF.getLiteral(), "Target OSC9:", getFieldEditorParent());
		fieldEditorOSC9Ports = new IntegerFieldEditor(LemurIncomingPorts.LEMUR_OSC9_PORT_IN_PREF.getLiteral(), "Ports In OSC9:", getFieldEditorParent());
		
		addField(fieldEditorOSC0);
		addField(fieldEditorOSC0Ports);
		addField(fieldEditorOSC1);
		addField(fieldEditorOSC1Ports);
		addField(fieldEditorOSC2);
		addField(fieldEditorOSC2Ports);
		addField(fieldEditorOSC3);
		addField(fieldEditorOSC3Ports);
		addField(fieldEditorOSC4);
		addField(fieldEditorOSC4Ports);
		addField(fieldEditorOSC5);
		addField(fieldEditorOSC5Ports);
		addField(fieldEditorOSC6);
		addField(fieldEditorOSC6Ports);
		addField(fieldEditorOSC7);
		addField(fieldEditorOSC7Ports);
		addField(fieldEditorOSC8);
		addField(fieldEditorOSC8Ports);
		addField(fieldEditorOSC9);
		addField(fieldEditorOSC9Ports);

		IPreferenceStore prefs= getPreferenceStore();
		
		fieldEditorOSC0.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC0_TARGET_PREF.getLiteral()));
		fieldEditorOSC0Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC0_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC1.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC1_TARGET_PREF.getLiteral()));
		fieldEditorOSC1Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC1_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC2.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC2_TARGET_PREF.getLiteral()));
		fieldEditorOSC2Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC2_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC3.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC3_TARGET_PREF.getLiteral()));
		fieldEditorOSC3Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC3_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC4.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC4_TARGET_PREF.getLiteral()));
		fieldEditorOSC4Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC4_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC5.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC5_TARGET_PREF.getLiteral()));
		fieldEditorOSC5Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC5_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC6.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC6_TARGET_PREF.getLiteral()));
		fieldEditorOSC6Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC6_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC7.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC7_TARGET_PREF.getLiteral()));
		fieldEditorOSC7Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC7_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC8.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC8_TARGET_PREF.getLiteral()));
		fieldEditorOSC8Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC8_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC9.setStringValue(prefs.getString(LemurPreferences.LEMUR_OSC9_TARGET_PREF.getLiteral()));
		fieldEditorOSC9Ports.setStringValue(prefs.getString(LemurIncomingPorts.LEMUR_OSC9_PORT_IN_PREF.getLiteral()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {

	}
	/*
	 * @see IPreferencePage#performOk()
	 */
	public boolean performOk() {
		IPreferenceStore prefs= getPreferenceStore();
		prefs.setValue(LemurPreferences.LEMUR_OSC0_TARGET_PREF.getLiteral(), fieldEditorOSC0.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC0_PORT_IN_PREF.getLiteral(), fieldEditorOSC0Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC1_TARGET_PREF.getLiteral(), fieldEditorOSC1.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC1_PORT_IN_PREF.getLiteral(), fieldEditorOSC1Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC2_TARGET_PREF.getLiteral(), fieldEditorOSC2.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC2_PORT_IN_PREF.getLiteral(), fieldEditorOSC2Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC3_TARGET_PREF.getLiteral(), fieldEditorOSC3.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC3_PORT_IN_PREF.getLiteral(), fieldEditorOSC3Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC4_TARGET_PREF.getLiteral(), fieldEditorOSC4.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC4_PORT_IN_PREF.getLiteral(), fieldEditorOSC4Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC5_TARGET_PREF.getLiteral(), fieldEditorOSC5.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC5_PORT_IN_PREF.getLiteral(), fieldEditorOSC5Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC6_TARGET_PREF.getLiteral(), fieldEditorOSC6.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC6_PORT_IN_PREF.getLiteral(), fieldEditorOSC6Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC7_TARGET_PREF.getLiteral(), fieldEditorOSC7.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC7_PORT_IN_PREF.getLiteral(), fieldEditorOSC7Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC8_TARGET_PREF.getLiteral(), fieldEditorOSC8.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC8_PORT_IN_PREF.getLiteral(), fieldEditorOSC8Ports.getStringValue());
		prefs.setValue(LemurPreferences.LEMUR_OSC9_TARGET_PREF.getLiteral(), fieldEditorOSC9.getStringValue());
		prefs.setDefault(LemurIncomingPorts.LEMUR_OSC9_PORT_IN_PREF.getLiteral(), fieldEditorOSC9Ports.getStringValue());
		return super.performOk();
	}

	/*
	 * @see PreferencePage#performDefaults()
	 */
	protected void performDefaults() {
		IPreferenceStore prefs= getPreferenceStore();
		fieldEditorOSC0.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC0_TARGET_PREF.getLiteral()));
		fieldEditorOSC0Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC0_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC1.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC1_TARGET_PREF.getLiteral()));
		fieldEditorOSC1Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC1_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC2.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC2_TARGET_PREF.getLiteral()));
		fieldEditorOSC2Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC2_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC3.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC3_TARGET_PREF.getLiteral()));
		fieldEditorOSC3Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC3_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC4.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC4_TARGET_PREF.getLiteral()));
		fieldEditorOSC4Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC4_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC5.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC5_TARGET_PREF.getLiteral()));
		fieldEditorOSC5Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC5_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC6.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC6_TARGET_PREF.getLiteral()));
		fieldEditorOSC6Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC6_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC7.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC7_TARGET_PREF.getLiteral()));
		fieldEditorOSC7Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC7_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC8.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC8_TARGET_PREF.getLiteral()));
		fieldEditorOSC8Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC8_PORT_IN_PREF.getLiteral()));
		fieldEditorOSC9.setStringValue(prefs.getDefaultString(LemurPreferences.LEMUR_OSC9_TARGET_PREF.getLiteral()));
		fieldEditorOSC9Ports.setStringValue(prefs.getDefaultString(LemurIncomingPorts.LEMUR_OSC9_PORT_IN_PREF.getLiteral()));
		super.performDefaults();
	}

}