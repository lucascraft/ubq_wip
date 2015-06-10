/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveClipPosition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Clip Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl#getClipID <em>Clip ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl#getLoopStart <em>Loop Start</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl#getLoopEnd <em>Loop End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveClipPositionImpl extends AbletonLiveSndCmdImpl implements LiveClipPosition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveClipPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_CLIP_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClipID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__CLIP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipID(int newClipID) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__CLIP_ID, newClipID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPosition() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(float newPosition) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoopStart() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__LOOP_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopStart(float newLoopStart) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__LOOP_START, newLoopStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoopEnd() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__LOOP_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopEnd(float newLoopEnd) {
		eSet(EzabletonPackage.Literals.LIVE_CLIP_POSITION__LOOP_END, newLoopEnd);
	}

} //LiveClipPositionImpl
