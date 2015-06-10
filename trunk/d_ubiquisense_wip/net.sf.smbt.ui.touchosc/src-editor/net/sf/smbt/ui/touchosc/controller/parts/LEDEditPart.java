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

package net.sf.smbt.ui.touchosc.controller.parts;

import net.sf.smbt.touchosc.touchosc.TouchoscPackage;
import net.sf.smbt.touchosc.touchoscapp.LED;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.touchosc.controller.figures.LEDFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class LEDEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	
	@Override
	protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (   msg.getFeature().equals(TouchoscPackage.Literals.CONTROL__CENTERED)
						|| msg.getFeature().equals(TouchoscPackage.Literals.CONTROL__H)
						|| msg.getFeature().equals(TouchoscPackage.Literals.CONTROL__W)
						|| msg.getFeature().equals(TouchoscPackage.Literals.CONTROL__X)
						|| msg.getFeature().equals(TouchoscPackage.Literals.CONTROL__Y)
						|| msg.getFeature().equals(TouchoscPackage.Literals.CONTROL__NAME)
						|| msg.getFeature().equals(TouchoscPackage.Literals.CONTROL__INVERTED)
					) {
							refreshVisuals();
					}
				}
			}
		};
	    return new LEDFigure((LED) getModel());
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((LED)getModel()).eAdapters()) {
		    	((LED)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof LED) {
			   synchronized (((LED)getModel()).eAdapters()) {
				    if (getModel() != null && ((LED)getModel()).eAdapters().contains(uiAdapter)) {
				    	((LED)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			}
		}
	}
	
	
	@Override
	protected void refreshVisuals() {
		LED led = (LED) getModel();
		
		getFigure().setBounds(new Rectangle(led.getX(), led.getY(), led.getW(), led.getH()));
		Rectangle clientArea = getFigure().getBounds().getCopy().shrink(3 * led.getColumns(), 3 * led.getRows());
		
		int w = clientArea.width/led.getColumns();
		int h = clientArea.height/led.getRows();
		
		Rectangle gridArea = getFigure().getBounds().getCopy();
		int gW = gridArea.width/led.getColumns();
		int gH = gridArea.height/led.getRows();

		for (Object o : getFigure().getChildren()) {
			if (o instanceof LEDFigure.TLEDFigure) {
				LEDFigure.TLEDFigure padButtonFigure = (LEDFigure.TLEDFigure) o;
				padButtonFigure.setBounds(
					new Rectangle(
						led.getX() + 4 + (padButtonFigure.col * (gW)),
						led.getY() + 4 + (padButtonFigure.row * (gH)),
						w,
						h
					)
				);
			}
		}
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
