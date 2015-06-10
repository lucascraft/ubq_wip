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

package net.sf.smbt.jazzmutant.diagram.parts;

import net.sf.smbt.jazzmutant.diagram.figures.AbstractTextualLemurFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZBreakPointFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZCustomButtonFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZFaderFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZKnobFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZLedFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZMultiBallsFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZMultiSliderFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZPadFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZRangeFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZRingAreaFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZSignalScopeFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZSwitchesFigure;
import net.sf.smbt.jazzmutant.diagram.figures.JZTextFigure;
import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JZFader;
import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JZPads;
import net.sf.smbt.jzmui.JZRange;
import net.sf.smbt.jzmui.JZRingArea;
import net.sf.smbt.jzmui.JZSignalScope;
import net.sf.smbt.jzmui.JZSwitches;
import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPoint2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPointEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButton2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButtonEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFader2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFaderEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZKnob2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZKnobEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLed2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLedEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZMultiBalls2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZMultiBallsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZPads2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZPadsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRange2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRangeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRingArea2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRingAreaEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSignalScope2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSignalScopeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSwitches2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSwitchesEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZText2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTextEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZmultiSlider2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZmultiSliderEditPart;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BoundsImpl;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.swt.graphics.Color;

public abstract class JZUIShapeNodeEditPart extends ShapeNodeEditPart {

	private AdapterImpl nodeFeatureAdapter;
	private JZUIShapeNodeEditPart INSTANCE;
	
	public JZUIShapeNodeEditPart(View view) {
		super(view);
		
		INSTANCE = this;
		
		nodeFeatureAdapter = new AdapterImpl() {
			public void notifyChanged(Notification msg) {
				if (msg.getEventType() == Notification.SET) {
					if (
						JzmuiPackage.Literals.JZUI_ELEM__NAME.equals(msg.getFeature())
					) {
							Figure fig = INSTANCE.getNodeFigure();
							for (Object f : fig.getChildren()) {
								if (f instanceof AbstractTextualLemurFigure) {
									((AbstractTextualLemurFigure)f).setLabel(msg.getNewStringValue());
									((Figure)f).repaint();
								}
							}
						refreshVisuals();
					} else if (
							JzmuiPackage.Literals.JZ_BREAK_POINT__ATTRACTION.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__BACKGROUND.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__COORDINATES.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__EDIT.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__FIRST_POINT.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__FRICTION.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_X.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_Y.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__LIGHT.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__LIVE_EDITING.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__PATH_DATA.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__POINTS.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__REST.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__SPEED.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_BREAK_POINT__VALUES.equals(msg.getFeature()) 
					) {
						if (INSTANCE instanceof JZBreakPointEditPart || INSTANCE instanceof JZBreakPoint2EditPart) {
							JZBreakPoint bp = (JZBreakPoint) ((NodeImpl)INSTANCE.getModel()).getElement();
							JZBreakPointFigure fig = (JZBreakPointFigure) (INSTANCE instanceof JZBreakPointEditPart ?
									((JZBreakPointEditPart)INSTANCE).getPrimaryShape() :
										((JZBreakPoint2EditPart)INSTANCE).getPrimaryShape());
							
							fig.setElem(bp);
							fig.refreshPoints();
							
							fig.setBackgroundColor(bp.getBackground());
							fig.setFirstPointColor(bp.getColor());
							
							bp.getAttraction();
							bp.getBackground();
							bp.getColor();
							bp.getEdit();
							bp.getFirstPoint();
							bp.getFriction();
							bp.getGridX();
							bp.getGridY();
							bp.getHold();
							bp.getHoldX();
							bp.getHoldY();
							bp.getLight();
							bp.getPhysics();
							bp.getPoints();
							bp.getRest();
							bp.getSpeed();
							bp.getValues();
							
							fig.setLabel(msg.getNewStringValue());
							fig.repaint();
						}  
					} else if (
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__CAPTURE.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__COLOR_OFF.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__COLOR_ON.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__FONT_SIZE.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__LIGHT.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__MODE.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__OUTLINE.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__STYLE_OFF.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__STYLE_OFF_TEXT.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__STYLE_ON.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__STYLE_ON_TEXT.equals(msg.getFeature()) ||
							JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__TEXT_ALIGN.equals(msg.getFeature()) 
					) {
						if (INSTANCE instanceof JZCustomButtonEditPart || INSTANCE instanceof JZCustomButton2EditPart) {
							JZCustomButton bp = (JZCustomButton) ((NodeImpl)INSTANCE.getModel()).getElement();
							JZCustomButtonFigure fig = (JZCustomButtonFigure) (INSTANCE instanceof JZCustomButtonEditPart ? 
										((JZCustomButtonEditPart)INSTANCE).getPrimaryShape() : 
											((JZCustomButton2EditPart)INSTANCE).getPrimaryShape());
							
							fig.setElem(bp);
							
							fig.setBackgroundColor(bp.getColorOff());
							fig.setForegroundColor(bp.getColorOff());
							
							bp.getFontName();
							bp.getFontSize();
							bp.getFontStyle();
							bp.getLight();
							bp.getName();
							bp.getStyleOff();
							bp.getStyleOffText();
							bp.getStyleOn();
							bp.getStyleOnText();
							bp.getTextAlign();
							bp.isCapture();
							bp.isOutline();
							
							fig.repaint();
						}
					}  else if (
								JzmuiPackage.Literals.JZ_FADER__COLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__DRAG.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__FRICTION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__HEIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__LABEL.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__LIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__PRECISION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__TENSION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__UNIT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__VALUE_ACTIVE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_FADER__VALUE.equals(msg.getFeature()) 
						) {
							if (INSTANCE instanceof JZFaderEditPart || INSTANCE instanceof JZFader2EditPart) {
								JZFader bp = (JZFader) ((NodeImpl)INSTANCE.getModel()).getElement();
								JZFaderFigure fig = (JZFaderFigure) (INSTANCE instanceof JZFaderEditPart ?
										((JZFaderEditPart)INSTANCE).getPrimaryShape() :
											((JZFader2EditPart)INSTANCE).getPrimaryShape());
								
								fig.setElem(bp);
								fig.setBackgroundColor(bp.getColor());
								fig.setForegroundColor(bp.getColor());
								
								bp.getFontName();
								bp.getFontStyle();
								bp.getLight();
								bp.getName();
								bp.getFriction();
								bp.getLight();
								bp.getPrecision();
								bp.getTension();
								bp.getUnit();
								bp.getValue();
								bp.isLabel();
								bp.isValueActive();
								
								fig.repaint();
							}  
						} else if (
								JzmuiPackage.Literals.JZ_KNOB__ATTACK.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__ATTRACTION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__CONTROL_MODE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__CURSOR_MODE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__DECAY.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__ENDLESS_KNOB.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__FRICTION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__GRID.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__HOLD.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__LABEL.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__PHYSICS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__PRECISION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__RELEASE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__SPEED.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__SUSTAIN.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__UNIT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__VALUE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_KNOB__VALUE_ACTIVE.equals(msg.getFeature()) 
						) {
							if (INSTANCE instanceof JZKnobEditPart || INSTANCE instanceof JZKnob2EditPart) {
								JZKnob bp = (JZKnob) ((NodeImpl)INSTANCE.getModel()).getElement();
								JZKnobFigure fig = INSTANCE instanceof JZKnobEditPart ?
										(JZKnobFigure) ((JZKnobEditPart)INSTANCE).getPrimaryShape() :
											(JZKnobFigure) ((JZKnob2EditPart)INSTANCE).getPrimaryShape();
								
								fig.setElem(bp);
								
								bp.getDecay();
								bp.getHold();
								bp.getRelease();
								bp.getFontName();
								bp.getFontStyle();
								bp.getName();
								bp.getFriction();
								bp.getPrecision();
								bp.getSustain();
								bp.getSpeed();
								bp.getUnit();
								bp.getValue();
								bp.isEndlessKnob();
								bp.isGrid();
								bp.isLabel();
								bp.isValueActive();
								
								fig.repaint();
							}  
						}  else if (
								JzmuiPackage.Literals.JZ_KNOB__BACKGROUD.equals(msg.getFeature()) 
						) {
							if (INSTANCE instanceof JZKnobEditPart || INSTANCE instanceof JZKnob2EditPart) {
								if (msg.getNewValue() != null) {
									setBackgroundColor((Color) msg.getNewValue());
									refreshBackgroundColor();
								}
							}  
						}  else if (
								JzmuiPackage.Literals.JZ_KNOB__FOREGROUND.equals(msg.getFeature())
						) {
							if (INSTANCE instanceof JZKnobEditPart || INSTANCE instanceof JZKnob2EditPart) {
								if (msg.getNewValue() != null) {
									setBackgroundColor((Color) msg.getNewValue());
									refreshBackgroundColor();
								}
							}  
						} else if (
								JzmuiPackage.Literals.JZ_LED__BARGRAPH.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__COLOR_OFF.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__COLOR_ON.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__COLUMNS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__LABEL_ACTIVE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__LIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__MULTICOLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__ROWS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_LED__TRANSPARENT.equals(msg.getFeature()) 
						) {
							if (INSTANCE instanceof JZLedEditPart || INSTANCE instanceof JZLed2EditPart) {
								JZLed bp = (JZLed) ((NodeImpl)INSTANCE.getModel()).getElement();
								
								JZLedFigure fig = (JZLedFigure) (INSTANCE instanceof JZLedEditPart ? 
										((JZLedEditPart)INSTANCE).getPrimaryShape() : 
											((JZLed2EditPart)INSTANCE).getPrimaryShape());
								
								fig.setBackgroundColor(bp.getColorOff());
								fig.setForegroundColor(bp.getColorOff());

								bp.getColorOn();
								bp.getColumns();
								bp.getLight();
								bp.getRows();
								bp.getValue();
								bp.isBargraph();
								bp.isLabelActive();
								bp.isMulticolor();
								bp.isTransparent();
								fig.numCol = bp.getColumns();
								fig.numRow = bp.getRows();
								
								fig.repaint();
							}  
						} else if (
								JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTACK.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__BALLS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__COLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__DATA.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__DECAY.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__FRICTION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_X.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_Y.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__HEIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_X.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_Y.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__LABEL_VISIBLE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__LIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTI_COLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTILABEL.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS_VISIBLE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__RELEASE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__SPEED.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__SUSTAIN.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__TENSION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__X.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__Y.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_MULTI_BALLS__Z.equals(msg.getFeature())
						) {
							if (INSTANCE instanceof JZMultiBallsEditPart || INSTANCE instanceof JZMultiBalls2EditPart) {
								JZMultiBalls bp = (JZMultiBalls) ((NodeImpl)INSTANCE.getModel()).getElement();
								JZMultiBallsFigure fig = (JZMultiBallsFigure) ( INSTANCE instanceof JZMultiBallsEditPart ? 
										((JZMultiBallsEditPart)INSTANCE).getPrimaryShape() : 
											((JZMultiBalls2EditPart)INSTANCE).getPrimaryShape());
								
								fig.setElem(bp);
								fig.refreshBalls();
								fig.setBackgroundColor(bp.getColor());
								fig.setForegroundColor(bp.getColor());

								bp.getAttack();
								bp.getBalls();
								bp.getData();
								bp.getDecay();
								bp.getFriction();
								bp.getGridStepX();
								bp.getGridStepY();
								bp.getHold();
								bp.getHoldX();
								bp.getHoldY();
								bp.getLight();
								bp.getRelease();
								bp.getSpeed();
								bp.getSustain();
								bp.getTension();
								bp.getX();
								bp.getY();
								bp.getZ();
								bp.isLabelVisible();
								bp.isMultiColor();
								bp.isMultilabel();
								bp.isNumbers();
								bp.isNumbersVisible();
								
								fig.setElem(bp);
								
								fig.repaint();
							}  
						} else if (
								JzmuiPackage.Literals.JZMULTI_SLIDER__BIPOLAR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__COLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__FRICTION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__GRADIENT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__HEIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__HORIZONTAL.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__LABEL_VISIBLE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__LIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__MULTICOLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__SLIDER.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__TENSION.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZMULTI_SLIDER__VALUES.equals(msg.getFeature())
						) {
							if (INSTANCE instanceof JZmultiSliderEditPart || INSTANCE instanceof JZmultiSlider2EditPart) {
								JZmultiSlider bp = (JZmultiSlider) ((NodeImpl)INSTANCE.getModel()).getElement();
								JZMultiSliderFigure fig = (JZMultiSliderFigure) (INSTANCE instanceof JZmultiSliderEditPart ?
										((JZmultiSliderEditPart)INSTANCE).getPrimaryShape() :
											((JZmultiSlider2EditPart)INSTANCE).getPrimaryShape());
								
								fig.setElem(bp);
								fig.setBackgroundColor(bp.getColor());
								fig.setForegroundColor(bp.getColor());

								bp.getFriction();
								bp.getGradient();
								bp.getHeight();
								bp.getLight();
								bp.getSlider();
								bp.getValues();
								bp.isBipolar();
								bp.isHorizontal();
								bp.isLabelVisible();
								bp.isMulticolor();
								
								fig.repaint();
							}  
						} else if (
								JzmuiPackage.Literals.JZ_PADS__ATTACK.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__COLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__COLOR_ON.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__COLUMNS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__DECAY.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__HOLD.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__LABEL_VISIBLE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__LIGHT.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__MULTICOLOR.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__MULTILABEL.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__NUMBERS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__RELEASE.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__ROWS.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__SUSTAIN.equals(msg.getFeature()) ||
								JzmuiPackage.Literals.JZ_PADS__VALUES.equals(msg.getFeature())
						) {
							if (INSTANCE instanceof JZPadsEditPart || INSTANCE instanceof JZPads2EditPart) {
								JZPads bp = (JZPads) ((NodeImpl)INSTANCE.getModel()).getElement();
								JZPadFigure fig = (JZPadFigure) (INSTANCE instanceof JZPadsEditPart ? 
										((JZPadsEditPart)INSTANCE).getPrimaryShape() : 
											((JZPads2EditPart)INSTANCE).getPrimaryShape());
								
								fig.setElem(bp);
								
								fig.setBackgroundColor(bp.getColor());
								fig.setForegroundColor(bp.getColor());

								
								bp.getAttack();
								bp.getColor();
								bp.getColorOff();
								bp.getColorOn();
								bp.getColumns();
								bp.getDecay();
								bp.getHold();
								bp.getLight();
								bp.getNumbers();
								bp.getRelease();
								bp.getRows();
								bp.getSustain();
								bp.getValues();
								bp.isLabelVisible();
								bp.isMulticolor();
								bp.isMultilabel();
								
								fig.repaint();
							}  
						}  else if (
								JzmuiPackage.Literals.JZ_PADS__COLOR_OFF.equals(msg.getFeature())
						) {
							if (INSTANCE instanceof JZPadsEditPart || INSTANCE instanceof JZPads2EditPart) {
								JZPads bp = (JZPads) ((NodeImpl)INSTANCE.getModel()).getElement();
								JZPadFigure fig = (JZPadFigure) (INSTANCE instanceof JZPadsEditPart ? 
										((JZPadsEditPart)INSTANCE).getPrimaryShape() : 
											((JZPads2EditPart)INSTANCE).getPrimaryShape());
								
								fig.setElem(bp);
								
								fig.setBackgroundColor(bp.getColorOff());
								fig.setForegroundColor(bp.getColorOff());
								
								fig.repaint();
							}  
						} else if (
									JzmuiPackage.Literals.JZ_RANGE__COLOR.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RANGE__HORIZONTAL.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RANGE__LABEL_VISIBLE.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RANGE__LIGHT.equals(msg.getFeature())
							) {
								if (INSTANCE instanceof JZRangeEditPart || INSTANCE instanceof JZRange2EditPart) {
									JZRange bp = (JZRange) ((NodeImpl)INSTANCE.getModel()).getElement();
									JZRangeFigure fig = (JZRangeFigure) (INSTANCE instanceof JZRangeEditPart ? 
											((JZRangeEditPart)INSTANCE).getPrimaryShape() : 
												((JZRange2EditPart)INSTANCE).getPrimaryShape());
									
									fig.setElem(bp);

									fig.setBackgroundColor(bp.getColor());
									fig.setForegroundColor(bp.getColor());

									bp.getLight();
									bp.isHorizontal();
									bp.isLabelVisible();
									
									fig.repaint();
								}  
							} else if (
									JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_X.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_Y.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RING_AREA__COLOR.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RING_AREA__FRICTION.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RING_AREA__SPEED.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_RING_AREA__VALUE_ACTIVE.equals(msg.getFeature())
							) {
								if (INSTANCE instanceof JZRingAreaEditPart || INSTANCE instanceof JZRingArea2EditPart) {
									JZRingArea bp = (JZRingArea) ((NodeImpl)INSTANCE.getModel()).getElement();
									JZRingAreaFigure fig = (JZRingAreaFigure) (INSTANCE instanceof JZRingAreaEditPart ? 
											((JZRingAreaEditPart)INSTANCE).getPrimaryShape() : 
												((JZRingArea2EditPart)INSTANCE).getPrimaryShape());
									
									fig.setElem(bp);
									fig.setBackgroundColor(bp.getColor());
									fig.setForegroundColor(bp.getColor());

									bp.getAttraction();
									bp.getAttraction_x();
									bp.getAttraction_y();
									bp.getColor();
									bp.getFriction();
									bp.getSpeed();
									
									fig.repaint();
								}  
							} else if (
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__COLOR.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__DATA.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__FRICTION.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__HEIGHT.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__LABEL_VISIBLE.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__LIGHT.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__MODE_XY.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__TENSION.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__TRANSPARENT.equals(msg.getFeature())
							) {
								if (INSTANCE instanceof JZSignalScopeEditPart || INSTANCE instanceof JZSignalScope2EditPart) {
									JZSignalScope bp = (JZSignalScope) ((NodeImpl)INSTANCE.getModel()).getElement();
									JZSignalScopeFigure fig = (JZSignalScopeFigure) (INSTANCE instanceof JZSignalScopeEditPart ?
											((JZSignalScopeEditPart)INSTANCE).getPrimaryShape() :
												((JZSignalScope2EditPart)INSTANCE).getPrimaryShape());
									
									fig.setElem(bp);
									fig.setBackgroundColor(bp.getColor());
									fig.setForegroundColor(bp.getColor());

									bp.getFriction();
									bp.getHeight();
									bp.getLight();
									bp.getTension();
									
									fig.repaint();
								}  
							} else if (
									JzmuiPackage.Literals.JZ_SWITCHES__COLOR_OFF.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__COLOR_ON.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__COLUMNS.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__LABEL_VISIBLE.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__LIGHT.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__MULTICOLOR.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__MULTILABEL.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__NUMBERS.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__RADIO.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_SWITCHES__ROWS.equals(msg.getFeature())
							) {
								if (INSTANCE instanceof JZSwitchesEditPart || INSTANCE instanceof JZSwitches2EditPart) {
									JZSwitches bp = (JZSwitches) ((NodeImpl)INSTANCE.getModel()).getElement();
									JZSwitchesFigure fig = (JZSwitchesFigure) (INSTANCE instanceof JZSwitches ?
											((JZSwitchesEditPart)INSTANCE).getPrimaryShape() : 
												((JZSwitches2EditPart)INSTANCE).getPrimaryShape());
									
									fig.setBackgroundColor(bp.getColorOff());
									fig.setForegroundColor(bp.getColorOff());

									bp.getColorOn();
									bp.getColumns();
									bp.getLight();
									bp.getNumbers();
									bp.getRows();
									
									fig.repaint();
								}  
							} else if (
									JzmuiPackage.Literals.JZ_TEXT__COLOR.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_TEXT__FONT.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_TEXT__FONT_ALIGN.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_TEXT__FONT_SIZE.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_TEXT__LIGHT.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_TEXT__TEXT.equals(msg.getFeature()) ||
									JzmuiPackage.Literals.JZ_TEXT__TRANSPARENT.equals(msg.getFeature())
							) {
								if (INSTANCE instanceof JZTextEditPart || INSTANCE instanceof JZText2EditPart) {
									JZText bp = (JZText) ((NodeImpl)INSTANCE.getModel()).getElement();
									JZTextFigure fig = (JZTextFigure) (INSTANCE instanceof JZTextEditPart ? 
											((JZTextEditPart)INSTANCE).getPrimaryShape() : 
												((JZText2EditPart)INSTANCE).getPrimaryShape());
									
									fig.setBackgroundColor(bp.getColor());
									fig.setForegroundColor(bp.getColor());

									bp.getColor();
									bp.getFontAlign();
									bp.getLight();
									bp.getText();
									
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
	protected void handleNotificationEvent(Notification notification) {
	  if (notification.getEventType() == Notification.SET) {
	    if (notification.getNotifier() instanceof BoundsImpl) {
	      BoundsImpl notifier = (BoundsImpl) notification.getNotifier();
	      NodeImpl node = (NodeImpl) this.getModel();
	      
	      JZUIElem model = (JZUIElem) node.getElement();
	 
	      if (notification.getFeature() instanceof EAttributeImpl) {
	        EAttributeImpl attribute = (EAttributeImpl) notification.getFeature();
	        model.eSetDeliver(false);
	        if (	attribute.getName().equals("x") || 
	        		attribute.getName().equals("y") || 
	        		attribute.getName().equals("width") || 
	        		attribute.getName().equals("height")
	        ) {
	        	if (notifier.getX() > 0 && notifier.getY() > 0 && notifier.getWidth() > 0 && notifier.getHeight() > 0) {
	        		model.setBounds(new Rectangle(notifier.getX(), notifier.getY(), notifier.getWidth(), notifier.getHeight()));
	        	}
	        }
	        model.eSetDeliver(true);
	      }
	    }
	  }
	  super.handleNotificationEvent(notification);
	}
}
