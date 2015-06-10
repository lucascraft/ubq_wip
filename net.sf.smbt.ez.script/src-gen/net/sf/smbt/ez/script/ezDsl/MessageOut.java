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
 * A representation of the model object '<em><b>Message Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.MessageOut#getOsc <em>Osc</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getMessageOut()
 * @model
 * @generated
 */
public interface MessageOut extends EObject
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
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getMessageOut_Osc()
   * @model
   * @generated
   */
  OSCExpr getOsc();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.MessageOut#getOsc <em>Osc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Osc</em>' reference.
   * @see #getOsc()
   * @generated
   */
  void setOsc(OSCExpr value);

} // MessageOut
