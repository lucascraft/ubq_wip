/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlock Code T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A unlock code and it's comment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getCode <em>Code</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUnlockCodeT()
 * @model extendedMetaData="name='UnlockCode_t' kind='elementOnly'"
 * @generated
 */
public interface UnlockCodeT extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUnlockCodeT_Code()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.CodeT" required="true"
	 *        extendedMetaData="kind='element' name='Code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getUnlockCodeT_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // UnlockCodeT
