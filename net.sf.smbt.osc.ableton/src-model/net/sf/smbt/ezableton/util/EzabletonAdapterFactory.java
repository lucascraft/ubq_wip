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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezableton.EzabletonPackage
 * @generated
 */
public class EzabletonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzabletonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzabletonPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzabletonSwitch<Adapter> modelSwitch =
		new EzabletonSwitch<Adapter>() {
			@Override
			public Adapter caseAbletonLiveSndCmd(AbletonLiveSndCmd object) {
				return createAbletonLiveSndCmdAdapter();
			}
			@Override
			public Adapter caseLiveTempoReq(LiveTempoReq object) {
				return createLiveTempoReqAdapter();
			}
			@Override
			public Adapter caseLiveTempoRcv(LiveTempoRcv object) {
				return createLiveTempoRcvAdapter();
			}
			@Override
			public Adapter caseLiveTimeReq(LiveTimeReq object) {
				return createLiveTimeReqAdapter();
			}
			@Override
			public Adapter caseLiveTimeRcv(LiveTimeRcv object) {
				return createLiveTimeRcvAdapter();
			}
			@Override
			public Adapter caseLiveOverdub(LiveOverdub object) {
				return createLiveOverdubAdapter();
			}
			@Override
			public Adapter caseLiveStateReq(LiveStateReq object) {
				return createLiveStateReqAdapter();
			}
			@Override
			public Adapter caseLiveStateRcv(LiveStateRcv object) {
				return createLiveStateRcvAdapter();
			}
			@Override
			public Adapter caseLiveUndoReq(LiveUndoReq object) {
				return createLiveUndoReqAdapter();
			}
			@Override
			public Adapter caseLiveRedoReq(LiveRedoReq object) {
				return createLiveRedoReqAdapter();
			}
			@Override
			public Adapter caseLiveNextCueReq(LiveNextCueReq object) {
				return createLiveNextCueReqAdapter();
			}
			@Override
			public Adapter caseLivePrevCueReq(LivePrevCueReq object) {
				return createLivePrevCueReqAdapter();
			}
			@Override
			public Adapter caseLivePlayReq(LivePlayReq object) {
				return createLivePlayReqAdapter();
			}
			@Override
			public Adapter caseLivePlayContinueReq(LivePlayContinueReq object) {
				return createLivePlayContinueReqAdapter();
			}
			@Override
			public Adapter caseLivePlayClipReq(LivePlayClipReq object) {
				return createLivePlayClipReqAdapter();
			}
			@Override
			public Adapter caselivePlaySelectionReq(livePlaySelectionReq object) {
				return createlivePlaySelectionReqAdapter();
			}
			@Override
			public Adapter caseLivePlayClipSlotReq(LivePlayClipSlotReq object) {
				return createLivePlayClipSlotReqAdapter();
			}
			@Override
			public Adapter caseLivePlaySceneReq(LivePlaySceneReq object) {
				return createLivePlaySceneReqAdapter();
			}
			@Override
			public Adapter caseLiveStopReq(LiveStopReq object) {
				return createLiveStopReqAdapter();
			}
			@Override
			public Adapter caseLiveStopClipReq(LiveStopClipReq object) {
				return createLiveStopClipReqAdapter();
			}
			@Override
			public Adapter caseLiveStopTrackReq(LiveStopTrackReq object) {
				return createLiveStopTrackReqAdapter();
			}
			@Override
			public Adapter caseLiveScenesReq(LiveScenesReq object) {
				return createLiveScenesReqAdapter();
			}
			@Override
			public Adapter caseLiveTracksReq(LiveTracksReq object) {
				return createLiveTracksReqAdapter();
			}
			@Override
			public Adapter caseLiveSceneReq(LiveSceneReq object) {
				return createLiveSceneReqAdapter();
			}
			@Override
			public Adapter caseLiveNameSceneBlockReq(LiveNameSceneBlockReq object) {
				return createLiveNameSceneBlockReqAdapter();
			}
			@Override
			public Adapter caseLiveNameTrackReq(LiveNameTrackReq object) {
				return createLiveNameTrackReqAdapter();
			}
			@Override
			public Adapter caseLiveNameTrackblockReq(LiveNameTrackblockReq object) {
				return createLiveNameTrackblockReqAdapter();
			}
			@Override
			public Adapter caseLiveNameClipReq(LiveNameClipReq object) {
				return createLiveNameClipReqAdapter();
			}
			@Override
			public Adapter caseLiveNameClipblockreq(LiveNameClipblockreq object) {
				return createLiveNameClipblockreqAdapter();
			}
			@Override
			public Adapter caseLiveArmReq(LiveArmReq object) {
				return createLiveArmReqAdapter();
			}
			@Override
			public Adapter caseLiveMuteReq(LiveMuteReq object) {
				return createLiveMuteReqAdapter();
			}
			@Override
			public Adapter caseLiveVolumeSet(LiveVolumeSet object) {
				return createLiveVolumeSetAdapter();
			}
			@Override
			public Adapter caseLivePanSet(LivePanSet object) {
				return createLivePanSetAdapter();
			}
			@Override
			public Adapter caseLiveSendReq(LiveSendReq object) {
				return createLiveSendReqAdapter();
			}
			@Override
			public Adapter caseLivePitchSet(LivePitchSet object) {
				return createLivePitchSetAdapter();
			}
			@Override
			public Adapter caseLiveReturnMuteReq(LiveReturnMuteReq object) {
				return createLiveReturnMuteReqAdapter();
			}
			@Override
			public Adapter caseLiveReturnVolumeReq(LiveReturnVolumeReq object) {
				return createLiveReturnVolumeReqAdapter();
			}
			@Override
			public Adapter caseLiveReturnPanReq(LiveReturnPanReq object) {
				return createLiveReturnPanReqAdapter();
			}
			@Override
			public Adapter caseLiveReturnSendReq(LiveReturnSendReq object) {
				return createLiveReturnSendReqAdapter();
			}
			@Override
			public Adapter caseLiveMasterVolumeReq(LiveMasterVolumeReq object) {
				return createLiveMasterVolumeReqAdapter();
			}
			@Override
			public Adapter caseLiveMasterPanReq(LiveMasterPanReq object) {
				return createLiveMasterPanReqAdapter();
			}
			@Override
			public Adapter caseLiveTrackJump(LiveTrackJump object) {
				return createLiveTrackJumpAdapter();
			}
			@Override
			public Adapter caseLiveTrackInfo(LiveTrackInfo object) {
				return createLiveTrackInfoAdapter();
			}
			@Override
			public Adapter caseLiveTrackDeviceView(LiveTrackDeviceView object) {
				return createLiveTrackDeviceViewAdapter();
			}
			@Override
			public Adapter caseLiveReturnDeviceView(LiveReturnDeviceView object) {
				return createLiveReturnDeviceViewAdapter();
			}
			@Override
			public Adapter caseLiveMasterDeviceView(LiveMasterDeviceView object) {
				return createLiveMasterDeviceViewAdapter();
			}
			@Override
			public Adapter caseLiveDetailView(LiveDetailView object) {
				return createLiveDetailViewAdapter();
			}
			@Override
			public Adapter caseLiveClipInfo(LiveClipInfo object) {
				return createLiveClipInfoAdapter();
			}
			@Override
			public Adapter caseLiveDevicelist(LiveDevicelist object) {
				return createLiveDevicelistAdapter();
			}
			@Override
			public Adapter caseLiveDevice(LiveDevice object) {
				return createLiveDeviceAdapter();
			}
			@Override
			public Adapter caseLiveReturnDevicelist(LiveReturnDevicelist object) {
				return createLiveReturnDevicelistAdapter();
			}
			@Override
			public Adapter caseLiveReturnVolume(LiveReturnVolume object) {
				return createLiveReturnVolumeAdapter();
			}
			@Override
			public Adapter caseLiveReturnPan(LiveReturnPan object) {
				return createLiveReturnPanAdapter();
			}
			@Override
			public Adapter caseLiveReturnSend(LiveReturnSend object) {
				return createLiveReturnSendAdapter();
			}
			@Override
			public Adapter caseLiveMasterVolume(LiveMasterVolume object) {
				return createLiveMasterVolumeAdapter();
			}
			@Override
			public Adapter caseLiveReturnSolo(LiveReturnSolo object) {
				return createLiveReturnSoloAdapter();
			}
			@Override
			public Adapter caseLiveDeviceView(LiveDeviceView object) {
				return createLiveDeviceViewAdapter();
			}
			@Override
			public Adapter caseLiveMasterMeter(LiveMasterMeter object) {
				return createLiveMasterMeterAdapter();
			}
			@Override
			public Adapter caseLiveClipPosition(LiveClipPosition object) {
				return createLiveClipPositionAdapter();
			}
			@Override
			public Adapter caseLiveTrackMeter(LiveTrackMeter object) {
				return createLiveTrackMeterAdapter();
			}
			@Override
			public Adapter caseLiveNameTrackQ(LiveNameTrackQ object) {
				return createLiveNameTrackQAdapter();
			}
			@Override
			public Adapter caseLiveNameSceneQ(LiveNameSceneQ object) {
				return createLiveNameSceneQAdapter();
			}
			@Override
			public Adapter caseLiveNameClipQ(LiveNameClipQ object) {
				return createLiveNameClipQAdapter();
			}
			@Override
			public Adapter caseLiveNameSceneReq(LiveNameSceneReq object) {
				return createLiveNameSceneReqAdapter();
			}
			@Override
			public Adapter caseLiveScenesQ(LiveScenesQ object) {
				return createLiveScenesQAdapter();
			}
			@Override
			public Adapter caseLiveTracksQ(LiveTracksQ object) {
				return createLiveTracksQAdapter();
			}
			@Override
			public Adapter caseLivePlay(LivePlay object) {
				return createLivePlayAdapter();
			}
			@Override
			public Adapter caseLiveVolume(LiveVolume object) {
				return createLiveVolumeAdapter();
			}
			@Override
			public Adapter caseLiveScene2(LiveScene2 object) {
				return createLiveScene2Adapter();
			}
			@Override
			public Adapter caseLiveReturnMeter(LiveReturnMeter object) {
				return createLiveReturnMeterAdapter();
			}
			@Override
			public Adapter caseLiveDeviceRangeQ(LiveDeviceRangeQ object) {
				return createLiveDeviceRangeQAdapter();
			}
			@Override
			public Adapter caseLiveDeviceRange(LiveDeviceRange object) {
				return createLiveDeviceRangeAdapter();
			}
			@Override
			public Adapter caseLiveDeviceRangeAll(LiveDeviceRangeAll object) {
				return createLiveDeviceRangeAllAdapter();
			}
			@Override
			public Adapter caseLiveDeviceRangeAllQ(LiveDeviceRangeAllQ object) {
				return createLiveDeviceRangeAllQAdapter();
			}
			@Override
			public Adapter caseLiveReturnDeviceRange(LiveReturnDeviceRange object) {
				return createLiveReturnDeviceRangeAdapter();
			}
			@Override
			public Adapter caseLiveReturnDeviceRangeQ(LiveReturnDeviceRangeQ object) {
				return createLiveReturnDeviceRangeQAdapter();
			}
			@Override
			public Adapter caseLiveReturnDeviceRangeAll(LiveReturnDeviceRangeAll object) {
				return createLiveReturnDeviceRangeAllAdapter();
			}
			@Override
			public Adapter caseLiveReturnDeviceRangeAllQ(LiveReturnDeviceRangeAllQ object) {
				return createLiveReturnDeviceRangeAllQAdapter();
			}
			@Override
			public Adapter caseLiveDeviceParam(LiveDeviceParam object) {
				return createLiveDeviceParamAdapter();
			}
			@Override
			public Adapter caseLiveDeviceParamSet(LiveDeviceParamSet object) {
				return createLiveDeviceParamSetAdapter();
			}
			@Override
			public Adapter caseLiveTrackVolume(LiveTrackVolume object) {
				return createLiveTrackVolumeAdapter();
			}
			@Override
			public Adapter caseLiveTrackPan(LiveTrackPan object) {
				return createLiveTrackPanAdapter();
			}
			@Override
			public Adapter caseLiveTrackMute(LiveTrackMute object) {
				return createLiveTrackMuteAdapter();
			}
			@Override
			public Adapter caseLiveTrackSolo(LiveTrackSolo object) {
				return createLiveTrackSoloAdapter();
			}
			@Override
			public Adapter caseLiveTrackName(LiveTrackName object) {
				return createLiveTrackNameAdapter();
			}
			@Override
			public Adapter caseLiveTrackArm(LiveTrackArm object) {
				return createLiveTrackArmAdapter();
			}
			@Override
			public Adapter caseLiveTrackSend(LiveTrackSend object) {
				return createLiveTrackSendAdapter();
			}
			@Override
			public Adapter caseLiveTrackPitch(LiveTrackPitch object) {
				return createLiveTrackPitchAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseOscCmd(OscCmd object) {
				return createOscCmdAdapter();
			}
			@Override
			public Adapter caseOscSndCmd(OscSndCmd object) {
				return createOscSndCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.AbletonLiveSndCmd <em>Ableton Live Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.AbletonLiveSndCmd
	 * @generated
	 */
	public Adapter createAbletonLiveSndCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTempoReq <em>Live Tempo Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTempoReq
	 * @generated
	 */
	public Adapter createLiveTempoReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTempoRcv <em>Live Tempo Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTempoRcv
	 * @generated
	 */
	public Adapter createLiveTempoRcvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTimeReq <em>Live Time Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTimeReq
	 * @generated
	 */
	public Adapter createLiveTimeReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTimeRcv <em>Live Time Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTimeRcv
	 * @generated
	 */
	public Adapter createLiveTimeRcvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveOverdub <em>Live Overdub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveOverdub
	 * @generated
	 */
	public Adapter createLiveOverdubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveStateReq <em>Live State Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveStateReq
	 * @generated
	 */
	public Adapter createLiveStateReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveStateRcv <em>Live State Rcv</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveStateRcv
	 * @generated
	 */
	public Adapter createLiveStateRcvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveUndoReq <em>Live Undo Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveUndoReq
	 * @generated
	 */
	public Adapter createLiveUndoReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveRedoReq <em>Live Redo Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveRedoReq
	 * @generated
	 */
	public Adapter createLiveRedoReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNextCueReq <em>Live Next Cue Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNextCueReq
	 * @generated
	 */
	public Adapter createLiveNextCueReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePrevCueReq <em>Live Prev Cue Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePrevCueReq
	 * @generated
	 */
	public Adapter createLivePrevCueReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePlayReq <em>Live Play Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePlayReq
	 * @generated
	 */
	public Adapter createLivePlayReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePlayContinueReq <em>Live Play Continue Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePlayContinueReq
	 * @generated
	 */
	public Adapter createLivePlayContinueReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePlayClipReq <em>Live Play Clip Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePlayClipReq
	 * @generated
	 */
	public Adapter createLivePlayClipReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.livePlaySelectionReq <em>live Play Selection Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.livePlaySelectionReq
	 * @generated
	 */
	public Adapter createlivePlaySelectionReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePlayClipSlotReq <em>Live Play Clip Slot Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePlayClipSlotReq
	 * @generated
	 */
	public Adapter createLivePlayClipSlotReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePlaySceneReq <em>Live Play Scene Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePlaySceneReq
	 * @generated
	 */
	public Adapter createLivePlaySceneReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveStopReq <em>Live Stop Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveStopReq
	 * @generated
	 */
	public Adapter createLiveStopReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveStopClipReq <em>Live Stop Clip Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveStopClipReq
	 * @generated
	 */
	public Adapter createLiveStopClipReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveStopTrackReq <em>Live Stop Track Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveStopTrackReq
	 * @generated
	 */
	public Adapter createLiveStopTrackReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveScenesReq <em>Live Scenes Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveScenesReq
	 * @generated
	 */
	public Adapter createLiveScenesReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTracksReq <em>Live Tracks Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTracksReq
	 * @generated
	 */
	public Adapter createLiveTracksReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveSceneReq <em>Live Scene Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveSceneReq
	 * @generated
	 */
	public Adapter createLiveSceneReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameSceneBlockReq <em>Live Name Scene Block Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameSceneBlockReq
	 * @generated
	 */
	public Adapter createLiveNameSceneBlockReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameTrackReq <em>Live Name Track Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameTrackReq
	 * @generated
	 */
	public Adapter createLiveNameTrackReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameTrackblockReq <em>Live Name Trackblock Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameTrackblockReq
	 * @generated
	 */
	public Adapter createLiveNameTrackblockReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameClipReq <em>Live Name Clip Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameClipReq
	 * @generated
	 */
	public Adapter createLiveNameClipReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameClipblockreq <em>Live Name Clipblockreq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameClipblockreq
	 * @generated
	 */
	public Adapter createLiveNameClipblockreqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveArmReq <em>Live Arm Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveArmReq
	 * @generated
	 */
	public Adapter createLiveArmReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveMuteReq <em>Live Mute Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveMuteReq
	 * @generated
	 */
	public Adapter createLiveMuteReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveVolumeSet <em>Live Volume Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveVolumeSet
	 * @generated
	 */
	public Adapter createLiveVolumeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePanSet <em>Live Pan Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePanSet
	 * @generated
	 */
	public Adapter createLivePanSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveSendReq <em>Live Send Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveSendReq
	 * @generated
	 */
	public Adapter createLiveSendReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePitchSet <em>Live Pitch Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePitchSet
	 * @generated
	 */
	public Adapter createLivePitchSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnMuteReq <em>Live Return Mute Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnMuteReq
	 * @generated
	 */
	public Adapter createLiveReturnMuteReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnSolo <em>Live Return Solo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnSolo
	 * @generated
	 */
	public Adapter createLiveReturnSoloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDeviceView <em>Live Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDeviceView
	 * @generated
	 */
	public Adapter createLiveDeviceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveMasterMeter <em>Live Master Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveMasterMeter
	 * @generated
	 */
	public Adapter createLiveMasterMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveClipPosition <em>Live Clip Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveClipPosition
	 * @generated
	 */
	public Adapter createLiveClipPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackMeter <em>Live Track Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackMeter
	 * @generated
	 */
	public Adapter createLiveTrackMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameTrackQ <em>Live Name Track Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameTrackQ
	 * @generated
	 */
	public Adapter createLiveNameTrackQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameSceneQ <em>Live Name Scene Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameSceneQ
	 * @generated
	 */
	public Adapter createLiveNameSceneQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameClipQ <em>Live Name Clip Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameClipQ
	 * @generated
	 */
	public Adapter createLiveNameClipQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveNameSceneReq <em>Live Name Scene Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveNameSceneReq
	 * @generated
	 */
	public Adapter createLiveNameSceneReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveScenesQ <em>Live Scenes Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveScenesQ
	 * @generated
	 */
	public Adapter createLiveScenesQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTracksQ <em>Live Tracks Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTracksQ
	 * @generated
	 */
	public Adapter createLiveTracksQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LivePlay <em>Live Play</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LivePlay
	 * @generated
	 */
	public Adapter createLivePlayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveVolume <em>Live Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveVolume
	 * @generated
	 */
	public Adapter createLiveVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveScene2 <em>Live Scene2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveScene2
	 * @generated
	 */
	public Adapter createLiveScene2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnMeter <em>Live Return Meter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnMeter
	 * @generated
	 */
	public Adapter createLiveReturnMeterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDeviceRangeQ <em>Live Device Range Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeQ
	 * @generated
	 */
	public Adapter createLiveDeviceRangeQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDeviceRange <em>Live Device Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDeviceRange
	 * @generated
	 */
	public Adapter createLiveDeviceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDeviceRangeAll <em>Live Device Range All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAll
	 * @generated
	 */
	public Adapter createLiveDeviceRangeAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDeviceRangeAllQ <em>Live Device Range All Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDeviceRangeAllQ
	 * @generated
	 */
	public Adapter createLiveDeviceRangeAllQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRange <em>Live Return Device Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRange
	 * @generated
	 */
	public Adapter createLiveReturnDeviceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeQ <em>Live Return Device Range Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeQ
	 * @generated
	 */
	public Adapter createLiveReturnDeviceRangeQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAll <em>Live Return Device Range All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAll
	 * @generated
	 */
	public Adapter createLiveReturnDeviceRangeAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ <em>Live Return Device Range All Q</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceRangeAllQ
	 * @generated
	 */
	public Adapter createLiveReturnDeviceRangeAllQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDeviceParam <em>Live Device Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDeviceParam
	 * @generated
	 */
	public Adapter createLiveDeviceParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDeviceParamSet <em>Live Device Param Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDeviceParamSet
	 * @generated
	 */
	public Adapter createLiveDeviceParamSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackVolume <em>Live Track Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackVolume
	 * @generated
	 */
	public Adapter createLiveTrackVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackPan <em>Live Track Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackPan
	 * @generated
	 */
	public Adapter createLiveTrackPanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackMute <em>Live Track Mute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackMute
	 * @generated
	 */
	public Adapter createLiveTrackMuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackSolo <em>Live Track Solo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackSolo
	 * @generated
	 */
	public Adapter createLiveTrackSoloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackName <em>Live Track Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackName
	 * @generated
	 */
	public Adapter createLiveTrackNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackArm <em>Live Track Arm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackArm
	 * @generated
	 */
	public Adapter createLiveTrackArmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackSend <em>Live Track Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackSend
	 * @generated
	 */
	public Adapter createLiveTrackSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackPitch <em>Live Track Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackPitch
	 * @generated
	 */
	public Adapter createLiveTrackPitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnVolumeReq <em>Live Return Volume Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnVolumeReq
	 * @generated
	 */
	public Adapter createLiveReturnVolumeReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnPanReq <em>Live Return Pan Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnPanReq
	 * @generated
	 */
	public Adapter createLiveReturnPanReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnSendReq <em>Live Return Send Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnSendReq
	 * @generated
	 */
	public Adapter createLiveReturnSendReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveMasterVolumeReq <em>Live Master Volume Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveMasterVolumeReq
	 * @generated
	 */
	public Adapter createLiveMasterVolumeReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveMasterPanReq <em>Live Master Pan Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveMasterPanReq
	 * @generated
	 */
	public Adapter createLiveMasterPanReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackJump <em>Live Track Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackJump
	 * @generated
	 */
	public Adapter createLiveTrackJumpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackInfo <em>Live Track Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackInfo
	 * @generated
	 */
	public Adapter createLiveTrackInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveTrackDeviceView <em>Live Track Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveTrackDeviceView
	 * @generated
	 */
	public Adapter createLiveTrackDeviceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnDeviceView <em>Live Return Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnDeviceView
	 * @generated
	 */
	public Adapter createLiveReturnDeviceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveMasterDeviceView <em>Live Master Device View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveMasterDeviceView
	 * @generated
	 */
	public Adapter createLiveMasterDeviceViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDetailView <em>Live Detail View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDetailView
	 * @generated
	 */
	public Adapter createLiveDetailViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveClipInfo <em>Live Clip Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveClipInfo
	 * @generated
	 */
	public Adapter createLiveClipInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDevicelist <em>Live Devicelist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDevicelist
	 * @generated
	 */
	public Adapter createLiveDevicelistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveDevice <em>Live Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveDevice
	 * @generated
	 */
	public Adapter createLiveDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnDevicelist <em>Live Return Devicelist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnDevicelist
	 * @generated
	 */
	public Adapter createLiveReturnDevicelistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnVolume <em>Live Return Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnVolume
	 * @generated
	 */
	public Adapter createLiveReturnVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnPan <em>Live Return Pan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnPan
	 * @generated
	 */
	public Adapter createLiveReturnPanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveReturnSend <em>Live Return Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveReturnSend
	 * @generated
	 */
	public Adapter createLiveReturnSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezableton.LiveMasterVolume <em>Live Master Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezableton.LiveMasterVolume
	 * @generated
	 */
	public Adapter createLiveMasterVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osccmd.OscCmd <em>Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osccmd.OscCmd
	 * @generated
	 */
	public Adapter createOscCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osccmd.OscSndCmd <em>Osc Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osccmd.OscSndCmd
	 * @generated
	 */
	public Adapter createOscSndCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzabletonAdapterFactory
