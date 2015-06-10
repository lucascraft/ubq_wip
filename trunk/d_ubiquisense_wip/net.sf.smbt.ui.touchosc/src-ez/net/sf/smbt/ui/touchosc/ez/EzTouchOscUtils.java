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

package net.sf.smbt.ui.touchosc.ez;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.touchosc.touchoscapp.FaderH;
import net.sf.smbt.touchosc.touchoscapp.FaderV;
import net.sf.smbt.touchosc.touchoscapp.LED;
import net.sf.smbt.touchosc.touchoscapp.LabelH;
import net.sf.smbt.touchosc.touchoscapp.LabelV;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderH;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderV;
import net.sf.smbt.touchosc.touchoscapp.MultiToggle;
import net.sf.smbt.touchosc.touchoscapp.Push;
import net.sf.smbt.touchosc.touchoscapp.RotaryH;
import net.sf.smbt.touchosc.touchoscapp.RotaryV;
import net.sf.smbt.touchosc.touchoscapp.Tab;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.touchoscapp.Widget;
import net.sf.smbt.touchosc.touchoscapp.XYPad;

public class EzTouchOscUtils {
	
	public final static EzTouchOscUtils INSTANCE = new EzTouchOscUtils();
	
	public EzTouchOscUtils() {
	}

	public List<OscCmd> dumpTouchOscCfgAsOSC(TouchOscApp app) {
		List<OscCmd> mappings = new ArrayList<OscCmd>();
		for (Tab t : app.getTabs()) {
			mappings.addAll(
				dumpTouchOscCfgAsOSC(t)
			);
		}
		return mappings;
	}
	
	private List<OscCmd> dumpTouchOscCfgAsOSC(Tab tab) {
		List<OscCmd> mappings = new ArrayList<OscCmd>();
		
		for (Widget w : tab.getWidgets()) {
			if (w instanceof FaderH) {
				FaderH faderH = ((FaderH)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(faderH.getOsc(), new Float(faderH.getValue())));
			} else if (w instanceof FaderV) {
				FaderV faderV = ((FaderV)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(faderV.getOsc(), new Float(faderV.getValue())));
			} else if (w instanceof LabelH) {
				LabelH labelH = ((LabelH)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(labelH.getOsc(), labelH.getText()));
			} else if (w instanceof LabelV) {
				LabelV labelV = ((LabelV)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(labelV.getOsc(), labelV.getText()));
			} else if (w instanceof LED) {
				LED led = ((LED)w);
				Boolean[] ledStates = new Boolean[led.getColumns() * led.getRows()];
				for (Boolean ledState : ledStates) {
					mappings.add(OscCmdUtils.INSTANCE.createOscCmd(led.getOsc(), ledState));
				}
			} else if (w instanceof MultiFaderH) {
				MultiFaderH multiFaderH = ((MultiFaderH)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(multiFaderH.getOsc(), multiFaderH.getValues()));
			} else if (w instanceof MultiFaderV) {
				MultiFaderV multiFaderV = ((MultiFaderV)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(multiFaderV.getOsc(), multiFaderV.getValues()));
			} else if (w instanceof MultiToggle) {
				MultiToggle multiToggle = ((MultiToggle)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(multiToggle.getOsc(), multiToggle.getValues()));
			} else if (w instanceof Push) {
				Push push = ((Push)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(push.getOsc(), new Boolean(false)));
			} else if (w instanceof RotaryH) {
				RotaryH rotaryH = ((RotaryH)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(rotaryH.getOsc(), new Float(rotaryH.getValue())));
			} else if (w instanceof RotaryV) {
				RotaryV rotaryV = ((RotaryV)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(rotaryV.getOsc(), new Float(rotaryV.getValue())));
			} else if (w instanceof XYPad) {
				XYPad xyPad = ((XYPad)w);
				mappings.add(OscCmdUtils.INSTANCE.createOscCmd(xyPad.getOsc(), new Float(xyPad.getXVal()), new Float(xyPad.getYVal())));
			}
		}
		
		return mappings;
	}
	
}
