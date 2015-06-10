/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice.impl;

import net.sf.smbt.vertilice.comm.ezvertilice.*;

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
public class EzvertiliceFactoryImpl extends EFactoryImpl implements EzvertiliceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzvertiliceFactory init() {
		try {
			EzvertiliceFactory theEzvertiliceFactory = (EzvertiliceFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezvertilice/1.0"); 
			if (theEzvertiliceFactory != null) {
				return theEzvertiliceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzvertiliceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzvertiliceFactoryImpl() {
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
			case EzvertilicePackage.VERTILICE_CMD: return createVertiliceCmd();
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD: return createVertiliceInstantStatusCmd();
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD: return createVertiliceBatteryStatusCmd();
			case EzvertilicePackage.VERTILICE_FRMWARE: return createVertiliceFrmware();
			case EzvertilicePackage.VERTILICE_FAILURE_CMD: return createVertiliceFailureCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertiliceCmd createVertiliceCmd() {
		VertiliceCmdImpl vertiliceCmd = new VertiliceCmdImpl();
		return vertiliceCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertiliceInstantStatusCmd createVertiliceInstantStatusCmd() {
		VertiliceInstantStatusCmdImpl vertiliceInstantStatusCmd = new VertiliceInstantStatusCmdImpl();
		return vertiliceInstantStatusCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertiliceBatteryStatusCmd createVertiliceBatteryStatusCmd() {
		VertiliceBatteryStatusCmdImpl vertiliceBatteryStatusCmd = new VertiliceBatteryStatusCmdImpl();
		return vertiliceBatteryStatusCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertiliceFrmware createVertiliceFrmware() {
		VertiliceFrmwareImpl vertiliceFrmware = new VertiliceFrmwareImpl();
		return vertiliceFrmware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VertiliceFailureCmd createVertiliceFailureCmd() {
		VertiliceFailureCmdImpl vertiliceFailureCmd = new VertiliceFailureCmdImpl();
		return vertiliceFailureCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzvertilicePackage getEzvertilicePackage() {
		return (EzvertilicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzvertilicePackage getPackage() {
		return EzvertilicePackage.eINSTANCE;
	}

} //EzvertiliceFactoryImpl
