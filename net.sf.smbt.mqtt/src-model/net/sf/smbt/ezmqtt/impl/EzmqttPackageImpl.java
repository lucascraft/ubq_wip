/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmqtt.impl;

import net.sf.smbt.ezmqtt.EzmqttFactory;
import net.sf.smbt.ezmqtt.EzmqttPackage;
import net.sf.smbt.ezmqtt.MqttCmd;
import net.sf.smbt.ezmqtt.MqttDeliveryTokenCmd;
import net.sf.smbt.ezmqtt.MqttMessageCmd;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmqttPackageImpl extends EPackageImpl implements EzmqttPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttMessageCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mqttDeliveryTokenCmdEClass = null;

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
	 * @see net.sf.smbt.ezmqtt.EzmqttPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzmqttPackageImpl() {
		super(eNS_URI, EzmqttFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzmqttPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzmqttPackage init() {
		if (isInited) return (EzmqttPackage)EPackage.Registry.INSTANCE.getEPackage(EzmqttPackage.eNS_URI);

		// Obtain or create and register package
		EzmqttPackageImpl theEzmqttPackage = (EzmqttPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzmqttPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzmqttPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzmqttPackage.createPackageContents();

		// Initialize created meta-data
		theEzmqttPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzmqttPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzmqttPackage.eNS_URI, theEzmqttPackage);
		return theEzmqttPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMqttCmd() {
		return mqttCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMqttMessageCmd() {
		return mqttMessageCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMqttDeliveryTokenCmd() {
		return mqttDeliveryTokenCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmqttFactory getEzmqttFactory() {
		return (EzmqttFactory)getEFactoryInstance();
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
		mqttCmdEClass = createEClass(MQTT_CMD);

		mqttMessageCmdEClass = createEClass(MQTT_MESSAGE_CMD);

		mqttDeliveryTokenCmdEClass = createEClass(MQTT_DELIVERY_TOKEN_CMD);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mqttCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		mqttMessageCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		mqttDeliveryTokenCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(mqttCmdEClass, MqttCmd.class, "MqttCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mqttMessageCmdEClass, MqttMessageCmd.class, "MqttMessageCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mqttDeliveryTokenCmdEClass, MqttDeliveryTokenCmd.class, "MqttDeliveryTokenCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzmqttPackageImpl
