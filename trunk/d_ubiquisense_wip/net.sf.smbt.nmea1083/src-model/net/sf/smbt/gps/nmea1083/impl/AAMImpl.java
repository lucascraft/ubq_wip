/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083.impl;

import net.sf.smbt.gps.nmea1083.AAM;
import net.sf.smbt.gps.nmea1083.Nmea1083Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AAM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl#isArrivalCircleEntered <em>Arrival Circle Entered</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl#isPerpendicularPassedAtWaypoint <em>Perpendicular Passed At Waypoint</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl#getArrivalCircleRadius <em>Arrival Circle Radius</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl#getUnitOfRadiusInMiles <em>Unit Of Radius In Miles</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl#getWaypointID <em>Waypoint ID</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl#getChechksum <em>Chechksum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AAMImpl extends NmeaCmdImpl implements AAM {
	/**
	 * The default value of the '{@link #isArrivalCircleEntered() <em>Arrival Circle Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArrivalCircleEntered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRIVAL_CIRCLE_ENTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArrivalCircleEntered() <em>Arrival Circle Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArrivalCircleEntered()
	 * @generated
	 * @ordered
	 */
	protected boolean arrivalCircleEntered = ARRIVAL_CIRCLE_ENTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPerpendicularPassedAtWaypoint() <em>Perpendicular Passed At Waypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerpendicularPassedAtWaypoint()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERPENDICULAR_PASSED_AT_WAYPOINT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPerpendicularPassedAtWaypoint() <em>Perpendicular Passed At Waypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerpendicularPassedAtWaypoint()
	 * @generated
	 * @ordered
	 */
	protected boolean perpendicularPassedAtWaypoint = PERPENDICULAR_PASSED_AT_WAYPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalCircleRadius() <em>Arrival Circle Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalCircleRadius()
	 * @generated
	 * @ordered
	 */
	protected static final int ARRIVAL_CIRCLE_RADIUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArrivalCircleRadius() <em>Arrival Circle Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalCircleRadius()
	 * @generated
	 * @ordered
	 */
	protected int arrivalCircleRadius = ARRIVAL_CIRCLE_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitOfRadiusInMiles() <em>Unit Of Radius In Miles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfRadiusInMiles()
	 * @generated
	 * @ordered
	 */
	protected static final float UNIT_OF_RADIUS_IN_MILES_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnitOfRadiusInMiles() <em>Unit Of Radius In Miles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfRadiusInMiles()
	 * @generated
	 * @ordered
	 */
	protected float unitOfRadiusInMiles = UNIT_OF_RADIUS_IN_MILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaypointID() <em>Waypoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypointID()
	 * @generated
	 * @ordered
	 */
	protected static final String WAYPOINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaypointID() <em>Waypoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaypointID()
	 * @generated
	 * @ordered
	 */
	protected String waypointID = WAYPOINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChechksum() <em>Chechksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChechksum()
	 * @generated
	 * @ordered
	 */
	protected static final long CHECHKSUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChechksum() <em>Chechksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChechksum()
	 * @generated
	 * @ordered
	 */
	protected long chechksum = CHECHKSUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AAMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Nmea1083Package.Literals.AAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArrivalCircleEntered() {
		return arrivalCircleEntered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalCircleEntered(boolean newArrivalCircleEntered) {
		boolean oldArrivalCircleEntered = arrivalCircleEntered;
		arrivalCircleEntered = newArrivalCircleEntered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nmea1083Package.AAM__ARRIVAL_CIRCLE_ENTERED, oldArrivalCircleEntered, arrivalCircleEntered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPerpendicularPassedAtWaypoint() {
		return perpendicularPassedAtWaypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerpendicularPassedAtWaypoint(boolean newPerpendicularPassedAtWaypoint) {
		boolean oldPerpendicularPassedAtWaypoint = perpendicularPassedAtWaypoint;
		perpendicularPassedAtWaypoint = newPerpendicularPassedAtWaypoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nmea1083Package.AAM__PERPENDICULAR_PASSED_AT_WAYPOINT, oldPerpendicularPassedAtWaypoint, perpendicularPassedAtWaypoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArrivalCircleRadius() {
		return arrivalCircleRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalCircleRadius(int newArrivalCircleRadius) {
		int oldArrivalCircleRadius = arrivalCircleRadius;
		arrivalCircleRadius = newArrivalCircleRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nmea1083Package.AAM__ARRIVAL_CIRCLE_RADIUS, oldArrivalCircleRadius, arrivalCircleRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getUnitOfRadiusInMiles() {
		return unitOfRadiusInMiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitOfRadiusInMiles(float newUnitOfRadiusInMiles) {
		float oldUnitOfRadiusInMiles = unitOfRadiusInMiles;
		unitOfRadiusInMiles = newUnitOfRadiusInMiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nmea1083Package.AAM__UNIT_OF_RADIUS_IN_MILES, oldUnitOfRadiusInMiles, unitOfRadiusInMiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWaypointID() {
		return waypointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaypointID(String newWaypointID) {
		String oldWaypointID = waypointID;
		waypointID = newWaypointID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nmea1083Package.AAM__WAYPOINT_ID, oldWaypointID, waypointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChechksum() {
		return chechksum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChechksum(long newChechksum) {
		long oldChechksum = chechksum;
		chechksum = newChechksum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nmea1083Package.AAM__CHECHKSUM, oldChechksum, chechksum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_ENTERED:
				return isArrivalCircleEntered();
			case Nmea1083Package.AAM__PERPENDICULAR_PASSED_AT_WAYPOINT:
				return isPerpendicularPassedAtWaypoint();
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_RADIUS:
				return getArrivalCircleRadius();
			case Nmea1083Package.AAM__UNIT_OF_RADIUS_IN_MILES:
				return getUnitOfRadiusInMiles();
			case Nmea1083Package.AAM__WAYPOINT_ID:
				return getWaypointID();
			case Nmea1083Package.AAM__CHECHKSUM:
				return getChechksum();
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
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_ENTERED:
				setArrivalCircleEntered((Boolean)newValue);
				return;
			case Nmea1083Package.AAM__PERPENDICULAR_PASSED_AT_WAYPOINT:
				setPerpendicularPassedAtWaypoint((Boolean)newValue);
				return;
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_RADIUS:
				setArrivalCircleRadius((Integer)newValue);
				return;
			case Nmea1083Package.AAM__UNIT_OF_RADIUS_IN_MILES:
				setUnitOfRadiusInMiles((Float)newValue);
				return;
			case Nmea1083Package.AAM__WAYPOINT_ID:
				setWaypointID((String)newValue);
				return;
			case Nmea1083Package.AAM__CHECHKSUM:
				setChechksum((Long)newValue);
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
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_ENTERED:
				setArrivalCircleEntered(ARRIVAL_CIRCLE_ENTERED_EDEFAULT);
				return;
			case Nmea1083Package.AAM__PERPENDICULAR_PASSED_AT_WAYPOINT:
				setPerpendicularPassedAtWaypoint(PERPENDICULAR_PASSED_AT_WAYPOINT_EDEFAULT);
				return;
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_RADIUS:
				setArrivalCircleRadius(ARRIVAL_CIRCLE_RADIUS_EDEFAULT);
				return;
			case Nmea1083Package.AAM__UNIT_OF_RADIUS_IN_MILES:
				setUnitOfRadiusInMiles(UNIT_OF_RADIUS_IN_MILES_EDEFAULT);
				return;
			case Nmea1083Package.AAM__WAYPOINT_ID:
				setWaypointID(WAYPOINT_ID_EDEFAULT);
				return;
			case Nmea1083Package.AAM__CHECHKSUM:
				setChechksum(CHECHKSUM_EDEFAULT);
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
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_ENTERED:
				return arrivalCircleEntered != ARRIVAL_CIRCLE_ENTERED_EDEFAULT;
			case Nmea1083Package.AAM__PERPENDICULAR_PASSED_AT_WAYPOINT:
				return perpendicularPassedAtWaypoint != PERPENDICULAR_PASSED_AT_WAYPOINT_EDEFAULT;
			case Nmea1083Package.AAM__ARRIVAL_CIRCLE_RADIUS:
				return arrivalCircleRadius != ARRIVAL_CIRCLE_RADIUS_EDEFAULT;
			case Nmea1083Package.AAM__UNIT_OF_RADIUS_IN_MILES:
				return unitOfRadiusInMiles != UNIT_OF_RADIUS_IN_MILES_EDEFAULT;
			case Nmea1083Package.AAM__WAYPOINT_ID:
				return WAYPOINT_ID_EDEFAULT == null ? waypointID != null : !WAYPOINT_ID_EDEFAULT.equals(waypointID);
			case Nmea1083Package.AAM__CHECHKSUM:
				return chechksum != CHECHKSUM_EDEFAULT;
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
		result.append(" (arrivalCircleEntered: ");
		result.append(arrivalCircleEntered);
		result.append(", perpendicularPassedAtWaypoint: ");
		result.append(perpendicularPassedAtWaypoint);
		result.append(", arrivalCircleRadius: ");
		result.append(arrivalCircleRadius);
		result.append(", unitOfRadiusInMiles: ");
		result.append(unitOfRadiusInMiles);
		result.append(", waypointID: ");
		result.append(waypointID);
		result.append(", chechksum: ");
		result.append(chechksum);
		result.append(')');
		return result.toString();
	}

} //AAMImpl
