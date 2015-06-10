/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.Trigger#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends EObject
{
  /**
   * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Trigger</em>' containment reference.
   * @see #setTrigger(MessageOut)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getTrigger_Trigger()
   * @model containment="true"
   * @generated
   */
  MessageOut getTrigger();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.Trigger#getTrigger <em>Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Trigger</em>' containment reference.
   * @see #getTrigger()
   * @generated
   */
  void setTrigger(MessageOut value);

} // Trigger
