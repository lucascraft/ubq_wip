/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Login Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapLoginResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapLoginResponse#getSessionID <em>Session ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapLoginResponse()
 * @model
 * @generated
 */
public interface DaapLoginResponse extends DaapCmdChunk, DaapCmdResponse {

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
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapLoginResponse_Status()
	 * @model
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapLoginResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

	/**
	 * Returns the value of the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session ID</em>' attribute.
	 * @see #setSessionID(int)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapLoginResponse_SessionID()
	 * @model
	 * @generated
	 */
	int getSessionID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapLoginResponse#getSessionID <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session ID</em>' attribute.
	 * @see #getSessionID()
	 * @generated
	 */
	void setSessionID(int value);
} // DaapLoginResponse
