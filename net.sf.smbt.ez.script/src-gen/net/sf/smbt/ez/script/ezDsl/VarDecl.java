/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.VarDecl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.VarDecl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.VarDecl#getInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends Symbol
{
  /**
   * Returns the value of the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Readonly</em>' attribute.
   * @see #setReadonly(boolean)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getVarDecl_Readonly()
   * @model
   * @generated
   */
  boolean isReadonly();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.VarDecl#isReadonly <em>Readonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Readonly</em>' attribute.
   * @see #isReadonly()
   * @generated
   */
  void setReadonly(boolean value);

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
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getVarDecl_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.VarDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Expr)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getVarDecl_Init()
   * @model containment="true"
   * @generated
   */
  Expr getInit();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.VarDecl#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Expr value);

} // VarDecl
