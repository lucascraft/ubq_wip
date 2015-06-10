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

package net.sf.smbt.ui.touchosc.controller.utils;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;

public class LemurUIUtils {

	public final static LemurUIUtils INSTANCE = new LemurUIUtils();
	
	public final static Color knob1 = new Color(Display.getDefault(), 255, 12, 12);
	public final static Color knob2 = new Color(Display.getDefault(), 255, 24, 24);
	public final static Color knob3 = new Color(Display.getDefault(), 255, 36, 36);
	public final static Color knob4 = new Color(Display.getDefault(), 255, 48, 48);
	public final static Color knob5 = new Color(Display.getDefault(), 255, 60, 60);
	public final static Color knob6 = new Color(Display.getDefault(), 255, 72, 72);
	public final static Color knob7 = new Color(Display.getDefault(), 255, 84, 84);
	public final static Color knob8 = new Color(Display.getDefault(), 255, 96, 96);
	public final static Color knob9 = new Color(Display.getDefault(), 255, 108, 108);
	public final static Color knob10 = new Color(Display.getDefault(), 255, 120, 120);
	public final static Color knob11 = new Color(Display.getDefault(), 255, 132, 132);
	public final static Color knob12 = new Color(Display.getDefault(), 255, 144, 144);
	public final static Color knob13 = new Color(Display.getDefault(), 255, 156, 156);
	public final static Color knob14 = new Color(Display.getDefault(), 255, 168, 168);
	
	public void drawText(Graphics graphics, String text, Point position) {
	    GC gc = new GC(Display.getDefault());
	   	gc.setFont(graphics.getFont());
	   	org.eclipse.swt.graphics.Point textZone = gc.textExtent(text);
	   	Point offset = new Rectangle(0, 0, textZone.x, textZone.y).getCenter();
	   	graphics.drawText(text, position.x - offset.x, position.y - offset.y);
	   	gc.dispose();
	}

}
