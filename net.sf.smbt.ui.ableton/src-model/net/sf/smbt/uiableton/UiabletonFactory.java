/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.uiableton.UiabletonPackage
 * @generated
 */
public interface UiabletonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiabletonFactory eINSTANCE = net.sf.smbt.uiableton.impl.UiabletonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UI Ableton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Ableton</em>'.
	 * @generated
	 */
	UIAbleton createUIAbleton();

	/**
	 * Returns a new object of class '<em>UI Ableton Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Ableton Track</em>'.
	 * @generated
	 */
	UIAbletonTrack createUIAbletonTrack();

	/**
	 * Returns a new object of class '<em>UI Ableton Master Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Ableton Master Track</em>'.
	 * @generated
	 */
	UIAbletonMasterTrack createUIAbletonMasterTrack();

	/**
	 * Returns a new object of class '<em>UI Ableton Clip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Ableton Clip</em>'.
	 * @generated
	 */
	UIAbletonClip createUIAbletonClip();

	/**
	 * Returns a new object of class '<em>UI Ableton Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Ableton Scene</em>'.
	 * @generated
	 */
	UIAbletonScene createUIAbletonScene();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiabletonPackage getUiabletonPackage();

} //UiabletonFactory
