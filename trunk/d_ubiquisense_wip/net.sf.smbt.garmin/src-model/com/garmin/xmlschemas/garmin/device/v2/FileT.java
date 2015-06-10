/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getSpecification <em>Specification</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getLocation <em>Location</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getTransferDirection <em>Transfer Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getFileT()
 * @model extendedMetaData="name='File_t' kind='elementOnly'"
 * @generated
 */
public interface FileT extends EObject {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(SpecificationT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getFileT_Specification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Specification' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificationT getSpecification();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SpecificationT value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getFileT_Location()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationT getLocation();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationT value);

	/**
	 * Returns the value of the '<em><b>Transfer Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Direction</em>' attribute.
	 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
	 * @see #isSetTransferDirection()
	 * @see #unsetTransferDirection()
	 * @see #setTransferDirection(TransferDirectionT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getFileT_TransferDirection()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TransferDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	TransferDirectionT getTransferDirection();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getTransferDirection <em>Transfer Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Direction</em>' attribute.
	 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
	 * @see #isSetTransferDirection()
	 * @see #unsetTransferDirection()
	 * @see #getTransferDirection()
	 * @generated
	 */
	void setTransferDirection(TransferDirectionT value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getTransferDirection <em>Transfer Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransferDirection()
	 * @see #getTransferDirection()
	 * @see #setTransferDirection(TransferDirectionT)
	 * @generated
	 */
	void unsetTransferDirection();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getTransferDirection <em>Transfer Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transfer Direction</em>' attribute is set.
	 * @see #unsetTransferDirection()
	 * @see #getTransferDirection()
	 * @see #setTransferDirection(TransferDirectionT)
	 * @generated
	 */
	boolean isSetTransferDirection();

} // FileT
