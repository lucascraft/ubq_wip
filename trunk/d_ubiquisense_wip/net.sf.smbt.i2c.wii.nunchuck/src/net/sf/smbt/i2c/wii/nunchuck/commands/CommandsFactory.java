/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage
 * @generated
 */
public interface CommandsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsFactory eINSTANCE = net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Nunchuk Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nunchuk Cmd</em>'.
	 * @generated
	 */
	NunchukCmd createNunchukCmd();

	/**
	 * Returns a new object of class '<em>Get3 DAccel Values Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get3 DAccel Values Cmd</em>'.
	 * @generated
	 */
	Get3DAccelValuesCmd createGet3DAccelValuesCmd();

	/**
	 * Returns a new object of class '<em>Init Nunchuk Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Init Nunchuk Cmd</em>'.
	 * @generated
	 */
	InitNunchukCmd createInitNunchukCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommandsPackage getCommandsPackage();

} //CommandsFactory
