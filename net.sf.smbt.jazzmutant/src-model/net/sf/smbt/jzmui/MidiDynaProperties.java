/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import net.sf.smbt.ezlemur.LemurMidiCmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Midi Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.MidiDynaProperties#isCustomMidiMsg <em>Custom Midi Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.MidiDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.MidiDynaProperties#getMidiMsg <em>Midi Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.MidiDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.MidiDynaProperties#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiDynaProperties()
 * @model
 * @generated
 */
public interface MidiDynaProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Midi Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Midi Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Midi Msg</em>' attribute.
	 * @see #setCustomMidiMsg(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiDynaProperties_CustomMidiMsg()
	 * @model
	 * @generated
	 */
	boolean isCustomMidiMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiDynaProperties#isCustomMidiMsg <em>Custom Midi Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Midi Msg</em>' attribute.
	 * @see #isCustomMidiMsg()
	 * @generated
	 */
	void setCustomMidiMsg(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiDynaProperties_LemurTrigger()
	 * @model
	 * @generated
	 */
	LemurTrigger getLemurTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiDynaProperties#getLemurTrigger <em>Lemur Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lemur Trigger</em>' attribute.
	 * @see net.sf.smbt.jzmui.LemurTrigger
	 * @see #getLemurTrigger()
	 * @generated
	 */
	void setLemurTrigger(LemurTrigger value);

	/**
	 * Returns the value of the '<em><b>Midi Msg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Msg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Msg</em>' reference.
	 * @see #setMidiMsg(LemurMidiCmd)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiDynaProperties_MidiMsg()
	 * @model
	 * @generated
	 */
	LemurMidiCmd getMidiMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiDynaProperties#getMidiMsg <em>Midi Msg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Msg</em>' reference.
	 * @see #getMidiMsg()
	 * @generated
	 */
	void setMidiMsg(LemurMidiCmd value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiDynaProperties_EStructuralFeature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getEStructuralFeature();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiDynaProperties#getEStructuralFeature <em>EStructural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EStructural Feature</em>' reference.
	 * @see #getEStructuralFeature()
	 * @generated
	 */
	void setEStructuralFeature(EStructuralFeature value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiDynaProperties_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiDynaProperties#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

} // MidiDynaProperties
