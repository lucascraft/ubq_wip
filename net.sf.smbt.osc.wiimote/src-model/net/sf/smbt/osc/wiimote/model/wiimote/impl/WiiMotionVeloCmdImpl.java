/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Motion Velo Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionVeloCmdImpl#getPitch_velocity <em>Pitch velocity</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionVeloCmdImpl#getRoll_velocity <em>Roll velocity</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionVeloCmdImpl#getYaw_velocity <em>Yaw velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiMotionVeloCmdImpl extends WiimoteCmdImpl implements WiiMotionVeloCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiMotionVeloCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotePackage.Literals.WII_MOTION_VELO_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPitch_velocity() {
		return (Float)eGet(WiimotePackage.Literals.WII_MOTION_VELO_CMD__PITCH_VELOCITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch_velocity(float newPitch_velocity) {
		eSet(WiimotePackage.Literals.WII_MOTION_VELO_CMD__PITCH_VELOCITY, newPitch_velocity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRoll_velocity() {
		return (Float)eGet(WiimotePackage.Literals.WII_MOTION_VELO_CMD__ROLL_VELOCITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll_velocity(float newRoll_velocity) {
		eSet(WiimotePackage.Literals.WII_MOTION_VELO_CMD__ROLL_VELOCITY, newRoll_velocity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYaw_velocity() {
		return (Float)eGet(WiimotePackage.Literals.WII_MOTION_VELO_CMD__YAW_VELOCITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw_velocity(float newYaw_velocity) {
		eSet(WiimotePackage.Literals.WII_MOTION_VELO_CMD__YAW_VELOCITY, newYaw_velocity);
	}

} //WiiMotionVeloCmdImpl
