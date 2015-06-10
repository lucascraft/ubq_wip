/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.wiimotectrl.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;
import net.sf.smbt.wiimotectrl.WiimoteController;
import net.sf.smbt.wiimotectrl.WiimotectrlFactory;
import net.sf.smbt.wiimotectrl.WiimotectrlPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WiimotectrlPackageImpl extends EPackageImpl implements WiimotectrlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiimoteControllerEClass = null;

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
	 * @see net.sf.smbt.wiimotectrl.WiimotectrlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WiimotectrlPackageImpl() {
		super(eNS_URI, WiimotectrlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WiimotectrlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WiimotectrlPackage init() {
		if (isInited) return (WiimotectrlPackage)EPackage.Registry.INSTANCE.getEPackage(WiimotectrlPackage.eNS_URI);

		// Obtain or create and register package
		WiimotectrlPackageImpl theWiimotectrlPackage = (WiimotectrlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WiimotectrlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WiimotectrlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EnginePackage.eINSTANCE.eClass();
		WiimotePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWiimotectrlPackage.createPackageContents();

		// Initialize created meta-data
		theWiimotectrlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWiimotectrlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WiimotectrlPackage.eNS_URI, theWiimotectrlPackage);
		return theWiimotectrlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiimoteController() {
		return wiimoteControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiimoteController_Wiiid() {
		return (EAttribute)wiimoteControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiimoteController_Addr() {
		return (EAttribute)wiimoteControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteController_Properties() {
		return (EReference)wiimoteControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimotectrlFactory getWiimotectrlFactory() {
		return (WiimotectrlFactory)getEFactoryInstance();
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
		wiimoteControllerEClass = createEClass(WIIMOTE_CONTROLLER);
		createEAttribute(wiimoteControllerEClass, WIIMOTE_CONTROLLER__WIIID);
		createEAttribute(wiimoteControllerEClass, WIIMOTE_CONTROLLER__ADDR);
		createEReference(wiimoteControllerEClass, WIIMOTE_CONTROLLER__PROPERTIES);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		WiimotePackage theWiimotePackage = (WiimotePackage)EPackage.Registry.INSTANCE.getEPackage(WiimotePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wiimoteControllerEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(wiimoteControllerEClass, WiimoteController.class, "WiimoteController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiimoteController_Wiiid(), ecorePackage.getEString(), "wiiid", null, 0, 1, WiimoteController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiimoteController_Addr(), theEcorePackage.getEString(), "addr", null, 0, 1, WiimoteController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteController_Properties(), theWiimotePackage.getWiimoteLiveSettings(), null, "properties", null, 0, 1, WiimoteController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //WiimotectrlPackageImpl
