/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2012, Lucas Bigeardel
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

package net.sf.smbt.touchosc.diagram.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.touchosc.touchosc.Layout;
import net.sf.smbt.touchosc.touchosc.TOP;
import net.sf.smbt.touchosc.touchosc.Tabpage;
import net.sf.smbt.touchosc.touchosc.TouchoscFactory;
import net.sf.smbt.touchosc.touchoscapp.BatteryH;
import net.sf.smbt.touchosc.touchoscapp.BatteryV;
import net.sf.smbt.touchosc.touchoscapp.Encoder;
import net.sf.smbt.touchosc.touchoscapp.FaderH;
import net.sf.smbt.touchosc.touchoscapp.FaderV;
import net.sf.smbt.touchosc.touchoscapp.LED;
import net.sf.smbt.touchosc.touchoscapp.LabelH;
import net.sf.smbt.touchosc.touchoscapp.LabelV;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderH;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderV;
import net.sf.smbt.touchosc.touchoscapp.MultiPush;
import net.sf.smbt.touchosc.touchoscapp.MultiToggle;
import net.sf.smbt.touchosc.touchoscapp.Push;
import net.sf.smbt.touchosc.touchoscapp.RotaryH;
import net.sf.smbt.touchosc.touchoscapp.RotaryV;
import net.sf.smbt.touchosc.touchoscapp.Tab;
import net.sf.smbt.touchosc.touchoscapp.TimeH;
import net.sf.smbt.touchosc.touchoscapp.TimeV;
import net.sf.smbt.touchosc.touchoscapp.Toggle;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.touchoscapp.Widget;
import net.sf.smbt.touchosc.touchoscapp.XYPad;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiFactory;
import net.sf.smbt.touchosc.utils.TouchOSCGuiUtils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class TouchOscGuiUtilities {
	public final static TouchOscGuiUtilities INSTANCE = new TouchOscGuiUtilities();
	private Map<String, Color> colorsMap;
	
	private static Map<String, Integer> counter;
	
	public TouchOscGuiUtilities() {
		colorsMap = new HashMap<String, Color>();
		colorsMap.put("red", Display.getDefault().getSystemColor(SWT.COLOR_RED));
		colorsMap.put("green", Display.getDefault().getSystemColor(SWT.COLOR_GREEN));
		colorsMap.put("blue", Display.getDefault().getSystemColor(SWT.COLOR_CYAN));
		colorsMap.put("yellow", Display.getDefault().getSystemColor(SWT.COLOR_YELLOW));
		colorsMap.put("orange", ColorConstants.orange);
		colorsMap.put("gray", Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
		colorsMap.put("purple", Display.getDefault().getSystemColor(SWT.COLOR_MAGENTA));
		colorsMap.put("coal", new Color(Display.getDefault(), new RGB(40, 40, 40)));
		colorsMap.put("black", ColorConstants.black);
		counter = new HashMap<String, Integer>();
	}
	
	public int getCounter(String key) {
		if (!counter.containsKey(key)) {
			counter.put(key, 2);
			return 1;
		} 
		int index = counter.get(key);
		return counter.put(key, index+1);
	}
	
	public Color getColor(String key) {
		return colorsMap.get(key);
	}
	
	public net.sf.smbt.touchosc.ui.touchoscgui.TOP createGUICanonicalFromTouchOscApp(TouchOscApp app) {
		net.sf.smbt.touchosc.ui.touchoscgui.TOP top = TouchoscguiFactory.eINSTANCE.createTOP();
		TouchOscLayout layout = TouchoscguiFactory.eINSTANCE.createTouchOscLayout();
		top.setLayouts(layout);
		top.getLayouts().setVersion("10");
		top.getLayouts().setMode(app.getMode() == null ? "0" : app.getMode());
		top.getLayouts().setWidth(app.getWidth() <= 0 ? ("0".equals(app.getMode()) ? 480 : 1024) : app.getWidth());
		top.getLayouts().setHeight(app.getHeight() <= 0 ?  ("0".equals(app.getMode()) ? 320 : 768) : app.getWidth());
		top.getLayouts().setOrientation(app.getOrientation().getLiteral());
		top.getLayouts().getTabs().addAll(buildGUICanonicalTabPagesFromApp(app.getTabs()));
		return top;
	}
	
	public List<OscCmd> dumpGuiAsOsc(TouchOscLayout layout) {
		List<OscCmd> lst = new ArrayList<OscCmd>();
		collectOscMessagesFromTouchOscGui(layout.getTabs(), lst, "");
		return lst;
	}
	
	public void collectOscMessagesFromTouchOscGui(List<TouchOscTabPage> pages, List<OscCmd> lst, String lvl){
		for (TouchOscTabPage p : pages) {
			collectOscMessagesFromTouchOscPage(getControls(p), lst, lvl + "/" + p.getName());
		}
	}
	
	public void collectOscMessagesFromTouchOscPage(List<TouchOscControl> controls, List<OscCmd> lst, String lvl){
		for (TouchOscControl c : controls) {
			if (c.getOsc_cs() != null && c.getOsc_cs() != "") {
				lst.add(OscCmdUtils.INSTANCE.createOscCmd(c.getOsc_cs()));
			} else {
				lst.add(OscCmdUtils.INSTANCE.createOscCmd(lvl + "/" + c.getName()));
			}
		}
	}
	
	private List<TouchOscControl> getControls(TouchOscTabPage page) {
		List<TouchOscControl> widgets = new ArrayList<TouchOscControl>();
		widgets.addAll(page.getBatteriesH());
		widgets.addAll(page.getBatteriesV());
		widgets.addAll(page.getEncoders());
		widgets.addAll(page.getFadersH());
		widgets.addAll(page.getFadersV());
		widgets.addAll(page.getLabelsH());
		widgets.addAll(page.getLabelsV());
		widgets.addAll(page.getLeds());
		widgets.addAll(page.getMultiFadersH());
		widgets.addAll(page.getMultiFadersV());
		widgets.addAll(page.getMultiPushes());
		widgets.addAll(page.getMultiToggles());
		widgets.addAll(page.getPushes());
		widgets.addAll(page.getToggles());
		widgets.addAll(page.getRotariesH());
		widgets.addAll(page.getRotariesV());
		widgets.addAll(page.getXyPads());
		widgets.addAll(page.getTimesH());
		widgets.addAll(page.getTimesV());
		return widgets;
	}

	
	public List<TouchOscTabPage> buildGUICanonicalTabPagesFromApp(List<Tab> tabs) {
		List<TouchOscTabPage> pages = new ArrayList<TouchOscTabPage>();
		for (Tab t : tabs) {
			pages.add(buildTouchOscTabPageFromAppTab(t));
		}
		return pages;
	}
	private TouchOscTabPage buildTouchOscTabPageFromAppTab(Tab tab) {
		TouchOscTabPage page = TouchoscguiFactory.eINSTANCE.createTouchOscTabPage();
		initPageFromWidgets(page, tab.getWidgets());
		return page;
	}
	private void initPageFromWidgets(TouchOscTabPage page, List<Widget> widgets) {
		for (Widget w : widgets) {
			if (w instanceof BatteryH) {
				page.getBatteriesH().add(buildTouchOscBatteryH(w));
			} else if (w instanceof BatteryV) {
				page.getBatteriesV().add(buildTouchOscBatteryV(w));
			} if (w instanceof Encoder) {
				page.getEncoders().add(buildTouchOscEncoder(w));
			} else if (w instanceof FaderH) {
				page.getFadersH().add(buildTouchOscFaderH(w));
			} if (w instanceof FaderV) {
				page.getFadersV().add(buildTouchOscFaderV(w));
			} else if (w instanceof LabelH) {
				page.getLabelsH().add(buildTouchOscLabelH(w));
			} if (w instanceof LabelV) {
				page.getLabelsV().add(buildTouchOscLabelV(w));
			} else if (w instanceof LED) {
				page.getLeds().add(buildTouchOscLED(w));
			} if (w instanceof MultiFaderH) {
				page.getMultiFadersH().add(buildTouchOscMultiFaderH(w));
			} else if (w instanceof MultiFaderV) {
				page.getMultiFadersV().add(buildTouchOscMultiFaderV(w));
			} if (w instanceof MultiPush) {
				page.getMultiPushes().add(buildTouchOscMultiPush(w));
			} else if (w instanceof MultiToggle) {
				page.getMultiToggles().add(buildTouchOscMultiToggle(w));
			} if (w instanceof RotaryH) {
				page.getRotariesH().add(buildTouchOscRotaryH(w));
			} else if (w instanceof RotaryV) {
				page.getRotariesV().add(buildTouchOscRotaryV(w));
			} if (w instanceof TimeH) {
				page.getTimesH().add(buildTouchOscTimeH(w));
			} else if (w instanceof TimeV) {
				page.getTimesV().add(buildTouchOscTimeV(w));
			} else if (w instanceof Toggle) {
				page.getToggles().add(buildTouchOscToggle(w));
			} if (w instanceof XYPad) {
				page.getXyPads().add(buildTouchOscXYPad(w));
			} 
		}
	}
	private void initFromWidget(Widget w, TouchOscControl ctrl) {
		ctrl.setX(w.getX());
		ctrl.setY(w.getY());
		ctrl.setW(w.getW());
		ctrl.setH(w.getH());
		ctrl.setFg(w.getColor());
		ctrl.setCentered(w.isCentered());
		ctrl.setInverted(w.isInverted());
		ctrl.setType(w.getType());
		ctrl.setNumber(Integer.parseInt(w.getNumber().equals("")?"1":w.getNumber()));
		ctrl.setOsc_cs(w.getOsc());
		ctrl.setOsc_cs(w.getOsc());
		if (ctrl instanceof TouchOscBatteryH) {
			TouchOscBatteryH touchOscBatteryH = (TouchOscBatteryH) ctrl;
			BatteryH batteryH = (BatteryH) w;
			touchOscBatteryH.setBackground(batteryH.isBackground());
			touchOscBatteryH.setOutline(batteryH.isOutline());
			touchOscBatteryH.setSize(batteryH.getSize());
			touchOscBatteryH.setText(batteryH.getText());
		} else if (ctrl instanceof TouchOscBatteryV) {
			TouchOscBatteryV touchOscBatteryV = (TouchOscBatteryV) ctrl;
			BatteryV batteryV = (BatteryV) w;
			touchOscBatteryV.setBackground(batteryV.isBackground());
			touchOscBatteryV.setOutline(batteryV.isOutline());
			touchOscBatteryV.setSize(batteryV.getSize());
			touchOscBatteryV.setText(batteryV.getText());
		} else if (ctrl instanceof TouchOscEncoder) {
			TouchOscEncoder touchOscEncoder = (TouchOscEncoder) ctrl;
			Encoder encoder = (Encoder) w;
			touchOscEncoder.setScalef(encoder.getFrom());
			touchOscEncoder.setScalet(encoder.getTo());
			touchOscEncoder.setResponse(encoder.getResponse());
		} else if (ctrl instanceof TouchOscFaderH) {
			TouchOscFaderH touchOscFaderH = (TouchOscFaderH) ctrl;
			FaderH faderh = (FaderH) w;
			touchOscFaderH.setScalef(faderh.getFrom());
			touchOscFaderH.setScalet(faderh.getTo());
			touchOscFaderH.setResponse(faderh.getResponse());
		} else if (ctrl instanceof TouchOscFaderV) {
			TouchOscFaderV touchOscFaderV = (TouchOscFaderV) ctrl;
			FaderV faderv = (FaderV) w;
			touchOscFaderV.setScalef(faderv.getFrom());
			touchOscFaderV.setScalet(faderv.getTo());
			touchOscFaderV.setResponse(faderv.getResponse());
		} else if (ctrl instanceof TouchOscLabelH) {
			TouchOscLabelH touchOscLabelH = (TouchOscLabelH) ctrl;
			LabelH label = (LabelH) w;
			touchOscLabelH.setBackground(label.isBackground());
			touchOscLabelH.setOutline(label.isOutline());
			touchOscLabelH.setSize(label.getSize());
			touchOscLabelH.setText(label.getText());
		} else if (ctrl instanceof TouchOscLabelV) {
			TouchOscLabelV touchOscLabelV = (TouchOscLabelV) ctrl;
			LabelV label = (LabelV) w;
			touchOscLabelV.setBackground(label.isBackground());
			touchOscLabelV.setOutline(label.isOutline());
			touchOscLabelV.setSize(label.getSize());
			touchOscLabelV.setText(label.getText());
		} else if (ctrl instanceof TouchOscLED) {
			TouchOscLED touchOscLED = (TouchOscLED) ctrl;
			LED led = (LED) w;
		} else if (ctrl instanceof TouchOscMultiFaderH) {
			TouchOscMultiFaderH touchOscMultiFaderH = (TouchOscMultiFaderH) ctrl;
			MultiFaderH multiFaderH = (MultiFaderH) w;
			touchOscMultiFaderH.setNumber(multiFaderH.getNumFaders());
			touchOscMultiFaderH.setResponse(multiFaderH.getResponse());
		} else if (ctrl instanceof TouchOscMultiFaderV) {
			TouchOscMultiFaderV touchOscMultiFaderV = (TouchOscMultiFaderV) ctrl;
			MultiFaderV multiFaderV = (MultiFaderV) w;
			touchOscMultiFaderV.setNumber(multiFaderV.getNumFaders());
			touchOscMultiFaderV.setResponse(multiFaderV.getResponse());
		} else if (ctrl instanceof TouchOscMultiToggle) {
			TouchOscMultiToggle touchOscMultiToggle = (TouchOscMultiToggle) ctrl;
			MultiToggle led = (MultiToggle) w;
			touchOscMultiToggle.setNumber_y(led.getColumns());
			touchOscMultiToggle.setNumber_x(led.getRows());
		} else if (ctrl instanceof TouchOscMultiPush) {
			TouchOscMultiPush touchOscMultiPush = (TouchOscMultiPush) ctrl;
			MultiPush multiPush = (MultiPush) w;
			touchOscMultiPush.setNumber_x(multiPush.getColumns());
			touchOscMultiPush.setNumber_y(multiPush.getRows());
		} else if (ctrl instanceof TouchOscPush) {
			TouchOscPush touchOscPush = (TouchOscPush) ctrl;
			Push push = (Push) w;
			touchOscPush.setLocalFeedbackOff(push.isLocalFeedbackOff());
		} else if (ctrl instanceof TouchOscRotaryH) { 
			TouchOscRotaryH touchOscRotaryH = (TouchOscRotaryH) ctrl;
			RotaryH rotaryH = (RotaryH) w;
			touchOscRotaryH.setScalef(rotaryH.getFrom());
			touchOscRotaryH.setScalet(rotaryH.getTo());
			touchOscRotaryH.setResponse(rotaryH.getResponse());
		} else if (ctrl instanceof TouchOscRotaryV) {
			TouchOscRotaryV touchOscRotaryV = (TouchOscRotaryV) ctrl;
			RotaryV rotaryV = (RotaryV) w;
			touchOscRotaryV.setScalef(rotaryV.getFrom());
			touchOscRotaryV.setScalet(rotaryV.getTo());
			touchOscRotaryV.setResponse(rotaryV.getResponse());
		} else if (ctrl instanceof TouchOscTimeH) {
			TouchOscTimeH touchOscTimeH = (TouchOscTimeH) ctrl;
			TimeH timeH = (TimeH) w;
			touchOscTimeH.setBackground(timeH.isBackground());
			touchOscTimeH.setOutline(timeH.isOutline());
			touchOscTimeH.setText(timeH.getText());
		} else if (ctrl instanceof TouchOscTimeV) {
			TouchOscTimeV touchOscTimeV = (TouchOscTimeV) ctrl;
			TimeV timeV = (TimeV) w;
			touchOscTimeV.setBackground(timeV.isBackground());
			touchOscTimeV.setOutline(timeV.isOutline());
			touchOscTimeV.setText(timeV.getText());
		} else if (ctrl instanceof TouchOscToggle) {
			TouchOscToggle touchOscToggle = (TouchOscToggle) ctrl;
			Toggle toggle = (Toggle) w;
			touchOscToggle.setLocalFeedbackOff(toggle.isLocalFeedbackOff());
		} else if (ctrl instanceof TouchOscXYPad) {
			TouchOscXYPad touchOscXYpad = (TouchOscXYPad) ctrl;
			XYPad pad = (XYPad) w;
			touchOscXYpad.setInverted_x(pad.isInverted());
			touchOscXYpad.setInverted_y(pad.isInverted());
		}
	}
	
	private TouchOscBatteryH buildTouchOscBatteryH(Widget w) {
		TouchOscBatteryH batteryH = TouchoscguiFactory.eINSTANCE.createTouchOscBatteryH();
		w.setType("batteryh");
		initFromWidget(w, batteryH);
		return batteryH;
	}
	private TouchOscBatteryV buildTouchOscBatteryV(Widget w) {
		TouchOscBatteryV batteryV = TouchoscguiFactory.eINSTANCE.createTouchOscBatteryV();
		w.setType("batteryv");
		initFromWidget(w, batteryV);
		return batteryV;
	}
	private TouchOscEncoder buildTouchOscEncoder(Widget w) {
		TouchOscEncoder encoder = TouchoscguiFactory.eINSTANCE.createTouchOscEncoder();
		w.setType("encoder");
		initFromWidget(w, encoder);
		return encoder;
	}
	private TouchOscFaderH buildTouchOscFaderH(Widget w) {
		TouchOscFaderH faderH = TouchoscguiFactory.eINSTANCE.createTouchOscFaderH();
		w.setType("faderh");
		initFromWidget(w, faderH);
		return faderH;
	}
	private TouchOscFaderV buildTouchOscFaderV(Widget w) {
		TouchOscFaderV faderV = TouchoscguiFactory.eINSTANCE.createTouchOscFaderV();
		w.setType("faderv");
		initFromWidget(w, faderV);
		return faderV;
	}
	private TouchOscLabelH buildTouchOscLabelH(Widget w) {
		TouchOscLabelH labelH = TouchoscguiFactory.eINSTANCE.createTouchOscLabelH();
		w.setType("labelh");
		initFromWidget(w, labelH);
		return labelH;
	}
	private TouchOscLabelV buildTouchOscLabelV(Widget w) {
		TouchOscLabelV labelV = TouchoscguiFactory.eINSTANCE.createTouchOscLabelV();
		w.setType("labelv");
		initFromWidget(w, labelV);
		return labelV;
	}
	private TouchOscLED buildTouchOscLED(Widget w) {
		TouchOscLED led = TouchoscguiFactory.eINSTANCE.createTouchOscLED();
		w.setType("led");
		initFromWidget(w, led);
		return led;
	}
	private TouchOscMultiFaderH buildTouchOscMultiFaderH(Widget w) {
		TouchOscMultiFaderH multiFaderH = TouchoscguiFactory.eINSTANCE.createTouchOscMultiFaderH();
		w.setType("multifaderh");
		initFromWidget(w, multiFaderH);
		return multiFaderH;
	}
	private TouchOscMultiFaderV buildTouchOscMultiFaderV(Widget w) {
		TouchOscMultiFaderV multiFaderV = TouchoscguiFactory.eINSTANCE.createTouchOscMultiFaderV();
		w.setType("multifaderv");
		initFromWidget(w, multiFaderV);
		return multiFaderV;
	}
	private TouchOscMultiPush buildTouchOscMultiPush(Widget w) {
		TouchOscMultiPush multiPush = TouchoscguiFactory.eINSTANCE.createTouchOscMultiPush();
		w.setType("multipush");
		initFromWidget(w, multiPush);
		return multiPush;
	}
	private TouchOscMultiToggle buildTouchOscMultiToggle(Widget w) {
		TouchOscMultiToggle multiToggle = TouchoscguiFactory.eINSTANCE.createTouchOscMultiToggle();
		w.setType("multitoggle");
		initFromWidget(w, multiToggle);
		return multiToggle;
	}
	private TouchOscRotaryH buildTouchOscRotaryH(Widget w) {
		TouchOscRotaryH rotaryH = TouchoscguiFactory.eINSTANCE.createTouchOscRotaryH();
		w.setType("rotaryh");
		initFromWidget(w, rotaryH);
		return rotaryH;
	}
	private TouchOscRotaryV buildTouchOscRotaryV(Widget w) {
		TouchOscRotaryV rotaryV = TouchoscguiFactory.eINSTANCE.createTouchOscRotaryV();
		w.setType("rotaryv");
		initFromWidget(w, rotaryV);
		return rotaryV;
	}
	private TouchOscTimeH buildTouchOscTimeH(Widget w) {
		TouchOscTimeH timeH = TouchoscguiFactory.eINSTANCE.createTouchOscTimeH();
		w.setType("timeh");
		initFromWidget(w, timeH);
		return timeH;
	}
	private TouchOscTimeV buildTouchOscTimeV(Widget w) {
		TouchOscTimeV timeV = TouchoscguiFactory.eINSTANCE.createTouchOscTimeV();
		w.setType("timev");
		initFromWidget(w, timeV);
		return timeV;
	}
	private TouchOscToggle buildTouchOscToggle(Widget w) {
		TouchOscToggle toggle = TouchoscguiFactory.eINSTANCE.createTouchOscToggle();
		w.setType("toggle");
		initFromWidget(w, toggle);
		return toggle;
	}
	private TouchOscXYPad buildTouchOscXYPad(Widget w) {
		TouchOscXYPad pad = TouchoscguiFactory.eINSTANCE.createTouchOscXYPad();
		w.setType("xypad");
		initFromWidget(w, pad);
		return pad;
	}
	public TOP createTouchOSCFromGUICanonical( Dimension dim, String orientation, String mode, List<TouchOscTabPage> pages) {
		TOP top = TouchoscFactory.eINSTANCE.createTOP();
		Layout layout = TouchoscFactory.eINSTANCE.createLayout();
		layout.getTabpage().addAll(createPagesFromGUICanonical(dim, orientation, mode, pages));
		top.setLayout(layout);
		return top;
	}
	public List<Tabpage> createPagesFromGUICanonical( Dimension dim, String orientation, String mode, List<TouchOscTabPage> pages) {
		ArrayList<Tabpage> tabPages = new ArrayList<Tabpage>();
		for (TouchOscTabPage p : pages) {
			tabPages.add(TouchOSCGuiUtils.INSTANCE.buildTabPage(dim, orientation, mode, p));
		}
		return tabPages;
	}
}