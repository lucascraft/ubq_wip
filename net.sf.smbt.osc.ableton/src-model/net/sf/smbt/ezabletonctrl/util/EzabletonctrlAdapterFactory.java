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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage
 * @generated
 */
public class EzabletonctrlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzabletonctrlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonctrlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzabletonctrlPackage.eINSTANCE;
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
	protected EzabletonctrlSwitch<Adapter> modelSwitch =
		new EzabletonctrlSwitch<Adapter>() {
			@Override
			public Adapter caseAbletonLive(AbletonLive object) {
				return createAbletonLiveAdapter();
			}
			@Override
			public Adapter caseLiveTrack(LiveTrack object) {
				return createLiveTrackAdapter();
			}
			@Override
			public Adapter caseLiveScene(LiveScene object) {
				return createLiveSceneAdapter();
			}
			@Override
			public Adapter caseLiveMaster(LiveMaster object) {
				return createLiveMasterAdapter();
			}
			@Override
			public Adapter caseLiveClip(LiveClip object) {
				return createLiveClipAdapter();
			}
			@Override
			public Adapter caseAbstractLiveDevice(AbstractLiveDevice object) {
				return createAbstractLiveDeviceAdapter();
			}
			@Override
			public Adapter casePlaceHolderDevice(PlaceHolderDevice object) {
				return createPlaceHolderDeviceAdapter();
			}
			@Override
			public Adapter caseLiveParam(LiveParam object) {
				return createLiveParamAdapter();
			}
			@Override
			public Adapter caseAbstractMixerDevice(AbstractMixerDevice object) {
				return createAbstractMixerDeviceAdapter();
			}
			@Override
			public Adapter caseLiveTrackView(LiveTrackView object) {
				return createLiveTrackViewAdapter();
			}
			@Override
			public Adapter caseControlSurface(ControlSurface object) {
				return createControlSurfaceAdapter();
			}
			@Override
			public Adapter caseTransportComponent(TransportComponent object) {
				return createTransportComponentAdapter();
			}
			@Override
			public Adapter caseSessionComponent(SessionComponent object) {
				return createSessionComponentAdapter();
			}
			@Override
			public Adapter caseClipSlotComponent(ClipSlotComponent object) {
				return createClipSlotComponentAdapter();
			}
			@Override
			public Adapter caseChannelStripComponent(ChannelStripComponent object) {
				return createChannelStripComponentAdapter();
			}
			@Override
			public Adapter caseMixerComponent(MixerComponent object) {
				return createMixerComponentAdapter();
			}
			@Override
			public Adapter caseDeviceComponent(DeviceComponent object) {
				return createDeviceComponentAdapter();
			}
			@Override
			public Adapter caseButtonComponent(ButtonComponent object) {
				return createButtonComponentAdapter();
			}
			@Override
			public Adapter caseButtonMatrixElement(ButtonMatrixElement object) {
				return createButtonMatrixElementAdapter();
			}
			@Override
			public Adapter caseSliderElement(SliderElement object) {
				return createSliderElementAdapter();
			}
			@Override
			public Adapter caseEncoderElement(EncoderElement object) {
				return createEncoderElementAdapter();
			}
			@Override
			public Adapter caseRingedEcoderElement(RingedEcoderElement object) {
				return createRingedEcoderElementAdapter();
			}
			@Override
			public Adapter casePhysicalDisplayElement(PhysicalDisplayElement object) {
				return createPhysicalDisplayElementAdapter();
			}
			@Override
			public Adapter caseMidiMap(MidiMap object) {
				return createMidiMapAdapter();
			}
			@Override
			public Adapter caseIConnectedUnit(IConnectedUnit object) {
				return createIConnectedUnitAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.AbletonLive <em>Ableton Live</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.AbletonLive
	 * @generated
	 */
	public Adapter createAbletonLiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.LiveTrack <em>Live Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrack
	 * @generated
	 */
	public Adapter createLiveTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.LiveScene <em>Live Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.LiveScene
	 * @generated
	 */
	public Adapter createLiveSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.LiveMaster <em>Live Master</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.LiveMaster
	 * @generated
	 */
	public Adapter createLiveMasterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.LiveClip <em>Live Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.LiveClip
	 * @generated
	 */
	public Adapter createLiveClipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice <em>Abstract Live Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.AbstractLiveDevice
	 * @generated
	 */
	public Adapter createAbstractLiveDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.PlaceHolderDevice <em>Place Holder Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.PlaceHolderDevice
	 * @generated
	 */
	public Adapter createPlaceHolderDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.LiveParam <em>Live Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.LiveParam
	 * @generated
	 */
	public Adapter createLiveParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice <em>Abstract Mixer Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.AbstractMixerDevice
	 * @generated
	 */
	public Adapter createAbstractMixerDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.LiveTrackView <em>Live Track View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.LiveTrackView
	 * @generated
	 */
	public Adapter createLiveTrackViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.ControlSurface <em>Control Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.ControlSurface
	 * @generated
	 */
	public Adapter createControlSurfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.TransportComponent <em>Transport Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.TransportComponent
	 * @generated
	 */
	public Adapter createTransportComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.SessionComponent <em>Session Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.SessionComponent
	 * @generated
	 */
	public Adapter createSessionComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.ClipSlotComponent <em>Clip Slot Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.ClipSlotComponent
	 * @generated
	 */
	public Adapter createClipSlotComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.ChannelStripComponent <em>Channel Strip Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.ChannelStripComponent
	 * @generated
	 */
	public Adapter createChannelStripComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.MixerComponent <em>Mixer Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.MixerComponent
	 * @generated
	 */
	public Adapter createMixerComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.DeviceComponent <em>Device Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.DeviceComponent
	 * @generated
	 */
	public Adapter createDeviceComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.ButtonComponent <em>Button Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.ButtonComponent
	 * @generated
	 */
	public Adapter createButtonComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.ButtonMatrixElement <em>Button Matrix Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.ButtonMatrixElement
	 * @generated
	 */
	public Adapter createButtonMatrixElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.SliderElement <em>Slider Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.SliderElement
	 * @generated
	 */
	public Adapter createSliderElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.EncoderElement <em>Encoder Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.EncoderElement
	 * @generated
	 */
	public Adapter createEncoderElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.RingedEcoderElement <em>Ringed Ecoder Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.RingedEcoderElement
	 * @generated
	 */
	public Adapter createRingedEcoderElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.PhysicalDisplayElement <em>Physical Display Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.PhysicalDisplayElement
	 * @generated
	 */
	public Adapter createPhysicalDisplayElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezabletonctrl.MidiMap <em>Midi Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezabletonctrl.MidiMap
	 * @generated
	 */
	public Adapter createMidiMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	public Adapter createIConnectedUnitAdapter() {
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

} //EzabletonctrlAdapterFactory
