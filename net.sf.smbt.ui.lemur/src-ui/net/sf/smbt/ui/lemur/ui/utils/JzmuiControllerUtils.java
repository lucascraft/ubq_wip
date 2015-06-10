/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
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

package net.sf.smbt.ui.lemur.ui.utils;

import net.sf.smbt.ezlemur.LemurOscCmd;
import net.sf.smbt.jzmui.JZContainer;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.JZWidget;
import net.sf.smbt.jzmui.JzOscTarget;
import net.sf.smbt.jzmui.JzmuiFactory;
import net.sf.smbt.jzmui.LemurIncomingPorts;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.smbt.jzmui.LemurPreferences;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.lemur.Activator;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.preference.IPreferenceStore;

import com.illposed.osc.OSCMessage;

public class JzmuiControllerUtils {
	public final static JzmuiControllerUtils INSTANCE = new JzmuiControllerUtils();
	
	public void hookAdapters(LemurLiveApp lemur) {
		for (JZUIElem uiElem : lemur.getElements()) {
			hookAdapters(lemur, uiElem);
		}
	}
	
	private void hookAdapters(LemurLiveApp lemur, JZUIElem uiElem) {
		if (uiElem instanceof JZContainer) {
			for (JZUIElem e : ((JZContainer)uiElem).getChildren()) {
				hookAdapters(lemur, e);
			}
		} else {
			initAdapters(lemur, (JZWidget) uiElem);
		}
	}

	private CmdPipe getCmdEngineFromTargetID(LemurLiveApp lemur, String targetID) {
		for (CmdPipe e : lemur.getEngines()) {
			if (e.getId().endsWith(targetID)) {
				return e;
			}
		}
		return null;
	}
	
	private void initAdapters(final LemurLiveApp lemur, final JZWidget e) {
		e.eAdapters().add(
			new AdapterImpl(){
				public void notifyChanged(org.eclipse.emf.common.notify.Notification msg) {
	/*				for (OSCDynaProperties p : e.getOscProperties()) {
						if (msg.getFeature().equals(p.getEStructuralFeature())) {
							CmdPipe engine = getCmdEngineFromTargetID(lemur, "OSC" + p.getTarget());
							if (engine != null) {
								LemurOscCmd cmd = p.getOscMsg();
								if (cmd != null) {
									cmd.setMsg(
										new OSCMessage(
												((OSCMessage)cmd.getMsg()).getAddress(), 
											new Object[]{ msg.getNewValue() }
										)
									);
									engine.send(cmd);
								}
							}
						}
					}
					*/
				};
			}
		);
		
/*		
		//
		// 
		//
		for (MidiDynaProperties p : e.getMidiProperties()) {
			// FIXME : Later ...
		}
		
		//
		// 
		//
		for (KBDynaProperties p : e.getKbProperties()) {
			// FIXME : Later ...
		}
		
		//
		// 
		//
		for (DMXDynaProperties p : e.getDmxProperties()) {
			// FIXME : Later ...
		}
*/
	}
	
	public void handleOscFeedback(JZUIElem elem, String addr, Object[] args) {
/*		for (OSCDynaProperties p : elem.getOscProperties()) {
			if (((OSCMessage)p.getOscMsg().getMsg()).getAddress().equals(addr)) {
				String param = addr.substring(addr.lastIndexOf("/"));
				EStructuralFeature feature = elem.eClass().getEStructuralFeature(param);
				if (feature != null) {
					if (args.length > 0) {
						synchronized (elem) {
							boolean deliver = elem.eDeliver();
							if (deliver) {
								elem.eSetDeliver(false);
							}
							elem.eSet(feature, args[0]);
							elem.eSetDeliver(deliver);
						}
					}
				}
			}
		}*/
	}

	public void handleLemurOscCmd(JZUIElem elem, OscCmd cmd) {
		String addr = ((OSCMessage)cmd.getMsg()).getAddress();
		Object[] args = ((OSCMessage)cmd.getMsg()).getArguments();
		if (elem instanceof JZContainer) {
			for (JZUIElem e : ((JZContainer)elem).getChildren()) {
				handleLemurOscCmd(e, cmd);
			}
		} else if (elem instanceof JZUIElem) {
			handleOscFeedback(elem, addr, args);
		} else {
			// Impossible
		}
	}
	
	public void handleLemurOscCmd(LemurLiveApp lemur, Cmd cmd) {
		for (JZUIElem elem : lemur.getElements()) {
			handleLemurOscCmd(elem, (OscCmd) cmd);
		}
	}
	
	/**
	 * Initialization for OSC / Midi ( /Keyboard ...)
	 * 
	 * @param lemur controller UI model
	 */
	public void initConnections(final LemurLiveApp lemur) {
		IPreferenceStore prefs= Activator.getDefault().getPreferenceStore();
		
		for (LemurPreferences pref : LemurPreferences.VALUES) {
			JzOscTarget oscTarget = JzmuiFactory.eINSTANCE.createJzOscTarget();
			oscTarget.setId("OSC" + pref.getValue());
			oscTarget.setAddr(prefs.getString(pref.getLiteral()));
			for (LemurIncomingPorts p : LemurIncomingPorts.VALUES) {
				if (p.getLiteral().contains("OSC" + pref.getValue())) {
					for (String port : prefs.getString(p.getLiteral()).split(",")) {
						oscTarget.getIncomingPorts().add(Integer.parseInt(port));
						lemur.getConfigurations().getOscTargets().add(oscTarget);
					}
				}
			}
		}
		
		int oscIdx = 0;
		for (JzOscTarget oscTarget : lemur.getConfigurations().getOscTargets()) {
			int[] incomingPorts = new int[oscTarget.getIncomingPorts().size()];
			int i = 0;
			for (Integer port : oscTarget.getIncomingPorts()) {
				incomingPorts[i] = port;
				i++;
			}
			
			CmdPipe engine = QuanticMojo.INSTANCE.openUdpPipe(
				"osc", 
				"OSC" + oscIdx, 
				oscTarget.getAddr(), 
				incomingPorts
			);

			lemur.getEngines().add(engine);
			engine.addQxEventHandler(
				new AbstractQxEventHandlerImpl() {
					public void handleQxEvent(net.sf.xqz.model.engine.Event event) {
						if (event.getCmd() instanceof LemurOscCmd) {
							if (event.getKind() == EVENT_KIND.RX_DONE) {
								handleLemurOscCmd(lemur, event.getCmd());
							}
						} else if (event.getCmd() instanceof OscCmd) {
							System.out.println(event.getCmd());
						}
					};
				}
			);
			
			oscIdx++;
		}
/*
		int midiIdx = 0;
		for (JzMidiTarget midiTarget : lemur.getConfigurations().getMidiTargets()) {
			int[] incomingPorts = new int[midiTarget.getIncomingPorts().size()];
			int i = 0;
			for (Integer port : midiTarget.getIncomingPorts()) {
				incomingPorts[i] = port;
				i++;
			}
			CmdEngine midiEngine = QuanticMojo.INSTANCE.openUdpPipe(
				COMM_PROTOCOL.MIDI, 
				"" + midiIdx, 
				midiTarget.getAddr(), 
				incomingPorts
			);
			midiIdx++;
			
			lemur.getEngine().add(midiEngine);
		}
*/
		// FIXME : see the Midi, DMX & Keyboard later on w/ potential GMF replacement for Lemur JazzEditor for more polyvalence
	}
}

