/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.sf.smbt.touchosc.ui.touchoscgui.util.TouchoscguiAdapterFactory;

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
public class TouchoscguiItemProviderAdapterFactory extends TouchoscguiAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public TouchoscguiItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TOP} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOPItemProvider topItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TOP}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTOPAdapter() {
		if (topItemProvider == null) {
			topItemProvider = new TOPItemProvider(this);
		}

		return topItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscLayoutItemProvider touchOscLayoutItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscLayoutAdapter() {
		if (touchOscLayoutItemProvider == null) {
			touchOscLayoutItemProvider = new TouchOscLayoutItemProvider(this);
		}

		return touchOscLayoutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscTabPageItemProvider touchOscTabPageItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscTabPageAdapter() {
		if (touchOscTabPageItemProvider == null) {
			touchOscTabPageItemProvider = new TouchOscTabPageItemProvider(this);
		}

		return touchOscTabPageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscControlItemProvider touchOscControlItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscControlAdapter() {
		if (touchOscControlItemProvider == null) {
			touchOscControlItemProvider = new TouchOscControlItemProvider(this);
		}

		return touchOscControlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscFaderHItemProvider touchOscFaderHItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscFaderHAdapter() {
		if (touchOscFaderHItemProvider == null) {
			touchOscFaderHItemProvider = new TouchOscFaderHItemProvider(this);
		}

		return touchOscFaderHItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscFaderVItemProvider touchOscFaderVItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscFaderVAdapter() {
		if (touchOscFaderVItemProvider == null) {
			touchOscFaderVItemProvider = new TouchOscFaderVItemProvider(this);
		}

		return touchOscFaderVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscPushItemProvider touchOscPushItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscPushAdapter() {
		if (touchOscPushItemProvider == null) {
			touchOscPushItemProvider = new TouchOscPushItemProvider(this);
		}

		return touchOscPushItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscXYPadItemProvider touchOscXYPadItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscXYPadAdapter() {
		if (touchOscXYPadItemProvider == null) {
			touchOscXYPadItemProvider = new TouchOscXYPadItemProvider(this);
		}

		return touchOscXYPadItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscLabelHItemProvider touchOscLabelHItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscLabelHAdapter() {
		if (touchOscLabelHItemProvider == null) {
			touchOscLabelHItemProvider = new TouchOscLabelHItemProvider(this);
		}

		return touchOscLabelHItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscLabelVItemProvider touchOscLabelVItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscLabelVAdapter() {
		if (touchOscLabelVItemProvider == null) {
			touchOscLabelVItemProvider = new TouchOscLabelVItemProvider(this);
		}

		return touchOscLabelVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscLEDItemProvider touchOscLEDItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscLEDAdapter() {
		if (touchOscLEDItemProvider == null) {
			touchOscLEDItemProvider = new TouchOscLEDItemProvider(this);
		}

		return touchOscLEDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscMultiFaderHItemProvider touchOscMultiFaderHItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscMultiFaderHAdapter() {
		if (touchOscMultiFaderHItemProvider == null) {
			touchOscMultiFaderHItemProvider = new TouchOscMultiFaderHItemProvider(this);
		}

		return touchOscMultiFaderHItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscMultiFaderVItemProvider touchOscMultiFaderVItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscMultiFaderVAdapter() {
		if (touchOscMultiFaderVItemProvider == null) {
			touchOscMultiFaderVItemProvider = new TouchOscMultiFaderVItemProvider(this);
		}

		return touchOscMultiFaderVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscMultiToggleItemProvider touchOscMultiToggleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscMultiToggleAdapter() {
		if (touchOscMultiToggleItemProvider == null) {
			touchOscMultiToggleItemProvider = new TouchOscMultiToggleItemProvider(this);
		}

		return touchOscMultiToggleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscRotaryHItemProvider touchOscRotaryHItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscRotaryHAdapter() {
		if (touchOscRotaryHItemProvider == null) {
			touchOscRotaryHItemProvider = new TouchOscRotaryHItemProvider(this);
		}

		return touchOscRotaryHItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscRotaryVItemProvider touchOscRotaryVItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscRotaryVAdapter() {
		if (touchOscRotaryVItemProvider == null) {
			touchOscRotaryVItemProvider = new TouchOscRotaryVItemProvider(this);
		}

		return touchOscRotaryVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscToggleItemProvider touchOscToggleItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscToggleAdapter() {
		if (touchOscToggleItemProvider == null) {
			touchOscToggleItemProvider = new TouchOscToggleItemProvider(this);
		}

		return touchOscToggleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscEncoderItemProvider touchOscEncoderItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscEncoderAdapter() {
		if (touchOscEncoderItemProvider == null) {
			touchOscEncoderItemProvider = new TouchOscEncoderItemProvider(this);
		}

		return touchOscEncoderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscBatteryVItemProvider touchOscBatteryVItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscBatteryVAdapter() {
		if (touchOscBatteryVItemProvider == null) {
			touchOscBatteryVItemProvider = new TouchOscBatteryVItemProvider(this);
		}

		return touchOscBatteryVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscBatteryHItemProvider touchOscBatteryHItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscBatteryHAdapter() {
		if (touchOscBatteryHItemProvider == null) {
			touchOscBatteryHItemProvider = new TouchOscBatteryHItemProvider(this);
		}

		return touchOscBatteryHItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscTimeHItemProvider touchOscTimeHItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscTimeHAdapter() {
		if (touchOscTimeHItemProvider == null) {
			touchOscTimeHItemProvider = new TouchOscTimeHItemProvider(this);
		}

		return touchOscTimeHItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscTimeVItemProvider touchOscTimeVItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscTimeVAdapter() {
		if (touchOscTimeVItemProvider == null) {
			touchOscTimeVItemProvider = new TouchOscTimeVItemProvider(this);
		}

		return touchOscTimeVItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscMultiPushItemProvider touchOscMultiPushItemProvider;

	/**
	 * This creates an adapter for a {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTouchOscMultiPushAdapter() {
		if (touchOscMultiPushItemProvider == null) {
			touchOscMultiPushItemProvider = new TouchOscMultiPushItemProvider(this);
		}

		return touchOscMultiPushItemProvider;
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
		if (topItemProvider != null) topItemProvider.dispose();
		if (touchOscLayoutItemProvider != null) touchOscLayoutItemProvider.dispose();
		if (touchOscTabPageItemProvider != null) touchOscTabPageItemProvider.dispose();
		if (touchOscControlItemProvider != null) touchOscControlItemProvider.dispose();
		if (touchOscFaderHItemProvider != null) touchOscFaderHItemProvider.dispose();
		if (touchOscFaderVItemProvider != null) touchOscFaderVItemProvider.dispose();
		if (touchOscPushItemProvider != null) touchOscPushItemProvider.dispose();
		if (touchOscXYPadItemProvider != null) touchOscXYPadItemProvider.dispose();
		if (touchOscLabelHItemProvider != null) touchOscLabelHItemProvider.dispose();
		if (touchOscLabelVItemProvider != null) touchOscLabelVItemProvider.dispose();
		if (touchOscLEDItemProvider != null) touchOscLEDItemProvider.dispose();
		if (touchOscMultiFaderHItemProvider != null) touchOscMultiFaderHItemProvider.dispose();
		if (touchOscMultiFaderVItemProvider != null) touchOscMultiFaderVItemProvider.dispose();
		if (touchOscMultiToggleItemProvider != null) touchOscMultiToggleItemProvider.dispose();
		if (touchOscRotaryHItemProvider != null) touchOscRotaryHItemProvider.dispose();
		if (touchOscRotaryVItemProvider != null) touchOscRotaryVItemProvider.dispose();
		if (touchOscToggleItemProvider != null) touchOscToggleItemProvider.dispose();
		if (touchOscEncoderItemProvider != null) touchOscEncoderItemProvider.dispose();
		if (touchOscBatteryVItemProvider != null) touchOscBatteryVItemProvider.dispose();
		if (touchOscBatteryHItemProvider != null) touchOscBatteryHItemProvider.dispose();
		if (touchOscTimeHItemProvider != null) touchOscTimeHItemProvider.dispose();
		if (touchOscTimeVItemProvider != null) touchOscTimeVItemProvider.dispose();
		if (touchOscMultiPushItemProvider != null) touchOscMultiPushItemProvider.dispose();
	}

}
