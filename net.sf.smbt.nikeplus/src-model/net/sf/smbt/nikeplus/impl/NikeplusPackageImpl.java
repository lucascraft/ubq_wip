/**
 */
package net.sf.smbt.nikeplus.impl;

import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

import net.sf.smbt.nikeplus.NikeplusCmd;
import net.sf.smbt.nikeplus.NikeplusFactory;
import net.sf.smbt.nikeplus.NikeplusPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NikeplusPackageImpl extends EPackageImpl implements NikeplusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nikeplusCmdEClass = null;

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
	 * @see net.sf.smbt.nikeplus.NikeplusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NikeplusPackageImpl() {
		super(eNS_URI, NikeplusFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NikeplusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NikeplusPackage init() {
		if (isInited) return (NikeplusPackage)EPackage.Registry.INSTANCE.getEPackage(NikeplusPackage.eNS_URI);

		// Obtain or create and register package
		NikeplusPackageImpl theNikeplusPackage = (NikeplusPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NikeplusPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NikeplusPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNikeplusPackage.createPackageContents();

		// Initialize created meta-data
		theNikeplusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNikeplusPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NikeplusPackage.eNS_URI, theNikeplusPackage);
		return theNikeplusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNikeplusCmd() {
		return nikeplusCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NikeplusFactory getNikeplusFactory() {
		return (NikeplusFactory)getEFactoryInstance();
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
		nikeplusCmdEClass = createEClass(NIKEPLUS_CMD);
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
		HttpcmdPackage theHttpcmdPackage = (HttpcmdPackage)EPackage.Registry.INSTANCE.getEPackage(HttpcmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nikeplusCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(nikeplusCmdEClass, NikeplusCmd.class, "NikeplusCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //NikeplusPackageImpl
