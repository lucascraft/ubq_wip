package net.sf.smbt.ezableton.impl;


import net.sf.smbt.ezableton.AbletonLiveSndCmd;
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
import net.sf.smbt.ezableton.LiveTrackArm;
import net.sf.smbt.ezableton.LiveTrackDeviceView;
import net.sf.smbt.ezableton.LiveTrackInfo;
import net.sf.smbt.ezableton.LiveTrackJump;
import net.sf.smbt.ezableton.LiveTrackMeter;
import net.sf.smbt.ezableton.LiveTrackMute;
import net.sf.smbt.ezableton.LiveTrackName;
import net.sf.smbt.ezableton.LiveTrackPan;
import net.sf.smbt.ezableton.LiveTrackPitch;
import net.sf.smbt.ezableton.LiveTrackSend;
import net.sf.smbt.ezableton.LiveTrackSolo;
import net.sf.smbt.ezableton.LiveTrackVolume;
import net.sf.smbt.ezableton.LiveTracksQ;
import net.sf.smbt.ezableton.LiveTracksReq;
import net.sf.smbt.ezableton.LiveUndoReq;
import net.sf.smbt.ezableton.LiveVolume;
import net.sf.smbt.ezableton.LiveVolumeSet;
import net.sf.smbt.ezableton.livePlaySelectionReq;
import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzabletonPackageImpl extends EPackageImpl implements EzabletonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abletonLiveSndCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTempoReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTempoRcvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTimeReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTimeRcvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveOverdubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveStateReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveStateRcvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveUndoReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveRedoReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNextCueReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePrevCueReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePlayReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePlayContinueReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePlayClipReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePlaySelectionReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePlayClipSlotReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePlaySceneReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveStopReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveStopClipReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveStopTrackReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveScenesReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTracksReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveSceneReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameSceneBlockReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameTrackReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameTrackblockReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameClipReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameClipblockreqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveArmReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveMuteReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveVolumeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePanSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveSendReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePitchSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnMuteReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnVolumeReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnPanReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnSendReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveMasterVolumeReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveMasterPanReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackJumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackDeviceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnDeviceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveMasterDeviceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDetailViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveClipInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDevicelistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnDevicelistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnPanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnSendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveMasterVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnSoloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveMasterMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveClipPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameTrackQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameSceneQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameClipQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveNameSceneReqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveScenesQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTracksQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livePlayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveScene2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnMeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceRangeQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceRangeAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceRangeAllQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnDeviceRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnDeviceRangeQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnDeviceRangeAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveReturnDeviceRangeAllQEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveDeviceParamSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackVolumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackPanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackMuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackSoloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackArmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackSendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackPitchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tracK_ARM_STATUSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tracK_MUTE_STATUSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tracK_SOLO_STATUSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cliP_STATEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum plaY_STATUSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum meteR_INPUTEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.ezableton.EzabletonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzabletonPackageImpl() {
		super(eNS_URI, EzabletonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzabletonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzabletonPackage init() {
		if (isInited) return (EzabletonPackage)EPackage.Registry.INSTANCE.getEPackage(EzabletonPackage.eNS_URI);

		// Obtain or create and register package
		EzabletonPackageImpl theEzabletonPackage = (EzabletonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzabletonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzabletonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzabletonPackage.createPackageContents();

		// Initialize created meta-data
		theEzabletonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzabletonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzabletonPackage.eNS_URI, theEzabletonPackage);
		return theEzabletonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbletonLiveSndCmd() {
		return abletonLiveSndCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTempoReq() {
		return liveTempoReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTempoRcv() {
		return liveTempoRcvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTempoRcv_Tempo() {
		return (EAttribute)liveTempoRcvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTimeReq() {
		return liveTimeReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTimeRcv() {
		return liveTimeRcvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTimeRcv_Time() {
		return (EAttribute)liveTimeRcvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveOverdub() {
		return liveOverdubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveOverdub_State() {
		return (EAttribute)liveOverdubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveStateReq() {
		return liveStateReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveStateRcv() {
		return liveStateRcvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveStateRcv_Tempo() {
		return (EAttribute)liveStateRcvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveStateRcv_Overdub() {
		return (EAttribute)liveStateRcvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveUndoReq() {
		return liveUndoReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveRedoReq() {
		return liveRedoReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNextCueReq() {
		return liveNextCueReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePrevCueReq() {
		return livePrevCueReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePlayReq() {
		return livePlayReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePlayContinueReq() {
		return livePlayContinueReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePlayClipReq() {
		return livePlayClipReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlivePlaySelectionReq() {
		return livePlaySelectionReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePlayClipSlotReq() {
		return livePlayClipSlotReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePlayClipSlotReq_TrackID() {
		return (EAttribute)livePlayClipSlotReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePlayClipSlotReq_ClipID() {
		return (EAttribute)livePlayClipSlotReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePlaySceneReq() {
		return livePlaySceneReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePlaySceneReq_SceneID() {
		return (EAttribute)livePlaySceneReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveStopReq() {
		return liveStopReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveStopClipReq() {
		return liveStopClipReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveStopClipReq_TrackID() {
		return (EAttribute)liveStopClipReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveStopClipReq_ClipID() {
		return (EAttribute)liveStopClipReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveStopTrackReq() {
		return liveStopTrackReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveStopTrackReq_TrackID() {
		return (EAttribute)liveStopTrackReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveScenesReq() {
		return liveScenesReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTracksReq() {
		return liveTracksReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveSceneReq() {
		return liveSceneReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveSceneReq_Mode() {
		return (EAttribute)liveSceneReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveSceneReq_SceneID() {
		return (EAttribute)liveSceneReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameSceneBlockReq() {
		return liveNameSceneBlockReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameSceneBlockReq_TrackID() {
		return (EAttribute)liveNameSceneBlockReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameSceneBlockReq_Size() {
		return (EAttribute)liveNameSceneBlockReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameTrackReq() {
		return liveNameTrackReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameTrackReq_TrackName() {
		return (EAttribute)liveNameTrackReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameTrackReq_Color() {
		return (EAttribute)liveNameTrackReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameTrackReq_TrackID() {
		return (EAttribute)liveNameTrackReqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameTrackblockReq() {
		return liveNameTrackblockReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameTrackblockReq_TrackID() {
		return (EAttribute)liveNameTrackblockReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameTrackblockReq_Size() {
		return (EAttribute)liveNameTrackblockReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameTrackblockReq_TrackName() {
		return (EAttribute)liveNameTrackblockReqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameClipReq() {
		return liveNameClipReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipReq_TrackID() {
		return (EAttribute)liveNameClipReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipReq_ClipID() {
		return (EAttribute)liveNameClipReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipReq_Label() {
		return (EAttribute)liveNameClipReqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipReq_Color() {
		return (EAttribute)liveNameClipReqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameClipblockreq() {
		return liveNameClipblockreqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipblockreq_TrackID() {
		return (EAttribute)liveNameClipblockreqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipblockreq_ClipID() {
		return (EAttribute)liveNameClipblockreqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipblockreq_SizeX() {
		return (EAttribute)liveNameClipblockreqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameClipblockreq_SizeY() {
		return (EAttribute)liveNameClipblockreqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveArmReq() {
		return liveArmReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveArmReq_TrackID() {
		return (EAttribute)liveArmReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveArmReq_Status() {
		return (EAttribute)liveArmReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveMuteReq() {
		return liveMuteReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMuteReq_TrackID() {
		return (EAttribute)liveMuteReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMuteReq_Status() {
		return (EAttribute)liveMuteReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveVolumeSet() {
		return liveVolumeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveVolumeSet_TrackID() {
		return (EAttribute)liveVolumeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveVolumeSet_Level() {
		return (EAttribute)liveVolumeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePanSet() {
		return livePanSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePanSet_TrackID() {
		return (EAttribute)livePanSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePanSet_Value() {
		return (EAttribute)livePanSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveSendReq() {
		return liveSendReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveSendReq_TrackID() {
		return (EAttribute)liveSendReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveSendReq_Value() {
		return (EAttribute)liveSendReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePitchSet() {
		return livePitchSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePitchSet_TrackID() {
		return (EAttribute)livePitchSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePitchSet_Clip() {
		return (EAttribute)livePitchSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePitchSet_Coarse() {
		return (EAttribute)livePitchSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePitchSet_Fine() {
		return (EAttribute)livePitchSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnMuteReq() {
		return liveReturnMuteReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnMuteReq_TrackID() {
		return (EAttribute)liveReturnMuteReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnMuteReq_Status() {
		return (EAttribute)liveReturnMuteReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnVolumeReq() {
		return liveReturnVolumeReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnVolumeReq_TrackID() {
		return (EAttribute)liveReturnVolumeReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnVolumeReq_Level() {
		return (EAttribute)liveReturnVolumeReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnPanReq() {
		return liveReturnPanReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnPanReq_TrackID() {
		return (EAttribute)liveReturnPanReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnPanReq_Pan() {
		return (EAttribute)liveReturnPanReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnSendReq() {
		return liveReturnSendReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSendReq_TrackID() {
		return (EAttribute)liveReturnSendReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSendReq_Send() {
		return (EAttribute)liveReturnSendReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSendReq_Level() {
		return (EAttribute)liveReturnSendReqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveMasterVolumeReq() {
		return liveMasterVolumeReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterVolumeReq_TrackID() {
		return (EAttribute)liveMasterVolumeReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterVolumeReq_Level() {
		return (EAttribute)liveMasterVolumeReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveMasterPanReq() {
		return liveMasterPanReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterPanReq_TrackID() {
		return (EAttribute)liveMasterPanReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterPanReq_Pan() {
		return (EAttribute)liveMasterPanReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackJump() {
		return liveTrackJumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackJump_TrackID() {
		return (EAttribute)liveTrackJumpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackJump_Beats() {
		return (EAttribute)liveTrackJumpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackInfo() {
		return liveTrackInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackInfo_TrackID() {
		return (EAttribute)liveTrackInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackDeviceView() {
		return liveTrackDeviceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackDeviceView_TrackID() {
		return (EAttribute)liveTrackDeviceViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackDeviceView_DeviceID() {
		return (EAttribute)liveTrackDeviceViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnDeviceView() {
		return liveReturnDeviceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceView_TrackID() {
		return (EAttribute)liveReturnDeviceViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceView_DeviceID() {
		return (EAttribute)liveReturnDeviceViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveMasterDeviceView() {
		return liveMasterDeviceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterDeviceView_DeviceID() {
		return (EAttribute)liveMasterDeviceViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDetailView() {
		return liveDetailViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDetailView_Value() {
		return (EAttribute)liveDetailViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveClipInfo() {
		return liveClipInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipInfo_TrackID() {
		return (EAttribute)liveClipInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipInfo_Status() {
		return (EAttribute)liveClipInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipInfo_ClipID() {
		return (EAttribute)liveClipInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDevicelist() {
		return liveDevicelistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDevicelist_TrackID() {
		return (EAttribute)liveDevicelistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDevice() {
		return liveDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDevice_TrackID() {
		return (EAttribute)liveDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDevice_DeviceID() {
		return (EAttribute)liveDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDevice_Param() {
		return (EAttribute)liveDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDevice_S() {
		return (EAttribute)liveDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnDevicelist() {
		return liveReturnDevicelistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDevicelist_TrackID() {
		return (EAttribute)liveReturnDevicelistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnVolume() {
		return liveReturnVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnVolume_TrackID() {
		return (EAttribute)liveReturnVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnVolume_Level() {
		return (EAttribute)liveReturnVolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnPan() {
		return liveReturnPanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnPan_TrackID() {
		return (EAttribute)liveReturnPanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnPan_Pan() {
		return (EAttribute)liveReturnPanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnSend() {
		return liveReturnSendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSend_TrackID() {
		return (EAttribute)liveReturnSendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSend_Send() {
		return (EAttribute)liveReturnSendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSend_Level() {
		return (EAttribute)liveReturnSendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveMasterVolume() {
		return liveMasterVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterVolume_TrackID() {
		return (EAttribute)liveMasterVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterVolume_Level() {
		return (EAttribute)liveMasterVolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnSolo() {
		return liveReturnSoloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSolo_TrackID() {
		return (EAttribute)liveReturnSoloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnSolo_Status() {
		return (EAttribute)liveReturnSoloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDeviceView() {
		return liveDeviceViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceView_TrackID() {
		return (EAttribute)liveDeviceViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceView_DeviceID() {
		return (EAttribute)liveDeviceViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveMasterMeter() {
		return liveMasterMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterMeter_Level() {
		return (EAttribute)liveMasterMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveMasterMeter_Which() {
		return (EAttribute)liveMasterMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveClipPosition() {
		return liveClipPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipPosition_TrackID() {
		return (EAttribute)liveClipPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipPosition_ClipID() {
		return (EAttribute)liveClipPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipPosition_Position() {
		return (EAttribute)liveClipPositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipPosition_Length() {
		return (EAttribute)liveClipPositionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipPosition_LoopStart() {
		return (EAttribute)liveClipPositionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClipPosition_LoopEnd() {
		return (EAttribute)liveClipPositionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackMeter() {
		return liveTrackMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackMeter_TrackID() {
		return (EAttribute)liveTrackMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackMeter_Which() {
		return (EAttribute)liveTrackMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackMeter_Level() {
		return (EAttribute)liveTrackMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameTrackQ() {
		return liveNameTrackQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameSceneQ() {
		return liveNameSceneQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameClipQ() {
		return liveNameClipQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveNameSceneReq() {
		return liveNameSceneReqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameSceneReq_SceneID() {
		return (EAttribute)liveNameSceneReqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveNameSceneReq_SceneName() {
		return (EAttribute)liveNameSceneReqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveScenesQ() {
		return liveScenesQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveScenesQ_NumScenes() {
		return (EAttribute)liveScenesQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTracksQ() {
		return liveTracksQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTracksQ_NumTracks() {
		return (EAttribute)liveTracksQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivePlay() {
		return livePlayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivePlay_Status() {
		return (EAttribute)livePlayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveVolume() {
		return liveVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveVolume_Level() {
		return (EAttribute)liveVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveVolume_TrackID() {
		return (EAttribute)liveVolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveScene2() {
		return liveScene2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveScene2_SceneID() {
		return (EAttribute)liveScene2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnMeter() {
		return liveReturnMeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnMeter_TrackID() {
		return (EAttribute)liveReturnMeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnMeter_Level() {
		return (EAttribute)liveReturnMeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnMeter_Which() {
		return (EAttribute)liveReturnMeterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDeviceRangeQ() {
		return liveDeviceRangeQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRangeQ_TrackID() {
		return (EAttribute)liveDeviceRangeQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRangeQ_DeviceID() {
		return (EAttribute)liveDeviceRangeQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRangeQ_Param() {
		return (EAttribute)liveDeviceRangeQEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDeviceRange() {
		return liveDeviceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRange_TrackID() {
		return (EAttribute)liveDeviceRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRange_DeviceID() {
		return (EAttribute)liveDeviceRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDeviceRangeAll() {
		return liveDeviceRangeAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRangeAll_TrackID() {
		return (EAttribute)liveDeviceRangeAllEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRangeAll_DeviceID() {
		return (EAttribute)liveDeviceRangeAllEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDeviceRangeAllQ() {
		return liveDeviceRangeAllQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRangeAllQ_TrackID() {
		return (EAttribute)liveDeviceRangeAllQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceRangeAllQ_DeviceID() {
		return (EAttribute)liveDeviceRangeAllQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnDeviceRange() {
		return liveReturnDeviceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRange_TrackID() {
		return (EAttribute)liveReturnDeviceRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRange_DeviceID() {
		return (EAttribute)liveReturnDeviceRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnDeviceRangeQ() {
		return liveReturnDeviceRangeQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRangeQ_TrackID() {
		return (EAttribute)liveReturnDeviceRangeQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRangeQ_DeviceID() {
		return (EAttribute)liveReturnDeviceRangeQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRangeQ_Param() {
		return (EAttribute)liveReturnDeviceRangeQEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnDeviceRangeAll() {
		return liveReturnDeviceRangeAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRangeAll_TrackID() {
		return (EAttribute)liveReturnDeviceRangeAllEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRangeAll_DeviceID() {
		return (EAttribute)liveReturnDeviceRangeAllEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveReturnDeviceRangeAllQ() {
		return liveReturnDeviceRangeAllQEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRangeAllQ_TrackID() {
		return (EAttribute)liveReturnDeviceRangeAllQEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveReturnDeviceRangeAllQ_DeviceID() {
		return (EAttribute)liveReturnDeviceRangeAllQEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDeviceParam() {
		return liveDeviceParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParam_TrackID() {
		return (EAttribute)liveDeviceParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParam_DeviceID() {
		return (EAttribute)liveDeviceParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParam_Param() {
		return (EAttribute)liveDeviceParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParam_Value() {
		return (EAttribute)liveDeviceParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParam_Type() {
		return (EAttribute)liveDeviceParamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParam_Name() {
		return (EAttribute)liveDeviceParamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveDeviceParamSet() {
		return liveDeviceParamSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_TrackID() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_DeviceID() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_Value() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_PIndex() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_Min() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_Max() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_Status() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveDeviceParamSet_Type() {
		return (EAttribute)liveDeviceParamSetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackVolume() {
		return liveTrackVolumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackVolume_Volume() {
		return (EAttribute)liveTrackVolumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackVolume_TrackID() {
		return (EAttribute)liveTrackVolumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackPan() {
		return liveTrackPanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackPan_Pan() {
		return (EAttribute)liveTrackPanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackPan_TrackID() {
		return (EAttribute)liveTrackPanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackMute() {
		return liveTrackMuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackMute_TrackID() {
		return (EAttribute)liveTrackMuteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackMute_State() {
		return (EAttribute)liveTrackMuteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackSolo() {
		return liveTrackSoloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackSolo_TrackID() {
		return (EAttribute)liveTrackSoloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackSolo_State() {
		return (EAttribute)liveTrackSoloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackName() {
		return liveTrackNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackName_TrackID() {
		return (EAttribute)liveTrackNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackName_Name() {
		return (EAttribute)liveTrackNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackArm() {
		return liveTrackArmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackArm_TrackID() {
		return (EAttribute)liveTrackArmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackArm_State() {
		return (EAttribute)liveTrackArmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackSend() {
		return liveTrackSendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackSend_TrackID() {
		return (EAttribute)liveTrackSendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackSend_Send() {
		return (EAttribute)liveTrackSendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackPitch() {
		return liveTrackPitchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackPitch_TrackID() {
		return (EAttribute)liveTrackPitchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrackPitch_Pitch() {
		return (EAttribute)liveTrackPitchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTRACK_ARM_STATUS() {
		return tracK_ARM_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTRACK_MUTE_STATUS() {
		return tracK_MUTE_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTRACK_SOLO_STATUS() {
		return tracK_SOLO_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCLIP_STATE() {
		return cliP_STATEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPLAY_STATUS() {
		return plaY_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMETER_INPUT() {
		return meteR_INPUTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonFactory getEzabletonFactory() {
		return (EzabletonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abletonLiveSndCmdEClass = createEClass(ABLETON_LIVE_SND_CMD);

		liveTempoReqEClass = createEClass(LIVE_TEMPO_REQ);

		liveTempoRcvEClass = createEClass(LIVE_TEMPO_RCV);
		createEAttribute(liveTempoRcvEClass, LIVE_TEMPO_RCV__TEMPO);

		liveTimeReqEClass = createEClass(LIVE_TIME_REQ);

		liveTimeRcvEClass = createEClass(LIVE_TIME_RCV);
		createEAttribute(liveTimeRcvEClass, LIVE_TIME_RCV__TIME);

		liveOverdubEClass = createEClass(LIVE_OVERDUB);
		createEAttribute(liveOverdubEClass, LIVE_OVERDUB__STATE);

		liveStateReqEClass = createEClass(LIVE_STATE_REQ);

		liveStateRcvEClass = createEClass(LIVE_STATE_RCV);
		createEAttribute(liveStateRcvEClass, LIVE_STATE_RCV__TEMPO);
		createEAttribute(liveStateRcvEClass, LIVE_STATE_RCV__OVERDUB);

		liveUndoReqEClass = createEClass(LIVE_UNDO_REQ);

		liveRedoReqEClass = createEClass(LIVE_REDO_REQ);

		liveNextCueReqEClass = createEClass(LIVE_NEXT_CUE_REQ);

		livePrevCueReqEClass = createEClass(LIVE_PREV_CUE_REQ);

		livePlayReqEClass = createEClass(LIVE_PLAY_REQ);

		livePlayContinueReqEClass = createEClass(LIVE_PLAY_CONTINUE_REQ);

		livePlayClipReqEClass = createEClass(LIVE_PLAY_CLIP_REQ);

		livePlaySelectionReqEClass = createEClass(LIVE_PLAY_SELECTION_REQ);

		livePlayClipSlotReqEClass = createEClass(LIVE_PLAY_CLIP_SLOT_REQ);
		createEAttribute(livePlayClipSlotReqEClass, LIVE_PLAY_CLIP_SLOT_REQ__TRACK_ID);
		createEAttribute(livePlayClipSlotReqEClass, LIVE_PLAY_CLIP_SLOT_REQ__CLIP_ID);

		livePlaySceneReqEClass = createEClass(LIVE_PLAY_SCENE_REQ);
		createEAttribute(livePlaySceneReqEClass, LIVE_PLAY_SCENE_REQ__SCENE_ID);

		liveStopReqEClass = createEClass(LIVE_STOP_REQ);

		liveStopClipReqEClass = createEClass(LIVE_STOP_CLIP_REQ);
		createEAttribute(liveStopClipReqEClass, LIVE_STOP_CLIP_REQ__TRACK_ID);
		createEAttribute(liveStopClipReqEClass, LIVE_STOP_CLIP_REQ__CLIP_ID);

		liveStopTrackReqEClass = createEClass(LIVE_STOP_TRACK_REQ);
		createEAttribute(liveStopTrackReqEClass, LIVE_STOP_TRACK_REQ__TRACK_ID);

		liveScenesReqEClass = createEClass(LIVE_SCENES_REQ);

		liveTracksReqEClass = createEClass(LIVE_TRACKS_REQ);

		liveSceneReqEClass = createEClass(LIVE_SCENE_REQ);
		createEAttribute(liveSceneReqEClass, LIVE_SCENE_REQ__MODE);
		createEAttribute(liveSceneReqEClass, LIVE_SCENE_REQ__SCENE_ID);

		liveNameSceneBlockReqEClass = createEClass(LIVE_NAME_SCENE_BLOCK_REQ);
		createEAttribute(liveNameSceneBlockReqEClass, LIVE_NAME_SCENE_BLOCK_REQ__TRACK_ID);
		createEAttribute(liveNameSceneBlockReqEClass, LIVE_NAME_SCENE_BLOCK_REQ__SIZE);

		liveNameTrackReqEClass = createEClass(LIVE_NAME_TRACK_REQ);
		createEAttribute(liveNameTrackReqEClass, LIVE_NAME_TRACK_REQ__TRACK_NAME);
		createEAttribute(liveNameTrackReqEClass, LIVE_NAME_TRACK_REQ__COLOR);
		createEAttribute(liveNameTrackReqEClass, LIVE_NAME_TRACK_REQ__TRACK_ID);

		liveNameTrackblockReqEClass = createEClass(LIVE_NAME_TRACKBLOCK_REQ);
		createEAttribute(liveNameTrackblockReqEClass, LIVE_NAME_TRACKBLOCK_REQ__TRACK_ID);
		createEAttribute(liveNameTrackblockReqEClass, LIVE_NAME_TRACKBLOCK_REQ__SIZE);
		createEAttribute(liveNameTrackblockReqEClass, LIVE_NAME_TRACKBLOCK_REQ__TRACK_NAME);

		liveNameClipReqEClass = createEClass(LIVE_NAME_CLIP_REQ);
		createEAttribute(liveNameClipReqEClass, LIVE_NAME_CLIP_REQ__TRACK_ID);
		createEAttribute(liveNameClipReqEClass, LIVE_NAME_CLIP_REQ__CLIP_ID);
		createEAttribute(liveNameClipReqEClass, LIVE_NAME_CLIP_REQ__LABEL);
		createEAttribute(liveNameClipReqEClass, LIVE_NAME_CLIP_REQ__COLOR);

		liveNameClipblockreqEClass = createEClass(LIVE_NAME_CLIPBLOCKREQ);
		createEAttribute(liveNameClipblockreqEClass, LIVE_NAME_CLIPBLOCKREQ__TRACK_ID);
		createEAttribute(liveNameClipblockreqEClass, LIVE_NAME_CLIPBLOCKREQ__CLIP_ID);
		createEAttribute(liveNameClipblockreqEClass, LIVE_NAME_CLIPBLOCKREQ__SIZE_X);
		createEAttribute(liveNameClipblockreqEClass, LIVE_NAME_CLIPBLOCKREQ__SIZE_Y);

		liveArmReqEClass = createEClass(LIVE_ARM_REQ);
		createEAttribute(liveArmReqEClass, LIVE_ARM_REQ__TRACK_ID);
		createEAttribute(liveArmReqEClass, LIVE_ARM_REQ__STATUS);

		liveMuteReqEClass = createEClass(LIVE_MUTE_REQ);
		createEAttribute(liveMuteReqEClass, LIVE_MUTE_REQ__TRACK_ID);
		createEAttribute(liveMuteReqEClass, LIVE_MUTE_REQ__STATUS);

		liveVolumeSetEClass = createEClass(LIVE_VOLUME_SET);
		createEAttribute(liveVolumeSetEClass, LIVE_VOLUME_SET__TRACK_ID);
		createEAttribute(liveVolumeSetEClass, LIVE_VOLUME_SET__LEVEL);

		livePanSetEClass = createEClass(LIVE_PAN_SET);
		createEAttribute(livePanSetEClass, LIVE_PAN_SET__TRACK_ID);
		createEAttribute(livePanSetEClass, LIVE_PAN_SET__VALUE);

		liveSendReqEClass = createEClass(LIVE_SEND_REQ);
		createEAttribute(liveSendReqEClass, LIVE_SEND_REQ__TRACK_ID);
		createEAttribute(liveSendReqEClass, LIVE_SEND_REQ__VALUE);

		livePitchSetEClass = createEClass(LIVE_PITCH_SET);
		createEAttribute(livePitchSetEClass, LIVE_PITCH_SET__TRACK_ID);
		createEAttribute(livePitchSetEClass, LIVE_PITCH_SET__CLIP);
		createEAttribute(livePitchSetEClass, LIVE_PITCH_SET__COARSE);
		createEAttribute(livePitchSetEClass, LIVE_PITCH_SET__FINE);

		liveReturnMuteReqEClass = createEClass(LIVE_RETURN_MUTE_REQ);
		createEAttribute(liveReturnMuteReqEClass, LIVE_RETURN_MUTE_REQ__TRACK_ID);
		createEAttribute(liveReturnMuteReqEClass, LIVE_RETURN_MUTE_REQ__STATUS);

		liveReturnVolumeReqEClass = createEClass(LIVE_RETURN_VOLUME_REQ);
		createEAttribute(liveReturnVolumeReqEClass, LIVE_RETURN_VOLUME_REQ__TRACK_ID);
		createEAttribute(liveReturnVolumeReqEClass, LIVE_RETURN_VOLUME_REQ__LEVEL);

		liveReturnPanReqEClass = createEClass(LIVE_RETURN_PAN_REQ);
		createEAttribute(liveReturnPanReqEClass, LIVE_RETURN_PAN_REQ__TRACK_ID);
		createEAttribute(liveReturnPanReqEClass, LIVE_RETURN_PAN_REQ__PAN);

		liveReturnSendReqEClass = createEClass(LIVE_RETURN_SEND_REQ);
		createEAttribute(liveReturnSendReqEClass, LIVE_RETURN_SEND_REQ__TRACK_ID);
		createEAttribute(liveReturnSendReqEClass, LIVE_RETURN_SEND_REQ__SEND);
		createEAttribute(liveReturnSendReqEClass, LIVE_RETURN_SEND_REQ__LEVEL);

		liveMasterVolumeReqEClass = createEClass(LIVE_MASTER_VOLUME_REQ);
		createEAttribute(liveMasterVolumeReqEClass, LIVE_MASTER_VOLUME_REQ__TRACK_ID);
		createEAttribute(liveMasterVolumeReqEClass, LIVE_MASTER_VOLUME_REQ__LEVEL);

		liveMasterPanReqEClass = createEClass(LIVE_MASTER_PAN_REQ);
		createEAttribute(liveMasterPanReqEClass, LIVE_MASTER_PAN_REQ__TRACK_ID);
		createEAttribute(liveMasterPanReqEClass, LIVE_MASTER_PAN_REQ__PAN);

		liveTrackJumpEClass = createEClass(LIVE_TRACK_JUMP);
		createEAttribute(liveTrackJumpEClass, LIVE_TRACK_JUMP__TRACK_ID);
		createEAttribute(liveTrackJumpEClass, LIVE_TRACK_JUMP__BEATS);

		liveTrackInfoEClass = createEClass(LIVE_TRACK_INFO);
		createEAttribute(liveTrackInfoEClass, LIVE_TRACK_INFO__TRACK_ID);

		liveTrackDeviceViewEClass = createEClass(LIVE_TRACK_DEVICE_VIEW);
		createEAttribute(liveTrackDeviceViewEClass, LIVE_TRACK_DEVICE_VIEW__TRACK_ID);
		createEAttribute(liveTrackDeviceViewEClass, LIVE_TRACK_DEVICE_VIEW__DEVICE_ID);

		liveReturnDeviceViewEClass = createEClass(LIVE_RETURN_DEVICE_VIEW);
		createEAttribute(liveReturnDeviceViewEClass, LIVE_RETURN_DEVICE_VIEW__TRACK_ID);
		createEAttribute(liveReturnDeviceViewEClass, LIVE_RETURN_DEVICE_VIEW__DEVICE_ID);

		liveMasterDeviceViewEClass = createEClass(LIVE_MASTER_DEVICE_VIEW);
		createEAttribute(liveMasterDeviceViewEClass, LIVE_MASTER_DEVICE_VIEW__DEVICE_ID);

		liveDetailViewEClass = createEClass(LIVE_DETAIL_VIEW);
		createEAttribute(liveDetailViewEClass, LIVE_DETAIL_VIEW__VALUE);

		liveClipInfoEClass = createEClass(LIVE_CLIP_INFO);
		createEAttribute(liveClipInfoEClass, LIVE_CLIP_INFO__TRACK_ID);
		createEAttribute(liveClipInfoEClass, LIVE_CLIP_INFO__STATUS);
		createEAttribute(liveClipInfoEClass, LIVE_CLIP_INFO__CLIP_ID);

		liveDevicelistEClass = createEClass(LIVE_DEVICELIST);
		createEAttribute(liveDevicelistEClass, LIVE_DEVICELIST__TRACK_ID);

		liveDeviceEClass = createEClass(LIVE_DEVICE);
		createEAttribute(liveDeviceEClass, LIVE_DEVICE__TRACK_ID);
		createEAttribute(liveDeviceEClass, LIVE_DEVICE__DEVICE_ID);
		createEAttribute(liveDeviceEClass, LIVE_DEVICE__PARAM);
		createEAttribute(liveDeviceEClass, LIVE_DEVICE__S);

		liveReturnDevicelistEClass = createEClass(LIVE_RETURN_DEVICELIST);
		createEAttribute(liveReturnDevicelistEClass, LIVE_RETURN_DEVICELIST__TRACK_ID);

		liveReturnVolumeEClass = createEClass(LIVE_RETURN_VOLUME);
		createEAttribute(liveReturnVolumeEClass, LIVE_RETURN_VOLUME__TRACK_ID);
		createEAttribute(liveReturnVolumeEClass, LIVE_RETURN_VOLUME__LEVEL);

		liveReturnPanEClass = createEClass(LIVE_RETURN_PAN);
		createEAttribute(liveReturnPanEClass, LIVE_RETURN_PAN__TRACK_ID);
		createEAttribute(liveReturnPanEClass, LIVE_RETURN_PAN__PAN);

		liveReturnSendEClass = createEClass(LIVE_RETURN_SEND);
		createEAttribute(liveReturnSendEClass, LIVE_RETURN_SEND__TRACK_ID);
		createEAttribute(liveReturnSendEClass, LIVE_RETURN_SEND__SEND);
		createEAttribute(liveReturnSendEClass, LIVE_RETURN_SEND__LEVEL);

		liveMasterVolumeEClass = createEClass(LIVE_MASTER_VOLUME);
		createEAttribute(liveMasterVolumeEClass, LIVE_MASTER_VOLUME__TRACK_ID);
		createEAttribute(liveMasterVolumeEClass, LIVE_MASTER_VOLUME__LEVEL);

		liveReturnSoloEClass = createEClass(LIVE_RETURN_SOLO);
		createEAttribute(liveReturnSoloEClass, LIVE_RETURN_SOLO__TRACK_ID);
		createEAttribute(liveReturnSoloEClass, LIVE_RETURN_SOLO__STATUS);

		liveDeviceViewEClass = createEClass(LIVE_DEVICE_VIEW);
		createEAttribute(liveDeviceViewEClass, LIVE_DEVICE_VIEW__TRACK_ID);
		createEAttribute(liveDeviceViewEClass, LIVE_DEVICE_VIEW__DEVICE_ID);

		liveMasterMeterEClass = createEClass(LIVE_MASTER_METER);
		createEAttribute(liveMasterMeterEClass, LIVE_MASTER_METER__LEVEL);
		createEAttribute(liveMasterMeterEClass, LIVE_MASTER_METER__WHICH);

		liveClipPositionEClass = createEClass(LIVE_CLIP_POSITION);
		createEAttribute(liveClipPositionEClass, LIVE_CLIP_POSITION__TRACK_ID);
		createEAttribute(liveClipPositionEClass, LIVE_CLIP_POSITION__CLIP_ID);
		createEAttribute(liveClipPositionEClass, LIVE_CLIP_POSITION__POSITION);
		createEAttribute(liveClipPositionEClass, LIVE_CLIP_POSITION__LENGTH);
		createEAttribute(liveClipPositionEClass, LIVE_CLIP_POSITION__LOOP_START);
		createEAttribute(liveClipPositionEClass, LIVE_CLIP_POSITION__LOOP_END);

		liveTrackMeterEClass = createEClass(LIVE_TRACK_METER);
		createEAttribute(liveTrackMeterEClass, LIVE_TRACK_METER__TRACK_ID);
		createEAttribute(liveTrackMeterEClass, LIVE_TRACK_METER__WHICH);
		createEAttribute(liveTrackMeterEClass, LIVE_TRACK_METER__LEVEL);

		liveNameTrackQEClass = createEClass(LIVE_NAME_TRACK_Q);

		liveNameSceneQEClass = createEClass(LIVE_NAME_SCENE_Q);

		liveNameClipQEClass = createEClass(LIVE_NAME_CLIP_Q);

		liveNameSceneReqEClass = createEClass(LIVE_NAME_SCENE_REQ);
		createEAttribute(liveNameSceneReqEClass, LIVE_NAME_SCENE_REQ__SCENE_ID);
		createEAttribute(liveNameSceneReqEClass, LIVE_NAME_SCENE_REQ__SCENE_NAME);

		liveScenesQEClass = createEClass(LIVE_SCENES_Q);
		createEAttribute(liveScenesQEClass, LIVE_SCENES_Q__NUM_SCENES);

		liveTracksQEClass = createEClass(LIVE_TRACKS_Q);
		createEAttribute(liveTracksQEClass, LIVE_TRACKS_Q__NUM_TRACKS);

		livePlayEClass = createEClass(LIVE_PLAY);
		createEAttribute(livePlayEClass, LIVE_PLAY__STATUS);

		liveVolumeEClass = createEClass(LIVE_VOLUME);
		createEAttribute(liveVolumeEClass, LIVE_VOLUME__LEVEL);
		createEAttribute(liveVolumeEClass, LIVE_VOLUME__TRACK_ID);

		liveScene2EClass = createEClass(LIVE_SCENE2);
		createEAttribute(liveScene2EClass, LIVE_SCENE2__SCENE_ID);

		liveReturnMeterEClass = createEClass(LIVE_RETURN_METER);
		createEAttribute(liveReturnMeterEClass, LIVE_RETURN_METER__TRACK_ID);
		createEAttribute(liveReturnMeterEClass, LIVE_RETURN_METER__LEVEL);
		createEAttribute(liveReturnMeterEClass, LIVE_RETURN_METER__WHICH);

		liveDeviceRangeQEClass = createEClass(LIVE_DEVICE_RANGE_Q);
		createEAttribute(liveDeviceRangeQEClass, LIVE_DEVICE_RANGE_Q__TRACK_ID);
		createEAttribute(liveDeviceRangeQEClass, LIVE_DEVICE_RANGE_Q__DEVICE_ID);
		createEAttribute(liveDeviceRangeQEClass, LIVE_DEVICE_RANGE_Q__PARAM);

		liveDeviceRangeEClass = createEClass(LIVE_DEVICE_RANGE);
		createEAttribute(liveDeviceRangeEClass, LIVE_DEVICE_RANGE__TRACK_ID);
		createEAttribute(liveDeviceRangeEClass, LIVE_DEVICE_RANGE__DEVICE_ID);

		liveDeviceRangeAllEClass = createEClass(LIVE_DEVICE_RANGE_ALL);
		createEAttribute(liveDeviceRangeAllEClass, LIVE_DEVICE_RANGE_ALL__TRACK_ID);
		createEAttribute(liveDeviceRangeAllEClass, LIVE_DEVICE_RANGE_ALL__DEVICE_ID);

		liveDeviceRangeAllQEClass = createEClass(LIVE_DEVICE_RANGE_ALL_Q);
		createEAttribute(liveDeviceRangeAllQEClass, LIVE_DEVICE_RANGE_ALL_Q__TRACK_ID);
		createEAttribute(liveDeviceRangeAllQEClass, LIVE_DEVICE_RANGE_ALL_Q__DEVICE_ID);

		liveReturnDeviceRangeEClass = createEClass(LIVE_RETURN_DEVICE_RANGE);
		createEAttribute(liveReturnDeviceRangeEClass, LIVE_RETURN_DEVICE_RANGE__TRACK_ID);
		createEAttribute(liveReturnDeviceRangeEClass, LIVE_RETURN_DEVICE_RANGE__DEVICE_ID);

		liveReturnDeviceRangeQEClass = createEClass(LIVE_RETURN_DEVICE_RANGE_Q);
		createEAttribute(liveReturnDeviceRangeQEClass, LIVE_RETURN_DEVICE_RANGE_Q__TRACK_ID);
		createEAttribute(liveReturnDeviceRangeQEClass, LIVE_RETURN_DEVICE_RANGE_Q__DEVICE_ID);
		createEAttribute(liveReturnDeviceRangeQEClass, LIVE_RETURN_DEVICE_RANGE_Q__PARAM);

		liveReturnDeviceRangeAllEClass = createEClass(LIVE_RETURN_DEVICE_RANGE_ALL);
		createEAttribute(liveReturnDeviceRangeAllEClass, LIVE_RETURN_DEVICE_RANGE_ALL__TRACK_ID);
		createEAttribute(liveReturnDeviceRangeAllEClass, LIVE_RETURN_DEVICE_RANGE_ALL__DEVICE_ID);

		liveReturnDeviceRangeAllQEClass = createEClass(LIVE_RETURN_DEVICE_RANGE_ALL_Q);
		createEAttribute(liveReturnDeviceRangeAllQEClass, LIVE_RETURN_DEVICE_RANGE_ALL_Q__TRACK_ID);
		createEAttribute(liveReturnDeviceRangeAllQEClass, LIVE_RETURN_DEVICE_RANGE_ALL_Q__DEVICE_ID);

		liveDeviceParamEClass = createEClass(LIVE_DEVICE_PARAM);
		createEAttribute(liveDeviceParamEClass, LIVE_DEVICE_PARAM__TRACK_ID);
		createEAttribute(liveDeviceParamEClass, LIVE_DEVICE_PARAM__DEVICE_ID);
		createEAttribute(liveDeviceParamEClass, LIVE_DEVICE_PARAM__PARAM);
		createEAttribute(liveDeviceParamEClass, LIVE_DEVICE_PARAM__VALUE);
		createEAttribute(liveDeviceParamEClass, LIVE_DEVICE_PARAM__TYPE);
		createEAttribute(liveDeviceParamEClass, LIVE_DEVICE_PARAM__NAME);

		liveDeviceParamSetEClass = createEClass(LIVE_DEVICE_PARAM_SET);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__TRACK_ID);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__DEVICE_ID);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__VALUE);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__PINDEX);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__MIN);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__MAX);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__STATUS);
		createEAttribute(liveDeviceParamSetEClass, LIVE_DEVICE_PARAM_SET__TYPE);

		liveTrackVolumeEClass = createEClass(LIVE_TRACK_VOLUME);
		createEAttribute(liveTrackVolumeEClass, LIVE_TRACK_VOLUME__VOLUME);
		createEAttribute(liveTrackVolumeEClass, LIVE_TRACK_VOLUME__TRACK_ID);

		liveTrackPanEClass = createEClass(LIVE_TRACK_PAN);
		createEAttribute(liveTrackPanEClass, LIVE_TRACK_PAN__PAN);
		createEAttribute(liveTrackPanEClass, LIVE_TRACK_PAN__TRACK_ID);

		liveTrackMuteEClass = createEClass(LIVE_TRACK_MUTE);
		createEAttribute(liveTrackMuteEClass, LIVE_TRACK_MUTE__TRACK_ID);
		createEAttribute(liveTrackMuteEClass, LIVE_TRACK_MUTE__STATE);

		liveTrackSoloEClass = createEClass(LIVE_TRACK_SOLO);
		createEAttribute(liveTrackSoloEClass, LIVE_TRACK_SOLO__TRACK_ID);
		createEAttribute(liveTrackSoloEClass, LIVE_TRACK_SOLO__STATE);

		liveTrackNameEClass = createEClass(LIVE_TRACK_NAME);
		createEAttribute(liveTrackNameEClass, LIVE_TRACK_NAME__TRACK_ID);
		createEAttribute(liveTrackNameEClass, LIVE_TRACK_NAME__NAME);

		liveTrackArmEClass = createEClass(LIVE_TRACK_ARM);
		createEAttribute(liveTrackArmEClass, LIVE_TRACK_ARM__TRACK_ID);
		createEAttribute(liveTrackArmEClass, LIVE_TRACK_ARM__STATE);

		liveTrackSendEClass = createEClass(LIVE_TRACK_SEND);
		createEAttribute(liveTrackSendEClass, LIVE_TRACK_SEND__TRACK_ID);
		createEAttribute(liveTrackSendEClass, LIVE_TRACK_SEND__SEND);

		liveTrackPitchEClass = createEClass(LIVE_TRACK_PITCH);
		createEAttribute(liveTrackPitchEClass, LIVE_TRACK_PITCH__TRACK_ID);
		createEAttribute(liveTrackPitchEClass, LIVE_TRACK_PITCH__PITCH);

		// Create enums
		tracK_ARM_STATUSEEnum = createEEnum(TRACK_ARM_STATUS);
		tracK_MUTE_STATUSEEnum = createEEnum(TRACK_MUTE_STATUS);
		tracK_SOLO_STATUSEEnum = createEEnum(TRACK_SOLO_STATUS);
		cliP_STATEEEnum = createEEnum(CLIP_STATE);
		plaY_STATUSEEnum = createEEnum(PLAY_STATUS);
		meteR_INPUTEEnum = createEEnum(METER_INPUT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abletonLiveSndCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscSndCmd());
		liveTempoReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTempoRcvEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTimeReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTimeRcvEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveOverdubEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveStateReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveStateRcvEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveUndoReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveRedoReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNextCueReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePrevCueReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePlayReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePlayContinueReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePlayClipReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePlaySelectionReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePlayClipSlotReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePlaySceneReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveStopReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveStopClipReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveStopTrackReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveScenesReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTracksReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveSceneReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameSceneBlockReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameTrackReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameTrackblockReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameClipReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameClipblockreqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveArmReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveMuteReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveVolumeSetEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePanSetEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveSendReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePitchSetEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnMuteReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnVolumeReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnPanReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnSendReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveMasterVolumeReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveMasterPanReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackJumpEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackInfoEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackDeviceViewEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnDeviceViewEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveMasterDeviceViewEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDetailViewEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveClipInfoEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDevicelistEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnDevicelistEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnVolumeEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnPanEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnSendEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveMasterVolumeEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnSoloEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceViewEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveMasterMeterEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveClipPositionEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackMeterEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameTrackQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameSceneQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameClipQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveNameSceneReqEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveScenesQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTracksQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		livePlayEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveVolumeEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveScene2EClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnMeterEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceRangeQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceRangeEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceRangeAllEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceRangeAllQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnDeviceRangeEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnDeviceRangeQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnDeviceRangeAllEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveReturnDeviceRangeAllQEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceParamEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveDeviceParamSetEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackVolumeEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackPanEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackMuteEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackSoloEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackNameEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackArmEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackSendEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());
		liveTrackPitchEClass.getESuperTypes().add(this.getAbletonLiveSndCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(abletonLiveSndCmdEClass, AbletonLiveSndCmd.class, "AbletonLiveSndCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveTempoReqEClass, LiveTempoReq.class, "LiveTempoReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveTempoRcvEClass, LiveTempoRcv.class, "LiveTempoRcv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTempoRcv_Tempo(), ecorePackage.getEFloat(), "tempo", null, 0, 1, LiveTempoRcv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTimeReqEClass, LiveTimeReq.class, "LiveTimeReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveTimeRcvEClass, LiveTimeRcv.class, "LiveTimeRcv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTimeRcv_Time(), ecorePackage.getEFloat(), "time", null, 0, 1, LiveTimeRcv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveOverdubEClass, LiveOverdub.class, "LiveOverdub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveOverdub_State(), ecorePackage.getEBoolean(), "state", null, 0, 1, LiveOverdub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveStateReqEClass, LiveStateReq.class, "LiveStateReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveStateRcvEClass, LiveStateRcv.class, "LiveStateRcv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveStateRcv_Tempo(), ecorePackage.getEFloat(), "tempo", null, 0, 1, LiveStateRcv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveStateRcv_Overdub(), ecorePackage.getEBoolean(), "overdub", null, 0, 1, LiveStateRcv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveUndoReqEClass, LiveUndoReq.class, "LiveUndoReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveRedoReqEClass, LiveRedoReq.class, "LiveRedoReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveNextCueReqEClass, LiveNextCueReq.class, "LiveNextCueReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livePrevCueReqEClass, LivePrevCueReq.class, "LivePrevCueReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livePlayReqEClass, LivePlayReq.class, "LivePlayReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livePlayContinueReqEClass, LivePlayContinueReq.class, "LivePlayContinueReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livePlayClipReqEClass, LivePlayClipReq.class, "LivePlayClipReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livePlaySelectionReqEClass, livePlaySelectionReq.class, "livePlaySelectionReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(livePlayClipSlotReqEClass, LivePlayClipSlotReq.class, "LivePlayClipSlotReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivePlayClipSlotReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LivePlayClipSlotReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivePlayClipSlotReq_ClipID(), ecorePackage.getEInt(), "clipID", null, 0, 1, LivePlayClipSlotReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livePlaySceneReqEClass, LivePlaySceneReq.class, "LivePlaySceneReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivePlaySceneReq_SceneID(), ecorePackage.getEInt(), "sceneID", null, 0, 1, LivePlaySceneReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveStopReqEClass, LiveStopReq.class, "LiveStopReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveStopClipReqEClass, LiveStopClipReq.class, "LiveStopClipReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveStopClipReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveStopClipReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveStopClipReq_ClipID(), ecorePackage.getEInt(), "clipID", null, 0, 1, LiveStopClipReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveStopTrackReqEClass, LiveStopTrackReq.class, "LiveStopTrackReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveStopTrackReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveStopTrackReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveScenesReqEClass, LiveScenesReq.class, "LiveScenesReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveTracksReqEClass, LiveTracksReq.class, "LiveTracksReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveSceneReqEClass, LiveSceneReq.class, "LiveSceneReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveSceneReq_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, LiveSceneReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveSceneReq_SceneID(), ecorePackage.getEInt(), "sceneID", null, 0, 1, LiveSceneReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveNameSceneBlockReqEClass, LiveNameSceneBlockReq.class, "LiveNameSceneBlockReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveNameSceneBlockReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveNameSceneBlockReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameSceneBlockReq_Size(), ecorePackage.getEInt(), "size", null, 0, 1, LiveNameSceneBlockReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveNameTrackReqEClass, LiveNameTrackReq.class, "LiveNameTrackReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveNameTrackReq_TrackName(), ecorePackage.getEString(), "trackName", null, 0, 1, LiveNameTrackReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameTrackReq_Color(), ecorePackage.getEInt(), "color", null, 0, 1, LiveNameTrackReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameTrackReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveNameTrackReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveNameTrackblockReqEClass, LiveNameTrackblockReq.class, "LiveNameTrackblockReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveNameTrackblockReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveNameTrackblockReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameTrackblockReq_Size(), ecorePackage.getEInt(), "size", null, 0, 1, LiveNameTrackblockReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameTrackblockReq_TrackName(), ecorePackage.getEString(), "trackName", null, 0, -1, LiveNameTrackblockReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveNameClipReqEClass, LiveNameClipReq.class, "LiveNameClipReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveNameClipReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveNameClipReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameClipReq_ClipID(), ecorePackage.getEInt(), "clipID", null, 0, 1, LiveNameClipReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameClipReq_Label(), ecorePackage.getEString(), "label", null, 0, 1, LiveNameClipReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameClipReq_Color(), ecorePackage.getEInt(), "color", null, 0, 1, LiveNameClipReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveNameClipblockreqEClass, LiveNameClipblockreq.class, "LiveNameClipblockreq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveNameClipblockreq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveNameClipblockreq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameClipblockreq_ClipID(), ecorePackage.getEInt(), "clipID", null, 0, 1, LiveNameClipblockreq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameClipblockreq_SizeX(), ecorePackage.getEInt(), "sizeX", null, 0, 1, LiveNameClipblockreq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameClipblockreq_SizeY(), ecorePackage.getEInt(), "sizeY", null, 0, 1, LiveNameClipblockreq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveArmReqEClass, LiveArmReq.class, "LiveArmReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveArmReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveArmReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveArmReq_Status(), this.getTRACK_ARM_STATUS(), "status", null, 0, 1, LiveArmReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveMuteReqEClass, LiveMuteReq.class, "LiveMuteReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveMuteReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveMuteReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveMuteReq_Status(), this.getTRACK_MUTE_STATUS(), "status", null, 0, 1, LiveMuteReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveVolumeSetEClass, LiveVolumeSet.class, "LiveVolumeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveVolumeSet_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveVolumeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveVolumeSet_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveVolumeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livePanSetEClass, LivePanSet.class, "LivePanSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivePanSet_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LivePanSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivePanSet_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, LivePanSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveSendReqEClass, LiveSendReq.class, "LiveSendReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveSendReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveSendReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveSendReq_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LiveSendReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livePitchSetEClass, LivePitchSet.class, "LivePitchSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivePitchSet_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LivePitchSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivePitchSet_Clip(), ecorePackage.getEInt(), "clip", null, 0, 1, LivePitchSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivePitchSet_Coarse(), ecorePackage.getEInt(), "coarse", null, 0, 1, LivePitchSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLivePitchSet_Fine(), ecorePackage.getEInt(), "fine", null, 0, 1, LivePitchSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnMuteReqEClass, LiveReturnMuteReq.class, "LiveReturnMuteReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnMuteReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnMuteReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnMuteReq_Status(), this.getTRACK_MUTE_STATUS(), "status", null, 0, 1, LiveReturnMuteReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnVolumeReqEClass, LiveReturnVolumeReq.class, "LiveReturnVolumeReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnVolumeReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnVolumeReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnVolumeReq_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveReturnVolumeReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnPanReqEClass, LiveReturnPanReq.class, "LiveReturnPanReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnPanReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnPanReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnPanReq_Pan(), ecorePackage.getEFloat(), "pan", null, 0, 1, LiveReturnPanReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnSendReqEClass, LiveReturnSendReq.class, "LiveReturnSendReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnSendReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnSendReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnSendReq_Send(), ecorePackage.getEInt(), "send", null, 0, 1, LiveReturnSendReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnSendReq_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveReturnSendReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveMasterVolumeReqEClass, LiveMasterVolumeReq.class, "LiveMasterVolumeReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveMasterVolumeReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveMasterVolumeReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveMasterVolumeReq_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveMasterVolumeReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveMasterPanReqEClass, LiveMasterPanReq.class, "LiveMasterPanReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveMasterPanReq_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveMasterPanReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveMasterPanReq_Pan(), ecorePackage.getEFloat(), "pan", null, 0, 1, LiveMasterPanReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackJumpEClass, LiveTrackJump.class, "LiveTrackJump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackJump_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackJump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackJump_Beats(), ecorePackage.getEFloat(), "beats", null, 0, 1, LiveTrackJump.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackInfoEClass, LiveTrackInfo.class, "LiveTrackInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackInfo_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackDeviceViewEClass, LiveTrackDeviceView.class, "LiveTrackDeviceView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackDeviceView_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackDeviceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackDeviceView_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveTrackDeviceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnDeviceViewEClass, LiveReturnDeviceView.class, "LiveReturnDeviceView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnDeviceView_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnDeviceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnDeviceView_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveReturnDeviceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveMasterDeviceViewEClass, LiveMasterDeviceView.class, "LiveMasterDeviceView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveMasterDeviceView_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveMasterDeviceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDetailViewEClass, LiveDetailView.class, "LiveDetailView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDetailView_Value(), ecorePackage.getEInt(), "value", null, 0, 1, LiveDetailView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveClipInfoEClass, LiveClipInfo.class, "LiveClipInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveClipInfo_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveClipInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClipInfo_Status(), this.getCLIP_STATE(), "status", null, 0, 1, LiveClipInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClipInfo_ClipID(), ecorePackage.getEInt(), "clipID", null, 0, 1, LiveClipInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDevicelistEClass, LiveDevicelist.class, "LiveDevicelist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDevicelist_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDevicelist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceEClass, LiveDevice.class, "LiveDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDevice_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDevice_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDevice_Param(), ecorePackage.getEInt(), "param", null, 0, 1, LiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDevice_S(), ecorePackage.getEInt(), "s", null, 0, 1, LiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnDevicelistEClass, LiveReturnDevicelist.class, "LiveReturnDevicelist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnDevicelist_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnDevicelist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnVolumeEClass, LiveReturnVolume.class, "LiveReturnVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnVolume_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnVolume_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveReturnVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnPanEClass, LiveReturnPan.class, "LiveReturnPan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnPan_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnPan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnPan_Pan(), ecorePackage.getEFloat(), "pan", null, 0, 1, LiveReturnPan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnSendEClass, LiveReturnSend.class, "LiveReturnSend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnSend_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnSend_Send(), ecorePackage.getEInt(), "send", null, 0, 1, LiveReturnSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnSend_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveReturnSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveMasterVolumeEClass, LiveMasterVolume.class, "LiveMasterVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveMasterVolume_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveMasterVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveMasterVolume_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveMasterVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnSoloEClass, LiveReturnSolo.class, "LiveReturnSolo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnSolo_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnSolo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnSolo_Status(), this.getTRACK_SOLO_STATUS(), "status", null, 0, 1, LiveReturnSolo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceViewEClass, LiveDeviceView.class, "LiveDeviceView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDeviceView_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDeviceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceView_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDeviceView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveMasterMeterEClass, LiveMasterMeter.class, "LiveMasterMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveMasterMeter_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveMasterMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveMasterMeter_Which(), this.getMETER_INPUT(), "which", null, 0, 1, LiveMasterMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveClipPositionEClass, LiveClipPosition.class, "LiveClipPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveClipPosition_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveClipPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClipPosition_ClipID(), ecorePackage.getEInt(), "clipID", null, 0, 1, LiveClipPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClipPosition_Position(), ecorePackage.getEFloat(), "position", null, 0, 1, LiveClipPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClipPosition_Length(), ecorePackage.getEFloat(), "length", null, 0, 1, LiveClipPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClipPosition_LoopStart(), ecorePackage.getEFloat(), "loopStart", null, 0, 1, LiveClipPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClipPosition_LoopEnd(), ecorePackage.getEFloat(), "loopEnd", null, 0, 1, LiveClipPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackMeterEClass, LiveTrackMeter.class, "LiveTrackMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackMeter_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackMeter_Which(), this.getMETER_INPUT(), "which", null, 0, 1, LiveTrackMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackMeter_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveTrackMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveNameTrackQEClass, LiveNameTrackQ.class, "LiveNameTrackQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveNameSceneQEClass, LiveNameSceneQ.class, "LiveNameSceneQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveNameClipQEClass, LiveNameClipQ.class, "LiveNameClipQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveNameSceneReqEClass, LiveNameSceneReq.class, "LiveNameSceneReq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveNameSceneReq_SceneID(), ecorePackage.getEInt(), "sceneID", null, 0, 1, LiveNameSceneReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveNameSceneReq_SceneName(), ecorePackage.getEString(), "sceneName", null, 0, 1, LiveNameSceneReq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveScenesQEClass, LiveScenesQ.class, "LiveScenesQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveScenesQ_NumScenes(), ecorePackage.getEInt(), "numScenes", null, 0, 1, LiveScenesQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTracksQEClass, LiveTracksQ.class, "LiveTracksQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTracksQ_NumTracks(), ecorePackage.getEInt(), "numTracks", null, 0, 1, LiveTracksQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(livePlayEClass, LivePlay.class, "LivePlay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivePlay_Status(), this.getPLAY_STATUS(), "status", null, 0, 1, LivePlay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveVolumeEClass, LiveVolume.class, "LiveVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveVolume_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveVolume_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveScene2EClass, LiveScene2.class, "LiveScene2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveScene2_SceneID(), ecorePackage.getEInt(), "sceneID", null, 0, 1, LiveScene2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnMeterEClass, LiveReturnMeter.class, "LiveReturnMeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnMeter_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnMeter_Level(), ecorePackage.getEFloat(), "level", null, 0, 1, LiveReturnMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnMeter_Which(), this.getMETER_INPUT(), "which", null, 0, 1, LiveReturnMeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceRangeQEClass, LiveDeviceRangeQ.class, "LiveDeviceRangeQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDeviceRangeQ_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDeviceRangeQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceRangeQ_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDeviceRangeQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceRangeQ_Param(), ecorePackage.getEInt(), "param", null, 0, 1, LiveDeviceRangeQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceRangeEClass, LiveDeviceRange.class, "LiveDeviceRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDeviceRange_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDeviceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceRange_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDeviceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceRangeAllEClass, LiveDeviceRangeAll.class, "LiveDeviceRangeAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDeviceRangeAll_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDeviceRangeAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceRangeAll_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDeviceRangeAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceRangeAllQEClass, LiveDeviceRangeAllQ.class, "LiveDeviceRangeAllQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDeviceRangeAllQ_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDeviceRangeAllQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceRangeAllQ_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDeviceRangeAllQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnDeviceRangeEClass, LiveReturnDeviceRange.class, "LiveReturnDeviceRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnDeviceRange_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnDeviceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnDeviceRange_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveReturnDeviceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnDeviceRangeQEClass, LiveReturnDeviceRangeQ.class, "LiveReturnDeviceRangeQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnDeviceRangeQ_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnDeviceRangeQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnDeviceRangeQ_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveReturnDeviceRangeQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnDeviceRangeQ_Param(), ecorePackage.getEInt(), "param", null, 0, 1, LiveReturnDeviceRangeQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnDeviceRangeAllEClass, LiveReturnDeviceRangeAll.class, "LiveReturnDeviceRangeAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnDeviceRangeAll_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnDeviceRangeAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnDeviceRangeAll_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveReturnDeviceRangeAll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveReturnDeviceRangeAllQEClass, LiveReturnDeviceRangeAllQ.class, "LiveReturnDeviceRangeAllQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveReturnDeviceRangeAllQ_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveReturnDeviceRangeAllQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveReturnDeviceRangeAllQ_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveReturnDeviceRangeAllQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceParamEClass, LiveDeviceParam.class, "LiveDeviceParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDeviceParam_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDeviceParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParam_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDeviceParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParam_Param(), ecorePackage.getEInt(), "param", null, 0, 1, LiveDeviceParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParam_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, LiveDeviceParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParam_Type(), ecorePackage.getEString(), "type", null, 0, 1, LiveDeviceParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, LiveDeviceParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveDeviceParamSetEClass, LiveDeviceParamSet.class, "LiveDeviceParamSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveDeviceParamSet_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParamSet_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParamSet_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParamSet_PIndex(), ecorePackage.getEInt(), "pIndex", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParamSet_Min(), ecorePackage.getEFloat(), "min", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParamSet_Max(), ecorePackage.getEFloat(), "max", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParamSet_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveDeviceParamSet_Type(), ecorePackage.getEInt(), "type", null, 0, 1, LiveDeviceParamSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackVolumeEClass, LiveTrackVolume.class, "LiveTrackVolume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackVolume_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, LiveTrackVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackVolume_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackVolume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackPanEClass, LiveTrackPan.class, "LiveTrackPan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackPan_Pan(), ecorePackage.getEFloat(), "pan", null, 0, 1, LiveTrackPan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackPan_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackPan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackMuteEClass, LiveTrackMute.class, "LiveTrackMute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackMute_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackMute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackMute_State(), this.getTRACK_MUTE_STATUS(), "state", null, 0, 1, LiveTrackMute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackSoloEClass, LiveTrackSolo.class, "LiveTrackSolo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackSolo_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackSolo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackSolo_State(), this.getTRACK_SOLO_STATUS(), "state", null, 0, 1, LiveTrackSolo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackNameEClass, LiveTrackName.class, "LiveTrackName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackName_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackName_Name(), ecorePackage.getEString(), "name", null, 0, 1, LiveTrackName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackArmEClass, LiveTrackArm.class, "LiveTrackArm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackArm_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackArm_State(), this.getTRACK_ARM_STATUS(), "state", null, 0, 1, LiveTrackArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackSendEClass, LiveTrackSend.class, "LiveTrackSend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackSend_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackSend_Send(), ecorePackage.getEFloat(), "send", null, 0, 1, LiveTrackSend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackPitchEClass, LiveTrackPitch.class, "LiveTrackPitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrackPitch_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrackPitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrackPitch_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, LiveTrackPitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tracK_ARM_STATUSEEnum, net.sf.smbt.ezableton.TRACK_ARM_STATUS.class, "TRACK_ARM_STATUS");
		addEEnumLiteral(tracK_ARM_STATUSEEnum, net.sf.smbt.ezableton.TRACK_ARM_STATUS.ARMED);
		addEEnumLiteral(tracK_ARM_STATUSEEnum, net.sf.smbt.ezableton.TRACK_ARM_STATUS.DISARMED);

		initEEnum(tracK_MUTE_STATUSEEnum, net.sf.smbt.ezableton.TRACK_MUTE_STATUS.class, "TRACK_MUTE_STATUS");
		addEEnumLiteral(tracK_MUTE_STATUSEEnum, net.sf.smbt.ezableton.TRACK_MUTE_STATUS.MUTE);
		addEEnumLiteral(tracK_MUTE_STATUSEEnum, net.sf.smbt.ezableton.TRACK_MUTE_STATUS.UNMUTE);

		initEEnum(tracK_SOLO_STATUSEEnum, net.sf.smbt.ezableton.TRACK_SOLO_STATUS.class, "TRACK_SOLO_STATUS");
		addEEnumLiteral(tracK_SOLO_STATUSEEnum, net.sf.smbt.ezableton.TRACK_SOLO_STATUS.SOLO);
		addEEnumLiteral(tracK_SOLO_STATUSEEnum, net.sf.smbt.ezableton.TRACK_SOLO_STATUS.UNSOLO);

		initEEnum(cliP_STATEEEnum, net.sf.smbt.ezableton.CLIP_STATE.class, "CLIP_STATE");
		addEEnumLiteral(cliP_STATEEEnum, net.sf.smbt.ezableton.CLIP_STATE.NO_CLIP);
		addEEnumLiteral(cliP_STATEEEnum, net.sf.smbt.ezableton.CLIP_STATE.HAS_CLIP);
		addEEnumLiteral(cliP_STATEEEnum, net.sf.smbt.ezableton.CLIP_STATE.PLAYING);
		addEEnumLiteral(cliP_STATEEEnum, net.sf.smbt.ezableton.CLIP_STATE.TRIGGERED);
		addEEnumLiteral(cliP_STATEEEnum, net.sf.smbt.ezableton.CLIP_STATE.STOP);

		initEEnum(plaY_STATUSEEnum, net.sf.smbt.ezableton.PLAY_STATUS.class, "PLAY_STATUS");
		addEEnumLiteral(plaY_STATUSEEnum, net.sf.smbt.ezableton.PLAY_STATUS.PLAY);
		addEEnumLiteral(plaY_STATUSEEnum, net.sf.smbt.ezableton.PLAY_STATUS.STOP);

		initEEnum(meteR_INPUTEEnum, net.sf.smbt.ezableton.METER_INPUT.class, "METER_INPUT");
		addEEnumLiteral(meteR_INPUTEEnum, net.sf.smbt.ezableton.METER_INPUT.LEFT_METER);
		addEEnumLiteral(meteR_INPUTEEnum, net.sf.smbt.ezableton.METER_INPUT.RIGHT_METER);

		// Create resource
		createResource(eNS_URI);
	}

} //EzabletonPackageImpl