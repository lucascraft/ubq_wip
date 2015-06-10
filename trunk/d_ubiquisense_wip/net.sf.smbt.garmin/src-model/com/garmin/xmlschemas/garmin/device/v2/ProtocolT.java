/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A protocol number.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolT#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getProtocolT()
 * @model extendedMetaData="name='Protocol_t' kind='empty'"
 * @generated
 */
public interface ProtocolT extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(int)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getProtocolT_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedShort" required="true"
	 *        extendedMetaData="kind='attribute' name='Id'"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolT#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolT#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolT#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(int)
	 * @generated
	 */
	boolean isSetId();

} // ProtocolT
