/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Nunchuk Accel Pry Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl#getYaw <em>Yaw</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl#getAccel <em>Accel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiNunchukAccelPryCmdImpl extends WiimoteCmdImpl implements WiiNunchukAccelPryCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiNunchukAccelPryCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPitch() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__PITCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(float newPitch) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__PITCH, newPitch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRoll() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__ROLL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(float newRoll) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__ROLL, newRoll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYaw() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__YAW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw(float newYaw) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__YAW, newYaw);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAccel() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__ACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccel(float newAccel) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_PRY_CMD__ACCEL, newAccel);
	}

} //WiiNunchukAccelPryCmdImpl
