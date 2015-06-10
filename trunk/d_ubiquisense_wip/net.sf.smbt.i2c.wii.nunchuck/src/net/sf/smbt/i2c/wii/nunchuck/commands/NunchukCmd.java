/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nunchuk Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getNunchukCmd()
 * @model
 * @generated
 */
public interface NunchukCmd extends Cmd {

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
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getNunchukCmd_Addr()
	 * @model
	 * @generated
	 */
	String getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(String value);
} // NunchukCmd
