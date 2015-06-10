/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMajor <em>Major</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMinor <em>Minor</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getVersionT()
 * @model extendedMetaData="name='Version_t' kind='elementOnly'"
 * @generated
 */
public interface VersionT extends EObject {
	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #isSetMajor()
	 * @see #unsetMajor()
	 * @see #setMajor(int)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getVersionT_Major()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort" required="true"
	 *        extendedMetaData="kind='element' name='Major' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #isSetMajor()
	 * @see #unsetMajor()
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMajor()
	 * @see #getMajor()
	 * @see #setMajor(int)
	 * @generated
	 */
	void unsetMajor();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMajor <em>Major</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Major</em>' attribute is set.
	 * @see #unsetMajor()
	 * @see #getMajor()
	 * @see #setMajor(int)
	 * @generated
	 */
	boolean isSetMajor();

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #isSetMinor()
	 * @see #unsetMinor()
	 * @see #setMinor(int)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getVersionT_Minor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort" required="true"
	 *        extendedMetaData="kind='element' name='Minor' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
	 * @see #isSetMinor()
	 * @see #unsetMinor()
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(int value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinor()
	 * @see #getMinor()
	 * @see #setMinor(int)
	 * @generated
	 */
	void unsetMinor();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMinor <em>Minor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minor</em>' attribute is set.
	 * @see #unsetMinor()
	 * @see #getMinor()
	 * @see #setMinor(int)
	 * @generated
	 */
	boolean isSetMinor();

} // VersionT
