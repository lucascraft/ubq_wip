/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice.util;

import net.sf.smbt.vertilice.comm.ezvertilice.*;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage
 * @generated
 */
public class EzvertiliceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzvertilicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzvertiliceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzvertilicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzvertiliceSwitch<Adapter> modelSwitch =
		new EzvertiliceSwitch<Adapter>() {
			@Override
			public Adapter caseVertiliceCmd(VertiliceCmd object) {
				return createVertiliceCmdAdapter();
			}
			@Override
			public Adapter caseVertiliceInstantStatusCmd(VertiliceInstantStatusCmd object) {
				return createVertiliceInstantStatusCmdAdapter();
			}
			@Override
			public Adapter caseVertiliceBatteryStatusCmd(VertiliceBatteryStatusCmd object) {
				return createVertiliceBatteryStatusCmdAdapter();
			}
			@Override
			public Adapter caseVertiliceFrmware(VertiliceFrmware object) {
				return createVertiliceFrmwareAdapter();
			}
			@Override
			public Adapter caseVertiliceFailureCmd(VertiliceFailureCmd object) {
				return createVertiliceFailureCmdAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd <em>Vertilice Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceCmd
	 * @generated
	 */
	public Adapter createVertiliceCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd <em>Vertilice Instant Status Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceInstantStatusCmd
	 * @generated
	 */
	public Adapter createVertiliceInstantStatusCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd <em>Vertilice Battery Status Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceBatteryStatusCmd
	 * @generated
	 */
	public Adapter createVertiliceBatteryStatusCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFrmware <em>Vertilice Frmware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFrmware
	 * @generated
	 */
	public Adapter createVertiliceFrmwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd <em>Vertilice Failure Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.vertilice.comm.ezvertilice.VertiliceFailureCmd
	 * @generated
	 */
	public Adapter createVertiliceFailureCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzvertiliceAdapterFactory
