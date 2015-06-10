/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.impl;

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
import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WiimotePackageImpl extends EPackageImpl implements WiimotePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiimoteCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiAccelXYZCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiAccelPryCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiButtonCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiIrXYSpeedCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiMotionAnglesCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiMotionVeloCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiNunchukAccelPryCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiNunchukButtonCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiNunchukJoyCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiNunchukAccelXyzCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiIrCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiiAnglesCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiimoteMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wiimoteLiveSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum wiimoteButtonKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WiimotePackageImpl() {
		super(eNS_URI, WiimoteFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WiimotePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WiimotePackage init() {
		if (isInited) return (WiimotePackage)EPackage.Registry.INSTANCE.getEPackage(WiimotePackage.eNS_URI);

		// Obtain or create and register package
		WiimotePackageImpl theWiimotePackage = (WiimotePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WiimotePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WiimotePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWiimotePackage.createPackageContents();

		// Initialize created meta-data
		theWiimotePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWiimotePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WiimotePackage.eNS_URI, theWiimotePackage);
		return theWiimotePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiimoteCmd() {
		return wiimoteCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiimoteCmd_Addr() {
		return (EAttribute)wiimoteCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiimoteCmd_Wiiid() {
		return (EAttribute)wiimoteCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiAccelXYZCmd() {
		return wiiAccelXYZCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelXYZCmd_X() {
		return (EAttribute)wiiAccelXYZCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelXYZCmd_Y() {
		return (EAttribute)wiiAccelXYZCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelXYZCmd_Z() {
		return (EAttribute)wiiAccelXYZCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiAccelPryCmd() {
		return wiiAccelPryCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelPryCmd_Pitch() {
		return (EAttribute)wiiAccelPryCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelPryCmd_Roll() {
		return (EAttribute)wiiAccelPryCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelPryCmd_Yaw() {
		return (EAttribute)wiiAccelPryCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAccelPryCmd_Accel() {
		return (EAttribute)wiiAccelPryCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiButtonCmd() {
		return wiiButtonCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiButtonCmd_Toggle() {
		return (EAttribute)wiiButtonCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiButtonCmd_Kind() {
		return (EAttribute)wiiButtonCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiIrXYSpeedCmd() {
		return wiiIrXYSpeedCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiIrXYSpeedCmd_X() {
		return (EAttribute)wiiIrXYSpeedCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiIrXYSpeedCmd_Y() {
		return (EAttribute)wiiIrXYSpeedCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiIrXYSpeedCmd_Speed() {
		return (EAttribute)wiiIrXYSpeedCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiIrXYSpeedCmd_Wid() {
		return (EAttribute)wiiIrXYSpeedCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiMotionAnglesCmd() {
		return wiiMotionAnglesCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiMotionAnglesCmd_Pitch() {
		return (EAttribute)wiiMotionAnglesCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiMotionAnglesCmd_Roll() {
		return (EAttribute)wiiMotionAnglesCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiMotionAnglesCmd_Yaw() {
		return (EAttribute)wiiMotionAnglesCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiMotionVeloCmd() {
		return wiiMotionVeloCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiMotionVeloCmd_Pitch_velocity() {
		return (EAttribute)wiiMotionVeloCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiMotionVeloCmd_Roll_velocity() {
		return (EAttribute)wiiMotionVeloCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiMotionVeloCmd_Yaw_velocity() {
		return (EAttribute)wiiMotionVeloCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiNunchukAccelPryCmd() {
		return wiiNunchukAccelPryCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukAccelPryCmd_Pitch() {
		return (EAttribute)wiiNunchukAccelPryCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukAccelPryCmd_Roll() {
		return (EAttribute)wiiNunchukAccelPryCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukAccelPryCmd_Yaw() {
		return (EAttribute)wiiNunchukAccelPryCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukAccelPryCmd_Accel() {
		return (EAttribute)wiiNunchukAccelPryCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiNunchukButtonCmd() {
		return wiiNunchukButtonCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukButtonCmd_Toggle() {
		return (EAttribute)wiiNunchukButtonCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukButtonCmd_Kind() {
		return (EAttribute)wiiNunchukButtonCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiNunchukJoyCmd() {
		return wiiNunchukJoyCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukJoyCmd_X() {
		return (EAttribute)wiiNunchukJoyCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukJoyCmd_Y() {
		return (EAttribute)wiiNunchukJoyCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiNunchukAccelXyzCmd() {
		return wiiNunchukAccelXyzCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukAccelXyzCmd_X() {
		return (EAttribute)wiiNunchukAccelXyzCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukAccelXyzCmd_Y() {
		return (EAttribute)wiiNunchukAccelXyzCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiNunchukAccelXyzCmd_Z() {
		return (EAttribute)wiiNunchukAccelXyzCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiIrCmd() {
		return wiiIrCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiIrCmd_X() {
		return (EAttribute)wiiIrCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiIrCmd_Y() {
		return (EAttribute)wiiIrCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiiAnglesCmd() {
		return wiiAnglesCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAnglesCmd_Pitch() {
		return (EAttribute)wiiAnglesCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAnglesCmd_Roll() {
		return (EAttribute)wiiAnglesCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiiAnglesCmd_Yaw() {
		return (EAttribute)wiiAnglesCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiimoteMonitor() {
		return wiimoteMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteMonitor_Wiimotes() {
		return (EReference)wiimoteMonitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWiimoteLiveSettings() {
		return wiimoteLiveSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_AccelXYZ() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_AccelPRY() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_WiiButtons() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_NunchukButtons() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_MotionVelocity() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_MotionAngles() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_Angles() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_Ir() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_NunchukAccelPRY() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_IrXYSpeed() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_NunchukAccelXYZ() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWiimoteLiveSettings_NunchukJoystickXY() {
		return (EReference)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWiimoteLiveSettings_Wiiid() {
		return (EAttribute)wiimoteLiveSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWiimoteButtonKind() {
		return wiimoteButtonKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteFactory getWiimoteFactory() {
		return (WiimoteFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		wiimoteCmdEClass = createEClass(WIIMOTE_CMD);
		createEAttribute(wiimoteCmdEClass, WIIMOTE_CMD__ADDR);
		createEAttribute(wiimoteCmdEClass, WIIMOTE_CMD__WIIID);

		wiiAccelXYZCmdEClass = createEClass(WII_ACCEL_XYZ_CMD);
		createEAttribute(wiiAccelXYZCmdEClass, WII_ACCEL_XYZ_CMD__X);
		createEAttribute(wiiAccelXYZCmdEClass, WII_ACCEL_XYZ_CMD__Y);
		createEAttribute(wiiAccelXYZCmdEClass, WII_ACCEL_XYZ_CMD__Z);

		wiiAccelPryCmdEClass = createEClass(WII_ACCEL_PRY_CMD);
		createEAttribute(wiiAccelPryCmdEClass, WII_ACCEL_PRY_CMD__PITCH);
		createEAttribute(wiiAccelPryCmdEClass, WII_ACCEL_PRY_CMD__ROLL);
		createEAttribute(wiiAccelPryCmdEClass, WII_ACCEL_PRY_CMD__YAW);
		createEAttribute(wiiAccelPryCmdEClass, WII_ACCEL_PRY_CMD__ACCEL);

		wiiButtonCmdEClass = createEClass(WII_BUTTON_CMD);
		createEAttribute(wiiButtonCmdEClass, WII_BUTTON_CMD__TOGGLE);
		createEAttribute(wiiButtonCmdEClass, WII_BUTTON_CMD__KIND);

		wiiIrXYSpeedCmdEClass = createEClass(WII_IR_XY_SPEED_CMD);
		createEAttribute(wiiIrXYSpeedCmdEClass, WII_IR_XY_SPEED_CMD__X);
		createEAttribute(wiiIrXYSpeedCmdEClass, WII_IR_XY_SPEED_CMD__Y);
		createEAttribute(wiiIrXYSpeedCmdEClass, WII_IR_XY_SPEED_CMD__SPEED);
		createEAttribute(wiiIrXYSpeedCmdEClass, WII_IR_XY_SPEED_CMD__WID);

		wiiMotionAnglesCmdEClass = createEClass(WII_MOTION_ANGLES_CMD);
		createEAttribute(wiiMotionAnglesCmdEClass, WII_MOTION_ANGLES_CMD__PITCH);
		createEAttribute(wiiMotionAnglesCmdEClass, WII_MOTION_ANGLES_CMD__ROLL);
		createEAttribute(wiiMotionAnglesCmdEClass, WII_MOTION_ANGLES_CMD__YAW);

		wiiMotionVeloCmdEClass = createEClass(WII_MOTION_VELO_CMD);
		createEAttribute(wiiMotionVeloCmdEClass, WII_MOTION_VELO_CMD__PITCH_VELOCITY);
		createEAttribute(wiiMotionVeloCmdEClass, WII_MOTION_VELO_CMD__ROLL_VELOCITY);
		createEAttribute(wiiMotionVeloCmdEClass, WII_MOTION_VELO_CMD__YAW_VELOCITY);

		wiiNunchukAccelPryCmdEClass = createEClass(WII_NUNCHUK_ACCEL_PRY_CMD);
		createEAttribute(wiiNunchukAccelPryCmdEClass, WII_NUNCHUK_ACCEL_PRY_CMD__PITCH);
		createEAttribute(wiiNunchukAccelPryCmdEClass, WII_NUNCHUK_ACCEL_PRY_CMD__ROLL);
		createEAttribute(wiiNunchukAccelPryCmdEClass, WII_NUNCHUK_ACCEL_PRY_CMD__YAW);
		createEAttribute(wiiNunchukAccelPryCmdEClass, WII_NUNCHUK_ACCEL_PRY_CMD__ACCEL);

		wiiNunchukButtonCmdEClass = createEClass(WII_NUNCHUK_BUTTON_CMD);
		createEAttribute(wiiNunchukButtonCmdEClass, WII_NUNCHUK_BUTTON_CMD__TOGGLE);
		createEAttribute(wiiNunchukButtonCmdEClass, WII_NUNCHUK_BUTTON_CMD__KIND);

		wiiNunchukJoyCmdEClass = createEClass(WII_NUNCHUK_JOY_CMD);
		createEAttribute(wiiNunchukJoyCmdEClass, WII_NUNCHUK_JOY_CMD__X);
		createEAttribute(wiiNunchukJoyCmdEClass, WII_NUNCHUK_JOY_CMD__Y);

		wiiNunchukAccelXyzCmdEClass = createEClass(WII_NUNCHUK_ACCEL_XYZ_CMD);
		createEAttribute(wiiNunchukAccelXyzCmdEClass, WII_NUNCHUK_ACCEL_XYZ_CMD__X);
		createEAttribute(wiiNunchukAccelXyzCmdEClass, WII_NUNCHUK_ACCEL_XYZ_CMD__Y);
		createEAttribute(wiiNunchukAccelXyzCmdEClass, WII_NUNCHUK_ACCEL_XYZ_CMD__Z);

		wiiIrCmdEClass = createEClass(WII_IR_CMD);
		createEAttribute(wiiIrCmdEClass, WII_IR_CMD__X);
		createEAttribute(wiiIrCmdEClass, WII_IR_CMD__Y);

		wiiAnglesCmdEClass = createEClass(WII_ANGLES_CMD);
		createEAttribute(wiiAnglesCmdEClass, WII_ANGLES_CMD__PITCH);
		createEAttribute(wiiAnglesCmdEClass, WII_ANGLES_CMD__ROLL);
		createEAttribute(wiiAnglesCmdEClass, WII_ANGLES_CMD__YAW);

		wiimoteMonitorEClass = createEClass(WIIMOTE_MONITOR);
		createEReference(wiimoteMonitorEClass, WIIMOTE_MONITOR__WIIMOTES);

		wiimoteLiveSettingsEClass = createEClass(WIIMOTE_LIVE_SETTINGS);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__ACCEL_XYZ);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__ACCEL_PRY);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__WII_BUTTONS);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__NUNCHUK_BUTTONS);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__MOTION_VELOCITY);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__MOTION_ANGLES);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__ANGLES);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__IR);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_PRY);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__IR_XY_SPEED);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__NUNCHUK_ACCEL_XYZ);
		createEReference(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__NUNCHUK_JOYSTICK_XY);
		createEAttribute(wiimoteLiveSettingsEClass, WIIMOTE_LIVE_SETTINGS__WIIID);

		// Create enums
		wiimoteButtonKindEEnum = createEEnum(WIIMOTE_BUTTON_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		wiimoteCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		wiiAccelXYZCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiAccelPryCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiButtonCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiIrXYSpeedCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiMotionAnglesCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiMotionVeloCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiNunchukAccelPryCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiNunchukButtonCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiNunchukJoyCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiNunchukAccelXyzCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiIrCmdEClass.getESuperTypes().add(this.getWiimoteCmd());
		wiiAnglesCmdEClass.getESuperTypes().add(this.getWiimoteCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(wiimoteCmdEClass, WiimoteCmd.class, "WiimoteCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiimoteCmd_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, WiimoteCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiimoteCmd_Wiiid(), ecorePackage.getEString(), "wiiid", null, 0, 1, WiimoteCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiAccelXYZCmdEClass, WiiAccelXYZCmd.class, "WiiAccelXYZCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiAccelXYZCmd_X(), ecorePackage.getEFloat(), "x", null, 0, 1, WiiAccelXYZCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelXYZCmd_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, WiiAccelXYZCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelXYZCmd_Z(), ecorePackage.getEFloat(), "z", null, 0, 1, WiiAccelXYZCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiAccelPryCmdEClass, WiiAccelPryCmd.class, "WiiAccelPryCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiAccelPryCmd_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, WiiAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelPryCmd_Roll(), ecorePackage.getEFloat(), "roll", null, 0, 1, WiiAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelPryCmd_Yaw(), ecorePackage.getEFloat(), "yaw", null, 0, 1, WiiAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAccelPryCmd_Accel(), ecorePackage.getEFloat(), "accel", null, 0, 1, WiiAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiButtonCmdEClass, WiiButtonCmd.class, "WiiButtonCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiButtonCmd_Toggle(), ecorePackage.getEFloat(), "toggle", null, 0, 1, WiiButtonCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiButtonCmd_Kind(), this.getWiimoteButtonKind(), "kind", null, 0, 1, WiiButtonCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiIrXYSpeedCmdEClass, WiiIrXYSpeedCmd.class, "WiiIrXYSpeedCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiIrXYSpeedCmd_X(), ecorePackage.getEFloat(), "x", null, 0, 1, WiiIrXYSpeedCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiIrXYSpeedCmd_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, WiiIrXYSpeedCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiIrXYSpeedCmd_Speed(), ecorePackage.getEFloat(), "speed", null, 0, 1, WiiIrXYSpeedCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiIrXYSpeedCmd_Wid(), ecorePackage.getEFloat(), "wid", null, 0, 1, WiiIrXYSpeedCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiMotionAnglesCmdEClass, WiiMotionAnglesCmd.class, "WiiMotionAnglesCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiMotionAnglesCmd_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, WiiMotionAnglesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiMotionAnglesCmd_Roll(), ecorePackage.getEFloat(), "roll", null, 0, 1, WiiMotionAnglesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiMotionAnglesCmd_Yaw(), ecorePackage.getEFloat(), "yaw", null, 0, 1, WiiMotionAnglesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiMotionVeloCmdEClass, WiiMotionVeloCmd.class, "WiiMotionVeloCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiMotionVeloCmd_Pitch_velocity(), ecorePackage.getEFloat(), "pitch_velocity", null, 0, 1, WiiMotionVeloCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiMotionVeloCmd_Roll_velocity(), ecorePackage.getEFloat(), "roll_velocity", null, 0, 1, WiiMotionVeloCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiMotionVeloCmd_Yaw_velocity(), ecorePackage.getEFloat(), "yaw_velocity", null, 0, 1, WiiMotionVeloCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiNunchukAccelPryCmdEClass, WiiNunchukAccelPryCmd.class, "WiiNunchukAccelPryCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiNunchukAccelPryCmd_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, WiiNunchukAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukAccelPryCmd_Roll(), ecorePackage.getEFloat(), "roll", null, 0, 1, WiiNunchukAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukAccelPryCmd_Yaw(), ecorePackage.getEFloat(), "yaw", null, 0, 1, WiiNunchukAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukAccelPryCmd_Accel(), ecorePackage.getEFloat(), "accel", null, 0, 1, WiiNunchukAccelPryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiNunchukButtonCmdEClass, WiiNunchukButtonCmd.class, "WiiNunchukButtonCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiNunchukButtonCmd_Toggle(), ecorePackage.getEFloat(), "toggle", null, 0, 1, WiiNunchukButtonCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukButtonCmd_Kind(), this.getWiimoteButtonKind(), "kind", null, 0, 1, WiiNunchukButtonCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiNunchukJoyCmdEClass, WiiNunchukJoyCmd.class, "WiiNunchukJoyCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiNunchukJoyCmd_X(), ecorePackage.getEFloat(), "x", null, 0, 1, WiiNunchukJoyCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukJoyCmd_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, WiiNunchukJoyCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiNunchukAccelXyzCmdEClass, WiiNunchukAccelXyzCmd.class, "WiiNunchukAccelXyzCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiNunchukAccelXyzCmd_X(), ecorePackage.getEFloat(), "x", null, 0, 1, WiiNunchukAccelXyzCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukAccelXyzCmd_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, WiiNunchukAccelXyzCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiNunchukAccelXyzCmd_Z(), ecorePackage.getEFloat(), "z", null, 0, 1, WiiNunchukAccelXyzCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiIrCmdEClass, WiiIrCmd.class, "WiiIrCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiIrCmd_X(), ecorePackage.getEFloat(), "x", null, 0, 1, WiiIrCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiIrCmd_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, WiiIrCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiiAnglesCmdEClass, WiiAnglesCmd.class, "WiiAnglesCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWiiAnglesCmd_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, WiiAnglesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAnglesCmd_Roll(), ecorePackage.getEFloat(), "roll", null, 0, 1, WiiAnglesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiiAnglesCmd_Yaw(), ecorePackage.getEFloat(), "yaw", null, 0, 1, WiiAnglesCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiimoteMonitorEClass, WiimoteMonitor.class, "WiimoteMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWiimoteMonitor_Wiimotes(), this.getWiimoteLiveSettings(), null, "wiimotes", null, 0, -1, WiimoteMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wiimoteLiveSettingsEClass, WiimoteLiveSettings.class, "WiimoteLiveSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWiimoteLiveSettings_AccelXYZ(), this.getWiiAccelXYZCmd(), null, "accelXYZ", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_AccelPRY(), this.getWiiAccelPryCmd(), null, "accelPRY", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_WiiButtons(), this.getWiiButtonCmd(), null, "wiiButtons", null, 0, -1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_NunchukButtons(), this.getWiiNunchukButtonCmd(), null, "nunchukButtons", null, 0, -1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_MotionVelocity(), this.getWiiMotionVeloCmd(), null, "motionVelocity", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_MotionAngles(), this.getWiiMotionAnglesCmd(), null, "motionAngles", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_Angles(), this.getWiiAnglesCmd(), null, "angles", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_Ir(), this.getWiiIrCmd(), null, "ir", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_NunchukAccelPRY(), this.getWiiNunchukAccelPryCmd(), null, "nunchukAccelPRY", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_IrXYSpeed(), this.getWiiIrXYSpeedCmd(), null, "irXYSpeed", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_NunchukAccelXYZ(), this.getWiiNunchukAccelXyzCmd(), null, "nunchukAccelXYZ", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWiimoteLiveSettings_NunchukJoystickXY(), this.getWiiNunchukJoyCmd(), null, "nunchukJoystickXY", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWiimoteLiveSettings_Wiiid(), ecorePackage.getEString(), "wiiid", null, 0, 1, WiimoteLiveSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(wiimoteButtonKindEEnum, WiimoteButtonKind.class, "WiimoteButtonKind");
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.ONE);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.TWO);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.A);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.B);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.C);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.Z);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.HOME);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.UP);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.LEFT);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.DOWN);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.RIGHT);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.MINUS);
		addEEnumLiteral(wiimoteButtonKindEEnum, WiimoteButtonKind.PLUS);

		// Create resource
		createResource(eNS_URI);
	}

} //WiimotePackageImpl
