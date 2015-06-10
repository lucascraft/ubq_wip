/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezabletonctrl.EzabletonctrlFactory;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveTrack;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
 * This is the item provider adapter for a {@link net.sf.smbt.ezabletonctrl.LiveTrack} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LiveTrackItemProvider
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
	public LiveTrackItemProvider(AdapterFactory adapterFactory) {
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

			addTrackIDPropertyDescriptor(object);
			addVolumePropertyDescriptor(object);
			addPanPropertyDescriptor(object);
			addSoloPropertyDescriptor(object);
			addSendPropertyDescriptor(object);
			addArmPropertyDescriptor(object);
			addMutePropertyDescriptor(object);
			addDelayPropertyDescriptor(object);
			addCoarsePropertyDescriptor(object);
			addFinePropertyDescriptor(object);
			addBeatsPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addClipsPropertyDescriptor(object);
			addTrackNamePropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addLeftMeterPropertyDescriptor(object);
			addRightMeterPropertyDescriptor(object);
			addLastSeenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Track ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrackIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_trackID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_trackID_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__TRACK_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Volume feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolumePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_volume_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__VOLUME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_pan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_pan_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__PAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Solo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoloPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_solo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_solo_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__SOLO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Send feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_send_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_send_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__SEND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Arm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_arm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_arm_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__ARM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMutePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_mute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_mute_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__MUTE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDelayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_delay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_delay_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__DELAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_LiveTrack_coarse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_coarse_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__COARSE,
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
				 getString("_UI_LiveTrack_fine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_fine_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__FINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Beats feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBeatsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_beats_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_beats_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__BEATS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_state_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Clips feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClipsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_clips_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_clips_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__CLIPS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Track Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrackNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_trackName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_trackName_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__TRACK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_LiveTrack_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_color_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Meter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftMeterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_leftMeter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_leftMeter_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__LEFT_METER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Meter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightMeterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LiveTrack_rightMeter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_rightMeter_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__RIGHT_METER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_LiveTrack_lastSeen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LiveTrack_lastSeen_feature", "_UI_LiveTrack_type"),
				 EzabletonctrlPackage.Literals.LIVE_TRACK__LAST_SEEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(EzabletonctrlPackage.Literals.LIVE_TRACK__DEVICES);
			childrenFeatures.add(EzabletonctrlPackage.Literals.LIVE_TRACK__VIEW);
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
	 * This returns LiveTrack.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LiveTrack"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LiveTrack)object).getTrackName();
		return label == null || label.length() == 0 ?
			getString("_UI_LiveTrack_type") :
			getString("_UI_LiveTrack_type") + " " + label;
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

		switch (notification.getFeatureID(LiveTrack.class)) {
			case EzabletonctrlPackage.LIVE_TRACK__TRACK_ID:
			case EzabletonctrlPackage.LIVE_TRACK__VOLUME:
			case EzabletonctrlPackage.LIVE_TRACK__PAN:
			case EzabletonctrlPackage.LIVE_TRACK__SOLO:
			case EzabletonctrlPackage.LIVE_TRACK__SEND:
			case EzabletonctrlPackage.LIVE_TRACK__ARM:
			case EzabletonctrlPackage.LIVE_TRACK__MUTE:
			case EzabletonctrlPackage.LIVE_TRACK__DELAY:
			case EzabletonctrlPackage.LIVE_TRACK__COARSE:
			case EzabletonctrlPackage.LIVE_TRACK__FINE:
			case EzabletonctrlPackage.LIVE_TRACK__BEATS:
			case EzabletonctrlPackage.LIVE_TRACK__STATE:
			case EzabletonctrlPackage.LIVE_TRACK__TRACK_NAME:
			case EzabletonctrlPackage.LIVE_TRACK__COLOR:
			case EzabletonctrlPackage.LIVE_TRACK__LEFT_METER:
			case EzabletonctrlPackage.LIVE_TRACK__RIGHT_METER:
			case EzabletonctrlPackage.LIVE_TRACK__LAST_SEEN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzabletonctrlPackage.LIVE_TRACK__DEVICES:
			case EzabletonctrlPackage.LIVE_TRACK__VIEW:
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
				(EzabletonctrlPackage.Literals.LIVE_TRACK__DEVICES,
				 EzabletonctrlFactory.eINSTANCE.createPlaceHolderDevice()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.LIVE_TRACK__VIEW,
				 EzabletonctrlFactory.eINSTANCE.createLiveTrackView()));
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
