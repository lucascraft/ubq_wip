/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmqtt.impl;

import net.sf.smbt.ezmqtt.EzmqttPackage;
import net.sf.smbt.ezmqtt.MqttCmd;

import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mqtt Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MqttCmdImpl extends CmdImpl implements MqttCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MqttCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmqttPackage.Literals.MQTT_CMD;
	}

} //MqttCmdImpl
