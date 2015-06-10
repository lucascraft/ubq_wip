/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

import net.sf.smbt.osc.wiimote.model.wiimote.*;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteFactory;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WiimoteFactoryImpl extends EFactoryImpl implements WiimoteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiimoteFactory init() {
		try {
			WiimoteFactory theWiimoteFactory = (WiimoteFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/osc/wiimote/1.0"); 
			if (theWiimoteFactory != null) {
				return theWiimoteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiimoteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WiimotePackage.WIIMOTE_CMD: return createWiimoteCmd();
			case WiimotePackage.WII_ACCEL_XYZ_CMD: return createWiiAccelXYZCmd();
			case WiimotePackage.WII_ACCEL_PRY_CMD: return createWiiAccelPryCmd();
			case WiimotePackage.WII_BUTTON_CMD: return createWiiButtonCmd();
			case WiimotePackage.WII_IR_XY_SPEED_CMD: return createWiiIrXYSpeedCmd();
			case WiimotePackage.WII_MOTION_ANGLES_CMD: return createWiiMotionAnglesCmd();
			case WiimotePackage.WII_MOTION_VELO_CMD: return createWiiMotionVeloCmd();
			case WiimotePackage.WII_NUNCHUK_ACCEL_PRY_CMD: return createWiiNunchukAccelPryCmd();
			case WiimotePackage.WII_NUNCHUK_BUTTON_CMD: return createWiiNunchukButtonCmd();
			case WiimotePackage.WII_NUNCHUK_JOY_CMD: return createWiiNunchukJoyCmd();
			case WiimotePackage.WII_NUNCHUK_ACCEL_XYZ_CMD: return createWiiNunchukAccelXyzCmd();
			case WiimotePackage.WII_IR_CMD: return createWiiIrCmd();
			case WiimotePackage.WII_ANGLES_CMD: return createWiiAnglesCmd();
			case WiimotePackage.WIIMOTE_MONITOR: return createWiimoteMonitor();
			case WiimotePackage.WIIMOTE_LIVE_SETTINGS: return createWiimoteLiveSettings();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WiimotePackage.WIIMOTE_BUTTON_KIND:
				return createWiimoteButtonKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WiimotePackage.WIIMOTE_BUTTON_KIND:
				return convertWiimoteButtonKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteCmd createWiimoteCmd() {
		WiimoteCmdImpl wiimoteCmd = new WiimoteCmdImpl();
		return wiimoteCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAccelXYZCmd createWiiAccelXYZCmd() {
		WiiAccelXYZCmdImpl wiiAccelXYZCmd = new WiiAccelXYZCmdImpl();
		return wiiAccelXYZCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAccelPryCmd createWiiAccelPryCmd() {
		WiiAccelPryCmdImpl wiiAccelPryCmd = new WiiAccelPryCmdImpl();
		return wiiAccelPryCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiButtonCmd createWiiButtonCmd() {
		WiiButtonCmdImpl wiiButtonCmd = new WiiButtonCmdImpl();
		return wiiButtonCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiIrXYSpeedCmd createWiiIrXYSpeedCmd() {
		WiiIrXYSpeedCmdImpl wiiIrXYSpeedCmd = new WiiIrXYSpeedCmdImpl();
		return wiiIrXYSpeedCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiMotionAnglesCmd createWiiMotionAnglesCmd() {
		WiiMotionAnglesCmdImpl wiiMotionAnglesCmd = new WiiMotionAnglesCmdImpl();
		return wiiMotionAnglesCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiMotionVeloCmd createWiiMotionVeloCmd() {
		WiiMotionVeloCmdImpl wiiMotionVeloCmd = new WiiMotionVeloCmdImpl();
		return wiiMotionVeloCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukAccelPryCmd createWiiNunchukAccelPryCmd() {
		WiiNunchukAccelPryCmdImpl wiiNunchukAccelPryCmd = new WiiNunchukAccelPryCmdImpl();
		return wiiNunchukAccelPryCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukButtonCmd createWiiNunchukButtonCmd() {
		WiiNunchukButtonCmdImpl wiiNunchukButtonCmd = new WiiNunchukButtonCmdImpl();
		return wiiNunchukButtonCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukJoyCmd createWiiNunchukJoyCmd() {
		WiiNunchukJoyCmdImpl wiiNunchukJoyCmd = new WiiNunchukJoyCmdImpl();
		return wiiNunchukJoyCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiNunchukAccelXyzCmd createWiiNunchukAccelXyzCmd() {
		WiiNunchukAccelXyzCmdImpl wiiNunchukAccelXyzCmd = new WiiNunchukAccelXyzCmdImpl();
		return wiiNunchukAccelXyzCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiIrCmd createWiiIrCmd() {
		WiiIrCmdImpl wiiIrCmd = new WiiIrCmdImpl();
		return wiiIrCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiiAnglesCmd createWiiAnglesCmd() {
		WiiAnglesCmdImpl wiiAnglesCmd = new WiiAnglesCmdImpl();
		return wiiAnglesCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteMonitor createWiimoteMonitor() {
		WiimoteMonitorImpl wiimoteMonitor = new WiimoteMonitorImpl();
		return wiimoteMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteLiveSettings createWiimoteLiveSettings() {
		WiimoteLiveSettingsImpl wiimoteLiveSettings = new WiimoteLiveSettingsImpl();
		return wiimoteLiveSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteButtonKind createWiimoteButtonKindFromString(EDataType eDataType, String initialValue) {
		WiimoteButtonKind result = WiimoteButtonKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWiimoteButtonKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimotePackage getWiimotePackage() {
		return (WiimotePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiimotePackage getPackage() {
		return WiimotePackage.eINSTANCE;
	}

} //WiimoteFactoryImpl
