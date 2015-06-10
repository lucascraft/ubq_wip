/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezmojo.EZMojoTarget;

import net.sf.smbt.ezsequence.EmitInfo;
import net.sf.smbt.ezsequence.EzsequencePackage;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emit Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EmitInfoImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EmitInfoImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmitInfoImpl extends MinimalEObjectImpl.Container implements EmitInfo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmitInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.EMIT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Cmd> getCmd() {
		return (EList<Cmd>)eGet(EzsequencePackage.Literals.EMIT_INFO__CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoTarget> getTargets() {
		return (EList<EZMojoTarget>)eGet(EzsequencePackage.Literals.EMIT_INFO__TARGETS, true);
	}

} //EmitInfoImpl
