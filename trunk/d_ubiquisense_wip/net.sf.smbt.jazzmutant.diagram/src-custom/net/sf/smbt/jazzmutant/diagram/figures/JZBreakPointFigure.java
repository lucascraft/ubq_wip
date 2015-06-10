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

import net.sf.smbt.jazzmutant.utils.JzmlUiUtils;
import net.sf.smbt.jzmui.JZBreakPoint;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.widgets.Display;

public class JZBreakPointFigure extends AbstractTextualLemurFigure {
	private JZBreakPoint breakpoint;
	private Color firstPointColor;
	private List<Float> points;
	private Random ran;
	
	public JZBreakPointFigure(JZBreakPoint elem) {
		super(elem);
		points = new ArrayList<Float>();
		breakpoint = (JZBreakPoint) elem;
    	ran = new Random();
    	for (int i=0;i<breakpoint.getPoints();i++) {
    		float next = new Float(ran.nextInt(100));
    		points.add(new Float(next/100));
    	}
	}
	
	public void setFirstPointColor(Color firstPointColor) {
		this.firstPointColor = firstPointColor;
	}
	
	public void refreshPoints() {
		points.clear();
		ran = new Random();
    	for (int i=0;i<breakpoint.getPoints();i++) {
    		float next = new Float(ran.nextInt(100));
    		points.add(new Float(next/100));
    	}
	}
	
	@Override
	public void paint(Graphics graphics) {
     	super.paint(graphics);
    	graphics.pushState();
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}
    	
    	graphics.setAlpha(127);
    	graphics.setLineWidth(1);
  
    	Rectangle rect = getBounds().getCopy().shrink(2, 2);
    	
    	graphics.drawRoundRectangle(rect, 12, 12);
  
      	for (int i=1; i<breakpoint.getGridX(); i++) {
    		graphics.drawLine(
    			rect.x + (i*rect.width)/breakpoint.getGridX(), 
    			rect.y, 
    			rect.x + (i*rect.width)/breakpoint.getGridX(), 
    			rect.y + rect.height
    		);
    	}

      	for (int i=1; i<breakpoint.getGridY(); i++) {
    		graphics.drawLine(
    			rect.x, 
    			rect.y + (i*rect.height)/breakpoint.getGridY(),  
    			rect.x + rect.width, 
    			rect.y + (i*rect.height)/breakpoint.getGridY()
    		);
    	}

      	rect.shrink(20, 20);
      	int nbPoints = breakpoint.getPoints();
      	for (int i=1;i<=breakpoint.getPoints();i++) {
      		graphics.pushState();
      		if (i==1) {
      			graphics.setForegroundColor(firstPointColor==null?ColorConstants.yellow:firstPointColor);
      		} else {
      			graphics.setForegroundColor(
      				JzmlUiUtils.INSTANCE.getColor(ran.nextInt(255), ran.nextInt(255), ran.nextInt(255))
      			);
      		}
      		int dx = rect.width/nbPoints;
      		int x = rect.x + i*dx;
      		
      		float ratio = points.get(i-1);
      		float fY = ratio * new Float(rect.height);
      		int y = rect.y + Float.valueOf(fY).intValue();
      		graphics.fillOval(x, y, 20, 20);
      		graphics.popState();
      	}
      	
      	if (breakpoint.getPathData() != null) {
	      	graphics.setLineStyle(SWT.LINE_DASH);
	      	graphics.setLineWidth(2);
	      	Path path = new Path(Display.getDefault(), breakpoint.getPathData());
	      	graphics.drawPath(path);
      	}
      	
      	graphics.popState();
	}
}
