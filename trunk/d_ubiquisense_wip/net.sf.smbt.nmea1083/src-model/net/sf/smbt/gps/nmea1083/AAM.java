/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AAM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.gps.nmea1083.AAM#isArrivalCircleEntered <em>Arrival Circle Entered</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.AAM#isPerpendicularPassedAtWaypoint <em>Perpendicular Passed At Waypoint</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.AAM#getArrivalCircleRadius <em>Arrival Circle Radius</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.AAM#getUnitOfRadiusInMiles <em>Unit Of Radius In Miles</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.AAM#getWaypointID <em>Waypoint ID</em>}</li>
 *   <li>{@link net.sf.smbt.gps.nmea1083.AAM#getChechksum <em>Chechksum</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getAAM()
 * @model
 * @generated
 */
public interface AAM extends NmeaCmd {
	/**
	 * Returns the value of the '<em><b>Arrival Circle Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Circle Entered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Circle Entered</em>' attribute.
	 * @see #setArrivalCircleEntered(boolean)
	 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getAAM_ArrivalCircleEntered()
	 * @model
	 * @generated
	 */
	boolean isArrivalCircleEntered();

	/**
	 * Sets the value of the '{@link net.sf.smbt.gps.nmea1083.AAM#isArrivalCircleEntered <em>Arrival Circle Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Circle Entered</em>' attribute.
	 * @see #isArrivalCircleEntered()
	 * @generated
	 */
	void setArrivalCircleEntered(boolean value);

	/**
	 * Returns the value of the '<em><b>Perpendicular Passed At Waypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perpendicular Passed At Waypoint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perpendicular Passed At Waypoint</em>' attribute.
	 * @see #setPerpendicularPassedAtWaypoint(boolean)
	 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getAAM_PerpendicularPassedAtWaypoint()
	 * @model
	 * @generated
	 */
	boolean isPerpendicularPassedAtWaypoint();

	/**
	 * Sets the value of the '{@link net.sf.smbt.gps.nmea1083.AAM#isPerpendicularPassedAtWaypoint <em>Perpendicular Passed At Waypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perpendicular Passed At Waypoint</em>' attribute.
	 * @see #isPerpendicularPassedAtWaypoint()
	 * @generated
	 */
	void setPerpendicularPassedAtWaypoint(boolean value);

	/**
	 * Returns the value of the '<em><b>Arrival Circle Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Circle Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Circle Radius</em>' attribute.
	 * @see #setArrivalCircleRadius(int)
	 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getAAM_ArrivalCircleRadius()
	 * @model
	 * @generated
	 */
	int getArrivalCircleRadius();

	/**
	 * Sets the value of the '{@link net.sf.smbt.gps.nmea1083.AAM#getArrivalCircleRadius <em>Arrival Circle Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Circle Radius</em>' attribute.
	 * @see #getArrivalCircleRadius()
	 * @generated
	 */
	void setArrivalCircleRadius(int value);

	/**
	 * Returns the value of the '<em><b>Unit Of Radius In Miles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Radius In Miles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Radius In Miles</em>' attribute.
	 * @see #setUnitOfRadiusInMiles(float)
	 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getAAM_UnitOfRadiusInMiles()
	 * @model
	 * @generated
	 */
	float getUnitOfRadiusInMiles();

	/**
	 * Sets the value of the '{@link net.sf.smbt.gps.nmea1083.AAM#getUnitOfRadiusInMiles <em>Unit Of Radius In Miles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Of Radius In Miles</em>' attribute.
	 * @see #getUnitOfRadiusInMiles()
	 * @generated
	 */
	void setUnitOfRadiusInMiles(float value);

	/**
	 * Returns the value of the '<em><b>Waypoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waypoint ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waypoint ID</em>' attribute.
	 * @see #setWaypointID(String)
	 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getAAM_WaypointID()
	 * @model
	 * @generated
	 */
	String getWaypointID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.gps.nmea1083.AAM#getWaypointID <em>Waypoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waypoint ID</em>' attribute.
	 * @see #getWaypointID()
	 * @generated
	 */
	void setWaypointID(String value);

	/**
	 * Returns the value of the '<em><b>Chechksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chechksum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chechksum</em>' attribute.
	 * @see #setChechksum(long)
	 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#getAAM_Chechksum()
	 * @model
	 * @generated
	 */
	long getChechksum();

	/**
	 * Sets the value of the '{@link net.sf.smbt.gps.nmea1083.AAM#getChechksum <em>Chechksum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chechksum</em>' attribute.
	 * @see #getChechksum()
	 * @generated
	 */
	void setChechksum(long value);

} // AAM
