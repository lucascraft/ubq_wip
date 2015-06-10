/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LivePitchSet;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Pitch Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LivePitchSetImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LivePitchSetImpl#getClip <em>Clip</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LivePitchSetImpl#getCoarse <em>Coarse</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LivePitchSetImpl#getFine <em>Fine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivePitchSetImpl extends AbletonLiveSndCmdImpl implements LivePitchSet {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivePitchSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_PITCH_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_PITCH_SET__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_PITCH_SET__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClip() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_PITCH_SET__CLIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClip(int newClip) {
		eSet(EzabletonPackage.Literals.LIVE_PITCH_SET__CLIP, newClip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoarse() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_PITCH_SET__COARSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoarse(int newCoarse) {
		eSet(EzabletonPackage.Literals.LIVE_PITCH_SET__COARSE, newCoarse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFine() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_PITCH_SET__FINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFine(int newFine) {
		eSet(EzabletonPackage.Literals.LIVE_PITCH_SET__FINE, newFine);
	}

} //LivePitchSetImpl
