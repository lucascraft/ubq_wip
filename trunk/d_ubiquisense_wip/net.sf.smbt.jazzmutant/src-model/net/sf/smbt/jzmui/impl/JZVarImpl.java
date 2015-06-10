/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.JZVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LemurPreferences;
import net.sf.smbt.jzmui.LemurTrigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZVarImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZVarImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZVarImpl extends MinimalEObjectImpl.Container implements JZVar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_VAR;
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
	public EStructuralFeature getAttribute() {
		return (EStructuralFeature)eGet(JzmuiPackage.Literals.JZ_VAR__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(EStructuralFeature newAttribute) {
		eSet(JzmuiPackage.Literals.JZ_VAR__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurTrigger getTrigger() {
		return (LemurTrigger)eGet(JzmuiPackage.Literals.JZ_VAR__TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(LemurTrigger newTrigger) {
		eSet(JzmuiPackage.Literals.JZ_VAR__TRIGGER, newTrigger);
	}

} //JZVarImpl
