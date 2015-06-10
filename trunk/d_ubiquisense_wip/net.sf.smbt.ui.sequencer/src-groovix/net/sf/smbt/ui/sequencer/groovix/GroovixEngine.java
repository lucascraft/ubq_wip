/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.sequencer.groovix;

import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimedLine;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.progress.UIJob;

public class GroovixEngine extends UIJob {
	private ConcurrentLinkedQueue<IGroovixUpdater> updaters;
	private Sequencer groovix;
	private volatile float completion = 0f;
	private volatile float speed = 1f;
	public final static float STEP = 1f;
	public synchronized void setSpeed(float speed) {
		if (!groovix.getTimelines().isEmpty()) {
			TimedLine timeLine = groovix.getTimelines().get(0);
			timeLine.setSpeed(speed);
		}
		this.speed = speed;
	}
	public void addUpdateListener(IGroovixUpdater updater) {
		updaters.add(updater);
	}
	public void removeUpdateListener(IGroovixUpdater updater) {
		updaters.remove(updater);
	}
	public GroovixEngine(Sequencer groovix) {
		super("Groovix-"+UUID.randomUUID().toString());
		setSystem(true);
		setPriority(INTERACTIVE);
		this.updaters 	= new ConcurrentLinkedQueue<IGroovixUpdater>();
		this.groovix 	= groovix;
	}
	public float getIncrement() {
		return STEP * speed;
	}
	@Override
	public IStatus runInUIThread(IProgressMonitor monitor) {
		if (!groovix.getTimelines().isEmpty()) {
			TimedLine timeLine = groovix.getTimelines().get(0);
			completion += getIncrement();
			update(timeLine, speed, completion);
			timeLine.setTime(System.currentTimeMillis());
		}
		schedule();
		return Status.OK_STATUS;
	}
	private void update(TimedLine timeLine, float speed, float completion) {
		notifyUpdaters();
	}
	private void notifyUpdaters() {
		for (IGroovixUpdater u : updaters) {
			u.update(speed, completion, System.currentTimeMillis());
		}
	}
}
