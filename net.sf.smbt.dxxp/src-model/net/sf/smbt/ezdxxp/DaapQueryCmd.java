/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Query Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapQueryCmd#getQuery <em>Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapQueryCmd()
 * @model
 * @generated
 */
public interface DaapQueryCmd extends DaapCmdChunk {
	/**
	 * Returns the value of the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query</em>' attribute.
	 * @see #setQuery(String)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapQueryCmd_Query()
	 * @model
	 * @generated
	 */
	String getQuery();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapQueryCmd#getQuery <em>Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query</em>' attribute.
	 * @see #getQuery()
	 * @generated
	 */
	void setQuery(String value);

} // DaapQueryCmd
