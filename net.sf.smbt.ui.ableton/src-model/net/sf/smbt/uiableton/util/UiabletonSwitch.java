/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton.util;

import java.util.List;

import net.sf.smbt.uiableton.UIAbleton;
import net.sf.smbt.uiableton.UIAbletonClip;
import net.sf.smbt.uiableton.UIAbletonMasterTrack;
import net.sf.smbt.uiableton.UIAbletonScene;
import net.sf.smbt.uiableton.UIAbletonTrack;
import net.sf.smbt.uiableton.UIItem;
import net.sf.smbt.uiableton.UiabletonPackage;

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
 * @see net.sf.smbt.uiableton.UiabletonPackage
 * @generated
 */
public class UiabletonSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiabletonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiabletonSwitch() {
		if (modelPackage == null) {
			modelPackage = UiabletonPackage.eINSTANCE;
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
			case UiabletonPackage.UI_ABLETON: {
				UIAbleton uiAbleton = (UIAbleton)theEObject;
				T result = caseUIAbleton(uiAbleton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiabletonPackage.UI_ABLETON_TRACK: {
				UIAbletonTrack uiAbletonTrack = (UIAbletonTrack)theEObject;
				T result = caseUIAbletonTrack(uiAbletonTrack);
				if (result == null) result = caseUIItem(uiAbletonTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiabletonPackage.UI_ABLETON_MASTER_TRACK: {
				UIAbletonMasterTrack uiAbletonMasterTrack = (UIAbletonMasterTrack)theEObject;
				T result = caseUIAbletonMasterTrack(uiAbletonMasterTrack);
				if (result == null) result = caseUIAbletonTrack(uiAbletonMasterTrack);
				if (result == null) result = caseUIItem(uiAbletonMasterTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiabletonPackage.UI_ABLETON_CLIP: {
				UIAbletonClip uiAbletonClip = (UIAbletonClip)theEObject;
				T result = caseUIAbletonClip(uiAbletonClip);
				if (result == null) result = caseUIItem(uiAbletonClip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiabletonPackage.UI_ABLETON_SCENE: {
				UIAbletonScene uiAbletonScene = (UIAbletonScene)theEObject;
				T result = caseUIAbletonScene(uiAbletonScene);
				if (result == null) result = caseUIItem(uiAbletonScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UiabletonPackage.UI_ITEM: {
				UIItem uiItem = (UIItem)theEObject;
				T result = caseUIItem(uiItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Ableton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Ableton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAbleton(UIAbleton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Ableton Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Ableton Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAbletonTrack(UIAbletonTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Ableton Master Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Ableton Master Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAbletonMasterTrack(UIAbletonMasterTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Ableton Clip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Ableton Clip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAbletonClip(UIAbletonClip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Ableton Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Ableton Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIAbletonScene(UIAbletonScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIItem(UIItem object) {
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

} //UiabletonSwitch
