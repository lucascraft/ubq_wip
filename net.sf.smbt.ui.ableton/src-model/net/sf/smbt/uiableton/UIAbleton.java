/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Ableton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.uiableton.UIAbleton#getTracks <em>Tracks</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.UIAbleton#getMasterTrack <em>Master Track</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.UIAbleton#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.UIAbleton#getScenes <em>Scenes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIAbleton()
 * @model
 * @generated
 */
public interface UIAbleton extends EObject {
	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.uiableton.UIAbletonTrack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIAbleton_Tracks()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIAbletonTrack> getTracks();

	/**
	 * Returns the value of the '<em><b>Master Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Track</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Track</em>' containment reference.
	 * @see #setMasterTrack(UIAbletonMasterTrack)
	 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIAbleton_MasterTrack()
	 * @model containment="true"
	 * @generated
	 */
	UIAbletonMasterTrack getMasterTrack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.uiableton.UIAbleton#getMasterTrack <em>Master Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Track</em>' containment reference.
	 * @see #getMasterTrack()
	 * @generated
	 */
	void setMasterTrack(UIAbletonMasterTrack value);

	/**
	 * Returns the value of the '<em><b>Clips</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.uiableton.UIAbletonClip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clips</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' containment reference list.
	 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIAbleton_Clips()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIAbletonClip> getClips();

	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.uiableton.UIAbletonScene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIAbleton_Scenes()
	 * @model containment="true"
	 * @generated
	 */
	EList<UIAbletonScene> getScenes();

} // UIAbleton
