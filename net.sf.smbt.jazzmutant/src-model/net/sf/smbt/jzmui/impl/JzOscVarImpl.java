/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiPackage;

import net.sf.smbt.jzmui.LEMUR_OSC_TARGET;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jz Osc Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JzOscVarImpl#isCustomAddress <em>Custom Address</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JzOscVarImpl#getCustomMsg <em>Custom Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JzOscVarImpl#getOscTarget <em>Osc Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JzOscVarImpl extends JZVarImpl implements JzOscVar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JzOscVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_OSC_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCustomAddress() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomAddress(boolean newCustomAddress) {
		eSet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_ADDRESS, newCustomAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomMsg() {
		return (String)eGet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomMsg(String newCustomMsg) {
		eSet(JzmuiPackage.Literals.JZ_OSC_VAR__CUSTOM_MSG, newCustomMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEMUR_OSC_TARGET getOscTarget() {
		return (LEMUR_OSC_TARGET)eGet(JzmuiPackage.Literals.JZ_OSC_VAR__OSC_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscTarget(LEMUR_OSC_TARGET newOscTarget) {
		eSet(JzmuiPackage.Literals.JZ_OSC_VAR__OSC_TARGET, newOscTarget);
	}

} //JzOscVarImpl
