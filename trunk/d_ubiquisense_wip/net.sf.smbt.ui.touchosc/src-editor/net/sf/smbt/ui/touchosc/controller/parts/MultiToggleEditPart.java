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
import net.sf.smbt.touchosc.touchoscapp.MultiToggle;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.touchosc.controller.figures.MultiToggleFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class MultiToggleEditPart extends AbstractGraphicalEditPart {
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
		MultiToggle pads = (MultiToggle) getModel();
	    return new MultiToggleFigure(pads);
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((MultiToggle)getModel()).eAdapters()) {
		    	((MultiToggle)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof MultiToggle) {
			   synchronized (((MultiToggle)getModel()).eAdapters()) {
				    if (getModel() != null && ((MultiToggle)getModel()).eAdapters().contains(uiAdapter)) {
				    	((MultiToggle)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			}
		}
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		MultiToggle pads = (MultiToggle) getModel();
		getFigure().setBounds(new Rectangle(pads.getX(), pads.getY(), pads.getW(), pads.getH()));
		Rectangle clientArea = getFigure().getBounds().getCopy().shrink(3 * pads.getColumns(), 3 * pads.getRows());
		int w = clientArea.width/pads.getColumns();
		int h = clientArea.height/pads.getRows();
		
		Rectangle gridArea = getFigure().getBounds().getCopy();
		int gW = gridArea.width/pads.getColumns();
		int gH = gridArea.height/pads.getRows();

		for (Object o : getFigure().getChildren()) {
			if (o instanceof MultiToggleFigure.LemurPadButtonFigure) {
				MultiToggleFigure.LemurPadButtonFigure padButtonFigure = (MultiToggleFigure.LemurPadButtonFigure) o;
				padButtonFigure.setBounds(
					new Rectangle(
						pads.getX() + 4 + (padButtonFigure.col * (gW)),
						pads.getY() + 4 + (padButtonFigure.row * (gH)),
						w,
						h
					)
				);
			}
		}
	}
	
	@Override
	public EditPart getTargetEditPart(Request request) {
		// TODO Auto-generated method stub
		return super.getTargetEditPart(request);
	}
	
	@Override
	public void performRequest(Request req) {
		super.performRequest(req);
		//Point pt = ((SelectionRequest)req).getLocation();
		//handleSelection(pt);
	}
	
	@Override
	public DragTracker getDragTracker(Request request) {
		// TODO Auto-generated method stub
		return super.getDragTracker(request);
	}
	
	@Override
	public Command getCommand(Request request) {
		// TODO Auto-generated method stub
		return super.getCommand(request);
	}
	
	@Override
	public void refresh() {
		super.refresh();
	}
	
	@Override
	protected void createEditPolicies() {
	}
}
