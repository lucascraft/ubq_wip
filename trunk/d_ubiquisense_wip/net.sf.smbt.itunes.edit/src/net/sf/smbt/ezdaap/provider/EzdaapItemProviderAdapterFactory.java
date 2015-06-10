/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.smbt.ezdaap.util.EzdaapAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EzdaapItemProviderAdapterFactory extends EzdaapAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdaapItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapITunesInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapITunesInstanceItemProvider ezDaapITunesInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapITunesInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapITunesInstanceAdapter() {
		if (ezDaapITunesInstanceItemProvider == null) {
			ezDaapITunesInstanceItemProvider = new EZDaapITunesInstanceItemProvider(this);
		}

		return ezDaapITunesInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapDictionary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapDictionaryItemProvider ezDaapDictionaryItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapDictionary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapDictionaryAdapter() {
		if (ezDaapDictionaryItemProvider == null) {
			ezDaapDictionaryItemProvider = new EZDaapDictionaryItemProvider(this);
		}

		return ezDaapDictionaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapManager} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapManagerItemProvider ezDaapManagerItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapManager}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapManagerAdapter() {
		if (ezDaapManagerItemProvider == null) {
			ezDaapManagerItemProvider = new EZDaapManagerItemProvider(this);
		}

		return ezDaapManagerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapSong} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapSongItemProvider ezDaapSongItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapSong}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapSongAdapter() {
		if (ezDaapSongItemProvider == null) {
			ezDaapSongItemProvider = new EZDaapSongItemProvider(this);
		}

		return ezDaapSongItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapArtist} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapArtistItemProvider ezDaapArtistItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapArtist}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapArtistAdapter() {
		if (ezDaapArtistItemProvider == null) {
			ezDaapArtistItemProvider = new EZDaapArtistItemProvider(this);
		}

		return ezDaapArtistItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapAlbum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapAlbumItemProvider ezDaapAlbumItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapAlbum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapAlbumAdapter() {
		if (ezDaapAlbumItemProvider == null) {
			ezDaapAlbumItemProvider = new EZDaapAlbumItemProvider(this);
		}

		return ezDaapAlbumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapPlayList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapPlayListItemProvider ezDaapPlayListItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapPlayList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapPlayListAdapter() {
		if (ezDaapPlayListItemProvider == null) {
			ezDaapPlayListItemProvider = new EZDaapPlayListItemProvider(this);
		}

		return ezDaapPlayListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapLibraryItemProvider ezDaapLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapLibraryAdapter() {
		if (ezDaapLibraryItemProvider == null) {
			ezDaapLibraryItemProvider = new EZDaapLibraryItemProvider(this);
		}

		return ezDaapLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapElem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapElemItemProvider ezDaapElemItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapElem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapElemAdapter() {
		if (ezDaapElemItemProvider == null) {
			ezDaapElemItemProvider = new EZDaapElemItemProvider(this);
		}

		return ezDaapElemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZDaapIntelPropertyElemItemProvider ezDaapIntelPropertyElemItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.ezdaap.EZDaapIntelPropertyElem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEZDaapIntelPropertyElemAdapter() {
		if (ezDaapIntelPropertyElemItemProvider == null) {
			ezDaapIntelPropertyElemItemProvider = new EZDaapIntelPropertyElemItemProvider(this);
		}

		return ezDaapIntelPropertyElemItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (ezDaapITunesInstanceItemProvider != null) ezDaapITunesInstanceItemProvider.dispose();
		if (ezDaapDictionaryItemProvider != null) ezDaapDictionaryItemProvider.dispose();
		if (ezDaapManagerItemProvider != null) ezDaapManagerItemProvider.dispose();
		if (ezDaapSongItemProvider != null) ezDaapSongItemProvider.dispose();
		if (ezDaapArtistItemProvider != null) ezDaapArtistItemProvider.dispose();
		if (ezDaapAlbumItemProvider != null) ezDaapAlbumItemProvider.dispose();
		if (ezDaapPlayListItemProvider != null) ezDaapPlayListItemProvider.dispose();
		if (ezDaapLibraryItemProvider != null) ezDaapLibraryItemProvider.dispose();
		if (ezDaapElemItemProvider != null) ezDaapElemItemProvider.dispose();
		if (ezDaapIntelPropertyElemItemProvider != null) ezDaapIntelPropertyElemItemProvider.dispose();
	}

}
