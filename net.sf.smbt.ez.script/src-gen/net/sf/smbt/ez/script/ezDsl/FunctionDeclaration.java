/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getParams <em>Params</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends Symbol
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
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getFunctionDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.ez.script.ezDsl.Symbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getFunctionDeclaration_Params()
   * @model containment="true"
   * @generated
   */
  EList<Symbol> getParams();

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.ez.script.ezDsl.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getFunctionDeclaration_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElements();

} // FunctionDeclaration
