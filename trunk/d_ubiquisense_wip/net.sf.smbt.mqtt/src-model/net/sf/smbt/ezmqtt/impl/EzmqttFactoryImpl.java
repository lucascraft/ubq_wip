/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmqtt.impl;

import net.sf.smbt.ezmqtt.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmqttFactoryImpl extends EFactoryImpl implements EzmqttFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzmqttFactory init() {
		try {
			EzmqttFactory theEzmqttFactory = (EzmqttFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezmqtt/1.0"); 
			if (theEzmqttFactory != null) {
				return theEzmqttFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzmqttFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmqttFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzmqttPackage.MQTT_CMD: return createMqttCmd();
			case EzmqttPackage.MQTT_MESSAGE_CMD: return createMqttMessageCmd();
			case EzmqttPackage.MQTT_DELIVERY_TOKEN_CMD: return createMqttDeliveryTokenCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MqttCmd createMqttCmd() {
		MqttCmdImpl mqttCmd = new MqttCmdImpl();
		return mqttCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MqttMessageCmd createMqttMessageCmd() {
		MqttMessageCmdImpl mqttMessageCmd = new MqttMessageCmdImpl();
		return mqttMessageCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MqttDeliveryTokenCmd createMqttDeliveryTokenCmd() {
		MqttDeliveryTokenCmdImpl mqttDeliveryTokenCmd = new MqttDeliveryTokenCmdImpl();
		return mqttDeliveryTokenCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmqttPackage getEzmqttPackage() {
		return (EzmqttPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzmqttPackage getPackage() {
		return EzmqttPackage.eINSTANCE;
	}

} //EzmqttFactoryImpl
