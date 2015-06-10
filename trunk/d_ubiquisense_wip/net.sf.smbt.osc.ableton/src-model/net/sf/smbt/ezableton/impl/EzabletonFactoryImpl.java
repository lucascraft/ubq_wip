/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.*;
import net.sf.smbt.ezableton.AbletonLiveSndCmd;
import net.sf.smbt.ezableton.CLIP_STATE;
import net.sf.smbt.ezableton.EzabletonFactory;
import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveArmReq;
import net.sf.smbt.ezableton.LiveClipInfo;
import net.sf.smbt.ezableton.LiveClipPosition;
import net.sf.smbt.ezableton.LiveDetailView;
import net.sf.smbt.ezableton.LiveDevice;
import net.sf.smbt.ezableton.LiveDeviceParam;
import net.sf.smbt.ezableton.LiveDeviceParamSet;
import net.sf.smbt.ezableton.LiveDeviceRange;
import net.sf.smbt.ezableton.LiveDeviceRangeAll;
import net.sf.smbt.ezableton.LiveDeviceRangeAllQ;
import net.sf.smbt.ezableton.LiveDeviceRangeQ;
import net.sf.smbt.ezableton.LiveDeviceView;
import net.sf.smbt.ezableton.LiveDevicelist;
import net.sf.smbt.ezableton.LiveMasterDeviceView;
import net.sf.smbt.ezableton.LiveMasterMeter;
import net.sf.smbt.ezableton.LiveMasterPanReq;
import net.sf.smbt.ezableton.LiveMasterVolume;
import net.sf.smbt.ezableton.LiveMasterVolumeReq;
import net.sf.smbt.ezableton.LiveMuteReq;
import net.sf.smbt.ezableton.LiveNameClipQ;
import net.sf.smbt.ezableton.LiveNameClipReq;
import net.sf.smbt.ezableton.LiveNameClipblockreq;
import net.sf.smbt.ezableton.LiveNameSceneBlockReq;
import net.sf.smbt.ezableton.LiveNameSceneQ;
import net.sf.smbt.ezableton.LiveNameSceneReq;
import net.sf.smbt.ezableton.LiveNameTrackQ;
import net.sf.smbt.ezableton.LiveNameTrackReq;
import net.sf.smbt.ezableton.LiveNameTrackblockReq;
import net.sf.smbt.ezableton.LiveNextCueReq;
import net.sf.smbt.ezableton.LiveOverdub;
import net.sf.smbt.ezableton.LivePanSet;
import net.sf.smbt.ezableton.LivePitchSet;
import net.sf.smbt.ezableton.LivePlay;
import net.sf.smbt.ezableton.LivePlayClipReq;
import net.sf.smbt.ezableton.LivePlayClipSlotReq;
import net.sf.smbt.ezableton.LivePlayContinueReq;
import net.sf.smbt.ezableton.LivePlayReq;
import net.sf.smbt.ezableton.LivePlaySceneReq;
import net.sf.smbt.ezableton.LivePrevCueReq;
import net.sf.smbt.ezableton.LiveRedoReq;
import net.sf.smbt.ezableton.LiveReturnDeviceRange;
import net.sf.smbt.ezableton.LiveReturnDeviceRangeAll;
import net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ;
import net.sf.smbt.ezableton.LiveReturnDeviceRangeQ;
import net.sf.smbt.ezableton.LiveReturnDeviceView;
import net.sf.smbt.ezableton.LiveReturnDevicelist;
import net.sf.smbt.ezableton.LiveReturnMeter;
import net.sf.smbt.ezableton.LiveReturnMuteReq;
import net.sf.smbt.ezableton.LiveReturnPan;
import net.sf.smbt.ezableton.LiveReturnPanReq;
import net.sf.smbt.ezableton.LiveReturnSend;
import net.sf.smbt.ezableton.LiveReturnSendReq;
import net.sf.smbt.ezableton.LiveReturnSolo;
import net.sf.smbt.ezableton.LiveReturnVolume;
import net.sf.smbt.ezableton.LiveReturnVolumeReq;
import net.sf.smbt.ezableton.LiveScene2;
import net.sf.smbt.ezableton.LiveSceneReq;
import net.sf.smbt.ezableton.LiveScenesQ;
import net.sf.smbt.ezableton.LiveScenesReq;
import net.sf.smbt.ezableton.LiveSendReq;
import net.sf.smbt.ezableton.LiveStateRcv;
import net.sf.smbt.ezableton.LiveStateReq;
import net.sf.smbt.ezableton.LiveStopClipReq;
import net.sf.smbt.ezableton.LiveStopReq;
import net.sf.smbt.ezableton.LiveStopTrackReq;
import net.sf.smbt.ezableton.LiveTempoRcv;
import net.sf.smbt.ezableton.LiveTempoReq;
import net.sf.smbt.ezableton.LiveTimeRcv;
import net.sf.smbt.ezableton.LiveTimeReq;
import net.sf.smbt.ezableton.LiveTrackDeviceView;
import net.sf.smbt.ezableton.LiveTrackInfo;
import net.sf.smbt.ezableton.LiveTrackJump;
import net.sf.smbt.ezableton.LiveTrackMeter;
import net.sf.smbt.ezableton.LiveTracksQ;
import net.sf.smbt.ezableton.LiveTracksReq;
import net.sf.smbt.ezableton.LiveUndoReq;
import net.sf.smbt.ezableton.LiveVolume;
import net.sf.smbt.ezableton.LiveVolumeSet;
import net.sf.smbt.ezableton.METER_INPUT;
import net.sf.smbt.ezableton.PLAY_STATUS;
import net.sf.smbt.ezableton.TRACK_ARM_STATUS;
import net.sf.smbt.ezableton.TRACK_MUTE_STATUS;
import net.sf.smbt.ezableton.TRACK_SOLO_STATUS;
import net.sf.smbt.ezableton.livePlaySelectionReq;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EzabletonFactoryImpl extends EFactoryImpl implements EzabletonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzabletonFactory init() {
		try {
			EzabletonFactory theEzabletonFactory = (EzabletonFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezableton/1.0"); 
			if (theEzabletonFactory != null) {
				return theEzabletonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzabletonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonFactoryImpl() {
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
			case EzabletonPackage.ABLETON_LIVE_SND_CMD: return createAbletonLiveSndCmd();
			case EzabletonPackage.LIVE_TEMPO_REQ: return createLiveTempoReq();
			case EzabletonPackage.LIVE_TEMPO_RCV: return createLiveTempoRcv();
			case EzabletonPackage.LIVE_TIME_REQ: return createLiveTimeReq();
			case EzabletonPackage.LIVE_TIME_RCV: return createLiveTimeRcv();
			case EzabletonPackage.LIVE_OVERDUB: return createLiveOverdub();
			case EzabletonPackage.LIVE_STATE_REQ: return createLiveStateReq();
			case EzabletonPackage.LIVE_STATE_RCV: return createLiveStateRcv();
			case EzabletonPackage.LIVE_UNDO_REQ: return createLiveUndoReq();
			case EzabletonPackage.LIVE_REDO_REQ: return createLiveRedoReq();
			case EzabletonPackage.LIVE_NEXT_CUE_REQ: return createLiveNextCueReq();
			case EzabletonPackage.LIVE_PREV_CUE_REQ: return createLivePrevCueReq();
			case EzabletonPackage.LIVE_PLAY_REQ: return createLivePlayReq();
			case EzabletonPackage.LIVE_PLAY_CONTINUE_REQ: return createLivePlayContinueReq();
			case EzabletonPackage.LIVE_PLAY_CLIP_REQ: return createLivePlayClipReq();
			case EzabletonPackage.LIVE_PLAY_SELECTION_REQ: return createlivePlaySelectionReq();
			case EzabletonPackage.LIVE_PLAY_CLIP_SLOT_REQ: return createLivePlayClipSlotReq();
			case EzabletonPackage.LIVE_PLAY_SCENE_REQ: return createLivePlaySceneReq();
			case EzabletonPackage.LIVE_STOP_REQ: return createLiveStopReq();
			case EzabletonPackage.LIVE_STOP_CLIP_REQ: return createLiveStopClipReq();
			case EzabletonPackage.LIVE_STOP_TRACK_REQ: return createLiveStopTrackReq();
			case EzabletonPackage.LIVE_SCENES_REQ: return createLiveScenesReq();
			case EzabletonPackage.LIVE_TRACKS_REQ: return createLiveTracksReq();
			case EzabletonPackage.LIVE_SCENE_REQ: return createLiveSceneReq();
			case EzabletonPackage.LIVE_NAME_SCENE_BLOCK_REQ: return createLiveNameSceneBlockReq();
			case EzabletonPackage.LIVE_NAME_TRACK_REQ: return createLiveNameTrackReq();
			case EzabletonPackage.LIVE_NAME_TRACKBLOCK_REQ: return createLiveNameTrackblockReq();
			case EzabletonPackage.LIVE_NAME_CLIP_REQ: return createLiveNameClipReq();
			case EzabletonPackage.LIVE_NAME_CLIPBLOCKREQ: return createLiveNameClipblockreq();
			case EzabletonPackage.LIVE_ARM_REQ: return createLiveArmReq();
			case EzabletonPackage.LIVE_MUTE_REQ: return createLiveMuteReq();
			case EzabletonPackage.LIVE_VOLUME_SET: return createLiveVolumeSet();
			case EzabletonPackage.LIVE_PAN_SET: return createLivePanSet();
			case EzabletonPackage.LIVE_SEND_REQ: return createLiveSendReq();
			case EzabletonPackage.LIVE_PITCH_SET: return createLivePitchSet();
			case EzabletonPackage.LIVE_RETURN_MUTE_REQ: return createLiveReturnMuteReq();
			case EzabletonPackage.LIVE_RETURN_VOLUME_REQ: return createLiveReturnVolumeReq();
			case EzabletonPackage.LIVE_RETURN_PAN_REQ: return createLiveReturnPanReq();
			case EzabletonPackage.LIVE_RETURN_SEND_REQ: return createLiveReturnSendReq();
			case EzabletonPackage.LIVE_MASTER_VOLUME_REQ: return createLiveMasterVolumeReq();
			case EzabletonPackage.LIVE_MASTER_PAN_REQ: return createLiveMasterPanReq();
			case EzabletonPackage.LIVE_TRACK_JUMP: return createLiveTrackJump();
			case EzabletonPackage.LIVE_TRACK_INFO: return createLiveTrackInfo();
			case EzabletonPackage.LIVE_TRACK_DEVICE_VIEW: return createLiveTrackDeviceView();
			case EzabletonPackage.LIVE_RETURN_DEVICE_VIEW: return createLiveReturnDeviceView();
			case EzabletonPackage.LIVE_MASTER_DEVICE_VIEW: return createLiveMasterDeviceView();
			case EzabletonPackage.LIVE_DETAIL_VIEW: return createLiveDetailView();
			case EzabletonPackage.LIVE_CLIP_INFO: return createLiveClipInfo();
			case EzabletonPackage.LIVE_DEVICELIST: return createLiveDevicelist();
			case EzabletonPackage.LIVE_DEVICE: return createLiveDevice();
			case EzabletonPackage.LIVE_RETURN_DEVICELIST: return createLiveReturnDevicelist();
			case EzabletonPackage.LIVE_RETURN_VOLUME: return createLiveReturnVolume();
			case EzabletonPackage.LIVE_RETURN_PAN: return createLiveReturnPan();
			case EzabletonPackage.LIVE_RETURN_SEND: return createLiveReturnSend();
			case EzabletonPackage.LIVE_MASTER_VOLUME: return createLiveMasterVolume();
			case EzabletonPackage.LIVE_RETURN_SOLO: return createLiveReturnSolo();
			case EzabletonPackage.LIVE_DEVICE_VIEW: return createLiveDeviceView();
			case EzabletonPackage.LIVE_MASTER_METER: return createLiveMasterMeter();
			case EzabletonPackage.LIVE_CLIP_POSITION: return createLiveClipPosition();
			case EzabletonPackage.LIVE_TRACK_METER: return createLiveTrackMeter();
			case EzabletonPackage.LIVE_NAME_TRACK_Q: return createLiveNameTrackQ();
			case EzabletonPackage.LIVE_NAME_SCENE_Q: return createLiveNameSceneQ();
			case EzabletonPackage.LIVE_NAME_CLIP_Q: return createLiveNameClipQ();
			case EzabletonPackage.LIVE_NAME_SCENE_REQ: return createLiveNameSceneReq();
			case EzabletonPackage.LIVE_SCENES_Q: return createLiveScenesQ();
			case EzabletonPackage.LIVE_TRACKS_Q: return createLiveTracksQ();
			case EzabletonPackage.LIVE_PLAY: return createLivePlay();
			case EzabletonPackage.LIVE_VOLUME: return createLiveVolume();
			case EzabletonPackage.LIVE_SCENE2: return createLiveScene2();
			case EzabletonPackage.LIVE_RETURN_METER: return createLiveReturnMeter();
			case EzabletonPackage.LIVE_DEVICE_RANGE_Q: return createLiveDeviceRangeQ();
			case EzabletonPackage.LIVE_DEVICE_RANGE: return createLiveDeviceRange();
			case EzabletonPackage.LIVE_DEVICE_RANGE_ALL: return createLiveDeviceRangeAll();
			case EzabletonPackage.LIVE_DEVICE_RANGE_ALL_Q: return createLiveDeviceRangeAllQ();
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE: return createLiveReturnDeviceRange();
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE_Q: return createLiveReturnDeviceRangeQ();
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE_ALL: return createLiveReturnDeviceRangeAll();
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE_ALL_Q: return createLiveReturnDeviceRangeAllQ();
			case EzabletonPackage.LIVE_DEVICE_PARAM: return createLiveDeviceParam();
			case EzabletonPackage.LIVE_DEVICE_PARAM_SET: return createLiveDeviceParamSet();
			case EzabletonPackage.LIVE_TRACK_VOLUME: return createLiveTrackVolume();
			case EzabletonPackage.LIVE_TRACK_PAN: return createLiveTrackPan();
			case EzabletonPackage.LIVE_TRACK_MUTE: return createLiveTrackMute();
			case EzabletonPackage.LIVE_TRACK_SOLO: return createLiveTrackSolo();
			case EzabletonPackage.LIVE_TRACK_NAME: return createLiveTrackName();
			case EzabletonPackage.LIVE_TRACK_ARM: return createLiveTrackArm();
			case EzabletonPackage.LIVE_TRACK_SEND: return createLiveTrackSend();
			case EzabletonPackage.LIVE_TRACK_PITCH: return createLiveTrackPitch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzabletonPackage.TRACK_ARM_STATUS:
				return createTRACK_ARM_STATUSFromString(eDataType, initialValue);
			case EzabletonPackage.TRACK_MUTE_STATUS:
				return createTRACK_MUTE_STATUSFromString(eDataType, initialValue);
			case EzabletonPackage.TRACK_SOLO_STATUS:
				return createTRACK_SOLO_STATUSFromString(eDataType, initialValue);
			case EzabletonPackage.CLIP_STATE:
				return createCLIP_STATEFromString(eDataType, initialValue);
			case EzabletonPackage.PLAY_STATUS:
				return createPLAY_STATUSFromString(eDataType, initialValue);
			case EzabletonPackage.METER_INPUT:
				return createMETER_INPUTFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzabletonPackage.TRACK_ARM_STATUS:
				return convertTRACK_ARM_STATUSToString(eDataType, instanceValue);
			case EzabletonPackage.TRACK_MUTE_STATUS:
				return convertTRACK_MUTE_STATUSToString(eDataType, instanceValue);
			case EzabletonPackage.TRACK_SOLO_STATUS:
				return convertTRACK_SOLO_STATUSToString(eDataType, instanceValue);
			case EzabletonPackage.CLIP_STATE:
				return convertCLIP_STATEToString(eDataType, instanceValue);
			case EzabletonPackage.PLAY_STATUS:
				return convertPLAY_STATUSToString(eDataType, instanceValue);
			case EzabletonPackage.METER_INPUT:
				return convertMETER_INPUTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbletonLiveSndCmd createAbletonLiveSndCmd() {
		AbletonLiveSndCmdImpl abletonLiveSndCmd = new AbletonLiveSndCmdImpl();
		return abletonLiveSndCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTempoReq createLiveTempoReq() {
		LiveTempoReqImpl liveTempoReq = new LiveTempoReqImpl();
		return liveTempoReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTempoRcv createLiveTempoRcv() {
		LiveTempoRcvImpl liveTempoRcv = new LiveTempoRcvImpl();
		return liveTempoRcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTimeReq createLiveTimeReq() {
		LiveTimeReqImpl liveTimeReq = new LiveTimeReqImpl();
		return liveTimeReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTimeRcv createLiveTimeRcv() {
		LiveTimeRcvImpl liveTimeRcv = new LiveTimeRcvImpl();
		return liveTimeRcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveOverdub createLiveOverdub() {
		LiveOverdubImpl liveOverdub = new LiveOverdubImpl();
		return liveOverdub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveStateReq createLiveStateReq() {
		LiveStateReqImpl liveStateReq = new LiveStateReqImpl();
		return liveStateReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveStateRcv createLiveStateRcv() {
		LiveStateRcvImpl liveStateRcv = new LiveStateRcvImpl();
		return liveStateRcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveUndoReq createLiveUndoReq() {
		LiveUndoReqImpl liveUndoReq = new LiveUndoReqImpl();
		return liveUndoReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveRedoReq createLiveRedoReq() {
		LiveRedoReqImpl liveRedoReq = new LiveRedoReqImpl();
		return liveRedoReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNextCueReq createLiveNextCueReq() {
		LiveNextCueReqImpl liveNextCueReq = new LiveNextCueReqImpl();
		return liveNextCueReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePrevCueReq createLivePrevCueReq() {
		LivePrevCueReqImpl livePrevCueReq = new LivePrevCueReqImpl();
		return livePrevCueReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePlayReq createLivePlayReq() {
		LivePlayReqImpl livePlayReq = new LivePlayReqImpl();
		return livePlayReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePlayContinueReq createLivePlayContinueReq() {
		LivePlayContinueReqImpl livePlayContinueReq = new LivePlayContinueReqImpl();
		return livePlayContinueReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePlayClipReq createLivePlayClipReq() {
		LivePlayClipReqImpl livePlayClipReq = new LivePlayClipReqImpl();
		return livePlayClipReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public livePlaySelectionReq createlivePlaySelectionReq() {
		livePlaySelectionReqImpl livePlaySelectionReq = new livePlaySelectionReqImpl();
		return livePlaySelectionReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePlayClipSlotReq createLivePlayClipSlotReq() {
		LivePlayClipSlotReqImpl livePlayClipSlotReq = new LivePlayClipSlotReqImpl();
		return livePlayClipSlotReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePlaySceneReq createLivePlaySceneReq() {
		LivePlaySceneReqImpl livePlaySceneReq = new LivePlaySceneReqImpl();
		return livePlaySceneReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveStopReq createLiveStopReq() {
		LiveStopReqImpl liveStopReq = new LiveStopReqImpl();
		return liveStopReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveStopClipReq createLiveStopClipReq() {
		LiveStopClipReqImpl liveStopClipReq = new LiveStopClipReqImpl();
		return liveStopClipReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveStopTrackReq createLiveStopTrackReq() {
		LiveStopTrackReqImpl liveStopTrackReq = new LiveStopTrackReqImpl();
		return liveStopTrackReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveScenesReq createLiveScenesReq() {
		LiveScenesReqImpl liveScenesReq = new LiveScenesReqImpl();
		return liveScenesReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTracksReq createLiveTracksReq() {
		LiveTracksReqImpl liveTracksReq = new LiveTracksReqImpl();
		return liveTracksReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveSceneReq createLiveSceneReq() {
		LiveSceneReqImpl liveSceneReq = new LiveSceneReqImpl();
		return liveSceneReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameSceneBlockReq createLiveNameSceneBlockReq() {
		LiveNameSceneBlockReqImpl liveNameSceneBlockReq = new LiveNameSceneBlockReqImpl();
		return liveNameSceneBlockReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameTrackReq createLiveNameTrackReq() {
		LiveNameTrackReqImpl liveNameTrackReq = new LiveNameTrackReqImpl();
		return liveNameTrackReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameTrackblockReq createLiveNameTrackblockReq() {
		LiveNameTrackblockReqImpl liveNameTrackblockReq = new LiveNameTrackblockReqImpl();
		return liveNameTrackblockReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameClipReq createLiveNameClipReq() {
		LiveNameClipReqImpl liveNameClipReq = new LiveNameClipReqImpl();
		return liveNameClipReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameClipblockreq createLiveNameClipblockreq() {
		LiveNameClipblockreqImpl liveNameClipblockreq = new LiveNameClipblockreqImpl();
		return liveNameClipblockreq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveArmReq createLiveArmReq() {
		LiveArmReqImpl liveArmReq = new LiveArmReqImpl();
		return liveArmReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMuteReq createLiveMuteReq() {
		LiveMuteReqImpl liveMuteReq = new LiveMuteReqImpl();
		return liveMuteReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveVolumeSet createLiveVolumeSet() {
		LiveVolumeSetImpl liveVolumeSet = new LiveVolumeSetImpl();
		return liveVolumeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePanSet createLivePanSet() {
		LivePanSetImpl livePanSet = new LivePanSetImpl();
		return livePanSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveSendReq createLiveSendReq() {
		LiveSendReqImpl liveSendReq = new LiveSendReqImpl();
		return liveSendReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePitchSet createLivePitchSet() {
		LivePitchSetImpl livePitchSet = new LivePitchSetImpl();
		return livePitchSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnMuteReq createLiveReturnMuteReq() {
		LiveReturnMuteReqImpl liveReturnMuteReq = new LiveReturnMuteReqImpl();
		return liveReturnMuteReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnSolo createLiveReturnSolo() {
		LiveReturnSoloImpl liveReturnSolo = new LiveReturnSoloImpl();
		return liveReturnSolo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeviceView createLiveDeviceView() {
		LiveDeviceViewImpl liveDeviceView = new LiveDeviceViewImpl();
		return liveDeviceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMasterMeter createLiveMasterMeter() {
		LiveMasterMeterImpl liveMasterMeter = new LiveMasterMeterImpl();
		return liveMasterMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveClipPosition createLiveClipPosition() {
		LiveClipPositionImpl liveClipPosition = new LiveClipPositionImpl();
		return liveClipPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackMeter createLiveTrackMeter() {
		LiveTrackMeterImpl liveTrackMeter = new LiveTrackMeterImpl();
		return liveTrackMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameTrackQ createLiveNameTrackQ() {
		LiveNameTrackQImpl liveNameTrackQ = new LiveNameTrackQImpl();
		return liveNameTrackQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameSceneQ createLiveNameSceneQ() {
		LiveNameSceneQImpl liveNameSceneQ = new LiveNameSceneQImpl();
		return liveNameSceneQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameClipQ createLiveNameClipQ() {
		LiveNameClipQImpl liveNameClipQ = new LiveNameClipQImpl();
		return liveNameClipQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveNameSceneReq createLiveNameSceneReq() {
		LiveNameSceneReqImpl liveNameSceneReq = new LiveNameSceneReqImpl();
		return liveNameSceneReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveScenesQ createLiveScenesQ() {
		LiveScenesQImpl liveScenesQ = new LiveScenesQImpl();
		return liveScenesQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTracksQ createLiveTracksQ() {
		LiveTracksQImpl liveTracksQ = new LiveTracksQImpl();
		return liveTracksQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LivePlay createLivePlay() {
		LivePlayImpl livePlay = new LivePlayImpl();
		return livePlay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveVolume createLiveVolume() {
		LiveVolumeImpl liveVolume = new LiveVolumeImpl();
		return liveVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveScene2 createLiveScene2() {
		LiveScene2Impl liveScene2 = new LiveScene2Impl();
		return liveScene2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnMeter createLiveReturnMeter() {
		LiveReturnMeterImpl liveReturnMeter = new LiveReturnMeterImpl();
		return liveReturnMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeviceRangeQ createLiveDeviceRangeQ() {
		LiveDeviceRangeQImpl liveDeviceRangeQ = new LiveDeviceRangeQImpl();
		return liveDeviceRangeQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeviceRange createLiveDeviceRange() {
		LiveDeviceRangeImpl liveDeviceRange = new LiveDeviceRangeImpl();
		return liveDeviceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeviceRangeAll createLiveDeviceRangeAll() {
		LiveDeviceRangeAllImpl liveDeviceRangeAll = new LiveDeviceRangeAllImpl();
		return liveDeviceRangeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeviceRangeAllQ createLiveDeviceRangeAllQ() {
		LiveDeviceRangeAllQImpl liveDeviceRangeAllQ = new LiveDeviceRangeAllQImpl();
		return liveDeviceRangeAllQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnDeviceRange createLiveReturnDeviceRange() {
		LiveReturnDeviceRangeImpl liveReturnDeviceRange = new LiveReturnDeviceRangeImpl();
		return liveReturnDeviceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnDeviceRangeQ createLiveReturnDeviceRangeQ() {
		LiveReturnDeviceRangeQImpl liveReturnDeviceRangeQ = new LiveReturnDeviceRangeQImpl();
		return liveReturnDeviceRangeQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnDeviceRangeAll createLiveReturnDeviceRangeAll() {
		LiveReturnDeviceRangeAllImpl liveReturnDeviceRangeAll = new LiveReturnDeviceRangeAllImpl();
		return liveReturnDeviceRangeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnDeviceRangeAllQ createLiveReturnDeviceRangeAllQ() {
		LiveReturnDeviceRangeAllQImpl liveReturnDeviceRangeAllQ = new LiveReturnDeviceRangeAllQImpl();
		return liveReturnDeviceRangeAllQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeviceParam createLiveDeviceParam() {
		LiveDeviceParamImpl liveDeviceParam = new LiveDeviceParamImpl();
		return liveDeviceParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDeviceParamSet createLiveDeviceParamSet() {
		LiveDeviceParamSetImpl liveDeviceParamSet = new LiveDeviceParamSetImpl();
		return liveDeviceParamSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackVolume createLiveTrackVolume() {
		LiveTrackVolumeImpl liveTrackVolume = new LiveTrackVolumeImpl();
		return liveTrackVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackPan createLiveTrackPan() {
		LiveTrackPanImpl liveTrackPan = new LiveTrackPanImpl();
		return liveTrackPan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackMute createLiveTrackMute() {
		LiveTrackMuteImpl liveTrackMute = new LiveTrackMuteImpl();
		return liveTrackMute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackSolo createLiveTrackSolo() {
		LiveTrackSoloImpl liveTrackSolo = new LiveTrackSoloImpl();
		return liveTrackSolo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackName createLiveTrackName() {
		LiveTrackNameImpl liveTrackName = new LiveTrackNameImpl();
		return liveTrackName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackArm createLiveTrackArm() {
		LiveTrackArmImpl liveTrackArm = new LiveTrackArmImpl();
		return liveTrackArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackSend createLiveTrackSend() {
		LiveTrackSendImpl liveTrackSend = new LiveTrackSendImpl();
		return liveTrackSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackPitch createLiveTrackPitch() {
		LiveTrackPitchImpl liveTrackPitch = new LiveTrackPitchImpl();
		return liveTrackPitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnVolumeReq createLiveReturnVolumeReq() {
		LiveReturnVolumeReqImpl liveReturnVolumeReq = new LiveReturnVolumeReqImpl();
		return liveReturnVolumeReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnPanReq createLiveReturnPanReq() {
		LiveReturnPanReqImpl liveReturnPanReq = new LiveReturnPanReqImpl();
		return liveReturnPanReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnSendReq createLiveReturnSendReq() {
		LiveReturnSendReqImpl liveReturnSendReq = new LiveReturnSendReqImpl();
		return liveReturnSendReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMasterVolumeReq createLiveMasterVolumeReq() {
		LiveMasterVolumeReqImpl liveMasterVolumeReq = new LiveMasterVolumeReqImpl();
		return liveMasterVolumeReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMasterPanReq createLiveMasterPanReq() {
		LiveMasterPanReqImpl liveMasterPanReq = new LiveMasterPanReqImpl();
		return liveMasterPanReq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackJump createLiveTrackJump() {
		LiveTrackJumpImpl liveTrackJump = new LiveTrackJumpImpl();
		return liveTrackJump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackInfo createLiveTrackInfo() {
		LiveTrackInfoImpl liveTrackInfo = new LiveTrackInfoImpl();
		return liveTrackInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackDeviceView createLiveTrackDeviceView() {
		LiveTrackDeviceViewImpl liveTrackDeviceView = new LiveTrackDeviceViewImpl();
		return liveTrackDeviceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnDeviceView createLiveReturnDeviceView() {
		LiveReturnDeviceViewImpl liveReturnDeviceView = new LiveReturnDeviceViewImpl();
		return liveReturnDeviceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMasterDeviceView createLiveMasterDeviceView() {
		LiveMasterDeviceViewImpl liveMasterDeviceView = new LiveMasterDeviceViewImpl();
		return liveMasterDeviceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDetailView createLiveDetailView() {
		LiveDetailViewImpl liveDetailView = new LiveDetailViewImpl();
		return liveDetailView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveClipInfo createLiveClipInfo() {
		LiveClipInfoImpl liveClipInfo = new LiveClipInfoImpl();
		return liveClipInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDevicelist createLiveDevicelist() {
		LiveDevicelistImpl liveDevicelist = new LiveDevicelistImpl();
		return liveDevicelist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveDevice createLiveDevice() {
		LiveDeviceImpl liveDevice = new LiveDeviceImpl();
		return liveDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnDevicelist createLiveReturnDevicelist() {
		LiveReturnDevicelistImpl liveReturnDevicelist = new LiveReturnDevicelistImpl();
		return liveReturnDevicelist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnVolume createLiveReturnVolume() {
		LiveReturnVolumeImpl liveReturnVolume = new LiveReturnVolumeImpl();
		return liveReturnVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnPan createLiveReturnPan() {
		LiveReturnPanImpl liveReturnPan = new LiveReturnPanImpl();
		return liveReturnPan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveReturnSend createLiveReturnSend() {
		LiveReturnSendImpl liveReturnSend = new LiveReturnSendImpl();
		return liveReturnSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMasterVolume createLiveMasterVolume() {
		LiveMasterVolumeImpl liveMasterVolume = new LiveMasterVolumeImpl();
		return liveMasterVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_ARM_STATUS createTRACK_ARM_STATUSFromString(EDataType eDataType, String initialValue) {
		TRACK_ARM_STATUS result = TRACK_ARM_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRACK_ARM_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_MUTE_STATUS createTRACK_MUTE_STATUSFromString(EDataType eDataType, String initialValue) {
		TRACK_MUTE_STATUS result = TRACK_MUTE_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRACK_MUTE_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_SOLO_STATUS createTRACK_SOLO_STATUSFromString(EDataType eDataType, String initialValue) {
		TRACK_SOLO_STATUS result = TRACK_SOLO_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRACK_SOLO_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLIP_STATE createCLIP_STATEFromString(EDataType eDataType, String initialValue) {
		CLIP_STATE result = CLIP_STATE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCLIP_STATEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLAY_STATUS createPLAY_STATUSFromString(EDataType eDataType, String initialValue) {
		PLAY_STATUS result = PLAY_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPLAY_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public METER_INPUT createMETER_INPUTFromString(EDataType eDataType, String initialValue) {
		METER_INPUT result = METER_INPUT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMETER_INPUTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonPackage getEzabletonPackage() {
		return (EzabletonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzabletonPackage getPackage() {
		return EzabletonPackage.eINSTANCE;
	}

} //EzabletonFactoryImpl
