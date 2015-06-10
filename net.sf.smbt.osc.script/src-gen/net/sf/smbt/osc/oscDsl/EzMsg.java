/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ez Msg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzMsg#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzMsg()
 * @model
 * @generated
 */
public interface EzMsg extends EObject
{
  /**
   * Returns the value of the '<em><b>Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' containment reference.
   * @see #setMsg(EObject)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzMsg_Msg()
   * @model containment="true"
   * @generated
   */
  EObject getMsg();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzMsg#getMsg <em>Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg</em>' containment reference.
   * @see #getMsg()
   * @generated
   */
  void setMsg(EObject value);

} // EzMsg
