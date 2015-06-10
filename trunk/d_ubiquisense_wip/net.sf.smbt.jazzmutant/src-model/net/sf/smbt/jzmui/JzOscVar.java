/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jz Osc Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JzOscVar#isCustomAddress <em>Custom Address</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JzOscVar#getCustomMsg <em>Custom Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JzOscVar#getOscTarget <em>Osc Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJzOscVar()
 * @model
 * @generated
 */
public interface JzOscVar extends JZVar {
	/**
	 * Returns the value of the '<em><b>Custom Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Address</em>' attribute.
	 * @see #setCustomAddress(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJzOscVar_CustomAddress()
	 * @model
	 * @generated
	 */
	boolean isCustomAddress();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JzOscVar#isCustomAddress <em>Custom Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Address</em>' attribute.
	 * @see #isCustomAddress()
	 * @generated
	 */
	void setCustomAddress(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Msg</em>' attribute.
	 * @see #setCustomMsg(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJzOscVar_CustomMsg()
	 * @model
	 * @generated
	 */
	String getCustomMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JzOscVar#getCustomMsg <em>Custom Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Msg</em>' attribute.
	 * @see #getCustomMsg()
	 * @generated
	 */
	void setCustomMsg(String value);

	/**
	 * Returns the value of the '<em><b>Osc Target</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.LEMUR_OSC_TARGET}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_OSC_TARGET
	 * @see #setOscTarget(LEMUR_OSC_TARGET)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJzOscVar_OscTarget()
	 * @model
	 * @generated
	 */
	LEMUR_OSC_TARGET getOscTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JzOscVar#getOscTarget <em>Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc Target</em>' attribute.
	 * @see net.sf.smbt.jzmui.LEMUR_OSC_TARGET
	 * @see #getOscTarget()
	 * @generated
	 */
	void setOscTarget(LEMUR_OSC_TARGET value);

} // JzOscVar
