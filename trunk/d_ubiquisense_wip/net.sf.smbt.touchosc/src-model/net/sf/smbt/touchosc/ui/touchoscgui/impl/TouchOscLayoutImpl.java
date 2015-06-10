/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.impl;

import java.util.Collection;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touch Osc Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscLayoutImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TouchOscLayoutImpl extends EObjectImpl implements TouchOscLayout {
	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscTabPage> tabs;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected String orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscControl> widgets;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscguiPackage.Literals.TOUCH_OSC_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscTabPage> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentEList<TouchOscTabPage>(TouchOscTabPage.class, this, TouchoscguiPackage.TOUCH_OSC_LAYOUT__TABS);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_LAYOUT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(String newOrientation) {
		String oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_LAYOUT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_LAYOUT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscControl> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectResolvingEList<TouchOscControl>(TouchOscControl.class, this, TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_LAYOUT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__TABS:
				return getTabs();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__MODE:
				return getMode();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__ORIENTATION:
				return getOrientation();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__VERSION:
				return getVersion();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDGETS:
				return getWidgets();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDTH:
				return getWidth();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__HEIGHT:
				return getHeight();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends TouchOscTabPage>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__MODE:
				setMode((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__ORIENTATION:
				setOrientation((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__VERSION:
				setVersion((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends TouchOscControl>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDTH:
				setWidth((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__HEIGHT:
				setHeight((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__TABS:
				getTabs().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDGETS:
				getWidgets().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__TABS:
				return tabs != null && !tabs.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__ORIENTATION:
				return ORIENTATION_EDEFAULT == null ? orientation != null : !ORIENTATION_EDEFAULT.equals(orientation);
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__WIDTH:
				return width != WIDTH_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_LAYOUT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mode: ");
		result.append(mode);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", version: ");
		result.append(version);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //TouchOscLayoutImpl
