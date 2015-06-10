/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.impl;

import java.util.Collection;
import java.util.List;

import net.sf.smbt.touchosc.touchoscapp.Orientation;
import net.sf.smbt.touchosc.touchoscapp.Tab;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage;
import net.sf.xqz.model.engine.CmdPipe;

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
 * An implementation of the model object '<em><b>Touch Osc App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getTabs <em>Tabs</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.TouchOscAppImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TouchOscAppImpl extends EObjectImpl implements TouchOscApp {
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdPipe> engines;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected CmdPipe default_;

	/**
	 * The cached value of the '{@link #getTabs() <em>Tabs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabs()
	 * @generated
	 * @ordered
	 */
	protected EList<Tab> tabs;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final Orientation ORIENTATION_EDEFAULT = Orientation.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Orientation orientation = ORIENTATION_EDEFAULT;

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
	protected TouchOscAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscappPackage.Literals.TOUCH_OSC_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CmdPipe> getEngines() {
		if (engines == null) {
			engines = new EObjectResolvingEList<CmdPipe>(CmdPipe.class, this, TouchoscappPackage.TOUCH_OSC_APP__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (CmdPipe)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TouchoscappPackage.TOUCH_OSC_APP__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		CmdPipe oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.TOUCH_OSC_APP__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tab> getTabs() {
		if (tabs == null) {
			tabs = new EObjectContainmentEList<Tab>(Tab.class, this, TouchoscappPackage.TOUCH_OSC_APP__TABS);
		}
		return tabs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Orientation newOrientation) {
		Orientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.TOUCH_OSC_APP__ORIENTATION, oldOrientation, orientation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.TOUCH_OSC_APP__MODE, oldMode, mode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.TOUCH_OSC_APP__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.TOUCH_OSC_APP__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.TOUCH_OSC_APP__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouchoscappPackage.TOUCH_OSC_APP__TABS:
				return ((InternalEList<?>)getTabs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscappPackage.TOUCH_OSC_APP__ENGINES:
				return getEngines();
			case TouchoscappPackage.TOUCH_OSC_APP__DEFAULT:
				return getDefault();
			case TouchoscappPackage.TOUCH_OSC_APP__TABS:
				return getTabs();
			case TouchoscappPackage.TOUCH_OSC_APP__ORIENTATION:
				return getOrientation();
			case TouchoscappPackage.TOUCH_OSC_APP__MODE:
				return getMode();
			case TouchoscappPackage.TOUCH_OSC_APP__VERSION:
				return getVersion();
			case TouchoscappPackage.TOUCH_OSC_APP__WIDTH:
				return getWidth();
			case TouchoscappPackage.TOUCH_OSC_APP__HEIGHT:
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
			case TouchoscappPackage.TOUCH_OSC_APP__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends CmdPipe>)newValue);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__DEFAULT:
				setDefault((CmdPipe)newValue);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__TABS:
				getTabs().clear();
				getTabs().addAll((Collection<? extends Tab>)newValue);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__ORIENTATION:
				setOrientation((Orientation)newValue);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__MODE:
				setMode((String)newValue);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__VERSION:
				setVersion((String)newValue);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__WIDTH:
				setWidth((Integer)newValue);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__HEIGHT:
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
			case TouchoscappPackage.TOUCH_OSC_APP__ENGINES:
				getEngines().clear();
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__DEFAULT:
				setDefault((CmdPipe)null);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__TABS:
				getTabs().clear();
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case TouchoscappPackage.TOUCH_OSC_APP__HEIGHT:
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
			case TouchoscappPackage.TOUCH_OSC_APP__ENGINES:
				return engines != null && !engines.isEmpty();
			case TouchoscappPackage.TOUCH_OSC_APP__DEFAULT:
				return default_ != null;
			case TouchoscappPackage.TOUCH_OSC_APP__TABS:
				return tabs != null && !tabs.isEmpty();
			case TouchoscappPackage.TOUCH_OSC_APP__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case TouchoscappPackage.TOUCH_OSC_APP__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case TouchoscappPackage.TOUCH_OSC_APP__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case TouchoscappPackage.TOUCH_OSC_APP__WIDTH:
				return width != WIDTH_EDEFAULT;
			case TouchoscappPackage.TOUCH_OSC_APP__HEIGHT:
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
		result.append(" (orientation: ");
		result.append(orientation);
		result.append(", mode: ");
		result.append(mode);
		result.append(", version: ");
		result.append(version);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //TouchOscAppImpl
