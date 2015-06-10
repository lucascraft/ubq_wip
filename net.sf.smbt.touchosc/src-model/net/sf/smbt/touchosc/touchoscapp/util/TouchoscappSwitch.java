/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.util;

import java.util.List;

import net.sf.smbt.touchosc.touchoscapp.*;

import net.sf.xqz.model.engine.IConnectedUnit;

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
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage
 * @generated
 */
public class TouchoscappSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TouchoscappPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscappSwitch() {
		if (modelPackage == null) {
			modelPackage = TouchoscappPackage.eINSTANCE;
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
			case TouchoscappPackage.TOUCH_OSC_APP: {
				TouchOscApp touchOscApp = (TouchOscApp)theEObject;
				T result = caseTouchOscApp(touchOscApp);
				if (result == null) result = caseIConnectedUnit(touchOscApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.FADER_V: {
				FaderV faderV = (FaderV)theEObject;
				T result = caseFaderV(faderV);
				if (result == null) result = caseWidget(faderV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.FADER_H: {
				FaderH faderH = (FaderH)theEObject;
				T result = caseFaderH(faderH);
				if (result == null) result = caseWidget(faderH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.XY_PAD: {
				XYPad xyPad = (XYPad)theEObject;
				T result = caseXYPad(xyPad);
				if (result == null) result = caseWidget(xyPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.ROTARY_H: {
				RotaryH rotaryH = (RotaryH)theEObject;
				T result = caseRotaryH(rotaryH);
				if (result == null) result = caseWidget(rotaryH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.ROTARY_V: {
				RotaryV rotaryV = (RotaryV)theEObject;
				T result = caseRotaryV(rotaryV);
				if (result == null) result = caseWidget(rotaryV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.LABEL_H: {
				LabelH labelH = (LabelH)theEObject;
				T result = caseLabelH(labelH);
				if (result == null) result = caseWidget(labelH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.LABEL_V: {
				LabelV labelV = (LabelV)theEObject;
				T result = caseLabelV(labelV);
				if (result == null) result = caseWidget(labelV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.MULTI_TOGGLE: {
				MultiToggle multiToggle = (MultiToggle)theEObject;
				T result = caseMultiToggle(multiToggle);
				if (result == null) result = caseWidget(multiToggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.MULTI_FADER_H: {
				MultiFaderH multiFaderH = (MultiFaderH)theEObject;
				T result = caseMultiFaderH(multiFaderH);
				if (result == null) result = caseWidget(multiFaderH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.MULTI_FADER_V: {
				MultiFaderV multiFaderV = (MultiFaderV)theEObject;
				T result = caseMultiFaderV(multiFaderV);
				if (result == null) result = caseWidget(multiFaderV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.LED: {
				LED led = (LED)theEObject;
				T result = caseLED(led);
				if (result == null) result = caseWidget(led);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.WIDGET: {
				Widget widget = (Widget)theEObject;
				T result = caseWidget(widget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.TAB: {
				Tab tab = (Tab)theEObject;
				T result = caseTab(tab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.PUSH: {
				Push push = (Push)theEObject;
				T result = casePush(push);
				if (result == null) result = caseWidget(push);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.TIME_H: {
				TimeH timeH = (TimeH)theEObject;
				T result = caseTimeH(timeH);
				if (result == null) result = caseWidget(timeH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.TIME_V: {
				TimeV timeV = (TimeV)theEObject;
				T result = caseTimeV(timeV);
				if (result == null) result = caseWidget(timeV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.BATTERY_H: {
				BatteryH batteryH = (BatteryH)theEObject;
				T result = caseBatteryH(batteryH);
				if (result == null) result = caseWidget(batteryH);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.BATTERY_V: {
				BatteryV batteryV = (BatteryV)theEObject;
				T result = caseBatteryV(batteryV);
				if (result == null) result = caseWidget(batteryV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.ENCODER: {
				Encoder encoder = (Encoder)theEObject;
				T result = caseEncoder(encoder);
				if (result == null) result = caseWidget(encoder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.MULTI_PUSH: {
				MultiPush multiPush = (MultiPush)theEObject;
				T result = caseMultiPush(multiPush);
				if (result == null) result = caseWidget(multiPush);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TouchoscappPackage.TOGGLE: {
				Toggle toggle = (Toggle)theEObject;
				T result = caseToggle(toggle);
				if (result == null) result = caseWidget(toggle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Touch Osc App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Touch Osc App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTouchOscApp(TouchOscApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fader V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fader V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaderV(FaderV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fader H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fader H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaderH(FaderH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XY Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XY Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXYPad(XYPad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotary H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotary H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotaryH(RotaryH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotary V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotary V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotaryV(RotaryV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelH(LabelH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelV(LabelV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Toggle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiToggle(MultiToggle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Fader H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Fader H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiFaderH(MultiFaderH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Fader V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Fader V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiFaderV(MultiFaderV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LED</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLED(LED object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWidget(Widget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTab(Tab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePush(Push object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeH(TimeH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeV(TimeV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery H</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery H</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryH(BatteryH object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Battery V</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Battery V</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBatteryV(BatteryV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoder(Encoder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Push</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Push</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPush(MultiPush object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggle(Toggle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConnectedUnit(IConnectedUnit object) {
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

} //TouchoscappSwitch
