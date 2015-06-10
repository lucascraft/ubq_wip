/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ez List Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzListCmd#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzListCmd()
 * @model
 * @generated
 */
public interface EzListCmd extends EObject
{
  /**
   * Returns the value of the '<em><b>Addr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr</em>' reference.
   * @see #setAddr(EzAliasCmd)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzListCmd_Addr()
   * @model
   * @generated
   */
  EzAliasCmd getAddr();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzListCmd#getAddr <em>Addr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr</em>' reference.
   * @see #getAddr()
   * @generated
   */
  void setAddr(EzAliasCmd value);

} // EzListCmd
