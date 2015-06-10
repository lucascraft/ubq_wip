/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage
 * @generated
 */
public interface WiimoteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiimoteFactory eINSTANCE = net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cmd</em>'.
	 * @generated
	 */
	WiimoteCmd createWiimoteCmd();

	/**
	 * Returns a new object of class '<em>Wii Accel XYZ Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Accel XYZ Cmd</em>'.
	 * @generated
	 */
	WiiAccelXYZCmd createWiiAccelXYZCmd();

	/**
	 * Returns a new object of class '<em>Wii Accel Pry Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Accel Pry Cmd</em>'.
	 * @generated
	 */
	WiiAccelPryCmd createWiiAccelPryCmd();

	/**
	 * Returns a new object of class '<em>Wii Button Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Button Cmd</em>'.
	 * @generated
	 */
	WiiButtonCmd createWiiButtonCmd();

	/**
	 * Returns a new object of class '<em>Wii Ir XY Speed Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Ir XY Speed Cmd</em>'.
	 * @generated
	 */
	WiiIrXYSpeedCmd createWiiIrXYSpeedCmd();

	/**
	 * Returns a new object of class '<em>Wii Motion Angles Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Motion Angles Cmd</em>'.
	 * @generated
	 */
	WiiMotionAnglesCmd createWiiMotionAnglesCmd();

	/**
	 * Returns a new object of class '<em>Wii Motion Velo Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Motion Velo Cmd</em>'.
	 * @generated
	 */
	WiiMotionVeloCmd createWiiMotionVeloCmd();

	/**
	 * Returns a new object of class '<em>Wii Nunchuk Accel Pry Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Nunchuk Accel Pry Cmd</em>'.
	 * @generated
	 */
	WiiNunchukAccelPryCmd createWiiNunchukAccelPryCmd();

	/**
	 * Returns a new object of class '<em>Wii Nunchuk Button Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Nunchuk Button Cmd</em>'.
	 * @generated
	 */
	WiiNunchukButtonCmd createWiiNunchukButtonCmd();

	/**
	 * Returns a new object of class '<em>Wii Nunchuk Joy Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Nunchuk Joy Cmd</em>'.
	 * @generated
	 */
	WiiNunchukJoyCmd createWiiNunchukJoyCmd();

	/**
	 * Returns a new object of class '<em>Wii Nunchuk Accel Xyz Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Nunchuk Accel Xyz Cmd</em>'.
	 * @generated
	 */
	WiiNunchukAccelXyzCmd createWiiNunchukAccelXyzCmd();

	/**
	 * Returns a new object of class '<em>Wii Ir Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Ir Cmd</em>'.
	 * @generated
	 */
	WiiIrCmd createWiiIrCmd();

	/**
	 * Returns a new object of class '<em>Wii Angles Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wii Angles Cmd</em>'.
	 * @generated
	 */
	WiiAnglesCmd createWiiAnglesCmd();

	/**
	 * Returns a new object of class '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monitor</em>'.
	 * @generated
	 */
	WiimoteMonitor createWiimoteMonitor();

	/**
	 * Returns a new object of class '<em>Live Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Settings</em>'.
	 * @generated
	 */
	WiimoteLiveSettings createWiimoteLiveSettings();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WiimotePackage getWiimotePackage();

} //WiimoteFactory
