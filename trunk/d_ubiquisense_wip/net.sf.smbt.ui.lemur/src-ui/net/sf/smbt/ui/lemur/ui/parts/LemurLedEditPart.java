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

import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.lemur.ui.figures.LemurLedFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class LemurLedEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	
	@Override
	protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (   msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__BARGRAPH)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__COLOR_OFF)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__COLOR_ON)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__COLUMNS)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__LIGHT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__MULTICOLOR)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__ROWS)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__TRANSPARENT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_LED__VALUE)
					) {
							refreshVisuals();
					}
				}
			}
		};
	    return new LemurLedFigure((JZLed) getModel());
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((JZLed)getModel()).eAdapters()) {
		    	((JZLed)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof JZLed) {
			   synchronized (((JZLed)getModel()).eAdapters()) {
				    if (getModel() != null && ((JZLed)getModel()).eAdapters().contains(uiAdapter)) {
				    	((JZLed)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			}
		}
	}
	
	
	@Override
	protected void refreshVisuals() {
		JZLed led = (JZLed) getModel();
		
		getFigure().setBounds(led.getBounds());
		Rectangle clientArea = getFigure().getBounds().getCopy().shrink(3 * led.getColumns(), 3 * led.getRows());
		
		int w = clientArea.width/led.getColumns();
		int h = clientArea.height/led.getRows();
		
		Rectangle gridArea = getFigure().getBounds().getCopy();
		int gW = gridArea.width/led.getColumns();
		int gH = gridArea.height/led.getRows();

		for (Object o : getFigure().getChildren()) {
			if (o instanceof LemurLedFigure.LEDFigure) {
				LemurLedFigure.LEDFigure padButtonFigure = (LemurLedFigure.LEDFigure) o;
				padButtonFigure.setBounds(
					new Rectangle(
						led.getBounds().x + 4 + (padButtonFigure.col * (gW)),
						led.getBounds().y + 4 + (padButtonFigure.row * (gH)),
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
