/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getName <em>Name</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getFile <em>File</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDataTypeT()
 * @model extendedMetaData="name='DataType_t' kind='elementOnly'"
 * @generated
 */
public interface DataTypeT extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDataTypeT_Name()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.NonZeroTokenT" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link com.garmin.xmlschemas.garmin.device.v2.FileT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDataTypeT_File()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FileT> getFile();

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDataTypeT_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsT getExtensions();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsT value);

} // DataTypeT
