/***********************************************************************************
 * SMBT - A smart ambient utilities framework 
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

package net.sf.smbt.ui.lemur.ui.figures;

import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.ui.lemur.ui.utils.LemurUIUtils;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;


public class LemurTextFigure extends AbstractLemurFigure {
	private JZText text;
	private Font font;
	public LemurTextFigure(JZText elem) {
		super(elem);
		text = elem;
		font = new Font(
			Display.getDefault(), 
			new FontData(
				elem.getFontName(), 
				14, //elem.getFontSize(), 
				elem.getFontStyle()
			)
		);
	}
	@Override
	public void paint(Graphics graphics) {
    	super.paint(graphics);
    	graphics.pushState();
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}
    	graphics.setFont(font);
    	graphics.setForegroundColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_MAGENTA));
    	graphics.setForegroundColor(Display.getDefault().getSystemColor(SWT.COLOR_DARK_MAGENTA));
    	graphics.setAlpha(127);
    	graphics.setLineWidth(1);
    	
    	Rectangle rect = getBounds().getCopy().shrink(2, 2);
    	
    	graphics.drawRectangle(rect);
    	
    	LemurUIUtils.INSTANCE.drawText(graphics, text.getText(), rect.getCenter());
    	graphics.popState();
	}
}
