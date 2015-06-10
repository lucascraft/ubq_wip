/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.util;

import java.util.List;

import net.sf.smbt.ezdxxp.*;
import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DaapAply;
import net.sf.smbt.ezdxxp.DaapApsoRet;
import net.sf.smbt.ezdxxp.DaapAvdb;
import net.sf.smbt.ezdxxp.DaapCmd;
import net.sf.smbt.ezdxxp.DaapCmdChunk;
import net.sf.smbt.ezdxxp.DaapCmdResponse;
import net.sf.smbt.ezdxxp.DaapContentCodesRequest;
import net.sf.smbt.ezdxxp.DaapContentCodesResponse;
import net.sf.smbt.ezdxxp.DaapDBRecords;
import net.sf.smbt.ezdxxp.DaapDatabaseRequest;
import net.sf.smbt.ezdxxp.DaapDatabseResponse;
import net.sf.smbt.ezdxxp.DaapDictionnaryEntry;
import net.sf.smbt.ezdxxp.DaapListCmd;
import net.sf.smbt.ezdxxp.DaapListOfPlaylistsInDB;
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
import net.sf.smbt.ezdxxp.DaapRequestPlaylists;
import net.sf.smbt.ezdxxp.DaapRequestSongs;
import net.sf.smbt.ezdxxp.DaapServerInfoRequest;
import net.sf.smbt.ezdxxp.DaapServerInfoResponse;
import net.sf.smbt.ezdxxp.DaapStreamResponse;
import net.sf.smbt.ezdxxp.DaapUpdateRequest;
import net.sf.smbt.ezdxxp.DaapUpdateResponse;
import net.sf.smbt.ezdxxp.EzdxxpPackage;
import net.sf.smbt.ezdxxp.HttpProperty;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage
 * @generated
 */
public class EzdxxpSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdxxpPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdxxpSwitch() {
		if (modelPackage == null) {
			modelPackage = EzdxxpPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzdxxpPackage.DAAP_CMD_CHUNK: {
				DaapCmdChunk daapCmdChunk = (DaapCmdChunk)theEObject;
				T result = caseDaapCmdChunk(daapCmdChunk);
				if (result == null) result = caseDaapCmd(daapCmdChunk);
				if (result == null) result = caseCmd(daapCmdChunk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_LIST_CMD: {
				DaapListCmd daapListCmd = (DaapListCmd)theEObject;
				T result = caseDaapListCmd(daapListCmd);
				if (result == null) result = caseCompoundCmd(daapListCmd);
				if (result == null) result = caseDaapCmd(daapListCmd);
				if (result == null) result = caseCmd(daapListCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_SERVER_INFO_REQUEST: {
				DaapServerInfoRequest daapServerInfoRequest = (DaapServerInfoRequest)theEObject;
				T result = caseDaapServerInfoRequest(daapServerInfoRequest);
				if (result == null) result = caseDaapCmdChunk(daapServerInfoRequest);
				if (result == null) result = caseDaapCmd(daapServerInfoRequest);
				if (result == null) result = caseCmd(daapServerInfoRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE: {
				DaapServerInfoResponse daapServerInfoResponse = (DaapServerInfoResponse)theEObject;
				T result = caseDaapServerInfoResponse(daapServerInfoResponse);
				if (result == null) result = caseDaapCmdChunk(daapServerInfoResponse);
				if (result == null) result = caseDaapCmdResponse(daapServerInfoResponse);
				if (result == null) result = caseDaapCmd(daapServerInfoResponse);
				if (result == null) result = caseCmd(daapServerInfoResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_REQUEST_FOR_CONTENT_CODES: {
				DaapRequestForContentCodes daapRequestForContentCodes = (DaapRequestForContentCodes)theEObject;
				T result = caseDaapRequestForContentCodes(daapRequestForContentCodes);
				if (result == null) result = caseDaapListCmd(daapRequestForContentCodes);
				if (result == null) result = caseCompoundCmd(daapRequestForContentCodes);
				if (result == null) result = caseDaapCmd(daapRequestForContentCodes);
				if (result == null) result = caseCmd(daapRequestForContentCodes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_CONTENT_CODES_RESPONSE: {
				DaapContentCodesResponse daapContentCodesResponse = (DaapContentCodesResponse)theEObject;
				T result = caseDaapContentCodesResponse(daapContentCodesResponse);
				if (result == null) result = caseDaapListCmd(daapContentCodesResponse);
				if (result == null) result = caseDaapCmdResponse(daapContentCodesResponse);
				if (result == null) result = caseCompoundCmd(daapContentCodesResponse);
				if (result == null) result = caseDaapCmd(daapContentCodesResponse);
				if (result == null) result = caseCmd(daapContentCodesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_LOGIN: {
				DaapLogin daapLogin = (DaapLogin)theEObject;
				T result = caseDaapLogin(daapLogin);
				if (result == null) result = caseDaapCmdChunk(daapLogin);
				if (result == null) result = caseDaapCmd(daapLogin);
				if (result == null) result = caseCmd(daapLogin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_LOGIN_RESPONSE: {
				DaapLoginResponse daapLoginResponse = (DaapLoginResponse)theEObject;
				T result = caseDaapLoginResponse(daapLoginResponse);
				if (result == null) result = caseDaapCmdChunk(daapLoginResponse);
				if (result == null) result = caseDaapCmdResponse(daapLoginResponse);
				if (result == null) result = caseDaapCmd(daapLoginResponse);
				if (result == null) result = caseCmd(daapLoginResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_UPDATE_REQUEST: {
				DaapUpdateRequest daapUpdateRequest = (DaapUpdateRequest)theEObject;
				T result = caseDaapUpdateRequest(daapUpdateRequest);
				if (result == null) result = caseDaapCmdChunk(daapUpdateRequest);
				if (result == null) result = caseDaapCmd(daapUpdateRequest);
				if (result == null) result = caseCmd(daapUpdateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_DATABASE_REQUEST: {
				DaapDatabaseRequest daapDatabaseRequest = (DaapDatabaseRequest)theEObject;
				T result = caseDaapDatabaseRequest(daapDatabaseRequest);
				if (result == null) result = caseDaapCmdChunk(daapDatabaseRequest);
				if (result == null) result = caseDaapCmd(daapDatabaseRequest);
				if (result == null) result = caseCmd(daapDatabaseRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_DATABSE_RESPONSE: {
				DaapDatabseResponse daapDatabseResponse = (DaapDatabseResponse)theEObject;
				T result = caseDaapDatabseResponse(daapDatabseResponse);
				if (result == null) result = caseDaapCmdChunk(daapDatabseResponse);
				if (result == null) result = caseDaapCmdResponse(daapDatabseResponse);
				if (result == null) result = caseDaapCmd(daapDatabseResponse);
				if (result == null) result = caseCmd(daapDatabseResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_REQUEST_SONGS: {
				DaapRequestSongs daapRequestSongs = (DaapRequestSongs)theEObject;
				T result = caseDaapRequestSongs(daapRequestSongs);
				if (result == null) result = caseDaapCmdChunk(daapRequestSongs);
				if (result == null) result = caseDaapCmd(daapRequestSongs);
				if (result == null) result = caseCmd(daapRequestSongs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_LIST_OF_SONGS_IN_DB: {
				DaapListOfSongsInDB daapListOfSongsInDB = (DaapListOfSongsInDB)theEObject;
				T result = caseDaapListOfSongsInDB(daapListOfSongsInDB);
				if (result == null) result = caseDaapListCmd(daapListOfSongsInDB);
				if (result == null) result = caseCompoundCmd(daapListOfSongsInDB);
				if (result == null) result = caseDaapCmd(daapListOfSongsInDB);
				if (result == null) result = caseCmd(daapListOfSongsInDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_REQUEST_PLAYLISTS: {
				DaapRequestPlaylists daapRequestPlaylists = (DaapRequestPlaylists)theEObject;
				T result = caseDaapRequestPlaylists(daapRequestPlaylists);
				if (result == null) result = caseDaapCmdChunk(daapRequestPlaylists);
				if (result == null) result = caseDaapCmd(daapRequestPlaylists);
				if (result == null) result = caseCmd(daapRequestPlaylists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_LIST_OF_PLAYLISTS_IN_DB: {
				DaapListOfPlaylistsInDB daapListOfPlaylistsInDB = (DaapListOfPlaylistsInDB)theEObject;
				T result = caseDaapListOfPlaylistsInDB(daapListOfPlaylistsInDB);
				if (result == null) result = caseDaapListCmd(daapListOfPlaylistsInDB);
				if (result == null) result = caseCompoundCmd(daapListOfPlaylistsInDB);
				if (result == null) result = caseDaapCmd(daapListOfPlaylistsInDB);
				if (result == null) result = caseCmd(daapListOfPlaylistsInDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_REQUEST_PLAYLIST: {
				DaapRequestPlaylist daapRequestPlaylist = (DaapRequestPlaylist)theEObject;
				T result = caseDaapRequestPlaylist(daapRequestPlaylist);
				if (result == null) result = caseDaapCmdChunk(daapRequestPlaylist);
				if (result == null) result = caseDaapCmd(daapRequestPlaylist);
				if (result == null) result = caseCmd(daapRequestPlaylist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_LIST_OF_SONGS_IN_PLAYLIST: {
				DaapListOfSongsInPlaylist daapListOfSongsInPlaylist = (DaapListOfSongsInPlaylist)theEObject;
				T result = caseDaapListOfSongsInPlaylist(daapListOfSongsInPlaylist);
				if (result == null) result = caseDaapListCmd(daapListOfSongsInPlaylist);
				if (result == null) result = caseCompoundCmd(daapListOfSongsInPlaylist);
				if (result == null) result = caseDaapCmd(daapListOfSongsInPlaylist);
				if (result == null) result = caseCmd(daapListOfSongsInPlaylist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_REQUEST_MEDIA_STREAM: {
				DaapRequestMediaStream daapRequestMediaStream = (DaapRequestMediaStream)theEObject;
				T result = caseDaapRequestMediaStream(daapRequestMediaStream);
				if (result == null) result = caseDaapCmdChunk(daapRequestMediaStream);
				if (result == null) result = caseDaapCmd(daapRequestMediaStream);
				if (result == null) result = caseCmd(daapRequestMediaStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_STREAM_RESPONSE: {
				DaapStreamResponse daapStreamResponse = (DaapStreamResponse)theEObject;
				T result = caseDaapStreamResponse(daapStreamResponse);
				if (result == null) result = caseDaapCmdChunk(daapStreamResponse);
				if (result == null) result = caseDaapCmdResponse(daapStreamResponse);
				if (result == null) result = caseDaapCmd(daapStreamResponse);
				if (result == null) result = caseCmd(daapStreamResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_QUERY_CMD: {
				DaapQueryCmd daapQueryCmd = (DaapQueryCmd)theEObject;
				T result = caseDaapQueryCmd(daapQueryCmd);
				if (result == null) result = caseDaapCmdChunk(daapQueryCmd);
				if (result == null) result = caseDaapCmd(daapQueryCmd);
				if (result == null) result = caseCmd(daapQueryCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_MSRV_CMD: {
				DaapMsrvCmd daapMsrvCmd = (DaapMsrvCmd)theEObject;
				T result = caseDaapMsrvCmd(daapMsrvCmd);
				if (result == null) result = caseDaapQueryCmd(daapMsrvCmd);
				if (result == null) result = caseDaapCmdChunk(daapMsrvCmd);
				if (result == null) result = caseDaapCmd(daapMsrvCmd);
				if (result == null) result = caseCmd(daapMsrvCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_MCCR: {
				DaapMccr daapMccr = (DaapMccr)theEObject;
				T result = caseDaapMccr(daapMccr);
				if (result == null) result = caseDaapQueryCmd(daapMccr);
				if (result == null) result = caseDaapCmdChunk(daapMccr);
				if (result == null) result = caseDaapCmd(daapMccr);
				if (result == null) result = caseCmd(daapMccr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_MLOG: {
				DaapMlog daapMlog = (DaapMlog)theEObject;
				T result = caseDaapMlog(daapMlog);
				if (result == null) result = caseDaapQueryCmd(daapMlog);
				if (result == null) result = caseDaapCmdChunk(daapMlog);
				if (result == null) result = caseDaapCmd(daapMlog);
				if (result == null) result = caseCmd(daapMlog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_MUPD: {
				DaapMupd daapMupd = (DaapMupd)theEObject;
				T result = caseDaapMupd(daapMupd);
				if (result == null) result = caseDaapQueryCmd(daapMupd);
				if (result == null) result = caseDaapCmdChunk(daapMupd);
				if (result == null) result = caseDaapCmd(daapMupd);
				if (result == null) result = caseCmd(daapMupd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_AVDB: {
				DaapAvdb daapAvdb = (DaapAvdb)theEObject;
				T result = caseDaapAvdb(daapAvdb);
				if (result == null) result = caseDaapQueryCmd(daapAvdb);
				if (result == null) result = caseDaapCmdChunk(daapAvdb);
				if (result == null) result = caseDaapCmd(daapAvdb);
				if (result == null) result = caseCmd(daapAvdb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_APSO_RET: {
				DaapApsoRet daapApsoRet = (DaapApsoRet)theEObject;
				T result = caseDaapApsoRet(daapApsoRet);
				if (result == null) result = caseDaapQueryCmd(daapApsoRet);
				if (result == null) result = caseDaapCmdChunk(daapApsoRet);
				if (result == null) result = caseDaapCmd(daapApsoRet);
				if (result == null) result = caseCmd(daapApsoRet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_APLY: {
				DaapAply daapAply = (DaapAply)theEObject;
				T result = caseDaapAply(daapAply);
				if (result == null) result = caseDaapQueryCmd(daapAply);
				if (result == null) result = caseDaapCmdChunk(daapAply);
				if (result == null) result = caseDaapCmd(daapAply);
				if (result == null) result = caseCmd(daapAply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_CMD: {
				DaapCmd daapCmd = (DaapCmd)theEObject;
				T result = caseDaapCmd(daapCmd);
				if (result == null) result = caseCmd(daapCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_UPDATE_RESPONSE: {
				DaapUpdateResponse daapUpdateResponse = (DaapUpdateResponse)theEObject;
				T result = caseDaapUpdateResponse(daapUpdateResponse);
				if (result == null) result = caseDaapCmdChunk(daapUpdateResponse);
				if (result == null) result = caseDaapCmdResponse(daapUpdateResponse);
				if (result == null) result = caseDaapCmd(daapUpdateResponse);
				if (result == null) result = caseCmd(daapUpdateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.CHUNK: {
				Chunk chunk = (Chunk)theEObject;
				T result = caseChunk(chunk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_CMD_RESPONSE: {
				DaapCmdResponse daapCmdResponse = (DaapCmdResponse)theEObject;
				T result = caseDaapCmdResponse(daapCmdResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_CONTENT_CODES_REQUEST: {
				DaapContentCodesRequest daapContentCodesRequest = (DaapContentCodesRequest)theEObject;
				T result = caseDaapContentCodesRequest(daapContentCodesRequest);
				if (result == null) result = caseDaapCmdChunk(daapContentCodesRequest);
				if (result == null) result = caseDaapCmd(daapContentCodesRequest);
				if (result == null) result = caseCmd(daapContentCodesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_DICTIONNARY_ENTRY: {
				DaapDictionnaryEntry daapDictionnaryEntry = (DaapDictionnaryEntry)theEObject;
				T result = caseDaapDictionnaryEntry(daapDictionnaryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_DB_RECORDS: {
				DaapDBRecords daapDBRecords = (DaapDBRecords)theEObject;
				T result = caseDaapDBRecords(daapDBRecords);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.DAAP_LOGOUT: {
				DaapLogout daapLogout = (DaapLogout)theEObject;
				T result = caseDaapLogout(daapLogout);
				if (result == null) result = caseDaapCmdChunk(daapLogout);
				if (result == null) result = caseDaapCmd(daapLogout);
				if (result == null) result = caseCmd(daapLogout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdxxpPackage.HTTP_PROPERTY: {
				HttpProperty httpProperty = (HttpProperty)theEObject;
				T result = caseHttpProperty(httpProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Cmd Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Cmd Chunk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapCmdChunk(DaapCmdChunk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap List Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap List Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapListCmd(DaapListCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Server Info Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Server Info Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapServerInfoRequest(DaapServerInfoRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Server Info Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Server Info Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapServerInfoResponse(DaapServerInfoResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Request For Content Codes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Request For Content Codes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapRequestForContentCodes(DaapRequestForContentCodes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Content Codes Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Content Codes Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapContentCodesResponse(DaapContentCodesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Login</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Login</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapLogin(DaapLogin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Login Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Login Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapLoginResponse(DaapLoginResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Update Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Update Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapUpdateRequest(DaapUpdateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Database Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Database Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapDatabaseRequest(DaapDatabaseRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Databse Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Databse Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapDatabseResponse(DaapDatabseResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Request Songs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Request Songs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapRequestSongs(DaapRequestSongs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap List Of Songs In DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap List Of Songs In DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapListOfSongsInDB(DaapListOfSongsInDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Request Playlists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Request Playlists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapRequestPlaylists(DaapRequestPlaylists object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap List Of Playlists In DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap List Of Playlists In DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapListOfPlaylistsInDB(DaapListOfPlaylistsInDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Request Playlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Request Playlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapRequestPlaylist(DaapRequestPlaylist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap List Of Songs In Playlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap List Of Songs In Playlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapListOfSongsInPlaylist(DaapListOfSongsInPlaylist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Request Media Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Request Media Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapRequestMediaStream(DaapRequestMediaStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Stream Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Stream Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapStreamResponse(DaapStreamResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Query Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Query Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapQueryCmd(DaapQueryCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Msrv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Msrv Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapMsrvCmd(DaapMsrvCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Mccr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Mccr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapMccr(DaapMccr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Mlog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Mlog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapMlog(DaapMlog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Mupd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Mupd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapMupd(DaapMupd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Avdb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Avdb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapAvdb(DaapAvdb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Apso Ret</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Apso Ret</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapApsoRet(DaapApsoRet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Aply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Aply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapAply(DaapAply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapCmd(DaapCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Update Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Update Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapUpdateResponse(DaapUpdateResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunk(Chunk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Cmd Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Cmd Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapCmdResponse(DaapCmdResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Content Codes Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Content Codes Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapContentCodesRequest(DaapContentCodesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Dictionnary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Dictionnary Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapDictionnaryEntry(DaapDictionnaryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap DB Records</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap DB Records</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapDBRecords(DaapDBRecords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daap Logout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daap Logout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaapLogout(DaapLogout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpProperty(HttpProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundCmd(CompoundCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //EzdxxpSwitch
