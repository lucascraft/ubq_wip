/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getSpecificationT()
 * @model extendedMetaData="name='Specification_t' kind='elementOnly'"
 * @generated
 */
public interface SpecificationT extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for the type of data contained in this file, e.g. "MP3". If the file is XML and has an associated XML Schema put the namespace of the schema here.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getSpecificationT_Identifier()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.NonZeroTokenT"
	 *        extendedMetaData="kind='element' name='Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A URI pointing to documentation for this file type. If the file has an XML Schema this should be the location of the schema document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getSpecificationT_Documentation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='Documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // SpecificationT
