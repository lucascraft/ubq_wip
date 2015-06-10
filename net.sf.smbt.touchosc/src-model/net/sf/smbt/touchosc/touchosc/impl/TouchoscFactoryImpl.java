/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc.impl;

import net.sf.smbt.touchosc.touchosc.*;

import org.eclipse.emf.ecore.EClass;
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
public class TouchoscFactoryImpl extends EFactoryImpl implements TouchoscFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TouchoscFactory init() {
		try {
			TouchoscFactory theTouchoscFactory = (TouchoscFactory)EPackage.Registry.INSTANCE.getEFactory("http:///net.sf.smbt.touchosc/src/net/sf/smbt/touchosc/model/touchosc.xsd"); 
			if (theTouchoscFactory != null) {
				return theTouchoscFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TouchoscFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscFactoryImpl() {
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
			case TouchoscPackage.CONTROL: return createControl();
			case TouchoscPackage.LAYOUT: return createLayout();
			case TouchoscPackage.MIDI: return createMidi();
			case TouchoscPackage.TABPAGE: return createTabpage();
			case TouchoscPackage.TOP: return createTOP();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Midi createMidi() {
		MidiImpl midi = new MidiImpl();
		return midi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tabpage createTabpage() {
		TabpageImpl tabpage = new TabpageImpl();
		return tabpage;
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
	public TouchoscPackage getTouchoscPackage() {
		return (TouchoscPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TouchoscPackage getPackage() {
		return TouchoscPackage.eINSTANCE;
	}

} //TouchoscFactoryImpl
