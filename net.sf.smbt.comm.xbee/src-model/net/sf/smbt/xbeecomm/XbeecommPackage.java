/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecomm;

import net.sf.xqz.model.engine.EnginePackage;

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
 * @see net.sf.smbt.xbeecomm.XbeecommFactory
 * @model kind="package"
 * @generated
 */
public interface XbeecommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xbeecomm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xbeecomm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xbeecomm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbeecommPackage eINSTANCE = net.sf.smbt.xbeecomm.impl.XbeecommPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecomm.impl.XbeePortImpl <em>Xbee Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecomm.impl.XbeePortImpl
	 * @see net.sf.smbt.xbeecomm.impl.XbeecommPackageImpl#getXbeePort()
	 * @generated
	 */
	int XBEE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Xbee Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecomm.XbeePort <em>Xbee Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xbee Port</em>'.
	 * @see net.sf.smbt.xbeecomm.XbeePort
	 * @generated
	 */
	EClass getXbeePort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XbeecommFactory getXbeecommFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.xbeecomm.impl.XbeePortImpl <em>Xbee Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecomm.impl.XbeePortImpl
		 * @see net.sf.smbt.xbeecomm.impl.XbeecommPackageImpl#getXbeePort()
		 * @generated
		 */
		EClass XBEE_PORT = eINSTANCE.getXbeePort();

	}

} //XbeecommPackage
