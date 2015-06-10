/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.util;

import java.util.List;

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
import net.sf.smbt.ezdaap.EzdaapPackage;

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
 * @see net.sf.smbt.ezdaap.EzdaapPackage
 * @generated
 */
public class EzdaapSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdaapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdaapSwitch() {
		if (modelPackage == null) {
			modelPackage = EzdaapPackage.eINSTANCE;
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
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE: {
				EZDaapITunesInstance ezDaapITunesInstance = (EZDaapITunesInstance)theEObject;
				T result = caseEZDaapITunesInstance(ezDaapITunesInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_DICTIONARY: {
				EZDaapDictionary ezDaapDictionary = (EZDaapDictionary)theEObject;
				T result = caseEZDaapDictionary(ezDaapDictionary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_MANAGER: {
				EZDaapManager ezDaapManager = (EZDaapManager)theEObject;
				T result = caseEZDaapManager(ezDaapManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_SONG: {
				EZDaapSong ezDaapSong = (EZDaapSong)theEObject;
				T result = caseEZDaapSong(ezDaapSong);
				if (result == null) result = caseEZDaapElem(ezDaapSong);
				if (result == null) result = caseEZDaapIntelPropertyElem(ezDaapSong);
				if (result == null) result = caseEZDaapLibraryUnit(ezDaapSong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_ARTIST: {
				EZDaapArtist ezDaapArtist = (EZDaapArtist)theEObject;
				T result = caseEZDaapArtist(ezDaapArtist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_ALBUM: {
				EZDaapAlbum ezDaapAlbum = (EZDaapAlbum)theEObject;
				T result = caseEZDaapAlbum(ezDaapAlbum);
				if (result == null) result = caseEZDaapIntelPropertyElem(ezDaapAlbum);
				if (result == null) result = caseEZDaapElem(ezDaapAlbum);
				if (result == null) result = caseEZDaapLibraryUnit(ezDaapAlbum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_LIBRARY_UNIT: {
				EZDaapLibraryUnit ezDaapLibraryUnit = (EZDaapLibraryUnit)theEObject;
				T result = caseEZDaapLibraryUnit(ezDaapLibraryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_PLAY_LIST: {
				EZDaapPlayList ezDaapPlayList = (EZDaapPlayList)theEObject;
				T result = caseEZDaapPlayList(ezDaapPlayList);
				if (result == null) result = caseEZDaapElem(ezDaapPlayList);
				if (result == null) result = caseEZDaapLibraryUnit(ezDaapPlayList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_LIBRARY: {
				EZDaapLibrary ezDaapLibrary = (EZDaapLibrary)theEObject;
				T result = caseEZDaapLibrary(ezDaapLibrary);
				if (result == null) result = caseEZDaapLibraryUnit(ezDaapLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_ELEM: {
				EZDaapElem ezDaapElem = (EZDaapElem)theEObject;
				T result = caseEZDaapElem(ezDaapElem);
				if (result == null) result = caseEZDaapLibraryUnit(ezDaapElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdaapPackage.EZ_DAAP_INTEL_PROPERTY_ELEM: {
				EZDaapIntelPropertyElem ezDaapIntelPropertyElem = (EZDaapIntelPropertyElem)theEObject;
				T result = caseEZDaapIntelPropertyElem(ezDaapIntelPropertyElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap ITunes Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap ITunes Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapITunesInstance(EZDaapITunesInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Dictionary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapDictionary(EZDaapDictionary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapManager(EZDaapManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapSong(EZDaapSong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Artist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Artist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapArtist(EZDaapArtist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Album</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Album</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapAlbum(EZDaapAlbum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Library Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Library Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapLibraryUnit(EZDaapLibraryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Play List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Play List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapPlayList(EZDaapPlayList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapLibrary(EZDaapLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapElem(EZDaapElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Daap Intel Property Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Daap Intel Property Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZDaapIntelPropertyElem(EZDaapIntelPropertyElem object) {
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

} //EzdaapSwitch
