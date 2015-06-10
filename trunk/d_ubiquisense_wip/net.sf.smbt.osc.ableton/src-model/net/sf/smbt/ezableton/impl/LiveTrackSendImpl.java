/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveTrackSend;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Track Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveTrackSendImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveTrackSendImpl#getSend <em>Send</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveTrackSendImpl extends AbletonLiveSndCmdImpl implements LiveTrackSend {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveTrackSendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_TRACK_SEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_TRACK_SEND__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonPackage.Literals.LIVE_TRACK_SEND__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSend() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_TRACK_SEND__SEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend(float newSend) {
		eSet(EzabletonPackage.Literals.LIVE_TRACK_SEND__SEND, newSend);
	}

} //LiveTrackSendImpl
