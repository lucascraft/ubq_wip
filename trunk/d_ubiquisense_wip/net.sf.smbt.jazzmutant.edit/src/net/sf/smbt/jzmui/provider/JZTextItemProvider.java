/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jzmui.JZText;
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
 * This is the item provider adapter for a {@link net.sf.smbt.jzmui.JZText} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JZTextItemProvider
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
	public JZTextItemProvider(AdapterFactory adapterFactory) {
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
			addTextPropertyDescriptor(object);
			addFontPropertyDescriptor(object);
			addTransparentPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addLightPropertyDescriptor(object);
			addFontSizePropertyDescriptor(object);
			addFontAlignPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZText_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZText_text_feature", "_UI_JZText_type"),
				 JzmuiPackage.Literals.JZ_TEXT__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZText_font_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZText_font_feature", "_UI_JZText_type"),
				 JzmuiPackage.Literals.JZ_TEXT__FONT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transparent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZText_transparent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZText_transparent_feature", "_UI_JZText_type"),
				 JzmuiPackage.Literals.JZ_TEXT__TRANSPARENT,
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
				 getString("_UI_JZText_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZText_color_feature", "_UI_JZText_type"),
				 JzmuiPackage.Literals.JZ_TEXT__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Light feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZText_light_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZText_light_feature", "_UI_JZText_type"),
				 JzmuiPackage.Literals.JZ_TEXT__LIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZText_fontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZText_fontSize_feature", "_UI_JZText_type"),
				 JzmuiPackage.Literals.JZ_TEXT__FONT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Font Align feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFontAlignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZText_fontAlign_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZText_fontAlign_feature", "_UI_JZText_type"),
				 JzmuiPackage.Literals.JZ_TEXT__FONT_ALIGN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	 * This returns JZText.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JZText"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JZText)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JZText_type") :
			getString("_UI_JZText_type") + " " + label;
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

		switch (notification.getFeatureID(JZText.class)) {
			case JzmuiPackage.JZ_TEXT__FONT_STYLE:
			case JzmuiPackage.JZ_TEXT__BOUNDS:
			case JzmuiPackage.JZ_TEXT__FONT_NAME:
			case JzmuiPackage.JZ_TEXT__NAME:
			case JzmuiPackage.JZ_TEXT__PARENT_TARGET:
			case JzmuiPackage.JZ_TEXT__PRIMARY_OSC_TARGET:
			case JzmuiPackage.JZ_TEXT__PRIMARY_MIDI_TARGET:
			case JzmuiPackage.JZ_TEXT__TEXT:
			case JzmuiPackage.JZ_TEXT__FONT:
			case JzmuiPackage.JZ_TEXT__TRANSPARENT:
			case JzmuiPackage.JZ_TEXT__COLOR:
			case JzmuiPackage.JZ_TEXT__LIGHT:
			case JzmuiPackage.JZ_TEXT__FONT_SIZE:
			case JzmuiPackage.JZ_TEXT__FONT_ALIGN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JzmuiPackage.JZ_TEXT__OSC_PROPS:
			case JzmuiPackage.JZ_TEXT__MIDI_PROPS:
			case JzmuiPackage.JZ_TEXT__SCRIPTS:
			case JzmuiPackage.JZ_TEXT__TARGET_FEATURES:
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