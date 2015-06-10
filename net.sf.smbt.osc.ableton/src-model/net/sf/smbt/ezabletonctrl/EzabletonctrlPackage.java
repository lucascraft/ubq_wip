/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

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
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlFactory
 * @model kind="package"
 * @generated
 */
public interface EzabletonctrlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezabletonctrl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/osc/ableton/ezabletonctrl/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezabletonctrl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzabletonctrlPackage eINSTANCE = net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl <em>Ableton Live</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getAbletonLive()
	 * @generated
	 */
	int ABLETON_LIVE = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Ver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__VER = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Master Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__MASTER_TRACK = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__TRACKS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__SCENES = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__CLIPS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__CURRENT_SCENE = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__STATE = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Overdub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__OVERDUB = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__VOLUME = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__TIME = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__TEMPO = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Ubqt Notification On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__UBQT_NOTIFICATION_ON = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Control Surfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE__CONTROL_SURFACES = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Ableton Live</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl <em>Live Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveTrack()
	 * @generated
	 */
	int LIVE_TRACK = 1;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__TRACK_ID = 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__VOLUME = 1;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__PAN = 2;

	/**
	 * The feature id for the '<em><b>Solo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__SOLO = 3;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__SEND = 4;

	/**
	 * The feature id for the '<em><b>Arm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__ARM = 5;

	/**
	 * The feature id for the '<em><b>Mute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__MUTE = 6;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__DELAY = 7;

	/**
	 * The feature id for the '<em><b>Coarse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__COARSE = 8;

	/**
	 * The feature id for the '<em><b>Fine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__FINE = 9;

	/**
	 * The feature id for the '<em><b>Beats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__BEATS = 10;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__DEVICES = 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__STATE = 12;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__CLIPS = 13;

	/**
	 * The feature id for the '<em><b>Track Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__TRACK_NAME = 14;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__COLOR = 15;

	/**
	 * The feature id for the '<em><b>Left Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__LEFT_METER = 16;

	/**
	 * The feature id for the '<em><b>Right Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__RIGHT_METER = 17;

	/**
	 * The feature id for the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__LAST_SEEN = 18;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK__VIEW = 19;

	/**
	 * The number of structural features of the '<em>Live Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl <em>Live Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveScene()
	 * @generated
	 */
	int LIVE_SCENE = 2;

	/**
	 * The feature id for the '<em><b>Scene ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE__SCENE_ID = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE__MODE = 1;

	/**
	 * The feature id for the '<em><b>Scene Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE__SCENE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE__LAST_SEEN = 3;

	/**
	 * The number of structural features of the '<em>Live Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveMasterImpl <em>Live Master</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.LiveMasterImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveMaster()
	 * @generated
	 */
	int LIVE_MASTER = 3;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__TRACK_ID = LIVE_TRACK__TRACK_ID;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__VOLUME = LIVE_TRACK__VOLUME;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__PAN = LIVE_TRACK__PAN;

	/**
	 * The feature id for the '<em><b>Solo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__SOLO = LIVE_TRACK__SOLO;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__SEND = LIVE_TRACK__SEND;

	/**
	 * The feature id for the '<em><b>Arm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__ARM = LIVE_TRACK__ARM;

	/**
	 * The feature id for the '<em><b>Mute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__MUTE = LIVE_TRACK__MUTE;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__DELAY = LIVE_TRACK__DELAY;

	/**
	 * The feature id for the '<em><b>Coarse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__COARSE = LIVE_TRACK__COARSE;

	/**
	 * The feature id for the '<em><b>Fine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__FINE = LIVE_TRACK__FINE;

	/**
	 * The feature id for the '<em><b>Beats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__BEATS = LIVE_TRACK__BEATS;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__DEVICES = LIVE_TRACK__DEVICES;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__STATE = LIVE_TRACK__STATE;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__CLIPS = LIVE_TRACK__CLIPS;

	/**
	 * The feature id for the '<em><b>Track Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__TRACK_NAME = LIVE_TRACK__TRACK_NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__COLOR = LIVE_TRACK__COLOR;

	/**
	 * The feature id for the '<em><b>Left Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__LEFT_METER = LIVE_TRACK__LEFT_METER;

	/**
	 * The feature id for the '<em><b>Right Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__RIGHT_METER = LIVE_TRACK__RIGHT_METER;

	/**
	 * The feature id for the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__LAST_SEEN = LIVE_TRACK__LAST_SEEN;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__VIEW = LIVE_TRACK__VIEW;

	/**
	 * The feature id for the '<em><b>Master Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER__MASTER_DEVICES = LIVE_TRACK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Master</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_FEATURE_COUNT = LIVE_TRACK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl <em>Live Clip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.LiveClipImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveClip()
	 * @generated
	 */
	int LIVE_CLIP = 4;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__CLIP_ID = 0;

	/**
	 * The feature id for the '<em><b>Clip Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__CLIP_NAME = 1;

	/**
	 * The feature id for the '<em><b>Clip State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__CLIP_STATE = 2;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__SIZE_X = 3;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__SIZE_Y = 4;

	/**
	 * The feature id for the '<em><b>Coarse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__COARSE = 5;

	/**
	 * The feature id for the '<em><b>Fine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__FINE = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__POSITION = 7;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__LENGTH = 8;

	/**
	 * The feature id for the '<em><b>Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__LOOP_START = 9;

	/**
	 * The feature id for the '<em><b>Loop End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__LOOP_END = 10;

	/**
	 * The feature id for the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__TRACK = 11;

	/**
	 * The feature id for the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__LAST_SEEN = 12;

	/**
	 * The feature id for the '<em><b>Is Audio Clip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__IS_AUDIO_CLIP = 13;

	/**
	 * The feature id for the '<em><b>Is Midi Clip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__IS_MIDI_CLIP = 14;

	/**
	 * The feature id for the '<em><b>Is Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__IS_TRIGGERED = 15;

	/**
	 * The feature id for the '<em><b>Playing Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__PLAYING_STATUS = 16;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__NOTES = 17;

	/**
	 * The feature id for the '<em><b>Signature denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__SIGNATURE_DENOMINATOR = 18;

	/**
	 * The feature id for the '<em><b>Signature numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__SIGNATURE_NUMERATOR = 19;

	/**
	 * The feature id for the '<em><b>Warping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__WARPING = 20;

	/**
	 * The feature id for the '<em><b>Will recording on start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__WILL_RECORDING_ON_START = 21;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP__COLOR = 22;

	/**
	 * The number of structural features of the '<em>Live Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_FEATURE_COUNT = 23;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice <em>Abstract Live Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getAbstractLiveDevice()
	 * @generated
	 */
	int ABSTRACT_LIVE_DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIVE_DEVICE__DEVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIVE_DEVICE__DEVICE_ID = 1;

	/**
	 * The feature id for the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIVE_DEVICE__LAST_SEEN = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIVE_DEVICE__PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Abstract Live Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LIVE_DEVICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl <em>Place Holder Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getPlaceHolderDevice()
	 * @generated
	 */
	int PLACE_HOLDER_DEVICE = 6;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_DEVICE__DEVICE_NAME = ABSTRACT_LIVE_DEVICE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_DEVICE__DEVICE_ID = ABSTRACT_LIVE_DEVICE__DEVICE_ID;

	/**
	 * The feature id for the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_DEVICE__LAST_SEEN = ABSTRACT_LIVE_DEVICE__LAST_SEEN;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_DEVICE__PARAMETERS = ABSTRACT_LIVE_DEVICE__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Place Holder Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_HOLDER_DEVICE_FEATURE_COUNT = ABSTRACT_LIVE_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl <em>Live Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.LiveParamImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveParam()
	 * @generated
	 */
	int LIVE_PARAM = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PARAM__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PARAM__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PARAM__MIN = 2;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PARAM__MAX = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PARAM__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PARAM__NAME = 5;

	/**
	 * The number of structural features of the '<em>Live Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PARAM_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.AbstractMixerDeviceImpl <em>Abstract Mixer Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.AbstractMixerDeviceImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getAbstractMixerDevice()
	 * @generated
	 */
	int ABSTRACT_MIXER_DEVICE = 8;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIXER_DEVICE__VOLUME = 0;

	/**
	 * The feature id for the '<em><b>Panning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIXER_DEVICE__PANNING = 1;

	/**
	 * The feature id for the '<em><b>Sends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIXER_DEVICE__SENDS = 2;

	/**
	 * The number of structural features of the '<em>Abstract Mixer Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIXER_DEVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackViewImpl <em>Live Track View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.LiveTrackViewImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveTrackView()
	 * @generated
	 */
	int LIVE_TRACK_VIEW = 9;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VIEW__DEVICE = 0;

	/**
	 * The number of structural features of the '<em>Live Track View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VIEW_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.ControlSurfaceImpl <em>Control Surface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.ControlSurfaceImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getControlSurface()
	 * @generated
	 */
	int CONTROL_SURFACE = 10;

	/**
	 * The number of structural features of the '<em>Control Surface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_SURFACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.TransportComponentImpl <em>Transport Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.TransportComponentImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getTransportComponent()
	 * @generated
	 */
	int TRANSPORT_COMPONENT = 11;

	/**
	 * The number of structural features of the '<em>Transport Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORT_COMPONENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.SessionComponentImpl <em>Session Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.SessionComponentImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getSessionComponent()
	 * @generated
	 */
	int SESSION_COMPONENT = 12;

	/**
	 * The number of structural features of the '<em>Session Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_COMPONENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.ClipSlotComponentImpl <em>Clip Slot Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.ClipSlotComponentImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getClipSlotComponent()
	 * @generated
	 */
	int CLIP_SLOT_COMPONENT = 13;

	/**
	 * The number of structural features of the '<em>Clip Slot Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIP_SLOT_COMPONENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.ChannelStripComponentImpl <em>Channel Strip Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.ChannelStripComponentImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getChannelStripComponent()
	 * @generated
	 */
	int CHANNEL_STRIP_COMPONENT = 14;

	/**
	 * The number of structural features of the '<em>Channel Strip Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_STRIP_COMPONENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.MixerComponentImpl <em>Mixer Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.MixerComponentImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getMixerComponent()
	 * @generated
	 */
	int MIXER_COMPONENT = 15;

	/**
	 * The number of structural features of the '<em>Mixer Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXER_COMPONENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.DeviceComponentImpl <em>Device Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.DeviceComponentImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getDeviceComponent()
	 * @generated
	 */
	int DEVICE_COMPONENT = 16;

	/**
	 * The number of structural features of the '<em>Device Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_COMPONENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.ButtonComponentImpl <em>Button Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.ButtonComponentImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getButtonComponent()
	 * @generated
	 */
	int BUTTON_COMPONENT = 17;

	/**
	 * The number of structural features of the '<em>Button Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_COMPONENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.ButtonMatrixElementImpl <em>Button Matrix Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.ButtonMatrixElementImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getButtonMatrixElement()
	 * @generated
	 */
	int BUTTON_MATRIX_ELEMENT = 18;

	/**
	 * The number of structural features of the '<em>Button Matrix Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_MATRIX_ELEMENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.SliderElementImpl <em>Slider Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.SliderElementImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getSliderElement()
	 * @generated
	 */
	int SLIDER_ELEMENT = 19;

	/**
	 * The number of structural features of the '<em>Slider Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLIDER_ELEMENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.EncoderElementImpl <em>Encoder Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.EncoderElementImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getEncoderElement()
	 * @generated
	 */
	int ENCODER_ELEMENT = 20;

	/**
	 * The number of structural features of the '<em>Encoder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODER_ELEMENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.RingedEcoderElementImpl <em>Ringed Ecoder Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.RingedEcoderElementImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getRingedEcoderElement()
	 * @generated
	 */
	int RINGED_ECODER_ELEMENT = 21;

	/**
	 * The number of structural features of the '<em>Ringed Ecoder Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RINGED_ECODER_ELEMENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.PhysicalDisplayElementImpl <em>Physical Display Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.PhysicalDisplayElementImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getPhysicalDisplayElement()
	 * @generated
	 */
	int PHYSICAL_DISPLAY_ELEMENT = 22;

	/**
	 * The number of structural features of the '<em>Physical Display Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_DISPLAY_ELEMENT_FEATURE_COUNT = CONTROL_SURFACE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.impl.MidiMapImpl <em>Midi Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.impl.MidiMapImpl
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getMidiMap()
	 * @generated
	 */
	int MIDI_MAP = 23;

	/**
	 * The number of structural features of the '<em>Midi Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_MAP_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.MASTER_CTRL <em>MASTER CTRL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.MASTER_CTRL
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getMASTER_CTRL()
	 * @generated
	 */
	int MASTER_CTRL = 24;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.TRACK_CONTROL <em>TRACK CONTROL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.TRACK_CONTROL
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getTRACK_CONTROL()
	 * @generated
	 */
	int TRACK_CONTROL = 25;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING <em>ABLETON OSC MAPPING</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getABLETON_OSC_MAPPING()
	 * @generated
	 */
	int ABLETON_OSC_MAPPING = 26;


	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Color
	 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 27;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.AbletonLive <em>Ableton Live</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ableton Live</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive
	 * @generated
	 */
	EClass getAbletonLive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getVer <em>Ver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ver</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getVer()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EAttribute getAbletonLive_Ver();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getTracks()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EReference getAbletonLive_Tracks();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getScenes()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EReference getAbletonLive_Scenes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clips</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getClips()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EReference getAbletonLive_Clips();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getCurrentScene <em>Current Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Scene</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getCurrentScene()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EReference getAbletonLive_CurrentScene();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getMasterTrack <em>Master Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Track</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getMasterTrack()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EReference getAbletonLive_MasterTrack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getState()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EAttribute getAbletonLive_State();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbletonLive#isOverdub <em>Overdub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overdub</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#isOverdub()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EAttribute getAbletonLive_Overdub();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getVolume()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EAttribute getAbletonLive_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getTime()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EAttribute getAbletonLive_Time();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getTempo()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EAttribute getAbletonLive_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbletonLive#isUbqtNotificationOn <em>Ubqt Notification On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ubqt Notification On</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#isUbqtNotificationOn()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EAttribute getAbletonLive_UbqtNotificationOn();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getControlSurfaces <em>Control Surfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Surfaces</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive#getControlSurfaces()
	 * @see #getAbletonLive()
	 * @generated
	 */
	EReference getAbletonLive_ControlSurfaces();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.LiveTrack <em>Live Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack
	 * @generated
	 */
	EClass getLiveTrack();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getTrackID()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getVolume()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getPan()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Pan();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getSolo <em>Solo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solo</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getSolo()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Solo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getSend()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Send();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getArm <em>Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arm</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getArm()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Arm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getMute <em>Mute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mute</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getMute()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Mute();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getDelay()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Delay();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getCoarse <em>Coarse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coarse</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getCoarse()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Coarse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getFine <em>Fine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fine</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getFine()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Fine();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getBeats <em>Beats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beats</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getBeats()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Beats();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getDevices()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EReference getLiveTrack_Devices();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getState()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_State();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clips</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getClips()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EReference getLiveTrack_Clips();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getTrackName <em>Track Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Name</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getTrackName()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_TrackName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getColor()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getLeftMeter <em>Left Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Meter</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getLeftMeter()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_LeftMeter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getRightMeter <em>Right Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Meter</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getRightMeter()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_RightMeter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getLastSeen <em>Last Seen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Seen</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getLastSeen()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EAttribute getLiveTrack_LastSeen();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack#getView()
	 * @see #getLiveTrack()
	 * @generated
	 */
	EReference getLiveTrack_View();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.LiveScene <em>Live Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Scene</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveScene
	 * @generated
	 */
	EClass getLiveScene();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveScene#getSceneID <em>Scene ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene ID</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveScene#getSceneID()
	 * @see #getLiveScene()
	 * @generated
	 */
	EAttribute getLiveScene_SceneID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveScene#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveScene#getMode()
	 * @see #getLiveScene()
	 * @generated
	 */
	EAttribute getLiveScene_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveScene#getSceneName <em>Scene Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Name</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveScene#getSceneName()
	 * @see #getLiveScene()
	 * @generated
	 */
	EAttribute getLiveScene_SceneName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveScene#getLastSeen <em>Last Seen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Seen</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveScene#getLastSeen()
	 * @see #getLiveScene()
	 * @generated
	 */
	EAttribute getLiveScene_LastSeen();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.LiveMaster <em>Live Master</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Master</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveMaster
	 * @generated
	 */
	EClass getLiveMaster();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.LiveMaster#getMasterDevices <em>Master Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Master Devices</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveMaster#getMasterDevices()
	 * @see #getLiveMaster()
	 * @generated
	 */
	EReference getLiveMaster_MasterDevices();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.LiveClip <em>Live Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Clip</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip
	 * @generated
	 */
	EClass getLiveClip();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getClipID()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_ClipID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipName <em>Clip Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip Name</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getClipName()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_ClipName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipState <em>Clip State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip State</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getClipState()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_ClipState();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getSizeX()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getSizeY()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_SizeY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getCoarse <em>Coarse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coarse</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getCoarse()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Coarse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getFine <em>Fine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fine</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getFine()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Fine();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getPosition()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Position();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getLength()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLoopStart <em>Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Start</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getLoopStart()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_LoopStart();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLoopEnd <em>Loop End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop End</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getLoopEnd()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_LoopEnd();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezabletonctrl.LiveClip#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Track</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getTrack()
	 * @see #getLiveClip()
	 * @generated
	 */
	EReference getLiveClip_Track();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLastSeen <em>Last Seen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Seen</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getLastSeen()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_LastSeen();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsAudioClip <em>Is Audio Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Audio Clip</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#isIsAudioClip()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_IsAudioClip();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsMidiClip <em>Is Midi Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Midi Clip</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#isIsMidiClip()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_IsMidiClip();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsTriggered <em>Is Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Triggered</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#isIsTriggered()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_IsTriggered();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getPlayingStatus <em>Playing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Playing Status</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getPlayingStatus()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_PlayingStatus();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#isNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#isNotes()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Notes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSignature_denominator <em>Signature denominator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature denominator</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getSignature_denominator()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Signature_denominator();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSignature_numerator <em>Signature numerator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature numerator</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getSignature_numerator()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Signature_numerator();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#isWarping <em>Warping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warping</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#isWarping()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Warping();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#isWill_recording_on_start <em>Will recording on start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Will recording on start</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#isWill_recording_on_start()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Will_recording_on_start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveClip#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip#getColor()
	 * @see #getLiveClip()
	 * @generated
	 */
	EAttribute getLiveClip_Color();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice <em>Abstract Live Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Live Device</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice
	 * @generated
	 */
	EClass getAbstractLiveDevice();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getDeviceName()
	 * @see #getAbstractLiveDevice()
	 * @generated
	 */
	EAttribute getAbstractLiveDevice_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getDeviceID()
	 * @see #getAbstractLiveDevice()
	 * @generated
	 */
	EAttribute getAbstractLiveDevice_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getLastSeen <em>Last Seen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Seen</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getLastSeen()
	 * @see #getAbstractLiveDevice()
	 * @generated
	 */
	EAttribute getAbstractLiveDevice_LastSeen();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice#getParameters()
	 * @see #getAbstractLiveDevice()
	 * @generated
	 */
	EReference getAbstractLiveDevice_Parameters();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.PlaceHolderDevice <em>Place Holder Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place Holder Device</em>'.
	 * @see net.sf.smbt.ezabletonctrl.PlaceHolderDevice
	 * @generated
	 */
	EClass getPlaceHolderDevice();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.LiveParam <em>Live Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Param</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam
	 * @generated
	 */
	EClass getLiveParam();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveParam#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam#getKey()
	 * @see #getLiveParam()
	 * @generated
	 */
	EAttribute getLiveParam_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam#getValue()
	 * @see #getLiveParam()
	 * @generated
	 */
	EAttribute getLiveParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveParam#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam#getMin()
	 * @see #getLiveParam()
	 * @generated
	 */
	EAttribute getLiveParam_Min();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveParam#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam#getMax()
	 * @see #getLiveParam()
	 * @generated
	 */
	EAttribute getLiveParam_Max();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam#getType()
	 * @see #getLiveParam()
	 * @generated
	 */
	EAttribute getLiveParam_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezabletonctrl.LiveParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam#getName()
	 * @see #getLiveParam()
	 * @generated
	 */
	EAttribute getLiveParam_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice <em>Abstract Mixer Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mixer Device</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractMixerDevice
	 * @generated
	 */
	EClass getAbstractMixerDevice();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volume</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getVolume()
	 * @see #getAbstractMixerDevice()
	 * @generated
	 */
	EReference getAbstractMixerDevice_Volume();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getPanning <em>Panning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Panning</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getPanning()
	 * @see #getAbstractMixerDevice()
	 * @generated
	 */
	EReference getAbstractMixerDevice_Panning();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getSends <em>Sends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sends</em>'.
	 * @see net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getSends()
	 * @see #getAbstractMixerDevice()
	 * @generated
	 */
	EReference getAbstractMixerDevice_Sends();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.LiveTrackView <em>Live Track View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track View</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrackView
	 * @generated
	 */
	EClass getLiveTrackView();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezabletonctrl.LiveTrackView#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrackView#getDevice()
	 * @see #getLiveTrackView()
	 * @generated
	 */
	EReference getLiveTrackView_Device();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.ControlSurface <em>Control Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Surface</em>'.
	 * @see net.sf.smbt.ezabletonctrl.ControlSurface
	 * @generated
	 */
	EClass getControlSurface();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.TransportComponent <em>Transport Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Component</em>'.
	 * @see net.sf.smbt.ezabletonctrl.TransportComponent
	 * @generated
	 */
	EClass getTransportComponent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.SessionComponent <em>Session Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Component</em>'.
	 * @see net.sf.smbt.ezabletonctrl.SessionComponent
	 * @generated
	 */
	EClass getSessionComponent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.ClipSlotComponent <em>Clip Slot Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clip Slot Component</em>'.
	 * @see net.sf.smbt.ezabletonctrl.ClipSlotComponent
	 * @generated
	 */
	EClass getClipSlotComponent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.ChannelStripComponent <em>Channel Strip Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Strip Component</em>'.
	 * @see net.sf.smbt.ezabletonctrl.ChannelStripComponent
	 * @generated
	 */
	EClass getChannelStripComponent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.MixerComponent <em>Mixer Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixer Component</em>'.
	 * @see net.sf.smbt.ezabletonctrl.MixerComponent
	 * @generated
	 */
	EClass getMixerComponent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.DeviceComponent <em>Device Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Component</em>'.
	 * @see net.sf.smbt.ezabletonctrl.DeviceComponent
	 * @generated
	 */
	EClass getDeviceComponent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.ButtonComponent <em>Button Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Component</em>'.
	 * @see net.sf.smbt.ezabletonctrl.ButtonComponent
	 * @generated
	 */
	EClass getButtonComponent();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.ButtonMatrixElement <em>Button Matrix Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Matrix Element</em>'.
	 * @see net.sf.smbt.ezabletonctrl.ButtonMatrixElement
	 * @generated
	 */
	EClass getButtonMatrixElement();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.SliderElement <em>Slider Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slider Element</em>'.
	 * @see net.sf.smbt.ezabletonctrl.SliderElement
	 * @generated
	 */
	EClass getSliderElement();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.EncoderElement <em>Encoder Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoder Element</em>'.
	 * @see net.sf.smbt.ezabletonctrl.EncoderElement
	 * @generated
	 */
	EClass getEncoderElement();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.RingedEcoderElement <em>Ringed Ecoder Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ringed Ecoder Element</em>'.
	 * @see net.sf.smbt.ezabletonctrl.RingedEcoderElement
	 * @generated
	 */
	EClass getRingedEcoderElement();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.PhysicalDisplayElement <em>Physical Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Display Element</em>'.
	 * @see net.sf.smbt.ezabletonctrl.PhysicalDisplayElement
	 * @generated
	 */
	EClass getPhysicalDisplayElement();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezabletonctrl.MidiMap <em>Midi Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Map</em>'.
	 * @see net.sf.smbt.ezabletonctrl.MidiMap
	 * @generated
	 */
	EClass getMidiMap();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezabletonctrl.MASTER_CTRL <em>MASTER CTRL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MASTER CTRL</em>'.
	 * @see net.sf.smbt.ezabletonctrl.MASTER_CTRL
	 * @generated
	 */
	EEnum getMASTER_CTRL();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezabletonctrl.TRACK_CONTROL <em>TRACK CONTROL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRACK CONTROL</em>'.
	 * @see net.sf.smbt.ezabletonctrl.TRACK_CONTROL
	 * @generated
	 */
	EEnum getTRACK_CONTROL();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING <em>ABLETON OSC MAPPING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ABLETON OSC MAPPING</em>'.
	 * @see net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING
	 * @generated
	 */
	EEnum getABLETON_OSC_MAPPING();

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
	EzabletonctrlFactory getEzabletonctrlFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl <em>Ableton Live</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getAbletonLive()
		 * @generated
		 */
		EClass ABLETON_LIVE = eINSTANCE.getAbletonLive();

		/**
		 * The meta object literal for the '<em><b>Ver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABLETON_LIVE__VER = eINSTANCE.getAbletonLive_Ver();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLETON_LIVE__TRACKS = eINSTANCE.getAbletonLive_Tracks();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLETON_LIVE__SCENES = eINSTANCE.getAbletonLive_Scenes();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLETON_LIVE__CLIPS = eINSTANCE.getAbletonLive_Clips();

		/**
		 * The meta object literal for the '<em><b>Current Scene</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLETON_LIVE__CURRENT_SCENE = eINSTANCE.getAbletonLive_CurrentScene();

		/**
		 * The meta object literal for the '<em><b>Master Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLETON_LIVE__MASTER_TRACK = eINSTANCE.getAbletonLive_MasterTrack();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABLETON_LIVE__STATE = eINSTANCE.getAbletonLive_State();

		/**
		 * The meta object literal for the '<em><b>Overdub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABLETON_LIVE__OVERDUB = eINSTANCE.getAbletonLive_Overdub();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABLETON_LIVE__VOLUME = eINSTANCE.getAbletonLive_Volume();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABLETON_LIVE__TIME = eINSTANCE.getAbletonLive_Time();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABLETON_LIVE__TEMPO = eINSTANCE.getAbletonLive_Tempo();

		/**
		 * The meta object literal for the '<em><b>Ubqt Notification On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABLETON_LIVE__UBQT_NOTIFICATION_ON = eINSTANCE.getAbletonLive_UbqtNotificationOn();

		/**
		 * The meta object literal for the '<em><b>Control Surfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABLETON_LIVE__CONTROL_SURFACES = eINSTANCE.getAbletonLive_ControlSurfaces();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl <em>Live Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveTrack()
		 * @generated
		 */
		EClass LIVE_TRACK = eINSTANCE.getLiveTrack();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__TRACK_ID = eINSTANCE.getLiveTrack_TrackID();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__VOLUME = eINSTANCE.getLiveTrack_Volume();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__PAN = eINSTANCE.getLiveTrack_Pan();

		/**
		 * The meta object literal for the '<em><b>Solo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__SOLO = eINSTANCE.getLiveTrack_Solo();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__SEND = eINSTANCE.getLiveTrack_Send();

		/**
		 * The meta object literal for the '<em><b>Arm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__ARM = eINSTANCE.getLiveTrack_Arm();

		/**
		 * The meta object literal for the '<em><b>Mute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__MUTE = eINSTANCE.getLiveTrack_Mute();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__DELAY = eINSTANCE.getLiveTrack_Delay();

		/**
		 * The meta object literal for the '<em><b>Coarse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__COARSE = eINSTANCE.getLiveTrack_Coarse();

		/**
		 * The meta object literal for the '<em><b>Fine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__FINE = eINSTANCE.getLiveTrack_Fine();

		/**
		 * The meta object literal for the '<em><b>Beats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__BEATS = eINSTANCE.getLiveTrack_Beats();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVE_TRACK__DEVICES = eINSTANCE.getLiveTrack_Devices();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__STATE = eINSTANCE.getLiveTrack_State();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVE_TRACK__CLIPS = eINSTANCE.getLiveTrack_Clips();

		/**
		 * The meta object literal for the '<em><b>Track Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__TRACK_NAME = eINSTANCE.getLiveTrack_TrackName();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__COLOR = eINSTANCE.getLiveTrack_Color();

		/**
		 * The meta object literal for the '<em><b>Left Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__LEFT_METER = eINSTANCE.getLiveTrack_LeftMeter();

		/**
		 * The meta object literal for the '<em><b>Right Meter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__RIGHT_METER = eINSTANCE.getLiveTrack_RightMeter();

		/**
		 * The meta object literal for the '<em><b>Last Seen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK__LAST_SEEN = eINSTANCE.getLiveTrack_LastSeen();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVE_TRACK__VIEW = eINSTANCE.getLiveTrack_View();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl <em>Live Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveScene()
		 * @generated
		 */
		EClass LIVE_SCENE = eINSTANCE.getLiveScene();

		/**
		 * The meta object literal for the '<em><b>Scene ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENE__SCENE_ID = eINSTANCE.getLiveScene_SceneID();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENE__MODE = eINSTANCE.getLiveScene_Mode();

		/**
		 * The meta object literal for the '<em><b>Scene Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENE__SCENE_NAME = eINSTANCE.getLiveScene_SceneName();

		/**
		 * The meta object literal for the '<em><b>Last Seen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENE__LAST_SEEN = eINSTANCE.getLiveScene_LastSeen();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveMasterImpl <em>Live Master</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.LiveMasterImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveMaster()
		 * @generated
		 */
		EClass LIVE_MASTER = eINSTANCE.getLiveMaster();

		/**
		 * The meta object literal for the '<em><b>Master Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVE_MASTER__MASTER_DEVICES = eINSTANCE.getLiveMaster_MasterDevices();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl <em>Live Clip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.LiveClipImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveClip()
		 * @generated
		 */
		EClass LIVE_CLIP = eINSTANCE.getLiveClip();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__CLIP_ID = eINSTANCE.getLiveClip_ClipID();

		/**
		 * The meta object literal for the '<em><b>Clip Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__CLIP_NAME = eINSTANCE.getLiveClip_ClipName();

		/**
		 * The meta object literal for the '<em><b>Clip State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__CLIP_STATE = eINSTANCE.getLiveClip_ClipState();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__SIZE_X = eINSTANCE.getLiveClip_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__SIZE_Y = eINSTANCE.getLiveClip_SizeY();

		/**
		 * The meta object literal for the '<em><b>Coarse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__COARSE = eINSTANCE.getLiveClip_Coarse();

		/**
		 * The meta object literal for the '<em><b>Fine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__FINE = eINSTANCE.getLiveClip_Fine();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__POSITION = eINSTANCE.getLiveClip_Position();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__LENGTH = eINSTANCE.getLiveClip_Length();

		/**
		 * The meta object literal for the '<em><b>Loop Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__LOOP_START = eINSTANCE.getLiveClip_LoopStart();

		/**
		 * The meta object literal for the '<em><b>Loop End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__LOOP_END = eINSTANCE.getLiveClip_LoopEnd();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVE_CLIP__TRACK = eINSTANCE.getLiveClip_Track();

		/**
		 * The meta object literal for the '<em><b>Last Seen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__LAST_SEEN = eINSTANCE.getLiveClip_LastSeen();

		/**
		 * The meta object literal for the '<em><b>Is Audio Clip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__IS_AUDIO_CLIP = eINSTANCE.getLiveClip_IsAudioClip();

		/**
		 * The meta object literal for the '<em><b>Is Midi Clip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__IS_MIDI_CLIP = eINSTANCE.getLiveClip_IsMidiClip();

		/**
		 * The meta object literal for the '<em><b>Is Triggered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__IS_TRIGGERED = eINSTANCE.getLiveClip_IsTriggered();

		/**
		 * The meta object literal for the '<em><b>Playing Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__PLAYING_STATUS = eINSTANCE.getLiveClip_PlayingStatus();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__NOTES = eINSTANCE.getLiveClip_Notes();

		/**
		 * The meta object literal for the '<em><b>Signature denominator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__SIGNATURE_DENOMINATOR = eINSTANCE.getLiveClip_Signature_denominator();

		/**
		 * The meta object literal for the '<em><b>Signature numerator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__SIGNATURE_NUMERATOR = eINSTANCE.getLiveClip_Signature_numerator();

		/**
		 * The meta object literal for the '<em><b>Warping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__WARPING = eINSTANCE.getLiveClip_Warping();

		/**
		 * The meta object literal for the '<em><b>Will recording on start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__WILL_RECORDING_ON_START = eINSTANCE.getLiveClip_Will_recording_on_start();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP__COLOR = eINSTANCE.getLiveClip_Color();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice <em>Abstract Live Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getAbstractLiveDevice()
		 * @generated
		 */
		EClass ABSTRACT_LIVE_DEVICE = eINSTANCE.getAbstractLiveDevice();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LIVE_DEVICE__DEVICE_NAME = eINSTANCE.getAbstractLiveDevice_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LIVE_DEVICE__DEVICE_ID = eINSTANCE.getAbstractLiveDevice_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Last Seen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_LIVE_DEVICE__LAST_SEEN = eINSTANCE.getAbstractLiveDevice_LastSeen();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_LIVE_DEVICE__PARAMETERS = eINSTANCE.getAbstractLiveDevice_Parameters();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl <em>Place Holder Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getPlaceHolderDevice()
		 * @generated
		 */
		EClass PLACE_HOLDER_DEVICE = eINSTANCE.getPlaceHolderDevice();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl <em>Live Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.LiveParamImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveParam()
		 * @generated
		 */
		EClass LIVE_PARAM = eINSTANCE.getLiveParam();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PARAM__KEY = eINSTANCE.getLiveParam_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PARAM__VALUE = eINSTANCE.getLiveParam_Value();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PARAM__MIN = eINSTANCE.getLiveParam_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PARAM__MAX = eINSTANCE.getLiveParam_Max();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PARAM__TYPE = eINSTANCE.getLiveParam_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PARAM__NAME = eINSTANCE.getLiveParam_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.AbstractMixerDeviceImpl <em>Abstract Mixer Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.AbstractMixerDeviceImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getAbstractMixerDevice()
		 * @generated
		 */
		EClass ABSTRACT_MIXER_DEVICE = eINSTANCE.getAbstractMixerDevice();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MIXER_DEVICE__VOLUME = eINSTANCE.getAbstractMixerDevice_Volume();

		/**
		 * The meta object literal for the '<em><b>Panning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MIXER_DEVICE__PANNING = eINSTANCE.getAbstractMixerDevice_Panning();

		/**
		 * The meta object literal for the '<em><b>Sends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MIXER_DEVICE__SENDS = eINSTANCE.getAbstractMixerDevice_Sends();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackViewImpl <em>Live Track View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.LiveTrackViewImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getLiveTrackView()
		 * @generated
		 */
		EClass LIVE_TRACK_VIEW = eINSTANCE.getLiveTrackView();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIVE_TRACK_VIEW__DEVICE = eINSTANCE.getLiveTrackView_Device();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.ControlSurfaceImpl <em>Control Surface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.ControlSurfaceImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getControlSurface()
		 * @generated
		 */
		EClass CONTROL_SURFACE = eINSTANCE.getControlSurface();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.TransportComponentImpl <em>Transport Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.TransportComponentImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getTransportComponent()
		 * @generated
		 */
		EClass TRANSPORT_COMPONENT = eINSTANCE.getTransportComponent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.SessionComponentImpl <em>Session Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.SessionComponentImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getSessionComponent()
		 * @generated
		 */
		EClass SESSION_COMPONENT = eINSTANCE.getSessionComponent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.ClipSlotComponentImpl <em>Clip Slot Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.ClipSlotComponentImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getClipSlotComponent()
		 * @generated
		 */
		EClass CLIP_SLOT_COMPONENT = eINSTANCE.getClipSlotComponent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.ChannelStripComponentImpl <em>Channel Strip Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.ChannelStripComponentImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getChannelStripComponent()
		 * @generated
		 */
		EClass CHANNEL_STRIP_COMPONENT = eINSTANCE.getChannelStripComponent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.MixerComponentImpl <em>Mixer Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.MixerComponentImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getMixerComponent()
		 * @generated
		 */
		EClass MIXER_COMPONENT = eINSTANCE.getMixerComponent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.DeviceComponentImpl <em>Device Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.DeviceComponentImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getDeviceComponent()
		 * @generated
		 */
		EClass DEVICE_COMPONENT = eINSTANCE.getDeviceComponent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.ButtonComponentImpl <em>Button Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.ButtonComponentImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getButtonComponent()
		 * @generated
		 */
		EClass BUTTON_COMPONENT = eINSTANCE.getButtonComponent();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.ButtonMatrixElementImpl <em>Button Matrix Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.ButtonMatrixElementImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getButtonMatrixElement()
		 * @generated
		 */
		EClass BUTTON_MATRIX_ELEMENT = eINSTANCE.getButtonMatrixElement();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.SliderElementImpl <em>Slider Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.SliderElementImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getSliderElement()
		 * @generated
		 */
		EClass SLIDER_ELEMENT = eINSTANCE.getSliderElement();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.EncoderElementImpl <em>Encoder Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.EncoderElementImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getEncoderElement()
		 * @generated
		 */
		EClass ENCODER_ELEMENT = eINSTANCE.getEncoderElement();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.RingedEcoderElementImpl <em>Ringed Ecoder Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.RingedEcoderElementImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getRingedEcoderElement()
		 * @generated
		 */
		EClass RINGED_ECODER_ELEMENT = eINSTANCE.getRingedEcoderElement();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.PhysicalDisplayElementImpl <em>Physical Display Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.PhysicalDisplayElementImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getPhysicalDisplayElement()
		 * @generated
		 */
		EClass PHYSICAL_DISPLAY_ELEMENT = eINSTANCE.getPhysicalDisplayElement();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.impl.MidiMapImpl <em>Midi Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.impl.MidiMapImpl
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getMidiMap()
		 * @generated
		 */
		EClass MIDI_MAP = eINSTANCE.getMidiMap();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.MASTER_CTRL <em>MASTER CTRL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.MASTER_CTRL
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getMASTER_CTRL()
		 * @generated
		 */
		EEnum MASTER_CTRL = eINSTANCE.getMASTER_CTRL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.TRACK_CONTROL <em>TRACK CONTROL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.TRACK_CONTROL
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getTRACK_CONTROL()
		 * @generated
		 */
		EEnum TRACK_CONTROL = eINSTANCE.getTRACK_CONTROL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING <em>ABLETON OSC MAPPING</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getABLETON_OSC_MAPPING()
		 * @generated
		 */
		EEnum ABLETON_OSC_MAPPING = eINSTANCE.getABLETON_OSC_MAPPING();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Color
		 * @see net.sf.smbt.ezabletonctrl.impl.EzabletonctrlPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

	}

} //EzabletonctrlPackage
