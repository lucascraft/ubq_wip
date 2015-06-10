/**
 */
package net.sf.smbt.ezmppt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmppt.EzmpptPackage
 * @generated
 */
public interface EzmpptFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmpptFactory eINSTANCE = net.sf.smbt.ezmppt.impl.EzmpptFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ep Solar Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ep Solar Cmd</em>'.
	 * @generated
	 */
	EpSolarCmd createEpSolarCmd();

	/**
	 * Returns a new object of class '<em>Mppt Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mppt Cmd</em>'.
	 * @generated
	 */
	MpptCmd createMpptCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzmpptPackage getEzmpptPackage();

} //EzmpptFactory
