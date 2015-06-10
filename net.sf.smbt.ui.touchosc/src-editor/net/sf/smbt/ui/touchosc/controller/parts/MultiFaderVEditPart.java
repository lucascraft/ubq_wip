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
import net.sf.smbt.touchosc.touchoscapp.MultiFaderV;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.touchosc.controller.figures.MultiFaderVFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class MultiFaderVEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	
	@Override
	protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
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
			}
		};
		MultiFaderV jZmultiSlider = (MultiFaderV) getModel();
	    return new MultiFaderVFigure(jZmultiSlider);
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((MultiFaderV)getModel()).eAdapters()) {
		    	((MultiFaderV)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof MultiFaderV) {
			   synchronized (((MultiFaderV)getModel()).eAdapters()) {
				    if (getModel() != null && ((MultiFaderV)getModel()).eAdapters().contains(uiAdapter)) {
				    	((MultiFaderV)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			}
		}
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		MultiFaderV multiSlider = (MultiFaderV)getModel();
		getFigure().setBounds(new Rectangle(multiSlider.getX(), multiSlider.getY(), multiSlider.getW(), multiSlider.getH()));

		Rectangle clientArea = getFigure().getBounds().getCopy().shrink(2 * multiSlider.getNumFaders(), 2);
		int w = clientArea.width/multiSlider.getNumFaders();
		
		Rectangle gridArea = getFigure().getBounds().getCopy();
		int gW = gridArea.width/multiSlider.getNumFaders();

		for (Object o : getFigure().getChildren()) {
			if (o instanceof MultiFaderVFigure.LemurSliderFigure) {
				MultiFaderVFigure.LemurSliderFigure sliderFigure = (MultiFaderVFigure.LemurSliderFigure) o;
				sliderFigure.setBounds(
					new Rectangle(
						multiSlider.getX() + 2 + (sliderFigure.nbr * (gW)),
						multiSlider.getY() + 2,
						w,
						gridArea.height-4
					)
				);
			}
		}
	}
	
	@Override
	protected void createEditPolicies() {
	}
}
