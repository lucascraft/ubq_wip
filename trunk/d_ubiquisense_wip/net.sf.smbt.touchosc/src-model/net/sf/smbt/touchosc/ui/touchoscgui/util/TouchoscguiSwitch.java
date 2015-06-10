/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.util;

import java.util.List;

import net.sf.smbt.touchosc.ui.touchoscgui.*;

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
 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage
 * @generated
 */
public class TouchoscguiSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TouchoscguiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscguiSwitch() {
		if (modelPackage == null) {
			modelPackage = TouchoscguiPackage.eINSTANCE;
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
			case TouchoscguiPackage.TOP: {
				TOP top = (TOP)theEObject;
				T result = caseTOP(top);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT: {
				TouchOscLayout touchOscLayout = (TouchOscLayout)theEObject;
				T result = caseTouchOscLayout(touchOscLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE: {
				TouchOscTabPage touchOscTabPage = (TouchOscTabPage)theEObject;
				T result = caseTouchOscTabPage(touchOscTabPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_CONTROL: {
				TouchOscControl touchOscControl = (TouchOscControl)theEObject;
				T result = caseTouchOscControl(touchOscControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_FADER_H: {
				TouchOscFaderH touchOscFaderH = (TouchOscFaderH)theEObject;
				T result = caseTouchOscFaderH(touchOscFaderH);
				if (result == null) result = caseTouchOscControl(touchOscFaderH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_FADER_V: {
				TouchOscFaderV touchOscFaderV = (TouchOscFaderV)theEObject;
				T result = caseTouchOscFaderV(touchOscFaderV);
				if (result == null) result = caseTouchOscControl(touchOscFaderV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_PUSH: {
				TouchOscPush touchOscPush = (TouchOscPush)theEObject;
				T result = caseTouchOscPush(touchOscPush);
				if (result == null) result = caseTouchOscControl(touchOscPush);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_XY_PAD: {
				TouchOscXYPad touchOscXYPad = (TouchOscXYPad)theEObject;
				T result = caseTouchOscXYPad(touchOscXYPad);
				if (result == null) result = caseTouchOscControl(touchOscXYPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_LABEL_H: {
				TouchOscLabelH touchOscLabelH = (TouchOscLabelH)theEObject;
				T result = caseTouchOscLabelH(touchOscLabelH);
				if (result == null) result = caseTouchOscControl(touchOscLabelH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_LABEL_V: {
				TouchOscLabelV touchOscLabelV = (TouchOscLabelV)theEObject;
				T result = caseTouchOscLabelV(touchOscLabelV);
				if (result == null) result = caseTouchOscControl(touchOscLabelV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_LED: {
				TouchOscLED touchOscLED = (TouchOscLED)theEObject;
				T result = caseTouchOscLED(touchOscLED);
				if (result == null) result = caseTouchOscControl(touchOscLED);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_MULTI_FADER_H: {
				TouchOscMultiFaderH touchOscMultiFaderH = (TouchOscMultiFaderH)theEObject;
				T result = caseTouchOscMultiFaderH(touchOscMultiFaderH);
				if (result == null) result = caseTouchOscControl(touchOscMultiFaderH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_MULTI_FADER_V: {
				TouchOscMultiFaderV touchOscMultiFaderV = (TouchOscMultiFaderV)theEObject;
				T result = caseTouchOscMultiFaderV(touchOscMultiFaderV);
				if (result == null) result = caseTouchOscControl(touchOscMultiFaderV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_MULTI_TOGGLE: {
				TouchOscMultiToggle touchOscMultiToggle = (TouchOscMultiToggle)theEObject;
				T result = caseTouchOscMultiToggle(touchOscMultiToggle);
				if (result == null) result = caseTouchOscControl(touchOscMultiToggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_ROTARY_H: {
				TouchOscRotaryH touchOscRotaryH = (TouchOscRotaryH)theEObject;
				T result = caseTouchOscRotaryH(touchOscRotaryH);
				if (result == null) result = caseTouchOscControl(touchOscRotaryH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_ROTARY_V: {
				TouchOscRotaryV touchOscRotaryV = (TouchOscRotaryV)theEObject;
				T result = caseTouchOscRotaryV(touchOscRotaryV);
				if (result == null) result = caseTouchOscControl(touchOscRotaryV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_TOGGLE: {
				TouchOscToggle touchOscToggle = (TouchOscToggle)theEObject;
				T result = caseTouchOscToggle(touchOscToggle);
				if (result == null) result = caseTouchOscControl(touchOscToggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_ENCODER: {
				TouchOscEncoder touchOscEncoder = (TouchOscEncoder)theEObject;
				T result = caseTouchOscEncoder(touchOscEncoder);
				if (result == null) result = caseTouchOscControl(touchOscEncoder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_BATTERY_V: {
				TouchOscBatteryV touchOscBatteryV = (TouchOscBatteryV)theEObject;
				T result = caseTouchOscBatteryV(touchOscBatteryV);
				if (result == null) result = caseTouchOscControl(touchOscBatteryV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_BATTERY_H: {
				TouchOscBatteryH touchOscBatteryH = (TouchOscBatteryH)theEObject;
				T result = caseTouchOscBatteryH(touchOscBatteryH);
				if (result == null) result = caseTouchOscControl(touchOscBatteryH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_TIME_H: {
				TouchOscTimeH touchOscTimeH = (TouchOscTimeH)theEObject;
				T result = caseTouchOscTimeH(touchOscTimeH);
				if (result == null) result = caseTouchOscControl(touchOscTimeH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_TIME_V: {
				TouchOscTimeV touchOscTimeV = (TouchOscTimeV)theEObject;
				T result = caseTouchOscTimeV(touchOscTimeV);
				if (result == null) result = caseTouchOscControl(touchOscTimeV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscguiPackage.TOUCH_OSC_MULTI_PUSH: {
				TouchOscMultiPush touchOscMultiPush = (TouchOscMultiPush)theEObject;
				T result = caseTouchOscMultiPush(touchOscMultiPush);
				if (result == null) result = caseTouchOscControl(touchOscMultiPush);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP(TOP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscLayout(TouchOscLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Tab Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Tab Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscTabPage(TouchOscTabPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscControl(TouchOscControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Fader H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Fader H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscFaderH(TouchOscFaderH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Fader V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Fader V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscFaderV(TouchOscFaderV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Push</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Push</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscPush(TouchOscPush object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc XY Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc XY Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscXYPad(TouchOscXYPad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Label H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Label H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscLabelH(TouchOscLabelH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Label V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Label V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscLabelV(TouchOscLabelV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscLED(TouchOscLED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Multi Fader H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Multi Fader H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscMultiFaderH(TouchOscMultiFaderH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Multi Fader V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Multi Fader V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscMultiFaderV(TouchOscMultiFaderV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Multi Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Multi Toggle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscMultiToggle(TouchOscMultiToggle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Rotary H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Rotary H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscRotaryH(TouchOscRotaryH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Rotary V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Rotary V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscRotaryV(TouchOscRotaryV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Toggle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscToggle(TouchOscToggle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Encoder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Encoder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscEncoder(TouchOscEncoder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Battery V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Battery V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscBatteryV(TouchOscBatteryV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Battery H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Battery H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscBatteryH(TouchOscBatteryH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Time H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Time H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscTimeH(TouchOscTimeH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Time V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Time V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscTimeV(TouchOscTimeV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc Multi Push</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc Multi Push</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscMultiPush(TouchOscMultiPush object) {
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

} //TouchoscguiSwitch
