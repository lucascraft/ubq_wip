/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezabletonctrl.AbletonLive;
import net.sf.smbt.ezabletonctrl.EzabletonctrlFactory;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.xqz.model.engine.EnginePackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.ezabletonctrl.AbletonLive} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbletonLiveItemProvider
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
	public AbletonLiveItemProvider(AdapterFactory adapterFactory) {
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

			addEnginesPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
			addVerPropertyDescriptor(object);
			addMasterTrackPropertyDescriptor(object);
			addCurrentScenePropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addOverdubPropertyDescriptor(object);
			addVolumePropertyDescriptor(object);
			addTimePropertyDescriptor(object);
			addTempoPropertyDescriptor(object);
			addUbqtNotificationOnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Engines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnginesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IConnectedUnit_engines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IConnectedUnit_engines_feature", "_UI_IConnectedUnit_type"),
				 EnginePackage.Literals.ICONNECTED_UNIT__ENGINES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbletonLive_ver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_ver_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__VER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Current Scene feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentScenePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbletonLive_currentScene_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_currentScene_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__CURRENT_SCENE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Master Track feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterTrackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbletonLive_masterTrack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_masterTrack_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__MASTER_TRACK,
				 true,
				 false,
				 true,
				 null,
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
				 getString("_UI_AbletonLive_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_state_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Overdub feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOverdubPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbletonLive_overdub_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_overdub_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__OVERDUB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_AbletonLive_volume_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_volume_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__VOLUME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbletonLive_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_time_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tempo feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTempoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbletonLive_tempo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_tempo_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__TEMPO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IConnectedUnit_default_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IConnectedUnit_default_feature", "_UI_IConnectedUnit_type"),
				 EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ubqt Notification On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUbqtNotificationOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbletonLive_ubqtNotificationOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbletonLive_ubqtNotificationOn_feature", "_UI_AbletonLive_type"),
				 EzabletonctrlPackage.Literals.ABLETON_LIVE__UBQT_NOTIFICATION_ON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(EzabletonctrlPackage.Literals.ABLETON_LIVE__TRACKS);
			childrenFeatures.add(EzabletonctrlPackage.Literals.ABLETON_LIVE__SCENES);
			childrenFeatures.add(EzabletonctrlPackage.Literals.ABLETON_LIVE__CLIPS);
			childrenFeatures.add(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES);
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
	 * This returns AbletonLive.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbletonLive"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbletonLive)object).getVer();
		return label == null || label.length() == 0 ?
			getString("_UI_AbletonLive_type") :
			getString("_UI_AbletonLive_type") + " " + label;
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

		switch (notification.getFeatureID(AbletonLive.class)) {
			case EzabletonctrlPackage.ABLETON_LIVE__VER:
			case EzabletonctrlPackage.ABLETON_LIVE__STATE:
			case EzabletonctrlPackage.ABLETON_LIVE__OVERDUB:
			case EzabletonctrlPackage.ABLETON_LIVE__VOLUME:
			case EzabletonctrlPackage.ABLETON_LIVE__TIME:
			case EzabletonctrlPackage.ABLETON_LIVE__TEMPO:
			case EzabletonctrlPackage.ABLETON_LIVE__UBQT_NOTIFICATION_ON:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzabletonctrlPackage.ABLETON_LIVE__TRACKS:
			case EzabletonctrlPackage.ABLETON_LIVE__SCENES:
			case EzabletonctrlPackage.ABLETON_LIVE__CLIPS:
			case EzabletonctrlPackage.ABLETON_LIVE__CONTROL_SURFACES:
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
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__TRACKS,
				 EzabletonctrlFactory.eINSTANCE.createLiveTrack()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__TRACKS,
				 EzabletonctrlFactory.eINSTANCE.createLiveMaster()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__SCENES,
				 EzabletonctrlFactory.eINSTANCE.createLiveScene()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CLIPS,
				 EzabletonctrlFactory.eINSTANCE.createLiveClip()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createControlSurface()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createTransportComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createSessionComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createClipSlotComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createChannelStripComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createMixerComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createDeviceComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createButtonComponent()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createButtonMatrixElement()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createSliderElement()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createEncoderElement()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createRingedEcoderElement()));

		newChildDescriptors.add
			(createChildParameter
				(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES,
				 EzabletonctrlFactory.eINSTANCE.createPhysicalDisplayElement()));
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
