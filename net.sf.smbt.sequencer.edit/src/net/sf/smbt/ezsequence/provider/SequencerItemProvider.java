/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.dmx.model.ezdmx.EzdmxFactory;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezsequence.EzsequenceFactory;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.midi.ezmidi.EzmidiFactory;
import net.sf.smbt.osc.eztuio2.Eztuio2Factory;
import net.sf.smbt.osccmd.OsccmdFactory;
import net.sf.xqz.model.cmd.CmdFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ezsequence.Sequencer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencerItemProvider
	extends TimedObjItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencerItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBoundsPropertyDescriptor(object);
			addFgPropertyDescriptor(object);
			addBgPropertyDescriptor(object);
			addVisiblePropertyDescriptor(object);
			addSelectedPropertyDescriptor(object);
			addDisabledPropertyDescriptor(object);
			addIDPropertyDescriptor(object);
			addTimelinesPropertyDescriptor(object);
			addTimeCursorsPropertyDescriptor(object);
			addZoomFactorPropertyDescriptor(object);
			addSurfacePropertyDescriptor(object);
			addCurrentActionModePropertyDescriptor(object);
			addOffsetPropertyDescriptor(object);
			addSelectionPropertyDescriptor(object);
			addDmxUniversePropertyDescriptor(object);
			addMidiCommandsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bounds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElem_bounds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElem_bounds_feature", "_UI_UIElem_type"),
				 EzsequencePackage.Literals.UI_ELEM__BOUNDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElem_fg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElem_fg_feature", "_UI_UIElem_type"),
				 EzsequencePackage.Literals.UI_ELEM__FG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElem_bg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElem_bg_feature", "_UI_UIElem_type"),
				 EzsequencePackage.Literals.UI_ELEM__BG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_ID_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timelines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimelinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_timelines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_timelines_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__TIMELINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Cursors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeCursorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_timeCursors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_timeCursors_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__TIME_CURSORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zoom Factor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZoomFactorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_zoomFactor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_zoomFactor_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__ZOOM_FACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Surface feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSurfacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_surface_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_surface_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__SURFACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElem_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElem_visible_feature", "_UI_UIElem_type"),
				 EzsequencePackage.Literals.UI_ELEM__VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selected feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElem_selected_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElem_selected_feature", "_UI_UIElem_type"),
				 EzsequencePackage.Literals.UI_ELEM__SELECTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Disabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_UIElem_disabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UIElem_disabled_feature", "_UI_UIElem_type"),
				 EzsequencePackage.Literals.UI_ELEM__DISABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Action Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentActionModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_currentActionMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_currentActionMode_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__CURRENT_ACTION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_offset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_offset_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_selection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_selection_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__SELECTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dmx Universe feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDmxUniversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_dmxUniverse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_dmxUniverse_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__DMX_UNIVERSE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Commands feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiCommandsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Sequencer_midiCommands_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Sequencer_midiCommands_feature", "_UI_Sequencer_type"),
				 EzsequencePackage.Literals.SEQUENCER__MIDI_COMMANDS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__TIMEBAR);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__BOXES);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__LINKS);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__TRIGGERS);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__COMMANDS);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__CMD_TYPE_CACHE);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__DEFAULT_TARGETS);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__LISTENERS);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__CUES);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__SYNCHROS);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS);
			childrenFeatures.add(EzsequencePackage.Literals.SEQUENCER__MOJO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Sequencer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sequencer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Sequencer)object).getID();
		return label == null || label.length() == 0 ?
			getString("_UI_Sequencer_type") :
			getString("_UI_Sequencer_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Sequencer.class)) {
			case EzsequencePackage.SEQUENCER__BOUNDS:
			case EzsequencePackage.SEQUENCER__FG:
			case EzsequencePackage.SEQUENCER__BG:
			case EzsequencePackage.SEQUENCER__VISIBLE:
			case EzsequencePackage.SEQUENCER__SELECTED:
			case EzsequencePackage.SEQUENCER__DISABLED:
			case EzsequencePackage.SEQUENCER__ID:
			case EzsequencePackage.SEQUENCER__ZOOM_FACTOR:
			case EzsequencePackage.SEQUENCER__SURFACE:
			case EzsequencePackage.SEQUENCER__CURRENT_ACTION_MODE:
			case EzsequencePackage.SEQUENCER__OFFSET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzsequencePackage.SEQUENCER__TIMEBAR:
			case EzsequencePackage.SEQUENCER__BOXES:
			case EzsequencePackage.SEQUENCER__LINKS:
			case EzsequencePackage.SEQUENCER__TRIGGERS:
			case EzsequencePackage.SEQUENCER__COMMANDS:
			case EzsequencePackage.SEQUENCER__CMD_TYPE_CACHE:
			case EzsequencePackage.SEQUENCER__DEFAULT_TARGETS:
			case EzsequencePackage.SEQUENCER__LISTENERS:
			case EzsequencePackage.SEQUENCER__CUES:
			case EzsequencePackage.SEQUENCER__SYNCHROS:
			case EzsequencePackage.SEQUENCER__STORED_COMMANDS:
			case EzsequencePackage.SEQUENCER__MOJO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__TIMEBAR,
				 EzsequenceFactory.eINSTANCE.createTimeBar()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__TIMEBAR,
				 EzsequenceFactory.eINSTANCE.createCircle()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__TIMEBAR,
				 EzsequenceFactory.eINSTANCE.createStar()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__TIMEBAR,
				 EzsequenceFactory.eINSTANCE.createSquare()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__TIMEBAR,
				 EzsequenceFactory.eINSTANCE.createTrack()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__BOXES,
				 EzsequenceFactory.eINSTANCE.createTimeBox()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__LINKS,
				 EzsequenceFactory.eINSTANCE.createTimedLink()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__TRIGGERS,
				 EzsequenceFactory.eINSTANCE.createEventTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createDSLMidiMessage()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createSysexMessage()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createSysexGSReset()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createSysexPatchChanged()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createNoteON()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createNoteOFF()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createKeyPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createControllerChange()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createProgramChange()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createChannelPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createPitchBend()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createSystemExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createSongPosition()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createSongSelect()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createUnofficialBusSelect()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createTuneRequest()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createEndOfExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createTimingTick()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createStartSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createContinueSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createStopSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createActiveSensing()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createSystemReset()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createMidiTimeCode()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createPolyPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createTimingClock()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmidiFactory.eINSTANCE.createTimeCode()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXReprogramFirmwareRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageReply()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamsReplyCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXSetWidgetParamsRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXReceivedPacketsCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXOutputOnlySendDMXPacketsRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXSendRDMPacketCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXReceiveDMXCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXChangeOfStatePacketCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberReplyCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXSendRDMDiscoveryRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXFade()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXFadeWithStrobe()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXFadeFull()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoAgentCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmojoFactory.eINSTANCE.createEzMojoInfoCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoTargetedCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmojoFactory.eINSTANCE.createEzMojoKinematicCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoMappedCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 CmdFactory.eINSTANCE.createCompoundCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 CmdFactory.eINSTANCE.createXCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 OsccmdFactory.eINSTANCE.createOscCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 OsccmdFactory.eINSTANCE.createOscSndCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 OsccmdFactory.eINSTANCE.createOscRcvCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2Tok()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2Ptr()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2Sym()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2T3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2P3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2B3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2CHG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2OCG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2SKG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2SVG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2ARG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2RAW()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2CTL()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2DAT()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2SIG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2ALA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2COA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2LIA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2LLA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2LTA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2FRM()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2ALV()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2BND()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__CMD_TYPE_CACHE,
				 EcoreFactory.eINSTANCE.createEClass()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__CMD_TYPE_CACHE,
				 EcoreFactory.eINSTANCE.createEDataType()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__CMD_TYPE_CACHE,
				 EcoreFactory.eINSTANCE.createEEnum()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__DEFAULT_TARGETS,
				 EzmojoFactory.eINSTANCE.createEZMojoTarget()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__LISTENERS,
				 EzsequenceFactory.eINSTANCE.createEventListener()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__CUES,
				 EzsequenceFactory.eINSTANCE.createEventCue()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__SYNCHROS,
				 EzsequenceFactory.eINSTANCE.createEventSynchro()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createDSLMidiMessage()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createSysexMessage()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createSysexGSReset()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createSysexPatchChanged()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createNoteON()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createNoteOFF()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createKeyPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createControllerChange()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createProgramChange()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createChannelPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createPitchBend()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createSystemExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createSongPosition()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createSongSelect()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createUnofficialBusSelect()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createTuneRequest()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createEndOfExclusive()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createTimingTick()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createStartSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createContinueSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createStopSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createActiveSensing()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createSystemReset()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createMidiTimeCode()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createPolyPressure()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createTimingClock()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmidiFactory.eINSTANCE.createTimeCode()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXReprogramFirmwareRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageReply()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamsReplyCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXSetWidgetParamsRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXReceivedPacketsCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXOutputOnlySendDMXPacketsRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXSendRDMPacketCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXReceiveDMXCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXChangeOfStatePacketCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberReplyCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXSendRDMDiscoveryRequestCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXFade()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXFadeWithStrobe()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzdmxFactory.eINSTANCE.createOpenDMXFadeFull()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoAgentCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmojoFactory.eINSTANCE.createEzMojoInfoCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoTargetedCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmojoFactory.eINSTANCE.createEzMojoKinematicCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 EzmojoFactory.eINSTANCE.createEZMojoMappedCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 CmdFactory.eINSTANCE.createCompoundCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 CmdFactory.eINSTANCE.createXCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 OsccmdFactory.eINSTANCE.createOscCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 OsccmdFactory.eINSTANCE.createOscSndCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 OsccmdFactory.eINSTANCE.createOscRcvCmd()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2Tok()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2Ptr()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2Sym()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2T3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2P3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2B3D()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2CHG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2OCG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2SKG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2SVG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2ARG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2RAW()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2CTL()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2DAT()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2SIG()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2ALA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2COA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2LIA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2LLA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2LTA()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2FRM()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2ALV()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS,
				 Eztuio2Factory.eINSTANCE.createTuio2BND()));

		newChildDescriptors.add
			(createChildParameter
				(EzsequencePackage.Literals.SEQUENCER__MOJO,
				 EzmojoFactory.eINSTANCE.createEZMojoRoot()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EzsequencePackage.Literals.SEQUENCER__COMMANDS ||
			childFeature == EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
