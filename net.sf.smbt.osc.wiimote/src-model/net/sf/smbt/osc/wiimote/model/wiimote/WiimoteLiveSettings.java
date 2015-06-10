/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelXYZ <em>Accel XYZ</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelPRY <em>Accel PRY</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getWiiButtons <em>Wii Buttons</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukButtons <em>Nunchuk Buttons</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionVelocity <em>Motion Velocity</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionAngles <em>Motion Angles</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAngles <em>Angles</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIr <em>Ir</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelPRY <em>Nunchuk Accel PRY</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIrXYSpeed <em>Ir XY Speed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelXYZ <em>Nunchuk Accel XYZ</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukJoystickXY <em>Nunchuk Joystick XY</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getWiiid <em>Wiiid</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings()
 * @model
 * @generated
 */
public interface WiimoteLiveSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Accel XYZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accel XYZ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accel XYZ</em>' reference.
	 * @see #setAccelXYZ(WiiAccelXYZCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_AccelXYZ()
	 * @model
	 * @generated
	 */
	WiiAccelXYZCmd getAccelXYZ();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelXYZ <em>Accel XYZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accel XYZ</em>' reference.
	 * @see #getAccelXYZ()
	 * @generated
	 */
	void setAccelXYZ(WiiAccelXYZCmd value);

	/**
	 * Returns the value of the '<em><b>Accel PRY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accel PRY</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accel PRY</em>' reference.
	 * @see #setAccelPRY(WiiAccelPryCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_AccelPRY()
	 * @model
	 * @generated
	 */
	WiiAccelPryCmd getAccelPRY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelPRY <em>Accel PRY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accel PRY</em>' reference.
	 * @see #getAccelPRY()
	 * @generated
	 */
	void setAccelPRY(WiiAccelPryCmd value);

	/**
	 * Returns the value of the '<em><b>Wii Buttons</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wii Buttons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wii Buttons</em>' reference list.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_WiiButtons()
	 * @model
	 * @generated
	 */
	EList<WiiButtonCmd> getWiiButtons();

	/**
	 * Returns the value of the '<em><b>Nunchuk Buttons</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nunchuk Buttons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nunchuk Buttons</em>' reference list.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_NunchukButtons()
	 * @model
	 * @generated
	 */
	EList<WiiNunchukButtonCmd> getNunchukButtons();

	/**
	 * Returns the value of the '<em><b>Motion Velocity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion Velocity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion Velocity</em>' reference.
	 * @see #setMotionVelocity(WiiMotionVeloCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_MotionVelocity()
	 * @model
	 * @generated
	 */
	WiiMotionVeloCmd getMotionVelocity();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionVelocity <em>Motion Velocity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion Velocity</em>' reference.
	 * @see #getMotionVelocity()
	 * @generated
	 */
	void setMotionVelocity(WiiMotionVeloCmd value);

	/**
	 * Returns the value of the '<em><b>Motion Angles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion Angles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion Angles</em>' reference.
	 * @see #setMotionAngles(WiiMotionAnglesCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_MotionAngles()
	 * @model
	 * @generated
	 */
	WiiMotionAnglesCmd getMotionAngles();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionAngles <em>Motion Angles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion Angles</em>' reference.
	 * @see #getMotionAngles()
	 * @generated
	 */
	void setMotionAngles(WiiMotionAnglesCmd value);

	/**
	 * Returns the value of the '<em><b>Angles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angles</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angles</em>' reference.
	 * @see #setAngles(WiiAnglesCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_Angles()
	 * @model
	 * @generated
	 */
	WiiAnglesCmd getAngles();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAngles <em>Angles</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angles</em>' reference.
	 * @see #getAngles()
	 * @generated
	 */
	void setAngles(WiiAnglesCmd value);

	/**
	 * Returns the value of the '<em><b>Ir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ir</em>' reference.
	 * @see #setIr(WiiIrCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_Ir()
	 * @model
	 * @generated
	 */
	WiiIrCmd getIr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIr <em>Ir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ir</em>' reference.
	 * @see #getIr()
	 * @generated
	 */
	void setIr(WiiIrCmd value);

	/**
	 * Returns the value of the '<em><b>Nunchuk Accel PRY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nunchuk Accel PRY</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nunchuk Accel PRY</em>' reference.
	 * @see #setNunchukAccelPRY(WiiNunchukAccelPryCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_NunchukAccelPRY()
	 * @model
	 * @generated
	 */
	WiiNunchukAccelPryCmd getNunchukAccelPRY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelPRY <em>Nunchuk Accel PRY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nunchuk Accel PRY</em>' reference.
	 * @see #getNunchukAccelPRY()
	 * @generated
	 */
	void setNunchukAccelPRY(WiiNunchukAccelPryCmd value);

	/**
	 * Returns the value of the '<em><b>Ir XY Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ir XY Speed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ir XY Speed</em>' reference.
	 * @see #setIrXYSpeed(WiiIrXYSpeedCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_IrXYSpeed()
	 * @model
	 * @generated
	 */
	WiiIrXYSpeedCmd getIrXYSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIrXYSpeed <em>Ir XY Speed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ir XY Speed</em>' reference.
	 * @see #getIrXYSpeed()
	 * @generated
	 */
	void setIrXYSpeed(WiiIrXYSpeedCmd value);

	/**
	 * Returns the value of the '<em><b>Nunchuk Accel XYZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nunchuk Accel XYZ</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nunchuk Accel XYZ</em>' reference.
	 * @see #setNunchukAccelXYZ(WiiNunchukAccelXyzCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_NunchukAccelXYZ()
	 * @model
	 * @generated
	 */
	WiiNunchukAccelXyzCmd getNunchukAccelXYZ();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelXYZ <em>Nunchuk Accel XYZ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nunchuk Accel XYZ</em>' reference.
	 * @see #getNunchukAccelXYZ()
	 * @generated
	 */
	void setNunchukAccelXYZ(WiiNunchukAccelXyzCmd value);

	/**
	 * Returns the value of the '<em><b>Nunchuk Joystick XY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nunchuk Joystick XY</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nunchuk Joystick XY</em>' reference.
	 * @see #setNunchukJoystickXY(WiiNunchukJoyCmd)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_NunchukJoystickXY()
	 * @model
	 * @generated
	 */
	WiiNunchukJoyCmd getNunchukJoystickXY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukJoystickXY <em>Nunchuk Joystick XY</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nunchuk Joystick XY</em>' reference.
	 * @see #getNunchukJoystickXY()
	 * @generated
	 */
	void setNunchukJoystickXY(WiiNunchukJoyCmd value);

	/**
	 * Returns the value of the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wiiid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiiid</em>' attribute.
	 * @see #setWiiid(String)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteLiveSettings_Wiiid()
	 * @model
	 * @generated
	 */
	String getWiiid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getWiiid <em>Wiiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiiid</em>' attribute.
	 * @see #getWiiid()
	 * @generated
	 */
	void setWiiid(String value);

} // WiimoteLiveSettings
