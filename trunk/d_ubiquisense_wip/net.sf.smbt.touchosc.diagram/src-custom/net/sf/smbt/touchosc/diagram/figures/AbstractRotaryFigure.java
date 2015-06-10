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
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;

public abstract class AbstractRotaryFigure extends Figure {
	
	protected int offset;
	protected boolean centered;
	protected boolean inverted;
	
	public void setInverted(boolean inverted) {
		this.inverted = inverted;
	}
	
	public boolean isInverted() {
		return inverted;
	}
	
	public boolean isCentered() {
		return centered;
	}
	
	public void setCentered(boolean centered) {
		this.centered = centered;
	}
	
	public AbstractRotaryFigure() {
		offset = 90;
	}
	
	public AbstractRotaryFigure(int offset) {
		setOffset(offset);
	}
	
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	@Override
	public void paint(Graphics graphics) {
		
    	super.paint(graphics);
    	graphics.pushState();
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}
    	graphics.setAntialias(SWT.ON);
    	graphics.setLineWidth(1);
    	
    	Rectangle rect1 = getBounds().getCopy().shrink(2, 2);
       	int d2 = getBounds().getCopy().shrink(1, 1).width / 2;
    	int d15 = getBounds().getCopy().shrink(23, 23).width / 2;

    	Rectangle rCentered = getBounds().getCopy();
    	
    	int angle = 30;
    	
    	graphics.pushState();
    	graphics.setLineWidth(3);
    	graphics.setBackgroundColor(TouchOscGuiUtilities.INSTANCE.getColor("coal"));
    	graphics.setForegroundColor(TouchOscGuiUtilities.INSTANCE.getColor("coal"));
    	Rectangle shderRect = rect1.getCopy().shrink(1, 1);
    	for (int i=0;i<20;i++) {
    		graphics.drawArc(shderRect, angle - offset, 300);
    		shderRect = shderRect.shrink(1, 1);
    	}
    	graphics.popState();
    	
    	if (isCentered()) {
    		if (offset == 180) {
    		   	graphics.drawArc(rect1, angle - offset, 300);
	    		graphics.drawLine(
		    		new  Point(
		    			getBounds().x + getBounds().width - 2,
	    				rCentered.getCenter().y
	    			),
			    	new Point(
			    		getBounds().x + getBounds().width - 23,
			    		rCentered.getCenter().y
			    	)
				);
    		} else {
    		   	graphics.drawArc(rect1, angle - offset, 300);
	    		graphics.drawLine(
		    		new  Point(
		    			rCentered.getCenter().x,
		    			getBounds().y + 2
		    		),
				   	new Point(
				   		rCentered.getCenter().x,
				   		getBounds().y + 23
				   	)
				);
    		}
    	} else {
	    	if (!isInverted()) {
	    		//
	    		// left
	    		//
		    	
		    	double lOff = Math.toRadians(30 + offset);
		    	double ldX = Math.cos(lOff);
		    	double ldY = Math.sin(lOff);
		    	
		    	graphics.drawArc(rect1, angle - offset, 300);
    	    	graphics.translate(rect1.getCenter());
		    	graphics.drawLine(
		    		new Point(ldX * d15, ldY * d15), 
		    		new Point(ldX * d2, ldY * d2)
		    	);
	    	} else {
		    	//
		    	// right
		    	//
		    	
		    	double rOff = Math.toRadians(-30 + offset);
		    	double rdX = Math.cos(rOff);
		    	double rdY = Math.sin(rOff);
		    	
    		   	graphics.drawArc(rect1, angle - offset, 300);
    	    	graphics.translate(rect1.getCenter());
		    	graphics.drawLine(
		    		new Point(rdX * d15, rdY * d15), 
		    		new Point(rdX * d2, rdY * d2)
		    	);
		    	

	    	}
    	}
    	graphics.popState();
	}
}
