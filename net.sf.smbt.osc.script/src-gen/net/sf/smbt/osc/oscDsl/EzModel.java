/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ez Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzModel#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzModel#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzModel()
 * @model
 * @generated
 */
public interface EzModel extends EObject
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
   * @see #setCmd(EzCmd)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzModel_Cmd()
   * @model containment="true"
   * @generated
   */
  EzCmd getCmd();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzModel#getCmd <em>Cmd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd</em>' containment reference.
   * @see #getCmd()
   * @generated
   */
  void setCmd(EzCmd value);

  /**
   * Returns the value of the '<em><b>Msg</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.osc.oscDsl.EzMsg}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' containment reference list.
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzModel_Msg()
   * @model containment="true"
   * @generated
   */
  EList<EzMsg> getMsg();

} // EzModel
