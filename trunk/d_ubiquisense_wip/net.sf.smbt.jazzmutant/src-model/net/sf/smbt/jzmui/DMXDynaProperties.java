/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import net.sf.smbt.ezlemur.LemurDmxCmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMX Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.DMXDynaProperties#getDmxMsg <em>Dmx Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.DMXDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.DMXDynaProperties#isCustomDmxMsg <em>Custom Dmx Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.DMXDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.DMXDynaProperties#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getDMXDynaProperties()
 * @model
 * @generated
 */
public interface DMXDynaProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Dmx Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmx Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmx Msg</em>' reference.
	 * @see #setDmxMsg(LemurDmxCmd)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getDMXDynaProperties_DmxMsg()
	 * @model
	 * @generated
	 */
	LemurDmxCmd getDmxMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.DMXDynaProperties#getDmxMsg <em>Dmx Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmx Msg</em>' reference.
	 * @see #getDmxMsg()
	 * @generated
	 */
	void setDmxMsg(LemurDmxCmd value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getDMXDynaProperties_EStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.DMXDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EStructural Feature</em>' reference.
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	void setEStructuralFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Custom Dmx Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Dmx Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Dmx Msg</em>' attribute.
	 * @see #setCustomDmxMsg(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getDMXDynaProperties_CustomDmxMsg()
	 * @model
	 * @generated
	 */
	boolean isCustomDmxMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.DMXDynaProperties#isCustomDmxMsg <em>Custom Dmx Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Dmx Msg</em>' attribute.
	 * @see #isCustomDmxMsg()
	 * @generated
	 */
	void setCustomDmxMsg(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getDMXDynaProperties_LemurTrigger()
	 * @model
	 * @generated
	 */
	LemurTrigger getLemurTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.DMXDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getDMXDynaProperties_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.DMXDynaProperties#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // DMXDynaProperties
