/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DaapCmdResponse;
import net.sf.smbt.ezdxxp.DaapLoginResponse;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Login Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapLoginResponseImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapLoginResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapLoginResponseImpl#getSessionID <em>Session ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapLoginResponseImpl extends DaapCmdChunkImpl implements DaapLoginResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapLoginResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_LOGIN_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Chunk> getChunks() {
		return (EList<Chunk>)eGet(EzdxxpPackage.Literals.DAAP_CMD_RESPONSE__CHUNKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatus() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_LOGIN_RESPONSE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(int newStatus) {
		eSet(EzdxxpPackage.Literals.DAAP_LOGIN_RESPONSE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSessionID() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_LOGIN_RESPONSE__SESSION_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionID(int newSessionID) {
		eSet(EzdxxpPackage.Literals.DAAP_LOGIN_RESPONSE__SESSION_ID, newSessionID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DaapCmdResponse.class) {
			switch (derivedFeatureID) {
				case EzdxxpPackage.DAAP_LOGIN_RESPONSE__CHUNKS: return EzdxxpPackage.DAAP_CMD_RESPONSE__CHUNKS;
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
		if (baseClass == DaapCmdResponse.class) {
			switch (baseFeatureID) {
				case EzdxxpPackage.DAAP_CMD_RESPONSE__CHUNKS: return EzdxxpPackage.DAAP_LOGIN_RESPONSE__CHUNKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DaapLoginResponseImpl
