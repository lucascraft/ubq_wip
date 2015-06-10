/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Product information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getSoftwareVersion <em>Software Version</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getDescription <em>Description</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getModelT()
 * @model extendedMetaData="name='Model_t' kind='elementOnly'"
 * @generated
 */
public interface ModelT extends EObject {
	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Number</em>' attribute.
	 * @see #setPartNumber(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getModelT_PartNumber()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.PartNumberT" required="true"
	 *        extendedMetaData="kind='element' name='PartNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Software Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Version</em>' attribute.
	 * @see #isSetSoftwareVersion()
	 * @see #unsetSoftwareVersion()
	 * @see #setSoftwareVersion(int)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getModelT_SoftwareVersion()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort" required="true"
	 *        extendedMetaData="kind='element' name='SoftwareVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	int getSoftwareVersion();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getSoftwareVersion <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Version</em>' attribute.
	 * @see #isSetSoftwareVersion()
	 * @see #unsetSoftwareVersion()
	 * @see #getSoftwareVersion()
	 * @generated
	 */
	void setSoftwareVersion(int value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getSoftwareVersion <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoftwareVersion()
	 * @see #getSoftwareVersion()
	 * @see #setSoftwareVersion(int)
	 * @generated
	 */
	void unsetSoftwareVersion();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getSoftwareVersion <em>Software Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Software Version</em>' attribute is set.
	 * @see #unsetSoftwareVersion()
	 * @see #getSoftwareVersion()
	 * @see #setSoftwareVersion(int)
	 * @generated
	 */
	boolean isSetSoftwareVersion();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getModelT_Description()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.NonZeroTokenT" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getModelT_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsT getExtensions();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsT value);

} // ModelT
