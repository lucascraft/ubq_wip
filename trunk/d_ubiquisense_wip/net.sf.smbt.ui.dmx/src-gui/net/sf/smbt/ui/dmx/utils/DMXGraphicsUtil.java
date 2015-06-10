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

package net.sf.smbt.ui.dmx.utils;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.dmx.ezdmxctrl.ChannelKind;
import net.sf.smbt.dmx.ezdmxctrl.ColourKind;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.ui.widgets.Activator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class DMXGraphicsUtil {
	
	public final static DMXGraphicsUtil INSTANCE = new DMXGraphicsUtil();
	
	public final static Color MAGENTA	= new Color(Display.getDefault(), new RGB(255, 0, 255));
	public final static Color YELLOW	= new Color(Display.getDefault(), new RGB(255, 0, 255));
	public final static Color CYAN		= new Color(Display.getDefault(), new RGB(0, 255, 255));
	
	Map<Integer, Image> imagesMap;
	Map<String, Image> groupImagesMap;
	
	public DMXGraphicsUtil() {
		imagesMap 		= new HashMap<Integer, Image>();
		groupImagesMap 	= new HashMap<String, Image>();
	}

	private static int[] vals = new int[] {
		1, 	  2,    4,     
		8,    16,   32,   
		64,   128, 256
	};
	
	public Image getDMXGroupImage(String groupID) {
		if (groupImagesMap.containsKey(groupID)) {
			return groupImagesMap.get(groupID);
		} else {
			Image img = createDMXGroupImage(groupID);
			if (img != null) {
				groupImagesMap.put(groupID, img);
			}
			return img;
		}
	}

	public Image getDMXFixtureJumpersImage(int address) {
		Integer key = new Integer(address);
		if (imagesMap.containsKey(key)) {
			return imagesMap.get(key);
		} else {
			Image img = createDMXFixtureJumpersImage(address);
			imagesMap.put(key, img);
			return img;
		}
	}
	
	public Image createDMXFixtureJumpersImage(int address) {
		int length = 9 * 10 + 3;
		Image img = new Image(Display.getDefault(), length, 16);
		GC gc = new GC(img);
		
		gc.setBackground(ColorConstants.red);
		gc.setForeground(ColorConstants.white);

		gc.fillRectangle(0, 0, length, 16);
		gc.drawRectangle(0, 0, length, 16);

		gc.setBackground(ColorConstants.white);

		int l = 1;
		for (int i = 0; i<9; i++) {
			int seg = vals[i];
			gc.drawRectangle(l, 1, 10, 14);
			gc.fillRoundRectangle(l+2, 3 + (((address & seg) != 0)?0:6), 7, 5, 2, 2);
			l += 10;
		}
		gc.dispose();
		return img;
	}
	
	public Image createDMXGroupImage(String groupID) {
		if (groupID == null) return null;
		ChannelKind cKind = ChannelKind.get(groupID);
		String path = "icons/";
		if (cKind != null) {
			switch (cKind) {
				case BEAM: // i5
					path += "i5.gif";
					break;
				case COLOUR: // i3
					path += "i3.gif";
					break;
				case FX: // i12
					path += "i12.gif";
					break;
				case GOBO: // i4
					path += "i4.gif";
					break;
				case INTENSITY: // i2
					path += "i2.gif";
					break;
				case MAINTENANCE: // i16
					path += "i16.gif";
					break;
				case PAN: // i8
					path += "i8.gif";
					break;
				case PRISM: // i7
					path += "i7.gif";
					break;
				case SHUTTER: // i1
					path += "i1.gif";
					break;
				case SPEED: // i10
					path += "i10.gif";
					break;
				case TILT: // i9
					path += "i9.gif";
					break;
				case NOTHING: 
				default:
					break;
			}
		}
		if ("icons/".equals(path)) {
			return null;
		}
		ImageDescriptor desc = Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.dmx", path);
		if (desc == null) {
			return null;
		}
		return desc.createImage();
	}
	
	public Color getDMXColour(String colourID) {
		ColourKind cKind = ColourKind.get(colourID);
		switch (cKind) {
			case RED: // i13
				return ColorConstants.red;
			case GREEN: // i14
				return ColorConstants.green;
			case BLUE: // i15
				return ColorConstants.blue;
			case CYAN: // i17 
				return CYAN;
			case MAGENTA: // i18
				return MAGENTA;
			case YELLOW: // i19
				return YELLOW;
		}
		return null;
	}

	public Image createDMXColourImage(String colourID) {
		ColourKind cKind = ColourKind.get(colourID);
		String path = "icons/";
		switch (cKind) {
			case RED: // i13
				path += "i13.gif";
			case GREEN: // i14
				path += "i14.gif";
			case BLUE: // i15
				path += "i15.gif";
			case CYAN: // i17 
				path += "i17.gif";
			case MAGENTA: // i18
				path += "i18.gif";
			case YELLOW: // i19
				path += "i19.gif";
		}
		return Activator.imageDescriptorFromPlugin(net.sf.smbt.ui.dmx.Activator.PLUGIN_ID, path).createImage();
	}

	public Image createDMXFixtureJumpersImage(DMXProject proj, FixtureDefinition fixture) {
		int start	= 0;
		int end		= 0;
		for (Object o : proj.getFixtureDefinitions()) {
			if (o instanceof FixtureDefinition) {
				FixtureDefinition def = (FixtureDefinition) o;
				end		+= def.getChannel().size();
				start	= end - def.getChannel().size();
				if (def.equals(fixture)) {
					end--;
					break;
				}
			}
		}
		return DMXGraphicsUtil.INSTANCE.getDMXFixtureJumpersImage(start);
	}
}
