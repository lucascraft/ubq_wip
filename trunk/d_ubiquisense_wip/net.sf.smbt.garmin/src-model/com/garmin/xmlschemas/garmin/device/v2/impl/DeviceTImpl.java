/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.DeviceT;
import com.garmin.xmlschemas.garmin.device.v2.ExtensionsT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;
import com.garmin.xmlschemas.garmin.device.v2.GarminModeT;
import com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT;
import com.garmin.xmlschemas.garmin.device.v2.ModelT;
import com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT;

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
 * An implementation of the model object '<em><b>Device T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getRegistrationCode <em>Registration Code</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getUnlock <em>Unlock</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getMassStorageMode <em>Mass Storage Mode</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getGarminMode <em>Garmin Mode</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceTImpl extends EObjectImpl implements DeviceT {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected ModelT model;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The default value of the '{@link #getRegistrationCode() <em>Registration Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationCode()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistrationCode() <em>Registration Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationCode()
	 * @generated
	 * @ordered
	 */
	protected String registrationCode = REGISTRATION_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUnlock() <em>Unlock</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnlock()
	 * @generated
	 * @ordered
	 */
	protected EList<UnlockCodeT> unlock;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMassStorageMode() <em>Mass Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassStorageMode()
	 * @generated
	 * @ordered
	 */
	protected MassStorageModeT massStorageMode;

	/**
	 * The cached value of the '{@link #getGarminMode() <em>Garmin Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGarminMode()
	 * @generated
	 * @ordered
	 */
	protected GarminModeT garminMode;

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
	protected DeviceTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GarminDeviceV2Package.Literals.DEVICE_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelT getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelT newModel, NotificationChain msgs) {
		ModelT oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(ModelT newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		long oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GarminDeviceV2Package.DEVICE_T__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetId() {
		return idESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistrationCode() {
		return registrationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationCode(String newRegistrationCode) {
		String oldRegistrationCode = registrationCode;
		registrationCode = newRegistrationCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__REGISTRATION_CODE, oldRegistrationCode, registrationCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnlockCodeT> getUnlock() {
		if (unlock == null) {
			unlock = new EObjectContainmentEList<UnlockCodeT>(UnlockCodeT.class, this, GarminDeviceV2Package.DEVICE_T__UNLOCK);
		}
		return unlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassStorageModeT getMassStorageMode() {
		return massStorageMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassStorageMode(MassStorageModeT newMassStorageMode, NotificationChain msgs) {
		MassStorageModeT oldMassStorageMode = massStorageMode;
		massStorageMode = newMassStorageMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE, oldMassStorageMode, newMassStorageMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassStorageMode(MassStorageModeT newMassStorageMode) {
		if (newMassStorageMode != massStorageMode) {
			NotificationChain msgs = null;
			if (massStorageMode != null)
				msgs = ((InternalEObject)massStorageMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE, null, msgs);
			if (newMassStorageMode != null)
				msgs = ((InternalEObject)newMassStorageMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE, null, msgs);
			msgs = basicSetMassStorageMode(newMassStorageMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE, newMassStorageMode, newMassStorageMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminModeT getGarminMode() {
		return garminMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGarminMode(GarminModeT newGarminMode, NotificationChain msgs) {
		GarminModeT oldGarminMode = garminMode;
		garminMode = newGarminMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__GARMIN_MODE, oldGarminMode, newGarminMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGarminMode(GarminModeT newGarminMode) {
		if (newGarminMode != garminMode) {
			NotificationChain msgs = null;
			if (garminMode != null)
				msgs = ((InternalEObject)garminMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__GARMIN_MODE, null, msgs);
			if (newGarminMode != null)
				msgs = ((InternalEObject)newGarminMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__GARMIN_MODE, null, msgs);
			msgs = basicSetGarminMode(newGarminMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__GARMIN_MODE, newGarminMode, newGarminMode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.DEVICE_T__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.DEVICE_T__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GarminDeviceV2Package.DEVICE_T__MODEL:
				return basicSetModel(null, msgs);
			case GarminDeviceV2Package.DEVICE_T__UNLOCK:
				return ((InternalEList<?>)getUnlock()).basicRemove(otherEnd, msgs);
			case GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE:
				return basicSetMassStorageMode(null, msgs);
			case GarminDeviceV2Package.DEVICE_T__GARMIN_MODE:
				return basicSetGarminMode(null, msgs);
			case GarminDeviceV2Package.DEVICE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DEVICE_T__MODEL:
				return getModel();
			case GarminDeviceV2Package.DEVICE_T__ID:
				return getId();
			case GarminDeviceV2Package.DEVICE_T__REGISTRATION_CODE:
				return getRegistrationCode();
			case GarminDeviceV2Package.DEVICE_T__UNLOCK:
				return getUnlock();
			case GarminDeviceV2Package.DEVICE_T__DISPLAY_NAME:
				return getDisplayName();
			case GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE:
				return getMassStorageMode();
			case GarminDeviceV2Package.DEVICE_T__GARMIN_MODE:
				return getGarminMode();
			case GarminDeviceV2Package.DEVICE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DEVICE_T__MODEL:
				setModel((ModelT)newValue);
				return;
			case GarminDeviceV2Package.DEVICE_T__ID:
				setId((Long)newValue);
				return;
			case GarminDeviceV2Package.DEVICE_T__REGISTRATION_CODE:
				setRegistrationCode((String)newValue);
				return;
			case GarminDeviceV2Package.DEVICE_T__UNLOCK:
				getUnlock().clear();
				getUnlock().addAll((Collection<? extends UnlockCodeT>)newValue);
				return;
			case GarminDeviceV2Package.DEVICE_T__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE:
				setMassStorageMode((MassStorageModeT)newValue);
				return;
			case GarminDeviceV2Package.DEVICE_T__GARMIN_MODE:
				setGarminMode((GarminModeT)newValue);
				return;
			case GarminDeviceV2Package.DEVICE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DEVICE_T__MODEL:
				setModel((ModelT)null);
				return;
			case GarminDeviceV2Package.DEVICE_T__ID:
				unsetId();
				return;
			case GarminDeviceV2Package.DEVICE_T__REGISTRATION_CODE:
				setRegistrationCode(REGISTRATION_CODE_EDEFAULT);
				return;
			case GarminDeviceV2Package.DEVICE_T__UNLOCK:
				getUnlock().clear();
				return;
			case GarminDeviceV2Package.DEVICE_T__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE:
				setMassStorageMode((MassStorageModeT)null);
				return;
			case GarminDeviceV2Package.DEVICE_T__GARMIN_MODE:
				setGarminMode((GarminModeT)null);
				return;
			case GarminDeviceV2Package.DEVICE_T__EXTENSIONS:
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
			case GarminDeviceV2Package.DEVICE_T__MODEL:
				return model != null;
			case GarminDeviceV2Package.DEVICE_T__ID:
				return isSetId();
			case GarminDeviceV2Package.DEVICE_T__REGISTRATION_CODE:
				return REGISTRATION_CODE_EDEFAULT == null ? registrationCode != null : !REGISTRATION_CODE_EDEFAULT.equals(registrationCode);
			case GarminDeviceV2Package.DEVICE_T__UNLOCK:
				return unlock != null && !unlock.isEmpty();
			case GarminDeviceV2Package.DEVICE_T__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case GarminDeviceV2Package.DEVICE_T__MASS_STORAGE_MODE:
				return massStorageMode != null;
			case GarminDeviceV2Package.DEVICE_T__GARMIN_MODE:
				return garminMode != null;
			case GarminDeviceV2Package.DEVICE_T__EXTENSIONS:
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
		result.append(" (id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", registrationCode: ");
		result.append(registrationCode);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} //DeviceTImpl
