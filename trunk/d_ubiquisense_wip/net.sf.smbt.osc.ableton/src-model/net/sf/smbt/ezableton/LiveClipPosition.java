/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Clip Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.LiveClipPosition#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveClipPosition#getClipID <em>Clip ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveClipPosition#getPosition <em>Position</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveClipPosition#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveClipPosition#getLoopStart <em>Loop Start</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveClipPosition#getLoopEnd <em>Loop End</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveClipPosition()
 * @model
 * @generated
 */
public interface LiveClipPosition extends AbletonLiveSndCmd {
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
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveClipPosition_TrackID()
	 * @model
	 * @generated
	 */
	int getTrackID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveClipPosition#getTrackID <em>Track ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track ID</em>' attribute.
	 * @see #getTrackID()
	 * @generated
	 */
	void setTrackID(int value);

	/**
	 * Returns the value of the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip ID</em>' attribute.
	 * @see #setClipID(int)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveClipPosition_ClipID()
	 * @model
	 * @generated
	 */
	int getClipID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveClipPosition#getClipID <em>Clip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip ID</em>' attribute.
	 * @see #getClipID()
	 * @generated
	 */
	void setClipID(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(float)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveClipPosition_Position()
	 * @model
	 * @generated
	 */
	float getPosition();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveClipPosition#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(float value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveClipPosition_Length()
	 * @model
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveClipPosition#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Start</em>' attribute.
	 * @see #setLoopStart(float)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveClipPosition_LoopStart()
	 * @model
	 * @generated
	 */
	float getLoopStart();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveClipPosition#getLoopStart <em>Loop Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Start</em>' attribute.
	 * @see #getLoopStart()
	 * @generated
	 */
	void setLoopStart(float value);

	/**
	 * Returns the value of the '<em><b>Loop End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop End</em>' attribute.
	 * @see #setLoopEnd(float)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveClipPosition_LoopEnd()
	 * @model
	 * @generated
	 */
	float getLoopEnd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveClipPosition#getLoopEnd <em>Loop End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop End</em>' attribute.
	 * @see #getLoopEnd()
	 * @generated
	 */
	void setLoopEnd(float value);

} // LiveClipPosition
