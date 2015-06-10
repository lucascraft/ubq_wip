/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosccmd.impl;

import net.sf.smbt.osccmd.OsccmdPackage;

import net.sf.smbt.touchosc.touchosccmd.TouchOscCmd;
import net.sf.smbt.touchosc.touchosccmd.TouchosccmdFactory;
import net.sf.smbt.touchosc.touchosccmd.TouchosccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchosccmdPackageImpl extends EPackageImpl implements TouchosccmdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscCmdEClass = null;

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
	 * @see net.sf.smbt.touchosc.touchosccmd.TouchosccmdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TouchosccmdPackageImpl() {
		super(eNS_URI, TouchosccmdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TouchosccmdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TouchosccmdPackage init() {
		if (isInited) return (TouchosccmdPackage)EPackage.Registry.INSTANCE.getEPackage(TouchosccmdPackage.eNS_URI);

		// Obtain or create and register package
		TouchosccmdPackageImpl theTouchosccmdPackage = (TouchosccmdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TouchosccmdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TouchosccmdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTouchosccmdPackage.createPackageContents();

		// Initialize created meta-data
		theTouchosccmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTouchosccmdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TouchosccmdPackage.eNS_URI, theTouchosccmdPackage);
		return theTouchosccmdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscCmd() {
		return touchOscCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchosccmdFactory getTouchosccmdFactory() {
		return (TouchosccmdFactory)getEFactoryInstance();
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
		touchOscCmdEClass = createEClass(TOUCH_OSC_CMD);
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
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		touchOscCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(touchOscCmdEClass, TouchOscCmd.class, "TouchOscCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TouchosccmdPackageImpl
