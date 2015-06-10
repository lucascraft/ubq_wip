/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ofx3nity;

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
 * @see net.sf.smbt.osc.ofx3nity.Ofx3nityFactory
 * @model kind="package"
 * @generated
 */
public interface Ofx3nityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ofx3nity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/osc/ofx3nity/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ofx3nity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ofx3nityPackage eINSTANCE = net.sf.smbt.osc.ofx3nity.impl.Ofx3nityPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.ofx3nity.impl.Ofx3RcvCmdImpl <em>Ofx3 Rcv Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3RcvCmdImpl
	 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3nityPackageImpl#getOfx3RcvCmd()
	 * @generated
	 */
	int OFX3_RCV_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFX3_RCV_CMD__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFX3_RCV_CMD__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Ofx3 Rcv Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFX3_RCV_CMD_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.ofx3nity.impl.Ofx3SndCmdImpl <em>Ofx3 Snd Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3SndCmdImpl
	 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3nityPackageImpl#getOfx3SndCmd()
	 * @generated
	 */
	int OFX3_SND_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFX3_SND_CMD__PRIORITY = OsccmdPackage.OSC_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFX3_SND_CMD__MSG = OsccmdPackage.OSC_SND_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Ofx3 Snd Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFX3_SND_CMD_FEATURE_COUNT = OsccmdPackage.OSC_SND_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.ofx3nity.Ofx3RcvCmd <em>Ofx3 Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ofx3 Rcv Cmd</em>'.
	 * @see net.sf.smbt.osc.ofx3nity.Ofx3RcvCmd
	 * @generated
	 */
	EClass getOfx3RcvCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.ofx3nity.Ofx3SndCmd <em>Ofx3 Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ofx3 Snd Cmd</em>'.
	 * @see net.sf.smbt.osc.ofx3nity.Ofx3SndCmd
	 * @generated
	 */
	EClass getOfx3SndCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Ofx3nityFactory getOfx3nityFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.osc.ofx3nity.impl.Ofx3RcvCmdImpl <em>Ofx3 Rcv Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3RcvCmdImpl
		 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3nityPackageImpl#getOfx3RcvCmd()
		 * @generated
		 */
		EClass OFX3_RCV_CMD = eINSTANCE.getOfx3RcvCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.ofx3nity.impl.Ofx3SndCmdImpl <em>Ofx3 Snd Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3SndCmdImpl
		 * @see net.sf.smbt.osc.ofx3nity.impl.Ofx3nityPackageImpl#getOfx3SndCmd()
		 * @generated
		 */
		EClass OFX3_SND_CMD = eINSTANCE.getOfx3SndCmd();

	}

} //Ofx3nityPackage
