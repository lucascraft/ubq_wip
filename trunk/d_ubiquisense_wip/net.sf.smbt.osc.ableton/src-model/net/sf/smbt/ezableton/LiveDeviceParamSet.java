/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Device Param Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getPIndex <em>PIndex</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getMin <em>Min</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getMax <em>Max</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#isStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet()
 * @model
 * @generated
 */
public interface LiveDeviceParamSet extends AbletonLiveSndCmd {
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
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_TrackID()
	 * @model
	 * @generated
	 */
	int getTrackID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getTrackID <em>Track ID</em>}' attribute.
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
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_DeviceID()
	 * @model
	 * @generated
	 */
	int getDeviceID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(int value);

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
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>PIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PIndex</em>' attribute.
	 * @see #setPIndex(int)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_PIndex()
	 * @model
	 * @generated
	 */
	int getPIndex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getPIndex <em>PIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PIndex</em>' attribute.
	 * @see #getPIndex()
	 * @generated
	 */
	void setPIndex(int value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(float)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_Min()
	 * @model
	 * @generated
	 */
	float getMin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(float value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(float)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_Max()
	 * @model
	 * @generated
	 */
	float getMax();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(float value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveDeviceParamSet_Type()
	 * @model
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

} // LiveDeviceParamSet
