/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.EventTarget#getSource <em>Source</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventTarget#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTarget()
 * @model
 * @generated
 */
public interface EventTarget extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EClassifier)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTarget_Source()
	 * @model
	 * @generated
	 */
	EClassifier getSource();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventTarget#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.EventTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTarget_Triggers()
	 * @model
	 * @generated
	 */
	EList<EventTrigger> getTriggers();

} // EventTarget
