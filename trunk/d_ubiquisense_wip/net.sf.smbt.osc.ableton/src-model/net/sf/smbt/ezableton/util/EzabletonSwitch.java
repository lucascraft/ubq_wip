/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.util;

import net.sf.smbt.ezableton.*;
import net.sf.smbt.ezableton.AbletonLiveSndCmd;
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
import net.sf.smbt.ezableton.livePlaySelectionReq;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.OscSndCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezableton.EzabletonPackage
 * @generated
 */
public class EzabletonSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzabletonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonSwitch() {
		if (modelPackage == null) {
			modelPackage = EzabletonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzabletonPackage.ABLETON_LIVE_SND_CMD: {
				AbletonLiveSndCmd abletonLiveSndCmd = (AbletonLiveSndCmd)theEObject;
				T result = caseAbletonLiveSndCmd(abletonLiveSndCmd);
				if (result == null) result = caseOscSndCmd(abletonLiveSndCmd);
				if (result == null) result = caseOscCmd(abletonLiveSndCmd);
				if (result == null) result = caseCmd(abletonLiveSndCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TEMPO_REQ: {
				LiveTempoReq liveTempoReq = (LiveTempoReq)theEObject;
				T result = caseLiveTempoReq(liveTempoReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveTempoReq);
				if (result == null) result = caseOscSndCmd(liveTempoReq);
				if (result == null) result = caseOscCmd(liveTempoReq);
				if (result == null) result = caseCmd(liveTempoReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TEMPO_RCV: {
				LiveTempoRcv liveTempoRcv = (LiveTempoRcv)theEObject;
				T result = caseLiveTempoRcv(liveTempoRcv);
				if (result == null) result = caseAbletonLiveSndCmd(liveTempoRcv);
				if (result == null) result = caseOscSndCmd(liveTempoRcv);
				if (result == null) result = caseOscCmd(liveTempoRcv);
				if (result == null) result = caseCmd(liveTempoRcv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TIME_REQ: {
				LiveTimeReq liveTimeReq = (LiveTimeReq)theEObject;
				T result = caseLiveTimeReq(liveTimeReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveTimeReq);
				if (result == null) result = caseOscSndCmd(liveTimeReq);
				if (result == null) result = caseOscCmd(liveTimeReq);
				if (result == null) result = caseCmd(liveTimeReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TIME_RCV: {
				LiveTimeRcv liveTimeRcv = (LiveTimeRcv)theEObject;
				T result = caseLiveTimeRcv(liveTimeRcv);
				if (result == null) result = caseAbletonLiveSndCmd(liveTimeRcv);
				if (result == null) result = caseOscSndCmd(liveTimeRcv);
				if (result == null) result = caseOscCmd(liveTimeRcv);
				if (result == null) result = caseCmd(liveTimeRcv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_OVERDUB: {
				LiveOverdub liveOverdub = (LiveOverdub)theEObject;
				T result = caseLiveOverdub(liveOverdub);
				if (result == null) result = caseAbletonLiveSndCmd(liveOverdub);
				if (result == null) result = caseOscSndCmd(liveOverdub);
				if (result == null) result = caseOscCmd(liveOverdub);
				if (result == null) result = caseCmd(liveOverdub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_STATE_REQ: {
				LiveStateReq liveStateReq = (LiveStateReq)theEObject;
				T result = caseLiveStateReq(liveStateReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveStateReq);
				if (result == null) result = caseOscSndCmd(liveStateReq);
				if (result == null) result = caseOscCmd(liveStateReq);
				if (result == null) result = caseCmd(liveStateReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_STATE_RCV: {
				LiveStateRcv liveStateRcv = (LiveStateRcv)theEObject;
				T result = caseLiveStateRcv(liveStateRcv);
				if (result == null) result = caseAbletonLiveSndCmd(liveStateRcv);
				if (result == null) result = caseOscSndCmd(liveStateRcv);
				if (result == null) result = caseOscCmd(liveStateRcv);
				if (result == null) result = caseCmd(liveStateRcv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_UNDO_REQ: {
				LiveUndoReq liveUndoReq = (LiveUndoReq)theEObject;
				T result = caseLiveUndoReq(liveUndoReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveUndoReq);
				if (result == null) result = caseOscSndCmd(liveUndoReq);
				if (result == null) result = caseOscCmd(liveUndoReq);
				if (result == null) result = caseCmd(liveUndoReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_REDO_REQ: {
				LiveRedoReq liveRedoReq = (LiveRedoReq)theEObject;
				T result = caseLiveRedoReq(liveRedoReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveRedoReq);
				if (result == null) result = caseOscSndCmd(liveRedoReq);
				if (result == null) result = caseOscCmd(liveRedoReq);
				if (result == null) result = caseCmd(liveRedoReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NEXT_CUE_REQ: {
				LiveNextCueReq liveNextCueReq = (LiveNextCueReq)theEObject;
				T result = caseLiveNextCueReq(liveNextCueReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveNextCueReq);
				if (result == null) result = caseOscSndCmd(liveNextCueReq);
				if (result == null) result = caseOscCmd(liveNextCueReq);
				if (result == null) result = caseCmd(liveNextCueReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PREV_CUE_REQ: {
				LivePrevCueReq livePrevCueReq = (LivePrevCueReq)theEObject;
				T result = caseLivePrevCueReq(livePrevCueReq);
				if (result == null) result = caseAbletonLiveSndCmd(livePrevCueReq);
				if (result == null) result = caseOscSndCmd(livePrevCueReq);
				if (result == null) result = caseOscCmd(livePrevCueReq);
				if (result == null) result = caseCmd(livePrevCueReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PLAY_REQ: {
				LivePlayReq livePlayReq = (LivePlayReq)theEObject;
				T result = caseLivePlayReq(livePlayReq);
				if (result == null) result = caseAbletonLiveSndCmd(livePlayReq);
				if (result == null) result = caseOscSndCmd(livePlayReq);
				if (result == null) result = caseOscCmd(livePlayReq);
				if (result == null) result = caseCmd(livePlayReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PLAY_CONTINUE_REQ: {
				LivePlayContinueReq livePlayContinueReq = (LivePlayContinueReq)theEObject;
				T result = caseLivePlayContinueReq(livePlayContinueReq);
				if (result == null) result = caseAbletonLiveSndCmd(livePlayContinueReq);
				if (result == null) result = caseOscSndCmd(livePlayContinueReq);
				if (result == null) result = caseOscCmd(livePlayContinueReq);
				if (result == null) result = caseCmd(livePlayContinueReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PLAY_CLIP_REQ: {
				LivePlayClipReq livePlayClipReq = (LivePlayClipReq)theEObject;
				T result = caseLivePlayClipReq(livePlayClipReq);
				if (result == null) result = caseAbletonLiveSndCmd(livePlayClipReq);
				if (result == null) result = caseOscSndCmd(livePlayClipReq);
				if (result == null) result = caseOscCmd(livePlayClipReq);
				if (result == null) result = caseCmd(livePlayClipReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PLAY_SELECTION_REQ: {
				livePlaySelectionReq livePlaySelectionReq = (livePlaySelectionReq)theEObject;
				T result = caselivePlaySelectionReq(livePlaySelectionReq);
				if (result == null) result = caseAbletonLiveSndCmd(livePlaySelectionReq);
				if (result == null) result = caseOscSndCmd(livePlaySelectionReq);
				if (result == null) result = caseOscCmd(livePlaySelectionReq);
				if (result == null) result = caseCmd(livePlaySelectionReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PLAY_CLIP_SLOT_REQ: {
				LivePlayClipSlotReq livePlayClipSlotReq = (LivePlayClipSlotReq)theEObject;
				T result = caseLivePlayClipSlotReq(livePlayClipSlotReq);
				if (result == null) result = caseAbletonLiveSndCmd(livePlayClipSlotReq);
				if (result == null) result = caseOscSndCmd(livePlayClipSlotReq);
				if (result == null) result = caseOscCmd(livePlayClipSlotReq);
				if (result == null) result = caseCmd(livePlayClipSlotReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PLAY_SCENE_REQ: {
				LivePlaySceneReq livePlaySceneReq = (LivePlaySceneReq)theEObject;
				T result = caseLivePlaySceneReq(livePlaySceneReq);
				if (result == null) result = caseAbletonLiveSndCmd(livePlaySceneReq);
				if (result == null) result = caseOscSndCmd(livePlaySceneReq);
				if (result == null) result = caseOscCmd(livePlaySceneReq);
				if (result == null) result = caseCmd(livePlaySceneReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_STOP_REQ: {
				LiveStopReq liveStopReq = (LiveStopReq)theEObject;
				T result = caseLiveStopReq(liveStopReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveStopReq);
				if (result == null) result = caseOscSndCmd(liveStopReq);
				if (result == null) result = caseOscCmd(liveStopReq);
				if (result == null) result = caseCmd(liveStopReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_STOP_CLIP_REQ: {
				LiveStopClipReq liveStopClipReq = (LiveStopClipReq)theEObject;
				T result = caseLiveStopClipReq(liveStopClipReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveStopClipReq);
				if (result == null) result = caseOscSndCmd(liveStopClipReq);
				if (result == null) result = caseOscCmd(liveStopClipReq);
				if (result == null) result = caseCmd(liveStopClipReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_STOP_TRACK_REQ: {
				LiveStopTrackReq liveStopTrackReq = (LiveStopTrackReq)theEObject;
				T result = caseLiveStopTrackReq(liveStopTrackReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveStopTrackReq);
				if (result == null) result = caseOscSndCmd(liveStopTrackReq);
				if (result == null) result = caseOscCmd(liveStopTrackReq);
				if (result == null) result = caseCmd(liveStopTrackReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_SCENES_REQ: {
				LiveScenesReq liveScenesReq = (LiveScenesReq)theEObject;
				T result = caseLiveScenesReq(liveScenesReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveScenesReq);
				if (result == null) result = caseOscSndCmd(liveScenesReq);
				if (result == null) result = caseOscCmd(liveScenesReq);
				if (result == null) result = caseCmd(liveScenesReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACKS_REQ: {
				LiveTracksReq liveTracksReq = (LiveTracksReq)theEObject;
				T result = caseLiveTracksReq(liveTracksReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveTracksReq);
				if (result == null) result = caseOscSndCmd(liveTracksReq);
				if (result == null) result = caseOscCmd(liveTracksReq);
				if (result == null) result = caseCmd(liveTracksReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_SCENE_REQ: {
				LiveSceneReq liveSceneReq = (LiveSceneReq)theEObject;
				T result = caseLiveSceneReq(liveSceneReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveSceneReq);
				if (result == null) result = caseOscSndCmd(liveSceneReq);
				if (result == null) result = caseOscCmd(liveSceneReq);
				if (result == null) result = caseCmd(liveSceneReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_SCENE_BLOCK_REQ: {
				LiveNameSceneBlockReq liveNameSceneBlockReq = (LiveNameSceneBlockReq)theEObject;
				T result = caseLiveNameSceneBlockReq(liveNameSceneBlockReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameSceneBlockReq);
				if (result == null) result = caseOscSndCmd(liveNameSceneBlockReq);
				if (result == null) result = caseOscCmd(liveNameSceneBlockReq);
				if (result == null) result = caseCmd(liveNameSceneBlockReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_TRACK_REQ: {
				LiveNameTrackReq liveNameTrackReq = (LiveNameTrackReq)theEObject;
				T result = caseLiveNameTrackReq(liveNameTrackReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameTrackReq);
				if (result == null) result = caseOscSndCmd(liveNameTrackReq);
				if (result == null) result = caseOscCmd(liveNameTrackReq);
				if (result == null) result = caseCmd(liveNameTrackReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_TRACKBLOCK_REQ: {
				LiveNameTrackblockReq liveNameTrackblockReq = (LiveNameTrackblockReq)theEObject;
				T result = caseLiveNameTrackblockReq(liveNameTrackblockReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameTrackblockReq);
				if (result == null) result = caseOscSndCmd(liveNameTrackblockReq);
				if (result == null) result = caseOscCmd(liveNameTrackblockReq);
				if (result == null) result = caseCmd(liveNameTrackblockReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_CLIP_REQ: {
				LiveNameClipReq liveNameClipReq = (LiveNameClipReq)theEObject;
				T result = caseLiveNameClipReq(liveNameClipReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameClipReq);
				if (result == null) result = caseOscSndCmd(liveNameClipReq);
				if (result == null) result = caseOscCmd(liveNameClipReq);
				if (result == null) result = caseCmd(liveNameClipReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_CLIPBLOCKREQ: {
				LiveNameClipblockreq liveNameClipblockreq = (LiveNameClipblockreq)theEObject;
				T result = caseLiveNameClipblockreq(liveNameClipblockreq);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameClipblockreq);
				if (result == null) result = caseOscSndCmd(liveNameClipblockreq);
				if (result == null) result = caseOscCmd(liveNameClipblockreq);
				if (result == null) result = caseCmd(liveNameClipblockreq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_ARM_REQ: {
				LiveArmReq liveArmReq = (LiveArmReq)theEObject;
				T result = caseLiveArmReq(liveArmReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveArmReq);
				if (result == null) result = caseOscSndCmd(liveArmReq);
				if (result == null) result = caseOscCmd(liveArmReq);
				if (result == null) result = caseCmd(liveArmReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_MUTE_REQ: {
				LiveMuteReq liveMuteReq = (LiveMuteReq)theEObject;
				T result = caseLiveMuteReq(liveMuteReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveMuteReq);
				if (result == null) result = caseOscSndCmd(liveMuteReq);
				if (result == null) result = caseOscCmd(liveMuteReq);
				if (result == null) result = caseCmd(liveMuteReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_VOLUME_SET: {
				LiveVolumeSet liveVolumeSet = (LiveVolumeSet)theEObject;
				T result = caseLiveVolumeSet(liveVolumeSet);
				if (result == null) result = caseAbletonLiveSndCmd(liveVolumeSet);
				if (result == null) result = caseOscSndCmd(liveVolumeSet);
				if (result == null) result = caseOscCmd(liveVolumeSet);
				if (result == null) result = caseCmd(liveVolumeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PAN_SET: {
				LivePanSet livePanSet = (LivePanSet)theEObject;
				T result = caseLivePanSet(livePanSet);
				if (result == null) result = caseAbletonLiveSndCmd(livePanSet);
				if (result == null) result = caseOscSndCmd(livePanSet);
				if (result == null) result = caseOscCmd(livePanSet);
				if (result == null) result = caseCmd(livePanSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_SEND_REQ: {
				LiveSendReq liveSendReq = (LiveSendReq)theEObject;
				T result = caseLiveSendReq(liveSendReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveSendReq);
				if (result == null) result = caseOscSndCmd(liveSendReq);
				if (result == null) result = caseOscCmd(liveSendReq);
				if (result == null) result = caseCmd(liveSendReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PITCH_SET: {
				LivePitchSet livePitchSet = (LivePitchSet)theEObject;
				T result = caseLivePitchSet(livePitchSet);
				if (result == null) result = caseAbletonLiveSndCmd(livePitchSet);
				if (result == null) result = caseOscSndCmd(livePitchSet);
				if (result == null) result = caseOscCmd(livePitchSet);
				if (result == null) result = caseCmd(livePitchSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_MUTE_REQ: {
				LiveReturnMuteReq liveReturnMuteReq = (LiveReturnMuteReq)theEObject;
				T result = caseLiveReturnMuteReq(liveReturnMuteReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnMuteReq);
				if (result == null) result = caseOscSndCmd(liveReturnMuteReq);
				if (result == null) result = caseOscCmd(liveReturnMuteReq);
				if (result == null) result = caseCmd(liveReturnMuteReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_VOLUME_REQ: {
				LiveReturnVolumeReq liveReturnVolumeReq = (LiveReturnVolumeReq)theEObject;
				T result = caseLiveReturnVolumeReq(liveReturnVolumeReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnVolumeReq);
				if (result == null) result = caseOscSndCmd(liveReturnVolumeReq);
				if (result == null) result = caseOscCmd(liveReturnVolumeReq);
				if (result == null) result = caseCmd(liveReturnVolumeReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_PAN_REQ: {
				LiveReturnPanReq liveReturnPanReq = (LiveReturnPanReq)theEObject;
				T result = caseLiveReturnPanReq(liveReturnPanReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnPanReq);
				if (result == null) result = caseOscSndCmd(liveReturnPanReq);
				if (result == null) result = caseOscCmd(liveReturnPanReq);
				if (result == null) result = caseCmd(liveReturnPanReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_SEND_REQ: {
				LiveReturnSendReq liveReturnSendReq = (LiveReturnSendReq)theEObject;
				T result = caseLiveReturnSendReq(liveReturnSendReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnSendReq);
				if (result == null) result = caseOscSndCmd(liveReturnSendReq);
				if (result == null) result = caseOscCmd(liveReturnSendReq);
				if (result == null) result = caseCmd(liveReturnSendReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_MASTER_VOLUME_REQ: {
				LiveMasterVolumeReq liveMasterVolumeReq = (LiveMasterVolumeReq)theEObject;
				T result = caseLiveMasterVolumeReq(liveMasterVolumeReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveMasterVolumeReq);
				if (result == null) result = caseOscSndCmd(liveMasterVolumeReq);
				if (result == null) result = caseOscCmd(liveMasterVolumeReq);
				if (result == null) result = caseCmd(liveMasterVolumeReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_MASTER_PAN_REQ: {
				LiveMasterPanReq liveMasterPanReq = (LiveMasterPanReq)theEObject;
				T result = caseLiveMasterPanReq(liveMasterPanReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveMasterPanReq);
				if (result == null) result = caseOscSndCmd(liveMasterPanReq);
				if (result == null) result = caseOscCmd(liveMasterPanReq);
				if (result == null) result = caseCmd(liveMasterPanReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_JUMP: {
				LiveTrackJump liveTrackJump = (LiveTrackJump)theEObject;
				T result = caseLiveTrackJump(liveTrackJump);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackJump);
				if (result == null) result = caseOscSndCmd(liveTrackJump);
				if (result == null) result = caseOscCmd(liveTrackJump);
				if (result == null) result = caseCmd(liveTrackJump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_INFO: {
				LiveTrackInfo liveTrackInfo = (LiveTrackInfo)theEObject;
				T result = caseLiveTrackInfo(liveTrackInfo);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackInfo);
				if (result == null) result = caseOscSndCmd(liveTrackInfo);
				if (result == null) result = caseOscCmd(liveTrackInfo);
				if (result == null) result = caseCmd(liveTrackInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_DEVICE_VIEW: {
				LiveTrackDeviceView liveTrackDeviceView = (LiveTrackDeviceView)theEObject;
				T result = caseLiveTrackDeviceView(liveTrackDeviceView);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackDeviceView);
				if (result == null) result = caseOscSndCmd(liveTrackDeviceView);
				if (result == null) result = caseOscCmd(liveTrackDeviceView);
				if (result == null) result = caseCmd(liveTrackDeviceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_DEVICE_VIEW: {
				LiveReturnDeviceView liveReturnDeviceView = (LiveReturnDeviceView)theEObject;
				T result = caseLiveReturnDeviceView(liveReturnDeviceView);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnDeviceView);
				if (result == null) result = caseOscSndCmd(liveReturnDeviceView);
				if (result == null) result = caseOscCmd(liveReturnDeviceView);
				if (result == null) result = caseCmd(liveReturnDeviceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_MASTER_DEVICE_VIEW: {
				LiveMasterDeviceView liveMasterDeviceView = (LiveMasterDeviceView)theEObject;
				T result = caseLiveMasterDeviceView(liveMasterDeviceView);
				if (result == null) result = caseAbletonLiveSndCmd(liveMasterDeviceView);
				if (result == null) result = caseOscSndCmd(liveMasterDeviceView);
				if (result == null) result = caseOscCmd(liveMasterDeviceView);
				if (result == null) result = caseCmd(liveMasterDeviceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DETAIL_VIEW: {
				LiveDetailView liveDetailView = (LiveDetailView)theEObject;
				T result = caseLiveDetailView(liveDetailView);
				if (result == null) result = caseAbletonLiveSndCmd(liveDetailView);
				if (result == null) result = caseOscSndCmd(liveDetailView);
				if (result == null) result = caseOscCmd(liveDetailView);
				if (result == null) result = caseCmd(liveDetailView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_CLIP_INFO: {
				LiveClipInfo liveClipInfo = (LiveClipInfo)theEObject;
				T result = caseLiveClipInfo(liveClipInfo);
				if (result == null) result = caseAbletonLiveSndCmd(liveClipInfo);
				if (result == null) result = caseOscSndCmd(liveClipInfo);
				if (result == null) result = caseOscCmd(liveClipInfo);
				if (result == null) result = caseCmd(liveClipInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICELIST: {
				LiveDevicelist liveDevicelist = (LiveDevicelist)theEObject;
				T result = caseLiveDevicelist(liveDevicelist);
				if (result == null) result = caseAbletonLiveSndCmd(liveDevicelist);
				if (result == null) result = caseOscSndCmd(liveDevicelist);
				if (result == null) result = caseOscCmd(liveDevicelist);
				if (result == null) result = caseCmd(liveDevicelist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE: {
				LiveDevice liveDevice = (LiveDevice)theEObject;
				T result = caseLiveDevice(liveDevice);
				if (result == null) result = caseAbletonLiveSndCmd(liveDevice);
				if (result == null) result = caseOscSndCmd(liveDevice);
				if (result == null) result = caseOscCmd(liveDevice);
				if (result == null) result = caseCmd(liveDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_DEVICELIST: {
				LiveReturnDevicelist liveReturnDevicelist = (LiveReturnDevicelist)theEObject;
				T result = caseLiveReturnDevicelist(liveReturnDevicelist);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnDevicelist);
				if (result == null) result = caseOscSndCmd(liveReturnDevicelist);
				if (result == null) result = caseOscCmd(liveReturnDevicelist);
				if (result == null) result = caseCmd(liveReturnDevicelist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_VOLUME: {
				LiveReturnVolume liveReturnVolume = (LiveReturnVolume)theEObject;
				T result = caseLiveReturnVolume(liveReturnVolume);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnVolume);
				if (result == null) result = caseOscSndCmd(liveReturnVolume);
				if (result == null) result = caseOscCmd(liveReturnVolume);
				if (result == null) result = caseCmd(liveReturnVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_PAN: {
				LiveReturnPan liveReturnPan = (LiveReturnPan)theEObject;
				T result = caseLiveReturnPan(liveReturnPan);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnPan);
				if (result == null) result = caseOscSndCmd(liveReturnPan);
				if (result == null) result = caseOscCmd(liveReturnPan);
				if (result == null) result = caseCmd(liveReturnPan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_SEND: {
				LiveReturnSend liveReturnSend = (LiveReturnSend)theEObject;
				T result = caseLiveReturnSend(liveReturnSend);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnSend);
				if (result == null) result = caseOscSndCmd(liveReturnSend);
				if (result == null) result = caseOscCmd(liveReturnSend);
				if (result == null) result = caseCmd(liveReturnSend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_MASTER_VOLUME: {
				LiveMasterVolume liveMasterVolume = (LiveMasterVolume)theEObject;
				T result = caseLiveMasterVolume(liveMasterVolume);
				if (result == null) result = caseAbletonLiveSndCmd(liveMasterVolume);
				if (result == null) result = caseOscSndCmd(liveMasterVolume);
				if (result == null) result = caseOscCmd(liveMasterVolume);
				if (result == null) result = caseCmd(liveMasterVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_SOLO: {
				LiveReturnSolo liveReturnSolo = (LiveReturnSolo)theEObject;
				T result = caseLiveReturnSolo(liveReturnSolo);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnSolo);
				if (result == null) result = caseOscSndCmd(liveReturnSolo);
				if (result == null) result = caseOscCmd(liveReturnSolo);
				if (result == null) result = caseCmd(liveReturnSolo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE_VIEW: {
				LiveDeviceView liveDeviceView = (LiveDeviceView)theEObject;
				T result = caseLiveDeviceView(liveDeviceView);
				if (result == null) result = caseAbletonLiveSndCmd(liveDeviceView);
				if (result == null) result = caseOscSndCmd(liveDeviceView);
				if (result == null) result = caseOscCmd(liveDeviceView);
				if (result == null) result = caseCmd(liveDeviceView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_MASTER_METER: {
				LiveMasterMeter liveMasterMeter = (LiveMasterMeter)theEObject;
				T result = caseLiveMasterMeter(liveMasterMeter);
				if (result == null) result = caseAbletonLiveSndCmd(liveMasterMeter);
				if (result == null) result = caseOscSndCmd(liveMasterMeter);
				if (result == null) result = caseOscCmd(liveMasterMeter);
				if (result == null) result = caseCmd(liveMasterMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_CLIP_POSITION: {
				LiveClipPosition liveClipPosition = (LiveClipPosition)theEObject;
				T result = caseLiveClipPosition(liveClipPosition);
				if (result == null) result = caseAbletonLiveSndCmd(liveClipPosition);
				if (result == null) result = caseOscSndCmd(liveClipPosition);
				if (result == null) result = caseOscCmd(liveClipPosition);
				if (result == null) result = caseCmd(liveClipPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_METER: {
				LiveTrackMeter liveTrackMeter = (LiveTrackMeter)theEObject;
				T result = caseLiveTrackMeter(liveTrackMeter);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackMeter);
				if (result == null) result = caseOscSndCmd(liveTrackMeter);
				if (result == null) result = caseOscCmd(liveTrackMeter);
				if (result == null) result = caseCmd(liveTrackMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_TRACK_Q: {
				LiveNameTrackQ liveNameTrackQ = (LiveNameTrackQ)theEObject;
				T result = caseLiveNameTrackQ(liveNameTrackQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameTrackQ);
				if (result == null) result = caseOscSndCmd(liveNameTrackQ);
				if (result == null) result = caseOscCmd(liveNameTrackQ);
				if (result == null) result = caseCmd(liveNameTrackQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_SCENE_Q: {
				LiveNameSceneQ liveNameSceneQ = (LiveNameSceneQ)theEObject;
				T result = caseLiveNameSceneQ(liveNameSceneQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameSceneQ);
				if (result == null) result = caseOscSndCmd(liveNameSceneQ);
				if (result == null) result = caseOscCmd(liveNameSceneQ);
				if (result == null) result = caseCmd(liveNameSceneQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_CLIP_Q: {
				LiveNameClipQ liveNameClipQ = (LiveNameClipQ)theEObject;
				T result = caseLiveNameClipQ(liveNameClipQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameClipQ);
				if (result == null) result = caseOscSndCmd(liveNameClipQ);
				if (result == null) result = caseOscCmd(liveNameClipQ);
				if (result == null) result = caseCmd(liveNameClipQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_NAME_SCENE_REQ: {
				LiveNameSceneReq liveNameSceneReq = (LiveNameSceneReq)theEObject;
				T result = caseLiveNameSceneReq(liveNameSceneReq);
				if (result == null) result = caseAbletonLiveSndCmd(liveNameSceneReq);
				if (result == null) result = caseOscSndCmd(liveNameSceneReq);
				if (result == null) result = caseOscCmd(liveNameSceneReq);
				if (result == null) result = caseCmd(liveNameSceneReq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_SCENES_Q: {
				LiveScenesQ liveScenesQ = (LiveScenesQ)theEObject;
				T result = caseLiveScenesQ(liveScenesQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveScenesQ);
				if (result == null) result = caseOscSndCmd(liveScenesQ);
				if (result == null) result = caseOscCmd(liveScenesQ);
				if (result == null) result = caseCmd(liveScenesQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACKS_Q: {
				LiveTracksQ liveTracksQ = (LiveTracksQ)theEObject;
				T result = caseLiveTracksQ(liveTracksQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveTracksQ);
				if (result == null) result = caseOscSndCmd(liveTracksQ);
				if (result == null) result = caseOscCmd(liveTracksQ);
				if (result == null) result = caseCmd(liveTracksQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_PLAY: {
				LivePlay livePlay = (LivePlay)theEObject;
				T result = caseLivePlay(livePlay);
				if (result == null) result = caseAbletonLiveSndCmd(livePlay);
				if (result == null) result = caseOscSndCmd(livePlay);
				if (result == null) result = caseOscCmd(livePlay);
				if (result == null) result = caseCmd(livePlay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_VOLUME: {
				LiveVolume liveVolume = (LiveVolume)theEObject;
				T result = caseLiveVolume(liveVolume);
				if (result == null) result = caseAbletonLiveSndCmd(liveVolume);
				if (result == null) result = caseOscSndCmd(liveVolume);
				if (result == null) result = caseOscCmd(liveVolume);
				if (result == null) result = caseCmd(liveVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_SCENE2: {
				LiveScene2 liveScene2 = (LiveScene2)theEObject;
				T result = caseLiveScene2(liveScene2);
				if (result == null) result = caseAbletonLiveSndCmd(liveScene2);
				if (result == null) result = caseOscSndCmd(liveScene2);
				if (result == null) result = caseOscCmd(liveScene2);
				if (result == null) result = caseCmd(liveScene2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_METER: {
				LiveReturnMeter liveReturnMeter = (LiveReturnMeter)theEObject;
				T result = caseLiveReturnMeter(liveReturnMeter);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnMeter);
				if (result == null) result = caseOscSndCmd(liveReturnMeter);
				if (result == null) result = caseOscCmd(liveReturnMeter);
				if (result == null) result = caseCmd(liveReturnMeter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE_RANGE_Q: {
				LiveDeviceRangeQ liveDeviceRangeQ = (LiveDeviceRangeQ)theEObject;
				T result = caseLiveDeviceRangeQ(liveDeviceRangeQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveDeviceRangeQ);
				if (result == null) result = caseOscSndCmd(liveDeviceRangeQ);
				if (result == null) result = caseOscCmd(liveDeviceRangeQ);
				if (result == null) result = caseCmd(liveDeviceRangeQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE_RANGE: {
				LiveDeviceRange liveDeviceRange = (LiveDeviceRange)theEObject;
				T result = caseLiveDeviceRange(liveDeviceRange);
				if (result == null) result = caseAbletonLiveSndCmd(liveDeviceRange);
				if (result == null) result = caseOscSndCmd(liveDeviceRange);
				if (result == null) result = caseOscCmd(liveDeviceRange);
				if (result == null) result = caseCmd(liveDeviceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE_RANGE_ALL: {
				LiveDeviceRangeAll liveDeviceRangeAll = (LiveDeviceRangeAll)theEObject;
				T result = caseLiveDeviceRangeAll(liveDeviceRangeAll);
				if (result == null) result = caseAbletonLiveSndCmd(liveDeviceRangeAll);
				if (result == null) result = caseOscSndCmd(liveDeviceRangeAll);
				if (result == null) result = caseOscCmd(liveDeviceRangeAll);
				if (result == null) result = caseCmd(liveDeviceRangeAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE_RANGE_ALL_Q: {
				LiveDeviceRangeAllQ liveDeviceRangeAllQ = (LiveDeviceRangeAllQ)theEObject;
				T result = caseLiveDeviceRangeAllQ(liveDeviceRangeAllQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveDeviceRangeAllQ);
				if (result == null) result = caseOscSndCmd(liveDeviceRangeAllQ);
				if (result == null) result = caseOscCmd(liveDeviceRangeAllQ);
				if (result == null) result = caseCmd(liveDeviceRangeAllQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE: {
				LiveReturnDeviceRange liveReturnDeviceRange = (LiveReturnDeviceRange)theEObject;
				T result = caseLiveReturnDeviceRange(liveReturnDeviceRange);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnDeviceRange);
				if (result == null) result = caseOscSndCmd(liveReturnDeviceRange);
				if (result == null) result = caseOscCmd(liveReturnDeviceRange);
				if (result == null) result = caseCmd(liveReturnDeviceRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE_Q: {
				LiveReturnDeviceRangeQ liveReturnDeviceRangeQ = (LiveReturnDeviceRangeQ)theEObject;
				T result = caseLiveReturnDeviceRangeQ(liveReturnDeviceRangeQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnDeviceRangeQ);
				if (result == null) result = caseOscSndCmd(liveReturnDeviceRangeQ);
				if (result == null) result = caseOscCmd(liveReturnDeviceRangeQ);
				if (result == null) result = caseCmd(liveReturnDeviceRangeQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE_ALL: {
				LiveReturnDeviceRangeAll liveReturnDeviceRangeAll = (LiveReturnDeviceRangeAll)theEObject;
				T result = caseLiveReturnDeviceRangeAll(liveReturnDeviceRangeAll);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnDeviceRangeAll);
				if (result == null) result = caseOscSndCmd(liveReturnDeviceRangeAll);
				if (result == null) result = caseOscCmd(liveReturnDeviceRangeAll);
				if (result == null) result = caseCmd(liveReturnDeviceRangeAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_RETURN_DEVICE_RANGE_ALL_Q: {
				LiveReturnDeviceRangeAllQ liveReturnDeviceRangeAllQ = (LiveReturnDeviceRangeAllQ)theEObject;
				T result = caseLiveReturnDeviceRangeAllQ(liveReturnDeviceRangeAllQ);
				if (result == null) result = caseAbletonLiveSndCmd(liveReturnDeviceRangeAllQ);
				if (result == null) result = caseOscSndCmd(liveReturnDeviceRangeAllQ);
				if (result == null) result = caseOscCmd(liveReturnDeviceRangeAllQ);
				if (result == null) result = caseCmd(liveReturnDeviceRangeAllQ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE_PARAM: {
				LiveDeviceParam liveDeviceParam = (LiveDeviceParam)theEObject;
				T result = caseLiveDeviceParam(liveDeviceParam);
				if (result == null) result = caseAbletonLiveSndCmd(liveDeviceParam);
				if (result == null) result = caseOscSndCmd(liveDeviceParam);
				if (result == null) result = caseOscCmd(liveDeviceParam);
				if (result == null) result = caseCmd(liveDeviceParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_DEVICE_PARAM_SET: {
				LiveDeviceParamSet liveDeviceParamSet = (LiveDeviceParamSet)theEObject;
				T result = caseLiveDeviceParamSet(liveDeviceParamSet);
				if (result == null) result = caseAbletonLiveSndCmd(liveDeviceParamSet);
				if (result == null) result = caseOscSndCmd(liveDeviceParamSet);
				if (result == null) result = caseOscCmd(liveDeviceParamSet);
				if (result == null) result = caseCmd(liveDeviceParamSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_VOLUME: {
				LiveTrackVolume liveTrackVolume = (LiveTrackVolume)theEObject;
				T result = caseLiveTrackVolume(liveTrackVolume);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackVolume);
				if (result == null) result = caseOscSndCmd(liveTrackVolume);
				if (result == null) result = caseOscCmd(liveTrackVolume);
				if (result == null) result = caseCmd(liveTrackVolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_PAN: {
				LiveTrackPan liveTrackPan = (LiveTrackPan)theEObject;
				T result = caseLiveTrackPan(liveTrackPan);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackPan);
				if (result == null) result = caseOscSndCmd(liveTrackPan);
				if (result == null) result = caseOscCmd(liveTrackPan);
				if (result == null) result = caseCmd(liveTrackPan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_MUTE: {
				LiveTrackMute liveTrackMute = (LiveTrackMute)theEObject;
				T result = caseLiveTrackMute(liveTrackMute);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackMute);
				if (result == null) result = caseOscSndCmd(liveTrackMute);
				if (result == null) result = caseOscCmd(liveTrackMute);
				if (result == null) result = caseCmd(liveTrackMute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_SOLO: {
				LiveTrackSolo liveTrackSolo = (LiveTrackSolo)theEObject;
				T result = caseLiveTrackSolo(liveTrackSolo);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackSolo);
				if (result == null) result = caseOscSndCmd(liveTrackSolo);
				if (result == null) result = caseOscCmd(liveTrackSolo);
				if (result == null) result = caseCmd(liveTrackSolo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_NAME: {
				LiveTrackName liveTrackName = (LiveTrackName)theEObject;
				T result = caseLiveTrackName(liveTrackName);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackName);
				if (result == null) result = caseOscSndCmd(liveTrackName);
				if (result == null) result = caseOscCmd(liveTrackName);
				if (result == null) result = caseCmd(liveTrackName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_ARM: {
				LiveTrackArm liveTrackArm = (LiveTrackArm)theEObject;
				T result = caseLiveTrackArm(liveTrackArm);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackArm);
				if (result == null) result = caseOscSndCmd(liveTrackArm);
				if (result == null) result = caseOscCmd(liveTrackArm);
				if (result == null) result = caseCmd(liveTrackArm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_SEND: {
				LiveTrackSend liveTrackSend = (LiveTrackSend)theEObject;
				T result = caseLiveTrackSend(liveTrackSend);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackSend);
				if (result == null) result = caseOscSndCmd(liveTrackSend);
				if (result == null) result = caseOscCmd(liveTrackSend);
				if (result == null) result = caseCmd(liveTrackSend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonPackage.LIVE_TRACK_PITCH: {
				LiveTrackPitch liveTrackPitch = (LiveTrackPitch)theEObject;
				T result = caseLiveTrackPitch(liveTrackPitch);
				if (result == null) result = caseAbletonLiveSndCmd(liveTrackPitch);
				if (result == null) result = caseOscSndCmd(liveTrackPitch);
				if (result == null) result = caseOscCmd(liveTrackPitch);
				if (result == null) result = caseCmd(liveTrackPitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ableton Live Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ableton Live Snd Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbletonLiveSndCmd(AbletonLiveSndCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Tempo Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Tempo Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTempoReq(LiveTempoReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Tempo Rcv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Tempo Rcv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTempoRcv(LiveTempoRcv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Time Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Time Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTimeReq(LiveTimeReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Time Rcv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Time Rcv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTimeRcv(LiveTimeRcv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Overdub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Overdub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveOverdub(LiveOverdub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live State Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live State Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveStateReq(LiveStateReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live State Rcv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live State Rcv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveStateRcv(LiveStateRcv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Undo Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Undo Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveUndoReq(LiveUndoReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Redo Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Redo Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveRedoReq(LiveRedoReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Next Cue Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Next Cue Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNextCueReq(LiveNextCueReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Prev Cue Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Prev Cue Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePrevCueReq(LivePrevCueReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Play Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Play Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePlayReq(LivePlayReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Play Continue Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Play Continue Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePlayContinueReq(LivePlayContinueReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Play Clip Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Play Clip Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePlayClipReq(LivePlayClipReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>live Play Selection Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>live Play Selection Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselivePlaySelectionReq(livePlaySelectionReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Play Clip Slot Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Play Clip Slot Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePlayClipSlotReq(LivePlayClipSlotReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Play Scene Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Play Scene Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePlaySceneReq(LivePlaySceneReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Stop Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Stop Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveStopReq(LiveStopReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Stop Clip Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Stop Clip Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveStopClipReq(LiveStopClipReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Stop Track Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Stop Track Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveStopTrackReq(LiveStopTrackReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Scenes Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Scenes Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveScenesReq(LiveScenesReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Tracks Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Tracks Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTracksReq(LiveTracksReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Scene Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Scene Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveSceneReq(LiveSceneReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Scene Block Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Scene Block Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameSceneBlockReq(LiveNameSceneBlockReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Track Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Track Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameTrackReq(LiveNameTrackReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Trackblock Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Trackblock Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameTrackblockReq(LiveNameTrackblockReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Clip Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Clip Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameClipReq(LiveNameClipReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Clipblockreq</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Clipblockreq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameClipblockreq(LiveNameClipblockreq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Arm Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Arm Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveArmReq(LiveArmReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Mute Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Mute Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveMuteReq(LiveMuteReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Volume Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Volume Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveVolumeSet(LiveVolumeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Pan Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Pan Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePanSet(LivePanSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Send Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Send Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveSendReq(LiveSendReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Pitch Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Pitch Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePitchSet(LivePitchSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Mute Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Mute Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnMuteReq(LiveReturnMuteReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Solo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Solo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnSolo(LiveReturnSolo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDeviceView(LiveDeviceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Master Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Master Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveMasterMeter(LiveMasterMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Clip Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Clip Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveClipPosition(LiveClipPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackMeter(LiveTrackMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Track Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Track Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameTrackQ(LiveNameTrackQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Scene Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Scene Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameSceneQ(LiveNameSceneQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Clip Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Clip Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameClipQ(LiveNameClipQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Name Scene Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Name Scene Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveNameSceneReq(LiveNameSceneReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Scenes Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Scenes Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveScenesQ(LiveScenesQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Tracks Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Tracks Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTracksQ(LiveTracksQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Play</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Play</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLivePlay(LivePlay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveVolume(LiveVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Scene2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Scene2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveScene2(LiveScene2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Meter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Meter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnMeter(LiveReturnMeter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device Range Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device Range Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDeviceRangeQ(LiveDeviceRangeQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDeviceRange(LiveDeviceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device Range All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device Range All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDeviceRangeAll(LiveDeviceRangeAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device Range All Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device Range All Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDeviceRangeAllQ(LiveDeviceRangeAllQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Device Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Device Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnDeviceRange(LiveReturnDeviceRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Device Range Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Device Range Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnDeviceRangeQ(LiveReturnDeviceRangeQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Device Range All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Device Range All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnDeviceRangeAll(LiveReturnDeviceRangeAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Device Range All Q</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Device Range All Q</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnDeviceRangeAllQ(LiveReturnDeviceRangeAllQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDeviceParam(LiveDeviceParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device Param Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device Param Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDeviceParamSet(LiveDeviceParamSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackVolume(LiveTrackVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Pan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Pan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackPan(LiveTrackPan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Mute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Mute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackMute(LiveTrackMute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Solo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Solo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackSolo(LiveTrackSolo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackName(LiveTrackName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Arm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Arm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackArm(LiveTrackArm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackSend(LiveTrackSend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Pitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Pitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackPitch(LiveTrackPitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Volume Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Volume Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnVolumeReq(LiveReturnVolumeReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Pan Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Pan Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnPanReq(LiveReturnPanReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Send Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Send Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnSendReq(LiveReturnSendReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Master Volume Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Master Volume Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveMasterVolumeReq(LiveMasterVolumeReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Master Pan Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Master Pan Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveMasterPanReq(LiveMasterPanReq object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackJump(LiveTrackJump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackInfo(LiveTrackInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track Device View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track Device View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackDeviceView(LiveTrackDeviceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Device View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Device View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnDeviceView(LiveReturnDeviceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Master Device View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Master Device View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveMasterDeviceView(LiveMasterDeviceView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Detail View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Detail View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDetailView(LiveDetailView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Clip Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Clip Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveClipInfo(LiveClipInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Devicelist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Devicelist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDevicelist(LiveDevicelist object) {
		return null;
	}


	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveDevice(LiveDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Devicelist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Devicelist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnDevicelist(LiveReturnDevicelist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnVolume(LiveReturnVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Pan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Pan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnPan(LiveReturnPan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Return Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Return Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveReturnSend(LiveReturnSend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Master Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Master Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveMasterVolume(LiveMasterVolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscCmd(OscCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Snd Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscSndCmd(OscSndCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzabletonSwitch
