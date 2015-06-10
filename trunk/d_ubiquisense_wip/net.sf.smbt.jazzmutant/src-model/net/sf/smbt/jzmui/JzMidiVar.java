/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jz Midi Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JzMidiVar#getMidiMessage <em>Midi Message</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JzMidiVar#getMidiTarget <em>Midi Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJzMidiVar()
 * @model
 * @generated
 */
public interface JzMidiVar extends JZVar {
	/**
	 * Returns the value of the '<em><b>Midi Message</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.MIDI_MESSAGES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Message</em>' attribute.
	 * @see net.sf.smbt.jzmui.MIDI_MESSAGES
	 * @see #setMidiMessage(MIDI_MESSAGES)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJzMidiVar_MidiMessage()
	 * @model
	 * @generated
	 */
	MIDI_MESSAGES getMidiMessage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JzMidiVar#getMidiMessage <em>Midi Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Message</em>' attribute.
	 * @see net.sf.smbt.jzmui.MIDI_MESSAGES
	 * @see #getMidiMessage()
	 * @generated
	 */
	void setMidiMessage(MIDI_MESSAGES value);

	/**
	 * Returns the value of the '<em><b>Midi Target</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LEMUR_MIDI_TARGET}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_MIDI_TARGET
	 * @see #setMidiTarget(LEMUR_MIDI_TARGET)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJzMidiVar_MidiTarget()
	 * @model
	 * @generated
	 */
	LEMUR_MIDI_TARGET getMidiTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JzMidiVar#getMidiTarget <em>Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Midi Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_MIDI_TARGET
	 * @see #getMidiTarget()
	 * @generated
	 */
	void setMidiTarget(LEMUR_MIDI_TARGET value);

} // JzMidiVar
