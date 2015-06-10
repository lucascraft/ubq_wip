/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveParam;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl#getMin <em>Min</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl#getMax <em>Max</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveParamImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveParamImpl extends MinimalEObjectImpl.Container implements LiveParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.LIVE_PARAM;
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
	public String getKey() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_PARAM__KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		eSet(EzabletonctrlPackage.Literals.LIVE_PARAM__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_PARAM__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(EzabletonctrlPackage.Literals.LIVE_PARAM__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_PARAM__MIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(String newMin) {
		eSet(EzabletonctrlPackage.Literals.LIVE_PARAM__MIN, newMin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_PARAM__MAX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(String newMax) {
		eSet(EzabletonctrlPackage.Literals.LIVE_PARAM__MAX, newMax);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_PARAM__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(EzabletonctrlPackage.Literals.LIVE_PARAM__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_PARAM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EzabletonctrlPackage.Literals.LIVE_PARAM__NAME, newName);
	}

} //LiveParamImpl
