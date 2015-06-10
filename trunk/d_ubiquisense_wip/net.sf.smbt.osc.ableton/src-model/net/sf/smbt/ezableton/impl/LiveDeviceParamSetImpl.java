/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveDeviceParamSet;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Device Param Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#getPIndex <em>PIndex</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#getMin <em>Min</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#getMax <em>Max</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveDeviceParamSetImpl extends AbletonLiveSndCmdImpl implements LiveDeviceParamSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveDeviceParamSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeviceID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__DEVICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(int newDeviceID) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__DEVICE_ID, newDeviceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return (Object)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPIndex() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__PINDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPIndex(int newPIndex) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__PINDEX, newPIndex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMin() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__MIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(float newMin) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMax() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__MAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(float newMax) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return (Boolean)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getType() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(int newType) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM_SET__TYPE, newType);
	}

} //LiveDeviceParamSetImpl
