/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Ableton Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.uiableton.UIAbletonTrack#getClips <em>Clips</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIAbletonTrack()
 * @model
 * @generated
 */
public interface UIAbletonTrack extends UIItem {
	/**
	 * Returns the value of the '<em><b>Clips</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.uiableton.UIAbletonClip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clips</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' reference list.
	 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIAbletonTrack_Clips()
	 * @model
	 * @generated
	 */
	EList<UIAbletonClip> getClips();

} // UIAbletonTrack
