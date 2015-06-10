/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.impl;

import net.sf.smbt.ezdaap.EZDaapArtist;
import net.sf.smbt.ezdaap.EZDaapIntelPropertyElem;
import net.sf.smbt.ezdaap.EzdaapPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Daap Intel Property Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapIntelPropertyElemImpl#getArtists <em>Artists</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapIntelPropertyElemImpl#getLicense <em>License</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZDaapIntelPropertyElemImpl extends MinimalEObjectImpl.Container implements EZDaapIntelPropertyElem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapIntelPropertyElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdaapPackage.Literals.EZ_DAAP_INTEL_PROPERTY_ELEM;
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

} //EZDaapIntelPropertyElemImpl
