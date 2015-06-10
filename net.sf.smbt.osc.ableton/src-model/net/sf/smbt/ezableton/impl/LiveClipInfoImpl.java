/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.CLIP_STATE;
import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveClipInfo;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Clip Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipInfoImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipInfoImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipInfoImpl#getClipID <em>Clip ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveClipInfoImpl extends AbletonLiveSndCmdImpl implements LiveClipInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveClipInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_CLIP_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_CLIP_INFO__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_INFO__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLIP_STATE getStatus() {
		return (CLIP_STATE)eGet(EzabletonPackage.Literals.LIVE_CLIP_INFO__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CLIP_STATE newStatus) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_INFO__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClipID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_CLIP_INFO__CLIP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipID(int newClipID) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_INFO__CLIP_ID, newClipID);
	}

} //LiveClipInfoImpl
