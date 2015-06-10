/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveClip;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ezabletonctrl.LiveClip} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LiveClipItemProvider
	extends ItemProviderAdapter
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
	public LiveClipItemProvider(AdapterFactory adapterFactory) {
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

			addClipIDPropertyDescriptor(object);
			addClipNamePropertyDescriptor(object);
			addClipStatePropertyDescriptor(object);
			addSizeXPropertyDescriptor(object);
			addSizeYPropertyDescriptor(object);
			addCoarsePropertyDescriptor(object);
			addFinePropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
			addLengthPropertyDescriptor(object);
			addLoopStartPropertyDescriptor(object);
			addLoopEndPropertyDescriptor(object);
			addTrackPropertyDescriptor(object);
			addLastSeenPropertyDescriptor(object);
			addIsAudioClipPropertyDescriptor(object);
			addIsMidiClipPropertyDescriptor(object);
			addIsTriggeredPropertyDescriptor(object);
			addPlayingStatusPropertyDescriptor(object);
			addNotesPropertyDescriptor(object);
			addSignature_denominatorPropertyDescriptor(object);
			addSignature_numeratorPropertyDescriptor(object);
			addWarpingPropertyDescriptor(object);
			addWill_recording_on_startPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Clip ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClipIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_clipID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_clipID_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clip Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClipNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_clipName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_clipName_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clip State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClipStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_clipState_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_clipState_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_sizeX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_sizeX_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__SIZE_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_sizeY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_sizeY_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__SIZE_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coarse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoarsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_coarse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_coarse_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__COARSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fine feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_fine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_fine_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__FINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_position_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__POSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Length feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLengthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_length_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_length_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__LENGTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loop Start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopStartPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_loopStart_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_loopStart_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__LOOP_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Loop End feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopEndPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_loopEnd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_loopEnd_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__LOOP_END,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Track feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_track_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_track_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__TRACK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Seen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastSeenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_lastSeen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_lastSeen_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__LAST_SEEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Audio Clip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAudioClipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_isAudioClip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_isAudioClip_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__IS_AUDIO_CLIP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Midi Clip feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMidiClipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_isMidiClip_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_isMidiClip_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__IS_MIDI_CLIP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Triggered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsTriggeredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_isTriggered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_isTriggered_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__IS_TRIGGERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Playing Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlayingStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_playingStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_playingStatus_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__PLAYING_STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Notes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNotesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_notes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_notes_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__NOTES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signature denominator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignature_denominatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_signature_denominator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_signature_denominator_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__SIGNATURE_DENOMINATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signature numerator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignature_numeratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_signature_numerator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_signature_numerator_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__SIGNATURE_NUMERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Warping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWarpingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_warping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_warping_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__WARPING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Will recording on start feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWill_recording_on_startPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_will_recording_on_start_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_will_recording_on_start_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__WILL_RECORDING_ON_START,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveClip_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveClip_color_feature", "_UI_LiveClip_type"),
				 EzabletonctrlPackage.Literals.LIVE_CLIP__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LiveClip.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LiveClip"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LiveClip)object).getClipName();
		return label == null || label.length() == 0 ?
			getString("_UI_LiveClip_type") :
			getString("_UI_LiveClip_type") + " " + label;
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

		switch (notification.getFeatureID(LiveClip.class)) {
			case EzabletonctrlPackage.LIVE_CLIP__CLIP_ID:
			case EzabletonctrlPackage.LIVE_CLIP__CLIP_NAME:
			case EzabletonctrlPackage.LIVE_CLIP__CLIP_STATE:
			case EzabletonctrlPackage.LIVE_CLIP__SIZE_X:
			case EzabletonctrlPackage.LIVE_CLIP__SIZE_Y:
			case EzabletonctrlPackage.LIVE_CLIP__COARSE:
			case EzabletonctrlPackage.LIVE_CLIP__FINE:
			case EzabletonctrlPackage.LIVE_CLIP__POSITION:
			case EzabletonctrlPackage.LIVE_CLIP__LENGTH:
			case EzabletonctrlPackage.LIVE_CLIP__LOOP_START:
			case EzabletonctrlPackage.LIVE_CLIP__LOOP_END:
			case EzabletonctrlPackage.LIVE_CLIP__LAST_SEEN:
			case EzabletonctrlPackage.LIVE_CLIP__IS_AUDIO_CLIP:
			case EzabletonctrlPackage.LIVE_CLIP__IS_MIDI_CLIP:
			case EzabletonctrlPackage.LIVE_CLIP__IS_TRIGGERED:
			case EzabletonctrlPackage.LIVE_CLIP__PLAYING_STATUS:
			case EzabletonctrlPackage.LIVE_CLIP__NOTES:
			case EzabletonctrlPackage.LIVE_CLIP__SIGNATURE_DENOMINATOR:
			case EzabletonctrlPackage.LIVE_CLIP__SIGNATURE_NUMERATOR:
			case EzabletonctrlPackage.LIVE_CLIP__WARPING:
			case EzabletonctrlPackage.LIVE_CLIP__WILL_RECORDING_ON_START:
			case EzabletonctrlPackage.LIVE_CLIP__COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzabletonctrlEditPlugin.INSTANCE;
	}

}
