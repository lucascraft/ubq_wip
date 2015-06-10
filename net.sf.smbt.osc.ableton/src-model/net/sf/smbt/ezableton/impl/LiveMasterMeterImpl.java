/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveMasterMeter;
import net.sf.smbt.ezableton.METER_INPUT;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Master Meter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveMasterMeterImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveMasterMeterImpl#getWhich <em>Which</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveMasterMeterImpl extends AbletonLiveSndCmdImpl implements LiveMasterMeter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveMasterMeterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_MASTER_METER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLevel() {
		return (Float)eGet(EzabletonPackage.Literals.LIVE_MASTER_METER__LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(float newLevel) {
		eSet(EzabletonPackage.Literals.LIVE_MASTER_METER__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public METER_INPUT getWhich() {
		return (METER_INPUT)eGet(EzabletonPackage.Literals.LIVE_MASTER_METER__WHICH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhich(METER_INPUT newWhich) {
		eSet(EzabletonPackage.Literals.LIVE_MASTER_METER__WHICH, newWhich);
	}

} //LiveMasterMeterImpl
