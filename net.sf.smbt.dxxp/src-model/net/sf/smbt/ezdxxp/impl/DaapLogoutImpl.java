/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.DaapLogout;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Logout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapLogoutImpl#getSessionID <em>Session ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapLogoutImpl extends DaapCmdChunkImpl implements DaapLogout {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapLogoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_LOGOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSessionID() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_LOGOUT__SESSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionID(int newSessionID) {
		eSet(EzdxxpPackage.Literals.DAAP_LOGOUT__SESSION_ID, newSessionID);
	}

} //DaapLogoutImpl
