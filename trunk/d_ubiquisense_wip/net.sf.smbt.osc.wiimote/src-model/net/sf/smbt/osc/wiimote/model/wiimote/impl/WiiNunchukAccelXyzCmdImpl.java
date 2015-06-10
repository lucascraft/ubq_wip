/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Nunchuk Accel Xyz Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelXyzCmdImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelXyzCmdImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelXyzCmdImpl#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiNunchukAccelXyzCmdImpl extends WiimoteCmdImpl implements WiiNunchukAccelXyzCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiNunchukAccelXyzCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__Z, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(float newZ) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_ACCEL_XYZ_CMD__Z, newZ);
	}

} //WiiNunchukAccelXyzCmdImpl
