/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import net.sf.smbt.ezmojo.EZMojoTarget;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emit Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.EmitInfo#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EmitInfo#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEmitInfo()
 * @model
 * @generated
 */
public interface EmitInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' reference list.
	 * The list contents are of type {@link net.sf.xqz.model.cmd.Cmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEmitInfo_Cmd()
	 * @model
	 * @generated
	 */
	EList<Cmd> getCmd();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEmitInfo_Targets()
	 * @model
	 * @generated
	 */
	EList<EZMojoTarget> getTargets();

} // EmitInfo
