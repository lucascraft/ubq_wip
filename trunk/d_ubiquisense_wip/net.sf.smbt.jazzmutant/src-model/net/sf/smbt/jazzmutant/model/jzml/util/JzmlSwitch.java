/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.util;

import java.util.List;

import net.sf.smbt.jazzmutant.model.jzml.*;
import net.sf.smbt.jazzmutant.model.jzml.JZML;
import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.PARAM;
import net.sf.smbt.jazzmutant.model.jzml.PROJECT;
import net.sf.smbt.jazzmutant.model.jzml.TOP;
import net.sf.smbt.jazzmutant.model.jzml.VARIABLE;
import net.sf.smbt.jazzmutant.model.jzml.WINDOW;

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
 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage
 * @generated
 */
public class JzmlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JzmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzmlSwitch() {
		if (modelPackage == null) {
			modelPackage = JzmlPackage.eINSTANCE;
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
			case JzmlPackage.JZML: {
				JZML jzml = (JZML)theEObject;
				T result = caseJZML(jzml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmlPackage.PARAM: {
				PARAM param = (PARAM)theEObject;
				T result = casePARAM(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmlPackage.PROJECT: {
				PROJECT project = (PROJECT)theEObject;
				T result = casePROJECT(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmlPackage.TOP: {
				TOP top = (TOP)theEObject;
				T result = caseTOP(top);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmlPackage.VARIABLE: {
				VARIABLE variable = (VARIABLE)theEObject;
				T result = caseVARIABLE(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmlPackage.WINDOW: {
				WINDOW window = (WINDOW)theEObject;
				T result = caseWINDOW(window);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZML(JZML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PARAM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PARAM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePARAM(PARAM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROJECT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROJECT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROJECT(PROJECT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOP(TOP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VARIABLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VARIABLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVARIABLE(VARIABLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WINDOW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WINDOW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWINDOW(WINDOW object) {
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

} //JzmlSwitch
