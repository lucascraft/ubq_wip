/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.Formula#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.Formula#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends Symbol
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getFormula_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.Formula#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getFormula_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.Formula#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // Formula
