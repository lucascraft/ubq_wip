/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.ezlemur.LemurDmxCmd;
import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LemurTrigger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMX Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl#getDmxMsg <em>Dmx Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl#getEStructuralFeature <em>EStructural Feature</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl#isCustomDmxMsg <em>Custom Dmx Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.DMXDynaPropertiesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMXDynaPropertiesImpl extends MinimalEObjectImpl.Container implements DMXDynaProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMXDynaPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.DMX_DYNA_PROPERTIES;
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
	public LemurDmxCmd getDmxMsg() {
		return (LemurDmxCmd)eGet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__DMX_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmxMsg(LemurDmxCmd newDmxMsg) {
		eSet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__DMX_MSG, newDmxMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature() {
		return (EStructuralFeature)eGet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		eSet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE, newEStructuralFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomDmxMsg() {
		return (Boolean)eGet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__CUSTOM_DMX_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomDmxMsg(boolean newCustomDmxMsg) {
		eSet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__CUSTOM_DMX_MSG, newCustomDmxMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurTrigger getLemurTrigger() {
		return (LemurTrigger)eGet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__LEMUR_TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLemurTrigger(LemurTrigger newLemurTrigger) {
		eSet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__LEMUR_TRIGGER, newLemurTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return (String)eGet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		eSet(JzmuiPackage.Literals.DMX_DYNA_PROPERTIES__TARGET, newTarget);
	}

} //DMXDynaPropertiesImpl
