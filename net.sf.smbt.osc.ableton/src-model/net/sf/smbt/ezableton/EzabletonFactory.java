/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezableton.EzabletonPackage
 * @generated
 */
public interface EzabletonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzabletonFactory eINSTANCE = net.sf.smbt.ezableton.impl.EzabletonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ableton Live Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ableton Live Snd Cmd</em>'.
	 * @generated
	 */
	AbletonLiveSndCmd createAbletonLiveSndCmd();

	/**
	 * Returns a new object of class '<em>Live Tempo Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Tempo Req</em>'.
	 * @generated
	 */
	LiveTempoReq createLiveTempoReq();

	/**
	 * Returns a new object of class '<em>Live Tempo Rcv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Tempo Rcv</em>'.
	 * @generated
	 */
	LiveTempoRcv createLiveTempoRcv();

	/**
	 * Returns a new object of class '<em>Live Time Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Time Req</em>'.
	 * @generated
	 */
	LiveTimeReq createLiveTimeReq();

	/**
	 * Returns a new object of class '<em>Live Time Rcv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Time Rcv</em>'.
	 * @generated
	 */
	LiveTimeRcv createLiveTimeRcv();

	/**
	 * Returns a new object of class '<em>Live Overdub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Overdub</em>'.
	 * @generated
	 */
	LiveOverdub createLiveOverdub();

	/**
	 * Returns a new object of class '<em>Live State Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live State Req</em>'.
	 * @generated
	 */
	LiveStateReq createLiveStateReq();

	/**
	 * Returns a new object of class '<em>Live State Rcv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live State Rcv</em>'.
	 * @generated
	 */
	LiveStateRcv createLiveStateRcv();

	/**
	 * Returns a new object of class '<em>Live Undo Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Undo Req</em>'.
	 * @generated
	 */
	LiveUndoReq createLiveUndoReq();

	/**
	 * Returns a new object of class '<em>Live Redo Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Redo Req</em>'.
	 * @generated
	 */
	LiveRedoReq createLiveRedoReq();

	/**
	 * Returns a new object of class '<em>Live Next Cue Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Next Cue Req</em>'.
	 * @generated
	 */
	LiveNextCueReq createLiveNextCueReq();

	/**
	 * Returns a new object of class '<em>Live Prev Cue Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Prev Cue Req</em>'.
	 * @generated
	 */
	LivePrevCueReq createLivePrevCueReq();

	/**
	 * Returns a new object of class '<em>Live Play Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Play Req</em>'.
	 * @generated
	 */
	LivePlayReq createLivePlayReq();

	/**
	 * Returns a new object of class '<em>Live Play Continue Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Play Continue Req</em>'.
	 * @generated
	 */
	LivePlayContinueReq createLivePlayContinueReq();

	/**
	 * Returns a new object of class '<em>Live Play Clip Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Play Clip Req</em>'.
	 * @generated
	 */
	LivePlayClipReq createLivePlayClipReq();

	/**
	 * Returns a new object of class '<em>live Play Selection Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>live Play Selection Req</em>'.
	 * @generated
	 */
	livePlaySelectionReq createlivePlaySelectionReq();

	/**
	 * Returns a new object of class '<em>Live Play Clip Slot Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Play Clip Slot Req</em>'.
	 * @generated
	 */
	LivePlayClipSlotReq createLivePlayClipSlotReq();

	/**
	 * Returns a new object of class '<em>Live Play Scene Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Play Scene Req</em>'.
	 * @generated
	 */
	LivePlaySceneReq createLivePlaySceneReq();

	/**
	 * Returns a new object of class '<em>Live Stop Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Stop Req</em>'.
	 * @generated
	 */
	LiveStopReq createLiveStopReq();

	/**
	 * Returns a new object of class '<em>Live Stop Clip Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Stop Clip Req</em>'.
	 * @generated
	 */
	LiveStopClipReq createLiveStopClipReq();

	/**
	 * Returns a new object of class '<em>Live Stop Track Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Stop Track Req</em>'.
	 * @generated
	 */
	LiveStopTrackReq createLiveStopTrackReq();

	/**
	 * Returns a new object of class '<em>Live Scenes Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Scenes Req</em>'.
	 * @generated
	 */
	LiveScenesReq createLiveScenesReq();

	/**
	 * Returns a new object of class '<em>Live Tracks Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Tracks Req</em>'.
	 * @generated
	 */
	LiveTracksReq createLiveTracksReq();

	/**
	 * Returns a new object of class '<em>Live Scene Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Scene Req</em>'.
	 * @generated
	 */
	LiveSceneReq createLiveSceneReq();

	/**
	 * Returns a new object of class '<em>Live Name Scene Block Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Scene Block Req</em>'.
	 * @generated
	 */
	LiveNameSceneBlockReq createLiveNameSceneBlockReq();

	/**
	 * Returns a new object of class '<em>Live Name Track Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Track Req</em>'.
	 * @generated
	 */
	LiveNameTrackReq createLiveNameTrackReq();

	/**
	 * Returns a new object of class '<em>Live Name Trackblock Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Trackblock Req</em>'.
	 * @generated
	 */
	LiveNameTrackblockReq createLiveNameTrackblockReq();

	/**
	 * Returns a new object of class '<em>Live Name Clip Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Clip Req</em>'.
	 * @generated
	 */
	LiveNameClipReq createLiveNameClipReq();

	/**
	 * Returns a new object of class '<em>Live Name Clipblockreq</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Clipblockreq</em>'.
	 * @generated
	 */
	LiveNameClipblockreq createLiveNameClipblockreq();

	/**
	 * Returns a new object of class '<em>Live Arm Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Arm Req</em>'.
	 * @generated
	 */
	LiveArmReq createLiveArmReq();

	/**
	 * Returns a new object of class '<em>Live Mute Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Mute Req</em>'.
	 * @generated
	 */
	LiveMuteReq createLiveMuteReq();

	/**
	 * Returns a new object of class '<em>Live Volume Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Volume Set</em>'.
	 * @generated
	 */
	LiveVolumeSet createLiveVolumeSet();

	/**
	 * Returns a new object of class '<em>Live Pan Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Pan Set</em>'.
	 * @generated
	 */
	LivePanSet createLivePanSet();

	/**
	 * Returns a new object of class '<em>Live Send Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Send Req</em>'.
	 * @generated
	 */
	LiveSendReq createLiveSendReq();

	/**
	 * Returns a new object of class '<em>Live Pitch Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Pitch Set</em>'.
	 * @generated
	 */
	LivePitchSet createLivePitchSet();

	/**
	 * Returns a new object of class '<em>Live Return Mute Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Mute Req</em>'.
	 * @generated
	 */
	LiveReturnMuteReq createLiveReturnMuteReq();

	/**
	 * Returns a new object of class '<em>Live Return Solo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Solo</em>'.
	 * @generated
	 */
	LiveReturnSolo createLiveReturnSolo();

	/**
	 * Returns a new object of class '<em>Live Device View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device View</em>'.
	 * @generated
	 */
	LiveDeviceView createLiveDeviceView();

	/**
	 * Returns a new object of class '<em>Live Master Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Master Meter</em>'.
	 * @generated
	 */
	LiveMasterMeter createLiveMasterMeter();

	/**
	 * Returns a new object of class '<em>Live Clip Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Clip Position</em>'.
	 * @generated
	 */
	LiveClipPosition createLiveClipPosition();

	/**
	 * Returns a new object of class '<em>Live Track Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Meter</em>'.
	 * @generated
	 */
	LiveTrackMeter createLiveTrackMeter();

	/**
	 * Returns a new object of class '<em>Live Name Track Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Track Q</em>'.
	 * @generated
	 */
	LiveNameTrackQ createLiveNameTrackQ();

	/**
	 * Returns a new object of class '<em>Live Name Scene Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Scene Q</em>'.
	 * @generated
	 */
	LiveNameSceneQ createLiveNameSceneQ();

	/**
	 * Returns a new object of class '<em>Live Name Clip Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Clip Q</em>'.
	 * @generated
	 */
	LiveNameClipQ createLiveNameClipQ();

	/**
	 * Returns a new object of class '<em>Live Name Scene Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Name Scene Req</em>'.
	 * @generated
	 */
	LiveNameSceneReq createLiveNameSceneReq();

	/**
	 * Returns a new object of class '<em>Live Scenes Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Scenes Q</em>'.
	 * @generated
	 */
	LiveScenesQ createLiveScenesQ();

	/**
	 * Returns a new object of class '<em>Live Tracks Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Tracks Q</em>'.
	 * @generated
	 */
	LiveTracksQ createLiveTracksQ();

	/**
	 * Returns a new object of class '<em>Live Play</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Play</em>'.
	 * @generated
	 */
	LivePlay createLivePlay();

	/**
	 * Returns a new object of class '<em>Live Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Volume</em>'.
	 * @generated
	 */
	LiveVolume createLiveVolume();

	/**
	 * Returns a new object of class '<em>Live Scene2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Scene2</em>'.
	 * @generated
	 */
	LiveScene2 createLiveScene2();

	/**
	 * Returns a new object of class '<em>Live Return Meter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Meter</em>'.
	 * @generated
	 */
	LiveReturnMeter createLiveReturnMeter();

	/**
	 * Returns a new object of class '<em>Live Device Range Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device Range Q</em>'.
	 * @generated
	 */
	LiveDeviceRangeQ createLiveDeviceRangeQ();

	/**
	 * Returns a new object of class '<em>Live Device Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device Range</em>'.
	 * @generated
	 */
	LiveDeviceRange createLiveDeviceRange();

	/**
	 * Returns a new object of class '<em>Live Device Range All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device Range All</em>'.
	 * @generated
	 */
	LiveDeviceRangeAll createLiveDeviceRangeAll();

	/**
	 * Returns a new object of class '<em>Live Device Range All Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device Range All Q</em>'.
	 * @generated
	 */
	LiveDeviceRangeAllQ createLiveDeviceRangeAllQ();

	/**
	 * Returns a new object of class '<em>Live Return Device Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Device Range</em>'.
	 * @generated
	 */
	LiveReturnDeviceRange createLiveReturnDeviceRange();

	/**
	 * Returns a new object of class '<em>Live Return Device Range Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Device Range Q</em>'.
	 * @generated
	 */
	LiveReturnDeviceRangeQ createLiveReturnDeviceRangeQ();

	/**
	 * Returns a new object of class '<em>Live Return Device Range All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Device Range All</em>'.
	 * @generated
	 */
	LiveReturnDeviceRangeAll createLiveReturnDeviceRangeAll();

	/**
	 * Returns a new object of class '<em>Live Return Device Range All Q</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Device Range All Q</em>'.
	 * @generated
	 */
	LiveReturnDeviceRangeAllQ createLiveReturnDeviceRangeAllQ();

	/**
	 * Returns a new object of class '<em>Live Device Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device Param</em>'.
	 * @generated
	 */
	LiveDeviceParam createLiveDeviceParam();

	/**
	 * Returns a new object of class '<em>Live Device Param Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device Param Set</em>'.
	 * @generated
	 */
	LiveDeviceParamSet createLiveDeviceParamSet();

	/**
	 * Returns a new object of class '<em>Live Track Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Volume</em>'.
	 * @generated
	 */
	LiveTrackVolume createLiveTrackVolume();

	/**
	 * Returns a new object of class '<em>Live Track Pan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Pan</em>'.
	 * @generated
	 */
	LiveTrackPan createLiveTrackPan();

	/**
	 * Returns a new object of class '<em>Live Track Mute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Mute</em>'.
	 * @generated
	 */
	LiveTrackMute createLiveTrackMute();

	/**
	 * Returns a new object of class '<em>Live Track Solo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Solo</em>'.
	 * @generated
	 */
	LiveTrackSolo createLiveTrackSolo();

	/**
	 * Returns a new object of class '<em>Live Track Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Name</em>'.
	 * @generated
	 */
	LiveTrackName createLiveTrackName();

	/**
	 * Returns a new object of class '<em>Live Track Arm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Arm</em>'.
	 * @generated
	 */
	LiveTrackArm createLiveTrackArm();

	/**
	 * Returns a new object of class '<em>Live Track Send</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Send</em>'.
	 * @generated
	 */
	LiveTrackSend createLiveTrackSend();

	/**
	 * Returns a new object of class '<em>Live Track Pitch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Pitch</em>'.
	 * @generated
	 */
	LiveTrackPitch createLiveTrackPitch();

	/**
	 * Returns a new object of class '<em>Live Return Volume Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Volume Req</em>'.
	 * @generated
	 */
	LiveReturnVolumeReq createLiveReturnVolumeReq();

	/**
	 * Returns a new object of class '<em>Live Return Pan Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Pan Req</em>'.
	 * @generated
	 */
	LiveReturnPanReq createLiveReturnPanReq();

	/**
	 * Returns a new object of class '<em>Live Return Send Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Send Req</em>'.
	 * @generated
	 */
	LiveReturnSendReq createLiveReturnSendReq();

	/**
	 * Returns a new object of class '<em>Live Master Volume Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Master Volume Req</em>'.
	 * @generated
	 */
	LiveMasterVolumeReq createLiveMasterVolumeReq();

	/**
	 * Returns a new object of class '<em>Live Master Pan Req</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Master Pan Req</em>'.
	 * @generated
	 */
	LiveMasterPanReq createLiveMasterPanReq();

	/**
	 * Returns a new object of class '<em>Live Track Jump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Jump</em>'.
	 * @generated
	 */
	LiveTrackJump createLiveTrackJump();

	/**
	 * Returns a new object of class '<em>Live Track Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Info</em>'.
	 * @generated
	 */
	LiveTrackInfo createLiveTrackInfo();

	/**
	 * Returns a new object of class '<em>Live Track Device View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track Device View</em>'.
	 * @generated
	 */
	LiveTrackDeviceView createLiveTrackDeviceView();

	/**
	 * Returns a new object of class '<em>Live Return Device View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Device View</em>'.
	 * @generated
	 */
	LiveReturnDeviceView createLiveReturnDeviceView();

	/**
	 * Returns a new object of class '<em>Live Master Device View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Master Device View</em>'.
	 * @generated
	 */
	LiveMasterDeviceView createLiveMasterDeviceView();

	/**
	 * Returns a new object of class '<em>Live Detail View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Detail View</em>'.
	 * @generated
	 */
	LiveDetailView createLiveDetailView();

	/**
	 * Returns a new object of class '<em>Live Clip Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Clip Info</em>'.
	 * @generated
	 */
	LiveClipInfo createLiveClipInfo();

	/**
	 * Returns a new object of class '<em>Live Devicelist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Devicelist</em>'.
	 * @generated
	 */
	LiveDevicelist createLiveDevicelist();

	/**
	 * Returns a new object of class '<em>Live Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Device</em>'.
	 * @generated
	 */
	LiveDevice createLiveDevice();

	/**
	 * Returns a new object of class '<em>Live Return Devicelist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Devicelist</em>'.
	 * @generated
	 */
	LiveReturnDevicelist createLiveReturnDevicelist();

	/**
	 * Returns a new object of class '<em>Live Return Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Volume</em>'.
	 * @generated
	 */
	LiveReturnVolume createLiveReturnVolume();

	/**
	 * Returns a new object of class '<em>Live Return Pan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Pan</em>'.
	 * @generated
	 */
	LiveReturnPan createLiveReturnPan();

	/**
	 * Returns a new object of class '<em>Live Return Send</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Return Send</em>'.
	 * @generated
	 */
	LiveReturnSend createLiveReturnSend();

	/**
	 * Returns a new object of class '<em>Live Master Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Master Volume</em>'.
	 * @generated
	 */
	LiveMasterVolume createLiveMasterVolume();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzabletonPackage getEzabletonPackage();

} //EzabletonFactory
