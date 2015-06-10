/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd.impl;

import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.xbeecmd.XBeeAtSndCmd;
import net.sf.smbt.xbeecmd.XbeecmdPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XBee At Snd Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecmd.impl.XBeeAtSndCmdImpl#getAtCmd <em>At Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XBeeAtSndCmdImpl extends XBeeSndCmdImpl implements XBeeAtSndCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBeeAtSndCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XbeecmdPackage.Literals.XBEE_AT_SND_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATCmd getAtCmd() {
		return (ATCmd)eGet(XbeecmdPackage.Literals.XBEE_AT_SND_CMD__AT_CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtCmd(ATCmd newAtCmd) {
		eSet(XbeecmdPackage.Literals.XBEE_AT_SND_CMD__AT_CMD, newAtCmd);
	}

} //XBeeAtSndCmdImpl
