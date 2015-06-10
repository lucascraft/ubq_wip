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

package net.sf.smbt.jazzmutant.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiFactory;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LEMUR_MIDI_TARGET;
import net.sf.smbt.jzmui.LEMUR_OSC_TARGET;
import net.sf.smbt.jzmui.LemurTrigger;
import net.sf.smbt.jzmui.MIDI_MESSAGES;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class JZMappingUtils {
	public final static JZMappingUtils INSTANCE = new JZMappingUtils();
	
	public JzOscVar initOscVar(EClass clazz, EStructuralFeature feature) {
		for (EStructuralFeature f : getParamters(clazz)) {
			if (f.equals(feature)) {
				JzOscVar v = JzmuiFactory.eINSTANCE.createJzOscVar();
				v.setAttribute(f);
				v.setCustomAddress(false);
				v.setOscTarget(LEMUR_OSC_TARGET.NONE);
				v.setTrigger(LemurTrigger.ANY);
				return v;
			}
		}
		return null;
	}
	
	public List<JzOscVar> initOscVars(EClass clazz) {
		List<JzOscVar> vars = new ArrayList<JzOscVar>();
		for (EStructuralFeature f : getParamters(clazz)) {
			JzOscVar v = JzmuiFactory.eINSTANCE.createJzOscVar();
			v.setAttribute(f);
			v.setCustomAddress(false);
			v.setOscTarget(LEMUR_OSC_TARGET.NONE);
			v.setTrigger(LemurTrigger.ANY);
			vars.add(v);
		}
		return vars;
	}
	
	public List<JzMidiVar> initMidiVars(EClass clazz) {
		List<JzMidiVar> vars = new ArrayList<JzMidiVar>();
		for (EStructuralFeature f : getParamters(clazz)) {
			JzMidiVar m = JzmuiFactory.eINSTANCE.createJzMidiVar();
			m.setAttribute(f);
			m.setMidiTarget(LEMUR_MIDI_TARGET.NONE);
			m.setMidiMessage(MIDI_MESSAGES._90_NOTE_ON);
			/*
			m.setChannelFrom(1);
			m.setChannelTo(1);
			m.setPitchFrom(0);
			m.setPitchTo(127);
			m.setScaleFrom(0);
			m.setScaleTo(1);
			*/
			m.setTrigger(LemurTrigger.ANY);
			vars.add(m);
		}
		return vars;
	}
	
	public JzMidiVar initMidiVar(EClass clazz, EStructuralFeature feature) {
		for (EStructuralFeature f : getParamters(clazz)) {
			if (f.equals(feature)) {
				JzMidiVar m = JzmuiFactory.eINSTANCE.createJzMidiVar();
				m.setAttribute(f);
				m.setMidiTarget(LEMUR_MIDI_TARGET.NONE);
				m.setMidiMessage(MIDI_MESSAGES._90_NOTE_ON);
				/*
				m.setChannelFrom(1);
				m.setChannelTo(1);
				m.setPitchFrom(0);
				m.setPitchTo(127);
				m.setScaleFrom(0);
				m.setScaleTo(1);
				*/
				m.setTrigger(LemurTrigger.ANY);
				return m;
			}
		}
		return null;
	}
	
	public List<EStructuralFeature> getParamters(EClass clazz) {
		if (clazz.equals(JzmuiPackage.Literals.JZ_BREAK_POINT)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_BREAK_POINT__X,
						JzmuiPackage.Literals.JZ_BREAK_POINT__Y,
						JzmuiPackage.Literals.JZ_BREAK_POINT__ATTRACTION,
						JzmuiPackage.Literals.JZ_BREAK_POINT__EDIT,
						JzmuiPackage.Literals.JZ_BREAK_POINT__FRICTION,
						JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_X,
						JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_Y,
						JzmuiPackage.Literals.JZ_BREAK_POINT__LIGHT,
						JzmuiPackage.Literals.JZ_BREAK_POINT__REST,
						JzmuiPackage.Literals.JZ_BREAK_POINT__SPEED
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_CUSTOM_BUTTON)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__X,
						JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__LIGHT
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_FADER)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_FADER__X,
						JzmuiPackage.Literals.JZ_FADER__Z,
						JzmuiPackage.Literals.JZ_FADER__ATTRACTION,
						JzmuiPackage.Literals.JZ_FADER__FRICTION, 
						JzmuiPackage.Literals.JZ_FADER__SPEED,
						JzmuiPackage.Literals.JZ_FADER__VALUE
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_KNOB)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_KNOB__X,
						JzmuiPackage.Literals.JZ_KNOB__ATTRACTION,
						JzmuiPackage.Literals.JZ_KNOB__FRICTION,
						JzmuiPackage.Literals.JZ_KNOB__SPEED,
						JzmuiPackage.Literals.JZ_KNOB__VALUE
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_LED)) {
			return Arrays.asList(
				new EStructuralFeature[] {
					JzmuiPackage.Literals.JZ_LED__LIGHT,
					JzmuiPackage.Literals.JZ_LED__VALUE
				}
			);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_LEMUR_MENU)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_LEMUR_MENU__SELECTION
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_LEMUR_MONITOR__VALUE
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_MULTI_BALLS)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_MULTI_BALLS__X,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__Y,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__Z,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTACK,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTRACTION,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__DECAY,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__FRICTION,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_X,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_Y,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__RELEASE,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__SPEED,
						JzmuiPackage.Literals.JZ_MULTI_BALLS__SUSTAIN
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZMULTI_SLIDER)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZMULTI_SLIDER__X,
						JzmuiPackage.Literals.JZMULTI_SLIDER__FRICTION,
						JzmuiPackage.Literals.JZMULTI_SLIDER__HEIGHT,
						JzmuiPackage.Literals.JZMULTI_SLIDER__LIGHT,
						JzmuiPackage.Literals.JZMULTI_SLIDER__TENSION
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_PADS)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_PADS__X,
						JzmuiPackage.Literals.JZ_PADS__FRICTION,
						JzmuiPackage.Literals.JZ_PADS__HEIGHT,
						JzmuiPackage.Literals.JZ_PADS__LIGHT,
						JzmuiPackage.Literals.JZ_PADS__TENSION
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_RANGE)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_RANGE__X,
						JzmuiPackage.Literals.JZ_RANGE__FRICTION,
						JzmuiPackage.Literals.JZ_RANGE__HEIGHT,
						JzmuiPackage.Literals.JZ_RANGE__LIGHT,
						JzmuiPackage.Literals.JZ_RANGE__TENSION
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_RING_AREA)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_RING_AREA__X,
						JzmuiPackage.Literals.JZ_RING_AREA__Y,
						JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION,
						JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_X,
						JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_Y,
						JzmuiPackage.Literals.JZ_RING_AREA__FRICTION,
						JzmuiPackage.Literals.JZ_RING_AREA__SPEED
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_SIGNAL_SCOPE)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__X,
						JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__Y,
						JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__TIMEBASE
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_SWITCHES)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_SWITCHES__X,
						JzmuiPackage.Literals.JZ_SWITCHES__LIGHT
					}
				);
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_TEXT)) {
			return Arrays.asList(
					new EStructuralFeature[] {
						JzmuiPackage.Literals.JZ_TEXT__LIGHT
					}
				);
		}
		return new ArrayList<EStructuralFeature>();
	}

	public EStructuralFeature getDefaultParamter(EClass clazz) {
		if (clazz.equals(JzmuiPackage.Literals.JZ_BREAK_POINT)) {
			return JzmuiPackage.Literals.JZ_BREAK_POINT__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_CUSTOM_BUTTON)) {
			return JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_FADER)) {
			return JzmuiPackage.Literals.JZ_FADER__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_KNOB)) {
			return JzmuiPackage.Literals.JZ_KNOB__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_LED)) {
			return JzmuiPackage.Literals.JZ_LED__LIGHT;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_LEMUR_MENU)) {
			return JzmuiPackage.Literals.JZ_LEMUR_MENU__SELECTION;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR)) {
			return JzmuiPackage.Literals.JZ_LEMUR_MONITOR__VALUE;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_MULTI_BALLS)) {
			return JzmuiPackage.Literals.JZ_MULTI_BALLS__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZMULTI_SLIDER)) {
			return JzmuiPackage.Literals.JZMULTI_SLIDER__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_PADS)) {
			return JzmuiPackage.Literals.JZ_PADS__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_RANGE)) {
			return JzmuiPackage.Literals.JZ_RANGE__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_RING_AREA)) {
			return JzmuiPackage.Literals.JZ_RING_AREA__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_SIGNAL_SCOPE)) {
			return JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_SWITCHES)) {
			return JzmuiPackage.Literals.JZ_SWITCHES__X;
		} else if (clazz.equals(JzmuiPackage.Literals.JZ_TEXT)) {
			return JzmuiPackage.Literals.JZ_TEXT__LIGHT;
		}
		return clazz.getEAllStructuralFeatures().isEmpty() ? null : clazz.getEAllStructuralFeatures().get(0);
	}
}
