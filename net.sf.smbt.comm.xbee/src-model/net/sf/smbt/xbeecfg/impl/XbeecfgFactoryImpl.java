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
import net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration;
import net.sf.smbt.xbeecfg.XbeecfgFactory;
import net.sf.smbt.xbeecfg.XbeecfgPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XbeecfgFactoryImpl extends EFactoryImpl implements XbeecfgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XbeecfgFactory init() {
		try {
			XbeecfgFactory theXbeecfgFactory = (XbeecfgFactory)EPackage.Registry.INSTANCE.getEFactory("http://xbeecfg/1.0"); 
			if (theXbeecfgFactory != null) {
				return theXbeecfgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XbeecfgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecfgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XbeecfgPackage.XBEE_FIRMWARE_CONFIGURATION: return createXBeeFirmwareConfiguration();
			case XbeecfgPackage.XBEE_FIRMWARE_CFG_CATEGORY: return createXBeeFirmwareCfgCategory();
			case XbeecfgPackage.XBEE_FIRMWARE_CONF_AT_FIELD: return createXBEE_FIRMWARE_CONF_AT_FIELD();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XbeecfgPackage.XBEE_FIRMWARE_CONF_CATEGORY:
				return createXBEE_FIRMWARE_CONF_CATEGORYFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XbeecfgPackage.XBEE_FIRMWARE_CONF_CATEGORY:
				return convertXBEE_FIRMWARE_CONF_CATEGORYToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeeFirmwareConfiguration createXBeeFirmwareConfiguration() {
		XBeeFirmwareConfigurationImpl xBeeFirmwareConfiguration = new XBeeFirmwareConfigurationImpl();
		return xBeeFirmwareConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeeFirmwareCfgCategory createXBeeFirmwareCfgCategory() {
		XBeeFirmwareCfgCategoryImpl xBeeFirmwareCfgCategory = new XBeeFirmwareCfgCategoryImpl();
		return xBeeFirmwareCfgCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_FIRMWARE_CONF_AT_FIELD createXBEE_FIRMWARE_CONF_AT_FIELD() {
		XBEE_FIRMWARE_CONF_AT_FIELDImpl xbeE_FIRMWARE_CONF_AT_FIELD = new XBEE_FIRMWARE_CONF_AT_FIELDImpl();
		return xbeE_FIRMWARE_CONF_AT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_FIRMWARE_CONF_CATEGORY createXBEE_FIRMWARE_CONF_CATEGORYFromString(EDataType eDataType, String initialValue) {
		XBEE_FIRMWARE_CONF_CATEGORY result = XBEE_FIRMWARE_CONF_CATEGORY.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXBEE_FIRMWARE_CONF_CATEGORYToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecfgPackage getXbeecfgPackage() {
		return (XbeecfgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XbeecfgPackage getPackage() {
		return XbeecfgPackage.eINSTANCE;
	}

} //XbeecfgFactoryImpl
