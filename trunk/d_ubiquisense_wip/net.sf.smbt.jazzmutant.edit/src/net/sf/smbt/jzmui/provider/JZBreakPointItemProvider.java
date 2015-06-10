/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jzmui.JZBreakPoint;
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
 * This is the item provider adapter for a {@link net.sf.smbt.jzmui.JZBreakPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JZBreakPointItemProvider
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
	public JZBreakPointItemProvider(AdapterFactory adapterFactory) {
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
			addLiveEditingPropertyDescriptor(object);
			addPointsPropertyDescriptor(object);
			addCoordinatesPropertyDescriptor(object);
			addBackgroundPropertyDescriptor(object);
			addFirstPointPropertyDescriptor(object);
			addLightPropertyDescriptor(object);
			addFrictionPropertyDescriptor(object);
			addHoldPropertyDescriptor(object);
			addHoldXPropertyDescriptor(object);
			addHoldYPropertyDescriptor(object);
			addAttractionPropertyDescriptor(object);
			addEditPropertyDescriptor(object);
			addRestPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addValuesPropertyDescriptor(object);
			addPathDataPropertyDescriptor(object);
			addGridPropertyDescriptor(object);
			addGridXPropertyDescriptor(object);
			addGridYPropertyDescriptor(object);
			addFreeFormPropertyDescriptor(object);
			addPhysicsPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Live Editing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLiveEditingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_liveEditing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_liveEditing_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__LIVE_EDITING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_points_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_points_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__POINTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coordinates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_coordinates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_coordinates_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__COORDINATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_background_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_background_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__BACKGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Point feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstPointPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_firstPoint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_firstPoint_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__FIRST_POINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_JZBreakPoint_light_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_light_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__LIGHT,
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
				 getString("_UI_JZBreakPoint_friction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_friction_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__FRICTION,
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
				 getString("_UI_JZBreakPoint_hold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_hold_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD,
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
				 getString("_UI_JZBreakPoint_holdX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_holdX_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_X,
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
				 getString("_UI_JZBreakPoint_holdY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_holdY_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_Y,
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
				 getString("_UI_JZBreakPoint_attraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_attraction_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__ATTRACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_edit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_edit_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__EDIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rest feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_rest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_rest_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__REST,
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
				 getString("_UI_JZBreakPoint_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_speed_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_values_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_values_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Path Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_pathData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_pathData_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__PATH_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JZBreakPoint_grid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_grid_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__GRID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_gridX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_gridX_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__GRID_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_gridY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_gridY_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__GRID_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Free Form feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreeFormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JZBreakPoint_freeForm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_freeForm_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__FREE_FORM,
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
				 getString("_UI_JZBreakPoint_physics_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_physics_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__PHYSICS,
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
				 getString("_UI_JZBreakPoint_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_color_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_JZBreakPoint_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_x_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__X,
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
				 getString("_UI_JZBreakPoint_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JZBreakPoint_y_feature", "_UI_JZBreakPoint_type"),
				 JzmuiPackage.Literals.JZ_BREAK_POINT__Y,
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
	 * This returns JZBreakPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JZBreakPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((JZBreakPoint)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JZBreakPoint_type") :
			getString("_UI_JZBreakPoint_type") + " " + label;
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

		switch (notification.getFeatureID(JZBreakPoint.class)) {
			case JzmuiPackage.JZ_BREAK_POINT__FONT_STYLE:
			case JzmuiPackage.JZ_BREAK_POINT__BOUNDS:
			case JzmuiPackage.JZ_BREAK_POINT__FONT_NAME:
			case JzmuiPackage.JZ_BREAK_POINT__NAME:
			case JzmuiPackage.JZ_BREAK_POINT__PARENT_TARGET:
			case JzmuiPackage.JZ_BREAK_POINT__PRIMARY_OSC_TARGET:
			case JzmuiPackage.JZ_BREAK_POINT__PRIMARY_MIDI_TARGET:
			case JzmuiPackage.JZ_BREAK_POINT__LIVE_EDITING:
			case JzmuiPackage.JZ_BREAK_POINT__POINTS:
			case JzmuiPackage.JZ_BREAK_POINT__COORDINATES:
			case JzmuiPackage.JZ_BREAK_POINT__BACKGROUND:
			case JzmuiPackage.JZ_BREAK_POINT__FIRST_POINT:
			case JzmuiPackage.JZ_BREAK_POINT__LIGHT:
			case JzmuiPackage.JZ_BREAK_POINT__FRICTION:
			case JzmuiPackage.JZ_BREAK_POINT__HOLD:
			case JzmuiPackage.JZ_BREAK_POINT__HOLD_X:
			case JzmuiPackage.JZ_BREAK_POINT__HOLD_Y:
			case JzmuiPackage.JZ_BREAK_POINT__ATTRACTION:
			case JzmuiPackage.JZ_BREAK_POINT__EDIT:
			case JzmuiPackage.JZ_BREAK_POINT__REST:
			case JzmuiPackage.JZ_BREAK_POINT__SPEED:
			case JzmuiPackage.JZ_BREAK_POINT__VALUES:
			case JzmuiPackage.JZ_BREAK_POINT__PATH_DATA:
			case JzmuiPackage.JZ_BREAK_POINT__GRID:
			case JzmuiPackage.JZ_BREAK_POINT__GRID_X:
			case JzmuiPackage.JZ_BREAK_POINT__GRID_Y:
			case JzmuiPackage.JZ_BREAK_POINT__FREE_FORM:
			case JzmuiPackage.JZ_BREAK_POINT__PHYSICS:
			case JzmuiPackage.JZ_BREAK_POINT__COLOR:
			case JzmuiPackage.JZ_BREAK_POINT__X:
			case JzmuiPackage.JZ_BREAK_POINT__Y:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JzmuiPackage.JZ_BREAK_POINT__OSC_PROPS:
			case JzmuiPackage.JZ_BREAK_POINT__MIDI_PROPS:
			case JzmuiPackage.JZ_BREAK_POINT__SCRIPTS:
			case JzmuiPackage.JZ_BREAK_POINT__TARGET_FEATURES:
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
