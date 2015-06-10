/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getAccelXYZ <em>Accel XYZ</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getAccelPRY <em>Accel PRY</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getWiiButtons <em>Wii Buttons</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getNunchukButtons <em>Nunchuk Buttons</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getMotionVelocity <em>Motion Velocity</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getMotionAngles <em>Motion Angles</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getAngles <em>Angles</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getIr <em>Ir</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getNunchukAccelPRY <em>Nunchuk Accel PRY</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getIrXYSpeed <em>Ir XY Speed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getNunchukAccelXYZ <em>Nunchuk Accel XYZ</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getNunchukJoystickXY <em>Nunchuk Joystick XY</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl#getWiiid <em>Wiiid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiimoteLiveSettingsImpl extends MinimalEObjectImpl.Container implements WiimoteLiveSettings {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiimoteLiveSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAccelXYZCmd getAccelXYZ() {
		return (WiiAccelXYZCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__ACCEL_XYZ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccelXYZ(WiiAccelXYZCmd newAccelXYZ) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__ACCEL_XYZ, newAccelXYZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAccelPryCmd getAccelPRY() {
		return (WiiAccelPryCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__ACCEL_PRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccelPRY(WiiAccelPryCmd newAccelPRY) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__ACCEL_PRY, newAccelPRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WiiButtonCmd> getWiiButtons() {
		return (EList<WiiButtonCmd>)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__WII_BUTTONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WiiNunchukButtonCmd> getNunchukButtons() {
		return (EList<WiiNunchukButtonCmd>)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__NUNCHUK_BUTTONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiMotionVeloCmd getMotionVelocity() {
		return (WiiMotionVeloCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__MOTION_VELOCITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotionVelocity(WiiMotionVeloCmd newMotionVelocity) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__MOTION_VELOCITY, newMotionVelocity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiMotionAnglesCmd getMotionAngles() {
		return (WiiMotionAnglesCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__MOTION_ANGLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotionAngles(WiiMotionAnglesCmd newMotionAngles) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__MOTION_ANGLES, newMotionAngles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAnglesCmd getAngles() {
		return (WiiAnglesCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__ANGLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngles(WiiAnglesCmd newAngles) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__ANGLES, newAngles);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiIrCmd getIr() {
		return (WiiIrCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__IR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIr(WiiIrCmd newIr) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__IR, newIr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukAccelPryCmd getNunchukAccelPRY() {
		return (WiiNunchukAccelPryCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_PRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNunchukAccelPRY(WiiNunchukAccelPryCmd newNunchukAccelPRY) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_PRY, newNunchukAccelPRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiIrXYSpeedCmd getIrXYSpeed() {
		return (WiiIrXYSpeedCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__IR_XY_SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIrXYSpeed(WiiIrXYSpeedCmd newIrXYSpeed) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__IR_XY_SPEED, newIrXYSpeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukAccelXyzCmd getNunchukAccelXYZ() {
		return (WiiNunchukAccelXyzCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_XYZ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNunchukAccelXYZ(WiiNunchukAccelXyzCmd newNunchukAccelXYZ) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_XYZ, newNunchukAccelXYZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukJoyCmd getNunchukJoystickXY() {
		return (WiiNunchukJoyCmd)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__NUNCHUK_JOYSTICK_XY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNunchukJoystickXY(WiiNunchukJoyCmd newNunchukJoystickXY) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__NUNCHUK_JOYSTICK_XY, newNunchukJoystickXY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWiiid() {
		return (String)eGet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__WIIID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWiiid(String newWiiid) {
		eSet(WiimotePackage.Literals.WIIMOTE_LIVE_SETTINGS__WIIID, newWiiid);
	}

} //WiimoteLiveSettingsImpl
