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

package net.sf.smbt.ui.lemur.ui.factory;

import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JZContainer;
import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JZFader;
import net.sf.smbt.jzmui.JZGesture;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JZLemurMenu;
import net.sf.smbt.jzmui.JZLemurMonitor;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JZPads;
import net.sf.smbt.jzmui.JZRange;
import net.sf.smbt.jzmui.JZRingArea;
import net.sf.smbt.jzmui.JZSignalScope;
import net.sf.smbt.jzmui.JZSurfaceLCD;
import net.sf.smbt.jzmui.JZSwitches;
import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.jzmui.JZTrack;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.ui.lemur.ui.parts.LemurBreakPointEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurContainerEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurCustomButtonEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurFaderEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurGestureEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurKnobEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurLedEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurMenuEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurMonitorEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurMultiBallsEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurMultiSliderEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurPadsEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurRangeEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurRingAreaEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurSessionEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurSignalScopeEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurSurfaceLCDEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurSwitchesEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurTextEditPart;
import net.sf.smbt.ui.lemur.ui.parts.LemurTrackEditPart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class LemurSceneEditPartFactory implements EditPartFactory {

    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = null;
     
        if (model instanceof JZJazzInterface) {
        	part = new LemurSessionEditPart();
        } else if (model instanceof JZContainer) {
        	part = new LemurContainerEditPart();
        } else if (model instanceof JZBreakPoint) {
        	part = new LemurBreakPointEditPart();
        } else if (model instanceof JZFader) {
        	part = new LemurFaderEditPart();
        } else if (model instanceof JZKnob) {
        	part = new LemurKnobEditPart();
        } else if (model instanceof JZGesture) {
        	part = new LemurGestureEditPart();
        } else if (model instanceof JZLed) {
        	part = new LemurLedEditPart();
        } else if (model instanceof JZLemurMenu) {
        	part = new LemurMenuEditPart();
        } else if (model instanceof JZLemurMonitor) {
        	part = new LemurMonitorEditPart();
        } else if (model instanceof JZMultiBalls) {
        	part = new LemurMultiBallsEditPart();
        } else if (model instanceof JZmultiSlider) {
        	part = new LemurMultiSliderEditPart();
        } else if (model instanceof JZPads) {
        	part = new LemurPadsEditPart();
        } else if (model instanceof JZRange) {
        	part = new LemurRangeEditPart();
        } else if (model instanceof JZRingArea) {
        	part = new LemurRingAreaEditPart();
        } else if (model instanceof JZSignalScope) {
        	part = new LemurSignalScopeEditPart();
        } else if (model instanceof JZSurfaceLCD) {
        	part = new LemurSurfaceLCDEditPart();
        } else if (model instanceof JZSwitches) {
        	part = new LemurSwitchesEditPart();
        } else if (model instanceof JZText) {
        	part = new LemurTextEditPart();
        } else if (model instanceof JZTrack) {
        	part = new LemurTrackEditPart();
        } else if (model instanceof JZCustomButton) {
        	part = new LemurCustomButtonEditPart();
        }
        
        if (part instanceof EditPart) {
            part.setModel(model);
        }
        
        return part;
    }
}
