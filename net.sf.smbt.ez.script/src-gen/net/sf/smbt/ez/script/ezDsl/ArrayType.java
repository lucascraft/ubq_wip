/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.ArrayType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends Type
{
  /**
   * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type</em>' containment reference.
   * @see #setBaseType(Type)
   * @see net.sf.smbt.ez.script.ezDsl.EzDslPackage#getArrayType_BaseType()
   * @model containment="true"
   * @generated
   */
  Type getBaseType();

  /**
   * Sets the value of the '{@link net.sf.smbt.ez.script.ezDsl.ArrayType#getBaseType <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type</em>' containment reference.
   * @see #getBaseType()
   * @generated
   */
  void setBaseType(Type value);

} // ArrayType
