/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.ezlemur.AbstractLemurOscCmd;
import net.sf.smbt.ezlemur.EzlemurFactory;
import net.sf.smbt.ezlemur.EzlemurPackage;
import net.sf.smbt.ezlemur.LemurDmxCmd;
import net.sf.smbt.ezlemur.LemurMidiCmd;
import net.sf.smbt.ezlemur.LemurOscCmd;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.impl.JzmuiPackageImpl;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

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
public class EzlemurPackageImpl extends EPackageImpl implements EzlemurPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lemurOscCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lemurMidiCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lemurDmxCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLemurOscCmdEClass = null;

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
	 * @see net.sf.smbt.ezlemur.EzlemurPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzlemurPackageImpl() {
		super(eNS_URI, EzlemurFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzlemurPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzlemurPackage init() {
		if (isInited) return (EzlemurPackage)EPackage.Registry.INSTANCE.getEPackage(EzlemurPackage.eNS_URI);

		// Obtain or create and register package
		EzlemurPackageImpl theEzlemurPackage = (EzlemurPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzlemurPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzlemurPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzdmxPackage.eINSTANCE.eClass();
		EzmidiPackage.eINSTANCE.eClass();
		OsccmdPackage.eINSTANCE.eClass();
		EnginePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		JzmuiPackageImpl theJzmuiPackage = (JzmuiPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(JzmuiPackage.eNS_URI) instanceof JzmuiPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(JzmuiPackage.eNS_URI) : JzmuiPackage.eINSTANCE);

		// Create package meta-data objects
		theEzlemurPackage.createPackageContents();
		theJzmuiPackage.createPackageContents();

		// Initialize created meta-data
		theEzlemurPackage.initializePackageContents();
		theJzmuiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzlemurPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzlemurPackage.eNS_URI, theEzlemurPackage);
		return theEzlemurPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLemurOscCmd() {
		return lemurOscCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLemurMidiCmd() {
		return lemurMidiCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLemurDmxCmd() {
		return lemurDmxCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractLemurOscCmd() {
		return abstractLemurOscCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractLemurOscCmd_Target() {
		return (EReference)abstractLemurOscCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzlemurFactory getEzlemurFactory() {
		return (EzlemurFactory)getEFactoryInstance();
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
		lemurOscCmdEClass = createEClass(LEMUR_OSC_CMD);

		lemurMidiCmdEClass = createEClass(LEMUR_MIDI_CMD);

		lemurDmxCmdEClass = createEClass(LEMUR_DMX_CMD);

		abstractLemurOscCmdEClass = createEClass(ABSTRACT_LEMUR_OSC_CMD);
		createEReference(abstractLemurOscCmdEClass, ABSTRACT_LEMUR_OSC_CMD__TARGET);
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
		EzmidiPackage theEzmidiPackage = (EzmidiPackage)EPackage.Registry.INSTANCE.getEPackage(EzmidiPackage.eNS_URI);
		EzdmxPackage theEzdmxPackage = (EzdmxPackage)EPackage.Registry.INSTANCE.getEPackage(EzdmxPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lemurOscCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		lemurOscCmdEClass.getESuperTypes().add(this.getAbstractLemurOscCmd());
		lemurMidiCmdEClass.getESuperTypes().add(theEzmidiPackage.getAbstractMidiCmd());
		lemurMidiCmdEClass.getESuperTypes().add(this.getAbstractLemurOscCmd());
		lemurDmxCmdEClass.getESuperTypes().add(theEzdmxPackage.getOpenDMXCmd());
		lemurDmxCmdEClass.getESuperTypes().add(this.getAbstractLemurOscCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(lemurOscCmdEClass, LemurOscCmd.class, "LemurOscCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lemurMidiCmdEClass, LemurMidiCmd.class, "LemurMidiCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lemurDmxCmdEClass, LemurDmxCmd.class, "LemurDmxCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractLemurOscCmdEClass, AbstractLemurOscCmd.class, "AbstractLemurOscCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractLemurOscCmd_Target(), theEcorePackage.getEStructuralFeature(), null, "target", null, 0, 1, AbstractLemurOscCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EzlemurPackageImpl
