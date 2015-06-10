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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import net.sf.smbt.touchosc.touchosc.Control;
import net.sf.smbt.touchosc.touchosc.Layout;
import net.sf.smbt.touchosc.touchosc.TOP;
import net.sf.smbt.touchosc.touchosc.Tabpage;
import net.sf.smbt.touchosc.touchosc.TouchoscPackage;
import net.sf.smbt.touchosc.touchosc.util.TouchoscResourceFactoryImpl;
import net.sf.smbt.touchosc.touchoscapp.BatteryH;
import net.sf.smbt.touchosc.touchoscapp.BatteryV;
import net.sf.smbt.touchosc.touchoscapp.ControlType;
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
import net.sf.smbt.touchosc.touchoscapp.Orientation;
import net.sf.smbt.touchosc.touchoscapp.Push;
import net.sf.smbt.touchosc.touchoscapp.RotaryH;
import net.sf.smbt.touchosc.touchoscapp.RotaryV;
import net.sf.smbt.touchosc.touchoscapp.Tab;
import net.sf.smbt.touchosc.touchoscapp.TimeH;
import net.sf.smbt.touchosc.touchoscapp.TimeV;
import net.sf.smbt.touchosc.touchoscapp.Toggle;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappFactory;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage;
import net.sf.smbt.touchosc.touchoscapp.Widget;
import net.sf.smbt.touchosc.touchoscapp.XYPad;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

public final class TouchOSCUtils {
	public final static TouchOSCUtils INSTANCE = new TouchOSCUtils();
	
	public TouchOSCUtils() {
		base64Ref = new Base64();
	}
	
	private Base64 base64Ref;

	public final static String TOUCHOSC_XMLNS_HEADER = new String("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<touchosc:TOP xmlns:touchosc=\"http:///net.sf.smbt.touchosc/src/net/sf/smbt/touchosc/model/touchosc.xsd\">".getBytes(), Charset.forName("ASCII"));
	
	
	public String loadTouchOscXML(String zipTouchoscFilePath) {
		List<String> touchoscFilePathList = new ArrayList<String>();
		IPath path = new Path(zipTouchoscFilePath);
		String xml = "";
		try {
			FileInputStream touchoscFile = new FileInputStream(zipTouchoscFilePath);
			ZipInputStream fileIS = new ZipInputStream(touchoscFile);
			ZipEntry zEntry = null;
			while ((zEntry = fileIS.getNextEntry()) != null) {
				if (zEntry.getName().endsWith(".xml")) {
					touchoscFilePathList.add(path.removeLastSegments(1) + "/_" + path.lastSegment() );
				}
				BufferedReader reader = new BufferedReader(new InputStreamReader(fileIS, Charset.forName("UTF-8")));
				CharBuffer charBuffer = CharBuffer.allocate(65535);
				while (reader.read(charBuffer) != -1)
				
				charBuffer.flip();
				
				 
				xml = charBuffer.toString();
				
			}
			
			fileIS.close();

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		return xml;
	}
	/**
	 * Initialize UI model from a .jzml file
	 * 
	 * @param zipTouchoscFilePath a .jzml file
	 * 
	 * @return UI model
	 */
	public TouchOscApp loadAppFromTouchOscXML(String zipTouchoscFilePath) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();


		IPath path = new Path(zipTouchoscFilePath);
		
		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(TouchoscPackage.eNS_PREFIX, new TouchoscResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TouchoscPackage.eNS_URI, TouchoscPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TouchoscappPackage.eNS_URI, TouchoscappPackage.eINSTANCE);

		List<String> touchoscFilePathList = new ArrayList<String>();
		try {
			FileInputStream touchoscFile = new FileInputStream(zipTouchoscFilePath);
			ZipInputStream fileIS = new ZipInputStream(touchoscFile);
			
			ZipEntry zEntry = null;
			while ((zEntry = fileIS.getNextEntry()) != null) {
				if (zEntry.getName().endsWith(".xml")) {
					touchoscFilePathList.add(path.removeLastSegments(1) + "/_" + path.lastSegment() );
				}
				FileOutputStream os	= new FileOutputStream(path.removeLastSegments(1) + "/_" + path.lastSegment());
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
				BufferedReader reader = new BufferedReader(new InputStreamReader(fileIS, Charset.forName("UTF-8")));
				CharBuffer charBuffer = CharBuffer.allocate(65535);
				while (reader.read(charBuffer) != -1)
				
				charBuffer.append("</touchosc:TOP>\n");
				charBuffer.flip();
				
				String content = charBuffer.toString();
				content = content.replace("<touchosc>", "");
				content = content.replace("</touchosc>", "");
				content = content.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", TOUCHOSC_XMLNS_HEADER);
				content = content.replace("numberX=", "number_x=");
				content = content.replace("numberY=", "number_y=");
				content = content.replace("invertedX=", "inverted_x=");
				content = content.replace("invertedY=", "inverted_y=");
				content = content.replace("localOff=", "local_off=");
				content = content.replace("oscCs=", "osc_cs=");
				
				writer.write(content);
				writer.flush();
				os.flush();
				os.close();
			}
			fileIS.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(touchoscFilePathList.get(0));
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(touchoscURI, true);
		
		Object obj = (Object) resource.getContents().get(0);
		if (obj instanceof TOP) {
			TOP top = (TOP) obj;
			reverseZOrders(top);
			return initAppFromTouchOsc(
				top.getLayout(), 
				"horizontal".equals(top.getLayout().getOrientation()), 
				"0".equals(top.getLayout().getMode())
			);
		} 
		return null;
	}
	
	/**
	 * Initialize UI model from a .touchosc file
	 * 
	 * @param zipTouchoscFilePath a .touchosc file
	 * 
	 * @return UI model
	 */
	public TouchOscApp loadAppFromTouchOscXML2(String zipTouchoscFilePath) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(TouchoscPackage.eNS_PREFIX, new TouchoscResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TouchoscPackage.eNS_URI, TouchoscPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TouchoscappPackage.eNS_URI, TouchoscappPackage.eINSTANCE);

		List<String> touchoscFilePathList = new ArrayList<String>();
		try {
			URL url = TouchOSCUtils.class.getClassLoader().getResource(".");
			
			FileInputStream touchoscFile = new FileInputStream(url.getPath()  + "../samples/" + zipTouchoscFilePath);
			ZipInputStream fileIS = new ZipInputStream(touchoscFile);
			
			ZipEntry zEntry = null;
			while ((zEntry = fileIS.getNextEntry()) != null) {
				if (zEntry.getName().endsWith(".xml")) {
					touchoscFilePathList.add(url.getPath()  + "../samples/_"+ zipTouchoscFilePath);
				}
				FileOutputStream os	= new FileOutputStream(url.getPath()  + "../samples/_"+ zipTouchoscFilePath);
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(os));
				BufferedReader reader = new BufferedReader(new InputStreamReader(fileIS, Charset.forName("UTF-8")));
				CharBuffer charBuffer = CharBuffer.allocate(65535);
				while (reader.read(charBuffer) != -1)
				
				charBuffer.append("</touchosc:TOP>\n");
				charBuffer.flip();
				
				String content = charBuffer.toString();
				content = content.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", TOUCHOSC_XMLNS_HEADER);
				content = content.replace("numberX=", "number_x=");
				content = content.replace("numberY=", "number_y=");
				content = content.replace("invertedX=", "inverted_x=");
				content = content.replace("invertedY=", "inverted_y=");
				content = content.replace("localOff=", "local_off=");
				content = content.replace("oscCs=", "osc_cs=");
				
				writer.write(content);
				writer.flush();
				os.flush();
				os.close();
			}
			fileIS.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(touchoscFilePathList.get(0));
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(touchoscURI, true);
		
		Object obj = (Object) resource.getContents().get(0);
		if (obj instanceof TOP) {
			TOP top = (TOP) obj;
			reverseZOrders(top);
			return initAppFromTouchOsc(
				top.getLayout(), 
				"horizontal".equals(top.getLayout().getOrientation()), 
				"0".equals(top.getLayout().getMode())
			);
		} 
		return null;
	}
	
	void reverseZOrders(TOP top) {
		/*
		for (Tabpage t : top.getLayout().getTabpage()) {
			int size = t.getControl().size();
			BasicEList<Control> lst = new BasicEList<Control>();
			for (int i = size-1;i>=0;i--) {
				lst.add(t.getControl().get(i));	
			}
			t.getControl().clear();
			t.getControl().addAll(lst);
		}
		*/
	}
	
	private void applyBase64Transformation(TOP top) {
		
		for (Tabpage t : top.getLayout().getTabpage()) {
			String tabName = t.getName() == null ? "" + top.getLayout().getTabpage().indexOf(t)+1 : t.getName();
			String b64TabName = base64Ref.encodeToString(tabName.getBytes());
			t.setName(b64TabName);
			for (Control c : t.getControl()) {
				String b64CtrlName = base64Ref.encodeToString(c.getName().getBytes());
				c.setName(b64CtrlName);
				if (c.getText() != null) {
					String b64TxtName = base64Ref.encodeToString(c.getText().getBytes());
					c.setName(b64TxtName);
				}
			}
		}
	}
	private void decodeBase64Transformation(TOP top) {
		for (Tabpage t : top.getLayout().getTabpage()) {
			String tabName = t.getName() == null ? "" + top.getLayout().getTabpage().indexOf(t)+1 : t.getName();
			if (base64Ref.isBase64(tabName)) {
				String b64TabName = new String(base64Ref.decode(tabName));
				t.setName(b64TabName);
			}
			for (Control c : t.getControl()) {
				if (c.getName() != null && base64Ref.isBase64(c.getName())) {
					String b64name = new String(base64Ref.decode(c.getName()));
					t.setName(b64name);
				}
				if (c.getText() != null && base64Ref.isBase64(c.getText())) {
					String b64Txt = new String(base64Ref.decode(c.getText()));
					c.setName(b64Txt);
				}
				if (c.getOscCs() != null && base64Ref.isBase64(c.getOscCs())) {
					String b64Osc = new String(base64Ref.decode(c.getOscCs()));
					c.setName(b64Osc);
				}
			}
		}
		
	}

	
	
	public void dumpTouchOsc(TOP top, String destDirname, String destFilename) {

		reverseZOrders(top);
		//
		// Get tests for TouchOSC legacy compliances : need precise version info
		//
		//applyBase64Transformation(top);

		
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(TouchoscPackage.eNS_PREFIX, new TouchoscResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TouchoscPackage.eNS_URI, TouchoscPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TouchoscappPackage.eNS_URI, TouchoscappPackage.eINSTANCE);

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
		URI touchoscURI = URI.createFileURI(dirname + "/" + "index.xml");
		
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
		
		String TOUCHOSC_HEADER = "<touchosc:TOP xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:touchosc=\"http:///net.sf.smbt.touchosc/src/net/sf/smbt/touchosc/model/touchosc.xsd\">";
		String TOUCHOSC_FOOTER = "</touchosc:TOP>";
	
		String path = touchoscURI.path().toString();
		String outputZipFile = dirname + "/" + destFilename + ".touchosc";
		
		try {
			FileInputStream touchoscFile = new FileInputStream(path);
			BufferedReader reader = new BufferedReader(new InputStreamReader(touchoscFile, Charset.forName("ASCII")));
			CharBuffer charBuffer = CharBuffer.allocate(65535);
			while (reader.read(charBuffer) != -1)			
			
			charBuffer.flip();
			
			String content = charBuffer.toString();
			content = content.replace(TOUCHOSC_HEADER, "<touchosc>");
			content = content.replace(TOUCHOSC_FOOTER, "</touchosc>");
			content = content.replace("<layout>", "<layout version=\"10\" mode=\""+ top.getLayout().getMode() +"\" orientation=\"" + top.getLayout().getOrientation() + "\">");
			content = content.replace("numberX=", "number_x=");
			content = content.replace("numberY=", "number_y=");
			content = content.replace("invertedX=", "inverted_x=");
			content = content.replace("invertedY=", "inverted_y=");
			content = content.replace("localOff=", "local_off=");
			content = content.replace("oscCs=", "osc_cs=");
			content = content.replace("xypad", "xy");

			touchoscFile.close();
			
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
			
			FileOutputStream fos = new FileOutputStream(outputZipFile);
			ZipOutputStream fileOS = new ZipOutputStream(fos);

			ZipEntry ze = new ZipEntry("index.xml");
			fileOS.putNextEntry(ze);
			fileOS.write(content.getBytes(Charset.forName("UTF-8")));
			fileOS.flush();
			fileOS.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			File f = new File(path);
			if (f.exists() && f.canWrite()) {
				if (!f.delete()) {
					throw new IllegalArgumentException(path + " deletion failed");
				}
			}
		}
	}
	
	/**
	 * Initializes TouchOsc UI root elem
	 * 
	 * @param touchoscLayout UI description just loaded from .jzml file
	 * 
	 * @return newly created UI
	 */
	public TouchOscApp initAppFromTouchOsc(Layout touchoscLayout, boolean vertical, boolean iphone) {
		TouchOscApp touchOscApp = TouchoscappFactory.eINSTANCE.createTouchOscApp();
		touchOscApp.setOrientation(vertical ? Orientation.HORIZONTAL : Orientation.VERTICAL);
		touchOscApp.setMode(iphone ? "0" : "1");
		
		int w = iphone ? 480 : 1024;
		int h = iphone ? 320 : 768;

		int newW = vertical ? h : w;
		int newH = vertical ? w : h;

		Dimension dim = new Dimension(newW+(iphone? 20 : 60), newH+(iphone ? 20 : 60)); // remove bar height ...

		touchOscApp.setWidth(dim.width);
		touchOscApp.setHeight(dim.height);
		
		for (Tabpage tPage : touchoscLayout.getTabpage()) {
			initTouchOscControls(touchOscApp, tPage, vertical, iphone);
		}
		return touchOscApp;
	}

	/**
	 * UI initialization
	 * 
	 * @param touchOscApp UI model
	 * @param tPage window definition from the .touchosc#index.xml file
	 */
	void initTouchOscControls(TouchOscApp touchOscApp, Tabpage tPage, boolean vertical, boolean iphone) {
		Tab tab = initTouchOscTabPageControls(tPage);
		if (tab instanceof Tab) {
			touchOscApp.getTabs().add(tab);
			for (Control c : tPage.getControl()) {
				if (c.getName() != null && Base64.isBase64(c.getName())) {
					String n = new String(Base64.decodeBase64(c.getName()), Charset.forName("UTF-8"));
					c.setName(n);
				} 
				if (c.getText() != null && Base64.isBase64(c.getText())) {
					String t = new String(Base64.decodeBase64(c.getText()), Charset.forName("UTF-8"));
					c.setText(t);
				}
				if (c.getOscCs() != null && Base64.isBase64(c.getOscCs())) {
					String o = new String(Base64.decodeBase64(c.getOscCs()), Charset.forName("UTF-8"));
					c.setOscCs(o);
				}
				tab.getWidgets().add(initTouchOscTabPageControl(tab, c, vertical, iphone));
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

	protected Tab initTouchOscTabPageControls(Tabpage tabPage) {
		Tab tab = TouchoscappFactory.eINSTANCE.createTab();
		tab.setName(tabPage.getName());
		return tab;
	}
	
	/**
	 * Widget initialization
	 * 
	 * @param window given Window values
	 * 
	 * @return new created {@link JZUIElem} from the {@link WINDOW} description valuation
	 */
	protected Widget initTouchOscTabPageControl(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		String literal = ctrl.getType();
		if ("xy".equals(literal)) {
			literal = "xypad";
		}
		ControlType ctrlType = ControlType.get(literal);
		Widget elem = null;

		switch(ctrlType) {
			case FADER_H:
				elem = vertical ? initFaderH(t, ctrl, vertical, iphone) : initFaderV(t, ctrl, vertical, iphone);
				break;
			case FADER_V:
				elem = vertical ? initFaderV(t, ctrl, vertical, iphone) : initFaderH(t, ctrl, vertical, iphone);
				break;
			case LABEL_H:
				elem = vertical ? initLabelH(t, ctrl, vertical, iphone) : initLabelV(t, ctrl, vertical, iphone);
				break;
			case LABEL_V:
				elem = vertical ? initLabelV(t, ctrl, vertical, iphone) : initLabelH(t, ctrl, vertical, iphone);
				break;
			case LED:
				elem = initLED(t, ctrl, vertical, iphone);
				break;
			case MULTI_FADER_H:
				elem = vertical ? initMultiFaderH(t, ctrl, vertical, iphone) : initMultiFaderV(t, ctrl, vertical, iphone);
				break;
			case MULTI_FADER_V:
				elem = vertical ? initMultiFaderV(t, ctrl, vertical, iphone) : initMultiFaderH(t, ctrl, vertical, iphone);
				break;
			case MULTI_TOGGLE:
				elem = initMultiToggle(t, ctrl, vertical, iphone);
				break;
			case ROTARY_H:
				elem = vertical ? initRotaryH(t, ctrl, vertical, iphone) : initRotaryV(t, ctrl, vertical, iphone);
				break;
			case ROTARY_V:
				elem = vertical ? initRotaryV(t, ctrl, vertical, iphone) : initRotaryH(t, ctrl, vertical, iphone);
				break;
			case XYPAD:
				elem = initXYPad(t, ctrl, vertical, iphone);
				break;
			case PUSH:
				elem = initPush(t, ctrl, vertical, iphone);
				break;
			case MULTI_PUSH:
				elem = initMultiPush(t, ctrl, vertical, iphone);
				break;
			case BATTERY_H:
				elem = vertical ? initBatteryH(t, ctrl, vertical, iphone) : initBatteryV(t, ctrl, vertical, iphone);
				break;
			case BATTERY_V:
				elem = vertical ? initBatteryV(t, ctrl, vertical, iphone) : initBatteryH(t, ctrl, vertical, iphone);
				break;
			case ENCODER:
				elem = initEncoder(t, ctrl, vertical, iphone);
				break;
			case TIME_H:
				elem = vertical ? initTimeH(t, ctrl, vertical, iphone) : initTimeV(t, ctrl, vertical, iphone);
				break;
			case TIME_V:
				elem = vertical ? initTimeV(t, ctrl, vertical, iphone) : initTimeH(t, ctrl, vertical, iphone);
				break;
			case TOGGLE:
				elem = initToggle(t, ctrl, vertical, iphone);
				break;
			default:
				break;
		}
		
		return elem;
	}

	private String getDefaultOSCTag(Tab t, Widget w) {
		String tn = "";
		String wn = "";
		if (t.getName() != null && Base64.isBase64(t.getName())) {
			tn = new String(Base64.decodeBase64(t.getName()), Charset.forName("UTF-8"));
		} 
		if (w.getName() != null && Base64.isBase64(w.getName())) {
			wn = new String(Base64.decodeBase64(w.getName()), Charset.forName("UTF-8"));
		} 
		return "/" + tn + "/" + w.getName();
	}
	
	private void initWidgetFromControl(Tab t, Widget w, Control c, boolean vertical, boolean iphone) {
		Dimension dim = new Dimension();
		dim.width = (iphone ? 320 : 768);
		dim.height = (iphone ? 480 : 1024);
		if (vertical) {
			w.setX(Integer.parseInt(c.getX())+(iphone ? 0: 5));
			w.setY(Integer.parseInt(c.getY())-(iphone ? 40: 25));
			w.setW(Integer.parseInt(c.getW()));
			w.setH(Integer.parseInt(c.getH()));
		} else {
			dim.transpose();
			Rectangle rect = new Rectangle(0, 0, 0, 0);	
			rect.x		= Integer.parseInt(c.getX());
			rect.y		= Integer.parseInt(c.getY());
			rect.width	= Integer.parseInt(c.getW());
			rect.height	= Integer.parseInt(c.getH());
			
			w.setX(rect.y + (iphone ? 0: 5));
			w.setY((dim.height - (rect.x + rect.width + (iphone ? 15: -5))));				
			w.setW(rect.height);
			w.setH(rect.width);
		}
		w.setName(c.getName()==null?"":c.getName());
		w.setNumber(c.getNumber()==null?"":c.getNumber());
		w.setOsc(c.getOscCs()==null?getDefaultOSCTag(t, w):c.getOscCs());
		w.setColor(c.getColor());
		w.setCentered(c.getCentered()==null?false:c.getCentered().equalsIgnoreCase("centered"));
		w.setInverted(c.getInverted()==null?false:c.getInverted().equalsIgnoreCase("inverted"));
	}
	
	public Widget initFaderH(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		FaderH faderH = TouchoscappFactory.eINSTANCE.createFaderH();
		initWidgetFromControl(t, faderH, ctrl, vertical, iphone);
		faderH.setResponse(ctrl.getResponse()==null?"absolute":ctrl.getResponse());
		faderH.setFrom((int)Float.parseFloat(ctrl.getScalef()==null?"0":ctrl.getScalef()));
		faderH.setTo((int)Float.parseFloat(ctrl.getScalet()==null?"0":ctrl.getScalet()));
		faderH.setType("faderh");
		return faderH;
	}
	
	public Widget initFaderV(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		FaderV faderV = TouchoscappFactory.eINSTANCE.createFaderV();
		initWidgetFromControl(t, faderV, ctrl, vertical, iphone);
		faderV.setResponse(ctrl.getResponse()==null?"absolute":ctrl.getResponse());
		faderV.setFrom((int)Float.parseFloat(ctrl.getScalef()==null?"0":ctrl.getScalef()));
		faderV.setTo((int)Float.parseFloat(ctrl.getScalet()==null?"0":ctrl.getScalet()));
		faderV.setType("faderv");
		return faderV;
	}

	public Widget initLabelH(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		LabelH labelH = TouchoscappFactory.eINSTANCE.createLabelH();
		initWidgetFromControl(t, labelH, ctrl, vertical, iphone);
		labelH.setText(ctrl.getText()==null?"":ctrl.getText());
		labelH.setBackground(ctrl.getBackground()==null?false:ctrl.getBackground().equalsIgnoreCase("true"));
		labelH.setOutline(ctrl.getOutline()==null?false:ctrl.getOutline().equalsIgnoreCase("true"));
		labelH.setType("labelh");
		labelH.setSize(Integer.parseInt(ctrl.getSize()==null?"14":ctrl.getSize()));
		return labelH;
	}

	public Widget initLabelV(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		LabelV labelV = TouchoscappFactory.eINSTANCE.createLabelV();
		initWidgetFromControl(t, labelV, ctrl, vertical, iphone);
		labelV.setText(ctrl.getText()==null?"":ctrl.getText());
		labelV.setBackground(ctrl.getBackground()==null?false:ctrl.getBackground().equalsIgnoreCase("true"));
		labelV.setOutline(ctrl.getOutline()==null?false:ctrl.getOutline().equalsIgnoreCase("true"));
		labelV.setType("labelv");
		labelV.setSize(Integer.parseInt(ctrl.getSize()==null?"14":ctrl.getSize()));
		return labelV;
	}

	public Widget initLED(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		LED led = TouchoscappFactory.eINSTANCE.createLED();
		initWidgetFromControl(t, led, ctrl, vertical, iphone);
		led.setType("led");
		return led;
	}

	public Widget initMultiFaderH(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		MultiFaderH multiFaderH = TouchoscappFactory.eINSTANCE.createMultiFaderH();
		initWidgetFromControl(t, multiFaderH, ctrl, vertical, iphone);
		multiFaderH.setResponse(ctrl.getResponse()==null?"absolute":ctrl.getResponse());
		multiFaderH.setNumFaders(Integer.parseInt(ctrl.getNumber()==null?"4":ctrl.getNumber()));
		multiFaderH.setType("multifaderh");
		return multiFaderH;
	}

	public Widget initMultiFaderV(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		MultiFaderV multiFaderV = TouchoscappFactory.eINSTANCE.createMultiFaderV();
		initWidgetFromControl(t, multiFaderV, ctrl, vertical, iphone);
		multiFaderV.setResponse(ctrl.getResponse()==null?"absolute":ctrl.getResponse());
		multiFaderV.setNumFaders(Integer.parseInt(ctrl.getNumber()==null?"4":ctrl.getNumber()));
		multiFaderV.setType("multifaderv");
		return multiFaderV;
	}

	public Widget initMultiToggle(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		MultiToggle multiToggle = TouchoscappFactory.eINSTANCE.createMultiToggle();
		initWidgetFromControl(t, multiToggle, ctrl, vertical, iphone);
		multiToggle.setColumns(Integer.parseInt(ctrl.getNumberY()==null?"4":ctrl.getNumberY()));
		multiToggle.setRows(Integer.parseInt(ctrl.getNumberX()==null?"4":ctrl.getNumberX()));
		multiToggle.setType("multitoggle");
		return multiToggle;
	}

	public Widget initPush(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		Push push = TouchoscappFactory.eINSTANCE.createPush();
		initWidgetFromControl(t, push, ctrl, vertical, iphone);
		push.setType("push");
		return push;
	}

	public Widget initRotaryH(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		RotaryH rotaryH = TouchoscappFactory.eINSTANCE.createRotaryH();
		initWidgetFromControl(t, rotaryH, ctrl, vertical, iphone);
		rotaryH.setResponse(ctrl.getResponse()==null?"absolute":ctrl.getResponse());
		rotaryH.setFrom((int)Float.parseFloat(ctrl.getScalef()==null?"14":ctrl.getScalef()));
		rotaryH.setTo((int)Float.parseFloat(ctrl.getScalet()==null?"14":ctrl.getScalet()));
		rotaryH.setType("rotaryh");
		return rotaryH;
	}

	public Widget initRotaryV(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		RotaryV rotaryV = TouchoscappFactory.eINSTANCE.createRotaryV();
		initWidgetFromControl(t, rotaryV, ctrl, vertical, iphone);
		rotaryV.setResponse(ctrl.getResponse()==null?"absolute":ctrl.getResponse());
		rotaryV.setFrom((int)Float.parseFloat(ctrl.getScalef()==null?"14":ctrl.getScalef()));
		rotaryV.setTo((int)Float.parseFloat(ctrl.getScalet()==null?"14":ctrl.getScalet()));
		rotaryV.setType("rotaryv");
		return rotaryV;
	}

	public Widget initXYPad(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		XYPad xyPad = TouchoscappFactory.eINSTANCE.createXYPad();
		initWidgetFromControl(t, xyPad, ctrl, vertical, iphone);
		xyPad.setType("xypad");
		return xyPad;
	}
	
	public Widget initMultiPush(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		MultiPush multiPush = TouchoscappFactory.eINSTANCE.createMultiPush();
		initWidgetFromControl(t, multiPush, ctrl, vertical, iphone);
		multiPush.setColumns(Integer.parseInt(ctrl.getNumberY()==null?"4":ctrl.getNumberY()));
		multiPush.setRows(Integer.parseInt(ctrl.getNumberX()==null?"4":ctrl.getNumberX()));
		return multiPush;
	}
	
	public Widget initTimeH(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		TimeH tH = TouchoscappFactory.eINSTANCE.createTimeH();
		initWidgetFromControl(t, tH, ctrl, vertical, iphone);
		tH.setBackground(ctrl.getBackground()==null?false:ctrl.getBackground().equalsIgnoreCase("true"));
		tH.setOutline(ctrl.getOutline()==null?false:ctrl.getOutline().equalsIgnoreCase("true"));
		tH.setType("timeh");
		tH.setSize(Integer.parseInt(ctrl.getSize()==null?"14":ctrl.getSize()));
		return tH;
	}

	public Widget initTimeV(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		TimeV tV = TouchoscappFactory.eINSTANCE.createTimeV();
		initWidgetFromControl(t, tV, ctrl, vertical, iphone);
		tV.setBackground(ctrl.getBackground()==null?false:ctrl.getBackground().equalsIgnoreCase("true"));
		tV.setOutline(ctrl.getOutline()==null?false:ctrl.getOutline().equalsIgnoreCase("true"));
		tV.setType("timeh");
		tV.setSize(Integer.parseInt(ctrl.getSize()==null?"14":ctrl.getSize()));
		return tV;
	}
	
	public Widget initToggle(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		Toggle tog = TouchoscappFactory.eINSTANCE.createToggle();
		initWidgetFromControl(t, tog, ctrl, vertical, iphone);
		tog.setType("type");
		return tog;
	}
	
	public Widget initBatteryH(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		BatteryH bH = TouchoscappFactory.eINSTANCE.createBatteryH();
		initWidgetFromControl(t, bH, ctrl, vertical, iphone);
		bH.setBackground(ctrl.getBackground()==null?false:ctrl.getBackground().equalsIgnoreCase("true"));
		bH.setOutline(ctrl.getOutline()==null?false:ctrl.getOutline().equalsIgnoreCase("true"));
		bH.setType("batteryh");
		bH.setSize(Integer.parseInt(ctrl.getSize()==null?"14":ctrl.getSize()));
		return bH;
	}
	
	public Widget initBatteryV(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		BatteryV bV = TouchoscappFactory.eINSTANCE.createBatteryV();
		initWidgetFromControl(t, bV, ctrl, vertical, iphone);
		bV.setBackground(ctrl.getBackground()==null?false:ctrl.getBackground().equalsIgnoreCase("true"));
		bV.setOutline(ctrl.getOutline()==null?false:ctrl.getOutline().equalsIgnoreCase("true"));
		bV.setType("batteryv");
		bV.setSize(Integer.parseInt(ctrl.getSize()==null?"14":ctrl.getSize()));
		return bV;
	}
	
	public Widget initEncoder(Tab t, Control ctrl, boolean vertical, boolean iphone) {
		Encoder e = TouchoscappFactory.eINSTANCE.createEncoder();
		initWidgetFromControl(t, e, ctrl, vertical, iphone);
		e.setResponse(ctrl.getResponse()==null?"absolute":ctrl.getResponse());
		e.setFrom((int)Float.parseFloat(ctrl.getScalef()==null?"14":ctrl.getScalef()));
		e.setTo((int)Float.parseFloat(ctrl.getScalet()==null?"14":ctrl.getScalet()));
		e.setType("encoder");
		return e;
	}
}
