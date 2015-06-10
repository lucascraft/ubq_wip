/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.impl;

import net.sf.smbt.ezdaap.EZDaapAlbum;
import net.sf.smbt.ezdaap.EZDaapArtist;
import net.sf.smbt.ezdaap.EZDaapDictionary;
import net.sf.smbt.ezdaap.EZDaapElem;
import net.sf.smbt.ezdaap.EZDaapITunesInstance;
import net.sf.smbt.ezdaap.EZDaapIntelPropertyElem;
import net.sf.smbt.ezdaap.EZDaapLibrary;
import net.sf.smbt.ezdaap.EZDaapLibraryUnit;
import net.sf.smbt.ezdaap.EZDaapManager;
import net.sf.smbt.ezdaap.EZDaapPlayList;
import net.sf.smbt.ezdaap.EZDaapSong;
import net.sf.smbt.ezdaap.EzdaapFactory;
import net.sf.smbt.ezdaap.EzdaapPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzdaapPackageImpl extends EPackageImpl implements EzdaapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapITunesInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapDictionaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapSongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapArtistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapAlbumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapLibraryUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapPlayListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezDaapIntelPropertyElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daaP_COMM_CSTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daaP_CONNECTION_KINDEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.ezdaap.EzdaapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzdaapPackageImpl() {
		super(eNS_URI, EzdaapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzdaapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzdaapPackage init() {
		if (isInited) return (EzdaapPackage)EPackage.Registry.INSTANCE.getEPackage(EzdaapPackage.eNS_URI);

		// Obtain or create and register package
		EzdaapPackageImpl theEzdaapPackage = (EzdaapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzdaapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzdaapPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEzdaapPackage.createPackageContents();

		// Initialize created meta-data
		theEzdaapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzdaapPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzdaapPackage.eNS_URI, theEzdaapPackage);
		return theEzdaapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapITunesInstance() {
		return ezDaapITunesInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZDaapITunesInstance_Id() {
		return (EAttribute)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapITunesInstance_Libraries() {
		return (EReference)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapITunesInstance_Palylists() {
		return (EReference)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapITunesInstance_Songs() {
		return (EReference)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapITunesInstance_Albums() {
		return (EReference)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapITunesInstance_Artists() {
		return (EReference)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZDaapITunesInstance_RevID() {
		return (EAttribute)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZDaapITunesInstance_SessionID() {
		return (EAttribute)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZDaapITunesInstance_ServerName() {
		return (EAttribute)ezDaapITunesInstanceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapDictionary() {
		return ezDaapDictionaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapManager() {
		return ezDaapManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapManager_ITunes() {
		return (EReference)ezDaapManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapSong() {
		return ezDaapSongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapArtist() {
		return ezDaapArtistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapAlbum() {
		return ezDaapAlbumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapAlbum_Songs() {
		return (EReference)ezDaapAlbumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapLibraryUnit() {
		return ezDaapLibraryUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZDaapLibraryUnit_Name() {
		return (EAttribute)ezDaapLibraryUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapPlayList() {
		return ezDaapPlayListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapPlayList_Songs() {
		return (EReference)ezDaapPlayListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapLibrary() {
		return ezDaapLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapLibrary_Elements() {
		return (EReference)ezDaapLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapElem() {
		return ezDaapElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZDaapIntelPropertyElem() {
		return ezDaapIntelPropertyElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZDaapIntelPropertyElem_Artists() {
		return (EReference)ezDaapIntelPropertyElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZDaapIntelPropertyElem_License() {
		return (EAttribute)ezDaapIntelPropertyElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDAAP_COMM_CST() {
		return daaP_COMM_CSTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDAAP_CONNECTION_KIND() {
		return daaP_CONNECTION_KINDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdaapFactory getEzdaapFactory() {
		return (EzdaapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ezDaapITunesInstanceEClass = createEClass(EZ_DAAP_ITUNES_INSTANCE);
		createEAttribute(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__ID);
		createEReference(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__LIBRARIES);
		createEReference(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__PALYLISTS);
		createEReference(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__SONGS);
		createEReference(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__ALBUMS);
		createEReference(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__ARTISTS);
		createEAttribute(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__REV_ID);
		createEAttribute(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__SESSION_ID);
		createEAttribute(ezDaapITunesInstanceEClass, EZ_DAAP_ITUNES_INSTANCE__SERVER_NAME);

		ezDaapDictionaryEClass = createEClass(EZ_DAAP_DICTIONARY);

		ezDaapManagerEClass = createEClass(EZ_DAAP_MANAGER);
		createEReference(ezDaapManagerEClass, EZ_DAAP_MANAGER__ITUNES);

		ezDaapSongEClass = createEClass(EZ_DAAP_SONG);

		ezDaapArtistEClass = createEClass(EZ_DAAP_ARTIST);

		ezDaapAlbumEClass = createEClass(EZ_DAAP_ALBUM);
		createEReference(ezDaapAlbumEClass, EZ_DAAP_ALBUM__SONGS);

		ezDaapLibraryUnitEClass = createEClass(EZ_DAAP_LIBRARY_UNIT);
		createEAttribute(ezDaapLibraryUnitEClass, EZ_DAAP_LIBRARY_UNIT__NAME);

		ezDaapPlayListEClass = createEClass(EZ_DAAP_PLAY_LIST);
		createEReference(ezDaapPlayListEClass, EZ_DAAP_PLAY_LIST__SONGS);

		ezDaapLibraryEClass = createEClass(EZ_DAAP_LIBRARY);
		createEReference(ezDaapLibraryEClass, EZ_DAAP_LIBRARY__ELEMENTS);

		ezDaapElemEClass = createEClass(EZ_DAAP_ELEM);

		ezDaapIntelPropertyElemEClass = createEClass(EZ_DAAP_INTEL_PROPERTY_ELEM);
		createEReference(ezDaapIntelPropertyElemEClass, EZ_DAAP_INTEL_PROPERTY_ELEM__ARTISTS);
		createEAttribute(ezDaapIntelPropertyElemEClass, EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE);

		// Create enums
		daaP_COMM_CSTEEnum = createEEnum(DAAP_COMM_CST);
		daaP_CONNECTION_KINDEEnum = createEEnum(DAAP_CONNECTION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ezDaapSongEClass.getESuperTypes().add(this.getEZDaapElem());
		ezDaapSongEClass.getESuperTypes().add(this.getEZDaapIntelPropertyElem());
		ezDaapAlbumEClass.getESuperTypes().add(this.getEZDaapIntelPropertyElem());
		ezDaapAlbumEClass.getESuperTypes().add(this.getEZDaapElem());
		ezDaapPlayListEClass.getESuperTypes().add(this.getEZDaapElem());
		ezDaapLibraryEClass.getESuperTypes().add(this.getEZDaapLibraryUnit());
		ezDaapElemEClass.getESuperTypes().add(this.getEZDaapLibraryUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(ezDaapITunesInstanceEClass, EZDaapITunesInstance.class, "EZDaapITunesInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZDaapITunesInstance_Id(), ecorePackage.getEString(), "id", null, 0, 1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZDaapITunesInstance_Libraries(), this.getEZDaapLibrary(), null, "libraries", null, 0, -1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZDaapITunesInstance_Palylists(), this.getEZDaapPlayList(), null, "palylists", null, 0, -1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZDaapITunesInstance_Songs(), this.getEZDaapSong(), null, "songs", null, 0, -1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZDaapITunesInstance_Albums(), this.getEZDaapAlbum(), null, "Albums", null, 0, -1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZDaapITunesInstance_Artists(), this.getEZDaapArtist(), null, "artists", null, 0, -1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZDaapITunesInstance_RevID(), ecorePackage.getEInt(), "revID", null, 0, 1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZDaapITunesInstance_SessionID(), ecorePackage.getEInt(), "sessionID", null, 0, 1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZDaapITunesInstance_ServerName(), ecorePackage.getEString(), "serverName", null, 0, 1, EZDaapITunesInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezDaapDictionaryEClass, EZDaapDictionary.class, "EZDaapDictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ezDaapManagerEClass, EZDaapManager.class, "EZDaapManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZDaapManager_ITunes(), this.getEZDaapITunesInstance(), null, "iTunes", null, 0, -1, EZDaapManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezDaapSongEClass, EZDaapSong.class, "EZDaapSong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ezDaapArtistEClass, EZDaapArtist.class, "EZDaapArtist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ezDaapAlbumEClass, EZDaapAlbum.class, "EZDaapAlbum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZDaapAlbum_Songs(), this.getEZDaapSong(), null, "songs", null, 0, -1, EZDaapAlbum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezDaapLibraryUnitEClass, EZDaapLibraryUnit.class, "EZDaapLibraryUnit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZDaapLibraryUnit_Name(), ecorePackage.getEString(), "name", null, 0, 1, EZDaapLibraryUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezDaapPlayListEClass, EZDaapPlayList.class, "EZDaapPlayList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZDaapPlayList_Songs(), this.getEZDaapSong(), null, "songs", null, 0, -1, EZDaapPlayList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezDaapLibraryEClass, EZDaapLibrary.class, "EZDaapLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZDaapLibrary_Elements(), this.getEZDaapLibraryUnit(), null, "elements", null, 0, -1, EZDaapLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezDaapElemEClass, EZDaapElem.class, "EZDaapElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ezDaapIntelPropertyElemEClass, EZDaapIntelPropertyElem.class, "EZDaapIntelPropertyElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZDaapIntelPropertyElem_Artists(), this.getEZDaapArtist(), null, "artists", null, 0, -1, EZDaapIntelPropertyElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZDaapIntelPropertyElem_License(), ecorePackage.getEString(), "license", null, 0, 1, EZDaapIntelPropertyElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(daaP_COMM_CSTEEnum, net.sf.smbt.ezdaap.DAAP_COMM_CST.class, "DAAP_COMM_CST");
		addEEnumLiteral(daaP_COMM_CSTEEnum, net.sf.smbt.ezdaap.DAAP_COMM_CST.MAX_SIMULTATNEOUS_CONNECTIONS);
		addEEnumLiteral(daaP_COMM_CSTEEnum, net.sf.smbt.ezdaap.DAAP_COMM_CST.MAX_USER_CONNECTIONS_PER_SESSION);
		addEEnumLiteral(daaP_COMM_CSTEEnum, net.sf.smbt.ezdaap.DAAP_COMM_CST.MAX_USER_SIMULTANEOUS_CONNECTION);

		initEEnum(daaP_CONNECTION_KINDEEnum, net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND.class, "DAAP_CONNECTION_KIND");
		addEEnumLiteral(daaP_CONNECTION_KINDEEnum, net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND.USER);
		addEEnumLiteral(daaP_CONNECTION_KINDEEnum, net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND.DB);

		// Create resource
		createResource(eNS_URI);
	}

} //EzdaapPackageImpl
