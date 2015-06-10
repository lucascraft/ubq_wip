/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.ExtensionsT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;
import com.garmin.xmlschemas.garmin.device.v2.GarminModeT;
import com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT;
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
 * An implementation of the model object '<em><b>Garmin Mode T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.GarminModeTImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.GarminModeTImpl#getMemoryRegion <em>Memory Region</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.GarminModeTImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GarminModeTImpl extends EObjectImpl implements GarminModeT {
	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected ProtocolsT protocols;

	/**
	 * The cached value of the '{@link #getMemoryRegion() <em>Memory Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<MemoryRegionT> memoryRegion;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsT extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GarminModeTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GarminDeviceV2Package.Literals.GARMIN_MODE_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolsT getProtocols() {
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocols(ProtocolsT newProtocols, NotificationChain msgs) {
		ProtocolsT oldProtocols = protocols;
		protocols = newProtocols;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS, oldProtocols, newProtocols);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocols(ProtocolsT newProtocols) {
		if (newProtocols != protocols) {
			NotificationChain msgs = null;
			if (protocols != null)
				msgs = ((InternalEObject)protocols).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS, null, msgs);
			if (newProtocols != null)
				msgs = ((InternalEObject)newProtocols).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS, null, msgs);
			msgs = basicSetProtocols(newProtocols, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS, newProtocols, newProtocols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MemoryRegionT> getMemoryRegion() {
		if (memoryRegion == null) {
			memoryRegion = new EObjectContainmentEList<MemoryRegionT>(MemoryRegionT.class, this, GarminDeviceV2Package.GARMIN_MODE_T__MEMORY_REGION);
		}
		return memoryRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsT getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsT newExtensions, NotificationChain msgs) {
		ExtensionsT oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsT newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS:
				return basicSetProtocols(null, msgs);
			case GarminDeviceV2Package.GARMIN_MODE_T__MEMORY_REGION:
				return ((InternalEList<?>)getMemoryRegion()).basicRemove(otherEnd, msgs);
			case GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS:
				return basicSetExtensions(null, msgs);
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
			case GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS:
				return getProtocols();
			case GarminDeviceV2Package.GARMIN_MODE_T__MEMORY_REGION:
				return getMemoryRegion();
			case GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS:
				return getExtensions();
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
			case GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS:
				setProtocols((ProtocolsT)newValue);
				return;
			case GarminDeviceV2Package.GARMIN_MODE_T__MEMORY_REGION:
				getMemoryRegion().clear();
				getMemoryRegion().addAll((Collection<? extends MemoryRegionT>)newValue);
				return;
			case GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS:
				setExtensions((ExtensionsT)newValue);
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
			case GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS:
				setProtocols((ProtocolsT)null);
				return;
			case GarminDeviceV2Package.GARMIN_MODE_T__MEMORY_REGION:
				getMemoryRegion().clear();
				return;
			case GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS:
				setExtensions((ExtensionsT)null);
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
			case GarminDeviceV2Package.GARMIN_MODE_T__PROTOCOLS:
				return protocols != null;
			case GarminDeviceV2Package.GARMIN_MODE_T__MEMORY_REGION:
				return memoryRegion != null && !memoryRegion.isEmpty();
			case GarminDeviceV2Package.GARMIN_MODE_T__EXTENSIONS:
				return extensions != null;
		}
		return super.eIsSet(featureID);
	}

} //GarminModeTImpl
