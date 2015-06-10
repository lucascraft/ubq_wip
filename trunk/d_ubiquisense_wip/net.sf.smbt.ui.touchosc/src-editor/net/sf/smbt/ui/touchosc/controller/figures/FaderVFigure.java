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

import net.sf.smbt.touchosc.touchoscapp.FaderH;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.PathData;
import org.eclipse.swt.widgets.Display;

public class FaderVFigure extends AbstractLemurFigure {
	public static int FADER_MARGIN = 12;
	private FaderH fader;

    public FaderVFigure(FaderH elem) {
    	super(elem);
    	fader = elem;
    	add(new LemufaderCursorFigure());
		addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent me) {
				float value = new Float(me.y-getBounds().y) / new Float(getBounds().height);
				System.out.println(me.x + ", " + getBounds().height + ", " + value);
				fader.setValue(value);
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
    
    
    public class LemufaderCursorFigure extends Figure {
    	   @Override
    	    public void paint(Graphics graphics) {
    	    	super.paint(graphics);
    	    	graphics.pushState();
    	    	if (!graphics.getAdvanced()) {
    	    		graphics.setAdvanced(true);
    	    	}
    	    	graphics.setLineWidth(2);

    	    	graphics.setAlpha(122);
    	    	graphics.setForegroundColor(ColorConstants.red);
    	    	graphics.setBackgroundColor(ColorConstants.red);
    	    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(1, 1), 12, 12);
    	       	
    	    	graphics.setForegroundColor(ColorConstants.lightGreen);
    	    	graphics.setBackgroundColor(ColorConstants.lightGreen);
    	    	graphics.setAlpha(66);
    	    	graphics.fillRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
    
    	    	Rectangle rect = getBounds().getCopy().shrink(2, 2);

    	    	graphics.setAlpha(233);
    	    	
    	    	graphics.setFillRule(SWT.FILL);
    	    	
    	    	PathData pData = new PathData();
    	    	pData.types = new byte[]{
    	    			SWT.PATH_LINE_TO,
    	    			SWT.PATH_LINE_TO,
    	    			SWT.PATH_LINE_TO,
    	    			SWT.PATH_LINE_TO,
    	    			SWT.PATH_LINE_TO,
    	    			SWT.PATH_LINE_TO,
    	    			SWT.PATH_LINE_TO
    	    	};
    	    	pData.points = new float[] {
    	    			(float)(rect.x + 1), 
    	    			(float)(rect.y + rect.height - 22),

       	    			(float)(rect.x + FADER_MARGIN - 3), 
       	    			(float)(rect.y + rect.height - 13), 
 
       	    			(float)(rect.x + rect.width - FADER_MARGIN + 3), 
       	    			(float)(rect.y + rect.height - 13), 
 
       	    			(float)(rect.x + rect.width - 3), 
       	    			(float)(rect.y + rect.height - 22), 
       	    			
       	    			(float)(rect.x + rect.width - 3), 
       	    			(float)(rect.y + rect.height -3),

       	    			(float)(rect.x + 1), 
       	    			(float)(rect.y + rect.height - 3),
       	    			
       	    			(float)( rect.x +  1), 
       	    			(float)(rect.y + rect.height - 22)
    	    	};
    	  
    	    	Path path = new Path(Display.getDefault(), pData);

    	    	graphics.fillPath(path);
    	    	
    	    	graphics.popState();
    	    }
    }
    
    @Override
    public void paint(Graphics graphics) {
    	graphics.pushState();
    	
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}
    	
    	graphics.setAlpha(127);
    	graphics.setLineWidth(2);
    	
    	graphics.setForegroundColor(ColorConstants.green);
    	graphics.setForegroundColor(ColorConstants.green);
    	
    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(1, 1), 12, 12);
    	
    	graphics.setAlpha(55);

    	graphics.setLineWidth(1);

    	Rectangle rect = getBounds().getCopy().shrink(7, 7);
    	
    	graphics.drawRoundRectangle(rect, 12, 12);

    	graphics.setForegroundColor(ColorConstants.lightGreen);
    	graphics.setForegroundColor(ColorConstants.lightGreen);
    	
    	graphics.drawLine(
    		rect.x + FADER_MARGIN, 
    		rect.y + 15, 
    		rect.x + FADER_MARGIN, 
    		rect.y + rect.height - 15
    	);
       	graphics.drawLine(
        	rect.x + rect.width - FADER_MARGIN, 
        	rect.y + 15, 
        	rect.x + rect.width - FADER_MARGIN, 
        	rect.y + rect.height - 15
        );
       	
       	// t2
      	graphics.drawLine(
           	rect.x + FADER_MARGIN - 3, 
           	rect.y + 12, 
           	rect.x + rect.width - FADER_MARGIN + 3, 
           	rect.y + 12
        );
      	
        graphics.drawLine(
            rect.x + FADER_MARGIN - 3, 
            rect.y + 12, 
            rect.x + 1, 
            rect.y +  27
        );
        graphics.drawLine(
            rect.x + rect.width - FADER_MARGIN + 3, 
            rect.y + 12, 
            rect.x + rect.width - 1, 
            rect.y +  27
        );
        graphics.drawLine(
        	rect.x + FADER_MARGIN - 3, 
        	rect.y + 7, 
        	rect.x + 1, 
        	rect.y + 20
        );
        graphics.drawLine(
            rect.x + rect.width - FADER_MARGIN + 3, 
            rect.y + 7, 
            rect.x + rect.width - 1, 
            rect.y + 20
        );

      	// t1
      	graphics.drawLine(
           	rect.x + FADER_MARGIN - 3, 
           	rect.y + 7, 
           	rect.x + rect.width - FADER_MARGIN + 3, 
           	rect.y + 7
        );
            	
      	// b1
        graphics.drawLine(
            rect.x + FADER_MARGIN - 3, 
            rect.y + rect.height - 12, 
            rect.x + rect.width - FADER_MARGIN + 3, 
            rect.y + rect.height - 12
        );
                	
        graphics.drawLine(
            rect.x + FADER_MARGIN - 3, 
            rect.y + rect.height - 12, 
            rect.x + 1, 
            rect.y + rect.height - 27
        );
        graphics.drawLine(
            rect.x + rect.width - FADER_MARGIN + 3, 
            rect.y + rect.height - 12, 
            rect.x + rect.width - 1, 
            rect.y + rect.height - 27
        );

        //b2
        graphics.drawLine(
            rect.x + FADER_MARGIN - 3, 
            rect.y + rect.height - 7, 
            rect.x + rect.width - FADER_MARGIN + 3, 
            rect.y + rect.height - 7
        );
  
        graphics.drawLine(
            rect.x + FADER_MARGIN - 3, 
            rect.y + rect.height - 7, 
            rect.x + 1, 
            rect.y + rect.height - 22
        );
        graphics.drawLine(
            rect.x + rect.width - FADER_MARGIN + 3, 
            rect.y + rect.height - 7, 
            rect.x + rect.width - 1, 
            rect.y + rect.height - 22
        );
 
        int dist = new Float((1-fader.getValue()) * (rect.height- 50) ).intValue();
        
        System.out.println(dist);
        
    	graphics.setAlpha(112);

    	graphics.setForegroundColor(ColorConstants.orange);
    	graphics.setBackgroundColor(ColorConstants.orange);

        graphics.fillRectangle(
            rect.x + 3, 
            rect.y + rect.height - dist, 
            rect.width - 6, 
            dist
        );
        
    	graphics.setAlpha(200);

    	for (int y=(rect.y + rect.height); y>(rect.y + rect.height - dist); y-=13) {
    		graphics.fillRoundRectangle(new Rectangle(rect.x +6, y, rect.width - 12, 5) ,6, 6);
    	}

        graphics.popState();
        super.paint(graphics);
    }
}
