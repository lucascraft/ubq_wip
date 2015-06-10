/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZWidget#getPrimaryOscTarget <em>Primary Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZWidget#getPrimaryMidiTarget <em>Primary Midi Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZWidget()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface JZWidget extends JZUIElem {

	/**
	 * Returns the value of the '<em><b>Primary Osc Target</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LEMUR_OSC_TARGET}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Osc Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Osc Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_OSC_TARGET
	 * @see #setPrimaryOscTarget(LEMUR_OSC_TARGET)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZWidget_PrimaryOscTarget()
	 * @model
	 * @generated
	 */
	LEMUR_OSC_TARGET getPrimaryOscTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZWidget#getPrimaryOscTarget <em>Primary Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Osc Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_OSC_TARGET
	 * @see #getPrimaryOscTarget()
	 * @generated
	 */
	void setPrimaryOscTarget(LEMUR_OSC_TARGET value);

	/**
	 * Returns the value of the '<em><b>Primary Midi Target</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LEMUR_MIDI_TARGET}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Midi Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Midi Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_MIDI_TARGET
	 * @see #setPrimaryMidiTarget(LEMUR_MIDI_TARGET)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZWidget_PrimaryMidiTarget()
	 * @model
	 * @generated
	 */
	LEMUR_MIDI_TARGET getPrimaryMidiTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZWidget#getPrimaryMidiTarget <em>Primary Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Midi Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_MIDI_TARGET
	 * @see #getPrimaryMidiTarget()
	 * @generated
	 */
	void setPrimaryMidiTarget(LEMUR_MIDI_TARGET value);

} // JZWidget
