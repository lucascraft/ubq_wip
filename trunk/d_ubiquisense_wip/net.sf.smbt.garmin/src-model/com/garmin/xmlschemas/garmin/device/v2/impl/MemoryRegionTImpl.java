/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.ExtensionsT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;
import com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT;
import com.garmin.xmlschemas.garmin.device.v2.VersionT;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Region T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#isIsErased <em>Is Erased</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#isIsRemoved <em>Is Removed</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#isIsUserUpdateable <em>Is User Updateable</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryRegionTImpl extends EObjectImpl implements MemoryRegionT {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final short ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected short id = ID_EDEFAULT;

	/**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idESet;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected VersionT version;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected String partNumber = PART_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsErased() <em>Is Erased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsErased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ERASED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsErased() <em>Is Erased</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsErased()
	 * @generated
	 * @ordered
	 */
	protected boolean isErased = IS_ERASED_EDEFAULT;

	/**
	 * This is true if the Is Erased attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isErasedESet;

	/**
	 * The default value of the '{@link #isIsRemoved() <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REMOVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRemoved() <em>Is Removed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRemoved()
	 * @generated
	 * @ordered
	 */
	protected boolean isRemoved = IS_REMOVED_EDEFAULT;

	/**
	 * This is true if the Is Removed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRemovedESet;

	/**
	 * The default value of the '{@link #isIsUserUpdateable() <em>Is User Updateable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUserUpdateable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_USER_UPDATEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUserUpdateable() <em>Is User Updateable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUserUpdateable()
	 * @generated
	 * @ordered
	 */
	protected boolean isUserUpdateable = IS_USER_UPDATEABLE_EDEFAULT;

	/**
	 * This is true if the Is User Updateable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isUserUpdateableESet;

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
	protected MemoryRegionTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GarminDeviceV2Package.Literals.MEMORY_REGION_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(short newId) {
		short oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__ID, oldId, id, !oldIdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetId() {
		short oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GarminDeviceV2Package.MEMORY_REGION_T__ID, oldId, ID_EDEFAULT, oldIdESet));
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
	public VersionT getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(VersionT newVersion, NotificationChain msgs) {
		VersionT oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(VersionT newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.MEMORY_REGION_T__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.MEMORY_REGION_T__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNumber(String newPartNumber) {
		String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__PART_NUMBER, oldPartNumber, partNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsErased() {
		return isErased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsErased(boolean newIsErased) {
		boolean oldIsErased = isErased;
		isErased = newIsErased;
		boolean oldIsErasedESet = isErasedESet;
		isErasedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__IS_ERASED, oldIsErased, isErased, !oldIsErasedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsErased() {
		boolean oldIsErased = isErased;
		boolean oldIsErasedESet = isErasedESet;
		isErased = IS_ERASED_EDEFAULT;
		isErasedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GarminDeviceV2Package.MEMORY_REGION_T__IS_ERASED, oldIsErased, IS_ERASED_EDEFAULT, oldIsErasedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsErased() {
		return isErasedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRemoved() {
		return isRemoved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemoved(boolean newIsRemoved) {
		boolean oldIsRemoved = isRemoved;
		isRemoved = newIsRemoved;
		boolean oldIsRemovedESet = isRemovedESet;
		isRemovedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__IS_REMOVED, oldIsRemoved, isRemoved, !oldIsRemovedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRemoved() {
		boolean oldIsRemoved = isRemoved;
		boolean oldIsRemovedESet = isRemovedESet;
		isRemoved = IS_REMOVED_EDEFAULT;
		isRemovedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GarminDeviceV2Package.MEMORY_REGION_T__IS_REMOVED, oldIsRemoved, IS_REMOVED_EDEFAULT, oldIsRemovedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRemoved() {
		return isRemovedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUserUpdateable() {
		return isUserUpdateable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUserUpdateable(boolean newIsUserUpdateable) {
		boolean oldIsUserUpdateable = isUserUpdateable;
		isUserUpdateable = newIsUserUpdateable;
		boolean oldIsUserUpdateableESet = isUserUpdateableESet;
		isUserUpdateableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__IS_USER_UPDATEABLE, oldIsUserUpdateable, isUserUpdateable, !oldIsUserUpdateableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsUserUpdateable() {
		boolean oldIsUserUpdateable = isUserUpdateable;
		boolean oldIsUserUpdateableESet = isUserUpdateableESet;
		isUserUpdateable = IS_USER_UPDATEABLE_EDEFAULT;
		isUserUpdateableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GarminDeviceV2Package.MEMORY_REGION_T__IS_USER_UPDATEABLE, oldIsUserUpdateable, IS_USER_UPDATEABLE_EDEFAULT, oldIsUserUpdateableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsUserUpdateable() {
		return isUserUpdateableESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GarminDeviceV2Package.MEMORY_REGION_T__VERSION:
				return basicSetVersion(null, msgs);
			case GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS:
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
			case GarminDeviceV2Package.MEMORY_REGION_T__ID:
				return getId();
			case GarminDeviceV2Package.MEMORY_REGION_T__VERSION:
				return getVersion();
			case GarminDeviceV2Package.MEMORY_REGION_T__DESCRIPTION:
				return getDescription();
			case GarminDeviceV2Package.MEMORY_REGION_T__PART_NUMBER:
				return getPartNumber();
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_ERASED:
				return isIsErased();
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_REMOVED:
				return isIsRemoved();
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_USER_UPDATEABLE:
				return isIsUserUpdateable();
			case GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS:
				return getExtensions();
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
			case GarminDeviceV2Package.MEMORY_REGION_T__ID:
				setId((Short)newValue);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__VERSION:
				setVersion((VersionT)newValue);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__PART_NUMBER:
				setPartNumber((String)newValue);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_ERASED:
				setIsErased((Boolean)newValue);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_REMOVED:
				setIsRemoved((Boolean)newValue);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_USER_UPDATEABLE:
				setIsUserUpdateable((Boolean)newValue);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS:
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
			case GarminDeviceV2Package.MEMORY_REGION_T__ID:
				unsetId();
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__VERSION:
				setVersion((VersionT)null);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__PART_NUMBER:
				setPartNumber(PART_NUMBER_EDEFAULT);
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_ERASED:
				unsetIsErased();
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_REMOVED:
				unsetIsRemoved();
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_USER_UPDATEABLE:
				unsetIsUserUpdateable();
				return;
			case GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS:
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
			case GarminDeviceV2Package.MEMORY_REGION_T__ID:
				return isSetId();
			case GarminDeviceV2Package.MEMORY_REGION_T__VERSION:
				return version != null;
			case GarminDeviceV2Package.MEMORY_REGION_T__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GarminDeviceV2Package.MEMORY_REGION_T__PART_NUMBER:
				return PART_NUMBER_EDEFAULT == null ? partNumber != null : !PART_NUMBER_EDEFAULT.equals(partNumber);
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_ERASED:
				return isSetIsErased();
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_REMOVED:
				return isSetIsRemoved();
			case GarminDeviceV2Package.MEMORY_REGION_T__IS_USER_UPDATEABLE:
				return isSetIsUserUpdateable();
			case GarminDeviceV2Package.MEMORY_REGION_T__EXTENSIONS:
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
		result.append(", description: ");
		result.append(description);
		result.append(", partNumber: ");
		result.append(partNumber);
		result.append(", isErased: ");
		if (isErasedESet) result.append(isErased); else result.append("<unset>");
		result.append(", isRemoved: ");
		if (isRemovedESet) result.append(isRemoved); else result.append("<unset>");
		result.append(", isUserUpdateable: ");
		if (isUserUpdateableESet) result.append(isUserUpdateable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MemoryRegionTImpl
