/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveDeviceParam;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Device Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl#getParam <em>Param</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveDeviceParamImpl extends AbletonLiveSndCmdImpl implements LiveDeviceParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveDeviceParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_DEVICE_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeviceID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__DEVICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(int newDeviceID) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__DEVICE_ID, newDeviceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParam() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__PARAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(int newParam) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__PARAM, newParam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return (Object)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EzabletonPackage.Literals.LIVE_DEVICE_PARAM__NAME, newName);
	}

} //LiveDeviceParamImpl
