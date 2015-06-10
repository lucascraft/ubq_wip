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
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ui.ableton.dialogs.AbstractDeviceWidget;
import net.sf.smbt.ui.widgets.vu.UbiEQ;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class AmbienceAbletonWidget extends AbstractDeviceWidget {

	@Override
	public String getID() {
		return "Ambience";
	}
	private UbiEQ eq;
	@Override
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
	public void refresh(LiveTrack track, AbstractLiveDevice device) {
		// TODO Auto-generated method stub

	}

}
