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

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.jzmui.JZPads;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class JZPadFigure extends AbstractTextualLemurFigure {
	private int numRow, numCol;
	
	protected JZPads pads;
	
	private List<Integer> values;
	
    public JZPadFigure(JZPads elem) {
    	super(elem);
    	numRow		= elem.getRows();
    	numCol		= elem.getColumns();
    	pads	= elem;
    	values	= new ArrayList<Integer>();
    	int n = 0;
    	for (int _r = 1; _r<=numRow; _r++) {
        	for (int _c = 1; _c<=numCol; _c++) {
				values.add(n, new Integer(0));
        		n++;
        	}	
    	}
     }
    
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.setLineWidth(1);
		
	   	Color color = pads.getColorOff();
	   	numCol = pads.getColumns();
	   	numRow = pads.getRows();
	   	
       	graphics.setForegroundColor(color);
    	graphics.setBackgroundColor(color);

    	Rectangle rect = getBounds().getCopy();
		
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
				graphics.drawRoundRectangle(rect, 8, 8);
				
				graphics.pushState();
				graphics.setAlpha(100);
				graphics.fillRoundRectangle(rect.getCopy(), 8, 8);
				graphics.popState();

				rect.x = rect.x + (rect.width+margin);
			}
			rect.y = rect.y + (rect.height+margin);
		}
	}
}
