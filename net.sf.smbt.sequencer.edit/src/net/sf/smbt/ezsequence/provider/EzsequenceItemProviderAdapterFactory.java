/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.smbt.ezsequence.util.EzsequenceAdapterFactory;

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
public class EzsequenceItemProviderAdapterFactory extends EzsequenceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public EzsequenceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.Sequencer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencerItemProvider sequencerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.Sequencer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequencerAdapter() {
		if (sequencerItemProvider == null) {
			sequencerItemProvider = new SequencerItemProvider(this);
		}

		return sequencerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimeBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBoxItemProvider timeBoxItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimeBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeBoxAdapter() {
		if (timeBoxItemProvider == null) {
			timeBoxItemProvider = new TimeBoxItemProvider(this);
		}

		return timeBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimedEvent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedEventItemProvider timedEventItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimedEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedEventAdapter() {
		if (timedEventItemProvider == null) {
			timedEventItemProvider = new TimedEventItemProvider(this);
		}

		return timedEventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimeCursor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeCursorItemProvider timeCursorItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimeCursor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeCursorAdapter() {
		if (timeCursorItemProvider == null) {
			timeCursorItemProvider = new TimeCursorItemProvider(this);
		}

		return timeCursorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimeBar} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBarItemProvider timeBarItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimeBar}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeBarAdapter() {
		if (timeBarItemProvider == null) {
			timeBarItemProvider = new TimeBarItemProvider(this);
		}

		return timeBarItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.AbstractPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPortItemProvider abstractPortItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.AbstractPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbstractPortAdapter() {
		if (abstractPortItemProvider == null) {
			abstractPortItemProvider = new AbstractPortItemProvider(this);
		}

		return abstractPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.PortIn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInItemProvider portInItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.PortIn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortInAdapter() {
		if (portInItemProvider == null) {
			portInItemProvider = new PortInItemProvider(this);
		}

		return portInItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.PortOut} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortOutItemProvider portOutItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.PortOut}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPortOutAdapter() {
		if (portOutItemProvider == null) {
			portOutItemProvider = new PortOutItemProvider(this);
		}

		return portOutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimedObj} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedObjItemProvider timedObjItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimedObj}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedObjAdapter() {
		if (timedObjItemProvider == null) {
			timedObjItemProvider = new TimedObjItemProvider(this);
		}

		return timedObjItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.Script} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptItemProvider scriptItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.Script}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptAdapter() {
		if (scriptItemProvider == null) {
			scriptItemProvider = new ScriptItemProvider(this);
		}

		return scriptItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimeSlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeSlotItemProvider timeSlotItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimeSlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeSlotAdapter() {
		if (timeSlotItemProvider == null) {
			timeSlotItemProvider = new TimeSlotItemProvider(this);
		}

		return timeSlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimedLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedLinkItemProvider timedLinkItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimedLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedLinkAdapter() {
		if (timedLinkItemProvider == null) {
			timedLinkItemProvider = new TimedLinkItemProvider(this);
		}

		return timedLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.EventTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTriggerItemProvider eventTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.EventTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventTriggerAdapter() {
		if (eventTriggerItemProvider == null) {
			eventTriggerItemProvider = new EventTriggerItemProvider(this);
		}

		return eventTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.EventListener} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventListenerItemProvider eventListenerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.EventListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventListenerAdapter() {
		if (eventListenerItemProvider == null) {
			eventListenerItemProvider = new EventListenerItemProvider(this);
		}

		return eventListenerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.EventCue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventCueItemProvider eventCueItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.EventCue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventCueAdapter() {
		if (eventCueItemProvider == null) {
			eventCueItemProvider = new EventCueItemProvider(this);
		}

		return eventCueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.EventSynchro} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventSynchroItemProvider eventSynchroItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.EventSynchro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventSynchroAdapter() {
		if (eventSynchroItemProvider == null) {
			eventSynchroItemProvider = new EventSynchroItemProvider(this);
		}

		return eventSynchroItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.EmitInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmitInfoItemProvider emitInfoItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.EmitInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmitInfoAdapter() {
		if (emitInfoItemProvider == null) {
			emitInfoItemProvider = new EmitInfoItemProvider(this);
		}

		return emitInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.EventTarget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTargetItemProvider eventTargetItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.EventTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventTargetAdapter() {
		if (eventTargetItemProvider == null) {
			eventTargetItemProvider = new EventTargetItemProvider(this);
		}

		return eventTargetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimedLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedLineItemProvider timedLineItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimedLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimedLineAdapter() {
		if (timedLineItemProvider == null) {
			timedLineItemProvider = new TimedLineItemProvider(this);
		}

		return timedLineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.TimeNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeNodeItemProvider timeNodeItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.TimeNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeNodeAdapter() {
		if (timeNodeItemProvider == null) {
			timeNodeItemProvider = new TimeNodeItemProvider(this);
		}

		return timeNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.NodeFloatParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeFloatParamItemProvider nodeFloatParamItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.NodeFloatParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeFloatParamAdapter() {
		if (nodeFloatParamItemProvider == null) {
			nodeFloatParamItemProvider = new NodeFloatParamItemProvider(this);
		}

		return nodeFloatParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.NodeIntegerParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeIntegerParamItemProvider nodeIntegerParamItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.NodeIntegerParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeIntegerParamAdapter() {
		if (nodeIntegerParamItemProvider == null) {
			nodeIntegerParamItemProvider = new NodeIntegerParamItemProvider(this);
		}

		return nodeIntegerParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.NodeDoubleParam} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeDoubleParamItemProvider nodeDoubleParamItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.NodeDoubleParam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNodeDoubleParamAdapter() {
		if (nodeDoubleParamItemProvider == null) {
			nodeDoubleParamItemProvider = new NodeDoubleParamItemProvider(this);
		}

		return nodeDoubleParamItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.Circle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleItemProvider circleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.Circle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCircleAdapter() {
		if (circleItemProvider == null) {
			circleItemProvider = new CircleItemProvider(this);
		}

		return circleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.Star} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StarItemProvider starItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.Star}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStarAdapter() {
		if (starItemProvider == null) {
			starItemProvider = new StarItemProvider(this);
		}

		return starItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.Square} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareItemProvider squareItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.Square}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSquareAdapter() {
		if (squareItemProvider == null) {
			squareItemProvider = new SquareItemProvider(this);
		}

		return squareItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.Track} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackItemProvider trackItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.Track}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrackAdapter() {
		if (trackItemProvider == null) {
			trackItemProvider = new TrackItemProvider(this);
		}

		return trackItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.CueNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CueNodeItemProvider cueNodeItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.CueNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCueNodeAdapter() {
		if (cueNodeItemProvider == null) {
			cueNodeItemProvider = new CueNodeItemProvider(this);
		}

		return cueNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.UIElem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIElemItemProvider uiElemItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.UIElem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUIElemAdapter() {
		if (uiElemItemProvider == null) {
			uiElemItemProvider = new UIElemItemProvider(this);
		}

		return uiElemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezsequence.EventElem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventElemItemProvider eventElemItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezsequence.EventElem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventElemAdapter() {
		if (eventElemItemProvider == null) {
			eventElemItemProvider = new EventElemItemProvider(this);
		}

		return eventElemItemProvider;
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
		if (sequencerItemProvider != null) sequencerItemProvider.dispose();
		if (timeBoxItemProvider != null) timeBoxItemProvider.dispose();
		if (timedEventItemProvider != null) timedEventItemProvider.dispose();
		if (timeCursorItemProvider != null) timeCursorItemProvider.dispose();
		if (timeBarItemProvider != null) timeBarItemProvider.dispose();
		if (abstractPortItemProvider != null) abstractPortItemProvider.dispose();
		if (portInItemProvider != null) portInItemProvider.dispose();
		if (portOutItemProvider != null) portOutItemProvider.dispose();
		if (timedObjItemProvider != null) timedObjItemProvider.dispose();
		if (scriptItemProvider != null) scriptItemProvider.dispose();
		if (timeSlotItemProvider != null) timeSlotItemProvider.dispose();
		if (timedLinkItemProvider != null) timedLinkItemProvider.dispose();
		if (eventTriggerItemProvider != null) eventTriggerItemProvider.dispose();
		if (eventTargetItemProvider != null) eventTargetItemProvider.dispose();
		if (timedLineItemProvider != null) timedLineItemProvider.dispose();
		if (timeNodeItemProvider != null) timeNodeItemProvider.dispose();
		if (nodeFloatParamItemProvider != null) nodeFloatParamItemProvider.dispose();
		if (nodeIntegerParamItemProvider != null) nodeIntegerParamItemProvider.dispose();
		if (nodeDoubleParamItemProvider != null) nodeDoubleParamItemProvider.dispose();
		if (circleItemProvider != null) circleItemProvider.dispose();
		if (starItemProvider != null) starItemProvider.dispose();
		if (squareItemProvider != null) squareItemProvider.dispose();
		if (trackItemProvider != null) trackItemProvider.dispose();
		if (cueNodeItemProvider != null) cueNodeItemProvider.dispose();
		if (uiElemItemProvider != null) uiElemItemProvider.dispose();
		if (eventElemItemProvider != null) eventElemItemProvider.dispose();
		if (eventListenerItemProvider != null) eventListenerItemProvider.dispose();
		if (eventCueItemProvider != null) eventCueItemProvider.dispose();
		if (eventSynchroItemProvider != null) eventSynchroItemProvider.dispose();
		if (emitInfoItemProvider != null) emitInfoItemProvider.dispose();
	}

}
