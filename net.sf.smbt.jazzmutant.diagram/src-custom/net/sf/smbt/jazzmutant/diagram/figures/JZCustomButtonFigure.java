/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
 * 
 * The library is released under(Rectangle rect, Graphics graphics
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

import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.LEMUR_STYLE;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class JZCustomButtonFigure extends AbstractLemurFigure {
	private JZCustomButton customButton;
	private boolean outline;
	private LEMUR_STYLE style;
	
    public JZCustomButtonFigure(JZUIElem elem) {
    	super(elem);
    	customButton = (JZCustomButton) elem;
    	outline = true;
    	style = LEMUR_STYLE.NONE;
    }
    @Override
    public void paint(Graphics graphics) {
    	super.paint(graphics);
    	
    	graphics.pushState();
    	
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}
    	
    	Color color = customButton.getColorOff();
    	
    	graphics.setBackgroundColor(color);
    	graphics.setForegroundColor(color);
    	
    	graphics.setAlpha(127);
    	graphics.setLineWidth(3);
    	
    	if (outline) {
	    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
	    	graphics.setLineWidth(1);
	    	graphics.setAlpha(222);
	    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
	    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(4, 4), 12, 12);
	    	
	    	drawStyle(getBounds().getCopy().shrink(20, 20), graphics, style);
    	}
    	
    	graphics.popState();
    }
    
    private void drawStyle(Rectangle rect, Graphics graphics, LEMUR_STYLE style) {
    	switch(style) {
	    	case BANG:
	    		drawBANG(rect, graphics);
	    		break;
	    	case BEGINING_CURSOR:
	    		drawBEGINING_CURSOR(rect, graphics);
	    		break;
	    	case CIRCLE:
	    		drawCIRCLE(rect, graphics);
	    		break;
	    	case CIRCLE_BOLD:
	    		drawCIRCLE_BOLD(rect, graphics);
	    		break;
	    	case DECREASE:
	    		drawDECREASE(rect, graphics);
	    		break;
	    	case DELETE:
	    		drawDELETE(rect, graphics);
	    		break;
	    	case DOWN:
	    		drawDOWN(rect, graphics);
	    		break;
	    	case DOWN_CURSOR:
	    		drawDOWN_CURSOR(rect, graphics);
	    		break;
	    	case EAST_WEST:
	    		drawEAST_WEST(rect, graphics);
	    		break;
	    	case END_CURSOR: 
	    		drawEND_CURSOR(rect, graphics);
	    		break;
	    	case FILL_RECT:
	    		drawFILL_RECT(rect, graphics);
	    		break;
	    	case FWD_CURSOR:
	    		drawFWD_CURSOR(rect, graphics);
	    		break;
	    	case INCREASE:
	    		drawINCREASE(rect, graphics);
	    		break;
	    	case LEFT:
	    		drawLEFT(rect, graphics);
	    		break;
	    	case MINUS:
	    		drawMINUS(rect, graphics);
	    		break;
	    	case NEXT_CURSOR:
	    		drawNEXT_CURSOR(rect, graphics);
	    		break;
	    	case NORTH_SOUTH:
	    		drawNORTH_SOUTH(rect, graphics);
	    		break;
	    	case PATH:
	    		drawPATH(rect, graphics);
	    		break;
	    	case PLUS:
	    		drawPLUS(rect, graphics);
	    		break;
	    	case PREV_CURSOR:
	    		drawPREV_CURSOR(rect, graphics);
	    		break;
	    	case QUIT:
	    		drawQUIT(rect, graphics);
	    		break;
	    	case RAISE_DOWN:
	    		drawRAISE_DOWN(rect, graphics);
	    		break;
	    	case RAISE_UP:
	    		drawRAISE_UP(rect, graphics);
	    		break;
	    	case REFRESH:
	    		drawREFRESH(rect, graphics);
	    		break;
	    	case RIGHT:
	    		drawRIGHT(rect, graphics);
	    		break;
	    	case RWD_CURSOR:
	    		drawRWD_CURSOR(rect, graphics);
	    		break;
	    	case SAW:
	    		drawSAW(rect, graphics);
	    		break;
	    	case SAW_INV:
	    		drawSAW_INV(rect, graphics);
	    		break;
	    	case SIN:
	    		drawSIN(rect, graphics);
	    		break;
	    	case SQR:
	    		drawSQR(rect, graphics);
	    		break;
	    	case TEXT:
	    		drawTEXT(rect, graphics);
	    		break;
	    	case TRI:
	    		drawTRI(rect, graphics);
	    		break;
	    	case UP:
	    		drawUP(rect, graphics);
	    		break;
	    	case UP_CURSOR:
	    		drawUP_CURSOR(rect, graphics);
	    		break;
	    	case NONE:
	    	default:
	    		break;
    	};
    }

public void drawBANG(Rectangle rect, Graphics graphics) {}
public void drawFILL_RECT(Rectangle rect, Graphics graphics) {}

public void drawCIRCLE(Rectangle rect, Graphics graphics) {}
public void drawCIRCLE_BOLD(Rectangle rect, Graphics graphics) {}

public void drawINCREASE(Rectangle rect, Graphics graphics) {}
public void drawDECREASE(Rectangle rect, Graphics graphics) {}

public void drawDELETE(Rectangle rect, Graphics graphics) {}

public void drawDOWN(Rectangle rect, Graphics graphics) {}
public void drawLEFT(Rectangle rect, Graphics graphics) {}
public void drawRIGHT(Rectangle rect, Graphics graphics) {}
public void drawUP(Rectangle rect, Graphics graphics) {}

public void drawEAST_WEST(Rectangle rect, Graphics graphics) {}
public void drawNORTH_SOUTH(Rectangle rect, Graphics graphics) {}

public void drawBEGINING_CURSOR(Rectangle rect, Graphics graphics) {}
public void drawDOWN_CURSOR(Rectangle rect, Graphics graphics) {}
public void drawEND_CURSOR(Rectangle rect, Graphics graphics) {} 
public void drawFWD_CURSOR(Rectangle rect, Graphics graphics) {}
public void drawRWD_CURSOR(Rectangle rect, Graphics graphics) {}
public void drawPREV_CURSOR(Rectangle rect, Graphics graphics) {}
public void drawNEXT_CURSOR(Rectangle rect, Graphics graphics) {}
public void drawUP_CURSOR(Rectangle rect, Graphics graphics) {}

public void drawPLUS(Rectangle rect, Graphics graphics) {}
public void drawMINUS(Rectangle rect, Graphics graphics) {}

public void drawPATH(Rectangle rect, Graphics graphics) {}
public void drawQUIT(Rectangle rect, Graphics graphics) {}

public void drawRAISE_DOWN(Rectangle rect, Graphics graphics) {}
public void drawRAISE_UP(Rectangle rect, Graphics graphics) {}

public void drawREFRESH(Rectangle rect, Graphics graphics) {}

public void drawSAW(Rectangle rect, Graphics graphics) {}
public void drawSAW_INV(Rectangle rect, Graphics graphics) {}
public void drawSIN(Rectangle rect, Graphics graphics) {}
public void drawSQR(Rectangle rect, Graphics graphics) {}
public void drawTRI(Rectangle rect, Graphics graphics) {}

public void drawTEXT(Rectangle rect, Graphics graphics) {}

}
