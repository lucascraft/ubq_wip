/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Database Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest#getSessionID <em>Session ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabaseRequest()
 * @model
 * @generated
 */
public interface DaapDatabaseRequest extends DaapCmdChunk {

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
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabaseRequest_SessionID()
	 * @model
	 * @generated
	 */
	int getSessionID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest#getSessionID <em>Session ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session ID</em>' attribute.
	 * @see #getSessionID()
	 * @generated
	 */
	void setSessionID(int value);

	/**
	 * Returns the value of the '<em><b>Revision ID</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision ID</em>' attribute.
	 * @see #setRevisionID(int)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapDatabaseRequest_RevisionID()
	 * @model default="1"
	 * @generated
	 */
	int getRevisionID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest#getRevisionID <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision ID</em>' attribute.
	 * @see #getRevisionID()
	 * @generated
	 */
	void setRevisionID(int value);
} // DaapDatabaseRequest
