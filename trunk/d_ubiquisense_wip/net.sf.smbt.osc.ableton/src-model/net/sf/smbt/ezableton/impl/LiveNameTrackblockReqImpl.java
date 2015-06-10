/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveNameTrackblockReq;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Name Trackblock Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameTrackblockReqImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameTrackblockReqImpl#getSize <em>Size</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameTrackblockReqImpl#getTrackName <em>Track Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveNameTrackblockReqImpl extends AbletonLiveSndCmdImpl implements LiveNameTrackblockReq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveNameTrackblockReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_NAME_TRACKBLOCK_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_TRACKBLOCK_REQ__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_TRACKBLOCK_REQ__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_TRACKBLOCK_REQ__SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_TRACKBLOCK_REQ__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getTrackName() {
		return (EList<String>)eGet(EzabletonPackage.Literals.LIVE_NAME_TRACKBLOCK_REQ__TRACK_NAME, true);
	}

} //LiveNameTrackblockReqImpl
