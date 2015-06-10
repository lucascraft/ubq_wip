/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.jazzmutant.model.jzml.JzmlFactory;
import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.WINDOW;

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
 * This is the item provider adapter for a {@link net.sf.smbt.jazzmutant.model.jzml.WINDOW} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WINDOWItemProvider
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
	public WINDOWItemProvider(AdapterFactory adapterFactory) {
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

			addAccelerationPropertyDescriptor(object);
			addAnglePropertyDescriptor(object);
			addAttackPropertyDescriptor(object);
			addAttractionPropertyDescriptor(object);
			addAttractionXPropertyDescriptor(object);
			addAttractionYPropertyDescriptor(object);
			addAxisPropertyDescriptor(object);
			addBallsPropertyDescriptor(object);
			addBargraphPropertyDescriptor(object);
			addBehaviorPropertyDescriptor(object);
			addBipolarPropertyDescriptor(object);
			addBitmapPropertyDescriptor(object);
			addBoundariesPropertyDescriptor(object);
			addCapturePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addColumnPropertyDescriptor(object);
			addConstrainedPropertyDescriptor(object);
			addContentPropertyDescriptor(object);
			addCoordinatesPropertyDescriptor(object);
			addCursorPropertyDescriptor(object);
			addDecayPropertyDescriptor(object);
			addDisplayPropertyDescriptor(object);
			addEditPropertyDescriptor(object);
			addEditablePropertyDescriptor(object);
			addEphemerePropertyDescriptor(object);
			addFontPropertyDescriptor(object);
			addFreePropertyDescriptor(object);
			addFrictionPropertyDescriptor(object);
			addGradientPropertyDescriptor(object);
			addGridPropertyDescriptor(object);
			addGridStepsPropertyDescriptor(object);
			addGroupPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addHoldPropertyDescriptor(object);
			addHoldXPropertyDescriptor(object);
			addHoldYPropertyDescriptor(object);
			addHorizontalPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addKbmouseTargetPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addLabelOffPropertyDescriptor(object);
			addLabelOnPropertyDescriptor(object);
			addLightPropertyDescriptor(object);
			addMetaPropertyDescriptor(object);
			addMidiTargetPropertyDescriptor(object);
			addModePropertyDescriptor(object);
			addMulticolorPropertyDescriptor(object);
			addMultilabelPropertyDescriptor(object);
			addNbrPropertyDescriptor(object);
			addOscTargetPropertyDescriptor(object);
			addOutlinePropertyDescriptor(object);
			addPaintPropertyDescriptor(object);
			addPanPropertyDescriptor(object);
			addPhysicPropertyDescriptor(object);
			addPinchPropertyDescriptor(object);
			addPolyphonyPropertyDescriptor(object);
			addPrecisionPropertyDescriptor(object);
			addRadioPropertyDescriptor(object);
			addReleasePropertyDescriptor(object);
			addRestPropertyDescriptor(object);
			addRowPropertyDescriptor(object);
			addScalePropertyDescriptor(object);
			addSendPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
			addSustainPropertyDescriptor(object);
			addTabbarPropertyDescriptor(object);
			addTargetPropertyDescriptor(object);
			addTensionPropertyDescriptor(object);
			addTextPropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
			addZPropertyDescriptor(object);
			addZoomPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Acceleration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccelerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_acceleration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_acceleration_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ACCELERATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_angle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_angle_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ANGLE,
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
				 getString("_UI_WINDOW_attack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_attack_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ATTACK,
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
				 getString("_UI_WINDOW_attraction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_attraction_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ATTRACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attraction X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttractionXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_attractionX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_attractionX_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ATTRACTION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attraction Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttractionYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_attractionY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_attractionY_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ATTRACTION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Axis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_axis_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_axis_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__AXIS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_balls_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_balls_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__BALLS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bargraph feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBargraphPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_bargraph_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_bargraph_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__BARGRAPH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Behavior feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBehaviorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_behavior_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_behavior_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__BEHAVIOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bipolar feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBipolarPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_bipolar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_bipolar_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__BIPOLAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bitmap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitmapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_bitmap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_bitmap_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__BITMAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Boundaries feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundariesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_boundaries_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_boundaries_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__BOUNDARIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_capture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_capture_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__CAPTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_class_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__CLASS,
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
				 getString("_UI_WINDOW_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_text_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_unit_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__UNIT,
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
				 getString("_UI_WINDOW_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_value_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__VALUE,
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
				 getString("_UI_WINDOW_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_x_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_y_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_z_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_z_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_width_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_height_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_hold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_hold_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__HOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_holdX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_holdX_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__HOLD_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_holdY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_holdY_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__HOLD_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_horizontal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_horizontal_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__HORIZONTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_state_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_state_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__STATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_sustain_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_sustain_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__SUSTAIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_group_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__GROUP,
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
				 getString("_UI_WINDOW_font_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_font_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__FONT,
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
				 getString("_UI_WINDOW_send_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_send_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__SEND,
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
				 getString("_UI_WINDOW_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_speed_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__SPEED,
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
				 getString("_UI_WINDOW_oscTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_oscTarget_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__OSC_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outline feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_outline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_outline_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__OUTLINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_paint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_paint_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__PAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_pan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_pan_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__PAN,
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
				 getString("_UI_WINDOW_midiTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_midiTarget_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__MIDI_TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_mode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_mode_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multicolor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMulticolorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_multicolor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_multicolor_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__MULTICOLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_multilabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_multilabel_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__MULTILABEL,
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
				 getString("_UI_WINDOW_kbmouseTarget_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_kbmouseTarget_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__KBMOUSE_TARGET,
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
				 getString("_UI_WINDOW_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_color_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_column_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_column_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__COLUMN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constrained feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstrainedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_constrained_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_constrained_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__CONSTRAINED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_content_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_content_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__CONTENT,
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
				 getString("_UI_WINDOW_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_label_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_labelOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_labelOff_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__LABEL_OFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_labelOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_labelOn_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__LABEL_ON,
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
				 getString("_UI_WINDOW_light_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_light_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__LIGHT,
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
				 getString("_UI_WINDOW_tabbar_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_tabbar_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__TABBAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_target_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__TARGET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_tension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_tension_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__TENSION,
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
				 getString("_UI_WINDOW_meta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_meta_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__META,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_coordinates_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_coordinates_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__COORDINATES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cursor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCursorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_cursor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_cursor_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__CURSOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_decay_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_decay_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__DECAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_display_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_display_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__DISPLAY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_edit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_edit_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__EDIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_editable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_editable_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__EDITABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ephemere feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEphemerePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_ephemere_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_ephemere_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__EPHEMERE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Free feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFreePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_free_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_free_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__FREE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_friction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_friction_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__FRICTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gradient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGradientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_gradient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_gradient_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__GRADIENT,
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
				 getString("_UI_WINDOW_grid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_grid_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__GRID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grid Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGridStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_gridSteps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_gridSteps_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__GRID_STEPS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nbr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNbrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_nbr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_nbr_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__NBR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Physic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPhysicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_physic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_physic_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__PHYSIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pinch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPinchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_pinch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_pinch_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__PINCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Polyphony feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolyphonyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_polyphony_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_polyphony_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__POLYPHONY,
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
				 getString("_UI_WINDOW_precision_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_precision_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__PRECISION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Radio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRadioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_radio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_radio_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__RADIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_release_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_release_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__RELEASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_WINDOW_rest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_rest_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__REST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_row_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_row_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_scale_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Zoom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZoomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WINDOW_zoom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_zoom_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ZOOM,
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
				 getString("_UI_WINDOW_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WINDOW_id_feature", "_UI_WINDOW_type"),
				 JzmlPackage.Literals.WINDOW__ID,
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
			childrenFeatures.add(JzmlPackage.Literals.WINDOW__WINDOW);
			childrenFeatures.add(JzmlPackage.Literals.WINDOW__PARAM);
			childrenFeatures.add(JzmlPackage.Literals.WINDOW__VARIABLE);
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
	 * This returns WINDOW.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WINDOW"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WINDOW)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_WINDOW_type") :
			getString("_UI_WINDOW_type") + " " + label;
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

		switch (notification.getFeatureID(WINDOW.class)) {
			case JzmlPackage.WINDOW__ACCELERATION:
			case JzmlPackage.WINDOW__ANGLE:
			case JzmlPackage.WINDOW__ATTACK:
			case JzmlPackage.WINDOW__ATTRACTION:
			case JzmlPackage.WINDOW__ATTRACTION_X:
			case JzmlPackage.WINDOW__ATTRACTION_Y:
			case JzmlPackage.WINDOW__AXIS:
			case JzmlPackage.WINDOW__BALLS:
			case JzmlPackage.WINDOW__BARGRAPH:
			case JzmlPackage.WINDOW__BEHAVIOR:
			case JzmlPackage.WINDOW__BIPOLAR:
			case JzmlPackage.WINDOW__BITMAP:
			case JzmlPackage.WINDOW__BOUNDARIES:
			case JzmlPackage.WINDOW__CAPTURE:
			case JzmlPackage.WINDOW__CLASS:
			case JzmlPackage.WINDOW__COLOR:
			case JzmlPackage.WINDOW__COLUMN:
			case JzmlPackage.WINDOW__CONSTRAINED:
			case JzmlPackage.WINDOW__CONTENT:
			case JzmlPackage.WINDOW__COORDINATES:
			case JzmlPackage.WINDOW__CURSOR:
			case JzmlPackage.WINDOW__DECAY:
			case JzmlPackage.WINDOW__DISPLAY:
			case JzmlPackage.WINDOW__EDIT:
			case JzmlPackage.WINDOW__EDITABLE:
			case JzmlPackage.WINDOW__EPHEMERE:
			case JzmlPackage.WINDOW__FONT:
			case JzmlPackage.WINDOW__FREE:
			case JzmlPackage.WINDOW__FRICTION:
			case JzmlPackage.WINDOW__GRADIENT:
			case JzmlPackage.WINDOW__GRID:
			case JzmlPackage.WINDOW__GRID_STEPS:
			case JzmlPackage.WINDOW__GROUP:
			case JzmlPackage.WINDOW__HEIGHT:
			case JzmlPackage.WINDOW__HOLD:
			case JzmlPackage.WINDOW__HOLD_X:
			case JzmlPackage.WINDOW__HOLD_Y:
			case JzmlPackage.WINDOW__HORIZONTAL:
			case JzmlPackage.WINDOW__ID:
			case JzmlPackage.WINDOW__KBMOUSE_TARGET:
			case JzmlPackage.WINDOW__LABEL:
			case JzmlPackage.WINDOW__LABEL_OFF:
			case JzmlPackage.WINDOW__LABEL_ON:
			case JzmlPackage.WINDOW__LIGHT:
			case JzmlPackage.WINDOW__META:
			case JzmlPackage.WINDOW__MIDI_TARGET:
			case JzmlPackage.WINDOW__MODE:
			case JzmlPackage.WINDOW__MULTICOLOR:
			case JzmlPackage.WINDOW__MULTILABEL:
			case JzmlPackage.WINDOW__NBR:
			case JzmlPackage.WINDOW__OSC_TARGET:
			case JzmlPackage.WINDOW__OUTLINE:
			case JzmlPackage.WINDOW__PAINT:
			case JzmlPackage.WINDOW__PAN:
			case JzmlPackage.WINDOW__PHYSIC:
			case JzmlPackage.WINDOW__PINCH:
			case JzmlPackage.WINDOW__POLYPHONY:
			case JzmlPackage.WINDOW__PRECISION:
			case JzmlPackage.WINDOW__RADIO:
			case JzmlPackage.WINDOW__RELEASE:
			case JzmlPackage.WINDOW__REST:
			case JzmlPackage.WINDOW__ROW:
			case JzmlPackage.WINDOW__SCALE:
			case JzmlPackage.WINDOW__SEND:
			case JzmlPackage.WINDOW__SPEED:
			case JzmlPackage.WINDOW__STATE:
			case JzmlPackage.WINDOW__SUSTAIN:
			case JzmlPackage.WINDOW__TABBAR:
			case JzmlPackage.WINDOW__TARGET:
			case JzmlPackage.WINDOW__TENSION:
			case JzmlPackage.WINDOW__TEXT:
			case JzmlPackage.WINDOW__UNIT:
			case JzmlPackage.WINDOW__VALUE:
			case JzmlPackage.WINDOW__WIDTH:
			case JzmlPackage.WINDOW__X:
			case JzmlPackage.WINDOW__Y:
			case JzmlPackage.WINDOW__Z:
			case JzmlPackage.WINDOW__ZOOM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JzmlPackage.WINDOW__WINDOW:
			case JzmlPackage.WINDOW__PARAM:
			case JzmlPackage.WINDOW__VARIABLE:
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
				(JzmlPackage.Literals.WINDOW__WINDOW,
				 JzmlFactory.eINSTANCE.createWINDOW()));

		newChildDescriptors.add
			(createChildParameter
				(JzmlPackage.Literals.WINDOW__PARAM,
				 JzmlFactory.eINSTANCE.createPARAM()));

		newChildDescriptors.add
			(createChildParameter
				(JzmlPackage.Literals.WINDOW__VARIABLE,
				 JzmlFactory.eINSTANCE.createVARIABLE()));
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
