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

package net.sf.smbt.ui.touchosc.controller.factory;

import net.sf.smbt.touchosc.touchosc.Layout;
import net.sf.smbt.touchosc.touchoscapp.FaderH;
import net.sf.smbt.touchosc.touchoscapp.FaderV;
import net.sf.smbt.touchosc.touchoscapp.LED;
import net.sf.smbt.touchosc.touchoscapp.LabelH;
import net.sf.smbt.touchosc.touchoscapp.LabelV;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderH;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderV;
import net.sf.smbt.touchosc.touchoscapp.MultiToggle;
import net.sf.smbt.touchosc.touchoscapp.RotaryH;
import net.sf.smbt.touchosc.touchoscapp.RotaryV;
import net.sf.smbt.touchosc.touchoscapp.Tab;
import net.sf.smbt.ui.touchosc.controller.parts.FaderHEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.FaderVEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.LEDEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.LabelHEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.LabelVEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.MultiFaderHEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.MultiFaderVEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.MultiToggleEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.RotaryHEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.RotaryVEditPart;
import net.sf.smbt.ui.touchosc.controller.parts.TouchOscSessionEditPart;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class TouchOSCSceneEditPartFactory implements EditPartFactory {

    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = null;
     
        if (model instanceof Layout) {
        	part = new TouchOscSessionEditPart();
        } else  if (model instanceof Tab) {
        	part = new TouchOscSessionEditPart();
        } else if (model instanceof FaderH) {
        	part = new FaderHEditPart();
        } else if (model instanceof FaderV) {
        	part = new FaderVEditPart();
        } else if (model instanceof MultiFaderH) {
        	part = new MultiFaderHEditPart();
        } else if (model instanceof MultiFaderV) {
        	part = new MultiFaderVEditPart();
        }/* else if (model instanceof XYPad) {
        	part = new XYPadEditPart();
        }*/ else if (model instanceof LabelH) {
        	part = new LabelHEditPart();
        } else if (model instanceof LabelV) {
        	part = new LabelVEditPart();
        } else if (model instanceof RotaryH) {
        	part = new RotaryHEditPart();
        } else if (model instanceof RotaryV) {
        	part = new RotaryVEditPart();
        } else if (model instanceof LED) {
        	part = new LEDEditPart();
        } else if (model instanceof MultiToggle) {
        	part = new MultiToggleEditPart();
        }
        
        if (part instanceof EditPart) {
            part.setModel(model);
        }
        
        return part;
    }
}
