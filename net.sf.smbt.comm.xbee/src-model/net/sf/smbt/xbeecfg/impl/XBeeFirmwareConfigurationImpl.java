/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg.impl;

import net.sf.smbt.xbee.XBEE_SERIES;
import net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory;
import net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration;
import net.sf.smbt.xbeecfg.XbeecfgPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XBee Firmware Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareConfigurationImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareConfigurationImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareConfigurationImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XBeeFirmwareConfigurationImpl extends MinimalEObjectImpl.Container implements XBeeFirmwareConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBeeFirmwareConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XbeecfgPackage.Literals.XBEE_FIRMWARE_CONFIGURATION;
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
	public EList<XBEE_SERIES> getSeries() {
		return (EList<XBEE_SERIES>)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CONFIGURATION__SERIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CONFIGURATION__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CONFIGURATION__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<XBeeFirmwareCfgCategory> getCategories() {
		return (EList<XBeeFirmwareCfgCategory>)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CONFIGURATION__CATEGORIES, true);
	}

} //XBeeFirmwareConfigurationImpl
