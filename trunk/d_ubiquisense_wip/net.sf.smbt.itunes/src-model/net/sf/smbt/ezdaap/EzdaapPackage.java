/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezdaap.EzdaapFactory
 * @model kind="package"
 * @generated
 */
public interface EzdaapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezdaap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/itunes/ezdaap/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezdaap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzdaapPackage eINSTANCE = net.sf.smbt.ezdaap.impl.EzdaapPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl <em>EZ Daap ITunes Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapITunesInstance()
	 * @generated
	 */
	int EZ_DAAP_ITUNES_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__LIBRARIES = 1;

	/**
	 * The feature id for the '<em><b>Palylists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__PALYLISTS = 2;

	/**
	 * The feature id for the '<em><b>Songs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__SONGS = 3;

	/**
	 * The feature id for the '<em><b>Albums</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__ALBUMS = 4;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__ARTISTS = 5;

	/**
	 * The feature id for the '<em><b>Rev ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__REV_ID = 6;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__SESSION_ID = 7;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE__SERVER_NAME = 8;

	/**
	 * The number of structural features of the '<em>EZ Daap ITunes Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ITUNES_INSTANCE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapDictionaryImpl <em>EZ Daap Dictionary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapDictionaryImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapDictionary()
	 * @generated
	 */
	int EZ_DAAP_DICTIONARY = 1;

	/**
	 * The number of structural features of the '<em>EZ Daap Dictionary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_DICTIONARY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapManagerImpl <em>EZ Daap Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapManagerImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapManager()
	 * @generated
	 */
	int EZ_DAAP_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>ITunes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_MANAGER__ITUNES = 0;

	/**
	 * The number of structural features of the '<em>EZ Daap Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.EZDaapLibraryUnit <em>EZ Daap Library Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.EZDaapLibraryUnit
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapLibraryUnit()
	 * @generated
	 */
	int EZ_DAAP_LIBRARY_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_LIBRARY_UNIT__NAME = 0;

	/**
	 * The number of structural features of the '<em>EZ Daap Library Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_LIBRARY_UNIT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapElemImpl <em>EZ Daap Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapElemImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapElem()
	 * @generated
	 */
	int EZ_DAAP_ELEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ELEM__NAME = EZ_DAAP_LIBRARY_UNIT__NAME;

	/**
	 * The number of structural features of the '<em>EZ Daap Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ELEM_FEATURE_COUNT = EZ_DAAP_LIBRARY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapSongImpl <em>EZ Daap Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapSongImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapSong()
	 * @generated
	 */
	int EZ_DAAP_SONG = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_SONG__NAME = EZ_DAAP_ELEM__NAME;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_SONG__ARTISTS = EZ_DAAP_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_SONG__LICENSE = EZ_DAAP_ELEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EZ Daap Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_SONG_FEATURE_COUNT = EZ_DAAP_ELEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapArtistImpl <em>EZ Daap Artist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapArtistImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapArtist()
	 * @generated
	 */
	int EZ_DAAP_ARTIST = 4;

	/**
	 * The number of structural features of the '<em>EZ Daap Artist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ARTIST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapIntelPropertyElemImpl <em>EZ Daap Intel Property Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapIntelPropertyElemImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapIntelPropertyElem()
	 * @generated
	 */
	int EZ_DAAP_INTEL_PROPERTY_ELEM = 10;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_INTEL_PROPERTY_ELEM__ARTISTS = 0;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE = 1;

	/**
	 * The number of structural features of the '<em>EZ Daap Intel Property Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_INTEL_PROPERTY_ELEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapAlbumImpl <em>EZ Daap Album</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapAlbumImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapAlbum()
	 * @generated
	 */
	int EZ_DAAP_ALBUM = 5;

	/**
	 * The feature id for the '<em><b>Artists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ALBUM__ARTISTS = EZ_DAAP_INTEL_PROPERTY_ELEM__ARTISTS;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ALBUM__LICENSE = EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ALBUM__NAME = EZ_DAAP_INTEL_PROPERTY_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Songs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ALBUM__SONGS = EZ_DAAP_INTEL_PROPERTY_ELEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EZ Daap Album</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_ALBUM_FEATURE_COUNT = EZ_DAAP_INTEL_PROPERTY_ELEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapPlayListImpl <em>EZ Daap Play List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapPlayListImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapPlayList()
	 * @generated
	 */
	int EZ_DAAP_PLAY_LIST = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_PLAY_LIST__NAME = EZ_DAAP_ELEM__NAME;

	/**
	 * The feature id for the '<em><b>Songs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_PLAY_LIST__SONGS = EZ_DAAP_ELEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EZ Daap Play List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_PLAY_LIST_FEATURE_COUNT = EZ_DAAP_ELEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.impl.EZDaapLibraryImpl <em>EZ Daap Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.impl.EZDaapLibraryImpl
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapLibrary()
	 * @generated
	 */
	int EZ_DAAP_LIBRARY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_LIBRARY__NAME = EZ_DAAP_LIBRARY_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_LIBRARY__ELEMENTS = EZ_DAAP_LIBRARY_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EZ Daap Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_DAAP_LIBRARY_FEATURE_COUNT = EZ_DAAP_LIBRARY_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.DAAP_COMM_CST <em>DAAP COMM CST</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.DAAP_COMM_CST
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getDAAP_COMM_CST()
	 * @generated
	 */
	int DAAP_COMM_CST = 11;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND <em>DAAP CONNECTION KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND
	 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getDAAP_CONNECTION_KIND()
	 * @generated
	 */
	int DAAP_CONNECTION_KIND = 12;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance <em>EZ Daap ITunes Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap ITunes Instance</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance
	 * @generated
	 */
	EClass getEZDaapITunesInstance();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getId()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EAttribute getEZDaapITunesInstance_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Libraries</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getLibraries()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EReference getEZDaapITunesInstance_Libraries();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getPalylists <em>Palylists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Palylists</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getPalylists()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EReference getEZDaapITunesInstance_Palylists();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getSongs <em>Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Songs</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getSongs()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EReference getEZDaapITunesInstance_Songs();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getAlbums <em>Albums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Albums</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getAlbums()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EReference getEZDaapITunesInstance_Albums();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artists</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getArtists()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EReference getEZDaapITunesInstance_Artists();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getRevID <em>Rev ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rev ID</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getRevID()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EAttribute getEZDaapITunesInstance_RevID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getSessionID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session ID</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getSessionID()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EAttribute getEZDaapITunesInstance_SessionID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdaap.EZDaapITunesInstance#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapITunesInstance#getServerName()
	 * @see #getEZDaapITunesInstance()
	 * @generated
	 */
	EAttribute getEZDaapITunesInstance_ServerName();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapDictionary <em>EZ Daap Dictionary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Dictionary</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapDictionary
	 * @generated
	 */
	EClass getEZDaapDictionary();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapManager <em>EZ Daap Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Manager</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapManager
	 * @generated
	 */
	EClass getEZDaapManager();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdaap.EZDaapManager#getITunes <em>ITunes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ITunes</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapManager#getITunes()
	 * @see #getEZDaapManager()
	 * @generated
	 */
	EReference getEZDaapManager_ITunes();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapSong <em>EZ Daap Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Song</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapSong
	 * @generated
	 */
	EClass getEZDaapSong();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapArtist <em>EZ Daap Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Artist</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapArtist
	 * @generated
	 */
	EClass getEZDaapArtist();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapAlbum <em>EZ Daap Album</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Album</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapAlbum
	 * @generated
	 */
	EClass getEZDaapAlbum();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezdaap.EZDaapAlbum#getSongs <em>Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Songs</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapAlbum#getSongs()
	 * @see #getEZDaapAlbum()
	 * @generated
	 */
	EReference getEZDaapAlbum_Songs();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapLibraryUnit <em>EZ Daap Library Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Library Unit</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapLibraryUnit
	 * @generated
	 */
	EClass getEZDaapLibraryUnit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdaap.EZDaapLibraryUnit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapLibraryUnit#getName()
	 * @see #getEZDaapLibraryUnit()
	 * @generated
	 */
	EAttribute getEZDaapLibraryUnit_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapPlayList <em>EZ Daap Play List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Play List</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapPlayList
	 * @generated
	 */
	EClass getEZDaapPlayList();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezdaap.EZDaapPlayList#getSongs <em>Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Songs</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapPlayList#getSongs()
	 * @see #getEZDaapPlayList()
	 * @generated
	 */
	EReference getEZDaapPlayList_Songs();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapLibrary <em>EZ Daap Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Library</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapLibrary
	 * @generated
	 */
	EClass getEZDaapLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdaap.EZDaapLibrary#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapLibrary#getElements()
	 * @see #getEZDaapLibrary()
	 * @generated
	 */
	EReference getEZDaapLibrary_Elements();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapElem <em>EZ Daap Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Elem</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapElem
	 * @generated
	 */
	EClass getEZDaapElem();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem <em>EZ Daap Intel Property Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Daap Intel Property Elem</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapIntelPropertyElem
	 * @generated
	 */
	EClass getEZDaapIntelPropertyElem();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem#getArtists <em>Artists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Artists</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapIntelPropertyElem#getArtists()
	 * @see #getEZDaapIntelPropertyElem()
	 * @generated
	 */
	EReference getEZDaapIntelPropertyElem_Artists();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see net.sf.smbt.ezdaap.EZDaapIntelPropertyElem#getLicense()
	 * @see #getEZDaapIntelPropertyElem()
	 * @generated
	 */
	EAttribute getEZDaapIntelPropertyElem_License();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezdaap.DAAP_COMM_CST <em>DAAP COMM CST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAAP COMM CST</em>'.
	 * @see net.sf.smbt.ezdaap.DAAP_COMM_CST
	 * @generated
	 */
	EEnum getDAAP_COMM_CST();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND <em>DAAP CONNECTION KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAAP CONNECTION KIND</em>'.
	 * @see net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND
	 * @generated
	 */
	EEnum getDAAP_CONNECTION_KIND();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzdaapFactory getEzdaapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl <em>EZ Daap ITunes Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapITunesInstanceImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapITunesInstance()
		 * @generated
		 */
		EClass EZ_DAAP_ITUNES_INSTANCE = eINSTANCE.getEZDaapITunesInstance();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_DAAP_ITUNES_INSTANCE__ID = eINSTANCE.getEZDaapITunesInstance_Id();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_ITUNES_INSTANCE__LIBRARIES = eINSTANCE.getEZDaapITunesInstance_Libraries();

		/**
		 * The meta object literal for the '<em><b>Palylists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_ITUNES_INSTANCE__PALYLISTS = eINSTANCE.getEZDaapITunesInstance_Palylists();

		/**
		 * The meta object literal for the '<em><b>Songs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_ITUNES_INSTANCE__SONGS = eINSTANCE.getEZDaapITunesInstance_Songs();

		/**
		 * The meta object literal for the '<em><b>Albums</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_ITUNES_INSTANCE__ALBUMS = eINSTANCE.getEZDaapITunesInstance_Albums();

		/**
		 * The meta object literal for the '<em><b>Artists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_ITUNES_INSTANCE__ARTISTS = eINSTANCE.getEZDaapITunesInstance_Artists();

		/**
		 * The meta object literal for the '<em><b>Rev ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_DAAP_ITUNES_INSTANCE__REV_ID = eINSTANCE.getEZDaapITunesInstance_RevID();

		/**
		 * The meta object literal for the '<em><b>Session ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_DAAP_ITUNES_INSTANCE__SESSION_ID = eINSTANCE.getEZDaapITunesInstance_SessionID();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_DAAP_ITUNES_INSTANCE__SERVER_NAME = eINSTANCE.getEZDaapITunesInstance_ServerName();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapDictionaryImpl <em>EZ Daap Dictionary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapDictionaryImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapDictionary()
		 * @generated
		 */
		EClass EZ_DAAP_DICTIONARY = eINSTANCE.getEZDaapDictionary();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapManagerImpl <em>EZ Daap Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapManagerImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapManager()
		 * @generated
		 */
		EClass EZ_DAAP_MANAGER = eINSTANCE.getEZDaapManager();

		/**
		 * The meta object literal for the '<em><b>ITunes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_MANAGER__ITUNES = eINSTANCE.getEZDaapManager_ITunes();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapSongImpl <em>EZ Daap Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapSongImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapSong()
		 * @generated
		 */
		EClass EZ_DAAP_SONG = eINSTANCE.getEZDaapSong();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapArtistImpl <em>EZ Daap Artist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapArtistImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapArtist()
		 * @generated
		 */
		EClass EZ_DAAP_ARTIST = eINSTANCE.getEZDaapArtist();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapAlbumImpl <em>EZ Daap Album</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapAlbumImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapAlbum()
		 * @generated
		 */
		EClass EZ_DAAP_ALBUM = eINSTANCE.getEZDaapAlbum();

		/**
		 * The meta object literal for the '<em><b>Songs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_ALBUM__SONGS = eINSTANCE.getEZDaapAlbum_Songs();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.EZDaapLibraryUnit <em>EZ Daap Library Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.EZDaapLibraryUnit
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapLibraryUnit()
		 * @generated
		 */
		EClass EZ_DAAP_LIBRARY_UNIT = eINSTANCE.getEZDaapLibraryUnit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_DAAP_LIBRARY_UNIT__NAME = eINSTANCE.getEZDaapLibraryUnit_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapPlayListImpl <em>EZ Daap Play List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapPlayListImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapPlayList()
		 * @generated
		 */
		EClass EZ_DAAP_PLAY_LIST = eINSTANCE.getEZDaapPlayList();

		/**
		 * The meta object literal for the '<em><b>Songs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_PLAY_LIST__SONGS = eINSTANCE.getEZDaapPlayList_Songs();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapLibraryImpl <em>EZ Daap Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapLibraryImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapLibrary()
		 * @generated
		 */
		EClass EZ_DAAP_LIBRARY = eINSTANCE.getEZDaapLibrary();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_LIBRARY__ELEMENTS = eINSTANCE.getEZDaapLibrary_Elements();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapElemImpl <em>EZ Daap Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapElemImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapElem()
		 * @generated
		 */
		EClass EZ_DAAP_ELEM = eINSTANCE.getEZDaapElem();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.impl.EZDaapIntelPropertyElemImpl <em>EZ Daap Intel Property Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.impl.EZDaapIntelPropertyElemImpl
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getEZDaapIntelPropertyElem()
		 * @generated
		 */
		EClass EZ_DAAP_INTEL_PROPERTY_ELEM = eINSTANCE.getEZDaapIntelPropertyElem();

		/**
		 * The meta object literal for the '<em><b>Artists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_DAAP_INTEL_PROPERTY_ELEM__ARTISTS = eINSTANCE.getEZDaapIntelPropertyElem_Artists();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE = eINSTANCE.getEZDaapIntelPropertyElem_License();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.DAAP_COMM_CST <em>DAAP COMM CST</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.DAAP_COMM_CST
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getDAAP_COMM_CST()
		 * @generated
		 */
		EEnum DAAP_COMM_CST = eINSTANCE.getDAAP_COMM_CST();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND <em>DAAP CONNECTION KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND
		 * @see net.sf.smbt.ezdaap.impl.EzdaapPackageImpl#getDAAP_CONNECTION_KIND()
		 * @generated
		 */
		EEnum DAAP_CONNECTION_KIND = eINSTANCE.getDAAP_CONNECTION_KIND();

	}

} //EzdaapPackage
