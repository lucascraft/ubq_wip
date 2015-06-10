/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.DataTypeT;
import com.garmin.xmlschemas.garmin.device.v2.ExtensionsT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;
import com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT;
import com.garmin.xmlschemas.garmin.device.v2.UpdateFileT;

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
 * An implementation of the model object '<em><b>Mass Storage Mode T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MassStorageModeTImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MassStorageModeTImpl#getUpdateFile <em>Update File</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MassStorageModeTImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MassStorageModeTImpl extends EObjectImpl implements MassStorageModeT {
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataTypeT> dataType;

	/**
	 * The cached value of the '{@link #getUpdateFile() <em>Update File</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateFile()
	 * @generated
	 * @ordered
	 */
	protected EList<UpdateFileT> updateFile;

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
	protected MassStorageModeTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GarminDeviceV2Package.Literals.MASS_STORAGE_MODE_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeT> getDataType() {
		if (dataType == null) {
			dataType = new EObjectContainmentEList<DataTypeT>(DataTypeT.class, this, GarminDeviceV2Package.MASS_STORAGE_MODE_T__DATA_TYPE);
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UpdateFileT> getUpdateFile() {
		if (updateFile == null) {
			updateFile = new EObjectContainmentEList<UpdateFileT>(UpdateFileT.class, this, GarminDeviceV2Package.MASS_STORAGE_MODE_T__UPDATE_FILE);
		}
		return updateFile;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__DATA_TYPE:
				return ((InternalEList<?>)getDataType()).basicRemove(otherEnd, msgs);
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__UPDATE_FILE:
				return ((InternalEList<?>)getUpdateFile()).basicRemove(otherEnd, msgs);
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__DATA_TYPE:
				return getDataType();
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__UPDATE_FILE:
				return getUpdateFile();
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__DATA_TYPE:
				getDataType().clear();
				getDataType().addAll((Collection<? extends DataTypeT>)newValue);
				return;
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__UPDATE_FILE:
				getUpdateFile().clear();
				getUpdateFile().addAll((Collection<? extends UpdateFileT>)newValue);
				return;
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__DATA_TYPE:
				getDataType().clear();
				return;
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__UPDATE_FILE:
				getUpdateFile().clear();
				return;
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__DATA_TYPE:
				return dataType != null && !dataType.isEmpty();
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__UPDATE_FILE:
				return updateFile != null && !updateFile.isEmpty();
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T__EXTENSIONS:
				return extensions != null;
		}
		return super.eIsSet(featureID);
	}

} //MassStorageModeTImpl
