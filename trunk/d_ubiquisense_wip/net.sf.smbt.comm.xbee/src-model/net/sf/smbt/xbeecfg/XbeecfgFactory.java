/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbeecfg.XbeecfgPackage
 * @generated
 */
public interface XbeecfgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbeecfgFactory eINSTANCE = net.sf.smbt.xbeecfg.impl.XbeecfgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XBee Firmware Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee Firmware Configuration</em>'.
	 * @generated
	 */
	XBeeFirmwareConfiguration createXBeeFirmwareConfiguration();

	/**
	 * Returns a new object of class '<em>XBee Firmware Cfg Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee Firmware Cfg Category</em>'.
	 * @generated
	 */
	XBeeFirmwareCfgCategory createXBeeFirmwareCfgCategory();

	/**
	 * Returns a new object of class '<em>XBEE FIRMWARE CONF AT FIELD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBEE FIRMWARE CONF AT FIELD</em>'.
	 * @generated
	 */
	XBEE_FIRMWARE_CONF_AT_FIELD createXBEE_FIRMWARE_CONF_AT_FIELD();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XbeecfgPackage getXbeecfgPackage();

} //XbeecfgFactory
