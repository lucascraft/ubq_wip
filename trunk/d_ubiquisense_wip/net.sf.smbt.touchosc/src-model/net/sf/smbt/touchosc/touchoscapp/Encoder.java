/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encoder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getTo <em>To</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getEncoder()
 * @model
 * @generated
 */
public interface Encoder extends Widget {

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getEncoder_From()
	 * @model
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getEncoder_To()
	 * @model
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

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
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getEncoder_Response()
	 * @model
	 * @generated
	 */
	String getResponse();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.Encoder#getResponse <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' attribute.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(String value);
} // Encoder
