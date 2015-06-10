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

package net.sf.smbt.ui.ableton.widgets;

import net.sf.smbt.ezabletonctrl.AbstractLiveDevice;
import net.sf.smbt.ezabletonctrl.LiveParam;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ui.ableton.actions.LinkEqChannelCommandAction;
import net.sf.smbt.ui.ableton.dialogs.AbstractDeviceWidget;
import net.sf.smbt.ui.widgets.vu.IEQValuesChangedListener;
import net.sf.smbt.ui.widgets.vu.UbiEQAdvanced;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class EQAbletonWidget extends AbstractDeviceWidget {
	private UbiEQAdvanced eq;
	private LiveTrack track;
	private AbstractLiveDevice device;
	
	private IEQValuesChangedListener valueChangeListener;
	
	public Control createControl(Composite parent, int style) {
		if (eq == null || eq.isDisposed()) {
			eq = new UbiEQAdvanced(parent, 8, false);
			eq.setLayout(GridLayoutFactory.fillDefaults().create());
			eq.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
			
			eq.addMenuAction(
				new LinkEqChannelCommandAction(eq.getEqualizer())
			);
			
			valueChangeListener = new IEQValuesChangedListener() {
				@Override
				public void valuesChanged(float freq, float gain, float resonance, int index, String channel, boolean enabled, int filterType) {
					if (track != null && device != null) {
						synchronized (device) {
							for (LiveParam p : device.getParameters()) {
								if (p.getKey() != null) {
									int offset = "A".equals(eq.getCurrentOutput()) ? 5 : 10;
									
									int i = index - 1;
									
									int sIndex = (i * 10) + offset - 2;
									int tIndex = (i * 10) + offset - 1;
									int fIndex = (i * 10) + offset;
									int gIndex = (i * 10) + offset + 1;
									int rIndex = (i * 10) + offset + 2;
									
									if (p.getKey().equals("" + fIndex)) {
										if (!new Float(freq).equals(Float.NaN)) {
											p.setValue(""+freq);
										}
									} else if (p.getKey().equals("" + gIndex)) {
										if (!new Float(gain).equals(Float.NaN)) {
											p.setValue(""+(1f - gain));
										}
									} else if (p.getKey().equals("" + rIndex)) {
										if (!new Float(resonance).equals(Float.NaN)) {
											p.setValue(""+resonance);
										}
									} else if (p.getKey().equals("" + sIndex)) {
										p.setValue(enabled ? "1.0" : "0.0");
									} else if (p.getKey().equals("" + tIndex)) {
										//p.setValue(""+new Float(filterType));
									}
									
									i++;
								}
							}
						}
					}
				}
			};
		}
		return eq;
	}
	
	@Override
	public void disposeControl(Composite parent, int style) {
		eq.dispose();
		eq = null;
	}
	
	@Override
	public void redraw() {
		if (eq == null || eq.isDisposed()) {
			eq.layout(true);
			eq.redraw();
		}		
	}

	@Override
	public String getID() {
		return "EQ Eight";
	}

	public void setFilterType(int filterID) {
		eq.setCurrentFilterType(filterID);
	}
	
/**
 * 
 * [0, 1.0, 0.0, 1.0, java.lang.Float, Device On]
 * [1, 0.0, -12.0, 12.0, java.lang.Float, Output Gain] 
 * 
 * [2, 1.0, 0.0, 2.0, java.lang.Float, Scale]
 * 
 * -------------------------------------------------------------------
 * [3, 1.0, 0.0, 1.0, java.lang.Float, 1 Filter On A]
 * [4, 0.0, 0.0, 5.0, java.lang.Float, 1 Filter Type A]
 * [5, 0.3815029, 0.0, 1.0, java.lang.Float, 1 Frequency A]
 * [6, 0.0, -15.0, 15.0, java.lang .Float, 1 Gain A]
 * [7, 0.46721312, 0.0, 1.0, java.lang.Float, 1 Resonance A]
 * 
 * [8, 1.0, 0.0, 1.0, java.lang.Float, 1 Filter On B]
 * [9, 2.0, 0.0, 5.0, java.lang.Float, 1 Filter Type B]
 * [10, 0.1824865, 0.0, 1.0, java.lang.Float, 1 Frequency B]
 * [11, 0.0, -15.0, 15.0, java.lang.Float, 1 Gain B]
 * [12, 0.37666625, 0.0, 1.0, java.lang.Float, 1 Resonance B]
 * -------------------------------------------------------------------
 * 
 * 
 */
	@Override
	public void init(final LiveTrack track, final AbstractLiveDevice device) {
		this.track = track;
		this.device = device;
		if (eq != null && !eq.isDisposed()) {
			if (!eq.getValuesChangeListenr().contains(valueChangeListener)) {
				eq.addValuesChangesListener(valueChangeListener);
			}
			//eq.clearAll();
			for (LiveParam p : device.getParameters()) {
				String v	= p.getValue();
				String min	= p.getMin();
				String max	= p.getMax();
				String t	= p.getType();
				String n	= p.getName();
				
				if (Float.class.getCanonicalName().equals(t)) {
					Float f = Float.parseFloat(v!=null && v!="" ? v : "0f");
					Float minF = Float.parseFloat(min);
					Float maxF = Float.parseFloat(max);
					Float fVal = new Float(1 - (maxF - f) / (maxF - minF));
					
					if (n != null && n != "") {
						if (n.contains("Output Gain")) {
							eq.setOutputGainMin(minF.intValue());
							eq.setOutputGainMax(maxF.intValue());
							continue;
						} else if (n.contains("Device On")) {
							continue;
						} else if (n.contains("Scale")) {
							continue;
						}
				
						String output = n.endsWith(" A") ? "A" : "B";
						int idx = new Float(Float.parseFloat(n.split(" ")[0])).intValue();
						if (n.contains("Resonance")) {
							eq.setResonance(output+idx, fVal);
						}  else if (n.contains("Gain")) {
							eq.setGain(output+idx, 1f - fVal);
						} else if (n.contains("Frequency")) {
							eq.setFrequence(output+idx, fVal);
						}  else if (n.contains("Filter On")) {
							eq.setFilterOn(output+idx, fVal>0, false);
						} /* else if (n.contains("Filter Type")) {
							eq.setFilterType(output, idx, fVal.intValue());
						} */
					}
				}
			}
		}
	}
	
	
	@Override
	public void refresh(LiveTrack track, AbstractLiveDevice device) {
		init(track, device);
		eq.redraw();
	}
}
