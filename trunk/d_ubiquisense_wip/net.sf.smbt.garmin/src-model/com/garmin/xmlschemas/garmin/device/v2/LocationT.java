/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getPath <em>Path</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getBaseName <em>Base Name</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getFileExtension <em>File Extension</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getLocationT()
 * @model extendedMetaData="name='Location_t' kind='elementOnly'"
 * @generated
 */
public interface LocationT extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Path is not specified, the file can be at any path on the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getLocationT_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a BaseName is not specified, the file can have any name. BaseName supports the * Wildcard. * matches zero or more characters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Name</em>' attribute.
	 * @see #setBaseName(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getLocationT_BaseName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 *        extendedMetaData="kind='element' name='BaseName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseName();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getBaseName <em>Base Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Name</em>' attribute.
	 * @see #getBaseName()
	 * @generated
	 */
	void setBaseName(String value);

	/**
	 * Returns the value of the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extension</em>' attribute.
	 * @see #setFileExtension(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getLocationT_FileExtension()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token" required="true"
	 *        extendedMetaData="kind='element' name='FileExtension' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileExtension();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getFileExtension <em>File Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Extension</em>' attribute.
	 * @see #getFileExtension()
	 * @generated
	 */
	void setFileExtension(String value);

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getLocationT_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsT getExtensions();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsT value);

} // LocationT
