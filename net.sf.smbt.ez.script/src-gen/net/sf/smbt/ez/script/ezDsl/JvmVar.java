/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jvm Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.JvmVar#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.JvmVar#getJavaTypes <em>Java Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getJvmVar()
 * @model
 * @generated
 */
public interface JvmVar extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getJvmVar_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.JvmVar#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Java Types</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.xtext.common.types.JvmType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Types</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Types</em>' reference list.
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getJvmVar_JavaTypes()
   * @model
   * @generated
   */
  EList<JvmType> getJavaTypes();

} // JvmVar
