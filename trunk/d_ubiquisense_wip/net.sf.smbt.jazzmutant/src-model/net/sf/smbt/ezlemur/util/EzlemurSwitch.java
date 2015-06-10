/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur.util;

import java.util.List;

import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.ezlemur.*;
import net.sf.smbt.ezlemur.AbstractLemurOscCmd;
import net.sf.smbt.ezlemur.EzlemurPackage;
import net.sf.smbt.ezlemur.LemurDmxCmd;
import net.sf.smbt.ezlemur.LemurMidiCmd;
import net.sf.smbt.ezlemur.LemurOscCmd;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.ezlemur.EzlemurPackage
 * @generated
 */
public class EzlemurSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzlemurPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzlemurSwitch() {
		if (modelPackage == null) {
			modelPackage = EzlemurPackage.eINSTANCE;
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
			case EzlemurPackage.LEMUR_OSC_CMD: {
				LemurOscCmd lemurOscCmd = (LemurOscCmd)theEObject;
				T result = caseLemurOscCmd(lemurOscCmd);
				if (result == null) result = caseOscCmd(lemurOscCmd);
				if (result == null) result = caseAbstractLemurOscCmd(lemurOscCmd);
				if (result == null) result = caseCmd(lemurOscCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzlemurPackage.LEMUR_MIDI_CMD: {
				LemurMidiCmd lemurMidiCmd = (LemurMidiCmd)theEObject;
				T result = caseLemurMidiCmd(lemurMidiCmd);
				if (result == null) result = caseAbstractMidiCmd(lemurMidiCmd);
				if (result == null) result = caseAbstractLemurOscCmd(lemurMidiCmd);
				if (result == null) result = caseCmd(lemurMidiCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzlemurPackage.LEMUR_DMX_CMD: {
				LemurDmxCmd lemurDmxCmd = (LemurDmxCmd)theEObject;
				T result = caseLemurDmxCmd(lemurDmxCmd);
				if (result == null) result = caseOpenDMXCmd(lemurDmxCmd);
				if (result == null) result = caseAbstractLemurOscCmd(lemurDmxCmd);
				if (result == null) result = caseCmd(lemurDmxCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzlemurPackage.ABSTRACT_LEMUR_OSC_CMD: {
				AbstractLemurOscCmd abstractLemurOscCmd = (AbstractLemurOscCmd)theEObject;
				T result = caseAbstractLemurOscCmd(abstractLemurOscCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lemur Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lemur Osc Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLemurOscCmd(LemurOscCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lemur Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lemur Midi Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLemurMidiCmd(LemurMidiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lemur Dmx Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lemur Dmx Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLemurDmxCmd(LemurDmxCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Lemur Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Lemur Osc Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLemurOscCmd(AbstractLemurOscCmd object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscCmd(OscCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMidiCmd(AbstractMidiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXCmd(OpenDMXCmd object) {
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

} //EzlemurSwitch
