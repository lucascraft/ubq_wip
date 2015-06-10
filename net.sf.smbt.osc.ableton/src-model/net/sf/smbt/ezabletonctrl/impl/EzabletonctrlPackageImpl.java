/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezabletonctrl.AbletonLive;
import net.sf.smbt.ezabletonctrl.AbstractLiveDevice;
import net.sf.smbt.ezabletonctrl.AbstractMixerDevice;
import net.sf.smbt.ezabletonctrl.ButtonComponent;
import net.sf.smbt.ezabletonctrl.ButtonMatrixElement;
import net.sf.smbt.ezabletonctrl.ChannelStripComponent;
import net.sf.smbt.ezabletonctrl.ClipSlotComponent;
import net.sf.smbt.ezabletonctrl.CompressorDevice;
import net.sf.smbt.ezabletonctrl.ControlSurface;
import net.sf.smbt.ezabletonctrl.DeviceComponent;
import net.sf.smbt.ezabletonctrl.EncoderElement;
import net.sf.smbt.ezabletonctrl.EzabletonctrlFactory;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.KitMinimumOperatorDevice;
import net.sf.smbt.ezabletonctrl.LimiterDevice;
import net.sf.smbt.ezabletonctrl.LiveClip;
import net.sf.smbt.ezabletonctrl.LiveEBassSubDevice;
import net.sf.smbt.ezabletonctrl.LiveEQEightDevice;
import net.sf.smbt.ezabletonctrl.LiveMaster;
import net.sf.smbt.ezabletonctrl.LiveParam;
import net.sf.smbt.ezabletonctrl.LiveSamplerDevice;
import net.sf.smbt.ezabletonctrl.LiveScene;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ezabletonctrl.LiveTrackView;
import net.sf.smbt.ezabletonctrl.MidiMap;
import net.sf.smbt.ezabletonctrl.MixerComponent;
import net.sf.smbt.ezabletonctrl.MultibandsDynamicsDevice;
import net.sf.smbt.ezabletonctrl.PhysicalDisplayElement;
import net.sf.smbt.ezabletonctrl.PlaceHolderDevice;
import net.sf.smbt.ezabletonctrl.RingedEcoderElement;
import net.sf.smbt.ezabletonctrl.SaturatorDevice;
import net.sf.smbt.ezabletonctrl.SessionComponent;
import net.sf.smbt.ezabletonctrl.SliderElement;
import net.sf.smbt.ezabletonctrl.TransportComponent;
import net.sf.smbt.ezabletonctrl.VintageMastering2Device;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzabletonctrlPackageImpl extends EPackageImpl implements EzabletonctrlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abletonLiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveMasterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveClipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLiveDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeHolderDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMixerDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liveTrackViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlSurfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clipSlotComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelStripComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixerComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonMatrixElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliderElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encoderElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringedEcoderElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalDisplayElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum masteR_CTRLEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tracK_CONTROLEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum abletoN_OSC_MAPPINGEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

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
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzabletonctrlPackageImpl() {
		super(eNS_URI, EzabletonctrlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzabletonctrlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzabletonctrlPackage init() {
		if (isInited) return (EzabletonctrlPackage)EPackage.Registry.INSTANCE.getEPackage(EzabletonctrlPackage.eNS_URI);

		// Obtain or create and register package
		EzabletonctrlPackageImpl theEzabletonctrlPackage = (EzabletonctrlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzabletonctrlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzabletonctrlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzabletonPackage.eINSTANCE.eClass();
		EnginePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzabletonctrlPackage.createPackageContents();

		// Initialize created meta-data
		theEzabletonctrlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzabletonctrlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzabletonctrlPackage.eNS_URI, theEzabletonctrlPackage);
		return theEzabletonctrlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbletonLive() {
		return abletonLiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbletonLive_Ver() {
		return (EAttribute)abletonLiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbletonLive_Tracks() {
		return (EReference)abletonLiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbletonLive_Scenes() {
		return (EReference)abletonLiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbletonLive_Clips() {
		return (EReference)abletonLiveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbletonLive_CurrentScene() {
		return (EReference)abletonLiveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbletonLive_MasterTrack() {
		return (EReference)abletonLiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbletonLive_State() {
		return (EAttribute)abletonLiveEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbletonLive_Overdub() {
		return (EAttribute)abletonLiveEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbletonLive_Volume() {
		return (EAttribute)abletonLiveEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbletonLive_Time() {
		return (EAttribute)abletonLiveEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbletonLive_Tempo() {
		return (EAttribute)abletonLiveEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbletonLive_UbqtNotificationOn() {
		return (EAttribute)abletonLiveEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbletonLive_ControlSurfaces() {
		return (EReference)abletonLiveEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrack() {
		return liveTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_TrackID() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Volume() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Pan() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Solo() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Send() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Arm() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Mute() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Delay() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Coarse() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Fine() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Beats() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiveTrack_Devices() {
		return (EReference)liveTrackEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_State() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiveTrack_Clips() {
		return (EReference)liveTrackEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_TrackName() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_Color() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_LeftMeter() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_RightMeter() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveTrack_LastSeen() {
		return (EAttribute)liveTrackEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiveTrack_View() {
		return (EReference)liveTrackEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveScene() {
		return liveSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveScene_SceneID() {
		return (EAttribute)liveSceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveScene_Mode() {
		return (EAttribute)liveSceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveScene_SceneName() {
		return (EAttribute)liveSceneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveScene_LastSeen() {
		return (EAttribute)liveSceneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveMaster() {
		return liveMasterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiveMaster_MasterDevices() {
		return (EReference)liveMasterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveClip() {
		return liveClipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_ClipID() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_ClipName() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_ClipState() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_SizeX() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_SizeY() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Coarse() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Fine() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Position() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Length() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_LoopStart() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_LoopEnd() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiveClip_Track() {
		return (EReference)liveClipEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_LastSeen() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_IsAudioClip() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_IsMidiClip() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_IsTriggered() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_PlayingStatus() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Notes() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Signature_denominator() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Signature_numerator() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Warping() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Will_recording_on_start() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveClip_Color() {
		return (EAttribute)liveClipEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractLiveDevice() {
		return abstractLiveDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLiveDevice_DeviceName() {
		return (EAttribute)abstractLiveDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLiveDevice_DeviceID() {
		return (EAttribute)abstractLiveDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractLiveDevice_LastSeen() {
		return (EAttribute)abstractLiveDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractLiveDevice_Parameters() {
		return (EReference)abstractLiveDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceHolderDevice() {
		return placeHolderDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveParam() {
		return liveParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveParam_Key() {
		return (EAttribute)liveParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveParam_Value() {
		return (EAttribute)liveParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveParam_Min() {
		return (EAttribute)liveParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveParam_Max() {
		return (EAttribute)liveParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveParam_Type() {
		return (EAttribute)liveParamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiveParam_Name() {
		return (EAttribute)liveParamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMixerDevice() {
		return abstractMixerDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMixerDevice_Volume() {
		return (EReference)abstractMixerDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMixerDevice_Panning() {
		return (EReference)abstractMixerDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMixerDevice_Sends() {
		return (EReference)abstractMixerDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiveTrackView() {
		return liveTrackViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiveTrackView_Device() {
		return (EReference)liveTrackViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlSurface() {
		return controlSurfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportComponent() {
		return transportComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionComponent() {
		return sessionComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClipSlotComponent() {
		return clipSlotComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelStripComponent() {
		return channelStripComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMixerComponent() {
		return mixerComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceComponent() {
		return deviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonComponent() {
		return buttonComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonMatrixElement() {
		return buttonMatrixElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSliderElement() {
		return sliderElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncoderElement() {
		return encoderElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingedEcoderElement() {
		return ringedEcoderElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalDisplayElement() {
		return physicalDisplayElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiMap() {
		return midiMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMASTER_CTRL() {
		return masteR_CTRLEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTRACK_CONTROL() {
		return tracK_CONTROLEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getABLETON_OSC_MAPPING() {
		return abletoN_OSC_MAPPINGEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonctrlFactory getEzabletonctrlFactory() {
		return (EzabletonctrlFactory)getEFactoryInstance();
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
		abletonLiveEClass = createEClass(ABLETON_LIVE);
		createEAttribute(abletonLiveEClass, ABLETON_LIVE__VER);
		createEReference(abletonLiveEClass, ABLETON_LIVE__MASTER_TRACK);
		createEReference(abletonLiveEClass, ABLETON_LIVE__TRACKS);
		createEReference(abletonLiveEClass, ABLETON_LIVE__SCENES);
		createEReference(abletonLiveEClass, ABLETON_LIVE__CLIPS);
		createEReference(abletonLiveEClass, ABLETON_LIVE__CURRENT_SCENE);
		createEAttribute(abletonLiveEClass, ABLETON_LIVE__STATE);
		createEAttribute(abletonLiveEClass, ABLETON_LIVE__OVERDUB);
		createEAttribute(abletonLiveEClass, ABLETON_LIVE__VOLUME);
		createEAttribute(abletonLiveEClass, ABLETON_LIVE__TIME);
		createEAttribute(abletonLiveEClass, ABLETON_LIVE__TEMPO);
		createEAttribute(abletonLiveEClass, ABLETON_LIVE__UBQT_NOTIFICATION_ON);
		createEReference(abletonLiveEClass, ABLETON_LIVE__CONTROL_SURFACES);

		liveTrackEClass = createEClass(LIVE_TRACK);
		createEAttribute(liveTrackEClass, LIVE_TRACK__TRACK_ID);
		createEAttribute(liveTrackEClass, LIVE_TRACK__VOLUME);
		createEAttribute(liveTrackEClass, LIVE_TRACK__PAN);
		createEAttribute(liveTrackEClass, LIVE_TRACK__SOLO);
		createEAttribute(liveTrackEClass, LIVE_TRACK__SEND);
		createEAttribute(liveTrackEClass, LIVE_TRACK__ARM);
		createEAttribute(liveTrackEClass, LIVE_TRACK__MUTE);
		createEAttribute(liveTrackEClass, LIVE_TRACK__DELAY);
		createEAttribute(liveTrackEClass, LIVE_TRACK__COARSE);
		createEAttribute(liveTrackEClass, LIVE_TRACK__FINE);
		createEAttribute(liveTrackEClass, LIVE_TRACK__BEATS);
		createEReference(liveTrackEClass, LIVE_TRACK__DEVICES);
		createEAttribute(liveTrackEClass, LIVE_TRACK__STATE);
		createEReference(liveTrackEClass, LIVE_TRACK__CLIPS);
		createEAttribute(liveTrackEClass, LIVE_TRACK__TRACK_NAME);
		createEAttribute(liveTrackEClass, LIVE_TRACK__COLOR);
		createEAttribute(liveTrackEClass, LIVE_TRACK__LEFT_METER);
		createEAttribute(liveTrackEClass, LIVE_TRACK__RIGHT_METER);
		createEAttribute(liveTrackEClass, LIVE_TRACK__LAST_SEEN);
		createEReference(liveTrackEClass, LIVE_TRACK__VIEW);

		liveSceneEClass = createEClass(LIVE_SCENE);
		createEAttribute(liveSceneEClass, LIVE_SCENE__SCENE_ID);
		createEAttribute(liveSceneEClass, LIVE_SCENE__MODE);
		createEAttribute(liveSceneEClass, LIVE_SCENE__SCENE_NAME);
		createEAttribute(liveSceneEClass, LIVE_SCENE__LAST_SEEN);

		liveMasterEClass = createEClass(LIVE_MASTER);
		createEReference(liveMasterEClass, LIVE_MASTER__MASTER_DEVICES);

		liveClipEClass = createEClass(LIVE_CLIP);
		createEAttribute(liveClipEClass, LIVE_CLIP__CLIP_ID);
		createEAttribute(liveClipEClass, LIVE_CLIP__CLIP_NAME);
		createEAttribute(liveClipEClass, LIVE_CLIP__CLIP_STATE);
		createEAttribute(liveClipEClass, LIVE_CLIP__SIZE_X);
		createEAttribute(liveClipEClass, LIVE_CLIP__SIZE_Y);
		createEAttribute(liveClipEClass, LIVE_CLIP__COARSE);
		createEAttribute(liveClipEClass, LIVE_CLIP__FINE);
		createEAttribute(liveClipEClass, LIVE_CLIP__POSITION);
		createEAttribute(liveClipEClass, LIVE_CLIP__LENGTH);
		createEAttribute(liveClipEClass, LIVE_CLIP__LOOP_START);
		createEAttribute(liveClipEClass, LIVE_CLIP__LOOP_END);
		createEReference(liveClipEClass, LIVE_CLIP__TRACK);
		createEAttribute(liveClipEClass, LIVE_CLIP__LAST_SEEN);
		createEAttribute(liveClipEClass, LIVE_CLIP__IS_AUDIO_CLIP);
		createEAttribute(liveClipEClass, LIVE_CLIP__IS_MIDI_CLIP);
		createEAttribute(liveClipEClass, LIVE_CLIP__IS_TRIGGERED);
		createEAttribute(liveClipEClass, LIVE_CLIP__PLAYING_STATUS);
		createEAttribute(liveClipEClass, LIVE_CLIP__NOTES);
		createEAttribute(liveClipEClass, LIVE_CLIP__SIGNATURE_DENOMINATOR);
		createEAttribute(liveClipEClass, LIVE_CLIP__SIGNATURE_NUMERATOR);
		createEAttribute(liveClipEClass, LIVE_CLIP__WARPING);
		createEAttribute(liveClipEClass, LIVE_CLIP__WILL_RECORDING_ON_START);
		createEAttribute(liveClipEClass, LIVE_CLIP__COLOR);

		abstractLiveDeviceEClass = createEClass(ABSTRACT_LIVE_DEVICE);
		createEAttribute(abstractLiveDeviceEClass, ABSTRACT_LIVE_DEVICE__DEVICE_NAME);
		createEAttribute(abstractLiveDeviceEClass, ABSTRACT_LIVE_DEVICE__DEVICE_ID);
		createEAttribute(abstractLiveDeviceEClass, ABSTRACT_LIVE_DEVICE__LAST_SEEN);
		createEReference(abstractLiveDeviceEClass, ABSTRACT_LIVE_DEVICE__PARAMETERS);

		placeHolderDeviceEClass = createEClass(PLACE_HOLDER_DEVICE);

		liveParamEClass = createEClass(LIVE_PARAM);
		createEAttribute(liveParamEClass, LIVE_PARAM__KEY);
		createEAttribute(liveParamEClass, LIVE_PARAM__VALUE);
		createEAttribute(liveParamEClass, LIVE_PARAM__MIN);
		createEAttribute(liveParamEClass, LIVE_PARAM__MAX);
		createEAttribute(liveParamEClass, LIVE_PARAM__TYPE);
		createEAttribute(liveParamEClass, LIVE_PARAM__NAME);

		abstractMixerDeviceEClass = createEClass(ABSTRACT_MIXER_DEVICE);
		createEReference(abstractMixerDeviceEClass, ABSTRACT_MIXER_DEVICE__VOLUME);
		createEReference(abstractMixerDeviceEClass, ABSTRACT_MIXER_DEVICE__PANNING);
		createEReference(abstractMixerDeviceEClass, ABSTRACT_MIXER_DEVICE__SENDS);

		liveTrackViewEClass = createEClass(LIVE_TRACK_VIEW);
		createEReference(liveTrackViewEClass, LIVE_TRACK_VIEW__DEVICE);

		controlSurfaceEClass = createEClass(CONTROL_SURFACE);

		transportComponentEClass = createEClass(TRANSPORT_COMPONENT);

		sessionComponentEClass = createEClass(SESSION_COMPONENT);

		clipSlotComponentEClass = createEClass(CLIP_SLOT_COMPONENT);

		channelStripComponentEClass = createEClass(CHANNEL_STRIP_COMPONENT);

		mixerComponentEClass = createEClass(MIXER_COMPONENT);

		deviceComponentEClass = createEClass(DEVICE_COMPONENT);

		buttonComponentEClass = createEClass(BUTTON_COMPONENT);

		buttonMatrixElementEClass = createEClass(BUTTON_MATRIX_ELEMENT);

		sliderElementEClass = createEClass(SLIDER_ELEMENT);

		encoderElementEClass = createEClass(ENCODER_ELEMENT);

		ringedEcoderElementEClass = createEClass(RINGED_ECODER_ELEMENT);

		physicalDisplayElementEClass = createEClass(PHYSICAL_DISPLAY_ELEMENT);

		midiMapEClass = createEClass(MIDI_MAP);

		// Create enums
		masteR_CTRLEEnum = createEEnum(MASTER_CTRL);
		tracK_CONTROLEEnum = createEEnum(TRACK_CONTROL);
		abletoN_OSC_MAPPINGEEnum = createEEnum(ABLETON_OSC_MAPPING);

		// Create data types
		colorEDataType = createEDataType(COLOR);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EzabletonPackage theEzabletonPackage = (EzabletonPackage)EPackage.Registry.INSTANCE.getEPackage(EzabletonPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abletonLiveEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());
		liveMasterEClass.getESuperTypes().add(this.getLiveTrack());
		placeHolderDeviceEClass.getESuperTypes().add(this.getAbstractLiveDevice());
		transportComponentEClass.getESuperTypes().add(this.getControlSurface());
		sessionComponentEClass.getESuperTypes().add(this.getControlSurface());
		clipSlotComponentEClass.getESuperTypes().add(this.getControlSurface());
		channelStripComponentEClass.getESuperTypes().add(this.getControlSurface());
		mixerComponentEClass.getESuperTypes().add(this.getControlSurface());
		deviceComponentEClass.getESuperTypes().add(this.getControlSurface());
		buttonComponentEClass.getESuperTypes().add(this.getControlSurface());
		buttonMatrixElementEClass.getESuperTypes().add(this.getControlSurface());
		sliderElementEClass.getESuperTypes().add(this.getControlSurface());
		encoderElementEClass.getESuperTypes().add(this.getControlSurface());
		ringedEcoderElementEClass.getESuperTypes().add(this.getControlSurface());
		physicalDisplayElementEClass.getESuperTypes().add(this.getControlSurface());

		// Initialize classes and features; add operations and parameters
		initEClass(abletonLiveEClass, AbletonLive.class, "AbletonLive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbletonLive_Ver(), ecorePackage.getEString(), "ver", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbletonLive_MasterTrack(), this.getLiveMaster(), null, "masterTrack", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbletonLive_Tracks(), this.getLiveTrack(), null, "tracks", null, 0, -1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbletonLive_Scenes(), this.getLiveScene(), null, "scenes", null, 0, -1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbletonLive_Clips(), this.getLiveClip(), null, "clips", null, 0, -1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbletonLive_CurrentScene(), this.getLiveScene(), null, "currentScene", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbletonLive_State(), this.getMASTER_CTRL(), "state", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbletonLive_Overdub(), ecorePackage.getEBoolean(), "overdub", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbletonLive_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbletonLive_Time(), ecorePackage.getELong(), "time", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbletonLive_Tempo(), ecorePackage.getEFloat(), "tempo", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbletonLive_UbqtNotificationOn(), ecorePackage.getEBoolean(), "ubqtNotificationOn", null, 0, 1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbletonLive_ControlSurfaces(), this.getControlSurface(), null, "controlSurfaces", null, 0, -1, AbletonLive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackEClass, LiveTrack.class, "LiveTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveTrack_TrackID(), ecorePackage.getEInt(), "trackID", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Pan(), ecorePackage.getEFloat(), "pan", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Solo(), theEzabletonPackage.getTRACK_SOLO_STATUS(), "solo", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Send(), ecorePackage.getEInt(), "send", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Arm(), theEzabletonPackage.getTRACK_ARM_STATUS(), "arm", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Mute(), theEzabletonPackage.getTRACK_MUTE_STATUS(), "mute", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Delay(), ecorePackage.getEFloat(), "delay", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Coarse(), ecorePackage.getEInt(), "coarse", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Fine(), ecorePackage.getEInt(), "fine", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Beats(), ecorePackage.getEFloat(), "beats", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiveTrack_Devices(), this.getAbstractLiveDevice(), null, "devices", null, 0, -1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_State(), this.getTRACK_CONTROL(), "state", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiveTrack_Clips(), this.getLiveClip(), null, "clips", null, 0, -1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_TrackName(), ecorePackage.getEString(), "trackName", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_Color(), ecorePackage.getEInt(), "color", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_LeftMeter(), ecorePackage.getEFloat(), "leftMeter", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_RightMeter(), ecorePackage.getEFloat(), "rightMeter", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveTrack_LastSeen(), ecorePackage.getELong(), "lastSeen", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiveTrack_View(), this.getLiveTrackView(), null, "view", null, 0, 1, LiveTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveSceneEClass, LiveScene.class, "LiveScene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveScene_SceneID(), ecorePackage.getEInt(), "sceneID", null, 0, 1, LiveScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveScene_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, LiveScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveScene_SceneName(), ecorePackage.getEString(), "sceneName", null, 0, 1, LiveScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveScene_LastSeen(), ecorePackage.getELong(), "lastSeen", null, 0, 1, LiveScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveMasterEClass, LiveMaster.class, "LiveMaster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiveMaster_MasterDevices(), this.getAbstractLiveDevice(), null, "masterDevices", null, 0, -1, LiveMaster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveClipEClass, LiveClip.class, "LiveClip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveClip_ClipID(), ecorePackage.getEInt(), "clipID", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_ClipName(), ecorePackage.getEString(), "clipName", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_ClipState(), theEzabletonPackage.getCLIP_STATE(), "clipState", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_SizeX(), ecorePackage.getEInt(), "sizeX", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_SizeY(), ecorePackage.getEInt(), "sizeY", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Coarse(), ecorePackage.getEInt(), "coarse", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Fine(), ecorePackage.getEInt(), "fine", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Position(), ecorePackage.getEFloat(), "position", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Length(), ecorePackage.getEFloat(), "length", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_LoopStart(), ecorePackage.getEFloat(), "loopStart", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_LoopEnd(), ecorePackage.getEFloat(), "loopEnd", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLiveClip_Track(), this.getLiveTrack(), null, "track", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_LastSeen(), ecorePackage.getELong(), "lastSeen", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_IsAudioClip(), theEcorePackage.getEBoolean(), "isAudioClip", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_IsMidiClip(), theEcorePackage.getEBoolean(), "isMidiClip", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_IsTriggered(), theEcorePackage.getEBoolean(), "isTriggered", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_PlayingStatus(), this.getMASTER_CTRL(), "playingStatus", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Notes(), theEcorePackage.getEBoolean(), "notes", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Signature_denominator(), theEcorePackage.getEInt(), "signature_denominator", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Signature_numerator(), theEcorePackage.getEInt(), "signature_numerator", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Warping(), theEcorePackage.getEBoolean(), "warping", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Will_recording_on_start(), theEcorePackage.getEBoolean(), "will_recording_on_start", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveClip_Color(), this.getColor(), "color", null, 0, 1, LiveClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractLiveDeviceEClass, AbstractLiveDevice.class, "AbstractLiveDevice", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractLiveDevice_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, AbstractLiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractLiveDevice_DeviceID(), ecorePackage.getEInt(), "deviceID", null, 0, 1, AbstractLiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractLiveDevice_LastSeen(), ecorePackage.getELong(), "lastSeen", null, 0, 1, AbstractLiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractLiveDevice_Parameters(), this.getLiveParam(), null, "parameters", null, 0, -1, AbstractLiveDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeHolderDeviceEClass, PlaceHolderDevice.class, "PlaceHolderDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(liveParamEClass, LiveParam.class, "LiveParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiveParam_Key(), theEcorePackage.getEString(), "key", null, 0, 1, LiveParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveParam_Value(), theEcorePackage.getEString(), "value", null, 0, 1, LiveParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveParam_Min(), theEcorePackage.getEString(), "min", null, 0, 1, LiveParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveParam_Max(), theEcorePackage.getEString(), "max", null, 0, 1, LiveParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveParam_Type(), theEcorePackage.getEString(), "type", null, 0, 1, LiveParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiveParam_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LiveParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMixerDeviceEClass, AbstractMixerDevice.class, "AbstractMixerDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMixerDevice_Volume(), this.getLiveParam(), null, "volume", null, 0, 1, AbstractMixerDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMixerDevice_Panning(), this.getLiveParam(), null, "panning", null, 0, 1, AbstractMixerDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMixerDevice_Sends(), this.getLiveParam(), null, "sends", null, 0, -1, AbstractMixerDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liveTrackViewEClass, LiveTrackView.class, "LiveTrackView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiveTrackView_Device(), this.getAbstractLiveDevice(), null, "device", null, 0, 1, LiveTrackView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlSurfaceEClass, ControlSurface.class, "ControlSurface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transportComponentEClass, TransportComponent.class, "TransportComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sessionComponentEClass, SessionComponent.class, "SessionComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clipSlotComponentEClass, ClipSlotComponent.class, "ClipSlotComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(channelStripComponentEClass, ChannelStripComponent.class, "ChannelStripComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mixerComponentEClass, MixerComponent.class, "MixerComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceComponentEClass, DeviceComponent.class, "DeviceComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonComponentEClass, ButtonComponent.class, "ButtonComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonMatrixElementEClass, ButtonMatrixElement.class, "ButtonMatrixElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sliderElementEClass, SliderElement.class, "SliderElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(encoderElementEClass, EncoderElement.class, "EncoderElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ringedEcoderElementEClass, RingedEcoderElement.class, "RingedEcoderElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalDisplayElementEClass, PhysicalDisplayElement.class, "PhysicalDisplayElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiMapEClass, MidiMap.class, "MidiMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.class, "MASTER_CTRL");
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.PLAY);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.PAUSE);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.STOP);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.RECORD);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.PREC);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.NEXT);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.CONTINUE);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.UNDO);
		addEEnumLiteral(masteR_CTRLEEnum, net.sf.smbt.ezabletonctrl.MASTER_CTRL.REDO);

		initEEnum(tracK_CONTROLEEnum, net.sf.smbt.ezabletonctrl.TRACK_CONTROL.class, "TRACK_CONTROL");
		addEEnumLiteral(tracK_CONTROLEEnum, net.sf.smbt.ezabletonctrl.TRACK_CONTROL.PLAY);
		addEEnumLiteral(tracK_CONTROLEEnum, net.sf.smbt.ezabletonctrl.TRACK_CONTROL.STOP);

		initEEnum(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.class, "ABLETON_OSC_MAPPING");
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.MASTER_PAN);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.MASTER_VOLUME);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.TEMPO);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.TIME);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.OVERDUB);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.STATE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.UNDO);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.REDO);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.NEXT_CUE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PREV_CUE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PLAY);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PLAY_CONTINUE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PLAY_SELECTION);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PLAY_CLIP);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PLAY_CLIPSLOT);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PLAY_SCENE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.STOP);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.STOP_CLIP);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.STOP_TRACK);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.SCENES);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.TRACKS);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.SCENE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.NAME_SCENE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.NAME_SCENEBLOCK);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.NAME_TRACK);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.NAME_TRACKBLOCK);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.NAME_CLIP);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.NAME_CLIPBLOCK);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.ARM);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.MUTE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.SOLO);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.VOLUME);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PAN);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.SEND);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.PITCH);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.RETURN_MUTE);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.RETURN_SOLO);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.RETURN_VOLUME);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.RETURN_PAN);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.RETURN_SEND);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.TRACK_JUMP);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.TRACK_INFO);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.TRACK_VIEW);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.RETURN_VIEW);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.MASTER_VIEW);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.TRACK_DEVICE_VIEW);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.RETURN_DEVICE_VIEW);
		addEEnumLiteral(abletoN_OSC_MAPPINGEEnum, net.sf.smbt.ezabletonctrl.ABLETON_OSC_MAPPING.MASTER_DEVICE_VIEW);

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzabletonctrlPackageImpl
