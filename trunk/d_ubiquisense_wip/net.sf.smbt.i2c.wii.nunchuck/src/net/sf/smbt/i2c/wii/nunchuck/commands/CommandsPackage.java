/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsFactory
 * @model kind="package"
 * @generated
 */
public interface CommandsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/thingm/commands/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsPackage eINSTANCE = net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.NunchukCmdImpl <em>Nunchuk Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.NunchukCmdImpl
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsPackageImpl#getNunchukCmd()
	 * @generated
	 */
	int NUNCHUK_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUNCHUK_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUNCHUK_CMD__ADDR = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nunchuk Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUNCHUK_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl <em>Get3 DAccel Values Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsPackageImpl#getGet3DAccelValuesCmd()
	 * @generated
	 */
	int GET3_DACCEL_VALUES_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__PRIORITY = NUNCHUK_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__ADDR = NUNCHUK_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>XAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__XACCEL = NUNCHUK_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__YACCEL = NUNCHUK_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ZAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__ZACCEL = NUNCHUK_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CButton Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__CBUTTON_DOWN = NUNCHUK_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>ZButton Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__ZBUTTON_DOWN = NUNCHUK_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Joy X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__JOY_X = NUNCHUK_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Joy Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD__JOY_Y = NUNCHUK_CMD_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Get3 DAccel Values Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET3_DACCEL_VALUES_CMD_FEATURE_COUNT = NUNCHUK_CMD_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.InitNunchukCmdImpl <em>Init Nunchuk Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.InitNunchukCmdImpl
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsPackageImpl#getInitNunchukCmd()
	 * @generated
	 */
	int INIT_NUNCHUK_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_NUNCHUK_CMD__PRIORITY = NUNCHUK_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_NUNCHUK_CMD__ADDR = NUNCHUK_CMD__ADDR;

	/**
	 * The number of structural features of the '<em>Init Nunchuk Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INIT_NUNCHUK_CMD_FEATURE_COUNT = NUNCHUK_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd <em>Nunchuk Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nunchuk Cmd</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd
	 * @generated
	 */
	EClass getNunchukCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd#getAddr()
	 * @see #getNunchukCmd()
	 * @generated
	 */
	EAttribute getNunchukCmd_Addr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd <em>Get3 DAccel Values Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get3 DAccel Values Cmd</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd
	 * @generated
	 */
	EClass getGet3DAccelValuesCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getXAccel <em>XAccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAccel</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getXAccel()
	 * @see #getGet3DAccelValuesCmd()
	 * @generated
	 */
	EAttribute getGet3DAccelValuesCmd_XAccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getYAccel <em>YAccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAccel</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getYAccel()
	 * @see #getGet3DAccelValuesCmd()
	 * @generated
	 */
	EAttribute getGet3DAccelValuesCmd_YAccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getZAccel <em>ZAccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAccel</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getZAccel()
	 * @see #getGet3DAccelValuesCmd()
	 * @generated
	 */
	EAttribute getGet3DAccelValuesCmd_ZAccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isCButtonDown <em>CButton Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CButton Down</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isCButtonDown()
	 * @see #getGet3DAccelValuesCmd()
	 * @generated
	 */
	EAttribute getGet3DAccelValuesCmd_CButtonDown();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isZButtonDown <em>ZButton Down</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZButton Down</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isZButtonDown()
	 * @see #getGet3DAccelValuesCmd()
	 * @generated
	 */
	EAttribute getGet3DAccelValuesCmd_ZButtonDown();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyX <em>Joy X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joy X</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyX()
	 * @see #getGet3DAccelValuesCmd()
	 * @generated
	 */
	EAttribute getGet3DAccelValuesCmd_JoyX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyY <em>Joy Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joy Y</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyY()
	 * @see #getGet3DAccelValuesCmd()
	 * @generated
	 */
	EAttribute getGet3DAccelValuesCmd_JoyY();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.i2c.wii.nunchuck.commands.InitNunchukCmd <em>Init Nunchuk Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Init Nunchuk Cmd</em>'.
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.InitNunchukCmd
	 * @generated
	 */
	EClass getInitNunchukCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandsFactory getCommandsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.NunchukCmdImpl <em>Nunchuk Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.NunchukCmdImpl
		 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsPackageImpl#getNunchukCmd()
		 * @generated
		 */
		EClass NUNCHUK_CMD = eINSTANCE.getNunchukCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUNCHUK_CMD__ADDR = eINSTANCE.getNunchukCmd_Addr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl <em>Get3 DAccel Values Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.Get3DAccelValuesCmdImpl
		 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsPackageImpl#getGet3DAccelValuesCmd()
		 * @generated
		 */
		EClass GET3_DACCEL_VALUES_CMD = eINSTANCE.getGet3DAccelValuesCmd();

		/**
		 * The meta object literal for the '<em><b>XAccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET3_DACCEL_VALUES_CMD__XACCEL = eINSTANCE.getGet3DAccelValuesCmd_XAccel();

		/**
		 * The meta object literal for the '<em><b>YAccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET3_DACCEL_VALUES_CMD__YACCEL = eINSTANCE.getGet3DAccelValuesCmd_YAccel();

		/**
		 * The meta object literal for the '<em><b>ZAccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET3_DACCEL_VALUES_CMD__ZACCEL = eINSTANCE.getGet3DAccelValuesCmd_ZAccel();

		/**
		 * The meta object literal for the '<em><b>CButton Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET3_DACCEL_VALUES_CMD__CBUTTON_DOWN = eINSTANCE.getGet3DAccelValuesCmd_CButtonDown();

		/**
		 * The meta object literal for the '<em><b>ZButton Down</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET3_DACCEL_VALUES_CMD__ZBUTTON_DOWN = eINSTANCE.getGet3DAccelValuesCmd_ZButtonDown();

		/**
		 * The meta object literal for the '<em><b>Joy X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET3_DACCEL_VALUES_CMD__JOY_X = eINSTANCE.getGet3DAccelValuesCmd_JoyX();

		/**
		 * The meta object literal for the '<em><b>Joy Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET3_DACCEL_VALUES_CMD__JOY_Y = eINSTANCE.getGet3DAccelValuesCmd_JoyY();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.InitNunchukCmdImpl <em>Init Nunchuk Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.InitNunchukCmdImpl
		 * @see net.sf.smbt.i2c.wii.nunchuck.commands.impl.CommandsPackageImpl#getInitNunchukCmd()
		 * @generated
		 */
		EClass INIT_NUNCHUK_CMD = eINSTANCE.getInitNunchukCmd();

	}

} //CommandsPackage
