/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertilice Instant Status Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getRpm <em>Rpm</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getVolts <em>Volts</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getAmps <em>Amps</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceInstantStatusCmd()
 * @model
 * @generated
 */
public interface VertiliceInstantStatusCmd extends VertiliceCmd {
	/**
	 * Returns the value of the '<em><b>Rpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rpm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpm</em>' attribute.
	 * @see #setRpm(int)
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceInstantStatusCmd_Rpm()
	 * @model
	 * @generated
	 */
	int getRpm();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getRpm <em>Rpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpm</em>' attribute.
	 * @see #getRpm()
	 * @generated
	 */
	void setRpm(int value);

	/**
	 * Returns the value of the '<em><b>Volts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volts</em>' attribute.
	 * @see #setVolts(float)
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceInstantStatusCmd_Volts()
	 * @model
	 * @generated
	 */
	float getVolts();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getVolts <em>Volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volts</em>' attribute.
	 * @see #getVolts()
	 * @generated
	 */
	void setVolts(float value);

	/**
	 * Returns the value of the '<em><b>Amps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amps</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amps</em>' attribute.
	 * @see #setAmps(float)
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceInstantStatusCmd_Amps()
	 * @model
	 * @generated
	 */
	float getAmps();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getAmps <em>Amps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amps</em>' attribute.
	 * @see #getAmps()
	 * @generated
	 */
	void setAmps(float value);

} // VertiliceInstantStatusCmd
