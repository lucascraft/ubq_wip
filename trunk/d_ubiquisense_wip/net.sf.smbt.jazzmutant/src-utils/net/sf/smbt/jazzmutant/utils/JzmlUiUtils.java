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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.jazzmutant.model.jzml.JZML;
import net.sf.smbt.jazzmutant.model.jzml.JzmlFactory;
import net.sf.smbt.jazzmutant.model.jzml.PROJECT;
import net.sf.smbt.jazzmutant.model.jzml.WINDOW;
import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JZContainer;
import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JZGesture;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JZLemurMenu;
import net.sf.smbt.jzmui.JZLemurMonitor;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JZRange;
import net.sf.smbt.jzmui.JZRingArea;
import net.sf.smbt.jzmui.JZSignalScope;
import net.sf.smbt.jzmui.JZSurfaceLCD;
import net.sf.smbt.jzmui.JZSwitches;
import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.jzmui.JZTrack;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class JzmlUiUtils {
	public final static JzmlUiUtils INSTANCE = new JzmlUiUtils();
	
	
	public final static String KNOB_FG_COLOR 				= "KNOB_FG_COLOR";
	public final static String KNOB_BG_COLOR 				= "KNOB_BG_COLOR";
	public final static String FADER_FG_COLOR 				= "FADER_FG_COLOR";
	public final static String FADER_BG_COLOR 				= "FADER_BG_COLOR";
	public final static String BREAKPOINT_FG_COLOR 			= "BREAKPOINT_FG_COLOR";
	public final static String BREAKPOINT_FIRST_POINT_COLOR	= "BREAKPOINT_FIRST_POINT_COLOR";
	public final static String CONTAINER_FG_COLOR 			= "CONTAINER_FG_COLOR";
	public final static String CONTAINER_BG_COLOR 			= "CONTAINER_BG_COLOR";
	public final static String CUSTOM_BUTTON_OFF_COLOR 		= "CUSTOM_BUTTON_OFF_COLOR";
	public final static String CUSTOM_BUTTON_ON_COLOR 		= "CUSTOM_BUTTON_ON_COLOR";
	public final static String INTERFACE_COLOR 				= "INTERFACE_COLOR";
	public final static String LED_OFF_COLOR 				= "LED_OFF_COLOR";
	public final static String LED_ON_COLOR 				= "LED_ON_COLOR";
	public final static String MENU_COLOR 					= "MENU_COLOR";
	public final static String MONITOR_COLOR 				= "MONITOR_COLOR";
	public final static String MULTIBALLS_COLOR 			= "MULTIBALLS_COLOR";
	public final static String MULTISLIDER_COLOR			= "MULTISLIDER_COLOR";
	public final static String PADS_OFF_COLOR 				= "PADS_OFF_COLOR";
	public final static String PADS_ON_COLOR 				= "PADS_ON_COLOR";
	public final static String RANGE_COLOR 					= "RANGE_COLOR";
	public final static String RINGAREA_COLOR 				= "RINGAREA_COLOR";
	public final static String SCOPE_COLOR 					= "SCOPE_COLOR";
	public final static String SURFACE_TOP_COLOR 			= "SURFACE_TOP_COLOR";
	public final static String SURFACE_BOTTOM_COLOR 		= "SURFACE_BOTTOM_COLOR";
	public final static String SWITCHES_OFF_COLOR 			= "SWITCHES_OFF_COLOR";
	public final static String SWITCHES_ON_COLOR 			= "SWITCHES_ON_COLOR";
	public final static String TEXT_COLOR 					= "TEXT_COLOR";
	public final static String TRACK_FG_COLOR 				= "TRACK_FG_COLOR";
	public final static String TRACK_BG_COLOR 				= "TRACK_BG_COLOR";
	public final static String DEFAULT_BG_COLOR 			= "DEFAULT_BG_COLOR";
	
	private Map<String, Color> colorMap;

	public JzmlUiUtils() {
		colorMap = new HashMap<String, Color>();
		
		colorMap.put(KNOB_FG_COLOR, 				new Color(Display.getDefault(), 255, 34, 0));
		colorMap.put(KNOB_BG_COLOR, 				new Color(Display.getDefault(), 0, 0, 237));
		colorMap.put(MULTISLIDER_COLOR, 			new Color(Display.getDefault(), 54, 140, 255));
		colorMap.put(BREAKPOINT_FG_COLOR, 			new Color(Display.getDefault(), 255, 0, 215));
		colorMap.put(BREAKPOINT_FIRST_POINT_COLOR, 	new Color(Display.getDefault(), 132, 255, 0));
		colorMap.put(CONTAINER_FG_COLOR, 			new Color(Display.getDefault(), 255, 0, 215));
		colorMap.put(CUSTOM_BUTTON_OFF_COLOR, 		new Color(Display.getDefault(), 0, 241, 255));
		colorMap.put(CUSTOM_BUTTON_ON_COLOR, 		new Color(Display.getDefault(), 255, 0, 255));
		colorMap.put(FADER_FG_COLOR, 				new Color(Display.getDefault(), 197, 229, 0));
		colorMap.put(INTERFACE_COLOR, 				new Color(Display.getDefault(), 255, 0, 215));
		colorMap.put(LED_OFF_COLOR, 				new Color(Display.getDefault(), 0, 255, 0));
		colorMap.put(LED_ON_COLOR, 					new Color(Display.getDefault(), 255, 6, 36));
		colorMap.put(MENU_COLOR, 					new Color(Display.getDefault(), 255, 24, 255));
		colorMap.put(MONITOR_COLOR, 				new Color(Display.getDefault(), 255, 24, 255));
		colorMap.put(MULTIBALLS_COLOR, 				new Color(Display.getDefault(), 0, 227, 255));
		colorMap.put(PADS_OFF_COLOR, 				new Color(Display.getDefault(), 255, 149, 0));
		colorMap.put(PADS_ON_COLOR, 				new Color(Display.getDefault(), 0, 251, 255));
		colorMap.put(RANGE_COLOR, 					new Color(Display.getDefault(), 54, 140, 255));
		colorMap.put(RINGAREA_COLOR, 				new Color(Display.getDefault(), 255, 0, 215));
		colorMap.put(SCOPE_COLOR, 					new Color(Display.getDefault(), 255, 24, 255));
		colorMap.put(SURFACE_TOP_COLOR, 			new Color(Display.getDefault(), 255, 24, 255));
		colorMap.put(SURFACE_BOTTOM_COLOR, 			new Color(Display.getDefault(), 255, 24, 255));
		colorMap.put(SWITCHES_OFF_COLOR, 			new Color(Display.getDefault(), 0, 241, 255));
		colorMap.put(SWITCHES_ON_COLOR, 			new Color(Display.getDefault(), 255, 0, 255));
		colorMap.put(TEXT_COLOR, 					new Color(Display.getDefault(), 255, 0, 255));
		colorMap.put(DEFAULT_BG_COLOR, 				new Color(Display.getDefault(), 72, 6, 126));
	}
	
	
	public RGB computeRgbID(String rgbID) {
		if (rgbID!= null) {
			int val = Integer.valueOf(rgbID);
			int r = val << 0x0000FF;
			int g = val << 0x00FF;
			int b = val << 0xFF;
			
			return new RGB(r, g, b);
		}
		return Display.getDefault().getSystemColor(SWT.COLOR_BLUE).getRGB();
	}
	

	public Color getColor(EObject eObj, EStructuralFeature feature) {
		if (eObj != null) {
			if (eObj.eGet(feature) instanceof Color) {
				return (Color) eObj.eGet(feature);
			}
		}
		return getDefaultColor(feature);
	}
	
	public Color getDefaultColor(EStructuralFeature feature) {
		if (feature.equals(JzmuiPackage.Literals.JZ_BREAK_POINT__FIRST_POINT)) {
			return colorMap.get(BREAKPOINT_FIRST_POINT_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_BREAK_POINT__COLOR)) {
			return colorMap.get(BREAKPOINT_FG_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__COLOR_OFF)) {
			return colorMap.get(CUSTOM_BUTTON_OFF_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__COLOR_ON)) {
			return colorMap.get(CUSTOM_BUTTON_ON_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_FADER__COLOR)) {
			return colorMap.get(FADER_FG_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_KNOB__BACKGROUD)) {
			return colorMap.get(KNOB_BG_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_KNOB__FOREGROUND)) {
			return colorMap.get(KNOB_FG_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_LED__COLOR_OFF)) {
			return colorMap.get(LED_OFF_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_LED__COLOR_ON)) {
			return colorMap.get(LED_ON_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_LEMUR_MENU__COLOR)) {
			return colorMap.get(MENU_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__COLOR)) {
			return colorMap.get(MONITOR_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZMULTI_SLIDER__COLOR)) {
			return colorMap.get(MULTISLIDER_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__COLOR)) {
			return colorMap.get(MULTIBALLS_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_PADS__COLOR_OFF)) {
			return colorMap.get(PADS_OFF_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_PADS__COLOR_ON)) {
			return colorMap.get(PADS_ON_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_RANGE__COLOR)) {
			return colorMap.get(RANGE_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_RING_AREA__COLOR)) {
			return colorMap.get(RINGAREA_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__COLOR)) {
			return colorMap.get(SCOPE_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_OFF)) {
			return colorMap.get(SWITCHES_OFF_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_ON)) {
			return colorMap.get(SWITCHES_ON_COLOR);
		} else if (feature.equals(JzmuiPackage.Literals.JZ_TEXT__COLOR)) {
			return colorMap.get(TEXT_COLOR);
		}
		return Display.getDefault().getSystemColor(SWT.COLOR_RED);
	}
	
	public Color computeColorID2(String rgbID) {
		if (rgbID!= null) {
			rgbID = rgbID.replace("Color {", "");
			rgbID = rgbID.replace("}", "");
			
			int r = 127;
			int g = 127;
			int b = 127;
			
			String RGB[] = rgbID.split(",");
			if (RGB != null && RGB.length == 3) {
				r = Integer.valueOf(RGB[0].trim());
				g = Integer.valueOf(RGB[1].trim());
				b = Integer.valueOf(RGB[2].trim());
			}
			return createColor(r, g, b);
		}
		return Display.getDefault().getSystemColor(SWT.COLOR_YELLOW);
	}
	
	/*
	public Color getColor(String ID) {
		return colorMap.get(ID);
	}
	*/
	public Color getColorFromHash(String ID) {
		if (colorMap.containsKey(ID)) {
			return colorMap.get(ID);
		} else {
			return colorMap.put(
				ID,
				new Color(Display.getDefault(), computeRgbID(ID))
			);
		}
	}
	
	public Color getColorFromXMI(String ID) {
		return computeColorID2(ID);
	}
	
	public Color createColor(int r, int g, int b) {
		return new Color(Display.getDefault(), new RGB(r, g, b));
	}
	
	public Color getColor(int r, int g, int b) {
		String ID = r+"_"+g+"_"+b;
		if (colorMap.containsKey(ID)) {
			return colorMap.get(ID);
		} else {
			return colorMap.put(
				ID,
				new Color(Display.getDefault(), new RGB(r, g, b))
			);
		}
	}
	
	private Point getDim(JZJazzInterface jzinterface) {
		if(jzinterface.getChildren().size()>0) {
			JZUIElem uiElem = jzinterface.getChildren().get(0);
			if (uiElem instanceof JZJazzInterface) {
				if (((JZJazzInterface)uiElem).getBounds() instanceof Rectangle) {
					int w = ((JZJazzInterface)uiElem).getBounds().width;
					int h = ((JZJazzInterface)uiElem).getBounds().height;
					return new Point(w, h);
				}
			}
		} else {
			throw new UnsupportedOperationException();
		}
		return new Point();
	}
	
	public JZML dumpGuiAsJzml(JZJazzInterface jzinterface) {
		JZML jzml = JzmlFactory.eINSTANCE.createJZML();
		
		Point dim = getDim(jzinterface);
		PROJECT prj = JzmlFactory.eINSTANCE.createPROJECT();
		prj.setVersion("3010");
		prj.setWidth(""+dim.x);
		prj.setHeight(""+dim.y);
		prj.setName("JazzMutantProject");
		prj.setId(null);
		
		prj.setOscTarget("-2");
		prj.setMidiTarget("-2");
		prj.setKbmouseTarget("-2");
		
		jzml.setPROJECT(prj);
		
		for (JZUIElem jz : jzinterface.getChildren()) {
			if (jz instanceof JZJazzInterface) {
				jzml.getWINDOW().add(buildWindowsFromLemurApp((JZJazzInterface)jz));
			}
		}
		
		return jzml;
	}
	
	public List<OscCmd> dumpGuiAsOsc(JZJazzInterface jzinterface) {
		List<OscCmd> lst = new ArrayList<OscCmd>();
		collectOSCMessages(jzinterface.getChildren(), lst, "");
		return lst;
	}
	
	private void collectOSCMessages(List<JZUIElem> elem, List<OscCmd> lst, String lvl) {
		for (JZUIElem e : elem) {
			collectOSCMessages(e, lst, lvl);
		}
	}
	
	private void collectOSCMessages(JZUIElem elem, List<OscCmd> lst, String lvl) {
		if (elem instanceof JZContainer) {
			collectOSCMessages( ((JZContainer)elem).getChildren(), lst, lvl + "/" + ((JZContainer)elem).getName());
		} else {
			for (JzOscVar v : elem.getOscProps()) {
				if (v.getCustomMsg() != null && v.getCustomMsg() != "") {
					lst.add(OscCmdUtils.INSTANCE.createOscCmd(v.getCustomMsg()));
				} else {
					lst.add(
						OscCmdUtils.INSTANCE.createOscCmd(v.getAttribute().getName(), elem.eGet(v.getAttribute()))
					);
				}
			}
		}
	}
	
	private WINDOW buildWindowsFromLemurApp(JZJazzInterface jzinterface) {
		WINDOW interfaceWindow = buildPARAMFromJZUIElem(jzinterface);
		interfaceWindow.getWINDOW().addAll(buildWindowFromJZUiElem(jzinterface));
		return interfaceWindow;
	}
	
	private List<WINDOW> buildWindowFromJZUiElem(JZJazzInterface jazzPage) {
		List<WINDOW> lst = new ArrayList<WINDOW>();
		for (JZUIElem e : jazzPage.getChildren()) {
			WINDOW w = buildPARAMFromJZUIElem(e);
			if (w instanceof WINDOW) {
				lst.add(w);
			}
		}
		return lst;
	}
	
	private WINDOW buildJZBreakPoint(WINDOW window, JZBreakPoint elem) {
		window.setClass("BreakPoint");
		window.setAttraction(""+elem.getAttraction());
		// ???? elem.getBackground();
		window.setEdit(""+elem.getEdit());
		// ???? window.set elem.getFirstPoint();
		window.setFriction(""+elem.getFriction());
		window.setHold(""+elem.getHold());
		window.setHoldX(""+elem.getHoldX());
		window.setHoldY(""+elem.getHoldY());
		window.setLight(""+elem.getLight());
		window.setNbr(""+elem.getPoints());
		window.setSpeed(""+elem.getSpeed());
		window.setRest(""+elem.getRest());
		// ???? window.set(elem.getValues());
		return window;
	}

	private WINDOW buildJZJazzInterface(WINDOW window, JZJazzInterface elem) {
		window.setClass("JAZZINTERFACE");
		window.setText(elem.getName());
		window.setState("0"/*elem.getState()*/);
		window.setGroup("0"/*elem.getGroup	()*/);
		window.setFont("tahoma,11,0");
		return window;
	}
	
	private WINDOW buildJZSignalScope(WINDOW window, JZSignalScope elem) {
		window.setClass("SignalScope");
		window.setFriction(""+elem.getFriction());
		window.setColor(""+elem.getColor());
		window.setHeight(""+elem.getHeight());
		window.setLight(""+elem.getLight());
		window.setMode(elem.isModeXY()?"true":"false");
		window.setTension(""+elem.getTension());
		return window;
	}
	
	private WINDOW buildJZSurfaceLCD(WINDOW window, JZSurfaceLCD elem) {
		window.setClass("SurfaceLCD");
		window.setFriction(""+elem.getBottom());
		window.setColor(""+elem.getDisplay());
		window.setHeight(""+elem.getTarget());
		window.setLight(""+elem.getTop());
		return window;
	}
	
	private WINDOW buildJZSwitches(WINDOW window, JZSwitches elem) {
		window.setClass("Switches");
		window.setFriction(""+elem.getColumns());
		window.setColor(""+elem.getLight());
		window.setHeight(""+elem.getNumbers());
		window.setLight(""+elem.getRows());
		return window;
	}
	
	private WINDOW buildJZTrack(WINDOW window, JZTrack elem) {
		window.setClass("Track");
		window.setFriction(""+elem.getColor());
		window.setColor(""+elem.getModeXY());
		return window;
	}
	
	private WINDOW buildJZContainer(WINDOW window, JZContainer elem) {
		window.setClass("Container");
		// ????     ????
		return window;
	}
	
	private WINDOW buildJZCustomButton(WINDOW window, JZCustomButton elem) {
		window.setClass("CustomButton");
		window.setFriction(""+elem.getColorOff());
		window.setColor(""+elem.getColorOn());
		window.setHeight(""+elem.getLight());
		window.setLight(""+elem.getStyleOff());
		window.setLight(""+elem.getStyleOn());
		return window;
	}
	
	private WINDOW buildJZKnob(WINDOW window, JZKnob elem) {
		window.setClass("Knob");
		window.setAttack(""+elem.getAttack());
		//window.set""+elem.getBackgroud());
		window.setDecay(""+elem.getDecay());
		//window.set(""+elem.getForeground());
		window.setHold(""+elem.getHold());
		window.setPrecision(""+elem.getPrecision());
		window.setRelease(""+elem.getRelease());
		window.setSustain(""+elem.getSustain());
		window.setUnit(""+elem.getUnit());
		window.setValue(""+elem.getValue());
		return window;
	}
	
	private WINDOW buildJZLed(WINDOW window, JZLed elem) {
		window.setClass("Led");
		//window.setColor""+elem.getColorOff());
		//window.setColor(""+elem.getColorOn());
		window.setColumn(""+elem.getColumns());
		window.setLight(""+elem.getLight());
		window.setRow(""+elem.getRows());
		window.setValue(""+elem.getValue());
		return window;
	}
	
	private WINDOW buildJZLemurMenu(WINDOW window, JZLemurMenu elem) {
		window.setClass("LemurMenu");
		window.setColor(""+elem.getColor());
		window.setFont(""+elem.getFont());
		return window;
	}
	
	private WINDOW buildJZLemurMonitor(WINDOW window, JZLemurMonitor elem) {
		window.setClass("LemurMonitor");
		window.setColor(""+elem.getColor());
		window.setFont(""+elem.getFont());
		window.setPrecision(""+elem.getPrecision());
		window.setUnit(""+elem.getUnit());
		window.setValue(""+elem.getValue());
		return window;
	}
	
	private WINDOW buildJZMultiBalls(WINDOW window, JZMultiBalls elem) {
		window.setClass("MultiBalls");
		window.setAttack(""+elem.getAttack());
		window.setDecay(""+elem.getDecay());
		window.setFriction(""+elem.getFriction());
		//window.set(""+elem.getGridStepX());
		//window.setLight(""+elem.getGridStepY());
		window.setHeight(""+elem.getHeight());
		window.setHold(""+elem.getHold());
		window.setHoldX(""+elem.getHoldX());
		window.setHoldY(""+elem.getHoldY());
		window.setLight(""+elem.getLight());
		window.setNbr(""+elem.getBalls());
		window.setRelease(""+elem.getRelease());
		window.setSpeed(""+elem.getSpeed());
		window.setSustain(""+elem.getSustain());
		window.setTension(""+elem.getTension());
		window.setX(""+elem.getX());
		window.setY(""+elem.getY());
		window.setZ(""+elem.getZ());
		return window;
	}
	
	private WINDOW buildJZmultiSlider(WINDOW window, JZmultiSlider elem) {
		window.setClass("MultiSlider");
		window.setFriction(""+elem.getFriction());
		window.setGradient(""+elem.getGradient());
		window.setHeight(""+elem.getHeight());
		window.setLight(""+elem.getLight());
		//window.setSlider(""+elem.getSlider());
		window.setTension(""+elem.getTension());
		return window;
	}
	
	private WINDOW buildJZGesture(WINDOW window, JZGesture elem) {
		window.setClass("Gesture");
		window.setAngle(""+elem.getAngle());
		window.setColor(""+elem.getColor());
		window.setPinch(""+elem.getPinch());
		return window;
	}
	
	private WINDOW buildJZRange(WINDOW window, JZRange elem) {
		window.setClass("Range");
		window.setColor(""+elem.getColor());
		window.setLight(""+elem.getLight());
		return window;
	}
	
	private WINDOW buildJZRingArea(WINDOW window, JZRingArea elem) {
		window.setClass("RingArea");
		window.setAttraction(""+elem.getAttraction());
		window.setAttractionX(""+elem.getAttraction_x());
		window.setAttractionY(""+elem.getAttraction_y());
		window.setFriction(""+elem.getFriction());
		window.setSpeed(""+elem.getSpeed());
		return window;
	}
	
	private WINDOW buildJZText(WINDOW window, JZText elem) {
		window.setClass("Text");
		window.setColor(""+elem.getColor());
		window.setFont(""+elem.getFont());
		window.setLight(""+elem.getLight());
		window.setText(""+elem.getText());
		return window;
	}
	
	private WINDOW buildPARAMFromJZUIElem(JZUIElem elem) {
		WINDOW window = JzmlFactory.eINSTANCE.createWINDOW();
		
		window.setX(elem.getBounds() != null ? ""+elem.getBounds().x : "0");
		window.setY(elem.getBounds() != null ? ""+elem.getBounds().y : "0");
		window.setWidth(elem.getBounds() != null ? ""+elem.getBounds().width : "0");
		window.setHeight(elem.getBounds() != null ? ""+elem.getBounds().height : "0");
		
		//window.setFont(elem.getFontName() + "," + elem.getFontSize() + "," + elem.getFontStyle());
		//window.setText(elem.getLabel());
		
		window.setSend("1");
		//window.setOscTarget()
		
		if (elem instanceof JZJazzInterface) {
			window = buildJZJazzInterface(window, (JZJazzInterface)elem);
		} else if (elem instanceof JZBreakPoint) {
			window = buildJZBreakPoint(window, (JZBreakPoint)elem);
		} else if (elem instanceof JZSignalScope) {
			window = buildJZSignalScope(window, (JZSignalScope)elem);
		} else if (elem instanceof JZSurfaceLCD) {
			window = buildJZSurfaceLCD(window, (JZSurfaceLCD)elem);
		} else if (elem instanceof JZSwitches) {
			window = buildJZSwitches(window, (JZSwitches)elem);
		} else if (elem instanceof JZTrack) {
			window = buildJZTrack(window, (JZTrack)elem);
		} else if (elem instanceof JZContainer) {
			window = buildJZContainer(window, (JZContainer)elem);
		} else if (elem instanceof JZCustomButton) {
			window = buildJZCustomButton(window, (JZCustomButton)elem);
		} else if (elem instanceof JZKnob) {
			window = buildJZKnob(window, (JZKnob)elem);
		} else if (elem instanceof JZLed) {
			window = buildJZLed(window, (JZLed)elem);
		} else if (elem instanceof JZLemurMenu) {
			window = buildJZLemurMenu(window, (JZLemurMenu)elem);
		} else if (elem instanceof JZLemurMonitor) {
			window = buildJZLemurMonitor(window, (JZLemurMonitor)elem);
		} else if (elem instanceof JZMultiBalls) {
			window = buildJZMultiBalls(window, (JZMultiBalls)elem);
		} else if (elem instanceof JZmultiSlider) {
			window = buildJZmultiSlider(window, (JZmultiSlider)elem);
		} else if (elem instanceof JZGesture) {
			window = buildJZGesture(window, (JZGesture)elem);
		} else if (elem instanceof JZRange) {
			window = buildJZRange(window, (JZRange)elem);
		} else if (elem instanceof JZRingArea) {
			window = buildJZRingArea(window, (JZRingArea)elem);
		} else if (elem instanceof JZTrack) {
			window = buildJZTrack(window, (JZTrack)elem);
		} else if (elem instanceof JZText) {
			window = buildJZText(window, (JZText)elem);
		}
		return window;
	}
}
