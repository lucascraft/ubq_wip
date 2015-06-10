/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;

import net.sf.smbt.osc.oscDsl.OSCExpr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.MessageIn#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.MessageIn#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getMessageIn()
 * @model
 * @generated
 */
public interface MessageIn extends EObject
{
  /**
   * Returns the value of the '<em><b>Osc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Osc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Osc</em>' reference.
   * @see #setOsc(OSCExpr)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getMessageIn_Osc()
   * @model
   * @generated
   */
  OSCExpr getOsc();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.MessageIn#getOsc <em>Osc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Osc</em>' reference.
   * @see #getOsc()
   * @generated
   */
  void setOsc(OSCExpr value);

  /**
   * Returns the value of the '<em><b>Trigger</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' reference.
   * @see #setTrigger(Trigger)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getMessageIn_Trigger()
   * @model
   * @generated
   */
  Trigger getTrigger();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.MessageIn#getTrigger <em>Trigger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(Trigger value);

} // MessageIn
