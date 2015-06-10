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

package net.sf.smbt.osc.script.utils;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ezmojo.EZCmdKind;
import net.sf.smbt.ezmojo.EZMojoAgentCmd;
import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.osc.oscDsl.EzMsg;
import net.sf.smbt.osc.oscDsl.EzMsgBang;
import net.sf.smbt.osc.oscDsl.EzMsgBind;
import net.sf.smbt.osc.oscDsl.EzMsgClock;
import net.sf.smbt.osc.oscDsl.EzMsgForward;
import net.sf.smbt.osc.oscDsl.EzMsgKinematics;
import net.sf.smbt.osc.oscDsl.EzMsgLegacySet;
import net.sf.smbt.osc.oscDsl.EzMsgListen;
import net.sf.smbt.osc.oscDsl.EzMsgRemove;
import net.sf.smbt.osc.oscDsl.EzMsgSet;
import net.sf.smbt.osc.oscDsl.EzMsgUnforward;
import net.sf.smbt.osc.oscDsl.EzMsgUnlisten;
import net.sf.smbt.osc.oscDsl.OSCBluetoothTarget;
import net.sf.smbt.osc.oscDsl.OSCExpr;
import net.sf.smbt.osc.oscDsl.OSCHttpTarget;
import net.sf.smbt.osc.oscDsl.OSCTCPTarget;
import net.sf.smbt.osc.oscDsl.OSCUDPTarget;
import net.sf.smbt.osc.oscDsl.OSCUSBTarget;
import net.sf.smbt.osc.oscDsl.OSCUbqTarget;
import net.sf.smbt.osc.oscDsl.OSCXBeeTarget;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EObject;

import com.illposed.osc.OSCMessage;

public class OSCDumpUtils {
	
	public final static OSCDumpUtils INSTANCE= new OSCDumpUtils();
	
	public EZMojoCmd DumpEzMsgAsEzMojoCmd(EzMsg msg) {
		EObject m = msg.getMsg();
		OSCExpr expr = null;
		EZMojoKind kind = EZMojoKind.NONE;
		if (m instanceof EzMsgSet) {
			expr = ((EzMsgSet)m).getCmd();
			kind = EZMojoKind.SET;
		} else if (m instanceof EzMsgLegacySet) {
			expr = ((EzMsgLegacySet)m).getCmd();
			kind = EZMojoKind.LEGACY_SET;
		} else if (m instanceof EzMsgRemove) {
			expr = ((EzMsgRemove)m).getCmd();
			kind = EZMojoKind.UNSET;
		} else if (m instanceof EzMsgBind) {
			expr = ((EzMsgBind)m).getCmd();
			kind = EZMojoKind.BIND;
		} else if (m instanceof EzMsgListen) {
			expr = ((EzMsgListen)m).getCmd();
			kind = EZMojoKind.LISTEN;
		} else if (m instanceof EzMsgUnlisten) {
			expr = ((EzMsgUnlisten)m).getCmd();
			kind = EZMojoKind.UNLISTEN;
		} else if (m instanceof EzMsgForward) {
			expr = ((EzMsgForward)m).getCmd();
			kind = EZMojoKind.FORWARD;
		} else if (m instanceof EzMsgUnforward) {
			expr = ((EzMsgUnforward)m).getCmd();
			kind = EZMojoKind.UNFORWARD;
		} else if (m instanceof EzMsgBang) {
			expr = ((EzMsgBang)m).getCmd();
			kind = EZMojoKind.BANG;
		} else if (m instanceof EzMsgClock) {
			expr = ((EzMsgClock)m).getCmd();
			kind = EZMojoKind.CLOCK;
		} else if (m instanceof EzMsgKinematics) {
			expr = ((EzMsgKinematics)m).getCmd();
			kind = EZMojoKind.KINEMATICS;
		}
		return (EZMojoCmd) createEzCmd(kind, expr);
	}
	
	public List<EZMojoTarget> createEzMojoTarget(OSCExpr expr) {
		List<EZMojoTarget> targets = new ArrayList<EZMojoTarget>();
		for (EObject target : expr.getTargets()) {
			EZMojoTarget ezTarget = EzmojoFactory.eINSTANCE.createEZMojoTarget();
			if (target instanceof OSCUSBTarget) {
				OSCUSBTarget usb = (OSCUSBTarget) target;
				ezTarget.setAddr(usb.getAddr());
				ezTarget.setSpeed(new Integer(usb.getAddr()).intValue());
				ezTarget.setProtocolID(usb.getFormat().getLiteral());
				ezTarget.setTransportID(TRANSPORT_PROTOCOL.USB.getLiteral());
			} else if (target instanceof OSCTCPTarget) {
				OSCTCPTarget tcp = (OSCTCPTarget) target;
				ezTarget.setAddr(tcp.getAddr());
				ezTarget.setProtocolID(tcp.getFormat().getLiteral());
				ezTarget.setTransportID(TRANSPORT_PROTOCOL.TCP.getLiteral());
			} else if (target instanceof OSCUDPTarget) {
				OSCUDPTarget udp = (OSCUDPTarget) target;
				ezTarget.setAddr(udp.getAddr());
				ezTarget.setProtocolID(udp.getFormat().getLiteral());
				ezTarget.setTransportID(TRANSPORT_PROTOCOL.UDP.getLiteral());
			} else if (target instanceof OSCXBeeTarget) {
				OSCXBeeTarget xbee = (OSCXBeeTarget) target;
				ezTarget.setAddr(xbee.getAddr());
				ezTarget.setProtocolID(xbee.getFormat().getLiteral());
				ezTarget.setTransportID(TRANSPORT_PROTOCOL.XBEE.getLiteral());
			} else if (target instanceof OSCHttpTarget) {
				OSCHttpTarget http = (OSCHttpTarget) target;
				ezTarget.setAddr(http.getAddr());
				ezTarget.setSpeed(new Integer(http.getAddr()).intValue());
				ezTarget.setProtocolID(http.getFormat().getLiteral());
				ezTarget.setTransportID(TRANSPORT_PROTOCOL.HTTP.getLiteral());
			} else if (target instanceof OSCUbqTarget) {
				OSCUbqTarget ubq = (OSCUbqTarget) target;
				ezTarget.setAddr(ubq.getAddr());
				ezTarget.setProtocolID(ubq.getFormat().getLiteral());
				ezTarget.setTransportID(TRANSPORT_PROTOCOL.MIDI.getLiteral());
			} else if (target instanceof OSCBluetoothTarget) {
				OSCBluetoothTarget bluetooth = (OSCBluetoothTarget) target;
				ezTarget.setAddr(bluetooth.getAddr());
				ezTarget.setSpeed(new Integer(bluetooth.getAddr()).intValue());
				ezTarget.setProtocolID(bluetooth.getFormat().getLiteral());
				ezTarget.setTransportID(TRANSPORT_PROTOCOL.BLUETOOTH.getLiteral());
			}
			targets.add(ezTarget);
		}
		return targets;
	}
	
	public OscCmd createOscCmd(OSCExpr expr) {
		List<Object> args = new ArrayList<Object>();
		for (String arg : expr.getArgs()) {
			if (arg.equals("T") ) {
				args.add(new Boolean(true));
			} else if (arg.equals("F")) {
				args.add(new Boolean(false));
			} else if (arg.endsWith("i")) {
				args.add(new Integer(arg.substring(0, arg.indexOf("i"))));
			} else if (arg.endsWith("f")) {
				args.add(new Float(arg.substring(0, arg.indexOf("f"))));
			} else if (arg.endsWith("d")) {
				args.add(new Double(arg));
			} else if (arg.equals("I")) {
				throw new UnsupportedOperationException();
			} else if (arg.equals("t")) {
				throw new UnsupportedOperationException();
			} else if (arg.equals("N")) {
				args.add(null);
			} else if (arg.equals("h")) {
				throw new UnsupportedOperationException();
			}  else if (arg.equals("b")) {
				throw new UnsupportedOperationException();
			} else if (arg.startsWith("0x")) {
				throw new UnsupportedOperationException();
			} else if (arg.startsWith("\"") && arg.endsWith("\"")) {
				arg = arg.substring(1);
				arg = arg.substring(0, arg.length()-1);
				args.add(new String	(arg));
			} else {
				throw new UnsupportedOperationException();
			}
		}
		return args.isEmpty() ? 
				OscCmdUtils.INSTANCE.createOscCmd(expr.getPath()) : 
					OscCmdUtils.INSTANCE.createOscCmd(expr.getPath(), args.toArray());
	}
	
	public Cmd createEzCmd(EZMojoKind kind, OSCExpr expr) {
		EZMojoCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
		cmd.setKind(kind);
		cmd.setOsc(createOscCmd(expr));
		cmd.getTargets().addAll(createEzMojoTarget(expr));
		
		handleEzCmdArgs(cmd, expr);
		return (Cmd) cmd;
	}

	public void handleEzCmdArgs(EZMojoCmd cmd, OSCExpr expr) {
		OSCMessage msg = (OSCMessage) cmd.getOsc().getMsg();
		switch (cmd.getKind()) {
			case FORWARD: 
			case UNFORWARD:
				handleTargets(msg, expr);
				break;
		}
	}

	public Cmd createEzAgentCmd(EZMojoKind kind, EZCmdKind cmdKind, OSCExpr expr) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setKind(kind);
		cmd.setCmd(cmdKind);
		cmd.setOsc(createOscCmd(expr));
		cmd.getTargets().addAll(createEzMojoTarget(expr));
		
		handleEzMojoAgentCmdArgs(cmd, expr);
		
		return (Cmd) cmd;
	}

	public void handleEzMojoAgentCmdArgs(EZMojoAgentCmd cmd, OSCExpr expr) {
		OSCMessage msg = (OSCMessage) cmd.getOsc().getMsg();
		switch (cmd.getCmd()) {
			case HOOK: 
				msg.addArgument(EZCmdKind.HOOK.getLiteral().substring(1));
				handleTargets(msg, expr);
				break;
			case UNHOOK:
				msg.addArgument(EZCmdKind.UNHOOK.getLiteral().substring(1));
				handleTargets(msg, expr);
				break;
		}
	}
	
	
	public void handleTargets(OSCMessage msg, OSCExpr expr) {
		if (!expr.getTargets().isEmpty()) {
			EObject t = expr.getTargets().get(0);
			if (t instanceof OSCUDPTarget) {
				String addr = ((OSCUDPTarget)t).getAddr();
				if (addr.startsWith(":")) {
					addr = "localhost" + addr;
				}
				if (addr.contains(":")) {
					String[] tk = addr.split(":");
					msg.addArgument(tk[0]);
					msg.addArgument(":"+tk[1]);
				} else {
					msg.addArgument(addr);
					msg.addArgument("");
				}
				msg.addArgument(((OSCUDPTarget)t).getProto());
				msg.addArgument(((OSCUDPTarget)t).getFormat().getLiteral());
				msg.addArgument("-1");
			} else if (t instanceof OSCTCPTarget) {
				String addr = ((OSCTCPTarget)t).getAddr();
				if (addr.startsWith(":")) {
					addr = "localhost" + addr;
				}
				if (addr.contains(":")) {
					String[] tk = addr.split(":");
					msg.addArgument(tk[0]);
					msg.addArgument(":"+tk[1]);
				} else {
					msg.addArgument(addr);
					msg.addArgument("");
				}
				msg.addArgument(((OSCTCPTarget)t).getProto());
				msg.addArgument(((OSCTCPTarget)t).getFormat().getLiteral());
				msg.addArgument("-1");
			} else if (t instanceof OSCUSBTarget) {
				msg.addArgument(((OSCUSBTarget)t).getAddr());
				msg.addArgument("");
				msg.addArgument(((OSCUSBTarget)t).getProto());
				msg.addArgument(((OSCUSBTarget)t).getFormat().getLiteral());
				msg.addArgument(((OSCUSBTarget)t).getSpeed() + "");
			} else {
				throw new UnsupportedOperationException(t.getClass().getCanonicalName() + " Target not supported yet !!!");
			}
		}
	}
}
