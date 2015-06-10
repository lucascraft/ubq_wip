/**
 */
package net.sf.smbt.ezmppt.impl;

import net.sf.smbt.ezmppt.EpSolarCmd;
import net.sf.smbt.ezmppt.EzmpptFactory;
import net.sf.smbt.ezmppt.EzmpptPackage;
import net.sf.smbt.ezmppt.MpptCmd;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmpptPackageImpl extends EPackageImpl implements EzmpptPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epSolarCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mpptCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mpptEEnum = null;

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
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzmpptPackageImpl() {
		super(eNS_URI, EzmpptFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzmpptPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzmpptPackage init() {
		if (isInited) return (EzmpptPackage)EPackage.Registry.INSTANCE.getEPackage(EzmpptPackage.eNS_URI);

		// Obtain or create and register package
		EzmpptPackageImpl theEzmpptPackage = (EzmpptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzmpptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzmpptPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzmpptPackage.createPackageContents();

		// Initialize created meta-data
		theEzmpptPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzmpptPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzmpptPackage.eNS_URI, theEzmpptPackage);
		return theEzmpptPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpSolarCmd() {
		return epSolarCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_MVBatteries() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_Status() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_Date() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_MVPanels() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_MAComsumption() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_MVBatteriesEmpty() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_MVBatteriesFull() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_MACurrentLoadTension() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_ActivatedUsage() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_Overload() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_ShortCircuit() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_LoadStatusSOC() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_BatteryTooLoaded() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_BatteryTooEmpty() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_BatteryFull() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_OngoingLoading() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpSolarCmd_Temperature() {
		return (EAttribute)epSolarCmdEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMpptCmd() {
		return mpptCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMpptCmd_Device() {
		return (EAttribute)mpptCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMpptCmd_Command() {
		return (EAttribute)mpptCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMpptCmd_Length() {
		return (EAttribute)mpptCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMpptCmd_Data() {
		return (EAttribute)mpptCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMpptCmd_Crc1() {
		return (EAttribute)mpptCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMpptCmd_Crc2() {
		return (EAttribute)mpptCmdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMPPT() {
		return mpptEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmpptFactory getEzmpptFactory() {
		return (EzmpptFactory)getEFactoryInstance();
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
		epSolarCmdEClass = createEClass(EP_SOLAR_CMD);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__MV_BATTERIES);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__STATUS);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__DATE);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__MV_PANELS);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__MA_COMSUMPTION);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__MV_BATTERIES_EMPTY);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__MV_BATTERIES_FULL);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__ACTIVATED_USAGE);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__OVERLOAD);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__SHORT_CIRCUIT);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__LOAD_STATUS_SOC);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__BATTERY_TOO_LOADED);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__BATTERY_TOO_EMPTY);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__BATTERY_FULL);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__ONGOING_LOADING);
		createEAttribute(epSolarCmdEClass, EP_SOLAR_CMD__TEMPERATURE);

		mpptCmdEClass = createEClass(MPPT_CMD);
		createEAttribute(mpptCmdEClass, MPPT_CMD__DEVICE);
		createEAttribute(mpptCmdEClass, MPPT_CMD__COMMAND);
		createEAttribute(mpptCmdEClass, MPPT_CMD__LENGTH);
		createEAttribute(mpptCmdEClass, MPPT_CMD__DATA);
		createEAttribute(mpptCmdEClass, MPPT_CMD__CRC1);
		createEAttribute(mpptCmdEClass, MPPT_CMD__CRC2);

		// Create enums
		mpptEEnum = createEEnum(MPPT);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		epSolarCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		mpptCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(epSolarCmdEClass, EpSolarCmd.class, "EpSolarCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEpSolarCmd_MVBatteries(), theEcorePackage.getEFloat(), "mVBatteries", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_Status(), theEcorePackage.getEInt(), "status", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_Date(), theEcorePackage.getEDate(), "date", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_MVPanels(), theEcorePackage.getEFloat(), "mVPanels", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_MAComsumption(), theEcorePackage.getEFloat(), "mAComsumption", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_MVBatteriesEmpty(), theEcorePackage.getEFloat(), "mVBatteriesEmpty", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_MVBatteriesFull(), theEcorePackage.getEFloat(), "mVBatteriesFull", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_MACurrentLoadTension(), theEcorePackage.getEFloat(), "mACurrentLoadTension", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_ActivatedUsage(), theEcorePackage.getEFloat(), "activatedUsage", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_Overload(), theEcorePackage.getEFloat(), "overload", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_ShortCircuit(), theEcorePackage.getEFloat(), "shortCircuit", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_LoadStatusSOC(), theEcorePackage.getEFloat(), "LoadStatusSOC", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_BatteryTooLoaded(), theEcorePackage.getEFloat(), "batteryTooLoaded", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_BatteryTooEmpty(), theEcorePackage.getEFloat(), "batteryTooEmpty", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_BatteryFull(), theEcorePackage.getEFloat(), "batteryFull", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_OngoingLoading(), theEcorePackage.getEFloat(), "ongoingLoading", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEpSolarCmd_Temperature(), theEcorePackage.getEFloat(), "temperature", null, 0, 1, EpSolarCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mpptCmdEClass, MpptCmd.class, "MpptCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMpptCmd_Device(), theEcorePackage.getEByte(), "device", null, 0, 1, MpptCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMpptCmd_Command(), theEcorePackage.getEByte(), "command", null, 0, 1, MpptCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMpptCmd_Length(), theEcorePackage.getEByte(), "length", null, 0, 1, MpptCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMpptCmd_Data(), theEcorePackage.getEByteArray(), "data", null, 0, 1, MpptCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMpptCmd_Crc1(), theEcorePackage.getEByte(), "crc1", null, 0, 1, MpptCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMpptCmd_Crc2(), theEcorePackage.getEByte(), "crc2", null, 0, 1, MpptCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mpptEEnum, net.sf.smbt.ezmppt.MPPT.class, "MPPT");
		addEEnumLiteral(mpptEEnum, net.sf.smbt.ezmppt.MPPT.SYNCHRO1);
		addEEnumLiteral(mpptEEnum, net.sf.smbt.ezmppt.MPPT.SYNCHRO2);
		addEEnumLiteral(mpptEEnum, net.sf.smbt.ezmppt.MPPT.EOM);

		// Create resource
		createResource(eNS_URI);
	}

} //EzmpptPackageImpl
