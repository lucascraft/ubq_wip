/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011-2012, Lucas Bigeardel
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

package net.sf.smbt.touchosc.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

import javax.jmdns.ServiceInfo;

import net.sf.smbt.quantic.services.ISmartDnsServiceManager;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class TouchOscBonjourSync implements ISmartDnsServiceManager {
	
	public final static String ID = "net.sf.smbt.touchosc.bonjour";
	public final static String TOUCHOSC_BONJOUR_TCP_DS_DNS_TYPE = "_touchosceditor._tcp.local.";
	public final static int TOUCHOSC_BONJOUR_PORT = 9658;

	private ServiceInfo serviceInfo;
	
	private String currentTouchOscFileToSync = "";
	
	public TouchOscBonjourSync() {
        String text = "TouchOsc Editor DNS SD Service";
        Map<String, byte[]> properties = new HashMap<String, byte[]>();
        properties.put("srvname", text.getBytes());

		serviceInfo = ServiceInfo.create(
			TOUCHOSC_BONJOUR_TCP_DS_DNS_TYPE, 
			"touchosceditor", 
			TOUCHOSC_BONJOUR_PORT, 
			0, 
			0, 
			true, 
			properties
		);
	}
	//@Override
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
	
	public void setCurrentTouchOscFileToSync(String currentTouchOscFileToSync) {
		this.currentTouchOscFileToSync = currentTouchOscFileToSync;
	}
	
	public String getCurrentTouchOscFileToSync() {
		return currentTouchOscFileToSync;
	}
	
	Job touchOSCJob;
	@Override
	public void init() {
		touchOSCJob = new DnsSdTcpInputPortJob(serviceInfo); 
		touchOSCJob.schedule(5000);
	}
	
	@Override
	public void connect() {
	}
	
	@Override
	public void disconnect() {
		if (touchOSCJob != null) {
			touchOSCJob.cancel();
			touchOSCJob.done(Status.OK_STATUS);
		}
	}
	
	@Override
	public void close() {
		if (touchOSCJob != null) {
			touchOSCJob.cancel();
			touchOSCJob.done(Status.OK_STATUS);
		}
	}
	
	public class DnsSdTcpInputPortJob extends Job {
		private ServerSocket serverSocket;
		private BufferedReader reader;
		private InputStream in;
		private Socket socket;
			
		private int portID;
		public DnsSdTcpInputPortJob(final ServiceInfo serviceInfo) {
			super("tcp_dnssd_" + serviceInfo.getPort());
			setSystem(true);
			setPriority(Job.INTERACTIVE);
			this.portID = serviceInfo.getPort();
				new Job("TouchOsc DnsSd Job Init") {
					@Override
					protected IStatus run(IProgressMonitor monitor) {
						try {
							serverSocket = new ServerSocket(serviceInfo.getPort());
							serverSocket.setSoTimeout(5000);
							socket = serverSocket.accept();
							in = socket.getInputStream();
							reader = new BufferedReader(new InputStreamReader(in));
						} catch (SocketTimeoutException e) {
							//System.err.println("Server socket timemout on port " + serviceInfo.getPort() + " : please, initialize a connection to remove this message");
						} catch (IOException e) {
							// ugly
						}
						return Status.OK_STATUS;
					}
				}.schedule();
		}

		public int getPortID() {
			return portID;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				if (socket == null  && serverSocket != null) {
					socket	= serverSocket.accept();
					in		= socket.getInputStream();
					reader	= new BufferedReader(new InputStreamReader(in));
				}
				if (in != null) {
					while (in.available()>0) {
						String line = reader.readLine();
						if (line.equals("GET / HTTP/1.1")) {
							handleTouchOSCSyncGET(line, socket.getOutputStream());
						}
					}
				}
			} catch (SocketTimeoutException e) {
				//System.err.println("Server socket timemout on port " + portID + " : please, initialize a connection to remove this message");
			} catch (IOException e) {
				e.printStackTrace();
				try {
					if (serverSocket != null && !serverSocket.isClosed()) {
						socket = serverSocket.accept();
						in = socket.getInputStream();
						reader = new BufferedReader(new InputStreamReader(in));
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			} finally {
				schedule(2500);
			}
			return Status.OK_STATUS;
		}

		public synchronized void close() {
			try {
				if (serverSocket != null && !serverSocket.isClosed()) {
					serverSocket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
	private void handleTouchOSCSyncGET(String line, OutputStream os) throws UnsupportedEncodingException, IOException {
		String path = currentTouchOscFileToSync;
		
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(os, "UTF8"));
		if (path != null && path != "") {
			String filename = new Path(path).removeFileExtension().lastSegment();
			String index_xml = TouchOSCUtils.INSTANCE.loadTouchOscXML(path);
			System.out.println("Transfert " + filename + " : \n\n" + index_xml);
			wr.write("HTTP/1.0 200 OK\r\n");
			wr.write("Content-Type: application/touchosc\r\n");
			wr.write("Content-Disposition: attachment; filename=\""+new Path(path).lastSegment()+"\"\r\n");
			wr.write("\r\n");
			// Send data
			wr.write(index_xml);
		} else {
			wr.write("HTTP/1.0 404 NOT FOUND\r\n");
			wr.write("Content-Type: application/touchosc\r\n");
			wr.write("Content-Disposition: attachment; filename=\"No File Found\"\r\n");
			wr.write("\r\n");
		}

		wr.flush();
		wr.close();
	}
}
