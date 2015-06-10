/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.wiimotectrl;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.wiimotectrl.WiimotectrlFactory
 * @model kind="package"
 * @generated
 */
public interface WiimotectrlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wiimotectrl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://wiimotectrl/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wiimotectrl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WiimotectrlPackage eINSTANCE = net.sf.smbt.wiimotectrl.impl.WiimotectrlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl <em>Wiimote Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl
	 * @see net.sf.smbt.wiimotectrl.impl.WiimotectrlPackageImpl#getWiimoteController()
	 * @generated
	 */
	int WIIMOTE_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CONTROLLER__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CONTROLLER__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CONTROLLER__WIIID = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CONTROLLER__ADDR = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CONTROLLER__PROPERTIES = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Wiimote Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIIMOTE_CONTROLLER_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.wiimotectrl.WiimoteController <em>Wiimote Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiimote Controller</em>'.
	 * @see net.sf.smbt.wiimotectrl.WiimoteController
	 * @generated
	 */
	EClass getWiimoteController();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.wiimotectrl.WiimoteController#getWiiid <em>Wiiid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiiid</em>'.
	 * @see net.sf.smbt.wiimotectrl.WiimoteController#getWiiid()
	 * @see #getWiimoteController()
	 * @generated
	 */
	EAttribute getWiimoteController_Wiiid();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.wiimotectrl.WiimoteController#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.wiimotectrl.WiimoteController#getAddr()
	 * @see #getWiimoteController()
	 * @generated
	 */
	EAttribute getWiimoteController_Addr();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.wiimotectrl.WiimoteController#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see net.sf.smbt.wiimotectrl.WiimoteController#getProperties()
	 * @see #getWiimoteController()
	 * @generated
	 */
	EReference getWiimoteController_Properties();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WiimotectrlFactory getWiimotectrlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl <em>Wiimote Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl
		 * @see net.sf.smbt.wiimotectrl.impl.WiimotectrlPackageImpl#getWiimoteController()
		 * @generated
		 */
		EClass WIIMOTE_CONTROLLER = eINSTANCE.getWiimoteController();

		/**
		 * The meta object literal for the '<em><b>Wiiid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIIMOTE_CONTROLLER__WIIID = eINSTANCE.getWiimoteController_Wiiid();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIIMOTE_CONTROLLER__ADDR = eINSTANCE.getWiimoteController_Addr();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIIMOTE_CONTROLLER__PROPERTIES = eINSTANCE.getWiimoteController_Properties();

	}

} //WiimotectrlPackage
