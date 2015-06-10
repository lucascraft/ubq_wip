/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.impl;

import net.sf.smbt.touchosc.ui.touchoscgui.*;
import net.sf.smbt.touchosc.ui.touchoscgui.TOP;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiFactory;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchoscguiFactoryImpl extends EFactoryImpl implements TouchoscguiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TouchoscguiFactory init() {
		try {
			TouchoscguiFactory theTouchoscguiFactory = (TouchoscguiFactory)EPackage.Registry.INSTANCE.getEFactory("http://touchoscgui/1.0"); 
			if (theTouchoscguiFactory != null) {
				return theTouchoscguiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TouchoscguiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscguiFactoryImpl() {
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
			case TouchoscguiPackage.TOP: return createTOP();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT: return createTouchOscLayout();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE: return createTouchOscTabPage();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL: return createTouchOscControl();
			case TouchoscguiPackage.TOUCH_OSC_FADER_H: return createTouchOscFaderH();
			case TouchoscguiPackage.TOUCH_OSC_FADER_V: return createTouchOscFaderV();
			case TouchoscguiPackage.TOUCH_OSC_PUSH: return createTouchOscPush();
			case TouchoscguiPackage.TOUCH_OSC_XY_PAD: return createTouchOscXYPad();
			case TouchoscguiPackage.TOUCH_OSC_LABEL_H: return createTouchOscLabelH();
			case TouchoscguiPackage.TOUCH_OSC_LABEL_V: return createTouchOscLabelV();
			case TouchoscguiPackage.TOUCH_OSC_LED: return createTouchOscLED();
			case TouchoscguiPackage.TOUCH_OSC_MULTI_FADER_H: return createTouchOscMultiFaderH();
			case TouchoscguiPackage.TOUCH_OSC_MULTI_FADER_V: return createTouchOscMultiFaderV();
			case TouchoscguiPackage.TOUCH_OSC_MULTI_TOGGLE: return createTouchOscMultiToggle();
			case TouchoscguiPackage.TOUCH_OSC_ROTARY_H: return createTouchOscRotaryH();
			case TouchoscguiPackage.TOUCH_OSC_ROTARY_V: return createTouchOscRotaryV();
			case TouchoscguiPackage.TOUCH_OSC_TOGGLE: return createTouchOscToggle();
			case TouchoscguiPackage.TOUCH_OSC_ENCODER: return createTouchOscEncoder();
			case TouchoscguiPackage.TOUCH_OSC_BATTERY_V: return createTouchOscBatteryV();
			case TouchoscguiPackage.TOUCH_OSC_BATTERY_H: return createTouchOscBatteryH();
			case TouchoscguiPackage.TOUCH_OSC_TIME_H: return createTouchOscTimeH();
			case TouchoscguiPackage.TOUCH_OSC_TIME_V: return createTouchOscTimeV();
			case TouchoscguiPackage.TOUCH_OSC_MULTI_PUSH: return createTouchOscMultiPush();
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
			case TouchoscguiPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
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
			case TouchoscguiPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOP createTOP() {
		TOPImpl top = new TOPImpl();
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscLayout createTouchOscLayout() {
		TouchOscLayoutImpl touchOscLayout = new TouchOscLayoutImpl();
		return touchOscLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscTabPage createTouchOscTabPage() {
		TouchOscTabPageImpl touchOscTabPage = new TouchOscTabPageImpl();
		return touchOscTabPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscControl createTouchOscControl() {
		TouchOscControlImpl touchOscControl = new TouchOscControlImpl();
		return touchOscControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscFaderH createTouchOscFaderH() {
		TouchOscFaderHImpl touchOscFaderH = new TouchOscFaderHImpl();
		return touchOscFaderH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscFaderV createTouchOscFaderV() {
		TouchOscFaderVImpl touchOscFaderV = new TouchOscFaderVImpl();
		return touchOscFaderV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscPush createTouchOscPush() {
		TouchOscPushImpl touchOscPush = new TouchOscPushImpl();
		return touchOscPush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscXYPad createTouchOscXYPad() {
		TouchOscXYPadImpl touchOscXYPad = new TouchOscXYPadImpl();
		return touchOscXYPad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscLabelH createTouchOscLabelH() {
		TouchOscLabelHImpl touchOscLabelH = new TouchOscLabelHImpl();
		return touchOscLabelH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscLabelV createTouchOscLabelV() {
		TouchOscLabelVImpl touchOscLabelV = new TouchOscLabelVImpl();
		return touchOscLabelV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscLED createTouchOscLED() {
		TouchOscLEDImpl touchOscLED = new TouchOscLEDImpl();
		return touchOscLED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscMultiFaderH createTouchOscMultiFaderH() {
		TouchOscMultiFaderHImpl touchOscMultiFaderH = new TouchOscMultiFaderHImpl();
		return touchOscMultiFaderH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscMultiFaderV createTouchOscMultiFaderV() {
		TouchOscMultiFaderVImpl touchOscMultiFaderV = new TouchOscMultiFaderVImpl();
		return touchOscMultiFaderV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscMultiToggle createTouchOscMultiToggle() {
		TouchOscMultiToggleImpl touchOscMultiToggle = new TouchOscMultiToggleImpl();
		return touchOscMultiToggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscRotaryH createTouchOscRotaryH() {
		TouchOscRotaryHImpl touchOscRotaryH = new TouchOscRotaryHImpl();
		return touchOscRotaryH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscRotaryV createTouchOscRotaryV() {
		TouchOscRotaryVImpl touchOscRotaryV = new TouchOscRotaryVImpl();
		return touchOscRotaryV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscToggle createTouchOscToggle() {
		TouchOscToggleImpl touchOscToggle = new TouchOscToggleImpl();
		return touchOscToggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscEncoder createTouchOscEncoder() {
		TouchOscEncoderImpl touchOscEncoder = new TouchOscEncoderImpl();
		return touchOscEncoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscBatteryV createTouchOscBatteryV() {
		TouchOscBatteryVImpl touchOscBatteryV = new TouchOscBatteryVImpl();
		return touchOscBatteryV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscBatteryH createTouchOscBatteryH() {
		TouchOscBatteryHImpl touchOscBatteryH = new TouchOscBatteryHImpl();
		return touchOscBatteryH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscTimeH createTouchOscTimeH() {
		TouchOscTimeHImpl touchOscTimeH = new TouchOscTimeHImpl();
		return touchOscTimeH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscTimeV createTouchOscTimeV() {
		TouchOscTimeVImpl touchOscTimeV = new TouchOscTimeVImpl();
		return touchOscTimeV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscMultiPush createTouchOscMultiPush() {
		TouchOscMultiPushImpl touchOscMultiPush = new TouchOscMultiPushImpl();
		return touchOscMultiPush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscguiPackage getTouchoscguiPackage() {
		return (TouchoscguiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TouchoscguiPackage getPackage() {
		return TouchoscguiPackage.eINSTANCE;
	}

} //TouchoscguiFactoryImpl
