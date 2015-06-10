/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveStateRcv;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live State Rcv</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveStateRcvImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveStateRcvImpl#isOverdub <em>Overdub</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveStateRcvImpl extends AbletonLiveSndCmdImpl implements LiveStateRcv {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveStateRcvImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_STATE_RCV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTempo() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_STATE_RCV__TEMPO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(float newTempo) {
		eSet(EzabletonPackage.Literals.LIVE_STATE_RCV__TEMPO, newTempo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverdub() {
		return (Boolean)eGet(EzabletonPackage.Literals.LIVE_STATE_RCV__OVERDUB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverdub(boolean newOverdub) {
		eSet(EzabletonPackage.Literals.LIVE_STATE_RCV__OVERDUB, newOverdub);
	}

} //LiveStateRcvImpl
