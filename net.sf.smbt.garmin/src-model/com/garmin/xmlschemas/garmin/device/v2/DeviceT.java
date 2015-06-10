/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getModel <em>Model</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getId <em>Id</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getRegistrationCode <em>Registration Code</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getUnlock <em>Unlock</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getMassStorageMode <em>Mass Storage Mode</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getGarminMode <em>Garmin Mode</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT()
 * @model extendedMetaData="name='Device_t' kind='elementOnly'"
 * @generated
 */
public interface DeviceT extends EObject {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ModelT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_Model()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Model' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelT getModel();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelT value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A globally unique identifier for this device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(long)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='element' name='Id' namespace='##targetNamespace'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Unsets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Registration Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Code</em>' attribute.
	 * @see #setRegistrationCode(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_RegistrationCode()
	 * @model dataType="com.garmin.xmlschemas.garmin.device.v2.RegistrationCodeT"
	 *        extendedMetaData="kind='element' name='RegistrationCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRegistrationCode();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getRegistrationCode <em>Registration Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Code</em>' attribute.
	 * @see #getRegistrationCode()
	 * @generated
	 */
	void setRegistrationCode(String value);

	/**
	 * Returns the value of the '<em><b>Unlock</b></em>' containment reference list.
	 * The list contents are of type {@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlock</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlock</em>' containment reference list.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_Unlock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unlock' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<UnlockCodeT> getUnlock();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A user-editable name displayed by this device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 *        extendedMetaData="kind='element' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Mass Storage Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Storage Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Storage Mode</em>' containment reference.
	 * @see #setMassStorageMode(MassStorageModeT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_MassStorageMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MassStorageMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MassStorageModeT getMassStorageMode();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getMassStorageMode <em>Mass Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Storage Mode</em>' containment reference.
	 * @see #getMassStorageMode()
	 * @generated
	 */
	void setMassStorageMode(MassStorageModeT value);

	/**
	 * Returns the value of the '<em><b>Garmin Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Garmin Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Garmin Mode</em>' containment reference.
	 * @see #setGarminMode(GarminModeT)
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_GarminMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GarminMode' namespace='##targetNamespace'"
	 * @generated
	 */
	GarminModeT getGarminMode();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getGarminMode <em>Garmin Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Garmin Mode</em>' containment reference.
	 * @see #getGarminMode()
	 * @generated
	 */
	void setGarminMode(GarminModeT value);

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getDeviceT_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsT getExtensions();

	/**
	 * Sets the value of the '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsT value);

} // DeviceT
