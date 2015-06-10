/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd.util;

import java.util.List;

import net.sf.smbt.xbeecmd.RxResponse16;
import net.sf.smbt.xbeecmd.RxResponse64;
import net.sf.smbt.xbeecmd.TxRequest16;
import net.sf.smbt.xbeecmd.TxRequest64;
import net.sf.smbt.xbeecmd.XBeeAtRcvCmd;
import net.sf.smbt.xbeecmd.XBeeAtSndCmd;
import net.sf.smbt.xbeecmd.XBeeRcvCmd;
import net.sf.smbt.xbeecmd.XBeeSndCmd;
import net.sf.smbt.xbeecmd.XbeecmdPackage;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see net.sf.smbt.xbeecmd.XbeecmdPackage
 * @generated
 */
public class XbeecmdSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XbeecmdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecmdSwitch() {
		if (modelPackage == null) {
			modelPackage = XbeecmdPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XbeecmdPackage.XBEE_SND_CMD: {
				XBeeSndCmd xBeeSndCmd = (XBeeSndCmd)theEObject;
				T result = caseXBeeSndCmd(xBeeSndCmd);
				if (result == null) result = caseCmd(xBeeSndCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecmdPackage.XBEE_RCV_CMD: {
				XBeeRcvCmd xBeeRcvCmd = (XBeeRcvCmd)theEObject;
				T result = caseXBeeRcvCmd(xBeeRcvCmd);
				if (result == null) result = caseCmd(xBeeRcvCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecmdPackage.XBEE_AT_SND_CMD: {
				XBeeAtSndCmd xBeeAtSndCmd = (XBeeAtSndCmd)theEObject;
				T result = caseXBeeAtSndCmd(xBeeAtSndCmd);
				if (result == null) result = caseXBeeSndCmd(xBeeAtSndCmd);
				if (result == null) result = caseCmd(xBeeAtSndCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecmdPackage.XBEE_AT_RCV_CMD: {
				XBeeAtRcvCmd xBeeAtRcvCmd = (XBeeAtRcvCmd)theEObject;
				T result = caseXBeeAtRcvCmd(xBeeAtRcvCmd);
				if (result == null) result = caseXBeeRcvCmd(xBeeAtRcvCmd);
				if (result == null) result = caseCmd(xBeeAtRcvCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecmdPackage.TX_REQUEST16: {
				TxRequest16 txRequest16 = (TxRequest16)theEObject;
				T result = caseTxRequest16(txRequest16);
				if (result == null) result = caseXBeeSndCmd(txRequest16);
				if (result == null) result = caseCmd(txRequest16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecmdPackage.TX_REQUEST64: {
				TxRequest64 txRequest64 = (TxRequest64)theEObject;
				T result = caseTxRequest64(txRequest64);
				if (result == null) result = caseXBeeSndCmd(txRequest64);
				if (result == null) result = caseCmd(txRequest64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecmdPackage.RX_RESPONSE16: {
				RxResponse16 rxResponse16 = (RxResponse16)theEObject;
				T result = caseRxResponse16(rxResponse16);
				if (result == null) result = caseXBeeRcvCmd(rxResponse16);
				if (result == null) result = caseCmd(rxResponse16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecmdPackage.RX_RESPONSE64: {
				RxResponse64 rxResponse64 = (RxResponse64)theEObject;
				T result = caseRxResponse64(rxResponse64);
				if (result == null) result = caseXBeeRcvCmd(rxResponse64);
				if (result == null) result = caseCmd(rxResponse64);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee Snd Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeeSndCmd(XBeeSndCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee Rcv Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeeRcvCmd(XBeeRcvCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee At Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee At Snd Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeeAtSndCmd(XBeeAtSndCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee At Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee At Rcv Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeeAtRcvCmd(XBeeAtRcvCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tx Request16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tx Request16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTxRequest16(TxRequest16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tx Request64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tx Request64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTxRequest64(TxRequest64 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rx Response16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rx Response16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRxResponse16(RxResponse16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rx Response64</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rx Response64</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRxResponse64(RxResponse64 object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //XbeecmdSwitch
