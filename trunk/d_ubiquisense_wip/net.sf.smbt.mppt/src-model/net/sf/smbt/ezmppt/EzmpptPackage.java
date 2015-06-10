/**
 */
package net.sf.smbt.ezmppt;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmppt.EzmpptFactory
 * @model kind="package"
 * @generated
 */
public interface EzmpptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezmppt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezmppt/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezmppt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmpptPackage eINSTANCE = net.sf.smbt.ezmppt.impl.EzmpptPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl <em>Ep Solar Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmppt.impl.EpSolarCmdImpl
	 * @see net.sf.smbt.ezmppt.impl.EzmpptPackageImpl#getEpSolarCmd()
	 * @generated
	 */
	int EP_SOLAR_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>MV Batteries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__MV_BATTERIES = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__STATUS = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__DATE = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>MV Panels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__MV_PANELS = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>MA Comsumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__MA_COMSUMPTION = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>MV Batteries Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__MV_BATTERIES_EMPTY = CmdPackage.CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>MV Batteries Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__MV_BATTERIES_FULL = CmdPackage.CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>MA Current Load Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION = CmdPackage.CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activated Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__ACTIVATED_USAGE = CmdPackage.CMD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Overload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__OVERLOAD = CmdPackage.CMD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Short Circuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__SHORT_CIRCUIT = CmdPackage.CMD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Load Status SOC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__LOAD_STATUS_SOC = CmdPackage.CMD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Battery Too Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__BATTERY_TOO_LOADED = CmdPackage.CMD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Battery Too Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__BATTERY_TOO_EMPTY = CmdPackage.CMD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Battery Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__BATTERY_FULL = CmdPackage.CMD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Ongoing Loading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__ONGOING_LOADING = CmdPackage.CMD_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD__TEMPERATURE = CmdPackage.CMD_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Ep Solar Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EP_SOLAR_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl <em>Mppt Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmppt.impl.MpptCmdImpl
	 * @see net.sf.smbt.ezmppt.impl.EzmpptPackageImpl#getMpptCmd()
	 * @generated
	 */
	int MPPT_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__DEVICE = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__COMMAND = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__LENGTH = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__DATA = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Crc1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__CRC1 = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Crc2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD__CRC2 = CmdPackage.CMD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Mppt Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPPT_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmppt.MPPT <em>MPPT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmppt.MPPT
	 * @see net.sf.smbt.ezmppt.impl.EzmpptPackageImpl#getMPPT()
	 * @generated
	 */
	int MPPT = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmppt.EpSolarCmd <em>Ep Solar Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ep Solar Cmd</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd
	 * @generated
	 */
	EClass getEpSolarCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteries <em>MV Batteries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MV Batteries</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteries()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_MVBatteries();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getStatus()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getDate()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVPanels <em>MV Panels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MV Panels</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getMVPanels()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_MVPanels();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMAComsumption <em>MA Comsumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MA Comsumption</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getMAComsumption()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_MAComsumption();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesEmpty <em>MV Batteries Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MV Batteries Empty</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesEmpty()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_MVBatteriesEmpty();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesFull <em>MV Batteries Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MV Batteries Full</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getMVBatteriesFull()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_MVBatteriesFull();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getMACurrentLoadTension <em>MA Current Load Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MA Current Load Tension</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getMACurrentLoadTension()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_MACurrentLoadTension();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getActivatedUsage <em>Activated Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated Usage</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getActivatedUsage()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_ActivatedUsage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getOverload <em>Overload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overload</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getOverload()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_Overload();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getShortCircuit <em>Short Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Circuit</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getShortCircuit()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_ShortCircuit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getLoadStatusSOC <em>Load Status SOC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load Status SOC</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getLoadStatusSOC()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_LoadStatusSOC();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooLoaded <em>Battery Too Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Too Loaded</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooLoaded()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_BatteryTooLoaded();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooEmpty <em>Battery Too Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Too Empty</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getBatteryTooEmpty()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_BatteryTooEmpty();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getBatteryFull <em>Battery Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Full</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getBatteryFull()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_BatteryFull();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getOngoingLoading <em>Ongoing Loading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ongoing Loading</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getOngoingLoading()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_OngoingLoading();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.EpSolarCmd#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see net.sf.smbt.ezmppt.EpSolarCmd#getTemperature()
	 * @see #getEpSolarCmd()
	 * @generated
	 */
	EAttribute getEpSolarCmd_Temperature();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmppt.MpptCmd <em>Mppt Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mppt Cmd</em>'.
	 * @see net.sf.smbt.ezmppt.MpptCmd
	 * @generated
	 */
	EClass getMpptCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.MpptCmd#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see net.sf.smbt.ezmppt.MpptCmd#getDevice()
	 * @see #getMpptCmd()
	 * @generated
	 */
	EAttribute getMpptCmd_Device();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.MpptCmd#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see net.sf.smbt.ezmppt.MpptCmd#getCommand()
	 * @see #getMpptCmd()
	 * @generated
	 */
	EAttribute getMpptCmd_Command();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.MpptCmd#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.smbt.ezmppt.MpptCmd#getLength()
	 * @see #getMpptCmd()
	 * @generated
	 */
	EAttribute getMpptCmd_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.MpptCmd#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.ezmppt.MpptCmd#getData()
	 * @see #getMpptCmd()
	 * @generated
	 */
	EAttribute getMpptCmd_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.MpptCmd#getCrc1 <em>Crc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crc1</em>'.
	 * @see net.sf.smbt.ezmppt.MpptCmd#getCrc1()
	 * @see #getMpptCmd()
	 * @generated
	 */
	EAttribute getMpptCmd_Crc1();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmppt.MpptCmd#getCrc2 <em>Crc2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crc2</em>'.
	 * @see net.sf.smbt.ezmppt.MpptCmd#getCrc2()
	 * @see #getMpptCmd()
	 * @generated
	 */
	EAttribute getMpptCmd_Crc2();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmppt.MPPT <em>MPPT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MPPT</em>'.
	 * @see net.sf.smbt.ezmppt.MPPT
	 * @generated
	 */
	EEnum getMPPT();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzmpptFactory getEzmpptFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmppt.impl.EpSolarCmdImpl <em>Ep Solar Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmppt.impl.EpSolarCmdImpl
		 * @see net.sf.smbt.ezmppt.impl.EzmpptPackageImpl#getEpSolarCmd()
		 * @generated
		 */
		EClass EP_SOLAR_CMD = eINSTANCE.getEpSolarCmd();

		/**
		 * The meta object literal for the '<em><b>MV Batteries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__MV_BATTERIES = eINSTANCE.getEpSolarCmd_MVBatteries();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__STATUS = eINSTANCE.getEpSolarCmd_Status();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__DATE = eINSTANCE.getEpSolarCmd_Date();

		/**
		 * The meta object literal for the '<em><b>MV Panels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__MV_PANELS = eINSTANCE.getEpSolarCmd_MVPanels();

		/**
		 * The meta object literal for the '<em><b>MA Comsumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__MA_COMSUMPTION = eINSTANCE.getEpSolarCmd_MAComsumption();

		/**
		 * The meta object literal for the '<em><b>MV Batteries Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__MV_BATTERIES_EMPTY = eINSTANCE.getEpSolarCmd_MVBatteriesEmpty();

		/**
		 * The meta object literal for the '<em><b>MV Batteries Full</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__MV_BATTERIES_FULL = eINSTANCE.getEpSolarCmd_MVBatteriesFull();

		/**
		 * The meta object literal for the '<em><b>MA Current Load Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__MA_CURRENT_LOAD_TENSION = eINSTANCE.getEpSolarCmd_MACurrentLoadTension();

		/**
		 * The meta object literal for the '<em><b>Activated Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__ACTIVATED_USAGE = eINSTANCE.getEpSolarCmd_ActivatedUsage();

		/**
		 * The meta object literal for the '<em><b>Overload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__OVERLOAD = eINSTANCE.getEpSolarCmd_Overload();

		/**
		 * The meta object literal for the '<em><b>Short Circuit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__SHORT_CIRCUIT = eINSTANCE.getEpSolarCmd_ShortCircuit();

		/**
		 * The meta object literal for the '<em><b>Load Status SOC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__LOAD_STATUS_SOC = eINSTANCE.getEpSolarCmd_LoadStatusSOC();

		/**
		 * The meta object literal for the '<em><b>Battery Too Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__BATTERY_TOO_LOADED = eINSTANCE.getEpSolarCmd_BatteryTooLoaded();

		/**
		 * The meta object literal for the '<em><b>Battery Too Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__BATTERY_TOO_EMPTY = eINSTANCE.getEpSolarCmd_BatteryTooEmpty();

		/**
		 * The meta object literal for the '<em><b>Battery Full</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__BATTERY_FULL = eINSTANCE.getEpSolarCmd_BatteryFull();

		/**
		 * The meta object literal for the '<em><b>Ongoing Loading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__ONGOING_LOADING = eINSTANCE.getEpSolarCmd_OngoingLoading();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EP_SOLAR_CMD__TEMPERATURE = eINSTANCE.getEpSolarCmd_Temperature();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl <em>Mppt Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmppt.impl.MpptCmdImpl
		 * @see net.sf.smbt.ezmppt.impl.EzmpptPackageImpl#getMpptCmd()
		 * @generated
		 */
		EClass MPPT_CMD = eINSTANCE.getMpptCmd();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPPT_CMD__DEVICE = eINSTANCE.getMpptCmd_Device();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPPT_CMD__COMMAND = eINSTANCE.getMpptCmd_Command();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPPT_CMD__LENGTH = eINSTANCE.getMpptCmd_Length();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPPT_CMD__DATA = eINSTANCE.getMpptCmd_Data();

		/**
		 * The meta object literal for the '<em><b>Crc1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPPT_CMD__CRC1 = eINSTANCE.getMpptCmd_Crc1();

		/**
		 * The meta object literal for the '<em><b>Crc2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MPPT_CMD__CRC2 = eINSTANCE.getMpptCmd_Crc2();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmppt.MPPT <em>MPPT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmppt.MPPT
		 * @see net.sf.smbt.ezmppt.impl.EzmpptPackageImpl#getMPPT()
		 * @generated
		 */
		EEnum MPPT = eINSTANCE.getMPPT();

	}

} //EzmpptPackage
