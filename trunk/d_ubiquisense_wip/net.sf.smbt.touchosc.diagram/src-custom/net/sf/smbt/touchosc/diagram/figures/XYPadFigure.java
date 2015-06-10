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

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class XYPadFigure extends Figure {
	boolean invX, invY;
	
	public void setInvX(boolean invX) {
		this.invX = invX;
	}
	
	public void setInvY(boolean invY) {
		this.invY = invY;
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.setLineWidth(1);
		
		Rectangle rect = getBounds().getCopy();
		
		graphics.drawRoundRectangle(rect.shrink(1, 1), 8, 8);
		
		Rectangle rect2 = getBounds().getCopy().shrink(8, 8);
		
		if (invX) {
			rect2.x = rect2.x + rect2.width - 50;
		}
		
		if (invY) {
			rect2.y = rect2.y + rect2.height - 50;
		}
		
		rect2.width = 25;
		rect2.height = 25;
		rect2.translate(5, 5);

		Point pV1 = new Point(rect2.getCenter().x, rect.y);
		Point pV2 = new Point(rect2.getCenter().x, rect.y+rect.height);
		graphics.drawLine(pV1, pV2);

		Point pH1 = new Point(rect.x, rect2.getCenter().y);
		Point pH2 = new Point(rect.x+rect.width, rect2.getCenter().y);
		graphics.drawLine(pH1, pH2);

		graphics.fillRoundRectangle(rect2, 16, 16);
		
	}
}
