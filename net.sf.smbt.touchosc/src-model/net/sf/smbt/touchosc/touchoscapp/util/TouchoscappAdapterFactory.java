/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.util;

import net.sf.smbt.touchosc.touchoscapp.*;

import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage
 * @generated
 */
public class TouchoscappAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TouchoscappPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscappAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TouchoscappPackage.eINSTANCE;
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
	protected TouchoscappSwitch<Adapter> modelSwitch =
		new TouchoscappSwitch<Adapter>() {
			@Override
			public Adapter caseTouchOscApp(TouchOscApp object) {
				return createTouchOscAppAdapter();
			}
			@Override
			public Adapter caseFaderV(FaderV object) {
				return createFaderVAdapter();
			}
			@Override
			public Adapter caseFaderH(FaderH object) {
				return createFaderHAdapter();
			}
			@Override
			public Adapter caseXYPad(XYPad object) {
				return createXYPadAdapter();
			}
			@Override
			public Adapter caseRotaryH(RotaryH object) {
				return createRotaryHAdapter();
			}
			@Override
			public Adapter caseRotaryV(RotaryV object) {
				return createRotaryVAdapter();
			}
			@Override
			public Adapter caseLabelH(LabelH object) {
				return createLabelHAdapter();
			}
			@Override
			public Adapter caseLabelV(LabelV object) {
				return createLabelVAdapter();
			}
			@Override
			public Adapter caseMultiToggle(MultiToggle object) {
				return createMultiToggleAdapter();
			}
			@Override
			public Adapter caseMultiFaderH(MultiFaderH object) {
				return createMultiFaderHAdapter();
			}
			@Override
			public Adapter caseMultiFaderV(MultiFaderV object) {
				return createMultiFaderVAdapter();
			}
			@Override
			public Adapter caseLED(LED object) {
				return createLEDAdapter();
			}
			@Override
			public Adapter caseWidget(Widget object) {
				return createWidgetAdapter();
			}
			@Override
			public Adapter caseTab(Tab object) {
				return createTabAdapter();
			}
			@Override
			public Adapter casePush(Push object) {
				return createPushAdapter();
			}
			@Override
			public Adapter caseTimeH(TimeH object) {
				return createTimeHAdapter();
			}
			@Override
			public Adapter caseTimeV(TimeV object) {
				return createTimeVAdapter();
			}
			@Override
			public Adapter caseBatteryH(BatteryH object) {
				return createBatteryHAdapter();
			}
			@Override
			public Adapter caseBatteryV(BatteryV object) {
				return createBatteryVAdapter();
			}
			@Override
			public Adapter caseEncoder(Encoder object) {
				return createEncoderAdapter();
			}
			@Override
			public Adapter caseMultiPush(MultiPush object) {
				return createMultiPushAdapter();
			}
			@Override
			public Adapter caseToggle(Toggle object) {
				return createToggleAdapter();
			}
			@Override
			public Adapter caseIConnectedUnit(IConnectedUnit object) {
				return createIConnectedUnitAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp <em>Touch Osc App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp
	 * @generated
	 */
	public Adapter createTouchOscAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.FaderV <em>Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderV
	 * @generated
	 */
	public Adapter createFaderVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.FaderH <em>Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderH
	 * @generated
	 */
	public Adapter createFaderHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.XYPad <em>XY Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.XYPad
	 * @generated
	 */
	public Adapter createXYPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.RotaryH <em>Rotary H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryH
	 * @generated
	 */
	public Adapter createRotaryHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.RotaryV <em>Rotary V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryV
	 * @generated
	 */
	public Adapter createRotaryVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.LabelH <em>Label H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelH
	 * @generated
	 */
	public Adapter createLabelHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.LabelV <em>Label V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelV
	 * @generated
	 */
	public Adapter createLabelVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle <em>Multi Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiToggle
	 * @generated
	 */
	public Adapter createMultiToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH <em>Multi Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderH
	 * @generated
	 */
	public Adapter createMultiFaderHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderV <em>Multi Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderV
	 * @generated
	 */
	public Adapter createMultiFaderVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.LED
	 * @generated
	 */
	public Adapter createLEDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget
	 * @generated
	 */
	public Adapter createWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.Tab
	 * @generated
	 */
	public Adapter createTabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.Push
	 * @generated
	 */
	public Adapter createPushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.TimeH <em>Time H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeH
	 * @generated
	 */
	public Adapter createTimeHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.TimeV <em>Time V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeV
	 * @generated
	 */
	public Adapter createTimeVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.BatteryH <em>Battery H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryH
	 * @generated
	 */
	public Adapter createBatteryHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.BatteryV <em>Battery V</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryV
	 * @generated
	 */
	public Adapter createBatteryVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.Encoder <em>Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.Encoder
	 * @generated
	 */
	public Adapter createEncoderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush <em>Multi Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiPush
	 * @generated
	 */
	public Adapter createMultiPushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.touchosc.touchoscapp.Toggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.touchosc.touchoscapp.Toggle
	 * @generated
	 */
	public Adapter createToggleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	public Adapter createIConnectedUnitAdapter() {
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

} //TouchoscappAdapterFactory
