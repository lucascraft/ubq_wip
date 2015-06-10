/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;

import net.sf.smbt.osccmd.OscRcvCmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getWiiid <em>Wiiid</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteCmd()
 * @model
 * @generated
 */
public interface WiimoteCmd extends OscRcvCmd {
	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(String)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteCmd_Addr()
	 * @model
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

	/**
	 * Returns the value of the '<em><b>Wiiid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wiiid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiiid</em>' attribute.
	 * @see #setWiiid(String)
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteCmd_Wiiid()
	 * @model
	 * @generated
	 */
	String getWiiid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd#getWiiid <em>Wiiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiiid</em>' attribute.
	 * @see #getWiiid()
	 * @generated
	 */
	void setWiiid(String value);

} // WiimoteCmd
