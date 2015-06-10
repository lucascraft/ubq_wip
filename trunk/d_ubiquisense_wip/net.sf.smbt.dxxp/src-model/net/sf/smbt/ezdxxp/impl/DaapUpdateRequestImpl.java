/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.DaapUpdateRequest;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Update Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapUpdateRequestImpl#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapUpdateRequestImpl#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapUpdateRequestImpl extends DaapCmdChunkImpl implements DaapUpdateRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapUpdateRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_UPDATE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSessionID() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_UPDATE_REQUEST__SESSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionID(int newSessionID) {
		eSet(EzdxxpPackage.Literals.DAAP_UPDATE_REQUEST__SESSION_ID, newSessionID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevisionID() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_UPDATE_REQUEST__REVISION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionID(int newRevisionID) {
		eSet(EzdxxpPackage.Literals.DAAP_UPDATE_REQUEST__REVISION_ID, newRevisionID);
	}

} //DaapUpdateRequestImpl
