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

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import net.sf.smbt.jzmui.JZBreakPoint;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.widgets.Display;


public class LemurBreakPointFigure extends AbstractLemurFigure {
	private JZBreakPoint breakpoint;
	
	public LemurBreakPointFigure(JZBreakPoint elem) {
		super(elem);
		breakpoint = (JZBreakPoint) elem;
    	Random ran = new Random();
    	for (int i=0;i<breakpoint.getPoints();i++) {
    		int next = ran.nextInt(100);
    		breakpoint.getValues().add(new Float(next/100));
    	}
		for (int i=0; i<breakpoint.getPoints(); i++) {
			add(new LemurPointFigure(i));
		}
	}
	
	public class LemurPointFigure extends Figure {
    	public int nbr;
    	boolean dragged = false;
    	public LemurPointFigure(int n) {
    		nbr = n;
	    	setBackgroundColor(ColorConstants.orange);
	    	setForegroundColor(ColorConstants.orange);
	    	addMouseMotionListener(new MouseMotionListener() {
				@Override
				public void mouseMoved(MouseEvent me) {
					if (dragged) {
						Rectangle rect = getParent().getBounds();
						Float mX = new Float(me.x - rect.x);
						Float distX = new Float(rect.width);
						Float mY = new Float(me.y - rect.y);
						Float distY = new Float(rect.height);
					
						// Float nX = new Float((mX / distX)) ;
						Float nY = new Float((mY / distY));
						System.out.println("breakpoint : " + nY);
			    		breakpoint.getValues().set(nbr, nY);
					}
					
					setBackgroundColor(ColorConstants.cyan);
					setForegroundColor(ColorConstants.cyan);
					repaint();

					final Timer timer = new Timer(true);
					timer.schedule(new TimerTask() {
						public void run() {
							Display.getDefault().syncExec(new Runnable() {
								public void run() {
									setBackgroundColor(ColorConstants.orange);
									setForegroundColor(ColorConstants.orange);
									repaint();
									timer.cancel();
								}
							});
						}
					}, 500);
				}
				@Override
				public void mouseHover(MouseEvent me) {}
				@Override
				public void mouseExited(MouseEvent me) {
					dragged = false;
				}
				@Override
				public void mouseEntered(MouseEvent me) {}
				@Override
				public void mouseDragged(MouseEvent me) {
				}
			});
    		addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(MouseEvent me) {
					dragged = false;
				}
				@Override
				public void mousePressed(MouseEvent me) {
					dragged = true;
					setBackgroundColor(ColorConstants.cyan);
					setForegroundColor(ColorConstants.cyan);
					repaint();

					final Timer timer = new Timer(true);
					timer.schedule(new TimerTask() {
						public void run() {
							Display.getDefault().syncExec(new Runnable() {
								public void run() {
						        	setForegroundColor(ColorConstants.orange);
						        	setBackgroundColor(ColorConstants.orange);
									repaint();
									timer.cancel();
								}
							});
						}
					}, 500);
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {
					dragged = true;
				}
			});
    	}
     	@Override
    	public void paint(Graphics graphics) {
        	super.paint(graphics);
        	graphics.pushState();
        	if (!graphics.getAdvanced()) {
        		graphics.setAdvanced(true);
        	}
        	graphics.setForegroundColor(ColorConstants.orange);
        	graphics.setForegroundColor(ColorConstants.orange);
        	graphics.setAlpha(127);
        	graphics.fillOval(getBounds());
        	graphics.popState();
    	}
	}
	
	@Override
	public void paint(Graphics graphics) {
    	graphics.pushState();
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}
    	graphics.setForegroundColor(Display.getDefault().getSystemColor(SWT.COLOR_MAGENTA));
    	graphics.setForegroundColor(Display.getDefault().getSystemColor(SWT.COLOR_MAGENTA));
    	
    	graphics.setAlpha(127);
    	graphics.setLineWidth(1);
  
    	Rectangle rect = getBounds().getCopy().shrink(2, 2);
    	
    	graphics.drawRoundRectangle(rect, 12, 12);
  
      	for (int i=1; i<10; i++) {
    		graphics.drawLine(
    			rect.x, 
    			rect.y + i*rect.height/10,  
    			rect.x + rect.width, 
    			rect.y + i*rect.height/10
    		);
    		graphics.drawLine(
    			rect.x + i*rect.width/10, 
    			rect.y, 
    			rect.x + i*rect.width/10, 
    			rect.y + rect.height
    		);
    	}
      	
      	if (breakpoint.getPathData() != null) {
	      	graphics.setLineStyle(SWT.LINE_DASH);
	      	graphics.setLineWidth(2);
	      	Path path = new Path(Display.getDefault(), breakpoint.getPathData());
	      	graphics.drawPath(path);
      	}
      	
      	graphics.popState();
     	super.paint(graphics);
	}
}
