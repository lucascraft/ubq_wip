/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.thingm;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.smbt.comm.script.config.utils.NetConfigUtil;
import net.sf.smbt.comm.script.netConf.NetCfg;
import net.sf.smbt.tests.rgb.rgbargs.RGBStepNDelayArgs;
import net.sf.smbt.tests.rgb.rgbargs.RgbargsFactory;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.temporal.Orchestror;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class RGBStepControlCore {
	public final static RGBStepControlCore INSTANCE = new RGBStepControlCore();
	
	private NetConfigUtil netCfgUtil;
	static RGBStepNDelayArgs args = RgbargsFactory.eINSTANCE.createRGBStepNDelayArgs();
	//static final Get3DAccelValuesCmd wiiNunchukCmd = net.sf.smbt.i2c.wii.nunchuck.commands.CommandsFactory.eINSTANCE.createGet3DAccelValuesCmd();
	
	static int R=0, G=1, B=2;

	CmdPipe blinkMengine0/*, blinkMengine1, wiimoteEngine*/;
	
	static int colorSelection = R;
	
	static double g = 0;
	static double gMax = 100;
	static double gMin = 0;
	
	
	private class CyclicColorJob extends Job {
		private CmdPipe jEngine;
		private String jAddr;
		
		public CyclicColorJob(CmdPipe engine, String addr) {
			super (UUID.randomUUID().toString());
			jEngine = engine;
			jAddr = addr;
		}
		
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			if (g<=0) {
				args.setIncrement(args.getIncrement()*1);
			} else if (g>=100){
				args.setIncrement(args.getIncrement()*-1);
			}
			g+=args.getIncrement();
			
			double ratio = Math.cos(2* Math.PI * g/100);
			
			int gR = args.isRMotion() ? Math.abs(new Double(ratio * args.getR()).intValue()) : args.getR();
			int gG = args.isGMotion() ? Math.abs(new Double(ratio * args.getG()).intValue()) : args.getG();
			int gB = args.isBMotion() ? Math.abs(new Double(ratio * args.getB()).intValue()) : args.getB();
			
			jEngine.getTx().postCommand(BlinkMUtil.INSTANCE.createStopScriptCmd("0x00"));

			jEngine.getTx().postCommand(
				BlinkMUtil.INSTANCE.createFadeToRGBColorCmd(
					jAddr,
					gR,
					gG,
					gB
				)
			);
			
			schedule(args.getDelay());
			
			return Status.OK_STATUS;
		}
	}

	public void stop() {
		
	}
	
	public void start(IFile netConfFile, RGBStepNDelayArgs rgbArgs) {
		args = rgbArgs;
		

		netCfgUtil = NetConfigUtil.INSTANCE;

		Map<NetCfg, List<Orchestror>> cfg = netCfgUtil.loadNetCfg(netConfFile.getFullPath().toOSString());
		
		List<Orchestror> orchestrors = cfg.values().iterator().next();
		
		blinkMengine0 = orchestrors.get(0).getApplication().getEngine().get(0);
		// blinkMengine1 = orchestrors.get(0).getApplication().getEngine().get(1);
		
		blinkMengine0.send(BlinkMUtil.INSTANCE.createStopScriptCmd("0x00"));
		// blinkMengine1.send(BlinkMUtil.INSTANCE.createStopScriptCmd("0x00"));
		
		blinkMengine0.send(
			BlinkMUtil.INSTANCE.createSetFadeSpeedCmd("0x00", new Integer(20).byteValue())
		);
		//blinkMengine1.send(
		// BlinkMUtil.INSTANCE.createSetFadeSpeedCmd("0x00", new Integer(20).byteValue())
		//);

		CyclicColorJob j0 = new CyclicColorJob(blinkMengine0, "0x00");
		j0.schedule();

		//CyclicColorJob j1 = new CyclicColorJob(blinkMengine1, "0x00");
		//j1.schedule();
	}
}
