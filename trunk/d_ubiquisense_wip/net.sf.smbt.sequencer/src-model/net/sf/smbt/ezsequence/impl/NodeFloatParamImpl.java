/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.NodeFloatParam;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Float Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.NodeFloatParamImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.NodeFloatParamImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.NodeFloatParamImpl#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeFloatParamImpl extends MinimalEObjectImpl.Container implements NodeFloatParam {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeFloatParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.NODE_FLOAT_PARAM;
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
	public String getId() {
		return (String)eGet(EzsequencePackage.Literals.NODE_PARAM__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzsequencePackage.Literals.NODE_PARAM__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return (String)eGet(EzsequencePackage.Literals.NODE_PARAM__DESC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		eSet(EzsequencePackage.Literals.NODE_PARAM__DESC, newDesc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVal() {
		return (Float)eGet(EzsequencePackage.Literals.NODE_FLOAT_PARAM__VAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVal(float newVal) {
		eSet(EzsequencePackage.Literals.NODE_FLOAT_PARAM__VAL, newVal);
	}

} //NodeFloatParamImpl
