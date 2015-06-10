/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecomm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbeecomm.XbeecommPackage
 * @generated
 */
public interface XbeecommFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbeecommFactory eINSTANCE = net.sf.smbt.xbeecomm.impl.XbeecommFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Xbee Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xbee Port</em>'.
	 * @generated
	 */
	XbeePort createXbeePort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XbeecommPackage getXbeecommPackage();

} //XbeecommFactory
