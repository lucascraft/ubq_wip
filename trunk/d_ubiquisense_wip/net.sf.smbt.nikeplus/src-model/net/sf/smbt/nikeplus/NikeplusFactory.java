/**
 */
package net.sf.smbt.nikeplus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.nikeplus.NikeplusPackage
 * @generated
 */
public interface NikeplusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NikeplusFactory eINSTANCE = net.sf.smbt.nikeplus.impl.NikeplusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cmd</em>'.
	 * @generated
	 */
	NikeplusCmd createNikeplusCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NikeplusPackage getNikeplusPackage();

} //NikeplusFactory
