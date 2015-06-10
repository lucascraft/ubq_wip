/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jzmui.JzmuiFactory;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LemurLiveApp;
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
 * This is the item provider adapter for a {@link net.sf.smbt.jzmui.LemurLiveApp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LemurLiveAppItemProvider
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
	public LemurLiveAppItemProvider(AdapterFactory adapterFactory) {
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
			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LemurLiveApp_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LemurLiveApp_width_feature", "_UI_LemurLiveApp_type"),
				 JzmuiPackage.Literals.LEMUR_LIVE_APP__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LemurLiveApp_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LemurLiveApp_height_feature", "_UI_LemurLiveApp_type"),
				 JzmuiPackage.Literals.LEMUR_LIVE_APP__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LemurLiveApp_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LemurLiveApp_id_feature", "_UI_LemurLiveApp_type"),
				 JzmuiPackage.Literals.LEMUR_LIVE_APP__ID,
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
			childrenFeatures.add(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS);
			childrenFeatures.add(JzmuiPackage.Literals.LEMUR_LIVE_APP__CONFIGURATIONS);
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
	 * This returns LemurLiveApp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LemurLiveApp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LemurLiveApp lemurLiveApp = (LemurLiveApp)object;
		return getString("_UI_LemurLiveApp_type") + " " + lemurLiveApp.getId();
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

		switch (notification.getFeatureID(LemurLiveApp.class)) {
			case JzmuiPackage.LEMUR_LIVE_APP__WIDTH:
			case JzmuiPackage.LEMUR_LIVE_APP__HEIGHT:
			case JzmuiPackage.LEMUR_LIVE_APP__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JzmuiPackage.LEMUR_LIVE_APP__ELEMENTS:
			case JzmuiPackage.LEMUR_LIVE_APP__CONFIGURATIONS:
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
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZContainer()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZBreakPoint()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZFader()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZGesture()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZKnob()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZLed()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZLemurMenu()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZLemurMonitor()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZPads()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZSurfaceLCD()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZSwitches()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZText()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZCustomButton()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZSignalScope()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZRange()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZMultiBalls()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZTrack()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZmultiSlider()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZRingArea()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__ELEMENTS,
				 JzmuiFactory.eINSTANCE.createJZJazzInterface()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.LEMUR_LIVE_APP__CONFIGURATIONS,
				 JzmuiFactory.eINSTANCE.createJZConfigurationManager()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JzmuiEditPlugin.INSTANCE;
	}

}
