/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.impl;

import net.sf.smbt.ezdaap.EZDaapAlbum;
import net.sf.smbt.ezdaap.EZDaapArtist;
import net.sf.smbt.ezdaap.EZDaapITunesInstance;
import net.sf.smbt.ezdaap.EZDaapLibrary;
import net.sf.smbt.ezdaap.EZDaapPlayList;
import net.sf.smbt.ezdaap.EZDaapSong;
import net.sf.smbt.ezdaap.EzdaapPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Daap ITunes Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getPalylists <em>Palylists</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getSongs <em>Songs</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getAlbums <em>Albums</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getArtists <em>Artists</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getRevID <em>Rev ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl#getServerName <em>Server Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZDaapITunesInstanceImpl extends MinimalEObjectImpl.Container implements EZDaapITunesInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapITunesInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZDaapLibrary> getLibraries() {
		return (EList<EZDaapLibrary>)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__LIBRARIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZDaapPlayList> getPalylists() {
		return (EList<EZDaapPlayList>)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__PALYLISTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZDaapSong> getSongs() {
		return (EList<EZDaapSong>)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SONGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZDaapAlbum> getAlbums() {
		return (EList<EZDaapAlbum>)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ALBUMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZDaapArtist> getArtists() {
		return (EList<EZDaapArtist>)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ARTISTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevID() {
		return (Integer)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__REV_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevID(int newRevID) {
		eSet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__REV_ID, newRevID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSessionID() {
		return (Integer)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SESSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionID(int newSessionID) {
		eSet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SESSION_ID, newSessionID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerName() {
		return (String)eGet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SERVER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerName(String newServerName) {
		eSet(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SERVER_NAME, newServerName);
	}

} //EZDaapITunesInstanceImpl
