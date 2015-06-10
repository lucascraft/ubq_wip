/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.impl;

import net.sf.smbt.ezdaap.EZDaapAlbum;
import net.sf.smbt.ezdaap.EZDaapElem;
import net.sf.smbt.ezdaap.EZDaapLibraryUnit;
import net.sf.smbt.ezdaap.EZDaapSong;
import net.sf.smbt.ezdaap.EzdaapPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Daap Album</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapAlbumImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapAlbumImpl#getSongs <em>Songs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZDaapAlbumImpl extends EZDaapIntelPropertyElemImpl implements EZDaapAlbum {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapAlbumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdaapPackage.Literals.EZ_DAAP_ALBUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EzdaapPackage.Literals.EZ_DAAP_LIBRARY_UNIT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EzdaapPackage.Literals.EZ_DAAP_LIBRARY_UNIT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZDaapSong> getSongs() {
		return (EList<EZDaapSong>)eGet(EzdaapPackage.Literals.EZ_DAAP_ALBUM__SONGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EZDaapLibraryUnit.class) {
			switch (derivedFeatureID) {
				case EzdaapPackage.EZ_DAAP_ALBUM__NAME: return EzdaapPackage.EZ_DAAP_LIBRARY_UNIT__NAME;
				default: return -1;
			}
		}
		if (baseClass == EZDaapElem.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EZDaapLibraryUnit.class) {
			switch (baseFeatureID) {
				case EzdaapPackage.EZ_DAAP_LIBRARY_UNIT__NAME: return EzdaapPackage.EZ_DAAP_ALBUM__NAME;
				default: return -1;
			}
		}
		if (baseClass == EZDaapElem.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EZDaapAlbumImpl
