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
package net.sf.smbt.sequencer.engine;

import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.smbt.ezsequence.EmitInfo;
import net.sf.smbt.ezsequence.EventCue;
import net.sf.smbt.ezsequence.EventListener;
import net.sf.smbt.ezsequence.EventSynchro;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequenceFactory;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimeBar;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.TimeNode;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

public class GroovixUtils {
	public final static GroovixUtils INSTANCE = new GroovixUtils();
	
	private EzsequenceFactory f;

	public GroovixUtils() {
		f = EzsequenceFactory.eINSTANCE;
	}
	
	public TimeCursor createTimeCursor() {
		TimeCursor cursor = f.createTimeCursor();
		cursor.setAccel(1f);
		cursor.setCompletion(0f);
		cursor.setDirection(1);
		cursor.setLength(3);
		cursor.setTime(0);
		return cursor;
	}
	
	public TimeNode createTimeNode(float completion, int x, int y) {
		TimeNode node = f.createTimeNode();
		node.setCompletion(completion);
		node.setPoint(new Point(x, y));
		return node;
	}
	
	public TimeNode createTimeNode(float completion) {
		TimeNode node = f.createTimeNode();
		node.setCompletion(completion);
		node.setPoint(new Point(0, 0));
		return node;
	}
	
	public TimeNode createTimeNode() {
		TimeNode node = f.createTimeNode();
		node.setCompletion(0f);
		node.setPoint(new Point(0, 0));
		return node;
	}
	
	public TimeBar createCircleBar() {
		TimeBar timeBar = f.createCircle();
		timeBar.setLabel("");
		timeBar.setScale(1f);
		timeBar.setSpeed(1f);
		timeBar.setDirection(1);
		
		timeBar.setTimecursor(createTimeCursor());
		
		timeBar.getNodes().add(createTimeNode());
		
		return timeBar;
	}
	
	public TimeBar createPathBar() {
		TimeBar timeBar = f.createTrack();
		timeBar.setLabel("");
		timeBar.setScale(1f);
		timeBar.setSpeed(1f);
		timeBar.setDirection(1);
		timeBar.setTimecursor(createTimeCursor());
		
		timeBar.getNodes().add(createTimeNode());

		return timeBar;
	}
	
	public EventTrigger createTrigger() {
		EventTrigger trigger = f.createEventTrigger();
		EmitInfo info = f.createEmitInfo();
		
		Cmd cmd = OscCmdUtils.INSTANCE.createOscCmd("/random/ez/sequencer/emits", UUID.randomUUID().toString());
		info.getCmd().add(cmd);
		
		trigger.getEmits().add(
			info
		);
		return trigger;
	}

	public EventCue createCue() {
		EventCue cue = f.createEventCue();
		return cue;
	}

	public EventListener createListener() {
		EventListener listener = f.createEventListener();
		return listener;
	}

	public EventSynchro createSynchro() {
		EventSynchro synchro = f.createEventSynchro();
		return synchro;
	}

	//
	//
	// URI Resource load/save
	//
	//

	public void save(IEditorInput uriInput, Sequencer groovix) {
		if (uriInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)uriInput).getFile();
			
			ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
			
			try {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				
				Resource resource = resourceSetImpl.createResource(uri);
	
				resource.getContents().add(groovix);
			
				resource.save(new HashMap<Object, Object>());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Sequencer load(IEditorInput uriInput) {
		EzsequencePackage p = EzsequencePackage.eINSTANCE;
		
		if (uriInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)uriInput).getFile();
			
			ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
			
			try {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				
				Resource resource = resourceSetImpl.getResource(uri, true);
			
				resource.load(new HashMap<Object, Object>());
				
				return (Sequencer) resource.getContents().get(0);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	//
	// XMI utils
	//
	
	
	public String toXMI(Polyline polyline) {
		String xmi = "";
		for (int i=0;i<polyline.getPoints().size();i++) {
			Point pt = polyline.getPoints().getPoint(i);
			xmi += "(" + pt.x + "," + pt.y + ")";
		}
		return xmi;
	}
	
	
	public Polyline computePolyline(String ptXMI) {
		Polyline pl = new Polyline();
		if (ptXMI!= null) {
			ptXMI = ptXMI.substring(1);
			ptXMI = ptXMI.substring(0, ptXMI.length()-1);

			String xy[] = ptXMI.split("\\)\\(");
			for (int i=0;i<xy.length;i++) {
				String p[] = xy[i].split(",");
				if (p != null && p.length == 2) {
					double x = Double.valueOf(p[0].trim());
					double y = Double.valueOf(p[1].trim());
					pl.addPoint(new Point(x, y));
				}
			}
		}
		return pl;
	}

	
	public Point computePointID2(String ptXMI) {
		if (ptXMI!= null) {
			ptXMI = ptXMI.replace("Point(", "");
			ptXMI = ptXMI.replace(")", "");
			
			double x = 0;
			double y = 0;
			
			String xy[] = ptXMI.split(",");
			if (xy != null && xy.length == 2) {
				x = Double.valueOf(xy[0].trim());
				y = Double.valueOf(xy[1].trim());
			}
			return new Point(x, y);
		}
		return new Point(0, 0);
	}
	public Rectangle computeRectID2(String rectXMI) {
		if (rectXMI!= null) {
			rectXMI = rectXMI.replace("Rectangle(", "");
			rectXMI = rectXMI.replace(")", "");
			
			double x = 0;
			double y = 0;
			double w = 0;
			double h = 0;
			
			String xywh[] = rectXMI.split(",");
			if (xywh != null && xywh.length == 4) {
				x = Double.valueOf(xywh[0].trim());
				y = Double.valueOf(xywh[1].trim());
				w = Double.valueOf(xywh[2].trim());
				h = Double.valueOf(xywh[3].trim());
			}
			return new Rectangle(new Point(x, y), new Point(w, h));
		}
		return new Rectangle(0, 0, 0, 0);
	}
	public Color computeColorID2(String rgbID) {
		if (rgbID!= null) {
			rgbID = rgbID.replace("Color {", "");
			rgbID = rgbID.replace("}", "");
			
			int r = 127;
			int g = 127;
			int b = 127;
			
			String RGB[] = rgbID.split(",");
			if (RGB != null && RGB.length == 3) {
				r = Integer.valueOf(RGB[0].trim());
				g = Integer.valueOf(RGB[1].trim());
				b = Integer.valueOf(RGB[2].trim());
			}
			return createColor(r, g, b);
		}
		return Display.getDefault().getSystemColor(SWT.COLOR_YELLOW);
	}
	public Color createColor(int r, int g, int b) {
		return new Color(Display.getDefault(), new RGB(r, g, b));
	}
}
