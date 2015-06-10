/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ezosckinematics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.ezosckinematics.EzosckinematicsPackage
 * @generated
 */
public interface EzosckinematicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzosckinematicsFactory eINSTANCE = net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kinematics Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinematics Cmd</em>'.
	 * @generated
	 */
	KinematicsCmd createKinematicsCmd();

	/**
	 * Returns a new object of class '<em>Kinematics Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinematics Snd Cmd</em>'.
	 * @generated
	 */
	KinematicsSndCmd createKinematicsSndCmd();

	/**
	 * Returns a new object of class '<em>Kinematics Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinematics Rcv Cmd</em>'.
	 * @generated
	 */
	KinematicsRcvCmd createKinematicsRcvCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzosckinematicsPackage getEzosckinematicsPackage();

} //EzosckinematicsFactory
