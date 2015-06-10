/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.smbt.ezabletonctrl.util.EzabletonctrlAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EzabletonctrlItemProviderAdapterFactory extends EzabletonctrlAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzabletonctrlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.AbletonLive} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbletonLiveItemProvider abletonLiveItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.AbletonLive}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbletonLiveAdapter() {
		if (abletonLiveItemProvider == null) {
			abletonLiveItemProvider = new AbletonLiveItemProvider(this);
		}

		return abletonLiveItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.LiveTrack} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveTrackItemProvider liveTrackItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.LiveTrack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiveTrackAdapter() {
		if (liveTrackItemProvider == null) {
			liveTrackItemProvider = new LiveTrackItemProvider(this);
		}

		return liveTrackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.LiveScene} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveSceneItemProvider liveSceneItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.LiveScene}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiveSceneAdapter() {
		if (liveSceneItemProvider == null) {
			liveSceneItemProvider = new LiveSceneItemProvider(this);
		}

		return liveSceneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.LiveMaster} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveMasterItemProvider liveMasterItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.LiveMaster}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiveMasterAdapter() {
		if (liveMasterItemProvider == null) {
			liveMasterItemProvider = new LiveMasterItemProvider(this);
		}

		return liveMasterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.LiveClip} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveClipItemProvider liveClipItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.LiveClip}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiveClipAdapter() {
		if (liveClipItemProvider == null) {
			liveClipItemProvider = new LiveClipItemProvider(this);
		}

		return liveClipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.PlaceHolderDevice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceHolderDeviceItemProvider placeHolderDeviceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.PlaceHolderDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlaceHolderDeviceAdapter() {
		if (placeHolderDeviceItemProvider == null) {
			placeHolderDeviceItemProvider = new PlaceHolderDeviceItemProvider(this);
		}

		return placeHolderDeviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.LiveParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveParamItemProvider liveParamItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.LiveParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiveParamAdapter() {
		if (liveParamItemProvider == null) {
			liveParamItemProvider = new LiveParamItemProvider(this);
		}

		return liveParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMixerDeviceItemProvider abstractMixerDeviceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractMixerDeviceAdapter() {
		if (abstractMixerDeviceItemProvider == null) {
			abstractMixerDeviceItemProvider = new AbstractMixerDeviceItemProvider(this);
		}

		return abstractMixerDeviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.LiveTrackView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveTrackViewItemProvider liveTrackViewItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.LiveTrackView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLiveTrackViewAdapter() {
		if (liveTrackViewItemProvider == null) {
			liveTrackViewItemProvider = new LiveTrackViewItemProvider(this);
		}

		return liveTrackViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.ControlSurface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSurfaceItemProvider controlSurfaceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.ControlSurface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControlSurfaceAdapter() {
		if (controlSurfaceItemProvider == null) {
			controlSurfaceItemProvider = new ControlSurfaceItemProvider(this);
		}

		return controlSurfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.TransportComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransportComponentItemProvider transportComponentItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.TransportComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransportComponentAdapter() {
		if (transportComponentItemProvider == null) {
			transportComponentItemProvider = new TransportComponentItemProvider(this);
		}

		return transportComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.SessionComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionComponentItemProvider sessionComponentItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.SessionComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSessionComponentAdapter() {
		if (sessionComponentItemProvider == null) {
			sessionComponentItemProvider = new SessionComponentItemProvider(this);
		}

		return sessionComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.ClipSlotComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClipSlotComponentItemProvider clipSlotComponentItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.ClipSlotComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClipSlotComponentAdapter() {
		if (clipSlotComponentItemProvider == null) {
			clipSlotComponentItemProvider = new ClipSlotComponentItemProvider(this);
		}

		return clipSlotComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.ChannelStripComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelStripComponentItemProvider channelStripComponentItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.ChannelStripComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChannelStripComponentAdapter() {
		if (channelStripComponentItemProvider == null) {
			channelStripComponentItemProvider = new ChannelStripComponentItemProvider(this);
		}

		return channelStripComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.MixerComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MixerComponentItemProvider mixerComponentItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.MixerComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMixerComponentAdapter() {
		if (mixerComponentItemProvider == null) {
			mixerComponentItemProvider = new MixerComponentItemProvider(this);
		}

		return mixerComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.DeviceComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceComponentItemProvider deviceComponentItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.DeviceComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceComponentAdapter() {
		if (deviceComponentItemProvider == null) {
			deviceComponentItemProvider = new DeviceComponentItemProvider(this);
		}

		return deviceComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.ButtonComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonComponentItemProvider buttonComponentItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.ButtonComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonComponentAdapter() {
		if (buttonComponentItemProvider == null) {
			buttonComponentItemProvider = new ButtonComponentItemProvider(this);
		}

		return buttonComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.ButtonMatrixElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonMatrixElementItemProvider buttonMatrixElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.ButtonMatrixElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonMatrixElementAdapter() {
		if (buttonMatrixElementItemProvider == null) {
			buttonMatrixElementItemProvider = new ButtonMatrixElementItemProvider(this);
		}

		return buttonMatrixElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.SliderElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliderElementItemProvider sliderElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.SliderElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSliderElementAdapter() {
		if (sliderElementItemProvider == null) {
			sliderElementItemProvider = new SliderElementItemProvider(this);
		}

		return sliderElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.EncoderElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncoderElementItemProvider encoderElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.EncoderElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEncoderElementAdapter() {
		if (encoderElementItemProvider == null) {
			encoderElementItemProvider = new EncoderElementItemProvider(this);
		}

		return encoderElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.RingedEcoderElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RingedEcoderElementItemProvider ringedEcoderElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.RingedEcoderElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRingedEcoderElementAdapter() {
		if (ringedEcoderElementItemProvider == null) {
			ringedEcoderElementItemProvider = new RingedEcoderElementItemProvider(this);
		}

		return ringedEcoderElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.PhysicalDisplayElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalDisplayElementItemProvider physicalDisplayElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.PhysicalDisplayElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicalDisplayElementAdapter() {
		if (physicalDisplayElementItemProvider == null) {
			physicalDisplayElementItemProvider = new PhysicalDisplayElementItemProvider(this);
		}

		return physicalDisplayElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezabletonctrl.MidiMap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidiMapItemProvider midiMapItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezabletonctrl.MidiMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMidiMapAdapter() {
		if (midiMapItemProvider == null) {
			midiMapItemProvider = new MidiMapItemProvider(this);
		}

		return midiMapItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (abletonLiveItemProvider != null) abletonLiveItemProvider.dispose();
		if (liveTrackItemProvider != null) liveTrackItemProvider.dispose();
		if (liveSceneItemProvider != null) liveSceneItemProvider.dispose();
		if (liveMasterItemProvider != null) liveMasterItemProvider.dispose();
		if (liveClipItemProvider != null) liveClipItemProvider.dispose();
		if (placeHolderDeviceItemProvider != null) placeHolderDeviceItemProvider.dispose();
		if (liveParamItemProvider != null) liveParamItemProvider.dispose();
		if (abstractMixerDeviceItemProvider != null) abstractMixerDeviceItemProvider.dispose();
		if (liveTrackViewItemProvider != null) liveTrackViewItemProvider.dispose();
		if (controlSurfaceItemProvider != null) controlSurfaceItemProvider.dispose();
		if (transportComponentItemProvider != null) transportComponentItemProvider.dispose();
		if (sessionComponentItemProvider != null) sessionComponentItemProvider.dispose();
		if (clipSlotComponentItemProvider != null) clipSlotComponentItemProvider.dispose();
		if (channelStripComponentItemProvider != null) channelStripComponentItemProvider.dispose();
		if (mixerComponentItemProvider != null) mixerComponentItemProvider.dispose();
		if (deviceComponentItemProvider != null) deviceComponentItemProvider.dispose();
		if (buttonComponentItemProvider != null) buttonComponentItemProvider.dispose();
		if (buttonMatrixElementItemProvider != null) buttonMatrixElementItemProvider.dispose();
		if (sliderElementItemProvider != null) sliderElementItemProvider.dispose();
		if (encoderElementItemProvider != null) encoderElementItemProvider.dispose();
		if (ringedEcoderElementItemProvider != null) ringedEcoderElementItemProvider.dispose();
		if (physicalDisplayElementItemProvider != null) physicalDisplayElementItemProvider.dispose();
		if (midiMapItemProvider != null) midiMapItemProvider.dispose();
	}

}
