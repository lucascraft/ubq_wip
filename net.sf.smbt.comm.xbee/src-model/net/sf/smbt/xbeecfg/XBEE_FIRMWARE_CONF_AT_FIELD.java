/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg;

import net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBEE FIRMWARE CONF AT FIELD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD#getAtCmd <em>At Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBEE_FIRMWARE_CONF_AT_FIELD()
 * @model
 * @generated
 */
public interface XBEE_FIRMWARE_CONF_AT_FIELD extends EObject {
	/**
	 * Returns the value of the '<em><b>At Cmd</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Cmd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Cmd</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES
	 * @see #setAtCmd(AT_COMMAND_TYPES)
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBEE_FIRMWARE_CONF_AT_FIELD_AtCmd()
	 * @model
	 * @generated
	 */
	AT_COMMAND_TYPES getAtCmd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD#getAtCmd <em>At Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Cmd</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES
	 * @see #getAtCmd()
	 * @generated
	 */
	void setAtCmd(AT_COMMAND_TYPES value);

} // XBEE_FIRMWARE_CONF_AT_FIELD
