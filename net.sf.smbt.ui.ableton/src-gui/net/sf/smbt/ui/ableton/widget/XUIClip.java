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

package net.sf.smbt.ui.ableton.widget;

import net.sf.smbt.ezabletonctrl.LiveClip;
import net.sf.smbt.ui.ableton.Activator;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class XUIClip extends Composite implements IXUIItem {
	private CLabel clipCLabel;
	private LiveClip clip;
	
	public XUIClip(Composite parent, LiveClip clip) {
		super(parent, SWT.NONE);
		setLayout(GridLayoutFactory.fillDefaults().create());
		setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		setBackground(Display.getDefault().getSystemColor(SWT.COLOR_MAGENTA));
		this.clip = clip;
		createContent(this);
	}
	
	private void createContent(Composite parent) {
		clipCLabel = new CLabel(parent, SWT.TOGGLE);
		clipCLabel.setLayout(GridLayoutFactory.fillDefaults().create());
		clipCLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		setLabel(clip.getClipName());
		
		@SuppressWarnings("static-access")
		Image play = Activator.getDefault().imageDescriptorFromPlugin(
			Activator.PLUGIN_ID, 
			"icons/actions/media-playback-start.png"
		).createImage();
		setImage(clip.isIsTriggered()?play:play); // FIXME : LB to fix it
	}
	
	public void dispose() {
		clipCLabel.dispose();
		super.dispose();
	}
	
	public void setLabel(String label) {
		clipCLabel.setText(label);
	}
	
	public void setImage(Image img) {
		clipCLabel.setImage(img);
	}

}
