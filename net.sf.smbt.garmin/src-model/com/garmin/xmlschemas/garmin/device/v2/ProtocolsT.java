/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocols T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A list of supported protocols and associated data types. This list shows the features a pda supports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getLink <em>Link</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getApplication <em>Application</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getTransport <em>Transport</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getProtocolsT()
 * @model extendedMetaData="name='Protocols_t' kind='elementOnly'"
 * @generated
 */
public interface ProtocolsT extends EObject {
	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(ProtocolT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getProtocolsT_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolT getLink();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(ProtocolT value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' containment reference list.
	 * The list contents are of type {@link com.garmin.xmlschemas.garmin.device.v2.AppProtocolT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' containment reference list.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getProtocolsT_Application()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Application' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AppProtocolT> getApplication();

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' containment reference.
	 * @see #setTransport(ProtocolT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getProtocolsT_Transport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Transport' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolT getTransport();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getTransport <em>Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' containment reference.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(ProtocolT value);

} // ProtocolsT
