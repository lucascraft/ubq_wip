/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.wiimotectrl;

import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings;
import net.sf.xqz.model.engine.IConnectedUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiimote Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.wiimotectrl.WiimoteController#getWiiid <em>Wiiid</em>}</li>
 *   <li>{@link net.sf.smbt.wiimotectrl.WiimoteController#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.wiimotectrl.WiimoteController#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.wiimotectrl.WiimotectrlPackage#getWiimoteController()
 * @model
 * @generated
 */
public interface WiimoteController extends IConnectedUnit {
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
	 * @see net.sf.smbt.wiimotectrl.WiimotectrlPackage#getWiimoteController_Wiiid()
	 * @model
	 * @generated
	 */
	String getWiiid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.wiimotectrl.WiimoteController#getWiiid <em>Wiiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiiid</em>' attribute.
	 * @see #getWiiid()
	 * @generated
	 */
	void setWiiid(String value);

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
	 * @see net.sf.smbt.wiimotectrl.WiimotectrlPackage#getWiimoteController_Addr()
	 * @model
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.wiimotectrl.WiimoteController#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(WiimoteLiveSettings)
	 * @see net.sf.smbt.wiimotectrl.WiimotectrlPackage#getWiimoteController_Properties()
	 * @model containment="true"
	 * @generated
	 */
	WiimoteLiveSettings getProperties();

	/**
	 * Sets the value of the '{@link net.sf.smbt.wiimotectrl.WiimoteController#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(WiimoteLiveSettings value);

} // WiimoteController
