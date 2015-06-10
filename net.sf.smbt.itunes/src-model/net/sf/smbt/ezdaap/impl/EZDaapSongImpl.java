/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.impl;

import net.sf.smbt.ezdaap.EZDaapArtist;
import net.sf.smbt.ezdaap.EZDaapIntelPropertyElem;
import net.sf.smbt.ezdaap.EZDaapSong;
import net.sf.smbt.ezdaap.EzdaapPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Daap Song</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapSongImpl#getArtists <em>Artists</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapSongImpl#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZDaapSongImpl extends EZDaapElemImpl implements EZDaapSong {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapSongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdaapPackage.Literals.EZ_DAAP_SONG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZDaapArtist> getArtists() {
		return (EList<EZDaapArtist>)eGet(EzdaapPackage.Literals.EZ_DAAP_INTEL_PROPERTY_ELEM__ARTISTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return (String)eGet(EzdaapPackage.Literals.EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		eSet(EzdaapPackage.Literals.EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE, newLicense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EZDaapIntelPropertyElem.class) {
			switch (derivedFeatureID) {
				case EzdaapPackage.EZ_DAAP_SONG__ARTISTS: return EzdaapPackage.EZ_DAAP_INTEL_PROPERTY_ELEM__ARTISTS;
				case EzdaapPackage.EZ_DAAP_SONG__LICENSE: return EzdaapPackage.EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE;
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
		if (baseClass == EZDaapIntelPropertyElem.class) {
			switch (baseFeatureID) {
				case EzdaapPackage.EZ_DAAP_INTEL_PROPERTY_ELEM__ARTISTS: return EzdaapPackage.EZ_DAAP_SONG__ARTISTS;
				case EzdaapPackage.EZ_DAAP_INTEL_PROPERTY_ELEM__LICENSE: return EzdaapPackage.EZ_DAAP_SONG__LICENSE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EZDaapSongImpl
