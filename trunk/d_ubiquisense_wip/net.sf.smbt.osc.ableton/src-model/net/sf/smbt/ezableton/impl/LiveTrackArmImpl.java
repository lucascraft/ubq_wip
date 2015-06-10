/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveTrackArm;
import net.sf.smbt.ezableton.TRACK_ARM_STATUS;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Track Arm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveTrackArmImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveTrackArmImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveTrackArmImpl extends AbletonLiveSndCmdImpl implements LiveTrackArm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveTrackArmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_TRACK_ARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_TRACK_ARM__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_TRACK_ARM__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_ARM_STATUS getState() {
		return (TRACK_ARM_STATUS)eGet(EzabletonPackage.Literals.LIVE_TRACK_ARM__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(TRACK_ARM_STATUS newState) {
		eSet(EzabletonPackage.Literals.LIVE_TRACK_ARM__STATE, newState);
	}

} //LiveTrackArmImpl
