/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.impl;

import net.sf.smbt.touchosc.touchoscapp.*;

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
public class TouchoscappFactoryImpl extends EFactoryImpl implements TouchoscappFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TouchoscappFactory init() {
		try {
			TouchoscappFactory theTouchoscappFactory = (TouchoscappFactory)EPackage.Registry.INSTANCE.getEFactory("http://touchoscapp/1.0"); 
			if (theTouchoscappFactory != null) {
				return theTouchoscappFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TouchoscappFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscappFactoryImpl() {
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
			case TouchoscappPackage.TOUCH_OSC_APP: return createTouchOscApp();
			case TouchoscappPackage.FADER_V: return createFaderV();
			case TouchoscappPackage.FADER_H: return createFaderH();
			case TouchoscappPackage.XY_PAD: return createXYPad();
			case TouchoscappPackage.ROTARY_H: return createRotaryH();
			case TouchoscappPackage.ROTARY_V: return createRotaryV();
			case TouchoscappPackage.LABEL_H: return createLabelH();
			case TouchoscappPackage.LABEL_V: return createLabelV();
			case TouchoscappPackage.MULTI_TOGGLE: return createMultiToggle();
			case TouchoscappPackage.MULTI_FADER_H: return createMultiFaderH();
			case TouchoscappPackage.MULTI_FADER_V: return createMultiFaderV();
			case TouchoscappPackage.LED: return createLED();
			case TouchoscappPackage.TAB: return createTab();
			case TouchoscappPackage.PUSH: return createPush();
			case TouchoscappPackage.TIME_H: return createTimeH();
			case TouchoscappPackage.TIME_V: return createTimeV();
			case TouchoscappPackage.BATTERY_H: return createBatteryH();
			case TouchoscappPackage.BATTERY_V: return createBatteryV();
			case TouchoscappPackage.ENCODER: return createEncoder();
			case TouchoscappPackage.MULTI_PUSH: return createMultiPush();
			case TouchoscappPackage.TOGGLE: return createToggle();
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
			case TouchoscappPackage.ORIENTATION:
				return createOrientationFromString(eDataType, initialValue);
			case TouchoscappPackage.CONTROL_TYPE:
				return createControlTypeFromString(eDataType, initialValue);
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
			case TouchoscappPackage.ORIENTATION:
				return convertOrientationToString(eDataType, instanceValue);
			case TouchoscappPackage.CONTROL_TYPE:
				return convertControlTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscApp createTouchOscApp() {
		TouchOscAppImpl touchOscApp = new TouchOscAppImpl();
		return touchOscApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaderV createFaderV() {
		FaderVImpl faderV = new FaderVImpl();
		return faderV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaderH createFaderH() {
		FaderHImpl faderH = new FaderHImpl();
		return faderH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYPad createXYPad() {
		XYPadImpl xyPad = new XYPadImpl();
		return xyPad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotaryH createRotaryH() {
		RotaryHImpl rotaryH = new RotaryHImpl();
		return rotaryH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotaryV createRotaryV() {
		RotaryVImpl rotaryV = new RotaryVImpl();
		return rotaryV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelH createLabelH() {
		LabelHImpl labelH = new LabelHImpl();
		return labelH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelV createLabelV() {
		LabelVImpl labelV = new LabelVImpl();
		return labelV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiToggle createMultiToggle() {
		MultiToggleImpl multiToggle = new MultiToggleImpl();
		return multiToggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFaderH createMultiFaderH() {
		MultiFaderHImpl multiFaderH = new MultiFaderHImpl();
		return multiFaderH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFaderV createMultiFaderV() {
		MultiFaderVImpl multiFaderV = new MultiFaderVImpl();
		return multiFaderV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LED createLED() {
		LEDImpl led = new LEDImpl();
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tab createTab() {
		TabImpl tab = new TabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Push createPush() {
		PushImpl push = new PushImpl();
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeH createTimeH() {
		TimeHImpl timeH = new TimeHImpl();
		return timeH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeV createTimeV() {
		TimeVImpl timeV = new TimeVImpl();
		return timeV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryH createBatteryH() {
		BatteryHImpl batteryH = new BatteryHImpl();
		return batteryH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BatteryV createBatteryV() {
		BatteryVImpl batteryV = new BatteryVImpl();
		return batteryV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoder createEncoder() {
		EncoderImpl encoder = new EncoderImpl();
		return encoder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPush createMultiPush() {
		MultiPushImpl multiPush = new MultiPushImpl();
		return multiPush;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toggle createToggle() {
		ToggleImpl toggle = new ToggleImpl();
		return toggle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation createOrientationFromString(EDataType eDataType, String initialValue) {
		Orientation result = Orientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlType createControlTypeFromString(EDataType eDataType, String initialValue) {
		ControlType result = ControlType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscappPackage getTouchoscappPackage() {
		return (TouchoscappPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TouchoscappPackage getPackage() {
		return TouchoscappPackage.eINSTANCE;
	}

} //TouchoscappFactoryImpl
