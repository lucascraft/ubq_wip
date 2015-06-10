/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.FileT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;
import com.garmin.xmlschemas.garmin.device.v2.LocationT;
import com.garmin.xmlschemas.garmin.device.v2.SpecificationT;
import com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File T</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.FileTImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.FileTImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.garmin.xmlschemas.garmin.device.v2.impl.FileTImpl#getTransferDirection <em>Transfer Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileTImpl extends EObjectImpl implements FileT {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected SpecificationT specification;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationT location;

	/**
	 * The default value of the '{@link #getTransferDirection() <em>Transfer Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TransferDirectionT TRANSFER_DIRECTION_EDEFAULT = TransferDirectionT.INPUT_OUTPUT;

	/**
	 * The cached value of the '{@link #getTransferDirection() <em>Transfer Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferDirection()
	 * @generated
	 * @ordered
	 */
	protected TransferDirectionT transferDirection = TRANSFER_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Transfer Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transferDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GarminDeviceV2Package.Literals.FILE_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationT getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(SpecificationT newSpecification, NotificationChain msgs) {
		SpecificationT oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.FILE_T__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(SpecificationT newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.FILE_T__SPECIFICATION, null, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.FILE_T__SPECIFICATION, null, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.FILE_T__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationT getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationT newLocation, NotificationChain msgs) {
		LocationT oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.FILE_T__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationT newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.FILE_T__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GarminDeviceV2Package.FILE_T__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.FILE_T__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferDirectionT getTransferDirection() {
		return transferDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferDirection(TransferDirectionT newTransferDirection) {
		TransferDirectionT oldTransferDirection = transferDirection;
		transferDirection = newTransferDirection == null ? TRANSFER_DIRECTION_EDEFAULT : newTransferDirection;
		boolean oldTransferDirectionESet = transferDirectionESet;
		transferDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GarminDeviceV2Package.FILE_T__TRANSFER_DIRECTION, oldTransferDirection, transferDirection, !oldTransferDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransferDirection() {
		TransferDirectionT oldTransferDirection = transferDirection;
		boolean oldTransferDirectionESet = transferDirectionESet;
		transferDirection = TRANSFER_DIRECTION_EDEFAULT;
		transferDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GarminDeviceV2Package.FILE_T__TRANSFER_DIRECTION, oldTransferDirection, TRANSFER_DIRECTION_EDEFAULT, oldTransferDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransferDirection() {
		return transferDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GarminDeviceV2Package.FILE_T__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case GarminDeviceV2Package.FILE_T__LOCATION:
				return basicSetLocation(null, msgs);
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
			case GarminDeviceV2Package.FILE_T__SPECIFICATION:
				return getSpecification();
			case GarminDeviceV2Package.FILE_T__LOCATION:
				return getLocation();
			case GarminDeviceV2Package.FILE_T__TRANSFER_DIRECTION:
				return getTransferDirection();
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
			case GarminDeviceV2Package.FILE_T__SPECIFICATION:
				setSpecification((SpecificationT)newValue);
				return;
			case GarminDeviceV2Package.FILE_T__LOCATION:
				setLocation((LocationT)newValue);
				return;
			case GarminDeviceV2Package.FILE_T__TRANSFER_DIRECTION:
				setTransferDirection((TransferDirectionT)newValue);
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
			case GarminDeviceV2Package.FILE_T__SPECIFICATION:
				setSpecification((SpecificationT)null);
				return;
			case GarminDeviceV2Package.FILE_T__LOCATION:
				setLocation((LocationT)null);
				return;
			case GarminDeviceV2Package.FILE_T__TRANSFER_DIRECTION:
				unsetTransferDirection();
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
			case GarminDeviceV2Package.FILE_T__SPECIFICATION:
				return specification != null;
			case GarminDeviceV2Package.FILE_T__LOCATION:
				return location != null;
			case GarminDeviceV2Package.FILE_T__TRANSFER_DIRECTION:
				return isSetTransferDirection();
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
		result.append(" (transferDirection: ");
		if (transferDirectionESet) result.append(transferDirection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FileTImpl
