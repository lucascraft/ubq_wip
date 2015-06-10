/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.util;

import net.sf.smbt.ezabletonctrl.*;
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
import net.sf.xqz.model.engine.IConnectedUnit;

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
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage
 * @generated
 */
public class EzabletonctrlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzabletonctrlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonctrlSwitch() {
		if (modelPackage == null) {
			modelPackage = EzabletonctrlPackage.eINSTANCE;
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
			case EzabletonctrlPackage.ABLETON_LIVE: {
				AbletonLive abletonLive = (AbletonLive)theEObject;
				T result = caseAbletonLive(abletonLive);
				if (result == null) result = caseIConnectedUnit(abletonLive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.LIVE_TRACK: {
				LiveTrack liveTrack = (LiveTrack)theEObject;
				T result = caseLiveTrack(liveTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.LIVE_SCENE: {
				LiveScene liveScene = (LiveScene)theEObject;
				T result = caseLiveScene(liveScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.LIVE_MASTER: {
				LiveMaster liveMaster = (LiveMaster)theEObject;
				T result = caseLiveMaster(liveMaster);
				if (result == null) result = caseLiveTrack(liveMaster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.LIVE_CLIP: {
				LiveClip liveClip = (LiveClip)theEObject;
				T result = caseLiveClip(liveClip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.ABSTRACT_LIVE_DEVICE: {
				AbstractLiveDevice abstractLiveDevice = (AbstractLiveDevice)theEObject;
				T result = caseAbstractLiveDevice(abstractLiveDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.PLACE_HOLDER_DEVICE: {
				PlaceHolderDevice placeHolderDevice = (PlaceHolderDevice)theEObject;
				T result = casePlaceHolderDevice(placeHolderDevice);
				if (result == null) result = caseAbstractLiveDevice(placeHolderDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.LIVE_PARAM: {
				LiveParam liveParam = (LiveParam)theEObject;
				T result = caseLiveParam(liveParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.ABSTRACT_MIXER_DEVICE: {
				AbstractMixerDevice abstractMixerDevice = (AbstractMixerDevice)theEObject;
				T result = caseAbstractMixerDevice(abstractMixerDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.LIVE_TRACK_VIEW: {
				LiveTrackView liveTrackView = (LiveTrackView)theEObject;
				T result = caseLiveTrackView(liveTrackView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.CONTROL_SURFACE: {
				ControlSurface controlSurface = (ControlSurface)theEObject;
				T result = caseControlSurface(controlSurface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.TRANSPORT_COMPONENT: {
				TransportComponent transportComponent = (TransportComponent)theEObject;
				T result = caseTransportComponent(transportComponent);
				if (result == null) result = caseControlSurface(transportComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.SESSION_COMPONENT: {
				SessionComponent sessionComponent = (SessionComponent)theEObject;
				T result = caseSessionComponent(sessionComponent);
				if (result == null) result = caseControlSurface(sessionComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.CLIP_SLOT_COMPONENT: {
				ClipSlotComponent clipSlotComponent = (ClipSlotComponent)theEObject;
				T result = caseClipSlotComponent(clipSlotComponent);
				if (result == null) result = caseControlSurface(clipSlotComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.CHANNEL_STRIP_COMPONENT: {
				ChannelStripComponent channelStripComponent = (ChannelStripComponent)theEObject;
				T result = caseChannelStripComponent(channelStripComponent);
				if (result == null) result = caseControlSurface(channelStripComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.MIXER_COMPONENT: {
				MixerComponent mixerComponent = (MixerComponent)theEObject;
				T result = caseMixerComponent(mixerComponent);
				if (result == null) result = caseControlSurface(mixerComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.DEVICE_COMPONENT: {
				DeviceComponent deviceComponent = (DeviceComponent)theEObject;
				T result = caseDeviceComponent(deviceComponent);
				if (result == null) result = caseControlSurface(deviceComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.BUTTON_COMPONENT: {
				ButtonComponent buttonComponent = (ButtonComponent)theEObject;
				T result = caseButtonComponent(buttonComponent);
				if (result == null) result = caseControlSurface(buttonComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.BUTTON_MATRIX_ELEMENT: {
				ButtonMatrixElement buttonMatrixElement = (ButtonMatrixElement)theEObject;
				T result = caseButtonMatrixElement(buttonMatrixElement);
				if (result == null) result = caseControlSurface(buttonMatrixElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.SLIDER_ELEMENT: {
				SliderElement sliderElement = (SliderElement)theEObject;
				T result = caseSliderElement(sliderElement);
				if (result == null) result = caseControlSurface(sliderElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.ENCODER_ELEMENT: {
				EncoderElement encoderElement = (EncoderElement)theEObject;
				T result = caseEncoderElement(encoderElement);
				if (result == null) result = caseControlSurface(encoderElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.RINGED_ECODER_ELEMENT: {
				RingedEcoderElement ringedEcoderElement = (RingedEcoderElement)theEObject;
				T result = caseRingedEcoderElement(ringedEcoderElement);
				if (result == null) result = caseControlSurface(ringedEcoderElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.PHYSICAL_DISPLAY_ELEMENT: {
				PhysicalDisplayElement physicalDisplayElement = (PhysicalDisplayElement)theEObject;
				T result = casePhysicalDisplayElement(physicalDisplayElement);
				if (result == null) result = caseControlSurface(physicalDisplayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzabletonctrlPackage.MIDI_MAP: {
				MidiMap midiMap = (MidiMap)theEObject;
				T result = caseMidiMap(midiMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ableton Live</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ableton Live</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbletonLive(AbletonLive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrack(LiveTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveScene(LiveScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Master</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Master</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveMaster(LiveMaster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Clip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Clip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveClip(LiveClip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Live Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Live Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLiveDevice(AbstractLiveDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Holder Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Holder Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlaceHolderDevice(PlaceHolderDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveParam(LiveParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mixer Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mixer Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMixerDevice(AbstractMixerDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Live Track View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Live Track View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiveTrackView(LiveTrackView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Surface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Surface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlSurface(ControlSurface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransportComponent(TransportComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionComponent(SessionComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Slot Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Slot Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClipSlotComponent(ClipSlotComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Strip Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Strip Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelStripComponent(ChannelStripComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixer Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixer Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixerComponent(MixerComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceComponent(DeviceComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonComponent(ButtonComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Matrix Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Matrix Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonMatrixElement(ButtonMatrixElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slider Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slider Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSliderElement(SliderElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encoder Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encoder Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncoderElement(EncoderElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ringed Ecoder Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ringed Ecoder Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingedEcoderElement(RingedEcoderElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Display Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Display Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalDisplayElement(PhysicalDisplayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiMap(MidiMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConnectedUnit(IConnectedUnit object) {
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

} //EzabletonctrlSwitch
