/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlFactory
 * @model kind="package"
 * @generated
 */
public interface JzmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jzml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///net.sf.smbt.jazzmutant/model/jzml.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jzml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JzmlPackage eINSTANCE = net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.JZMLImpl <em>JZML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JZMLImpl
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getJZML()
	 * @generated
	 */
	int JZML = 0;

	/**
	 * The feature id for the '<em><b>PROJECT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZML__PROJECT = 0;

	/**
	 * The feature id for the '<em><b>WINDOW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZML__WINDOW = 1;

	/**
	 * The number of structural features of the '<em>JZML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JZML_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl <em>PARAM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getPARAM()
	 * @generated
	 */
	int PARAM = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__ID = 1;

	/**
	 * The feature id for the '<em><b>Kbmouse Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__KBMOUSE_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Kbmouse Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__KBMOUSE_SCALE = 3;

	/**
	 * The feature id for the '<em><b>Kbmouse Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__KBMOUSE_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Kbmouse Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__KBMOUSE_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__LABEL = 6;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__META = 7;

	/**
	 * The feature id for the '<em><b>Midi Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__MIDI_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Midi Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__MIDI_SCALE = 9;

	/**
	 * The feature id for the '<em><b>Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__MIDI_TARGET = 10;

	/**
	 * The feature id for the '<em><b>Midi Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__MIDI_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__NAME = 12;

	/**
	 * The feature id for the '<em><b>Osc Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__OSC_MESSAGE = 13;

	/**
	 * The feature id for the '<em><b>Osc Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__OSC_SCALE = 14;

	/**
	 * The feature id for the '<em><b>Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__OSC_TARGET = 15;

	/**
	 * The feature id for the '<em><b>Osc Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__OSC_TRIGGER = 16;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__SEND = 17;

	/**
	 * The feature id for the '<em><b>Tabbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__TABBAR = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM__VALUE = 19;

	/**
	 * The number of structural features of the '<em>PARAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl <em>PROJECT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getPROJECT()
	 * @generated
	 */
	int PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = 1;

	/**
	 * The feature id for the '<em><b>Kbmouse Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KBMOUSE_TARGET = 2;

	/**
	 * The feature id for the '<em><b>Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MIDI_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 4;

	/**
	 * The feature id for the '<em><b>Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OSC_TARGET = 5;

	/**
	 * The feature id for the '<em><b>Startpage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STARTPAGE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VERSION = 8;

	/**
	 * The feature id for the '<em><b>Welcometext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WELCOMETEXT = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WIDTH = 10;

	/**
	 * The number of structural features of the '<em>PROJECT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.TOPImpl <em>TOP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.TOPImpl
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getTOP()
	 * @generated
	 */
	int TOP = 3;

	/**
	 * The feature id for the '<em><b>JZML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP__JZML = 0;

	/**
	 * The number of structural features of the '<em>TOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.VARIABLEImpl <em>VARIABLE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.VARIABLEImpl
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getVARIABLE()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = 1;

	/**
	 * The feature id for the '<em><b>Kbmouse Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__KBMOUSE_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Kbmouse Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__KBMOUSE_SCALE = 3;

	/**
	 * The feature id for the '<em><b>Kbmouse Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__KBMOUSE_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Kbmouse Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__KBMOUSE_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LABEL = 6;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__META = 7;

	/**
	 * The feature id for the '<em><b>Midi Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MIDI_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Midi Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MIDI_SCALE = 9;

	/**
	 * The feature id for the '<em><b>Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MIDI_TARGET = 10;

	/**
	 * The feature id for the '<em><b>Midi Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MIDI_TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 12;

	/**
	 * The feature id for the '<em><b>Osc Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OSC_MESSAGE = 13;

	/**
	 * The feature id for the '<em><b>Osc Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OSC_SCALE = 14;

	/**
	 * The feature id for the '<em><b>Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OSC_TARGET = 15;

	/**
	 * The feature id for the '<em><b>Osc Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OSC_TRIGGER = 16;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SEND = 17;

	/**
	 * The feature id for the '<em><b>Tabbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TABBAR = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 19;

	/**
	 * The number of structural features of the '<em>VARIABLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl <em>WINDOW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl
	 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getWINDOW()
	 * @generated
	 */
	int WINDOW = 5;

	/**
	 * The feature id for the '<em><b>WINDOW</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WINDOW = 0;

	/**
	 * The feature id for the '<em><b>PARAM</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PARAM = 1;

	/**
	 * The feature id for the '<em><b>VARIABLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Acceleration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ACCELERATION = 3;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ANGLE = 4;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ATTACK = 5;

	/**
	 * The feature id for the '<em><b>Attraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ATTRACTION = 6;

	/**
	 * The feature id for the '<em><b>Attraction X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ATTRACTION_X = 7;

	/**
	 * The feature id for the '<em><b>Attraction Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ATTRACTION_Y = 8;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__AXIS = 9;

	/**
	 * The feature id for the '<em><b>Balls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BALLS = 10;

	/**
	 * The feature id for the '<em><b>Bargraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BARGRAPH = 11;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BEHAVIOR = 12;

	/**
	 * The feature id for the '<em><b>Bipolar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BIPOLAR = 13;

	/**
	 * The feature id for the '<em><b>Bitmap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BITMAP = 14;

	/**
	 * The feature id for the '<em><b>Boundaries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__BOUNDARIES = 15;

	/**
	 * The feature id for the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CAPTURE = 16;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CLASS = 17;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__COLOR = 18;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__COLUMN = 19;

	/**
	 * The feature id for the '<em><b>Constrained</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CONSTRAINED = 20;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CONTENT = 21;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__COORDINATES = 22;

	/**
	 * The feature id for the '<em><b>Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__CURSOR = 23;

	/**
	 * The feature id for the '<em><b>Decay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__DECAY = 24;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__DISPLAY = 25;

	/**
	 * The feature id for the '<em><b>Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__EDIT = 26;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__EDITABLE = 27;

	/**
	 * The feature id for the '<em><b>Ephemere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__EPHEMERE = 28;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__FONT = 29;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__FREE = 30;

	/**
	 * The feature id for the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__FRICTION = 31;

	/**
	 * The feature id for the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__GRADIENT = 32;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__GRID = 33;

	/**
	 * The feature id for the '<em><b>Grid Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__GRID_STEPS = 34;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__GROUP = 35;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HEIGHT = 36;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HOLD = 37;

	/**
	 * The feature id for the '<em><b>Hold X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HOLD_X = 38;

	/**
	 * The feature id for the '<em><b>Hold Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HOLD_Y = 39;

	/**
	 * The feature id for the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HORIZONTAL = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ID = 41;

	/**
	 * The feature id for the '<em><b>Kbmouse Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__KBMOUSE_TARGET = 42;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__LABEL = 43;

	/**
	 * The feature id for the '<em><b>Label Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__LABEL_OFF = 44;

	/**
	 * The feature id for the '<em><b>Label On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__LABEL_ON = 45;

	/**
	 * The feature id for the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__LIGHT = 46;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__META = 47;

	/**
	 * The feature id for the '<em><b>Midi Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MIDI_TARGET = 48;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MODE = 49;

	/**
	 * The feature id for the '<em><b>Multicolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MULTICOLOR = 50;

	/**
	 * The feature id for the '<em><b>Multilabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__MULTILABEL = 51;

	/**
	 * The feature id for the '<em><b>Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NBR = 52;

	/**
	 * The feature id for the '<em><b>Osc Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__OSC_TARGET = 53;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__OUTLINE = 54;

	/**
	 * The feature id for the '<em><b>Paint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PAINT = 55;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PAN = 56;

	/**
	 * The feature id for the '<em><b>Physic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PHYSIC = 57;

	/**
	 * The feature id for the '<em><b>Pinch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PINCH = 58;

	/**
	 * The feature id for the '<em><b>Polyphony</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__POLYPHONY = 59;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__PRECISION = 60;

	/**
	 * The feature id for the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__RADIO = 61;

	/**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__RELEASE = 62;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__REST = 63;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ROW = 64;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SCALE = 65;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SEND = 66;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SPEED = 67;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__STATE = 68;

	/**
	 * The feature id for the '<em><b>Sustain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__SUSTAIN = 69;

	/**
	 * The feature id for the '<em><b>Tabbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TABBAR = 70;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TARGET = 71;

	/**
	 * The feature id for the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TENSION = 72;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__TEXT = 73;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__UNIT = 74;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__VALUE = 75;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WIDTH = 76;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__X = 77;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__Y = 78;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__Z = 79;

	/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ZOOM = 80;

	/**
	 * The number of structural features of the '<em>WINDOW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = 81;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jazzmutant.model.jzml.JZML <em>JZML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JZML</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.JZML
	 * @generated
	 */
	EClass getJZML();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.jazzmutant.model.jzml.JZML#getPROJECT <em>PROJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PROJECT</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.JZML#getPROJECT()
	 * @see #getJZML()
	 * @generated
	 */
	EReference getJZML_PROJECT();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jazzmutant.model.jzml.JZML#getWINDOW <em>WINDOW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WINDOW</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.JZML#getWINDOW()
	 * @see #getJZML()
	 * @generated
	 */
	EReference getJZML_WINDOW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM <em>PARAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PARAM</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM
	 * @generated
	 */
	EClass getPARAM();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getName()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getValue()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getSend()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Send();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscTarget <em>Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscTarget()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_OscTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscTrigger <em>Osc Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Trigger</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscTrigger()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_OscTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscMessage <em>Osc Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Message</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscMessage()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_OscMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscScale <em>Osc Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Scale</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getOscScale()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_OscScale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiTarget <em>Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiTarget()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_MidiTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiTrigger <em>Midi Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Trigger</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiTrigger()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_MidiTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiMessage <em>Midi Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Message</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiMessage()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_MidiMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiScale <em>Midi Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Scale</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getMidiScale()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_MidiScale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseTarget <em>Kbmouse Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseTarget()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_KbmouseTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseTrigger <em>Kbmouse Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Trigger</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseTrigger()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_KbmouseTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseMessage <em>Kbmouse Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Message</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseMessage()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_KbmouseMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseScale <em>Kbmouse Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Scale</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getKbmouseScale()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_KbmouseScale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getColor()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getLabel()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getTabbar <em>Tabbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabbar</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getTabbar()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Tabbar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getMeta()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Meta();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PARAM#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PARAM#getId()
	 * @see #getPARAM()
	 * @generated
	 */
	EAttribute getPARAM_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT <em>PROJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROJECT</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT
	 * @generated
	 */
	EClass getPROJECT();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getHeight()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getVersion()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getOscTarget <em>Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getOscTarget()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_OscTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getMidiTarget <em>Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getMidiTarget()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_MidiTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getKbmouseTarget <em>Kbmouse Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getKbmouseTarget()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_KbmouseTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getStartpage <em>Startpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startpage</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getStartpage()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Startpage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getName()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWelcometext <em>Welcometext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Welcometext</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWelcometext()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Welcometext();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getWidth()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getTitle()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.PROJECT#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.PROJECT#getId()
	 * @see #getPROJECT()
	 * @generated
	 */
	EAttribute getPROJECT_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jazzmutant.model.jzml.TOP <em>TOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.TOP
	 * @generated
	 */
	EClass getTOP();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.jazzmutant.model.jzml.TOP#getJZML <em>JZML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>JZML</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.TOP#getJZML()
	 * @see #getTOP()
	 * @generated
	 */
	EReference getTOP_JZML();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE <em>VARIABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VARIABLE</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE
	 * @generated
	 */
	EClass getVARIABLE();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getName()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getValue()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getSend()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Send();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTarget <em>Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTarget()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_OscTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTrigger <em>Osc Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Trigger</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscTrigger()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_OscTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscMessage <em>Osc Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Message</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscMessage()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_OscMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscScale <em>Osc Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Scale</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getOscScale()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_OscScale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTarget <em>Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTarget()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_MidiTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTrigger <em>Midi Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Trigger</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiTrigger()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_MidiTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiMessage <em>Midi Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Message</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiMessage()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_MidiMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiScale <em>Midi Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Scale</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMidiScale()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_MidiScale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTarget <em>Kbmouse Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTarget()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_KbmouseTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTrigger <em>Kbmouse Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Trigger</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseTrigger()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_KbmouseTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseMessage <em>Kbmouse Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Message</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseMessage()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_KbmouseMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseScale <em>Kbmouse Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Scale</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getKbmouseScale()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_KbmouseScale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getColor()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getLabel()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getTabbar <em>Tabbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabbar</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getTabbar()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Tabbar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getMeta()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Meta();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.VARIABLE#getId()
	 * @see #getVARIABLE()
	 * @generated
	 */
	EAttribute getVARIABLE_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW <em>WINDOW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WINDOW</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW
	 * @generated
	 */
	EClass getWINDOW();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getClass_()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Class();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getText()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getUnit()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Unit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getValue()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getX()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getY()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getZ()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Z();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getWidth()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHeight()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHold()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Hold();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHoldX <em>Hold X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold X</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHoldX()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_HoldX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHoldY <em>Hold Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hold Y</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHoldY()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_HoldY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHorizontal <em>Horizontal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getHorizontal()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Horizontal();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getState()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_State();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getSustain <em>Sustain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sustain</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getSustain()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Sustain();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGroup()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Group();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getFont()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Font();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getSend()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Send();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getSpeed()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getOscTarget <em>Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getOscTarget()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_OscTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getOutline()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPaint <em>Paint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paint</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPaint()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Paint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPan()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Pan();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMidiTarget <em>Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Midi Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMidiTarget()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_MidiTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMode()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMulticolor <em>Multicolor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multicolor</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMulticolor()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Multicolor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMultilabel <em>Multilabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multilabel</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMultilabel()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Multilabel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getKbmouseTarget <em>Kbmouse Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kbmouse Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getKbmouseTarget()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_KbmouseTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getColor()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getColumn()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Column();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getConstrained <em>Constrained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constrained</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getConstrained()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Constrained();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getContent()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Content();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLabel()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLabelOff <em>Label Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Off</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLabelOff()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_LabelOff();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLabelOn <em>Label On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label On</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLabelOn()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_LabelOn();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLight <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getLight()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Light();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getTabbar <em>Tabbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabbar</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getTabbar()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Tabbar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getTarget()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Target();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getTension <em>Tension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tension</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getTension()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Tension();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getMeta()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Meta();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getCoordinates()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Coordinates();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getCursor <em>Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cursor</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getCursor()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Cursor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getDecay <em>Decay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decay</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getDecay()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Decay();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getDisplay()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Display();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getEdit <em>Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getEdit()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Edit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getEditable()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Editable();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getEphemere <em>Ephemere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ephemere</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getEphemere()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Ephemere();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getFree()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Free();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getFriction <em>Friction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Friction</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getFriction()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Friction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGradient <em>Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gradient</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGradient()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Gradient();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGrid()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Grid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGridSteps <em>Grid Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Steps</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getGridSteps()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_GridSteps();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getNbr <em>Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getNbr()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Nbr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPhysic <em>Physic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physic</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPhysic()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Physic();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPinch <em>Pinch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pinch</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPinch()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Pinch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPolyphony <em>Polyphony</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polyphony</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPolyphony()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Polyphony();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPrecision()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Precision();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRadio <em>Radio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radio</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRadio()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Radio();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRelease()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Release();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rest</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRest()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Rest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getRow()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Row();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getScale()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Scale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getZoom()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Zoom();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getWINDOW <em>WINDOW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WINDOW</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getWINDOW()
	 * @see #getWINDOW()
	 * @generated
	 */
	EReference getWINDOW_WINDOW();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPARAM <em>PARAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>PARAM</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getPARAM()
	 * @see #getWINDOW()
	 * @generated
	 */
	EReference getWINDOW_PARAM();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getVARIABLE <em>VARIABLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VARIABLE</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getVARIABLE()
	 * @see #getWINDOW()
	 * @generated
	 */
	EReference getWINDOW_VARIABLE();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAcceleration <em>Acceleration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acceleration</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAcceleration()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Acceleration();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAngle()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Angle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttack()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Attack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttraction <em>Attraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttraction()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Attraction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttractionX <em>Attraction X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction X</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttractionX()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_AttractionX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttractionY <em>Attraction Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attraction Y</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAttractionY()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_AttractionY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getAxis()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Axis();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBalls <em>Balls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balls</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBalls()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Balls();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBargraph <em>Bargraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bargraph</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBargraph()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Bargraph();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBehavior()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBipolar <em>Bipolar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bipolar</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBipolar()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Bipolar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBitmap <em>Bitmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bitmap</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBitmap()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Bitmap();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBoundaries <em>Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundaries</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getBoundaries()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Boundaries();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getCapture <em>Capture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capture</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getCapture()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Capture();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.jazzmutant.model.jzml.WINDOW#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.jazzmutant.model.jzml.WINDOW#getId()
	 * @see #getWINDOW()
	 * @generated
	 */
	EAttribute getWINDOW_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JzmlFactory getJzmlFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.JZMLImpl <em>JZML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JZMLImpl
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getJZML()
		 * @generated
		 */
		EClass JZML = eINSTANCE.getJZML();

		/**
		 * The meta object literal for the '<em><b>PROJECT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZML__PROJECT = eINSTANCE.getJZML_PROJECT();

		/**
		 * The meta object literal for the '<em><b>WINDOW</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JZML__WINDOW = eINSTANCE.getJZML_WINDOW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl <em>PARAM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getPARAM()
		 * @generated
		 */
		EClass PARAM = eINSTANCE.getPARAM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__NAME = eINSTANCE.getPARAM_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__VALUE = eINSTANCE.getPARAM_Value();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__SEND = eINSTANCE.getPARAM_Send();

		/**
		 * The meta object literal for the '<em><b>Osc Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__OSC_TARGET = eINSTANCE.getPARAM_OscTarget();

		/**
		 * The meta object literal for the '<em><b>Osc Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__OSC_TRIGGER = eINSTANCE.getPARAM_OscTrigger();

		/**
		 * The meta object literal for the '<em><b>Osc Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__OSC_MESSAGE = eINSTANCE.getPARAM_OscMessage();

		/**
		 * The meta object literal for the '<em><b>Osc Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__OSC_SCALE = eINSTANCE.getPARAM_OscScale();

		/**
		 * The meta object literal for the '<em><b>Midi Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__MIDI_TARGET = eINSTANCE.getPARAM_MidiTarget();

		/**
		 * The meta object literal for the '<em><b>Midi Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__MIDI_TRIGGER = eINSTANCE.getPARAM_MidiTrigger();

		/**
		 * The meta object literal for the '<em><b>Midi Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__MIDI_MESSAGE = eINSTANCE.getPARAM_MidiMessage();

		/**
		 * The meta object literal for the '<em><b>Midi Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__MIDI_SCALE = eINSTANCE.getPARAM_MidiScale();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__KBMOUSE_TARGET = eINSTANCE.getPARAM_KbmouseTarget();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__KBMOUSE_TRIGGER = eINSTANCE.getPARAM_KbmouseTrigger();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__KBMOUSE_MESSAGE = eINSTANCE.getPARAM_KbmouseMessage();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__KBMOUSE_SCALE = eINSTANCE.getPARAM_KbmouseScale();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__COLOR = eINSTANCE.getPARAM_Color();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__LABEL = eINSTANCE.getPARAM_Label();

		/**
		 * The meta object literal for the '<em><b>Tabbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__TABBAR = eINSTANCE.getPARAM_Tabbar();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__META = eINSTANCE.getPARAM_Meta();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM__ID = eINSTANCE.getPARAM_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl <em>PROJECT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getPROJECT()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getPROJECT();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__HEIGHT = eINSTANCE.getPROJECT_Height();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VERSION = eINSTANCE.getPROJECT_Version();

		/**
		 * The meta object literal for the '<em><b>Osc Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__OSC_TARGET = eINSTANCE.getPROJECT_OscTarget();

		/**
		 * The meta object literal for the '<em><b>Midi Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MIDI_TARGET = eINSTANCE.getPROJECT_MidiTarget();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__KBMOUSE_TARGET = eINSTANCE.getPROJECT_KbmouseTarget();

		/**
		 * The meta object literal for the '<em><b>Startpage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__STARTPAGE = eINSTANCE.getPROJECT_Startpage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getPROJECT_Name();

		/**
		 * The meta object literal for the '<em><b>Welcometext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__WELCOMETEXT = eINSTANCE.getPROJECT_Welcometext();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__WIDTH = eINSTANCE.getPROJECT_Width();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TITLE = eINSTANCE.getPROJECT_Title();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID = eINSTANCE.getPROJECT_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.TOPImpl <em>TOP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.TOPImpl
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getTOP()
		 * @generated
		 */
		EClass TOP = eINSTANCE.getTOP();

		/**
		 * The meta object literal for the '<em><b>JZML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP__JZML = eINSTANCE.getTOP_JZML();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.VARIABLEImpl <em>VARIABLE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.VARIABLEImpl
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getVARIABLE()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVARIABLE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVARIABLE_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVARIABLE_Value();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SEND = eINSTANCE.getVARIABLE_Send();

		/**
		 * The meta object literal for the '<em><b>Osc Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__OSC_TARGET = eINSTANCE.getVARIABLE_OscTarget();

		/**
		 * The meta object literal for the '<em><b>Osc Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__OSC_TRIGGER = eINSTANCE.getVARIABLE_OscTrigger();

		/**
		 * The meta object literal for the '<em><b>Osc Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__OSC_MESSAGE = eINSTANCE.getVARIABLE_OscMessage();

		/**
		 * The meta object literal for the '<em><b>Osc Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__OSC_SCALE = eINSTANCE.getVARIABLE_OscScale();

		/**
		 * The meta object literal for the '<em><b>Midi Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MIDI_TARGET = eINSTANCE.getVARIABLE_MidiTarget();

		/**
		 * The meta object literal for the '<em><b>Midi Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MIDI_TRIGGER = eINSTANCE.getVARIABLE_MidiTrigger();

		/**
		 * The meta object literal for the '<em><b>Midi Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MIDI_MESSAGE = eINSTANCE.getVARIABLE_MidiMessage();

		/**
		 * The meta object literal for the '<em><b>Midi Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MIDI_SCALE = eINSTANCE.getVARIABLE_MidiScale();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__KBMOUSE_TARGET = eINSTANCE.getVARIABLE_KbmouseTarget();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__KBMOUSE_TRIGGER = eINSTANCE.getVARIABLE_KbmouseTrigger();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__KBMOUSE_MESSAGE = eINSTANCE.getVARIABLE_KbmouseMessage();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__KBMOUSE_SCALE = eINSTANCE.getVARIABLE_KbmouseScale();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__COLOR = eINSTANCE.getVARIABLE_Color();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LABEL = eINSTANCE.getVARIABLE_Label();

		/**
		 * The meta object literal for the '<em><b>Tabbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TABBAR = eINSTANCE.getVARIABLE_Tabbar();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__META = eINSTANCE.getVARIABLE_Meta();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ID = eINSTANCE.getVARIABLE_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl <em>WINDOW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl
		 * @see net.sf.smbt.jazzmutant.model.jzml.impl.JzmlPackageImpl#getWINDOW()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWINDOW();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CLASS = eINSTANCE.getWINDOW_Class();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TEXT = eINSTANCE.getWINDOW_Text();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__UNIT = eINSTANCE.getWINDOW_Unit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__VALUE = eINSTANCE.getWINDOW_Value();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__X = eINSTANCE.getWINDOW_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__Y = eINSTANCE.getWINDOW_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__Z = eINSTANCE.getWINDOW_Z();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__WIDTH = eINSTANCE.getWINDOW_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__HEIGHT = eINSTANCE.getWINDOW_Height();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__HOLD = eINSTANCE.getWINDOW_Hold();

		/**
		 * The meta object literal for the '<em><b>Hold X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__HOLD_X = eINSTANCE.getWINDOW_HoldX();

		/**
		 * The meta object literal for the '<em><b>Hold Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__HOLD_Y = eINSTANCE.getWINDOW_HoldY();

		/**
		 * The meta object literal for the '<em><b>Horizontal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__HORIZONTAL = eINSTANCE.getWINDOW_Horizontal();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__STATE = eINSTANCE.getWINDOW_State();

		/**
		 * The meta object literal for the '<em><b>Sustain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__SUSTAIN = eINSTANCE.getWINDOW_Sustain();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__GROUP = eINSTANCE.getWINDOW_Group();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__FONT = eINSTANCE.getWINDOW_Font();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__SEND = eINSTANCE.getWINDOW_Send();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__SPEED = eINSTANCE.getWINDOW_Speed();

		/**
		 * The meta object literal for the '<em><b>Osc Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__OSC_TARGET = eINSTANCE.getWINDOW_OscTarget();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__OUTLINE = eINSTANCE.getWINDOW_Outline();

		/**
		 * The meta object literal for the '<em><b>Paint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__PAINT = eINSTANCE.getWINDOW_Paint();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__PAN = eINSTANCE.getWINDOW_Pan();

		/**
		 * The meta object literal for the '<em><b>Midi Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MIDI_TARGET = eINSTANCE.getWINDOW_MidiTarget();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MODE = eINSTANCE.getWINDOW_Mode();

		/**
		 * The meta object literal for the '<em><b>Multicolor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MULTICOLOR = eINSTANCE.getWINDOW_Multicolor();

		/**
		 * The meta object literal for the '<em><b>Multilabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__MULTILABEL = eINSTANCE.getWINDOW_Multilabel();

		/**
		 * The meta object literal for the '<em><b>Kbmouse Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__KBMOUSE_TARGET = eINSTANCE.getWINDOW_KbmouseTarget();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__COLOR = eINSTANCE.getWINDOW_Color();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__COLUMN = eINSTANCE.getWINDOW_Column();

		/**
		 * The meta object literal for the '<em><b>Constrained</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CONSTRAINED = eINSTANCE.getWINDOW_Constrained();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CONTENT = eINSTANCE.getWINDOW_Content();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__LABEL = eINSTANCE.getWINDOW_Label();

		/**
		 * The meta object literal for the '<em><b>Label Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__LABEL_OFF = eINSTANCE.getWINDOW_LabelOff();

		/**
		 * The meta object literal for the '<em><b>Label On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__LABEL_ON = eINSTANCE.getWINDOW_LabelOn();

		/**
		 * The meta object literal for the '<em><b>Light</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__LIGHT = eINSTANCE.getWINDOW_Light();

		/**
		 * The meta object literal for the '<em><b>Tabbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TABBAR = eINSTANCE.getWINDOW_Tabbar();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TARGET = eINSTANCE.getWINDOW_Target();

		/**
		 * The meta object literal for the '<em><b>Tension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__TENSION = eINSTANCE.getWINDOW_Tension();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__META = eINSTANCE.getWINDOW_Meta();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__COORDINATES = eINSTANCE.getWINDOW_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CURSOR = eINSTANCE.getWINDOW_Cursor();

		/**
		 * The meta object literal for the '<em><b>Decay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__DECAY = eINSTANCE.getWINDOW_Decay();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__DISPLAY = eINSTANCE.getWINDOW_Display();

		/**
		 * The meta object literal for the '<em><b>Edit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__EDIT = eINSTANCE.getWINDOW_Edit();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__EDITABLE = eINSTANCE.getWINDOW_Editable();

		/**
		 * The meta object literal for the '<em><b>Ephemere</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__EPHEMERE = eINSTANCE.getWINDOW_Ephemere();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__FREE = eINSTANCE.getWINDOW_Free();

		/**
		 * The meta object literal for the '<em><b>Friction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__FRICTION = eINSTANCE.getWINDOW_Friction();

		/**
		 * The meta object literal for the '<em><b>Gradient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__GRADIENT = eINSTANCE.getWINDOW_Gradient();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__GRID = eINSTANCE.getWINDOW_Grid();

		/**
		 * The meta object literal for the '<em><b>Grid Steps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__GRID_STEPS = eINSTANCE.getWINDOW_GridSteps();

		/**
		 * The meta object literal for the '<em><b>Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__NBR = eINSTANCE.getWINDOW_Nbr();

		/**
		 * The meta object literal for the '<em><b>Physic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__PHYSIC = eINSTANCE.getWINDOW_Physic();

		/**
		 * The meta object literal for the '<em><b>Pinch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__PINCH = eINSTANCE.getWINDOW_Pinch();

		/**
		 * The meta object literal for the '<em><b>Polyphony</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__POLYPHONY = eINSTANCE.getWINDOW_Polyphony();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__PRECISION = eINSTANCE.getWINDOW_Precision();

		/**
		 * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__RADIO = eINSTANCE.getWINDOW_Radio();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__RELEASE = eINSTANCE.getWINDOW_Release();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__REST = eINSTANCE.getWINDOW_Rest();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ROW = eINSTANCE.getWINDOW_Row();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__SCALE = eINSTANCE.getWINDOW_Scale();

		/**
		 * The meta object literal for the '<em><b>Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ZOOM = eINSTANCE.getWINDOW_Zoom();

		/**
		 * The meta object literal for the '<em><b>WINDOW</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__WINDOW = eINSTANCE.getWINDOW_WINDOW();

		/**
		 * The meta object literal for the '<em><b>PARAM</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__PARAM = eINSTANCE.getWINDOW_PARAM();

		/**
		 * The meta object literal for the '<em><b>VARIABLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__VARIABLE = eINSTANCE.getWINDOW_VARIABLE();

		/**
		 * The meta object literal for the '<em><b>Acceleration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ACCELERATION = eINSTANCE.getWINDOW_Acceleration();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ANGLE = eINSTANCE.getWINDOW_Angle();

		/**
		 * The meta object literal for the '<em><b>Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ATTACK = eINSTANCE.getWINDOW_Attack();

		/**
		 * The meta object literal for the '<em><b>Attraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ATTRACTION = eINSTANCE.getWINDOW_Attraction();

		/**
		 * The meta object literal for the '<em><b>Attraction X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ATTRACTION_X = eINSTANCE.getWINDOW_AttractionX();

		/**
		 * The meta object literal for the '<em><b>Attraction Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ATTRACTION_Y = eINSTANCE.getWINDOW_AttractionY();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__AXIS = eINSTANCE.getWINDOW_Axis();

		/**
		 * The meta object literal for the '<em><b>Balls</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__BALLS = eINSTANCE.getWINDOW_Balls();

		/**
		 * The meta object literal for the '<em><b>Bargraph</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__BARGRAPH = eINSTANCE.getWINDOW_Bargraph();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__BEHAVIOR = eINSTANCE.getWINDOW_Behavior();

		/**
		 * The meta object literal for the '<em><b>Bipolar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__BIPOLAR = eINSTANCE.getWINDOW_Bipolar();

		/**
		 * The meta object literal for the '<em><b>Bitmap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__BITMAP = eINSTANCE.getWINDOW_Bitmap();

		/**
		 * The meta object literal for the '<em><b>Boundaries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__BOUNDARIES = eINSTANCE.getWINDOW_Boundaries();

		/**
		 * The meta object literal for the '<em><b>Capture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__CAPTURE = eINSTANCE.getWINDOW_Capture();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__ID = eINSTANCE.getWINDOW_Id();

	}

} //JzmlPackage
