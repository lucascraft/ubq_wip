/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage
 * @generated
 */
public class EzdxxpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdxxpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdxxpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzdxxpPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzdxxpSwitch<Adapter> modelSwitch =
		new EzdxxpSwitch<Adapter>() {
			@Override
			public Adapter caseDaapCmdChunk(DaapCmdChunk object) {
				return createDaapCmdChunkAdapter();
			}
			@Override
			public Adapter caseDaapListCmd(DaapListCmd object) {
				return createDaapListCmdAdapter();
			}
			@Override
			public Adapter caseDaapServerInfoRequest(DaapServerInfoRequest object) {
				return createDaapServerInfoRequestAdapter();
			}
			@Override
			public Adapter caseDaapServerInfoResponse(DaapServerInfoResponse object) {
				return createDaapServerInfoResponseAdapter();
			}
			@Override
			public Adapter caseDaapRequestForContentCodes(DaapRequestForContentCodes object) {
				return createDaapRequestForContentCodesAdapter();
			}
			@Override
			public Adapter caseDaapContentCodesResponse(DaapContentCodesResponse object) {
				return createDaapContentCodesResponseAdapter();
			}
			@Override
			public Adapter caseDaapLogin(DaapLogin object) {
				return createDaapLoginAdapter();
			}
			@Override
			public Adapter caseDaapLoginResponse(DaapLoginResponse object) {
				return createDaapLoginResponseAdapter();
			}
			@Override
			public Adapter caseDaapUpdateRequest(DaapUpdateRequest object) {
				return createDaapUpdateRequestAdapter();
			}
			@Override
			public Adapter caseDaapDatabaseRequest(DaapDatabaseRequest object) {
				return createDaapDatabaseRequestAdapter();
			}
			@Override
			public Adapter caseDaapDatabseResponse(DaapDatabseResponse object) {
				return createDaapDatabseResponseAdapter();
			}
			@Override
			public Adapter caseDaapRequestSongs(DaapRequestSongs object) {
				return createDaapRequestSongsAdapter();
			}
			@Override
			public Adapter caseDaapListOfSongsInDB(DaapListOfSongsInDB object) {
				return createDaapListOfSongsInDBAdapter();
			}
			@Override
			public Adapter caseDaapRequestPlaylists(DaapRequestPlaylists object) {
				return createDaapRequestPlaylistsAdapter();
			}
			@Override
			public Adapter caseDaapListOfPlaylistsInDB(DaapListOfPlaylistsInDB object) {
				return createDaapListOfPlaylistsInDBAdapter();
			}
			@Override
			public Adapter caseDaapRequestPlaylist(DaapRequestPlaylist object) {
				return createDaapRequestPlaylistAdapter();
			}
			@Override
			public Adapter caseDaapListOfSongsInPlaylist(DaapListOfSongsInPlaylist object) {
				return createDaapListOfSongsInPlaylistAdapter();
			}
			@Override
			public Adapter caseDaapRequestMediaStream(DaapRequestMediaStream object) {
				return createDaapRequestMediaStreamAdapter();
			}
			@Override
			public Adapter caseDaapStreamResponse(DaapStreamResponse object) {
				return createDaapStreamResponseAdapter();
			}
			@Override
			public Adapter caseDaapQueryCmd(DaapQueryCmd object) {
				return createDaapQueryCmdAdapter();
			}
			@Override
			public Adapter caseDaapMsrvCmd(DaapMsrvCmd object) {
				return createDaapMsrvCmdAdapter();
			}
			@Override
			public Adapter caseDaapMccr(DaapMccr object) {
				return createDaapMccrAdapter();
			}
			@Override
			public Adapter caseDaapMlog(DaapMlog object) {
				return createDaapMlogAdapter();
			}
			@Override
			public Adapter caseDaapMupd(DaapMupd object) {
				return createDaapMupdAdapter();
			}
			@Override
			public Adapter caseDaapAvdb(DaapAvdb object) {
				return createDaapAvdbAdapter();
			}
			@Override
			public Adapter caseDaapApsoRet(DaapApsoRet object) {
				return createDaapApsoRetAdapter();
			}
			@Override
			public Adapter caseDaapAply(DaapAply object) {
				return createDaapAplyAdapter();
			}
			@Override
			public Adapter caseDaapCmd(DaapCmd object) {
				return createDaapCmdAdapter();
			}
			@Override
			public Adapter caseDaapUpdateResponse(DaapUpdateResponse object) {
				return createDaapUpdateResponseAdapter();
			}
			@Override
			public Adapter caseChunk(Chunk object) {
				return createChunkAdapter();
			}
			@Override
			public Adapter caseDaapCmdResponse(DaapCmdResponse object) {
				return createDaapCmdResponseAdapter();
			}
			@Override
			public Adapter caseDaapContentCodesRequest(DaapContentCodesRequest object) {
				return createDaapContentCodesRequestAdapter();
			}
			@Override
			public Adapter caseDaapDictionnaryEntry(DaapDictionnaryEntry object) {
				return createDaapDictionnaryEntryAdapter();
			}
			@Override
			public Adapter caseDaapDBRecords(DaapDBRecords object) {
				return createDaapDBRecordsAdapter();
			}
			@Override
			public Adapter caseDaapLogout(DaapLogout object) {
				return createDaapLogoutAdapter();
			}
			@Override
			public Adapter caseHttpProperty(HttpProperty object) {
				return createHttpPropertyAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseCompoundCmd(CompoundCmd object) {
				return createCompoundCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapCmdChunk <em>Daap Cmd Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapCmdChunk
	 * @generated
	 */
	public Adapter createDaapCmdChunkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapListCmd <em>Daap List Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapListCmd
	 * @generated
	 */
	public Adapter createDaapListCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapServerInfoRequest <em>Daap Server Info Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoRequest
	 * @generated
	 */
	public Adapter createDaapServerInfoRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse <em>Daap Server Info Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse
	 * @generated
	 */
	public Adapter createDaapServerInfoResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapRequestForContentCodes <em>Daap Request For Content Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapRequestForContentCodes
	 * @generated
	 */
	public Adapter createDaapRequestForContentCodesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapContentCodesResponse <em>Daap Content Codes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapContentCodesResponse
	 * @generated
	 */
	public Adapter createDaapContentCodesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapLogin <em>Daap Login</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapLogin
	 * @generated
	 */
	public Adapter createDaapLoginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapLoginResponse <em>Daap Login Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapLoginResponse
	 * @generated
	 */
	public Adapter createDaapLoginResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapUpdateRequest <em>Daap Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapUpdateRequest
	 * @generated
	 */
	public Adapter createDaapUpdateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest <em>Daap Database Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapDatabaseRequest
	 * @generated
	 */
	public Adapter createDaapDatabaseRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse <em>Daap Databse Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapDatabseResponse
	 * @generated
	 */
	public Adapter createDaapDatabseResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapRequestSongs <em>Daap Request Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapRequestSongs
	 * @generated
	 */
	public Adapter createDaapRequestSongsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapListOfSongsInDB <em>Daap List Of Songs In DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapListOfSongsInDB
	 * @generated
	 */
	public Adapter createDaapListOfSongsInDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapRequestPlaylists <em>Daap Request Playlists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapRequestPlaylists
	 * @generated
	 */
	public Adapter createDaapRequestPlaylistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapListOfPlaylistsInDB <em>Daap List Of Playlists In DB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapListOfPlaylistsInDB
	 * @generated
	 */
	public Adapter createDaapListOfPlaylistsInDBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapRequestPlaylist <em>Daap Request Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapRequestPlaylist
	 * @generated
	 */
	public Adapter createDaapRequestPlaylistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapListOfSongsInPlaylist <em>Daap List Of Songs In Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapListOfSongsInPlaylist
	 * @generated
	 */
	public Adapter createDaapListOfSongsInPlaylistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapRequestMediaStream <em>Daap Request Media Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapRequestMediaStream
	 * @generated
	 */
	public Adapter createDaapRequestMediaStreamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapStreamResponse <em>Daap Stream Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapStreamResponse
	 * @generated
	 */
	public Adapter createDaapStreamResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapQueryCmd <em>Daap Query Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapQueryCmd
	 * @generated
	 */
	public Adapter createDaapQueryCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapMsrvCmd <em>Daap Msrv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapMsrvCmd
	 * @generated
	 */
	public Adapter createDaapMsrvCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapMccr <em>Daap Mccr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapMccr
	 * @generated
	 */
	public Adapter createDaapMccrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapMlog <em>Daap Mlog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapMlog
	 * @generated
	 */
	public Adapter createDaapMlogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapMupd <em>Daap Mupd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapMupd
	 * @generated
	 */
	public Adapter createDaapMupdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapAvdb <em>Daap Avdb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapAvdb
	 * @generated
	 */
	public Adapter createDaapAvdbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapApsoRet <em>Daap Apso Ret</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapApsoRet
	 * @generated
	 */
	public Adapter createDaapApsoRetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapAply <em>Daap Aply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapAply
	 * @generated
	 */
	public Adapter createDaapAplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapCmd <em>Daap Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapCmd
	 * @generated
	 */
	public Adapter createDaapCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapUpdateResponse <em>Daap Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapUpdateResponse
	 * @generated
	 */
	public Adapter createDaapUpdateResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.Chunk
	 * @generated
	 */
	public Adapter createChunkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapCmdResponse <em>Daap Cmd Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapCmdResponse
	 * @generated
	 */
	public Adapter createDaapCmdResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapContentCodesRequest <em>Daap Content Codes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapContentCodesRequest
	 * @generated
	 */
	public Adapter createDaapContentCodesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapDictionnaryEntry <em>Daap Dictionnary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapDictionnaryEntry
	 * @generated
	 */
	public Adapter createDaapDictionnaryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapDBRecords <em>Daap DB Records</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapDBRecords
	 * @generated
	 */
	public Adapter createDaapDBRecordsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.DaapLogout <em>Daap Logout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.DaapLogout
	 * @generated
	 */
	public Adapter createDaapLogoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezdxxp.HttpProperty <em>Http Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezdxxp.HttpProperty
	 * @generated
	 */
	public Adapter createHttpPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.CompoundCmd <em>Compound Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.CompoundCmd
	 * @generated
	 */
	public Adapter createCompoundCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzdxxpAdapterFactory
