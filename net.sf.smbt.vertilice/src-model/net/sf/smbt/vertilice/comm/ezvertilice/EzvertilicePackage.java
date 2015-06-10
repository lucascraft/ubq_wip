/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertiliceFactory
 * @model kind="package"
 * @generated
 */
public interface EzvertilicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezvertilice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezvertilice/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezvertilice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzvertilicePackage eINSTANCE = net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceCmdImpl <em>Vertilice Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceCmdImpl
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceCmd()
	 * @generated
	 */
	int VERTILICE_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_CMD__ID = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_CMD__DATE = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vertilice Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceInstantStatusCmdImpl <em>Vertilice Instant Status Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceInstantStatusCmdImpl
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceInstantStatusCmd()
	 * @generated
	 */
	int VERTILICE_INSTANT_STATUS_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD__PRIORITY = VERTILICE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD__STAMP = VERTILICE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD__ID = VERTILICE_CMD__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD__DATE = VERTILICE_CMD__DATE;

	/**
	 * The feature id for the '<em><b>Rpm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD__RPM = VERTILICE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD__VOLTS = VERTILICE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD__AMPS = VERTILICE_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Vertilice Instant Status Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_INSTANT_STATUS_CMD_FEATURE_COUNT = VERTILICE_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl <em>Vertilice Battery Status Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceBatteryStatusCmd()
	 * @generated
	 */
	int VERTILICE_BATTERY_STATUS_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__PRIORITY = VERTILICE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__STAMP = VERTILICE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__ID = VERTILICE_CMD__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__DATE = VERTILICE_CMD__DATE;

	/**
	 * The feature id for the '<em><b>Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__PERCENT = VERTILICE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__VOLTS = VERTILICE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Amps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__AMPS = VERTILICE_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time To Full</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL = VERTILICE_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Vertilice Battery Status Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_BATTERY_STATUS_CMD_FEATURE_COUNT = VERTILICE_CMD_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFrmwareImpl <em>Vertilice Frmware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFrmwareImpl
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceFrmware()
	 * @generated
	 */
	int VERTILICE_FRMWARE = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FRMWARE__PRIORITY = VERTILICE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FRMWARE__STAMP = VERTILICE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FRMWARE__ID = VERTILICE_CMD__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FRMWARE__DATE = VERTILICE_CMD__DATE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FRMWARE__VERSION = VERTILICE_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vertilice Frmware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FRMWARE_FEATURE_COUNT = VERTILICE_CMD_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFailureCmdImpl <em>Vertilice Failure Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFailureCmdImpl
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceFailureCmd()
	 * @generated
	 */
	int VERTILICE_FAILURE_CMD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FAILURE_CMD__PRIORITY = VERTILICE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FAILURE_CMD__STAMP = VERTILICE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FAILURE_CMD__ID = VERTILICE_CMD__ID;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FAILURE_CMD__DATE = VERTILICE_CMD__DATE;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FAILURE_CMD__CODE = VERTILICE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FAILURE_CMD__SEVERITY = VERTILICE_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vertilice Failure Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTILICE_FAILURE_CMD_FEATURE_COUNT = VERTILICE_CMD_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd <em>Vertilice Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertilice Cmd</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd
	 * @generated
	 */
	EClass getVertiliceCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd#getId()
	 * @see #getVertiliceCmd()
	 * @generated
	 */
	EAttribute getVertiliceCmd_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd#getDate()
	 * @see #getVertiliceCmd()
	 * @generated
	 */
	EAttribute getVertiliceCmd_Date();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd <em>Vertilice Instant Status Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertilice Instant Status Cmd</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd
	 * @generated
	 */
	EClass getVertiliceInstantStatusCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getRpm <em>Rpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpm</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getRpm()
	 * @see #getVertiliceInstantStatusCmd()
	 * @generated
	 */
	EAttribute getVertiliceInstantStatusCmd_Rpm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getVolts <em>Volts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volts</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getVolts()
	 * @see #getVertiliceInstantStatusCmd()
	 * @generated
	 */
	EAttribute getVertiliceInstantStatusCmd_Volts();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getAmps <em>Amps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amps</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd#getAmps()
	 * @see #getVertiliceInstantStatusCmd()
	 * @generated
	 */
	EAttribute getVertiliceInstantStatusCmd_Amps();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd <em>Vertilice Battery Status Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertilice Battery Status Cmd</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd
	 * @generated
	 */
	EClass getVertiliceBatteryStatusCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getPercent <em>Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percent</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getPercent()
	 * @see #getVertiliceBatteryStatusCmd()
	 * @generated
	 */
	EAttribute getVertiliceBatteryStatusCmd_Percent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getVolts <em>Volts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volts</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getVolts()
	 * @see #getVertiliceBatteryStatusCmd()
	 * @generated
	 */
	EAttribute getVertiliceBatteryStatusCmd_Volts();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getAmps <em>Amps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amps</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getAmps()
	 * @see #getVertiliceBatteryStatusCmd()
	 * @generated
	 */
	EAttribute getVertiliceBatteryStatusCmd_Amps();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getTimeToFull <em>Time To Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Full</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd#getTimeToFull()
	 * @see #getVertiliceBatteryStatusCmd()
	 * @generated
	 */
	EAttribute getVertiliceBatteryStatusCmd_TimeToFull();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFrmware <em>Vertilice Frmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertilice Frmware</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFrmware
	 * @generated
	 */
	EClass getVertiliceFrmware();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFrmware#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFrmware#getVersion()
	 * @see #getVertiliceFrmware()
	 * @generated
	 */
	EAttribute getVertiliceFrmware_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd <em>Vertilice Failure Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertilice Failure Cmd</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd
	 * @generated
	 */
	EClass getVertiliceFailureCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getCode()
	 * @see #getVertiliceFailureCmd()
	 * @generated
	 */
	EAttribute getVertiliceFailureCmd_Code();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd#getSeverity()
	 * @see #getVertiliceFailureCmd()
	 * @generated
	 */
	EAttribute getVertiliceFailureCmd_Severity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzvertiliceFactory getEzvertiliceFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceCmdImpl <em>Vertilice Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceCmdImpl
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceCmd()
		 * @generated
		 */
		EClass VERTILICE_CMD = eINSTANCE.getVertiliceCmd();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_CMD__ID = eINSTANCE.getVertiliceCmd_Id();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_CMD__DATE = eINSTANCE.getVertiliceCmd_Date();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceInstantStatusCmdImpl <em>Vertilice Instant Status Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceInstantStatusCmdImpl
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceInstantStatusCmd()
		 * @generated
		 */
		EClass VERTILICE_INSTANT_STATUS_CMD = eINSTANCE.getVertiliceInstantStatusCmd();

		/**
		 * The meta object literal for the '<em><b>Rpm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_INSTANT_STATUS_CMD__RPM = eINSTANCE.getVertiliceInstantStatusCmd_Rpm();

		/**
		 * The meta object literal for the '<em><b>Volts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_INSTANT_STATUS_CMD__VOLTS = eINSTANCE.getVertiliceInstantStatusCmd_Volts();

		/**
		 * The meta object literal for the '<em><b>Amps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_INSTANT_STATUS_CMD__AMPS = eINSTANCE.getVertiliceInstantStatusCmd_Amps();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl <em>Vertilice Battery Status Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceBatteryStatusCmdImpl
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceBatteryStatusCmd()
		 * @generated
		 */
		EClass VERTILICE_BATTERY_STATUS_CMD = eINSTANCE.getVertiliceBatteryStatusCmd();

		/**
		 * The meta object literal for the '<em><b>Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_BATTERY_STATUS_CMD__PERCENT = eINSTANCE.getVertiliceBatteryStatusCmd_Percent();

		/**
		 * The meta object literal for the '<em><b>Volts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_BATTERY_STATUS_CMD__VOLTS = eINSTANCE.getVertiliceBatteryStatusCmd_Volts();

		/**
		 * The meta object literal for the '<em><b>Amps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_BATTERY_STATUS_CMD__AMPS = eINSTANCE.getVertiliceBatteryStatusCmd_Amps();

		/**
		 * The meta object literal for the '<em><b>Time To Full</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_BATTERY_STATUS_CMD__TIME_TO_FULL = eINSTANCE.getVertiliceBatteryStatusCmd_TimeToFull();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFrmwareImpl <em>Vertilice Frmware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFrmwareImpl
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceFrmware()
		 * @generated
		 */
		EClass VERTILICE_FRMWARE = eINSTANCE.getVertiliceFrmware();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_FRMWARE__VERSION = eINSTANCE.getVertiliceFrmware_Version();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFailureCmdImpl <em>Vertilice Failure Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.VertiliceFailureCmdImpl
		 * @see net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertilicePackageImpl#getVertiliceFailureCmd()
		 * @generated
		 */
		EClass VERTILICE_FAILURE_CMD = eINSTANCE.getVertiliceFailureCmd();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_FAILURE_CMD__CODE = eINSTANCE.getVertiliceFailureCmd_Code();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTILICE_FAILURE_CMD__SEVERITY = eINSTANCE.getVertiliceFailureCmd_Severity();

	}

} //EzvertilicePackage
