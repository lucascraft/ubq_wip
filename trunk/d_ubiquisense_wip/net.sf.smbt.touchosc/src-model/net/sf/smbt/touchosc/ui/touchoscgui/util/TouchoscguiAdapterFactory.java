/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.util;

import net.sf.smbt.touchosc.ui.touchoscgui.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage
 * @generated
 */
public class TouchoscguiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TouchoscguiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscguiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TouchoscguiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchoscguiSwitch<Adapter> modelSwitch =
		new TouchoscguiSwitch<Adapter>() {
			@Override
			public Adapter caseTOP(TOP object) {
				return createTOPAdapter();
			}
			@Override
			public Adapter caseTouchOscLayout(TouchOscLayout object) {
				return createTouchOscLayoutAdapter();
			}
			@Override
			public Adapter caseTouchOscTabPage(TouchOscTabPage object) {
				return createTouchOscTabPageAdapter();
			}
			@Override
			public Adapter caseTouchOscControl(TouchOscControl object) {
				return createTouchOscControlAdapter();
			}
			@Override
			public Adapter caseTouchOscFaderH(TouchOscFaderH object) {
				return createTouchOscFaderHAdapter();
			}
			@Override
			public Adapter caseTouchOscFaderV(TouchOscFaderV object) {
				return createTouchOscFaderVAdapter();
			}
			@Override
			public Adapter caseTouchOscPush(TouchOscPush object) {
				return createTouchOscPushAdapter();
			}
			@Override
			public Adapter caseTouchOscXYPad(TouchOscXYPad object) {
				return createTouchOscXYPadAdapter();
			}
			@Override
			public Adapter caseTouchOscLabelH(TouchOscLabelH object) {
				return createTouchOscLabelHAdapter();
			}
			@Override
			public Adapter caseTouchOscLabelV(TouchOscLabelV object) {
				return createTouchOscLabelVAdapter();
			}
			@Override
			public Adapter caseTouchOscLED(TouchOscLED object) {
				return createTouchOscLEDAdapter();
			}
			@Override
			public Adapter caseTouchOscMultiFaderH(TouchOscMultiFaderH object) {
				return createTouchOscMultiFaderHAdapter();
			}
			@Override
			public Adapter caseTouchOscMultiFaderV(TouchOscMultiFaderV object) {
				return createTouchOscMultiFaderVAdapter();
			}
			@Override
			public Adapter caseTouchOscMultiToggle(TouchOscMultiToggle object) {
				return createTouchOscMultiToggleAdapter();
			}
			@Override
			public Adapter caseTouchOscRotaryH(TouchOscRotaryH object) {
				return createTouchOscRotaryHAdapter();
			}
			@Override
			public Adapter caseTouchOscRotaryV(TouchOscRotaryV object) {
				return createTouchOscRotaryVAdapter();
			}
			@Override
			public Adapter caseTouchOscToggle(TouchOscToggle object) {
				return createTouchOscToggleAdapter();
			}
			@Override
			public Adapter caseTouchOscEncoder(TouchOscEncoder object) {
				return createTouchOscEncoderAdapter();
			}
			@Override
			public Adapter caseTouchOscBatteryV(TouchOscBatteryV object) {
				return createTouchOscBatteryVAdapter();
			}
			@Override
			public Adapter caseTouchOscBatteryH(TouchOscBatteryH object) {
				return createTouchOscBatteryHAdapter();
			}
			@Override
			public Adapter caseTouchOscTimeH(TouchOscTimeH object) {
				return createTouchOscTimeHAdapter();
			}
			@Override
			public Adapter caseTouchOscTimeV(TouchOscTimeV object) {
				return createTouchOscTimeVAdapter();
			}
			@Override
			public Adapter caseTouchOscMultiPush(TouchOscMultiPush object) {
				return createTouchOscMultiPushAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TOP <em>TOP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TOP
	 * @generated
	 */
	public Adapter createTOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout <em>Touch Osc Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout
	 * @generated
	 */
	public Adapter createTouchOscLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage <em>Touch Osc Tab Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage
	 * @generated
	 */
	public Adapter createTouchOscTabPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl <em>Touch Osc Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl
	 * @generated
	 */
	public Adapter createTouchOscControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH <em>Touch Osc Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH
	 * @generated
	 */
	public Adapter createTouchOscFaderHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV <em>Touch Osc Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV
	 * @generated
	 */
	public Adapter createTouchOscFaderVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush <em>Touch Osc Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush
	 * @generated
	 */
	public Adapter createTouchOscPushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad <em>Touch Osc XY Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad
	 * @generated
	 */
	public Adapter createTouchOscXYPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH <em>Touch Osc Label H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH
	 * @generated
	 */
	public Adapter createTouchOscLabelHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV <em>Touch Osc Label V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV
	 * @generated
	 */
	public Adapter createTouchOscLabelVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED <em>Touch Osc LED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED
	 * @generated
	 */
	public Adapter createTouchOscLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH <em>Touch Osc Multi Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH
	 * @generated
	 */
	public Adapter createTouchOscMultiFaderHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV <em>Touch Osc Multi Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV
	 * @generated
	 */
	public Adapter createTouchOscMultiFaderVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle <em>Touch Osc Multi Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle
	 * @generated
	 */
	public Adapter createTouchOscMultiToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH <em>Touch Osc Rotary H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH
	 * @generated
	 */
	public Adapter createTouchOscRotaryHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV <em>Touch Osc Rotary V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV
	 * @generated
	 */
	public Adapter createTouchOscRotaryVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle <em>Touch Osc Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle
	 * @generated
	 */
	public Adapter createTouchOscToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder <em>Touch Osc Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder
	 * @generated
	 */
	public Adapter createTouchOscEncoderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV <em>Touch Osc Battery V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV
	 * @generated
	 */
	public Adapter createTouchOscBatteryVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH <em>Touch Osc Battery H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH
	 * @generated
	 */
	public Adapter createTouchOscBatteryHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH <em>Touch Osc Time H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH
	 * @generated
	 */
	public Adapter createTouchOscTimeHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV <em>Touch Osc Time V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV
	 * @generated
	 */
	public Adapter createTouchOscTimeVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush <em>Touch Osc Multi Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush
	 * @generated
	 */
	public Adapter createTouchOscMultiPushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TouchoscguiAdapterFactory
