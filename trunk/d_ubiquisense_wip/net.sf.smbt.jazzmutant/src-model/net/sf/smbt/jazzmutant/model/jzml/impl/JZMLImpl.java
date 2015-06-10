/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.impl;

import java.util.Collection;

import net.sf.smbt.jazzmutant.model.jzml.JZML;
import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.PROJECT;
import net.sf.smbt.jazzmutant.model.jzml.WINDOW;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.JZMLImpl#getPROJECT <em>PROJECT</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.JZMLImpl#getWINDOW <em>WINDOW</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZMLImpl extends MinimalEObjectImpl.Container implements JZML {
	/**
	 * The cached value of the '{@link #getPROJECT() <em>PROJECT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROJECT()
	 * @generated
	 * @ordered
	 */
	protected PROJECT pROJECT;
	/**
	 * The cached value of the '{@link #getWINDOW() <em>WINDOW</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWINDOW()
	 * @generated
	 * @ordered
	 */
	protected EList<WINDOW> wINDOW;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmlPackage.Literals.JZML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROJECT getPROJECT() {
		return pROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPROJECT(PROJECT newPROJECT, NotificationChain msgs) {
		PROJECT oldPROJECT = pROJECT;
		pROJECT = newPROJECT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JzmlPackage.JZML__PROJECT, oldPROJECT, newPROJECT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPROJECT(PROJECT newPROJECT) {
		if (newPROJECT != pROJECT) {
			NotificationChain msgs = null;
			if (pROJECT != null)
				msgs = ((InternalEObject)pROJECT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JzmlPackage.JZML__PROJECT, null, msgs);
			if (newPROJECT != null)
				msgs = ((InternalEObject)newPROJECT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JzmlPackage.JZML__PROJECT, null, msgs);
			msgs = basicSetPROJECT(newPROJECT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.JZML__PROJECT, newPROJECT, newPROJECT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WINDOW> getWINDOW() {
		if (wINDOW == null) {
			wINDOW = new EObjectContainmentEList<WINDOW>(WINDOW.class, this, JzmlPackage.JZML__WINDOW);
		}
		return wINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JzmlPackage.JZML__PROJECT:
				return basicSetPROJECT(null, msgs);
			case JzmlPackage.JZML__WINDOW:
				return ((InternalEList<?>)getWINDOW()).basicRemove(otherEnd, msgs);
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
			case JzmlPackage.JZML__PROJECT:
				return getPROJECT();
			case JzmlPackage.JZML__WINDOW:
				return getWINDOW();
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
			case JzmlPackage.JZML__PROJECT:
				setPROJECT((PROJECT)newValue);
				return;
			case JzmlPackage.JZML__WINDOW:
				getWINDOW().clear();
				getWINDOW().addAll((Collection<? extends WINDOW>)newValue);
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
			case JzmlPackage.JZML__PROJECT:
				setPROJECT((PROJECT)null);
				return;
			case JzmlPackage.JZML__WINDOW:
				getWINDOW().clear();
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
			case JzmlPackage.JZML__PROJECT:
				return pROJECT != null;
			case JzmlPackage.JZML__WINDOW:
				return wINDOW != null && !wINDOW.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JZMLImpl
