/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertilice Failure Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getCode <em>Code</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceFailureCmd()
 * @model
 * @generated
 */
public interface VertiliceFailureCmd extends VertiliceCmd {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceFailureCmd_Code()
	 * @model
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(int)
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceFailureCmd_Severity()
	 * @model
	 * @generated
	 */
	int getSeverity();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(int value);

} // VertiliceFailureCmd
