/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.util;

import java.util.List;

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
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.OscRcvCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage
 * @generated
 */
public class WiimoteSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WiimotePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteSwitch() {
		if (modelPackage == null) {
			modelPackage = WiimotePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WiimotePackage.WIIMOTE_CMD: {
				WiimoteCmd wiimoteCmd = (WiimoteCmd)theEObject;
				T result = caseWiimoteCmd(wiimoteCmd);
				if (result == null) result = caseOscRcvCmd(wiimoteCmd);
				if (result == null) result = caseOscCmd(wiimoteCmd);
				if (result == null) result = caseCmd(wiimoteCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_ACCEL_XYZ_CMD: {
				WiiAccelXYZCmd wiiAccelXYZCmd = (WiiAccelXYZCmd)theEObject;
				T result = caseWiiAccelXYZCmd(wiiAccelXYZCmd);
				if (result == null) result = caseWiimoteCmd(wiiAccelXYZCmd);
				if (result == null) result = caseOscRcvCmd(wiiAccelXYZCmd);
				if (result == null) result = caseOscCmd(wiiAccelXYZCmd);
				if (result == null) result = caseCmd(wiiAccelXYZCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_ACCEL_PRY_CMD: {
				WiiAccelPryCmd wiiAccelPryCmd = (WiiAccelPryCmd)theEObject;
				T result = caseWiiAccelPryCmd(wiiAccelPryCmd);
				if (result == null) result = caseWiimoteCmd(wiiAccelPryCmd);
				if (result == null) result = caseOscRcvCmd(wiiAccelPryCmd);
				if (result == null) result = caseOscCmd(wiiAccelPryCmd);
				if (result == null) result = caseCmd(wiiAccelPryCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_BUTTON_CMD: {
				WiiButtonCmd wiiButtonCmd = (WiiButtonCmd)theEObject;
				T result = caseWiiButtonCmd(wiiButtonCmd);
				if (result == null) result = caseWiimoteCmd(wiiButtonCmd);
				if (result == null) result = caseOscRcvCmd(wiiButtonCmd);
				if (result == null) result = caseOscCmd(wiiButtonCmd);
				if (result == null) result = caseCmd(wiiButtonCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_IR_XY_SPEED_CMD: {
				WiiIrXYSpeedCmd wiiIrXYSpeedCmd = (WiiIrXYSpeedCmd)theEObject;
				T result = caseWiiIrXYSpeedCmd(wiiIrXYSpeedCmd);
				if (result == null) result = caseWiimoteCmd(wiiIrXYSpeedCmd);
				if (result == null) result = caseOscRcvCmd(wiiIrXYSpeedCmd);
				if (result == null) result = caseOscCmd(wiiIrXYSpeedCmd);
				if (result == null) result = caseCmd(wiiIrXYSpeedCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_MOTION_ANGLES_CMD: {
				WiiMotionAnglesCmd wiiMotionAnglesCmd = (WiiMotionAnglesCmd)theEObject;
				T result = caseWiiMotionAnglesCmd(wiiMotionAnglesCmd);
				if (result == null) result = caseWiimoteCmd(wiiMotionAnglesCmd);
				if (result == null) result = caseOscRcvCmd(wiiMotionAnglesCmd);
				if (result == null) result = caseOscCmd(wiiMotionAnglesCmd);
				if (result == null) result = caseCmd(wiiMotionAnglesCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_MOTION_VELO_CMD: {
				WiiMotionVeloCmd wiiMotionVeloCmd = (WiiMotionVeloCmd)theEObject;
				T result = caseWiiMotionVeloCmd(wiiMotionVeloCmd);
				if (result == null) result = caseWiimoteCmd(wiiMotionVeloCmd);
				if (result == null) result = caseOscRcvCmd(wiiMotionVeloCmd);
				if (result == null) result = caseOscCmd(wiiMotionVeloCmd);
				if (result == null) result = caseCmd(wiiMotionVeloCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_NUNCHUK_ACCEL_PRY_CMD: {
				WiiNunchukAccelPryCmd wiiNunchukAccelPryCmd = (WiiNunchukAccelPryCmd)theEObject;
				T result = caseWiiNunchukAccelPryCmd(wiiNunchukAccelPryCmd);
				if (result == null) result = caseWiimoteCmd(wiiNunchukAccelPryCmd);
				if (result == null) result = caseOscRcvCmd(wiiNunchukAccelPryCmd);
				if (result == null) result = caseOscCmd(wiiNunchukAccelPryCmd);
				if (result == null) result = caseCmd(wiiNunchukAccelPryCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_NUNCHUK_BUTTON_CMD: {
				WiiNunchukButtonCmd wiiNunchukButtonCmd = (WiiNunchukButtonCmd)theEObject;
				T result = caseWiiNunchukButtonCmd(wiiNunchukButtonCmd);
				if (result == null) result = caseWiimoteCmd(wiiNunchukButtonCmd);
				if (result == null) result = caseOscRcvCmd(wiiNunchukButtonCmd);
				if (result == null) result = caseOscCmd(wiiNunchukButtonCmd);
				if (result == null) result = caseCmd(wiiNunchukButtonCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_NUNCHUK_JOY_CMD: {
				WiiNunchukJoyCmd wiiNunchukJoyCmd = (WiiNunchukJoyCmd)theEObject;
				T result = caseWiiNunchukJoyCmd(wiiNunchukJoyCmd);
				if (result == null) result = caseWiimoteCmd(wiiNunchukJoyCmd);
				if (result == null) result = caseOscRcvCmd(wiiNunchukJoyCmd);
				if (result == null) result = caseOscCmd(wiiNunchukJoyCmd);
				if (result == null) result = caseCmd(wiiNunchukJoyCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_NUNCHUK_ACCEL_XYZ_CMD: {
				WiiNunchukAccelXyzCmd wiiNunchukAccelXyzCmd = (WiiNunchukAccelXyzCmd)theEObject;
				T result = caseWiiNunchukAccelXyzCmd(wiiNunchukAccelXyzCmd);
				if (result == null) result = caseWiimoteCmd(wiiNunchukAccelXyzCmd);
				if (result == null) result = caseOscRcvCmd(wiiNunchukAccelXyzCmd);
				if (result == null) result = caseOscCmd(wiiNunchukAccelXyzCmd);
				if (result == null) result = caseCmd(wiiNunchukAccelXyzCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_IR_CMD: {
				WiiIrCmd wiiIrCmd = (WiiIrCmd)theEObject;
				T result = caseWiiIrCmd(wiiIrCmd);
				if (result == null) result = caseWiimoteCmd(wiiIrCmd);
				if (result == null) result = caseOscRcvCmd(wiiIrCmd);
				if (result == null) result = caseOscCmd(wiiIrCmd);
				if (result == null) result = caseCmd(wiiIrCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WII_ANGLES_CMD: {
				WiiAnglesCmd wiiAnglesCmd = (WiiAnglesCmd)theEObject;
				T result = caseWiiAnglesCmd(wiiAnglesCmd);
				if (result == null) result = caseWiimoteCmd(wiiAnglesCmd);
				if (result == null) result = caseOscRcvCmd(wiiAnglesCmd);
				if (result == null) result = caseOscCmd(wiiAnglesCmd);
				if (result == null) result = caseCmd(wiiAnglesCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WIIMOTE_MONITOR: {
				WiimoteMonitor wiimoteMonitor = (WiimoteMonitor)theEObject;
				T result = caseWiimoteMonitor(wiimoteMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiimotePackage.WIIMOTE_LIVE_SETTINGS: {
				WiimoteLiveSettings wiimoteLiveSettings = (WiimoteLiveSettings)theEObject;
				T result = caseWiimoteLiveSettings(wiimoteLiveSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiimoteCmd(WiimoteCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Accel XYZ Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Accel XYZ Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiAccelXYZCmd(WiiAccelXYZCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Accel Pry Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Accel Pry Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiAccelPryCmd(WiiAccelPryCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Button Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Button Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiButtonCmd(WiiButtonCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Ir XY Speed Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Ir XY Speed Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiIrXYSpeedCmd(WiiIrXYSpeedCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Motion Angles Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Motion Angles Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiMotionAnglesCmd(WiiMotionAnglesCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Motion Velo Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Motion Velo Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiMotionVeloCmd(WiiMotionVeloCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Nunchuk Accel Pry Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Nunchuk Accel Pry Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiNunchukAccelPryCmd(WiiNunchukAccelPryCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Nunchuk Button Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Nunchuk Button Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiNunchukButtonCmd(WiiNunchukButtonCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Nunchuk Joy Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Nunchuk Joy Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiNunchukJoyCmd(WiiNunchukJoyCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Nunchuk Accel Xyz Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Nunchuk Accel Xyz Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiNunchukAccelXyzCmd(WiiNunchukAccelXyzCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Ir Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Ir Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiIrCmd(WiiIrCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wii Angles Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wii Angles Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiiAnglesCmd(WiiAnglesCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiimoteMonitor(WiimoteMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiimoteLiveSettings(WiimoteLiveSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscCmd(OscCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Rcv Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscRcvCmd(OscRcvCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //WiimoteSwitch
