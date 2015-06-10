/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wii Nunchuk Button Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukButtonCmdImpl#getToggle <em>Toggle</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukButtonCmdImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiiNunchukButtonCmdImpl extends WiimoteCmdImpl implements WiiNunchukButtonCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiiNunchukButtonCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getToggle() {
		return (Float)eGet(WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToggle(float newToggle) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__TOGGLE, newToggle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteButtonKind getKind() {
		return (WiimoteButtonKind)eGet(WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(WiimoteButtonKind newKind) {
		eSet(WiimotePackage.Literals.WII_NUNCHUK_BUTTON_CMD__KIND, newKind);
	}

} //WiiNunchukButtonCmdImpl
