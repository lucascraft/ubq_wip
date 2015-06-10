/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

import net.sf.smbt.ezableton.TRACK_ARM_STATUS;
import net.sf.smbt.ezableton.TRACK_MUTE_STATUS;
import net.sf.smbt.ezableton.TRACK_SOLO_STATUS;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getPan <em>Pan</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getSolo <em>Solo</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getSend <em>Send</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getArm <em>Arm</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getMute <em>Mute</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getDelay <em>Delay</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getCoarse <em>Coarse</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getFine <em>Fine</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getBeats <em>Beats</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getDevices <em>Devices</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getState <em>State</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getTrackName <em>Track Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getLeftMeter <em>Left Meter</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getRightMeter <em>Right Meter</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveTrack#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack()
 * @model
 * @generated
 */
public interface LiveTrack extends EObject {
	/**
	 * Returns the value of the '<em><b>Track ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track ID</em>' attribute.
	 * @see #setTrackID(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_TrackID()
	 * @model
	 * @generated
	 */
	int getTrackID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getTrackID <em>Track ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track ID</em>' attribute.
	 * @see #getTrackID()
	 * @generated
	 */
	void setTrackID(int value);

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
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Volume()
	 * @model
	 * @generated
	 */
	float getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(float value);

	/**
	 * Returns the value of the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan</em>' attribute.
	 * @see #setPan(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Pan()
	 * @model
	 * @generated
	 */
	float getPan();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getPan <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan</em>' attribute.
	 * @see #getPan()
	 * @generated
	 */
	void setPan(float value);

	/**
	 * Returns the value of the '<em><b>Solo</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezableton.TRACK_SOLO_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solo</em>' attribute.
	 * @see net.sf.smbt.ezableton.TRACK_SOLO_STATUS
	 * @see #setSolo(TRACK_SOLO_STATUS)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Solo()
	 * @model
	 * @generated
	 */
	TRACK_SOLO_STATUS getSolo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getSolo <em>Solo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solo</em>' attribute.
	 * @see net.sf.smbt.ezableton.TRACK_SOLO_STATUS
	 * @see #getSolo()
	 * @generated
	 */
	void setSolo(TRACK_SOLO_STATUS value);

	/**
	 * Returns the value of the '<em><b>Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send</em>' attribute.
	 * @see #setSend(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Send()
	 * @model
	 * @generated
	 */
	int getSend();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getSend <em>Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send</em>' attribute.
	 * @see #getSend()
	 * @generated
	 */
	void setSend(int value);

	/**
	 * Returns the value of the '<em><b>Arm</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezableton.TRACK_ARM_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arm</em>' attribute.
	 * @see net.sf.smbt.ezableton.TRACK_ARM_STATUS
	 * @see #setArm(TRACK_ARM_STATUS)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Arm()
	 * @model
	 * @generated
	 */
	TRACK_ARM_STATUS getArm();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getArm <em>Arm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm</em>' attribute.
	 * @see net.sf.smbt.ezableton.TRACK_ARM_STATUS
	 * @see #getArm()
	 * @generated
	 */
	void setArm(TRACK_ARM_STATUS value);

	/**
	 * Returns the value of the '<em><b>Mute</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezableton.TRACK_MUTE_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mute</em>' attribute.
	 * @see net.sf.smbt.ezableton.TRACK_MUTE_STATUS
	 * @see #setMute(TRACK_MUTE_STATUS)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Mute()
	 * @model
	 * @generated
	 */
	TRACK_MUTE_STATUS getMute();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getMute <em>Mute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mute</em>' attribute.
	 * @see net.sf.smbt.ezableton.TRACK_MUTE_STATUS
	 * @see #getMute()
	 * @generated
	 */
	void setMute(TRACK_MUTE_STATUS value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Delay()
	 * @model
	 * @generated
	 */
	float getDelay();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(float value);

	/**
	 * Returns the value of the '<em><b>Coarse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coarse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coarse</em>' attribute.
	 * @see #setCoarse(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Coarse()
	 * @model
	 * @generated
	 */
	int getCoarse();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getCoarse <em>Coarse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coarse</em>' attribute.
	 * @see #getCoarse()
	 * @generated
	 */
	void setCoarse(int value);

	/**
	 * Returns the value of the '<em><b>Fine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fine</em>' attribute.
	 * @see #setFine(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Fine()
	 * @model
	 * @generated
	 */
	int getFine();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getFine <em>Fine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fine</em>' attribute.
	 * @see #getFine()
	 * @generated
	 */
	void setFine(int value);

	/**
	 * Returns the value of the '<em><b>Beats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beats</em>' attribute.
	 * @see #setBeats(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Beats()
	 * @model
	 * @generated
	 */
	float getBeats();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getBeats <em>Beats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beats</em>' attribute.
	 * @see #getBeats()
	 * @generated
	 */
	void setBeats(float value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractLiveDevice> getDevices();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezabletonctrl.TRACK_CONTROL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see net.sf.smbt.ezabletonctrl.TRACK_CONTROL
	 * @see #setState(TRACK_CONTROL)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_State()
	 * @model
	 * @generated
	 */
	TRACK_CONTROL getState();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see net.sf.smbt.ezabletonctrl.TRACK_CONTROL
	 * @see #getState()
	 * @generated
	 */
	void setState(TRACK_CONTROL value);

	/**
	 * Returns the value of the '<em><b>Clips</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.LiveClip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clips</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Clips()
	 * @model
	 * @generated
	 */
	EList<LiveClip> getClips();

	/**
	 * Returns the value of the '<em><b>Track Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Name</em>' attribute.
	 * @see #setTrackName(String)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_TrackName()
	 * @model
	 * @generated
	 */
	String getTrackName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getTrackName <em>Track Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Name</em>' attribute.
	 * @see #getTrackName()
	 * @generated
	 */
	void setTrackName(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_Color()
	 * @model
	 * @generated
	 */
	int getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(int value);

	/**
	 * Returns the value of the '<em><b>Left Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Meter</em>' attribute.
	 * @see #setLeftMeter(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_LeftMeter()
	 * @model
	 * @generated
	 */
	float getLeftMeter();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getLeftMeter <em>Left Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Meter</em>' attribute.
	 * @see #getLeftMeter()
	 * @generated
	 */
	void setLeftMeter(float value);

	/**
	 * Returns the value of the '<em><b>Right Meter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Meter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Meter</em>' attribute.
	 * @see #setRightMeter(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_RightMeter()
	 * @model
	 * @generated
	 */
	float getRightMeter();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getRightMeter <em>Right Meter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Meter</em>' attribute.
	 * @see #getRightMeter()
	 * @generated
	 */
	void setRightMeter(float value);

	/**
	 * Returns the value of the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Seen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Seen</em>' attribute.
	 * @see #setLastSeen(long)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_LastSeen()
	 * @model
	 * @generated
	 */
	long getLastSeen();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getLastSeen <em>Last Seen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Seen</em>' attribute.
	 * @see #getLastSeen()
	 * @generated
	 */
	void setLastSeen(long value);

	/**
	 * Returns the value of the '<em><b>View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' containment reference.
	 * @see #setView(LiveTrackView)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveTrack_View()
	 * @model containment="true"
	 * @generated
	 */
	LiveTrackView getView();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveTrack#getView <em>View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' containment reference.
	 * @see #getView()
	 * @generated
	 */
	void setView(LiveTrackView value);

} // LiveTrack
