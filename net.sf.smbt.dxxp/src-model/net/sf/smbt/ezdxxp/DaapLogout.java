/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Logout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapLogout#getSessionID <em>Session ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapLogout()
 * @model
 * @generated
 */
public interface DaapLogout extends DaapCmdChunk {

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
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapLogout_SessionID()
	 * @model
	 * @generated
	 */
	int getSessionID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapLogout#getSessionID <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session ID</em>' attribute.
	 * @see #getSessionID()
	 * @generated
	 */
	void setSessionID(int value);
} // DaapLogout
