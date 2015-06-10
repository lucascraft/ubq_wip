/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LEMUR_MIDI_TARGET;
import net.sf.smbt.jzmui.MIDI_MESSAGES;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jz Midi Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JzMidiVarImpl#getMidiMessage <em>Midi Message</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JzMidiVarImpl#getMidiTarget <em>Midi Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JzMidiVarImpl extends JZVarImpl implements JzMidiVar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JzMidiVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_MIDI_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIDI_MESSAGES getMidiMessage() {
		return (MIDI_MESSAGES)eGet(JzmuiPackage.Literals.JZ_MIDI_VAR__MIDI_MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiMessage(MIDI_MESSAGES newMidiMessage) {
		eSet(JzmuiPackage.Literals.JZ_MIDI_VAR__MIDI_MESSAGE, newMidiMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEMUR_MIDI_TARGET getMidiTarget() {
		return (LEMUR_MIDI_TARGET)eGet(JzmuiPackage.Literals.JZ_MIDI_VAR__MIDI_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiTarget(LEMUR_MIDI_TARGET newMidiTarget) {
		eSet(JzmuiPackage.Literals.JZ_MIDI_VAR__MIDI_TARGET, newMidiTarget);
	}

} //JzMidiVarImpl
