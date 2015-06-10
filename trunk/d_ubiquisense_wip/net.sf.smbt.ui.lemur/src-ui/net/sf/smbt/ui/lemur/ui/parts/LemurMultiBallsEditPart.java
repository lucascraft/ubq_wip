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

import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.lemur.ui.figures.LemurMultiBallsFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class LemurMultiBallsEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	
	@Override
	protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (   msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTI_COLOR)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTILABEL)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTACK)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__DATA)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__DECAY)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__FRICTION)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_X)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_Y)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__HEIGHT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_X)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_Y)
						//|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__ITEMS)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__LIGHT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__RELEASE)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__SPEED)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__SUSTAIN)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__TENSION)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_MULTI_BALLS__Z)
					) {
						refreshVisuals();
					}
				}
			}
		};
		
		
		
	    return new LemurMultiBallsFigure((JZMultiBalls) getModel());
	}
	
	
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((JZMultiBalls) getModel()).eAdapters()) {
		    	((JZMultiBalls) getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof JZMultiBalls) {
			   synchronized (((JZMultiBalls) getModel()).eAdapters()) {
				    if (getModel() != null && ((JZMultiBalls) getModel()).eAdapters().contains(uiAdapter)) {
				    	((JZMultiBalls) getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			}
		}
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		JZMultiBalls jzMultiballs = (JZMultiBalls) getModel();

    	getFigure().setBounds(((JZMultiBalls)getModel()).getBounds());
		
		Rectangle rect = getFigure().getBounds();
    	int i = 0;
		for (Object f :  getFigure().getChildren()) {
			LemurMultiBallsFigure.BallFigure ballFigure = (LemurMultiBallsFigure.BallFigure) f;

			int x = jzMultiballs.getData().get(i).x;
			int y = jzMultiballs.getData().get(i).y;
			
			Float fX = new Float(x / 100f) * rect.width - 25;
			Float fY = new Float(y / 100f) * rect.height - 25;
			
			Rectangle r = new Rectangle(
				rect.x + fX.intValue(),
				rect.y + fY.intValue(),
				50,
				50
			);

			ballFigure.setBounds(r);
			i++;
			ballFigure.repaint();
		}
	}
 	
	@Override
	protected void createEditPolicies() {
	}
}
