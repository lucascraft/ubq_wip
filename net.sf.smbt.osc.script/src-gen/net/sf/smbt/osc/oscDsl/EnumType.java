/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EnumType#getEnumRef <em>Enum Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEnumType()
 * @model
 * @generated
 */
public interface EnumType extends PrimitiveType
{
  /**
   * Returns the value of the '<em><b>Enum Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Ref</em>' reference.
   * @see #setEnumRef(EnumDecl)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEnumType_EnumRef()
   * @model
   * @generated
   */
  EnumDecl getEnumRef();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EnumType#getEnumRef <em>Enum Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Ref</em>' reference.
   * @see #getEnumRef()
   * @generated
   */
  void setEnumRef(EnumDecl value);

} // EnumType
