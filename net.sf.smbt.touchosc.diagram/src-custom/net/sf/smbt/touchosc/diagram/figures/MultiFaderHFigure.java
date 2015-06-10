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

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class MultiFaderHFigure extends AbstractFaderFigure {
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.setLineWidth(1);
		
		Rectangle rect = getBounds().getCopy().shrink(1, 1);
		
		graphics.drawRoundRectangle(rect, 8, 8);
		
		rect = getBounds().getCopy();

		int margin = 2;
		int l = numFaders > 0 ? (rect.height - numFaders*margin)/numFaders : rect.height;
		rect.height = l;
		rect.y += margin/2;

		for (int n=0; n<numFaders; n++) {
			graphics.drawRoundRectangle(rect, 8, 8);
			
			Rectangle rect2 = rect.getCopy();
			rect2.width = 15;
			rect2.shrink(1,1);
			
			if (centered) {
				rect2.x = bounds.x + bounds.width/2 - rect2.width/2;
			} else if (inverted) {
				rect2.x = bounds.x + bounds.width - rect2.width;
			}
			
			graphics.fillRoundRectangle(rect2, 8, 8);
			
			rect.y = rect.y + (rect.height+margin);
		}
	}
}
