/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see net.sf.smbt.jzmui.JzmuiFactory
 * @model kind="package"
 * @generated
 */
public interface JzmuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jzmui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jzmui/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jzmui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JzmuiPackage eINSTANCE = net.sf.smbt.jzmui.impl.JzmuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl <em>Lemur Live App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.LemurLiveAppImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurLiveApp()
	 * @generated
	 */
	int LEMUR_LIVE_APP = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP__WIDTH = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP__HEIGHT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP__ID = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP__ELEMENTS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP__CONFIGURATIONS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lemur Live App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEMUR_LIVE_APP_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.JZUIElem <em>JZUI Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.JZUIElem
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZUIElem()
	 * @generated
	 */
	int JZUI_ELEM = 1;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__FONT_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__BOUNDS = 1;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__FONT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__OSC_PROPS = 4;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__MIDI_PROPS = 5;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__PARENT_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__SCRIPTS = 7;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM__TARGET_FEATURES = 8;

	/**
	 * The number of structural features of the '<em>JZUI Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZUI_ELEM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZContainerImpl <em>JZ Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZContainerImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZContainer()
	 * @generated
	 */
	int JZ_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__FONT_STYLE = JZUI_ELEM__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__BOUNDS = JZUI_ELEM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__FONT_NAME = JZUI_ELEM__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__NAME = JZUI_ELEM__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__OSC_PROPS = JZUI_ELEM__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__MIDI_PROPS = JZUI_ELEM__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__PARENT_TARGET = JZUI_ELEM__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__SCRIPTS = JZUI_ELEM__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__TARGET_FEATURES = JZUI_ELEM__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER__CHILDREN = JZUI_ELEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>JZ Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONTAINER_FEATURE_COUNT = JZUI_ELEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.JZWidget <em>JZ Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.JZWidget
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZWidget()
	 * @generated
	 */
	int JZ_WIDGET = 3;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__FONT_STYLE = JZUI_ELEM__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__BOUNDS = JZUI_ELEM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__FONT_NAME = JZUI_ELEM__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__NAME = JZUI_ELEM__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__OSC_PROPS = JZUI_ELEM__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__MIDI_PROPS = JZUI_ELEM__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__PARENT_TARGET = JZUI_ELEM__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__SCRIPTS = JZUI_ELEM__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__TARGET_FEATURES = JZUI_ELEM__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__PRIMARY_OSC_TARGET = JZUI_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET__PRIMARY_MIDI_TARGET = JZUI_ELEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>JZ Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_WIDGET_FEATURE_COUNT = JZUI_ELEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl <em>JZ Break Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZBreakPointImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZBreakPoint()
	 * @generated
	 */
	int JZ_BREAK_POINT = 4;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Live Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__LIVE_EDITING = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__POINTS = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__COORDINATES = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__BACKGROUND = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__FIRST_POINT = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__LIGHT = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__FRICTION = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__HOLD = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Hold X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__HOLD_X = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hold Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__HOLD_Y = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__ATTRACTION = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__EDIT = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__REST = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__SPEED = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__VALUES = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Path Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__PATH_DATA = JZ_WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__GRID = JZ_WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Grid X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__GRID_X = JZ_WIDGET_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Grid Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__GRID_Y = JZ_WIDGET_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Free Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__FREE_FORM = JZ_WIDGET_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__PHYSICS = JZ_WIDGET_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__COLOR = JZ_WIDGET_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__X = JZ_WIDGET_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT__Y = JZ_WIDGET_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>JZ Break Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_BREAK_POINT_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 24;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZFaderImpl <em>JZ Fader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZFaderImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZFader()
	 * @generated
	 */
	int JZ_FADER = 5;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__VALUE = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__UNIT = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__PRECISION = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__COLOR = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Drag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__DRAG = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__FRICTION = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__HEIGHT = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__LIGHT = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__TENSION = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__VALUE_ACTIVE = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__LABEL = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__GRID_ACTIVE = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Grid Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__GRID_VALUE = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Attraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__ATTRACTION = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cursor Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__CURSOR_MODE = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__PHYSICS = JZ_WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__SPEED = JZ_WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__X = JZ_WIDGET_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER__Z = JZ_WIDGET_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>JZ Fader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_FADER_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 20;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZGestureImpl <em>JZ Gesture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZGestureImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZGesture()
	 * @generated
	 */
	int JZ_GESTURE = 6;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__COLOR = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__ANGLE = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__PAN = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pinch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE__PINCH = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>JZ Gesture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_GESTURE_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZKnobImpl <em>JZ Knob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZKnobImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZKnob()
	 * @generated
	 */
	int JZ_KNOB = 7;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Endless Knob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__ENDLESS_KNOB = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__VALUE = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__UNIT = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__PRECISION = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Backgroud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__BACKGROUD = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__FOREGROUND = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__ATTACK = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Sustain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__SUSTAIN = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Decay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__DECAY = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__RELEASE = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__HOLD = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__LABEL = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Value Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__VALUE_ACTIVE = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__GRID = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cursor Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__CURSOR_MODE = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Control Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__CONTROL_MODE = JZ_WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__PHYSICS = JZ_WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Attraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__ATTRACTION = JZ_WIDGET_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__FRICTION = JZ_WIDGET_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__SPEED = JZ_WIDGET_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB__X = JZ_WIDGET_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>JZ Knob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KNOB_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZLedImpl <em>JZ Led</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZLedImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZLed()
	 * @generated
	 */
	int JZ_LED = 8;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__VALUE = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__COLUMNS = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__ROWS = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multicolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__MULTICOLOR = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bargraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__BARGRAPH = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Color Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__COLOR_OFF = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Color On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__COLOR_ON = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__LIGHT = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED__LABEL_ACTIVE = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>JZ Led</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LED_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZLemurMenuImpl <em>JZ Lemur Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZLemurMenuImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZLemurMenu()
	 * @generated
	 */
	int JZ_LEMUR_MENU = 9;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Scale Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__SCALE_OUTPUT = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__FONT = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__COLOR = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__ITEMS = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU__SELECTION = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JZ Lemur Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MENU_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZLemurMonitorImpl <em>JZ Lemur Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZLemurMonitorImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZLemurMonitor()
	 * @generated
	 */
	int JZ_LEMUR_MONITOR = 10;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__VALUE = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__UNIT = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__PRECISION = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__FONT = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR__COLOR = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JZ Lemur Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_LEMUR_MONITOR_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZPadsImpl <em>JZ Pads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZPadsImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZPads()
	 * @generated
	 */
	int JZ_PADS = 11;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__NUMBERS = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__COLUMNS = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__ROWS = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multilabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__MULTILABEL = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multicolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__MULTICOLOR = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Color On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__COLOR_ON = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Color Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__COLOR_OFF = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__VALUES = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__ATTACK = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Decay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__DECAY = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__HOLD = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__LIGHT = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__RELEASE = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Sustain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__SUSTAIN = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__COLOR = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__LABEL_VISIBLE = JZ_WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__X = JZ_WIDGET_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__FRICTION = JZ_WIDGET_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__HEIGHT = JZ_WIDGET_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS__TENSION = JZ_WIDGET_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>JZ Pads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_PADS_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 21;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl <em>JZ Surface LCD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZSurfaceLCD()
	 * @generated
	 */
	int JZ_SURFACE_LCD = 12;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__TARGET = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__DISPLAY = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__FONT = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__TOP = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD__BOTTOM = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>JZ Surface LCD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SURFACE_LCD_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl <em>JZ Switches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZSwitchesImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZSwitches()
	 * @generated
	 */
	int JZ_SWITCHES = 13;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__NUMBERS = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__RADIO = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__COLUMNS = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__ROWS = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multilabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__MULTILABEL = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multicolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__MULTICOLOR = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Color On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__COLOR_ON = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Color Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__COLOR_OFF = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__LIGHT = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__LABEL_VISIBLE = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Paint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__PAINT = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES__X = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>JZ Switches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SWITCHES_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZTextImpl <em>JZ Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZTextImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZText()
	 * @generated
	 */
	int JZ_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__TEXT = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__FONT = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__COLOR = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__LIGHT = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__FONT_SIZE = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Font Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT__FONT_ALIGN = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>JZ Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TEXT_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZCustomButtonImpl <em>JZ Custom Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZCustomButtonImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZCustomButton()
	 * @generated
	 */
	int JZ_CUSTOM_BUTTON = 15;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__OUTLINE = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__COLOR_OFF = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__COLOR_ON = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__LIGHT = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Off Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__STYLE_OFF_TEXT = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__TEXT_ALIGN = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__STYLE_ON = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Style Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__STYLE_OFF = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Style On Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__STYLE_ON_TEXT = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__FONT_SIZE = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__MODE = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON__X = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>JZ Custom Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CUSTOM_BUTTON_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZSignalScopeImpl <em>JZ Signal Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZSignalScopeImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZSignalScope()
	 * @generated
	 */
	int JZ_SIGNAL_SCOPE = 16;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Mode XY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__MODE_XY = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__COLOR = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__DATA = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__FRICTION = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__HEIGHT = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__LIGHT = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__TENSION = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__LABEL_VISIBLE = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__XB = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Yb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__YB = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__TIMEBASE = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__X = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE__Y = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>JZ Signal Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_SIGNAL_SCOPE_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZRangeImpl <em>JZ Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZRangeImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZRange()
	 * @generated
	 */
	int JZ_RANGE = 17;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__HORIZONTAL = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__COLOR = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__LIGHT = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__LABEL_VISIBLE = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__GRID = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Grid Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__GRID_VALUE = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__PHYSICS = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__TENSION = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__FRICTION = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Min height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__MIN_HEIGHT = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Max height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__MAX_HEIGHT = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Drag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__DRAG = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__X = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE__HEIGHT = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>JZ Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RANGE_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl <em>JZ Multi Balls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZMultiBallsImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZMultiBalls()
	 * @generated
	 */
	int JZ_MULTI_BALLS = 18;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__NUMBERS = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multilabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__MULTILABEL = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__MULTI_COLOR = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__X = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__Y = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__Z = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__ATTACK = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Decay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__DECAY = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__FRICTION = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__HOLD = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Hold X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__HOLD_X = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hold Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__HOLD_Y = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__RELEASE = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__SPEED = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Sustain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__SUSTAIN = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Grid Step X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__GRID_STEP_X = JZ_WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Grid Step Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__GRID_STEP_Y = JZ_WIDGET_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__HEIGHT = JZ_WIDGET_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__LIGHT = JZ_WIDGET_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__TENSION = JZ_WIDGET_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__DATA = JZ_WIDGET_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Numbers Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__NUMBERS_VISIBLE = JZ_WIDGET_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Balls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__BALLS = JZ_WIDGET_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__COLOR = JZ_WIDGET_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__LABEL_VISIBLE = JZ_WIDGET_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__PHYSICS = JZ_WIDGET_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Cursor Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__CURSOR_MODE = JZ_WIDGET_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Attraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__ATTRACTION = JZ_WIDGET_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__GRID_ACTIVE = JZ_WIDGET_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Ephemeral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS__EPHEMERAL = JZ_WIDGET_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>JZ Multi Balls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MULTI_BALLS_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 31;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZTrackImpl <em>JZ Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZTrackImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZTrack()
	 * @generated
	 */
	int JZ_TRACK = 19;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Mode XY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__MODE_XY = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__TRANSPARENT = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK__COLOR = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>JZ Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TRACK_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZmultiSliderImpl <em>JZmulti Slider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZmultiSliderImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZmultiSlider()
	 * @generated
	 */
	int JZMULTI_SLIDER = 20;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__HORIZONTAL = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bipolar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__BIPOLAR = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Slider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__SLIDER = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__GRADIENT = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multicolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__MULTICOLOR = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__LIGHT = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__VALUES = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__FRICTION = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__TENSION = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__HEIGHT = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__LABEL_VISIBLE = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__COLOR = JZ_WIDGET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__PHYSICS = JZ_WIDGET_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__GRID_ACTIVE = JZ_WIDGET_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Grid Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__GRID_VALUE = JZ_WIDGET_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER__X = JZ_WIDGET_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>JZmulti Slider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZMULTI_SLIDER_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZMenuItemImpl <em>JZ Menu Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZMenuItemImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZMenuItem()
	 * @generated
	 */
	int JZ_MENU_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MENU_ITEM__LABEL = 0;

	/**
	 * The number of structural features of the '<em>JZ Menu Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MENU_ITEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl <em>JZ Ring Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZRingAreaImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZRingArea()
	 * @generated
	 */
	int JZ_RING_AREA = 22;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__FONT_STYLE = JZ_WIDGET__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__BOUNDS = JZ_WIDGET__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__FONT_NAME = JZ_WIDGET__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__NAME = JZ_WIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__OSC_PROPS = JZ_WIDGET__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__MIDI_PROPS = JZ_WIDGET__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__PARENT_TARGET = JZ_WIDGET__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__SCRIPTS = JZ_WIDGET__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__TARGET_FEATURES = JZ_WIDGET__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Primary Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__PRIMARY_OSC_TARGET = JZ_WIDGET__PRIMARY_OSC_TARGET;

	/**
	 * The feature id for the '<em><b>Primary Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__PRIMARY_MIDI_TARGET = JZ_WIDGET__PRIMARY_MIDI_TARGET;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__SPEED = JZ_WIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__FRICTION = JZ_WIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__ATTRACTION = JZ_WIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attraction x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__ATTRACTION_X = JZ_WIDGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attraction y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__ATTRACTION_Y = JZ_WIDGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__COLOR = JZ_WIDGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Value Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__VALUE_ACTIVE = JZ_WIDGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__CAPTURE = JZ_WIDGET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__X = JZ_WIDGET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA__Y = JZ_WIDGET_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>JZ Ring Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_RING_AREA_FEATURE_COUNT = JZ_WIDGET_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl <em>OSC Dyna Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getOSCDynaProperties()
	 * @generated
	 */
	int OSC_DYNA_PROPERTIES = 23;

	/**
	 * The feature id for the '<em><b>Custom Osc Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DYNA_PROPERTIES__CUSTOM_OSC_MSG = 0;

	/**
	 * The feature id for the '<em><b>Lemur Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DYNA_PROPERTIES__LEMUR_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Osc Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DYNA_PROPERTIES__OSC_MSG = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DYNA_PROPERTIES__TARGET = 4;

	/**
	 * The number of structural features of the '<em>OSC Dyna Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DYNA_PROPERTIES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl <em>Midi Dyna Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiDynaProperties()
	 * @generated
	 */
	int MIDI_DYNA_PROPERTIES = 24;

	/**
	 * The feature id for the '<em><b>Custom Midi Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_DYNA_PROPERTIES__CUSTOM_MIDI_MSG = 0;

	/**
	 * The feature id for the '<em><b>Lemur Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_DYNA_PROPERTIES__LEMUR_TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Midi Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_DYNA_PROPERTIES__MIDI_MSG = 2;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_DYNA_PROPERTIES__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Midi Dyna Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_DYNA_PROPERTIES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl <em>DMX Dyna Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getDMXDynaProperties()
	 * @generated
	 */
	int DMX_DYNA_PROPERTIES = 25;

	/**
	 * The feature id for the '<em><b>Dmx Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DYNA_PROPERTIES__DMX_MSG = 0;

	/**
	 * The feature id for the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Custom Dmx Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DYNA_PROPERTIES__CUSTOM_DMX_MSG = 2;

	/**
	 * The feature id for the '<em><b>Lemur Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DYNA_PROPERTIES__LEMUR_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DYNA_PROPERTIES__TARGET = 4;

	/**
	 * The number of structural features of the '<em>DMX Dyna Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_DYNA_PROPERTIES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl <em>JZ Jazz Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZJazzInterface()
	 * @generated
	 */
	int JZ_JAZZ_INTERFACE = 26;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__FONT_STYLE = JZ_CONTAINER__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__BOUNDS = JZ_CONTAINER__BOUNDS;

	/**
	 * The feature id for the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__FONT_NAME = JZ_CONTAINER__FONT_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__NAME = JZ_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Osc Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__OSC_PROPS = JZ_CONTAINER__OSC_PROPS;

	/**
	 * The feature id for the '<em><b>Midi Props</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__MIDI_PROPS = JZ_CONTAINER__MIDI_PROPS;

	/**
	 * The feature id for the '<em><b>Parent Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__PARENT_TARGET = JZ_CONTAINER__PARENT_TARGET;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__SCRIPTS = JZ_CONTAINER__SCRIPTS;

	/**
	 * The feature id for the '<em><b>Target Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__TARGET_FEATURES = JZ_CONTAINER__TARGET_FEATURES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__CHILDREN = JZ_CONTAINER__CHILDREN;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__WIDTH = JZ_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__HEIGHT = JZ_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__MODE = JZ_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE__ORIENTATION = JZ_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>JZ Jazz Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_JAZZ_INTERFACE_FEATURE_COUNT = JZ_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZTargetImpl <em>JZ Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZTargetImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZTarget()
	 * @generated
	 */
	int JZ_TARGET = 27;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TARGET__ADDR = 0;

	/**
	 * The feature id for the '<em><b>Incoming Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TARGET__INCOMING_PORTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TARGET__ID = 2;

	/**
	 * The number of structural features of the '<em>JZ Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_TARGET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JzOscTargetImpl <em>Jz Osc Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JzOscTargetImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzOscTarget()
	 * @generated
	 */
	int JZ_OSC_TARGET = 28;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_TARGET__ADDR = JZ_TARGET__ADDR;

	/**
	 * The feature id for the '<em><b>Incoming Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_TARGET__INCOMING_PORTS = JZ_TARGET__INCOMING_PORTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_TARGET__ID = JZ_TARGET__ID;

	/**
	 * The number of structural features of the '<em>Jz Osc Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_TARGET_FEATURE_COUNT = JZ_TARGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JzMidiTargetImpl <em>Jz Midi Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JzMidiTargetImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzMidiTarget()
	 * @generated
	 */
	int JZ_MIDI_TARGET = 29;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_TARGET__ADDR = JZ_TARGET__ADDR;

	/**
	 * The feature id for the '<em><b>Incoming Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_TARGET__INCOMING_PORTS = JZ_TARGET__INCOMING_PORTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_TARGET__ID = JZ_TARGET__ID;

	/**
	 * The number of structural features of the '<em>Jz Midi Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_TARGET_FEATURE_COUNT = JZ_TARGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JzKBTargetImpl <em>Jz KB Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JzKBTargetImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzKBTarget()
	 * @generated
	 */
	int JZ_KB_TARGET = 30;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KB_TARGET__ADDR = JZ_TARGET__ADDR;

	/**
	 * The feature id for the '<em><b>Incoming Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KB_TARGET__INCOMING_PORTS = JZ_TARGET__INCOMING_PORTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KB_TARGET__ID = JZ_TARGET__ID;

	/**
	 * The number of structural features of the '<em>Jz KB Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_KB_TARGET_FEATURE_COUNT = JZ_TARGET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.KBDynaPropertiesImpl <em>KB Dyna Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.KBDynaPropertiesImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKBDynaProperties()
	 * @generated
	 */
	int KB_DYNA_PROPERTIES = 31;

	/**
	 * The feature id for the '<em><b>Lemur Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KB_DYNA_PROPERTIES__LEMUR_TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KB_DYNA_PROPERTIES__TARGET = 1;

	/**
	 * The number of structural features of the '<em>KB Dyna Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KB_DYNA_PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZConfigurationManagerImpl <em>JZ Configuration Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZConfigurationManagerImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZConfigurationManager()
	 * @generated
	 */
	int JZ_CONFIGURATION_MANAGER = 32;

	/**
	 * The feature id for the '<em><b>Kb Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONFIGURATION_MANAGER__KB_TARGETS = 0;

	/**
	 * The feature id for the '<em><b>Osc Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONFIGURATION_MANAGER__OSC_TARGETS = 1;

	/**
	 * The feature id for the '<em><b>Midi Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONFIGURATION_MANAGER__MIDI_TARGETS = 2;

	/**
	 * The number of structural features of the '<em>JZ Configuration Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_CONFIGURATION_MANAGER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JZVarImpl <em>JZ Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JZVarImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZVar()
	 * @generated
	 */
	int JZ_VAR = 34;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_VAR__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_VAR__TRIGGER = 1;

	/**
	 * The number of structural features of the '<em>JZ Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_VAR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JzOscVarImpl <em>Jz Osc Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JzOscVarImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzOscVar()
	 * @generated
	 */
	int JZ_OSC_VAR = 33;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_VAR__ATTRIBUTE = JZ_VAR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_VAR__TRIGGER = JZ_VAR__TRIGGER;

	/**
	 * The feature id for the '<em><b>Custom Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_VAR__CUSTOM_ADDRESS = JZ_VAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_VAR__CUSTOM_MSG = JZ_VAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_VAR__OSC_TARGET = JZ_VAR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Jz Osc Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_OSC_VAR_FEATURE_COUNT = JZ_VAR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.JzMidiVarImpl <em>Jz Midi Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.JzMidiVarImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzMidiVar()
	 * @generated
	 */
	int JZ_MIDI_VAR = 35;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_VAR__ATTRIBUTE = JZ_VAR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_VAR__TRIGGER = JZ_VAR__TRIGGER;

	/**
	 * The feature id for the '<em><b>Midi Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_VAR__MIDI_MESSAGE = JZ_VAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_VAR__MIDI_TARGET = JZ_VAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jz Midi Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZ_MIDI_VAR_FEATURE_COUNT = JZ_VAR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.ScriptImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 36;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__EXPR = 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarImpl <em>Midi Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVar()
	 * @generated
	 */
	int MIDI_VAR = 56;

	/**
	 * The feature id for the '<em><b>Scale From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR__SCALE_FROM = 0;

	/**
	 * The feature id for the '<em><b>Scale To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR__SCALE_TO = 1;

	/**
	 * The feature id for the '<em><b>Channel From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR__CHANNEL_FROM = 2;

	/**
	 * The feature id for the '<em><b>Channel To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR__CHANNEL_TO = 3;

	/**
	 * The number of structural features of the '<em>Midi Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.AbstractMidiVarNoteImpl <em>Abstract Midi Var Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.AbstractMidiVarNoteImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getAbstractMidiVarNote()
	 * @generated
	 */
	int ABSTRACT_MIDI_VAR_NOTE = 55;

	/**
	 * The feature id for the '<em><b>Scale From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_VAR_NOTE__SCALE_FROM = MIDI_VAR__SCALE_FROM;

	/**
	 * The feature id for the '<em><b>Scale To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_VAR_NOTE__SCALE_TO = MIDI_VAR__SCALE_TO;

	/**
	 * The feature id for the '<em><b>Channel From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_VAR_NOTE__CHANNEL_FROM = MIDI_VAR__CHANNEL_FROM;

	/**
	 * The feature id for the '<em><b>Channel To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_VAR_NOTE__CHANNEL_TO = MIDI_VAR__CHANNEL_TO;

	/**
	 * The feature id for the '<em><b>Pitch From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_VAR_NOTE__PITCH_FROM = MIDI_VAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pitch To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_VAR_NOTE__PITCH_TO = MIDI_VAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Midi Var Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_VAR_NOTE_FEATURE_COUNT = MIDI_VAR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVar80NoteOffImpl <em>Midi Var80 Note Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVar80NoteOffImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVar80NoteOff()
	 * @generated
	 */
	int MIDI_VAR80_NOTE_OFF = 37;

	/**
	 * The feature id for the '<em><b>Scale From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR80_NOTE_OFF__SCALE_FROM = ABSTRACT_MIDI_VAR_NOTE__SCALE_FROM;

	/**
	 * The feature id for the '<em><b>Scale To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR80_NOTE_OFF__SCALE_TO = ABSTRACT_MIDI_VAR_NOTE__SCALE_TO;

	/**
	 * The feature id for the '<em><b>Channel From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR80_NOTE_OFF__CHANNEL_FROM = ABSTRACT_MIDI_VAR_NOTE__CHANNEL_FROM;

	/**
	 * The feature id for the '<em><b>Channel To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR80_NOTE_OFF__CHANNEL_TO = ABSTRACT_MIDI_VAR_NOTE__CHANNEL_TO;

	/**
	 * The feature id for the '<em><b>Pitch From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR80_NOTE_OFF__PITCH_FROM = ABSTRACT_MIDI_VAR_NOTE__PITCH_FROM;

	/**
	 * The feature id for the '<em><b>Pitch To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR80_NOTE_OFF__PITCH_TO = ABSTRACT_MIDI_VAR_NOTE__PITCH_TO;

	/**
	 * The number of structural features of the '<em>Midi Var80 Note Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR80_NOTE_OFF_FEATURE_COUNT = ABSTRACT_MIDI_VAR_NOTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVar90NoteOnImpl <em>Midi Var90 Note On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVar90NoteOnImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVar90NoteOn()
	 * @generated
	 */
	int MIDI_VAR90_NOTE_ON = 38;

	/**
	 * The feature id for the '<em><b>Scale From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR90_NOTE_ON__SCALE_FROM = ABSTRACT_MIDI_VAR_NOTE__SCALE_FROM;

	/**
	 * The feature id for the '<em><b>Scale To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR90_NOTE_ON__SCALE_TO = ABSTRACT_MIDI_VAR_NOTE__SCALE_TO;

	/**
	 * The feature id for the '<em><b>Channel From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR90_NOTE_ON__CHANNEL_FROM = ABSTRACT_MIDI_VAR_NOTE__CHANNEL_FROM;

	/**
	 * The feature id for the '<em><b>Channel To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR90_NOTE_ON__CHANNEL_TO = ABSTRACT_MIDI_VAR_NOTE__CHANNEL_TO;

	/**
	 * The feature id for the '<em><b>Pitch From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR90_NOTE_ON__PITCH_FROM = ABSTRACT_MIDI_VAR_NOTE__PITCH_FROM;

	/**
	 * The feature id for the '<em><b>Pitch To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR90_NOTE_ON__PITCH_TO = ABSTRACT_MIDI_VAR_NOTE__PITCH_TO;

	/**
	 * The number of structural features of the '<em>Midi Var90 Note On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR90_NOTE_ON_FEATURE_COUNT = ABSTRACT_MIDI_VAR_NOTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarA0KeyPressureImpl <em>Midi Var A0 Key Pressure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarA0KeyPressureImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarA0KeyPressure()
	 * @generated
	 */
	int MIDI_VAR_A0_KEY_PRESSURE = 39;

	/**
	 * The number of structural features of the '<em>Midi Var A0 Key Pressure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_A0_KEY_PRESSURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarB0ControlChangeImpl <em>Midi Var B0 Control Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarB0ControlChangeImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarB0ControlChange()
	 * @generated
	 */
	int MIDI_VAR_B0_CONTROL_CHANGE = 40;

	/**
	 * The number of structural features of the '<em>Midi Var B0 Control Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_B0_CONTROL_CHANGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarC0ProgramChangeImpl <em>Midi Var C0 Program Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarC0ProgramChangeImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarC0ProgramChange()
	 * @generated
	 */
	int MIDI_VAR_C0_PROGRAM_CHANGE = 41;

	/**
	 * The number of structural features of the '<em>Midi Var C0 Program Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_C0_PROGRAM_CHANGE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarD0ChannelPressureImpl <em>Midi Var D0 Channel Pressure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarD0ChannelPressureImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarD0ChannelPressure()
	 * @generated
	 */
	int MIDI_VAR_D0_CHANNEL_PRESSURE = 42;

	/**
	 * The number of structural features of the '<em>Midi Var D0 Channel Pressure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_D0_CHANNEL_PRESSURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarE0PitchBendImpl <em>Midi Var E0 Pitch Bend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarE0PitchBendImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarE0PitchBend()
	 * @generated
	 */
	int MIDI_VAR_E0_PITCH_BEND = 43;

	/**
	 * The number of structural features of the '<em>Midi Var E0 Pitch Bend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_E0_PITCH_BEND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarF0SystemExclusiveImpl <em>Midi Var F0 System Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarF0SystemExclusiveImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF0SystemExclusive()
	 * @generated
	 */
	int MIDI_VAR_F0_SYSTEM_EXCLUSIVE = 44;

	/**
	 * The number of structural features of the '<em>Midi Var F0 System Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_F0_SYSTEM_EXCLUSIVE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarF2SngPositionImpl <em>Midi Var F2 Sng Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarF2SngPositionImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF2SngPosition()
	 * @generated
	 */
	int MIDI_VAR_F2_SNG_POSITION = 45;

	/**
	 * The number of structural features of the '<em>Midi Var F2 Sng Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_F2_SNG_POSITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarF3SongSelectImpl <em>Midi Var F3 Song Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarF3SongSelectImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF3SongSelect()
	 * @generated
	 */
	int MIDI_VAR_F3_SONG_SELECT = 46;

	/**
	 * The number of structural features of the '<em>Midi Var F3 Song Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_F3_SONG_SELECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarF5BusSelectImpl <em>Midi Var F5 Bus Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarF5BusSelectImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF5BusSelect()
	 * @generated
	 */
	int MIDI_VAR_F5_BUS_SELECT = 47;

	/**
	 * The number of structural features of the '<em>Midi Var F5 Bus Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_F5_BUS_SELECT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarF6TuneRequestImpl <em>Midi Var F6 Tune Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarF6TuneRequestImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF6TuneRequest()
	 * @generated
	 */
	int MIDI_VAR_F6_TUNE_REQUEST = 48;

	/**
	 * The number of structural features of the '<em>Midi Var F6 Tune Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_F6_TUNE_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarF8TimingTickImpl <em>Midi Var F8 Timing Tick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarF8TimingTickImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF8TimingTick()
	 * @generated
	 */
	int MIDI_VAR_F8_TIMING_TICK = 49;

	/**
	 * The number of structural features of the '<em>Midi Var F8 Timing Tick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_F8_TIMING_TICK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarFAStartSongImpl <em>Midi Var FA Start Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarFAStartSongImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFAStartSong()
	 * @generated
	 */
	int MIDI_VAR_FA_START_SONG = 50;

	/**
	 * The number of structural features of the '<em>Midi Var FA Start Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_FA_START_SONG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarFBContinueSongImpl <em>Midi Var FB Continue Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarFBContinueSongImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFBContinueSong()
	 * @generated
	 */
	int MIDI_VAR_FB_CONTINUE_SONG = 51;

	/**
	 * The number of structural features of the '<em>Midi Var FB Continue Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_FB_CONTINUE_SONG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarFCStopSongImpl <em>Midi Var FC Stop Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarFCStopSongImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFCStopSong()
	 * @generated
	 */
	int MIDI_VAR_FC_STOP_SONG = 52;

	/**
	 * The number of structural features of the '<em>Midi Var FC Stop Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_FC_STOP_SONG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarFEActiveSensingImpl <em>Midi Var FE Active Sensing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarFEActiveSensingImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFEActiveSensing()
	 * @generated
	 */
	int MIDI_VAR_FE_ACTIVE_SENSING = 53;

	/**
	 * The number of structural features of the '<em>Midi Var FE Active Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_FE_ACTIVE_SENSING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.impl.MidiVarFFSystemResetImpl <em>Midi Var FF System Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.impl.MidiVarFFSystemResetImpl
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFFSystemReset()
	 * @generated
	 */
	int MIDI_VAR_FF_SYSTEM_RESET = 54;

	/**
	 * The number of structural features of the '<em>Midi Var FF System Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_VAR_FF_SYSTEM_RESET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.LemurTrigger <em>Lemur Trigger</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurTrigger()
	 * @generated
	 */
	int LEMUR_TRIGGER = 57;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.LemurPreferences <em>Lemur Preferences</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.LemurPreferences
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurPreferences()
	 * @generated
	 */
	int LEMUR_PREFERENCES = 58;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.LemurIncomingPorts <em>Lemur Incoming Ports</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.LemurIncomingPorts
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurIncomingPorts()
	 * @generated
	 */
	int LEMUR_INCOMING_PORTS = 59;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.MIDI_MESSAGES <em>MIDI MESSAGES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.MIDI_MESSAGES
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMIDI_MESSAGES()
	 * @generated
	 */
	int MIDI_MESSAGES = 60;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.KNOB_STYLE <em>KNOB STYLE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.KNOB_STYLE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_STYLE()
	 * @generated
	 */
	int KNOB_STYLE = 61;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.LEMUR_STYLE <em>LEMUR STYLE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.LEMUR_STYLE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLEMUR_STYLE()
	 * @generated
	 */
	int LEMUR_STYLE = 62;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.FONT_SIZE <em>FONT SIZE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.FONT_SIZE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getFONT_SIZE()
	 * @generated
	 */
	int FONT_SIZE = 63;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.TEXT_ALIGN <em>TEXT ALIGN</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.TEXT_ALIGN
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getTEXT_ALIGN()
	 * @generated
	 */
	int TEXT_ALIGN = 64;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.JZML_MODE <em>JZML MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.JZML_MODE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZML_MODE()
	 * @generated
	 */
	int JZML_MODE = 65;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.BREAK_POINT_PHYSICS <em>BREAK POINT PHYSICS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.BREAK_POINT_PHYSICS
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getBREAK_POINT_PHYSICS()
	 * @generated
	 */
	int BREAK_POINT_PHYSICS = 66;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.LEMUR_OSC_TARGET <em>LEMUR OSC TARGET</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.LEMUR_OSC_TARGET
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLEMUR_OSC_TARGET()
	 * @generated
	 */
	int LEMUR_OSC_TARGET = 67;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.LEMUR_MIDI_TARGET <em>LEMUR MIDI TARGET</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.LEMUR_MIDI_TARGET
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLEMUR_MIDI_TARGET()
	 * @generated
	 */
	int LEMUR_MIDI_TARGET = 68;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE <em>CUSTOM BUTTON MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getCUSTOM_BUTTON_MODE()
	 * @generated
	 */
	int CUSTOM_BUTTON_MODE = 69;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.KNOB_CURSOR_MODE <em>KNOB CURSOR MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.KNOB_CURSOR_MODE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_CURSOR_MODE()
	 * @generated
	 */
	int KNOB_CURSOR_MODE = 70;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.KNOB_CONTROL <em>KNOB CONTROL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.KNOB_CONTROL
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_CONTROL()
	 * @generated
	 */
	int KNOB_CONTROL = 71;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.KNOB_PHYSICS <em>KNOB PHYSICS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.KNOB_PHYSICS
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_PHYSICS()
	 * @generated
	 */
	int KNOB_PHYSICS = 72;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.FADER_CURSOR_MODE <em>FADER CURSOR MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.FADER_CURSOR_MODE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getFADER_CURSOR_MODE()
	 * @generated
	 */
	int FADER_CURSOR_MODE = 73;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.FADER_PHYSICS <em>FADER PHYSICS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.FADER_PHYSICS
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getFADER_PHYSICS()
	 * @generated
	 */
	int FADER_PHYSICS = 74;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE <em>MULTIBALLS CURSOR MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMULTIBALLS_CURSOR_MODE()
	 * @generated
	 */
	int MULTIBALLS_CURSOR_MODE = 75;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jzmui.MULTIBALLS_PHYSICS <em>MULTIBALLS PHYSICS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jzmui.MULTIBALLS_PHYSICS
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMULTIBALLS_PHYSICS()
	 * @generated
	 */
	int MULTIBALLS_PHYSICS = 76;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 77;


	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 78;


	/**
	 * The meta object id for the '<em>Path Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.PathData
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getPathData()
	 * @generated
	 */
	int PATH_DATA = 79;


	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 80;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.LemurLiveApp <em>Lemur Live App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lemur Live App</em>'.
	 * @see net.sf.smbt.jzmui.LemurLiveApp
	 * @generated
	 */
	EClass getLemurLiveApp();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.LemurLiveApp#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.jzmui.LemurLiveApp#getWidth()
	 * @see #getLemurLiveApp()
	 * @generated
	 */
	EAttribute getLemurLiveApp_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.LemurLiveApp#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.LemurLiveApp#getHeight()
	 * @see #getLemurLiveApp()
	 * @generated
	 */
	EAttribute getLemurLiveApp_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.LemurLiveApp#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.jzmui.LemurLiveApp#getId()
	 * @see #getLemurLiveApp()
	 * @generated
	 */
	EAttribute getLemurLiveApp_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.LemurLiveApp#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see net.sf.smbt.jzmui.LemurLiveApp#getElements()
	 * @see #getLemurLiveApp()
	 * @generated
	 */
	EReference getLemurLiveApp_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.jzmui.LemurLiveApp#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configurations</em>'.
	 * @see net.sf.smbt.jzmui.LemurLiveApp#getConfigurations()
	 * @see #getLemurLiveApp()
	 * @generated
	 */
	EReference getLemurLiveApp_Configurations();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZUIElem <em>JZUI Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZUI Elem</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem
	 * @generated
	 */
	EClass getJZUIElem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZUIElem#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getFontStyle()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EAttribute getJZUIElem_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZUIElem#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounds</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getBounds()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EAttribute getJZUIElem_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZUIElem#getFontName <em>Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Name</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getFontName()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EAttribute getJZUIElem_FontName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZUIElem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getName()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EAttribute getJZUIElem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZUIElem#getOscProps <em>Osc Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osc Props</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getOscProps()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EReference getJZUIElem_OscProps();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZUIElem#getMidiProps <em>Midi Props</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Midi Props</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getMidiProps()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EReference getJZUIElem_MidiProps();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZUIElem#getParentTarget <em>Parent Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Target</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getParentTarget()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EAttribute getJZUIElem_ParentTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZUIElem#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getScripts()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EReference getJZUIElem_Scripts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZUIElem#getTargetFeatures <em>Target Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Features</em>'.
	 * @see net.sf.smbt.jzmui.JZUIElem#getTargetFeatures()
	 * @see #getJZUIElem()
	 * @generated
	 */
	EReference getJZUIElem_TargetFeatures();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZContainer <em>JZ Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Container</em>'.
	 * @see net.sf.smbt.jzmui.JZContainer
	 * @generated
	 */
	EClass getJZContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.jzmui.JZContainer#getChildren()
	 * @see #getJZContainer()
	 * @generated
	 */
	EReference getJZContainer_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZWidget <em>JZ Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Widget</em>'.
	 * @see net.sf.smbt.jzmui.JZWidget
	 * @generated
	 */
	EClass getJZWidget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZWidget#getPrimaryOscTarget <em>Primary Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Osc Target</em>'.
	 * @see net.sf.smbt.jzmui.JZWidget#getPrimaryOscTarget()
	 * @see #getJZWidget()
	 * @generated
	 */
	EAttribute getJZWidget_PrimaryOscTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZWidget#getPrimaryMidiTarget <em>Primary Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Midi Target</em>'.
	 * @see net.sf.smbt.jzmui.JZWidget#getPrimaryMidiTarget()
	 * @see #getJZWidget()
	 * @generated
	 */
	EAttribute getJZWidget_PrimaryMidiTarget();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZBreakPoint <em>JZ Break Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Break Point</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint
	 * @generated
	 */
	EClass getJZBreakPoint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#isLiveEditing <em>Live Editing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Live Editing</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#isLiveEditing()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_LiveEditing();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getPoints()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Points();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#isCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#isCoordinates()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Coordinates();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getBackground()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getFirstPoint <em>First Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Point</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getFirstPoint()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_FirstPoint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getLight()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getFriction()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getHold()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Hold();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getHoldX <em>Hold X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold X</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getHoldX()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_HoldX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getHoldY <em>Hold Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold Y</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getHoldY()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_HoldY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getAttraction <em>Attraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getAttraction()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Attraction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getEdit <em>Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getEdit()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Edit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getRest()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Rest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getSpeed()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Speed();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.jzmui.JZBreakPoint#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getValues()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getPathData <em>Path Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path Data</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getPathData()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_PathData();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#isGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#isGrid()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Grid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getGridX <em>Grid X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid X</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getGridX()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_GridX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getGridY <em>Grid Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Y</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getGridY()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_GridY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#isFreeForm <em>Free Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Form</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#isFreeForm()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_FreeForm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getPhysics()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Physics();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getColor()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getX()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZBreakPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.jzmui.JZBreakPoint#getY()
	 * @see #getJZBreakPoint()
	 * @generated
	 */
	EAttribute getJZBreakPoint_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZFader <em>JZ Fader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Fader</em>'.
	 * @see net.sf.smbt.jzmui.JZFader
	 * @generated
	 */
	EClass getJZFader();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getValue()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getUnit()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Unit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getPrecision()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Precision();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getColor()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getDrag <em>Drag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drag</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getDrag()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Drag();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getFriction()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getHeight()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getLight()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getTension()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Tension();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#isValueActive <em>Value Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Active</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#isValueActive()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_ValueActive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#isLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#isLabel()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#isGridActive <em>Grid Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Active</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#isGridActive()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_GridActive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getGridValue <em>Grid Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Value</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getGridValue()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_GridValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getAttraction <em>Attraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getAttraction()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Attraction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getCursorMode <em>Cursor Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Mode</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getCursorMode()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_CursorMode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getPhysics()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Physics();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getSpeed()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#isCapture()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getX()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZFader#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.sf.smbt.jzmui.JZFader#getZ()
	 * @see #getJZFader()
	 * @generated
	 */
	EAttribute getJZFader_Z();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZGesture <em>JZ Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Gesture</em>'.
	 * @see net.sf.smbt.jzmui.JZGesture
	 * @generated
	 */
	EClass getJZGesture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZGesture#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZGesture#isTransparent()
	 * @see #getJZGesture()
	 * @generated
	 */
	EAttribute getJZGesture_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZGesture#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZGesture#getColor()
	 * @see #getJZGesture()
	 * @generated
	 */
	EAttribute getJZGesture_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZGesture#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see net.sf.smbt.jzmui.JZGesture#getAngle()
	 * @see #getJZGesture()
	 * @generated
	 */
	EAttribute getJZGesture_Angle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZGesture#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see net.sf.smbt.jzmui.JZGesture#getPan()
	 * @see #getJZGesture()
	 * @generated
	 */
	EAttribute getJZGesture_Pan();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZGesture#getPinch <em>Pinch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinch</em>'.
	 * @see net.sf.smbt.jzmui.JZGesture#getPinch()
	 * @see #getJZGesture()
	 * @generated
	 */
	EAttribute getJZGesture_Pinch();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZKnob <em>JZ Knob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Knob</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob
	 * @generated
	 */
	EClass getJZKnob();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#isEndlessKnob <em>Endless Knob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endless Knob</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#isEndlessKnob()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_EndlessKnob();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getValue()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getUnit()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Unit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getPrecision()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Precision();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getBackgroud <em>Backgroud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Backgroud</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getBackgroud()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Backgroud();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getForeground()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Foreground();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getAttack()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Attack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getSustain <em>Sustain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sustain</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getSustain()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Sustain();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getDecay <em>Decay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decay</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getDecay()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Decay();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getRelease()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Release();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getHold()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Hold();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#isLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#isLabel()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#isValueActive <em>Value Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Active</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#isValueActive()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_ValueActive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#isGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#isGrid()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Grid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getCursorMode <em>Cursor Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Mode</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getCursorMode()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_CursorMode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getControlMode <em>Control Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Mode</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getControlMode()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_ControlMode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getPhysics()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Physics();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getAttraction <em>Attraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getAttraction()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Attraction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getFriction()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getSpeed()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZKnob#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZKnob#getX()
	 * @see #getJZKnob()
	 * @generated
	 */
	EAttribute getJZKnob_X();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZLed <em>JZ Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Led</em>'.
	 * @see net.sf.smbt.jzmui.JZLed
	 * @generated
	 */
	EClass getJZLed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#isTransparent()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#getValue()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#getColumns()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_Columns();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#getRows()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#isMulticolor <em>Multicolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicolor</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#isMulticolor()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_Multicolor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#isBargraph <em>Bargraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bargraph</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#isBargraph()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_Bargraph();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#getColorOff <em>Color Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Off</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#getColorOff()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_ColorOff();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#getColorOn <em>Color On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color On</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#getColorOn()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_ColorOn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#getLight()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLed#isLabelActive <em>Label Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Active</em>'.
	 * @see net.sf.smbt.jzmui.JZLed#isLabelActive()
	 * @see #getJZLed()
	 * @generated
	 */
	EAttribute getJZLed_LabelActive();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZLemurMenu <em>JZ Lemur Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Lemur Menu</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMenu
	 * @generated
	 */
	EClass getJZLemurMenu();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMenu#isScaleOutput <em>Scale Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Output</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMenu#isScaleOutput()
	 * @see #getJZLemurMenu()
	 * @generated
	 */
	EAttribute getJZLemurMenu_ScaleOutput();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMenu#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMenu#isTransparent()
	 * @see #getJZLemurMenu()
	 * @generated
	 */
	EAttribute getJZLemurMenu_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMenu#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMenu#getFont()
	 * @see #getJZLemurMenu()
	 * @generated
	 */
	EAttribute getJZLemurMenu_Font();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMenu#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMenu#getColor()
	 * @see #getJZLemurMenu()
	 * @generated
	 */
	EAttribute getJZLemurMenu_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZLemurMenu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMenu#getItems()
	 * @see #getJZLemurMenu()
	 * @generated
	 */
	EReference getJZLemurMenu_Items();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMenu#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selection</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMenu#getSelection()
	 * @see #getJZLemurMenu()
	 * @generated
	 */
	EAttribute getJZLemurMenu_Selection();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZLemurMonitor <em>JZ Lemur Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Lemur Monitor</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor
	 * @generated
	 */
	EClass getJZLemurMonitor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMonitor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor#getValue()
	 * @see #getJZLemurMonitor()
	 * @generated
	 */
	EAttribute getJZLemurMonitor_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMonitor#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor#getUnit()
	 * @see #getJZLemurMonitor()
	 * @generated
	 */
	EAttribute getJZLemurMonitor_Unit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMonitor#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor#getPrecision()
	 * @see #getJZLemurMonitor()
	 * @generated
	 */
	EAttribute getJZLemurMonitor_Precision();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMonitor#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor#getFont()
	 * @see #getJZLemurMonitor()
	 * @generated
	 */
	EAttribute getJZLemurMonitor_Font();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMonitor#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor#isTransparent()
	 * @see #getJZLemurMonitor()
	 * @generated
	 */
	EAttribute getJZLemurMonitor_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZLemurMonitor#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor#getColor()
	 * @see #getJZLemurMonitor()
	 * @generated
	 */
	EAttribute getJZLemurMonitor_Color();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZPads <em>JZ Pads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Pads</em>'.
	 * @see net.sf.smbt.jzmui.JZPads
	 * @generated
	 */
	EClass getJZPads();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getNumbers <em>Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getNumbers()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Numbers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getColumns()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Columns();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getRows()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#isMultilabel <em>Multilabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multilabel</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#isMultilabel()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Multilabel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#isMulticolor <em>Multicolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicolor</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#isMulticolor()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Multicolor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getColorOn <em>Color On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color On</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getColorOn()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_ColorOn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getColorOff <em>Color Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Off</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getColorOff()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_ColorOff();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.jzmui.JZPads#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getValues()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getAttack()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Attack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getDecay <em>Decay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decay</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getDecay()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Decay();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getHold()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Hold();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getLight()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getRelease()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Release();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getSustain <em>Sustain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sustain</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getSustain()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Sustain();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getColor()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#isLabelVisible <em>Label Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Visible</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#isLabelVisible()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_LabelVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#isCapture()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getX()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getFriction()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getHeight()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZPads#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see net.sf.smbt.jzmui.JZPads#getTension()
	 * @see #getJZPads()
	 * @generated
	 */
	EAttribute getJZPads_Tension();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZSurfaceLCD <em>JZ Surface LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Surface LCD</em>'.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD
	 * @generated
	 */
	EClass getJZSurfaceLCD();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSurfaceLCD#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD#isTransparent()
	 * @see #getJZSurfaceLCD()
	 * @generated
	 */
	EAttribute getJZSurfaceLCD_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSurfaceLCD#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD#getTarget()
	 * @see #getJZSurfaceLCD()
	 * @generated
	 */
	EAttribute getJZSurfaceLCD_Target();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSurfaceLCD#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD#getDisplay()
	 * @see #getJZSurfaceLCD()
	 * @generated
	 */
	EAttribute getJZSurfaceLCD_Display();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSurfaceLCD#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD#getFont()
	 * @see #getJZSurfaceLCD()
	 * @generated
	 */
	EAttribute getJZSurfaceLCD_Font();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSurfaceLCD#getTop <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top</em>'.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD#getTop()
	 * @see #getJZSurfaceLCD()
	 * @generated
	 */
	EAttribute getJZSurfaceLCD_Top();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSurfaceLCD#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD#getBottom()
	 * @see #getJZSurfaceLCD()
	 * @generated
	 */
	EAttribute getJZSurfaceLCD_Bottom();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZSwitches <em>JZ Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Switches</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches
	 * @generated
	 */
	EClass getJZSwitches();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#getNumbers <em>Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#getNumbers()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Numbers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#isRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#isRadio()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Radio();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#getColumns()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Columns();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#getRows()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Rows();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#isMultilabel <em>Multilabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multilabel</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#isMultilabel()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Multilabel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#isMulticolor <em>Multicolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicolor</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#isMulticolor()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Multicolor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#getColorOn <em>Color On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color On</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#getColorOn()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_ColorOn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#getColorOff <em>Color Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Off</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#getColorOff()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_ColorOff();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#getLight()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#isLabelVisible <em>Label Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Visible</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#isLabelVisible()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_LabelVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#isCapture()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#isPaint <em>Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paint</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#isPaint()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_Paint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSwitches#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZSwitches#getX()
	 * @see #getJZSwitches()
	 * @generated
	 */
	EAttribute getJZSwitches_X();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZText <em>JZ Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Text</em>'.
	 * @see net.sf.smbt.jzmui.JZText
	 * @generated
	 */
	EClass getJZText();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.jzmui.JZText#getText()
	 * @see #getJZText()
	 * @generated
	 */
	EAttribute getJZText_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZText#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see net.sf.smbt.jzmui.JZText#getFont()
	 * @see #getJZText()
	 * @generated
	 */
	EAttribute getJZText_Font();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZText#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZText#isTransparent()
	 * @see #getJZText()
	 * @generated
	 */
	EAttribute getJZText_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZText#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZText#getColor()
	 * @see #getJZText()
	 * @generated
	 */
	EAttribute getJZText_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZText#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZText#getLight()
	 * @see #getJZText()
	 * @generated
	 */
	EAttribute getJZText_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZText#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see net.sf.smbt.jzmui.JZText#getFontSize()
	 * @see #getJZText()
	 * @generated
	 */
	EAttribute getJZText_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZText#getFontAlign <em>Font Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Align</em>'.
	 * @see net.sf.smbt.jzmui.JZText#getFontAlign()
	 * @see #getJZText()
	 * @generated
	 */
	EAttribute getJZText_FontAlign();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZCustomButton <em>JZ Custom Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Custom Button</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton
	 * @generated
	 */
	EClass getJZCustomButton();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#isOutline()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOff <em>Style Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Off</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getStyleOff()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_StyleOff();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOnText <em>Style On Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style On Text</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getStyleOnText()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_StyleOnText();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getFontSize()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#isCapture()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getMode()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getX()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOn <em>Style On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style On</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getStyleOn()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_StyleOn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getColorOff <em>Color Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Off</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getColorOff()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_ColorOff();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getColorOn <em>Color On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color On</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getColorOn()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_ColorOn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getLight()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getStyleOffText <em>Style Off Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Off Text</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getStyleOffText()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_StyleOffText();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZCustomButton#getTextAlign <em>Text Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Align</em>'.
	 * @see net.sf.smbt.jzmui.JZCustomButton#getTextAlign()
	 * @see #getJZCustomButton()
	 * @generated
	 */
	EAttribute getJZCustomButton_TextAlign();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZSignalScope <em>JZ Signal Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Signal Scope</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope
	 * @generated
	 */
	EClass getJZSignalScope();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#isModeXY <em>Mode XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode XY</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#isModeXY()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_ModeXY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#isTransparent()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getColor()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Color();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.jzmui.JZSignalScope#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getData()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getFriction()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getHeight()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getLight()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getTension()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Tension();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#isLabelVisible <em>Label Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Visible</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#isLabelVisible()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_LabelVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getXb <em>Xb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xb</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getXb()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Xb();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getYb <em>Yb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yb</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getYb()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Yb();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getTimebase <em>Timebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timebase</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getTimebase()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Timebase();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getX()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZSignalScope#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.jzmui.JZSignalScope#getY()
	 * @see #getJZSignalScope()
	 * @generated
	 */
	EAttribute getJZSignalScope_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZRange <em>JZ Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Range</em>'.
	 * @see net.sf.smbt.jzmui.JZRange
	 * @generated
	 */
	EClass getJZRange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#isHorizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#isHorizontal()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Horizontal();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getColor()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getLight()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#isLabelVisible <em>Label Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Visible</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#isLabelVisible()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_LabelVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#isCapture()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#isGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#isGrid()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Grid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getGridValue <em>Grid Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Value</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getGridValue()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_GridValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#isPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#isPhysics()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Physics();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getTension()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Tension();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getFriction()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getMin_height <em>Min height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min height</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getMin_height()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Min_height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getMax_height <em>Max height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max height</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getMax_height()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Max_height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getDrag <em>Drag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drag</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getDrag()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Drag();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getX()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRange#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.JZRange#getHeight()
	 * @see #getJZRange()
	 * @generated
	 */
	EAttribute getJZRange_Height();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZMultiBalls <em>JZ Multi Balls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Multi Balls</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls
	 * @generated
	 */
	EClass getJZMultiBalls();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isNumbers <em>Numbers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isNumbers()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Numbers();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isMultilabel <em>Multilabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multilabel</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isMultilabel()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Multilabel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isMultiColor <em>Multi Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Color</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isMultiColor()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_MultiColor();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.jzmui.JZMultiBalls#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getData()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isNumbersVisible <em>Numbers Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numbers Visible</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isNumbersVisible()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_NumbersVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getBalls <em>Balls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balls</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getBalls()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Balls();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getColor()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isLabelVisible <em>Label Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Visible</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isLabelVisible()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_LabelVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getPhysics()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Physics();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getCursorMode <em>Cursor Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor Mode</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getCursorMode()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_CursorMode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getAttraction <em>Attraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getAttraction()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Attraction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isCapture()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isGridActive <em>Grid Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Active</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isGridActive()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_GridActive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#isEphemeral <em>Ephemeral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ephemeral</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#isEphemeral()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Ephemeral();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getX()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getY()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getZ()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Z();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getAttack()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Attack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getDecay <em>Decay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decay</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getDecay()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Decay();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getFriction()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getHold()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Hold();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getHoldX <em>Hold X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold X</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getHoldX()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_HoldX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getHoldY <em>Hold Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold Y</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getHoldY()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_HoldY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getRelease()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Release();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getSpeed()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getSustain <em>Sustain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sustain</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getSustain()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Sustain();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getGridStepX <em>Grid Step X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Step X</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getGridStepX()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_GridStepX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getGridStepY <em>Grid Step Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Step Y</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getGridStepY()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_GridStepY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getHeight()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getLight()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMultiBalls#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see net.sf.smbt.jzmui.JZMultiBalls#getTension()
	 * @see #getJZMultiBalls()
	 * @generated
	 */
	EAttribute getJZMultiBalls_Tension();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZTrack <em>JZ Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Track</em>'.
	 * @see net.sf.smbt.jzmui.JZTrack
	 * @generated
	 */
	EClass getJZTrack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZTrack#getModeXY <em>Mode XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode XY</em>'.
	 * @see net.sf.smbt.jzmui.JZTrack#getModeXY()
	 * @see #getJZTrack()
	 * @generated
	 */
	EAttribute getJZTrack_ModeXY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZTrack#isTransparent <em>Transparent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparent</em>'.
	 * @see net.sf.smbt.jzmui.JZTrack#isTransparent()
	 * @see #getJZTrack()
	 * @generated
	 */
	EAttribute getJZTrack_Transparent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZTrack#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZTrack#getColor()
	 * @see #getJZTrack()
	 * @generated
	 */
	EAttribute getJZTrack_Color();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZmultiSlider <em>JZmulti Slider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZmulti Slider</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider
	 * @generated
	 */
	EClass getJZmultiSlider();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#isHorizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#isHorizontal()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Horizontal();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#isBipolar <em>Bipolar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bipolar</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#isBipolar()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Bipolar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getSlider <em>Slider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slider</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getSlider()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Slider();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getGradient()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Gradient();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#isMulticolor <em>Multicolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicolor</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#isMulticolor()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Multicolor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getLight()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Light();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.jzmui.JZmultiSlider#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getValues()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Values();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getFriction()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getTension()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Tension();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getHeight()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#isLabelVisible <em>Label Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Visible</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#isLabelVisible()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_LabelVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getColor()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#isPhysics <em>Physics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physics</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#isPhysics()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Physics();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#isGridActive <em>Grid Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Active</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#isGridActive()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_GridActive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#isCapture()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getGridValue <em>Grid Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Value</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getGridValue()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_GridValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZmultiSlider#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZmultiSlider#getX()
	 * @see #getJZmultiSlider()
	 * @generated
	 */
	EAttribute getJZmultiSlider_X();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZMenuItem <em>JZ Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Menu Item</em>'.
	 * @see net.sf.smbt.jzmui.JZMenuItem
	 * @generated
	 */
	EClass getJZMenuItem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZMenuItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.jzmui.JZMenuItem#getLabel()
	 * @see #getJZMenuItem()
	 * @generated
	 */
	EAttribute getJZMenuItem_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZRingArea <em>JZ Ring Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Ring Area</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea
	 * @generated
	 */
	EClass getJZRingArea();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getSpeed()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getFriction()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getAttraction <em>Attraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getAttraction()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Attraction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getAttraction_x <em>Attraction x</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction x</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getAttraction_x()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Attraction_x();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getAttraction_y <em>Attraction y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction y</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getAttraction_y()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Attraction_y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getColor()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#isValueActive <em>Value Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Active</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#isValueActive()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_ValueActive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#isCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#isCapture()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getX()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZRingArea#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.jzmui.JZRingArea#getY()
	 * @see #getJZRingArea()
	 * @generated
	 */
	EAttribute getJZRingArea_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.OSCDynaProperties <em>OSC Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSC Dyna Properties</em>'.
	 * @see net.sf.smbt.jzmui.OSCDynaProperties
	 * @generated
	 */
	EClass getOSCDynaProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.OSCDynaProperties#isCustomOscMsg <em>Custom Osc Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Osc Msg</em>'.
	 * @see net.sf.smbt.jzmui.OSCDynaProperties#isCustomOscMsg()
	 * @see #getOSCDynaProperties()
	 * @generated
	 */
	EAttribute getOSCDynaProperties_CustomOscMsg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.OSCDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lemur Trigger</em>'.
	 * @see net.sf.smbt.jzmui.OSCDynaProperties#getLemurTrigger()
	 * @see #getOSCDynaProperties()
	 * @generated
	 */
	EAttribute getOSCDynaProperties_LemurTrigger();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.jzmui.OSCDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see net.sf.smbt.jzmui.OSCDynaProperties#getEStructuralFeature()
	 * @see #getOSCDynaProperties()
	 * @generated
	 */
	EReference getOSCDynaProperties_EStructuralFeature();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.jzmui.OSCDynaProperties#getOscMsg <em>Osc Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Osc Msg</em>'.
	 * @see net.sf.smbt.jzmui.OSCDynaProperties#getOscMsg()
	 * @see #getOSCDynaProperties()
	 * @generated
	 */
	EReference getOSCDynaProperties_OscMsg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.OSCDynaProperties#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see net.sf.smbt.jzmui.OSCDynaProperties#getTarget()
	 * @see #getOSCDynaProperties()
	 * @generated
	 */
	EAttribute getOSCDynaProperties_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiDynaProperties <em>Midi Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Dyna Properties</em>'.
	 * @see net.sf.smbt.jzmui.MidiDynaProperties
	 * @generated
	 */
	EClass getMidiDynaProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.MidiDynaProperties#isCustomMidiMsg <em>Custom Midi Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Midi Msg</em>'.
	 * @see net.sf.smbt.jzmui.MidiDynaProperties#isCustomMidiMsg()
	 * @see #getMidiDynaProperties()
	 * @generated
	 */
	EAttribute getMidiDynaProperties_CustomMidiMsg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.MidiDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lemur Trigger</em>'.
	 * @see net.sf.smbt.jzmui.MidiDynaProperties#getLemurTrigger()
	 * @see #getMidiDynaProperties()
	 * @generated
	 */
	EAttribute getMidiDynaProperties_LemurTrigger();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.jzmui.MidiDynaProperties#getMidiMsg <em>Midi Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Midi Msg</em>'.
	 * @see net.sf.smbt.jzmui.MidiDynaProperties#getMidiMsg()
	 * @see #getMidiDynaProperties()
	 * @generated
	 */
	EReference getMidiDynaProperties_MidiMsg();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.jzmui.MidiDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see net.sf.smbt.jzmui.MidiDynaProperties#getEStructuralFeature()
	 * @see #getMidiDynaProperties()
	 * @generated
	 */
	EReference getMidiDynaProperties_EStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.MidiDynaProperties#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see net.sf.smbt.jzmui.MidiDynaProperties#getTarget()
	 * @see #getMidiDynaProperties()
	 * @generated
	 */
	EAttribute getMidiDynaProperties_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.DMXDynaProperties <em>DMX Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Dyna Properties</em>'.
	 * @see net.sf.smbt.jzmui.DMXDynaProperties
	 * @generated
	 */
	EClass getDMXDynaProperties();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.jzmui.DMXDynaProperties#getDmxMsg <em>Dmx Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dmx Msg</em>'.
	 * @see net.sf.smbt.jzmui.DMXDynaProperties#getDmxMsg()
	 * @see #getDMXDynaProperties()
	 * @generated
	 */
	EReference getDMXDynaProperties_DmxMsg();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.jzmui.DMXDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EStructural Feature</em>'.
	 * @see net.sf.smbt.jzmui.DMXDynaProperties#getEStructuralFeature()
	 * @see #getDMXDynaProperties()
	 * @generated
	 */
	EReference getDMXDynaProperties_EStructuralFeature();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.DMXDynaProperties#isCustomDmxMsg <em>Custom Dmx Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Dmx Msg</em>'.
	 * @see net.sf.smbt.jzmui.DMXDynaProperties#isCustomDmxMsg()
	 * @see #getDMXDynaProperties()
	 * @generated
	 */
	EAttribute getDMXDynaProperties_CustomDmxMsg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.DMXDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lemur Trigger</em>'.
	 * @see net.sf.smbt.jzmui.DMXDynaProperties#getLemurTrigger()
	 * @see #getDMXDynaProperties()
	 * @generated
	 */
	EAttribute getDMXDynaProperties_LemurTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.DMXDynaProperties#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see net.sf.smbt.jzmui.DMXDynaProperties#getTarget()
	 * @see #getDMXDynaProperties()
	 * @generated
	 */
	EAttribute getDMXDynaProperties_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZJazzInterface <em>JZ Jazz Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Jazz Interface</em>'.
	 * @see net.sf.smbt.jzmui.JZJazzInterface
	 * @generated
	 */
	EClass getJZJazzInterface();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZJazzInterface#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.jzmui.JZJazzInterface#getWidth()
	 * @see #getJZJazzInterface()
	 * @generated
	 */
	EAttribute getJZJazzInterface_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZJazzInterface#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jzmui.JZJazzInterface#getHeight()
	 * @see #getJZJazzInterface()
	 * @generated
	 */
	EAttribute getJZJazzInterface_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZJazzInterface#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.jzmui.JZJazzInterface#getMode()
	 * @see #getJZJazzInterface()
	 * @generated
	 */
	EAttribute getJZJazzInterface_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZJazzInterface#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see net.sf.smbt.jzmui.JZJazzInterface#getOrientation()
	 * @see #getJZJazzInterface()
	 * @generated
	 */
	EAttribute getJZJazzInterface_Orientation();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZTarget <em>JZ Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Target</em>'.
	 * @see net.sf.smbt.jzmui.JZTarget
	 * @generated
	 */
	EClass getJZTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZTarget#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.jzmui.JZTarget#getAddr()
	 * @see #getJZTarget()
	 * @generated
	 */
	EAttribute getJZTarget_Addr();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.jzmui.JZTarget#getIncomingPorts <em>Incoming Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Incoming Ports</em>'.
	 * @see net.sf.smbt.jzmui.JZTarget#getIncomingPorts()
	 * @see #getJZTarget()
	 * @generated
	 */
	EAttribute getJZTarget_IncomingPorts();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZTarget#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.jzmui.JZTarget#getId()
	 * @see #getJZTarget()
	 * @generated
	 */
	EAttribute getJZTarget_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JzOscTarget <em>Jz Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jz Osc Target</em>'.
	 * @see net.sf.smbt.jzmui.JzOscTarget
	 * @generated
	 */
	EClass getJzOscTarget();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JzMidiTarget <em>Jz Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jz Midi Target</em>'.
	 * @see net.sf.smbt.jzmui.JzMidiTarget
	 * @generated
	 */
	EClass getJzMidiTarget();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JzKBTarget <em>Jz KB Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jz KB Target</em>'.
	 * @see net.sf.smbt.jzmui.JzKBTarget
	 * @generated
	 */
	EClass getJzKBTarget();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.KBDynaProperties <em>KB Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KB Dyna Properties</em>'.
	 * @see net.sf.smbt.jzmui.KBDynaProperties
	 * @generated
	 */
	EClass getKBDynaProperties();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.KBDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lemur Trigger</em>'.
	 * @see net.sf.smbt.jzmui.KBDynaProperties#getLemurTrigger()
	 * @see #getKBDynaProperties()
	 * @generated
	 */
	EAttribute getKBDynaProperties_LemurTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.KBDynaProperties#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see net.sf.smbt.jzmui.KBDynaProperties#getTarget()
	 * @see #getKBDynaProperties()
	 * @generated
	 */
	EAttribute getKBDynaProperties_Target();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZConfigurationManager <em>JZ Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Configuration Manager</em>'.
	 * @see net.sf.smbt.jzmui.JZConfigurationManager
	 * @generated
	 */
	EClass getJZConfigurationManager();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZConfigurationManager#getKbTargets <em>Kb Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kb Targets</em>'.
	 * @see net.sf.smbt.jzmui.JZConfigurationManager#getKbTargets()
	 * @see #getJZConfigurationManager()
	 * @generated
	 */
	EReference getJZConfigurationManager_KbTargets();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZConfigurationManager#getOscTargets <em>Osc Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osc Targets</em>'.
	 * @see net.sf.smbt.jzmui.JZConfigurationManager#getOscTargets()
	 * @see #getJZConfigurationManager()
	 * @generated
	 */
	EReference getJZConfigurationManager_OscTargets();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jzmui.JZConfigurationManager#getMidiTargets <em>Midi Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Midi Targets</em>'.
	 * @see net.sf.smbt.jzmui.JZConfigurationManager#getMidiTargets()
	 * @see #getJZConfigurationManager()
	 * @generated
	 */
	EReference getJZConfigurationManager_MidiTargets();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JzOscVar <em>Jz Osc Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jz Osc Var</em>'.
	 * @see net.sf.smbt.jzmui.JzOscVar
	 * @generated
	 */
	EClass getJzOscVar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JzOscVar#isCustomAddress <em>Custom Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Address</em>'.
	 * @see net.sf.smbt.jzmui.JzOscVar#isCustomAddress()
	 * @see #getJzOscVar()
	 * @generated
	 */
	EAttribute getJzOscVar_CustomAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JzOscVar#getCustomMsg <em>Custom Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Msg</em>'.
	 * @see net.sf.smbt.jzmui.JzOscVar#getCustomMsg()
	 * @see #getJzOscVar()
	 * @generated
	 */
	EAttribute getJzOscVar_CustomMsg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JzOscVar#getOscTarget <em>Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Target</em>'.
	 * @see net.sf.smbt.jzmui.JzOscVar#getOscTarget()
	 * @see #getJzOscVar()
	 * @generated
	 */
	EAttribute getJzOscVar_OscTarget();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JZVar <em>JZ Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZ Var</em>'.
	 * @see net.sf.smbt.jzmui.JZVar
	 * @generated
	 */
	EClass getJZVar();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.jzmui.JZVar#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see net.sf.smbt.jzmui.JZVar#getAttribute()
	 * @see #getJZVar()
	 * @generated
	 */
	EReference getJZVar_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JZVar#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see net.sf.smbt.jzmui.JZVar#getTrigger()
	 * @see #getJZVar()
	 * @generated
	 */
	EAttribute getJZVar_Trigger();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.JzMidiVar <em>Jz Midi Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jz Midi Var</em>'.
	 * @see net.sf.smbt.jzmui.JzMidiVar
	 * @generated
	 */
	EClass getJzMidiVar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JzMidiVar#getMidiMessage <em>Midi Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Message</em>'.
	 * @see net.sf.smbt.jzmui.JzMidiVar#getMidiMessage()
	 * @see #getJzMidiVar()
	 * @generated
	 */
	EAttribute getJzMidiVar_MidiMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.JzMidiVar#getMidiTarget <em>Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Target</em>'.
	 * @see net.sf.smbt.jzmui.JzMidiVar#getMidiTarget()
	 * @see #getJzMidiVar()
	 * @generated
	 */
	EAttribute getJzMidiVar_MidiTarget();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see net.sf.smbt.jzmui.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.Script#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see net.sf.smbt.jzmui.Script#getExpr()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Expr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVar80NoteOff <em>Midi Var80 Note Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var80 Note Off</em>'.
	 * @see net.sf.smbt.jzmui.MidiVar80NoteOff
	 * @generated
	 */
	EClass getMidiVar80NoteOff();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVar90NoteOn <em>Midi Var90 Note On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var90 Note On</em>'.
	 * @see net.sf.smbt.jzmui.MidiVar90NoteOn
	 * @generated
	 */
	EClass getMidiVar90NoteOn();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarA0KeyPressure <em>Midi Var A0 Key Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var A0 Key Pressure</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarA0KeyPressure
	 * @generated
	 */
	EClass getMidiVarA0KeyPressure();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarB0ControlChange <em>Midi Var B0 Control Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var B0 Control Change</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarB0ControlChange
	 * @generated
	 */
	EClass getMidiVarB0ControlChange();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarC0ProgramChange <em>Midi Var C0 Program Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var C0 Program Change</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarC0ProgramChange
	 * @generated
	 */
	EClass getMidiVarC0ProgramChange();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarD0ChannelPressure <em>Midi Var D0 Channel Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var D0 Channel Pressure</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarD0ChannelPressure
	 * @generated
	 */
	EClass getMidiVarD0ChannelPressure();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarE0PitchBend <em>Midi Var E0 Pitch Bend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var E0 Pitch Bend</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarE0PitchBend
	 * @generated
	 */
	EClass getMidiVarE0PitchBend();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarF0SystemExclusive <em>Midi Var F0 System Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var F0 System Exclusive</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarF0SystemExclusive
	 * @generated
	 */
	EClass getMidiVarF0SystemExclusive();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarF2SngPosition <em>Midi Var F2 Sng Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var F2 Sng Position</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarF2SngPosition
	 * @generated
	 */
	EClass getMidiVarF2SngPosition();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarF3SongSelect <em>Midi Var F3 Song Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var F3 Song Select</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarF3SongSelect
	 * @generated
	 */
	EClass getMidiVarF3SongSelect();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarF5BusSelect <em>Midi Var F5 Bus Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var F5 Bus Select</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarF5BusSelect
	 * @generated
	 */
	EClass getMidiVarF5BusSelect();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarF6TuneRequest <em>Midi Var F6 Tune Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var F6 Tune Request</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarF6TuneRequest
	 * @generated
	 */
	EClass getMidiVarF6TuneRequest();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarF8TimingTick <em>Midi Var F8 Timing Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var F8 Timing Tick</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarF8TimingTick
	 * @generated
	 */
	EClass getMidiVarF8TimingTick();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarFAStartSong <em>Midi Var FA Start Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var FA Start Song</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarFAStartSong
	 * @generated
	 */
	EClass getMidiVarFAStartSong();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarFBContinueSong <em>Midi Var FB Continue Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var FB Continue Song</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarFBContinueSong
	 * @generated
	 */
	EClass getMidiVarFBContinueSong();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarFCStopSong <em>Midi Var FC Stop Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var FC Stop Song</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarFCStopSong
	 * @generated
	 */
	EClass getMidiVarFCStopSong();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarFEActiveSensing <em>Midi Var FE Active Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var FE Active Sensing</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarFEActiveSensing
	 * @generated
	 */
	EClass getMidiVarFEActiveSensing();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVarFFSystemReset <em>Midi Var FF System Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var FF System Reset</em>'.
	 * @see net.sf.smbt.jzmui.MidiVarFFSystemReset
	 * @generated
	 */
	EClass getMidiVarFFSystemReset();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.AbstractMidiVarNote <em>Abstract Midi Var Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Midi Var Note</em>'.
	 * @see net.sf.smbt.jzmui.AbstractMidiVarNote
	 * @generated
	 */
	EClass getAbstractMidiVarNote();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchFrom <em>Pitch From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch From</em>'.
	 * @see net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchFrom()
	 * @see #getAbstractMidiVarNote()
	 * @generated
	 */
	EAttribute getAbstractMidiVarNote_PitchFrom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchTo <em>Pitch To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch To</em>'.
	 * @see net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchTo()
	 * @see #getAbstractMidiVarNote()
	 * @generated
	 */
	EAttribute getAbstractMidiVarNote_PitchTo();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jzmui.MidiVar <em>Midi Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Var</em>'.
	 * @see net.sf.smbt.jzmui.MidiVar
	 * @generated
	 */
	EClass getMidiVar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.MidiVar#getScaleFrom <em>Scale From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale From</em>'.
	 * @see net.sf.smbt.jzmui.MidiVar#getScaleFrom()
	 * @see #getMidiVar()
	 * @generated
	 */
	EAttribute getMidiVar_ScaleFrom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.MidiVar#getScaleTo <em>Scale To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale To</em>'.
	 * @see net.sf.smbt.jzmui.MidiVar#getScaleTo()
	 * @see #getMidiVar()
	 * @generated
	 */
	EAttribute getMidiVar_ScaleTo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.MidiVar#getChannelFrom <em>Channel From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel From</em>'.
	 * @see net.sf.smbt.jzmui.MidiVar#getChannelFrom()
	 * @see #getMidiVar()
	 * @generated
	 */
	EAttribute getMidiVar_ChannelFrom();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jzmui.MidiVar#getChannelTo <em>Channel To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel To</em>'.
	 * @see net.sf.smbt.jzmui.MidiVar#getChannelTo()
	 * @see #getMidiVar()
	 * @generated
	 */
	EAttribute getMidiVar_ChannelTo();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.LemurTrigger <em>Lemur Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lemur Trigger</em>'.
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @generated
	 */
	EEnum getLemurTrigger();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.LemurPreferences <em>Lemur Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lemur Preferences</em>'.
	 * @see net.sf.smbt.jzmui.LemurPreferences
	 * @generated
	 */
	EEnum getLemurPreferences();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.LemurIncomingPorts <em>Lemur Incoming Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lemur Incoming Ports</em>'.
	 * @see net.sf.smbt.jzmui.LemurIncomingPorts
	 * @generated
	 */
	EEnum getLemurIncomingPorts();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.MIDI_MESSAGES <em>MIDI MESSAGES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MIDI MESSAGES</em>'.
	 * @see net.sf.smbt.jzmui.MIDI_MESSAGES
	 * @generated
	 */
	EEnum getMIDI_MESSAGES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.KNOB_STYLE <em>KNOB STYLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>KNOB STYLE</em>'.
	 * @see net.sf.smbt.jzmui.KNOB_STYLE
	 * @generated
	 */
	EEnum getKNOB_STYLE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.LEMUR_STYLE <em>LEMUR STYLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LEMUR STYLE</em>'.
	 * @see net.sf.smbt.jzmui.LEMUR_STYLE
	 * @generated
	 */
	EEnum getLEMUR_STYLE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.FONT_SIZE <em>FONT SIZE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FONT SIZE</em>'.
	 * @see net.sf.smbt.jzmui.FONT_SIZE
	 * @generated
	 */
	EEnum getFONT_SIZE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.TEXT_ALIGN <em>TEXT ALIGN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TEXT ALIGN</em>'.
	 * @see net.sf.smbt.jzmui.TEXT_ALIGN
	 * @generated
	 */
	EEnum getTEXT_ALIGN();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.JZML_MODE <em>JZML MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JZML MODE</em>'.
	 * @see net.sf.smbt.jzmui.JZML_MODE
	 * @generated
	 */
	EEnum getJZML_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.BREAK_POINT_PHYSICS <em>BREAK POINT PHYSICS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BREAK POINT PHYSICS</em>'.
	 * @see net.sf.smbt.jzmui.BREAK_POINT_PHYSICS
	 * @generated
	 */
	EEnum getBREAK_POINT_PHYSICS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.LEMUR_OSC_TARGET <em>LEMUR OSC TARGET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LEMUR OSC TARGET</em>'.
	 * @see net.sf.smbt.jzmui.LEMUR_OSC_TARGET
	 * @generated
	 */
	EEnum getLEMUR_OSC_TARGET();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.LEMUR_MIDI_TARGET <em>LEMUR MIDI TARGET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LEMUR MIDI TARGET</em>'.
	 * @see net.sf.smbt.jzmui.LEMUR_MIDI_TARGET
	 * @generated
	 */
	EEnum getLEMUR_MIDI_TARGET();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE <em>CUSTOM BUTTON MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CUSTOM BUTTON MODE</em>'.
	 * @see net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE
	 * @generated
	 */
	EEnum getCUSTOM_BUTTON_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.KNOB_CURSOR_MODE <em>KNOB CURSOR MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>KNOB CURSOR MODE</em>'.
	 * @see net.sf.smbt.jzmui.KNOB_CURSOR_MODE
	 * @generated
	 */
	EEnum getKNOB_CURSOR_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.KNOB_CONTROL <em>KNOB CONTROL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>KNOB CONTROL</em>'.
	 * @see net.sf.smbt.jzmui.KNOB_CONTROL
	 * @generated
	 */
	EEnum getKNOB_CONTROL();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.KNOB_PHYSICS <em>KNOB PHYSICS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>KNOB PHYSICS</em>'.
	 * @see net.sf.smbt.jzmui.KNOB_PHYSICS
	 * @generated
	 */
	EEnum getKNOB_PHYSICS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.FADER_CURSOR_MODE <em>FADER CURSOR MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FADER CURSOR MODE</em>'.
	 * @see net.sf.smbt.jzmui.FADER_CURSOR_MODE
	 * @generated
	 */
	EEnum getFADER_CURSOR_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.FADER_PHYSICS <em>FADER PHYSICS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FADER PHYSICS</em>'.
	 * @see net.sf.smbt.jzmui.FADER_PHYSICS
	 * @generated
	 */
	EEnum getFADER_PHYSICS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE <em>MULTIBALLS CURSOR MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MULTIBALLS CURSOR MODE</em>'.
	 * @see net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE
	 * @generated
	 */
	EEnum getMULTIBALLS_CURSOR_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.jzmui.MULTIBALLS_PHYSICS <em>MULTIBALLS PHYSICS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MULTIBALLS PHYSICS</em>'.
	 * @see net.sf.smbt.jzmui.MULTIBALLS_PHYSICS
	 * @generated
	 */
	EEnum getMULTIBALLS_PHYSICS();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	EDataType getPoint();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.PathData <em>Path Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Path Data</em>'.
	 * @see org.eclipse.swt.graphics.PathData
	 * @model instanceClass="org.eclipse.swt.graphics.PathData"
	 * @generated
	 */
	EDataType getPathData();

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
	JzmuiFactory getJzmuiFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.LemurLiveAppImpl <em>Lemur Live App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.LemurLiveAppImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurLiveApp()
		 * @generated
		 */
		EClass LEMUR_LIVE_APP = eINSTANCE.getLemurLiveApp();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEMUR_LIVE_APP__WIDTH = eINSTANCE.getLemurLiveApp_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEMUR_LIVE_APP__HEIGHT = eINSTANCE.getLemurLiveApp_Height();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEMUR_LIVE_APP__ID = eINSTANCE.getLemurLiveApp_Id();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEMUR_LIVE_APP__ELEMENTS = eINSTANCE.getLemurLiveApp_Elements();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEMUR_LIVE_APP__CONFIGURATIONS = eINSTANCE.getLemurLiveApp_Configurations();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.JZUIElem <em>JZUI Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.JZUIElem
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZUIElem()
		 * @generated
		 */
		EClass JZUI_ELEM = eINSTANCE.getJZUIElem();

		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZUI_ELEM__FONT_STYLE = eINSTANCE.getJZUIElem_FontStyle();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZUI_ELEM__BOUNDS = eINSTANCE.getJZUIElem_Bounds();

		/**
		 * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZUI_ELEM__FONT_NAME = eINSTANCE.getJZUIElem_FontName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZUI_ELEM__NAME = eINSTANCE.getJZUIElem_Name();

		/**
		 * The meta object literal for the '<em><b>Osc Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZUI_ELEM__OSC_PROPS = eINSTANCE.getJZUIElem_OscProps();

		/**
		 * The meta object literal for the '<em><b>Midi Props</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZUI_ELEM__MIDI_PROPS = eINSTANCE.getJZUIElem_MidiProps();

		/**
		 * The meta object literal for the '<em><b>Parent Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZUI_ELEM__PARENT_TARGET = eINSTANCE.getJZUIElem_ParentTarget();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZUI_ELEM__SCRIPTS = eINSTANCE.getJZUIElem_Scripts();

		/**
		 * The meta object literal for the '<em><b>Target Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZUI_ELEM__TARGET_FEATURES = eINSTANCE.getJZUIElem_TargetFeatures();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZContainerImpl <em>JZ Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZContainerImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZContainer()
		 * @generated
		 */
		EClass JZ_CONTAINER = eINSTANCE.getJZContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZ_CONTAINER__CHILDREN = eINSTANCE.getJZContainer_Children();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.JZWidget <em>JZ Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.JZWidget
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZWidget()
		 * @generated
		 */
		EClass JZ_WIDGET = eINSTANCE.getJZWidget();

		/**
		 * The meta object literal for the '<em><b>Primary Osc Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_WIDGET__PRIMARY_OSC_TARGET = eINSTANCE.getJZWidget_PrimaryOscTarget();

		/**
		 * The meta object literal for the '<em><b>Primary Midi Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_WIDGET__PRIMARY_MIDI_TARGET = eINSTANCE.getJZWidget_PrimaryMidiTarget();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl <em>JZ Break Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZBreakPointImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZBreakPoint()
		 * @generated
		 */
		EClass JZ_BREAK_POINT = eINSTANCE.getJZBreakPoint();

		/**
		 * The meta object literal for the '<em><b>Live Editing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__LIVE_EDITING = eINSTANCE.getJZBreakPoint_LiveEditing();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__POINTS = eINSTANCE.getJZBreakPoint_Points();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__COORDINATES = eINSTANCE.getJZBreakPoint_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__BACKGROUND = eINSTANCE.getJZBreakPoint_Background();

		/**
		 * The meta object literal for the '<em><b>First Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__FIRST_POINT = eINSTANCE.getJZBreakPoint_FirstPoint();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__LIGHT = eINSTANCE.getJZBreakPoint_Light();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__FRICTION = eINSTANCE.getJZBreakPoint_Friction();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__HOLD = eINSTANCE.getJZBreakPoint_Hold();

		/**
		 * The meta object literal for the '<em><b>Hold X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__HOLD_X = eINSTANCE.getJZBreakPoint_HoldX();

		/**
		 * The meta object literal for the '<em><b>Hold Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__HOLD_Y = eINSTANCE.getJZBreakPoint_HoldY();

		/**
		 * The meta object literal for the '<em><b>Attraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__ATTRACTION = eINSTANCE.getJZBreakPoint_Attraction();

		/**
		 * The meta object literal for the '<em><b>Edit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__EDIT = eINSTANCE.getJZBreakPoint_Edit();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__REST = eINSTANCE.getJZBreakPoint_Rest();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__SPEED = eINSTANCE.getJZBreakPoint_Speed();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__VALUES = eINSTANCE.getJZBreakPoint_Values();

		/**
		 * The meta object literal for the '<em><b>Path Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__PATH_DATA = eINSTANCE.getJZBreakPoint_PathData();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__GRID = eINSTANCE.getJZBreakPoint_Grid();

		/**
		 * The meta object literal for the '<em><b>Grid X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__GRID_X = eINSTANCE.getJZBreakPoint_GridX();

		/**
		 * The meta object literal for the '<em><b>Grid Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__GRID_Y = eINSTANCE.getJZBreakPoint_GridY();

		/**
		 * The meta object literal for the '<em><b>Free Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__FREE_FORM = eINSTANCE.getJZBreakPoint_FreeForm();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__PHYSICS = eINSTANCE.getJZBreakPoint_Physics();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__COLOR = eINSTANCE.getJZBreakPoint_Color();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__X = eINSTANCE.getJZBreakPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_BREAK_POINT__Y = eINSTANCE.getJZBreakPoint_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZFaderImpl <em>JZ Fader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZFaderImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZFader()
		 * @generated
		 */
		EClass JZ_FADER = eINSTANCE.getJZFader();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__VALUE = eINSTANCE.getJZFader_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__UNIT = eINSTANCE.getJZFader_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__PRECISION = eINSTANCE.getJZFader_Precision();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__COLOR = eINSTANCE.getJZFader_Color();

		/**
		 * The meta object literal for the '<em><b>Drag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__DRAG = eINSTANCE.getJZFader_Drag();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__FRICTION = eINSTANCE.getJZFader_Friction();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__HEIGHT = eINSTANCE.getJZFader_Height();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__LIGHT = eINSTANCE.getJZFader_Light();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__TENSION = eINSTANCE.getJZFader_Tension();

		/**
		 * The meta object literal for the '<em><b>Value Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__VALUE_ACTIVE = eINSTANCE.getJZFader_ValueActive();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__LABEL = eINSTANCE.getJZFader_Label();

		/**
		 * The meta object literal for the '<em><b>Grid Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__GRID_ACTIVE = eINSTANCE.getJZFader_GridActive();

		/**
		 * The meta object literal for the '<em><b>Grid Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__GRID_VALUE = eINSTANCE.getJZFader_GridValue();

		/**
		 * The meta object literal for the '<em><b>Attraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__ATTRACTION = eINSTANCE.getJZFader_Attraction();

		/**
		 * The meta object literal for the '<em><b>Cursor Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__CURSOR_MODE = eINSTANCE.getJZFader_CursorMode();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__PHYSICS = eINSTANCE.getJZFader_Physics();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__SPEED = eINSTANCE.getJZFader_Speed();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__CAPTURE = eINSTANCE.getJZFader_Capture();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__X = eINSTANCE.getJZFader_X();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_FADER__Z = eINSTANCE.getJZFader_Z();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZGestureImpl <em>JZ Gesture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZGestureImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZGesture()
		 * @generated
		 */
		EClass JZ_GESTURE = eINSTANCE.getJZGesture();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_GESTURE__TRANSPARENT = eINSTANCE.getJZGesture_Transparent();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_GESTURE__COLOR = eINSTANCE.getJZGesture_Color();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_GESTURE__ANGLE = eINSTANCE.getJZGesture_Angle();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_GESTURE__PAN = eINSTANCE.getJZGesture_Pan();

		/**
		 * The meta object literal for the '<em><b>Pinch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_GESTURE__PINCH = eINSTANCE.getJZGesture_Pinch();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZKnobImpl <em>JZ Knob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZKnobImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZKnob()
		 * @generated
		 */
		EClass JZ_KNOB = eINSTANCE.getJZKnob();

		/**
		 * The meta object literal for the '<em><b>Endless Knob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__ENDLESS_KNOB = eINSTANCE.getJZKnob_EndlessKnob();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__VALUE = eINSTANCE.getJZKnob_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__UNIT = eINSTANCE.getJZKnob_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__PRECISION = eINSTANCE.getJZKnob_Precision();

		/**
		 * The meta object literal for the '<em><b>Backgroud</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__BACKGROUD = eINSTANCE.getJZKnob_Backgroud();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__FOREGROUND = eINSTANCE.getJZKnob_Foreground();

		/**
		 * The meta object literal for the '<em><b>Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__ATTACK = eINSTANCE.getJZKnob_Attack();

		/**
		 * The meta object literal for the '<em><b>Sustain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__SUSTAIN = eINSTANCE.getJZKnob_Sustain();

		/**
		 * The meta object literal for the '<em><b>Decay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__DECAY = eINSTANCE.getJZKnob_Decay();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__RELEASE = eINSTANCE.getJZKnob_Release();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__HOLD = eINSTANCE.getJZKnob_Hold();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__LABEL = eINSTANCE.getJZKnob_Label();

		/**
		 * The meta object literal for the '<em><b>Value Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__VALUE_ACTIVE = eINSTANCE.getJZKnob_ValueActive();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__GRID = eINSTANCE.getJZKnob_Grid();

		/**
		 * The meta object literal for the '<em><b>Cursor Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__CURSOR_MODE = eINSTANCE.getJZKnob_CursorMode();

		/**
		 * The meta object literal for the '<em><b>Control Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__CONTROL_MODE = eINSTANCE.getJZKnob_ControlMode();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__PHYSICS = eINSTANCE.getJZKnob_Physics();

		/**
		 * The meta object literal for the '<em><b>Attraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__ATTRACTION = eINSTANCE.getJZKnob_Attraction();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__FRICTION = eINSTANCE.getJZKnob_Friction();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__SPEED = eINSTANCE.getJZKnob_Speed();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_KNOB__X = eINSTANCE.getJZKnob_X();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZLedImpl <em>JZ Led</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZLedImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZLed()
		 * @generated
		 */
		EClass JZ_LED = eINSTANCE.getJZLed();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__TRANSPARENT = eINSTANCE.getJZLed_Transparent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__VALUE = eINSTANCE.getJZLed_Value();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__COLUMNS = eINSTANCE.getJZLed_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__ROWS = eINSTANCE.getJZLed_Rows();

		/**
		 * The meta object literal for the '<em><b>Multicolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__MULTICOLOR = eINSTANCE.getJZLed_Multicolor();

		/**
		 * The meta object literal for the '<em><b>Bargraph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__BARGRAPH = eINSTANCE.getJZLed_Bargraph();

		/**
		 * The meta object literal for the '<em><b>Color Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__COLOR_OFF = eINSTANCE.getJZLed_ColorOff();

		/**
		 * The meta object literal for the '<em><b>Color On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__COLOR_ON = eINSTANCE.getJZLed_ColorOn();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__LIGHT = eINSTANCE.getJZLed_Light();

		/**
		 * The meta object literal for the '<em><b>Label Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LED__LABEL_ACTIVE = eINSTANCE.getJZLed_LabelActive();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZLemurMenuImpl <em>JZ Lemur Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZLemurMenuImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZLemurMenu()
		 * @generated
		 */
		EClass JZ_LEMUR_MENU = eINSTANCE.getJZLemurMenu();

		/**
		 * The meta object literal for the '<em><b>Scale Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MENU__SCALE_OUTPUT = eINSTANCE.getJZLemurMenu_ScaleOutput();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MENU__TRANSPARENT = eINSTANCE.getJZLemurMenu_Transparent();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MENU__FONT = eINSTANCE.getJZLemurMenu_Font();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MENU__COLOR = eINSTANCE.getJZLemurMenu_Color();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZ_LEMUR_MENU__ITEMS = eINSTANCE.getJZLemurMenu_Items();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MENU__SELECTION = eINSTANCE.getJZLemurMenu_Selection();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZLemurMonitorImpl <em>JZ Lemur Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZLemurMonitorImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZLemurMonitor()
		 * @generated
		 */
		EClass JZ_LEMUR_MONITOR = eINSTANCE.getJZLemurMonitor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MONITOR__VALUE = eINSTANCE.getJZLemurMonitor_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MONITOR__UNIT = eINSTANCE.getJZLemurMonitor_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MONITOR__PRECISION = eINSTANCE.getJZLemurMonitor_Precision();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MONITOR__FONT = eINSTANCE.getJZLemurMonitor_Font();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MONITOR__TRANSPARENT = eINSTANCE.getJZLemurMonitor_Transparent();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_LEMUR_MONITOR__COLOR = eINSTANCE.getJZLemurMonitor_Color();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZPadsImpl <em>JZ Pads</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZPadsImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZPads()
		 * @generated
		 */
		EClass JZ_PADS = eINSTANCE.getJZPads();

		/**
		 * The meta object literal for the '<em><b>Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__NUMBERS = eINSTANCE.getJZPads_Numbers();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__COLUMNS = eINSTANCE.getJZPads_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__ROWS = eINSTANCE.getJZPads_Rows();

		/**
		 * The meta object literal for the '<em><b>Multilabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__MULTILABEL = eINSTANCE.getJZPads_Multilabel();

		/**
		 * The meta object literal for the '<em><b>Multicolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__MULTICOLOR = eINSTANCE.getJZPads_Multicolor();

		/**
		 * The meta object literal for the '<em><b>Color On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__COLOR_ON = eINSTANCE.getJZPads_ColorOn();

		/**
		 * The meta object literal for the '<em><b>Color Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__COLOR_OFF = eINSTANCE.getJZPads_ColorOff();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__VALUES = eINSTANCE.getJZPads_Values();

		/**
		 * The meta object literal for the '<em><b>Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__ATTACK = eINSTANCE.getJZPads_Attack();

		/**
		 * The meta object literal for the '<em><b>Decay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__DECAY = eINSTANCE.getJZPads_Decay();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__HOLD = eINSTANCE.getJZPads_Hold();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__LIGHT = eINSTANCE.getJZPads_Light();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__RELEASE = eINSTANCE.getJZPads_Release();

		/**
		 * The meta object literal for the '<em><b>Sustain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__SUSTAIN = eINSTANCE.getJZPads_Sustain();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__COLOR = eINSTANCE.getJZPads_Color();

		/**
		 * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__LABEL_VISIBLE = eINSTANCE.getJZPads_LabelVisible();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__CAPTURE = eINSTANCE.getJZPads_Capture();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__X = eINSTANCE.getJZPads_X();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__FRICTION = eINSTANCE.getJZPads_Friction();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__HEIGHT = eINSTANCE.getJZPads_Height();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_PADS__TENSION = eINSTANCE.getJZPads_Tension();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl <em>JZ Surface LCD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZSurfaceLCD()
		 * @generated
		 */
		EClass JZ_SURFACE_LCD = eINSTANCE.getJZSurfaceLCD();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SURFACE_LCD__TRANSPARENT = eINSTANCE.getJZSurfaceLCD_Transparent();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SURFACE_LCD__TARGET = eINSTANCE.getJZSurfaceLCD_Target();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SURFACE_LCD__DISPLAY = eINSTANCE.getJZSurfaceLCD_Display();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SURFACE_LCD__FONT = eINSTANCE.getJZSurfaceLCD_Font();

		/**
		 * The meta object literal for the '<em><b>Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SURFACE_LCD__TOP = eINSTANCE.getJZSurfaceLCD_Top();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SURFACE_LCD__BOTTOM = eINSTANCE.getJZSurfaceLCD_Bottom();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl <em>JZ Switches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZSwitchesImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZSwitches()
		 * @generated
		 */
		EClass JZ_SWITCHES = eINSTANCE.getJZSwitches();

		/**
		 * The meta object literal for the '<em><b>Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__NUMBERS = eINSTANCE.getJZSwitches_Numbers();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__RADIO = eINSTANCE.getJZSwitches_Radio();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__COLUMNS = eINSTANCE.getJZSwitches_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__ROWS = eINSTANCE.getJZSwitches_Rows();

		/**
		 * The meta object literal for the '<em><b>Multilabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__MULTILABEL = eINSTANCE.getJZSwitches_Multilabel();

		/**
		 * The meta object literal for the '<em><b>Multicolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__MULTICOLOR = eINSTANCE.getJZSwitches_Multicolor();

		/**
		 * The meta object literal for the '<em><b>Color On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__COLOR_ON = eINSTANCE.getJZSwitches_ColorOn();

		/**
		 * The meta object literal for the '<em><b>Color Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__COLOR_OFF = eINSTANCE.getJZSwitches_ColorOff();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__LIGHT = eINSTANCE.getJZSwitches_Light();

		/**
		 * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__LABEL_VISIBLE = eINSTANCE.getJZSwitches_LabelVisible();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__CAPTURE = eINSTANCE.getJZSwitches_Capture();

		/**
		 * The meta object literal for the '<em><b>Paint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__PAINT = eINSTANCE.getJZSwitches_Paint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SWITCHES__X = eINSTANCE.getJZSwitches_X();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZTextImpl <em>JZ Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZTextImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZText()
		 * @generated
		 */
		EClass JZ_TEXT = eINSTANCE.getJZText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TEXT__TEXT = eINSTANCE.getJZText_Text();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TEXT__FONT = eINSTANCE.getJZText_Font();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TEXT__TRANSPARENT = eINSTANCE.getJZText_Transparent();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TEXT__COLOR = eINSTANCE.getJZText_Color();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TEXT__LIGHT = eINSTANCE.getJZText_Light();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TEXT__FONT_SIZE = eINSTANCE.getJZText_FontSize();

		/**
		 * The meta object literal for the '<em><b>Font Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TEXT__FONT_ALIGN = eINSTANCE.getJZText_FontAlign();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZCustomButtonImpl <em>JZ Custom Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZCustomButtonImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZCustomButton()
		 * @generated
		 */
		EClass JZ_CUSTOM_BUTTON = eINSTANCE.getJZCustomButton();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__OUTLINE = eINSTANCE.getJZCustomButton_Outline();

		/**
		 * The meta object literal for the '<em><b>Style Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__STYLE_OFF = eINSTANCE.getJZCustomButton_StyleOff();

		/**
		 * The meta object literal for the '<em><b>Style On Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__STYLE_ON_TEXT = eINSTANCE.getJZCustomButton_StyleOnText();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__FONT_SIZE = eINSTANCE.getJZCustomButton_FontSize();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__CAPTURE = eINSTANCE.getJZCustomButton_Capture();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__MODE = eINSTANCE.getJZCustomButton_Mode();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__X = eINSTANCE.getJZCustomButton_X();

		/**
		 * The meta object literal for the '<em><b>Style On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__STYLE_ON = eINSTANCE.getJZCustomButton_StyleOn();

		/**
		 * The meta object literal for the '<em><b>Color Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__COLOR_OFF = eINSTANCE.getJZCustomButton_ColorOff();

		/**
		 * The meta object literal for the '<em><b>Color On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__COLOR_ON = eINSTANCE.getJZCustomButton_ColorOn();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__LIGHT = eINSTANCE.getJZCustomButton_Light();

		/**
		 * The meta object literal for the '<em><b>Style Off Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__STYLE_OFF_TEXT = eINSTANCE.getJZCustomButton_StyleOffText();

		/**
		 * The meta object literal for the '<em><b>Text Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_CUSTOM_BUTTON__TEXT_ALIGN = eINSTANCE.getJZCustomButton_TextAlign();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZSignalScopeImpl <em>JZ Signal Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZSignalScopeImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZSignalScope()
		 * @generated
		 */
		EClass JZ_SIGNAL_SCOPE = eINSTANCE.getJZSignalScope();

		/**
		 * The meta object literal for the '<em><b>Mode XY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__MODE_XY = eINSTANCE.getJZSignalScope_ModeXY();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__TRANSPARENT = eINSTANCE.getJZSignalScope_Transparent();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__COLOR = eINSTANCE.getJZSignalScope_Color();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__DATA = eINSTANCE.getJZSignalScope_Data();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__FRICTION = eINSTANCE.getJZSignalScope_Friction();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__HEIGHT = eINSTANCE.getJZSignalScope_Height();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__LIGHT = eINSTANCE.getJZSignalScope_Light();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__TENSION = eINSTANCE.getJZSignalScope_Tension();

		/**
		 * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__LABEL_VISIBLE = eINSTANCE.getJZSignalScope_LabelVisible();

		/**
		 * The meta object literal for the '<em><b>Xb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__XB = eINSTANCE.getJZSignalScope_Xb();

		/**
		 * The meta object literal for the '<em><b>Yb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__YB = eINSTANCE.getJZSignalScope_Yb();

		/**
		 * The meta object literal for the '<em><b>Timebase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__TIMEBASE = eINSTANCE.getJZSignalScope_Timebase();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__X = eINSTANCE.getJZSignalScope_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_SIGNAL_SCOPE__Y = eINSTANCE.getJZSignalScope_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZRangeImpl <em>JZ Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZRangeImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZRange()
		 * @generated
		 */
		EClass JZ_RANGE = eINSTANCE.getJZRange();

		/**
		 * The meta object literal for the '<em><b>Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__HORIZONTAL = eINSTANCE.getJZRange_Horizontal();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__COLOR = eINSTANCE.getJZRange_Color();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__LIGHT = eINSTANCE.getJZRange_Light();

		/**
		 * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__LABEL_VISIBLE = eINSTANCE.getJZRange_LabelVisible();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__CAPTURE = eINSTANCE.getJZRange_Capture();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__GRID = eINSTANCE.getJZRange_Grid();

		/**
		 * The meta object literal for the '<em><b>Grid Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__GRID_VALUE = eINSTANCE.getJZRange_GridValue();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__PHYSICS = eINSTANCE.getJZRange_Physics();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__TENSION = eINSTANCE.getJZRange_Tension();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__FRICTION = eINSTANCE.getJZRange_Friction();

		/**
		 * The meta object literal for the '<em><b>Min height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__MIN_HEIGHT = eINSTANCE.getJZRange_Min_height();

		/**
		 * The meta object literal for the '<em><b>Max height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__MAX_HEIGHT = eINSTANCE.getJZRange_Max_height();

		/**
		 * The meta object literal for the '<em><b>Drag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__DRAG = eINSTANCE.getJZRange_Drag();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__X = eINSTANCE.getJZRange_X();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RANGE__HEIGHT = eINSTANCE.getJZRange_Height();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl <em>JZ Multi Balls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZMultiBallsImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZMultiBalls()
		 * @generated
		 */
		EClass JZ_MULTI_BALLS = eINSTANCE.getJZMultiBalls();

		/**
		 * The meta object literal for the '<em><b>Numbers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__NUMBERS = eINSTANCE.getJZMultiBalls_Numbers();

		/**
		 * The meta object literal for the '<em><b>Multilabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__MULTILABEL = eINSTANCE.getJZMultiBalls_Multilabel();

		/**
		 * The meta object literal for the '<em><b>Multi Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__MULTI_COLOR = eINSTANCE.getJZMultiBalls_MultiColor();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__DATA = eINSTANCE.getJZMultiBalls_Data();

		/**
		 * The meta object literal for the '<em><b>Numbers Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__NUMBERS_VISIBLE = eINSTANCE.getJZMultiBalls_NumbersVisible();

		/**
		 * The meta object literal for the '<em><b>Balls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__BALLS = eINSTANCE.getJZMultiBalls_Balls();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__COLOR = eINSTANCE.getJZMultiBalls_Color();

		/**
		 * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__LABEL_VISIBLE = eINSTANCE.getJZMultiBalls_LabelVisible();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__PHYSICS = eINSTANCE.getJZMultiBalls_Physics();

		/**
		 * The meta object literal for the '<em><b>Cursor Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__CURSOR_MODE = eINSTANCE.getJZMultiBalls_CursorMode();

		/**
		 * The meta object literal for the '<em><b>Attraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__ATTRACTION = eINSTANCE.getJZMultiBalls_Attraction();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__CAPTURE = eINSTANCE.getJZMultiBalls_Capture();

		/**
		 * The meta object literal for the '<em><b>Grid Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__GRID_ACTIVE = eINSTANCE.getJZMultiBalls_GridActive();

		/**
		 * The meta object literal for the '<em><b>Ephemeral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__EPHEMERAL = eINSTANCE.getJZMultiBalls_Ephemeral();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__X = eINSTANCE.getJZMultiBalls_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__Y = eINSTANCE.getJZMultiBalls_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__Z = eINSTANCE.getJZMultiBalls_Z();

		/**
		 * The meta object literal for the '<em><b>Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__ATTACK = eINSTANCE.getJZMultiBalls_Attack();

		/**
		 * The meta object literal for the '<em><b>Decay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__DECAY = eINSTANCE.getJZMultiBalls_Decay();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__FRICTION = eINSTANCE.getJZMultiBalls_Friction();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__HOLD = eINSTANCE.getJZMultiBalls_Hold();

		/**
		 * The meta object literal for the '<em><b>Hold X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__HOLD_X = eINSTANCE.getJZMultiBalls_HoldX();

		/**
		 * The meta object literal for the '<em><b>Hold Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__HOLD_Y = eINSTANCE.getJZMultiBalls_HoldY();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__RELEASE = eINSTANCE.getJZMultiBalls_Release();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__SPEED = eINSTANCE.getJZMultiBalls_Speed();

		/**
		 * The meta object literal for the '<em><b>Sustain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__SUSTAIN = eINSTANCE.getJZMultiBalls_Sustain();

		/**
		 * The meta object literal for the '<em><b>Grid Step X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__GRID_STEP_X = eINSTANCE.getJZMultiBalls_GridStepX();

		/**
		 * The meta object literal for the '<em><b>Grid Step Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__GRID_STEP_Y = eINSTANCE.getJZMultiBalls_GridStepY();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__HEIGHT = eINSTANCE.getJZMultiBalls_Height();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__LIGHT = eINSTANCE.getJZMultiBalls_Light();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MULTI_BALLS__TENSION = eINSTANCE.getJZMultiBalls_Tension();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZTrackImpl <em>JZ Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZTrackImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZTrack()
		 * @generated
		 */
		EClass JZ_TRACK = eINSTANCE.getJZTrack();

		/**
		 * The meta object literal for the '<em><b>Mode XY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TRACK__MODE_XY = eINSTANCE.getJZTrack_ModeXY();

		/**
		 * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TRACK__TRANSPARENT = eINSTANCE.getJZTrack_Transparent();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TRACK__COLOR = eINSTANCE.getJZTrack_Color();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZmultiSliderImpl <em>JZmulti Slider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZmultiSliderImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZmultiSlider()
		 * @generated
		 */
		EClass JZMULTI_SLIDER = eINSTANCE.getJZmultiSlider();

		/**
		 * The meta object literal for the '<em><b>Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__HORIZONTAL = eINSTANCE.getJZmultiSlider_Horizontal();

		/**
		 * The meta object literal for the '<em><b>Bipolar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__BIPOLAR = eINSTANCE.getJZmultiSlider_Bipolar();

		/**
		 * The meta object literal for the '<em><b>Slider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__SLIDER = eINSTANCE.getJZmultiSlider_Slider();

		/**
		 * The meta object literal for the '<em><b>Gradient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__GRADIENT = eINSTANCE.getJZmultiSlider_Gradient();

		/**
		 * The meta object literal for the '<em><b>Multicolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__MULTICOLOR = eINSTANCE.getJZmultiSlider_Multicolor();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__LIGHT = eINSTANCE.getJZmultiSlider_Light();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__VALUES = eINSTANCE.getJZmultiSlider_Values();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__FRICTION = eINSTANCE.getJZmultiSlider_Friction();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__TENSION = eINSTANCE.getJZmultiSlider_Tension();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__HEIGHT = eINSTANCE.getJZmultiSlider_Height();

		/**
		 * The meta object literal for the '<em><b>Label Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__LABEL_VISIBLE = eINSTANCE.getJZmultiSlider_LabelVisible();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__COLOR = eINSTANCE.getJZmultiSlider_Color();

		/**
		 * The meta object literal for the '<em><b>Physics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__PHYSICS = eINSTANCE.getJZmultiSlider_Physics();

		/**
		 * The meta object literal for the '<em><b>Grid Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__GRID_ACTIVE = eINSTANCE.getJZmultiSlider_GridActive();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__CAPTURE = eINSTANCE.getJZmultiSlider_Capture();

		/**
		 * The meta object literal for the '<em><b>Grid Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__GRID_VALUE = eINSTANCE.getJZmultiSlider_GridValue();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZMULTI_SLIDER__X = eINSTANCE.getJZmultiSlider_X();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZMenuItemImpl <em>JZ Menu Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZMenuItemImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZMenuItem()
		 * @generated
		 */
		EClass JZ_MENU_ITEM = eINSTANCE.getJZMenuItem();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MENU_ITEM__LABEL = eINSTANCE.getJZMenuItem_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl <em>JZ Ring Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZRingAreaImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZRingArea()
		 * @generated
		 */
		EClass JZ_RING_AREA = eINSTANCE.getJZRingArea();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__SPEED = eINSTANCE.getJZRingArea_Speed();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__FRICTION = eINSTANCE.getJZRingArea_Friction();

		/**
		 * The meta object literal for the '<em><b>Attraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__ATTRACTION = eINSTANCE.getJZRingArea_Attraction();

		/**
		 * The meta object literal for the '<em><b>Attraction x</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__ATTRACTION_X = eINSTANCE.getJZRingArea_Attraction_x();

		/**
		 * The meta object literal for the '<em><b>Attraction y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__ATTRACTION_Y = eINSTANCE.getJZRingArea_Attraction_y();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__COLOR = eINSTANCE.getJZRingArea_Color();

		/**
		 * The meta object literal for the '<em><b>Value Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__VALUE_ACTIVE = eINSTANCE.getJZRingArea_ValueActive();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__CAPTURE = eINSTANCE.getJZRingArea_Capture();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__X = eINSTANCE.getJZRingArea_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_RING_AREA__Y = eINSTANCE.getJZRingArea_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl <em>OSC Dyna Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getOSCDynaProperties()
		 * @generated
		 */
		EClass OSC_DYNA_PROPERTIES = eINSTANCE.getOSCDynaProperties();

		/**
		 * The meta object literal for the '<em><b>Custom Osc Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSC_DYNA_PROPERTIES__CUSTOM_OSC_MSG = eINSTANCE.getOSCDynaProperties_CustomOscMsg();

		/**
		 * The meta object literal for the '<em><b>Lemur Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSC_DYNA_PROPERTIES__LEMUR_TRIGGER = eINSTANCE.getOSCDynaProperties_LemurTrigger();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSC_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE = eINSTANCE.getOSCDynaProperties_EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Osc Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSC_DYNA_PROPERTIES__OSC_MSG = eINSTANCE.getOSCDynaProperties_OscMsg();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSC_DYNA_PROPERTIES__TARGET = eINSTANCE.getOSCDynaProperties_Target();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl <em>Midi Dyna Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiDynaProperties()
		 * @generated
		 */
		EClass MIDI_DYNA_PROPERTIES = eINSTANCE.getMidiDynaProperties();

		/**
		 * The meta object literal for the '<em><b>Custom Midi Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_DYNA_PROPERTIES__CUSTOM_MIDI_MSG = eINSTANCE.getMidiDynaProperties_CustomMidiMsg();

		/**
		 * The meta object literal for the '<em><b>Lemur Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_DYNA_PROPERTIES__LEMUR_TRIGGER = eINSTANCE.getMidiDynaProperties_LemurTrigger();

		/**
		 * The meta object literal for the '<em><b>Midi Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDI_DYNA_PROPERTIES__MIDI_MSG = eINSTANCE.getMidiDynaProperties_MidiMsg();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDI_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE = eINSTANCE.getMidiDynaProperties_EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_DYNA_PROPERTIES__TARGET = eINSTANCE.getMidiDynaProperties_Target();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl <em>DMX Dyna Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getDMXDynaProperties()
		 * @generated
		 */
		EClass DMX_DYNA_PROPERTIES = eINSTANCE.getDMXDynaProperties();

		/**
		 * The meta object literal for the '<em><b>Dmx Msg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_DYNA_PROPERTIES__DMX_MSG = eINSTANCE.getDMXDynaProperties_DmxMsg();

		/**
		 * The meta object literal for the '<em><b>EStructural Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE = eINSTANCE.getDMXDynaProperties_EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Custom Dmx Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_DYNA_PROPERTIES__CUSTOM_DMX_MSG = eINSTANCE.getDMXDynaProperties_CustomDmxMsg();

		/**
		 * The meta object literal for the '<em><b>Lemur Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_DYNA_PROPERTIES__LEMUR_TRIGGER = eINSTANCE.getDMXDynaProperties_LemurTrigger();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_DYNA_PROPERTIES__TARGET = eINSTANCE.getDMXDynaProperties_Target();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl <em>JZ Jazz Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZJazzInterfaceImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZJazzInterface()
		 * @generated
		 */
		EClass JZ_JAZZ_INTERFACE = eINSTANCE.getJZJazzInterface();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_JAZZ_INTERFACE__WIDTH = eINSTANCE.getJZJazzInterface_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_JAZZ_INTERFACE__HEIGHT = eINSTANCE.getJZJazzInterface_Height();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_JAZZ_INTERFACE__MODE = eINSTANCE.getJZJazzInterface_Mode();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_JAZZ_INTERFACE__ORIENTATION = eINSTANCE.getJZJazzInterface_Orientation();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZTargetImpl <em>JZ Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZTargetImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZTarget()
		 * @generated
		 */
		EClass JZ_TARGET = eINSTANCE.getJZTarget();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TARGET__ADDR = eINSTANCE.getJZTarget_Addr();

		/**
		 * The meta object literal for the '<em><b>Incoming Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TARGET__INCOMING_PORTS = eINSTANCE.getJZTarget_IncomingPorts();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_TARGET__ID = eINSTANCE.getJZTarget_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JzOscTargetImpl <em>Jz Osc Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JzOscTargetImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzOscTarget()
		 * @generated
		 */
		EClass JZ_OSC_TARGET = eINSTANCE.getJzOscTarget();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JzMidiTargetImpl <em>Jz Midi Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JzMidiTargetImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzMidiTarget()
		 * @generated
		 */
		EClass JZ_MIDI_TARGET = eINSTANCE.getJzMidiTarget();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JzKBTargetImpl <em>Jz KB Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JzKBTargetImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzKBTarget()
		 * @generated
		 */
		EClass JZ_KB_TARGET = eINSTANCE.getJzKBTarget();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.KBDynaPropertiesImpl <em>KB Dyna Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.KBDynaPropertiesImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKBDynaProperties()
		 * @generated
		 */
		EClass KB_DYNA_PROPERTIES = eINSTANCE.getKBDynaProperties();

		/**
		 * The meta object literal for the '<em><b>Lemur Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KB_DYNA_PROPERTIES__LEMUR_TRIGGER = eINSTANCE.getKBDynaProperties_LemurTrigger();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KB_DYNA_PROPERTIES__TARGET = eINSTANCE.getKBDynaProperties_Target();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZConfigurationManagerImpl <em>JZ Configuration Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZConfigurationManagerImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZConfigurationManager()
		 * @generated
		 */
		EClass JZ_CONFIGURATION_MANAGER = eINSTANCE.getJZConfigurationManager();

		/**
		 * The meta object literal for the '<em><b>Kb Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZ_CONFIGURATION_MANAGER__KB_TARGETS = eINSTANCE.getJZConfigurationManager_KbTargets();

		/**
		 * The meta object literal for the '<em><b>Osc Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZ_CONFIGURATION_MANAGER__OSC_TARGETS = eINSTANCE.getJZConfigurationManager_OscTargets();

		/**
		 * The meta object literal for the '<em><b>Midi Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZ_CONFIGURATION_MANAGER__MIDI_TARGETS = eINSTANCE.getJZConfigurationManager_MidiTargets();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JzOscVarImpl <em>Jz Osc Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JzOscVarImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzOscVar()
		 * @generated
		 */
		EClass JZ_OSC_VAR = eINSTANCE.getJzOscVar();

		/**
		 * The meta object literal for the '<em><b>Custom Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_OSC_VAR__CUSTOM_ADDRESS = eINSTANCE.getJzOscVar_CustomAddress();

		/**
		 * The meta object literal for the '<em><b>Custom Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_OSC_VAR__CUSTOM_MSG = eINSTANCE.getJzOscVar_CustomMsg();

		/**
		 * The meta object literal for the '<em><b>Osc Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_OSC_VAR__OSC_TARGET = eINSTANCE.getJzOscVar_OscTarget();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JZVarImpl <em>JZ Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JZVarImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZVar()
		 * @generated
		 */
		EClass JZ_VAR = eINSTANCE.getJZVar();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZ_VAR__ATTRIBUTE = eINSTANCE.getJZVar_Attribute();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_VAR__TRIGGER = eINSTANCE.getJZVar_Trigger();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.JzMidiVarImpl <em>Jz Midi Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.JzMidiVarImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJzMidiVar()
		 * @generated
		 */
		EClass JZ_MIDI_VAR = eINSTANCE.getJzMidiVar();

		/**
		 * The meta object literal for the '<em><b>Midi Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MIDI_VAR__MIDI_MESSAGE = eINSTANCE.getJzMidiVar_MidiMessage();

		/**
		 * The meta object literal for the '<em><b>Midi Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JZ_MIDI_VAR__MIDI_TARGET = eINSTANCE.getJzMidiVar_MidiTarget();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.ScriptImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__EXPR = eINSTANCE.getScript_Expr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVar80NoteOffImpl <em>Midi Var80 Note Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVar80NoteOffImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVar80NoteOff()
		 * @generated
		 */
		EClass MIDI_VAR80_NOTE_OFF = eINSTANCE.getMidiVar80NoteOff();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVar90NoteOnImpl <em>Midi Var90 Note On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVar90NoteOnImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVar90NoteOn()
		 * @generated
		 */
		EClass MIDI_VAR90_NOTE_ON = eINSTANCE.getMidiVar90NoteOn();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarA0KeyPressureImpl <em>Midi Var A0 Key Pressure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarA0KeyPressureImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarA0KeyPressure()
		 * @generated
		 */
		EClass MIDI_VAR_A0_KEY_PRESSURE = eINSTANCE.getMidiVarA0KeyPressure();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarB0ControlChangeImpl <em>Midi Var B0 Control Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarB0ControlChangeImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarB0ControlChange()
		 * @generated
		 */
		EClass MIDI_VAR_B0_CONTROL_CHANGE = eINSTANCE.getMidiVarB0ControlChange();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarC0ProgramChangeImpl <em>Midi Var C0 Program Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarC0ProgramChangeImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarC0ProgramChange()
		 * @generated
		 */
		EClass MIDI_VAR_C0_PROGRAM_CHANGE = eINSTANCE.getMidiVarC0ProgramChange();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarD0ChannelPressureImpl <em>Midi Var D0 Channel Pressure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarD0ChannelPressureImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarD0ChannelPressure()
		 * @generated
		 */
		EClass MIDI_VAR_D0_CHANNEL_PRESSURE = eINSTANCE.getMidiVarD0ChannelPressure();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarE0PitchBendImpl <em>Midi Var E0 Pitch Bend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarE0PitchBendImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarE0PitchBend()
		 * @generated
		 */
		EClass MIDI_VAR_E0_PITCH_BEND = eINSTANCE.getMidiVarE0PitchBend();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarF0SystemExclusiveImpl <em>Midi Var F0 System Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarF0SystemExclusiveImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF0SystemExclusive()
		 * @generated
		 */
		EClass MIDI_VAR_F0_SYSTEM_EXCLUSIVE = eINSTANCE.getMidiVarF0SystemExclusive();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarF2SngPositionImpl <em>Midi Var F2 Sng Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarF2SngPositionImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF2SngPosition()
		 * @generated
		 */
		EClass MIDI_VAR_F2_SNG_POSITION = eINSTANCE.getMidiVarF2SngPosition();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarF3SongSelectImpl <em>Midi Var F3 Song Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarF3SongSelectImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF3SongSelect()
		 * @generated
		 */
		EClass MIDI_VAR_F3_SONG_SELECT = eINSTANCE.getMidiVarF3SongSelect();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarF5BusSelectImpl <em>Midi Var F5 Bus Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarF5BusSelectImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF5BusSelect()
		 * @generated
		 */
		EClass MIDI_VAR_F5_BUS_SELECT = eINSTANCE.getMidiVarF5BusSelect();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarF6TuneRequestImpl <em>Midi Var F6 Tune Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarF6TuneRequestImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF6TuneRequest()
		 * @generated
		 */
		EClass MIDI_VAR_F6_TUNE_REQUEST = eINSTANCE.getMidiVarF6TuneRequest();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarF8TimingTickImpl <em>Midi Var F8 Timing Tick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarF8TimingTickImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarF8TimingTick()
		 * @generated
		 */
		EClass MIDI_VAR_F8_TIMING_TICK = eINSTANCE.getMidiVarF8TimingTick();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarFAStartSongImpl <em>Midi Var FA Start Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarFAStartSongImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFAStartSong()
		 * @generated
		 */
		EClass MIDI_VAR_FA_START_SONG = eINSTANCE.getMidiVarFAStartSong();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarFBContinueSongImpl <em>Midi Var FB Continue Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarFBContinueSongImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFBContinueSong()
		 * @generated
		 */
		EClass MIDI_VAR_FB_CONTINUE_SONG = eINSTANCE.getMidiVarFBContinueSong();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarFCStopSongImpl <em>Midi Var FC Stop Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarFCStopSongImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFCStopSong()
		 * @generated
		 */
		EClass MIDI_VAR_FC_STOP_SONG = eINSTANCE.getMidiVarFCStopSong();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarFEActiveSensingImpl <em>Midi Var FE Active Sensing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarFEActiveSensingImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFEActiveSensing()
		 * @generated
		 */
		EClass MIDI_VAR_FE_ACTIVE_SENSING = eINSTANCE.getMidiVarFEActiveSensing();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarFFSystemResetImpl <em>Midi Var FF System Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarFFSystemResetImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVarFFSystemReset()
		 * @generated
		 */
		EClass MIDI_VAR_FF_SYSTEM_RESET = eINSTANCE.getMidiVarFFSystemReset();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.AbstractMidiVarNoteImpl <em>Abstract Midi Var Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.AbstractMidiVarNoteImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getAbstractMidiVarNote()
		 * @generated
		 */
		EClass ABSTRACT_MIDI_VAR_NOTE = eINSTANCE.getAbstractMidiVarNote();

		/**
		 * The meta object literal for the '<em><b>Pitch From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIDI_VAR_NOTE__PITCH_FROM = eINSTANCE.getAbstractMidiVarNote_PitchFrom();

		/**
		 * The meta object literal for the '<em><b>Pitch To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIDI_VAR_NOTE__PITCH_TO = eINSTANCE.getAbstractMidiVarNote_PitchTo();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.impl.MidiVarImpl <em>Midi Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.impl.MidiVarImpl
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMidiVar()
		 * @generated
		 */
		EClass MIDI_VAR = eINSTANCE.getMidiVar();

		/**
		 * The meta object literal for the '<em><b>Scale From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_VAR__SCALE_FROM = eINSTANCE.getMidiVar_ScaleFrom();

		/**
		 * The meta object literal for the '<em><b>Scale To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_VAR__SCALE_TO = eINSTANCE.getMidiVar_ScaleTo();

		/**
		 * The meta object literal for the '<em><b>Channel From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_VAR__CHANNEL_FROM = eINSTANCE.getMidiVar_ChannelFrom();

		/**
		 * The meta object literal for the '<em><b>Channel To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI_VAR__CHANNEL_TO = eINSTANCE.getMidiVar_ChannelTo();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.LemurTrigger <em>Lemur Trigger</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.LemurTrigger
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurTrigger()
		 * @generated
		 */
		EEnum LEMUR_TRIGGER = eINSTANCE.getLemurTrigger();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.LemurPreferences <em>Lemur Preferences</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.LemurPreferences
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurPreferences()
		 * @generated
		 */
		EEnum LEMUR_PREFERENCES = eINSTANCE.getLemurPreferences();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.LemurIncomingPorts <em>Lemur Incoming Ports</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.LemurIncomingPorts
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLemurIncomingPorts()
		 * @generated
		 */
		EEnum LEMUR_INCOMING_PORTS = eINSTANCE.getLemurIncomingPorts();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.MIDI_MESSAGES <em>MIDI MESSAGES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.MIDI_MESSAGES
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMIDI_MESSAGES()
		 * @generated
		 */
		EEnum MIDI_MESSAGES = eINSTANCE.getMIDI_MESSAGES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.KNOB_STYLE <em>KNOB STYLE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.KNOB_STYLE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_STYLE()
		 * @generated
		 */
		EEnum KNOB_STYLE = eINSTANCE.getKNOB_STYLE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.LEMUR_STYLE <em>LEMUR STYLE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.LEMUR_STYLE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLEMUR_STYLE()
		 * @generated
		 */
		EEnum LEMUR_STYLE = eINSTANCE.getLEMUR_STYLE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.FONT_SIZE <em>FONT SIZE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.FONT_SIZE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getFONT_SIZE()
		 * @generated
		 */
		EEnum FONT_SIZE = eINSTANCE.getFONT_SIZE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.TEXT_ALIGN <em>TEXT ALIGN</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.TEXT_ALIGN
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getTEXT_ALIGN()
		 * @generated
		 */
		EEnum TEXT_ALIGN = eINSTANCE.getTEXT_ALIGN();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.JZML_MODE <em>JZML MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.JZML_MODE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getJZML_MODE()
		 * @generated
		 */
		EEnum JZML_MODE = eINSTANCE.getJZML_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.BREAK_POINT_PHYSICS <em>BREAK POINT PHYSICS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.BREAK_POINT_PHYSICS
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getBREAK_POINT_PHYSICS()
		 * @generated
		 */
		EEnum BREAK_POINT_PHYSICS = eINSTANCE.getBREAK_POINT_PHYSICS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.LEMUR_OSC_TARGET <em>LEMUR OSC TARGET</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.LEMUR_OSC_TARGET
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLEMUR_OSC_TARGET()
		 * @generated
		 */
		EEnum LEMUR_OSC_TARGET = eINSTANCE.getLEMUR_OSC_TARGET();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.LEMUR_MIDI_TARGET <em>LEMUR MIDI TARGET</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.LEMUR_MIDI_TARGET
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getLEMUR_MIDI_TARGET()
		 * @generated
		 */
		EEnum LEMUR_MIDI_TARGET = eINSTANCE.getLEMUR_MIDI_TARGET();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE <em>CUSTOM BUTTON MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getCUSTOM_BUTTON_MODE()
		 * @generated
		 */
		EEnum CUSTOM_BUTTON_MODE = eINSTANCE.getCUSTOM_BUTTON_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.KNOB_CURSOR_MODE <em>KNOB CURSOR MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.KNOB_CURSOR_MODE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_CURSOR_MODE()
		 * @generated
		 */
		EEnum KNOB_CURSOR_MODE = eINSTANCE.getKNOB_CURSOR_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.KNOB_CONTROL <em>KNOB CONTROL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.KNOB_CONTROL
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_CONTROL()
		 * @generated
		 */
		EEnum KNOB_CONTROL = eINSTANCE.getKNOB_CONTROL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.KNOB_PHYSICS <em>KNOB PHYSICS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.KNOB_PHYSICS
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getKNOB_PHYSICS()
		 * @generated
		 */
		EEnum KNOB_PHYSICS = eINSTANCE.getKNOB_PHYSICS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.FADER_CURSOR_MODE <em>FADER CURSOR MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.FADER_CURSOR_MODE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getFADER_CURSOR_MODE()
		 * @generated
		 */
		EEnum FADER_CURSOR_MODE = eINSTANCE.getFADER_CURSOR_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.FADER_PHYSICS <em>FADER PHYSICS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.FADER_PHYSICS
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getFADER_PHYSICS()
		 * @generated
		 */
		EEnum FADER_PHYSICS = eINSTANCE.getFADER_PHYSICS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE <em>MULTIBALLS CURSOR MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMULTIBALLS_CURSOR_MODE()
		 * @generated
		 */
		EEnum MULTIBALLS_CURSOR_MODE = eINSTANCE.getMULTIBALLS_CURSOR_MODE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jzmui.MULTIBALLS_PHYSICS <em>MULTIBALLS PHYSICS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jzmui.MULTIBALLS_PHYSICS
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getMULTIBALLS_PHYSICS()
		 * @generated
		 */
		EEnum MULTIBALLS_PHYSICS = eINSTANCE.getMULTIBALLS_PHYSICS();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Path Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.PathData
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getPathData()
		 * @generated
		 */
		EDataType PATH_DATA = eINSTANCE.getPathData();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see net.sf.smbt.jzmui.impl.JzmuiPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

	}

} //JzmuiPackage
