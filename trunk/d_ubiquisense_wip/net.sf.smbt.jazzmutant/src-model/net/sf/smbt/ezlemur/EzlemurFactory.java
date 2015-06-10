/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezlemur.EzlemurPackage
 * @generated
 */
public interface EzlemurFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzlemurFactory eINSTANCE = net.sf.smbt.ezlemur.impl.EzlemurFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Lemur Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lemur Osc Cmd</em>'.
	 * @generated
	 */
	LemurOscCmd createLemurOscCmd();

	/**
	 * Returns a new object of class '<em>Lemur Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lemur Midi Cmd</em>'.
	 * @generated
	 */
	LemurMidiCmd createLemurMidiCmd();

	/**
	 * Returns a new object of class '<em>Lemur Dmx Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lemur Dmx Cmd</em>'.
	 * @generated
	 */
	LemurDmxCmd createLemurDmxCmd();

	/**
	 * Returns a new object of class '<em>Abstract Lemur Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Lemur Osc Cmd</em>'.
	 * @generated
	 */
	AbstractLemurOscCmd createAbstractLemurOscCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzlemurPackage getEzlemurPackage();

} //EzlemurFactory
