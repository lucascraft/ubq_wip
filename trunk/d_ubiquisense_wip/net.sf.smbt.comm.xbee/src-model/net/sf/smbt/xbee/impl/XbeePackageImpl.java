/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbee.impl;

import net.sf.smbt.xbee.Xbee;
import net.sf.smbt.xbee.XbeeFactory;
import net.sf.smbt.xbee.XbeePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XbeePackageImpl extends EPackageImpl implements XbeePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xbeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xbeE_SERIESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xbeE_COMM_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xbeE_FREQEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xbeE_FIRMAWAREEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xbeE_MANUFACTURER_IDEEnum = null;

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
	 * @see net.sf.smbt.xbee.XbeePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XbeePackageImpl() {
		super(eNS_URI, XbeeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XbeePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XbeePackage init() {
		if (isInited) return (XbeePackage)EPackage.Registry.INSTANCE.getEPackage(XbeePackage.eNS_URI);

		// Obtain or create and register package
		XbeePackageImpl theXbeePackage = (XbeePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XbeePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XbeePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theXbeePackage.createPackageContents();

		// Initialize created meta-data
		theXbeePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXbeePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XbeePackage.eNS_URI, theXbeePackage);
		return theXbeePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXbee() {
		return xbeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXbee_Label() {
		return (EAttribute)xbeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXbee_Series() {
		return (EAttribute)xbeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXbee_Freq() {
		return (EAttribute)xbeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXbee_Modes() {
		return (EAttribute)xbeeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXbee_Firmaware() {
		return (EAttribute)xbeeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXBEE_SERIES() {
		return xbeE_SERIESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXBEE_COMM_MODE() {
		return xbeE_COMM_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXBEE_FREQ() {
		return xbeE_FREQEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXBEE_FIRMAWARE() {
		return xbeE_FIRMAWAREEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXBEE_MANUFACTURER_ID() {
		return xbeE_MANUFACTURER_IDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeeFactory getXbeeFactory() {
		return (XbeeFactory)getEFactoryInstance();
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
		xbeeEClass = createEClass(XBEE);
		createEAttribute(xbeeEClass, XBEE__LABEL);
		createEAttribute(xbeeEClass, XBEE__SERIES);
		createEAttribute(xbeeEClass, XBEE__FREQ);
		createEAttribute(xbeeEClass, XBEE__MODES);
		createEAttribute(xbeeEClass, XBEE__FIRMAWARE);

		// Create enums
		xbeE_SERIESEEnum = createEEnum(XBEE_SERIES);
		xbeE_COMM_MODEEEnum = createEEnum(XBEE_COMM_MODE);
		xbeE_FREQEEnum = createEEnum(XBEE_FREQ);
		xbeE_FIRMAWAREEEnum = createEEnum(XBEE_FIRMAWARE);
		xbeE_MANUFACTURER_IDEEnum = createEEnum(XBEE_MANUFACTURER_ID);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(xbeeEClass, Xbee.class, "Xbee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXbee_Label(), ecorePackage.getEString(), "label", null, 0, 1, Xbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXbee_Series(), this.getXBEE_SERIES(), "series", null, 0, 1, Xbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXbee_Freq(), this.getXBEE_FREQ(), "freq", null, 0, 1, Xbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXbee_Modes(), this.getXBEE_COMM_MODE(), "modes", null, 0, -1, Xbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXbee_Firmaware(), this.getXBEE_FIRMAWARE(), "firmaware", null, 0, 1, Xbee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.class, "XBEE_SERIES");
		addEEnumLiteral(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.XBEE);
		addEEnumLiteral(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.XBEE_PRO);
		addEEnumLiteral(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.XBEE_XSC_900);
		addEEnumLiteral(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.XBEE_ZNET_25);
		addEEnumLiteral(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.XSTREAM);
		addEEnumLiteral(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.XCITE);
		addEEnumLiteral(xbeE_SERIESEEnum, net.sf.smbt.xbee.XBEE_SERIES.XTEND);

		initEEnum(xbeE_COMM_MODEEEnum, net.sf.smbt.xbee.XBEE_COMM_MODE.class, "XBEE_COMM_MODE");
		addEEnumLiteral(xbeE_COMM_MODEEEnum, net.sf.smbt.xbee.XBEE_COMM_MODE.POINT_TO_MULTIPOINTS);
		addEEnumLiteral(xbeE_COMM_MODEEEnum, net.sf.smbt.xbee.XBEE_COMM_MODE.DIGIMESH);
		addEEnumLiteral(xbeE_COMM_MODEEEnum, net.sf.smbt.xbee.XBEE_COMM_MODE.ZIGBEE);

		initEEnum(xbeE_FREQEEnum, net.sf.smbt.xbee.XBEE_FREQ.class, "XBEE_FREQ");
		addEEnumLiteral(xbeE_FREQEEnum, net.sf.smbt.xbee.XBEE_FREQ.RF_2400_MHZ);
		addEEnumLiteral(xbeE_FREQEEnum, net.sf.smbt.xbee.XBEE_FREQ.RF_900_MHZ);

		initEEnum(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.class, "XBEE_FIRMAWARE");
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.X09_009);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.X09_019);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.X24_009);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.X24_019);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XB24);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XB24_B);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XB24_ZB);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XBP09_DM);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XBP09_XSC);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XBP09_DP);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XBP24);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XBP24_B);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XBP24_ZB);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XC09_009);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XC09_038);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XH09_009);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XH09_019);
		addEEnumLiteral(xbeE_FIRMAWAREEEnum, net.sf.smbt.xbee.XBEE_FIRMAWARE.XT09);

		initEEnum(xbeE_MANUFACTURER_IDEEnum, net.sf.smbt.xbee.XBEE_MANUFACTURER_ID.class, "XBEE_MANUFACTURER_ID");
		addEEnumLiteral(xbeE_MANUFACTURER_IDEEnum, net.sf.smbt.xbee.XBEE_MANUFACTURER_ID.XSTREAM);
		addEEnumLiteral(xbeE_MANUFACTURER_IDEEnum, net.sf.smbt.xbee.XBEE_MANUFACTURER_ID.XBEE);

		// Create resource
		createResource(eNS_URI);
	}

} //XbeePackageImpl
