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

package net.sf.smbt.touchosc.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.smbt.touchosc.touchosc.Control;
import net.sf.smbt.touchosc.touchosc.Tabpage;
import net.sf.smbt.touchosc.touchosc.TouchoscFactory;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transposer;


public final class TouchOSCGuiUtils {
	public final static TouchOSCGuiUtils INSTANCE = new TouchOSCGuiUtils();
	//private Base64 encoder;
	
	private Transposer t;
	
	public TouchOSCGuiUtils() {
		//encoder = new Base64();
		
		t = new Transposer();
	}
		
	public Tabpage buildTabPage( Dimension dim, String orientation, String mode, TouchOscTabPage page) {
		Tabpage tabpage = TouchoscFactory.eINSTANCE.createTabpage();
		tabpage.setName(page.getName());
		
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getBatteriesH()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getBatteriesV()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getEncoders()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getFadersH()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getFadersV()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getLabelsH()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getLabelsV()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getLeds()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getMultiFadersH()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getMultiFadersV()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getMultiPushes()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getMultiToggles()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getPushes()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getRotariesH()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getRotariesV()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getTimesH()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getTimesV()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getToggles()));
		tabpage.getControl().addAll(buildControlsFromGUICanonical(dim, orientation, mode, page, page.getXyPads()));
		
		return tabpage;
	}
	
//	String computeString(String txt) {
//		return txt = txt == null ? txt : (Base64.isBase64(txt) ? new String(Base64.decodeBase64(txt), Charset.forName("UTF-8")) : txt);
//	}
	
	private Collection<Control> buildControlsFromGUICanonical(Dimension dim, String orientation, String mode, TouchOscTabPage page, List<? extends TouchOscControl> controls) {
		Collection<Control> ret = new ArrayList<Control>();
		
		int i=1;
		for (TouchOscControl tc : controls) {
			Control ctrl = TouchoscFactory.eINSTANCE.createControl();
			
			ctrl.setBackground	("true");
			ctrl.setOscCs		(tc.getOsc_cs());
			ctrl.setResponse	(""+tc.getResponse());
			ctrl.setScalef		(""+tc.getScalef());
			ctrl.setScalet		(""+tc.getScalet());
			ctrl.setColor		(""+tc.getFg());
			ctrl.setName		(""+tc.getName());
			ctrl.setType		(""+tc.getType());
			
			TouchOscLayout layout = (TouchOscLayout) page.eContainer();
			if (layout.getOrientation().equals("vertical")) {
				ctrl.setX			("" + tc.getX());
				ctrl.setY			("" + tc.getY());				
				ctrl.setW			("" + tc.getW());
				ctrl.setH			("" + tc.getH());
			} else {
				Rectangle rect = new Rectangle(tc.getX(), tc.getY(), tc.getW(), tc.getH());	
				ctrl.setX			("" + ((dim.height - rect.y - rect.height - 40)));
				ctrl.setY			("" + (rect.x));				
				ctrl.setW			("" + rect.height);
				ctrl.setH			("" + rect.width);
				
				
				if (tc.getType().equals("labelh")) {
					ctrl.setType("labelv");
				} else if (tc.getType().equals("labelv")) {
					ctrl.setType("labelh");
				} else if (tc.getType().equals("faderh")) {
					ctrl.setType("faderv");
				} else if (tc.getType().equals("faderv")) {
					ctrl.setType("faderh");
				} else if (tc.getType().equals("multifaderh")) {
					ctrl.setType("multifaderv");
				} else if (tc.getType().equals("multifaderv")) {
					ctrl.setType("multifaderh");
				} else if (tc.getType().equals("timeh")) {
					ctrl.setType("timev");
				} else if (tc.getType().equals("timev")) {
					ctrl.setType("timeh");
				} else if (tc.getType().equals("batteryh")) {
					ctrl.setType("batteryv");
				} else if (tc.getType().equals("batteryv")) {
					ctrl.setType("batteryh");
				} else if (tc.getType().equals("rotaryh")) {
					ctrl.setType("rotaryv");
				} else if (tc.getType().equals("rotaryv")) {
					ctrl.setType("rotaryh");
				}
			}
			
			if (tc instanceof TouchOscPush) {
				ctrl.setLocalOff(tc.isLocalFeedbackOff() ? "true":"false");
				ret.add(ctrl);
				i++;
				continue;
			} else {
				ctrl.setLocalOff(null);
			}if (tc instanceof TouchOscToggle) {
				ctrl.setLocalOff(tc.isLocalFeedbackOff() ? "true":"false");
				ret.add(ctrl);
				i++;
				continue;
			} else {
				ctrl.setLocalOff(null);
			}
			// XYPad
			if (tc instanceof TouchOscXYPad) {
				ctrl.setInvertedX(tc.isInverted_x() ? "true":"false");
				ctrl.setInvertedY(tc.isInverted_y() ? "true":"false");
				ret.add(ctrl);
				i++;
				continue;
			} else {
				ctrl.setInvertedX(null);
				ctrl.setInvertedY(null);
			}
			// MultiFader
			if (
					tc instanceof TouchOscMultiFaderV ||
					tc instanceof TouchOscMultiFaderH
			) {
				ctrl.setNumber		("" + tc.getNumber());
				ret.add(ctrl);
				i++;
				continue;
			} else {
				ctrl.setNumber		(null);
			}
			// MultiButtons
			if (
					tc instanceof TouchOscMultiPush ||
					tc instanceof TouchOscMultiToggle
			) {
				ctrl.setNumberX		("" + tc.getNumber_x());
				ctrl.setNumberY		("" + tc.getNumber_y());
				ctrl.setBackground  (null);
				ctrl.setCentered	(null);
				ctrl.setLocalOff	(tc.isLocalFeedbackOff() ? "true":"false");
				ret.add(ctrl);
				i++;
				continue;
			} else {
				ctrl.setNumberX		(null);
				ctrl.setNumberY		(null);
			}
			// Battery & Time
			if (
					tc instanceof TouchOscBatteryH ||
					tc instanceof TouchOscBatteryV ||
					tc instanceof TouchOscTimeH ||
					tc instanceof TouchOscTimeV
			) {
				ctrl.setSeconds		(tc.isSeconds() ? "true" : "false");
				ctrl.setOutline		(tc.isOutline() ? "true" : "false");
				ctrl.setSize		(""+tc.getSize());
				ret.add(ctrl);
				i++;
				continue;
			} else {
				ctrl.setSeconds		(null);
				ctrl.setSize		(null);
				ctrl.setOutline		(null);
			}
			// Label
			if (! (tc instanceof TouchOscLabelH) || ! (tc instanceof TouchOscLabelV)) {
				ctrl.setText		(tc.getText() != null ? ""+tc.getText() : "");
				ctrl.setCentered	(null);
				ctrl.setInverted	(null);
				ctrl.setBackground	(tc.isBackground() ? "true" : "false");
				ctrl.setOutline		(tc.isOutline() ? "true" : "false");
				ctrl.setSize		(""+tc.getSize() != "" ? ""+tc.getSize() : "14");
				ctrl.setScalef      (null);
				ctrl.setScalet      (null);
				ret.add(ctrl);
				i++;
				continue;
			} else {
				ctrl.setText		(null);
				ctrl.setCentered	(null);
				ctrl.setInverted	(null);
				ctrl.setOutline		(null);
			}
			ret.add(ctrl);
			i++;
		}
		return ret;
	}
}
