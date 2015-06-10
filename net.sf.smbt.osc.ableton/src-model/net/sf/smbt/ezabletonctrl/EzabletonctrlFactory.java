/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage
 * @generated
 */
public interface EzabletonctrlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzabletonctrlFactory eINSTANCE = net.sf.smbt.ezabletonctrl.impl.EzabletonctrlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ableton Live</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ableton Live</em>'.
	 * @generated
	 */
	AbletonLive createAbletonLive();

	/**
	 * Returns a new object of class '<em>Live Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track</em>'.
	 * @generated
	 */
	LiveTrack createLiveTrack();

	/**
	 * Returns a new object of class '<em>Live Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Scene</em>'.
	 * @generated
	 */
	LiveScene createLiveScene();

	/**
	 * Returns a new object of class '<em>Live Master</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Master</em>'.
	 * @generated
	 */
	LiveMaster createLiveMaster();

	/**
	 * Returns a new object of class '<em>Live Clip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Clip</em>'.
	 * @generated
	 */
	LiveClip createLiveClip();

	/**
	 * Returns a new object of class '<em>Place Holder Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place Holder Device</em>'.
	 * @generated
	 */
	PlaceHolderDevice createPlaceHolderDevice();

	/**
	 * Returns a new object of class '<em>Live Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Param</em>'.
	 * @generated
	 */
	LiveParam createLiveParam();

	/**
	 * Returns a new object of class '<em>Abstract Mixer Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Mixer Device</em>'.
	 * @generated
	 */
	AbstractMixerDevice createAbstractMixerDevice();

	/**
	 * Returns a new object of class '<em>Live Track View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Live Track View</em>'.
	 * @generated
	 */
	LiveTrackView createLiveTrackView();

	/**
	 * Returns a new object of class '<em>Control Surface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Surface</em>'.
	 * @generated
	 */
	ControlSurface createControlSurface();

	/**
	 * Returns a new object of class '<em>Transport Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Component</em>'.
	 * @generated
	 */
	TransportComponent createTransportComponent();

	/**
	 * Returns a new object of class '<em>Session Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Component</em>'.
	 * @generated
	 */
	SessionComponent createSessionComponent();

	/**
	 * Returns a new object of class '<em>Clip Slot Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clip Slot Component</em>'.
	 * @generated
	 */
	ClipSlotComponent createClipSlotComponent();

	/**
	 * Returns a new object of class '<em>Channel Strip Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Strip Component</em>'.
	 * @generated
	 */
	ChannelStripComponent createChannelStripComponent();

	/**
	 * Returns a new object of class '<em>Mixer Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mixer Component</em>'.
	 * @generated
	 */
	MixerComponent createMixerComponent();

	/**
	 * Returns a new object of class '<em>Device Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Component</em>'.
	 * @generated
	 */
	DeviceComponent createDeviceComponent();

	/**
	 * Returns a new object of class '<em>Button Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Component</em>'.
	 * @generated
	 */
	ButtonComponent createButtonComponent();

	/**
	 * Returns a new object of class '<em>Button Matrix Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Matrix Element</em>'.
	 * @generated
	 */
	ButtonMatrixElement createButtonMatrixElement();

	/**
	 * Returns a new object of class '<em>Slider Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slider Element</em>'.
	 * @generated
	 */
	SliderElement createSliderElement();

	/**
	 * Returns a new object of class '<em>Encoder Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encoder Element</em>'.
	 * @generated
	 */
	EncoderElement createEncoderElement();

	/**
	 * Returns a new object of class '<em>Ringed Ecoder Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ringed Ecoder Element</em>'.
	 * @generated
	 */
	RingedEcoderElement createRingedEcoderElement();

	/**
	 * Returns a new object of class '<em>Physical Display Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Display Element</em>'.
	 * @generated
	 */
	PhysicalDisplayElement createPhysicalDisplayElement();

	/**
	 * Returns a new object of class '<em>Midi Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Midi Map</em>'.
	 * @generated
	 */
	MidiMap createMidiMap();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzabletonctrlPackage getEzabletonctrlPackage();

} //EzabletonctrlFactory
