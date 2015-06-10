/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.impl;

import java.util.Collection;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad;
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
 * An implementation of the model object '<em><b>Touch Osc Tab Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getFadersH <em>Faders H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getXyPads <em>Xy Pads</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getFadersV <em>Faders V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getLabelsH <em>Labels H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getPushes <em>Pushes</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getLabelsV <em>Labels V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getMultiToggles <em>Multi Toggles</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getLeds <em>Leds</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getRotariesV <em>Rotaries V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getRotariesH <em>Rotaries H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getToggles <em>Toggles</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getBatteriesH <em>Batteries H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getBatteriesV <em>Batteries V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getTimesV <em>Times V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getTimesH <em>Times H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getMultiPushes <em>Multi Pushes</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getMultiFadersH <em>Multi Faders H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getMultiFadersV <em>Multi Faders V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscTabPageImpl#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TouchOscTabPageImpl extends EObjectImpl implements TouchOscTabPage {
	/**
	 * The cached value of the '{@link #getFadersH() <em>Faders H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFadersH()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscFaderH> fadersH;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXyPads() <em>Xy Pads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXyPads()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscXYPad> xyPads;

	/**
	 * The cached value of the '{@link #getFadersV() <em>Faders V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFadersV()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscFaderV> fadersV;

	/**
	 * The cached value of the '{@link #getLabelsH() <em>Labels H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelsH()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscLabelH> labelsH;

	/**
	 * The cached value of the '{@link #getPushes() <em>Pushes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushes()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscPush> pushes;

	/**
	 * The cached value of the '{@link #getLabelsV() <em>Labels V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelsV()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscLabelV> labelsV;

	/**
	 * The cached value of the '{@link #getMultiToggles() <em>Multi Toggles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiToggles()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscMultiToggle> multiToggles;

	/**
	 * The cached value of the '{@link #getLeds() <em>Leds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeds()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscLED> leds;

	/**
	 * The cached value of the '{@link #getRotariesV() <em>Rotaries V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotariesV()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscRotaryV> rotariesV;

	/**
	 * The cached value of the '{@link #getRotariesH() <em>Rotaries H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotariesH()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscRotaryH> rotariesH;

	/**
	 * The cached value of the '{@link #getToggles() <em>Toggles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToggles()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscToggle> toggles;

	/**
	 * The cached value of the '{@link #getEncoders() <em>Encoders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoders()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscEncoder> encoders;

	/**
	 * The cached value of the '{@link #getBatteriesH() <em>Batteries H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteriesH()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscBatteryH> batteriesH;

	/**
	 * The cached value of the '{@link #getBatteriesV() <em>Batteries V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteriesV()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscBatteryV> batteriesV;

	/**
	 * The cached value of the '{@link #getTimesV() <em>Times V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesV()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscTimeV> timesV;

	/**
	 * The cached value of the '{@link #getTimesH() <em>Times H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimesH()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscTimeH> timesH;

	/**
	 * The cached value of the '{@link #getMultiPushes() <em>Multi Pushes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiPushes()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscMultiPush> multiPushes;

	/**
	 * The cached value of the '{@link #getMultiFadersH() <em>Multi Faders H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiFadersH()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscMultiFaderH> multiFadersH;

	/**
	 * The cached value of the '{@link #getMultiFadersV() <em>Multi Faders V</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiFadersV()
	 * @generated
	 * @ordered
	 */
	protected EList<TouchOscMultiFaderV> multiFadersV;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected TouchOscLayout layout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TouchOscTabPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscguiPackage.Literals.TOUCH_OSC_TAB_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscFaderH> getFadersH() {
		if (fadersH == null) {
			fadersH = new EObjectContainmentEList<TouchOscFaderH>(TouchOscFaderH.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_H);
		}
		return fadersH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscXYPad> getXyPads() {
		if (xyPads == null) {
			xyPads = new EObjectContainmentEList<TouchOscXYPad>(TouchOscXYPad.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__XY_PADS);
		}
		return xyPads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscFaderV> getFadersV() {
		if (fadersV == null) {
			fadersV = new EObjectContainmentEList<TouchOscFaderV>(TouchOscFaderV.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_V);
		}
		return fadersV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscLabelH> getLabelsH() {
		if (labelsH == null) {
			labelsH = new EObjectContainmentEList<TouchOscLabelH>(TouchOscLabelH.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_H);
		}
		return labelsH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscPush> getPushes() {
		if (pushes == null) {
			pushes = new EObjectContainmentEList<TouchOscPush>(TouchOscPush.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__PUSHES);
		}
		return pushes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscLabelV> getLabelsV() {
		if (labelsV == null) {
			labelsV = new EObjectContainmentEList<TouchOscLabelV>(TouchOscLabelV.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_V);
		}
		return labelsV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscMultiToggle> getMultiToggles() {
		if (multiToggles == null) {
			multiToggles = new EObjectContainmentEList<TouchOscMultiToggle>(TouchOscMultiToggle.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES);
		}
		return multiToggles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscLED> getLeds() {
		if (leds == null) {
			leds = new EObjectContainmentEList<TouchOscLED>(TouchOscLED.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LEDS);
		}
		return leds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscRotaryV> getRotariesV() {
		if (rotariesV == null) {
			rotariesV = new EObjectContainmentEList<TouchOscRotaryV>(TouchOscRotaryV.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_V);
		}
		return rotariesV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscRotaryH> getRotariesH() {
		if (rotariesH == null) {
			rotariesH = new EObjectContainmentEList<TouchOscRotaryH>(TouchOscRotaryH.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_H);
		}
		return rotariesH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscToggle> getToggles() {
		if (toggles == null) {
			toggles = new EObjectContainmentEList<TouchOscToggle>(TouchOscToggle.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TOGGLES);
		}
		return toggles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscEncoder> getEncoders() {
		if (encoders == null) {
			encoders = new EObjectContainmentEList<TouchOscEncoder>(TouchOscEncoder.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ENCODERS);
		}
		return encoders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscBatteryH> getBatteriesH() {
		if (batteriesH == null) {
			batteriesH = new EObjectContainmentEList<TouchOscBatteryH>(TouchOscBatteryH.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_H);
		}
		return batteriesH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscBatteryV> getBatteriesV() {
		if (batteriesV == null) {
			batteriesV = new EObjectContainmentEList<TouchOscBatteryV>(TouchOscBatteryV.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_V);
		}
		return batteriesV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscTimeV> getTimesV() {
		if (timesV == null) {
			timesV = new EObjectContainmentEList<TouchOscTimeV>(TouchOscTimeV.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_V);
		}
		return timesV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscTimeH> getTimesH() {
		if (timesH == null) {
			timesH = new EObjectContainmentEList<TouchOscTimeH>(TouchOscTimeH.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_H);
		}
		return timesH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscMultiPush> getMultiPushes() {
		if (multiPushes == null) {
			multiPushes = new EObjectContainmentEList<TouchOscMultiPush>(TouchOscMultiPush.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES);
		}
		return multiPushes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscMultiFaderH> getMultiFadersH() {
		if (multiFadersH == null) {
			multiFadersH = new EObjectContainmentEList<TouchOscMultiFaderH>(TouchOscMultiFaderH.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H);
		}
		return multiFadersH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TouchOscMultiFaderV> getMultiFadersV() {
		if (multiFadersV == null) {
			multiFadersV = new EObjectContainmentEList<TouchOscMultiFaderV>(TouchOscMultiFaderV.class, this, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V);
		}
		return multiFadersV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscLayout getLayout() {
		if (layout != null && layout.eIsProxy()) {
			InternalEObject oldLayout = (InternalEObject)layout;
			layout = (TouchOscLayout)eResolveProxy(oldLayout);
			if (layout != oldLayout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LAYOUT, oldLayout, layout));
			}
		}
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscLayout basicGetLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(TouchOscLayout newLayout) {
		TouchOscLayout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LAYOUT, oldLayout, layout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_H:
				return ((InternalEList<?>)getFadersH()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__XY_PADS:
				return ((InternalEList<?>)getXyPads()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_V:
				return ((InternalEList<?>)getFadersV()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_H:
				return ((InternalEList<?>)getLabelsH()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__PUSHES:
				return ((InternalEList<?>)getPushes()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_V:
				return ((InternalEList<?>)getLabelsV()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES:
				return ((InternalEList<?>)getMultiToggles()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LEDS:
				return ((InternalEList<?>)getLeds()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_V:
				return ((InternalEList<?>)getRotariesV()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_H:
				return ((InternalEList<?>)getRotariesH()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TOGGLES:
				return ((InternalEList<?>)getToggles()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ENCODERS:
				return ((InternalEList<?>)getEncoders()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_H:
				return ((InternalEList<?>)getBatteriesH()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_V:
				return ((InternalEList<?>)getBatteriesV()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_V:
				return ((InternalEList<?>)getTimesV()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_H:
				return ((InternalEList<?>)getTimesH()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES:
				return ((InternalEList<?>)getMultiPushes()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H:
				return ((InternalEList<?>)getMultiFadersH()).basicRemove(otherEnd, msgs);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V:
				return ((InternalEList<?>)getMultiFadersV()).basicRemove(otherEnd, msgs);
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
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_H:
				return getFadersH();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__NAME:
				return getName();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__XY_PADS:
				return getXyPads();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_V:
				return getFadersV();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_H:
				return getLabelsH();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__PUSHES:
				return getPushes();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_V:
				return getLabelsV();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES:
				return getMultiToggles();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LEDS:
				return getLeds();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_V:
				return getRotariesV();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_H:
				return getRotariesH();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TOGGLES:
				return getToggles();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ENCODERS:
				return getEncoders();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_H:
				return getBatteriesH();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_V:
				return getBatteriesV();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_V:
				return getTimesV();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_H:
				return getTimesH();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES:
				return getMultiPushes();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H:
				return getMultiFadersH();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V:
				return getMultiFadersV();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LAYOUT:
				if (resolve) return getLayout();
				return basicGetLayout();
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
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_H:
				getFadersH().clear();
				getFadersH().addAll((Collection<? extends TouchOscFaderH>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__NAME:
				setName((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__XY_PADS:
				getXyPads().clear();
				getXyPads().addAll((Collection<? extends TouchOscXYPad>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_V:
				getFadersV().clear();
				getFadersV().addAll((Collection<? extends TouchOscFaderV>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_H:
				getLabelsH().clear();
				getLabelsH().addAll((Collection<? extends TouchOscLabelH>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__PUSHES:
				getPushes().clear();
				getPushes().addAll((Collection<? extends TouchOscPush>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_V:
				getLabelsV().clear();
				getLabelsV().addAll((Collection<? extends TouchOscLabelV>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES:
				getMultiToggles().clear();
				getMultiToggles().addAll((Collection<? extends TouchOscMultiToggle>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LEDS:
				getLeds().clear();
				getLeds().addAll((Collection<? extends TouchOscLED>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_V:
				getRotariesV().clear();
				getRotariesV().addAll((Collection<? extends TouchOscRotaryV>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_H:
				getRotariesH().clear();
				getRotariesH().addAll((Collection<? extends TouchOscRotaryH>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TOGGLES:
				getToggles().clear();
				getToggles().addAll((Collection<? extends TouchOscToggle>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ENCODERS:
				getEncoders().clear();
				getEncoders().addAll((Collection<? extends TouchOscEncoder>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_H:
				getBatteriesH().clear();
				getBatteriesH().addAll((Collection<? extends TouchOscBatteryH>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_V:
				getBatteriesV().clear();
				getBatteriesV().addAll((Collection<? extends TouchOscBatteryV>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_V:
				getTimesV().clear();
				getTimesV().addAll((Collection<? extends TouchOscTimeV>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_H:
				getTimesH().clear();
				getTimesH().addAll((Collection<? extends TouchOscTimeH>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES:
				getMultiPushes().clear();
				getMultiPushes().addAll((Collection<? extends TouchOscMultiPush>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H:
				getMultiFadersH().clear();
				getMultiFadersH().addAll((Collection<? extends TouchOscMultiFaderH>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V:
				getMultiFadersV().clear();
				getMultiFadersV().addAll((Collection<? extends TouchOscMultiFaderV>)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LAYOUT:
				setLayout((TouchOscLayout)newValue);
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
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_H:
				getFadersH().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__XY_PADS:
				getXyPads().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_V:
				getFadersV().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_H:
				getLabelsH().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__PUSHES:
				getPushes().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_V:
				getLabelsV().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES:
				getMultiToggles().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LEDS:
				getLeds().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_V:
				getRotariesV().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_H:
				getRotariesH().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TOGGLES:
				getToggles().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ENCODERS:
				getEncoders().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_H:
				getBatteriesH().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_V:
				getBatteriesV().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_V:
				getTimesV().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_H:
				getTimesH().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES:
				getMultiPushes().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H:
				getMultiFadersH().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V:
				getMultiFadersV().clear();
				return;
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LAYOUT:
				setLayout((TouchOscLayout)null);
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
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_H:
				return fadersH != null && !fadersH.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__XY_PADS:
				return xyPads != null && !xyPads.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__FADERS_V:
				return fadersV != null && !fadersV.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_H:
				return labelsH != null && !labelsH.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__PUSHES:
				return pushes != null && !pushes.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LABELS_V:
				return labelsV != null && !labelsV.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES:
				return multiToggles != null && !multiToggles.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LEDS:
				return leds != null && !leds.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_V:
				return rotariesV != null && !rotariesV.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ROTARIES_H:
				return rotariesH != null && !rotariesH.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TOGGLES:
				return toggles != null && !toggles.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__ENCODERS:
				return encoders != null && !encoders.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_H:
				return batteriesH != null && !batteriesH.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__BATTERIES_V:
				return batteriesV != null && !batteriesV.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_V:
				return timesV != null && !timesV.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__TIMES_H:
				return timesH != null && !timesH.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_PUSHES:
				return multiPushes != null && !multiPushes.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H:
				return multiFadersH != null && !multiFadersH.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V:
				return multiFadersV != null && !multiFadersV.isEmpty();
			case TouchoscguiPackage.TOUCH_OSC_TAB_PAGE__LAYOUT:
				return layout != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TouchOscTabPageImpl
