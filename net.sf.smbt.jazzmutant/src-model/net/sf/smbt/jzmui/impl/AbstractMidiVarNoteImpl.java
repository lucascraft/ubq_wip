/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.AbstractMidiVarNote;
import net.sf.smbt.jzmui.JzmuiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Midi Var Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.AbstractMidiVarNoteImpl#getPitchFrom <em>Pitch From</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.AbstractMidiVarNoteImpl#getPitchTo <em>Pitch To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractMidiVarNoteImpl extends MidiVarImpl implements AbstractMidiVarNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMidiVarNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.ABSTRACT_MIDI_VAR_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPitchFrom() {
		return (Integer)eGet(JzmuiPackage.Literals.ABSTRACT_MIDI_VAR_NOTE__PITCH_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitchFrom(int newPitchFrom) {
		eSet(JzmuiPackage.Literals.ABSTRACT_MIDI_VAR_NOTE__PITCH_FROM, newPitchFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPitchTo() {
		return (Integer)eGet(JzmuiPackage.Literals.ABSTRACT_MIDI_VAR_NOTE__PITCH_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitchTo(int newPitchTo) {
		eSet(JzmuiPackage.Literals.ABSTRACT_MIDI_VAR_NOTE__PITCH_TO, newPitchTo);
	}

} //AbstractMidiVarNoteImpl
