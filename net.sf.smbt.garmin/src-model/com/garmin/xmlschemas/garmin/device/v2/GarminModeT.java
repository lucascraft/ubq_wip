/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Garmin Mode T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getMemoryRegion <em>Memory Region</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getGarminModeT()
 * @model extendedMetaData="name='GarminMode_t' kind='elementOnly'"
 * @generated
 */
public interface GarminModeT extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference.
	 * @see #setProtocols(ProtocolsT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getGarminModeT_Protocols()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Protocols' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolsT getProtocols();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getProtocols <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocols</em>' containment reference.
	 * @see #getProtocols()
	 * @generated
	 */
	void setProtocols(ProtocolsT value);

	/**
	 * Returns the value of the '<em><b>Memory Region</b></em>' containment reference list.
	 * The list contents are of type {@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Region</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Region</em>' containment reference list.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getGarminModeT_MemoryRegion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MemoryRegion' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MemoryRegionT> getMemoryRegion();

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getGarminModeT_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsT getExtensions();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsT value);

} // GarminModeT
