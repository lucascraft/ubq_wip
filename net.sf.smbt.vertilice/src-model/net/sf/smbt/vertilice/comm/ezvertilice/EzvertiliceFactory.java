/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage
 * @generated
 */
public interface EzvertiliceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzvertiliceFactory eINSTANCE = net.sf.smbt.vertilice.comm.ezvertilice.impl.EzvertiliceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Vertilice Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertilice Cmd</em>'.
	 * @generated
	 */
	VertiliceCmd createVertiliceCmd();

	/**
	 * Returns a new object of class '<em>Vertilice Instant Status Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertilice Instant Status Cmd</em>'.
	 * @generated
	 */
	VertiliceInstantStatusCmd createVertiliceInstantStatusCmd();

	/**
	 * Returns a new object of class '<em>Vertilice Battery Status Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertilice Battery Status Cmd</em>'.
	 * @generated
	 */
	VertiliceBatteryStatusCmd createVertiliceBatteryStatusCmd();

	/**
	 * Returns a new object of class '<em>Vertilice Frmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertilice Frmware</em>'.
	 * @generated
	 */
	VertiliceFrmware createVertiliceFrmware();

	/**
	 * Returns a new object of class '<em>Vertilice Failure Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertilice Failure Cmd</em>'.
	 * @generated
	 */
	VertiliceFailureCmd createVertiliceFailureCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzvertilicePackage getEzvertilicePackage();

} //EzvertiliceFactory
