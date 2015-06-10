/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see net.sf.smbt.ezableton.EzabletonFactory
 * @model kind="package"
 * @generated
 */
public interface EzabletonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezableton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezableton/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezableton";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzabletonPackage eINSTANCE = net.sf.smbt.ezableton.impl.EzabletonPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.AbletonLiveSndCmdImpl <em>Ableton Live Snd Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.AbletonLiveSndCmdImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getAbletonLiveSndCmd()
	 * @generated
	 */
	int ABLETON_LIVE_SND_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE_SND_CMD__PRIORITY = OsccmdPackage.OSC_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE_SND_CMD__STAMP = OsccmdPackage.OSC_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE_SND_CMD__MSG = OsccmdPackage.OSC_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Ableton Live Snd Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABLETON_LIVE_SND_CMD_FEATURE_COUNT = OsccmdPackage.OSC_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTempoReqImpl <em>Live Tempo Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTempoReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTempoReq()
	 * @generated
	 */
	int LIVE_TEMPO_REQ = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Tempo Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTempoRcvImpl <em>Live Tempo Rcv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTempoRcvImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTempoRcv()
	 * @generated
	 */
	int LIVE_TEMPO_RCV = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_RCV__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_RCV__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_RCV__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_RCV__TEMPO = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Tempo Rcv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TEMPO_RCV_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTimeReqImpl <em>Live Time Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTimeReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTimeReq()
	 * @generated
	 */
	int LIVE_TIME_REQ = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Time Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTimeRcvImpl <em>Live Time Rcv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTimeRcvImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTimeRcv()
	 * @generated
	 */
	int LIVE_TIME_RCV = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_RCV__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_RCV__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_RCV__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_RCV__TIME = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Time Rcv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TIME_RCV_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveOverdubImpl <em>Live Overdub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveOverdubImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveOverdub()
	 * @generated
	 */
	int LIVE_OVERDUB = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_OVERDUB__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_OVERDUB__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_OVERDUB__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_OVERDUB__STATE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Overdub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_OVERDUB_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveStateReqImpl <em>Live State Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveStateReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStateReq()
	 * @generated
	 */
	int LIVE_STATE_REQ = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live State Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveStateRcvImpl <em>Live State Rcv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveStateRcvImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStateRcv()
	 * @generated
	 */
	int LIVE_STATE_RCV = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_RCV__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_RCV__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_RCV__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_RCV__TEMPO = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overdub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_RCV__OVERDUB = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live State Rcv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STATE_RCV_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveUndoReqImpl <em>Live Undo Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveUndoReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveUndoReq()
	 * @generated
	 */
	int LIVE_UNDO_REQ = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_UNDO_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_UNDO_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_UNDO_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Undo Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_UNDO_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveRedoReqImpl <em>Live Redo Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveRedoReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveRedoReq()
	 * @generated
	 */
	int LIVE_REDO_REQ = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_REDO_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_REDO_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_REDO_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Redo Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_REDO_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNextCueReqImpl <em>Live Next Cue Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNextCueReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNextCueReq()
	 * @generated
	 */
	int LIVE_NEXT_CUE_REQ = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NEXT_CUE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NEXT_CUE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NEXT_CUE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Next Cue Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NEXT_CUE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePrevCueReqImpl <em>Live Prev Cue Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePrevCueReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePrevCueReq()
	 * @generated
	 */
	int LIVE_PREV_CUE_REQ = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PREV_CUE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PREV_CUE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PREV_CUE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Prev Cue Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PREV_CUE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePlayReqImpl <em>Live Play Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePlayReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayReq()
	 * @generated
	 */
	int LIVE_PLAY_REQ = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Play Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePlayContinueReqImpl <em>Live Play Continue Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePlayContinueReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayContinueReq()
	 * @generated
	 */
	int LIVE_PLAY_CONTINUE_REQ = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CONTINUE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CONTINUE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CONTINUE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Play Continue Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CONTINUE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePlayClipReqImpl <em>Live Play Clip Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePlayClipReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayClipReq()
	 * @generated
	 */
	int LIVE_PLAY_CLIP_REQ = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Play Clip Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.livePlaySelectionReqImpl <em>live Play Selection Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.livePlaySelectionReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getlivePlaySelectionReq()
	 * @generated
	 */
	int LIVE_PLAY_SELECTION_REQ = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SELECTION_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SELECTION_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SELECTION_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>live Play Selection Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SELECTION_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePlayClipSlotReqImpl <em>Live Play Clip Slot Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePlayClipSlotReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayClipSlotReq()
	 * @generated
	 */
	int LIVE_PLAY_CLIP_SLOT_REQ = 16;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_SLOT_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_SLOT_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_SLOT_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_SLOT_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_SLOT_REQ__CLIP_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Play Clip Slot Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_CLIP_SLOT_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePlaySceneReqImpl <em>Live Play Scene Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePlaySceneReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlaySceneReq()
	 * @generated
	 */
	int LIVE_PLAY_SCENE_REQ = 17;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SCENE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SCENE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SCENE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Scene ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SCENE_REQ__SCENE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Play Scene Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_SCENE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveStopReqImpl <em>Live Stop Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveStopReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStopReq()
	 * @generated
	 */
	int LIVE_STOP_REQ = 18;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Stop Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveStopClipReqImpl <em>Live Stop Clip Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveStopClipReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStopClipReq()
	 * @generated
	 */
	int LIVE_STOP_CLIP_REQ = 19;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_CLIP_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_CLIP_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_CLIP_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_CLIP_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_CLIP_REQ__CLIP_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Stop Clip Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_CLIP_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveStopTrackReqImpl <em>Live Stop Track Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveStopTrackReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStopTrackReq()
	 * @generated
	 */
	int LIVE_STOP_TRACK_REQ = 20;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_TRACK_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_TRACK_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_TRACK_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_TRACK_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Stop Track Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_STOP_TRACK_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveScenesReqImpl <em>Live Scenes Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveScenesReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveScenesReq()
	 * @generated
	 */
	int LIVE_SCENES_REQ = 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Scenes Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTracksReqImpl <em>Live Tracks Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTracksReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTracksReq()
	 * @generated
	 */
	int LIVE_TRACKS_REQ = 22;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Tracks Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveSceneReqImpl <em>Live Scene Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveSceneReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveSceneReq()
	 * @generated
	 */
	int LIVE_SCENE_REQ = 23;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE_REQ__MODE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scene ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE_REQ__SCENE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Scene Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameSceneBlockReqImpl <em>Live Name Scene Block Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameSceneBlockReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameSceneBlockReq()
	 * @generated
	 */
	int LIVE_NAME_SCENE_BLOCK_REQ = 24;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_BLOCK_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_BLOCK_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_BLOCK_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_BLOCK_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_BLOCK_REQ__SIZE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Name Scene Block Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_BLOCK_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameTrackReqImpl <em>Live Name Track Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameTrackReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameTrackReq()
	 * @generated
	 */
	int LIVE_NAME_TRACK_REQ = 25;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_REQ__TRACK_NAME = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_REQ__COLOR = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Name Track Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameTrackblockReqImpl <em>Live Name Trackblock Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameTrackblockReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameTrackblockReq()
	 * @generated
	 */
	int LIVE_NAME_TRACKBLOCK_REQ = 26;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACKBLOCK_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACKBLOCK_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACKBLOCK_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACKBLOCK_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACKBLOCK_REQ__SIZE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Track Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACKBLOCK_REQ__TRACK_NAME = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Name Trackblock Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACKBLOCK_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameClipReqImpl <em>Live Name Clip Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameClipReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameClipReq()
	 * @generated
	 */
	int LIVE_NAME_CLIP_REQ = 27;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ__CLIP_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ__LABEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ__COLOR = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Live Name Clip Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl <em>Live Name Clipblockreq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameClipblockreq()
	 * @generated
	 */
	int LIVE_NAME_CLIPBLOCKREQ = 28;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ__CLIP_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ__SIZE_X = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ__SIZE_Y = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Live Name Clipblockreq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIPBLOCKREQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveArmReqImpl <em>Live Arm Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveArmReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveArmReq()
	 * @generated
	 */
	int LIVE_ARM_REQ = 29;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_ARM_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_ARM_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_ARM_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_ARM_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_ARM_REQ__STATUS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Arm Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_ARM_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveMuteReqImpl <em>Live Mute Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveMuteReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMuteReq()
	 * @generated
	 */
	int LIVE_MUTE_REQ = 30;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MUTE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MUTE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MUTE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MUTE_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MUTE_REQ__STATUS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Mute Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MUTE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveVolumeSetImpl <em>Live Volume Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveVolumeSetImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveVolumeSet()
	 * @generated
	 */
	int LIVE_VOLUME_SET = 31;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME_SET__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME_SET__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME_SET__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME_SET__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME_SET__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Volume Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME_SET_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePanSetImpl <em>Live Pan Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePanSetImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePanSet()
	 * @generated
	 */
	int LIVE_PAN_SET = 32;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PAN_SET__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PAN_SET__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PAN_SET__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PAN_SET__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PAN_SET__VALUE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Pan Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PAN_SET_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveSendReqImpl <em>Live Send Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveSendReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveSendReq()
	 * @generated
	 */
	int LIVE_SEND_REQ = 33;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SEND_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SEND_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SEND_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SEND_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SEND_REQ__VALUE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Send Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SEND_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePitchSetImpl <em>Live Pitch Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePitchSetImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePitchSet()
	 * @generated
	 */
	int LIVE_PITCH_SET = 34;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET__CLIP = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coarse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET__COARSE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET__FINE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Live Pitch Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PITCH_SET_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnMuteReqImpl <em>Live Return Mute Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnMuteReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnMuteReq()
	 * @generated
	 */
	int LIVE_RETURN_MUTE_REQ = 35;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_MUTE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_MUTE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_MUTE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_MUTE_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_MUTE_REQ__STATUS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Mute Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_MUTE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnSoloImpl <em>Live Return Solo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnSoloImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnSolo()
	 * @generated
	 */
	int LIVE_RETURN_SOLO = 55;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnVolumeReqImpl <em>Live Return Volume Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnVolumeReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnVolumeReq()
	 * @generated
	 */
	int LIVE_RETURN_VOLUME_REQ = 36;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME_REQ__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Volume Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnPanReqImpl <em>Live Return Pan Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnPanReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnPanReq()
	 * @generated
	 */
	int LIVE_RETURN_PAN_REQ = 37;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN_REQ__PAN = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Pan Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnSendReqImpl <em>Live Return Send Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnSendReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnSendReq()
	 * @generated
	 */
	int LIVE_RETURN_SEND_REQ = 38;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_REQ__SEND = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_REQ__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Return Send Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveMasterVolumeReqImpl <em>Live Master Volume Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveMasterVolumeReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterVolumeReq()
	 * @generated
	 */
	int LIVE_MASTER_VOLUME_REQ = 39;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME_REQ__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Master Volume Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveMasterPanReqImpl <em>Live Master Pan Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveMasterPanReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterPanReq()
	 * @generated
	 */
	int LIVE_MASTER_PAN_REQ = 40;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_PAN_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_PAN_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_PAN_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_PAN_REQ__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_PAN_REQ__PAN = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Master Pan Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_PAN_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackJumpImpl <em>Live Track Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackJumpImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackJump()
	 * @generated
	 */
	int LIVE_TRACK_JUMP = 41;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_JUMP__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_JUMP__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_JUMP__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_JUMP__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_JUMP__BEATS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_JUMP_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackInfoImpl <em>Live Track Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackInfoImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackInfo()
	 * @generated
	 */
	int LIVE_TRACK_INFO = 42;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_INFO__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_INFO__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_INFO__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_INFO__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Track Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_INFO_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackDeviceViewImpl <em>Live Track Device View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackDeviceViewImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackDeviceView()
	 * @generated
	 */
	int LIVE_TRACK_DEVICE_VIEW = 43;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_DEVICE_VIEW__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_DEVICE_VIEW__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_DEVICE_VIEW__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_DEVICE_VIEW__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_DEVICE_VIEW__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Device View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_DEVICE_VIEW_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceViewImpl <em>Live Return Device View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceViewImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceView()
	 * @generated
	 */
	int LIVE_RETURN_DEVICE_VIEW = 44;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_VIEW__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_VIEW__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_VIEW__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_VIEW__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_VIEW__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Device View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_VIEW_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveMasterDeviceViewImpl <em>Live Master Device View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveMasterDeviceViewImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterDeviceView()
	 * @generated
	 */
	int LIVE_MASTER_DEVICE_VIEW = 45;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_DEVICE_VIEW__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_DEVICE_VIEW__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_DEVICE_VIEW__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_DEVICE_VIEW__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Master Device View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_DEVICE_VIEW_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDetailViewImpl <em>Live Detail View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDetailViewImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDetailView()
	 * @generated
	 */
	int LIVE_DETAIL_VIEW = 46;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DETAIL_VIEW__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DETAIL_VIEW__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DETAIL_VIEW__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DETAIL_VIEW__VALUE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Detail View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DETAIL_VIEW_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveClipInfoImpl <em>Live Clip Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveClipInfoImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveClipInfo()
	 * @generated
	 */
	int LIVE_CLIP_INFO = 47;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_INFO__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_INFO__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_INFO__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_INFO__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_INFO__STATUS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_INFO__CLIP_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Clip Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_INFO_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDevicelistImpl <em>Live Devicelist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDevicelistImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDevicelist()
	 * @generated
	 */
	int LIVE_DEVICELIST = 48;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICELIST__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICELIST__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICELIST__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICELIST__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Devicelist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICELIST_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceImpl <em>Live Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDevice()
	 * @generated
	 */
	int LIVE_DEVICE = 49;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE__PARAM = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE__S = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Live Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDevicelistImpl <em>Live Return Devicelist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnDevicelistImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDevicelist()
	 * @generated
	 */
	int LIVE_RETURN_DEVICELIST = 50;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICELIST__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICELIST__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICELIST__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICELIST__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Return Devicelist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICELIST_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnVolumeImpl <em>Live Return Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnVolumeImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnVolume()
	 * @generated
	 */
	int LIVE_RETURN_VOLUME = 51;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_VOLUME_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnPanImpl <em>Live Return Pan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnPanImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnPan()
	 * @generated
	 */
	int LIVE_RETURN_PAN = 52;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN__PAN = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Pan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_PAN_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnSendImpl <em>Live Return Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnSendImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnSend()
	 * @generated
	 */
	int LIVE_RETURN_SEND = 53;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND__SEND = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Return Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SEND_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveMasterVolumeImpl <em>Live Master Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveMasterVolumeImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterVolume()
	 * @generated
	 */
	int LIVE_MASTER_VOLUME = 54;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Master Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_VOLUME_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SOLO__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SOLO__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SOLO__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SOLO__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SOLO__STATUS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Solo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_SOLO_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceViewImpl <em>Live Device View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceViewImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceView()
	 * @generated
	 */
	int LIVE_DEVICE_VIEW = 56;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_VIEW__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_VIEW__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_VIEW__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_VIEW__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_VIEW__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Device View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_VIEW_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveMasterMeterImpl <em>Live Master Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveMasterMeterImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterMeter()
	 * @generated
	 */
	int LIVE_MASTER_METER = 57;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_METER__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_METER__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_METER__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_METER__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Which</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_METER__WHICH = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Master Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_MASTER_METER_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl <em>Live Clip Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveClipPositionImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveClipPosition()
	 * @generated
	 */
	int LIVE_CLIP_POSITION = 58;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__CLIP_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__POSITION = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__LENGTH = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__LOOP_START = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Loop End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION__LOOP_END = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Live Clip Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_CLIP_POSITION_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackMeterImpl <em>Live Track Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackMeterImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackMeter()
	 * @generated
	 */
	int LIVE_TRACK_METER = 59;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_METER__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_METER__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_METER__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_METER__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Which</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_METER__WHICH = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_METER__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Track Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_METER_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameTrackQImpl <em>Live Name Track Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameTrackQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameTrackQ()
	 * @generated
	 */
	int LIVE_NAME_TRACK_Q = 60;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Name Track Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_TRACK_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameSceneQImpl <em>Live Name Scene Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameSceneQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameSceneQ()
	 * @generated
	 */
	int LIVE_NAME_SCENE_Q = 61;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Name Scene Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameClipQImpl <em>Live Name Clip Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameClipQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameClipQ()
	 * @generated
	 */
	int LIVE_NAME_CLIP_Q = 62;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Live Name Clip Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_CLIP_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveNameSceneReqImpl <em>Live Name Scene Req</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveNameSceneReqImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameSceneReq()
	 * @generated
	 */
	int LIVE_NAME_SCENE_REQ = 63;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_REQ__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_REQ__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_REQ__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Scene ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_REQ__SCENE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scene Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_REQ__SCENE_NAME = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Name Scene Req</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_NAME_SCENE_REQ_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveScenesQImpl <em>Live Scenes Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveScenesQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveScenesQ()
	 * @generated
	 */
	int LIVE_SCENES_Q = 64;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Num Scenes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_Q__NUM_SCENES = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Scenes Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENES_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTracksQImpl <em>Live Tracks Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTracksQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTracksQ()
	 * @generated
	 */
	int LIVE_TRACKS_Q = 65;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Num Tracks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_Q__NUM_TRACKS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Tracks Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACKS_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LivePlayImpl <em>Live Play</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LivePlayImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlay()
	 * @generated
	 */
	int LIVE_PLAY = 66;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY__STATUS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Play</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_PLAY_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveVolumeImpl <em>Live Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveVolumeImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveVolume()
	 * @generated
	 */
	int LIVE_VOLUME = 67;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_VOLUME_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveScene2Impl <em>Live Scene2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveScene2Impl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveScene2()
	 * @generated
	 */
	int LIVE_SCENE2 = 68;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE2__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE2__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE2__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Scene ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE2__SCENE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Live Scene2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_SCENE2_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnMeterImpl <em>Live Return Meter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnMeterImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnMeter()
	 * @generated
	 */
	int LIVE_RETURN_METER = 69;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_METER__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_METER__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_METER__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_METER__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_METER__LEVEL = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Which</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_METER__WHICH = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Return Meter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_METER_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeQImpl <em>Live Device Range Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRangeQ()
	 * @generated
	 */
	int LIVE_DEVICE_RANGE_Q = 70;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_Q__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_Q__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_Q__PARAM = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Device Range Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeImpl <em>Live Device Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRange()
	 * @generated
	 */
	int LIVE_DEVICE_RANGE = 71;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Device Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeAllImpl <em>Live Device Range All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeAllImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRangeAll()
	 * @generated
	 */
	int LIVE_DEVICE_RANGE_ALL = 72;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Device Range All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeAllQImpl <em>Live Device Range All Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeAllQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRangeAllQ()
	 * @generated
	 */
	int LIVE_DEVICE_RANGE_ALL_Q = 73;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL_Q__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL_Q__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Device Range All Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_RANGE_ALL_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeImpl <em>Live Return Device Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRange()
	 * @generated
	 */
	int LIVE_RETURN_DEVICE_RANGE = 74;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Device Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeQImpl <em>Live Return Device Range Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRangeQ()
	 * @generated
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q = 75;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q__PARAM = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Live Return Device Range Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllImpl <em>Live Return Device Range All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRangeAll()
	 * @generated
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL = 76;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Device Range All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllQImpl <em>Live Return Device Range All Q</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllQImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRangeAllQ()
	 * @generated
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_Q = 77;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_Q__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_Q__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_Q__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_Q__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_Q__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Return Device Range All Q</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_RETURN_DEVICE_RANGE_ALL_Q_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl <em>Live Device Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceParamImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceParam()
	 * @generated
	 */
	int LIVE_DEVICE_PARAM = 78;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__PARAM = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__VALUE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__TYPE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM__NAME = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Live Device Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl <em>Live Device Param Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceParamSet()
	 * @generated
	 */
	int LIVE_DEVICE_PARAM_SET = 79;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__DEVICE_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__VALUE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>PIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__PINDEX = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__MIN = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__MAX = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__STATUS = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET__TYPE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Live Device Param Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_DEVICE_PARAM_SET_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackVolumeImpl <em>Live Track Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackVolumeImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackVolume()
	 * @generated
	 */
	int LIVE_TRACK_VOLUME = 80;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VOLUME__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VOLUME__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VOLUME__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VOLUME__VOLUME = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VOLUME__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_VOLUME_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackPanImpl <em>Live Track Pan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackPanImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackPan()
	 * @generated
	 */
	int LIVE_TRACK_PAN = 81;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PAN__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PAN__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PAN__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PAN__PAN = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PAN__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Pan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PAN_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackMuteImpl <em>Live Track Mute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackMuteImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackMute()
	 * @generated
	 */
	int LIVE_TRACK_MUTE = 82;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_MUTE__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_MUTE__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_MUTE__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_MUTE__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_MUTE__STATE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Mute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_MUTE_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackSoloImpl <em>Live Track Solo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackSoloImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackSolo()
	 * @generated
	 */
	int LIVE_TRACK_SOLO = 83;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SOLO__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SOLO__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SOLO__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SOLO__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SOLO__STATE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Solo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SOLO_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackNameImpl <em>Live Track Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackNameImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackName()
	 * @generated
	 */
	int LIVE_TRACK_NAME = 84;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_NAME__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_NAME__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_NAME__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_NAME__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_NAME__NAME = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_NAME_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackArmImpl <em>Live Track Arm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackArmImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackArm()
	 * @generated
	 */
	int LIVE_TRACK_ARM = 85;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_ARM__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_ARM__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_ARM__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_ARM__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_ARM__STATE = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Arm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_ARM_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackSendImpl <em>Live Track Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackSendImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackSend()
	 * @generated
	 */
	int LIVE_TRACK_SEND = 86;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SEND__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SEND__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SEND__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SEND__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SEND__SEND = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_SEND_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.impl.LiveTrackPitchImpl <em>Live Track Pitch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.impl.LiveTrackPitchImpl
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackPitch()
	 * @generated
	 */
	int LIVE_TRACK_PITCH = 87;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PITCH__PRIORITY = ABLETON_LIVE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PITCH__STAMP = ABLETON_LIVE_SND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PITCH__MSG = ABLETON_LIVE_SND_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PITCH__TRACK_ID = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PITCH__PITCH = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Live Track Pitch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVE_TRACK_PITCH_FEATURE_COUNT = ABLETON_LIVE_SND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.TRACK_ARM_STATUS <em>TRACK ARM STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.TRACK_ARM_STATUS
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getTRACK_ARM_STATUS()
	 * @generated
	 */
	int TRACK_ARM_STATUS = 88;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.TRACK_MUTE_STATUS <em>TRACK MUTE STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.TRACK_MUTE_STATUS
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getTRACK_MUTE_STATUS()
	 * @generated
	 */
	int TRACK_MUTE_STATUS = 89;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.TRACK_SOLO_STATUS <em>TRACK SOLO STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.TRACK_SOLO_STATUS
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getTRACK_SOLO_STATUS()
	 * @generated
	 */
	int TRACK_SOLO_STATUS = 90;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.CLIP_STATE <em>CLIP STATE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.CLIP_STATE
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getCLIP_STATE()
	 * @generated
	 */
	int CLIP_STATE = 91;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.PLAY_STATUS <em>PLAY STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.PLAY_STATUS
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getPLAY_STATUS()
	 * @generated
	 */
	int PLAY_STATUS = 92;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezableton.METER_INPUT <em>METER INPUT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezableton.METER_INPUT
	 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getMETER_INPUT()
	 * @generated
	 */
	int METER_INPUT = 93;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.AbletonLiveSndCmd <em>Ableton Live Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ableton Live Snd Cmd</em>'.
	 * @see net.sf.smbt.ezableton.AbletonLiveSndCmd
	 * @generated
	 */
	EClass getAbletonLiveSndCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTempoReq <em>Live Tempo Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Tempo Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveTempoReq
	 * @generated
	 */
	EClass getLiveTempoReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTempoRcv <em>Live Tempo Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Tempo Rcv</em>'.
	 * @see net.sf.smbt.ezableton.LiveTempoRcv
	 * @generated
	 */
	EClass getLiveTempoRcv();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTempoRcv#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo</em>'.
	 * @see net.sf.smbt.ezableton.LiveTempoRcv#getTempo()
	 * @see #getLiveTempoRcv()
	 * @generated
	 */
	EAttribute getLiveTempoRcv_Tempo();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTimeReq <em>Live Time Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Time Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveTimeReq
	 * @generated
	 */
	EClass getLiveTimeReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTimeRcv <em>Live Time Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Time Rcv</em>'.
	 * @see net.sf.smbt.ezableton.LiveTimeRcv
	 * @generated
	 */
	EClass getLiveTimeRcv();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTimeRcv#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.ezableton.LiveTimeRcv#getTime()
	 * @see #getLiveTimeRcv()
	 * @generated
	 */
	EAttribute getLiveTimeRcv_Time();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveOverdub <em>Live Overdub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Overdub</em>'.
	 * @see net.sf.smbt.ezableton.LiveOverdub
	 * @generated
	 */
	EClass getLiveOverdub();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveOverdub#isState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.ezableton.LiveOverdub#isState()
	 * @see #getLiveOverdub()
	 * @generated
	 */
	EAttribute getLiveOverdub_State();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveStateReq <em>Live State Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live State Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveStateReq
	 * @generated
	 */
	EClass getLiveStateReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveStateRcv <em>Live State Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live State Rcv</em>'.
	 * @see net.sf.smbt.ezableton.LiveStateRcv
	 * @generated
	 */
	EClass getLiveStateRcv();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveStateRcv#getTempo <em>Tempo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo</em>'.
	 * @see net.sf.smbt.ezableton.LiveStateRcv#getTempo()
	 * @see #getLiveStateRcv()
	 * @generated
	 */
	EAttribute getLiveStateRcv_Tempo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveStateRcv#isOverdub <em>Overdub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overdub</em>'.
	 * @see net.sf.smbt.ezableton.LiveStateRcv#isOverdub()
	 * @see #getLiveStateRcv()
	 * @generated
	 */
	EAttribute getLiveStateRcv_Overdub();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveUndoReq <em>Live Undo Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Undo Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveUndoReq
	 * @generated
	 */
	EClass getLiveUndoReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveRedoReq <em>Live Redo Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Redo Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveRedoReq
	 * @generated
	 */
	EClass getLiveRedoReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNextCueReq <em>Live Next Cue Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Next Cue Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveNextCueReq
	 * @generated
	 */
	EClass getLiveNextCueReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePrevCueReq <em>Live Prev Cue Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Prev Cue Req</em>'.
	 * @see net.sf.smbt.ezableton.LivePrevCueReq
	 * @generated
	 */
	EClass getLivePrevCueReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePlayReq <em>Live Play Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Play Req</em>'.
	 * @see net.sf.smbt.ezableton.LivePlayReq
	 * @generated
	 */
	EClass getLivePlayReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePlayContinueReq <em>Live Play Continue Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Play Continue Req</em>'.
	 * @see net.sf.smbt.ezableton.LivePlayContinueReq
	 * @generated
	 */
	EClass getLivePlayContinueReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePlayClipReq <em>Live Play Clip Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Play Clip Req</em>'.
	 * @see net.sf.smbt.ezableton.LivePlayClipReq
	 * @generated
	 */
	EClass getLivePlayClipReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.livePlaySelectionReq <em>live Play Selection Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>live Play Selection Req</em>'.
	 * @see net.sf.smbt.ezableton.livePlaySelectionReq
	 * @generated
	 */
	EClass getlivePlaySelectionReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePlayClipSlotReq <em>Live Play Clip Slot Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Play Clip Slot Req</em>'.
	 * @see net.sf.smbt.ezableton.LivePlayClipSlotReq
	 * @generated
	 */
	EClass getLivePlayClipSlotReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePlayClipSlotReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LivePlayClipSlotReq#getTrackID()
	 * @see #getLivePlayClipSlotReq()
	 * @generated
	 */
	EAttribute getLivePlayClipSlotReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePlayClipSlotReq#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see net.sf.smbt.ezableton.LivePlayClipSlotReq#getClipID()
	 * @see #getLivePlayClipSlotReq()
	 * @generated
	 */
	EAttribute getLivePlayClipSlotReq_ClipID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePlaySceneReq <em>Live Play Scene Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Play Scene Req</em>'.
	 * @see net.sf.smbt.ezableton.LivePlaySceneReq
	 * @generated
	 */
	EClass getLivePlaySceneReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePlaySceneReq#getSceneID <em>Scene ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene ID</em>'.
	 * @see net.sf.smbt.ezableton.LivePlaySceneReq#getSceneID()
	 * @see #getLivePlaySceneReq()
	 * @generated
	 */
	EAttribute getLivePlaySceneReq_SceneID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveStopReq <em>Live Stop Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Stop Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveStopReq
	 * @generated
	 */
	EClass getLiveStopReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveStopClipReq <em>Live Stop Clip Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Stop Clip Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveStopClipReq
	 * @generated
	 */
	EClass getLiveStopClipReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveStopClipReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveStopClipReq#getTrackID()
	 * @see #getLiveStopClipReq()
	 * @generated
	 */
	EAttribute getLiveStopClipReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveStopClipReq#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveStopClipReq#getClipID()
	 * @see #getLiveStopClipReq()
	 * @generated
	 */
	EAttribute getLiveStopClipReq_ClipID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveStopTrackReq <em>Live Stop Track Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Stop Track Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveStopTrackReq
	 * @generated
	 */
	EClass getLiveStopTrackReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveStopTrackReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveStopTrackReq#getTrackID()
	 * @see #getLiveStopTrackReq()
	 * @generated
	 */
	EAttribute getLiveStopTrackReq_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveScenesReq <em>Live Scenes Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Scenes Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveScenesReq
	 * @generated
	 */
	EClass getLiveScenesReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTracksReq <em>Live Tracks Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Tracks Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveTracksReq
	 * @generated
	 */
	EClass getLiveTracksReq();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveSceneReq <em>Live Scene Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Scene Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveSceneReq
	 * @generated
	 */
	EClass getLiveSceneReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveSceneReq#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.ezableton.LiveSceneReq#getMode()
	 * @see #getLiveSceneReq()
	 * @generated
	 */
	EAttribute getLiveSceneReq_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveSceneReq#getSceneID <em>Scene ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveSceneReq#getSceneID()
	 * @see #getLiveSceneReq()
	 * @generated
	 */
	EAttribute getLiveSceneReq_SceneID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameSceneBlockReq <em>Live Name Scene Block Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Scene Block Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameSceneBlockReq
	 * @generated
	 */
	EClass getLiveNameSceneBlockReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameSceneBlockReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameSceneBlockReq#getTrackID()
	 * @see #getLiveNameSceneBlockReq()
	 * @generated
	 */
	EAttribute getLiveNameSceneBlockReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameSceneBlockReq#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameSceneBlockReq#getSize()
	 * @see #getLiveNameSceneBlockReq()
	 * @generated
	 */
	EAttribute getLiveNameSceneBlockReq_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameTrackReq <em>Live Name Track Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Track Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackReq
	 * @generated
	 */
	EClass getLiveNameTrackReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameTrackReq#getTrackName <em>Track Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track Name</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackReq#getTrackName()
	 * @see #getLiveNameTrackReq()
	 * @generated
	 */
	EAttribute getLiveNameTrackReq_TrackName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameTrackReq#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackReq#getColor()
	 * @see #getLiveNameTrackReq()
	 * @generated
	 */
	EAttribute getLiveNameTrackReq_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameTrackReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackReq#getTrackID()
	 * @see #getLiveNameTrackReq()
	 * @generated
	 */
	EAttribute getLiveNameTrackReq_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameTrackblockReq <em>Live Name Trackblock Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Trackblock Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackblockReq
	 * @generated
	 */
	EClass getLiveNameTrackblockReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackblockReq#getTrackID()
	 * @see #getLiveNameTrackblockReq()
	 * @generated
	 */
	EAttribute getLiveNameTrackblockReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackblockReq#getSize()
	 * @see #getLiveNameTrackblockReq()
	 * @generated
	 */
	EAttribute getLiveNameTrackblockReq_Size();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getTrackName <em>Track Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Track Name</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackblockReq#getTrackName()
	 * @see #getLiveNameTrackblockReq()
	 * @generated
	 */
	EAttribute getLiveNameTrackblockReq_TrackName();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameClipReq <em>Live Name Clip Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Clip Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipReq
	 * @generated
	 */
	EClass getLiveNameClipReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipReq#getTrackID()
	 * @see #getLiveNameClipReq()
	 * @generated
	 */
	EAttribute getLiveNameClipReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipReq#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipReq#getClipID()
	 * @see #getLiveNameClipReq()
	 * @generated
	 */
	EAttribute getLiveNameClipReq_ClipID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipReq#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipReq#getLabel()
	 * @see #getLiveNameClipReq()
	 * @generated
	 */
	EAttribute getLiveNameClipReq_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipReq#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipReq#getColor()
	 * @see #getLiveNameClipReq()
	 * @generated
	 */
	EAttribute getLiveNameClipReq_Color();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameClipblockreq <em>Live Name Clipblockreq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Clipblockreq</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipblockreq
	 * @generated
	 */
	EClass getLiveNameClipblockreq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipblockreq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipblockreq#getTrackID()
	 * @see #getLiveNameClipblockreq()
	 * @generated
	 */
	EAttribute getLiveNameClipblockreq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipblockreq#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipblockreq#getClipID()
	 * @see #getLiveNameClipblockreq()
	 * @generated
	 */
	EAttribute getLiveNameClipblockreq_ClipID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipblockreq#getSizeX <em>Size X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size X</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipblockreq#getSizeX()
	 * @see #getLiveNameClipblockreq()
	 * @generated
	 */
	EAttribute getLiveNameClipblockreq_SizeX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameClipblockreq#getSizeY <em>Size Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size Y</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipblockreq#getSizeY()
	 * @see #getLiveNameClipblockreq()
	 * @generated
	 */
	EAttribute getLiveNameClipblockreq_SizeY();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveArmReq <em>Live Arm Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Arm Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveArmReq
	 * @generated
	 */
	EClass getLiveArmReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveArmReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveArmReq#getTrackID()
	 * @see #getLiveArmReq()
	 * @generated
	 */
	EAttribute getLiveArmReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveArmReq#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezableton.LiveArmReq#getStatus()
	 * @see #getLiveArmReq()
	 * @generated
	 */
	EAttribute getLiveArmReq_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveMuteReq <em>Live Mute Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Mute Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveMuteReq
	 * @generated
	 */
	EClass getLiveMuteReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMuteReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveMuteReq#getTrackID()
	 * @see #getLiveMuteReq()
	 * @generated
	 */
	EAttribute getLiveMuteReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMuteReq#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezableton.LiveMuteReq#getStatus()
	 * @see #getLiveMuteReq()
	 * @generated
	 */
	EAttribute getLiveMuteReq_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveVolumeSet <em>Live Volume Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Volume Set</em>'.
	 * @see net.sf.smbt.ezableton.LiveVolumeSet
	 * @generated
	 */
	EClass getLiveVolumeSet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveVolumeSet#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveVolumeSet#getTrackID()
	 * @see #getLiveVolumeSet()
	 * @generated
	 */
	EAttribute getLiveVolumeSet_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveVolumeSet#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveVolumeSet#getLevel()
	 * @see #getLiveVolumeSet()
	 * @generated
	 */
	EAttribute getLiveVolumeSet_Level();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePanSet <em>Live Pan Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Pan Set</em>'.
	 * @see net.sf.smbt.ezableton.LivePanSet
	 * @generated
	 */
	EClass getLivePanSet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePanSet#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LivePanSet#getTrackID()
	 * @see #getLivePanSet()
	 * @generated
	 */
	EAttribute getLivePanSet_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePanSet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezableton.LivePanSet#getValue()
	 * @see #getLivePanSet()
	 * @generated
	 */
	EAttribute getLivePanSet_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveSendReq <em>Live Send Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Send Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveSendReq
	 * @generated
	 */
	EClass getLiveSendReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveSendReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveSendReq#getTrackID()
	 * @see #getLiveSendReq()
	 * @generated
	 */
	EAttribute getLiveSendReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveSendReq#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezableton.LiveSendReq#getValue()
	 * @see #getLiveSendReq()
	 * @generated
	 */
	EAttribute getLiveSendReq_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePitchSet <em>Live Pitch Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Pitch Set</em>'.
	 * @see net.sf.smbt.ezableton.LivePitchSet
	 * @generated
	 */
	EClass getLivePitchSet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePitchSet#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LivePitchSet#getTrackID()
	 * @see #getLivePitchSet()
	 * @generated
	 */
	EAttribute getLivePitchSet_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePitchSet#getClip <em>Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip</em>'.
	 * @see net.sf.smbt.ezableton.LivePitchSet#getClip()
	 * @see #getLivePitchSet()
	 * @generated
	 */
	EAttribute getLivePitchSet_Clip();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePitchSet#getCoarse <em>Coarse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coarse</em>'.
	 * @see net.sf.smbt.ezableton.LivePitchSet#getCoarse()
	 * @see #getLivePitchSet()
	 * @generated
	 */
	EAttribute getLivePitchSet_Coarse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePitchSet#getFine <em>Fine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fine</em>'.
	 * @see net.sf.smbt.ezableton.LivePitchSet#getFine()
	 * @see #getLivePitchSet()
	 * @generated
	 */
	EAttribute getLivePitchSet_Fine();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnMuteReq <em>Live Return Mute Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Mute Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnMuteReq
	 * @generated
	 */
	EClass getLiveReturnMuteReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnMuteReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnMuteReq#getTrackID()
	 * @see #getLiveReturnMuteReq()
	 * @generated
	 */
	EAttribute getLiveReturnMuteReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnMuteReq#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnMuteReq#getStatus()
	 * @see #getLiveReturnMuteReq()
	 * @generated
	 */
	EAttribute getLiveReturnMuteReq_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnSolo <em>Live Return Solo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Solo</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSolo
	 * @generated
	 */
	EClass getLiveReturnSolo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSolo#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSolo#getTrackID()
	 * @see #getLiveReturnSolo()
	 * @generated
	 */
	EAttribute getLiveReturnSolo_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSolo#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSolo#getStatus()
	 * @see #getLiveReturnSolo()
	 * @generated
	 */
	EAttribute getLiveReturnSolo_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDeviceView <em>Live Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device View</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceView
	 * @generated
	 */
	EClass getLiveDeviceView();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceView#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceView#getTrackID()
	 * @see #getLiveDeviceView()
	 * @generated
	 */
	EAttribute getLiveDeviceView_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceView#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceView#getDeviceID()
	 * @see #getLiveDeviceView()
	 * @generated
	 */
	EAttribute getLiveDeviceView_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveMasterMeter <em>Live Master Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Master Meter</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterMeter
	 * @generated
	 */
	EClass getLiveMasterMeter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterMeter#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterMeter#getLevel()
	 * @see #getLiveMasterMeter()
	 * @generated
	 */
	EAttribute getLiveMasterMeter_Level();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterMeter#getWhich <em>Which</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Which</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterMeter#getWhich()
	 * @see #getLiveMasterMeter()
	 * @generated
	 */
	EAttribute getLiveMasterMeter_Which();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveClipPosition <em>Live Clip Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Clip Position</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipPosition
	 * @generated
	 */
	EClass getLiveClipPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipPosition#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipPosition#getTrackID()
	 * @see #getLiveClipPosition()
	 * @generated
	 */
	EAttribute getLiveClipPosition_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipPosition#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipPosition#getClipID()
	 * @see #getLiveClipPosition()
	 * @generated
	 */
	EAttribute getLiveClipPosition_ClipID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipPosition#getPosition()
	 * @see #getLiveClipPosition()
	 * @generated
	 */
	EAttribute getLiveClipPosition_Position();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipPosition#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipPosition#getLength()
	 * @see #getLiveClipPosition()
	 * @generated
	 */
	EAttribute getLiveClipPosition_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipPosition#getLoopStart <em>Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Start</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipPosition#getLoopStart()
	 * @see #getLiveClipPosition()
	 * @generated
	 */
	EAttribute getLiveClipPosition_LoopStart();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipPosition#getLoopEnd <em>Loop End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop End</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipPosition#getLoopEnd()
	 * @see #getLiveClipPosition()
	 * @generated
	 */
	EAttribute getLiveClipPosition_LoopEnd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackMeter <em>Live Track Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Meter</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackMeter
	 * @generated
	 */
	EClass getLiveTrackMeter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackMeter#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackMeter#getTrackID()
	 * @see #getLiveTrackMeter()
	 * @generated
	 */
	EAttribute getLiveTrackMeter_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackMeter#getWhich <em>Which</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Which</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackMeter#getWhich()
	 * @see #getLiveTrackMeter()
	 * @generated
	 */
	EAttribute getLiveTrackMeter_Which();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackMeter#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackMeter#getLevel()
	 * @see #getLiveTrackMeter()
	 * @generated
	 */
	EAttribute getLiveTrackMeter_Level();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameTrackQ <em>Live Name Track Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Track Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameTrackQ
	 * @generated
	 */
	EClass getLiveNameTrackQ();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameSceneQ <em>Live Name Scene Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Scene Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameSceneQ
	 * @generated
	 */
	EClass getLiveNameSceneQ();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameClipQ <em>Live Name Clip Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Clip Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameClipQ
	 * @generated
	 */
	EClass getLiveNameClipQ();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveNameSceneReq <em>Live Name Scene Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Name Scene Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameSceneReq
	 * @generated
	 */
	EClass getLiveNameSceneReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameSceneReq#getSceneID <em>Scene ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameSceneReq#getSceneID()
	 * @see #getLiveNameSceneReq()
	 * @generated
	 */
	EAttribute getLiveNameSceneReq_SceneID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveNameSceneReq#getSceneName <em>Scene Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Name</em>'.
	 * @see net.sf.smbt.ezableton.LiveNameSceneReq#getSceneName()
	 * @see #getLiveNameSceneReq()
	 * @generated
	 */
	EAttribute getLiveNameSceneReq_SceneName();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveScenesQ <em>Live Scenes Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Scenes Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveScenesQ
	 * @generated
	 */
	EClass getLiveScenesQ();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveScenesQ#getNumScenes <em>Num Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Scenes</em>'.
	 * @see net.sf.smbt.ezableton.LiveScenesQ#getNumScenes()
	 * @see #getLiveScenesQ()
	 * @generated
	 */
	EAttribute getLiveScenesQ_NumScenes();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTracksQ <em>Live Tracks Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Tracks Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveTracksQ
	 * @generated
	 */
	EClass getLiveTracksQ();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTracksQ#getNumTracks <em>Num Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Tracks</em>'.
	 * @see net.sf.smbt.ezableton.LiveTracksQ#getNumTracks()
	 * @see #getLiveTracksQ()
	 * @generated
	 */
	EAttribute getLiveTracksQ_NumTracks();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LivePlay <em>Live Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Play</em>'.
	 * @see net.sf.smbt.ezableton.LivePlay
	 * @generated
	 */
	EClass getLivePlay();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LivePlay#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezableton.LivePlay#getStatus()
	 * @see #getLivePlay()
	 * @generated
	 */
	EAttribute getLivePlay_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveVolume <em>Live Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Volume</em>'.
	 * @see net.sf.smbt.ezableton.LiveVolume
	 * @generated
	 */
	EClass getLiveVolume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveVolume#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveVolume#getLevel()
	 * @see #getLiveVolume()
	 * @generated
	 */
	EAttribute getLiveVolume_Level();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveVolume#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveVolume#getTrackID()
	 * @see #getLiveVolume()
	 * @generated
	 */
	EAttribute getLiveVolume_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveScene2 <em>Live Scene2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Scene2</em>'.
	 * @see net.sf.smbt.ezableton.LiveScene2
	 * @generated
	 */
	EClass getLiveScene2();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveScene2#getSceneID <em>Scene ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveScene2#getSceneID()
	 * @see #getLiveScene2()
	 * @generated
	 */
	EAttribute getLiveScene2_SceneID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnMeter <em>Live Return Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Meter</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnMeter
	 * @generated
	 */
	EClass getLiveReturnMeter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnMeter#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnMeter#getTrackID()
	 * @see #getLiveReturnMeter()
	 * @generated
	 */
	EAttribute getLiveReturnMeter_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnMeter#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnMeter#getLevel()
	 * @see #getLiveReturnMeter()
	 * @generated
	 */
	EAttribute getLiveReturnMeter_Level();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnMeter#getWhich <em>Which</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Which</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnMeter#getWhich()
	 * @see #getLiveReturnMeter()
	 * @generated
	 */
	EAttribute getLiveReturnMeter_Which();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDeviceRangeQ <em>Live Device Range Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device Range Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeQ
	 * @generated
	 */
	EClass getLiveDeviceRangeQ();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRangeQ#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeQ#getTrackID()
	 * @see #getLiveDeviceRangeQ()
	 * @generated
	 */
	EAttribute getLiveDeviceRangeQ_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRangeQ#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeQ#getDeviceID()
	 * @see #getLiveDeviceRangeQ()
	 * @generated
	 */
	EAttribute getLiveDeviceRangeQ_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRangeQ#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeQ#getParam()
	 * @see #getLiveDeviceRangeQ()
	 * @generated
	 */
	EAttribute getLiveDeviceRangeQ_Param();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDeviceRange <em>Live Device Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device Range</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRange
	 * @generated
	 */
	EClass getLiveDeviceRange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRange#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRange#getTrackID()
	 * @see #getLiveDeviceRange()
	 * @generated
	 */
	EAttribute getLiveDeviceRange_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRange#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRange#getDeviceID()
	 * @see #getLiveDeviceRange()
	 * @generated
	 */
	EAttribute getLiveDeviceRange_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDeviceRangeAll <em>Live Device Range All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device Range All</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAll
	 * @generated
	 */
	EClass getLiveDeviceRangeAll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRangeAll#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAll#getTrackID()
	 * @see #getLiveDeviceRangeAll()
	 * @generated
	 */
	EAttribute getLiveDeviceRangeAll_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRangeAll#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAll#getDeviceID()
	 * @see #getLiveDeviceRangeAll()
	 * @generated
	 */
	EAttribute getLiveDeviceRangeAll_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDeviceRangeAllQ <em>Live Device Range All Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device Range All Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAllQ
	 * @generated
	 */
	EClass getLiveDeviceRangeAllQ();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRangeAllQ#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAllQ#getTrackID()
	 * @see #getLiveDeviceRangeAllQ()
	 * @generated
	 */
	EAttribute getLiveDeviceRangeAllQ_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceRangeAllQ#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAllQ#getDeviceID()
	 * @see #getLiveDeviceRangeAllQ()
	 * @generated
	 */
	EAttribute getLiveDeviceRangeAllQ_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRange <em>Live Return Device Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Device Range</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRange
	 * @generated
	 */
	EClass getLiveReturnDeviceRange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRange#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRange#getTrackID()
	 * @see #getLiveReturnDeviceRange()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRange_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRange#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRange#getDeviceID()
	 * @see #getLiveReturnDeviceRange()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRange_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeQ <em>Live Return Device Range Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Device Range Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeQ
	 * @generated
	 */
	EClass getLiveReturnDeviceRangeQ();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeQ#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeQ#getTrackID()
	 * @see #getLiveReturnDeviceRangeQ()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRangeQ_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeQ#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeQ#getDeviceID()
	 * @see #getLiveReturnDeviceRangeQ()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRangeQ_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeQ#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeQ#getParam()
	 * @see #getLiveReturnDeviceRangeQ()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRangeQ_Param();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAll <em>Live Return Device Range All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Device Range All</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAll
	 * @generated
	 */
	EClass getLiveReturnDeviceRangeAll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAll#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAll#getTrackID()
	 * @see #getLiveReturnDeviceRangeAll()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRangeAll_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAll#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAll#getDeviceID()
	 * @see #getLiveReturnDeviceRangeAll()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRangeAll_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ <em>Live Return Device Range All Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Device Range All Q</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ
	 * @generated
	 */
	EClass getLiveReturnDeviceRangeAllQ();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ#getTrackID()
	 * @see #getLiveReturnDeviceRangeAllQ()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRangeAllQ_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ#getDeviceID()
	 * @see #getLiveReturnDeviceRangeAllQ()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceRangeAllQ_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDeviceParam <em>Live Device Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device Param</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam
	 * @generated
	 */
	EClass getLiveDeviceParam();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParam#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam#getTrackID()
	 * @see #getLiveDeviceParam()
	 * @generated
	 */
	EAttribute getLiveDeviceParam_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParam#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam#getDeviceID()
	 * @see #getLiveDeviceParam()
	 * @generated
	 */
	EAttribute getLiveDeviceParam_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParam#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam#getParam()
	 * @see #getLiveDeviceParam()
	 * @generated
	 */
	EAttribute getLiveDeviceParam_Param();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam#getValue()
	 * @see #getLiveDeviceParam()
	 * @generated
	 */
	EAttribute getLiveDeviceParam_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam#getType()
	 * @see #getLiveDeviceParam()
	 * @generated
	 */
	EAttribute getLiveDeviceParam_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam#getName()
	 * @see #getLiveDeviceParam()
	 * @generated
	 */
	EAttribute getLiveDeviceParam_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDeviceParamSet <em>Live Device Param Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device Param Set</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet
	 * @generated
	 */
	EClass getLiveDeviceParamSet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#getTrackID()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#getDeviceID()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#getValue()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getPIndex <em>PIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PIndex</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#getPIndex()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_PIndex();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#getMin()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_Min();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#getMax()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_Max();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#isStatus()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDeviceParamSet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet#getType()
	 * @see #getLiveDeviceParamSet()
	 * @generated
	 */
	EAttribute getLiveDeviceParamSet_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackVolume <em>Live Track Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Volume</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackVolume
	 * @generated
	 */
	EClass getLiveTrackVolume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackVolume#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackVolume#getVolume()
	 * @see #getLiveTrackVolume()
	 * @generated
	 */
	EAttribute getLiveTrackVolume_Volume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackVolume#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackVolume#getTrackID()
	 * @see #getLiveTrackVolume()
	 * @generated
	 */
	EAttribute getLiveTrackVolume_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackPan <em>Live Track Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Pan</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackPan
	 * @generated
	 */
	EClass getLiveTrackPan();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackPan#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackPan#getPan()
	 * @see #getLiveTrackPan()
	 * @generated
	 */
	EAttribute getLiveTrackPan_Pan();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackPan#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackPan#getTrackID()
	 * @see #getLiveTrackPan()
	 * @generated
	 */
	EAttribute getLiveTrackPan_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackMute <em>Live Track Mute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Mute</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackMute
	 * @generated
	 */
	EClass getLiveTrackMute();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackMute#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackMute#getTrackID()
	 * @see #getLiveTrackMute()
	 * @generated
	 */
	EAttribute getLiveTrackMute_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackMute#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackMute#getState()
	 * @see #getLiveTrackMute()
	 * @generated
	 */
	EAttribute getLiveTrackMute_State();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackSolo <em>Live Track Solo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Solo</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackSolo
	 * @generated
	 */
	EClass getLiveTrackSolo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackSolo#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackSolo#getTrackID()
	 * @see #getLiveTrackSolo()
	 * @generated
	 */
	EAttribute getLiveTrackSolo_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackSolo#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackSolo#getState()
	 * @see #getLiveTrackSolo()
	 * @generated
	 */
	EAttribute getLiveTrackSolo_State();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackName <em>Live Track Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Name</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackName
	 * @generated
	 */
	EClass getLiveTrackName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackName#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackName#getTrackID()
	 * @see #getLiveTrackName()
	 * @generated
	 */
	EAttribute getLiveTrackName_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackName#getName()
	 * @see #getLiveTrackName()
	 * @generated
	 */
	EAttribute getLiveTrackName_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackArm <em>Live Track Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Arm</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackArm
	 * @generated
	 */
	EClass getLiveTrackArm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackArm#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackArm#getTrackID()
	 * @see #getLiveTrackArm()
	 * @generated
	 */
	EAttribute getLiveTrackArm_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackArm#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackArm#getState()
	 * @see #getLiveTrackArm()
	 * @generated
	 */
	EAttribute getLiveTrackArm_State();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackSend <em>Live Track Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Send</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackSend
	 * @generated
	 */
	EClass getLiveTrackSend();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackSend#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackSend#getTrackID()
	 * @see #getLiveTrackSend()
	 * @generated
	 */
	EAttribute getLiveTrackSend_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackSend#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackSend#getSend()
	 * @see #getLiveTrackSend()
	 * @generated
	 */
	EAttribute getLiveTrackSend_Send();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackPitch <em>Live Track Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Pitch</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackPitch
	 * @generated
	 */
	EClass getLiveTrackPitch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackPitch#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackPitch#getTrackID()
	 * @see #getLiveTrackPitch()
	 * @generated
	 */
	EAttribute getLiveTrackPitch_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackPitch#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackPitch#getPitch()
	 * @see #getLiveTrackPitch()
	 * @generated
	 */
	EAttribute getLiveTrackPitch_Pitch();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnVolumeReq <em>Live Return Volume Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Volume Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnVolumeReq
	 * @generated
	 */
	EClass getLiveReturnVolumeReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnVolumeReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnVolumeReq#getTrackID()
	 * @see #getLiveReturnVolumeReq()
	 * @generated
	 */
	EAttribute getLiveReturnVolumeReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnVolumeReq#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnVolumeReq#getLevel()
	 * @see #getLiveReturnVolumeReq()
	 * @generated
	 */
	EAttribute getLiveReturnVolumeReq_Level();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnPanReq <em>Live Return Pan Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Pan Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnPanReq
	 * @generated
	 */
	EClass getLiveReturnPanReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnPanReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnPanReq#getTrackID()
	 * @see #getLiveReturnPanReq()
	 * @generated
	 */
	EAttribute getLiveReturnPanReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnPanReq#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnPanReq#getPan()
	 * @see #getLiveReturnPanReq()
	 * @generated
	 */
	EAttribute getLiveReturnPanReq_Pan();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnSendReq <em>Live Return Send Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Send Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSendReq
	 * @generated
	 */
	EClass getLiveReturnSendReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSendReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSendReq#getTrackID()
	 * @see #getLiveReturnSendReq()
	 * @generated
	 */
	EAttribute getLiveReturnSendReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSendReq#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSendReq#getSend()
	 * @see #getLiveReturnSendReq()
	 * @generated
	 */
	EAttribute getLiveReturnSendReq_Send();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSendReq#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSendReq#getLevel()
	 * @see #getLiveReturnSendReq()
	 * @generated
	 */
	EAttribute getLiveReturnSendReq_Level();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveMasterVolumeReq <em>Live Master Volume Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Master Volume Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterVolumeReq
	 * @generated
	 */
	EClass getLiveMasterVolumeReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterVolumeReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterVolumeReq#getTrackID()
	 * @see #getLiveMasterVolumeReq()
	 * @generated
	 */
	EAttribute getLiveMasterVolumeReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterVolumeReq#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterVolumeReq#getLevel()
	 * @see #getLiveMasterVolumeReq()
	 * @generated
	 */
	EAttribute getLiveMasterVolumeReq_Level();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveMasterPanReq <em>Live Master Pan Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Master Pan Req</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterPanReq
	 * @generated
	 */
	EClass getLiveMasterPanReq();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterPanReq#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterPanReq#getTrackID()
	 * @see #getLiveMasterPanReq()
	 * @generated
	 */
	EAttribute getLiveMasterPanReq_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterPanReq#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterPanReq#getPan()
	 * @see #getLiveMasterPanReq()
	 * @generated
	 */
	EAttribute getLiveMasterPanReq_Pan();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackJump <em>Live Track Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Jump</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackJump
	 * @generated
	 */
	EClass getLiveTrackJump();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackJump#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackJump#getTrackID()
	 * @see #getLiveTrackJump()
	 * @generated
	 */
	EAttribute getLiveTrackJump_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackJump#getBeats <em>Beats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beats</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackJump#getBeats()
	 * @see #getLiveTrackJump()
	 * @generated
	 */
	EAttribute getLiveTrackJump_Beats();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackInfo <em>Live Track Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Info</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackInfo
	 * @generated
	 */
	EClass getLiveTrackInfo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackInfo#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackInfo#getTrackID()
	 * @see #getLiveTrackInfo()
	 * @generated
	 */
	EAttribute getLiveTrackInfo_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveTrackDeviceView <em>Live Track Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Track Device View</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackDeviceView
	 * @generated
	 */
	EClass getLiveTrackDeviceView();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackDeviceView#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackDeviceView#getTrackID()
	 * @see #getLiveTrackDeviceView()
	 * @generated
	 */
	EAttribute getLiveTrackDeviceView_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveTrackDeviceView#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveTrackDeviceView#getDeviceID()
	 * @see #getLiveTrackDeviceView()
	 * @generated
	 */
	EAttribute getLiveTrackDeviceView_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnDeviceView <em>Live Return Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Device View</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceView
	 * @generated
	 */
	EClass getLiveReturnDeviceView();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceView#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceView#getTrackID()
	 * @see #getLiveReturnDeviceView()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceView_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDeviceView#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceView#getDeviceID()
	 * @see #getLiveReturnDeviceView()
	 * @generated
	 */
	EAttribute getLiveReturnDeviceView_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveMasterDeviceView <em>Live Master Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Master Device View</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterDeviceView
	 * @generated
	 */
	EClass getLiveMasterDeviceView();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterDeviceView#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterDeviceView#getDeviceID()
	 * @see #getLiveMasterDeviceView()
	 * @generated
	 */
	EAttribute getLiveMasterDeviceView_DeviceID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDetailView <em>Live Detail View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Detail View</em>'.
	 * @see net.sf.smbt.ezableton.LiveDetailView
	 * @generated
	 */
	EClass getLiveDetailView();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDetailView#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezableton.LiveDetailView#getValue()
	 * @see #getLiveDetailView()
	 * @generated
	 */
	EAttribute getLiveDetailView_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveClipInfo <em>Live Clip Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Clip Info</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipInfo
	 * @generated
	 */
	EClass getLiveClipInfo();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipInfo#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipInfo#getTrackID()
	 * @see #getLiveClipInfo()
	 * @generated
	 */
	EAttribute getLiveClipInfo_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipInfo#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipInfo#getStatus()
	 * @see #getLiveClipInfo()
	 * @generated
	 */
	EAttribute getLiveClipInfo_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveClipInfo#getClipID <em>Clip ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clip ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveClipInfo#getClipID()
	 * @see #getLiveClipInfo()
	 * @generated
	 */
	EAttribute getLiveClipInfo_ClipID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDevicelist <em>Live Devicelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Devicelist</em>'.
	 * @see net.sf.smbt.ezableton.LiveDevicelist
	 * @generated
	 */
	EClass getLiveDevicelist();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDevicelist#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDevicelist#getTrackID()
	 * @see #getLiveDevicelist()
	 * @generated
	 */
	EAttribute getLiveDevicelist_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveDevice <em>Live Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Device</em>'.
	 * @see net.sf.smbt.ezableton.LiveDevice
	 * @generated
	 */
	EClass getLiveDevice();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDevice#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDevice#getTrackID()
	 * @see #getLiveDevice()
	 * @generated
	 */
	EAttribute getLiveDevice_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDevice#getDeviceID <em>Device ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveDevice#getDeviceID()
	 * @see #getLiveDevice()
	 * @generated
	 */
	EAttribute getLiveDevice_DeviceID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDevice#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see net.sf.smbt.ezableton.LiveDevice#getParam()
	 * @see #getLiveDevice()
	 * @generated
	 */
	EAttribute getLiveDevice_Param();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveDevice#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see net.sf.smbt.ezableton.LiveDevice#getS()
	 * @see #getLiveDevice()
	 * @generated
	 */
	EAttribute getLiveDevice_S();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnDevicelist <em>Live Return Devicelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Devicelist</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDevicelist
	 * @generated
	 */
	EClass getLiveReturnDevicelist();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnDevicelist#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnDevicelist#getTrackID()
	 * @see #getLiveReturnDevicelist()
	 * @generated
	 */
	EAttribute getLiveReturnDevicelist_TrackID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnVolume <em>Live Return Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Volume</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnVolume
	 * @generated
	 */
	EClass getLiveReturnVolume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnVolume#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnVolume#getTrackID()
	 * @see #getLiveReturnVolume()
	 * @generated
	 */
	EAttribute getLiveReturnVolume_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnVolume#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnVolume#getLevel()
	 * @see #getLiveReturnVolume()
	 * @generated
	 */
	EAttribute getLiveReturnVolume_Level();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnPan <em>Live Return Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Pan</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnPan
	 * @generated
	 */
	EClass getLiveReturnPan();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnPan#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnPan#getTrackID()
	 * @see #getLiveReturnPan()
	 * @generated
	 */
	EAttribute getLiveReturnPan_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnPan#getPan <em>Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnPan#getPan()
	 * @see #getLiveReturnPan()
	 * @generated
	 */
	EAttribute getLiveReturnPan_Pan();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveReturnSend <em>Live Return Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Return Send</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSend
	 * @generated
	 */
	EClass getLiveReturnSend();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSend#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSend#getTrackID()
	 * @see #getLiveReturnSend()
	 * @generated
	 */
	EAttribute getLiveReturnSend_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSend#getSend <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Send</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSend#getSend()
	 * @see #getLiveReturnSend()
	 * @generated
	 */
	EAttribute getLiveReturnSend_Send();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveReturnSend#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveReturnSend#getLevel()
	 * @see #getLiveReturnSend()
	 * @generated
	 */
	EAttribute getLiveReturnSend_Level();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezableton.LiveMasterVolume <em>Live Master Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Live Master Volume</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterVolume
	 * @generated
	 */
	EClass getLiveMasterVolume();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterVolume#getTrackID <em>Track ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Track ID</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterVolume#getTrackID()
	 * @see #getLiveMasterVolume()
	 * @generated
	 */
	EAttribute getLiveMasterVolume_TrackID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezableton.LiveMasterVolume#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see net.sf.smbt.ezableton.LiveMasterVolume#getLevel()
	 * @see #getLiveMasterVolume()
	 * @generated
	 */
	EAttribute getLiveMasterVolume_Level();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezableton.TRACK_ARM_STATUS <em>TRACK ARM STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRACK ARM STATUS</em>'.
	 * @see net.sf.smbt.ezableton.TRACK_ARM_STATUS
	 * @generated
	 */
	EEnum getTRACK_ARM_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezableton.TRACK_MUTE_STATUS <em>TRACK MUTE STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRACK MUTE STATUS</em>'.
	 * @see net.sf.smbt.ezableton.TRACK_MUTE_STATUS
	 * @generated
	 */
	EEnum getTRACK_MUTE_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezableton.TRACK_SOLO_STATUS <em>TRACK SOLO STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRACK SOLO STATUS</em>'.
	 * @see net.sf.smbt.ezableton.TRACK_SOLO_STATUS
	 * @generated
	 */
	EEnum getTRACK_SOLO_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezableton.CLIP_STATE <em>CLIP STATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CLIP STATE</em>'.
	 * @see net.sf.smbt.ezableton.CLIP_STATE
	 * @generated
	 */
	EEnum getCLIP_STATE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezableton.PLAY_STATUS <em>PLAY STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PLAY STATUS</em>'.
	 * @see net.sf.smbt.ezableton.PLAY_STATUS
	 * @generated
	 */
	EEnum getPLAY_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezableton.METER_INPUT <em>METER INPUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>METER INPUT</em>'.
	 * @see net.sf.smbt.ezableton.METER_INPUT
	 * @generated
	 */
	EEnum getMETER_INPUT();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzabletonFactory getEzabletonFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.AbletonLiveSndCmdImpl <em>Ableton Live Snd Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.AbletonLiveSndCmdImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getAbletonLiveSndCmd()
		 * @generated
		 */
		EClass ABLETON_LIVE_SND_CMD = eINSTANCE.getAbletonLiveSndCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTempoReqImpl <em>Live Tempo Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTempoReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTempoReq()
		 * @generated
		 */
		EClass LIVE_TEMPO_REQ = eINSTANCE.getLiveTempoReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTempoRcvImpl <em>Live Tempo Rcv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTempoRcvImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTempoRcv()
		 * @generated
		 */
		EClass LIVE_TEMPO_RCV = eINSTANCE.getLiveTempoRcv();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TEMPO_RCV__TEMPO = eINSTANCE.getLiveTempoRcv_Tempo();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTimeReqImpl <em>Live Time Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTimeReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTimeReq()
		 * @generated
		 */
		EClass LIVE_TIME_REQ = eINSTANCE.getLiveTimeReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTimeRcvImpl <em>Live Time Rcv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTimeRcvImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTimeRcv()
		 * @generated
		 */
		EClass LIVE_TIME_RCV = eINSTANCE.getLiveTimeRcv();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TIME_RCV__TIME = eINSTANCE.getLiveTimeRcv_Time();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveOverdubImpl <em>Live Overdub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveOverdubImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveOverdub()
		 * @generated
		 */
		EClass LIVE_OVERDUB = eINSTANCE.getLiveOverdub();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_OVERDUB__STATE = eINSTANCE.getLiveOverdub_State();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveStateReqImpl <em>Live State Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveStateReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStateReq()
		 * @generated
		 */
		EClass LIVE_STATE_REQ = eINSTANCE.getLiveStateReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveStateRcvImpl <em>Live State Rcv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveStateRcvImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStateRcv()
		 * @generated
		 */
		EClass LIVE_STATE_RCV = eINSTANCE.getLiveStateRcv();

		/**
		 * The meta object literal for the '<em><b>Tempo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_STATE_RCV__TEMPO = eINSTANCE.getLiveStateRcv_Tempo();

		/**
		 * The meta object literal for the '<em><b>Overdub</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_STATE_RCV__OVERDUB = eINSTANCE.getLiveStateRcv_Overdub();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveUndoReqImpl <em>Live Undo Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveUndoReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveUndoReq()
		 * @generated
		 */
		EClass LIVE_UNDO_REQ = eINSTANCE.getLiveUndoReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveRedoReqImpl <em>Live Redo Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveRedoReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveRedoReq()
		 * @generated
		 */
		EClass LIVE_REDO_REQ = eINSTANCE.getLiveRedoReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNextCueReqImpl <em>Live Next Cue Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNextCueReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNextCueReq()
		 * @generated
		 */
		EClass LIVE_NEXT_CUE_REQ = eINSTANCE.getLiveNextCueReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePrevCueReqImpl <em>Live Prev Cue Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePrevCueReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePrevCueReq()
		 * @generated
		 */
		EClass LIVE_PREV_CUE_REQ = eINSTANCE.getLivePrevCueReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePlayReqImpl <em>Live Play Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePlayReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayReq()
		 * @generated
		 */
		EClass LIVE_PLAY_REQ = eINSTANCE.getLivePlayReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePlayContinueReqImpl <em>Live Play Continue Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePlayContinueReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayContinueReq()
		 * @generated
		 */
		EClass LIVE_PLAY_CONTINUE_REQ = eINSTANCE.getLivePlayContinueReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePlayClipReqImpl <em>Live Play Clip Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePlayClipReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayClipReq()
		 * @generated
		 */
		EClass LIVE_PLAY_CLIP_REQ = eINSTANCE.getLivePlayClipReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.livePlaySelectionReqImpl <em>live Play Selection Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.livePlaySelectionReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getlivePlaySelectionReq()
		 * @generated
		 */
		EClass LIVE_PLAY_SELECTION_REQ = eINSTANCE.getlivePlaySelectionReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePlayClipSlotReqImpl <em>Live Play Clip Slot Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePlayClipSlotReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlayClipSlotReq()
		 * @generated
		 */
		EClass LIVE_PLAY_CLIP_SLOT_REQ = eINSTANCE.getLivePlayClipSlotReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PLAY_CLIP_SLOT_REQ__TRACK_ID = eINSTANCE.getLivePlayClipSlotReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PLAY_CLIP_SLOT_REQ__CLIP_ID = eINSTANCE.getLivePlayClipSlotReq_ClipID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePlaySceneReqImpl <em>Live Play Scene Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePlaySceneReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlaySceneReq()
		 * @generated
		 */
		EClass LIVE_PLAY_SCENE_REQ = eINSTANCE.getLivePlaySceneReq();

		/**
		 * The meta object literal for the '<em><b>Scene ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PLAY_SCENE_REQ__SCENE_ID = eINSTANCE.getLivePlaySceneReq_SceneID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveStopReqImpl <em>Live Stop Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveStopReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStopReq()
		 * @generated
		 */
		EClass LIVE_STOP_REQ = eINSTANCE.getLiveStopReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveStopClipReqImpl <em>Live Stop Clip Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveStopClipReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStopClipReq()
		 * @generated
		 */
		EClass LIVE_STOP_CLIP_REQ = eINSTANCE.getLiveStopClipReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_STOP_CLIP_REQ__TRACK_ID = eINSTANCE.getLiveStopClipReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_STOP_CLIP_REQ__CLIP_ID = eINSTANCE.getLiveStopClipReq_ClipID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveStopTrackReqImpl <em>Live Stop Track Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveStopTrackReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveStopTrackReq()
		 * @generated
		 */
		EClass LIVE_STOP_TRACK_REQ = eINSTANCE.getLiveStopTrackReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_STOP_TRACK_REQ__TRACK_ID = eINSTANCE.getLiveStopTrackReq_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveScenesReqImpl <em>Live Scenes Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveScenesReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveScenesReq()
		 * @generated
		 */
		EClass LIVE_SCENES_REQ = eINSTANCE.getLiveScenesReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTracksReqImpl <em>Live Tracks Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTracksReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTracksReq()
		 * @generated
		 */
		EClass LIVE_TRACKS_REQ = eINSTANCE.getLiveTracksReq();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveSceneReqImpl <em>Live Scene Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveSceneReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveSceneReq()
		 * @generated
		 */
		EClass LIVE_SCENE_REQ = eINSTANCE.getLiveSceneReq();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENE_REQ__MODE = eINSTANCE.getLiveSceneReq_Mode();

		/**
		 * The meta object literal for the '<em><b>Scene ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENE_REQ__SCENE_ID = eINSTANCE.getLiveSceneReq_SceneID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameSceneBlockReqImpl <em>Live Name Scene Block Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameSceneBlockReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameSceneBlockReq()
		 * @generated
		 */
		EClass LIVE_NAME_SCENE_BLOCK_REQ = eINSTANCE.getLiveNameSceneBlockReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_SCENE_BLOCK_REQ__TRACK_ID = eINSTANCE.getLiveNameSceneBlockReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_SCENE_BLOCK_REQ__SIZE = eINSTANCE.getLiveNameSceneBlockReq_Size();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameTrackReqImpl <em>Live Name Track Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameTrackReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameTrackReq()
		 * @generated
		 */
		EClass LIVE_NAME_TRACK_REQ = eINSTANCE.getLiveNameTrackReq();

		/**
		 * The meta object literal for the '<em><b>Track Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_TRACK_REQ__TRACK_NAME = eINSTANCE.getLiveNameTrackReq_TrackName();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_TRACK_REQ__COLOR = eINSTANCE.getLiveNameTrackReq_Color();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_TRACK_REQ__TRACK_ID = eINSTANCE.getLiveNameTrackReq_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameTrackblockReqImpl <em>Live Name Trackblock Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameTrackblockReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameTrackblockReq()
		 * @generated
		 */
		EClass LIVE_NAME_TRACKBLOCK_REQ = eINSTANCE.getLiveNameTrackblockReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_TRACKBLOCK_REQ__TRACK_ID = eINSTANCE.getLiveNameTrackblockReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_TRACKBLOCK_REQ__SIZE = eINSTANCE.getLiveNameTrackblockReq_Size();

		/**
		 * The meta object literal for the '<em><b>Track Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_TRACKBLOCK_REQ__TRACK_NAME = eINSTANCE.getLiveNameTrackblockReq_TrackName();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameClipReqImpl <em>Live Name Clip Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameClipReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameClipReq()
		 * @generated
		 */
		EClass LIVE_NAME_CLIP_REQ = eINSTANCE.getLiveNameClipReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIP_REQ__TRACK_ID = eINSTANCE.getLiveNameClipReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIP_REQ__CLIP_ID = eINSTANCE.getLiveNameClipReq_ClipID();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIP_REQ__LABEL = eINSTANCE.getLiveNameClipReq_Label();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIP_REQ__COLOR = eINSTANCE.getLiveNameClipReq_Color();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl <em>Live Name Clipblockreq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameClipblockreqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameClipblockreq()
		 * @generated
		 */
		EClass LIVE_NAME_CLIPBLOCKREQ = eINSTANCE.getLiveNameClipblockreq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIPBLOCKREQ__TRACK_ID = eINSTANCE.getLiveNameClipblockreq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIPBLOCKREQ__CLIP_ID = eINSTANCE.getLiveNameClipblockreq_ClipID();

		/**
		 * The meta object literal for the '<em><b>Size X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIPBLOCKREQ__SIZE_X = eINSTANCE.getLiveNameClipblockreq_SizeX();

		/**
		 * The meta object literal for the '<em><b>Size Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_CLIPBLOCKREQ__SIZE_Y = eINSTANCE.getLiveNameClipblockreq_SizeY();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveArmReqImpl <em>Live Arm Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveArmReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveArmReq()
		 * @generated
		 */
		EClass LIVE_ARM_REQ = eINSTANCE.getLiveArmReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_ARM_REQ__TRACK_ID = eINSTANCE.getLiveArmReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_ARM_REQ__STATUS = eINSTANCE.getLiveArmReq_Status();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveMuteReqImpl <em>Live Mute Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveMuteReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMuteReq()
		 * @generated
		 */
		EClass LIVE_MUTE_REQ = eINSTANCE.getLiveMuteReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MUTE_REQ__TRACK_ID = eINSTANCE.getLiveMuteReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MUTE_REQ__STATUS = eINSTANCE.getLiveMuteReq_Status();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveVolumeSetImpl <em>Live Volume Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveVolumeSetImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveVolumeSet()
		 * @generated
		 */
		EClass LIVE_VOLUME_SET = eINSTANCE.getLiveVolumeSet();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_VOLUME_SET__TRACK_ID = eINSTANCE.getLiveVolumeSet_TrackID();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_VOLUME_SET__LEVEL = eINSTANCE.getLiveVolumeSet_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePanSetImpl <em>Live Pan Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePanSetImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePanSet()
		 * @generated
		 */
		EClass LIVE_PAN_SET = eINSTANCE.getLivePanSet();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PAN_SET__TRACK_ID = eINSTANCE.getLivePanSet_TrackID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PAN_SET__VALUE = eINSTANCE.getLivePanSet_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveSendReqImpl <em>Live Send Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveSendReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveSendReq()
		 * @generated
		 */
		EClass LIVE_SEND_REQ = eINSTANCE.getLiveSendReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SEND_REQ__TRACK_ID = eINSTANCE.getLiveSendReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SEND_REQ__VALUE = eINSTANCE.getLiveSendReq_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePitchSetImpl <em>Live Pitch Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePitchSetImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePitchSet()
		 * @generated
		 */
		EClass LIVE_PITCH_SET = eINSTANCE.getLivePitchSet();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PITCH_SET__TRACK_ID = eINSTANCE.getLivePitchSet_TrackID();

		/**
		 * The meta object literal for the '<em><b>Clip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PITCH_SET__CLIP = eINSTANCE.getLivePitchSet_Clip();

		/**
		 * The meta object literal for the '<em><b>Coarse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PITCH_SET__COARSE = eINSTANCE.getLivePitchSet_Coarse();

		/**
		 * The meta object literal for the '<em><b>Fine</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PITCH_SET__FINE = eINSTANCE.getLivePitchSet_Fine();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnMuteReqImpl <em>Live Return Mute Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnMuteReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnMuteReq()
		 * @generated
		 */
		EClass LIVE_RETURN_MUTE_REQ = eINSTANCE.getLiveReturnMuteReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_MUTE_REQ__TRACK_ID = eINSTANCE.getLiveReturnMuteReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_MUTE_REQ__STATUS = eINSTANCE.getLiveReturnMuteReq_Status();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnSoloImpl <em>Live Return Solo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnSoloImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnSolo()
		 * @generated
		 */
		EClass LIVE_RETURN_SOLO = eINSTANCE.getLiveReturnSolo();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SOLO__TRACK_ID = eINSTANCE.getLiveReturnSolo_TrackID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SOLO__STATUS = eINSTANCE.getLiveReturnSolo_Status();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceViewImpl <em>Live Device View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceViewImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceView()
		 * @generated
		 */
		EClass LIVE_DEVICE_VIEW = eINSTANCE.getLiveDeviceView();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_VIEW__TRACK_ID = eINSTANCE.getLiveDeviceView_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_VIEW__DEVICE_ID = eINSTANCE.getLiveDeviceView_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveMasterMeterImpl <em>Live Master Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveMasterMeterImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterMeter()
		 * @generated
		 */
		EClass LIVE_MASTER_METER = eINSTANCE.getLiveMasterMeter();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_METER__LEVEL = eINSTANCE.getLiveMasterMeter_Level();

		/**
		 * The meta object literal for the '<em><b>Which</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_METER__WHICH = eINSTANCE.getLiveMasterMeter_Which();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveClipPositionImpl <em>Live Clip Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveClipPositionImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveClipPosition()
		 * @generated
		 */
		EClass LIVE_CLIP_POSITION = eINSTANCE.getLiveClipPosition();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_POSITION__TRACK_ID = eINSTANCE.getLiveClipPosition_TrackID();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_POSITION__CLIP_ID = eINSTANCE.getLiveClipPosition_ClipID();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_POSITION__POSITION = eINSTANCE.getLiveClipPosition_Position();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_POSITION__LENGTH = eINSTANCE.getLiveClipPosition_Length();

		/**
		 * The meta object literal for the '<em><b>Loop Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_POSITION__LOOP_START = eINSTANCE.getLiveClipPosition_LoopStart();

		/**
		 * The meta object literal for the '<em><b>Loop End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_POSITION__LOOP_END = eINSTANCE.getLiveClipPosition_LoopEnd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackMeterImpl <em>Live Track Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackMeterImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackMeter()
		 * @generated
		 */
		EClass LIVE_TRACK_METER = eINSTANCE.getLiveTrackMeter();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_METER__TRACK_ID = eINSTANCE.getLiveTrackMeter_TrackID();

		/**
		 * The meta object literal for the '<em><b>Which</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_METER__WHICH = eINSTANCE.getLiveTrackMeter_Which();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_METER__LEVEL = eINSTANCE.getLiveTrackMeter_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameTrackQImpl <em>Live Name Track Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameTrackQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameTrackQ()
		 * @generated
		 */
		EClass LIVE_NAME_TRACK_Q = eINSTANCE.getLiveNameTrackQ();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameSceneQImpl <em>Live Name Scene Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameSceneQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameSceneQ()
		 * @generated
		 */
		EClass LIVE_NAME_SCENE_Q = eINSTANCE.getLiveNameSceneQ();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameClipQImpl <em>Live Name Clip Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameClipQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameClipQ()
		 * @generated
		 */
		EClass LIVE_NAME_CLIP_Q = eINSTANCE.getLiveNameClipQ();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveNameSceneReqImpl <em>Live Name Scene Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveNameSceneReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveNameSceneReq()
		 * @generated
		 */
		EClass LIVE_NAME_SCENE_REQ = eINSTANCE.getLiveNameSceneReq();

		/**
		 * The meta object literal for the '<em><b>Scene ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_SCENE_REQ__SCENE_ID = eINSTANCE.getLiveNameSceneReq_SceneID();

		/**
		 * The meta object literal for the '<em><b>Scene Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_NAME_SCENE_REQ__SCENE_NAME = eINSTANCE.getLiveNameSceneReq_SceneName();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveScenesQImpl <em>Live Scenes Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveScenesQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveScenesQ()
		 * @generated
		 */
		EClass LIVE_SCENES_Q = eINSTANCE.getLiveScenesQ();

		/**
		 * The meta object literal for the '<em><b>Num Scenes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENES_Q__NUM_SCENES = eINSTANCE.getLiveScenesQ_NumScenes();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTracksQImpl <em>Live Tracks Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTracksQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTracksQ()
		 * @generated
		 */
		EClass LIVE_TRACKS_Q = eINSTANCE.getLiveTracksQ();

		/**
		 * The meta object literal for the '<em><b>Num Tracks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACKS_Q__NUM_TRACKS = eINSTANCE.getLiveTracksQ_NumTracks();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LivePlayImpl <em>Live Play</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LivePlayImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLivePlay()
		 * @generated
		 */
		EClass LIVE_PLAY = eINSTANCE.getLivePlay();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_PLAY__STATUS = eINSTANCE.getLivePlay_Status();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveVolumeImpl <em>Live Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveVolumeImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveVolume()
		 * @generated
		 */
		EClass LIVE_VOLUME = eINSTANCE.getLiveVolume();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_VOLUME__LEVEL = eINSTANCE.getLiveVolume_Level();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_VOLUME__TRACK_ID = eINSTANCE.getLiveVolume_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveScene2Impl <em>Live Scene2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveScene2Impl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveScene2()
		 * @generated
		 */
		EClass LIVE_SCENE2 = eINSTANCE.getLiveScene2();

		/**
		 * The meta object literal for the '<em><b>Scene ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_SCENE2__SCENE_ID = eINSTANCE.getLiveScene2_SceneID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnMeterImpl <em>Live Return Meter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnMeterImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnMeter()
		 * @generated
		 */
		EClass LIVE_RETURN_METER = eINSTANCE.getLiveReturnMeter();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_METER__TRACK_ID = eINSTANCE.getLiveReturnMeter_TrackID();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_METER__LEVEL = eINSTANCE.getLiveReturnMeter_Level();

		/**
		 * The meta object literal for the '<em><b>Which</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_METER__WHICH = eINSTANCE.getLiveReturnMeter_Which();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeQImpl <em>Live Device Range Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRangeQ()
		 * @generated
		 */
		EClass LIVE_DEVICE_RANGE_Q = eINSTANCE.getLiveDeviceRangeQ();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE_Q__TRACK_ID = eINSTANCE.getLiveDeviceRangeQ_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE_Q__DEVICE_ID = eINSTANCE.getLiveDeviceRangeQ_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE_Q__PARAM = eINSTANCE.getLiveDeviceRangeQ_Param();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeImpl <em>Live Device Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRange()
		 * @generated
		 */
		EClass LIVE_DEVICE_RANGE = eINSTANCE.getLiveDeviceRange();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE__TRACK_ID = eINSTANCE.getLiveDeviceRange_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE__DEVICE_ID = eINSTANCE.getLiveDeviceRange_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeAllImpl <em>Live Device Range All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeAllImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRangeAll()
		 * @generated
		 */
		EClass LIVE_DEVICE_RANGE_ALL = eINSTANCE.getLiveDeviceRangeAll();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE_ALL__TRACK_ID = eINSTANCE.getLiveDeviceRangeAll_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE_ALL__DEVICE_ID = eINSTANCE.getLiveDeviceRangeAll_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceRangeAllQImpl <em>Live Device Range All Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceRangeAllQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceRangeAllQ()
		 * @generated
		 */
		EClass LIVE_DEVICE_RANGE_ALL_Q = eINSTANCE.getLiveDeviceRangeAllQ();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE_ALL_Q__TRACK_ID = eINSTANCE.getLiveDeviceRangeAllQ_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_RANGE_ALL_Q__DEVICE_ID = eINSTANCE.getLiveDeviceRangeAllQ_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeImpl <em>Live Return Device Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRange()
		 * @generated
		 */
		EClass LIVE_RETURN_DEVICE_RANGE = eINSTANCE.getLiveReturnDeviceRange();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE__TRACK_ID = eINSTANCE.getLiveReturnDeviceRange_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE__DEVICE_ID = eINSTANCE.getLiveReturnDeviceRange_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeQImpl <em>Live Return Device Range Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRangeQ()
		 * @generated
		 */
		EClass LIVE_RETURN_DEVICE_RANGE_Q = eINSTANCE.getLiveReturnDeviceRangeQ();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE_Q__TRACK_ID = eINSTANCE.getLiveReturnDeviceRangeQ_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE_Q__DEVICE_ID = eINSTANCE.getLiveReturnDeviceRangeQ_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE_Q__PARAM = eINSTANCE.getLiveReturnDeviceRangeQ_Param();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllImpl <em>Live Return Device Range All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRangeAll()
		 * @generated
		 */
		EClass LIVE_RETURN_DEVICE_RANGE_ALL = eINSTANCE.getLiveReturnDeviceRangeAll();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE_ALL__TRACK_ID = eINSTANCE.getLiveReturnDeviceRangeAll_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE_ALL__DEVICE_ID = eINSTANCE.getLiveReturnDeviceRangeAll_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllQImpl <em>Live Return Device Range All Q</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceRangeAllQImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceRangeAllQ()
		 * @generated
		 */
		EClass LIVE_RETURN_DEVICE_RANGE_ALL_Q = eINSTANCE.getLiveReturnDeviceRangeAllQ();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE_ALL_Q__TRACK_ID = eINSTANCE.getLiveReturnDeviceRangeAllQ_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_RANGE_ALL_Q__DEVICE_ID = eINSTANCE.getLiveReturnDeviceRangeAllQ_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceParamImpl <em>Live Device Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceParamImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceParam()
		 * @generated
		 */
		EClass LIVE_DEVICE_PARAM = eINSTANCE.getLiveDeviceParam();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM__TRACK_ID = eINSTANCE.getLiveDeviceParam_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM__DEVICE_ID = eINSTANCE.getLiveDeviceParam_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM__PARAM = eINSTANCE.getLiveDeviceParam_Param();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM__VALUE = eINSTANCE.getLiveDeviceParam_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM__TYPE = eINSTANCE.getLiveDeviceParam_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM__NAME = eINSTANCE.getLiveDeviceParam_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl <em>Live Device Param Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceParamSetImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDeviceParamSet()
		 * @generated
		 */
		EClass LIVE_DEVICE_PARAM_SET = eINSTANCE.getLiveDeviceParamSet();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__TRACK_ID = eINSTANCE.getLiveDeviceParamSet_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__DEVICE_ID = eINSTANCE.getLiveDeviceParamSet_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__VALUE = eINSTANCE.getLiveDeviceParamSet_Value();

		/**
		 * The meta object literal for the '<em><b>PIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__PINDEX = eINSTANCE.getLiveDeviceParamSet_PIndex();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__MIN = eINSTANCE.getLiveDeviceParamSet_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__MAX = eINSTANCE.getLiveDeviceParamSet_Max();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__STATUS = eINSTANCE.getLiveDeviceParamSet_Status();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE_PARAM_SET__TYPE = eINSTANCE.getLiveDeviceParamSet_Type();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackVolumeImpl <em>Live Track Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackVolumeImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackVolume()
		 * @generated
		 */
		EClass LIVE_TRACK_VOLUME = eINSTANCE.getLiveTrackVolume();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_VOLUME__VOLUME = eINSTANCE.getLiveTrackVolume_Volume();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_VOLUME__TRACK_ID = eINSTANCE.getLiveTrackVolume_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackPanImpl <em>Live Track Pan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackPanImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackPan()
		 * @generated
		 */
		EClass LIVE_TRACK_PAN = eINSTANCE.getLiveTrackPan();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_PAN__PAN = eINSTANCE.getLiveTrackPan_Pan();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_PAN__TRACK_ID = eINSTANCE.getLiveTrackPan_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackMuteImpl <em>Live Track Mute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackMuteImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackMute()
		 * @generated
		 */
		EClass LIVE_TRACK_MUTE = eINSTANCE.getLiveTrackMute();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_MUTE__TRACK_ID = eINSTANCE.getLiveTrackMute_TrackID();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_MUTE__STATE = eINSTANCE.getLiveTrackMute_State();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackSoloImpl <em>Live Track Solo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackSoloImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackSolo()
		 * @generated
		 */
		EClass LIVE_TRACK_SOLO = eINSTANCE.getLiveTrackSolo();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_SOLO__TRACK_ID = eINSTANCE.getLiveTrackSolo_TrackID();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_SOLO__STATE = eINSTANCE.getLiveTrackSolo_State();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackNameImpl <em>Live Track Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackNameImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackName()
		 * @generated
		 */
		EClass LIVE_TRACK_NAME = eINSTANCE.getLiveTrackName();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_NAME__TRACK_ID = eINSTANCE.getLiveTrackName_TrackID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_NAME__NAME = eINSTANCE.getLiveTrackName_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackArmImpl <em>Live Track Arm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackArmImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackArm()
		 * @generated
		 */
		EClass LIVE_TRACK_ARM = eINSTANCE.getLiveTrackArm();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_ARM__TRACK_ID = eINSTANCE.getLiveTrackArm_TrackID();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_ARM__STATE = eINSTANCE.getLiveTrackArm_State();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackSendImpl <em>Live Track Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackSendImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackSend()
		 * @generated
		 */
		EClass LIVE_TRACK_SEND = eINSTANCE.getLiveTrackSend();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_SEND__TRACK_ID = eINSTANCE.getLiveTrackSend_TrackID();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_SEND__SEND = eINSTANCE.getLiveTrackSend_Send();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackPitchImpl <em>Live Track Pitch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackPitchImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackPitch()
		 * @generated
		 */
		EClass LIVE_TRACK_PITCH = eINSTANCE.getLiveTrackPitch();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_PITCH__TRACK_ID = eINSTANCE.getLiveTrackPitch_TrackID();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_PITCH__PITCH = eINSTANCE.getLiveTrackPitch_Pitch();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnVolumeReqImpl <em>Live Return Volume Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnVolumeReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnVolumeReq()
		 * @generated
		 */
		EClass LIVE_RETURN_VOLUME_REQ = eINSTANCE.getLiveReturnVolumeReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_VOLUME_REQ__TRACK_ID = eINSTANCE.getLiveReturnVolumeReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_VOLUME_REQ__LEVEL = eINSTANCE.getLiveReturnVolumeReq_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnPanReqImpl <em>Live Return Pan Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnPanReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnPanReq()
		 * @generated
		 */
		EClass LIVE_RETURN_PAN_REQ = eINSTANCE.getLiveReturnPanReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_PAN_REQ__TRACK_ID = eINSTANCE.getLiveReturnPanReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_PAN_REQ__PAN = eINSTANCE.getLiveReturnPanReq_Pan();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnSendReqImpl <em>Live Return Send Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnSendReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnSendReq()
		 * @generated
		 */
		EClass LIVE_RETURN_SEND_REQ = eINSTANCE.getLiveReturnSendReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SEND_REQ__TRACK_ID = eINSTANCE.getLiveReturnSendReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SEND_REQ__SEND = eINSTANCE.getLiveReturnSendReq_Send();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SEND_REQ__LEVEL = eINSTANCE.getLiveReturnSendReq_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveMasterVolumeReqImpl <em>Live Master Volume Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveMasterVolumeReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterVolumeReq()
		 * @generated
		 */
		EClass LIVE_MASTER_VOLUME_REQ = eINSTANCE.getLiveMasterVolumeReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_VOLUME_REQ__TRACK_ID = eINSTANCE.getLiveMasterVolumeReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_VOLUME_REQ__LEVEL = eINSTANCE.getLiveMasterVolumeReq_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveMasterPanReqImpl <em>Live Master Pan Req</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveMasterPanReqImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterPanReq()
		 * @generated
		 */
		EClass LIVE_MASTER_PAN_REQ = eINSTANCE.getLiveMasterPanReq();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_PAN_REQ__TRACK_ID = eINSTANCE.getLiveMasterPanReq_TrackID();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_PAN_REQ__PAN = eINSTANCE.getLiveMasterPanReq_Pan();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackJumpImpl <em>Live Track Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackJumpImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackJump()
		 * @generated
		 */
		EClass LIVE_TRACK_JUMP = eINSTANCE.getLiveTrackJump();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_JUMP__TRACK_ID = eINSTANCE.getLiveTrackJump_TrackID();

		/**
		 * The meta object literal for the '<em><b>Beats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_JUMP__BEATS = eINSTANCE.getLiveTrackJump_Beats();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackInfoImpl <em>Live Track Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackInfoImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackInfo()
		 * @generated
		 */
		EClass LIVE_TRACK_INFO = eINSTANCE.getLiveTrackInfo();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_INFO__TRACK_ID = eINSTANCE.getLiveTrackInfo_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveTrackDeviceViewImpl <em>Live Track Device View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveTrackDeviceViewImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveTrackDeviceView()
		 * @generated
		 */
		EClass LIVE_TRACK_DEVICE_VIEW = eINSTANCE.getLiveTrackDeviceView();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_DEVICE_VIEW__TRACK_ID = eINSTANCE.getLiveTrackDeviceView_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_TRACK_DEVICE_VIEW__DEVICE_ID = eINSTANCE.getLiveTrackDeviceView_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDeviceViewImpl <em>Live Return Device View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnDeviceViewImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDeviceView()
		 * @generated
		 */
		EClass LIVE_RETURN_DEVICE_VIEW = eINSTANCE.getLiveReturnDeviceView();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_VIEW__TRACK_ID = eINSTANCE.getLiveReturnDeviceView_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICE_VIEW__DEVICE_ID = eINSTANCE.getLiveReturnDeviceView_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveMasterDeviceViewImpl <em>Live Master Device View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveMasterDeviceViewImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterDeviceView()
		 * @generated
		 */
		EClass LIVE_MASTER_DEVICE_VIEW = eINSTANCE.getLiveMasterDeviceView();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_DEVICE_VIEW__DEVICE_ID = eINSTANCE.getLiveMasterDeviceView_DeviceID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDetailViewImpl <em>Live Detail View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDetailViewImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDetailView()
		 * @generated
		 */
		EClass LIVE_DETAIL_VIEW = eINSTANCE.getLiveDetailView();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DETAIL_VIEW__VALUE = eINSTANCE.getLiveDetailView_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveClipInfoImpl <em>Live Clip Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveClipInfoImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveClipInfo()
		 * @generated
		 */
		EClass LIVE_CLIP_INFO = eINSTANCE.getLiveClipInfo();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_INFO__TRACK_ID = eINSTANCE.getLiveClipInfo_TrackID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_INFO__STATUS = eINSTANCE.getLiveClipInfo_Status();

		/**
		 * The meta object literal for the '<em><b>Clip ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_CLIP_INFO__CLIP_ID = eINSTANCE.getLiveClipInfo_ClipID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDevicelistImpl <em>Live Devicelist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDevicelistImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDevicelist()
		 * @generated
		 */
		EClass LIVE_DEVICELIST = eINSTANCE.getLiveDevicelist();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICELIST__TRACK_ID = eINSTANCE.getLiveDevicelist_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveDeviceImpl <em>Live Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveDeviceImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveDevice()
		 * @generated
		 */
		EClass LIVE_DEVICE = eINSTANCE.getLiveDevice();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE__TRACK_ID = eINSTANCE.getLiveDevice_TrackID();

		/**
		 * The meta object literal for the '<em><b>Device ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE__DEVICE_ID = eINSTANCE.getLiveDevice_DeviceID();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE__PARAM = eINSTANCE.getLiveDevice_Param();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_DEVICE__S = eINSTANCE.getLiveDevice_S();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnDevicelistImpl <em>Live Return Devicelist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnDevicelistImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnDevicelist()
		 * @generated
		 */
		EClass LIVE_RETURN_DEVICELIST = eINSTANCE.getLiveReturnDevicelist();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_DEVICELIST__TRACK_ID = eINSTANCE.getLiveReturnDevicelist_TrackID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnVolumeImpl <em>Live Return Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnVolumeImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnVolume()
		 * @generated
		 */
		EClass LIVE_RETURN_VOLUME = eINSTANCE.getLiveReturnVolume();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_VOLUME__TRACK_ID = eINSTANCE.getLiveReturnVolume_TrackID();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_VOLUME__LEVEL = eINSTANCE.getLiveReturnVolume_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnPanImpl <em>Live Return Pan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnPanImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnPan()
		 * @generated
		 */
		EClass LIVE_RETURN_PAN = eINSTANCE.getLiveReturnPan();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_PAN__TRACK_ID = eINSTANCE.getLiveReturnPan_TrackID();

		/**
		 * The meta object literal for the '<em><b>Pan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_PAN__PAN = eINSTANCE.getLiveReturnPan_Pan();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveReturnSendImpl <em>Live Return Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveReturnSendImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveReturnSend()
		 * @generated
		 */
		EClass LIVE_RETURN_SEND = eINSTANCE.getLiveReturnSend();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SEND__TRACK_ID = eINSTANCE.getLiveReturnSend_TrackID();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SEND__SEND = eINSTANCE.getLiveReturnSend_Send();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_RETURN_SEND__LEVEL = eINSTANCE.getLiveReturnSend_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.impl.LiveMasterVolumeImpl <em>Live Master Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.impl.LiveMasterVolumeImpl
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getLiveMasterVolume()
		 * @generated
		 */
		EClass LIVE_MASTER_VOLUME = eINSTANCE.getLiveMasterVolume();

		/**
		 * The meta object literal for the '<em><b>Track ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_VOLUME__TRACK_ID = eINSTANCE.getLiveMasterVolume_TrackID();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVE_MASTER_VOLUME__LEVEL = eINSTANCE.getLiveMasterVolume_Level();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.TRACK_ARM_STATUS <em>TRACK ARM STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.TRACK_ARM_STATUS
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getTRACK_ARM_STATUS()
		 * @generated
		 */
		EEnum TRACK_ARM_STATUS = eINSTANCE.getTRACK_ARM_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.TRACK_MUTE_STATUS <em>TRACK MUTE STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.TRACK_MUTE_STATUS
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getTRACK_MUTE_STATUS()
		 * @generated
		 */
		EEnum TRACK_MUTE_STATUS = eINSTANCE.getTRACK_MUTE_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.TRACK_SOLO_STATUS <em>TRACK SOLO STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.TRACK_SOLO_STATUS
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getTRACK_SOLO_STATUS()
		 * @generated
		 */
		EEnum TRACK_SOLO_STATUS = eINSTANCE.getTRACK_SOLO_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.CLIP_STATE <em>CLIP STATE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.CLIP_STATE
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getCLIP_STATE()
		 * @generated
		 */
		EEnum CLIP_STATE = eINSTANCE.getCLIP_STATE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.PLAY_STATUS <em>PLAY STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.PLAY_STATUS
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getPLAY_STATUS()
		 * @generated
		 */
		EEnum PLAY_STATUS = eINSTANCE.getPLAY_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezableton.METER_INPUT <em>METER INPUT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezableton.METER_INPUT
		 * @see net.sf.smbt.ezableton.impl.EzabletonPackageImpl#getMETER_INPUT()
		 * @generated
		 */
		EEnum METER_INPUT = eINSTANCE.getMETER_INPUT();

	}

} //EzabletonPackage
