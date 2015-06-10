/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Update Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapUpdateResponse#getRevisionID <em>Revision ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapUpdateResponse()
 * @model
 * @generated
 */
public interface DaapUpdateResponse extends DaapCmdChunk, DaapCmdResponse {

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
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapUpdateResponse_RevisionID()
	 * @model default="1"
	 * @generated
	 */
	int getRevisionID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapUpdateResponse#getRevisionID <em>Revision ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision ID</em>' attribute.
	 * @see #getRevisionID()
	 * @generated
	 */
	void setRevisionID(int value);
} // DaapUpdateResponse
