/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecomm.impl;

import net.sf.smbt.xbeecomm.XbeePort;
import net.sf.smbt.xbeecomm.XbeecommFactory;
import net.sf.smbt.xbeecomm.XbeecommPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XbeecommPackageImpl extends EPackageImpl implements XbeecommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xbeePortEClass = null;

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
	 * @see net.sf.smbt.xbeecomm.XbeecommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XbeecommPackageImpl() {
		super(eNS_URI, XbeecommFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XbeecommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XbeecommPackage init() {
		if (isInited) return (XbeecommPackage)EPackage.Registry.INSTANCE.getEPackage(XbeecommPackage.eNS_URI);

		// Obtain or create and register package
		XbeecommPackageImpl theXbeecommPackage = (XbeecommPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XbeecommPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XbeecommPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXbeecommPackage.createPackageContents();

		// Initialize created meta-data
		theXbeecommPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXbeecommPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XbeecommPackage.eNS_URI, theXbeecommPackage);
		return theXbeecommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXbeePort() {
		return xbeePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecommFactory getXbeecommFactory() {
		return (XbeecommFactory)getEFactoryInstance();
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
		xbeePortEClass = createEClass(XBEE_PORT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xbeePortEClass.getESuperTypes().add(theEnginePackage.getPort());

		// Initialize classes and features; add operations and parameters
		initEClass(xbeePortEClass, XbeePort.class, "XbeePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XbeecommPackageImpl
