/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.impl;

import net.sf.smbt.ezdaap.DAAP_COMM_CST;
import net.sf.smbt.ezdaap.DAAP_CONNECTION_KIND;
import net.sf.smbt.ezdaap.EZDaapAlbum;
import net.sf.smbt.ezdaap.EZDaapArtist;
import net.sf.smbt.ezdaap.EZDaapDictionary;
import net.sf.smbt.ezdaap.EZDaapElem;
import net.sf.smbt.ezdaap.EZDaapITunesInstance;
import net.sf.smbt.ezdaap.EZDaapIntelPropertyElem;
import net.sf.smbt.ezdaap.EZDaapLibrary;
import net.sf.smbt.ezdaap.EZDaapManager;
import net.sf.smbt.ezdaap.EZDaapPlayList;
import net.sf.smbt.ezdaap.EZDaapSong;
import net.sf.smbt.ezdaap.EzdaapFactory;
import net.sf.smbt.ezdaap.EzdaapPackage;

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
public class EzdaapFactoryImpl extends EFactoryImpl implements EzdaapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzdaapFactory init() {
		try {
			EzdaapFactory theEzdaapFactory = (EzdaapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/itunes/ezdaap/1.0.0"); 
			if (theEzdaapFactory != null) {
				return theEzdaapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzdaapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdaapFactoryImpl() {
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
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE: return createEZDaapITunesInstance();
			case EzdaapPackage.EZ_DAAP_DICTIONARY: return createEZDaapDictionary();
			case EzdaapPackage.EZ_DAAP_MANAGER: return createEZDaapManager();
			case EzdaapPackage.EZ_DAAP_SONG: return createEZDaapSong();
			case EzdaapPackage.EZ_DAAP_ARTIST: return createEZDaapArtist();
			case EzdaapPackage.EZ_DAAP_ALBUM: return createEZDaapAlbum();
			case EzdaapPackage.EZ_DAAP_PLAY_LIST: return createEZDaapPlayList();
			case EzdaapPackage.EZ_DAAP_LIBRARY: return createEZDaapLibrary();
			case EzdaapPackage.EZ_DAAP_ELEM: return createEZDaapElem();
			case EzdaapPackage.EZ_DAAP_INTEL_PROPERTY_ELEM: return createEZDaapIntelPropertyElem();
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
			case EzdaapPackage.DAAP_COMM_CST:
				return createDAAP_COMM_CSTFromString(eDataType, initialValue);
			case EzdaapPackage.DAAP_CONNECTION_KIND:
				return createDAAP_CONNECTION_KINDFromString(eDataType, initialValue);
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
			case EzdaapPackage.DAAP_COMM_CST:
				return convertDAAP_COMM_CSTToString(eDataType, instanceValue);
			case EzdaapPackage.DAAP_CONNECTION_KIND:
				return convertDAAP_CONNECTION_KINDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapITunesInstance createEZDaapITunesInstance() {
		EZDaapITunesInstanceImpl ezDaapITunesInstance = new EZDaapITunesInstanceImpl();
		return ezDaapITunesInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapDictionary createEZDaapDictionary() {
		EZDaapDictionaryImpl ezDaapDictionary = new EZDaapDictionaryImpl();
		return ezDaapDictionary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapManager createEZDaapManager() {
		EZDaapManagerImpl ezDaapManager = new EZDaapManagerImpl();
		return ezDaapManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapSong createEZDaapSong() {
		EZDaapSongImpl ezDaapSong = new EZDaapSongImpl();
		return ezDaapSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapArtist createEZDaapArtist() {
		EZDaapArtistImpl ezDaapArtist = new EZDaapArtistImpl();
		return ezDaapArtist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapAlbum createEZDaapAlbum() {
		EZDaapAlbumImpl ezDaapAlbum = new EZDaapAlbumImpl();
		return ezDaapAlbum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapPlayList createEZDaapPlayList() {
		EZDaapPlayListImpl ezDaapPlayList = new EZDaapPlayListImpl();
		return ezDaapPlayList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapLibrary createEZDaapLibrary() {
		EZDaapLibraryImpl ezDaapLibrary = new EZDaapLibraryImpl();
		return ezDaapLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapElem createEZDaapElem() {
		EZDaapElemImpl ezDaapElem = new EZDaapElemImpl();
		return ezDaapElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZDaapIntelPropertyElem createEZDaapIntelPropertyElem() {
		EZDaapIntelPropertyElemImpl ezDaapIntelPropertyElem = new EZDaapIntelPropertyElemImpl();
		return ezDaapIntelPropertyElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAAP_COMM_CST createDAAP_COMM_CSTFromString(EDataType eDataType, String initialValue) {
		DAAP_COMM_CST result = DAAP_COMM_CST.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAAP_COMM_CSTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAAP_CONNECTION_KIND createDAAP_CONNECTION_KINDFromString(EDataType eDataType, String initialValue) {
		DAAP_CONNECTION_KIND result = DAAP_CONNECTION_KIND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAAP_CONNECTION_KINDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdaapPackage getEzdaapPackage() {
		return (EzdaapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzdaapPackage getPackage() {
		return EzdaapPackage.eINSTANCE;
	}

} //EzdaapFactoryImpl
