/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.DataTypeT;
import com.garmin.xmlschemas.garmin.device.v2.ExtensionsT;
import com.garmin.xmlschemas.garmin.device.v2.FileT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;

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
 * An implementation of the model object '<em><b>Data Type T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DataTypeTImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DataTypeTImpl#getFile <em>File</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DataTypeTImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeTImpl extends EObjectImpl implements DataTypeT {
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
	 * The cached value of the '{@link #getFile() <em>File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList<FileT> file;

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
	protected DataTypeTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GarminDeviceV2Package.Literals.DATA_TYPE_T;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DATA_TYPE_T__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileT> getFile() {
		if (file == null) {
			file = new EObjectContainmentEList<FileT>(FileT.class, this, GarminDeviceV2Package.DATA_TYPE_T__FILE);
		}
		return file;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GarminDeviceV2Package.DATA_TYPE_T__FILE:
				return ((InternalEList<?>)getFile()).basicRemove(otherEnd, msgs);
			case GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DATA_TYPE_T__NAME:
				return getName();
			case GarminDeviceV2Package.DATA_TYPE_T__FILE:
				return getFile();
			case GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DATA_TYPE_T__NAME:
				setName((String)newValue);
				return;
			case GarminDeviceV2Package.DATA_TYPE_T__FILE:
				getFile().clear();
				getFile().addAll((Collection<? extends FileT>)newValue);
				return;
			case GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DATA_TYPE_T__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GarminDeviceV2Package.DATA_TYPE_T__FILE:
				getFile().clear();
				return;
			case GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DATA_TYPE_T__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GarminDeviceV2Package.DATA_TYPE_T__FILE:
				return file != null && !file.isEmpty();
			case GarminDeviceV2Package.DATA_TYPE_T__EXTENSIONS:
				return extensions != null;
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

} //DataTypeTImpl
