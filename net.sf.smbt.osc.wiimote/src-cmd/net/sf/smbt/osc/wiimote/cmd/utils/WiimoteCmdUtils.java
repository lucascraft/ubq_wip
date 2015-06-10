/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

package net.sf.smbt.osc.wiimote.cmd.utils;

import java.util.HashMap;

import net.sf.smbt.ezwiimote.WiiAccelEvt;
import net.sf.smbt.ezwiimote.WiiCmd;
import net.sf.smbt.ezwiimote.WiiCoreButtonEvt;
import net.sf.smbt.ezwiimote.WiiDataEvt;
import net.sf.smbt.ezwiimote.WiiExtEvt;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteFactory;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.OscRcvCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

/**
 * Translate osc messages to valuated {@link OscRcvCmd} instances.
 * 
 * @author lucas
 *
 */
public class WiimoteCmdUtils {
	/** SINGLETON */
	public final static WiimoteCmdUtils INSTANCE = new WiimoteCmdUtils();
	
	private HashMap<String, HashMap<EStructuralFeature, Float>> dynValues;
	
	public final static Float F255 = new Float(255);
	public final static Float F_MINUS_ONE = new Float(-1);
	
	/**
	 * Constructor
	 * 
	 */
	public WiimoteCmdUtils() {
		dynValues = new HashMap<String, HashMap<EStructuralFeature, Float>>();
	}

	/**
	 * Dynamic values meta setting according to existing previous values and current new one
	 * 
	 * @param key global function key
	 * @param feature {@link EStructuralFeature} feature to set the value to
	 * @param cmd {@link Cmd} reference to which {@link EStructuralFeature} feature belongs
	 * @param value the {@link Float} value to set
	 */
	private void dynValuesUpdate(String wiiid, String key, EStructuralFeature feature, Cmd cmd, Float value) {
		String funcId = wiiid + key;
		if (!dynValues.containsKey(funcId)) {
			dynValues.put(funcId, new HashMap<EStructuralFeature, Float>());
		}
		if (dynValues.get(funcId).containsKey(feature) ) {
			if (!dynValues.get(funcId).get(feature).equals(value)) {
				dynValues.get(funcId).put(feature, value);
			}
		}
		
		for (EStructuralFeature feat : cmd.eClass().getEAllAttributes()) {
			if (feat.getEType().getInstanceClassName().equals("float")) {
				if (dynValues.get(funcId).containsKey(feat)) {
					cmd.eSet(feat, dynValues.get(funcId).get(feat));
				} else {
					dynValues.get(funcId).put(feat, new Float(-1));
					cmd.eSet(feat, dynValues.get(funcId).get(feat));
				}
			}
		}
	}

	/**
	 * Creates a {@link Cmd} from received {@link OSCMessage}
	 * 
	 * @param packet a received datagram {@link OSCPacket}
	 * 
	 * @return {@link Cmd} which a fraction is sat w/ current value
	 */
	public Cmd createWiimoteCmdFromOSCMsg(OSCMessage packet) {
		if (packet == null ||packet.getAddress() == null || packet.getAddress().equals("")) return null;
		
		String addr = packet.getAddress();
		String wiiidStr = "";
		
		if (addr != null && addr.startsWith("/wii/")) {
			int idx = addr.indexOf("/wii/");
			wiiidStr = addr.substring(idx+5, idx+6); // Assuming we just got max 9 wiimotes
		}
		
		Object obj = packet.getArguments().length > 0 ? packet.getArguments()[0] : null;
		
		Float val = -1f;
		
		if (obj instanceof Float) { 
			val = (Float) packet.getArguments()[0] ;
		} else if (obj instanceof Integer) {
			val = new Float((Integer) packet.getArguments()[0]);
		}
		
		return createWiimoteCmdFromArgs(wiiidStr, addr, val);
	}
	
	private Float computeVal(float v, boolean maxOne) {
		return maxOne ? new Float(v / F255.floatValue()): new Float(v);
	}
	
	public OscCmd createOscCmdFromWiiEvt(WiiCmd cmd, int wiiNum, boolean maxOne) {
		OSCMessage msg = null;
		if (cmd instanceof WiiAccelPryCmd) {
			msg = new OSCMessage("/wii/"+wiiNum+"/accel/pry");
			msg.addArgument(computeVal(((WiiAccelPryCmd)cmd).getPitch(), maxOne));
			msg.addArgument(computeVal(((WiiAccelPryCmd)cmd).getRoll(), maxOne));
			msg.addArgument(computeVal(((WiiAccelPryCmd)cmd).getYaw(), maxOne));
			msg.addArgument(computeVal(((WiiAccelPryCmd)cmd).getAccel(), maxOne));
		} else if (cmd instanceof WiiAccelEvt) {
			msg = new OSCMessage("/wii/"+wiiNum+"/accel/xyz");
			msg.addArgument(computeVal(((WiiAccelEvt)cmd).getX(), maxOne));
			msg.addArgument(computeVal(((WiiAccelEvt)cmd).getY(), maxOne));
			msg.addArgument(computeVal(((WiiAccelEvt)cmd).getZ(), maxOne));
		} else if (cmd instanceof WiiCoreButtonEvt) {
			if (((WiiCoreButtonEvt)cmd).isButtonAPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/A");
			} else if (((WiiCoreButtonEvt)cmd).isButtonBPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/B");
			} else if (((WiiCoreButtonEvt)cmd).isButtonHomePressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/Home");
			} else if (((WiiCoreButtonEvt)cmd).isButtonMinusPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/Minus");
			} else if (((WiiCoreButtonEvt)cmd).isButtonPlusPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/Plus");
			} else if (((WiiCoreButtonEvt)cmd).isButtonOnePressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/1");
			} else if (((WiiCoreButtonEvt)cmd).isButtonTwoPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/2");
			} else if (((WiiCoreButtonEvt)cmd).isButtonPadLeftPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/Left");
			} else if (((WiiCoreButtonEvt)cmd).isButtonPadDownPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/Down");
			} else if (((WiiCoreButtonEvt)cmd).isButtonPadRightPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/Right");
			} else if (((WiiCoreButtonEvt)cmd).isButtonPadUpPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/Up");
			} else if (((WiiCoreButtonEvt)cmd).isButtonNoPressed()) {
				msg = new OSCMessage("/wii/"+wiiNum+"/button/No");
			}
		} else if (cmd instanceof WiiDataEvt) {
			// Dig into extension stuff !!!!!!!!!!!!!!
		} else if (cmd instanceof WiiExtEvt) {
			// Dig into extension stuff !!!!!!!!!!!!!!
		}

		return (OscCmd) OscCmdUtils.INSTANCE.createOscCmd(msg);
	}
	
	/*
	public void handleWiimoteControllerFromWiiCmd(WiimoteController ctrl, WiiCmd cmd) {
		WiimoteLiveSettings settings = ctrl.getProperties();
		if (settings == null) {
			settings = WiimoteFactory.eINSTANCE.createWiimoteLiveSettings();
			
			settings.setAccelPRY(WiimoteFactory.eINSTANCE.createWiiAccelPryCmd());
			
			settings.setAccelXYZ(WiimoteFactory.eINSTANCE.createWiiAccelXYZCmd());
			
			List<WiiButtonCmd> lstButtons = new ArrayList<WiiButtonCmd>();
			for (WiimoteButtonKind k : WiimoteButtonKind.values()) {
				WiiButtonCmd bCmd = WiimoteFactory.eINSTANCE.createWiiButtonCmd();
				bCmd.setKind(k);
				lstButtons.add(bCmd);
			}
			settings.getWiiButtons().addAll(lstButtons);
			ctrl.setProperties(settings);
		}
		if (cmd instanceof WiiMultiCmd) {
			for (Cmd c : ((WiiMultiCmd)cmd).getChildren()) {
				handleWiimoteControllerFromWiiCmd(ctrl, (WiiCmd)c);
			}
		} else if (cmd instanceof WiiAccelPryCmd) {
			settings.getAccelPRY().setPitch(new Float(((WiiAccelPryCmd)cmd).getPitch()));
			settings.getAccelPRY().setRoll(new Float(((WiiAccelPryCmd)cmd).getRoll()));
			settings.getAccelPRY().setYaw(new Float(((WiiAccelPryCmd)cmd).getYaw()));
			settings.getAccelPRY().setAccel(new Float(((WiiAccelPryCmd)cmd).getAccel()));
		} else if (cmd instanceof WiiAccelEvt) {
			settings.getAccelXYZ().setX(new Float(((WiiAccelEvt)cmd).getX()));
			settings.getAccelXYZ().setY(new Float(((WiiAccelEvt)cmd).getY()));
			settings.getAccelXYZ().setZ(new Float(((WiiAccelEvt)cmd).getZ()));
		} else if (cmd instanceof WiiCoreButtonEvt) {
			for (WiiButtonCmd button : settings.getWiiButtons()) {
				int val = new Float(button.getToggle()).intValue();
				if (button.getKind().equals(WiimoteButtonKind.A)) {
					((WiiCoreButtonEvt)cmd).setBUTTON_A(val);
				} else if (button.getKind().equals(WiimoteButtonKind.B)) {
					((WiiCoreButtonEvt)cmd).setBUTTON_B(val);
				} else if (button.getKind().equals(WiimoteButtonKind.HOME)) {
					((WiiCoreButtonEvt)cmd).setBUTTON_HOME(val);
				} else if (button.getKind().equals(WiimoteButtonKind.MINUS)) {
					((WiiCoreButtonEvt)cmd).setBUTTON_MINUS(val);
				} else if (button.getKind().equals(WiimoteButtonKind.PLUS)) {
					((WiiCoreButtonEvt)cmd).setBUTTON_PLUS(val);
				} else if (button.getKind().equals(WiimoteButtonKind.ONE)) {
					((WiiCoreButtonEvt)cmd).setBUTTON_ONE(val);
				} else if (button.getKind().equals(WiimoteButtonKind.TWO)) {
					((WiiCoreButtonEvt)cmd).setBUTTON_TWO(val);
				} else if (button.getKind().equals(WiimoteButtonKind.LEFT)) {
					((WiiCoreButtonEvt)cmd).setD_PAD_LEFT(val);
				} else if (button.getKind().equals(WiimoteButtonKind.RIGHT)) {
					((WiiCoreButtonEvt)cmd).setD_PAD_RIGHT(val);
				} else if (button.getKind().equals(WiimoteButtonKind.DOWN)) {
					((WiiCoreButtonEvt)cmd).setD_PAD_DOWN(val);
				} else if (button.getKind().equals(WiimoteButtonKind.UP)) {
					((WiiCoreButtonEvt)cmd).setD_PAD_UP(val);
				} else if (button.getKind().equals(WiimoteButtonKind.Z)) {
					((WiiCoreButtonEvt)cmd).setNO_BUTTON(val);
				}
			}
		} else if (cmd instanceof WiiDataEvt) {
			
		} else if (cmd instanceof WiiExtEvt) {
		}
	}
	*/
	public WiimoteCmd createWiimoteCmdFromRawWiiCmd(WiiCmd cmd) {
		OscCmd c = createOscCmdFromWiiEvt(cmd, 1, true);
		if (c.getMsg() instanceof OSCMessage) {
			OSCMessage msg = (OSCMessage) c.getMsg();
			if (msg != null && !msg.getAddress().equals("")) {
				return (WiimoteCmd) WiimoteCmdUtils.INSTANCE.createWiimoteCmdFromOSCMsg(msg);
			}
		}
		return null;
	}
	
	public Cmd createWiimoteCmdFromArgs(String wiiidStr, String addr, Float val) {
		WiimoteCmd wiimoteCmd = null;

		if (addr.contains("/nunchuk/accel/pry")) {
			WiiNunchukAccelPryCmd cmd = WiimoteFactory.eINSTANCE.createWiiNunchukAccelPryCmd();
			if (addr.endsWith("/nunchuk/accel/pry/0")) { 
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__PITCH, cmd, val);
			} else if (addr.endsWith("/nunchuk/accel/pry/1")) {
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__ROLL, cmd, val);
			} else if (addr.endsWith("/nunchuk/accel/pry/2")) {
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__YAW, cmd, val);
			} else if (addr.endsWith("/nunchuk/accel/pry/3")) {
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__ACCEL, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/nunchuk/accel/xyz")) {
			WiiNunchukAccelXyzCmd cmd = WiimoteFactory.eINSTANCE.createWiiNunchukAccelXyzCmd();
			if (addr.endsWith("/nunchuk/accel/xyz/0")) { 
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/xyz", WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__X, cmd, val);
			} else if (addr.endsWith("/nunchuk/accel/xyz/1")) {
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/xyz", WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__Y, cmd, val);
			} else if (addr.endsWith("/nunchuk/accel/xyz/2")) {
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/xyz", WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__Z, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/accel/xyz")) {
			WiiAccelXYZCmd cmd = WiimoteFactory.eINSTANCE.createWiiAccelXYZCmd();
			if (addr.endsWith("/accel/xyz/0")) { 
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/xyz", WiimotePackage.Literals.WII_ACCEL_XYZ_CMD__X, cmd, val);
			} else if (addr.endsWith("/accel/xyz/1")) { 
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/xyz", WiimotePackage.Literals.WII_ACCEL_XYZ_CMD__Y, cmd, val);
			} else if (addr.endsWith("/accel/xyz/2")) {
				dynValuesUpdate(wiiidStr, "/nunchuk/accel/xyz", WiimotePackage.Literals.WII_ACCEL_XYZ_CMD__Z, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/accel/pry")) {
			WiiAccelPryCmd cmd = WiimoteFactory.eINSTANCE.createWiiAccelPryCmd();
			if (addr.endsWith("/accel/pry/0")) { 
				dynValuesUpdate(wiiidStr, "/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__PITCH, cmd, val);
			} else if (addr.endsWith("/accel/pry/1")) {
				dynValuesUpdate(wiiidStr, "/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__ROLL, cmd, val);
			} else if (addr.endsWith("/accel/pry/2")) {
				dynValuesUpdate(wiiidStr, "/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__YAW, cmd, val);
			} else if (addr.endsWith("/accel/pry/3")) {
				dynValuesUpdate(wiiidStr, "/accel/pry", WiimotePackage.Literals.WII_ACCEL_PRY_CMD__ACCEL, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/wiimote/angles")) {
			WiiMotionAnglesCmd cmd = WiimoteFactory.eINSTANCE.createWiiMotionAnglesCmd();
			if (addr.endsWith("/wiimote/angles/0")) {
				dynValuesUpdate(wiiidStr, "/wiimote/angles", WiimotePackage.Literals.WII_ANGLES_CMD__PITCH, cmd, val);
			} else if (addr.endsWith("/wiimote/angles/1")) {
				dynValuesUpdate(wiiidStr, "/wiimote/angles", WiimotePackage.Literals.WII_ANGLES_CMD__ROLL, cmd, val);
			} else if (addr.endsWith("/wiimote/angles/2")) {
				dynValuesUpdate(wiiidStr, "/wiimote/angles", WiimotePackage.Literals.WII_ANGLES_CMD__YAW, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/nunchuk/button")) {
			WiiNunchukButtonCmd cmd = WiimoteFactory.eINSTANCE.createWiiNunchukButtonCmd();
			if (addr.contains("/button/C")) {
				cmd.setKind(WiimoteButtonKind.C);
				dynValuesUpdate(wiiidStr, "/button/C", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, val);
			} else if (addr.contains("/button/Z")) {
				cmd.setKind(WiimoteButtonKind.Z);
				dynValuesUpdate(wiiidStr, "/button/Z", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/button")) {
			WiiButtonCmd cmd = WiimoteFactory.eINSTANCE.createWiiButtonCmd();
			if (addr.contains("/button/1")) {
				cmd.setKind(WiimoteButtonKind.ONE);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/2")) {
				cmd.setKind(WiimoteButtonKind.TWO);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/A")) {
				cmd.setKind(WiimoteButtonKind.A);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/B")) {
				cmd.setKind(WiimoteButtonKind.B);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/Down")) {
				cmd.setKind(WiimoteButtonKind.DOWN);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/Left")) {
				cmd.setKind(WiimoteButtonKind.LEFT);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/Up")) {
				cmd.setKind(WiimoteButtonKind.UP);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/Right")) {
				cmd.setKind(WiimoteButtonKind.RIGHT);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/Minus")) {
				cmd.setKind(WiimoteButtonKind.MINUS);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			} else if (addr.contains("/button/Plus")) {
				cmd.setKind(WiimoteButtonKind.PLUS);
				dynValuesUpdate(wiiidStr, "/button/1", WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, cmd, 1f);
			}
			wiimoteCmd = cmd;
		} else if (addr.endsWith("/ir/0") || addr.endsWith("/ir/1")) {
			WiiIrCmd cmd = WiimoteFactory.eINSTANCE.createWiiIrCmd();
			if (addr.endsWith("/ir/0")) {
				dynValuesUpdate(wiiidStr, "/ir", WiimotePackage.Literals.WII_IR_CMD__X, cmd, val);
			} else if (addr.endsWith("/ir/1")) {
				dynValuesUpdate(wiiidStr, "/ir", WiimotePackage.Literals.WII_IR_CMD__Y, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/ir/xys/")) {
			WiiIrXYSpeedCmd cmd = WiimoteFactory.eINSTANCE.createWiiIrXYSpeedCmd();
			if (addr.endsWith("/ir/xys/0")) {
				dynValuesUpdate(wiiidStr, "/ir/xys", WiimotePackage.Literals.WII_IR_XY_SPEED_CMD__X, cmd, val);
			} else if (addr.endsWith("/ir/xys/1")) {
				dynValuesUpdate(wiiidStr, "/ir/xys", WiimotePackage.Literals.WII_IR_XY_SPEED_CMD__Y, cmd, val);
			} else if (addr.endsWith("/ir/xys/2")) {
				dynValuesUpdate(wiiidStr, "/ir/xys", WiimotePackage.Literals.WII_IR_XY_SPEED_CMD__SPEED, cmd, val);
			}
			wiimoteCmd = cmd;
		}  else if (addr.contains("/motion/velo")) {
			WiiMotionVeloCmd cmd = WiimoteFactory.eINSTANCE.createWiiMotionVeloCmd();
			if (addr.endsWith("/motion/velo/0")) {
				dynValuesUpdate(wiiidStr, "/motion/velo", WiimotePackage.Literals.WII_MOTION_VELO_CMD__PITCH_VELOCITY, cmd, val);
			} else if (addr.endsWith("/motion/velo/1")) {
				dynValuesUpdate(wiiidStr, "/motion/velo", WiimotePackage.Literals.WII_MOTION_VELO_CMD__ROLL_VELOCITY, cmd, val);
			} else if (addr.endsWith("/motion/velo/2")) { 
				dynValuesUpdate(wiiidStr, "/motion/velo", WiimotePackage.Literals.WII_MOTION_VELO_CMD__YAW_VELOCITY, cmd, val);
			}
			wiimoteCmd = cmd;
		}   else if (addr.contains("/motion/angles")) {
			WiiMotionAnglesCmd cmd = WiimoteFactory.eINSTANCE.createWiiMotionAnglesCmd();
			if (addr.endsWith("/motion/angles/0")) { 
				dynValuesUpdate(wiiidStr, "/motion/angles", WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__PITCH, cmd, val);
			} else if (addr.endsWith("/motion/angles/1")) { 
				dynValuesUpdate(wiiidStr, "/motion/angles", WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__ROLL, cmd, val);
			} else if (addr.endsWith("/motion/angles/2")) { 
				dynValuesUpdate(wiiidStr, "/motion/angles", WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__YAW, cmd, val);
			}
			wiimoteCmd = cmd;
		} else if (addr.contains("/nunchuk/joy")) {
			WiiNunchukJoyCmd cmd = WiimoteFactory.eINSTANCE.createWiiNunchukJoyCmd();
			if (addr.endsWith("/nunchuk/joy/0")) { 
				dynValuesUpdate(wiiidStr, "/nunchuk/joy", WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD__X, cmd, val);
			} else if (addr.endsWith("/nunchuk/joy/1")) {
				dynValuesUpdate(wiiidStr, "/nunchuk/joy", WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD__Y, cmd, val);
			}
			wiimoteCmd = cmd;
		}
		
		if (wiimoteCmd != null && wiiidStr.length() > 0) {
			wiimoteCmd.setWiiid(wiiidStr);
		}
		
		return wiimoteCmd;
	}
}
