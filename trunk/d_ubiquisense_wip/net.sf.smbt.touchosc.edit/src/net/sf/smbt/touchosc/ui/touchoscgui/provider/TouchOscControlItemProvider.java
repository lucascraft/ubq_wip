/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.provider;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchOscControlItemProvider
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
	public TouchOscControlItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addFgPropertyDescriptor(object);
			addOsc_csPropertyDescriptor(object);
			addScalefPropertyDescriptor(object);
			addScaletPropertyDescriptor(object);
			if (
				object instanceof TouchOscMultiFaderH || 
				object instanceof TouchOscMultiFaderV ||
				object instanceof TouchOscFaderH || 
				object instanceof TouchOscFaderV || 
				object instanceof TouchOscRotaryH || 
				object instanceof TouchOscRotaryV
			) {
				addCenteredPropertyDescriptor(object);
				addInvertedPropertyDescriptor(object);
				addResponsePropertyDescriptor(object);
			}
			if (object instanceof TouchOscXYPad) {
				addInverted_xPropertyDescriptor(object);
				addInverted_yPropertyDescriptor(object);
			}
			//addXPropertyDescriptor(object);
			//addYPropertyDescriptor(object);
			
			if (
				object instanceof TouchOscMultiFaderH || 
				object instanceof TouchOscMultiFaderV
			) {
				addNumberPropertyDescriptor(object);
			}
			if (object instanceof TouchOscMultiToggle || object instanceof TouchOscMultiPush) {
				addNumber_xPropertyDescriptor(object);
				addNumber_yPropertyDescriptor(object);
			}
			if (
					object instanceof TouchOscTimeH ||
					object instanceof TouchOscTimeV
			) {
				addOutlinePropertyDescriptor(object);
				addSizePropertyDescriptor(object);
			}
			addTextPropertyDescriptor(object);
//			addHPropertyDescriptor(object);
//			addWPropertyDescriptor(object);
			//addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fg feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addFgPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_fg_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_fg_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__FG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null) {
					@Override
					protected Collection<?> getComboBoxObjects(Object object) {
						return Arrays.asList(
							new Object[] { "red", "green", "blue", "yellow", "purple", "gray", "orange"	}                            
						);
					}
				}
			);
	}

	/**
	 * This adds a property descriptor for the Centered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenteredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_centered_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_centered_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__CENTERED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the H feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_h_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_h_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__H,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the W feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_w_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_w_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__W,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_x_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null) {
				
			});
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
				 getString("_UI_TouchOscControl_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_y_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInvertedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_inverted_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_inverted_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__INVERTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_TouchOscControl_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_name_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_number_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_number_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null) {
					@Override
					protected Collection<?> getComboBoxObjects(Object object) {
						return Arrays.asList(
							new Integer[] {
								1,  2,  3,  4,  5,  6,  7,  8,
								9,  10, 11, 12, 13, 14, 15, 16,
								17, 18, 19, 20, 21, 22, 23, 24,
								25, 26, 27, 28, 29, 30, 31, 32,
								33, 34, 35, 36, 37, 38, 39, 40,
								41, 42, 43, 44, 45, 46, 47, 48,
								49, 50, 51, 52, 53, 54 ,55, 56,
								57, 58, 59, 60, 61, 62, 63, 64
							}
						);
					}
			});
	}

	/**
	 * This adds a property descriptor for the Osc cs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOsc_csPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_osc_cs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_osc_cs_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__OSC_CS,
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
				 getString("_UI_TouchOscControl_outline_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_outline_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__OUTLINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_size_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_TouchOscControl_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_text_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_type_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number x feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addNumber_xPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_number_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_number_x_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NUMBER_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null) {
						@Override
						protected Collection<?> getComboBoxObjects(Object object) {
							return Arrays.asList(
								new Integer[] {
									1,  2,  3,  4,  5,  6,  7,  8,
									9,  10, 11, 12, 13, 14, 15, 16
								}
							);
						}
				});
	}

	/**
	 * This adds a property descriptor for the Number y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addNumber_yPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_number_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_number_y_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__NUMBER_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null) {
						@Override
						protected Collection<?> getComboBoxObjects(Object object) {
							return Arrays.asList(
								new Integer[] {
									1,  2,  3,  4,  5,  6,  7,  8,
									9,  10, 11, 12, 13, 14, 15, 16
								}
							);
						}
				});
	}

	/**
	 * This adds a property descriptor for the Scalef feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_scalef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_scalef_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SCALEF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scalet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScaletPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_scalet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_scalet_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SCALET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addResponsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_response_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_response_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__RESPONSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null) {
					@Override
					protected Collection<?> getComboBoxObjects(Object object) {
						return Arrays.asList(new String[] {"absolute", "relative"});
					}
			});
	}

	/**
	 * This adds a property descriptor for the Inverted x feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverted_xPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_inverted_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_inverted_x_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__INVERTED_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inverted y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInverted_yPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_inverted_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_inverted_y_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__INVERTED_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seconds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecondsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_seconds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_seconds_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__SECONDS,
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
				 getString("_UI_TouchOscControl_background_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_background_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__BACKGROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Local Feedback Off feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocalFeedbackOffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TouchOscControl_localFeedbackOff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TouchOscControl_localFeedbackOff_feature", "_UI_TouchOscControl_type"),
				 TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TouchOscControl.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TouchOscControl"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TouchOscControl)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TouchOscControl_type") :
			getString("_UI_TouchOscControl_type") + " " + label;
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

		switch (notification.getFeatureID(TouchOscControl.class)) {
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__FG:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__CENTERED:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__H:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__W:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__X:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__Y:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NAME:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OSC_CS:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OUTLINE:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SIZE:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TEXT:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TYPE:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_X:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_Y:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALEF:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALET:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__RESPONSE:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_X:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_Y:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SECONDS:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__BACKGROUND:
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF:
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
		return TouchoscguiEditPlugin.INSTANCE;
	}

}
