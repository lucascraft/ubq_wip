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

package net.sf.smbt.ui.lemur.ui.parts;

import net.sf.smbt.jzmui.JZLemurMonitor;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.lemur.ui.figures.LemurMonitorFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class LemurMonitorEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	
	@Override
	protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (   msg.getFeature().equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__COLOR)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__FONT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__TRANSPARENT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__FONT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__UNIT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__VALUE)
					) {
							refreshVisuals();
					}
				}
			}
		};
	    return new LemurMonitorFigure((JZLemurMonitor) getModel());
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((JZLemurMonitor)getModel()).eAdapters()) {
		    	((JZLemurMonitor)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof JZLemurMonitor) {
			   synchronized (((JZLemurMonitor)getModel()).eAdapters()) {
				    if (getModel() != null && ((JZLemurMonitor)getModel()).eAdapters().contains(uiAdapter)) {
				    	((JZLemurMonitor)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			}
		}
	}
	
	@Override
	protected void refreshVisuals() {
		getFigure().setBounds(((JZLemurMonitor)getModel()).getBounds());
		super.refreshVisuals();
	}
	 
	@Override
	public void refresh() {
		super.refresh();
	}
	
	@Override
	protected void createEditPolicies() {
	}
}
