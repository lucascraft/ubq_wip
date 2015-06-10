/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.DaapDictionnaryEntry;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Dictionnary Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDictionnaryEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDictionnaryEntryImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDictionnaryEntryImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapDictionnaryEntryImpl extends MinimalEObjectImpl.Container implements DaapDictionnaryEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapDictionnaryEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_DICTIONNARY_ENTRY;
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
		return (String)eGet(EzdxxpPackage.Literals.DAAP_DICTIONNARY_ENTRY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EzdxxpPackage.Literals.DAAP_DICTIONNARY_ENTRY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return (String)eGet(EzdxxpPackage.Literals.DAAP_DICTIONNARY_ENTRY__NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		eSet(EzdxxpPackage.Literals.DAAP_DICTIONNARY_ENTRY__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(EzdxxpPackage.Literals.DAAP_DICTIONNARY_ENTRY__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(EzdxxpPackage.Literals.DAAP_DICTIONNARY_ENTRY__TYPE, newType);
	}

} //DaapDictionnaryEntryImpl
