/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.*;
import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DAAP_HTTP_CONST;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzdxxpFactoryImpl extends EFactoryImpl implements EzdxxpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzdxxpFactory init() {
		try {
			EzdxxpFactory theEzdxxpFactory = (EzdxxpFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezdxxp/1.0"); 
			if (theEzdxxpFactory != null) {
				return theEzdxxpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzdxxpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdxxpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzdxxpPackage.DAAP_CMD_CHUNK: return createDaapCmdChunk();
			case EzdxxpPackage.DAAP_LIST_CMD: return createDaapListCmd();
			case EzdxxpPackage.DAAP_SERVER_INFO_REQUEST: return createDaapServerInfoRequest();
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE: return createDaapServerInfoResponse();
			case EzdxxpPackage.DAAP_REQUEST_FOR_CONTENT_CODES: return createDaapRequestForContentCodes();
			case EzdxxpPackage.DAAP_CONTENT_CODES_RESPONSE: return createDaapContentCodesResponse();
			case EzdxxpPackage.DAAP_LOGIN: return createDaapLogin();
			case EzdxxpPackage.DAAP_LOGIN_RESPONSE: return createDaapLoginResponse();
			case EzdxxpPackage.DAAP_UPDATE_REQUEST: return createDaapUpdateRequest();
			case EzdxxpPackage.DAAP_DATABASE_REQUEST: return createDaapDatabaseRequest();
			case EzdxxpPackage.DAAP_DATABSE_RESPONSE: return createDaapDatabseResponse();
			case EzdxxpPackage.DAAP_REQUEST_SONGS: return createDaapRequestSongs();
			case EzdxxpPackage.DAAP_LIST_OF_SONGS_IN_DB: return createDaapListOfSongsInDB();
			case EzdxxpPackage.DAAP_REQUEST_PLAYLISTS: return createDaapRequestPlaylists();
			case EzdxxpPackage.DAAP_LIST_OF_PLAYLISTS_IN_DB: return createDaapListOfPlaylistsInDB();
			case EzdxxpPackage.DAAP_REQUEST_PLAYLIST: return createDaapRequestPlaylist();
			case EzdxxpPackage.DAAP_LIST_OF_SONGS_IN_PLAYLIST: return createDaapListOfSongsInPlaylist();
			case EzdxxpPackage.DAAP_REQUEST_MEDIA_STREAM: return createDaapRequestMediaStream();
			case EzdxxpPackage.DAAP_STREAM_RESPONSE: return createDaapStreamResponse();
			case EzdxxpPackage.DAAP_QUERY_CMD: return createDaapQueryCmd();
			case EzdxxpPackage.DAAP_MSRV_CMD: return createDaapMsrvCmd();
			case EzdxxpPackage.DAAP_MCCR: return createDaapMccr();
			case EzdxxpPackage.DAAP_MLOG: return createDaapMlog();
			case EzdxxpPackage.DAAP_MUPD: return createDaapMupd();
			case EzdxxpPackage.DAAP_AVDB: return createDaapAvdb();
			case EzdxxpPackage.DAAP_APSO_RET: return createDaapApsoRet();
			case EzdxxpPackage.DAAP_APLY: return createDaapAply();
			case EzdxxpPackage.DAAP_CMD: return createDaapCmd();
			case EzdxxpPackage.DAAP_UPDATE_RESPONSE: return createDaapUpdateResponse();
			case EzdxxpPackage.CHUNK: return createChunk();
			case EzdxxpPackage.DAAP_CMD_RESPONSE: return createDaapCmdResponse();
			case EzdxxpPackage.DAAP_CONTENT_CODES_REQUEST: return createDaapContentCodesRequest();
			case EzdxxpPackage.DAAP_DICTIONNARY_ENTRY: return createDaapDictionnaryEntry();
			case EzdxxpPackage.DAAP_DB_RECORDS: return createDaapDBRecords();
			case EzdxxpPackage.DAAP_LOGOUT: return createDaapLogout();
			case EzdxxpPackage.HTTP_PROPERTY: return createHttpProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzdxxpPackage.DAAP_HTTP_CONST:
				return createDAAP_HTTP_CONSTFromString(eDataType, initialValue);
			case EzdxxpPackage.DAAP_REQUEST_TAG:
				return createDaapRequestTagFromString(eDataType, initialValue);
			case EzdxxpPackage.SERVER_INFO_STATUS:
				return createServerInfoStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzdxxpPackage.DAAP_HTTP_CONST:
				return convertDAAP_HTTP_CONSTToString(eDataType, instanceValue);
			case EzdxxpPackage.DAAP_REQUEST_TAG:
				return convertDaapRequestTagToString(eDataType, instanceValue);
			case EzdxxpPackage.SERVER_INFO_STATUS:
				return convertServerInfoStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapCmdChunk createDaapCmdChunk() {
		DaapCmdChunkImpl daapCmdChunk = new DaapCmdChunkImpl();
		return daapCmdChunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapListCmd createDaapListCmd() {
		DaapListCmdImpl daapListCmd = new DaapListCmdImpl();
		return daapListCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapServerInfoRequest createDaapServerInfoRequest() {
		DaapServerInfoRequestImpl daapServerInfoRequest = new DaapServerInfoRequestImpl();
		return daapServerInfoRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapServerInfoResponse createDaapServerInfoResponse() {
		DaapServerInfoResponseImpl daapServerInfoResponse = new DaapServerInfoResponseImpl();
		return daapServerInfoResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapRequestForContentCodes createDaapRequestForContentCodes() {
		DaapRequestForContentCodesImpl daapRequestForContentCodes = new DaapRequestForContentCodesImpl();
		return daapRequestForContentCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapContentCodesResponse createDaapContentCodesResponse() {
		DaapContentCodesResponseImpl daapContentCodesResponse = new DaapContentCodesResponseImpl();
		return daapContentCodesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapLogin createDaapLogin() {
		DaapLoginImpl daapLogin = new DaapLoginImpl();
		return daapLogin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapLoginResponse createDaapLoginResponse() {
		DaapLoginResponseImpl daapLoginResponse = new DaapLoginResponseImpl();
		return daapLoginResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapUpdateRequest createDaapUpdateRequest() {
		DaapUpdateRequestImpl daapUpdateRequest = new DaapUpdateRequestImpl();
		return daapUpdateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapDatabaseRequest createDaapDatabaseRequest() {
		DaapDatabaseRequestImpl daapDatabaseRequest = new DaapDatabaseRequestImpl();
		return daapDatabaseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapDatabseResponse createDaapDatabseResponse() {
		DaapDatabseResponseImpl daapDatabseResponse = new DaapDatabseResponseImpl();
		return daapDatabseResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapRequestSongs createDaapRequestSongs() {
		DaapRequestSongsImpl daapRequestSongs = new DaapRequestSongsImpl();
		return daapRequestSongs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapListOfSongsInDB createDaapListOfSongsInDB() {
		DaapListOfSongsInDBImpl daapListOfSongsInDB = new DaapListOfSongsInDBImpl();
		return daapListOfSongsInDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapRequestPlaylists createDaapRequestPlaylists() {
		DaapRequestPlaylistsImpl daapRequestPlaylists = new DaapRequestPlaylistsImpl();
		return daapRequestPlaylists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapListOfPlaylistsInDB createDaapListOfPlaylistsInDB() {
		DaapListOfPlaylistsInDBImpl daapListOfPlaylistsInDB = new DaapListOfPlaylistsInDBImpl();
		return daapListOfPlaylistsInDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapRequestPlaylist createDaapRequestPlaylist() {
		DaapRequestPlaylistImpl daapRequestPlaylist = new DaapRequestPlaylistImpl();
		return daapRequestPlaylist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapListOfSongsInPlaylist createDaapListOfSongsInPlaylist() {
		DaapListOfSongsInPlaylistImpl daapListOfSongsInPlaylist = new DaapListOfSongsInPlaylistImpl();
		return daapListOfSongsInPlaylist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapRequestMediaStream createDaapRequestMediaStream() {
		DaapRequestMediaStreamImpl daapRequestMediaStream = new DaapRequestMediaStreamImpl();
		return daapRequestMediaStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapStreamResponse createDaapStreamResponse() {
		DaapStreamResponseImpl daapStreamResponse = new DaapStreamResponseImpl();
		return daapStreamResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapQueryCmd createDaapQueryCmd() {
		DaapQueryCmdImpl daapQueryCmd = new DaapQueryCmdImpl();
		return daapQueryCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapMsrvCmd createDaapMsrvCmd() {
		DaapMsrvCmdImpl daapMsrvCmd = new DaapMsrvCmdImpl();
		return daapMsrvCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapMccr createDaapMccr() {
		DaapMccrImpl daapMccr = new DaapMccrImpl();
		return daapMccr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapMlog createDaapMlog() {
		DaapMlogImpl daapMlog = new DaapMlogImpl();
		return daapMlog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapMupd createDaapMupd() {
		DaapMupdImpl daapMupd = new DaapMupdImpl();
		return daapMupd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapAvdb createDaapAvdb() {
		DaapAvdbImpl daapAvdb = new DaapAvdbImpl();
		return daapAvdb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapApsoRet createDaapApsoRet() {
		DaapApsoRetImpl daapApsoRet = new DaapApsoRetImpl();
		return daapApsoRet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapAply createDaapAply() {
		DaapAplyImpl daapAply = new DaapAplyImpl();
		return daapAply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapCmd createDaapCmd() {
		DaapCmdImpl daapCmd = new DaapCmdImpl();
		return daapCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapUpdateResponse createDaapUpdateResponse() {
		DaapUpdateResponseImpl daapUpdateResponse = new DaapUpdateResponseImpl();
		return daapUpdateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chunk createChunk() {
		ChunkImpl chunk = new ChunkImpl();
		return chunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapCmdResponse createDaapCmdResponse() {
		DaapCmdResponseImpl daapCmdResponse = new DaapCmdResponseImpl();
		return daapCmdResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapContentCodesRequest createDaapContentCodesRequest() {
		DaapContentCodesRequestImpl daapContentCodesRequest = new DaapContentCodesRequestImpl();
		return daapContentCodesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapDictionnaryEntry createDaapDictionnaryEntry() {
		DaapDictionnaryEntryImpl daapDictionnaryEntry = new DaapDictionnaryEntryImpl();
		return daapDictionnaryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapDBRecords createDaapDBRecords() {
		DaapDBRecordsImpl daapDBRecords = new DaapDBRecordsImpl();
		return daapDBRecords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapLogout createDaapLogout() {
		DaapLogoutImpl daapLogout = new DaapLogoutImpl();
		return daapLogout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpProperty createHttpProperty() {
		HttpPropertyImpl httpProperty = new HttpPropertyImpl();
		return httpProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAAP_HTTP_CONST createDAAP_HTTP_CONSTFromString(EDataType eDataType, String initialValue) {
		DAAP_HTTP_CONST result = DAAP_HTTP_CONST.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAAP_HTTP_CONSTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaapRequestTag createDaapRequestTagFromString(EDataType eDataType, String initialValue) {
		DaapRequestTag result = DaapRequestTag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDaapRequestTagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInfoStatus createServerInfoStatusFromString(EDataType eDataType, String initialValue) {
		ServerInfoStatus result = ServerInfoStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServerInfoStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdxxpPackage getEzdxxpPackage() {
		return (EzdxxpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzdxxpPackage getPackage() {
		return EzdxxpPackage.eINSTANCE;
	}

} //EzdxxpFactoryImpl
