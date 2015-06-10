/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Angles Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getPitch <em>Pitch</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getYaw <em>Yaw</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiAnglesCmd()
 * @model
 * @generated
 */
public interface WiiAnglesCmd extends WiimoteCmd {
	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(float)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiAnglesCmd_Pitch()
	 * @model
	 * @generated
	 */
	float getPitch();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(float value);

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #setRoll(float)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiAnglesCmd_Roll()
	 * @model
	 * @generated
	 */
	float getRoll();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(float value);

	/**
	 * Returns the value of the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yaw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw</em>' attribute.
	 * @see #setYaw(float)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiAnglesCmd_Yaw()
	 * @model
	 * @generated
	 */
	float getYaw();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getYaw <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaw</em>' attribute.
	 * @see #getYaw()
	 * @generated
	 */
	void setYaw(float value);

} // WiiAnglesCmd
