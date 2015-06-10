/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Databse Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getMatchingRecords <em>Matching Records</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getRecordsReturned <em>Records Returned</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getRecords <em>Records</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabseResponse()
 * @model
 * @generated
 */
public interface DaapDatabseResponse extends DaapCmdChunk, DaapCmdResponse {

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabseResponse_Status()
	 * @model
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

	/**
	 * Returns the value of the '<em><b>Matching Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matching Records</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matching Records</em>' attribute.
	 * @see #setMatchingRecords(int)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabseResponse_MatchingRecords()
	 * @model
	 * @generated
	 */
	int getMatchingRecords();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getMatchingRecords <em>Matching Records</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matching Records</em>' attribute.
	 * @see #getMatchingRecords()
	 * @generated
	 */
	void setMatchingRecords(int value);

	/**
	 * Returns the value of the '<em><b>Records Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records Returned</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records Returned</em>' attribute.
	 * @see #setRecordsReturned(int)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabseResponse_RecordsReturned()
	 * @model
	 * @generated
	 */
	int getRecordsReturned();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getRecordsReturned <em>Records Returned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Records Returned</em>' attribute.
	 * @see #getRecordsReturned()
	 * @generated
	 */
	void setRecordsReturned(int value);

	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezdxxp.DaapDBRecords}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Records</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabseResponse_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaapDBRecords> getRecords();
} // DaapDatabseResponse
