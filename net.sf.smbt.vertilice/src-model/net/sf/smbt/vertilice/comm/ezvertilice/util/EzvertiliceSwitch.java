/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.vertilice.comm.ezvertilice.util;

import net.sf.smbt.vertilice.comm.ezvertilice.*;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.vertilice.comm.ezvertilice.EzvertilicePackage
 * @generated
 */
public class EzvertiliceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzvertilicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzvertiliceSwitch() {
		if (modelPackage == null) {
			modelPackage = EzvertilicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzvertilicePackage.VERTILICE_CMD: {
				VertiliceCmd vertiliceCmd = (VertiliceCmd)theEObject;
				T result = caseVertiliceCmd(vertiliceCmd);
				if (result == null) result = caseCmd(vertiliceCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzvertilicePackage.VERTILICE_INSTANT_STATUS_CMD: {
				VertiliceInstantStatusCmd vertiliceInstantStatusCmd = (VertiliceInstantStatusCmd)theEObject;
				T result = caseVertiliceInstantStatusCmd(vertiliceInstantStatusCmd);
				if (result == null) result = caseVertiliceCmd(vertiliceInstantStatusCmd);
				if (result == null) result = caseCmd(vertiliceInstantStatusCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzvertilicePackage.VERTILICE_BATTERY_STATUS_CMD: {
				VertiliceBatteryStatusCmd vertiliceBatteryStatusCmd = (VertiliceBatteryStatusCmd)theEObject;
				T result = caseVertiliceBatteryStatusCmd(vertiliceBatteryStatusCmd);
				if (result == null) result = caseVertiliceCmd(vertiliceBatteryStatusCmd);
				if (result == null) result = caseCmd(vertiliceBatteryStatusCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzvertilicePackage.VERTILICE_FRMWARE: {
				VertiliceFrmware vertiliceFrmware = (VertiliceFrmware)theEObject;
				T result = caseVertiliceFrmware(vertiliceFrmware);
				if (result == null) result = caseVertiliceCmd(vertiliceFrmware);
				if (result == null) result = caseCmd(vertiliceFrmware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzvertilicePackage.VERTILICE_FAILURE_CMD: {
				VertiliceFailureCmd vertiliceFailureCmd = (VertiliceFailureCmd)theEObject;
				T result = caseVertiliceFailureCmd(vertiliceFailureCmd);
				if (result == null) result = caseVertiliceCmd(vertiliceFailureCmd);
				if (result == null) result = caseCmd(vertiliceFailureCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertilice Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertilice Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertiliceCmd(VertiliceCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertilice Instant Status Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertilice Instant Status Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertiliceInstantStatusCmd(VertiliceInstantStatusCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertilice Battery Status Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertilice Battery Status Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertiliceBatteryStatusCmd(VertiliceBatteryStatusCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertilice Frmware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertilice Frmware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertiliceFrmware(VertiliceFrmware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertilice Failure Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertilice Failure Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertiliceFailureCmd(VertiliceFailureCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzvertiliceSwitch
