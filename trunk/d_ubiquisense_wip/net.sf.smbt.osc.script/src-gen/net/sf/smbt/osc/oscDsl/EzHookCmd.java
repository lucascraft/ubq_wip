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
 * A representation of the model object '<em><b>Ez Hook Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.EzHookCmd#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzHookCmd()
 * @model
 * @generated
 */
public interface EzHookCmd extends EObject
{
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
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getEzHookCmd_Targets()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getTargets();

} // EzHookCmd
