/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
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

package net.sf.smbt.jazzmutant.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import net.sf.smbt.jazzmutant.model.jzml.JZML;
import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.PARAM;
import net.sf.smbt.jazzmutant.model.jzml.VARIABLE;
import net.sf.smbt.jazzmutant.model.jzml.WINDOW;
import net.sf.smbt.jazzmutant.model.jzml.util.JzmlResourceFactoryImpl;
import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JZContainer;
import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JZFader;
import net.sf.smbt.jzmui.JZGesture;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JZLemurMenu;
import net.sf.smbt.jzmui.JZLemurMonitor;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JZPads;
import net.sf.smbt.jzmui.JZRange;
import net.sf.smbt.jzmui.JZRingArea;
import net.sf.smbt.jzmui.JZSignalScope;
import net.sf.smbt.jzmui.JZSurfaceLCD;
import net.sf.smbt.jzmui.JZSwitches;
import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.JzmuiFactory;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.smbt.jzmui.LemurTrigger;
import net.sf.smbt.jzmui.OSCDynaProperties;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

public final class JzmlUtils {
	public final static JzmlUtils INSTANCE = new JzmlUtils();
	public final static String JZML_XMLNS_HEADER = new String("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<jzml:JZML xmlns:jzml=\"http:///net.sf.smbt.jazzmutant/model/jzml.xsd\">".getBytes(), Charset.forName("UTF-8"));
	public final static String JZML_XMLNS_FOOTER = new String("</jzml:JZML>");
	

	
	public void dumpJzmlFile(JZML top, String destDirname, String destFilename) {

		
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(JzmlPackage.eNS_PREFIX, new JzmlResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(JzmlPackage.eNS_URI, JzmlPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(JzmlPackage.eNS_URI, JzmlPackage.eINSTANCE);

		String dirname;
		if (destDirname == null) {
			dirname = Platform.getInstanceLocation().getURL().getPath() + "/" + UUID.randomUUID().toString();
			
			if (Platform.inDebugMode()) {
				System.out.println("creating " + dirname + " directory");
			}
			
			new File(dirname).mkdir();
		} else {
			dirname = destDirname;
		}
		
		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(dirname + "/" + destFilename + ".jzml");
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.createResource(touchoscURI);
		
		resource.getContents().add(top);

		try {
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String path = touchoscURI.path().toString();
		
		try {
			FileInputStream jzmlFile = new FileInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(jzmlFile, Charset.forName("ASCII")));
			CharBuffer charBuffer = CharBuffer.allocate(65535);
			while (reader.read(charBuffer) != -1)			
			
			charBuffer.flip();
			
			String content = charBuffer.toString();
			content = content.replace(JZML_XMLNS_HEADER, "<JZML>");
			content = content.replace(JZML_XMLNS_FOOTER, "</JZML>");
//			content = content.replace("<layout>", "<layout version=\"10\" mode=\"0\" orientation=\"horizontal\">");
//			content = content.replace("numberX=", "number_x=");
//			content = content.replace("numberY=", "number_y=");
//			content = content.replace("invertedX=", "inverted_x=");
//			content = content.replace("invertedY=", "inverted_y=");
//			content = content.replace("localOff=", "local_off=");
//			content = content.replace("oscCs=", "osc_cs=");

			jzmlFile.close();
			
			FileOutputStream os	= new FileOutputStream(path);
			
			BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(
					os, 
					Charset.forName("UTF-8")
				)
			);
			
			writer.write(content);
			writer.flush();
			
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}


		
	}

	
	/**
	 * Initialize UI model from a .jzml file
	 * 
	 * @param jzmlFilePath a .jzml file
	 * 
	 * @return UI model
	 */
	public LemurLiveApp loadLemurLiveAppFromXML(String jzmlFilePath) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(JzmlPackage.eNS_PREFIX, new JzmlResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(JzmlPackage.eNS_URI, JzmlPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(JzmuiPackage.eNS_URI, JzmuiPackage.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		JzmlPackage jzmlPackage = JzmlPackage.eINSTANCE;
		JzmuiPackage jzmuiPackage = JzmuiPackage.eINSTANCE;
		
		if (Platform.inDebugMode()) {
			System.out.println("init " + jzmlPackage.getNsURI());
			System.out.println("init " + jzmuiPackage.getNsURI());
		}

		File jzmlFile = new File(jzmlFilePath);
		try {
			FileInputStream fileIS = new FileInputStream(jzmlFile);
			byte[] buffer = new byte[fileIS.available()];
			fileIS.read(buffer);
			fileIS.close();
			
			String content = new String(buffer, Charset.forName("UTF-8"));
			content = content.replace("<JZML>", JZML_XMLNS_HEADER);
			content = content.replace("</JZML>",JZML_XMLNS_FOOTER);
			
			FileOutputStream neOutputStream = new FileOutputStream(jzmlFile);
			neOutputStream.write(content.getBytes());
			neOutputStream.flush();
			neOutputStream.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		//
		// Get the URI of the model file.
		//
		URI jzmlURI = URI.createFileURI(jzmlFile.getAbsolutePath());
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(jzmlURI, true);
		
		Object obj = (Object) resource.getContents().get(0);
		if (obj instanceof JZML) {
			LemurLiveApp app = initLemurLiveAppFromJzml((JZML) obj);
			
/*			File jzmuiFile = new File(jzmlFilePath.replace(".jzml", ".jzmui"));

			// Get the URI of the model file.
			URI jzmuiURI = URI.createFileURI(jzmuiFile.getAbsolutePath());

			Resource r = resourceSet.createResource(jzmuiURI); 
			r.getContents().add(app);
			
			try {
				r.save(new HashMap<String, String>());
			} catch (IOException e) {
				e.printStackTrace();
			}
*/			
			return app;
		} else {
			return null;
		}
	}
	
	/**
	 * Initialize UI model from a .jzmui file
	 * 
	 * @param jzmuiFilePath a .jzmui file
	 * 
	 * @return UI model
	 */
	public LemurLiveApp loadLemurLiveAppFromJzmuiXML(String jzmuiFilePath) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(JzmlPackage.eNS_PREFIX, new JzmlResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(JzmlPackage.eNS_URI, JzmlPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(JzmuiPackage.eNS_URI, JzmuiPackage.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		JzmlPackage jzmlPackage = JzmlPackage.eINSTANCE;
		JzmuiPackage jzmuiPackage = JzmuiPackage.eINSTANCE;
		
		if (Platform.inDebugMode()) {
			System.out.println("init " + jzmlPackage.getNsURI());
			System.out.println("init " + jzmuiPackage.getNsURI());
		}

		File jzmlFile = new File(jzmuiFilePath);
			
		//
		// Get the URI of the model file.
		//
		URI jzmlURI = URI.createFileURI(jzmlFile.getAbsolutePath());
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(jzmlURI, true);
		
		Object obj = (Object) resource.getContents().get(0);
		if (obj instanceof LemurLiveApp) {
			return(LemurLiveApp) obj;
		} else {
			return null;
		}
	}
	
	/**
	 * Initialize Lemur UI root elem
	 * 
	 * @param jzml UI description just loaded from .jzml file
	 * 
	 * @return newly created UI
	 */
	public LemurLiveApp initLemurLiveAppFromJzml(JZML jzml) {
		LemurLiveApp lemurApp = JzmuiFactory.eINSTANCE.createLemurLiveApp(); 
		//PROJECT project = jzml.getPROJECT();
		for (WINDOW w : jzml.getWINDOW()) {
			initLemurWidgets(lemurApp, w);
		}
		return lemurApp;
	}
	
	/**
	 * UI initialization
	 * 
	 * @param lemurApp UI model
	 * @param window window definition from the .Jzml file
	 */
	void initLemurWidgets(LemurLiveApp lemurApp, WINDOW  window) {
		lemurApp.setConfigurations(JzmuiFactory.eINSTANCE.createJZConfigurationManager());
		JZUIElem elem = initJZUIElemFromWINDOW(window);
		//
		// Add if widget had successfully been created
		//
		if (elem instanceof JZUIElem) {
			lemurApp.getElements().add(elem);
			if (elem instanceof JZContainer) {
				initJZUIElemFromWINDOW((JZContainer) elem, window.getWINDOW());
			}
		}
	}
	
	/**
	 * recursive window initialization
	 * 
	 * @param parent parent UI element
	 * @param windows corresponding model element
	 */
	protected void initJZUIElemFromWINDOW(JZContainer parent, EList<WINDOW> windows) {
		for (WINDOW w : windows) {
			JZUIElem elem = initJZUIElemFromWINDOW(w);
			parent.getChildren().add(elem);
			if (elem instanceof JZContainer) {
				initJZUIElemFromWINDOW((JZContainer)elem, w.getWINDOW());
			}
		}
	}
	
	/**
	 * Widget initialization
	 * 
	 * @param window given Window values
	 * 
	 * @return new created {@link JZUIElem} from the {@link WINDOW} description valuation
	 */
	protected JZUIElem initJZUIElemFromWINDOW(WINDOW window) {
		String clazz = window.getClass_();
		JZUIElem elem = null;
		if (clazz.equals("CustomButton")) {
			elem = initCustomButton(window);
		} else if (clazz.equals("Fader")) {
			elem = initFader(window);
		} else if (clazz.equals("SignalScope")) {
			elem = initSignalScope(window);
		} else if (clazz.equals("Range")) {
			elem = initRange(window);
		} else if (clazz.equals("Switches")) {
			elem = initSwitches(window);
		} else if (clazz.equals("SurfaceLCD")) {
			elem = initSurfaceLCD(window);
		} else if (clazz.equals("MultiSlider")) {
			elem = initMultiSlider(window);
		} else if (clazz.equals("Multiball")) {
			elem = initMultiball(window);
		} else if (clazz.equals("Monitor")) {
			elem = initMonitor(window);
		} else if (clazz.equals("Container")) {
			elem = initContainer(window);
		} else if (clazz.equals("Breakpoint")) {
			elem = initBreakpoint(window);
		} else if (clazz.equals("Knob")) {
			elem = initKnob(window);
		} else if (clazz.equals("Gesture")) {
			elem = initGesture(window);
		} else if (clazz.equals("Pads")) {
			elem = initPads(window);
		} else if (clazz.equals("Leds")) {
			elem = initLeds(window);
		} else if (clazz.equals("Text")) {
			elem = initText(window);
		} else if (clazz.equals("LemurMenu")) {
			elem = initLemurMenu(window);
		} else if (clazz.equals("RingArea")) {
			elem = initRingArea(window);
		} else if (clazz.equals("JAZZINTERFACE")) {
			elem = initJAZZINTERFACE(window);
		}
		return elem;
	}
	
	/**
	 * Top widget initialization
	 * @param window root description object
	 * @return newly created top interface
	 */
	private JZJazzInterface initJAZZINTERFACE(WINDOW  window) {
		JZJazzInterface elem = JzmuiFactory.eINSTANCE.createJZJazzInterface();
		elem.setBounds(
			new Rectangle(
				0,
				0,
				Integer.valueOf(window.getWidth()),
				Integer.valueOf(window.getHeight())
			)
		);
		String[] fontProps = window.getFont().split(",");
		elem.setFontName(fontProps[0]);
		//elem.setFontSize(FONT_SIZE.get(Integer.parseInt(fontProps[1])));
		elem.setFontStyle(Integer.parseInt(fontProps[2]));
		elem.setWidth(Integer.parseInt(window.getWidth()));
		elem.setHeight(Integer.parseInt(window.getHeight()));
		elem.setBounds(new Rectangle(0, 0, elem.getWidth(), elem.getHeight()));
		return elem;
	}
	
	/**
	 * Common values initialization 
	 * @param window {@link WINDOW} description from ".jzml" loading
	 * @param elem UI element from {@link WINDOW} description
	 */
	protected void initCommonStuff(WINDOW window, JZUIElem elem) {
		elem.setBounds(
			new Rectangle(
				Integer.valueOf(window.getX()),
				Integer.valueOf(window.getY()),
				Integer.valueOf(window.getWidth()),
				Integer.valueOf(window.getHeight())
			)
		);
		String[] fontProps = window.getFont().split(",");
		elem.setFontName(fontProps[0]==null?"tahoma":fontProps[0]);
		//elem.setFontSize(FONT_SIZE.get(Integer.parseInt(fontProps[1]==null?"12":fontProps[1])));
		elem.setFontStyle(0);
		
		for (VARIABLE v : window.getVARIABLE()) {
			initDynaPropertiesFromVARIABLE(elem, v);
		}
		
		for (PARAM p : window.getPARAM()) {
			initDynaPropertiesFromPARAM(elem, p);
		}
	}
	
	private void initDynaPropertiesFromPARAM(JZUIElem elem, PARAM p) {
		String eName = p.getName();
		for (EAttribute attr : elem.eClass().getEAllAttributes()) {
			if (attr.getName().equals(eName)) {
				initOscDynaPropertyFromPARAM(elem, p, !p.getOscTarget().equals("-1"));
//				initMidiDynaPropertyFromPARAM(elem, p, !p.getOscTarget().equals("-1"));
//				initKBDynaPropertyFromPARAM(elem, p, !p.getOscTarget().equals("-1"));
			}
		}
	}
	private void initDynaPropertiesFromVARIABLE(JZUIElem elem, VARIABLE v) {
		initOscDynaPropertyFromVARIABLE(elem, v, !v.getOscTarget().equals("-1"));
//		initMidiDynaPropertyFromVARIABLE(elem, v, !v.getOscTarget().equals("-1"));
//		initKBDynaPropertyFromVARIABLE(elem, v, !v.getOscTarget().equals("-1"));
	}
/*
	private void initMidiDynaPropertyFromVARIABLE(JZUIElem elem, VARIABLE v, boolean custom) {
		v.getMidiMessage();
		v.getMidiScale();
		v.getMidiTarget();
		v.getMidiTrigger();
	}
	
	private void initKBDynaPropertyFromVARIABLE(JZUIElem elem, VARIABLE v, boolean custom) {
		v.getKbmouseMessage();
		v.getKbmouseScale();
		v.getKbmouseTarget();
		v.getKbmouseTrigger();
	}
*/	
	private void initOscDynaPropertyFromVARIABLE(JZUIElem elem, VARIABLE v, boolean custom) {
		OSCDynaProperties oscDynaProperties = JzmuiFactory.eINSTANCE.createOSCDynaProperties();
		oscDynaProperties.setCustomOscMsg(custom);
		
		String[] parts = v.getName().split("=");
		
		 System.out.println("VARIABLE: " + v.getName());

		 oscDynaProperties.setOscMsg(
			LemurCmdUtils.INSTANCE.createLemurOscCmd(
				v.getOscMessage(), 
				elem.eClass().getEStructuralFeature(parts[0])
			)
		);
		oscDynaProperties.setLemurTrigger(getLemurTriggerFromID(v.getOscTrigger()));
		oscDynaProperties.setEStructuralFeature(elem.eClass().getEStructuralFeature(parts[0]));
		oscDynaProperties.setTarget(v.getOscTarget());

		//elem.getOscProperties().add(oscDynaProperties);
		
		// v.getOscScale();
	}
	
/*
	private void initMidiDynaPropertyFromPARAM(JZUIElem elem, PARAM p, boolean custom) {
		p.getMidiMessage();
		p.getMidiScale();
		p.getMidiTarget();
		p.getMidiTrigger();
	}
	
	private void initKBDynaPropertyFromPARAM(JZUIElem elem, PARAM p, boolean custom) {
		p.getKbmouseMessage();
		p.getKbmouseScale();
		p.getKbmouseTarget();
		p.getKbmouseTrigger();
	}
*/
	
	private void initOscDynaPropertyFromPARAM(JZUIElem elem, PARAM p, boolean custom) {
		OSCDynaProperties oscDynaProperties = JzmuiFactory.eINSTANCE.createOSCDynaProperties();
		oscDynaProperties.setCustomOscMsg(custom);
		
		String[] parts = p.getName().split("=");
		
		oscDynaProperties.setEStructuralFeature(elem.eClass().getEStructuralFeature(parts[0]));
		
		System.out.println("PARAM  : " + p.getName());

		oscDynaProperties.setOscMsg(
				LemurCmdUtils.INSTANCE.createLemurOscCmd(
				p.getOscMessage(),
				elem.eClass().getEStructuralFeature(parts[0])
			)
		);
		oscDynaProperties.setLemurTrigger(getLemurTriggerFromID(p.getOscTrigger()));
		oscDynaProperties.setEStructuralFeature(elem.eClass().getEStructuralFeature(parts[0]));
		oscDynaProperties.setTarget(p.getOscTarget());
		
		//elem.getOscProperties().add(oscDynaProperties);

		// v.getOscScale();
	}
	
	private LemurTrigger getLemurTriggerFromID(String ID) {
		int id = Integer.parseInt(ID);
		for (LemurTrigger e : LemurTrigger.VALUES) {
			if (id == e.getValue()) {
				return e;
			}
		}
		return LemurTrigger.ANY;
	}
	
	
	//
	// 
	//
	
	private JZCustomButton initCustomButton(WINDOW  window) {
		JZCustomButton elem = JzmuiFactory.eINSTANCE.createJZCustomButton();
		initCommonStuff(window, elem);
		
		String[] colors = window.getColor().split(",");
		
		elem.setColorOn(JzmlUiUtils.INSTANCE.getColorFromHash(colors[0]));
		elem.setColorOff(JzmlUiUtils.INSTANCE.getColorFromHash(colors[1]));
		
		//elem.setStyleOn();
		//elem.setStyleOff();
		
		//elem.setDmxMsg(window.get);
		//elem.setOscMsg(window.getOscTarget());
		//elem.setMidiMsg(window.getMidiTarget());
		
		elem.setOutline(window.getOutline().equals("0")?false:true);
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????

		return elem;
	}
	
	private JZFader initFader(WINDOW  window) {
		JZFader elem = JzmuiFactory.eINSTANCE.createJZFader();
		elem.setPrecision(Integer.parseInt(window.getPrecision()));
		elem.setUnit(window.getUnit());
		elem.setValue(Float.parseFloat(window.getValue()));
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZSignalScope initSignalScope(WINDOW  window) {
		JZSignalScope elem = JzmuiFactory.eINSTANCE.createJZSignalScope();
		elem.setTransparent(true); // FIXME : where is it ????
		elem.setModeXY("true".equalsIgnoreCase(window.getMode()));
		elem.setName(window.getLabel());
		elem.setFriction((window.getFriction()==null || window.getFriction()=="")?0f:Float.parseFloat(window.getFriction()));
		elem.setHeight((window.getHeight()==null || window.getHeight()=="")?0f:Float.parseFloat(window.getHeight()));
		elem.setTension((window.getTension()==null || window.getTension()=="")?0f:Float.parseFloat(window.getTension()));
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZRange initRange(WINDOW  window) {
		JZRange elem = JzmuiFactory.eINSTANCE.createJZRange();
		elem.setName(window.getLabel());
		elem.setLight(0); // FIXME : where is it ????
		elem.setHorizontal(window.getHorizontal().equals("0")?false:true);
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZSwitches initSwitches(WINDOW  window) {
		JZSwitches elem = JzmuiFactory.eINSTANCE.createJZSwitches();
		elem.setRows(Integer.parseInt(window.getRow()));
		elem.setColumns(Integer.parseInt(window.getColumn()));
		elem.setRadio(window.getRadio().equals("0")?false:true);
		//elem.setNumbers(Integer.parseInt(window.getNbr()));
		elem.setMultilabel(window.getMultilabel().equals("0")?false:true);
		elem.setMulticolor(window.getMulticolor().equals("0")?false:true);
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????
		initCommonStuff(window, elem);
		return elem;
	}

	private JZSurfaceLCD initSurfaceLCD(WINDOW  window) {
		JZSurfaceLCD elem = JzmuiFactory.eINSTANCE.createJZSurfaceLCD();
		//elem.setBottom();
		elem.setDisplay(window.getDisplay());
		elem.setTarget(window.getTarget());
		//elem.setTop();
		elem.setTransparent(true); // FIXME : where is it ????
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZmultiSlider initMultiSlider(WINDOW  window) {
		JZmultiSlider elem = JzmuiFactory.eINSTANCE.createJZmultiSlider();
		elem.setBipolar(window.getBipolar().equals("0")?false:true);
		elem.setGradient(window.getGradient());
		elem.setHorizontal(window.getHorizontal().equals("0")?false:true);
		elem.setName(window.getLabel());
		elem.setFriction((window.getFriction()==null || window.getFriction()=="")?0f:Float.parseFloat(window.getFriction()));
		elem.setHeight((window.getHeight()==null || window.getHeight()=="")?0f:Float.parseFloat(window.getHeight()));
		elem.setTension((window.getTension()==null || window.getTension()=="")?0f:Float.parseFloat(window.getTension()));
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????
		elem.setMulticolor(window.getMulticolor().equals("0")?false:true);
		elem.setSlider(Integer.parseInt(window.getNbr()));
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZMultiBalls initMultiball(WINDOW  window) {
		JZMultiBalls elem = JzmuiFactory.eINSTANCE.createJZMultiBalls();
		initCommonStuff(window, elem);
		
		elem.setAttack((window.getAttack()==null || window.getAttack()=="")?0f:Float.parseFloat(window.getAttack()));
		elem.setDecay((window.getDecay()==null || window.getDecay()=="")?0f:Float.parseFloat(window.getDecay()));
		elem.setRelease((window.getRelease()==null || window.getRelease()=="")?0f:Float.parseFloat(window.getRelease()));
		elem.setSustain((window.getDecay()==null || window.getDecay()=="")?0f:Float.parseFloat(window.getSustain()));
		elem.setHold((window.getHold()==null || window.getHold()=="")?0f:Float.parseFloat(window.getHold()));
		elem.setHeight((window.getHeight()==null || window.getHeight()=="")?0f:Float.parseFloat(window.getHeight()));
		elem.setTension((window.getTension()==null || window.getTension()=="")?0f:Float.parseFloat(window.getTension()));
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????
		elem.setBalls((window.getNbr()==null || window.getNbr()=="")?0:Integer.parseInt(window.getNbr())); // FIXME : where is it ????
		
		String[] parts = window.getGridSteps().split(",");
		elem.setGridStepX((parts[0]==null || parts[0]=="")?0:Integer.parseInt(parts[0]));
		elem.setGridStepY((parts[1]==null || parts[1]=="")?0:Integer.parseInt(parts[1]));

		elem.setFriction((window.getFriction()==null || window.getFriction()=="")?0f:Float.parseFloat(window.getFriction()));
		elem.setHoldX((window.getHoldX()==null || window.getHoldX()=="")?0f:Float.parseFloat(window.getHoldX()));
		elem.setHoldY((window.getHoldY()==null || window.getHoldY()=="")?0f:Float.parseFloat(window.getHoldY()));
		
		elem.setSpeed((window.getSpeed()==null || window.getSpeed()=="")?0f:Float.parseFloat(window.getSpeed()));
		elem.setZ((window.getZ()==null || window.getZ()=="")?0f:Float.parseFloat(window.getZ()));
		
		return elem;
	}
	
	private JZLemurMonitor initMonitor(WINDOW  window) {
		JZLemurMonitor elem = JzmuiFactory.eINSTANCE.createJZLemurMonitor();
		elem.setName(window.getLabel());
		elem.setPrecision(Integer.parseInt(window.getPrecision()));
		elem.setTransparent(false); // FIXME : where is it ????
		elem.setUnit(window.getUnit());
		elem.setValue(Float.parseFloat(window.getValue()));
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZContainer initContainer(WINDOW  window) {
		JZContainer elem = JzmuiFactory.eINSTANCE.createJZContainer();
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZBreakPoint initBreakpoint(WINDOW  window) {
		JZBreakPoint elem = JzmuiFactory.eINSTANCE.createJZBreakPoint();
		//elem.setBackground();
		elem.setCoordinates(window.getCoordinates().equals("0")?false:true);
		elem.setAttraction((window.getFriction()==null || window.getFriction()=="")?0f:Float.parseFloat(window.getFriction()));
		elem.setFriction((window.getFriction()==null || window.getFriction()=="")?0f:Float.parseFloat(window.getFriction()));
		elem.setEdit((window.getEdit()==null || window.getEdit()=="")?0f:Float.parseFloat(window.getEdit()));
		elem.setPoints((window.getNbr()==null || window.getNbr()=="")?0:Integer.parseInt(window.getNbr()));
		elem.setRest((window.getRest()==null || window.getRest()=="")?0f:Float.parseFloat(window.getRest()));
		elem.setHold((window.getHold()==null || window.getHold()=="")?0f:Float.parseFloat(window.getHold()));
		elem.setHoldX((window.getHoldX()==null || window.getHoldX()=="")?0f:Float.parseFloat(window.getHoldX()));
		elem.setHoldY((window.getHoldY()==null || window.getHoldY()=="")?0f:Float.parseFloat(window.getHoldY()));
		elem.setName(window.getLabel());
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????
		elem.setLiveEditing(false);
		//elem.setPoints();
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZKnob initKnob(WINDOW  window) {
		JZKnob elem = JzmuiFactory.eINSTANCE.createJZKnob();
		//elem.setBackgroud();
		elem.setEndlessKnob(false);  // FIXME : where is it ????
		//elem.setForeground();
		elem.setName(window.getLabel());
		elem.setPrecision(Integer.parseInt(window.getPrecision()));
		elem.setUnit(window.getUnit());
		elem.setValue(Float.parseFloat(window.getValue()));
		elem.setAttack((window.getAttack()==null || window.getAttack()=="")?0f:Float.parseFloat(window.getAttack()));
		elem.setDecay((window.getDecay()==null || window.getDecay()=="")?0f:Float.parseFloat(window.getDecay()));
		elem.setRelease((window.getRelease()==null || window.getRelease()=="")?0f:Float.parseFloat(window.getRelease()));
		elem.setSustain((window.getDecay()==null || window.getDecay()=="")?0f:Float.parseFloat(window.getSustain()));
		elem.setHold((window.getHold()==null || window.getHold()=="")?0f:Float.parseFloat(window.getHold()));
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZGesture initGesture(WINDOW  window) {
		JZGesture elem = JzmuiFactory.eINSTANCE.createJZGesture();
		elem.setTransparent(false);
		elem.setPan((window.getPan()==null || window.getPan()=="")?0f:Float.parseFloat(window.getPan()));
		elem.setPinch((window.getPinch()==null || window.getPinch()=="")?0f:Float.parseFloat(window.getPinch()));
		elem.setAngle((window.getAngle()==null || window.getAngle()=="")?0f:Float.parseFloat(window.getAngle()));
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZPads initPads(WINDOW  window) {
		JZPads elem = JzmuiFactory.eINSTANCE.createJZPads();
		//elem.setColorOff();
		//elem.setColorOn();
		elem.setColumns(Integer.parseInt(window.getColumn()));
		elem.setRows(Integer.parseInt(window.getRow()));
		//elem.setNumbers(Integer.parseInt(window.getNbr()));
		elem.setMultilabel(window.getMultilabel().equals("0")?false:true);
		elem.setMulticolor(window.getMulticolor().equals("0")?false:true);
		elem.setAttack((window.getAttack()==null || window.getAttack()=="")?0f:Float.parseFloat(window.getAttack()));
		elem.setDecay((window.getDecay()==null || window.getDecay()=="")?0f:Float.parseFloat(window.getDecay()));
		elem.setRelease((window.getRelease()==null || window.getRelease()=="")?0f:Float.parseFloat(window.getRelease()));
		elem.setSustain((window.getDecay()==null || window.getDecay()=="")?0f:Float.parseFloat(window.getSustain()));
		elem.setHold((window.getHold()==null || window.getHold()=="")?0f:Float.parseFloat(window.getHold()));
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZLed initLeds(WINDOW  window) {
		JZLed elem = JzmuiFactory.eINSTANCE.createJZLed();
		elem.setBargraph(window.getBargraph().equals("0")?false:true);
		//elem.setColorOff();
		//elem.setColorOn();
		elem.setColumns(Integer.parseInt(window.getColumn()));
		elem.setRows(Integer.parseInt(window.getRow()));
		elem.setName(window.getLabel());
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????
		elem.setMulticolor(window.getMulticolor().equals("0")?false:true);
		elem.setTransparent(false); // FIXME : where is it ????
		//elem.setValue(Float.parseFloat(window.getValue()));
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZText initText(WINDOW  window) {
		JZText elem = JzmuiFactory.eINSTANCE.createJZText();
		elem.setLight((window.getLight()==null || window.getLight()=="")?0f:Float.parseFloat(window.getLight())); // FIXME : where is it ????
		elem.setText(window.getText());
		elem.setTransparent(false); // FIXME : where is it ????
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZLemurMenu initLemurMenu(WINDOW  window) {
		JZLemurMenu elem = JzmuiFactory.eINSTANCE.createJZLemurMenu();
		elem.setScaleOutput(false); // FIXME : where is it ????
		elem.setTransparent(false);
		initCommonStuff(window, elem);
		return elem;
	}
	
	private JZRingArea initRingArea(WINDOW  window) {
		JZRingArea elem = JzmuiFactory.eINSTANCE.createJZRingArea();
		initCommonStuff(window, elem);
		return elem;
	}
}
