/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
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

package net.sf.smbt.ui.touchosc.controller.figures;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.touchosc.touchoscapp.MultiFaderV;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.geometry.Rectangle;

public class MultiFaderVFigure extends AbstractLemurFigure {
	private MultiFaderV multiSlider;
	public MultiFaderVFigure(MultiFaderV elem) {
    	super(elem);
    	multiSlider = elem;
    	List<Float> floats = new ArrayList<Float>();
    	for (float n : multiSlider.getValues()) {
    		floats.add(new Float(0.1*n));
    	}
    	multiSlider.getValues().addAll(floats);
    	for (float n : multiSlider.getValues()) {
        	add(new LemurSliderFigure(new Float(n).intValue()));
    	}
    }

    public class LemurSliderFigure extends Figure {
    	public int nbr;
    	public LemurSliderFigure(int n) {
    		nbr = n;
    		addMouseMotionListener(new MouseMotionListener() {
    			@Override
    			public void mouseMoved(MouseEvent me) {
    				float value = new Float(me.y-getBounds().y) / new Float(getBounds().height);
    				System.out.println(me.x + ", " + getBounds().height + ", " + value);
    				multiSlider.getValues().set(nbr, value);
    				repaint();
    			}
    			@Override
    			public void mouseHover(MouseEvent me) {}
    			@Override
    			public void mouseExited(MouseEvent me) {}
    			@Override
    			public void mouseEntered(MouseEvent me) {}
    			@Override
    			public void mouseDragged(MouseEvent me) {}
    		});
		}
		@Override
		public void paint(Graphics graphics) {
	    	super.paint(graphics);
	    	graphics.pushState();
	    	if (!graphics.getAdvanced()) {
	    		graphics.setAdvanced(true);
	    	}
	    	graphics.setForegroundColor(ColorConstants.blue);
	    	graphics.setBackgroundColor(ColorConstants.blue);
	    	graphics.setAlpha(127);
	    	graphics.setLineWidth(3);
	    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
	    	graphics.setLineWidth(1);
	    	graphics.setAlpha(222);
	    	Rectangle barsRect = getBounds().getCopy().shrink(2, 2);
	    	for (int y=barsRect.y; y<barsRect.y+barsRect.height; y+=2) {
	    		graphics.drawLine(barsRect.x, y, barsRect.x + barsRect.width, y);
	    	}
	    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
	    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(4, 4), 12, 12);
	   
	    	graphics.setForegroundColor(ColorConstants.cyan);
	    	graphics.setBackgroundColor(ColorConstants.cyan);

	    	if (multiSlider.getValues().size() >= nbr+1) {
		    	Rectangle selRect = getBounds().getCopy().resize(-2, -barsRect.height+new Float((1-multiSlider.getValues().get(nbr)) * barsRect.height).intValue());
	
		    	selRect.translate(0, barsRect.height - selRect.height);
		    	
		    	for (int y=selRect.y; y<selRect.y+selRect.height; y+=2) {
		    		graphics.drawLine(selRect.x, y, selRect.x + selRect.width, y);
		    	}
		    	graphics.drawRoundRectangle(selRect, 12, 12);
		    	

	    	}
	    	
	    	graphics.popState();
		}
    }
}
