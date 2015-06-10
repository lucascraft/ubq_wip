/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbeecfg.XbeecfgFactory
 * @model kind="package"
 * @generated
 */
public interface XbeecfgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xbeecfg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xbeecfg/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xbeecfg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbeecfgPackage eINSTANCE = net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareConfigurationImpl <em>XBee Firmware Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecfg.impl.XBeeFirmwareConfigurationImpl
	 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBeeFirmwareConfiguration()
	 * @generated
	 */
	int XBEE_FIRMWARE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Series</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CONFIGURATION__SERIES = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CONFIGURATION__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CONFIGURATION__CATEGORIES = 2;

	/**
	 * The number of structural features of the '<em>XBee Firmware Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CONFIGURATION_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl <em>XBee Firmware Cfg Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl
	 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBeeFirmwareCfgCategory()
	 * @generated
	 */
	int XBEE_FIRMWARE_CFG_CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Sub Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CFG_CATEGORY__SUB_CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CFG_CATEGORY__KIND = 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CFG_CATEGORY__FIELDS = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CFG_CATEGORY__LABEL = 3;

	/**
	 * The number of structural features of the '<em>XBee Firmware Cfg Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CFG_CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecfg.impl.XBEE_FIRMWARE_CONF_AT_FIELDImpl <em>XBEE FIRMWARE CONF AT FIELD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecfg.impl.XBEE_FIRMWARE_CONF_AT_FIELDImpl
	 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBEE_FIRMWARE_CONF_AT_FIELD()
	 * @generated
	 */
	int XBEE_FIRMWARE_CONF_AT_FIELD = 2;

	/**
	 * The feature id for the '<em><b>At Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CONF_AT_FIELD__AT_CMD = 0;

	/**
	 * The number of structural features of the '<em>XBEE FIRMWARE CONF AT FIELD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_FIRMWARE_CONF_AT_FIELD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY <em>XBEE FIRMWARE CONF CATEGORY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY
	 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBEE_FIRMWARE_CONF_CATEGORY()
	 * @generated
	 */
	int XBEE_FIRMWARE_CONF_CATEGORY = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration <em>XBee Firmware Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee Firmware Configuration</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration
	 * @generated
	 */
	EClass getXBeeFirmwareConfiguration();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Series</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getSeries()
	 * @see #getXBeeFirmwareConfiguration()
	 * @generated
	 */
	EAttribute getXBeeFirmwareConfiguration_Series();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getLabel()
	 * @see #getXBeeFirmwareConfiguration()
	 * @generated
	 */
	EAttribute getXBeeFirmwareConfiguration_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getCategories()
	 * @see #getXBeeFirmwareConfiguration()
	 * @generated
	 */
	EReference getXBeeFirmwareConfiguration_Categories();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory <em>XBee Firmware Cfg Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee Firmware Cfg Category</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory
	 * @generated
	 */
	EClass getXBeeFirmwareCfgCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Categories</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getSubCategories()
	 * @see #getXBeeFirmwareCfgCategory()
	 * @generated
	 */
	EReference getXBeeFirmwareCfgCategory_SubCategories();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getKind()
	 * @see #getXBeeFirmwareCfgCategory()
	 * @generated
	 */
	EAttribute getXBeeFirmwareCfgCategory_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getFields()
	 * @see #getXBeeFirmwareCfgCategory()
	 * @generated
	 */
	EReference getXBeeFirmwareCfgCategory_Fields();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getLabel()
	 * @see #getXBeeFirmwareCfgCategory()
	 * @generated
	 */
	EAttribute getXBeeFirmwareCfgCategory_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD <em>XBEE FIRMWARE CONF AT FIELD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBEE FIRMWARE CONF AT FIELD</em>'.
	 * @see net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD
	 * @generated
	 */
	EClass getXBEE_FIRMWARE_CONF_AT_FIELD();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD#getAtCmd <em>At Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Cmd</em>'.
	 * @see net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD#getAtCmd()
	 * @see #getXBEE_FIRMWARE_CONF_AT_FIELD()
	 * @generated
	 */
	EAttribute getXBEE_FIRMWARE_CONF_AT_FIELD_AtCmd();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY <em>XBEE FIRMWARE CONF CATEGORY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XBEE FIRMWARE CONF CATEGORY</em>'.
	 * @see net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY
	 * @generated
	 */
	EEnum getXBEE_FIRMWARE_CONF_CATEGORY();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XbeecfgFactory getXbeecfgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareConfigurationImpl <em>XBee Firmware Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecfg.impl.XBeeFirmwareConfigurationImpl
		 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBeeFirmwareConfiguration()
		 * @generated
		 */
		EClass XBEE_FIRMWARE_CONFIGURATION = eINSTANCE.getXBeeFirmwareConfiguration();

		/**
		 * The meta object literal for the '<em><b>Series</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE_FIRMWARE_CONFIGURATION__SERIES = eINSTANCE.getXBeeFirmwareConfiguration_Series();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE_FIRMWARE_CONFIGURATION__LABEL = eINSTANCE.getXBeeFirmwareConfiguration_Label();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBEE_FIRMWARE_CONFIGURATION__CATEGORIES = eINSTANCE.getXBeeFirmwareConfiguration_Categories();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl <em>XBee Firmware Cfg Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecfg.impl.XBeeFirmwareCfgCategoryImpl
		 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBeeFirmwareCfgCategory()
		 * @generated
		 */
		EClass XBEE_FIRMWARE_CFG_CATEGORY = eINSTANCE.getXBeeFirmwareCfgCategory();

		/**
		 * The meta object literal for the '<em><b>Sub Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBEE_FIRMWARE_CFG_CATEGORY__SUB_CATEGORIES = eINSTANCE.getXBeeFirmwareCfgCategory_SubCategories();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE_FIRMWARE_CFG_CATEGORY__KIND = eINSTANCE.getXBeeFirmwareCfgCategory_Kind();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBEE_FIRMWARE_CFG_CATEGORY__FIELDS = eINSTANCE.getXBeeFirmwareCfgCategory_Fields();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE_FIRMWARE_CFG_CATEGORY__LABEL = eINSTANCE.getXBeeFirmwareCfgCategory_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecfg.impl.XBEE_FIRMWARE_CONF_AT_FIELDImpl <em>XBEE FIRMWARE CONF AT FIELD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecfg.impl.XBEE_FIRMWARE_CONF_AT_FIELDImpl
		 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBEE_FIRMWARE_CONF_AT_FIELD()
		 * @generated
		 */
		EClass XBEE_FIRMWARE_CONF_AT_FIELD = eINSTANCE.getXBEE_FIRMWARE_CONF_AT_FIELD();

		/**
		 * The meta object literal for the '<em><b>At Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE_FIRMWARE_CONF_AT_FIELD__AT_CMD = eINSTANCE.getXBEE_FIRMWARE_CONF_AT_FIELD_AtCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY <em>XBEE FIRMWARE CONF CATEGORY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY
		 * @see net.sf.smbt.xbeecfg.impl.XbeecfgPackageImpl#getXBEE_FIRMWARE_CONF_CATEGORY()
		 * @generated
		 */
		EEnum XBEE_FIRMWARE_CONF_CATEGORY = eINSTANCE.getXBEE_FIRMWARE_CONF_CATEGORY();

	}

} //XbeecfgPackage
