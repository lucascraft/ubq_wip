/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezabletonctrl.*;
import net.sf.smbt.ezabletonctrl.AbletonLive;
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
import net.sf.smbt.ezabletonctrl.MASTER_CTRL;
import net.sf.smbt.ezabletonctrl.MidiMap;
import net.sf.smbt.ezabletonctrl.MixerComponent;
import net.sf.smbt.ezabletonctrl.MultibandsDynamicsDevice;
import net.sf.smbt.ezabletonctrl.PhysicalDisplayElement;
import net.sf.smbt.ezabletonctrl.PlaceHolderDevice;
import net.sf.smbt.ezabletonctrl.RingedEcoderElement;
import net.sf.smbt.ezabletonctrl.SaturatorDevice;
import net.sf.smbt.ezabletonctrl.SessionComponent;
import net.sf.smbt.ezabletonctrl.SliderElement;
import net.sf.smbt.ezabletonctrl.TRACK_CONTROL;
import net.sf.smbt.ezabletonctrl.TransportComponent;
import net.sf.smbt.ezabletonctrl.VintageMastering2Device;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzabletonctrlFactoryImpl extends EFactoryImpl implements EzabletonctrlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzabletonctrlFactory init() {
		try {
			EzabletonctrlFactory theEzabletonctrlFactory = (EzabletonctrlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/osc/ableton/ezabletonctrl/1.0.0"); 
			if (theEzabletonctrlFactory != null) {
				return theEzabletonctrlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzabletonctrlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonctrlFactoryImpl() {
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
			case EzabletonctrlPackage.ABLETON_LIVE: return createAbletonLive();
			case EzabletonctrlPackage.LIVE_TRACK: return createLiveTrack();
			case EzabletonctrlPackage.LIVE_SCENE: return createLiveScene();
			case EzabletonctrlPackage.LIVE_MASTER: return createLiveMaster();
			case EzabletonctrlPackage.LIVE_CLIP: return createLiveClip();
			case EzabletonctrlPackage.PLACE_HOLDER_DEVICE: return createPlaceHolderDevice();
			case EzabletonctrlPackage.LIVE_PARAM: return createLiveParam();
			case EzabletonctrlPackage.ABSTRACT_MIXER_DEVICE: return createAbstractMixerDevice();
			case EzabletonctrlPackage.LIVE_TRACK_VIEW: return createLiveTrackView();
			case EzabletonctrlPackage.CONTROL_SURFACE: return createControlSurface();
			case EzabletonctrlPackage.TRANSPORT_COMPONENT: return createTransportComponent();
			case EzabletonctrlPackage.SESSION_COMPONENT: return createSessionComponent();
			case EzabletonctrlPackage.CLIP_SLOT_COMPONENT: return createClipSlotComponent();
			case EzabletonctrlPackage.CHANNEL_STRIP_COMPONENT: return createChannelStripComponent();
			case EzabletonctrlPackage.MIXER_COMPONENT: return createMixerComponent();
			case EzabletonctrlPackage.DEVICE_COMPONENT: return createDeviceComponent();
			case EzabletonctrlPackage.BUTTON_COMPONENT: return createButtonComponent();
			case EzabletonctrlPackage.BUTTON_MATRIX_ELEMENT: return createButtonMatrixElement();
			case EzabletonctrlPackage.SLIDER_ELEMENT: return createSliderElement();
			case EzabletonctrlPackage.ENCODER_ELEMENT: return createEncoderElement();
			case EzabletonctrlPackage.RINGED_ECODER_ELEMENT: return createRingedEcoderElement();
			case EzabletonctrlPackage.PHYSICAL_DISPLAY_ELEMENT: return createPhysicalDisplayElement();
			case EzabletonctrlPackage.MIDI_MAP: return createMidiMap();
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
			case EzabletonctrlPackage.MASTER_CTRL:
				return createMASTER_CTRLFromString(eDataType, initialValue);
			case EzabletonctrlPackage.TRACK_CONTROL:
				return createTRACK_CONTROLFromString(eDataType, initialValue);
			case EzabletonctrlPackage.ABLETON_OSC_MAPPING:
				return createABLETON_OSC_MAPPINGFromString(eDataType, initialValue);
			case EzabletonctrlPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
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
			case EzabletonctrlPackage.MASTER_CTRL:
				return convertMASTER_CTRLToString(eDataType, instanceValue);
			case EzabletonctrlPackage.TRACK_CONTROL:
				return convertTRACK_CONTROLToString(eDataType, instanceValue);
			case EzabletonctrlPackage.ABLETON_OSC_MAPPING:
				return convertABLETON_OSC_MAPPINGToString(eDataType, instanceValue);
			case EzabletonctrlPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbletonLive createAbletonLive() {
		AbletonLiveImpl abletonLive = new AbletonLiveImpl();
		return abletonLive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrack createLiveTrack() {
		LiveTrackImpl liveTrack = new LiveTrackImpl();
		return liveTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveScene createLiveScene() {
		LiveSceneImpl liveScene = new LiveSceneImpl();
		return liveScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMaster createLiveMaster() {
		LiveMasterImpl liveMaster = new LiveMasterImpl();
		return liveMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveClip createLiveClip() {
		LiveClipImpl liveClip = new LiveClipImpl();
		return liveClip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceHolderDevice createPlaceHolderDevice() {
		PlaceHolderDeviceImpl placeHolderDevice = new PlaceHolderDeviceImpl();
		return placeHolderDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveParam createLiveParam() {
		LiveParamImpl liveParam = new LiveParamImpl();
		return liveParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMixerDevice createAbstractMixerDevice() {
		AbstractMixerDeviceImpl abstractMixerDevice = new AbstractMixerDeviceImpl();
		return abstractMixerDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackView createLiveTrackView() {
		LiveTrackViewImpl liveTrackView = new LiveTrackViewImpl();
		return liveTrackView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlSurface createControlSurface() {
		ControlSurfaceImpl controlSurface = new ControlSurfaceImpl();
		return controlSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportComponent createTransportComponent() {
		TransportComponentImpl transportComponent = new TransportComponentImpl();
		return transportComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionComponent createSessionComponent() {
		SessionComponentImpl sessionComponent = new SessionComponentImpl();
		return sessionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClipSlotComponent createClipSlotComponent() {
		ClipSlotComponentImpl clipSlotComponent = new ClipSlotComponentImpl();
		return clipSlotComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelStripComponent createChannelStripComponent() {
		ChannelStripComponentImpl channelStripComponent = new ChannelStripComponentImpl();
		return channelStripComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixerComponent createMixerComponent() {
		MixerComponentImpl mixerComponent = new MixerComponentImpl();
		return mixerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent createDeviceComponent() {
		DeviceComponentImpl deviceComponent = new DeviceComponentImpl();
		return deviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonComponent createButtonComponent() {
		ButtonComponentImpl buttonComponent = new ButtonComponentImpl();
		return buttonComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonMatrixElement createButtonMatrixElement() {
		ButtonMatrixElementImpl buttonMatrixElement = new ButtonMatrixElementImpl();
		return buttonMatrixElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SliderElement createSliderElement() {
		SliderElementImpl sliderElement = new SliderElementImpl();
		return sliderElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncoderElement createEncoderElement() {
		EncoderElementImpl encoderElement = new EncoderElementImpl();
		return encoderElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingedEcoderElement createRingedEcoderElement() {
		RingedEcoderElementImpl ringedEcoderElement = new RingedEcoderElementImpl();
		return ringedEcoderElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalDisplayElement createPhysicalDisplayElement() {
		PhysicalDisplayElementImpl physicalDisplayElement = new PhysicalDisplayElementImpl();
		return physicalDisplayElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiMap createMidiMap() {
		MidiMapImpl midiMap = new MidiMapImpl();
		return midiMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MASTER_CTRL createMASTER_CTRLFromString(EDataType eDataType, String initialValue) {
		MASTER_CTRL result = MASTER_CTRL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMASTER_CTRLToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_CONTROL createTRACK_CONTROLFromString(EDataType eDataType, String initialValue) {
		TRACK_CONTROL result = TRACK_CONTROL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRACK_CONTROLToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABLETON_OSC_MAPPING createABLETON_OSC_MAPPINGFromString(EDataType eDataType, String initialValue) {
		ABLETON_OSC_MAPPING result = ABLETON_OSC_MAPPING.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertABLETON_OSC_MAPPINGToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonctrlPackage getEzabletonctrlPackage() {
		return (EzabletonctrlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzabletonctrlPackage getPackage() {
		return EzabletonctrlPackage.eINSTANCE;
	}

} //EzabletonctrlFactoryImpl
