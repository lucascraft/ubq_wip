/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update File T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The updates that can be performed on this unit. Includes the system region update.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getVersion <em>Version</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getDescription <em>Description</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPath <em>Path</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUpdateFileT()
 * @model extendedMetaData="name='UpdateFile_t' kind='elementOnly'"
 * @generated
 */
public interface UpdateFileT extends EObject {
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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUpdateFileT_PartNumber()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.PartNumberT" required="true"
	 *        extendedMetaData="kind='element' name='PartNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(VersionT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUpdateFileT_Version()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionT getVersion();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionT value);

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUpdateFileT_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the folder to which the update file needs to be copied. Does not include the FileName or Extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUpdateFileT_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If FileName is specified, the file copied to the device will have this name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUpdateFileT_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 *        extendedMetaData="kind='element' name='FileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // UpdateFileT
