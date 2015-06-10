/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiFactory;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchOscTabPageItemProvider
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
	public TouchOscTabPageItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addLayoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscTabPage_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscTabPage_name_feature", "_UI_TouchOscTabPage_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Layout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLayoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscTabPage_layout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscTabPage_layout_feature", "_UI_TouchOscTabPage_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__LAYOUT,
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
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__FADERS_H);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__XY_PADS);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__FADERS_V);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__LABELS_H);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__PUSHES);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__LABELS_V);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__LEDS);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__ROTARIES_V);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__ROTARIES_H);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__TOGGLES);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__ENCODERS);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__BATTERIES_H);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__BATTERIES_V);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__TIMES_V);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__TIMES_H);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H);
			childrenFeatures.add(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V);
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
	 * This returns TouchOscTabPage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TouchOscTabPage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TouchOscTabPage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TouchOscTabPage_type") :
			getString("_UI_TouchOscTabPage_type") + " " + label;
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

		switch (notification.getFeatureID(TouchOscTabPage.class)) {
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_H:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__XY_PADS:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_V:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_H:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__PUSHES:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_V:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LEDS:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_V:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_H:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TOGGLES:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ENCODERS:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_H:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_V:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_V:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_H:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H:
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V:
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
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__FADERS_H,
				 TouchoscguiFactory.eINSTANCE.createTouchOscFaderH()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__XY_PADS,
				 TouchoscguiFactory.eINSTANCE.createTouchOscXYPad()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__FADERS_V,
				 TouchoscguiFactory.eINSTANCE.createTouchOscFaderV()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__LABELS_H,
				 TouchoscguiFactory.eINSTANCE.createTouchOscLabelH()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__PUSHES,
				 TouchoscguiFactory.eINSTANCE.createTouchOscPush()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__LABELS_V,
				 TouchoscguiFactory.eINSTANCE.createTouchOscLabelV()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES,
				 TouchoscguiFactory.eINSTANCE.createTouchOscMultiToggle()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__LEDS,
				 TouchoscguiFactory.eINSTANCE.createTouchOscLED()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__ROTARIES_V,
				 TouchoscguiFactory.eINSTANCE.createTouchOscRotaryV()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__ROTARIES_H,
				 TouchoscguiFactory.eINSTANCE.createTouchOscRotaryH()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__TOGGLES,
				 TouchoscguiFactory.eINSTANCE.createTouchOscToggle()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__ENCODERS,
				 TouchoscguiFactory.eINSTANCE.createTouchOscEncoder()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__BATTERIES_H,
				 TouchoscguiFactory.eINSTANCE.createTouchOscBatteryH()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__BATTERIES_V,
				 TouchoscguiFactory.eINSTANCE.createTouchOscBatteryV()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__TIMES_V,
				 TouchoscguiFactory.eINSTANCE.createTouchOscTimeV()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__TIMES_H,
				 TouchoscguiFactory.eINSTANCE.createTouchOscTimeH()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES,
				 TouchoscguiFactory.eINSTANCE.createTouchOscMultiPush()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H,
				 TouchoscguiFactory.eINSTANCE.createTouchOscMultiFaderH()));

		newChildDescriptors.add
			(createChildParameter
				(TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V,
				 TouchoscguiFactory.eINSTANCE.createTouchOscMultiFaderV()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TouchoscguiEditPlugin.INSTANCE;
	}

}
