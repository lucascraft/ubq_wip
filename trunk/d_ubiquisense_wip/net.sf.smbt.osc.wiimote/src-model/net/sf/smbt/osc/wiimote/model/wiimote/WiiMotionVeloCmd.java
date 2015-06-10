/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Motion Velo Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getPitch_velocity <em>Pitch velocity</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getRoll_velocity <em>Roll velocity</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getYaw_velocity <em>Yaw velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiMotionVeloCmd()
 * @model
 * @generated
 */
public interface WiiMotionVeloCmd extends WiimoteCmd {
	/**
	 * Returns the value of the '<em><b>Pitch velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch velocity</em>' attribute.
	 * @see #setPitch_velocity(float)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiMotionVeloCmd_Pitch_velocity()
	 * @model
	 * @generated
	 */
	float getPitch_velocity();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getPitch_velocity <em>Pitch velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch velocity</em>' attribute.
	 * @see #getPitch_velocity()
	 * @generated
	 */
	void setPitch_velocity(float value);

	/**
	 * Returns the value of the '<em><b>Roll velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll velocity</em>' attribute.
	 * @see #setRoll_velocity(float)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiMotionVeloCmd_Roll_velocity()
	 * @model
	 * @generated
	 */
	float getRoll_velocity();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getRoll_velocity <em>Roll velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll velocity</em>' attribute.
	 * @see #getRoll_velocity()
	 * @generated
	 */
	void setRoll_velocity(float value);

	/**
	 * Returns the value of the '<em><b>Yaw velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yaw velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw velocity</em>' attribute.
	 * @see #setYaw_velocity(float)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiMotionVeloCmd_Yaw_velocity()
	 * @model
	 * @generated
	 */
	float getYaw_velocity();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getYaw_velocity <em>Yaw velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaw velocity</em>' attribute.
	 * @see #getYaw_velocity()
	 * @generated
	 */
	void setYaw_velocity(float value);

} // WiiMotionVeloCmd
