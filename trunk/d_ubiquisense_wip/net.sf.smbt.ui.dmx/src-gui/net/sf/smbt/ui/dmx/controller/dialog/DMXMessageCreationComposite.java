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

package net.sf.smbt.ui.dmx.controller.dialog;

import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.model.qxf.Capability;
import net.sf.smbt.dmx.model.qxf.Channel;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class DMXMessageCreationComposite extends Composite {
	@SuppressWarnings("unused")
	private DMXFixture fixture;
	@SuppressWarnings("unused")
	private DMXUniverseCtrl universe;
	private FixtureDefinition fixtureDefinition;
	
	public DMXMessageCreationComposite(DMXFixture fixture, Composite container) {
		super(container, SWT.NONE);
		this.fixture			= fixture;
		this.universe			= fixture.getUniverse();
		this.fixtureDefinition 	= fixture.getDefinition();
		createContent(container);
	}

	private void createContent(Composite container) {
		for (Channel channel : fixtureDefinition.getChannel()) {
			for (Capability capability : channel.getCapability()) {
				capability.getMin();
				capability.getMax();
			}
		}
	}
}
