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
import net.sf.smbt.ui.ableton.dialogs.AbstractDeviceWidget;
import net.sf.smbt.ui.widgets.vu.UbiEQ;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class DarkSmallRoomAbletonWidget extends AbstractDeviceWidget {
	private UbiEQ eq;
	public Control createControl(Composite parent, int style) {
		if (eq == null || eq.isDisposed()) {
			eq = new UbiEQ(parent, SWT.NONE);
			eq.setLayout(GridLayoutFactory.fillDefaults().create());
			eq.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		}
//		getDevice().getParameters();
		
		return eq;
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
	
/**
 * 
 * 0 : rnage h
 * 1 : range h (-12 +12)
 * 
 * 2 : range (0 2)
 * 3 : range 0 1
 * 
 */
	@Override
	@SuppressWarnings("unused")
	public void init(LiveTrack track, AbstractLiveDevice device) {
		if (eq != null && !eq.isDisposed()) {
			//eq.clearAll();
			for (LiveParam p : device.getParameters()) {
				String k	= p.getKey();
				String v	= p.getValue();
				String min	= p.getMin();
				String max	= p.getMax();
				String t	= p.getType();
				String n	= p.getName();
				
				Integer key = Integer.parseInt(k);
				if (Float.class.getCanonicalName().equals(t)) {
					if (v != null) {
						Float f = Float.parseFloat(v);
						if (n.contains("Gain")) {
							//eq.setGain(key, new Float(f));
						} else if (n.contains("Reson")) {
							//eq.setFrequence(key, new Float(f));
						}
					}
				} else if (Integer.class.getCanonicalName().equals(t)){
					Integer i = Integer.parseInt(v);
					//eq.setGain(key, new Float(i));
				}
				
				boolean dummy = true;
			}
		}
	}
	
	
	@Override
	@SuppressWarnings("unused")
	public void refresh(LiveTrack track, AbstractLiveDevice device) {
		for (LiveParam p : device.getParameters()) {
			String k	= p.getKey();
			String v	= p.getValue();
			String min	= p.getMin();
			String max	= p.getMax();
			String t	= p.getType();
			String n	= p.getName();
			
			//eq.setPoint();
		}

		eq.redraw();
	}
}
