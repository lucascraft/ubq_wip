/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice.impl;

import net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertilice Instant Status Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceInstantStatusCmdImpl#getRpm <em>Rpm</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceInstantStatusCmdImpl#getVolts <em>Volts</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceInstantStatusCmdImpl#getAmps <em>Amps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertiliceInstantStatusCmdImpl extends VertiliceCmdImpl implements VertiliceInstantStatusCmd {
	/**
	 * The default value of the '{@link #getRpm() <em>Rpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpm()
	 * @generated
	 * @ordered
	 */
	protected static final int RPM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRpm() <em>Rpm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpm()
	 * @generated
	 * @ordered
	 */
	protected int rpm = RPM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolts() <em>Volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolts()
	 * @generated
	 * @ordered
	 */
	protected static final float VOLTS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getVolts() <em>Volts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolts()
	 * @generated
	 * @ordered
	 */
	protected float volts = VOLTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmps() <em>Amps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmps()
	 * @generated
	 * @ordered
	 */
	protected static final float AMPS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmps() <em>Amps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmps()
	 * @generated
	 * @ordered
	 */
	protected float amps = AMPS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertiliceInstantStatusCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzvertilicePackage.Literals.VERTILICE_INSTANT_STATUS_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRpm() {
		return rpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpm(int newRpm) {
		int oldRpm = rpm;
		rpm = newRpm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__RPM, oldRpm, rpm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVolts() {
		return volts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolts(float newVolts) {
		float oldVolts = volts;
		volts = newVolts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__VOLTS, oldVolts, volts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmps() {
		return amps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmps(float newAmps) {
		float oldAmps = amps;
		amps = newAmps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__AMPS, oldAmps, amps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__RPM:
				return getRpm();
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__VOLTS:
				return getVolts();
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__AMPS:
				return getAmps();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__RPM:
				setRpm((Integer)newValue);
				return;
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__VOLTS:
				setVolts((Float)newValue);
				return;
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__AMPS:
				setAmps((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__RPM:
				setRpm(RPM_EDEFAULT);
				return;
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__VOLTS:
				setVolts(VOLTS_EDEFAULT);
				return;
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__AMPS:
				setAmps(AMPS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__RPM:
				return rpm != RPM_EDEFAULT;
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__VOLTS:
				return volts != VOLTS_EDEFAULT;
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD__AMPS:
				return amps != AMPS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rpm: ");
		result.append(rpm);
		result.append(", volts: ");
		result.append(volts);
		result.append(", amps: ");
		result.append(amps);
		result.append(')');
		return result.toString();
	}

} //VertiliceInstantStatusCmdImpl
