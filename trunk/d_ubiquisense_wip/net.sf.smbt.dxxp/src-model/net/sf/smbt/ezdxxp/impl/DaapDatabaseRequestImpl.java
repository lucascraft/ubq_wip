/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.DaapDatabaseRequest;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Database Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDatabaseRequestImpl#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDatabaseRequestImpl#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapDatabaseRequestImpl extends DaapCmdChunkImpl implements DaapDatabaseRequest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapDatabaseRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_DATABASE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSessionID() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_DATABASE_REQUEST__SESSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionID(int newSessionID) {
		eSet(EzdxxpPackage.Literals.DAAP_DATABASE_REQUEST__SESSION_ID, newSessionID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRevisionID() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_DATABASE_REQUEST__REVISION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionID(int newRevisionID) {
		eSet(EzdxxpPackage.Literals.DAAP_DATABASE_REQUEST__REVISION_ID, newRevisionID);
	}

} //DaapDatabaseRequestImpl
