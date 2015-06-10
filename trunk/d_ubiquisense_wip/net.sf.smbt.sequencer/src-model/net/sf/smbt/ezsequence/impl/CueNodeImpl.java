/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.CUE_TYPE;
import net.sf.smbt.ezsequence.CueNode;
import net.sf.smbt.ezsequence.EzsequencePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cue Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.CueNodeImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CueNodeImpl extends TimeNodeImpl implements CueNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CueNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.CUE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUE_TYPE getKind() {
		return (CUE_TYPE)eGet(EzsequencePackage.Literals.CUE_NODE__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CUE_TYPE newKind) {
		eSet(EzsequencePackage.Literals.CUE_NODE__KIND, newKind);
	}

} //CueNodeImpl
