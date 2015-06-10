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

import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.ui.ableton.widgets.GenericAbletonWidget;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

public class LinkFeedbackAbletonDeviceParamQxEventHandler extends AbstractQxEventHandlerImpl {
	
	private GenericAbletonWidget widget;
	private int idx;
	private String oscTag;
	private String pID;
	private float factor;
	
	class KnobUpdater extends UbiJob {
		LinkFeedbackAbletonDeviceParamQxEventHandler handler;
		private float value;
		public float getValue() {
			return value;
		}
		public void setValue(float value) {
			this.value = value;
		}
		public KnobUpdater(LinkFeedbackAbletonDeviceParamQxEventHandler handler) {
			super("KnobUpdater");
			setSystem(true);
			setPriority(INTERACTIVE);
			this.handler = handler;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			UbiKnob knob = widget.getKnob(pID);
			if (knob != null && !knob.isDisposed()) {
				knob.setValue(getValue());
			}
			return Status.OK_STATUS;
		}
	}
	KnobUpdater knobUpdater;
	public LinkFeedbackAbletonDeviceParamQxEventHandler(GenericAbletonWidget widget, String pId, String oscTag, int argIndex, float factor) {
		this.widget = widget;
		this.pID = pId;
		this.oscTag = oscTag;
		this.idx = argIndex;
		this.knobUpdater = new KnobUpdater(this);
		this.factor = factor;
	}
	@Override
	public synchronized void handleQxEvent(Event event) {
		if (event.getCmd() instanceof OscCmd) {
			OSCPacket packet = ((OscCmd)event.getCmd()).getMsg();
			if (packet instanceof OSCMessage) {
				OSCMessage msg = (OSCMessage) packet;
				if (this.oscTag.equals(msg.getAddress())) {
					if (msg.getArguments().length > idx) {
						if (msg.getArguments()[idx] instanceof Float) {
							knobUpdater.setValue(factor * (Float)msg.getArguments()[idx]);
							knobUpdater.schedule();
						}
					}
				}
			}
		}
	}
}
