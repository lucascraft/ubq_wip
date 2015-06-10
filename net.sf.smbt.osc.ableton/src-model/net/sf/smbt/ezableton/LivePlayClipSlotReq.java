/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Play Clip Slot Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.LivePlayClipSlotReq#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LivePlayClipSlotReq#getClipID <em>Clip ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezableton.EzabletonPackage#getLivePlayClipSlotReq()
 * @model
 * @generated
 */
public interface LivePlayClipSlotReq extends AbletonLiveSndCmd {
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
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLivePlayClipSlotReq_TrackID()
	 * @model
	 * @generated
	 */
	int getTrackID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LivePlayClipSlotReq#getTrackID <em>Track ID</em>}' attribute.
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
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLivePlayClipSlotReq_ClipID()
	 * @model
	 * @generated
	 */
	int getClipID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LivePlayClipSlotReq#getClipID <em>Clip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip ID</em>' attribute.
	 * @see #getClipID()
	 * @generated
	 */
	void setClipID(int value);

} // LivePlayClipSlotReq
