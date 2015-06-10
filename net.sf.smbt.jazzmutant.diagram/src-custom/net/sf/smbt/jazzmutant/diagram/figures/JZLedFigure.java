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

import net.sf.smbt.jzmui.JZLed;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class JZLedFigure extends AbstractTextualLemurFigure {
	protected JZLed led;
	public int numRow, numCol;
	
	public JZLedFigure(JZLed elem) {
		super(elem);
		led = elem;
	   	numRow = elem.getRows();
    	numCol = elem.getColumns();
    	int n = 0;
    	for (int _r = 0; _r<numRow; _r++) {
        	for (int _c = 0; _c<numCol; _c++) {
        		add(new LEDFigure(n, _r, _c));
        	}	
    	}
	}
	
	public class LEDFigure extends Figure {
	   	public int nbr, row, col;
    	public LEDFigure(int n, int r, int c) {
    		nbr = n;
    		row = r;
    		col = c;
		}
		@Override
		public void paint(Graphics graphics) {
	    	super.paint(graphics);
	    	graphics.pushState();
	    	if (!graphics.getAdvanced()) {
	    		graphics.setAdvanced(true);
	    	}
	    	graphics.setLineWidth(1);
	    	graphics.setAlpha(222);
	    	
	    	Rectangle ledRect = new Rectangle(getBounds().x + getBounds().width/2 - 3, getBounds().y + getBounds().height/2 - 3, 4, 4);
	    	
	    	graphics.fillOval(ledRect.x, ledRect.y, 6, 6);
	    	
	    	graphics.popState();
		}

	}
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.setLineWidth(1);
		
    	Color color = led.getColorOff();
    	
    	graphics.setForegroundColor(color);
    	graphics.setBackgroundColor(color);

		Rectangle rect = getBounds().getCopy().shrink(1, 1);
		
		rect = getBounds().getCopy().shrink(1, 1);

		int margin = 4;
		int l = (rect.height - numRow*margin)/numRow;
		rect.height = l;
		rect.y += margin/2;
		
		int h = (rect.width - numCol*margin)/numCol;
		rect.width = h;
		rect.x += margin/2;
		
		int d = rect.x;

		for (int r=0; r<numRow; r++) {
			rect.x = d;
			for (int c=0; c<numCol; c++) {
				graphics.pushState();
				graphics.setAlpha(100);
				graphics.fillOval(rect.getCenter().x-3, rect.getCenter().y-3, 6, 6);
				graphics.fillOval(rect.getCenter().x-2, rect.getCenter().y-2, 4, 4);
				graphics.fillOval(rect.getCenter().x-1, rect.getCenter().y-1, 2, 2);
				graphics.popState();

				rect.x = rect.x + (rect.width+margin);
			}
			rect.y = rect.y + (rect.height+margin);
		}
	}

}
