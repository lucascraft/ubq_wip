/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice.impl;

import net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage;
import net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertilice Battery Status Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl#getPercent <em>Percent</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl#getVolts <em>Volts</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl#getAmps <em>Amps</em>}</li>
 *   <li>{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl#getTimeToFull <em>Time To Full</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VertiliceBatteryStatusCmdImpl extends VertiliceCmdImpl implements VertiliceBatteryStatusCmd {
	/**
	 * The default value of the '{@link #getPercent() <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercent()
	 * @generated
	 * @ordered
	 */
	protected static final float PERCENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPercent() <em>Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercent()
	 * @generated
	 * @ordered
	 */
	protected float percent = PERCENT_EDEFAULT;

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
	 * The default value of the '{@link #getTimeToFull() <em>Time To Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToFull()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_TO_FULL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeToFull() <em>Time To Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToFull()
	 * @generated
	 * @ordered
	 */
	protected long timeToFull = TIME_TO_FULL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertiliceBatteryStatusCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzvertilicePackage.Literals.VERTILICE_BATTERY_STATUS_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPercent() {
		return percent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercent(float newPercent) {
		float oldPercent = percent;
		percent = newPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__PERCENT, oldPercent, percent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__VOLTS, oldVolts, volts));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__AMPS, oldAmps, amps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeToFull() {
		return timeToFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToFull(long newTimeToFull) {
		long oldTimeToFull = timeToFull;
		timeToFull = newTimeToFull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL, oldTimeToFull, timeToFull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__PERCENT:
				return getPercent();
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__VOLTS:
				return getVolts();
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__AMPS:
				return getAmps();
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL:
				return getTimeToFull();
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
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__PERCENT:
				setPercent((Float)newValue);
				return;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__VOLTS:
				setVolts((Float)newValue);
				return;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__AMPS:
				setAmps((Float)newValue);
				return;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL:
				setTimeToFull((Long)newValue);
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
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__PERCENT:
				setPercent(PERCENT_EDEFAULT);
				return;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__VOLTS:
				setVolts(VOLTS_EDEFAULT);
				return;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__AMPS:
				setAmps(AMPS_EDEFAULT);
				return;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL:
				setTimeToFull(TIME_TO_FULL_EDEFAULT);
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
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__PERCENT:
				return percent != PERCENT_EDEFAULT;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__VOLTS:
				return volts != VOLTS_EDEFAULT;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__AMPS:
				return amps != AMPS_EDEFAULT;
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL:
				return timeToFull != TIME_TO_FULL_EDEFAULT;
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
		result.append(" (percent: ");
		result.append(percent);
		result.append(", volts: ");
		result.append(volts);
		result.append(", amps: ");
		result.append(amps);
		result.append(", timeToFull: ");
		result.append(timeToFull);
		result.append(')');
		return result.toString();
	}

} //VertiliceBatteryStatusCmdImpl
