/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg.impl;

import net.sf.smbt.at.atcmdset.AtcmdsetPackage;
import net.sf.smbt.xbee.XbeePackage;
import net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory;
import net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration;
import net.sf.smbt.xbeecfg.XbeecfgFactory;
import net.sf.smbt.xbeecfg.XbeecfgPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XbeecfgPackageImpl extends EPackageImpl implements XbeecfgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeeFirmwareConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeeFirmwareCfgCategoryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xbeE_FIRMWARE_CONF_AT_FIELDEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xbeE_FIRMWARE_CONF_CATEGORYEEnum = null;

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
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XbeecfgPackageImpl() {
		super(eNS_URI, XbeecfgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XbeecfgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XbeecfgPackage init() {
		if (isInited) return (XbeecfgPackage)EPackage.Registry.INSTANCE.getEPackage(XbeecfgPackage.eNS_URI);

		// Obtain or create and register package
		XbeecfgPackageImpl theXbeecfgPackage = (XbeecfgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XbeecfgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XbeecfgPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AtcmdsetPackage.eINSTANCE.eClass();
		XbeePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXbeecfgPackage.createPackageContents();

		// Initialize created meta-data
		theXbeecfgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXbeecfgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XbeecfgPackage.eNS_URI, theXbeecfgPackage);
		return theXbeecfgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeeFirmwareConfiguration() {
		return xBeeFirmwareConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXBeeFirmwareConfiguration_Series() {
		return (EAttribute)xBeeFirmwareConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXBeeFirmwareConfiguration_Label() {
		return (EAttribute)xBeeFirmwareConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXBeeFirmwareConfiguration_Categories() {
		return (EReference)xBeeFirmwareConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeeFirmwareCfgCategory() {
		return xBeeFirmwareCfgCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXBeeFirmwareCfgCategory_SubCategories() {
		return (EReference)xBeeFirmwareCfgCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXBeeFirmwareCfgCategory_Kind() {
		return (EAttribute)xBeeFirmwareCfgCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXBeeFirmwareCfgCategory_Fields() {
		return (EReference)xBeeFirmwareCfgCategoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXBeeFirmwareCfgCategory_Label() {
		return (EAttribute)xBeeFirmwareCfgCategoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBEE_FIRMWARE_CONF_AT_FIELD() {
		return xbeE_FIRMWARE_CONF_AT_FIELDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXBEE_FIRMWARE_CONF_AT_FIELD_AtCmd() {
		return (EAttribute)xbeE_FIRMWARE_CONF_AT_FIELDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXBEE_FIRMWARE_CONF_CATEGORY() {
		return xbeE_FIRMWARE_CONF_CATEGORYEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecfgFactory getXbeecfgFactory() {
		return (XbeecfgFactory)getEFactoryInstance();
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
		xBeeFirmwareConfigurationEClass = createEClass(XBEE_FIRMWARE_CONFIGURATION);
		createEAttribute(xBeeFirmwareConfigurationEClass, XBEE_FIRMWARE_CONFIGURATION__SERIES);
		createEAttribute(xBeeFirmwareConfigurationEClass, XBEE_FIRMWARE_CONFIGURATION__LABEL);
		createEReference(xBeeFirmwareConfigurationEClass, XBEE_FIRMWARE_CONFIGURATION__CATEGORIES);

		xBeeFirmwareCfgCategoryEClass = createEClass(XBEE_FIRMWARE_CFG_CATEGORY);
		createEReference(xBeeFirmwareCfgCategoryEClass, XBEE_FIRMWARE_CFG_CATEGORY__SUB_CATEGORIES);
		createEAttribute(xBeeFirmwareCfgCategoryEClass, XBEE_FIRMWARE_CFG_CATEGORY__KIND);
		createEReference(xBeeFirmwareCfgCategoryEClass, XBEE_FIRMWARE_CFG_CATEGORY__FIELDS);
		createEAttribute(xBeeFirmwareCfgCategoryEClass, XBEE_FIRMWARE_CFG_CATEGORY__LABEL);

		xbeE_FIRMWARE_CONF_AT_FIELDEClass = createEClass(XBEE_FIRMWARE_CONF_AT_FIELD);
		createEAttribute(xbeE_FIRMWARE_CONF_AT_FIELDEClass, XBEE_FIRMWARE_CONF_AT_FIELD__AT_CMD);

		// Create enums
		xbeE_FIRMWARE_CONF_CATEGORYEEnum = createEEnum(XBEE_FIRMWARE_CONF_CATEGORY);
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
		XbeePackage theXbeePackage = (XbeePackage)EPackage.Registry.INSTANCE.getEPackage(XbeePackage.eNS_URI);
		AtcmdsetPackage theAtcmdsetPackage = (AtcmdsetPackage)EPackage.Registry.INSTANCE.getEPackage(AtcmdsetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(xBeeFirmwareConfigurationEClass, XBeeFirmwareConfiguration.class, "XBeeFirmwareConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXBeeFirmwareConfiguration_Series(), theXbeePackage.getXBEE_SERIES(), "series", null, 0, -1, XBeeFirmwareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXBeeFirmwareConfiguration_Label(), ecorePackage.getEString(), "label", null, 0, 1, XBeeFirmwareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXBeeFirmwareConfiguration_Categories(), this.getXBeeFirmwareCfgCategory(), null, "categories", null, 0, -1, XBeeFirmwareConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xBeeFirmwareCfgCategoryEClass, XBeeFirmwareCfgCategory.class, "XBeeFirmwareCfgCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXBeeFirmwareCfgCategory_SubCategories(), this.getXBeeFirmwareCfgCategory(), null, "subCategories", null, 0, -1, XBeeFirmwareCfgCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXBeeFirmwareCfgCategory_Kind(), this.getXBEE_FIRMWARE_CONF_CATEGORY(), "kind", null, 0, 1, XBeeFirmwareCfgCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXBeeFirmwareCfgCategory_Fields(), this.getXBEE_FIRMWARE_CONF_AT_FIELD(), null, "fields", null, 0, -1, XBeeFirmwareCfgCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXBeeFirmwareCfgCategory_Label(), ecorePackage.getEString(), "label", null, 0, 1, XBeeFirmwareCfgCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xbeE_FIRMWARE_CONF_AT_FIELDEClass, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD.class, "XBEE_FIRMWARE_CONF_AT_FIELD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXBEE_FIRMWARE_CONF_AT_FIELD_AtCmd(), theAtcmdsetPackage.getAT_COMMAND_TYPES(), "atCmd", null, 0, 1, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.class, "XBEE_FIRMWARE_CONF_CATEGORY");
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.AT_COMMANDS_OPTIONS);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.DIAGNOSTIC_COMMANDS);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.NETWORKING);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.SERIAL_INTERFACING);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.SLEEP_LOW_POWER);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.NETWORK_AND_SECURITY);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.DIAGNOSTICS);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.COMMANDS_MODE_OPTIONS);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.ADDRESSING);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.SECURITY);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.IO_SETTINGS);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.SERIAL_INTERFACING_OPTIONS);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.RF_INTERFACING);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.IO_LINE_PASSING);
		addEEnumLiteral(xbeE_FIRMWARE_CONF_CATEGORYEEnum, net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY.SLEEP_MODES_NONBEACON);

		// Create resource
		createResource(eNS_URI);
	}

} //XbeecfgPackageImpl
