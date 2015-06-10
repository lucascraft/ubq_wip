/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd;

import net.sf.smbt.at.atcmdset.ATCmd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBee At Snd Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecmd.XBeeAtSndCmd#getAtCmd <em>At Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xbeecmd.XbeecmdPackage#getXBeeAtSndCmd()
 * @model
 * @generated
 */
public interface XBeeAtSndCmd extends XBeeSndCmd {

	/**
	 * Returns the value of the '<em><b>At Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At Cmd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Cmd</em>' reference.
	 * @see #setAtCmd(ATCmd)
	 * @see net.sf.smbt.xbeecmd.XbeecmdPackage#getXBeeAtSndCmd_AtCmd()
	 * @model
	 * @generated
	 */
	ATCmd getAtCmd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbeecmd.XBeeAtSndCmd#getAtCmd <em>At Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Cmd</em>' reference.
	 * @see #getAtCmd()
	 * @generated
	 */
	void setAtCmd(ATCmd value);
} // XBeeAtSndCmd
