/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.ezlemur.LemurOscCmd;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LemurTrigger;
import net.sf.smbt.jzmui.OSCDynaProperties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSC Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl#isCustomOscMsg <em>Custom Osc Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl#getEStructuralFeature <em>EStructural Feature</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl#getOscMsg <em>Osc Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.OSCDynaPropertiesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSCDynaPropertiesImpl extends MinimalEObjectImpl.Container implements OSCDynaProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSCDynaPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.OSC_DYNA_PROPERTIES;
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
	public boolean isCustomOscMsg() {
		return (Boolean)eGet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__CUSTOM_OSC_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomOscMsg(boolean newCustomOscMsg) {
		eSet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__CUSTOM_OSC_MSG, newCustomOscMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurTrigger getLemurTrigger() {
		return (LemurTrigger)eGet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__LEMUR_TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLemurTrigger(LemurTrigger newLemurTrigger) {
		eSet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__LEMUR_TRIGGER, newLemurTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature() {
		return (EStructuralFeature)eGet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		eSet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE, newEStructuralFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurOscCmd getOscMsg() {
		return (LemurOscCmd)eGet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__OSC_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscMsg(LemurOscCmd newOscMsg) {
		eSet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__OSC_MSG, newOscMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return (String)eGet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		eSet(JzmuiPackage.Literals.OSC_DYNA_PROPERTIES__TARGET, newTarget);
	}

} //OSCDynaPropertiesImpl
