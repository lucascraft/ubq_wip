/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSC Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCExpr#getPath <em>Path</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCExpr#getArgs <em>Args</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCExpr#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCExpr()
 * @model
 * @generated
 */
public interface OSCExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCExpr_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.OSCExpr#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' attribute list.
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCExpr_Args()
   * @model unique="false"
   * @generated
   */
  EList<String> getArgs();

  /**
   * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Targets</em>' containment reference list.
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCExpr_Targets()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getTargets();

} // OSCExpr
