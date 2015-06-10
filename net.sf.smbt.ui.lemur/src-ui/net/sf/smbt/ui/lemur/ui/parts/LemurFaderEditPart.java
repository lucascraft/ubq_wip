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

import net.sf.smbt.jzmui.JZFader;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.lemur.ui.figures.LemurFaderFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class LemurFaderEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	
	@Override
	protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (   msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__COLOR)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__PRECISION)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__UNIT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__VALUE)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__DRAG)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__FRICTION)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__HEIGHT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__LIGHT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_FADER__TENSION)
					) {
							refreshVisuals();
					}
				}
			}
		};
	    return new LemurFaderFigure((JZFader) getModel());
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((JZFader)getModel()).eAdapters()) {
		    	((JZFader)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof JZFader) {
			   synchronized (((JZFader)getModel()).eAdapters()) {
				    if (getModel() != null && ((JZFader)getModel()).eAdapters().contains(uiAdapter)) {
				    	((JZFader)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			} 
		}
	}
	
	@Override
	protected void refreshVisuals() {
		JZFader jzFader = (JZFader) getModel();
		float value = jzFader.getValue();

		getFigure().setBounds(jzFader.getBounds());
		
		if (getFigure().getChildren().size()>0) {
			LemurFaderFigure.LemufaderCursorFigure cursorFigure = (LemurFaderFigure.LemufaderCursorFigure) getFigure().getChildren().get(0);

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
