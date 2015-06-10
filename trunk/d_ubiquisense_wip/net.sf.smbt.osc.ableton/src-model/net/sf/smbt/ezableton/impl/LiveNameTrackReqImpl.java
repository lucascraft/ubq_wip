/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveNameTrackReq;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Name Track Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameTrackReqImpl#getTrackName <em>Track Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameTrackReqImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameTrackReqImpl#getTrackID <em>Track ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveNameTrackReqImpl extends AbletonLiveSndCmdImpl implements LiveNameTrackReq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveNameTrackReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_NAME_TRACK_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrackName() {
		return (String)eGet(EzabletonPackage.Literals.LIVE_NAME_TRACK_REQ__TRACK_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackName(String newTrackName) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_TRACK_REQ__TRACK_NAME, newTrackName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColor() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_TRACK_REQ__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(int newColor) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_TRACK_REQ__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_TRACK_REQ__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_TRACK_REQ__TRACK_ID, newTrackID);
	}

} //LiveNameTrackReqImpl
