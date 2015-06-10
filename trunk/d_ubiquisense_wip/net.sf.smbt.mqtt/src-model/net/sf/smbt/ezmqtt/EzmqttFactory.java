/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmqtt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmqtt.EzmqttPackage
 * @generated
 */
public interface EzmqttFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmqttFactory eINSTANCE = net.sf.smbt.ezmqtt.impl.EzmqttFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mqtt Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mqtt Cmd</em>'.
	 * @generated
	 */
	MqttCmd createMqttCmd();

	/**
	 * Returns a new object of class '<em>Mqtt Message Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mqtt Message Cmd</em>'.
	 * @generated
	 */
	MqttMessageCmd createMqttMessageCmd();

	/**
	 * Returns a new object of class '<em>Mqtt Delivery Token Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mqtt Delivery Token Cmd</em>'.
	 * @generated
	 */
	MqttDeliveryTokenCmd createMqttDeliveryTokenCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzmqttPackage getEzmqttPackage();

} //EzmqttFactory
