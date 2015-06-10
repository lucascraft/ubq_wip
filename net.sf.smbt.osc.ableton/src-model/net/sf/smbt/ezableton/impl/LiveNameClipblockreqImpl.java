/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveNameClipblockreq;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Name Clipblockreq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl#getClipID <em>Clip ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl#getSizeY <em>Size Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveNameClipblockreqImpl extends AbletonLiveSndCmdImpl implements LiveNameClipblockreq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveNameClipblockreqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClipID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__CLIP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipID(int newClipID) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__CLIP_ID, newClipID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeX() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__SIZE_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeX(int newSizeX) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__SIZE_X, newSizeX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeY() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__SIZE_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeY(int newSizeY) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_CLIPBLOCKREQ__SIZE_Y, newSizeY);
	}

} //LiveNameClipblockreqImpl
