/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands.impl;

import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsFactory;
import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage;
import net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd;
import net.sf.smbt.i2c.wii.nunchuck.commands.InitNunchukCmd;
import net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandsPackageImpl extends EPackageImpl implements CommandsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nunchukCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass get3DAccelValuesCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initNunchukCmdEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandsPackageImpl() {
		super(eNS_URI, CommandsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommandsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandsPackage init() {
		if (isInited) return (CommandsPackage)EPackage.Registry.INSTANCE.getEPackage(CommandsPackage.eNS_URI);

		// Obtain or create and register package
		CommandsPackageImpl theCommandsPackage = (CommandsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommandsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommandsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommandsPackage.createPackageContents();

		// Initialize created meta-data
		theCommandsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommandsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandsPackage.eNS_URI, theCommandsPackage);
		return theCommandsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNunchukCmd() {
		return nunchukCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNunchukCmd_Addr() {
		return (EAttribute)nunchukCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGet3DAccelValuesCmd() {
		return get3DAccelValuesCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet3DAccelValuesCmd_XAccel() {
		return (EAttribute)get3DAccelValuesCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet3DAccelValuesCmd_YAccel() {
		return (EAttribute)get3DAccelValuesCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet3DAccelValuesCmd_ZAccel() {
		return (EAttribute)get3DAccelValuesCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet3DAccelValuesCmd_CButtonDown() {
		return (EAttribute)get3DAccelValuesCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet3DAccelValuesCmd_ZButtonDown() {
		return (EAttribute)get3DAccelValuesCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet3DAccelValuesCmd_JoyX() {
		return (EAttribute)get3DAccelValuesCmdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGet3DAccelValuesCmd_JoyY() {
		return (EAttribute)get3DAccelValuesCmdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitNunchukCmd() {
		return initNunchukCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactory getCommandsFactory() {
		return (CommandsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nunchukCmdEClass = createEClass(NUNCHUK_CMD);
		createEAttribute(nunchukCmdEClass, NUNCHUK_CMD__ADDR);

		get3DAccelValuesCmdEClass = createEClass(GET3_DACCEL_VALUES_CMD);
		createEAttribute(get3DAccelValuesCmdEClass, GET3_DACCEL_VALUES_CMD__XACCEL);
		createEAttribute(get3DAccelValuesCmdEClass, GET3_DACCEL_VALUES_CMD__YACCEL);
		createEAttribute(get3DAccelValuesCmdEClass, GET3_DACCEL_VALUES_CMD__ZACCEL);
		createEAttribute(get3DAccelValuesCmdEClass, GET3_DACCEL_VALUES_CMD__CBUTTON_DOWN);
		createEAttribute(get3DAccelValuesCmdEClass, GET3_DACCEL_VALUES_CMD__ZBUTTON_DOWN);
		createEAttribute(get3DAccelValuesCmdEClass, GET3_DACCEL_VALUES_CMD__JOY_X);
		createEAttribute(get3DAccelValuesCmdEClass, GET3_DACCEL_VALUES_CMD__JOY_Y);

		initNunchukCmdEClass = createEClass(INIT_NUNCHUK_CMD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nunchukCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		get3DAccelValuesCmdEClass.getESuperTypes().add(this.getNunchukCmd());
		initNunchukCmdEClass.getESuperTypes().add(this.getNunchukCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(nunchukCmdEClass, NunchukCmd.class, "NunchukCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNunchukCmd_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, NunchukCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(get3DAccelValuesCmdEClass, Get3DAccelValuesCmd.class, "Get3DAccelValuesCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGet3DAccelValuesCmd_XAccel(), ecorePackage.getEInt(), "xAccel", null, 0, 1, Get3DAccelValuesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet3DAccelValuesCmd_YAccel(), ecorePackage.getEInt(), "yAccel", null, 0, 1, Get3DAccelValuesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet3DAccelValuesCmd_ZAccel(), ecorePackage.getEInt(), "zAccel", null, 0, 1, Get3DAccelValuesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet3DAccelValuesCmd_CButtonDown(), ecorePackage.getEBoolean(), "cButtonDown", null, 0, 1, Get3DAccelValuesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet3DAccelValuesCmd_ZButtonDown(), ecorePackage.getEBoolean(), "zButtonDown", null, 0, 1, Get3DAccelValuesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet3DAccelValuesCmd_JoyX(), ecorePackage.getEInt(), "joyX", null, 0, 1, Get3DAccelValuesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGet3DAccelValuesCmd_JoyY(), ecorePackage.getEInt(), "joyY", null, 0, 1, Get3DAccelValuesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initNunchukCmdEClass, InitNunchukCmd.class, "InitNunchukCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommandsPackageImpl
