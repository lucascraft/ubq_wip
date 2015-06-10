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

package net.sf.smbt.jazzmutant.diagram.figures;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.jzmui.JZUIElem;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageUtilities;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

public abstract class AbstractTextualLemurFigure extends AbstractLemurFigure {
	private Map<String, Image> images;
	private String label;
	private boolean horizontal;
	private boolean outline;
	private boolean background;
	private int size;
	
	public AbstractTextualLemurFigure(JZUIElem elem) {
		this(elem, true);
	}
	
	public AbstractTextualLemurFigure(JZUIElem elem, boolean horizontal, String label) {
		super(elem);
		this.horizontal = horizontal;
		this.images = new HashMap<String, Image>();
		this.label = label;
	}
	public AbstractTextualLemurFigure(JZUIElem elem, boolean horizontal) {
		this(elem, horizontal, "");
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	public boolean isBackground() {
		return background;
	}
	
	public boolean isOutline() {
		return outline;
	}
	
	public void setOutline(boolean outline) {
		this.outline = outline;
	}
	
	public void setBackground(boolean background) {
		this.background = background;
	}
	
	public int getFontSize() {
		return size;
	}
	
    public void setSize(int size) {
		this.size = size;
	}
	private Image getVerticalTextAsImage(Graphics graphics, String text) {
		Color RED = ColorConstants.gray;
		Color fg = getForegroundColor();
		fg = fg == null ? RED : fg;
		Color bg = getBackgroundColor();
		bg = bg == null ? RED : bg;
		bg = bg == fg ? ColorConstants.darkGray : bg;
		Font ft = graphics.getFont(); 
		Image img = ImageUtilities.createRotatedImageOfString(label == null ? "???" : label, ft, fg , bg);
		if (!images.containsKey(text)) {
			images.put(text, img);
		}
		return images.get(text);
	}
    public void drawText(Graphics graphics, String text, Point position) {
	   	Dimension textZone = FigureUtilities.getTextExtents(text == null ? "???" : text, graphics.getFont());
	   	Point offset = new Rectangle(0, 0, textZone.width, textZone.height).getCenter();
	   	graphics.drawText(text == null ? "???" : text, position.x - offset.x, position.y - offset.y);
	}

	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		if (isBackground()) {
			Rectangle rect = getBounds().getCopy().shrink(2, 2).translate(1, 1);
			graphics.pushState();
			graphics.setBackgroundColor(ColorConstants.darkGray);
			graphics.setForegroundColor(ColorConstants.darkGray);
			graphics.fillRoundRectangle(rect, 8, 8);
			graphics.popState();
		}

		Point center = getBounds().getCopy().getCenter();
		if (horizontal) {
			drawText(graphics, label, center);
		} else {
			Image img = getVerticalTextAsImage(graphics, label);
			org.eclipse.swt.graphics.Rectangle rI = img.getBounds();
			Rectangle r = new Rectangle(center.x - rI.width/2, center.y - rI.height/2, rI.width, rI.height);
			graphics.drawImage(img, r.x, r.y);
		}
		
		if (isOutline()) {
			Rectangle rect = getBounds().getCopy().shrink(2, 2).translate(1, 1);
			graphics.drawRoundRectangle(rect, 8, 8);
		}
	}
}
