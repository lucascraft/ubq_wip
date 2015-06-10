/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteFactory
 * @model kind="package"
 * @generated
 */
public interface WiimotePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wiimote";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/osc/wiimote/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wiimote";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiimotePackage eINSTANCE = net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteCmdImpl <em>Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteCmd()
	 * @generated
	 */
	int WIIMOTE_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CMD__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CMD__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CMD__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CMD__ADDR = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CMD__WIIID = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CMD_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelXYZCmdImpl <em>Wii Accel XYZ Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelXYZCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiAccelXYZCmd()
	 * @generated
	 */
	int WII_ACCEL_XYZ_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__X = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__Y = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD__Z = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wii Accel XYZ Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_XYZ_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelPryCmdImpl <em>Wii Accel Pry Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelPryCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiAccelPryCmd()
	 * @generated
	 */
	int WII_ACCEL_PRY_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__PITCH = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__ROLL = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__YAW = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD__ACCEL = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Wii Accel Pry Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ACCEL_PRY_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiButtonCmdImpl <em>Wii Button Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiButtonCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiButtonCmd()
	 * @generated
	 */
	int WII_BUTTON_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD__TOGGLE = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD__KIND = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Button Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_BUTTON_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrXYSpeedCmdImpl <em>Wii Ir XY Speed Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrXYSpeedCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiIrXYSpeedCmd()
	 * @generated
	 */
	int WII_IR_XY_SPEED_CMD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__X = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__Y = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__SPEED = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Wid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD__WID = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Wii Ir XY Speed Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_XY_SPEED_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionAnglesCmdImpl <em>Wii Motion Angles Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionAnglesCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiMotionAnglesCmd()
	 * @generated
	 */
	int WII_MOTION_ANGLES_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__PITCH = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__ROLL = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD__YAW = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wii Motion Angles Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_ANGLES_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionVeloCmdImpl <em>Wii Motion Velo Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionVeloCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiMotionVeloCmd()
	 * @generated
	 */
	int WII_MOTION_VELO_CMD = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>Pitch velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__PITCH_VELOCITY = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roll velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__ROLL_VELOCITY = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Yaw velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD__YAW_VELOCITY = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wii Motion Velo Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_MOTION_VELO_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl <em>Wii Nunchuk Accel Pry Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukAccelPryCmd()
	 * @generated
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__PITCH = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__ROLL = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__YAW = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD__ACCEL = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Wii Nunchuk Accel Pry Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_PRY_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukButtonCmdImpl <em>Wii Nunchuk Button Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukButtonCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukButtonCmd()
	 * @generated
	 */
	int WII_NUNCHUK_BUTTON_CMD = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD__TOGGLE = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD__KIND = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Nunchuk Button Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_BUTTON_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukJoyCmdImpl <em>Wii Nunchuk Joy Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukJoyCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukJoyCmd()
	 * @generated
	 */
	int WII_NUNCHUK_JOY_CMD = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD__X = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD__Y = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Nunchuk Joy Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_JOY_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelXyzCmdImpl <em>Wii Nunchuk Accel Xyz Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelXyzCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukAccelXyzCmd()
	 * @generated
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__X = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__Y = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD__Z = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wii Nunchuk Accel Xyz Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_NUNCHUK_ACCEL_XYZ_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrCmdImpl <em>Wii Ir Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiIrCmd()
	 * @generated
	 */
	int WII_IR_CMD = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD__X = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD__Y = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wii Ir Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_IR_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAnglesCmdImpl <em>Wii Angles Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAnglesCmdImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiAnglesCmd()
	 * @generated
	 */
	int WII_ANGLES_CMD = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__PRIORITY = WIIMOTE_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__STAMP = WIIMOTE_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__MSG = WIIMOTE_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__ADDR = WIIMOTE_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__WIIID = WIIMOTE_CMD__WIIID;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__PITCH = WIIMOTE_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__ROLL = WIIMOTE_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD__YAW = WIIMOTE_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wii Angles Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WII_ANGLES_CMD_FEATURE_COUNT = WIIMOTE_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteMonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteMonitorImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteMonitor()
	 * @generated
	 */
	int WIIMOTE_MONITOR = 13;

	/**
	 * The feature id for the '<em><b>Wiimotes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_MONITOR__WIIMOTES = 0;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_MONITOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl <em>Live Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteLiveSettings()
	 * @generated
	 */
	int WIIMOTE_LIVE_SETTINGS = 14;

	/**
	 * The feature id for the '<em><b>Accel XYZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__ACCEL_XYZ = 0;

	/**
	 * The feature id for the '<em><b>Accel PRY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__ACCEL_PRY = 1;

	/**
	 * The feature id for the '<em><b>Wii Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__WII_BUTTONS = 2;

	/**
	 * The feature id for the '<em><b>Nunchuk Buttons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__NUNCHUK_BUTTONS = 3;

	/**
	 * The feature id for the '<em><b>Motion Velocity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__MOTION_VELOCITY = 4;

	/**
	 * The feature id for the '<em><b>Motion Angles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__MOTION_ANGLES = 5;

	/**
	 * The feature id for the '<em><b>Angles</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__ANGLES = 6;

	/**
	 * The feature id for the '<em><b>Ir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__IR = 7;

	/**
	 * The feature id for the '<em><b>Nunchuk Accel PRY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_PRY = 8;

	/**
	 * The feature id for the '<em><b>Ir XY Speed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__IR_XY_SPEED = 9;

	/**
	 * The feature id for the '<em><b>Nunchuk Accel XYZ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_XYZ = 10;

	/**
	 * The feature id for the '<em><b>Nunchuk Joystick XY</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__NUNCHUK_JOYSTICK_XY = 11;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS__WIIID = 12;

	/**
	 * The number of structural features of the '<em>Live Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_LIVE_SETTINGS_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind <em>Button Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteButtonKind()
	 * @generated
	 */
	int WIIMOTE_BUTTON_KIND = 15;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd
	 * @generated
	 */
	EClass getWiimoteCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getAddr()
	 * @see #getWiimoteCmd()
	 * @generated
	 */
	EAttribute getWiimoteCmd_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getWiiid <em>Wiiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiiid</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getWiiid()
	 * @see #getWiimoteCmd()
	 * @generated
	 */
	EAttribute getWiimoteCmd_Wiiid();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd <em>Wii Accel XYZ Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Accel XYZ Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd
	 * @generated
	 */
	EClass getWiiAccelXYZCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd#getX()
	 * @see #getWiiAccelXYZCmd()
	 * @generated
	 */
	EAttribute getWiiAccelXYZCmd_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd#getY()
	 * @see #getWiiAccelXYZCmd()
	 * @generated
	 */
	EAttribute getWiiAccelXYZCmd_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd#getZ()
	 * @see #getWiiAccelXYZCmd()
	 * @generated
	 */
	EAttribute getWiiAccelXYZCmd_Z();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd <em>Wii Accel Pry Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Accel Pry Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd
	 * @generated
	 */
	EClass getWiiAccelPryCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getPitch()
	 * @see #getWiiAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiAccelPryCmd_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getRoll()
	 * @see #getWiiAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiAccelPryCmd_Roll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getYaw()
	 * @see #getWiiAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiAccelPryCmd_Yaw();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getAccel <em>Accel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accel</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd#getAccel()
	 * @see #getWiiAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiAccelPryCmd_Accel();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd <em>Wii Button Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Button Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd
	 * @generated
	 */
	EClass getWiiButtonCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getToggle()
	 * @see #getWiiButtonCmd()
	 * @generated
	 */
	EAttribute getWiiButtonCmd_Toggle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getKind()
	 * @see #getWiiButtonCmd()
	 * @generated
	 */
	EAttribute getWiiButtonCmd_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd <em>Wii Ir XY Speed Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Ir XY Speed Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd
	 * @generated
	 */
	EClass getWiiIrXYSpeedCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getX()
	 * @see #getWiiIrXYSpeedCmd()
	 * @generated
	 */
	EAttribute getWiiIrXYSpeedCmd_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getY()
	 * @see #getWiiIrXYSpeedCmd()
	 * @generated
	 */
	EAttribute getWiiIrXYSpeedCmd_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getSpeed()
	 * @see #getWiiIrXYSpeedCmd()
	 * @generated
	 */
	EAttribute getWiiIrXYSpeedCmd_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getWid <em>Wid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wid</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd#getWid()
	 * @see #getWiiIrXYSpeedCmd()
	 * @generated
	 */
	EAttribute getWiiIrXYSpeedCmd_Wid();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd <em>Wii Motion Angles Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Motion Angles Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd
	 * @generated
	 */
	EClass getWiiMotionAnglesCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd#getPitch()
	 * @see #getWiiMotionAnglesCmd()
	 * @generated
	 */
	EAttribute getWiiMotionAnglesCmd_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd#getRoll()
	 * @see #getWiiMotionAnglesCmd()
	 * @generated
	 */
	EAttribute getWiiMotionAnglesCmd_Roll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd#getYaw()
	 * @see #getWiiMotionAnglesCmd()
	 * @generated
	 */
	EAttribute getWiiMotionAnglesCmd_Yaw();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd <em>Wii Motion Velo Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Motion Velo Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd
	 * @generated
	 */
	EClass getWiiMotionVeloCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getPitch_velocity <em>Pitch velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch velocity</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getPitch_velocity()
	 * @see #getWiiMotionVeloCmd()
	 * @generated
	 */
	EAttribute getWiiMotionVeloCmd_Pitch_velocity();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getRoll_velocity <em>Roll velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll velocity</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getRoll_velocity()
	 * @see #getWiiMotionVeloCmd()
	 * @generated
	 */
	EAttribute getWiiMotionVeloCmd_Roll_velocity();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getYaw_velocity <em>Yaw velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw velocity</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd#getYaw_velocity()
	 * @see #getWiiMotionVeloCmd()
	 * @generated
	 */
	EAttribute getWiiMotionVeloCmd_Yaw_velocity();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd <em>Wii Nunchuk Accel Pry Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Nunchuk Accel Pry Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd
	 * @generated
	 */
	EClass getWiiNunchukAccelPryCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getPitch()
	 * @see #getWiiNunchukAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukAccelPryCmd_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getRoll()
	 * @see #getWiiNunchukAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukAccelPryCmd_Roll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getYaw()
	 * @see #getWiiNunchukAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukAccelPryCmd_Yaw();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getAccel <em>Accel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accel</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd#getAccel()
	 * @see #getWiiNunchukAccelPryCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukAccelPryCmd_Accel();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd <em>Wii Nunchuk Button Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Nunchuk Button Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd
	 * @generated
	 */
	EClass getWiiNunchukButtonCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd#getToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd#getToggle()
	 * @see #getWiiNunchukButtonCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukButtonCmd_Toggle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd#getKind()
	 * @see #getWiiNunchukButtonCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukButtonCmd_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd <em>Wii Nunchuk Joy Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Nunchuk Joy Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd
	 * @generated
	 */
	EClass getWiiNunchukJoyCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd#getX()
	 * @see #getWiiNunchukJoyCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukJoyCmd_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd#getY()
	 * @see #getWiiNunchukJoyCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukJoyCmd_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd <em>Wii Nunchuk Accel Xyz Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Nunchuk Accel Xyz Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd
	 * @generated
	 */
	EClass getWiiNunchukAccelXyzCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd#getX()
	 * @see #getWiiNunchukAccelXyzCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukAccelXyzCmd_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd#getY()
	 * @see #getWiiNunchukAccelXyzCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukAccelXyzCmd_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd#getZ()
	 * @see #getWiiNunchukAccelXyzCmd()
	 * @generated
	 */
	EAttribute getWiiNunchukAccelXyzCmd_Z();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd <em>Wii Ir Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Ir Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd
	 * @generated
	 */
	EClass getWiiIrCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd#getX()
	 * @see #getWiiIrCmd()
	 * @generated
	 */
	EAttribute getWiiIrCmd_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd#getY()
	 * @see #getWiiIrCmd()
	 * @generated
	 */
	EAttribute getWiiIrCmd_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd <em>Wii Angles Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wii Angles Cmd</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd
	 * @generated
	 */
	EClass getWiiAnglesCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getPitch()
	 * @see #getWiiAnglesCmd()
	 * @generated
	 */
	EAttribute getWiiAnglesCmd_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getRoll()
	 * @see #getWiiAnglesCmd()
	 * @generated
	 */
	EAttribute getWiiAnglesCmd_Roll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd#getYaw()
	 * @see #getWiiAnglesCmd()
	 * @generated
	 */
	EAttribute getWiiAnglesCmd_Yaw();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor
	 * @generated
	 */
	EClass getWiimoteMonitor();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor#getWiimotes <em>Wiimotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wiimotes</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor#getWiimotes()
	 * @see #getWiimoteMonitor()
	 * @generated
	 */
	EReference getWiimoteMonitor_Wiimotes();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings <em>Live Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Settings</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings
	 * @generated
	 */
	EClass getWiimoteLiveSettings();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelXYZ <em>Accel XYZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accel XYZ</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelXYZ()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_AccelXYZ();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelPRY <em>Accel PRY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accel PRY</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAccelPRY()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_AccelPRY();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getWiiButtons <em>Wii Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Wii Buttons</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getWiiButtons()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_WiiButtons();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukButtons <em>Nunchuk Buttons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nunchuk Buttons</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukButtons()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_NunchukButtons();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionVelocity <em>Motion Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Motion Velocity</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionVelocity()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_MotionVelocity();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionAngles <em>Motion Angles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Motion Angles</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getMotionAngles()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_MotionAngles();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAngles <em>Angles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Angles</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getAngles()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_Angles();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIr <em>Ir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ir</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIr()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_Ir();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelPRY <em>Nunchuk Accel PRY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nunchuk Accel PRY</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelPRY()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_NunchukAccelPRY();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIrXYSpeed <em>Ir XY Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ir XY Speed</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getIrXYSpeed()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_IrXYSpeed();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelXYZ <em>Nunchuk Accel XYZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nunchuk Accel XYZ</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukAccelXYZ()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_NunchukAccelXYZ();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukJoystickXY <em>Nunchuk Joystick XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nunchuk Joystick XY</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getNunchukJoystickXY()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EReference getWiimoteLiveSettings_NunchukJoystickXY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getWiiid <em>Wiiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiiid</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings#getWiiid()
	 * @see #getWiimoteLiveSettings()
	 * @generated
	 */
	EAttribute getWiimoteLiveSettings_Wiiid();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind <em>Button Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Button Kind</em>'.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind
	 * @generated
	 */
	EEnum getWiimoteButtonKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WiimoteFactory getWiimoteFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteCmdImpl <em>Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteCmd()
		 * @generated
		 */
		EClass WIIMOTE_CMD = eINSTANCE.getWiimoteCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIIMOTE_CMD__ADDR = eINSTANCE.getWiimoteCmd_Addr();

		/**
		 * The meta object literal for the '<em><b>Wiiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIIMOTE_CMD__WIIID = eINSTANCE.getWiimoteCmd_Wiiid();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelXYZCmdImpl <em>Wii Accel XYZ Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelXYZCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiAccelXYZCmd()
		 * @generated
		 */
		EClass WII_ACCEL_XYZ_CMD = eINSTANCE.getWiiAccelXYZCmd();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_XYZ_CMD__X = eINSTANCE.getWiiAccelXYZCmd_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_XYZ_CMD__Y = eINSTANCE.getWiiAccelXYZCmd_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_XYZ_CMD__Z = eINSTANCE.getWiiAccelXYZCmd_Z();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelPryCmdImpl <em>Wii Accel Pry Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAccelPryCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiAccelPryCmd()
		 * @generated
		 */
		EClass WII_ACCEL_PRY_CMD = eINSTANCE.getWiiAccelPryCmd();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_PRY_CMD__PITCH = eINSTANCE.getWiiAccelPryCmd_Pitch();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_PRY_CMD__ROLL = eINSTANCE.getWiiAccelPryCmd_Roll();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_PRY_CMD__YAW = eINSTANCE.getWiiAccelPryCmd_Yaw();

		/**
		 * The meta object literal for the '<em><b>Accel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ACCEL_PRY_CMD__ACCEL = eINSTANCE.getWiiAccelPryCmd_Accel();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiButtonCmdImpl <em>Wii Button Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiButtonCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiButtonCmd()
		 * @generated
		 */
		EClass WII_BUTTON_CMD = eINSTANCE.getWiiButtonCmd();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_BUTTON_CMD__TOGGLE = eINSTANCE.getWiiButtonCmd_Toggle();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_BUTTON_CMD__KIND = eINSTANCE.getWiiButtonCmd_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrXYSpeedCmdImpl <em>Wii Ir XY Speed Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrXYSpeedCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiIrXYSpeedCmd()
		 * @generated
		 */
		EClass WII_IR_XY_SPEED_CMD = eINSTANCE.getWiiIrXYSpeedCmd();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_IR_XY_SPEED_CMD__X = eINSTANCE.getWiiIrXYSpeedCmd_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_IR_XY_SPEED_CMD__Y = eINSTANCE.getWiiIrXYSpeedCmd_Y();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_IR_XY_SPEED_CMD__SPEED = eINSTANCE.getWiiIrXYSpeedCmd_Speed();

		/**
		 * The meta object literal for the '<em><b>Wid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_IR_XY_SPEED_CMD__WID = eINSTANCE.getWiiIrXYSpeedCmd_Wid();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionAnglesCmdImpl <em>Wii Motion Angles Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionAnglesCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiMotionAnglesCmd()
		 * @generated
		 */
		EClass WII_MOTION_ANGLES_CMD = eINSTANCE.getWiiMotionAnglesCmd();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_MOTION_ANGLES_CMD__PITCH = eINSTANCE.getWiiMotionAnglesCmd_Pitch();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_MOTION_ANGLES_CMD__ROLL = eINSTANCE.getWiiMotionAnglesCmd_Roll();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_MOTION_ANGLES_CMD__YAW = eINSTANCE.getWiiMotionAnglesCmd_Yaw();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionVeloCmdImpl <em>Wii Motion Velo Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiMotionVeloCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiMotionVeloCmd()
		 * @generated
		 */
		EClass WII_MOTION_VELO_CMD = eINSTANCE.getWiiMotionVeloCmd();

		/**
		 * The meta object literal for the '<em><b>Pitch velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_MOTION_VELO_CMD__PITCH_VELOCITY = eINSTANCE.getWiiMotionVeloCmd_Pitch_velocity();

		/**
		 * The meta object literal for the '<em><b>Roll velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_MOTION_VELO_CMD__ROLL_VELOCITY = eINSTANCE.getWiiMotionVeloCmd_Roll_velocity();

		/**
		 * The meta object literal for the '<em><b>Yaw velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_MOTION_VELO_CMD__YAW_VELOCITY = eINSTANCE.getWiiMotionVeloCmd_Yaw_velocity();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl <em>Wii Nunchuk Accel Pry Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelPryCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukAccelPryCmd()
		 * @generated
		 */
		EClass WII_NUNCHUK_ACCEL_PRY_CMD = eINSTANCE.getWiiNunchukAccelPryCmd();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_ACCEL_PRY_CMD__PITCH = eINSTANCE.getWiiNunchukAccelPryCmd_Pitch();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_ACCEL_PRY_CMD__ROLL = eINSTANCE.getWiiNunchukAccelPryCmd_Roll();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_ACCEL_PRY_CMD__YAW = eINSTANCE.getWiiNunchukAccelPryCmd_Yaw();

		/**
		 * The meta object literal for the '<em><b>Accel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_ACCEL_PRY_CMD__ACCEL = eINSTANCE.getWiiNunchukAccelPryCmd_Accel();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukButtonCmdImpl <em>Wii Nunchuk Button Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukButtonCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukButtonCmd()
		 * @generated
		 */
		EClass WII_NUNCHUK_BUTTON_CMD = eINSTANCE.getWiiNunchukButtonCmd();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_BUTTON_CMD__TOGGLE = eINSTANCE.getWiiNunchukButtonCmd_Toggle();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_BUTTON_CMD__KIND = eINSTANCE.getWiiNunchukButtonCmd_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukJoyCmdImpl <em>Wii Nunchuk Joy Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukJoyCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukJoyCmd()
		 * @generated
		 */
		EClass WII_NUNCHUK_JOY_CMD = eINSTANCE.getWiiNunchukJoyCmd();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_JOY_CMD__X = eINSTANCE.getWiiNunchukJoyCmd_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_JOY_CMD__Y = eINSTANCE.getWiiNunchukJoyCmd_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelXyzCmdImpl <em>Wii Nunchuk Accel Xyz Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiNunchukAccelXyzCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiNunchukAccelXyzCmd()
		 * @generated
		 */
		EClass WII_NUNCHUK_ACCEL_XYZ_CMD = eINSTANCE.getWiiNunchukAccelXyzCmd();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_ACCEL_XYZ_CMD__X = eINSTANCE.getWiiNunchukAccelXyzCmd_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_ACCEL_XYZ_CMD__Y = eINSTANCE.getWiiNunchukAccelXyzCmd_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_NUNCHUK_ACCEL_XYZ_CMD__Z = eINSTANCE.getWiiNunchukAccelXyzCmd_Z();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrCmdImpl <em>Wii Ir Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiIrCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiIrCmd()
		 * @generated
		 */
		EClass WII_IR_CMD = eINSTANCE.getWiiIrCmd();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_IR_CMD__X = eINSTANCE.getWiiIrCmd_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_IR_CMD__Y = eINSTANCE.getWiiIrCmd_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAnglesCmdImpl <em>Wii Angles Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiiAnglesCmdImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiiAnglesCmd()
		 * @generated
		 */
		EClass WII_ANGLES_CMD = eINSTANCE.getWiiAnglesCmd();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ANGLES_CMD__PITCH = eINSTANCE.getWiiAnglesCmd_Pitch();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ANGLES_CMD__ROLL = eINSTANCE.getWiiAnglesCmd_Roll();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WII_ANGLES_CMD__YAW = eINSTANCE.getWiiAnglesCmd_Yaw();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteMonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteMonitorImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteMonitor()
		 * @generated
		 */
		EClass WIIMOTE_MONITOR = eINSTANCE.getWiimoteMonitor();

		/**
		 * The meta object literal for the '<em><b>Wiimotes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_MONITOR__WIIMOTES = eINSTANCE.getWiimoteMonitor_Wiimotes();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl <em>Live Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimoteLiveSettingsImpl
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteLiveSettings()
		 * @generated
		 */
		EClass WIIMOTE_LIVE_SETTINGS = eINSTANCE.getWiimoteLiveSettings();

		/**
		 * The meta object literal for the '<em><b>Accel XYZ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__ACCEL_XYZ = eINSTANCE.getWiimoteLiveSettings_AccelXYZ();

		/**
		 * The meta object literal for the '<em><b>Accel PRY</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__ACCEL_PRY = eINSTANCE.getWiimoteLiveSettings_AccelPRY();

		/**
		 * The meta object literal for the '<em><b>Wii Buttons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__WII_BUTTONS = eINSTANCE.getWiimoteLiveSettings_WiiButtons();

		/**
		 * The meta object literal for the '<em><b>Nunchuk Buttons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__NUNCHUK_BUTTONS = eINSTANCE.getWiimoteLiveSettings_NunchukButtons();

		/**
		 * The meta object literal for the '<em><b>Motion Velocity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__MOTION_VELOCITY = eINSTANCE.getWiimoteLiveSettings_MotionVelocity();

		/**
		 * The meta object literal for the '<em><b>Motion Angles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__MOTION_ANGLES = eINSTANCE.getWiimoteLiveSettings_MotionAngles();

		/**
		 * The meta object literal for the '<em><b>Angles</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__ANGLES = eINSTANCE.getWiimoteLiveSettings_Angles();

		/**
		 * The meta object literal for the '<em><b>Ir</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__IR = eINSTANCE.getWiimoteLiveSettings_Ir();

		/**
		 * The meta object literal for the '<em><b>Nunchuk Accel PRY</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_PRY = eINSTANCE.getWiimoteLiveSettings_NunchukAccelPRY();

		/**
		 * The meta object literal for the '<em><b>Ir XY Speed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__IR_XY_SPEED = eINSTANCE.getWiimoteLiveSettings_IrXYSpeed();

		/**
		 * The meta object literal for the '<em><b>Nunchuk Accel XYZ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_XYZ = eINSTANCE.getWiimoteLiveSettings_NunchukAccelXYZ();

		/**
		 * The meta object literal for the '<em><b>Nunchuk Joystick XY</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_LIVE_SETTINGS__NUNCHUK_JOYSTICK_XY = eINSTANCE.getWiimoteLiveSettings_NunchukJoystickXY();

		/**
		 * The meta object literal for the '<em><b>Wiiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIIMOTE_LIVE_SETTINGS__WIIID = eINSTANCE.getWiimoteLiveSettings_Wiiid();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind <em>Button Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind
		 * @see net.sf.smbt.osc.wiimote.model.wiimote.impl.WiimotePackageImpl#getWiimoteButtonKind()
		 * @generated
		 */
		EEnum WIIMOTE_BUTTON_KIND = eINSTANCE.getWiimoteButtonKind();

	}

} //WiimotePackage
