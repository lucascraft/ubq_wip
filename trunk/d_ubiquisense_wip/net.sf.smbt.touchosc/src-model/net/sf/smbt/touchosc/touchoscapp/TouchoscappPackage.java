/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappFactory
 * @model kind="package"
 * @generated
 */
public interface TouchoscappPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "touchoscapp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://touchoscapp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "touchoscapp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouchoscappPackage eINSTANCE = net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl <em>Touch Osc App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTouchOscApp()
	 * @generated
	 */
	int TOUCH_OSC_APP = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__TABS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__ORIENTATION = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__MODE = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__VERSION = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__WIDTH = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP__HEIGHT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Touch Osc App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_APP_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 6;


	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.Widget <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__Y = 1;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__W = 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__H = 3;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__COLOR = 4;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__CENTERED = 5;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__INVERTED = 6;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__OSC = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__TYPE = 10;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.FaderVImpl <em>Fader V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.FaderVImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getFaderV()
	 * @generated
	 */
	int FADER_V = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__FROM = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__TO = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V__RESPONSE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fader V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_V_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.FaderHImpl <em>Fader H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.FaderHImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getFaderH()
	 * @generated
	 */
	int FADER_H = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__FROM = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__TO = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H__RESPONSE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fader H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADER_H_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.XYPadImpl <em>XY Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.XYPadImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getXYPad()
	 * @generated
	 */
	int XY_PAD = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>XVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__XVAL = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>YVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD__YVAL = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XY Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XY_PAD_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.RotaryHImpl <em>Rotary H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.RotaryHImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getRotaryH()
	 * @generated
	 */
	int ROTARY_H = 4;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__FROM = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__TO = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H__RESPONSE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rotary H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_H_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.RotaryVImpl <em>Rotary V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.RotaryVImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getRotaryV()
	 * @generated
	 */
	int ROTARY_V = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__VALUE = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__FROM = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__TO = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V__RESPONSE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rotary V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTARY_V_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.LabelHImpl <em>Label H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.LabelHImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getLabelH()
	 * @generated
	 */
	int LABEL_H = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__OUTLINE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H__SIZE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Label H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_H_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.LabelVImpl <em>Label V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.LabelVImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getLabelV()
	 * @generated
	 */
	int LABEL_V = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__OUTLINE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V__SIZE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Label V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_V_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl <em>Multi Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiToggle()
	 * @generated
	 */
	int MULTI_TOGGLE = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__VALUES = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__ROWS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__COLUMNS = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE__LOCAL_FEEDBACK_OFF = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multi Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TOGGLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderHImpl <em>Multi Fader H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderHImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiFaderH()
	 * @generated
	 */
	int MULTI_FADER_H = 9;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__VALUES = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Faders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__NUM_FADERS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H__RESPONSE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multi Fader H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_H_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderVImpl <em>Multi Fader V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderVImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiFaderV()
	 * @generated
	 */
	int MULTI_FADER_V = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__VALUES = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Faders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__NUM_FADERS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V__RESPONSE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multi Fader V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FADER_V_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.LEDImpl <em>LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.LEDImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getLED()
	 * @generated
	 */
	int LED = 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__ROWS = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__COLUMNS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TabImpl <em>Tab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TabImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTab()
	 * @generated
	 */
	int TAB = 13;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__WIDGETS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB__NAME = 1;

	/**
	 * The number of structural features of the '<em>Tab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.PushImpl <em>Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.PushImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getPush()
	 * @generated
	 */
	int PUSH = 14;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__LOCAL_FEEDBACK_OFF = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TimeHImpl <em>Time H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TimeHImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTimeH()
	 * @generated
	 */
	int TIME_H = 15;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__OUTLINE = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__BACKGROUND = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H__SIZE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_H_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TimeVImpl <em>Time V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TimeVImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTimeV()
	 * @generated
	 */
	int TIME_V = 16;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__OUTLINE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V__SIZE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_V_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.BatteryHImpl <em>Battery H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.BatteryHImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getBatteryH()
	 * @generated
	 */
	int BATTERY_H = 17;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__OUTLINE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H__SIZE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Battery H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_H_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.BatteryVImpl <em>Battery V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.BatteryVImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getBatteryV()
	 * @generated
	 */
	int BATTERY_V = 18;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__TEXT = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__BACKGROUND = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__OUTLINE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V__SIZE = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Battery V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTERY_V_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl <em>Encoder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getEncoder()
	 * @generated
	 */
	int ENCODER = 19;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__FROM = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__TO = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER__RESPONSE = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Encoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl <em>Multi Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiPush()
	 * @generated
	 */
	int MULTI_PUSH = 20;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__LOCAL_FEEDBACK_OFF = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__ROWS = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH__COLUMNS = WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multi Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PUSH_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.ToggleImpl <em>Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.ToggleImpl
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getToggle()
	 * @generated
	 */
	int TOGGLE = 21;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__X = WIDGET__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__Y = WIDGET__Y;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__W = WIDGET__W;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__H = WIDGET__H;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__COLOR = WIDGET__COLOR;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__CENTERED = WIDGET__CENTERED;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__INVERTED = WIDGET__INVERTED;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__OSC = WIDGET__OSC;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__NUMBER = WIDGET__NUMBER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__NAME = WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__TYPE = WIDGET__TYPE;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE__LOCAL_FEEDBACK_OFF = WIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOGGLE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.Orientation <em>Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.Orientation
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getOrientation()
	 * @generated
	 */
	int ORIENTATION = 22;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchoscapp.ControlType <em>Control Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchoscapp.ControlType
	 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getControlType()
	 * @generated
	 */
	int CONTROL_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp <em>Touch Osc App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc App</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp
	 * @generated
	 */
	EClass getTouchOscApp();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getTabs()
	 * @see #getTouchOscApp()
	 * @generated
	 */
	EReference getTouchOscApp_Tabs();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getOrientation()
	 * @see #getTouchOscApp()
	 * @generated
	 */
	EAttribute getTouchOscApp_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getMode()
	 * @see #getTouchOscApp()
	 * @generated
	 */
	EAttribute getTouchOscApp_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getVersion()
	 * @see #getTouchOscApp()
	 * @generated
	 */
	EAttribute getTouchOscApp_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getWidth()
	 * @see #getTouchOscApp()
	 * @generated
	 */
	EAttribute getTouchOscApp_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getHeight()
	 * @see #getTouchOscApp()
	 * @generated
	 */
	EAttribute getTouchOscApp_Height();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.FaderV <em>Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fader V</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderV
	 * @generated
	 */
	EClass getFaderV();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderV#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderV#getValue()
	 * @see #getFaderV()
	 * @generated
	 */
	EAttribute getFaderV_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderV#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderV#getFrom()
	 * @see #getFaderV()
	 * @generated
	 */
	EAttribute getFaderV_From();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderV#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderV#getTo()
	 * @see #getFaderV()
	 * @generated
	 */
	EAttribute getFaderV_To();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderV#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderV#getResponse()
	 * @see #getFaderV()
	 * @generated
	 */
	EAttribute getFaderV_Response();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.FaderH <em>Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fader H</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderH
	 * @generated
	 */
	EClass getFaderH();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderH#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderH#getValue()
	 * @see #getFaderH()
	 * @generated
	 */
	EAttribute getFaderH_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderH#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderH#getFrom()
	 * @see #getFaderH()
	 * @generated
	 */
	EAttribute getFaderH_From();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderH#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderH#getTo()
	 * @see #getFaderH()
	 * @generated
	 */
	EAttribute getFaderH_To();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.FaderH#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.FaderH#getResponse()
	 * @see #getFaderH()
	 * @generated
	 */
	EAttribute getFaderH_Response();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.XYPad <em>XY Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XY Pad</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.XYPad
	 * @generated
	 */
	EClass getXYPad();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.XYPad#getXVal <em>XVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XVal</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.XYPad#getXVal()
	 * @see #getXYPad()
	 * @generated
	 */
	EAttribute getXYPad_XVal();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.XYPad#getYVal <em>YVal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YVal</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.XYPad#getYVal()
	 * @see #getXYPad()
	 * @generated
	 */
	EAttribute getXYPad_YVal();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.RotaryH <em>Rotary H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotary H</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryH
	 * @generated
	 */
	EClass getRotaryH();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryH#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryH#getValue()
	 * @see #getRotaryH()
	 * @generated
	 */
	EAttribute getRotaryH_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryH#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryH#getFrom()
	 * @see #getRotaryH()
	 * @generated
	 */
	EAttribute getRotaryH_From();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryH#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryH#getTo()
	 * @see #getRotaryH()
	 * @generated
	 */
	EAttribute getRotaryH_To();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryH#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryH#getResponse()
	 * @see #getRotaryH()
	 * @generated
	 */
	EAttribute getRotaryH_Response();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.RotaryV <em>Rotary V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotary V</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryV
	 * @generated
	 */
	EClass getRotaryV();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryV#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryV#getValue()
	 * @see #getRotaryV()
	 * @generated
	 */
	EAttribute getRotaryV_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryV#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryV#getFrom()
	 * @see #getRotaryV()
	 * @generated
	 */
	EAttribute getRotaryV_From();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryV#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryV#getTo()
	 * @see #getRotaryV()
	 * @generated
	 */
	EAttribute getRotaryV_To();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.RotaryV#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.RotaryV#getResponse()
	 * @see #getRotaryV()
	 * @generated
	 */
	EAttribute getRotaryV_Response();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.LabelH <em>Label H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label H</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelH
	 * @generated
	 */
	EClass getLabelH();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelH#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelH#getText()
	 * @see #getLabelH()
	 * @generated
	 */
	EAttribute getLabelH_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelH#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelH#isBackground()
	 * @see #getLabelH()
	 * @generated
	 */
	EAttribute getLabelH_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelH#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelH#isOutline()
	 * @see #getLabelH()
	 * @generated
	 */
	EAttribute getLabelH_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelH#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelH#getSize()
	 * @see #getLabelH()
	 * @generated
	 */
	EAttribute getLabelH_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.LabelV <em>Label V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label V</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelV
	 * @generated
	 */
	EClass getLabelV();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelV#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelV#getText()
	 * @see #getLabelV()
	 * @generated
	 */
	EAttribute getLabelV_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelV#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelV#isBackground()
	 * @see #getLabelV()
	 * @generated
	 */
	EAttribute getLabelV_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelV#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelV#isOutline()
	 * @see #getLabelV()
	 * @generated
	 */
	EAttribute getLabelV_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LabelV#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LabelV#getSize()
	 * @see #getLabelV()
	 * @generated
	 */
	EAttribute getLabelV_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle <em>Multi Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Toggle</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiToggle
	 * @generated
	 */
	EClass getMultiToggle();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiToggle#getValues()
	 * @see #getMultiToggle()
	 * @generated
	 */
	EAttribute getMultiToggle_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiToggle#getRows()
	 * @see #getMultiToggle()
	 * @generated
	 */
	EAttribute getMultiToggle_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiToggle#getColumns()
	 * @see #getMultiToggle()
	 * @generated
	 */
	EAttribute getMultiToggle_Columns();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#isLocalFeedbackOff <em>Local Feedback Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Feedback Off</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiToggle#isLocalFeedbackOff()
	 * @see #getMultiToggle()
	 * @generated
	 */
	EAttribute getMultiToggle_LocalFeedbackOff();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH <em>Multi Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Fader H</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderH
	 * @generated
	 */
	EClass getMultiFaderH();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getValues()
	 * @see #getMultiFaderH()
	 * @generated
	 */
	EAttribute getMultiFaderH_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getNumFaders <em>Num Faders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Faders</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getNumFaders()
	 * @see #getMultiFaderH()
	 * @generated
	 */
	EAttribute getMultiFaderH_NumFaders();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getResponse()
	 * @see #getMultiFaderH()
	 * @generated
	 */
	EAttribute getMultiFaderH_Response();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderV <em>Multi Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Fader V</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderV
	 * @generated
	 */
	EClass getMultiFaderV();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderV#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderV#getValues()
	 * @see #getMultiFaderV()
	 * @generated
	 */
	EAttribute getMultiFaderV_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderV#getNumFaders <em>Num Faders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Faders</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderV#getNumFaders()
	 * @see #getMultiFaderV()
	 * @generated
	 */
	EAttribute getMultiFaderV_NumFaders();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderV#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiFaderV#getResponse()
	 * @see #getMultiFaderV()
	 * @generated
	 */
	EAttribute getMultiFaderV_Response();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.LED <em>LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LED
	 * @generated
	 */
	EClass getLED();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LED#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LED#getRows()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.LED#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.LED#getColumns()
	 * @see #getLED()
	 * @generated
	 */
	EAttribute getLED_Columns();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getX()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getY()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getW()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_W();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getH()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_H();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getColor()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#isCentered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Centered</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#isCentered()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Centered();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#isInverted <em>Inverted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#isInverted()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Inverted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getOsc <em>Osc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getOsc()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Osc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getNumber()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Widget#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Widget#getType()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.Tab <em>Tab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tab</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Tab
	 * @generated
	 */
	EClass getTab();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.touchoscapp.Tab#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Tab#getWidgets()
	 * @see #getTab()
	 * @generated
	 */
	EReference getTab_Widgets();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Tab#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Tab#getName()
	 * @see #getTab()
	 * @generated
	 */
	EAttribute getTab_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Push
	 * @generated
	 */
	EClass getPush();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Push#isLocalFeedbackOff <em>Local Feedback Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Feedback Off</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Push#isLocalFeedbackOff()
	 * @see #getPush()
	 * @generated
	 */
	EAttribute getPush_LocalFeedbackOff();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.TimeH <em>Time H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time H</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeH
	 * @generated
	 */
	EClass getTimeH();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeH#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeH#getText()
	 * @see #getTimeH()
	 * @generated
	 */
	EAttribute getTimeH_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeH#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeH#isOutline()
	 * @see #getTimeH()
	 * @generated
	 */
	EAttribute getTimeH_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeH#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeH#isBackground()
	 * @see #getTimeH()
	 * @generated
	 */
	EAttribute getTimeH_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeH#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeH#getSize()
	 * @see #getTimeH()
	 * @generated
	 */
	EAttribute getTimeH_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.TimeV <em>Time V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time V</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeV
	 * @generated
	 */
	EClass getTimeV();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeV#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeV#getText()
	 * @see #getTimeV()
	 * @generated
	 */
	EAttribute getTimeV_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeV#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeV#isBackground()
	 * @see #getTimeV()
	 * @generated
	 */
	EAttribute getTimeV_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeV#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeV#isOutline()
	 * @see #getTimeV()
	 * @generated
	 */
	EAttribute getTimeV_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.TimeV#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.TimeV#getSize()
	 * @see #getTimeV()
	 * @generated
	 */
	EAttribute getTimeV_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.BatteryH <em>Battery H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery H</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryH
	 * @generated
	 */
	EClass getBatteryH();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryH#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryH#getText()
	 * @see #getBatteryH()
	 * @generated
	 */
	EAttribute getBatteryH_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryH#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryH#isBackground()
	 * @see #getBatteryH()
	 * @generated
	 */
	EAttribute getBatteryH_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryH#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryH#isOutline()
	 * @see #getBatteryH()
	 * @generated
	 */
	EAttribute getBatteryH_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryH#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryH#getSize()
	 * @see #getBatteryH()
	 * @generated
	 */
	EAttribute getBatteryH_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.BatteryV <em>Battery V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battery V</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryV
	 * @generated
	 */
	EClass getBatteryV();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryV#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryV#getText()
	 * @see #getBatteryV()
	 * @generated
	 */
	EAttribute getBatteryV_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryV#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryV#isBackground()
	 * @see #getBatteryV()
	 * @generated
	 */
	EAttribute getBatteryV_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryV#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryV#isOutline()
	 * @see #getBatteryV()
	 * @generated
	 */
	EAttribute getBatteryV_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.BatteryV#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.BatteryV#getSize()
	 * @see #getBatteryV()
	 * @generated
	 */
	EAttribute getBatteryV_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.Encoder <em>Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoder</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Encoder
	 * @generated
	 */
	EClass getEncoder();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Encoder#getFrom()
	 * @see #getEncoder()
	 * @generated
	 */
	EAttribute getEncoder_From();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Encoder#getTo()
	 * @see #getEncoder()
	 * @generated
	 */
	EAttribute getEncoder_To();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Encoder#getResponse()
	 * @see #getEncoder()
	 * @generated
	 */
	EAttribute getEncoder_Response();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush <em>Multi Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Push</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiPush
	 * @generated
	 */
	EClass getMultiPush();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#isLocalFeedbackOff <em>Local Feedback Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Feedback Off</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiPush#isLocalFeedbackOff()
	 * @see #getMultiPush()
	 * @generated
	 */
	EAttribute getMultiPush_LocalFeedbackOff();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiPush#getRows()
	 * @see #getMultiPush()
	 * @generated
	 */
	EAttribute getMultiPush_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.MultiPush#getColumns()
	 * @see #getMultiPush()
	 * @generated
	 */
	EAttribute getMultiPush_Columns();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchoscapp.Toggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toggle</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Toggle
	 * @generated
	 */
	EClass getToggle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchoscapp.Toggle#isLocalFeedbackOff <em>Local Feedback Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Feedback Off</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Toggle#isLocalFeedbackOff()
	 * @see #getToggle()
	 * @generated
	 */
	EAttribute getToggle_LocalFeedbackOff();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.touchosc.touchoscapp.Orientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.Orientation
	 * @generated
	 */
	EEnum getOrientation();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.touchosc.touchoscapp.ControlType <em>Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Type</em>'.
	 * @see net.sf.smbt.touchosc.touchoscapp.ControlType
	 * @generated
	 */
	EEnum getControlType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TouchoscappFactory getTouchoscappFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl <em>Touch Osc App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTouchOscApp()
		 * @generated
		 */
		EClass TOUCH_OSC_APP = eINSTANCE.getTouchOscApp();
		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_APP__TABS = eINSTANCE.getTouchOscApp_Tabs();
		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_APP__ORIENTATION = eINSTANCE.getTouchOscApp_Orientation();
		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_APP__MODE = eINSTANCE.getTouchOscApp_Mode();
		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_APP__VERSION = eINSTANCE.getTouchOscApp_Version();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_APP__WIDTH = eINSTANCE.getTouchOscApp_Width();
		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_APP__HEIGHT = eINSTANCE.getTouchOscApp_Height();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.FaderVImpl <em>Fader V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.FaderVImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getFaderV()
		 * @generated
		 */
		EClass FADER_V = eINSTANCE.getFaderV();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_V__VALUE = eINSTANCE.getFaderV_Value();
		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_V__FROM = eINSTANCE.getFaderV_From();
		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_V__TO = eINSTANCE.getFaderV_To();
		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_V__RESPONSE = eINSTANCE.getFaderV_Response();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.FaderHImpl <em>Fader H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.FaderHImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getFaderH()
		 * @generated
		 */
		EClass FADER_H = eINSTANCE.getFaderH();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_H__VALUE = eINSTANCE.getFaderH_Value();
		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_H__FROM = eINSTANCE.getFaderH_From();
		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_H__TO = eINSTANCE.getFaderH_To();
		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FADER_H__RESPONSE = eINSTANCE.getFaderH_Response();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.XYPadImpl <em>XY Pad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.XYPadImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getXYPad()
		 * @generated
		 */
		EClass XY_PAD = eINSTANCE.getXYPad();
		/**
		 * The meta object literal for the '<em><b>XVal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_PAD__XVAL = eINSTANCE.getXYPad_XVal();
		/**
		 * The meta object literal for the '<em><b>YVal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XY_PAD__YVAL = eINSTANCE.getXYPad_YVal();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.RotaryHImpl <em>Rotary H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.RotaryHImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getRotaryH()
		 * @generated
		 */
		EClass ROTARY_H = eINSTANCE.getRotaryH();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_H__VALUE = eINSTANCE.getRotaryH_Value();
		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_H__FROM = eINSTANCE.getRotaryH_From();
		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_H__TO = eINSTANCE.getRotaryH_To();
		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_H__RESPONSE = eINSTANCE.getRotaryH_Response();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.RotaryVImpl <em>Rotary V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.RotaryVImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getRotaryV()
		 * @generated
		 */
		EClass ROTARY_V = eINSTANCE.getRotaryV();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_V__VALUE = eINSTANCE.getRotaryV_Value();
		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_V__FROM = eINSTANCE.getRotaryV_From();
		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_V__TO = eINSTANCE.getRotaryV_To();
		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTARY_V__RESPONSE = eINSTANCE.getRotaryV_Response();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.LabelHImpl <em>Label H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.LabelHImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getLabelH()
		 * @generated
		 */
		EClass LABEL_H = eINSTANCE.getLabelH();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_H__TEXT = eINSTANCE.getLabelH_Text();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_H__BACKGROUND = eINSTANCE.getLabelH_Background();
		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_H__OUTLINE = eINSTANCE.getLabelH_Outline();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_H__SIZE = eINSTANCE.getLabelH_Size();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.LabelVImpl <em>Label V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.LabelVImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getLabelV()
		 * @generated
		 */
		EClass LABEL_V = eINSTANCE.getLabelV();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_V__TEXT = eINSTANCE.getLabelV_Text();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_V__BACKGROUND = eINSTANCE.getLabelV_Background();
		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_V__OUTLINE = eINSTANCE.getLabelV_Outline();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_V__SIZE = eINSTANCE.getLabelV_Size();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl <em>Multi Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiToggle()
		 * @generated
		 */
		EClass MULTI_TOGGLE = eINSTANCE.getMultiToggle();
		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_TOGGLE__VALUES = eINSTANCE.getMultiToggle_Values();
		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_TOGGLE__ROWS = eINSTANCE.getMultiToggle_Rows();
		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_TOGGLE__COLUMNS = eINSTANCE.getMultiToggle_Columns();
		/**
		 * The meta object literal for the '<em><b>Local Feedback Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_TOGGLE__LOCAL_FEEDBACK_OFF = eINSTANCE.getMultiToggle_LocalFeedbackOff();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderHImpl <em>Multi Fader H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderHImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiFaderH()
		 * @generated
		 */
		EClass MULTI_FADER_H = eINSTANCE.getMultiFaderH();
		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FADER_H__VALUES = eINSTANCE.getMultiFaderH_Values();
		/**
		 * The meta object literal for the '<em><b>Num Faders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FADER_H__NUM_FADERS = eINSTANCE.getMultiFaderH_NumFaders();
		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FADER_H__RESPONSE = eINSTANCE.getMultiFaderH_Response();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderVImpl <em>Multi Fader V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiFaderVImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiFaderV()
		 * @generated
		 */
		EClass MULTI_FADER_V = eINSTANCE.getMultiFaderV();
		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FADER_V__VALUES = eINSTANCE.getMultiFaderV_Values();
		/**
		 * The meta object literal for the '<em><b>Num Faders</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FADER_V__NUM_FADERS = eINSTANCE.getMultiFaderV_NumFaders();
		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FADER_V__RESPONSE = eINSTANCE.getMultiFaderV_Response();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.LEDImpl <em>LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.LEDImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getLED()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLED();
		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__ROWS = eINSTANCE.getLED_Rows();
		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LED__COLUMNS = eINSTANCE.getLED_Columns();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.Widget <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.Widget
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();
		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__X = eINSTANCE.getWidget_X();
		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__Y = eINSTANCE.getWidget_Y();
		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__W = eINSTANCE.getWidget_W();
		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__H = eINSTANCE.getWidget_H();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__COLOR = eINSTANCE.getWidget_Color();
		/**
		 * The meta object literal for the '<em><b>Centered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__CENTERED = eINSTANCE.getWidget_Centered();
		/**
		 * The meta object literal for the '<em><b>Inverted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__INVERTED = eINSTANCE.getWidget_Inverted();
		/**
		 * The meta object literal for the '<em><b>Osc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__OSC = eINSTANCE.getWidget_Osc();
		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NUMBER = eINSTANCE.getWidget_Number();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__TYPE = eINSTANCE.getWidget_Type();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TabImpl <em>Tab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TabImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTab()
		 * @generated
		 */
		EClass TAB = eINSTANCE.getTab();
		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAB__WIDGETS = eINSTANCE.getTab_Widgets();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAB__NAME = eINSTANCE.getTab_Name();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.PushImpl <em>Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.PushImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getPush()
		 * @generated
		 */
		EClass PUSH = eINSTANCE.getPush();
		/**
		 * The meta object literal for the '<em><b>Local Feedback Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH__LOCAL_FEEDBACK_OFF = eINSTANCE.getPush_LocalFeedbackOff();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TimeHImpl <em>Time H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TimeHImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTimeH()
		 * @generated
		 */
		EClass TIME_H = eINSTANCE.getTimeH();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_H__TEXT = eINSTANCE.getTimeH_Text();
		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_H__OUTLINE = eINSTANCE.getTimeH_Outline();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_H__BACKGROUND = eINSTANCE.getTimeH_Background();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_H__SIZE = eINSTANCE.getTimeH_Size();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.TimeVImpl <em>Time V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TimeVImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getTimeV()
		 * @generated
		 */
		EClass TIME_V = eINSTANCE.getTimeV();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_V__TEXT = eINSTANCE.getTimeV_Text();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_V__BACKGROUND = eINSTANCE.getTimeV_Background();
		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_V__OUTLINE = eINSTANCE.getTimeV_Outline();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_V__SIZE = eINSTANCE.getTimeV_Size();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.BatteryHImpl <em>Battery H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.BatteryHImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getBatteryH()
		 * @generated
		 */
		EClass BATTERY_H = eINSTANCE.getBatteryH();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_H__TEXT = eINSTANCE.getBatteryH_Text();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_H__BACKGROUND = eINSTANCE.getBatteryH_Background();
		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_H__OUTLINE = eINSTANCE.getBatteryH_Outline();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_H__SIZE = eINSTANCE.getBatteryH_Size();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.BatteryVImpl <em>Battery V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.BatteryVImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getBatteryV()
		 * @generated
		 */
		EClass BATTERY_V = eINSTANCE.getBatteryV();
		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_V__TEXT = eINSTANCE.getBatteryV_Text();
		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_V__BACKGROUND = eINSTANCE.getBatteryV_Background();
		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_V__OUTLINE = eINSTANCE.getBatteryV_Outline();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTERY_V__SIZE = eINSTANCE.getBatteryV_Size();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl <em>Encoder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getEncoder()
		 * @generated
		 */
		EClass ENCODER = eINSTANCE.getEncoder();
		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODER__FROM = eINSTANCE.getEncoder_From();
		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODER__TO = eINSTANCE.getEncoder_To();
		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODER__RESPONSE = eINSTANCE.getEncoder_Response();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl <em>Multi Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getMultiPush()
		 * @generated
		 */
		EClass MULTI_PUSH = eINSTANCE.getMultiPush();
		/**
		 * The meta object literal for the '<em><b>Local Feedback Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PUSH__LOCAL_FEEDBACK_OFF = eINSTANCE.getMultiPush_LocalFeedbackOff();
		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PUSH__ROWS = eINSTANCE.getMultiPush_Rows();
		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PUSH__COLUMNS = eINSTANCE.getMultiPush_Columns();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.impl.ToggleImpl <em>Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.ToggleImpl
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getToggle()
		 * @generated
		 */
		EClass TOGGLE = eINSTANCE.getToggle();
		/**
		 * The meta object literal for the '<em><b>Local Feedback Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOGGLE__LOCAL_FEEDBACK_OFF = eINSTANCE.getToggle_LocalFeedbackOff();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.Orientation <em>Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.Orientation
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getOrientation()
		 * @generated
		 */
		EEnum ORIENTATION = eINSTANCE.getOrientation();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchoscapp.ControlType <em>Control Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchoscapp.ControlType
		 * @see net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappPackageImpl#getControlType()
		 * @generated
		 */
		EEnum CONTROL_TYPE = eINSTANCE.getControlType();

	}

} //TouchoscappPackage
