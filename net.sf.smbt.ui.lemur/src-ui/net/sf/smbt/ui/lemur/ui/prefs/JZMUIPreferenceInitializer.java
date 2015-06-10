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

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class JZMUIPreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		store.setDefault(LemurPreferences.LEMUR_OSC0_TARGET_PREF.getLiteral(), "localhost:8000");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC0_PORT_IN_PREF.getLiteral(), "8001");
		store.setDefault(LemurPreferences.LEMUR_OSC1_TARGET_PREF.getLiteral(), "localhost:8100");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC1_PORT_IN_PREF.getLiteral(), "8101");
		store.setDefault(LemurPreferences.LEMUR_OSC2_TARGET_PREF.getLiteral(), "localhost:8200");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC2_PORT_IN_PREF.getLiteral(), "8201");
		store.setDefault(LemurPreferences.LEMUR_OSC3_TARGET_PREF.getLiteral(), "localhost:8300");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC3_PORT_IN_PREF.getLiteral(), "8301");
		store.setDefault(LemurPreferences.LEMUR_OSC4_TARGET_PREF.getLiteral(), "localhost:8400");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC4_PORT_IN_PREF.getLiteral(), "8401");
		store.setDefault(LemurPreferences.LEMUR_OSC5_TARGET_PREF.getLiteral(), "localhost:8500");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC5_PORT_IN_PREF.getLiteral(), "8501");
		store.setDefault(LemurPreferences.LEMUR_OSC6_TARGET_PREF.getLiteral(), "localhost:8600");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC6_PORT_IN_PREF.getLiteral(), "8601");
		store.setDefault(LemurPreferences.LEMUR_OSC7_TARGET_PREF.getLiteral(), "localhost:8700");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC7_PORT_IN_PREF.getLiteral(), "8701");
		store.setDefault(LemurPreferences.LEMUR_OSC8_TARGET_PREF.getLiteral(), "localhost:8800");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC8_PORT_IN_PREF.getLiteral(), "8801");
		store.setDefault(LemurPreferences.LEMUR_OSC9_TARGET_PREF.getLiteral(), "localhost:8900");
		store.setDefault(LemurIncomingPorts.LEMUR_OSC9_PORT_IN_PREF.getLiteral(), "8901");
	}
}
