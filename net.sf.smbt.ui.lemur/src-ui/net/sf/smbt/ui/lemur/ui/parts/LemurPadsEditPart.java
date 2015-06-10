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

import net.sf.smbt.jzmui.JZPads;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.lemur.ui.figures.LemurPadsFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.requests.SelectionRequest;

public class LemurPadsEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	
	@Override
	protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__COLOR_OFF)
							|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__COLOR_ON)
							|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__ROWS)
							|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__COLUMNS)
							|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__MULTICOLOR)
							|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__MULTILABEL)
							|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__VALUES)
							|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_PADS__NUMBERS)
					) {
							refreshVisuals();
					}
				}
			}
		};
		JZPads pads = (JZPads) getModel();
	    return new LemurPadsFigure(pads);
	}
	
	@Override
	public void activate() {
		synchronized (getModel()) {
		    synchronized (((JZPads)getModel()).eAdapters()) {
		    	((JZPads)getModel()).eAdapters().add(uiAdapter);
		    }
		}
		super.activate();
	}
	
	@Override
	public void deactivate() {
		super.deactivate();
		synchronized (getModel()) {
			if (getModel() instanceof JZPads) {
			   synchronized (((JZPads)getModel()).eAdapters()) {
				    if (getModel() != null && ((JZPads)getModel()).eAdapters().contains(uiAdapter)) {
				    	((JZPads)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
			}
		}
	}
	
	@Override
	protected void refreshVisuals() {
		super.refreshVisuals();
		JZPads pads = (JZPads) getModel();
		getFigure().setBounds(pads.getBounds());
		Rectangle clientArea = getFigure().getBounds().getCopy().shrink(3 * pads.getColumns(), 3 * pads.getRows());
		int w = clientArea.width/pads.getColumns();
		int h = clientArea.height/pads.getRows();
		
		Rectangle gridArea = getFigure().getBounds().getCopy();
		int gW = gridArea.width/pads.getColumns();
		int gH = gridArea.height/pads.getRows();

		for (Object o : getFigure().getChildren()) {
			if (o instanceof LemurPadsFigure.LemurPadButtonFigure) {
				LemurPadsFigure.LemurPadButtonFigure padButtonFigure = (LemurPadsFigure.LemurPadButtonFigure) o;
				padButtonFigure.setBounds(
					new Rectangle(
						pads.getBounds().x + 4 + (padButtonFigure.col * (gW)),
						pads.getBounds().y + 4 + (padButtonFigure.row * (gH)),
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
		Point pt = ((SelectionRequest)req).getLocation();
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
