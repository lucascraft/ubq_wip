/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Fader H</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getValues <em>Values</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getNumFaders <em>Num Faders</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiFaderH()
 * @model
 * @generated
 */
public interface MultiFaderH extends Widget {

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiFaderH_Values()
	 * @model
	 * @generated
	 */
	EList<Float> getValues();

	/**
	 * Returns the value of the '<em><b>Num Faders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Faders</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Faders</em>' attribute.
	 * @see #setNumFaders(int)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiFaderH_NumFaders()
	 * @model
	 * @generated
	 */
	int getNumFaders();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getNumFaders <em>Num Faders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Faders</em>' attribute.
	 * @see #getNumFaders()
	 * @generated
	 */
	void setNumFaders(int value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' attribute.
	 * @see #setResponse(String)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiFaderH_Response()
	 * @model
	 * @generated
	 */
	String getResponse();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiFaderH#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' attribute.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(String value);
} // MultiFaderH
