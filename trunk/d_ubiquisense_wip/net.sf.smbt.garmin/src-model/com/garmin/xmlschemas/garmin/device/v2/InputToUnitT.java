/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input To Unit T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getSpecification <em>Specification</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getInputToUnitT()
 * @model extendedMetaData="name='InputToUnit_t' kind='elementOnly'"
 * @generated
 */
public interface InputToUnitT extends EObject {
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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getInputToUnitT_Specification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Specification' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecificationT getSpecification();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SpecificationT value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(FileT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getInputToUnitT_File()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='File' namespace='##targetNamespace'"
	 * @generated
	 */
	FileT getFile();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(FileT value);

} // InputToUnitT
