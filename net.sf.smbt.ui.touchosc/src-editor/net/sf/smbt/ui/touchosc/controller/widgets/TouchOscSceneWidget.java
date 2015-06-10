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

package net.sf.smbt.ui.touchosc.controller.widgets;

import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.ui.touchosc.controller.factory.TouchOSCSceneEditPartFactory;
import net.sf.smbt.ui.touchosc.controller.parts.TouchOscSceneRootEditPart;
import net.sf.smbt.ui.touchosc.controller.viewers.TouchOscSceneViewer;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.gef.EditDomain;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class TouchOscSceneWidget extends Composite {
    private TouchOscSceneViewer touchOscSceneViewer;
    private TouchOscSceneRootEditPart touchOscSceneRootEditPart;
    
    public TouchOscSceneWidget(Composite parent, TouchOscApp touchOscApp) {
        super(parent, SWT.NONE);
        setBackground(ColorConstants.black);
        setForeground(ColorConstants.black);
        
        setLayout(GridLayoutFactory.fillDefaults().create());
        
        GridData gd = GridDataFactory.fillDefaults().create();
        gd.grabExcessHorizontalSpace = true;
        gd.grabExcessVerticalSpace = true;
        
        setLayoutData(gd);
        
        touchOscSceneViewer = new TouchOscSceneViewer();
        
        touchOscSceneViewer.createControl(this);
        touchOscSceneViewer.getControl().setBackground(ColorConstants.black);
        touchOscSceneViewer.getControl().setForeground(ColorConstants.black);

        FigureCanvas fig = (FigureCanvas) touchOscSceneViewer.getControl();
        
        fig.setLayout(GridLayoutFactory.fillDefaults().create());
        
        fig.setLayoutData(gd);
        fig.setBackground(ColorConstants.black);
        fig.setForeground(ColorConstants.black);

        touchOscSceneViewer.setEditPartFactory(new TouchOSCSceneEditPartFactory());
        
        touchOscSceneRootEditPart = new TouchOscSceneRootEditPart();
        
        touchOscSceneViewer.setRootEditPart(touchOscSceneRootEditPart);
        
        touchOscSceneViewer.setContents(touchOscApp);
        touchOscSceneViewer.setEditDomain(new EditDomain());
    }
    
    public void setContents(TouchOscApp touchOscApp) {
    	touchOscSceneViewer.setContents(touchOscApp);
    }
}
