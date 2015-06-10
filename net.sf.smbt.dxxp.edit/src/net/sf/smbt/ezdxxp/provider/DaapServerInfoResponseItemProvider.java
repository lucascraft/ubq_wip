/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezdxxp.DaapServerInfoResponse;
import net.sf.smbt.ezdxxp.EzdxxpFactory;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ezdxxp.DaapServerInfoResponse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DaapServerInfoResponseItemProvider
	extends DaapCmdChunkItemProvider
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
	public DaapServerInfoResponseItemProvider(AdapterFactory adapterFactory) {
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

			addStatusPropertyDescriptor(object);
			addDaapProtocolVersionPropertyDescriptor(object);
			addIndexingSupportPropertyDescriptor(object);
			addExtensionSupportPropertyDescriptor(object);
			addUpdateSupportPropertyDescriptor(object);
			addAutologoutSupportPropertyDescriptor(object);
			addTimeoutIntervalPropertyDescriptor(object);
			addLoginRequiredPropertyDescriptor(object);
			addQueriesSupportPropertyDescriptor(object);
			addServerNamePropertyDescriptor(object);
			addResolveSupportPropertyDescriptor(object);
			addBrowsingSupportPropertyDescriptor(object);
			addPersitenceSupportPropertyDescriptor(object);
			addDmapProtocolVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_status_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__STATUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Daap Protocol Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDaapProtocolVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_daapProtocolVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_daapProtocolVersion_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__DAAP_PROTOCOL_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Indexing Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexingSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_indexingSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_indexingSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__INDEXING_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extension Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtensionSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_extensionSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_extensionSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__EXTENSION_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Update Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_updateSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_updateSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__UPDATE_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autologout Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutologoutSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_autologoutSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_autologoutSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__AUTOLOGOUT_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timeout Interval feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeoutIntervalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_timeoutInterval_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_timeoutInterval_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__TIMEOUT_INTERVAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Login Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoginRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_loginRequired_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_loginRequired_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__LOGIN_REQUIRED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Queries Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueriesSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_queriesSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_queriesSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__QUERIES_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_DaapServerInfoResponse_serverName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_serverName_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__SERVER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolve Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolveSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_resolveSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_resolveSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__RESOLVE_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Browsing Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBrowsingSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_browsingSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_browsingSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__BROWSING_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persitence Support feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersitenceSupportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_persitenceSupport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_persitenceSupport_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__PERSITENCE_SUPPORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dmap Protocol Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDmapProtocolVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapServerInfoResponse_dmapProtocolVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapServerInfoResponse_dmapProtocolVersion_feature", "_UI_DaapServerInfoResponse_type"),
				 EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__DMAP_PROTOCOL_VERSION,
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
			childrenFeatures.add(EzdxxpPackage.Literals.DAAP_CMD_RESPONSE__CHUNKS);
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
	 * This returns DaapServerInfoResponse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DaapServerInfoResponse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DaapServerInfoResponse)object).getServerName();
		return label == null || label.length() == 0 ?
			getString("_UI_DaapServerInfoResponse_type") :
			getString("_UI_DaapServerInfoResponse_type") + " " + label;
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

		switch (notification.getFeatureID(DaapServerInfoResponse.class)) {
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__STATUS:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__DAAP_PROTOCOL_VERSION:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__INDEXING_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__EXTENSION_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__UPDATE_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__AUTOLOGOUT_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__TIMEOUT_INTERVAL:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__LOGIN_REQUIRED:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__QUERIES_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__SERVER_NAME:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__RESOLVE_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__BROWSING_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__PERSITENCE_SUPPORT:
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__DMAP_PROTOCOL_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__CHUNKS:
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
				(EzdxxpPackage.Literals.DAAP_CMD_RESPONSE__CHUNKS,
				 EzdxxpFactory.eINSTANCE.createChunk()));
	}

}
