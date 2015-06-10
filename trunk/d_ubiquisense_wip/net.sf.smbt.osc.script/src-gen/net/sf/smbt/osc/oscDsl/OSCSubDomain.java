/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSC Sub Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCSubDomain#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCSubDomain()
 * @model
 * @generated
 */
public interface OSCSubDomain extends EzMsg
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(EzMsg)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCSubDomain_Expr()
   * @model containment="true"
   * @generated
   */
  EzMsg getExpr();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.OSCSubDomain#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(EzMsg value);

} // OSCSubDomain
