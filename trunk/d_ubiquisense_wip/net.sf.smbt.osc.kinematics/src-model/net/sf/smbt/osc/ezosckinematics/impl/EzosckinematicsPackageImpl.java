/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ezosckinematics.impl;

import net.sf.smbt.osc.ezosckinematics.EzosckinematicsFactory;
import net.sf.smbt.osc.ezosckinematics.EzosckinematicsPackage;
import net.sf.smbt.osc.ezosckinematics.KinematicsCmd;
import net.sf.smbt.osc.ezosckinematics.KinematicsRcvCmd;
import net.sf.smbt.osc.ezosckinematics.KinematicsSndCmd;
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
public class EzosckinematicsPackageImpl extends EPackageImpl implements EzosckinematicsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinematicsCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinematicsSndCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kinematicsRcvCmdEClass = null;

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
	 * @see net.sf.smbt.osc.ezosckinematics.EzosckinematicsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzosckinematicsPackageImpl() {
		super(eNS_URI, EzosckinematicsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzosckinematicsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzosckinematicsPackage init() {
		if (isInited) return (EzosckinematicsPackage)EPackage.Registry.INSTANCE.getEPackage(EzosckinematicsPackage.eNS_URI);

		// Obtain or create and register package
		EzosckinematicsPackageImpl theEzosckinematicsPackage = (EzosckinematicsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzosckinematicsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzosckinematicsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzosckinematicsPackage.createPackageContents();

		// Initialize created meta-data
		theEzosckinematicsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzosckinematicsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzosckinematicsPackage.eNS_URI, theEzosckinematicsPackage);
		return theEzosckinematicsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKinematicsCmd() {
		return kinematicsCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKinematicsSndCmd() {
		return kinematicsSndCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKinematicsRcvCmd() {
		return kinematicsRcvCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzosckinematicsFactory getEzosckinematicsFactory() {
		return (EzosckinematicsFactory)getEFactoryInstance();
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
		kinematicsCmdEClass = createEClass(KINEMATICS_CMD);

		kinematicsSndCmdEClass = createEClass(KINEMATICS_SND_CMD);

		kinematicsRcvCmdEClass = createEClass(KINEMATICS_RCV_CMD);
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
		kinematicsCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		kinematicsSndCmdEClass.getESuperTypes().add(this.getKinematicsCmd());
		kinematicsRcvCmdEClass.getESuperTypes().add(this.getKinematicsCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(kinematicsCmdEClass, KinematicsCmd.class, "KinematicsCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kinematicsSndCmdEClass, KinematicsSndCmd.class, "KinematicsSndCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kinematicsRcvCmdEClass, KinematicsRcvCmd.class, "KinematicsRcvCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzosckinematicsPackageImpl
