/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice.impl;

import net.sf.smbt.vertilice.comm.ezvertilice.EzvertiliceFactory;
import net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFrmware;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzvertilicePackageImpl extends EPackageImpl implements EzvertilicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertiliceCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertiliceInstantStatusCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertiliceBatteryStatusCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertiliceFrmwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertiliceFailureCmdEClass = null;

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
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzvertilicePackageImpl() {
		super(eNS_URI, EzvertiliceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzvertilicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzvertilicePackage init() {
		if (isInited) return (EzvertilicePackage)EPackage.Registry.INSTANCE.getEPackage(EzvertilicePackage.eNS_URI);

		// Obtain or create and register package
		EzvertilicePackageImpl theEzvertilicePackage = (EzvertilicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzvertilicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzvertilicePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzvertilicePackage.createPackageContents();

		// Initialize created meta-data
		theEzvertilicePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzvertilicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzvertilicePackage.eNS_URI, theEzvertilicePackage);
		return theEzvertilicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertiliceCmd() {
		return vertiliceCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceCmd_Id() {
		return (EAttribute)vertiliceCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceCmd_Date() {
		return (EAttribute)vertiliceCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertiliceInstantStatusCmd() {
		return vertiliceInstantStatusCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceInstantStatusCmd_Rpm() {
		return (EAttribute)vertiliceInstantStatusCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceInstantStatusCmd_Volts() {
		return (EAttribute)vertiliceInstantStatusCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceInstantStatusCmd_Amps() {
		return (EAttribute)vertiliceInstantStatusCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertiliceBatteryStatusCmd() {
		return vertiliceBatteryStatusCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceBatteryStatusCmd_Percent() {
		return (EAttribute)vertiliceBatteryStatusCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceBatteryStatusCmd_Volts() {
		return (EAttribute)vertiliceBatteryStatusCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceBatteryStatusCmd_Amps() {
		return (EAttribute)vertiliceBatteryStatusCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceBatteryStatusCmd_TimeToFull() {
		return (EAttribute)vertiliceBatteryStatusCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertiliceFrmware() {
		return vertiliceFrmwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceFrmware_Version() {
		return (EAttribute)vertiliceFrmwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertiliceFailureCmd() {
		return vertiliceFailureCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceFailureCmd_Code() {
		return (EAttribute)vertiliceFailureCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertiliceFailureCmd_Severity() {
		return (EAttribute)vertiliceFailureCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzvertiliceFactory getEzvertiliceFactory() {
		return (EzvertiliceFactory)getEFactoryInstance();
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
		vertiliceCmdEClass = createEClass(VERTILICE_CMD);
		createEAttribute(vertiliceCmdEClass, VERTILICE_CMD__ID);
		createEAttribute(vertiliceCmdEClass, VERTILICE_CMD__DATE);

		vertiliceInstantStatusCmdEClass = createEClass(VERTILICE_INSTANT_STATUS_CMD);
		createEAttribute(vertiliceInstantStatusCmdEClass, VERTILICE_INSTANT_STATUS_CMD__RPM);
		createEAttribute(vertiliceInstantStatusCmdEClass, VERTILICE_INSTANT_STATUS_CMD__VOLTS);
		createEAttribute(vertiliceInstantStatusCmdEClass, VERTILICE_INSTANT_STATUS_CMD__AMPS);

		vertiliceBatteryStatusCmdEClass = createEClass(VERTILICE_BATTERY_STATUS_CMD);
		createEAttribute(vertiliceBatteryStatusCmdEClass, VERTILICE_BATTERY_STATUS_CMD__PERCENT);
		createEAttribute(vertiliceBatteryStatusCmdEClass, VERTILICE_BATTERY_STATUS_CMD__VOLTS);
		createEAttribute(vertiliceBatteryStatusCmdEClass, VERTILICE_BATTERY_STATUS_CMD__AMPS);
		createEAttribute(vertiliceBatteryStatusCmdEClass, VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL);

		vertiliceFrmwareEClass = createEClass(VERTILICE_FRMWARE);
		createEAttribute(vertiliceFrmwareEClass, VERTILICE_FRMWARE__VERSION);

		vertiliceFailureCmdEClass = createEClass(VERTILICE_FAILURE_CMD);
		createEAttribute(vertiliceFailureCmdEClass, VERTILICE_FAILURE_CMD__CODE);
		createEAttribute(vertiliceFailureCmdEClass, VERTILICE_FAILURE_CMD__SEVERITY);
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
		vertiliceCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		vertiliceInstantStatusCmdEClass.getESuperTypes().add(this.getVertiliceCmd());
		vertiliceBatteryStatusCmdEClass.getESuperTypes().add(this.getVertiliceCmd());
		vertiliceFrmwareEClass.getESuperTypes().add(this.getVertiliceCmd());
		vertiliceFailureCmdEClass.getESuperTypes().add(this.getVertiliceCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(vertiliceCmdEClass, VertiliceCmd.class, "VertiliceCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertiliceCmd_Id(), theEcorePackage.getEString(), "id", null, 0, 1, VertiliceCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertiliceCmd_Date(), theEcorePackage.getEDate(), "date", null, 0, 1, VertiliceCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertiliceInstantStatusCmdEClass, VertiliceInstantStatusCmd.class, "VertiliceInstantStatusCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertiliceInstantStatusCmd_Rpm(), theEcorePackage.getEInt(), "rpm", null, 0, 1, VertiliceInstantStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertiliceInstantStatusCmd_Volts(), theEcorePackage.getEFloat(), "volts", null, 0, 1, VertiliceInstantStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertiliceInstantStatusCmd_Amps(), theEcorePackage.getEFloat(), "amps", null, 0, 1, VertiliceInstantStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertiliceBatteryStatusCmdEClass, VertiliceBatteryStatusCmd.class, "VertiliceBatteryStatusCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertiliceBatteryStatusCmd_Percent(), theEcorePackage.getEFloat(), "percent", null, 0, 1, VertiliceBatteryStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertiliceBatteryStatusCmd_Volts(), theEcorePackage.getEFloat(), "volts", null, 0, 1, VertiliceBatteryStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertiliceBatteryStatusCmd_Amps(), theEcorePackage.getEFloat(), "amps", null, 0, 1, VertiliceBatteryStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertiliceBatteryStatusCmd_TimeToFull(), theEcorePackage.getELong(), "timeToFull", null, 0, 1, VertiliceBatteryStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertiliceFrmwareEClass, VertiliceFrmware.class, "VertiliceFrmware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertiliceFrmware_Version(), theEcorePackage.getEString(), "version", null, 0, 1, VertiliceFrmware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertiliceFailureCmdEClass, VertiliceFailureCmd.class, "VertiliceFailureCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertiliceFailureCmd_Code(), theEcorePackage.getEInt(), "code", null, 0, 1, VertiliceFailureCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertiliceFailureCmd_Severity(), theEcorePackage.getEInt(), "severity", null, 0, 1, VertiliceFailureCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EzvertilicePackageImpl
