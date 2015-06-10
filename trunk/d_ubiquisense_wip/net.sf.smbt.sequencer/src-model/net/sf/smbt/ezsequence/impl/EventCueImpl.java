/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.CUE_TYPE;
import net.sf.smbt.ezsequence.EventCue;
import net.sf.smbt.ezsequence.EzsequencePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Cue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventCueImpl#getJump <em>Jump</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventCueImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventCueImpl extends EventElemImpl implements EventCue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventCueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.EVENT_CUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getJump() {
		return (Long)eGet(EzsequencePackage.Literals.EVENT_CUE__JUMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJump(long newJump) {
		eSet(EzsequencePackage.Literals.EVENT_CUE__JUMP, newJump);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUE_TYPE getKind() {
		return (CUE_TYPE)eGet(EzsequencePackage.Literals.EVENT_CUE__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CUE_TYPE newKind) {
		eSet(EzsequencePackage.Literals.EVENT_CUE__KIND, newKind);
	}

} //EventCueImpl
