/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.VARIABLE;

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
 * This is the item provider adapter for a {@link net.sf.smbt.jazzmutant.model.jzml.VARIABLE} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VARIABLEItemProvider
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
	public VARIABLEItemProvider(AdapterFactory adapterFactory) {
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

			addColorPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addKbmouseMessagePropertyDescriptor(object);
			addKbmouseScalePropertyDescriptor(object);
			addKbmouseTargetPropertyDescriptor(object);
			addKbmouseTriggerPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addMetaPropertyDescriptor(object);
			addMidiMessagePropertyDescriptor(object);
			addMidiScalePropertyDescriptor(object);
			addMidiTargetPropertyDescriptor(object);
			addMidiTriggerPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addOscMessagePropertyDescriptor(object);
			addOscScalePropertyDescriptor(object);
			addOscTargetPropertyDescriptor(object);
			addOscTriggerPropertyDescriptor(object);
			addSendPropertyDescriptor(object);
			addTabbarPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
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
				 getString("_UI_VARIABLE_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_name_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_value_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__VALUE,
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
				 getString("_UI_VARIABLE_send_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_send_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__SEND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Osc Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOscTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_oscTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_oscTarget_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__OSC_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Osc Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOscTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_oscTrigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_oscTrigger_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__OSC_TRIGGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Osc Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOscMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_oscMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_oscMessage_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__OSC_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Osc Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOscScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_oscScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_oscScale_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__OSC_SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_midiTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_midiTarget_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__MIDI_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_midiTrigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_midiTrigger_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__MIDI_TRIGGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_midiMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_midiMessage_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__MIDI_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Midi Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMidiScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_midiScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_midiScale_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__MIDI_SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kbmouse Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKbmouseTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_kbmouseTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_kbmouseTarget_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__KBMOUSE_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kbmouse Trigger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKbmouseTriggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_kbmouseTrigger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_kbmouseTrigger_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__KBMOUSE_TRIGGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kbmouse Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKbmouseMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_kbmouseMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_kbmouseMessage_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__KBMOUSE_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Kbmouse Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKbmouseScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_kbmouseScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_kbmouseScale_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__KBMOUSE_SCALE,
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
				 getString("_UI_VARIABLE_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_color_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_label_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabbar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabbarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_tabbar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_tabbar_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__TABBAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMetaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VARIABLE_meta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_meta_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__META,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_VARIABLE_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VARIABLE_id_feature", "_UI_VARIABLE_type"),
				 JzmlPackage.Literals.VARIABLE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns VARIABLE.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VARIABLE"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VARIABLE)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VARIABLE_type") :
			getString("_UI_VARIABLE_type") + " " + label;
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

		switch (notification.getFeatureID(VARIABLE.class)) {
			case JzmlPackage.VARIABLE__COLOR:
			case JzmlPackage.VARIABLE__ID:
			case JzmlPackage.VARIABLE__KBMOUSE_MESSAGE:
			case JzmlPackage.VARIABLE__KBMOUSE_SCALE:
			case JzmlPackage.VARIABLE__KBMOUSE_TARGET:
			case JzmlPackage.VARIABLE__KBMOUSE_TRIGGER:
			case JzmlPackage.VARIABLE__LABEL:
			case JzmlPackage.VARIABLE__META:
			case JzmlPackage.VARIABLE__MIDI_MESSAGE:
			case JzmlPackage.VARIABLE__MIDI_SCALE:
			case JzmlPackage.VARIABLE__MIDI_TARGET:
			case JzmlPackage.VARIABLE__MIDI_TRIGGER:
			case JzmlPackage.VARIABLE__NAME:
			case JzmlPackage.VARIABLE__OSC_MESSAGE:
			case JzmlPackage.VARIABLE__OSC_SCALE:
			case JzmlPackage.VARIABLE__OSC_TARGET:
			case JzmlPackage.VARIABLE__OSC_TRIGGER:
			case JzmlPackage.VARIABLE__SEND:
			case JzmlPackage.VARIABLE__TABBAR:
			case JzmlPackage.VARIABLE__VALUE:
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
		return JzmlEditPlugin.INSTANCE;
	}

}
