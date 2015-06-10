/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ez Protocol Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd#getVerbose <em>Verbose</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzProtocolCmd()
 * @model
 * @generated
 */
public interface EzProtocolCmd extends EObject
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
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzProtocolCmd_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd#getId <em>Id</em>}' attribute.
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
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzProtocolCmd_Verbose()
   * @model
   * @generated
   */
  String getVerbose();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd#getVerbose <em>Verbose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verbose</em>' attribute.
   * @see #getVerbose()
   * @generated
   */
  void setVerbose(String value);

} // EzProtocolCmd
