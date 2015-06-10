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

import net.sf.smbt.jzmui.JZKnob;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class JZKnobFigure extends AbstractTextualLemurFigure {
	private JZKnob knob;
	public JZKnobFigure(JZKnob elem) {
		super(elem);
		knob = (JZKnob) elem;
	}
    
    @Override
    public void paint(Graphics graphics) {
    	super.paint(graphics);
    	try {
    		draw(graphics);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
     }
    
    private void draw(Graphics graphics) {
    	graphics.pushState();
    	
    	graphics.setLineWidth(2);
    	graphics.setAlpha(233);
    	
    	int range =  new Float(0.75f*300f).intValue();
    	
    	Color fg = knob.getForeground();
    	
       	setForegroundColor(fg);
       	setBackgroundColor(fg);

       	graphics.drawArc(getBounds().getCopy().shrink(2, 2), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(3, 3), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(4, 4), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(5, 5), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(6, 6), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(7, 7), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(8, 8), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(9, 9), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(10, 10), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(11, 11), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(12, 12), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(13, 13), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(14, 14), 300, range);
    	graphics.drawArc(getBounds().getCopy().shrink(15, 15), 300, range);
    	

    	graphics.setAlpha(127);
    	
    	Rectangle rect1 = getBounds().getCopy().shrink(1, 1);
    	Rectangle rect16 = getBounds().getCopy().shrink(16, 16);

    	Color bg = knob.getBackgroud();
    	
       	graphics.setForegroundColor(bg);
       	graphics.setBackgroundColor(bg);

       	if (rect1 == null) return;
       	
       	graphics.drawOval(rect1);
   
       	if (rect16 == null) return;

       	graphics.drawOval(rect16);
       	
    	graphics.translate(rect1.getCenter());
    	

       	Rectangle rect2 = getBounds().getCopy().shrink(1, 1);
       	if (rect2 == null) return;
       	
    	Rectangle rect15 = getBounds().getCopy().shrink(16, 16);
       	if (rect15 == null) return;

    	//
    	// left
    	//
    	double offset = 90;
    	
       	double loX = Math.cos(Math.toRadians(30 + offset)) * rect2.width/2;
    	double loY = Math.sin(Math.toRadians(30 + offset)) * rect2.width/2;
    	
       	double liX = Math.cos(Math.toRadians(30 + offset)) * rect15.width/2;
    	double liY = Math.sin(Math.toRadians(30 + offset)) * rect15.width/2 + 2;
    	
    	Point leftOuterPt = new Point(loX, loY);
    	Point leftInnerPt = new Point(liX, liY);
    
    	//
    	// right
    	//
      	double roX = Math.cos(Math.toRadians(-30 + offset)) * rect2.width/2;
    	double roY = Math.sin(Math.toRadians(-30 + offset)) * rect2.width/2;
    	
       	double riX = Math.cos(Math.toRadians(-30 + offset)) * rect15.width/2;
    	double riY = Math.sin(Math.toRadians(-30 + offset)) * rect15.width/2 + 2;

    	Point rightOuterPt = new Point(roX, roY);
    	Point rightInnerPt = new Point(riX, riY);
    	
    	graphics.drawLine(leftInnerPt, leftOuterPt);
    	graphics.drawLine(rightInnerPt, rightOuterPt);
    	
    	graphics.popState();

    }
}
