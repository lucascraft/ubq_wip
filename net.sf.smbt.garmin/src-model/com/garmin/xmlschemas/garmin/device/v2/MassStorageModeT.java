/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mass Storage Mode T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getUpdateFile <em>Update File</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMassStorageModeT()
 * @model extendedMetaData="name='MassStorageMode_t' kind='elementOnly'"
 * @generated
 */
public interface MassStorageModeT extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference list.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMassStorageModeT_DataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataTypeT> getDataType();

	/**
	 * Returns the value of the '<em><b>Update File</b></em>' containment reference list.
	 * The list contents are of type {@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update File</em>' containment reference list.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMassStorageModeT_UpdateFile()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UpdateFile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UpdateFileT> getUpdateFile();

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMassStorageModeT_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsT getExtensions();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsT value);

} // MassStorageModeT
