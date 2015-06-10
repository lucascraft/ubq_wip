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

import net.sf.smbt.jzmui.JZJazzInterface;

import org.eclipse.draw2d.Graphics;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;

public class JZJazzInterfaceFigure extends AbstractLemurFigure {
	private JZJazzInterface jzInterface;
	public JZJazzInterfaceFigure(JZJazzInterface elem) {
		super(elem);
	}
	
	@Override
	public void paint(Graphics graphics) {
    	graphics.pushState();
    	if (!graphics.getAdvanced()) {
    		graphics.setAdvanced(true);
    	}

    	graphics.setForegroundColor(Display.getDefault().getSystemColor(SWT.COLOR_MAGENTA));
    	
    	graphics.fillRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
    	graphics.setAlpha(127);
    	graphics.setLineWidth(3);
    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
    	graphics.setLineWidth(1);
    	graphics.setAlpha(222);
    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(2, 2), 12, 12);
    	graphics.drawRoundRectangle(getBounds().getCopy().shrink(4, 4), 12, 12);
    	graphics.popState();
		super.paint(graphics);
 	}
}
