/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
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

package net.sf.smbt.dxxp.daap;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.chunks.ChunkProcessorUtils;
import net.sf.smbt.chunks.Hasher;
import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DaapAply;
import net.sf.smbt.ezdxxp.DaapApsoRet;
import net.sf.smbt.ezdxxp.DaapAvdb;
import net.sf.smbt.ezdxxp.DaapCmd;
import net.sf.smbt.ezdxxp.DaapCmdChunk;
import net.sf.smbt.ezdxxp.DaapContentCodesRequest;
import net.sf.smbt.ezdxxp.DaapContentCodesResponse;
import net.sf.smbt.ezdxxp.DaapDatabaseRequest;
import net.sf.smbt.ezdxxp.DaapDatabseResponse;
import net.sf.smbt.ezdxxp.DaapDictionnaryEntry;
import net.sf.smbt.ezdxxp.DaapListCmd;
import net.sf.smbt.ezdxxp.DaapListOfSongsInDB;
import net.sf.smbt.ezdxxp.DaapListOfSongsInPlaylist;
import net.sf.smbt.ezdxxp.DaapLogin;
import net.sf.smbt.ezdxxp.DaapLoginResponse;
import net.sf.smbt.ezdxxp.DaapLogout;
import net.sf.smbt.ezdxxp.DaapMccr;
import net.sf.smbt.ezdxxp.DaapMlog;
import net.sf.smbt.ezdxxp.DaapMsrvCmd;
import net.sf.smbt.ezdxxp.DaapMupd;
import net.sf.smbt.ezdxxp.DaapQueryCmd;
import net.sf.smbt.ezdxxp.DaapRequestForContentCodes;
import net.sf.smbt.ezdxxp.DaapRequestMediaStream;
import net.sf.smbt.ezdxxp.DaapRequestPlaylist;
import net.sf.smbt.ezdxxp.DaapRequestSongs;
import net.sf.smbt.ezdxxp.DaapRequestTag;
import net.sf.smbt.ezdxxp.DaapServerInfoRequest;
import net.sf.smbt.ezdxxp.DaapServerInfoResponse;
import net.sf.smbt.ezdxxp.DaapStreamResponse;
import net.sf.smbt.ezdxxp.DaapUpdateRequest;
import net.sf.smbt.ezdxxp.DaapUpdateResponse;
import net.sf.smbt.ezdxxp.EzdxxpFactory;
import net.sf.smbt.ezdxxp.EzdxxpPackage;
import net.sf.smbt.ezdxxp.HttpProperty;
import net.sf.smbt.ezdxxp.ServerInfoStatus;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.core.runtime.Platform;

public class DaapCmdUtils {
	public final static DaapCmdUtils INSTANCE = new DaapCmdUtils();
	
	public final static String MSRV = new String("msrv".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MUPD = new String("mupd".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MCCR = new String("mccr".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MLOG = new String("mlog".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String AVDB = new String("avdb".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String ADBS = new String("adbs".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String APSO = new String("apso".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String APLY = new String("aply".getBytes(), Charset.forName("ISO_8859_1"));

	
	public final static String MDCL = new String("mdcl".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MCNA = new String("mcna".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MCNM = new String("mcnm".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MCTY = new String("mcty".getBytes(), Charset.forName("ISO_8859_1"));
	
	public final static String MRCO = new String("mrco".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MTCO = new String("mtco".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSTT = new String("mstt".getBytes(), Charset.forName("ISO_8859_1"));
	
	public final static String MLID = new String("mlid".getBytes(), Charset.forName("ISO_8859_1"));

	public final static String MSAL = new String("msal".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSBR = new String("msbr".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSEX = new String("msex".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSIX = new String("msix".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSLR = new String("mslr".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSPI = new String("mspi".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSQY = new String("msqy".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSRS = new String("msrs".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSUP = new String("msup".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MINM = new String("minm".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String MSTM = new String("mstm".getBytes(), Charset.forName("ISO_8859_1"));

	
	
	private static final String ISO_8859_1 = "8859_1";
	
	
	//
	// Http properties
	//
	public final static String ACCEPT_ENCODING		= new String("Accept-Encoding".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String HOST					= new String("Host".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String VOID_STRING			= new String("".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String USER_AGENT			= new String("User-Agent".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String DAAP_VERSION			= new String("Client-DAAP-Version".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String DAAP_VALIDATION		= new String("Client-DAAP-Validation".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String DAAP_ACCESS_INDEX	= new String("Client-DAAP-Access-Index".getBytes(), Charset.forName("ISO_8859_1"));
	public final static String USER_AGENT_VALUE		= new String("UBQT/0.0.1 (Windows; N)".getBytes(), Charset.forName("ISO_8859_1"));
	
	

	
	public static Map<String, DaapDictionnaryEntry> dictionnary;
	
	public DaapCmdUtils() {
		dictionnary = new HashMap<String, DaapDictionnaryEntry>();
	}
	
	public byte[] dumpDaapCmd(Cmd cmd) {
		if (cmd instanceof DaapCmd) {
			DaapCmd daapCmd = (DaapCmd) cmd;
			switch (daapCmd.eClass().getClassifierID()) {
				case EzdxxpPackage.DAAP_STREAM_RESPONSE:
				case EzdxxpPackage.DAAP_CONTENT_CODES_RESPONSE:
				case EzdxxpPackage.DAAP_UPDATE_RESPONSE:
				case EzdxxpPackage.DAAP_DATABSE_RESPONSE:
				case EzdxxpPackage.DAAP_LOGIN_RESPONSE:
				case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE:
				case EzdxxpPackage.DAAP_LIST_OF_PLAYLISTS_IN_DB:
				case EzdxxpPackage.DAAP_LIST_OF_SONGS_IN_DB:
				case EzdxxpPackage.DAAP_LIST_OF_SONGS_IN_PLAYLIST:
				case EzdxxpPackage.DAAP_LIST_CMD:
				case EzdxxpPackage.DAAP_MCCR:
				case EzdxxpPackage.DAAP_MLOG:
				case EzdxxpPackage.DAAP_MSRV_CMD:
				case EzdxxpPackage.DAAP_MUPD:
				case EzdxxpPackage.DAAP_QUERY_CMD:
				case EzdxxpPackage.DAAP_REQUEST_MEDIA_STREAM:
				case EzdxxpPackage.DAAP_REQUEST_PLAYLIST:
				case EzdxxpPackage.DAAP_REQUEST_SONGS:
				case EzdxxpPackage.DAAP_APLY:
				case EzdxxpPackage.DAAP_APSO_RET:
					break;
				case EzdxxpPackage.DAAP_AVDB:
					return DaapRequestTag.
								DB_LIST.getLiteral().
									replace("<%sid%>", ""+((DaapDatabaseRequest)cmd).getSessionID()).
										replace("<%rid%>", ""+((DaapDatabaseRequest)cmd).getRevisionID()).
										getBytes();
				case EzdxxpPackage.DAAP_DATABASE_REQUEST:
					return DaapRequestTag.
								DB_LIST.getLiteral().
									replace("<%sid%>", ""+((DaapDatabaseRequest)cmd).getSessionID()).
										replace("<%rid%>", ""+((DaapDatabaseRequest)cmd).getRevisionID()).
										getBytes();
				case EzdxxpPackage.DAAP_CONTENT_CODES_REQUEST:
					return DaapRequestTag.CONTENT_CODES.getLiteral().getBytes();
				case EzdxxpPackage.DAAP_LOGOUT:
					return DaapRequestTag.
						LOGOUT.getLiteral().
							replace("<%sid%>", ""+((DaapLogout)cmd).getSessionID()).getBytes();
				case EzdxxpPackage.DAAP_LOGIN:
					return DaapRequestTag.LOGIN.getLiteral().getBytes();
				case EzdxxpPackage.DAAP_SERVER_INFO_REQUEST:
					return DaapRequestTag.SERVER_INFO.getLiteral().getBytes();
				case EzdxxpPackage.DAAP_UPDATE_REQUEST:
					return DaapRequestTag.
								UPDATE_SESSION.getLiteral().
									replace("<%sid%>", ""+((DaapUpdateRequest)cmd).getSessionID()).
										replace("<%rid%>", ""+((DaapUpdateRequest)cmd).getRevisionID()).
											getBytes();
			}
		}
		return new byte[0];
	}
	
	public DaapCmdChunk createDAAP_APLY() {
		DaapAply cmd = EzdxxpFactory.eINSTANCE.createDaapAply();
		cmd.setTag(DaapRequestTag.PLAYLIST.getLiteral().getBytes());
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_APSO_RET() {
		DaapApsoRet cmd = EzdxxpFactory.eINSTANCE.createDaapApsoRet();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_AVDB() {
		DaapAvdb cmd = EzdxxpFactory.eINSTANCE.createDaapAvdb();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_LOGOUT(int sessionID) {
		DaapLogout cmd = EzdxxpFactory.eINSTANCE.createDaapLogout();
		cmd.getHttpProperties().addAll(buildDefaultHttpProperties(new String(dumpDaapCmd(cmd))));
		cmd.setSessionID(sessionID);
		return cmd;
	}
	
	/*
	  Request: daap://server/content-codes
      Response: mccr
      Description: Provides a dictionary of content codes, names, and size
	               information.  
      Content: ( See Appendix A for detailed code information )
	   mccr
	     mstt		status
	     mdcl		dictionary entry (one for each type)
	       mcna	      item name
	       mcnm	      item number
	       mcty	      item type
	 */
	public DaapListCmd createDAAP_CONTENT_CODES_RESPONSE(byte[] response) {
		DaapContentCodesResponse cmd = (DaapContentCodesResponse) ChunkProcessorUtils.INSTANCE.processResponse(
				EzdxxpFactory.eINSTANCE.createDaapContentCodesResponse(), 
				response
		);
		
		for (Chunk chunk : cmd.getChunks()) {
			if (chunk.getName().equals(MDCL)) {
				//String mdcl = new String(chunk.getData(), Charset.forName("ISO_8859_1"));
			}
		}
		
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_DATABASE_REQUEST(int sessionID, int revisionID) {
		DaapDatabaseRequest cmd = EzdxxpFactory.eINSTANCE.createDaapDatabaseRequest();
		cmd.setSessionID(sessionID);
		cmd.setRevisionID(revisionID<1?1:revisionID);

		cmd.getHttpProperties().addAll(buildDefaultHttpProperties(new String(dumpDaapCmd(cmd))));
		return cmd;
	}
	
	/*
		Request: daap://server/databases?session-id=<sid>&revision-number=<rid>
		Response: avdb
		Description: 	This provides a list of databases served up by the
						server.  At present, it appears that only one db per server
						is the norm, but it may be possible to have multiple servers.
		Content:
			avdb
	  	      mstt - status
	  		  muty - update type - always 0 for now
	  		  mtco - total number of matching records
	  		  mrco - total number of records returned
	  		  mlcl - listing of records
	    		mlit - single record
	      		  miid - database id (<dbid> in subsequent requests)
	      		  mper - database persistent id
	      		  minm - database name
	      		  mimc - number of items (songs) in the database
	      		  mctc - number of containers (playlists) in the database
	 */
	public DaapCmdChunk createDAAP_DATABSE_RESPONSE(byte[] response) {
		DaapDatabseResponse cmd = EzdxxpFactory.eINSTANCE.createDaapDatabseResponse();

		Chunk chunkStatus = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSTT);
		cmd.setStatus(
			ChunkProcessorUtils.INSTANCE.readInt(
					chunkStatus
			)
		);
		
		Chunk chunkMatchingRecords = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MTCO);
		cmd.setMatchingRecords(
			ChunkProcessorUtils.INSTANCE.readInt(
					chunkMatchingRecords
			)
		);
		
		Chunk chunkRecordReturned = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MRCO);
		cmd.setRecordsReturned(
			ChunkProcessorUtils.INSTANCE.readInt(
				chunkRecordReturned
			)
		);
		
		return cmd;
	}
	
	/*
		Request: daap://server/update?session-id=<sid>
		Response: mupd
		Description: 	There seem to be two forms update requests.  The first is 
						the update when logging in, to get the initial data.  The 
						second (not yet documented) is to catch updates/changes to 
						the server database.  Note the addition of the session-id 
						from the login.
		Conent:
			mupd
	  		  musr 	the server revision (<rid> below)
	  		  mstt
	 */
	public DaapCmdChunk createDAAP_UPDATE_RESPONSE(byte[] response) {
		DaapUpdateResponse cmd = EzdxxpFactory.eINSTANCE.createDaapUpdateResponse();
		Chunk chunk = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, "musr");
		int revisionNumber = ChunkProcessorUtils.INSTANCE.readInt(
			chunk
		);
		cmd.setRevisionID(
			revisionNumber<1?1:revisionNumber
		);
		return cmd;
	}
	
	public DaapListCmd createDAAP_LIST_CMD() {
		DaapListCmd cmd = EzdxxpFactory.eINSTANCE.createDaapListCmd();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_LIST_OF_PLAYLISTS_IN_DB(byte[] response) {
		DaapDatabseResponse cmd = EzdxxpFactory.eINSTANCE.createDaapDatabseResponse();
		return cmd;
	}
	
	public DaapListCmd createDAAP_LIST_OF_SONGS_IN_DB(byte[] response) {
		DaapListOfSongsInDB cmd = EzdxxpFactory.eINSTANCE.createDaapListOfSongsInDB();
		return cmd;
	}
	
	public DaapListCmd createDAAP_LIST_OF_SONGS_IN_PLAYLIST(byte[] response) {
		DaapListOfSongsInPlaylist cmd = EzdxxpFactory.eINSTANCE.createDaapListOfSongsInPlaylist();
		return cmd;
	}

	private HttpProperty createHttpProperty(String key, String value) {
		HttpProperty prop = EzdxxpFactory.eINSTANCE.createHttpProperty();
		prop.setKey(key);
		prop.setValue(value);
		return prop;
	}

	private List<HttpProperty> buildDefaultHttpProperties(String tag) {
		List<HttpProperty> properties = new ArrayList<HttpProperty>();
		properties.add(createHttpProperty(USER_AGENT, USER_AGENT_VALUE));
		properties.add(createHttpProperty(DAAP_VERSION, new String("3.0".getBytes(), Charset.forName("ISO_8859_1"))));
		properties.add(createHttpProperty(DAAP_VALIDATION, new String(Hasher.GenerateHash("/" + tag, 2).getBytes(), Charset.forName("ISO_8859_1"))));
		properties.add(createHttpProperty(DAAP_ACCESS_INDEX, new String("2".getBytes(), Charset.forName("ISO_8859_1"))));
	   	return properties;
	}
	
	public DaapCmdChunk createDAAP_LOGIN() {
		DaapLogin cmd = EzdxxpFactory.eINSTANCE.createDaapLogin();
		
		cmd.getHttpProperties().addAll(buildDefaultHttpProperties(new String(dumpDaapCmd(cmd))));

		return cmd;
	}
	
	
	/*
	  Request: daap://server/login
      Response: mlog
      Description: Provides session information to use for the rest of the
	               session.  If requiresLogin is set in the server-info, then
	               from this point on, a basic http authentication header needs
	               to be included with the request.  It is basically a header of the
	  form:
		    Authentication: base64encodedusernamepassword
	        where the base64 encoded password is the string:
		    username:password
	    base64 encoded (obviously replacing username and password with
	    the appropriate values).  Username appears to be meaningless.
	    A shame - i like the idea of being able to do user level 
	    permissions.
      Content:
	    mlog
	      mstt	  status
	      mlid	  session id (used in remaining requests <sid> below)
	 */
	public DaapCmdChunk createDAAP_LOGIN_RESPONSE(byte[] response) {
		DaapLoginResponse cmd = (DaapLoginResponse) ChunkProcessorUtils.INSTANCE.processResponse(
				EzdxxpFactory.eINSTANCE.createDaapLoginResponse(), 
				response
		);
		
		Chunk chunkSessionID = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MLID);
		cmd.setSessionID(
			ChunkProcessorUtils.INSTANCE.readInt(
				chunkSessionID
			)
		);
		
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_MCCR() {
		DaapMccr cmd = EzdxxpFactory.eINSTANCE.createDaapMccr();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_MLOG() {
		DaapMlog cmd = EzdxxpFactory.eINSTANCE.createDaapMlog();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_MSRV_CMD() {
		DaapMsrvCmd cmd = EzdxxpFactory.eINSTANCE.createDaapMsrvCmd();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_MUPD() {
		DaapMupd cmd = EzdxxpFactory.eINSTANCE.createDaapMupd();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_QUERY_CMD() {
		DaapQueryCmd cmd = EzdxxpFactory.eINSTANCE.createDaapQueryCmd();
		return cmd;
	}
	
	public DaapListCmd createDAAP_REQUEST_FOR_CONTENT_CODES(String addr) {
		DaapRequestForContentCodes cmd = EzdxxpFactory.eINSTANCE.createDaapRequestForContentCodes();
		cmd.getHttpProperties().addAll(buildDefaultHttpProperties(new String(dumpDaapCmd(cmd))));
    	cmd.getHttpProperties().add(createHttpProperty(ACCEPT_ENCODING, VOID_STRING));
    	cmd.getHttpProperties().add(createHttpProperty(HOST, addr));
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_REQUEST_MEDIA_STREAM() {
		DaapRequestMediaStream cmd = EzdxxpFactory.eINSTANCE.createDaapRequestMediaStream();
		return cmd;
	}
	public DaapCmdChunk createDAAP_REQUEST_PLAYLIST() {
		DaapRequestPlaylist cmd = EzdxxpFactory.eINSTANCE.createDaapRequestPlaylist();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_REQUEST_SONGS() {
		DaapRequestSongs cmd = EzdxxpFactory.eINSTANCE.createDaapRequestSongs();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_SERVER_INFO_REQUEST() {
		DaapServerInfoRequest cmd = EzdxxpFactory.eINSTANCE.createDaapServerInfoRequest();
		cmd.getHttpProperties().addAll(buildDefaultHttpProperties(new String(dumpDaapCmd(cmd))));
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_CONTENT_CODES_REQUEST(String addr) {
		DaapContentCodesRequest cmd = EzdxxpFactory.eINSTANCE.createDaapContentCodesRequest();
		cmd.getHttpProperties().addAll(buildDefaultHttpProperties(new String(dumpDaapCmd(cmd))));
    	cmd.getHttpProperties().add(createHttpProperty("Accept-Encoding", ""));
    	cmd.getHttpProperties().add(createHttpProperty("Host", addr));
		return cmd;
	}
	
	/*
	 Request: daap://server/server-info (or http://server:3689/)
	 Response: msrv
	 Description: 	Provides basic negotiation info on what the server does
					and doesn't support and protocols.
	 Content: (See appendix A for detailed information on codes)
	 msrv
	   mstt - status
	   apro - daap protocol
	   msix - does the server support indexing?
	   msex - does the server support extensions?
	   msup - does the server support update?
	   msal - does the server support auto-logout?
	   mstm - timeout interval
	   mslr - is login required?
	   msqy - does the server support queries?
	   minm - server name
	   msrs - does the server support resolve?  (needs persistent ids)
	   msbr - does the server support browsing?
  	   mspi - does the server support persistent ids?
	   mpro - dmap protocol version

	 */
	public DaapCmd createDAAP_SERVER_INFO_RESPONSE(byte[] response) {
		DaapServerInfoResponse cmd = (DaapServerInfoResponse) ChunkProcessorUtils.INSTANCE.processResponse(
					EzdxxpFactory.eINSTANCE.createDaapServerInfoResponse(), 
					response
		);
		cmd.setDaapProtocolVersion(ChunkProcessorUtils.INSTANCE.getServerVersion(cmd));

		cmd.setAutologoutSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSAL)
				)==1?true:false);
			
		cmd.setBrowsingSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSBR)
				)==1?true:false);
			
		cmd.setExtensionSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSEX)
				)==1?true:false);
			
		cmd.setIndexingSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSIX)
				)==1?true:false);
			
		cmd.setLoginRequired(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSLR)
				)==1?true:false);
			
		cmd.setPersitenceSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSPI)
				)==1?true:false);
			
		cmd.setQueriesSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSQY)
				)==1?true:false);
			
		cmd.setResolveSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSRS)
				)==1?true:false);
			
		cmd.setUpdateSupport(
				ChunkProcessorUtils.INSTANCE.readInt(
					ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSUP)
				)==1?true:false);
					
		Chunk chunkServerName = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MINM);
		cmd.setServerName(
			ChunkProcessorUtils.INSTANCE.readString(
				chunkServerName
			)
		);
		
		Chunk chunk = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSTM);
		cmd.setTimeoutInterval(
			ChunkProcessorUtils.INSTANCE.readInt(
				chunk
			)
		);
		
		Chunk chunkStatus = ChunkProcessorUtils.INSTANCE.findChunkByName(cmd, MSTT);
		cmd.setStatus(
			getStatusFromCode(
				ChunkProcessorUtils.INSTANCE.readInt(
					chunkStatus
				)
			)
		);

		cmd.setData(response);

		if (Platform.inDebugMode()) {
			System.out.println(
				"Daap server : "			+ cmd.getServerName() 			+ "\n" +
				"Daap Protocol version : "	+ cmd.getDaapProtocolVersion()	+ "\n" +
				"TimeOut Interval : "		+ cmd.getTimeoutInterval()		+ "\n" +
				"Autologout Support : "		+ cmd.isAutologoutSupport() 	+ "\n" +
				"Browsing Support : "		+ cmd.isBrowsingSupport() 		+ "\n" +
				"Extension Support : "		+ cmd.isExtensionSupport() 		+ "\n" +
				"Indexing Support : "		+ cmd.isIndexingSupport() 		+ "\n" +
				"Login Required : "			+ cmd.isLoginRequired() 		+ "\n" +
				"Persitence Support : "		+ cmd.isPersitenceSupport() 	+ "\n" +
				"Queries Support : "		+ cmd.isQueriesSupport() 		+ "\n" +
				"Resolve Support : "		+ cmd.isResolveSupport() 		+ "\n" +
				"isUpdate Support : "		+ cmd.isUpdateSupport() 		+ "\n" +
				"Status : " 				+ cmd.getStatus().getLiteral() 	+ "\n"
			);
		}
		
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_STREAM_RESPONSE(byte[] response) {
		DaapStreamResponse cmd = EzdxxpFactory.eINSTANCE.createDaapStreamResponse();
		return cmd;
	}
	
	public DaapCmdChunk createDAAP_UPDATE_REQUEST(int sessionID, int revisionID, String addr) {
		DaapUpdateRequest cmd = EzdxxpFactory.eINSTANCE.createDaapUpdateRequest();
		cmd.setSessionID(sessionID);
		cmd.setRevisionID(revisionID<1?1:revisionID);
		cmd.getHttpProperties().addAll(buildDefaultHttpProperties(new String(dumpDaapCmd(cmd))));
    	cmd.getHttpProperties().add(createHttpProperty(HOST, addr));
		return cmd;
	}

	public DaapCmd handleDaapFrame(byte[] frame) {
		String response = new String(frame, Charset.forName("ISO_8859_1"));
		if (response.startsWith(MSRV)) { // Server Info Response
			return createDAAP_SERVER_INFO_RESPONSE(frame);
		} else if (response.startsWith(MCCR)) { 
			return createDAAP_CONTENT_CODES_RESPONSE(frame);
		} else if (response.startsWith(MLOG)) { 
			return createDAAP_LOGIN_RESPONSE(frame);
		} else if (response.startsWith(MUPD)) { 
			return createDAAP_UPDATE_RESPONSE(frame);
		} else if (response.startsWith(AVDB)) { 
			return createDAAP_DATABSE_RESPONSE(frame);
		} else if (response.startsWith(ADBS)) { 
			return createDAAP_LIST_OF_SONGS_IN_DB(frame);
		} else if (response.startsWith(APLY)) { 
			return createDAAP_LIST_OF_PLAYLISTS_IN_DB(frame);
		} else if (response.startsWith(APSO)) { 
			return createDAAP_LIST_OF_SONGS_IN_PLAYLIST(frame);
		}
		return null;
	}
	
	
	private ServerInfoStatus getStatusFromCode(int httpStatusCode) {
		switch(httpStatusCode) {
			case ServerInfoStatus.OK_200_VALUE:
				return ServerInfoStatus.OK_200;
			case ServerInfoStatus.NOT_FOUND_404_VALUE:
				return ServerInfoStatus.NOT_FOUND_404;
		}
		return ServerInfoStatus.NOT_FOUND_404;
	}
}
