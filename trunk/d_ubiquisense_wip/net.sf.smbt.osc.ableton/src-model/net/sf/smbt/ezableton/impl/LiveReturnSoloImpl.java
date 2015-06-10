/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveReturnSolo;
import net.sf.smbt.ezableton.TRACK_SOLO_STATUS;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Return Solo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveReturnSoloImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveReturnSoloImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveReturnSoloImpl extends AbletonLiveSndCmdImpl implements LiveReturnSolo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveReturnSoloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_RETURN_SOLO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_RETURN_SOLO__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_RETURN_SOLO__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_SOLO_STATUS getStatus() {
		return (TRACK_SOLO_STATUS)eGet(EzabletonPackage.Literals.LIVE_RETURN_SOLO__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(TRACK_SOLO_STATUS newStatus) {
		eSet(EzabletonPackage.Literals.LIVE_RETURN_SOLO__STATUS, newStatus);
	}

} //LiveReturnSoloImpl
