/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.impl;

import net.sf.smbt.touchosc.ui.touchoscgui.TOP;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TOPImpl#getLayouts <em>Layouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TOPImpl extends EObjectImpl implements TOP {
	/**
	 * The cached value of the '{@link #getLayouts() <em>Layouts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayouts()
	 * @generated
	 * @ordered
	 */
	protected TouchOscLayout layouts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscguiPackage.Literals.TOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscLayout getLayouts() {
		return layouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayouts(TouchOscLayout newLayouts, NotificationChain msgs) {
		TouchOscLayout oldLayouts = layouts;
		layouts = newLayouts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOP__LAYOUTS, oldLayouts, newLayouts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayouts(TouchOscLayout newLayouts) {
		if (newLayouts != layouts) {
			NotificationChain msgs = null;
			if (layouts != null)
				msgs = ((InternalEObject)layouts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TouchoscguiPackage.TOP__LAYOUTS, null, msgs);
			if (newLayouts != null)
				msgs = ((InternalEObject)newLayouts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TouchoscguiPackage.TOP__LAYOUTS, null, msgs);
			msgs = basicSetLayouts(newLayouts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOP__LAYOUTS, newLayouts, newLayouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouchoscguiPackage.TOP__LAYOUTS:
				return basicSetLayouts(null, msgs);
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
			case TouchoscguiPackage.TOP__LAYOUTS:
				return getLayouts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TouchoscguiPackage.TOP__LAYOUTS:
				setLayouts((TouchOscLayout)newValue);
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
			case TouchoscguiPackage.TOP__LAYOUTS:
				setLayouts((TouchOscLayout)null);
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
			case TouchoscguiPackage.TOP__LAYOUTS:
				return layouts != null;
		}
		return super.eIsSet(featureID);
	}

} //TOPImpl
