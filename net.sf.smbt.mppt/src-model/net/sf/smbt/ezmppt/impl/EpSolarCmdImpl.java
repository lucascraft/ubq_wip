/**
 */
package net.sf.smbt.ezmppt.impl;

import java.util.Date;

import net.sf.smbt.ezmppt.EpSolarCmd;
import net.sf.smbt.ezmppt.EzmpptPackage;

import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ep Solar Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getMVBatteries <em>MV Batteries</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getMVPanels <em>MV Panels</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getMAComsumption <em>MA Comsumption</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getMVBatteriesEmpty <em>MV Batteries Empty</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getMVBatteriesFull <em>MV Batteries Full</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getMACurrentLoadTension <em>MA Current Load Tension</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getActivatedUsage <em>Activated Usage</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getOverload <em>Overload</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getShortCircuit <em>Short Circuit</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getLoadStatusSOC <em>Load Status SOC</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getBatteryTooLoaded <em>Battery Too Loaded</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getBatteryTooEmpty <em>Battery Too Empty</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getBatteryFull <em>Battery Full</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getOngoingLoading <em>Ongoing Loading</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EpSolarCmdImpl extends CmdImpl implements EpSolarCmd {
	/**
	 * The default value of the '{@link #getMVBatteries() <em>MV Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVBatteries()
	 * @generated
	 * @ordered
	 */
	protected static final float MV_BATTERIES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMVBatteries() <em>MV Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVBatteries()
	 * @generated
	 * @ordered
	 */
	protected float mVBatteries = MV_BATTERIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final int STATUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected int status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMVPanels() <em>MV Panels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVPanels()
	 * @generated
	 * @ordered
	 */
	protected static final float MV_PANELS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMVPanels() <em>MV Panels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVPanels()
	 * @generated
	 * @ordered
	 */
	protected float mVPanels = MV_PANELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAComsumption() <em>MA Comsumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAComsumption()
	 * @generated
	 * @ordered
	 */
	protected static final float MA_COMSUMPTION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMAComsumption() <em>MA Comsumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAComsumption()
	 * @generated
	 * @ordered
	 */
	protected float mAComsumption = MA_COMSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMVBatteriesEmpty() <em>MV Batteries Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVBatteriesEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final float MV_BATTERIES_EMPTY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMVBatteriesEmpty() <em>MV Batteries Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVBatteriesEmpty()
	 * @generated
	 * @ordered
	 */
	protected float mVBatteriesEmpty = MV_BATTERIES_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMVBatteriesFull() <em>MV Batteries Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVBatteriesFull()
	 * @generated
	 * @ordered
	 */
	protected static final float MV_BATTERIES_FULL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMVBatteriesFull() <em>MV Batteries Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMVBatteriesFull()
	 * @generated
	 * @ordered
	 */
	protected float mVBatteriesFull = MV_BATTERIES_FULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMACurrentLoadTension() <em>MA Current Load Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACurrentLoadTension()
	 * @generated
	 * @ordered
	 */
	protected static final float MA_CURRENT_LOAD_TENSION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMACurrentLoadTension() <em>MA Current Load Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMACurrentLoadTension()
	 * @generated
	 * @ordered
	 */
	protected float mACurrentLoadTension = MA_CURRENT_LOAD_TENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivatedUsage() <em>Activated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatedUsage()
	 * @generated
	 * @ordered
	 */
	protected static final float ACTIVATED_USAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getActivatedUsage() <em>Activated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivatedUsage()
	 * @generated
	 * @ordered
	 */
	protected float activatedUsage = ACTIVATED_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverload() <em>Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverload()
	 * @generated
	 * @ordered
	 */
	protected static final float OVERLOAD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOverload() <em>Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverload()
	 * @generated
	 * @ordered
	 */
	protected float overload = OVERLOAD_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortCircuit() <em>Short Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortCircuit()
	 * @generated
	 * @ordered
	 */
	protected static final float SHORT_CIRCUIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getShortCircuit() <em>Short Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortCircuit()
	 * @generated
	 * @ordered
	 */
	protected float shortCircuit = SHORT_CIRCUIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadStatusSOC() <em>Load Status SOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatusSOC()
	 * @generated
	 * @ordered
	 */
	protected static final float LOAD_STATUS_SOC_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLoadStatusSOC() <em>Load Status SOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadStatusSOC()
	 * @generated
	 * @ordered
	 */
	protected float loadStatusSOC = LOAD_STATUS_SOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryTooLoaded() <em>Battery Too Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTooLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final float BATTERY_TOO_LOADED_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBatteryTooLoaded() <em>Battery Too Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTooLoaded()
	 * @generated
	 * @ordered
	 */
	protected float batteryTooLoaded = BATTERY_TOO_LOADED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryTooEmpty() <em>Battery Too Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTooEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final float BATTERY_TOO_EMPTY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBatteryTooEmpty() <em>Battery Too Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryTooEmpty()
	 * @generated
	 * @ordered
	 */
	protected float batteryTooEmpty = BATTERY_TOO_EMPTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryFull() <em>Battery Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryFull()
	 * @generated
	 * @ordered
	 */
	protected static final float BATTERY_FULL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBatteryFull() <em>Battery Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryFull()
	 * @generated
	 * @ordered
	 */
	protected float batteryFull = BATTERY_FULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOngoingLoading() <em>Ongoing Loading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoingLoading()
	 * @generated
	 * @ordered
	 */
	protected static final float ONGOING_LOADING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getOngoingLoading() <em>Ongoing Loading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoingLoading()
	 * @generated
	 * @ordered
	 */
	protected float ongoingLoading = ONGOING_LOADING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final float TEMPERATURE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected float temperature = TEMPERATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpSolarCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmpptPackage.Literals.EP_SOLAR_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMVBatteries() {
		return mVBatteries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMVBatteries(float newMVBatteries) {
		float oldMVBatteries = mVBatteries;
		mVBatteries = newMVBatteries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES, oldMVBatteries, mVBatteries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(int newStatus) {
		int oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMVPanels() {
		return mVPanels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMVPanels(float newMVPanels) {
		float oldMVPanels = mVPanels;
		mVPanels = newMVPanels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__MV_PANELS, oldMVPanels, mVPanels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMAComsumption() {
		return mAComsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMAComsumption(float newMAComsumption) {
		float oldMAComsumption = mAComsumption;
		mAComsumption = newMAComsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__MA_COMSUMPTION, oldMAComsumption, mAComsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMVBatteriesEmpty() {
		return mVBatteriesEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMVBatteriesEmpty(float newMVBatteriesEmpty) {
		float oldMVBatteriesEmpty = mVBatteriesEmpty;
		mVBatteriesEmpty = newMVBatteriesEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_EMPTY, oldMVBatteriesEmpty, mVBatteriesEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMVBatteriesFull() {
		return mVBatteriesFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMVBatteriesFull(float newMVBatteriesFull) {
		float oldMVBatteriesFull = mVBatteriesFull;
		mVBatteriesFull = newMVBatteriesFull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_FULL, oldMVBatteriesFull, mVBatteriesFull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMACurrentLoadTension() {
		return mACurrentLoadTension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMACurrentLoadTension(float newMACurrentLoadTension) {
		float oldMACurrentLoadTension = mACurrentLoadTension;
		mACurrentLoadTension = newMACurrentLoadTension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION, oldMACurrentLoadTension, mACurrentLoadTension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getActivatedUsage() {
		return activatedUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivatedUsage(float newActivatedUsage) {
		float oldActivatedUsage = activatedUsage;
		activatedUsage = newActivatedUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__ACTIVATED_USAGE, oldActivatedUsage, activatedUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOverload() {
		return overload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverload(float newOverload) {
		float oldOverload = overload;
		overload = newOverload;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__OVERLOAD, oldOverload, overload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getShortCircuit() {
		return shortCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortCircuit(float newShortCircuit) {
		float oldShortCircuit = shortCircuit;
		shortCircuit = newShortCircuit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__SHORT_CIRCUIT, oldShortCircuit, shortCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoadStatusSOC() {
		return loadStatusSOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadStatusSOC(float newLoadStatusSOC) {
		float oldLoadStatusSOC = loadStatusSOC;
		loadStatusSOC = newLoadStatusSOC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__LOAD_STATUS_SOC, oldLoadStatusSOC, loadStatusSOC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBatteryTooLoaded() {
		return batteryTooLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryTooLoaded(float newBatteryTooLoaded) {
		float oldBatteryTooLoaded = batteryTooLoaded;
		batteryTooLoaded = newBatteryTooLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_LOADED, oldBatteryTooLoaded, batteryTooLoaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBatteryTooEmpty() {
		return batteryTooEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryTooEmpty(float newBatteryTooEmpty) {
		float oldBatteryTooEmpty = batteryTooEmpty;
		batteryTooEmpty = newBatteryTooEmpty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_EMPTY, oldBatteryTooEmpty, batteryTooEmpty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBatteryFull() {
		return batteryFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryFull(float newBatteryFull) {
		float oldBatteryFull = batteryFull;
		batteryFull = newBatteryFull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__BATTERY_FULL, oldBatteryFull, batteryFull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getOngoingLoading() {
		return ongoingLoading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOngoingLoading(float newOngoingLoading) {
		float oldOngoingLoading = ongoingLoading;
		ongoingLoading = newOngoingLoading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__ONGOING_LOADING, oldOngoingLoading, ongoingLoading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(float newTemperature) {
		float oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.EP_SOLAR_CMD__TEMPERATURE, oldTemperature, temperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES:
				return getMVBatteries();
			case EzmpptPackage.EP_SOLAR_CMD__STATUS:
				return getStatus();
			case EzmpptPackage.EP_SOLAR_CMD__DATE:
				return getDate();
			case EzmpptPackage.EP_SOLAR_CMD__MV_PANELS:
				return getMVPanels();
			case EzmpptPackage.EP_SOLAR_CMD__MA_COMSUMPTION:
				return getMAComsumption();
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_EMPTY:
				return getMVBatteriesEmpty();
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_FULL:
				return getMVBatteriesFull();
			case EzmpptPackage.EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION:
				return getMACurrentLoadTension();
			case EzmpptPackage.EP_SOLAR_CMD__ACTIVATED_USAGE:
				return getActivatedUsage();
			case EzmpptPackage.EP_SOLAR_CMD__OVERLOAD:
				return getOverload();
			case EzmpptPackage.EP_SOLAR_CMD__SHORT_CIRCUIT:
				return getShortCircuit();
			case EzmpptPackage.EP_SOLAR_CMD__LOAD_STATUS_SOC:
				return getLoadStatusSOC();
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_LOADED:
				return getBatteryTooLoaded();
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_EMPTY:
				return getBatteryTooEmpty();
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_FULL:
				return getBatteryFull();
			case EzmpptPackage.EP_SOLAR_CMD__ONGOING_LOADING:
				return getOngoingLoading();
			case EzmpptPackage.EP_SOLAR_CMD__TEMPERATURE:
				return getTemperature();
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
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES:
				setMVBatteries((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__STATUS:
				setStatus((Integer)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__DATE:
				setDate((Date)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MV_PANELS:
				setMVPanels((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MA_COMSUMPTION:
				setMAComsumption((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_EMPTY:
				setMVBatteriesEmpty((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_FULL:
				setMVBatteriesFull((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION:
				setMACurrentLoadTension((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__ACTIVATED_USAGE:
				setActivatedUsage((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__OVERLOAD:
				setOverload((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__SHORT_CIRCUIT:
				setShortCircuit((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__LOAD_STATUS_SOC:
				setLoadStatusSOC((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_LOADED:
				setBatteryTooLoaded((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_EMPTY:
				setBatteryTooEmpty((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_FULL:
				setBatteryFull((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__ONGOING_LOADING:
				setOngoingLoading((Float)newValue);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__TEMPERATURE:
				setTemperature((Float)newValue);
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
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES:
				setMVBatteries(MV_BATTERIES_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MV_PANELS:
				setMVPanels(MV_PANELS_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MA_COMSUMPTION:
				setMAComsumption(MA_COMSUMPTION_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_EMPTY:
				setMVBatteriesEmpty(MV_BATTERIES_EMPTY_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_FULL:
				setMVBatteriesFull(MV_BATTERIES_FULL_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION:
				setMACurrentLoadTension(MA_CURRENT_LOAD_TENSION_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__ACTIVATED_USAGE:
				setActivatedUsage(ACTIVATED_USAGE_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__OVERLOAD:
				setOverload(OVERLOAD_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__SHORT_CIRCUIT:
				setShortCircuit(SHORT_CIRCUIT_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__LOAD_STATUS_SOC:
				setLoadStatusSOC(LOAD_STATUS_SOC_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_LOADED:
				setBatteryTooLoaded(BATTERY_TOO_LOADED_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_EMPTY:
				setBatteryTooEmpty(BATTERY_TOO_EMPTY_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_FULL:
				setBatteryFull(BATTERY_FULL_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__ONGOING_LOADING:
				setOngoingLoading(ONGOING_LOADING_EDEFAULT);
				return;
			case EzmpptPackage.EP_SOLAR_CMD__TEMPERATURE:
				setTemperature(TEMPERATURE_EDEFAULT);
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
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES:
				return mVBatteries != MV_BATTERIES_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__STATUS:
				return status != STATUS_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case EzmpptPackage.EP_SOLAR_CMD__MV_PANELS:
				return mVPanels != MV_PANELS_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__MA_COMSUMPTION:
				return mAComsumption != MA_COMSUMPTION_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_EMPTY:
				return mVBatteriesEmpty != MV_BATTERIES_EMPTY_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__MV_BATTERIES_FULL:
				return mVBatteriesFull != MV_BATTERIES_FULL_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION:
				return mACurrentLoadTension != MA_CURRENT_LOAD_TENSION_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__ACTIVATED_USAGE:
				return activatedUsage != ACTIVATED_USAGE_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__OVERLOAD:
				return overload != OVERLOAD_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__SHORT_CIRCUIT:
				return shortCircuit != SHORT_CIRCUIT_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__LOAD_STATUS_SOC:
				return loadStatusSOC != LOAD_STATUS_SOC_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_LOADED:
				return batteryTooLoaded != BATTERY_TOO_LOADED_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_TOO_EMPTY:
				return batteryTooEmpty != BATTERY_TOO_EMPTY_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__BATTERY_FULL:
				return batteryFull != BATTERY_FULL_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__ONGOING_LOADING:
				return ongoingLoading != ONGOING_LOADING_EDEFAULT;
			case EzmpptPackage.EP_SOLAR_CMD__TEMPERATURE:
				return temperature != TEMPERATURE_EDEFAULT;
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
		result.append(" (mVBatteries: ");
		result.append(mVBatteries);
		result.append(", status: ");
		result.append(status);
		result.append(", date: ");
		result.append(date);
		result.append(", mVPanels: ");
		result.append(mVPanels);
		result.append(", mAComsumption: ");
		result.append(mAComsumption);
		result.append(", mVBatteriesEmpty: ");
		result.append(mVBatteriesEmpty);
		result.append(", mVBatteriesFull: ");
		result.append(mVBatteriesFull);
		result.append(", mACurrentLoadTension: ");
		result.append(mACurrentLoadTension);
		result.append(", activatedUsage: ");
		result.append(activatedUsage);
		result.append(", overload: ");
		result.append(overload);
		result.append(", shortCircuit: ");
		result.append(shortCircuit);
		result.append(", LoadStatusSOC: ");
		result.append(loadStatusSOC);
		result.append(", batteryTooLoaded: ");
		result.append(batteryTooLoaded);
		result.append(", batteryTooEmpty: ");
		result.append(batteryTooEmpty);
		result.append(", batteryFull: ");
		result.append(batteryFull);
		result.append(", ongoingLoading: ");
		result.append(ongoingLoading);
		result.append(", temperature: ");
		result.append(temperature);
		result.append(')');
		return result.toString();
	}

} //EpSolarCmdImpl
