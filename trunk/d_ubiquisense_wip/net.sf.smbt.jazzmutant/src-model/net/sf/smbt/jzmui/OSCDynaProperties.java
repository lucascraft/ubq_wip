/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import net.sf.smbt.ezlemur.LemurOscCmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSC Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.OSCDynaProperties#isCustomOscMsg <em>Custom Osc Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.OSCDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.OSCDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.OSCDynaProperties#getOscMsg <em>Osc Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.OSCDynaProperties#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getOSCDynaProperties()
 * @model
 * @generated
 */
public interface OSCDynaProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Osc Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Osc Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Osc Msg</em>' attribute.
	 * @see #setCustomOscMsg(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getOSCDynaProperties_CustomOscMsg()
	 * @model
	 * @generated
	 */
	boolean isCustomOscMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.OSCDynaProperties#isCustomOscMsg <em>Custom Osc Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Osc Msg</em>' attribute.
	 * @see #isCustomOscMsg()
	 * @generated
	 */
	void setCustomOscMsg(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getOSCDynaProperties_LemurTrigger()
	 * @model
	 * @generated
	 */
	LemurTrigger getLemurTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.OSCDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lemur Trigger</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @see #getLemurTrigger()
	 * @generated
	 */
	void setLemurTrigger(LemurTrigger value);

	/**
	 * Returns the value of the '<em><b>EStructural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EStructural Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EStructural Feature</em>' reference.
	 * @see #setEStructuralFeature(EStructuralFeature)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getOSCDynaProperties_EStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.OSCDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EStructural Feature</em>' reference.
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	void setEStructuralFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Osc Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Msg</em>' reference.
	 * @see #setOscMsg(LemurOscCmd)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getOSCDynaProperties_OscMsg()
	 * @model
	 * @generated
	 */
	LemurOscCmd getOscMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.OSCDynaProperties#getOscMsg <em>Osc Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Msg</em>' reference.
	 * @see #getOscMsg()
	 * @generated
	 */
	void setOscMsg(LemurOscCmd value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getOSCDynaProperties_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.OSCDynaProperties#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // OSCDynaProperties
