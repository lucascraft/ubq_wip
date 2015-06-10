/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveTracksQ;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Tracks Q</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveTracksQImpl#getNumTracks <em>Num Tracks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveTracksQImpl extends AbletonLiveSndCmdImpl implements LiveTracksQ {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveTracksQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_TRACKS_Q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumTracks() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_TRACKS_Q__NUM_TRACKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumTracks(int newNumTracks) {
		eSet(EzabletonPackage.Literals.LIVE_TRACKS_Q__NUM_TRACKS, newNumTracks);
	}

} //LiveTracksQImpl
