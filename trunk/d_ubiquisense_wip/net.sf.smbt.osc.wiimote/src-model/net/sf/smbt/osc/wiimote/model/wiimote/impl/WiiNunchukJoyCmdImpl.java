/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Nunchuk Joy Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukJoyCmdImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukJoyCmdImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiNunchukJoyCmdImpl extends WiimoteCmdImpl implements WiiNunchukJoyCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiNunchukJoyCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_JOY_CMD__Y, newY);
	}

} //WiiNunchukJoyCmdImpl
