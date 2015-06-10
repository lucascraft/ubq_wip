/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands.impl;

import net.sf.smbt.i2c.wii.nunchuck.commands.*;
import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsFactory;
import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage;
import net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd;
import net.sf.smbt.i2c.wii.nunchuck.commands.InitNunchukCmd;
import net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandsFactoryImpl extends EFactoryImpl implements CommandsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandsFactory init() {
		try {
			CommandsFactory theCommandsFactory = (CommandsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/thingm/commands/1.0"); 
			if (theCommandsFactory != null) {
				return theCommandsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommandsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CommandsPackage.NUNCHUK_CMD: return createNunchukCmd();
			case CommandsPackage.GET3_DACCEL_VALUES_CMD: return createGet3DAccelValuesCmd();
			case CommandsPackage.INIT_NUNCHUK_CMD: return createInitNunchukCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NunchukCmd createNunchukCmd() {
		NunchukCmdImpl nunchukCmd = new NunchukCmdImpl();
		return nunchukCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Get3DAccelValuesCmd createGet3DAccelValuesCmd() {
		Get3DAccelValuesCmdImpl get3DAccelValuesCmd = new Get3DAccelValuesCmdImpl();
		return get3DAccelValuesCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitNunchukCmd createInitNunchukCmd() {
		InitNunchukCmdImpl initNunchukCmd = new InitNunchukCmdImpl();
		return initNunchukCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsPackage getCommandsPackage() {
		return (CommandsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommandsPackage getPackage() {
		return CommandsPackage.eINSTANCE;
	}

} //CommandsFactoryImpl
