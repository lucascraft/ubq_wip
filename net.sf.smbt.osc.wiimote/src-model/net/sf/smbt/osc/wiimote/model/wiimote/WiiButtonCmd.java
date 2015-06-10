/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wii Button Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getToggle <em>Toggle</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiButtonCmd()
 * @model
 * @generated
 */
public interface WiiButtonCmd extends WiimoteCmd {
	/**
	 * Returns the value of the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toggle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle</em>' attribute.
	 * @see #setToggle(float)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiButtonCmd_Toggle()
	 * @model
	 * @generated
	 */
	float getToggle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getToggle <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggle</em>' attribute.
	 * @see #getToggle()
	 * @generated
	 */
	void setToggle(float value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind
	 * @see #setKind(WiimoteButtonKind)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiiButtonCmd_Kind()
	 * @model
	 * @generated
	 */
	WiimoteButtonKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteButtonKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(WiimoteButtonKind value);

} // WiiButtonCmd
