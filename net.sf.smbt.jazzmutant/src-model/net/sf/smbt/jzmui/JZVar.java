/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZVar#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZVar#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZVar()
 * @model
 * @generated
 */
public interface JZVar extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(EStructuralFeature)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZVar_Attribute()
	 * @model
	 * @generated
	 */
	EStructuralFeature getAttribute();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZVar#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LemurTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @see #setTrigger(LemurTrigger)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZVar_Trigger()
	 * @model
	 * @generated
	 */
	LemurTrigger getTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZVar#getTrigger <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(LemurTrigger value);

} // JZVar
