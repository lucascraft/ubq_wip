/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DaapCmdResponse;
import net.sf.smbt.ezdxxp.DaapDBRecords;
import net.sf.smbt.ezdxxp.DaapDatabseResponse;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Databse Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl#getMatchingRecords <em>Matching Records</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl#getRecordsReturned <em>Records Returned</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapDatabseResponseImpl extends DaapCmdChunkImpl implements DaapDatabseResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapDatabseResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE;
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
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(int newStatus) {
		eSet(EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatchingRecords() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE__MATCHING_RECORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingRecords(int newMatchingRecords) {
		eSet(EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE__MATCHING_RECORDS, newMatchingRecords);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecordsReturned() {
		return (Integer)eGet(EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE__RECORDS_RETURNED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordsReturned(int newRecordsReturned) {
		eSet(EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE__RECORDS_RETURNED, newRecordsReturned);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DaapDBRecords> getRecords() {
		return (EList<DaapDBRecords>)eGet(EzdxxpPackage.Literals.DAAP_DATABSE_RESPONSE__RECORDS, true);
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
				case EzdxxpPackage.DAAP_DATABSE_RESPONSE__CHUNKS: return EzdxxpPackage.DAAP_CMD_RESPONSE__CHUNKS;
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
				case EzdxxpPackage.DAAP_CMD_RESPONSE__CHUNKS: return EzdxxpPackage.DAAP_DATABSE_RESPONSE__CHUNKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DaapDatabseResponseImpl
