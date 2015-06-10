/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KB Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.KBDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.KBDynaProperties#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getKBDynaProperties()
 * @model
 * @generated
 */
public interface KBDynaProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Lemur Trigger</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LemurTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lemur Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lemur Trigger</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @see #setLemurTrigger(LemurTrigger)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getKBDynaProperties_LemurTrigger()
	 * @model
	 * @generated
	 */
	LemurTrigger getLemurTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.KBDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lemur Trigger</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @see #getLemurTrigger()
	 * @generated
	 */
	void setLemurTrigger(LemurTrigger value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getKBDynaProperties_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.KBDynaProperties#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // KBDynaProperties
