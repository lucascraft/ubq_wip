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

import net.sf.smbt.jzmui.JZLed;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;


public class LemurLedFigure extends AbstractLemurFigure {
	private JZLed led;
	private int r, c;
	
	public LemurLedFigure(JZLed elem) {
		super(elem);
		led = elem;
	   	r = elem.getRows();
    	c = elem.getColumns();
    	int n = 0;
    	for (int _r = 0; _r<r; _r++) {
        	for (int _c = 0; _c<c; _c++) {
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
	    	setBackgroundColor(ColorConstants.green);
	    	setForegroundColor(ColorConstants.green);
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
	    	
	    	graphics.setBackgroundColor(ColorConstants.green);
	    	graphics.setForegroundColor(ColorConstants.green);
	    	
	    	Rectangle ledRect = new Rectangle(getBounds().x + getBounds().width/2 - 3, getBounds().y + getBounds().height/2 - 3, 4, 4);
	    	
	    	graphics.fillOval(ledRect.x, ledRect.y, 6, 6);
	    	
	    	graphics.popState();
		}

	}
	@Override
	public void paint(Graphics graphics) {
    	super.paint(graphics);
    	graphics.pushState();
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}
    	
    	graphics.popState();
	}
    
}
