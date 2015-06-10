/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ofx3nity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.ofx3nity.Ofx3nityPackage
 * @generated
 */
public interface Ofx3nityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ofx3nityFactory eINSTANCE = net.sf.smbt.osc.ofx3nity.impl.Ofx3nityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ofx3 Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ofx3 Rcv Cmd</em>'.
	 * @generated
	 */
	Ofx3RcvCmd createOfx3RcvCmd();

	/**
	 * Returns a new object of class '<em>Ofx3 Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ofx3 Snd Cmd</em>'.
	 * @generated
	 */
	Ofx3SndCmd createOfx3SndCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ofx3nityPackage getOfx3nityPackage();

} //Ofx3nityFactory
