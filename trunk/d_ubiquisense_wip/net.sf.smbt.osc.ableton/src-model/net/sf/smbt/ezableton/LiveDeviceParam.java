/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Device Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParam#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParam#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParam#getParam <em>Param</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParam#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParam#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParam#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParam()
 * @model
 * @generated
 */
public interface LiveDeviceParam extends AbletonLiveSndCmd {
	/**
	 * Returns the value of the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track ID</em>' attribute.
	 * @see #setTrackID(int)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParam_TrackID()
	 * @model
	 * @generated
	 */
	int getTrackID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParam#getTrackID <em>Track ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track ID</em>' attribute.
	 * @see #getTrackID()
	 * @generated
	 */
	void setTrackID(int value);

	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(int)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParam_DeviceID()
	 * @model
	 * @generated
	 */
	int getDeviceID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParam#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(int value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' attribute.
	 * @see #setParam(int)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParam_Param()
	 * @model
	 * @generated
	 */
	int getParam();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParam#getParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParam_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParam#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParam_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParam#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParam#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LiveDeviceParam
