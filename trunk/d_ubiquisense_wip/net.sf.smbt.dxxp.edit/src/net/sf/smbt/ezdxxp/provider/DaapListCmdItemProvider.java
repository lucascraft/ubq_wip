/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezdxxp.DaapListCmd;
import net.sf.smbt.ezdxxp.EzdxxpFactory;
import net.sf.smbt.ezdxxp.EzdxxpPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.cmd.PRIORITY;
import net.sf.xqz.model.cmd.provider.CompoundCmdItemProvider;

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
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.ezdxxp.DaapListCmd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DaapListCmdItemProvider
	extends CompoundCmdItemProvider
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
	public DaapListCmdItemProvider(AdapterFactory adapterFactory) {
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

			addTagPropertyDescriptor(object);
			addHttpPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapCmd_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapCmd_tag_feature", "_UI_DaapCmd_type"),
				 EzdxxpPackage.Literals.DAAP_CMD__TAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Http Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHttpPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DaapCmd_httpProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DaapCmd_httpProperties_feature", "_UI_DaapCmd_type"),
				 EzdxxpPackage.Literals.DAAP_CMD__HTTP_PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns DaapListCmd.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DaapListCmd"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PRIORITY labelValue = ((DaapListCmd)object).getPriority();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DaapListCmd_type") :
			getString("_UI_DaapListCmd_type") + " " + label;
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

		switch (notification.getFeatureID(DaapListCmd.class)) {
			case EzdxxpPackage.DAAP_LIST_CMD__TAG:
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

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapCmd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapCmdChunk()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapListCmd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapServerInfoRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapServerInfoResponse()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapRequestForContentCodes()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapContentCodesResponse()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapLogin()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapLoginResponse()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapUpdateRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapDatabaseRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapDatabseResponse()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapRequestSongs()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapListOfSongsInDB()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapRequestPlaylists()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapListOfPlaylistsInDB()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapRequestPlaylist()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapListOfSongsInPlaylist()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapRequestMediaStream()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapStreamResponse()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapQueryCmd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapMsrvCmd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapMccr()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapMlog()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapMupd()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapAvdb()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapApsoRet()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapAply()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapUpdateResponse()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapContentCodesRequest()));

		newChildDescriptors.add
			(createChildParameter
				(CmdPackage.Literals.COMPOUND_CMD__CHILDREN,
				 EzdxxpFactory.eINSTANCE.createDaapLogout()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzdxxpEditPlugin.INSTANCE;
	}

}
