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

import net.sf.smbt.jzmui.JZmultiSlider;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class JZMultiSliderFigure extends AbstractLemurFigure {
	protected JZmultiSlider multiSlider;
	private List<Float> values;
	public JZMultiSliderFigure(JZmultiSlider elem) {
    	super(elem);
    	values = new ArrayList<Float>();
    	multiSlider = elem;
    	for (int n=0;n<multiSlider.getSlider();n++) {
    		values.add(new Float(0.1*n));
    	}
    }

	@Override
	public void paint(Graphics graphics) {
			super.paint(graphics);
			graphics.setLineWidth(1);
			
			Rectangle rect = getBounds().getCopy().shrink(1, 1);
			
			graphics.drawRoundRectangle(rect, 8, 8);
			
			rect = getBounds().getCopy().shrink(1, 1);

		   	Color color = multiSlider.getColor();
		   	
	       	graphics.setForegroundColor(color);
	    	graphics.setBackgroundColor(color);

			int nbr = multiSlider.getSlider();
			
			int margin = 2;
			
			int h = (rect.width - nbr*margin)/nbr;
			rect.width = h;
			rect.x += margin/2;
			
			int d = rect.x;

			rect.x = d;

			for (int c=0; c<multiSlider.getSlider(); c++) {
				graphics.drawRoundRectangle(rect, 4, 4);
					
				graphics.pushState();
				graphics.setAlpha(100);
				graphics.fillRoundRectangle(rect.getCopy(), 4, 4);
				graphics.popState();

				graphics.pushState();
				graphics.setAlpha(100);
				Rectangle barsRect = rect.getCopy();
			   	for (int y=barsRect.y; y<barsRect.y+barsRect.height; y+=2) {
			   		graphics.drawLine(barsRect.x, y, barsRect.x + barsRect.width, y);
			   	}
				graphics.popState();

			   	for (int y=barsRect.y+barsRect.height/3; y<barsRect.y+barsRect.height; y+=2) {
			   		graphics.drawLine(barsRect.x, y, barsRect.x + barsRect.width, y);
			   	}
					
				rect.x = rect.x + (rect.width+margin+1);
			}

	    	for (int j=1; j<multiSlider.getGridValue(); j++) {
				graphics.pushState();
		    	graphics.drawLine(
	    			getBounds().x, 
	    			getBounds().y + (j*getBounds().height)/multiSlider.getGridValue(), 
	    			getBounds().x + getBounds().width, 
	    			getBounds().y + (j*getBounds().height)/multiSlider.getGridValue()
	    		);
		    	graphics.popState();
	    	}
		}
		

}
