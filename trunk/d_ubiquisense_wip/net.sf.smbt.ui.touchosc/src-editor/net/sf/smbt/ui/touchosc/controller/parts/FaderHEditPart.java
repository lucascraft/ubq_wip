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
import net.sf.smbt.touchosc.touchoscapp.FaderH;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.touchosc.controller.figures.FaderHFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class FaderHEditPart extends AbstractGraphicalEditPart {
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
	    return new FaderHFigure((FaderH) getModel());
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((FaderH)getModel()).eAdapters()) {
		    	((FaderH)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof FaderH) {
			   synchronized (((FaderH)getModel()).eAdapters()) {
				    if (getModel() != null && ((FaderH)getModel()).eAdapters().contains(uiAdapter)) {
				    	((FaderH)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			} 
		}
	}
	
	@Override
	protected void refreshVisuals() {
		FaderH jzFader = (FaderH) getModel();
		float value = jzFader.getValue();

		getFigure().setBounds(new Rectangle(jzFader.getX(), jzFader.getY(), jzFader.getW(), jzFader.getH()));
		
		if (getFigure().getChildren().size()>0) {
			FaderHFigure.LemufaderCursorFigure cursorFigure = (FaderHFigure.LemufaderCursorFigure) getFigure().getChildren().get(0);

			int pos = new Float((getFigure().getBounds().height - 50) * value).intValue();
			
			cursorFigure.setBounds(
				Rectangle.SINGLETON.setLocation(
					getFigure().getBounds().x, 
					getFigure().getBounds().y + pos
				).setSize(
					getFigure().getSize().width, 
					50
				)
			);
			cursorFigure.repaint();
		}
		super.refreshVisuals();
	}
	
	@Override
	protected void createEditPolicies() {
	}
}
