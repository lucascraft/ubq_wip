/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ez Msg Bang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzMsgBang#getCmd <em>Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzMsgBang()
 * @model
 * @generated
 */
public interface EzMsgBang extends EObject
{
  /**
   * Returns the value of the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd</em>' containment reference.
   * @see #setCmd(OSCExpr)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzMsgBang_Cmd()
   * @model containment="true"
   * @generated
   */
  OSCExpr getCmd();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzMsgBang#getCmd <em>Cmd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd</em>' containment reference.
   * @see #getCmd()
   * @generated
   */
  void setCmd(OSCExpr value);

} // EzMsgBang
