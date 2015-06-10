/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Motion Angles Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionAnglesCmdImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionAnglesCmdImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionAnglesCmdImpl#getYaw <em>Yaw</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiMotionAnglesCmdImpl extends WiimoteCmdImpl implements WiiMotionAnglesCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiMotionAnglesCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotePackage.Literals.WII_MOTION_ANGLES_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPitch() {
		return (Float)eGet(WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__PITCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(float newPitch) {
		eSet(WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__PITCH, newPitch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRoll() {
		return (Float)eGet(WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__ROLL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(float newRoll) {
		eSet(WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__ROLL, newRoll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYaw() {
		return (Float)eGet(WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__YAW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw(float newYaw) {
		eSet(WiimotePackage.Literals.WII_MOTION_ANGLES_CMD__YAW, newYaw);
	}

} //WiiMotionAnglesCmdImpl
