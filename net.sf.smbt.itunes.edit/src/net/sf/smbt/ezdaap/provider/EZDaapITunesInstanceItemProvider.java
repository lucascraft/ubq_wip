/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezdaap.EZDaapITunesInstance;
import net.sf.smbt.ezdaap.EzdaapFactory;
import net.sf.smbt.ezdaap.EzdaapPackage;

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
 * This is the item provider adapter for a {@link net.sf.smbt.ezdaap.EZDaapITunesInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EZDaapITunesInstanceItemProvider
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
	public EZDaapITunesInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addRevIDPropertyDescriptor(object);
			addSessionIDPropertyDescriptor(object);
			addServerNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_EZDaapITunesInstance_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZDaapITunesInstance_id_feature", "_UI_EZDaapITunesInstance_type"),
				 EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rev ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRevIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZDaapITunesInstance_revID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZDaapITunesInstance_revID_feature", "_UI_EZDaapITunesInstance_type"),
				 EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__REV_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Session ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSessionIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZDaapITunesInstance_sessionID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZDaapITunesInstance_sessionID_feature", "_UI_EZDaapITunesInstance_type"),
				 EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SESSION_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EZDaapITunesInstance_serverName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EZDaapITunesInstance_serverName_feature", "_UI_EZDaapITunesInstance_type"),
				 EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SERVER_NAME,
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
			childrenFeatures.add(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__LIBRARIES);
			childrenFeatures.add(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__PALYLISTS);
			childrenFeatures.add(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SONGS);
			childrenFeatures.add(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ALBUMS);
			childrenFeatures.add(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ARTISTS);
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
	 * This returns EZDaapITunesInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EZDaapITunesInstance"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EZDaapITunesInstance)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_EZDaapITunesInstance_type") :
			getString("_UI_EZDaapITunesInstance_type") + " " + label;
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

		switch (notification.getFeatureID(EZDaapITunesInstance.class)) {
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__ID:
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__REV_ID:
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__SESSION_ID:
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__SERVER_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__LIBRARIES:
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__PALYLISTS:
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__SONGS:
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__ALBUMS:
			case EzdaapPackage.EZ_DAAP_ITUNES_INSTANCE__ARTISTS:
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
				(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__LIBRARIES,
				 EzdaapFactory.eINSTANCE.createEZDaapLibrary()));

		newChildDescriptors.add
			(createChildParameter
				(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__PALYLISTS,
				 EzdaapFactory.eINSTANCE.createEZDaapPlayList()));

		newChildDescriptors.add
			(createChildParameter
				(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__SONGS,
				 EzdaapFactory.eINSTANCE.createEZDaapSong()));

		newChildDescriptors.add
			(createChildParameter
				(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ALBUMS,
				 EzdaapFactory.eINSTANCE.createEZDaapAlbum()));

		newChildDescriptors.add
			(createChildParameter
				(EzdaapPackage.Literals.EZ_DAAP_ITUNES_INSTANCE__ARTISTS,
				 EzdaapFactory.eINSTANCE.createEZDaapArtist()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzdaapEditPlugin.INSTANCE;
	}

}
