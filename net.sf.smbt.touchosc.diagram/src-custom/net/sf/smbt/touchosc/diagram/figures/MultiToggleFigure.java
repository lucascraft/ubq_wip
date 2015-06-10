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

import net.sf.smbt.touchosc.diagram.utilities.TouchOscGuiUtilities;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class MultiToggleFigure extends Figure {
	int numCol, numRow;

	public void setNumCol(int numCol) {
		this.numCol = numCol;
	}
	
	public void setNumRow(int numRow) {
		this.numRow = numRow;
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.setLineWidth(1);
		
		
		
		
		Rectangle rect = getBounds().getCopy().shrink(2, 2).translate(1, 1);
		
		rect.width = rect.width - rect.width%2;
		rect.height = rect.height - rect.height%2;
		
		int margin = 3;

		int l = numRow>0 ? (rect.height - numRow*margin)/numRow : rect.height;
		rect.height = l;
		rect.y += margin/2;
		
		int h = numCol>0 ? (rect.width - numCol*margin)/numCol : rect.width;
		rect.width = h;
		rect.x += margin/2;
		
		int d = rect.x;

		graphics.drawRoundRectangle(getBounds().getCopy().shrink(1, 1), 8, 8);

		graphics.pushState();
		graphics.setBackgroundColor(TouchOscGuiUtilities.INSTANCE.getColor("coal"));
		
		Rectangle pad = rect.getCopy().translate(1, 1);
		for (int r=0; r<numRow; r++) {
			pad.x = d;
			for (int c=0; c<numCol; c++) {
				graphics.fillRoundRectangle(pad, 8, 8);
				pad.x = pad.x + (pad.width+margin);
			}
			pad.y = pad.y + (pad.height+margin);
		}
		graphics.popState();
	}
}
