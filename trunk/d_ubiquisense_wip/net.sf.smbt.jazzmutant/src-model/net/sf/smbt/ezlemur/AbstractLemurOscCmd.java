/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Lemur Osc Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezlemur.AbstractLemurOscCmd#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezlemur.EzlemurPackage#getAbstractLemurOscCmd()
 * @model
 * @generated
 */
public interface AbstractLemurOscCmd extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EStructuralFeature)
	 * @see net.sf.smbt.ezlemur.EzlemurPackage#getAbstractLemurOscCmd_Target()
	 * @model
	 * @generated
	 */
	EStructuralFeature getTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezlemur.AbstractLemurOscCmd#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EStructuralFeature value);

} // AbstractLemurOscCmd
