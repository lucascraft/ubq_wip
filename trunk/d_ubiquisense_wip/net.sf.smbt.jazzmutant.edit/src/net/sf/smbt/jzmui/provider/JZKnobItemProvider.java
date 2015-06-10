/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jzmui.JZKnob;
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
 * This is the item provider adapter for a {@link net.sf.smbt.jzmui.JZKnob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JZKnobItemProvider
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
	public JZKnobItemProvider(AdapterFactory adapterFactory) {
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
			addEndlessKnobPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addPrecisionPropertyDescriptor(object);
			addBackgroudPropertyDescriptor(object);
			addForegroundPropertyDescriptor(object);
			addAttackPropertyDescriptor(object);
			addSustainPropertyDescriptor(object);
			addDecayPropertyDescriptor(object);
			addReleasePropertyDescriptor(object);
			addHoldPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addValueActivePropertyDescriptor(object);
			addGridPropertyDescriptor(object);
			addCursorModePropertyDescriptor(object);
			addControlModePropertyDescriptor(object);
			addPhysicsPropertyDescriptor(object);
			addAttractionPropertyDescriptor(object);
			addFrictionPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addXPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Endless Knob feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndlessKnobPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_endlessKnob_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_endlessKnob_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__ENDLESS_KNOB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_JZKnob_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_value_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_unit_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Precision feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrecisionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_precision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_precision_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__PRECISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Backgroud feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroudPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_backgroud_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_backgroud_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__BACKGROUD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Foreground feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForegroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_foreground_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_foreground_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__FOREGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_attack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_attack_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__ATTACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sustain feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSustainPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_sustain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_sustain_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__SUSTAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Decay feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDecayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_decay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_decay_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__DECAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Release feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_release_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_release_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__RELEASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_hold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_hold_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__HOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZKnob_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_label_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_JZKnob_valueActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_valueActive_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__VALUE_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_grid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_grid_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__GRID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cursor Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCursorModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_cursorMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_cursorMode_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__CURSOR_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Control Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_controlMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_controlMode_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__CONTROL_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physics feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZKnob_physics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_physics_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__PHYSICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JZKnob_attraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_attraction_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__ATTRACTION,
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
				 getString("_UI_JZKnob_friction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_friction_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__FRICTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZKnob_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_speed_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZKnob_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZKnob_x_feature", "_UI_JZKnob_type"),
				 JzmuiPackage.Literals.JZ_KNOB__X,
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
	 * This returns JZKnob.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JZKnob"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JZKnob)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JZKnob_type") :
			getString("_UI_JZKnob_type") + " " + label;
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

		switch (notification.getFeatureID(JZKnob.class)) {
			case JzmuiPackage.JZ_KNOB__FONT_STYLE:
			case JzmuiPackage.JZ_KNOB__BOUNDS:
			case JzmuiPackage.JZ_KNOB__FONT_NAME:
			case JzmuiPackage.JZ_KNOB__NAME:
			case JzmuiPackage.JZ_KNOB__PARENT_TARGET:
			case JzmuiPackage.JZ_KNOB__PRIMARY_OSC_TARGET:
			case JzmuiPackage.JZ_KNOB__PRIMARY_MIDI_TARGET:
			case JzmuiPackage.JZ_KNOB__ENDLESS_KNOB:
			case JzmuiPackage.JZ_KNOB__VALUE:
			case JzmuiPackage.JZ_KNOB__UNIT:
			case JzmuiPackage.JZ_KNOB__PRECISION:
			case JzmuiPackage.JZ_KNOB__BACKGROUD:
			case JzmuiPackage.JZ_KNOB__FOREGROUND:
			case JzmuiPackage.JZ_KNOB__ATTACK:
			case JzmuiPackage.JZ_KNOB__SUSTAIN:
			case JzmuiPackage.JZ_KNOB__DECAY:
			case JzmuiPackage.JZ_KNOB__RELEASE:
			case JzmuiPackage.JZ_KNOB__HOLD:
			case JzmuiPackage.JZ_KNOB__LABEL:
			case JzmuiPackage.JZ_KNOB__VALUE_ACTIVE:
			case JzmuiPackage.JZ_KNOB__GRID:
			case JzmuiPackage.JZ_KNOB__CURSOR_MODE:
			case JzmuiPackage.JZ_KNOB__CONTROL_MODE:
			case JzmuiPackage.JZ_KNOB__PHYSICS:
			case JzmuiPackage.JZ_KNOB__ATTRACTION:
			case JzmuiPackage.JZ_KNOB__FRICTION:
			case JzmuiPackage.JZ_KNOB__SPEED:
			case JzmuiPackage.JZ_KNOB__X:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JzmuiPackage.JZ_KNOB__OSC_PROPS:
			case JzmuiPackage.JZ_KNOB__MIDI_PROPS:
			case JzmuiPackage.JZ_KNOB__SCRIPTS:
			case JzmuiPackage.JZ_KNOB__TARGET_FEATURES:
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
