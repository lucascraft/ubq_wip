/**
 */
package net.sf.smbt.ezmppt;

import java.util.Date;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ep Solar Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteries <em>MV Batteries</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getDate <em>Date</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVPanels <em>MV Panels</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getMAComsumption <em>MA Comsumption</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesEmpty <em>MV Batteries Empty</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesFull <em>MV Batteries Full</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getMACurrentLoadTension <em>MA Current Load Tension</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getActivatedUsage <em>Activated Usage</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getOverload <em>Overload</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getShortCircuit <em>Short Circuit</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getLoadStatusSOC <em>Load Status SOC</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooLoaded <em>Battery Too Loaded</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooEmpty <em>Battery Too Empty</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryFull <em>Battery Full</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getOngoingLoading <em>Ongoing Loading</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.EpSolarCmd#getTemperature <em>Temperature</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd()
 * @model
 * @generated
 */
public interface EpSolarCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>MV Batteries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MV Batteries</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MV Batteries</em>' attribute.
	 * @see #setMVBatteries(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_MVBatteries()
	 * @model
	 * @generated
	 */
	float getMVBatteries();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteries <em>MV Batteries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MV Batteries</em>' attribute.
	 * @see #getMVBatteries()
	 * @generated
	 */
	void setMVBatteries(float value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(int)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_Status()
	 * @model
	 * @generated
	 */
	int getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>MV Panels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MV Panels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MV Panels</em>' attribute.
	 * @see #setMVPanels(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_MVPanels()
	 * @model
	 * @generated
	 */
	float getMVPanels();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVPanels <em>MV Panels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MV Panels</em>' attribute.
	 * @see #getMVPanels()
	 * @generated
	 */
	void setMVPanels(float value);

	/**
	 * Returns the value of the '<em><b>MA Comsumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MA Comsumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MA Comsumption</em>' attribute.
	 * @see #setMAComsumption(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_MAComsumption()
	 * @model
	 * @generated
	 */
	float getMAComsumption();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMAComsumption <em>MA Comsumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MA Comsumption</em>' attribute.
	 * @see #getMAComsumption()
	 * @generated
	 */
	void setMAComsumption(float value);

	/**
	 * Returns the value of the '<em><b>MV Batteries Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MV Batteries Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MV Batteries Empty</em>' attribute.
	 * @see #setMVBatteriesEmpty(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_MVBatteriesEmpty()
	 * @model
	 * @generated
	 */
	float getMVBatteriesEmpty();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesEmpty <em>MV Batteries Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MV Batteries Empty</em>' attribute.
	 * @see #getMVBatteriesEmpty()
	 * @generated
	 */
	void setMVBatteriesEmpty(float value);

	/**
	 * Returns the value of the '<em><b>MV Batteries Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MV Batteries Full</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MV Batteries Full</em>' attribute.
	 * @see #setMVBatteriesFull(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_MVBatteriesFull()
	 * @model
	 * @generated
	 */
	float getMVBatteriesFull();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesFull <em>MV Batteries Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MV Batteries Full</em>' attribute.
	 * @see #getMVBatteriesFull()
	 * @generated
	 */
	void setMVBatteriesFull(float value);

	/**
	 * Returns the value of the '<em><b>MA Current Load Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MA Current Load Tension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MA Current Load Tension</em>' attribute.
	 * @see #setMACurrentLoadTension(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_MACurrentLoadTension()
	 * @model
	 * @generated
	 */
	float getMACurrentLoadTension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMACurrentLoadTension <em>MA Current Load Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MA Current Load Tension</em>' attribute.
	 * @see #getMACurrentLoadTension()
	 * @generated
	 */
	void setMACurrentLoadTension(float value);

	/**
	 * Returns the value of the '<em><b>Activated Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activated Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activated Usage</em>' attribute.
	 * @see #setActivatedUsage(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_ActivatedUsage()
	 * @model
	 * @generated
	 */
	float getActivatedUsage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getActivatedUsage <em>Activated Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated Usage</em>' attribute.
	 * @see #getActivatedUsage()
	 * @generated
	 */
	void setActivatedUsage(float value);

	/**
	 * Returns the value of the '<em><b>Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overload</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overload</em>' attribute.
	 * @see #setOverload(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_Overload()
	 * @model
	 * @generated
	 */
	float getOverload();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getOverload <em>Overload</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overload</em>' attribute.
	 * @see #getOverload()
	 * @generated
	 */
	void setOverload(float value);

	/**
	 * Returns the value of the '<em><b>Short Circuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Circuit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Circuit</em>' attribute.
	 * @see #setShortCircuit(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_ShortCircuit()
	 * @model
	 * @generated
	 */
	float getShortCircuit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getShortCircuit <em>Short Circuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Circuit</em>' attribute.
	 * @see #getShortCircuit()
	 * @generated
	 */
	void setShortCircuit(float value);

	/**
	 * Returns the value of the '<em><b>Load Status SOC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Status SOC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Status SOC</em>' attribute.
	 * @see #setLoadStatusSOC(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_LoadStatusSOC()
	 * @model
	 * @generated
	 */
	float getLoadStatusSOC();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getLoadStatusSOC <em>Load Status SOC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Status SOC</em>' attribute.
	 * @see #getLoadStatusSOC()
	 * @generated
	 */
	void setLoadStatusSOC(float value);

	/**
	 * Returns the value of the '<em><b>Battery Too Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery Too Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery Too Loaded</em>' attribute.
	 * @see #setBatteryTooLoaded(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_BatteryTooLoaded()
	 * @model
	 * @generated
	 */
	float getBatteryTooLoaded();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooLoaded <em>Battery Too Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Too Loaded</em>' attribute.
	 * @see #getBatteryTooLoaded()
	 * @generated
	 */
	void setBatteryTooLoaded(float value);

	/**
	 * Returns the value of the '<em><b>Battery Too Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery Too Empty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery Too Empty</em>' attribute.
	 * @see #setBatteryTooEmpty(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_BatteryTooEmpty()
	 * @model
	 * @generated
	 */
	float getBatteryTooEmpty();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooEmpty <em>Battery Too Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Too Empty</em>' attribute.
	 * @see #getBatteryTooEmpty()
	 * @generated
	 */
	void setBatteryTooEmpty(float value);

	/**
	 * Returns the value of the '<em><b>Battery Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery Full</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery Full</em>' attribute.
	 * @see #setBatteryFull(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_BatteryFull()
	 * @model
	 * @generated
	 */
	float getBatteryFull();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryFull <em>Battery Full</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Full</em>' attribute.
	 * @see #getBatteryFull()
	 * @generated
	 */
	void setBatteryFull(float value);

	/**
	 * Returns the value of the '<em><b>Ongoing Loading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing Loading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing Loading</em>' attribute.
	 * @see #setOngoingLoading(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_OngoingLoading()
	 * @model
	 * @generated
	 */
	float getOngoingLoading();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getOngoingLoading <em>Ongoing Loading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ongoing Loading</em>' attribute.
	 * @see #getOngoingLoading()
	 * @generated
	 */
	void setOngoingLoading(float value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(float)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getEpSolarCmd_Temperature()
	 * @model
	 * @generated
	 */
	float getTemperature();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.EpSolarCmd#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(float value);

} // EpSolarCmd
