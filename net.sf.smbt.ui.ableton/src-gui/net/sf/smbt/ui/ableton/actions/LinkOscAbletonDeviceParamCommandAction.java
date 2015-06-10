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

package net.sf.smbt.ui.ableton.actions;

import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZVar;
import net.sf.smbt.osc.ezmojo.utils.EzMojoCmdUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.ableton.widgets.GenericAbletonWidget;
import net.sf.smbt.ui.dialogs.LinkMessagesSelectionDialog;
import net.sf.smbt.ui.widgets.vu.UbiKnob;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;

public class LinkOscAbletonDeviceParamCommandAction extends AbstractLinkCommandAction {
	private GenericAbletonWidget widget;
	private String paramID;
	public LinkOscAbletonDeviceParamCommandAction(GenericAbletonWidget widget, String paramID) {
		super("Link OSC");
		this.widget = widget;
		this.paramID = paramID;
	}

	@Override
	public void run() {
		float max = 1f;
		UbiKnob knob = widget.getKnob(paramID);
		if (knob != null && !knob.isDisposed()) {
			max = knob.getMax();
		}

		LinkMessagesSelectionDialog dlg = new LinkMessagesSelectionDialog(
			Display.getDefault().getActiveShell(), 
			"Select OSC Messages", 
			"Select OSC Messages",
			max
		);
		int status = dlg.open();
		
		if (status == Window.OK) {
			Object[] obj = dlg.getResult();
			if (obj != null && obj.length > 1) {
				Object o = obj[1];
				Float factor = (Float) obj[0];
				if (o instanceof EZVar) {
					final EZVar v		= (EZVar) o;
					final int idx		= ((EZMojoNode)v.eContainer()).getVars().indexOf(v);
					final String oscTag = EzMojoCmdUtils.INSTANCE.getOscAddr((EZMojoNode)v.eContainer());
					
					if (oscTag != null && oscTag.startsWith("/")) {
						QuanticMojo.INSTANCE.subscribe("osc",
							oscTag, 
							new LinkFeedbackAbletonDeviceParamQxEventHandler(
								widget, 
								paramID, 
								oscTag, 
								idx, 
								factor
							)
						); 
					}
				}
			}
		}
	}
}
