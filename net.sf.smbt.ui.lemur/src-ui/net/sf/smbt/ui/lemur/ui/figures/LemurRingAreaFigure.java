/*****************************************import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.RectangleFigure;
ork 
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

import java.util.Timer;
import java.util.TimerTask;

import net.sf.smbt.jzmui.JZRingArea;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;


public class LemurRingAreaFigure extends AbstractLemurFigure {
	private JZRingArea ringArea;
	public LemurRingAreaFigure(JZRingArea elem) {
		super(elem);
		ringArea = elem;
		add(new RingFigure());
	}
	public class RingFigure extends Figure {
	   	public int nbr;
    	public RingFigure() {
	    	setBackgroundColor(ColorConstants.orange);
	    	setForegroundColor(ColorConstants.orange);
	    	
	    	addMouseMotionListener(new MouseMotionListener() {
				@Override
				public void mouseMoved(MouseEvent me) {
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
				public void mouseExited(MouseEvent me) {}
				@Override
				public void mouseEntered(MouseEvent me) {}
				@Override
				public void mouseDragged(MouseEvent me) {}
			});
    		addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(MouseEvent me) {}
				@Override
				public void mousePressed(MouseEvent me) {
					setBackgroundColor(ColorConstants.cyan);
					setForegroundColor(ColorConstants.cyan);
					repaint();

					final Timer timer = new Timer(true);
					timer.schedule(new TimerTask() {
						public void run() {
							Display.getDefault().syncExec(new Runnable() {
								public void run() {
									setBackgroundColor(ColorConstants.yellow);
									setForegroundColor(ColorConstants.yellow);
									repaint();
									timer.cancel();
								}
							});
						}
					}, 500);
				}
				@Override
				public void mouseDoubleClicked(MouseEvent me) {}
			});
    	}
    	@Override
    	public void paint(Graphics graphics) {
        	super.paint(graphics);
        	graphics.pushState();
        	if (!graphics.getAdvanced()) {
        		graphics.setAdvanced(true);
        	}
        	
           	graphics.setForegroundColor(ColorConstants.red);
        	graphics.setBackgroundColor(ColorConstants.red);
        	graphics.setAlpha(200);
        	graphics.fillOval(getBounds());

        	graphics.setForegroundColor(ColorConstants.white);
        	graphics.setBackgroundColor(ColorConstants.white);
        	graphics.setAlpha(166);
        	graphics.fillOval(getBounds().getCopy().shrink(60, 60));
        	
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
    	graphics.setBackgroundColor(Display.getDefault().getSystemColor(SWT.COLOR_MAGENTA));
    	graphics.setAlpha(127);
    	graphics.setLineWidth(1);
    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
    	graphics.popState();
    	super.paint(graphics);
	}
}
