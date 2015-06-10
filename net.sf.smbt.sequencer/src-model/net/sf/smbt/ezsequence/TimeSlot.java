/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.TimeSlot#getTriggerLink <em>Trigger Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeSlot()
 * @model
 * @generated
 */
public interface TimeSlot extends EObject {
	/**
	 * Returns the value of the '<em><b>Trigger Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Link</em>' reference.
	 * @see #setTriggerLink(AbstractPort)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeSlot_TriggerLink()
	 * @model
	 * @generated
	 */
	AbstractPort getTriggerLink();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeSlot#getTriggerLink <em>Trigger Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Link</em>' reference.
	 * @see #getTriggerLink()
	 * @generated
	 */
	void setTriggerLink(AbstractPort value);

} // TimeSlot
