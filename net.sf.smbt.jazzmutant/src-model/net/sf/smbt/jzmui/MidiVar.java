/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Midi Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.MidiVar#getScaleFrom <em>Scale From</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.MidiVar#getScaleTo <em>Scale To</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.MidiVar#getChannelFrom <em>Channel From</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.MidiVar#getChannelTo <em>Channel To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiVar()
 * @model
 * @generated
 */
public interface MidiVar extends EObject {
	/**
	 * Returns the value of the '<em><b>Scale From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale From</em>' attribute.
	 * @see #setScaleFrom(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiVar_ScaleFrom()
	 * @model
	 * @generated
	 */
	int getScaleFrom();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiVar#getScaleFrom <em>Scale From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale From</em>' attribute.
	 * @see #getScaleFrom()
	 * @generated
	 */
	void setScaleFrom(int value);

	/**
	 * Returns the value of the '<em><b>Scale To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale To</em>' attribute.
	 * @see #setScaleTo(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiVar_ScaleTo()
	 * @model
	 * @generated
	 */
	int getScaleTo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiVar#getScaleTo <em>Scale To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale To</em>' attribute.
	 * @see #getScaleTo()
	 * @generated
	 */
	void setScaleTo(int value);

	/**
	 * Returns the value of the '<em><b>Channel From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel From</em>' attribute.
	 * @see #setChannelFrom(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiVar_ChannelFrom()
	 * @model
	 * @generated
	 */
	int getChannelFrom();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiVar#getChannelFrom <em>Channel From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel From</em>' attribute.
	 * @see #getChannelFrom()
	 * @generated
	 */
	void setChannelFrom(int value);

	/**
	 * Returns the value of the '<em><b>Channel To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel To</em>' attribute.
	 * @see #setChannelTo(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getMidiVar_ChannelTo()
	 * @model
	 * @generated
	 */
	int getChannelTo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.MidiVar#getChannelTo <em>Channel To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel To</em>' attribute.
	 * @see #getChannelTo()
	 * @generated
	 */
	void setChannelTo(int value);

} // MidiVar
