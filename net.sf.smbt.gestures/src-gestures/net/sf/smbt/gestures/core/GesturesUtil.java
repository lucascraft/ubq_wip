/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010, Lucas Bigeardel
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

package net.sf.smbt.gestures.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.sigtec.ink.Note;
import org.sigtec.ink.Point;
import org.sigtec.ink.Trace;
import org.ximtec.igesture.Recogniser;
import org.ximtec.igesture.algorithm.AlgorithmException;
import org.ximtec.igesture.configuration.Configuration;
import org.ximtec.igesture.core.ResultSet;

public class GesturesUtil {
	public final static GesturesUtil INSTANCE = new GesturesUtil();
	private Recogniser recogniser;

	public GesturesUtil() {
		try {
			recogniser = new Recogniser(new Configuration());
		} catch (AlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	public Recogniser getRecogniser() {
		return recogniser;

	}
	
	public static void main(String[] args) {
		Point pt = new Point(0, 0);
		
		List<Point> pts1 = new ArrayList<Point>();
		pts1.add(pt);
		Trace t1 = new Trace(pts1);
		
		List<Point> pts2 = new ArrayList<Point>();
		pts2.add(pt);
		Trace t2 = new Trace(pts2);
		
		ResultSet rSet = INSTANCE.getRecogniser().recognise(
			new Note(
				Arrays.asList(
					new Trace[]{t1, t2}
				)
			)
		);
		if (rSet.isEmpty()) {
			System.err.println("Recognition failed !");
		}
	}
}
