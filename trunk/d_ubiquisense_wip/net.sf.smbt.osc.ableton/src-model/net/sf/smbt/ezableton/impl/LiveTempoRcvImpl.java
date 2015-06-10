/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveTempoRcv;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Tempo Rcv</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveTempoRcvImpl#getTempo <em>Tempo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveTempoRcvImpl extends AbletonLiveSndCmdImpl implements LiveTempoRcv {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveTempoRcvImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_TEMPO_RCV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTempo() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_TEMPO_RCV__TEMPO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(float newTempo) {
		eSet(EzabletonPackage.Literals.LIVE_TEMPO_RCV__TEMPO, newTempo);
	}

} //LiveTempoRcvImpl
