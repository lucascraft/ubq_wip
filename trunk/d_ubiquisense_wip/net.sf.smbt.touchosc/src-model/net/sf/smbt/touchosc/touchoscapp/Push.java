/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.Push#isLocalFeedbackOff <em>Local Feedback Off</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getPush()
 * @model
 * @generated
 */
public interface Push extends Widget {

	/**
	 * Returns the value of the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Feedback Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Feedback Off</em>' attribute.
	 * @see #setLocalFeedbackOff(boolean)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getPush_LocalFeedbackOff()
	 * @model
	 * @generated
	 */
	boolean isLocalFeedbackOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.Push#isLocalFeedbackOff <em>Local Feedback Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Feedback Off</em>' attribute.
	 * @see #isLocalFeedbackOff()
	 * @generated
	 */
	void setLocalFeedbackOff(boolean value);
} // Push
