/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.impl;

import net.sf.smbt.ezdaap.EZDaapLibrary;
import net.sf.smbt.ezdaap.EZDaapLibraryUnit;
import net.sf.smbt.ezdaap.EzdaapPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Daap Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapLibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezdaap.impl.EZDaapLibraryImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZDaapLibraryImpl extends MinimalEObjectImpl.Container implements EZDaapLibrary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdaapPackage.Literals.EZ_DAAP_LIBRARY;
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
	public EList<EZDaapLibraryUnit> getElements() {
		return (EList<EZDaapLibraryUnit>)eGet(EzdaapPackage.Literals.EZ_DAAP_LIBRARY__ELEMENTS, true);
	}

} //EZDaapLibraryImpl
