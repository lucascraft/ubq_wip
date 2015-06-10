/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.AppProtocolT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;
import com.garmin.xmlschemas.garmin.device.v2.ProtocolT;
import com.garmin.xmlschemas.garmin.device.v2.ProtocolsT;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocols T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolsTImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolsTImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolsTImpl#getTransport <em>Transport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolsTImpl extends EObjectImpl implements ProtocolsT {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected ProtocolT link;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<AppProtocolT> application;

	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected ProtocolT transport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolsTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GarminDeviceV2Package.Literals.PROTOCOLS_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolT getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(ProtocolT newLink, NotificationChain msgs) {
		ProtocolT oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.PROTOCOLS_T__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(ProtocolT newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.PROTOCOLS_T__LINK, null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.PROTOCOLS_T__LINK, null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.PROTOCOLS_T__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AppProtocolT> getApplication() {
		if (application == null) {
			application = new EObjectContainmentEList<AppProtocolT>(AppProtocolT.class, this, GarminDeviceV2Package.PROTOCOLS_T__APPLICATION);
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolT getTransport() {
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransport(ProtocolT newTransport, NotificationChain msgs) {
		ProtocolT oldTransport = transport;
		transport = newTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT, oldTransport, newTransport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransport(ProtocolT newTransport) {
		if (newTransport != transport) {
			NotificationChain msgs = null;
			if (transport != null)
				msgs = ((InternalEObject)transport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT, null, msgs);
			if (newTransport != null)
				msgs = ((InternalEObject)newTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT, null, msgs);
			msgs = basicSetTransport(newTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT, newTransport, newTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GarminDeviceV2Package.PROTOCOLS_T__LINK:
				return basicSetLink(null, msgs);
			case GarminDeviceV2Package.PROTOCOLS_T__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
			case GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT:
				return basicSetTransport(null, msgs);
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
			case GarminDeviceV2Package.PROTOCOLS_T__LINK:
				return getLink();
			case GarminDeviceV2Package.PROTOCOLS_T__APPLICATION:
				return getApplication();
			case GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT:
				return getTransport();
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
			case GarminDeviceV2Package.PROTOCOLS_T__LINK:
				setLink((ProtocolT)newValue);
				return;
			case GarminDeviceV2Package.PROTOCOLS_T__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends AppProtocolT>)newValue);
				return;
			case GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT:
				setTransport((ProtocolT)newValue);
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
			case GarminDeviceV2Package.PROTOCOLS_T__LINK:
				setLink((ProtocolT)null);
				return;
			case GarminDeviceV2Package.PROTOCOLS_T__APPLICATION:
				getApplication().clear();
				return;
			case GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT:
				setTransport((ProtocolT)null);
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
			case GarminDeviceV2Package.PROTOCOLS_T__LINK:
				return link != null;
			case GarminDeviceV2Package.PROTOCOLS_T__APPLICATION:
				return application != null && !application.isEmpty();
			case GarminDeviceV2Package.PROTOCOLS_T__TRANSPORT:
				return transport != null;
		}
		return super.eIsSet(featureID);
	}

} //ProtocolsTImpl
