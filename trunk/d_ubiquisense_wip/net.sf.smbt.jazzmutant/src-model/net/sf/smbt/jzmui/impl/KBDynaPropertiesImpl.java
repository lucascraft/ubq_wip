/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KBDynaProperties;
import net.sf.smbt.jzmui.LemurTrigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KB Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.KBDynaPropertiesImpl#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.KBDynaPropertiesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KBDynaPropertiesImpl extends MinimalEObjectImpl.Container implements KBDynaProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KBDynaPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.KB_DYNA_PROPERTIES;
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
	public LemurTrigger getLemurTrigger() {
		return (LemurTrigger)eGet(JzmuiPackage.Literals.KB_DYNA_PROPERTIES__LEMUR_TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLemurTrigger(LemurTrigger newLemurTrigger) {
		eSet(JzmuiPackage.Literals.KB_DYNA_PROPERTIES__LEMUR_TRIGGER, newLemurTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return (String)eGet(JzmuiPackage.Literals.KB_DYNA_PROPERTIES__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		eSet(JzmuiPackage.Literals.KB_DYNA_PROPERTIES__TARGET, newTarget);
	}

} //KBDynaPropertiesImpl
