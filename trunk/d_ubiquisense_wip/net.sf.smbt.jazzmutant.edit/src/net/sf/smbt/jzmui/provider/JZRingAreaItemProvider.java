/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jzmui.JZRingArea;
import net.sf.smbt.jzmui.JzmuiFactory;
import net.sf.smbt.jzmui.JzmuiPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.jzmui.JZRingArea} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JZRingAreaItemProvider
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
	public JZRingAreaItemProvider(AdapterFactory adapterFactory) {
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

			addFontStylePropertyDescriptor(object);
			addBoundsPropertyDescriptor(object);
			addFontNamePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addParentTargetPropertyDescriptor(object);
			addPrimaryOscTargetPropertyDescriptor(object);
			addPrimaryMidiTargetPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addFrictionPropertyDescriptor(object);
			addAttractionPropertyDescriptor(object);
			addAttraction_xPropertyDescriptor(object);
			addAttraction_yPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addValueActivePropertyDescriptor(object);
			addCapturePropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Font Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZUIElem_fontStyle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZUIElem_fontStyle_feature", "_UI_JZUIElem_type"),
				 JzmuiPackage.Literals.JZUI_ELEM__FONT_STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_JZUIElem_bounds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZUIElem_bounds_feature", "_UI_JZUIElem_type"),
				 JzmuiPackage.Literals.JZUI_ELEM__BOUNDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZUIElem_fontName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZUIElem_fontName_feature", "_UI_JZUIElem_type"),
				 JzmuiPackage.Literals.JZUI_ELEM__FONT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_JZUIElem_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZUIElem_name_feature", "_UI_JZUIElem_type"),
				 JzmuiPackage.Literals.JZUI_ELEM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZUIElem_parentTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZUIElem_parentTarget_feature", "_UI_JZUIElem_type"),
				 JzmuiPackage.Literals.JZUI_ELEM__PARENT_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Osc Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryOscTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZWidget_primaryOscTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZWidget_primaryOscTarget_feature", "_UI_JZWidget_type"),
				 JzmuiPackage.Literals.JZ_WIDGET__PRIMARY_OSC_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Midi Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryMidiTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZWidget_primaryMidiTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZWidget_primaryMidiTarget_feature", "_UI_JZWidget_type"),
				 JzmuiPackage.Literals.JZ_WIDGET__PRIMARY_MIDI_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_speed_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Friction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrictionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_friction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_friction_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__FRICTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attraction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttractionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_attraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_attraction_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attraction x feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttraction_xPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_attraction_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_attraction_x_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attraction y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttraction_yPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_attraction_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_attraction_y_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZRingArea_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_color_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_valueActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_valueActive_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__VALUE_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Capture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_capture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_capture_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__CAPTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_x_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZRingArea_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZRingArea_y_feature", "_UI_JZRingArea_type"),
				 JzmuiPackage.Literals.JZ_RING_AREA__Y,
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
			childrenFeatures.add(JzmuiPackage.Literals.JZUI_ELEM__OSC_PROPS);
			childrenFeatures.add(JzmuiPackage.Literals.JZUI_ELEM__MIDI_PROPS);
			childrenFeatures.add(JzmuiPackage.Literals.JZUI_ELEM__SCRIPTS);
			childrenFeatures.add(JzmuiPackage.Literals.JZUI_ELEM__TARGET_FEATURES);
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
	 * This returns JZRingArea.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JZRingArea"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JZRingArea)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JZRingArea_type") :
			getString("_UI_JZRingArea_type") + " " + label;
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

		switch (notification.getFeatureID(JZRingArea.class)) {
			case JzmuiPackage.JZ_RING_AREA__FONT_STYLE:
			case JzmuiPackage.JZ_RING_AREA__BOUNDS:
			case JzmuiPackage.JZ_RING_AREA__FONT_NAME:
			case JzmuiPackage.JZ_RING_AREA__NAME:
			case JzmuiPackage.JZ_RING_AREA__PARENT_TARGET:
			case JzmuiPackage.JZ_RING_AREA__PRIMARY_OSC_TARGET:
			case JzmuiPackage.JZ_RING_AREA__PRIMARY_MIDI_TARGET:
			case JzmuiPackage.JZ_RING_AREA__SPEED:
			case JzmuiPackage.JZ_RING_AREA__FRICTION:
			case JzmuiPackage.JZ_RING_AREA__ATTRACTION:
			case JzmuiPackage.JZ_RING_AREA__ATTRACTION_X:
			case JzmuiPackage.JZ_RING_AREA__ATTRACTION_Y:
			case JzmuiPackage.JZ_RING_AREA__COLOR:
			case JzmuiPackage.JZ_RING_AREA__VALUE_ACTIVE:
			case JzmuiPackage.JZ_RING_AREA__CAPTURE:
			case JzmuiPackage.JZ_RING_AREA__X:
			case JzmuiPackage.JZ_RING_AREA__Y:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JzmuiPackage.JZ_RING_AREA__OSC_PROPS:
			case JzmuiPackage.JZ_RING_AREA__MIDI_PROPS:
			case JzmuiPackage.JZ_RING_AREA__SCRIPTS:
			case JzmuiPackage.JZ_RING_AREA__TARGET_FEATURES:
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
				(JzmuiPackage.Literals.JZUI_ELEM__OSC_PROPS,
				 JzmuiFactory.eINSTANCE.createJzOscVar()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.JZUI_ELEM__MIDI_PROPS,
				 JzmuiFactory.eINSTANCE.createJzMidiVar()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.JZUI_ELEM__SCRIPTS,
				 JzmuiFactory.eINSTANCE.createScript()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.JZUI_ELEM__TARGET_FEATURES,
				 EcoreFactory.eINSTANCE.createEAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(JzmuiPackage.Literals.JZUI_ELEM__TARGET_FEATURES,
				 EcoreFactory.eINSTANCE.createEReference()));
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
