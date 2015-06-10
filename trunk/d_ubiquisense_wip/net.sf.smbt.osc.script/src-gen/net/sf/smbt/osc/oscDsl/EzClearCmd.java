/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ez Clear Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzClearCmd#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzClearCmd#getVerbose <em>Verbose</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzClearCmd()
 * @model
 * @generated
 */
public interface EzClearCmd extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzClearCmd_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzClearCmd#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Verbose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verbose</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verbose</em>' attribute.
   * @see #setVerbose(String)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzClearCmd_Verbose()
   * @model
   * @generated
   */
  String getVerbose();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzClearCmd#getVerbose <em>Verbose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verbose</em>' attribute.
   * @see #getVerbose()
   * @generated
   */
  void setVerbose(String value);

} // EzClearCmd
