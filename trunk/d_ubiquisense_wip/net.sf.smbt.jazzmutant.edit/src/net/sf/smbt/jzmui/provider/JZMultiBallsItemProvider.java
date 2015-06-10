/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jzmui.JZMultiBalls;
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
 * This is the item provider adapter for a {@link net.sf.smbt.jzmui.JZMultiBalls} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JZMultiBallsItemProvider
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
	public JZMultiBallsItemProvider(AdapterFactory adapterFactory) {
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
			addNumbersPropertyDescriptor(object);
			addMultilabelPropertyDescriptor(object);
			addMultiColorPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
			addZPropertyDescriptor(object);
			addAttackPropertyDescriptor(object);
			addDecayPropertyDescriptor(object);
			addFrictionPropertyDescriptor(object);
			addHoldPropertyDescriptor(object);
			addHoldXPropertyDescriptor(object);
			addHoldYPropertyDescriptor(object);
			addReleasePropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addSustainPropertyDescriptor(object);
			addGridStepXPropertyDescriptor(object);
			addGridStepYPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addLightPropertyDescriptor(object);
			addTensionPropertyDescriptor(object);
			addDataPropertyDescriptor(object);
			addNumbersVisiblePropertyDescriptor(object);
			addBallsPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addLabelVisiblePropertyDescriptor(object);
			addPhysicsPropertyDescriptor(object);
			addCursorModePropertyDescriptor(object);
			addAttractionPropertyDescriptor(object);
			addCapturePropertyDescriptor(object);
			addGridActivePropertyDescriptor(object);
			addEphemeralPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Numbers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumbersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_numbers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_numbers_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multilabel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultilabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_multilabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_multilabel_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTILABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multi Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_multiColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_multiColor_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTI_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_data_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_data_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Numbers Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumbersVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_numbersVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_numbersVisible_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Balls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBallsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_balls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_balls_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__BALLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_JZMultiBalls_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_color_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_labelVisible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_labelVisible_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__LABEL_VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_JZMultiBalls_physics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_physics_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__PHYSICS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JZMultiBalls_cursorMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_cursorMode_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__CURSOR_MODE,
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
				 getString("_UI_JZMultiBalls_attraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_attraction_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTRACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZMultiBalls_capture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_capture_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__CAPTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_gridActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_gridActive_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_ACTIVE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ephemeral feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEphemeralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_ephemeral_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_ephemeral_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__EPHEMERAL,
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
				 getString("_UI_JZMultiBalls_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_x_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZMultiBalls_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_y_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_z_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_z_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZMultiBalls_attack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_attack_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTACK,
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
				 getString("_UI_JZMultiBalls_decay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_decay_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__DECAY,
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
				 getString("_UI_JZMultiBalls_friction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_friction_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__FRICTION,
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
				 getString("_UI_JZMultiBalls_hold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_hold_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hold X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoldXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_holdX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_holdX_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Hold Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHoldYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_holdY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_holdY_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_Y,
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
				 getString("_UI_JZMultiBalls_release_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_release_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__RELEASE,
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
				 getString("_UI_JZMultiBalls_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_speed_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__SPEED,
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
				 getString("_UI_JZMultiBalls_sustain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_sustain_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__SUSTAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid Step X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridStepXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_gridStepX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_gridStepX_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid Step Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridStepYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_gridStepY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_gridStepY_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_Y,
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
				 getString("_UI_JZMultiBalls_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_height_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_JZMultiBalls_light_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_light_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__LIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZMultiBalls_tension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZMultiBalls_tension_feature", "_UI_JZMultiBalls_type"),
				 JzmuiPackage.Literals.JZ_MULTI_BALLS__TENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
	 * This returns JZMultiBalls.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JZMultiBalls"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JZMultiBalls)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JZMultiBalls_type") :
			getString("_UI_JZMultiBalls_type") + " " + label;
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

		switch (notification.getFeatureID(JZMultiBalls.class)) {
			case JzmuiPackage.JZ_MULTI_BALLS__FONT_STYLE:
			case JzmuiPackage.JZ_MULTI_BALLS__BOUNDS:
			case JzmuiPackage.JZ_MULTI_BALLS__FONT_NAME:
			case JzmuiPackage.JZ_MULTI_BALLS__NAME:
			case JzmuiPackage.JZ_MULTI_BALLS__PARENT_TARGET:
			case JzmuiPackage.JZ_MULTI_BALLS__PRIMARY_OSC_TARGET:
			case JzmuiPackage.JZ_MULTI_BALLS__PRIMARY_MIDI_TARGET:
			case JzmuiPackage.JZ_MULTI_BALLS__NUMBERS:
			case JzmuiPackage.JZ_MULTI_BALLS__MULTILABEL:
			case JzmuiPackage.JZ_MULTI_BALLS__MULTI_COLOR:
			case JzmuiPackage.JZ_MULTI_BALLS__X:
			case JzmuiPackage.JZ_MULTI_BALLS__Y:
			case JzmuiPackage.JZ_MULTI_BALLS__Z:
			case JzmuiPackage.JZ_MULTI_BALLS__ATTACK:
			case JzmuiPackage.JZ_MULTI_BALLS__DECAY:
			case JzmuiPackage.JZ_MULTI_BALLS__FRICTION:
			case JzmuiPackage.JZ_MULTI_BALLS__HOLD:
			case JzmuiPackage.JZ_MULTI_BALLS__HOLD_X:
			case JzmuiPackage.JZ_MULTI_BALLS__HOLD_Y:
			case JzmuiPackage.JZ_MULTI_BALLS__RELEASE:
			case JzmuiPackage.JZ_MULTI_BALLS__SPEED:
			case JzmuiPackage.JZ_MULTI_BALLS__SUSTAIN:
			case JzmuiPackage.JZ_MULTI_BALLS__GRID_STEP_X:
			case JzmuiPackage.JZ_MULTI_BALLS__GRID_STEP_Y:
			case JzmuiPackage.JZ_MULTI_BALLS__HEIGHT:
			case JzmuiPackage.JZ_MULTI_BALLS__LIGHT:
			case JzmuiPackage.JZ_MULTI_BALLS__TENSION:
			case JzmuiPackage.JZ_MULTI_BALLS__DATA:
			case JzmuiPackage.JZ_MULTI_BALLS__NUMBERS_VISIBLE:
			case JzmuiPackage.JZ_MULTI_BALLS__BALLS:
			case JzmuiPackage.JZ_MULTI_BALLS__COLOR:
			case JzmuiPackage.JZ_MULTI_BALLS__LABEL_VISIBLE:
			case JzmuiPackage.JZ_MULTI_BALLS__PHYSICS:
			case JzmuiPackage.JZ_MULTI_BALLS__CURSOR_MODE:
			case JzmuiPackage.JZ_MULTI_BALLS__ATTRACTION:
			case JzmuiPackage.JZ_MULTI_BALLS__CAPTURE:
			case JzmuiPackage.JZ_MULTI_BALLS__GRID_ACTIVE:
			case JzmuiPackage.JZ_MULTI_BALLS__EPHEMERAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JzmuiPackage.JZ_MULTI_BALLS__OSC_PROPS:
			case JzmuiPackage.JZ_MULTI_BALLS__MIDI_PROPS:
			case JzmuiPackage.JZ_MULTI_BALLS__SCRIPTS:
			case JzmuiPackage.JZ_MULTI_BALLS__TARGET_FEATURES:
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
