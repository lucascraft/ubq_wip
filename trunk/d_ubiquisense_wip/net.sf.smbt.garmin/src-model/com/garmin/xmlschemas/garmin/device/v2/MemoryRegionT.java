/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Region T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getId <em>Id</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getVersion <em>Version</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getDescription <em>Description</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsErased <em>Is Erased</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsRemoved <em>Is Removed</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsUserUpdateable <em>Is User Updateable</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT()
 * @model extendedMetaData="name='MemoryRegion_t' kind='elementOnly'"
 * @generated
 */
public interface MemoryRegionT extends EObject {
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
	 * @see #setId(short)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedByte" required="true"
	 *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
	 * @generated
	 */
	short getId();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(short value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(short)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(short)
	 * @generated
	 */
	boolean isSetId();

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Version' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionT getVersion();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getVersion <em>Version</em>}' containment reference.
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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_PartNumber()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.PartNumberT"
	 *        extendedMetaData="kind='element' name='PartNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPartNumber();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getPartNumber <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' attribute.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(String value);

	/**
	 * Returns the value of the '<em><b>Is Erased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Erased</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Erased</em>' attribute.
	 * @see #isSetIsErased()
	 * @see #unsetIsErased()
	 * @see #setIsErased(boolean)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_IsErased()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsErased' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsErased();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsErased <em>Is Erased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Erased</em>' attribute.
	 * @see #isSetIsErased()
	 * @see #unsetIsErased()
	 * @see #isIsErased()
	 * @generated
	 */
	void setIsErased(boolean value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsErased <em>Is Erased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsErased()
	 * @see #isIsErased()
	 * @see #setIsErased(boolean)
	 * @generated
	 */
	void unsetIsErased();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsErased <em>Is Erased</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Erased</em>' attribute is set.
	 * @see #unsetIsErased()
	 * @see #isIsErased()
	 * @see #setIsErased(boolean)
	 * @generated
	 */
	boolean isSetIsErased();

	/**
	 * Returns the value of the '<em><b>Is Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Removed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Removed</em>' attribute.
	 * @see #isSetIsRemoved()
	 * @see #unsetIsRemoved()
	 * @see #setIsRemoved(boolean)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_IsRemoved()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsRemoved' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsRemoved();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsRemoved <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Removed</em>' attribute.
	 * @see #isSetIsRemoved()
	 * @see #unsetIsRemoved()
	 * @see #isIsRemoved()
	 * @generated
	 */
	void setIsRemoved(boolean value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsRemoved <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRemoved()
	 * @see #isIsRemoved()
	 * @see #setIsRemoved(boolean)
	 * @generated
	 */
	void unsetIsRemoved();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsRemoved <em>Is Removed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Removed</em>' attribute is set.
	 * @see #unsetIsRemoved()
	 * @see #isIsRemoved()
	 * @see #setIsRemoved(boolean)
	 * @generated
	 */
	boolean isSetIsRemoved();

	/**
	 * Returns the value of the '<em><b>Is User Updateable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is User Updateable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is User Updateable</em>' attribute.
	 * @see #isSetIsUserUpdateable()
	 * @see #unsetIsUserUpdateable()
	 * @see #setIsUserUpdateable(boolean)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_IsUserUpdateable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsUserUpdateable' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsUserUpdateable();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsUserUpdateable <em>Is User Updateable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is User Updateable</em>' attribute.
	 * @see #isSetIsUserUpdateable()
	 * @see #unsetIsUserUpdateable()
	 * @see #isIsUserUpdateable()
	 * @generated
	 */
	void setIsUserUpdateable(boolean value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsUserUpdateable <em>Is User Updateable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsUserUpdateable()
	 * @see #isIsUserUpdateable()
	 * @see #setIsUserUpdateable(boolean)
	 * @generated
	 */
	void unsetIsUserUpdateable();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsUserUpdateable <em>Is User Updateable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is User Updateable</em>' attribute is set.
	 * @see #unsetIsUserUpdateable()
	 * @see #isIsUserUpdateable()
	 * @see #setIsUserUpdateable(boolean)
	 * @generated
	 */
	boolean isSetIsUserUpdateable();

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getMemoryRegionT_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsT getExtensions();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsT value);

} // MemoryRegionT
