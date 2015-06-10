/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ezosckinematics;

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
 * @see net.sf.smbt.osc.ezosckinematics.EzosckinematicsFactory
 * @model kind="package"
 * @generated
 */
public interface EzosckinematicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezosckinematics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezosckinematics/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezosckinematics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzosckinematicsPackage eINSTANCE = net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.ezosckinematics.impl.KinematicsCmdImpl <em>Kinematics Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.ezosckinematics.impl.KinematicsCmdImpl
	 * @see net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsPackageImpl#getKinematicsCmd()
	 * @generated
	 */
	int KINEMATICS_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Kinematics Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.ezosckinematics.impl.KinematicsSndCmdImpl <em>Kinematics Snd Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.ezosckinematics.impl.KinematicsSndCmdImpl
	 * @see net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsPackageImpl#getKinematicsSndCmd()
	 * @generated
	 */
	int KINEMATICS_SND_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_SND_CMD__PRIORITY = KINEMATICS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_SND_CMD__MSG = KINEMATICS_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Kinematics Snd Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_SND_CMD_FEATURE_COUNT = KINEMATICS_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.ezosckinematics.impl.KinematicsRcvCmdImpl <em>Kinematics Rcv Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.ezosckinematics.impl.KinematicsRcvCmdImpl
	 * @see net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsPackageImpl#getKinematicsRcvCmd()
	 * @generated
	 */
	int KINEMATICS_RCV_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_RCV_CMD__PRIORITY = KINEMATICS_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_RCV_CMD__MSG = KINEMATICS_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Kinematics Rcv Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINEMATICS_RCV_CMD_FEATURE_COUNT = KINEMATICS_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.ezosckinematics.KinematicsCmd <em>Kinematics Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinematics Cmd</em>'.
	 * @see net.sf.smbt.osc.ezosckinematics.KinematicsCmd
	 * @generated
	 */
	EClass getKinematicsCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.ezosckinematics.KinematicsSndCmd <em>Kinematics Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinematics Snd Cmd</em>'.
	 * @see net.sf.smbt.osc.ezosckinematics.KinematicsSndCmd
	 * @generated
	 */
	EClass getKinematicsSndCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.ezosckinematics.KinematicsRcvCmd <em>Kinematics Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kinematics Rcv Cmd</em>'.
	 * @see net.sf.smbt.osc.ezosckinematics.KinematicsRcvCmd
	 * @generated
	 */
	EClass getKinematicsRcvCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzosckinematicsFactory getEzosckinematicsFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.osc.ezosckinematics.impl.KinematicsCmdImpl <em>Kinematics Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.ezosckinematics.impl.KinematicsCmdImpl
		 * @see net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsPackageImpl#getKinematicsCmd()
		 * @generated
		 */
		EClass KINEMATICS_CMD = eINSTANCE.getKinematicsCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.ezosckinematics.impl.KinematicsSndCmdImpl <em>Kinematics Snd Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.ezosckinematics.impl.KinematicsSndCmdImpl
		 * @see net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsPackageImpl#getKinematicsSndCmd()
		 * @generated
		 */
		EClass KINEMATICS_SND_CMD = eINSTANCE.getKinematicsSndCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.ezosckinematics.impl.KinematicsRcvCmdImpl <em>Kinematics Rcv Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.ezosckinematics.impl.KinematicsRcvCmdImpl
		 * @see net.sf.smbt.osc.ezosckinematics.impl.EzosckinematicsPackageImpl#getKinematicsRcvCmd()
		 * @generated
		 */
		EClass KINEMATICS_RCV_CMD = eINSTANCE.getKinematicsRcvCmd();

	}

} //EzosckinematicsPackage
