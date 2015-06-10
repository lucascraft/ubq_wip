/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
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

package net.sf.smbt.jazzmutant.prefs;

import net.sf.smbt.jazzmutant.Activator;
import net.sf.smbt.jzmui.LemurPreferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;

public class JZMUIPreferenceInitializer extends AbstractPreferenceInitializer {

	public JZMUIPreferenceInitializer() {
		super();
	}

	@Override
	public void initializeDefaultPreferences() {
		// Store default values to default preferences
	 	IEclipsePreferences defaultPreferences = ((IScopeContext) new DefaultScope()).getNode(Activator.PLUGIN_ID);
		
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC0_TARGET_PREF.getLiteral(), "localhost:8000");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC1_TARGET_PREF.getLiteral(), "localhost:8001");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC2_TARGET_PREF.getLiteral(), "localhost:8002");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC3_TARGET_PREF.getLiteral(), "localhost:8003");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC4_TARGET_PREF.getLiteral(), "localhost:8004");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC5_TARGET_PREF.getLiteral(), "localhost:8005");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC6_TARGET_PREF.getLiteral(), "localhost:8006");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC7_TARGET_PREF.getLiteral(), "localhost:8007");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC8_TARGET_PREF.getLiteral(), "localhost:8008");
	 	defaultPreferences.put(LemurPreferences.LEMUR_OSC9_TARGET_PREF.getLiteral(), "localhost:8009");
	
	}

}
