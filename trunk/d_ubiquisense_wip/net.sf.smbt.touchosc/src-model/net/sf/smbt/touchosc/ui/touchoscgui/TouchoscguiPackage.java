/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiFactory
 * @model kind="package"
 * @generated
 */
public interface TouchoscguiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "touchoscgui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://touchoscgui/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "touchoscgui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouchoscguiPackage eINSTANCE = net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TOPImpl <em>TOP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TOPImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTOP()
	 * @generated
	 */
	int TOP = 0;

	/**
	 * The feature id for the '<em><b>Layouts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP__LAYOUTS = 0;

	/**
	 * The number of structural features of the '<em>TOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl <em>Touch Osc Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLayout()
	 * @generated
	 */
	int TOUCH_OSC_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Tabs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT__TABS = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT__MODE = 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT__ORIENTATION = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT__WIDGETS = 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT__WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT__HEIGHT = 6;

	/**
	 * The number of structural features of the '<em>Touch Osc Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LAYOUT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl <em>Touch Osc Tab Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscTabPage()
	 * @generated
	 */
	int TOUCH_OSC_TAB_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Faders H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__FADERS_H = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Xy Pads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__XY_PADS = 2;

	/**
	 * The feature id for the '<em><b>Faders V</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__FADERS_V = 3;

	/**
	 * The feature id for the '<em><b>Labels H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__LABELS_H = 4;

	/**
	 * The feature id for the '<em><b>Pushes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__PUSHES = 5;

	/**
	 * The feature id for the '<em><b>Labels V</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__LABELS_V = 6;

	/**
	 * The feature id for the '<em><b>Multi Toggles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES = 7;

	/**
	 * The feature id for the '<em><b>Leds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__LEDS = 8;

	/**
	 * The feature id for the '<em><b>Rotaries V</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__ROTARIES_V = 9;

	/**
	 * The feature id for the '<em><b>Rotaries H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__ROTARIES_H = 10;

	/**
	 * The feature id for the '<em><b>Toggles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__TOGGLES = 11;

	/**
	 * The feature id for the '<em><b>Encoders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__ENCODERS = 12;

	/**
	 * The feature id for the '<em><b>Batteries H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__BATTERIES_H = 13;

	/**
	 * The feature id for the '<em><b>Batteries V</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__BATTERIES_V = 14;

	/**
	 * The feature id for the '<em><b>Times V</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__TIMES_V = 15;

	/**
	 * The feature id for the '<em><b>Times H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__TIMES_H = 16;

	/**
	 * The feature id for the '<em><b>Multi Pushes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__MULTI_PUSHES = 17;

	/**
	 * The feature id for the '<em><b>Multi Faders H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H = 18;

	/**
	 * The feature id for the '<em><b>Multi Faders V</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V = 19;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE__LAYOUT = 20;

	/**
	 * The number of structural features of the '<em>Touch Osc Tab Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TAB_PAGE_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl <em>Touch Osc Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscControl()
	 * @generated
	 */
	int TOUCH_OSC_CONTROL = 3;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__FG = 0;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__CENTERED = 1;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__H = 2;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__W = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__X = 4;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__Y = 5;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__INVERTED = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__NAME = 7;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__NUMBER = 8;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__OSC_CS = 9;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__OUTLINE = 10;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__SIZE = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__TEXT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__TYPE = 13;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__NUMBER_X = 14;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__NUMBER_Y = 15;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__SCALEF = 16;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__SCALET = 17;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__RESPONSE = 18;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__INVERTED_X = 19;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__INVERTED_Y = 20;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__SECONDS = 21;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__BACKGROUND = 22;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF = 23;

	/**
	 * The number of structural features of the '<em>Touch Osc Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CONTROL_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderHImpl <em>Touch Osc Fader H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderHImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscFaderH()
	 * @generated
	 */
	int TOUCH_OSC_FADER_H = 4;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Fader H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_H_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderVImpl <em>Touch Osc Fader V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderVImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscFaderV()
	 * @generated
	 */
	int TOUCH_OSC_FADER_V = 5;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Fader V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_FADER_V_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscPushImpl <em>Touch Osc Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscPushImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscPush()
	 * @generated
	 */
	int TOUCH_OSC_PUSH = 6;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_PUSH_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscXYPadImpl <em>Touch Osc XY Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscXYPadImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscXYPad()
	 * @generated
	 */
	int TOUCH_OSC_XY_PAD = 7;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc XY Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_XY_PAD_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelHImpl <em>Touch Osc Label H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelHImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLabelH()
	 * @generated
	 */
	int TOUCH_OSC_LABEL_H = 8;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Label H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_H_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelVImpl <em>Touch Osc Label V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelVImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLabelV()
	 * @generated
	 */
	int TOUCH_OSC_LABEL_V = 9;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Label V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LABEL_V_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLEDImpl <em>Touch Osc LED</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLEDImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLED()
	 * @generated
	 */
	int TOUCH_OSC_LED = 10;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc LED</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_LED_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderHImpl <em>Touch Osc Multi Fader H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderHImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiFaderH()
	 * @generated
	 */
	int TOUCH_OSC_MULTI_FADER_H = 11;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Multi Fader H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_H_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderVImpl <em>Touch Osc Multi Fader V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderVImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiFaderV()
	 * @generated
	 */
	int TOUCH_OSC_MULTI_FADER_V = 12;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Multi Fader V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_FADER_V_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiToggleImpl <em>Touch Osc Multi Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiToggleImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiToggle()
	 * @generated
	 */
	int TOUCH_OSC_MULTI_TOGGLE = 13;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Multi Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_TOGGLE_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryHImpl <em>Touch Osc Rotary H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryHImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscRotaryH()
	 * @generated
	 */
	int TOUCH_OSC_ROTARY_H = 14;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Rotary H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_H_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryVImpl <em>Touch Osc Rotary V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryVImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscRotaryV()
	 * @generated
	 */
	int TOUCH_OSC_ROTARY_V = 15;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Rotary V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ROTARY_V_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscToggleImpl <em>Touch Osc Toggle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscToggleImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscToggle()
	 * @generated
	 */
	int TOUCH_OSC_TOGGLE = 16;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Toggle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TOGGLE_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscEncoderImpl <em>Touch Osc Encoder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscEncoderImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscEncoder()
	 * @generated
	 */
	int TOUCH_OSC_ENCODER = 17;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Encoder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_ENCODER_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryVImpl <em>Touch Osc Battery V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryVImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscBatteryV()
	 * @generated
	 */
	int TOUCH_OSC_BATTERY_V = 18;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Battery V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_V_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryHImpl <em>Touch Osc Battery H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryHImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscBatteryH()
	 * @generated
	 */
	int TOUCH_OSC_BATTERY_H = 19;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Battery H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_BATTERY_H_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeHImpl <em>Touch Osc Time H</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeHImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscTimeH()
	 * @generated
	 */
	int TOUCH_OSC_TIME_H = 20;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Time H</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_H_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeVImpl <em>Touch Osc Time V</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeVImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscTimeV()
	 * @generated
	 */
	int TOUCH_OSC_TIME_V = 21;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Time V</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_TIME_V_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiPushImpl <em>Touch Osc Multi Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiPushImpl
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiPush()
	 * @generated
	 */
	int TOUCH_OSC_MULTI_PUSH = 22;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__FG = TOUCH_OSC_CONTROL__FG;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__CENTERED = TOUCH_OSC_CONTROL__CENTERED;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__H = TOUCH_OSC_CONTROL__H;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__W = TOUCH_OSC_CONTROL__W;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__X = TOUCH_OSC_CONTROL__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__Y = TOUCH_OSC_CONTROL__Y;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__INVERTED = TOUCH_OSC_CONTROL__INVERTED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__NAME = TOUCH_OSC_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__NUMBER = TOUCH_OSC_CONTROL__NUMBER;

	/**
	 * The feature id for the '<em><b>Osc cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__OSC_CS = TOUCH_OSC_CONTROL__OSC_CS;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__OUTLINE = TOUCH_OSC_CONTROL__OUTLINE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__SIZE = TOUCH_OSC_CONTROL__SIZE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__TEXT = TOUCH_OSC_CONTROL__TEXT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__TYPE = TOUCH_OSC_CONTROL__TYPE;

	/**
	 * The feature id for the '<em><b>Number x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__NUMBER_X = TOUCH_OSC_CONTROL__NUMBER_X;

	/**
	 * The feature id for the '<em><b>Number y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__NUMBER_Y = TOUCH_OSC_CONTROL__NUMBER_Y;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__SCALEF = TOUCH_OSC_CONTROL__SCALEF;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__SCALET = TOUCH_OSC_CONTROL__SCALET;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__RESPONSE = TOUCH_OSC_CONTROL__RESPONSE;

	/**
	 * The feature id for the '<em><b>Inverted x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__INVERTED_X = TOUCH_OSC_CONTROL__INVERTED_X;

	/**
	 * The feature id for the '<em><b>Inverted y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__INVERTED_Y = TOUCH_OSC_CONTROL__INVERTED_Y;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__SECONDS = TOUCH_OSC_CONTROL__SECONDS;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__BACKGROUND = TOUCH_OSC_CONTROL__BACKGROUND;

	/**
	 * The feature id for the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH__LOCAL_FEEDBACK_OFF = TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF;

	/**
	 * The number of structural features of the '<em>Touch Osc Multi Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_MULTI_PUSH_FEATURE_COUNT = TOUCH_OSC_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 23;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TOP <em>TOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TOP
	 * @generated
	 */
	EClass getTOP();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.touchosc.ui.touchoscgui.TOP#getLayouts <em>Layouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layouts</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TOP#getLayouts()
	 * @see #getTOP()
	 * @generated
	 */
	EReference getTOP_Layouts();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout <em>Touch Osc Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Layout</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout
	 * @generated
	 */
	EClass getTouchOscLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getTabs <em>Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabs</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getTabs()
	 * @see #getTouchOscLayout()
	 * @generated
	 */
	EReference getTouchOscLayout_Tabs();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getMode()
	 * @see #getTouchOscLayout()
	 * @generated
	 */
	EAttribute getTouchOscLayout_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getOrientation()
	 * @see #getTouchOscLayout()
	 * @generated
	 */
	EAttribute getTouchOscLayout_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getVersion()
	 * @see #getTouchOscLayout()
	 * @generated
	 */
	EAttribute getTouchOscLayout_Version();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Widgets</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getWidgets()
	 * @see #getTouchOscLayout()
	 * @generated
	 */
	EReference getTouchOscLayout_Widgets();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getWidth()
	 * @see #getTouchOscLayout()
	 * @generated
	 */
	EAttribute getTouchOscLayout_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getHeight()
	 * @see #getTouchOscLayout()
	 * @generated
	 */
	EAttribute getTouchOscLayout_Height();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage <em>Touch Osc Tab Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Tab Page</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage
	 * @generated
	 */
	EClass getTouchOscTabPage();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getFadersH <em>Faders H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faders H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getFadersH()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_FadersH();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getName()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EAttribute getTouchOscTabPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getXyPads <em>Xy Pads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xy Pads</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getXyPads()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_XyPads();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getFadersV <em>Faders V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faders V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getFadersV()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_FadersV();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLabelsH <em>Labels H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLabelsH()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_LabelsH();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getPushes <em>Pushes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pushes</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getPushes()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_Pushes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLabelsV <em>Labels V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLabelsV()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_LabelsV();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiToggles <em>Multi Toggles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Toggles</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiToggles()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_MultiToggles();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLeds <em>Leds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leds</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLeds()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_Leds();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getRotariesV <em>Rotaries V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rotaries V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getRotariesV()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_RotariesV();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getRotariesH <em>Rotaries H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rotaries H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getRotariesH()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_RotariesH();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getToggles <em>Toggles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Toggles</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getToggles()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_Toggles();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getEncoders <em>Encoders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encoders</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getEncoders()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_Encoders();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getBatteriesH <em>Batteries H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batteries H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getBatteriesH()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_BatteriesH();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getBatteriesV <em>Batteries V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batteries V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getBatteriesV()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_BatteriesV();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getTimesV <em>Times V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Times V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getTimesV()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_TimesV();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getTimesH <em>Times H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Times H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getTimesH()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_TimesH();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiPushes <em>Multi Pushes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Pushes</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiPushes()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_MultiPushes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiFadersH <em>Multi Faders H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Faders H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiFadersH()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_MultiFadersH();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiFadersV <em>Multi Faders V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Faders V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiFadersV()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_MultiFadersV();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layout</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLayout()
	 * @see #getTouchOscTabPage()
	 * @generated
	 */
	EReference getTouchOscTabPage_Layout();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl <em>Touch Osc Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Control</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl
	 * @generated
	 */
	EClass getTouchOscControl();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getFg <em>Fg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fg</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getFg()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Fg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isCentered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Centered</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isCentered()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Centered();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getH()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_H();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getW()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_W();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getX()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getY()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isInverted <em>Inverted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isInverted()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Inverted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getName()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getNumber()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getOsc_cs <em>Osc cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc cs</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getOsc_cs()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Osc_cs();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isOutline()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getSize()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Size();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getText()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getType()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getNumber_x <em>Number x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number x</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getNumber_x()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Number_x();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getNumber_y <em>Number y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number y</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getNumber_y()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Number_y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getScalef <em>Scalef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalef</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getScalef()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Scalef();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getScalet <em>Scalet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalet</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getScalet()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Scalet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#getResponse()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Response();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isInverted_x <em>Inverted x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted x</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isInverted_x()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Inverted_x();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isInverted_y <em>Inverted y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted y</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isInverted_y()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Inverted_y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isSeconds()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Seconds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isBackground()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isLocalFeedbackOff <em>Local Feedback Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Feedback Off</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl#isLocalFeedbackOff()
	 * @see #getTouchOscControl()
	 * @generated
	 */
	EAttribute getTouchOscControl_LocalFeedbackOff();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH <em>Touch Osc Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Fader H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH
	 * @generated
	 */
	EClass getTouchOscFaderH();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV <em>Touch Osc Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Fader V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV
	 * @generated
	 */
	EClass getTouchOscFaderV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush <em>Touch Osc Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Push</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush
	 * @generated
	 */
	EClass getTouchOscPush();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad <em>Touch Osc XY Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc XY Pad</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad
	 * @generated
	 */
	EClass getTouchOscXYPad();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH <em>Touch Osc Label H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Label H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH
	 * @generated
	 */
	EClass getTouchOscLabelH();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV <em>Touch Osc Label V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Label V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV
	 * @generated
	 */
	EClass getTouchOscLabelV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED <em>Touch Osc LED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc LED</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED
	 * @generated
	 */
	EClass getTouchOscLED();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH <em>Touch Osc Multi Fader H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Multi Fader H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH
	 * @generated
	 */
	EClass getTouchOscMultiFaderH();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV <em>Touch Osc Multi Fader V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Multi Fader V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV
	 * @generated
	 */
	EClass getTouchOscMultiFaderV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle <em>Touch Osc Multi Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Multi Toggle</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle
	 * @generated
	 */
	EClass getTouchOscMultiToggle();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH <em>Touch Osc Rotary H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Rotary H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH
	 * @generated
	 */
	EClass getTouchOscRotaryH();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV <em>Touch Osc Rotary V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Rotary V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV
	 * @generated
	 */
	EClass getTouchOscRotaryV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle <em>Touch Osc Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Toggle</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle
	 * @generated
	 */
	EClass getTouchOscToggle();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder <em>Touch Osc Encoder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Encoder</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder
	 * @generated
	 */
	EClass getTouchOscEncoder();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV <em>Touch Osc Battery V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Battery V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV
	 * @generated
	 */
	EClass getTouchOscBatteryV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH <em>Touch Osc Battery H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Battery H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH
	 * @generated
	 */
	EClass getTouchOscBatteryH();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH <em>Touch Osc Time H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Time H</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH
	 * @generated
	 */
	EClass getTouchOscTimeH();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV <em>Touch Osc Time V</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Time V</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV
	 * @generated
	 */
	EClass getTouchOscTimeV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush <em>Touch Osc Multi Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Multi Push</em>'.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush
	 * @generated
	 */
	EClass getTouchOscMultiPush();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see org.eclipse.swt.graphics.Color
	 * @model instanceClass="org.eclipse.swt.graphics.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TouchoscguiFactory getTouchoscguiFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TOPImpl <em>TOP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TOPImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTOP()
		 * @generated
		 */
		EClass TOP = eINSTANCE.getTOP();

		/**
		 * The meta object literal for the '<em><b>Layouts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP__LAYOUTS = eINSTANCE.getTOP_Layouts();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl <em>Touch Osc Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLayout()
		 * @generated
		 */
		EClass TOUCH_OSC_LAYOUT = eINSTANCE.getTouchOscLayout();

		/**
		 * The meta object literal for the '<em><b>Tabs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_LAYOUT__TABS = eINSTANCE.getTouchOscLayout_Tabs();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_LAYOUT__MODE = eINSTANCE.getTouchOscLayout_Mode();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_LAYOUT__ORIENTATION = eINSTANCE.getTouchOscLayout_Orientation();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_LAYOUT__VERSION = eINSTANCE.getTouchOscLayout_Version();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_LAYOUT__WIDGETS = eINSTANCE.getTouchOscLayout_Widgets();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_LAYOUT__WIDTH = eINSTANCE.getTouchOscLayout_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_LAYOUT__HEIGHT = eINSTANCE.getTouchOscLayout_Height();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl <em>Touch Osc Tab Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscTabPage()
		 * @generated
		 */
		EClass TOUCH_OSC_TAB_PAGE = eINSTANCE.getTouchOscTabPage();

		/**
		 * The meta object literal for the '<em><b>Faders H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__FADERS_H = eINSTANCE.getTouchOscTabPage_FadersH();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_TAB_PAGE__NAME = eINSTANCE.getTouchOscTabPage_Name();

		/**
		 * The meta object literal for the '<em><b>Xy Pads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__XY_PADS = eINSTANCE.getTouchOscTabPage_XyPads();

		/**
		 * The meta object literal for the '<em><b>Faders V</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__FADERS_V = eINSTANCE.getTouchOscTabPage_FadersV();

		/**
		 * The meta object literal for the '<em><b>Labels H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__LABELS_H = eINSTANCE.getTouchOscTabPage_LabelsH();

		/**
		 * The meta object literal for the '<em><b>Pushes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__PUSHES = eINSTANCE.getTouchOscTabPage_Pushes();

		/**
		 * The meta object literal for the '<em><b>Labels V</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__LABELS_V = eINSTANCE.getTouchOscTabPage_LabelsV();

		/**
		 * The meta object literal for the '<em><b>Multi Toggles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES = eINSTANCE.getTouchOscTabPage_MultiToggles();

		/**
		 * The meta object literal for the '<em><b>Leds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__LEDS = eINSTANCE.getTouchOscTabPage_Leds();

		/**
		 * The meta object literal for the '<em><b>Rotaries V</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__ROTARIES_V = eINSTANCE.getTouchOscTabPage_RotariesV();

		/**
		 * The meta object literal for the '<em><b>Rotaries H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__ROTARIES_H = eINSTANCE.getTouchOscTabPage_RotariesH();

		/**
		 * The meta object literal for the '<em><b>Toggles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__TOGGLES = eINSTANCE.getTouchOscTabPage_Toggles();

		/**
		 * The meta object literal for the '<em><b>Encoders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__ENCODERS = eINSTANCE.getTouchOscTabPage_Encoders();

		/**
		 * The meta object literal for the '<em><b>Batteries H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__BATTERIES_H = eINSTANCE.getTouchOscTabPage_BatteriesH();

		/**
		 * The meta object literal for the '<em><b>Batteries V</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__BATTERIES_V = eINSTANCE.getTouchOscTabPage_BatteriesV();

		/**
		 * The meta object literal for the '<em><b>Times V</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__TIMES_V = eINSTANCE.getTouchOscTabPage_TimesV();

		/**
		 * The meta object literal for the '<em><b>Times H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__TIMES_H = eINSTANCE.getTouchOscTabPage_TimesH();

		/**
		 * The meta object literal for the '<em><b>Multi Pushes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__MULTI_PUSHES = eINSTANCE.getTouchOscTabPage_MultiPushes();

		/**
		 * The meta object literal for the '<em><b>Multi Faders H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H = eINSTANCE.getTouchOscTabPage_MultiFadersH();

		/**
		 * The meta object literal for the '<em><b>Multi Faders V</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V = eINSTANCE.getTouchOscTabPage_MultiFadersV();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUCH_OSC_TAB_PAGE__LAYOUT = eINSTANCE.getTouchOscTabPage_Layout();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl <em>Touch Osc Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscControl()
		 * @generated
		 */
		EClass TOUCH_OSC_CONTROL = eINSTANCE.getTouchOscControl();

		/**
		 * The meta object literal for the '<em><b>Fg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__FG = eINSTANCE.getTouchOscControl_Fg();

		/**
		 * The meta object literal for the '<em><b>Centered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__CENTERED = eINSTANCE.getTouchOscControl_Centered();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__H = eINSTANCE.getTouchOscControl_H();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__W = eINSTANCE.getTouchOscControl_W();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__X = eINSTANCE.getTouchOscControl_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__Y = eINSTANCE.getTouchOscControl_Y();

		/**
		 * The meta object literal for the '<em><b>Inverted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__INVERTED = eINSTANCE.getTouchOscControl_Inverted();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__NAME = eINSTANCE.getTouchOscControl_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__NUMBER = eINSTANCE.getTouchOscControl_Number();

		/**
		 * The meta object literal for the '<em><b>Osc cs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__OSC_CS = eINSTANCE.getTouchOscControl_Osc_cs();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__OUTLINE = eINSTANCE.getTouchOscControl_Outline();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__SIZE = eINSTANCE.getTouchOscControl_Size();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__TEXT = eINSTANCE.getTouchOscControl_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__TYPE = eINSTANCE.getTouchOscControl_Type();

		/**
		 * The meta object literal for the '<em><b>Number x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__NUMBER_X = eINSTANCE.getTouchOscControl_Number_x();

		/**
		 * The meta object literal for the '<em><b>Number y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__NUMBER_Y = eINSTANCE.getTouchOscControl_Number_y();

		/**
		 * The meta object literal for the '<em><b>Scalef</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__SCALEF = eINSTANCE.getTouchOscControl_Scalef();

		/**
		 * The meta object literal for the '<em><b>Scalet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__SCALET = eINSTANCE.getTouchOscControl_Scalet();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__RESPONSE = eINSTANCE.getTouchOscControl_Response();

		/**
		 * The meta object literal for the '<em><b>Inverted x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__INVERTED_X = eINSTANCE.getTouchOscControl_Inverted_x();

		/**
		 * The meta object literal for the '<em><b>Inverted y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__INVERTED_Y = eINSTANCE.getTouchOscControl_Inverted_y();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__SECONDS = eINSTANCE.getTouchOscControl_Seconds();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__BACKGROUND = eINSTANCE.getTouchOscControl_Background();

		/**
		 * The meta object literal for the '<em><b>Local Feedback Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF = eINSTANCE.getTouchOscControl_LocalFeedbackOff();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderHImpl <em>Touch Osc Fader H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderHImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscFaderH()
		 * @generated
		 */
		EClass TOUCH_OSC_FADER_H = eINSTANCE.getTouchOscFaderH();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderVImpl <em>Touch Osc Fader V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscFaderVImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscFaderV()
		 * @generated
		 */
		EClass TOUCH_OSC_FADER_V = eINSTANCE.getTouchOscFaderV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscPushImpl <em>Touch Osc Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscPushImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscPush()
		 * @generated
		 */
		EClass TOUCH_OSC_PUSH = eINSTANCE.getTouchOscPush();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscXYPadImpl <em>Touch Osc XY Pad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscXYPadImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscXYPad()
		 * @generated
		 */
		EClass TOUCH_OSC_XY_PAD = eINSTANCE.getTouchOscXYPad();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelHImpl <em>Touch Osc Label H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelHImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLabelH()
		 * @generated
		 */
		EClass TOUCH_OSC_LABEL_H = eINSTANCE.getTouchOscLabelH();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelVImpl <em>Touch Osc Label V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLabelVImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLabelV()
		 * @generated
		 */
		EClass TOUCH_OSC_LABEL_V = eINSTANCE.getTouchOscLabelV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLEDImpl <em>Touch Osc LED</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLEDImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscLED()
		 * @generated
		 */
		EClass TOUCH_OSC_LED = eINSTANCE.getTouchOscLED();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderHImpl <em>Touch Osc Multi Fader H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderHImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiFaderH()
		 * @generated
		 */
		EClass TOUCH_OSC_MULTI_FADER_H = eINSTANCE.getTouchOscMultiFaderH();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderVImpl <em>Touch Osc Multi Fader V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiFaderVImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiFaderV()
		 * @generated
		 */
		EClass TOUCH_OSC_MULTI_FADER_V = eINSTANCE.getTouchOscMultiFaderV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiToggleImpl <em>Touch Osc Multi Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiToggleImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiToggle()
		 * @generated
		 */
		EClass TOUCH_OSC_MULTI_TOGGLE = eINSTANCE.getTouchOscMultiToggle();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryHImpl <em>Touch Osc Rotary H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryHImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscRotaryH()
		 * @generated
		 */
		EClass TOUCH_OSC_ROTARY_H = eINSTANCE.getTouchOscRotaryH();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryVImpl <em>Touch Osc Rotary V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscRotaryVImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscRotaryV()
		 * @generated
		 */
		EClass TOUCH_OSC_ROTARY_V = eINSTANCE.getTouchOscRotaryV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscToggleImpl <em>Touch Osc Toggle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscToggleImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscToggle()
		 * @generated
		 */
		EClass TOUCH_OSC_TOGGLE = eINSTANCE.getTouchOscToggle();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscEncoderImpl <em>Touch Osc Encoder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscEncoderImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscEncoder()
		 * @generated
		 */
		EClass TOUCH_OSC_ENCODER = eINSTANCE.getTouchOscEncoder();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryVImpl <em>Touch Osc Battery V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryVImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscBatteryV()
		 * @generated
		 */
		EClass TOUCH_OSC_BATTERY_V = eINSTANCE.getTouchOscBatteryV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryHImpl <em>Touch Osc Battery H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscBatteryHImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscBatteryH()
		 * @generated
		 */
		EClass TOUCH_OSC_BATTERY_H = eINSTANCE.getTouchOscBatteryH();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeHImpl <em>Touch Osc Time H</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeHImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscTimeH()
		 * @generated
		 */
		EClass TOUCH_OSC_TIME_H = eINSTANCE.getTouchOscTimeH();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeVImpl <em>Touch Osc Time V</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTimeVImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscTimeV()
		 * @generated
		 */
		EClass TOUCH_OSC_TIME_V = eINSTANCE.getTouchOscTimeV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiPushImpl <em>Touch Osc Multi Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscMultiPushImpl
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getTouchOscMultiPush()
		 * @generated
		 */
		EClass TOUCH_OSC_MULTI_PUSH = eINSTANCE.getTouchOscMultiPush();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchoscguiPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

	}

} //TouchoscguiPackage
