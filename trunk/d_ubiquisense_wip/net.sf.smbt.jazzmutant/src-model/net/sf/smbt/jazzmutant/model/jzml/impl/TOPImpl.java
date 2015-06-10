/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.impl;

import net.sf.smbt.jazzmutant.model.jzml.JZML;
import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.TOP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.TOPImpl#getJZML <em>JZML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TOPImpl extends MinimalEObjectImpl.Container implements TOP {
	/**
	 * The cached value of the '{@link #getJZML() <em>JZML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJZML()
	 * @generated
	 * @ordered
	 */
	protected JZML jZML;

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
		return JzmlPackage.Literals.TOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZML getJZML() {
		return jZML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJZML(JZML newJZML, NotificationChain msgs) {
		JZML oldJZML = jZML;
		jZML = newJZML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JzmlPackage.TOP__JZML, oldJZML, newJZML);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJZML(JZML newJZML) {
		if (newJZML != jZML) {
			NotificationChain msgs = null;
			if (jZML != null)
				msgs = ((InternalEObject)jZML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JzmlPackage.TOP__JZML, null, msgs);
			if (newJZML != null)
				msgs = ((InternalEObject)newJZML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JzmlPackage.TOP__JZML, null, msgs);
			msgs = basicSetJZML(newJZML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.TOP__JZML, newJZML, newJZML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JzmlPackage.TOP__JZML:
				return basicSetJZML(null, msgs);
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
			case JzmlPackage.TOP__JZML:
				return getJZML();
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
			case JzmlPackage.TOP__JZML:
				setJZML((JZML)newValue);
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
			case JzmlPackage.TOP__JZML:
				setJZML((JZML)null);
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
			case JzmlPackage.TOP__JZML:
				return jZML != null;
		}
		return super.eIsSet(featureID);
	}

} //TOPImpl
