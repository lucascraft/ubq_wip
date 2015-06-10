/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd.impl;

import net.sf.smbt.at.atcmdset.AtcmdsetPackage;
import net.sf.smbt.xbeecmd.RxResponse16;
import net.sf.smbt.xbeecmd.RxResponse64;
import net.sf.smbt.xbeecmd.TxRequest16;
import net.sf.smbt.xbeecmd.TxRequest64;
import net.sf.smbt.xbeecmd.XBeeAtRcvCmd;
import net.sf.smbt.xbeecmd.XBeeAtSndCmd;
import net.sf.smbt.xbeecmd.XBeeRcvCmd;
import net.sf.smbt.xbeecmd.XBeeSndCmd;
import net.sf.smbt.xbeecmd.XbeecmdFactory;
import net.sf.smbt.xbeecmd.XbeecmdPackage;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XbeecmdPackageImpl extends EPackageImpl implements XbeecmdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeeSndCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeeRcvCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeeAtSndCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeeAtRcvCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass txRequest16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass txRequest64EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rxResponse16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rxResponse64EClass = null;

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
	 * @see net.sf.smbt.xbeecmd.XbeecmdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XbeecmdPackageImpl() {
		super(eNS_URI, XbeecmdFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XbeecmdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XbeecmdPackage init() {
		if (isInited) return (XbeecmdPackage)EPackage.Registry.INSTANCE.getEPackage(XbeecmdPackage.eNS_URI);

		// Obtain or create and register package
		XbeecmdPackageImpl theXbeecmdPackage = (XbeecmdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XbeecmdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XbeecmdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AtcmdsetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXbeecmdPackage.createPackageContents();

		// Initialize created meta-data
		theXbeecmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXbeecmdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XbeecmdPackage.eNS_URI, theXbeecmdPackage);
		return theXbeecmdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeeSndCmd() {
		return xBeeSndCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeeRcvCmd() {
		return xBeeRcvCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeeAtSndCmd() {
		return xBeeAtSndCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXBeeAtSndCmd_AtCmd() {
		return (EReference)xBeeAtSndCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeeAtRcvCmd() {
		return xBeeAtRcvCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXBeeAtRcvCmd_AtCmd() {
		return (EReference)xBeeAtRcvCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTxRequest16() {
		return txRequest16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTxRequest64() {
		return txRequest64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRxResponse16() {
		return rxResponse16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRxResponse64() {
		return rxResponse64EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecmdFactory getXbeecmdFactory() {
		return (XbeecmdFactory)getEFactoryInstance();
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
		xBeeSndCmdEClass = createEClass(XBEE_SND_CMD);

		xBeeRcvCmdEClass = createEClass(XBEE_RCV_CMD);

		xBeeAtSndCmdEClass = createEClass(XBEE_AT_SND_CMD);
		createEReference(xBeeAtSndCmdEClass, XBEE_AT_SND_CMD__AT_CMD);

		xBeeAtRcvCmdEClass = createEClass(XBEE_AT_RCV_CMD);
		createEReference(xBeeAtRcvCmdEClass, XBEE_AT_RCV_CMD__AT_CMD);

		txRequest16EClass = createEClass(TX_REQUEST16);

		txRequest64EClass = createEClass(TX_REQUEST64);

		rxResponse16EClass = createEClass(RX_RESPONSE16);

		rxResponse64EClass = createEClass(RX_RESPONSE64);
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
		AtcmdsetPackage theAtcmdsetPackage = (AtcmdsetPackage)EPackage.Registry.INSTANCE.getEPackage(AtcmdsetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xBeeSndCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		xBeeRcvCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		xBeeAtSndCmdEClass.getESuperTypes().add(this.getXBeeSndCmd());
		xBeeAtRcvCmdEClass.getESuperTypes().add(this.getXBeeRcvCmd());
		txRequest16EClass.getESuperTypes().add(this.getXBeeSndCmd());
		txRequest64EClass.getESuperTypes().add(this.getXBeeSndCmd());
		rxResponse16EClass.getESuperTypes().add(this.getXBeeRcvCmd());
		rxResponse64EClass.getESuperTypes().add(this.getXBeeRcvCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(xBeeSndCmdEClass, XBeeSndCmd.class, "XBeeSndCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xBeeRcvCmdEClass, XBeeRcvCmd.class, "XBeeRcvCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xBeeAtSndCmdEClass, XBeeAtSndCmd.class, "XBeeAtSndCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXBeeAtSndCmd_AtCmd(), theAtcmdsetPackage.getATCmd(), null, "atCmd", null, 0, 1, XBeeAtSndCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xBeeAtRcvCmdEClass, XBeeAtRcvCmd.class, "XBeeAtRcvCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXBeeAtRcvCmd_AtCmd(), theAtcmdsetPackage.getATCmd(), null, "atCmd", null, 0, 1, XBeeAtRcvCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(txRequest16EClass, TxRequest16.class, "TxRequest16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(txRequest64EClass, TxRequest64.class, "TxRequest64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rxResponse16EClass, RxResponse16.class, "RxResponse16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rxResponse64EClass, RxResponse64.class, "RxResponse64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XbeecmdPackageImpl
