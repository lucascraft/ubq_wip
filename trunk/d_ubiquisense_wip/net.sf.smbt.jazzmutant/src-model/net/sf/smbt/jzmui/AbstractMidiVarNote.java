/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Midi Var Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchFrom <em>Pitch From</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchTo <em>Pitch To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getAbstractMidiVarNote()
 * @model
 * @generated
 */
public interface AbstractMidiVarNote extends MidiVar {
	/**
	 * Returns the value of the '<em><b>Pitch From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch From</em>' attribute.
	 * @see #setPitchFrom(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getAbstractMidiVarNote_PitchFrom()
	 * @model
	 * @generated
	 */
	int getPitchFrom();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchFrom <em>Pitch From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch From</em>' attribute.
	 * @see #getPitchFrom()
	 * @generated
	 */
	void setPitchFrom(int value);

	/**
	 * Returns the value of the '<em><b>Pitch To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch To</em>' attribute.
	 * @see #setPitchTo(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getAbstractMidiVarNote_PitchTo()
	 * @model
	 * @generated
	 */
	int getPitchTo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.AbstractMidiVarNote#getPitchTo <em>Pitch To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch To</em>' attribute.
	 * @see #getPitchTo()
	 * @generated
	 */
	void setPitchTo(int value);

} // AbstractMidiVarNote
