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

package net.sf.smbt.touchosc.diagram.parts;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PrecisionPoint;
import org.eclipse.draw2d.geometry.PrecisionRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.graph.DirectedGraph;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.layout.LayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.layout.LayoutNodesOperation;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutEditPartProvider;
import org.eclipse.gmf.runtime.draw2d.ui.graph.BorderNode;
import org.eclipse.gmf.runtime.draw2d.ui.graph.ConstantSizeNode;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

public class TabPageLayoutProvider extends AbstractLayoutEditPartProvider {
    public boolean provides(IOperation operation) {
        Assert.isNotNull(operation);

        View cview = getContainer(operation);
        if (cview == null) return false;

        IAdaptable layoutHint = ((LayoutNodesOperation) operation).getLayoutHint();
        String layoutType = (String) layoutHint.getAdapter(String.class);
        return "TouchOSC".equals(layoutType);
    }

	@Override
	public Runnable layoutLayoutNodes(List layoutNodes, boolean offsetFromBoundingBox, IAdaptable layoutHint) {
		Runnable runnable = super.layoutLayoutNodes(layoutNodes, offsetFromBoundingBox, layoutHint);
		Iterator<?> itNodes = layoutNodes.iterator();
		while (itNodes.hasNext()) {
			Object obj = itNodes.next();
			if (obj instanceof LayoutNode) {
				LayoutNode node = (LayoutNode) obj;
				TouchOscControl ctrl = (TouchOscControl) node.getNode().getElement();
				int x = ctrl.getX();
				int y = ctrl.getY();
				
				Bounds b = (Bounds) node.getNode().getLayoutConstraint();
				b.setX(ctrl.getX());
				b.setY(ctrl.getY());
			}
		}
		return runnable;
	}
	
    protected Command createNodeChangeBoundCommands(DirectedGraph g, Point diff) {
        ListIterator vi = g.nodes.listIterator();
        CompoundCommand cc = new CompoundCommand(""); //$NON-NLS-1$
        createSubCommands(diff, vi, cc);
        if (cc.isEmpty())
            return null;
        return cc;
    }

    protected void createSubCommands(Point diff, ListIterator vi, CompoundCommand cc) {
        // Now set the position of the icons. This causes the
        // arc connection points to be recalculated
        while (vi.hasNext()) {
            org.eclipse.draw2d.graph.Node node = (org.eclipse.draw2d.graph.Node) vi.next();
            if (node.data instanceof ShapeEditPart) {
                IGraphicalEditPart gep = (IGraphicalEditPart)node.data;
                
                ChangeBoundsRequest request = new ChangeBoundsRequest(
                    RequestConstants.REQ_MOVE);
                Rectangle nodeExt = getNodeMetrics(node);
                Point ptLocation = new PrecisionPoint(nodeExt.preciseX() + diff.preciseX(), nodeExt.preciseY()
                    + diff.preciseY());

                PrecisionPoint ptOldLocation = new PrecisionPoint(gep.getFigure().getBounds().getLocation());
                gep.getFigure().translateToAbsolute(ptOldLocation);
                
                gep.getFigure().translateToAbsolute(ptLocation);
                PrecisionPoint delta = new PrecisionPoint(ptLocation.preciseX()
                    - ptOldLocation.preciseX(), ptLocation.preciseY()
                    - ptOldLocation.preciseY());

                request.setEditParts(gep);
                request.setMoveDelta(delta);
                request.setLocation(ptLocation);
                
                Command cmd = gep.getCommand(request);
                if (cmd != null && cmd.canExecute()) {
                    cc.add(cmd);
                }
            }
        	if (node instanceof ConstantSizeNode) {
        		ConstantSizeNode cn = (ConstantSizeNode) node;
        		for (Iterator<BorderNode> itr = cn.borderNodes.iterator(); itr.hasNext();) {
        			createBorderItemChangeBoundsCommand(itr.next(), cn, cc);
        		}
        	}
        }
    }
    
    private void createBorderItemChangeBoundsCommand(BorderNode bn, ConstantSizeNode parentNode, CompoundCommand cc) {
        ChangeBoundsRequest request = new ChangeBoundsRequest(
                RequestConstants.REQ_MOVE);
        Rectangle parentRect = getNodeMetrics(parentNode);
        Rectangle borderItemRect = getNodeMetrics(bn);
        Dimension offset = borderItemRect.getLocation().getDifference(parentRect.getLocation());
        
        IFigure parentFigure = ((GraphicalEditPart)parentNode.data).getFigure();
        IFigure borderItemFigure = ((GraphicalEditPart)bn.data).getFigure();
        
        PrecisionPoint oldParentLocation = new PrecisionPoint(parentFigure.getBounds().getLocation());
        PrecisionPoint oldBorderItemLocation = new PrecisionPoint(borderItemFigure.getBounds().getLocation());        
        PrecisionPoint newBorderItemLocation = new PrecisionPoint(oldParentLocation.preciseX() + offset.preciseWidth(), oldParentLocation.preciseY() + offset.preciseHeight());
        parentFigure.translateToAbsolute(oldParentLocation);
        parentFigure.translateToAbsolute(newBorderItemLocation);
        borderItemFigure.translateToAbsolute(oldBorderItemLocation);
        
        PrecisionPoint delta = new PrecisionPoint(newBorderItemLocation.preciseX() - oldBorderItemLocation.preciseX(), newBorderItemLocation.preciseY() - oldBorderItemLocation.preciseY());
        GraphicalEditPart gep = (GraphicalEditPart) bn.data;
        request.setEditParts(gep);
        request.setMoveDelta(delta);
        request.setLocation(newBorderItemLocation);
        
        Command cmd = gep.getCommand(request);
        if (cmd != null && cmd.canExecute()) {
            cc.add(cmd);
        }
    }
    
     protected Rectangle getNodeMetrics(org.eclipse.draw2d.graph.Node n) {
        Rectangle rect = new Rectangle(n.x, n.y, n.width, n.height);
        PrecisionRectangle preciseRect = new PrecisionRectangle(rect);
        return rect.getCopy();
    }


	@Override
	public Command layoutEditParts(GraphicalEditPart containerEditPart,
			IAdaptable layoutHint) {
		NodeList lst = new NodeList();
		
		for (Object o : containerEditPart.getChildren()) {
			if (o instanceof TouchOscShapeNodeEditPart) {
				TouchOscShapeNodeEditPart nodeEP = (TouchOscShapeNodeEditPart)o;
				Object m = nodeEP.getModel();
				View v = nodeEP.getNotationView();
				EObject elem = ((Node)m).getElement();
				if (elem instanceof TouchOscControl) {
					TouchOscControl ctrl = (TouchOscControl) elem;
					int x = ctrl.getX();
					int y = ctrl.getY();
					
					Bounds b = (Bounds) ((Node)m).getLayoutConstraint();
					b.setX(ctrl.getX());
					b.setY(ctrl.getY());
					b.setWidth(ctrl.getW());
					b.setHeight(ctrl.getH());
		
					nodeEP.getFigure().setSize(new Dimension(ctrl.getW(), ctrl.getH()));
					nodeEP.getFigure().setPreferredSize(new Dimension(ctrl.getW(), ctrl.getH()));
					
		            ConstantSizeNode n = new ConstantSizeNode(nodeEP);
		            n.x = ctrl.getX();
		            n.y = ctrl.getY();
		            n.width = ctrl.getW();
		            n.height = ctrl.getH();
		            n.data = nodeEP;
		            
					lst.add(n);
				}
			}
		}

        
        CompoundCommand cc = new CompoundCommand(""); //$NON-NLS-1$
        createSubCommands(new Point(0, 0), lst.listIterator(), cc);
        return cc;

	}


	@Override
	public Command layoutEditParts(List selectedObjects, IAdaptable layoutHint) {
		NodeList lst = new NodeList();
		 for (Object o : selectedObjects) {
			if (o instanceof TouchOscShapeNodeEditPart) {
				TouchOscShapeNodeEditPart nodeEP = (TouchOscShapeNodeEditPart)o;
				Object m = nodeEP.getModel();
				View v = nodeEP.getNotationView();
				EObject elem = ((Node)m).getElement();
				if (elem instanceof TouchOscControl) {
					TouchOscControl ctrl = (TouchOscControl) elem;
					int x = ctrl.getX();
					int y = ctrl.getY();
					
					Bounds b = (Bounds) ((Node)m).getLayoutConstraint();
					b.setX(ctrl.getX());
					b.setY(ctrl.getY());
					b.setWidth(ctrl.getW());
					b.setHeight(ctrl.getH());
		
					nodeEP.getFigure().setSize(new Dimension(ctrl.getW(), ctrl.getH()));
					nodeEP.getFigure().setPreferredSize(new Dimension(ctrl.getW(), ctrl.getH()));
					
		            ConstantSizeNode n = new ConstantSizeNode(nodeEP);
		            n.x = ctrl.getX();
		            n.y = ctrl.getY();
		            n.width = ctrl.getW();
		            n.height = ctrl.getH();
		            n.data = nodeEP;
		            
					lst.add(n);
				}
			}
		}
        
        CompoundCommand cc = new CompoundCommand(""); //$NON-NLS-1$
        createSubCommands(new Point(0, 0), lst.listIterator(), cc);
        return cc;
	}
}