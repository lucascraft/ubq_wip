/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosccmd;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see net.sf.smbt.touchosc.touchosccmd.TouchosccmdFactory
 * @model kind="package"
 * @generated
 */
public interface TouchosccmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "touchosccmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://touchosccmd/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "touchosccmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouchosccmdPackage eINSTANCE = net.sf.smbt.touchosc.touchosccmd.impl.TouchosccmdPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchosccmd.impl.TouchOscCmdImpl <em>Touch Osc Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchosccmd.impl.TouchOscCmdImpl
	 * @see net.sf.smbt.touchosc.touchosccmd.impl.TouchosccmdPackageImpl#getTouchOscCmd()
	 * @generated
	 */
	int TOUCH_OSC_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Touch Osc Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_OSC_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchosccmd.TouchOscCmd <em>Touch Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch Osc Cmd</em>'.
	 * @see net.sf.smbt.touchosc.touchosccmd.TouchOscCmd
	 * @generated
	 */
	EClass getTouchOscCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TouchosccmdFactory getTouchosccmdFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchosccmd.impl.TouchOscCmdImpl <em>Touch Osc Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchosccmd.impl.TouchOscCmdImpl
		 * @see net.sf.smbt.touchosc.touchosccmd.impl.TouchosccmdPackageImpl#getTouchOscCmd()
		 * @generated
		 */
		EClass TOUCH_OSC_CMD = eINSTANCE.getTouchOscCmd();

	}

} //TouchosccmdPackage
