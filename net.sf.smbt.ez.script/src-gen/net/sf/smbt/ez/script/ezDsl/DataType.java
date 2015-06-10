/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.DataType#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.DataType#getJavaType <em>Java Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject
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
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getDataType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.DataType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Java Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Type</em>' reference.
   * @see #setJavaType(JvmType)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getDataType_JavaType()
   * @model
   * @generated
   */
  JvmType getJavaType();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.DataType#getJavaType <em>Java Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Type</em>' reference.
   * @see #getJavaType()
   * @generated
   */
  void setJavaType(JvmType value);

} // DataType
