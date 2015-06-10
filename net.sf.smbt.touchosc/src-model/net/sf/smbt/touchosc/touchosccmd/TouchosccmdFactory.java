/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosccmd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.touchosc.touchosccmd.TouchosccmdPackage
 * @generated
 */
public interface TouchosccmdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouchosccmdFactory eINSTANCE = net.sf.smbt.touchosc.touchosccmd.impl.TouchosccmdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Touch Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touch Osc Cmd</em>'.
	 * @generated
	 */
	TouchOscCmd createTouchOscCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TouchosccmdPackage getTouchosccmdPackage();

} //TouchosccmdFactory
