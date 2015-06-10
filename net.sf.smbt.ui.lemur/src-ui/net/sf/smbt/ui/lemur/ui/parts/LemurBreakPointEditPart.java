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

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.ui.UIAdapterImpl;
import net.sf.smbt.ui.lemur.ui.figures.LemurBreakPointFigure;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.PathData;

public class LemurBreakPointEditPart extends AbstractGraphicalEditPart {
	private UIAdapterImpl uiAdapter;
	private JZBreakPoint jzBreakPoint;
	
    @Override
    protected IFigure createFigure() {
		uiAdapter = new UIAdapterImpl() {
			@Override
			public void uiNotification(Notification msg) {
				if (msg != null && msg.getFeature() != null) {
					if (   msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__BACKGROUND)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__COORDINATES)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__FIRST_POINT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__LIGHT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__LIVE_EDITING)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__POINTS)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__ATTRACTION)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__EDIT)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__FRICTION)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_X)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_Y)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__LIVE_EDITING)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__REST)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__SPEED)
						|| msg.getFeature().equals(JzmuiPackage.Literals.JZ_BREAK_POINT__VALUES)
					) {
						refreshVisuals();
					}
				}
			}
		};
		jzBreakPoint = (JZBreakPoint) getModel();
        return new LemurBreakPointFigure(jzBreakPoint);
    }
    
    @Override
    public void activate() {
    	synchronized (getModel()) {
		    synchronized (((JZBreakPoint)getModel()).eAdapters()) {
		    	((JZBreakPoint)getModel()).eAdapters().add(uiAdapter);
		    }
    	}
    	super.activate();
    }
    
    @Override
    public void deactivate() {
    	super.deactivate();
    	synchronized (getModel()) {
    		if (getModel() instanceof JZBreakPoint) {
			   synchronized (((JZBreakPoint)getModel()).eAdapters()) {
				    if (getModel() != null && ((JZBreakPoint)getModel()).eAdapters().contains(uiAdapter)) {
				    	((JZBreakPoint)getModel()).eAdapters().remove(uiAdapter);
				    }
			    }
    		}
    	}
    }
    @Override
    protected void refreshVisuals() {
    	super.refreshVisuals();
    	JZBreakPoint jzBreakpoint = (JZBreakPoint) getModel();

    	getFigure().setBounds(((JZBreakPoint)getModel()).getBounds());
		
    	List<Rectangle> rectList = new ArrayList<Rectangle>();
    	
		Rectangle rect = getFigure().getBounds();
    	int i = 0;
		if (getFigure().getChildren().size()>0) {
			for (Object f :  getFigure().getChildren()) {
				rectList.add(
					new Rectangle(
						rect.x + i * (rect.width / jzBreakpoint.getPoints()), 
						new Float(jzBreakpoint.getValues().get(i) * rect.height).intValue() - 10,
						20,
						20
					)
				);
				i++;
			}
			
			float[] pts = new float[rectList.size()*2];
			byte[] typ = new byte[rectList.size()];
			int idx = 0;
			for (Rectangle r : rectList) {
				typ[idx] = SWT.PATH_LINE_TO;
				idx++;
			}
			idx=0;
			for (Rectangle r : rectList) {
				pts[idx] = r.getCenter().x;
				pts[idx++] = r.getCenter().y;
				idx++;
			}
			PathData pData = new PathData();
			pData.points = pts;
			pData.types = typ;
			jzBreakpoint.setPathData(pData);
			
			getFigure().repaint();
			
			i = 0;
			for (Object f : getFigure().getChildren()) {
				LemurBreakPointFigure.LemurPointFigure pointFigure = (LemurBreakPointFigure.LemurPointFigure) f;
				pointFigure.setBounds(rectList.get(i));
				pointFigure.repaint();
				i++;
			}
		}
    }
    
    @Override
    protected void createEditPolicies() {
    }
}
