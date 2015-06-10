/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ezosckinematics.impl;

import net.sf.smbt.osc.ezosckinematics.*;
import net.sf.smbt.osc.ezosckinematics.EzosckinematicsFactory;
import net.sf.smbt.osc.ezosckinematics.EzosckinematicsPackage;
import net.sf.smbt.osc.ezosckinematics.KinematicsCmd;
import net.sf.smbt.osc.ezosckinematics.KinematicsRcvCmd;
import net.sf.smbt.osc.ezosckinematics.KinematicsSndCmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzosckinematicsFactoryImpl extends EFactoryImpl implements EzosckinematicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzosckinematicsFactory init() {
		try {
			EzosckinematicsFactory theEzosckinematicsFactory = (EzosckinematicsFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezosckinematics/1.0"); 
			if (theEzosckinematicsFactory != null) {
				return theEzosckinematicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzosckinematicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzosckinematicsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzosckinematicsPackage.KINEMATICS_CMD: return createKinematicsCmd();
			case EzosckinematicsPackage.KINEMATICS_SND_CMD: return createKinematicsSndCmd();
			case EzosckinematicsPackage.KINEMATICS_RCV_CMD: return createKinematicsRcvCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicsCmd createKinematicsCmd() {
		KinematicsCmdImpl kinematicsCmd = new KinematicsCmdImpl();
		return kinematicsCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicsSndCmd createKinematicsSndCmd() {
		KinematicsSndCmdImpl kinematicsSndCmd = new KinematicsSndCmdImpl();
		return kinematicsSndCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicsRcvCmd createKinematicsRcvCmd() {
		KinematicsRcvCmdImpl kinematicsRcvCmd = new KinematicsRcvCmdImpl();
		return kinematicsRcvCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzosckinematicsPackage getEzosckinematicsPackage() {
		return (EzosckinematicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzosckinematicsPackage getPackage() {
		return EzosckinematicsPackage.eINSTANCE;
	}

} //EzosckinematicsFactoryImpl
