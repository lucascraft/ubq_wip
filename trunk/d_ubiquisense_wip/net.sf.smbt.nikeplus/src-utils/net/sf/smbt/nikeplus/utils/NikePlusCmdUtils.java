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

package net.sf.smbt.nikeplus.utils;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

import net.sf.smbt.nikeplus.NikeplusCmd;
import net.sf.smbt.nikeplus.NikeplusFactory;
import net.sf.xqz.model.cmd.Cmd;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class NikePlusCmdUtils {
	
	public SimpleDateFormat ISO_8601_DATE_FORMAT, ISO_8601_SHORT_DATE_FORMAT; 

	public final static NikePlusCmdUtils INSTANCE = new NikePlusCmdUtils();
	
	public NikePlusCmdUtils() {
		ISO_8601_DATE_FORMAT		= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
		ISO_8601_DATE_FORMAT.setLenient(true);
		ISO_8601_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
		
		ISO_8601_SHORT_DATE_FORMAT	= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		ISO_8601_SHORT_DATE_FORMAT.setLenient(true);
		ISO_8601_SHORT_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
	}
	
	public byte[] dumpNikePlusCmd(NikeplusCmd cmd) {
		return new byte[0];
	}
	public NikeplusCmd handleNikePlusCmd(byte[] frame) {
		return null;
	}
	
	
	public byte[] dumpNikeCommand(Cmd cmd) {
		if (cmd instanceof NikeplusCmd) {
//			NikeplusCmd c = (NikeplusCmd) cmd;
			
			
//			String feed			= c.getFeed();
//			String dataStream	= c.getDatastream();
//			
//			feed 				= (feed==null || "".equals(feed)) ? "" : ("/" + feed);
//			dataStream 			= (dataStream==null || "".equals(dataStream)) ? "" : ("/datastreams/" + dataStream);
//			
//			String url =  "/" + c.getVersion() + "/feeds"+ feed + dataStream;
//			url += ("".equals(feed) && "".equals(dataStream)) ? "" : ("."+ c.getFeedKind().getLiteral()) ;
//			url += c.getCommand();
//			return url.getBytes();
		}
		return new byte[0];
	}

	public Cmd handleNikeFrame(byte[] frame) {
//		String flux = new String(frame, Charset.forName("UTF-8"));

		NikeplusCmd cmd = NikeplusFactory.eINSTANCE.createNikeplusCmd();
		
		return cmd;
	}
	
	//
	//
	//
	
	public Object loadDataFromJson(String json) {
		
		System.err.println(json);

		return new JsonParser().parse(json);
	}
	
	public void dumpJsonFeed(JsonElement json) {
		//new JsonWriter(new OutputStreamWriter(System.out)).;
	}

}
