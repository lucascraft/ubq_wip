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

package net.sf.smbt.touchosc.diagram.figures;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.touchosc.diagram.utilities.TouchOscGuiUtilities;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.ImageUtilities;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class AbstractTextualizedFigure extends Figure {
	private Map<String, Image> images;
	private Map<String, Font> fonts;
	private boolean horizontal;
	private boolean outline;
	private boolean background;
	private String label;
	private int size;
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
	public AbstractTextualizedFigure(boolean horizontal) {
		this.horizontal = horizontal;
		images = new HashMap<String, Image>(5);
		fonts = new HashMap<String, Font>(5);
		label = "label";
		size = 14;
	}
	private Image getVerticalTextAsImage(Graphics graphics, String text) {
		Color RED = TouchOscGuiUtilities.INSTANCE.getColor("red");
		Color fg = getForegroundColor();
		fg = fg == null ? RED : fg;
		Font ft = graphics.getFont(); 
		Image img = ImageUtilities.createRotatedImageOfString(label == null ? "???" : label, ft, fg , isBackground() ? TouchOscGuiUtilities.INSTANCE.getColor("coal") : ColorConstants.black);
		FontData fd = ft.getFontData()[0];
		if (!images.containsKey(text + "#" + fd.getName() + "_" + fd.getHeight() + "_" + fd.getStyle())) {
			images.put(text, img);
		}
		return images.get(text);
	}
	public int getFontSize() {
		return size;
	}
    public void setFontSize(int size) {
		this.size = size;
	}
    public void setLabel(String label) {
		this.label = (label == null ? "???" : label);
	}
    public String getLabel() {
		return label;
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
			Rectangle rect = getBounds().getCopy().shrink(1, 1);
			graphics.pushState();
			graphics.setBackgroundColor(TouchOscGuiUtilities.INSTANCE.getColor("coal"));
			graphics.setForegroundColor(TouchOscGuiUtilities.INSTANCE.getColor("coal"));
			graphics.fillRoundRectangle(rect, 8, 8);
			graphics.popState();
		}
		Point center = getBounds().getCopy().getCenter();
		Font font = graphics.getFont();
		if (font != null && font.getFontData() != null && font.getFontData().length>0) {
			FontData fData = font.getFontData()[0];
			if (fData != null) {
				if (fData.getHeight() != getFontSize()) {
					String fKey = fData.getName() + "_" + getFontSize() + "_" + fData.getStyle();
					if (!fonts.containsKey(fKey)) {
						fonts.put(fKey, new Font(Display.getDefault(), new FontData(fData.getName(), getFontSize(), fData.getStyle())));
					}
					graphics.setFont(fonts.get(fKey));
				}
			}
		}
		if (horizontal) {
			drawText(graphics, label, center);
		} else {
			String iKey = label + "_"+isBackground();
			if (this instanceof TimeHFigure) {
				iKey += "_" + ((TimeHFigure)this).isShowSeconds();
			} else if (this instanceof TimeVFigure) {
				iKey += "_" + ((TimeVFigure)this).isShowSeconds();
			}
			Image img = getVerticalTextAsImage(graphics, iKey);
			org.eclipse.swt.graphics.Rectangle rI = img.getBounds();
			graphics.drawImage(img, center.x - rI.width/2, center.y - rI.height/2);
		}
		if (isOutline()) {
			graphics.pushState();
			graphics.setLineWidth(1);
			Rectangle rect = getBounds().getCopy().shrink(1, 1);
			graphics.drawRoundRectangle(rect, 8, 8);
			graphics.popState();
		}
	}
}
