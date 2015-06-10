/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmqtt;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmqtt.EzmqttFactory
 * @model kind="package"
 * @generated
 */
public interface EzmqttPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezmqtt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezmqtt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezmqtt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmqttPackage eINSTANCE = net.sf.smbt.ezmqtt.impl.EzmqttPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmqtt.impl.MqttCmdImpl <em>Mqtt Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmqtt.impl.MqttCmdImpl
	 * @see net.sf.smbt.ezmqtt.impl.EzmqttPackageImpl#getMqttCmd()
	 * @generated
	 */
	int MQTT_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The number of structural features of the '<em>Mqtt Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmqtt.impl.MqttMessageCmdImpl <em>Mqtt Message Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmqtt.impl.MqttMessageCmdImpl
	 * @see net.sf.smbt.ezmqtt.impl.EzmqttPackageImpl#getMqttMessageCmd()
	 * @generated
	 */
	int MQTT_MESSAGE_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_MESSAGE_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_MESSAGE_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The number of structural features of the '<em>Mqtt Message Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_MESSAGE_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmqtt.impl.MqttDeliveryTokenCmdImpl <em>Mqtt Delivery Token Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmqtt.impl.MqttDeliveryTokenCmdImpl
	 * @see net.sf.smbt.ezmqtt.impl.EzmqttPackageImpl#getMqttDeliveryTokenCmd()
	 * @generated
	 */
	int MQTT_DELIVERY_TOKEN_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DELIVERY_TOKEN_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DELIVERY_TOKEN_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The number of structural features of the '<em>Mqtt Delivery Token Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MQTT_DELIVERY_TOKEN_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmqtt.MqttCmd <em>Mqtt Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mqtt Cmd</em>'.
	 * @see net.sf.smbt.ezmqtt.MqttCmd
	 * @generated
	 */
	EClass getMqttCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmqtt.MqttMessageCmd <em>Mqtt Message Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mqtt Message Cmd</em>'.
	 * @see net.sf.smbt.ezmqtt.MqttMessageCmd
	 * @generated
	 */
	EClass getMqttMessageCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmqtt.MqttDeliveryTokenCmd <em>Mqtt Delivery Token Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mqtt Delivery Token Cmd</em>'.
	 * @see net.sf.smbt.ezmqtt.MqttDeliveryTokenCmd
	 * @generated
	 */
	EClass getMqttDeliveryTokenCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzmqttFactory getEzmqttFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmqtt.impl.MqttCmdImpl <em>Mqtt Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmqtt.impl.MqttCmdImpl
		 * @see net.sf.smbt.ezmqtt.impl.EzmqttPackageImpl#getMqttCmd()
		 * @generated
		 */
		EClass MQTT_CMD = eINSTANCE.getMqttCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmqtt.impl.MqttMessageCmdImpl <em>Mqtt Message Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmqtt.impl.MqttMessageCmdImpl
		 * @see net.sf.smbt.ezmqtt.impl.EzmqttPackageImpl#getMqttMessageCmd()
		 * @generated
		 */
		EClass MQTT_MESSAGE_CMD = eINSTANCE.getMqttMessageCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmqtt.impl.MqttDeliveryTokenCmdImpl <em>Mqtt Delivery Token Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmqtt.impl.MqttDeliveryTokenCmdImpl
		 * @see net.sf.smbt.ezmqtt.impl.EzmqttPackageImpl#getMqttDeliveryTokenCmd()
		 * @generated
		 */
		EClass MQTT_DELIVERY_TOKEN_CMD = eINSTANCE.getMqttDeliveryTokenCmd();

	}

} //EzmqttPackage
