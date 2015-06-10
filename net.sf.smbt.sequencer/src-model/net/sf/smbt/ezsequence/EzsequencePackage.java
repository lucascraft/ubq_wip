/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

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
 * @see net.sf.smbt.ezsequence.EzsequenceFactory
 * @model kind="package"
 * @generated
 */
public interface EzsequencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezsequence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezsequence/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezsequence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzsequencePackage eINSTANCE = net.sf.smbt.ezsequence.impl.EzsequencePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimedObjImpl <em>Timed Obj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimedObjImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedObj()
	 * @generated
	 */
	int TIMED_OBJ = 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_OBJ__TIME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_OBJ__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Timed Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_OBJ_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.SequencerImpl <em>Sequencer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.SequencerImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getSequencer()
	 * @generated
	 */
	int SEQUENCER = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__TIME = TIMED_OBJ__TIME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__LABEL = TIMED_OBJ__LABEL;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__BOUNDS = TIMED_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__FG = TIMED_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__BG = TIMED_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__VISIBLE = TIMED_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__SELECTED = TIMED_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__DISABLED = TIMED_OBJ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__ID = TIMED_OBJ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__TIMELINES = TIMED_OBJ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Timebar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__TIMEBAR = TIMED_OBJ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Boxes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__BOXES = TIMED_OBJ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__LINKS = TIMED_OBJ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__TRIGGERS = TIMED_OBJ_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Time Cursors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__TIME_CURSORS = TIMED_OBJ_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__COMMANDS = TIMED_OBJ_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cmd Type Cache</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__CMD_TYPE_CACHE = TIMED_OBJ_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Zoom Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__ZOOM_FACTOR = TIMED_OBJ_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__SURFACE = TIMED_OBJ_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Current Action Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__CURRENT_ACTION_MODE = TIMED_OBJ_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Default Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__DEFAULT_TARGETS = TIMED_OBJ_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__LISTENERS = TIMED_OBJ_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Cues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__CUES = TIMED_OBJ_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Synchros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__SYNCHROS = TIMED_OBJ_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__OFFSET = TIMED_OBJ_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Stored Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__STORED_COMMANDS = TIMED_OBJ_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__SELECTION = TIMED_OBJ_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Mojo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__MOJO = TIMED_OBJ_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Dmx Universe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__DMX_UNIVERSE = TIMED_OBJ_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Midi Commands</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__MIDI_COMMANDS = TIMED_OBJ_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Dragged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__DRAGGED = TIMED_OBJ_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Mouse X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__MOUSE_X = TIMED_OBJ_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Mouse Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER__MOUSE_Y = TIMED_OBJ_FEATURE_COUNT + 30;

	/**
	 * The number of structural features of the '<em>Sequencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCER_FEATURE_COUNT = TIMED_OBJ_FEATURE_COUNT + 31;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl <em>Time Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimeBoxImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeBox()
	 * @generated
	 */
	int TIME_BOX = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__TIME = TIMED_OBJ__TIME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__LABEL = TIMED_OBJ__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__ID = TIMED_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__IN = TIMED_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__OUT = TIMED_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__DURATION = TIMED_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__EVENTS = TIMED_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__TIMELINE = TIMED_OBJ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__DIST = TIMED_OBJ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>On Enter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__ON_ENTER = TIMED_OBJ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>On Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX__ON_EXIT = TIMED_OBJ_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Time Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BOX_FEATURE_COUNT = TIMED_OBJ_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimedEventImpl <em>Timed Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimedEventImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedEvent()
	 * @generated
	 */
	int TIMED_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__TIME = TIMED_OBJ__TIME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__LABEL = TIMED_OBJ__LABEL;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__SCRIPT = TIMED_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__TRIGGER = TIMED_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT__COMMAND = TIMED_OBJ_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Timed Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_EVENT_FEATURE_COUNT = TIMED_OBJ_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimeCursorImpl <em>Time Cursor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimeCursorImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeCursor()
	 * @generated
	 */
	int TIME_CURSOR = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CURSOR__TIME = TIMED_OBJ__TIME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CURSOR__LABEL = TIMED_OBJ__LABEL;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CURSOR__COMPLETION = TIMED_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CURSOR__LENGTH = TIMED_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CURSOR__DIRECTION = TIMED_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Accel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CURSOR__ACCEL = TIMED_OBJ_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Time Cursor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CURSOR_FEATURE_COUNT = TIMED_OBJ_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.UIElemImpl <em>UI Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.UIElemImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getUIElem()
	 * @generated
	 */
	int UI_ELEM = 25;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEM__BOUNDS = 0;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEM__FG = 1;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEM__BG = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEM__VISIBLE = 3;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEM__SELECTED = 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEM__DISABLED = 5;

	/**
	 * The number of structural features of the '<em>UI Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ELEM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimeBarImpl <em>Time Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimeBarImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeBar()
	 * @generated
	 */
	int TIME_BAR = 4;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__BOUNDS = UI_ELEM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__FG = UI_ELEM__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__BG = UI_ELEM__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__VISIBLE = UI_ELEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__SELECTED = UI_ELEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__DISABLED = UI_ELEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Timecursor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__TIMECURSOR = UI_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__SLOTS = UI_ELEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__LABEL = UI_ELEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__NODES = UI_ELEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__SCALE = UI_ELEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__SPEED = UI_ELEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Seq Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__SEQ_KIND = UI_ELEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR__DIRECTION = UI_ELEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Time Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BAR_FEATURE_COUNT = UI_ELEM_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.AbstractPortImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getAbstractPort()
	 * @generated
	 */
	int ABSTRACT_PORT = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Abstract Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.PortInImpl <em>Port In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.PortInImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPortIn()
	 * @generated
	 */
	int PORT_IN = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN__LABEL = ABSTRACT_PORT__LABEL;

	/**
	 * The number of structural features of the '<em>Port In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_IN_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.PortOutImpl <em>Port Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.PortOutImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPortOut()
	 * @generated
	 */
	int PORT_OUT = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OUT__LABEL = ABSTRACT_PORT__LABEL;

	/**
	 * The number of structural features of the '<em>Port Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OUT_FEATURE_COUNT = ABSTRACT_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.ScriptImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 9;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__BODY = 0;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimeSlotImpl <em>Time Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimeSlotImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeSlot()
	 * @generated
	 */
	int TIME_SLOT = 10;

	/**
	 * The feature id for the '<em><b>Trigger Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT__TRIGGER_LINK = 0;

	/**
	 * The number of structural features of the '<em>Time Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SLOT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimedLinkImpl <em>Timed Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimedLinkImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedLink()
	 * @generated
	 */
	int TIMED_LINK = 11;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINK__TIME = TIMED_OBJ__TIME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINK__LABEL = TIMED_OBJ__LABEL;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINK__BEFORE = TIMED_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINK__AFTER = TIMED_OBJ_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timed Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINK_FEATURE_COUNT = TIMED_OBJ_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl <em>Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.EventTriggerImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventTrigger()
	 * @generated
	 */
	int EVENT_TRIGGER = 12;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__TIME = TIMED_OBJ__TIME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__LABEL = TIMED_OBJ__LABEL;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__BOUNDS = TIMED_OBJ_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__FG = TIMED_OBJ_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__BG = TIMED_OBJ_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__VISIBLE = TIMED_OBJ_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__SELECTED = TIMED_OBJ_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__DISABLED = TIMED_OBJ_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__BANG = TIMED_OBJ_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__RADIUS = TIMED_OBJ_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__CENTER = TIMED_OBJ_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__ID = TIMED_OBJ_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Emits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__EMITS = TIMED_OBJ_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__AFTER = TIMED_OBJ_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__BEFORE = TIMED_OBJ_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER__TARGETS = TIMED_OBJ_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TRIGGER_FEATURE_COUNT = TIMED_OBJ_FEATURE_COUNT + 14;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.EventListenerImpl <em>Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.EventListenerImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventListener()
	 * @generated
	 */
	int EVENT_LISTENER = 27;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.EventCueImpl <em>Event Cue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.EventCueImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventCue()
	 * @generated
	 */
	int EVENT_CUE = 28;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.EventSynchroImpl <em>Event Synchro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.EventSynchroImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventSynchro()
	 * @generated
	 */
	int EVENT_SYNCHRO = 29;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.EventTargetImpl <em>Event Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.EventTargetImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventTarget()
	 * @generated
	 */
	int EVENT_TARGET = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TARGET__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TARGET__TRIGGERS = 1;

	/**
	 * The number of structural features of the '<em>Event Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TARGET_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimedLineImpl <em>Timed Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimedLineImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedLine()
	 * @generated
	 */
	int TIMED_LINE = 14;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE__START = 0;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE__FINISH = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE__TIME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE__ID = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE__FACTOR = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE__SPEED = 6;

	/**
	 * The number of structural features of the '<em>Timed Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_LINE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TimeNodeImpl <em>Time Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TimeNodeImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeNode()
	 * @generated
	 */
	int TIME_NODE = 15;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_NODE__POINT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_NODE__PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_NODE__COMPLETION = 2;

	/**
	 * The number of structural features of the '<em>Time Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_NODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.NodeParam <em>Node Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.NodeParam
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeParam()
	 * @generated
	 */
	int NODE_PARAM = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAM__ID = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAM__DESC = 1;

	/**
	 * The number of structural features of the '<em>Node Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_PARAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.NodeFloatParamImpl <em>Node Float Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.NodeFloatParamImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeFloatParam()
	 * @generated
	 */
	int NODE_FLOAT_PARAM = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FLOAT_PARAM__ID = NODE_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FLOAT_PARAM__DESC = NODE_PARAM__DESC;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FLOAT_PARAM__VAL = NODE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Float Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FLOAT_PARAM_FEATURE_COUNT = NODE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.NodeIntegerParamImpl <em>Node Integer Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.NodeIntegerParamImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeIntegerParam()
	 * @generated
	 */
	int NODE_INTEGER_PARAM = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INTEGER_PARAM__ID = NODE_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INTEGER_PARAM__DESC = NODE_PARAM__DESC;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INTEGER_PARAM__VAL = NODE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Integer Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_INTEGER_PARAM_FEATURE_COUNT = NODE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.NodeDoubleParamImpl <em>Node Double Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.NodeDoubleParamImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeDoubleParam()
	 * @generated
	 */
	int NODE_DOUBLE_PARAM = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOUBLE_PARAM__ID = NODE_PARAM__ID;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOUBLE_PARAM__DESC = NODE_PARAM__DESC;

	/**
	 * The feature id for the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOUBLE_PARAM__VAL = NODE_PARAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node Double Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_DOUBLE_PARAM_FEATURE_COUNT = NODE_PARAM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.CircleImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 20;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__BOUNDS = TIME_BAR__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FG = TIME_BAR__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__BG = TIME_BAR__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__VISIBLE = TIME_BAR__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SELECTED = TIME_BAR__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DISABLED = TIME_BAR__DISABLED;

	/**
	 * The feature id for the '<em><b>Timecursor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__TIMECURSOR = TIME_BAR__TIMECURSOR;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SLOTS = TIME_BAR__SLOTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LABEL = TIME_BAR__LABEL;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__NODES = TIME_BAR__NODES;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SCALE = TIME_BAR__SCALE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SPEED = TIME_BAR__SPEED;

	/**
	 * The feature id for the '<em><b>Seq Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SEQ_KIND = TIME_BAR__SEQ_KIND;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DIRECTION = TIME_BAR__DIRECTION;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__CENTER = TIME_BAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = TIME_BAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = TIME_BAR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.StarImpl <em>Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.StarImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getStar()
	 * @generated
	 */
	int STAR = 21;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__BOUNDS = TIME_BAR__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__FG = TIME_BAR__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__BG = TIME_BAR__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__VISIBLE = TIME_BAR__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__SELECTED = TIME_BAR__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__DISABLED = TIME_BAR__DISABLED;

	/**
	 * The feature id for the '<em><b>Timecursor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__TIMECURSOR = TIME_BAR__TIMECURSOR;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__SLOTS = TIME_BAR__SLOTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__LABEL = TIME_BAR__LABEL;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__NODES = TIME_BAR__NODES;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__SCALE = TIME_BAR__SCALE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__SPEED = TIME_BAR__SPEED;

	/**
	 * The feature id for the '<em><b>Seq Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__SEQ_KIND = TIME_BAR__SEQ_KIND;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__DIRECTION = TIME_BAR__DIRECTION;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__CENTER = TIME_BAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR__RADIUS = TIME_BAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAR_FEATURE_COUNT = TIME_BAR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.SquareImpl <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.SquareImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getSquare()
	 * @generated
	 */
	int SQUARE = 22;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BOUNDS = TIME_BAR__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__FG = TIME_BAR__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BG = TIME_BAR__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__VISIBLE = TIME_BAR__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SELECTED = TIME_BAR__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__DISABLED = TIME_BAR__DISABLED;

	/**
	 * The feature id for the '<em><b>Timecursor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__TIMECURSOR = TIME_BAR__TIMECURSOR;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SLOTS = TIME_BAR__SLOTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__LABEL = TIME_BAR__LABEL;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__NODES = TIME_BAR__NODES;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SCALE = TIME_BAR__SCALE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SPEED = TIME_BAR__SPEED;

	/**
	 * The feature id for the '<em><b>Seq Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__SEQ_KIND = TIME_BAR__SEQ_KIND;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__DIRECTION = TIME_BAR__DIRECTION;

	/**
	 * The feature id for the '<em><b>Top Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__TOP_LEFT = TIME_BAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Top Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__TOP_RIGHT = TIME_BAR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bottom Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BOTTOM_RIGHT = TIME_BAR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bottom Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE__BOTTOM_LEFT = TIME_BAR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQUARE_FEATURE_COUNT = TIME_BAR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.TrackImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 23;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__BOUNDS = TIME_BAR__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__FG = TIME_BAR__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__BG = TIME_BAR__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__VISIBLE = TIME_BAR__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SELECTED = TIME_BAR__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DISABLED = TIME_BAR__DISABLED;

	/**
	 * The feature id for the '<em><b>Timecursor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__TIMECURSOR = TIME_BAR__TIMECURSOR;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SLOTS = TIME_BAR__SLOTS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__LABEL = TIME_BAR__LABEL;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NODES = TIME_BAR__NODES;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SCALE = TIME_BAR__SCALE;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SPEED = TIME_BAR__SPEED;

	/**
	 * The feature id for the '<em><b>Seq Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__SEQ_KIND = TIME_BAR__SEQ_KIND;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__DIRECTION = TIME_BAR__DIRECTION;

	/**
	 * The feature id for the '<em><b>Polyline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__POLYLINE = TIME_BAR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = TIME_BAR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.CueNodeImpl <em>Cue Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.CueNodeImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getCueNode()
	 * @generated
	 */
	int CUE_NODE = 24;

	/**
	 * The feature id for the '<em><b>Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_NODE__POINT = TIME_NODE__POINT;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_NODE__PARAMETERS = TIME_NODE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_NODE__COMPLETION = TIME_NODE__COMPLETION;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_NODE__KIND = TIME_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cue Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUE_NODE_FEATURE_COUNT = TIME_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.EventElemImpl <em>Event Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.EventElemImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventElem()
	 * @generated
	 */
	int EVENT_ELEM = 26;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__BOUNDS = UI_ELEM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__FG = UI_ELEM__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__BG = UI_ELEM__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__VISIBLE = UI_ELEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__SELECTED = UI_ELEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__DISABLED = UI_ELEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__BANG = UI_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__RADIUS = UI_ELEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__CENTER = UI_ELEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM__ID = UI_ELEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Event Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_ELEM_FEATURE_COUNT = UI_ELEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__BOUNDS = EVENT_ELEM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__FG = EVENT_ELEM__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__BG = EVENT_ELEM__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__VISIBLE = EVENT_ELEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__SELECTED = EVENT_ELEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__DISABLED = EVENT_ELEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__BANG = EVENT_ELEM__BANG;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__RADIUS = EVENT_ELEM__RADIUS;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__CENTER = EVENT_ELEM__CENTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__ID = EVENT_ELEM__ID;

	/**
	 * The feature id for the '<em><b>Osc Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__OSC_TAGS = EVENT_ELEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_FEATURE_COUNT = EVENT_ELEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__BOUNDS = EVENT_ELEM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__FG = EVENT_ELEM__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__BG = EVENT_ELEM__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__VISIBLE = EVENT_ELEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__SELECTED = EVENT_ELEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__DISABLED = EVENT_ELEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__BANG = EVENT_ELEM__BANG;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__RADIUS = EVENT_ELEM__RADIUS;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__CENTER = EVENT_ELEM__CENTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__ID = EVENT_ELEM__ID;

	/**
	 * The feature id for the '<em><b>Jump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__JUMP = EVENT_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE__KIND = EVENT_ELEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event Cue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CUE_FEATURE_COUNT = EVENT_ELEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__BOUNDS = EVENT_ELEM__BOUNDS;

	/**
	 * The feature id for the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__FG = EVENT_ELEM__FG;

	/**
	 * The feature id for the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__BG = EVENT_ELEM__BG;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__VISIBLE = EVENT_ELEM__VISIBLE;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__SELECTED = EVENT_ELEM__SELECTED;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__DISABLED = EVENT_ELEM__DISABLED;

	/**
	 * The feature id for the '<em><b>Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__BANG = EVENT_ELEM__BANG;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__RADIUS = EVENT_ELEM__RADIUS;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__CENTER = EVENT_ELEM__CENTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO__ID = EVENT_ELEM__ID;

	/**
	 * The number of structural features of the '<em>Event Synchro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_SYNCHRO_FEATURE_COUNT = EVENT_ELEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.impl.EmitInfoImpl <em>Emit Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.impl.EmitInfoImpl
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEmitInfo()
	 * @generated
	 */
	int EMIT_INFO = 30;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_INFO__CMD = 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_INFO__TARGETS = 1;

	/**
	 * The number of structural features of the '<em>Emit Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMIT_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.SEQ_TYPE <em>SEQ TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.SEQ_TYPE
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getSEQ_TYPE()
	 * @generated
	 */
	int SEQ_TYPE = 31;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsequence.CUE_TYPE <em>CUE TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsequence.CUE_TYPE
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getCUE_TYPE()
	 * @generated
	 */
	int CUE_TYPE = 32;

	/**
	 * The meta object id for the '<em>Point</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 33;


	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 34;


	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 35;


	/**
	 * The meta object id for the '<em>Polyline</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.Polyline
	 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPolyline()
	 * @generated
	 */
	int POLYLINE = 36;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.Sequencer <em>Sequencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequencer</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer
	 * @generated
	 */
	EClass getSequencer();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getID()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getTimelines <em>Timelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timelines</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getTimelines()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Timelines();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getTimebar <em>Timebar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timebar</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getTimebar()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Timebar();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getBoxes <em>Boxes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boxes</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getBoxes()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Boxes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getLinks()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getTriggers()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Triggers();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsequence.Sequencer#getTimeCursors <em>Time Cursors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Time Cursors</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getTimeCursors()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_TimeCursors();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getCommands()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listeners</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getListeners()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Listeners();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getCues <em>Cues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cues</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getCues()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Cues();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getSynchros <em>Synchros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchros</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getSynchros()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Synchros();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getOffset()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_Offset();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getStoredCommands <em>Stored Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stored Commands</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getStoredCommands()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_StoredCommands();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsequence.Sequencer#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Selection</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getSelection()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Selection();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezsequence.Sequencer#getMojo <em>Mojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mojo</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getMojo()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_Mojo();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezsequence.Sequencer#getDmxUniverse <em>Dmx Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dmx Universe</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getDmxUniverse()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_DmxUniverse();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsequence.Sequencer#getMidiCommands <em>Midi Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Midi Commands</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getMidiCommands()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_MidiCommands();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#isDragged <em>Dragged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dragged</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#isDragged()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_Dragged();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#getMouseX <em>Mouse X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse X</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getMouseX()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_MouseX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#getMouseY <em>Mouse Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mouse Y</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getMouseY()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_MouseY();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getCmdTypeCache <em>Cmd Type Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmd Type Cache</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getCmdTypeCache()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_CmdTypeCache();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#getZoomFactor <em>Zoom Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom Factor</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getZoomFactor()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_ZoomFactor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#getSurface <em>Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Surface</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getSurface()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_Surface();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Sequencer#getCurrentActionMode <em>Current Action Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Action Mode</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getCurrentActionMode()
	 * @see #getSequencer()
	 * @generated
	 */
	EAttribute getSequencer_CurrentActionMode();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.Sequencer#getDefaultTargets <em>Default Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Targets</em>'.
	 * @see net.sf.smbt.ezsequence.Sequencer#getDefaultTargets()
	 * @see #getSequencer()
	 * @generated
	 */
	EReference getSequencer_DefaultTargets();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimeBox <em>Time Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Box</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox
	 * @generated
	 */
	EClass getTimeBox();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBox#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getID()
	 * @see #getTimeBox()
	 * @generated
	 */
	EAttribute getTimeBox_ID();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezsequence.TimeBox#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getIn()
	 * @see #getTimeBox()
	 * @generated
	 */
	EReference getTimeBox_In();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezsequence.TimeBox#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getOut()
	 * @see #getTimeBox()
	 * @generated
	 */
	EReference getTimeBox_Out();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBox#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getDuration()
	 * @see #getTimeBox()
	 * @generated
	 */
	EAttribute getTimeBox_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.TimeBox#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getEvents()
	 * @see #getTimeBox()
	 * @generated
	 */
	EReference getTimeBox_Events();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.TimeBox#getTimeline <em>Timeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timeline</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getTimeline()
	 * @see #getTimeBox()
	 * @generated
	 */
	EReference getTimeBox_Timeline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBox#getDist <em>Dist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dist</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getDist()
	 * @see #getTimeBox()
	 * @generated
	 */
	EAttribute getTimeBox_Dist();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.TimeBox#getOnEnter <em>On Enter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Enter</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getOnEnter()
	 * @see #getTimeBox()
	 * @generated
	 */
	EReference getTimeBox_OnEnter();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.TimeBox#getOnExit <em>On Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Exit</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBox#getOnExit()
	 * @see #getTimeBox()
	 * @generated
	 */
	EReference getTimeBox_OnExit();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimedEvent <em>Timed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Event</em>'.
	 * @see net.sf.smbt.ezsequence.TimedEvent
	 * @generated
	 */
	EClass getTimedEvent();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezsequence.TimedEvent#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see net.sf.smbt.ezsequence.TimedEvent#getScript()
	 * @see #getTimedEvent()
	 * @generated
	 */
	EReference getTimedEvent_Script();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.TimedEvent#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see net.sf.smbt.ezsequence.TimedEvent#getTrigger()
	 * @see #getTimedEvent()
	 * @generated
	 */
	EReference getTimedEvent_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.TimedEvent#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see net.sf.smbt.ezsequence.TimedEvent#getCommand()
	 * @see #getTimedEvent()
	 * @generated
	 */
	EReference getTimedEvent_Command();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimeCursor <em>Time Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Cursor</em>'.
	 * @see net.sf.smbt.ezsequence.TimeCursor
	 * @generated
	 */
	EClass getTimeCursor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeCursor#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion</em>'.
	 * @see net.sf.smbt.ezsequence.TimeCursor#getCompletion()
	 * @see #getTimeCursor()
	 * @generated
	 */
	EAttribute getTimeCursor_Completion();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeCursor#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.smbt.ezsequence.TimeCursor#getLength()
	 * @see #getTimeCursor()
	 * @generated
	 */
	EAttribute getTimeCursor_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeCursor#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see net.sf.smbt.ezsequence.TimeCursor#getDirection()
	 * @see #getTimeCursor()
	 * @generated
	 */
	EAttribute getTimeCursor_Direction();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeCursor#getAccel <em>Accel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accel</em>'.
	 * @see net.sf.smbt.ezsequence.TimeCursor#getAccel()
	 * @see #getTimeCursor()
	 * @generated
	 */
	EAttribute getTimeCursor_Accel();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimeBar <em>Time Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Bar</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar
	 * @generated
	 */
	EClass getTimeBar();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezsequence.TimeBar#getTimecursor <em>Timecursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timecursor</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getTimecursor()
	 * @see #getTimeBar()
	 * @generated
	 */
	EReference getTimeBar_Timecursor();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.TimeBar#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getSlots()
	 * @see #getTimeBar()
	 * @generated
	 */
	EReference getTimeBar_Slots();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBar#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getLabel()
	 * @see #getTimeBar()
	 * @generated
	 */
	EAttribute getTimeBar_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.TimeBar#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getNodes()
	 * @see #getTimeBar()
	 * @generated
	 */
	EReference getTimeBar_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBar#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getScale()
	 * @see #getTimeBar()
	 * @generated
	 */
	EAttribute getTimeBar_Scale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBar#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getSpeed()
	 * @see #getTimeBar()
	 * @generated
	 */
	EAttribute getTimeBar_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBar#getSeqKind <em>Seq Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Kind</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getSeqKind()
	 * @see #getTimeBar()
	 * @generated
	 */
	EAttribute getTimeBar_SeqKind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeBar#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see net.sf.smbt.ezsequence.TimeBar#getDirection()
	 * @see #getTimeBar()
	 * @generated
	 */
	EAttribute getTimeBar_Direction();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.AbstractPort <em>Abstract Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Port</em>'.
	 * @see net.sf.smbt.ezsequence.AbstractPort
	 * @generated
	 */
	EClass getAbstractPort();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.AbstractPort#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.ezsequence.AbstractPort#getLabel()
	 * @see #getAbstractPort()
	 * @generated
	 */
	EAttribute getAbstractPort_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.PortIn <em>Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port In</em>'.
	 * @see net.sf.smbt.ezsequence.PortIn
	 * @generated
	 */
	EClass getPortIn();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.PortOut <em>Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Out</em>'.
	 * @see net.sf.smbt.ezsequence.PortOut
	 * @generated
	 */
	EClass getPortOut();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimedObj <em>Timed Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Obj</em>'.
	 * @see net.sf.smbt.ezsequence.TimedObj
	 * @generated
	 */
	EClass getTimedObj();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedObj#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.ezsequence.TimedObj#getTime()
	 * @see #getTimedObj()
	 * @generated
	 */
	EAttribute getTimedObj_Time();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedObj#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.ezsequence.TimedObj#getLabel()
	 * @see #getTimedObj()
	 * @generated
	 */
	EAttribute getTimedObj_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see net.sf.smbt.ezsequence.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Script#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see net.sf.smbt.ezsequence.Script#getBody()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Body();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Slot</em>'.
	 * @see net.sf.smbt.ezsequence.TimeSlot
	 * @generated
	 */
	EClass getTimeSlot();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.TimeSlot#getTriggerLink <em>Trigger Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Link</em>'.
	 * @see net.sf.smbt.ezsequence.TimeSlot#getTriggerLink()
	 * @see #getTimeSlot()
	 * @generated
	 */
	EReference getTimeSlot_TriggerLink();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimedLink <em>Timed Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Link</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLink
	 * @generated
	 */
	EClass getTimedLink();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.TimedLink#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLink#getBefore()
	 * @see #getTimedLink()
	 * @generated
	 */
	EReference getTimedLink_Before();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.TimedLink#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLink#getAfter()
	 * @see #getTimedLink()
	 * @generated
	 */
	EReference getTimedLink_After();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.EventTrigger <em>Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Trigger</em>'.
	 * @see net.sf.smbt.ezsequence.EventTrigger
	 * @generated
	 */
	EClass getEventTrigger();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.EventTrigger#getEmits <em>Emits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emits</em>'.
	 * @see net.sf.smbt.ezsequence.EventTrigger#getEmits()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EReference getEventTrigger_Emits();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.EventTrigger#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After</em>'.
	 * @see net.sf.smbt.ezsequence.EventTrigger#getAfter()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EReference getEventTrigger_After();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.EventTrigger#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before</em>'.
	 * @see net.sf.smbt.ezsequence.EventTrigger#getBefore()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EReference getEventTrigger_Before();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsequence.EventTrigger#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see net.sf.smbt.ezsequence.EventTrigger#getTargets()
	 * @see #getEventTrigger()
	 * @generated
	 */
	EReference getEventTrigger_Targets();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.EventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listener</em>'.
	 * @see net.sf.smbt.ezsequence.EventListener
	 * @generated
	 */
	EClass getEventListener();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ezsequence.EventListener#getOscTags <em>Osc Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Osc Tags</em>'.
	 * @see net.sf.smbt.ezsequence.EventListener#getOscTags()
	 * @see #getEventListener()
	 * @generated
	 */
	EAttribute getEventListener_OscTags();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.EventCue <em>Event Cue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Cue</em>'.
	 * @see net.sf.smbt.ezsequence.EventCue
	 * @generated
	 */
	EClass getEventCue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.EventCue#getJump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jump</em>'.
	 * @see net.sf.smbt.ezsequence.EventCue#getJump()
	 * @see #getEventCue()
	 * @generated
	 */
	EAttribute getEventCue_Jump();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.EventCue#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezsequence.EventCue#getKind()
	 * @see #getEventCue()
	 * @generated
	 */
	EAttribute getEventCue_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.EventSynchro <em>Event Synchro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Synchro</em>'.
	 * @see net.sf.smbt.ezsequence.EventSynchro
	 * @generated
	 */
	EClass getEventSynchro();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.EmitInfo <em>Emit Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emit Info</em>'.
	 * @see net.sf.smbt.ezsequence.EmitInfo
	 * @generated
	 */
	EClass getEmitInfo();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsequence.EmitInfo#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cmd</em>'.
	 * @see net.sf.smbt.ezsequence.EmitInfo#getCmd()
	 * @see #getEmitInfo()
	 * @generated
	 */
	EReference getEmitInfo_Cmd();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsequence.EmitInfo#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see net.sf.smbt.ezsequence.EmitInfo#getTargets()
	 * @see #getEmitInfo()
	 * @generated
	 */
	EReference getEmitInfo_Targets();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.EventTarget <em>Event Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Target</em>'.
	 * @see net.sf.smbt.ezsequence.EventTarget
	 * @generated
	 */
	EClass getEventTarget();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsequence.EventTarget#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.sf.smbt.ezsequence.EventTarget#getSource()
	 * @see #getEventTarget()
	 * @generated
	 */
	EReference getEventTarget_Source();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsequence.EventTarget#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggers</em>'.
	 * @see net.sf.smbt.ezsequence.EventTarget#getTriggers()
	 * @see #getEventTarget()
	 * @generated
	 */
	EReference getEventTarget_Triggers();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimedLine <em>Timed Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Line</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine
	 * @generated
	 */
	EClass getTimedLine();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedLine#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine#getStart()
	 * @see #getTimedLine()
	 * @generated
	 */
	EAttribute getTimedLine_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedLine#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine#getFinish()
	 * @see #getTimedLine()
	 * @generated
	 */
	EAttribute getTimedLine_Finish();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedLine#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine#getTime()
	 * @see #getTimedLine()
	 * @generated
	 */
	EAttribute getTimedLine_Time();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedLine#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine#getId()
	 * @see #getTimedLine()
	 * @generated
	 */
	EAttribute getTimedLine_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedLine#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine#getStatus()
	 * @see #getTimedLine()
	 * @generated
	 */
	EAttribute getTimedLine_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedLine#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine#getFactor()
	 * @see #getTimedLine()
	 * @generated
	 */
	EAttribute getTimedLine_Factor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimedLine#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.ezsequence.TimedLine#getSpeed()
	 * @see #getTimedLine()
	 * @generated
	 */
	EAttribute getTimedLine_Speed();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.TimeNode <em>Time Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Node</em>'.
	 * @see net.sf.smbt.ezsequence.TimeNode
	 * @generated
	 */
	EClass getTimeNode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeNode#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point</em>'.
	 * @see net.sf.smbt.ezsequence.TimeNode#getPoint()
	 * @see #getTimeNode()
	 * @generated
	 */
	EAttribute getTimeNode_Point();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsequence.TimeNode#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see net.sf.smbt.ezsequence.TimeNode#getParameters()
	 * @see #getTimeNode()
	 * @generated
	 */
	EReference getTimeNode_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.TimeNode#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion</em>'.
	 * @see net.sf.smbt.ezsequence.TimeNode#getCompletion()
	 * @see #getTimeNode()
	 * @generated
	 */
	EAttribute getTimeNode_Completion();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.NodeFloatParam <em>Node Float Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Float Param</em>'.
	 * @see net.sf.smbt.ezsequence.NodeFloatParam
	 * @generated
	 */
	EClass getNodeFloatParam();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.NodeFloatParam#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see net.sf.smbt.ezsequence.NodeFloatParam#getVal()
	 * @see #getNodeFloatParam()
	 * @generated
	 */
	EAttribute getNodeFloatParam_Val();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.NodeParam <em>Node Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Param</em>'.
	 * @see net.sf.smbt.ezsequence.NodeParam
	 * @generated
	 */
	EClass getNodeParam();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.NodeParam#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezsequence.NodeParam#getId()
	 * @see #getNodeParam()
	 * @generated
	 */
	EAttribute getNodeParam_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.NodeParam#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see net.sf.smbt.ezsequence.NodeParam#getDesc()
	 * @see #getNodeParam()
	 * @generated
	 */
	EAttribute getNodeParam_Desc();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.NodeIntegerParam <em>Node Integer Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Integer Param</em>'.
	 * @see net.sf.smbt.ezsequence.NodeIntegerParam
	 * @generated
	 */
	EClass getNodeIntegerParam();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.NodeIntegerParam#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see net.sf.smbt.ezsequence.NodeIntegerParam#getVal()
	 * @see #getNodeIntegerParam()
	 * @generated
	 */
	EAttribute getNodeIntegerParam_Val();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.NodeDoubleParam <em>Node Double Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Double Param</em>'.
	 * @see net.sf.smbt.ezsequence.NodeDoubleParam
	 * @generated
	 */
	EClass getNodeDoubleParam();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.NodeDoubleParam#getVal <em>Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val</em>'.
	 * @see net.sf.smbt.ezsequence.NodeDoubleParam#getVal()
	 * @see #getNodeDoubleParam()
	 * @generated
	 */
	EAttribute getNodeDoubleParam_Val();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see net.sf.smbt.ezsequence.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Circle#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see net.sf.smbt.ezsequence.Circle#getCenter()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Center();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see net.sf.smbt.ezsequence.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.Star <em>Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Star</em>'.
	 * @see net.sf.smbt.ezsequence.Star
	 * @generated
	 */
	EClass getStar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Star#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see net.sf.smbt.ezsequence.Star#getCenter()
	 * @see #getStar()
	 * @generated
	 */
	EAttribute getStar_Center();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Star#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see net.sf.smbt.ezsequence.Star#getRadius()
	 * @see #getStar()
	 * @generated
	 */
	EAttribute getStar_Radius();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see net.sf.smbt.ezsequence.Square
	 * @generated
	 */
	EClass getSquare();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Square#getTopLeft <em>Top Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Left</em>'.
	 * @see net.sf.smbt.ezsequence.Square#getTopLeft()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_TopLeft();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Square#getTopRight <em>Top Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Right</em>'.
	 * @see net.sf.smbt.ezsequence.Square#getTopRight()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_TopRight();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Square#getBottomRight <em>Bottom Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Right</em>'.
	 * @see net.sf.smbt.ezsequence.Square#getBottomRight()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_BottomRight();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Square#getBottomLeft <em>Bottom Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Left</em>'.
	 * @see net.sf.smbt.ezsequence.Square#getBottomLeft()
	 * @see #getSquare()
	 * @generated
	 */
	EAttribute getSquare_BottomLeft();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see net.sf.smbt.ezsequence.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.Track#getPolyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polyline</em>'.
	 * @see net.sf.smbt.ezsequence.Track#getPolyline()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Polyline();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.CueNode <em>Cue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cue Node</em>'.
	 * @see net.sf.smbt.ezsequence.CueNode
	 * @generated
	 */
	EClass getCueNode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.CueNode#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezsequence.CueNode#getKind()
	 * @see #getCueNode()
	 * @generated
	 */
	EAttribute getCueNode_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.UIElem <em>UI Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Elem</em>'.
	 * @see net.sf.smbt.ezsequence.UIElem
	 * @generated
	 */
	EClass getUIElem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.UIElem#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bounds</em>'.
	 * @see net.sf.smbt.ezsequence.UIElem#getBounds()
	 * @see #getUIElem()
	 * @generated
	 */
	EAttribute getUIElem_Bounds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.UIElem#getFg <em>Fg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fg</em>'.
	 * @see net.sf.smbt.ezsequence.UIElem#getFg()
	 * @see #getUIElem()
	 * @generated
	 */
	EAttribute getUIElem_Fg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.UIElem#getBg <em>Bg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg</em>'.
	 * @see net.sf.smbt.ezsequence.UIElem#getBg()
	 * @see #getUIElem()
	 * @generated
	 */
	EAttribute getUIElem_Bg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.UIElem#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see net.sf.smbt.ezsequence.UIElem#isVisible()
	 * @see #getUIElem()
	 * @generated
	 */
	EAttribute getUIElem_Visible();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.UIElem#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see net.sf.smbt.ezsequence.UIElem#isSelected()
	 * @see #getUIElem()
	 * @generated
	 */
	EAttribute getUIElem_Selected();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.UIElem#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see net.sf.smbt.ezsequence.UIElem#isDisabled()
	 * @see #getUIElem()
	 * @generated
	 */
	EAttribute getUIElem_Disabled();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsequence.EventElem <em>Event Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Elem</em>'.
	 * @see net.sf.smbt.ezsequence.EventElem
	 * @generated
	 */
	EClass getEventElem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.EventElem#getBang <em>Bang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bang</em>'.
	 * @see net.sf.smbt.ezsequence.EventElem#getBang()
	 * @see #getEventElem()
	 * @generated
	 */
	EAttribute getEventElem_Bang();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.EventElem#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see net.sf.smbt.ezsequence.EventElem#getRadius()
	 * @see #getEventElem()
	 * @generated
	 */
	EAttribute getEventElem_Radius();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.EventElem#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see net.sf.smbt.ezsequence.EventElem#getCenter()
	 * @see #getEventElem()
	 * @generated
	 */
	EAttribute getEventElem_Center();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsequence.EventElem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezsequence.EventElem#getId()
	 * @see #getEventElem()
	 * @generated
	 */
	EAttribute getEventElem_Id();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezsequence.SEQ_TYPE <em>SEQ TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SEQ TYPE</em>'.
	 * @see net.sf.smbt.ezsequence.SEQ_TYPE
	 * @generated
	 */
	EEnum getSEQ_TYPE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezsequence.CUE_TYPE <em>CUE TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CUE TYPE</em>'.
	 * @see net.sf.smbt.ezsequence.CUE_TYPE
	 * @generated
	 */
	EEnum getCUE_TYPE();

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
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.Polyline <em>Polyline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Polyline</em>'.
	 * @see org.eclipse.draw2d.Polyline
	 * @model instanceClass="org.eclipse.draw2d.Polyline"
	 * @generated
	 */
	EDataType getPolyline();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzsequenceFactory getEzsequenceFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.SequencerImpl <em>Sequencer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.SequencerImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getSequencer()
		 * @generated
		 */
		EClass SEQUENCER = eINSTANCE.getSequencer();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__ID = eINSTANCE.getSequencer_ID();

		/**
		 * The meta object literal for the '<em><b>Timelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__TIMELINES = eINSTANCE.getSequencer_Timelines();

		/**
		 * The meta object literal for the '<em><b>Timebar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__TIMEBAR = eINSTANCE.getSequencer_Timebar();

		/**
		 * The meta object literal for the '<em><b>Boxes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__BOXES = eINSTANCE.getSequencer_Boxes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__LINKS = eINSTANCE.getSequencer_Links();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__TRIGGERS = eINSTANCE.getSequencer_Triggers();

		/**
		 * The meta object literal for the '<em><b>Time Cursors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__TIME_CURSORS = eINSTANCE.getSequencer_TimeCursors();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__COMMANDS = eINSTANCE.getSequencer_Commands();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__LISTENERS = eINSTANCE.getSequencer_Listeners();

		/**
		 * The meta object literal for the '<em><b>Cues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__CUES = eINSTANCE.getSequencer_Cues();

		/**
		 * The meta object literal for the '<em><b>Synchros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__SYNCHROS = eINSTANCE.getSequencer_Synchros();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__OFFSET = eINSTANCE.getSequencer_Offset();

		/**
		 * The meta object literal for the '<em><b>Stored Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__STORED_COMMANDS = eINSTANCE.getSequencer_StoredCommands();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__SELECTION = eINSTANCE.getSequencer_Selection();

		/**
		 * The meta object literal for the '<em><b>Mojo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__MOJO = eINSTANCE.getSequencer_Mojo();

		/**
		 * The meta object literal for the '<em><b>Dmx Universe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__DMX_UNIVERSE = eINSTANCE.getSequencer_DmxUniverse();

		/**
		 * The meta object literal for the '<em><b>Midi Commands</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__MIDI_COMMANDS = eINSTANCE.getSequencer_MidiCommands();

		/**
		 * The meta object literal for the '<em><b>Dragged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__DRAGGED = eINSTANCE.getSequencer_Dragged();

		/**
		 * The meta object literal for the '<em><b>Mouse X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__MOUSE_X = eINSTANCE.getSequencer_MouseX();

		/**
		 * The meta object literal for the '<em><b>Mouse Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__MOUSE_Y = eINSTANCE.getSequencer_MouseY();

		/**
		 * The meta object literal for the '<em><b>Cmd Type Cache</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__CMD_TYPE_CACHE = eINSTANCE.getSequencer_CmdTypeCache();

		/**
		 * The meta object literal for the '<em><b>Zoom Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__ZOOM_FACTOR = eINSTANCE.getSequencer_ZoomFactor();

		/**
		 * The meta object literal for the '<em><b>Surface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__SURFACE = eINSTANCE.getSequencer_Surface();

		/**
		 * The meta object literal for the '<em><b>Current Action Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCER__CURRENT_ACTION_MODE = eINSTANCE.getSequencer_CurrentActionMode();

		/**
		 * The meta object literal for the '<em><b>Default Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCER__DEFAULT_TARGETS = eINSTANCE.getSequencer_DefaultTargets();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl <em>Time Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimeBoxImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeBox()
		 * @generated
		 */
		EClass TIME_BOX = eINSTANCE.getTimeBox();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BOX__ID = eINSTANCE.getTimeBox_ID();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BOX__IN = eINSTANCE.getTimeBox_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BOX__OUT = eINSTANCE.getTimeBox_Out();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BOX__DURATION = eINSTANCE.getTimeBox_Duration();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BOX__EVENTS = eINSTANCE.getTimeBox_Events();

		/**
		 * The meta object literal for the '<em><b>Timeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BOX__TIMELINE = eINSTANCE.getTimeBox_Timeline();

		/**
		 * The meta object literal for the '<em><b>Dist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BOX__DIST = eINSTANCE.getTimeBox_Dist();

		/**
		 * The meta object literal for the '<em><b>On Enter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BOX__ON_ENTER = eINSTANCE.getTimeBox_OnEnter();

		/**
		 * The meta object literal for the '<em><b>On Exit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BOX__ON_EXIT = eINSTANCE.getTimeBox_OnExit();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimedEventImpl <em>Timed Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimedEventImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedEvent()
		 * @generated
		 */
		EClass TIMED_EVENT = eINSTANCE.getTimedEvent();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_EVENT__SCRIPT = eINSTANCE.getTimedEvent_Script();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_EVENT__TRIGGER = eINSTANCE.getTimedEvent_Trigger();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_EVENT__COMMAND = eINSTANCE.getTimedEvent_Command();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimeCursorImpl <em>Time Cursor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimeCursorImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeCursor()
		 * @generated
		 */
		EClass TIME_CURSOR = eINSTANCE.getTimeCursor();

		/**
		 * The meta object literal for the '<em><b>Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CURSOR__COMPLETION = eINSTANCE.getTimeCursor_Completion();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CURSOR__LENGTH = eINSTANCE.getTimeCursor_Length();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CURSOR__DIRECTION = eINSTANCE.getTimeCursor_Direction();

		/**
		 * The meta object literal for the '<em><b>Accel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CURSOR__ACCEL = eINSTANCE.getTimeCursor_Accel();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimeBarImpl <em>Time Bar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimeBarImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeBar()
		 * @generated
		 */
		EClass TIME_BAR = eINSTANCE.getTimeBar();

		/**
		 * The meta object literal for the '<em><b>Timecursor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BAR__TIMECURSOR = eINSTANCE.getTimeBar_Timecursor();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BAR__SLOTS = eINSTANCE.getTimeBar_Slots();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BAR__LABEL = eINSTANCE.getTimeBar_Label();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_BAR__NODES = eINSTANCE.getTimeBar_Nodes();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BAR__SCALE = eINSTANCE.getTimeBar_Scale();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BAR__SPEED = eINSTANCE.getTimeBar_Speed();

		/**
		 * The meta object literal for the '<em><b>Seq Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BAR__SEQ_KIND = eINSTANCE.getTimeBar_SeqKind();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BAR__DIRECTION = eINSTANCE.getTimeBar_Direction();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.AbstractPortImpl <em>Abstract Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.AbstractPortImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getAbstractPort()
		 * @generated
		 */
		EClass ABSTRACT_PORT = eINSTANCE.getAbstractPort();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PORT__LABEL = eINSTANCE.getAbstractPort_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.PortInImpl <em>Port In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.PortInImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPortIn()
		 * @generated
		 */
		EClass PORT_IN = eINSTANCE.getPortIn();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.PortOutImpl <em>Port Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.PortOutImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPortOut()
		 * @generated
		 */
		EClass PORT_OUT = eINSTANCE.getPortOut();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimedObjImpl <em>Timed Obj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimedObjImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedObj()
		 * @generated
		 */
		EClass TIMED_OBJ = eINSTANCE.getTimedObj();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_OBJ__TIME = eINSTANCE.getTimedObj_Time();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_OBJ__LABEL = eINSTANCE.getTimedObj_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.ScriptImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__BODY = eINSTANCE.getScript_Body();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimeSlotImpl <em>Time Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimeSlotImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeSlot()
		 * @generated
		 */
		EClass TIME_SLOT = eINSTANCE.getTimeSlot();

		/**
		 * The meta object literal for the '<em><b>Trigger Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SLOT__TRIGGER_LINK = eINSTANCE.getTimeSlot_TriggerLink();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimedLinkImpl <em>Timed Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimedLinkImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedLink()
		 * @generated
		 */
		EClass TIMED_LINK = eINSTANCE.getTimedLink();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_LINK__BEFORE = eINSTANCE.getTimedLink_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_LINK__AFTER = eINSTANCE.getTimedLink_After();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl <em>Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.EventTriggerImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventTrigger()
		 * @generated
		 */
		EClass EVENT_TRIGGER = eINSTANCE.getEventTrigger();

		/**
		 * The meta object literal for the '<em><b>Emits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TRIGGER__EMITS = eINSTANCE.getEventTrigger_Emits();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TRIGGER__AFTER = eINSTANCE.getEventTrigger_After();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TRIGGER__BEFORE = eINSTANCE.getEventTrigger_Before();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TRIGGER__TARGETS = eINSTANCE.getEventTrigger_Targets();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.EventListenerImpl <em>Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.EventListenerImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventListener()
		 * @generated
		 */
		EClass EVENT_LISTENER = eINSTANCE.getEventListener();

		/**
		 * The meta object literal for the '<em><b>Osc Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_LISTENER__OSC_TAGS = eINSTANCE.getEventListener_OscTags();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.EventCueImpl <em>Event Cue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.EventCueImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventCue()
		 * @generated
		 */
		EClass EVENT_CUE = eINSTANCE.getEventCue();

		/**
		 * The meta object literal for the '<em><b>Jump</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CUE__JUMP = eINSTANCE.getEventCue_Jump();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_CUE__KIND = eINSTANCE.getEventCue_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.EventSynchroImpl <em>Event Synchro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.EventSynchroImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventSynchro()
		 * @generated
		 */
		EClass EVENT_SYNCHRO = eINSTANCE.getEventSynchro();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.EmitInfoImpl <em>Emit Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.EmitInfoImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEmitInfo()
		 * @generated
		 */
		EClass EMIT_INFO = eINSTANCE.getEmitInfo();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_INFO__CMD = eINSTANCE.getEmitInfo_Cmd();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMIT_INFO__TARGETS = eINSTANCE.getEmitInfo_Targets();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.EventTargetImpl <em>Event Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.EventTargetImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventTarget()
		 * @generated
		 */
		EClass EVENT_TARGET = eINSTANCE.getEventTarget();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TARGET__SOURCE = eINSTANCE.getEventTarget_Source();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TARGET__TRIGGERS = eINSTANCE.getEventTarget_Triggers();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimedLineImpl <em>Timed Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimedLineImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimedLine()
		 * @generated
		 */
		EClass TIMED_LINE = eINSTANCE.getTimedLine();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_LINE__START = eINSTANCE.getTimedLine_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_LINE__FINISH = eINSTANCE.getTimedLine_Finish();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_LINE__TIME = eINSTANCE.getTimedLine_Time();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_LINE__ID = eINSTANCE.getTimedLine_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_LINE__STATUS = eINSTANCE.getTimedLine_Status();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_LINE__FACTOR = eINSTANCE.getTimedLine_Factor();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMED_LINE__SPEED = eINSTANCE.getTimedLine_Speed();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TimeNodeImpl <em>Time Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TimeNodeImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTimeNode()
		 * @generated
		 */
		EClass TIME_NODE = eINSTANCE.getTimeNode();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_NODE__POINT = eINSTANCE.getTimeNode_Point();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_NODE__PARAMETERS = eINSTANCE.getTimeNode_Parameters();

		/**
		 * The meta object literal for the '<em><b>Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_NODE__COMPLETION = eINSTANCE.getTimeNode_Completion();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.NodeFloatParamImpl <em>Node Float Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.NodeFloatParamImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeFloatParam()
		 * @generated
		 */
		EClass NODE_FLOAT_PARAM = eINSTANCE.getNodeFloatParam();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FLOAT_PARAM__VAL = eINSTANCE.getNodeFloatParam_Val();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.NodeParam <em>Node Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.NodeParam
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeParam()
		 * @generated
		 */
		EClass NODE_PARAM = eINSTANCE.getNodeParam();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PARAM__ID = eINSTANCE.getNodeParam_Id();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_PARAM__DESC = eINSTANCE.getNodeParam_Desc();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.NodeIntegerParamImpl <em>Node Integer Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.NodeIntegerParamImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeIntegerParam()
		 * @generated
		 */
		EClass NODE_INTEGER_PARAM = eINSTANCE.getNodeIntegerParam();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_INTEGER_PARAM__VAL = eINSTANCE.getNodeIntegerParam_Val();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.NodeDoubleParamImpl <em>Node Double Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.NodeDoubleParamImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getNodeDoubleParam()
		 * @generated
		 */
		EClass NODE_DOUBLE_PARAM = eINSTANCE.getNodeDoubleParam();

		/**
		 * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_DOUBLE_PARAM__VAL = eINSTANCE.getNodeDoubleParam_Val();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.CircleImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__CENTER = eINSTANCE.getCircle_Center();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.StarImpl <em>Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.StarImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getStar()
		 * @generated
		 */
		EClass STAR = eINSTANCE.getStar();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR__CENTER = eINSTANCE.getStar_Center();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAR__RADIUS = eINSTANCE.getStar_Radius();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.SquareImpl <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.SquareImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getSquare()
		 * @generated
		 */
		EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '<em><b>Top Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__TOP_LEFT = eINSTANCE.getSquare_TopLeft();

		/**
		 * The meta object literal for the '<em><b>Top Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__TOP_RIGHT = eINSTANCE.getSquare_TopRight();

		/**
		 * The meta object literal for the '<em><b>Bottom Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__BOTTOM_RIGHT = eINSTANCE.getSquare_BottomRight();

		/**
		 * The meta object literal for the '<em><b>Bottom Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SQUARE__BOTTOM_LEFT = eINSTANCE.getSquare_BottomLeft();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.TrackImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Polyline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__POLYLINE = eINSTANCE.getTrack_Polyline();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.CueNodeImpl <em>Cue Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.CueNodeImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getCueNode()
		 * @generated
		 */
		EClass CUE_NODE = eINSTANCE.getCueNode();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUE_NODE__KIND = eINSTANCE.getCueNode_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.UIElemImpl <em>UI Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.UIElemImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getUIElem()
		 * @generated
		 */
		EClass UI_ELEM = eINSTANCE.getUIElem();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEM__BOUNDS = eINSTANCE.getUIElem_Bounds();

		/**
		 * The meta object literal for the '<em><b>Fg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEM__FG = eINSTANCE.getUIElem_Fg();

		/**
		 * The meta object literal for the '<em><b>Bg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEM__BG = eINSTANCE.getUIElem_Bg();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEM__VISIBLE = eINSTANCE.getUIElem_Visible();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEM__SELECTED = eINSTANCE.getUIElem_Selected();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ELEM__DISABLED = eINSTANCE.getUIElem_Disabled();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.impl.EventElemImpl <em>Event Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.impl.EventElemImpl
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getEventElem()
		 * @generated
		 */
		EClass EVENT_ELEM = eINSTANCE.getEventElem();

		/**
		 * The meta object literal for the '<em><b>Bang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ELEM__BANG = eINSTANCE.getEventElem_Bang();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ELEM__RADIUS = eINSTANCE.getEventElem_Radius();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ELEM__CENTER = eINSTANCE.getEventElem_Center();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_ELEM__ID = eINSTANCE.getEventElem_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.SEQ_TYPE <em>SEQ TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.SEQ_TYPE
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getSEQ_TYPE()
		 * @generated
		 */
		EEnum SEQ_TYPE = eINSTANCE.getSEQ_TYPE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsequence.CUE_TYPE <em>CUE TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsequence.CUE_TYPE
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getCUE_TYPE()
		 * @generated
		 */
		EEnum CUE_TYPE = eINSTANCE.getCUE_TYPE();

		/**
		 * The meta object literal for the '<em>Point</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPoint()
		 * @generated
		 */
		EDataType POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Polyline</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.Polyline
		 * @see net.sf.smbt.ezsequence.impl.EzsequencePackageImpl#getPolyline()
		 * @generated
		 */
		EDataType POLYLINE = eINSTANCE.getPolyline();

	}

} //EzsequencePackage
