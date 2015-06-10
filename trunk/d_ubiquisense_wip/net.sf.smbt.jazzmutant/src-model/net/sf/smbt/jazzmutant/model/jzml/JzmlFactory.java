/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage
 * @generated
 */
public interface JzmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JzmlFactory eINSTANCE = net.sf.smbt.jazzmutant.model.jzml.impl.JzmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>JZML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JZML</em>'.
	 * @generated
	 */
	JZML createJZML();

	/**
	 * Returns a new object of class '<em>PARAM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PARAM</em>'.
	 * @generated
	 */
	PARAM createPARAM();

	/**
	 * Returns a new object of class '<em>PROJECT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PROJECT</em>'.
	 * @generated
	 */
	PROJECT createPROJECT();

	/**
	 * Returns a new object of class '<em>TOP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOP</em>'.
	 * @generated
	 */
	TOP createTOP();

	/**
	 * Returns a new object of class '<em>VARIABLE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VARIABLE</em>'.
	 * @generated
	 */
	VARIABLE createVARIABLE();

	/**
	 * Returns a new object of class '<em>WINDOW</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WINDOW</em>'.
	 * @generated
	 */
	WINDOW createWINDOW();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JzmlPackage getJzmlPackage();

} //JzmlFactory
