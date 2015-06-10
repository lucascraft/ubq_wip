/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertilice Battery Status Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getPercent <em>Percent</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getVolts <em>Volts</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getAmps <em>Amps</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getTimeToFull <em>Time To Full</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceBatteryStatusCmd()
 * @model
 * @generated
 */
public interface VertiliceBatteryStatusCmd extends VertiliceCmd {
	/**
	 * Returns the value of the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percent</em>' attribute.
	 * @see #setPercent(float)
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceBatteryStatusCmd_Percent()
	 * @model
	 * @generated
	 */
	float getPercent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getPercent <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percent</em>' attribute.
	 * @see #getPercent()
	 * @generated
	 */
	void setPercent(float value);

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
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceBatteryStatusCmd_Volts()
	 * @model
	 * @generated
	 */
	float getVolts();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getVolts <em>Volts</em>}' attribute.
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
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceBatteryStatusCmd_Amps()
	 * @model
	 * @generated
	 */
	float getAmps();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getAmps <em>Amps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amps</em>' attribute.
	 * @see #getAmps()
	 * @generated
	 */
	void setAmps(float value);

	/**
	 * Returns the value of the '<em><b>Time To Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Full</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Full</em>' attribute.
	 * @see #setTimeToFull(long)
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#getVertiliceBatteryStatusCmd_TimeToFull()
	 * @model
	 * @generated
	 */
	long getTimeToFull();

	/**
	 * Sets the value of the '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getTimeToFull <em>Time To Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Full</em>' attribute.
	 * @see #getTimeToFull()
	 * @generated
	 */
	void setTimeToFull(long value);

} // VertiliceBatteryStatusCmd
