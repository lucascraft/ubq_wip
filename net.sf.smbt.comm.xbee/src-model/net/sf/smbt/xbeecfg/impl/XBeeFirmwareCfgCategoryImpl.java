/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg.impl;

import net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD;
import net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY;
import net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory;
import net.sf.smbt.xbeecfg.XbeecfgPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XBee Firmware Cfg Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XBeeFirmwareCfgCategoryImpl extends MinimalEObjectImpl.Container implements XBeeFirmwareCfgCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBeeFirmwareCfgCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XbeecfgPackage.Literals.XBEE_FIRMWARE_CFG_CATEGORY;
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
	@SuppressWarnings("unchecked")
	public EList<XBeeFirmwareCfgCategory> getSubCategories() {
		return (EList<XBeeFirmwareCfgCategory>)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CFG_CATEGORY__SUB_CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_FIRMWARE_CONF_CATEGORY getKind() {
		return (XBEE_FIRMWARE_CONF_CATEGORY)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CFG_CATEGORY__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(XBEE_FIRMWARE_CONF_CATEGORY newKind) {
		eSet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CFG_CATEGORY__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<XBEE_FIRMWARE_CONF_AT_FIELD> getFields() {
		return (EList<XBEE_FIRMWARE_CONF_AT_FIELD>)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CFG_CATEGORY__FIELDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CFG_CATEGORY__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CFG_CATEGORY__LABEL, newLabel);
	}

} //XBeeFirmwareCfgCategoryImpl
