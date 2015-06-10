/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Return Device Range All Q</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllQImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllQImpl#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveReturnDeviceRangeAllQImpl extends AbletonLiveSndCmdImpl implements LiveReturnDeviceRangeAllQ {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveReturnDeviceRangeAllQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_RETURN_DEVICE_RANGE_ALL_Q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_RETURN_DEVICE_RANGE_ALL_Q__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_RETURN_DEVICE_RANGE_ALL_Q__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeviceID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_RETURN_DEVICE_RANGE_ALL_Q__DEVICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(int newDeviceID) {
		eSet(EzabletonPackage.Literals.LIVE_RETURN_DEVICE_RANGE_ALL_Q__DEVICE_ID, newDeviceID);
	}

} //LiveReturnDeviceRangeAllQImpl
