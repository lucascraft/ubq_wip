/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ofx3nity.impl;

import net.sf.smbt.osc.ofx3nity.Ofx3RcvCmd;
import net.sf.smbt.osc.ofx3nity.Ofx3SndCmd;
import net.sf.smbt.osc.ofx3nity.Ofx3nityFactory;
import net.sf.smbt.osc.ofx3nity.Ofx3nityPackage;
import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Ofx3nityPackageImpl extends EPackageImpl implements Ofx3nityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ofx3RcvCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ofx3SndCmdEClass = null;

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
	 * @see net.sf.smbt.osc.ofx3nity.Ofx3nityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Ofx3nityPackageImpl() {
		super(eNS_URI, Ofx3nityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Ofx3nityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Ofx3nityPackage init() {
		if (isInited) return (Ofx3nityPackage)EPackage.Registry.INSTANCE.getEPackage(Ofx3nityPackage.eNS_URI);

		// Obtain or create and register package
		Ofx3nityPackageImpl theOfx3nityPackage = (Ofx3nityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Ofx3nityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Ofx3nityPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOfx3nityPackage.createPackageContents();

		// Initialize created meta-data
		theOfx3nityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOfx3nityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Ofx3nityPackage.eNS_URI, theOfx3nityPackage);
		return theOfx3nityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfx3RcvCmd() {
		return ofx3RcvCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfx3SndCmd() {
		return ofx3SndCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ofx3nityFactory getOfx3nityFactory() {
		return (Ofx3nityFactory)getEFactoryInstance();
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
		ofx3RcvCmdEClass = createEClass(OFX3_RCV_CMD);

		ofx3SndCmdEClass = createEClass(OFX3_SND_CMD);
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
		ofx3RcvCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		ofx3SndCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscSndCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(ofx3RcvCmdEClass, Ofx3RcvCmd.class, "Ofx3RcvCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ofx3SndCmdEClass, Ofx3SndCmd.class, "Ofx3SndCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Ofx3nityPackageImpl
