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
import java.util.Random;

import net.sf.smbt.jzmui.JZMultiBalls;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class JZMultiBallsFigure extends AbstractTextualLemurFigure {
	
	private Color pink = new Color(
		Display.getDefault(), 
		new RGB(
			221, 
			55, 
			180
		)
	);
	
	private Color[] colors = new Color[] {
		ColorConstants.green,
		ColorConstants.lightBlue,
		ColorConstants.lightGray,
		ColorConstants.lightGreen,
		ColorConstants.red,
		ColorConstants.orange,
		ColorConstants.yellow,
		ColorConstants.white,
		ColorConstants.darkGreen,
		ColorConstants.cyan
	};
	
	protected JZMultiBalls multiBalls;
	private Random randomizer;
	private List<Point> points;
	private List<Color> colorsLst;
	
	public JZMultiBallsFigure(JZMultiBalls elem) {
		super(elem);
		multiBalls = elem;
		points = new ArrayList<Point>();
		colorsLst = new ArrayList<Color>();
		
    	randomizer = new Random(100);
    	for (int i=0; i<multiBalls.getBalls(); i++) {
    		float x = randomizer.nextInt(100);
    		float y = randomizer.nextInt(100);
    		
       		int idx = randomizer.nextInt(colors.length);
    		idx = idx >= colors.length ? idx - 1 : idx;
    		colorsLst.add(colors[idx]);
    		points.add(new Point(x, y));
    	}
	}
	
	public void refreshBalls() {
		colorsLst.clear();
		points.clear();
	  	for (int i=0; i<multiBalls.getBalls(); i++) {
    		float x = randomizer.nextInt(100);
    		float y = randomizer.nextInt(100);
    		
       		int idx = randomizer.nextInt(colors.length);
    		idx = idx >= colors.length ? idx - 1 : idx;
    		colorsLst.add(colors[idx]);
    		points.add(new Point(x, y));
    	}
	}
	
	public class BallFigure extends Figure {
	   	public int nbr;
	   	public boolean dragged;
    	public BallFigure(int n) {
    		nbr = n;
        	setForegroundColor(pink);
        	setBackgroundColor(pink);
	    	dragged = false;
    	}
    	@Override
    	public void paint(Graphics graphics) {
        	graphics.pushState();
        	if (!graphics.getAdvanced()) {
        		graphics.setAdvanced(true);
        	}
        	graphics.setAlpha(188);
        	graphics.fillOval(getBounds());
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
    	

    	Color color = multiBalls.getColor();
    	
       	graphics.setForegroundColor(color);
    	graphics.setBackgroundColor(color);

    	graphics.setAlpha(127);
    	graphics.setLineWidth(1);
    	
    	Rectangle rect = getBounds().getCopy().shrink(2, 2);
    	
    	graphics.drawRoundRectangle(rect, 12, 12);
  
    	for (int i=1; i<multiBalls.getGridStepX(); i++) {
    		graphics.drawLine(
    				rect.x + i*rect.width/multiBalls.getGridStepX(), 
    				rect.y, 
    				rect.x + i*rect.width/multiBalls.getGridStepX(), 
    				rect.y + rect.height
    		);
    	}
    	
    	for (int j=1; j<multiBalls.getGridStepY(); j++) {
    		graphics.drawLine(
    				rect.x, 
    				rect.y + j*rect.height/multiBalls.getGridStepY(), 
    				rect.x + rect.width, 
    				rect.y + j*rect.height/multiBalls.getGridStepY()
    		);
    	}
    	int i = 0;
    	for (Point p : points) {
     		graphics.setBackgroundColor(colorsLst.get(i));
    		graphics.setForegroundColor(colorsLst.get(i));
    		graphics.pushState();
    		graphics.fillOval(rect.x + p.x, rect.y + p.y, 25, 25);
    		graphics.popState();
    		i++;
    	}
    	
     	graphics.popState();
	}

}
