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

package net.sf.smbt.ui.touchosc.controller.parts;

import java.util.List;

import net.sf.smbt.touchosc.touchosc.TouchoscPackage;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.touchosc.controller.figures.TouchOscSessionFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class TouchOscSessionEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl sessionUIAdapter;
    
    @Override
    public void activate() {
    	synchronized ((TouchOscApp)getModel()) {
		    synchronized (((TouchOscApp)getModel()).eAdapters()) {
		    	((TouchOscApp)getModel()).eAdapters().add(sessionUIAdapter);
		    }
    	}
    	super.activate();
    }
    
    @Override
    public void deactivate() {
    	super.deactivate();
    	synchronized (getModel()) {
    		if (getModel() != null) {
			   synchronized (((TouchOscApp)getModel()).eAdapters()) {
				    if (getModel() != null && ((TouchOscApp)getModel()).eAdapters().contains(sessionUIAdapter)) {
				    	((TouchOscApp)getModel()).eAdapters().remove(sessionUIAdapter);
				    }
			    }
    		}
    	}
    }

	public TouchOscSessionEditPart() {
	}

	@Override
	protected IFigure createFigure() {
    	sessionUIAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (msg.getFeature().equals(TouchoscPackage.eINSTANCE.getTabpage_Control())) {
						if (msg.getEventType() == Notification.ADD || msg.getEventType() == Notification.ADD_MANY) {
							refreshChildren();
							refreshVisuals();
						}
					} else if (msg.getFeature().equals(TouchoscPackage.eINSTANCE.getLayout_Tabpage())) {
						if (msg.getEventType() == Notification.ADD || msg.getEventType() == Notification.ADD_MANY) {
							refreshChildren();
							refreshVisuals();
						}
					}
				}
			}
		};

		return new TouchOscSessionFigure();
	}

	@Override
	protected void createEditPolicies() {
	}
	
	@Override
	protected List<?> getModelChildren() {
		return ((TouchOscApp)getModel()).getTabs();
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();

		TouchOscApp jzui = (TouchOscApp) getModel();
		TouchOscSessionFigure figure = (TouchOscSessionFigure) getFigure();
		figure.setSize(jzui.getWidth(), jzui.getHeight());
	}
}
