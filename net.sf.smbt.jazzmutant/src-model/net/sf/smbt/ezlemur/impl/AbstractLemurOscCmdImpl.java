/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur.impl;

import net.sf.smbt.ezlemur.AbstractLemurOscCmd;
import net.sf.smbt.ezlemur.EzlemurPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Lemur Osc Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezlemur.impl.AbstractLemurOscCmdImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractLemurOscCmdImpl extends MinimalEObjectImpl.Container implements AbstractLemurOscCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractLemurOscCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzlemurPackage.Literals.ABSTRACT_LEMUR_OSC_CMD;
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
	public EStructuralFeature getTarget() {
		return (EStructuralFeature)eGet(EzlemurPackage.Literals.ABSTRACT_LEMUR_OSC_CMD__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EStructuralFeature newTarget) {
		eSet(EzlemurPackage.Literals.ABSTRACT_LEMUR_OSC_CMD__TARGET, newTarget);
	}

} //AbstractLemurOscCmdImpl
