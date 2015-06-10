/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Name Trackblock Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getSize <em>Size</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getTrackName <em>Track Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveNameTrackblockReq()
 * @model
 * @generated
 */
public interface LiveNameTrackblockReq extends AbletonLiveSndCmd {
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
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveNameTrackblockReq_TrackID()
	 * @model
	 * @generated
	 */
	int getTrackID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getTrackID <em>Track ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track ID</em>' attribute.
	 * @see #getTrackID()
	 * @generated
	 */
	void setTrackID(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveNameTrackblockReq_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezableton.LiveNameTrackblockReq#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Track Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Name</em>' attribute list.
	 * @see net.sf.smbt.ezableton.EzabletonPackage#getLiveNameTrackblockReq_TrackName()
	 * @model
	 * @generated
	 */
	EList<String> getTrackName();

} // LiveNameTrackblockReq
