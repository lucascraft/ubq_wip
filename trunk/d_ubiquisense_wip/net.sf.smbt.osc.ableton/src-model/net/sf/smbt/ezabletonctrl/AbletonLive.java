/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ableton Live</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getVer <em>Ver</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getMasterTrack <em>Master Track</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTracks <em>Tracks</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getCurrentScene <em>Current Scene</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getState <em>State</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#isOverdub <em>Overdub</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTempo <em>Tempo</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#isUbqtNotificationOn <em>Ubqt Notification On</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbletonLive#getControlSurfaces <em>Control Surfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive()
 * @model
 * @generated
 */
public interface AbletonLive extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Ver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ver</em>' attribute.
	 * @see #setVer(String)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Ver()
	 * @model
	 * @generated
	 */
	String getVer();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getVer <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ver</em>' attribute.
	 * @see #getVer()
	 * @generated
	 */
	void setVer(String value);

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.LiveTrack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Tracks()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiveTrack> getTracks();

	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.LiveScene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Scenes()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiveScene> getScenes();

	/**
	 * Returns the value of the '<em><b>Clips</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.LiveClip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clips</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' containment reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Clips()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiveClip> getClips();

	/**
	 * Returns the value of the '<em><b>Current Scene</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Scene</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Scene</em>' reference.
	 * @see #setCurrentScene(LiveScene)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_CurrentScene()
	 * @model
	 * @generated
	 */
	LiveScene getCurrentScene();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getCurrentScene <em>Current Scene</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Scene</em>' reference.
	 * @see #getCurrentScene()
	 * @generated
	 */
	void setCurrentScene(LiveScene value);

	/**
	 * Returns the value of the '<em><b>Master Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Track</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Track</em>' containment reference.
	 * @see #setMasterTrack(LiveMaster)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_MasterTrack()
	 * @model containment="true"
	 * @generated
	 */
	LiveMaster getMasterTrack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getMasterTrack <em>Master Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Track</em>' containment reference.
	 * @see #getMasterTrack()
	 * @generated
	 */
	void setMasterTrack(LiveMaster value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezabletonctrl.MASTER_CTRL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see net.sf.smbt.ezabletonctrl.MASTER_CTRL
	 * @see #setState(MASTER_CTRL)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_State()
	 * @model
	 * @generated
	 */
	MASTER_CTRL getState();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see net.sf.smbt.ezabletonctrl.MASTER_CTRL
	 * @see #getState()
	 * @generated
	 */
	void setState(MASTER_CTRL value);

	/**
	 * Returns the value of the '<em><b>Overdub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overdub</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overdub</em>' attribute.
	 * @see #setOverdub(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Overdub()
	 * @model
	 * @generated
	 */
	boolean isOverdub();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#isOverdub <em>Overdub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overdub</em>' attribute.
	 * @see #isOverdub()
	 * @generated
	 */
	void setOverdub(boolean value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Tempo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tempo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tempo</em>' attribute.
	 * @see #setTempo(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_Tempo()
	 * @model
	 * @generated
	 */
	float getTempo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#getTempo <em>Tempo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tempo</em>' attribute.
	 * @see #getTempo()
	 * @generated
	 */
	void setTempo(float value);

	/**
	 * Returns the value of the '<em><b>Ubqt Notification On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ubqt Notification On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ubqt Notification On</em>' attribute.
	 * @see #setUbqtNotificationOn(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_UbqtNotificationOn()
	 * @model
	 * @generated
	 */
	boolean isUbqtNotificationOn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbletonLive#isUbqtNotificationOn <em>Ubqt Notification On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ubqt Notification On</em>' attribute.
	 * @see #isUbqtNotificationOn()
	 * @generated
	 */
	void setUbqtNotificationOn(boolean value);

	/**
	 * Returns the value of the '<em><b>Control Surfaces</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.ControlSurface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Surfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Surfaces</em>' containment reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbletonLive_ControlSurfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlSurface> getControlSurfaces();

} // AbletonLive
