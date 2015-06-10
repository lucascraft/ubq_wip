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

import net.sf.smbt.touchosc.diagram.figures.BatteryHFigure;
import net.sf.smbt.touchosc.diagram.figures.BatteryVFigure;
import net.sf.smbt.touchosc.diagram.figures.FaderHFigure;
import net.sf.smbt.touchosc.diagram.figures.FaderVFigure;
import net.sf.smbt.touchosc.diagram.figures.LabelHFigure;
import net.sf.smbt.touchosc.diagram.figures.LabelVFigure;
import net.sf.smbt.touchosc.diagram.figures.MultiFaderHFigure;
import net.sf.smbt.touchosc.diagram.figures.MultiFaderVFigure;
import net.sf.smbt.touchosc.diagram.figures.MultiPushFigure;
import net.sf.smbt.touchosc.diagram.figures.MultiToggleFigure;
import net.sf.smbt.touchosc.diagram.figures.RotaryHFigure;
import net.sf.smbt.touchosc.diagram.figures.RotaryVFigure;
import net.sf.smbt.touchosc.diagram.figures.TimeHFigure;
import net.sf.smbt.touchosc.diagram.figures.TimeVFigure;
import net.sf.smbt.touchosc.diagram.figures.XYPadFigure;
import net.sf.smbt.touchosc.diagram.utilities.TouchOscGuiUtilities;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscBatteryHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscBatteryVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscFaderHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscFaderVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscLabelHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscLabelVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiFaderHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiFaderVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiPushEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiToggleEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscRotaryHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscRotaryVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscXYPadEditPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;

public abstract class TouchOscShapeNodeEditPart extends ShapeNodeEditPart {

	private AdapterImpl nodeFeatureAdapter;
	
	private TouchOscShapeNodeEditPart INSTANCE;
	
	public TouchOscShapeNodeEditPart(View view) {
		super(view);
		
		INSTANCE = this;
		
		nodeFeatureAdapter = new AdapterImpl() {
			public void notifyChanged(Notification msg) {
				if (msg.getEventType() == Notification.SET) {
					if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__FG.equals(msg.getFeature())
					) {
						getFigure().setForegroundColor(TouchOscGuiUtilities.INSTANCE.getColor(msg.getNewStringValue()));
						getFigure().setBackgroundColor(TouchOscGuiUtilities.INSTANCE.getColor(msg.getNewStringValue()));
						refreshVisuals();
						getFigure().repaint();
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__CENTERED.equals(msg.getFeature()) 
					) {
						if (INSTANCE instanceof TouchOscMultiFaderHEditPart) {
							MultiFaderHFigure fig = (MultiFaderHFigure) ((TouchOscMultiFaderHEditPart)INSTANCE).getPrimaryShape();
							fig.setCentered(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscMultiFaderVEditPart) {
							MultiFaderVFigure fig = (MultiFaderVFigure) ((TouchOscMultiFaderVEditPart)INSTANCE).getPrimaryShape();
							fig.setCentered(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscFaderHEditPart) {
							FaderHFigure fig = (FaderHFigure) ((TouchOscFaderHEditPart)INSTANCE).getPrimaryShape();
							fig.setCentered(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscFaderVEditPart) {
							FaderVFigure fig = (FaderVFigure) ((TouchOscFaderVEditPart)INSTANCE).getPrimaryShape();
							fig.setCentered(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscRotaryHEditPart) {
							RotaryHFigure fig = (RotaryHFigure) ((TouchOscRotaryHEditPart)INSTANCE).getPrimaryShape();
							fig.setCentered(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscRotaryVEditPart) {
							RotaryVFigure fig = (RotaryVFigure) ((TouchOscRotaryVEditPart)INSTANCE).getPrimaryShape();
							fig.setCentered(msg.getNewBooleanValue());
							fig.repaint();
						} 
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__INVERTED.equals(msg.getFeature()) 
					) {
						if (INSTANCE instanceof TouchOscMultiFaderHEditPart) {
							MultiFaderHFigure fig = (MultiFaderHFigure) ((TouchOscMultiFaderHEditPart)INSTANCE).getPrimaryShape();
							fig.setInverted(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscMultiFaderVEditPart) {
							MultiFaderVFigure fig = (MultiFaderVFigure) ((TouchOscMultiFaderVEditPart)INSTANCE).getPrimaryShape();
							fig.setInverted(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscFaderHEditPart) {
							FaderHFigure fig = (FaderHFigure) ((TouchOscFaderHEditPart)INSTANCE).getPrimaryShape();
							fig.setInverted(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscFaderVEditPart) {
							FaderVFigure fig = (FaderVFigure) ((TouchOscFaderVEditPart)INSTANCE).getPrimaryShape();
							fig.setInverted(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscRotaryHEditPart) {
							RotaryHFigure fig = (RotaryHFigure) ((TouchOscRotaryHEditPart)INSTANCE).getPrimaryShape();
							fig.setInverted(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscRotaryVEditPart) {
							RotaryVFigure fig = (RotaryVFigure) ((TouchOscRotaryVEditPart)INSTANCE).getPrimaryShape();
							fig.setInverted(msg.getNewBooleanValue());
							fig.repaint();
						} 
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__INVERTED_X.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscXYPadEditPart) {
							XYPadFigure fig = (XYPadFigure) ((TouchOscXYPadEditPart)INSTANCE).getPrimaryShape();
							fig.setInvX(msg.getNewBooleanValue());
							fig.repaint();
						} 
					}  else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__INVERTED_Y.equals(msg.getFeature()) 
					) {
						if (INSTANCE instanceof TouchOscXYPadEditPart) {
							XYPadFigure fig = (XYPadFigure) ((TouchOscXYPadEditPart)INSTANCE).getPrimaryShape();
							fig.setInvY(msg.getNewBooleanValue());
							fig.repaint();
						} 
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__TEXT.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscLabelHEditPart) {
							LabelHFigure fig = (LabelHFigure) ((TouchOscLabelHEditPart)INSTANCE).getPrimaryShape();
							fig.setLabel(msg.getNewStringValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscLabelVEditPart) {
							LabelVFigure fig = (LabelVFigure) ((TouchOscLabelVEditPart)INSTANCE).getPrimaryShape();
							fig.setLabel(msg.getNewStringValue());
							fig.repaint();
						} 
						refresh();
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NAME.equals(msg.getFeature()) ||
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SCALEF.equals(msg.getFeature()) ||
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SCALET.equals(msg.getFeature())
					) {
							refresh();
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NUMBER.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscMultiFaderHEditPart) {
							MultiFaderHFigure fig = (MultiFaderHFigure) ((TouchOscMultiFaderHEditPart)INSTANCE).getPrimaryShape();
							fig.setNumFaders(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscMultiFaderVEditPart) {
							MultiFaderVFigure fig = (MultiFaderVFigure) ((TouchOscMultiFaderVEditPart)INSTANCE).getPrimaryShape();
							fig.setNumFaders(msg.getNewIntValue());
							fig.repaint();
						}
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NUMBER_X.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscMultiToggleEditPart) {
							MultiToggleFigure fig = (MultiToggleFigure) ((TouchOscMultiToggleEditPart)INSTANCE).getPrimaryShape();
							fig.setNumCol(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscMultiPushEditPart) {
							MultiPushFigure fig = (MultiPushFigure) ((TouchOscMultiPushEditPart)INSTANCE).getPrimaryShape();
							fig.setNumCol(msg.getNewIntValue());
							fig.repaint();
						}
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NUMBER_Y.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscMultiToggleEditPart) {
							MultiToggleFigure fig = (MultiToggleFigure) ((TouchOscMultiToggleEditPart)INSTANCE).getPrimaryShape();
							fig.setNumRow(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscMultiPushEditPart) {
							MultiPushFigure fig = (MultiPushFigure) ((TouchOscMultiPushEditPart)INSTANCE).getPrimaryShape();
							fig.setNumRow(msg.getNewIntValue());
							fig.repaint();
						}
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SIZE.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscTimeHEditPart) {
							TimeHFigure fig = (TimeHFigure) ((TouchOscTimeHEditPart)INSTANCE).getPrimaryShape();
							fig.setFontSize(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscTimeVEditPart) {
							TimeVFigure fig = (TimeVFigure) ((TouchOscTimeVEditPart)INSTANCE).getPrimaryShape();
							fig.setFontSize(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscBatteryHEditPart) {
							BatteryHFigure fig = (BatteryHFigure) ((TouchOscBatteryHEditPart)INSTANCE).getPrimaryShape();
							fig.setFontSize(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscBatteryVEditPart) {
							BatteryVFigure fig = (BatteryVFigure) ((TouchOscBatteryVEditPart)INSTANCE).getPrimaryShape();
							fig.setFontSize(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscLabelHEditPart) {
							LabelHFigure fig = (LabelHFigure) ((TouchOscLabelHEditPart)INSTANCE).getPrimaryShape();
							fig.setFontSize(msg.getNewIntValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscLabelVEditPart) {
							LabelVFigure fig = (LabelVFigure) ((TouchOscLabelVEditPart)INSTANCE).getPrimaryShape();
							fig.setFontSize(msg.getNewIntValue());
							fig.repaint();
						}
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SECONDS.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscTimeHEditPart) {
							TimeHFigure fig = (TimeHFigure) ((TouchOscTimeHEditPart)INSTANCE).getPrimaryShape();
							fig.setShowSeconds(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscTimeVEditPart) {
							TimeVFigure fig = (TimeVFigure) ((TouchOscTimeVEditPart)INSTANCE).getPrimaryShape();
							fig.setShowSeconds(msg.getNewBooleanValue());
							fig.repaint();
						}
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__OUTLINE.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscTimeHEditPart) {
							TimeHFigure fig = (TimeHFigure) ((TouchOscTimeHEditPart)INSTANCE).getPrimaryShape();
							fig.setOutline(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscTimeVEditPart) {
							TimeVFigure fig = (TimeVFigure) ((TouchOscTimeVEditPart)INSTANCE).getPrimaryShape();
							fig.setOutline(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscLabelHEditPart) {
							LabelHFigure fig = (LabelHFigure) ((TouchOscLabelHEditPart)INSTANCE).getPrimaryShape();
							fig.setOutline(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscLabelVEditPart) {
							LabelVFigure fig = (LabelVFigure) ((TouchOscLabelVEditPart)INSTANCE).getPrimaryShape();
							fig.setOutline(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscBatteryHEditPart) {
							BatteryHFigure fig = (BatteryHFigure) ((TouchOscBatteryHEditPart)INSTANCE).getPrimaryShape();
							fig.setOutline(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscBatteryVEditPart) {
							BatteryVFigure fig = (BatteryVFigure) ((TouchOscBatteryVEditPart)INSTANCE).getPrimaryShape();
							fig.setOutline(msg.getNewBooleanValue());
							fig.repaint();
						}
					} else if (
						TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__BACKGROUND.equals(msg.getFeature())
					) {
						if (INSTANCE instanceof TouchOscTimeHEditPart) {
							TimeHFigure fig = (TimeHFigure) ((TouchOscTimeHEditPart)INSTANCE).getPrimaryShape();
							fig.setBackground(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscTimeVEditPart) {
							TimeVFigure fig = (TimeVFigure) ((TouchOscTimeVEditPart)INSTANCE).getPrimaryShape();
							fig.setBackground(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscLabelHEditPart) {
							LabelHFigure fig = (LabelHFigure) ((TouchOscLabelHEditPart)INSTANCE).getPrimaryShape();
							fig.setBackground(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscLabelVEditPart) {
							LabelVFigure fig = (LabelVFigure) ((TouchOscLabelVEditPart)INSTANCE).getPrimaryShape();
							fig.setBackground(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscBatteryHEditPart) {
							BatteryHFigure fig = (BatteryHFigure) ((TouchOscBatteryHEditPart)INSTANCE).getPrimaryShape();
							fig.setBackground(msg.getNewBooleanValue());
							fig.repaint();
						} else if (INSTANCE instanceof TouchOscBatteryVEditPart) {
							BatteryVFigure fig = (BatteryVFigure) ((TouchOscBatteryVEditPart)INSTANCE).getPrimaryShape();
							fig.setBackground(msg.getNewBooleanValue());
							fig.repaint();
						}
					}
				}
				refresh();
				refreshVisuals();
			};
		};
	}

	@Override
	public void refresh() {
		TouchOscControl ctrl = (TouchOscControl) ((EObject)((NodeImpl)getModel()).getElement());
		getFigure().setForegroundColor(
			TouchOscGuiUtilities.INSTANCE.getColor(ctrl.getFg() != null ? ctrl.getFg() : "red")
		);
		super.refresh();
	}
	
	@Override
	public void activate() {
		super.activate();
		if (getModel() != null && ((NodeImpl)getModel()).getElement() != null) {
			((EObject)((NodeImpl)getModel()).getElement()).eAdapters().add(nodeFeatureAdapter);
		}
	}
	
	@Override
	public void deactivate() {
		if (getModel() != null && ((NodeImpl)getModel()).getElement() != null) {
			((EObject)((NodeImpl)getModel()).getElement()).eAdapters().remove(nodeFeatureAdapter);
		}
		super.deactivate();
	}
	
	@Override
	protected void refreshBackgroundColor() {
		super.refreshBackgroundColor();
		setBackgroundColor(getFigure().getForegroundColor());
	}
	
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
	  // SET was the type i need
	  if (notification.getEventType() == Notification.SET) {
	    // the notifier sends his new Bounds ...
	    if (notification.getNotifier() instanceof BoundsImpl) {
	      BoundsImpl notifier = (BoundsImpl) notification.getNotifier();
	      // for my special coordinate mapping i also need the node,
	      // so i save it in this variable ...
	      NodeImpl node = (NodeImpl) this.getModel();
	      
	      // get the corresponding FieldLabel Object from the model
	      TouchOscControl model = (TouchOscControl) node.getElement();
	 
	      if (notification.getFeature() instanceof EAttributeImpl) {
	        // Get the attribute that has changed
	        EAttributeImpl attribute = (EAttributeImpl) notification.getFeature();
	        model.eSetDeliver(false);
	        // set the values for x and y in the model
	        if (attribute.getName().equals("x")) {
		         model.setX(notifier.getX());
		    } else if (attribute.getName().equals("y")) {
		         model.setY(notifier.getY());
		    } else if (attribute.getName().equals("width")) {
		    	if (notifier.getWidth() > 0 && model.getW() != notifier.getWidth()) {
		    		model.setW(notifier.getWidth());
		    	}
		    } else if (attribute.getName().equals("height")) {
		    	if (notifier.getHeight() > 0 && model.getH() != notifier.getHeight()) {
		    		model.setH(notifier.getHeight());
		    	}
		    } 
	        model.eSetDeliver(true);
	      }
	    }
	  }
	  super.handleNotificationEvent(notification);
	}
}
