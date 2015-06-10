/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands.impl;

import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage;
import net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get3 DAccel Values Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl#getXAccel <em>XAccel</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl#getYAccel <em>YAccel</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl#getZAccel <em>ZAccel</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl#isCButtonDown <em>CButton Down</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl#isZButtonDown <em>ZButton Down</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl#getJoyX <em>Joy X</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl#getJoyY <em>Joy Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Get3DAccelValuesCmdImpl extends NunchukCmdImpl implements Get3DAccelValuesCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Get3DAccelValuesCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getXAccel() {
		return (Integer)eGet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__XACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAccel(int newXAccel) {
		eSet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__XACCEL, newXAccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYAccel() {
		return (Integer)eGet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__YACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAccel(int newYAccel) {
		eSet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__YACCEL, newYAccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZAccel() {
		return (Integer)eGet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__ZACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZAccel(int newZAccel) {
		eSet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__ZACCEL, newZAccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCButtonDown() {
		return (Boolean)eGet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__CBUTTON_DOWN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCButtonDown(boolean newCButtonDown) {
		eSet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__CBUTTON_DOWN, newCButtonDown);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isZButtonDown() {
		return (Boolean)eGet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__ZBUTTON_DOWN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZButtonDown(boolean newZButtonDown) {
		eSet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__ZBUTTON_DOWN, newZButtonDown);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJoyX() {
		return (Integer)eGet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__JOY_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoyX(int newJoyX) {
		eSet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__JOY_X, newJoyX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJoyY() {
		return (Integer)eGet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__JOY_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoyY(int newJoyY) {
		eSet(CommandsPackage.Literals.GET3_DACCEL_VALUES_CMD__JOY_Y, newJoyY);
	}

} //Get3DAccelValuesCmdImpl
