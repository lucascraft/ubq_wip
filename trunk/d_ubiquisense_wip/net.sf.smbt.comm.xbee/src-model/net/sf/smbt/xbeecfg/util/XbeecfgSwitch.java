/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg.util;

import java.util.List;

import net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD;
import net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory;
import net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration;
import net.sf.smbt.xbeecfg.XbeecfgPackage;

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
 * @see net.sf.smbt.xbeecfg.XbeecfgPackage
 * @generated
 */
public class XbeecfgSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XbeecfgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecfgSwitch() {
		if (modelPackage == null) {
			modelPackage = XbeecfgPackage.eINSTANCE;
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
			case XbeecfgPackage.XBEE_FIRMWARE_CONFIGURATION: {
				XBeeFirmwareConfiguration xBeeFirmwareConfiguration = (XBeeFirmwareConfiguration)theEObject;
				T result = caseXBeeFirmwareConfiguration(xBeeFirmwareConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecfgPackage.XBEE_FIRMWARE_CFG_CATEGORY: {
				XBeeFirmwareCfgCategory xBeeFirmwareCfgCategory = (XBeeFirmwareCfgCategory)theEObject;
				T result = caseXBeeFirmwareCfgCategory(xBeeFirmwareCfgCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XbeecfgPackage.XBEE_FIRMWARE_CONF_AT_FIELD: {
				XBEE_FIRMWARE_CONF_AT_FIELD xbeE_FIRMWARE_CONF_AT_FIELD = (XBEE_FIRMWARE_CONF_AT_FIELD)theEObject;
				T result = caseXBEE_FIRMWARE_CONF_AT_FIELD(xbeE_FIRMWARE_CONF_AT_FIELD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee Firmware Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee Firmware Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeeFirmwareConfiguration(XBeeFirmwareConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee Firmware Cfg Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee Firmware Cfg Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeeFirmwareCfgCategory(XBeeFirmwareCfgCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBEE FIRMWARE CONF AT FIELD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBEE FIRMWARE CONF AT FIELD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBEE_FIRMWARE_CONF_AT_FIELD(XBEE_FIRMWARE_CONF_AT_FIELD object) {
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

} //XbeecfgSwitch
