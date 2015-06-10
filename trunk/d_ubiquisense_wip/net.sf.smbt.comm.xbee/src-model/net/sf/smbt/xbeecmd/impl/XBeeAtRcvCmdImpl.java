/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd.impl;

import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.xbeecmd.XBeeAtRcvCmd;
import net.sf.smbt.xbeecmd.XbeecmdPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XBee At Rcv Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecmd.impl.XBeeAtRcvCmdImpl#getAtCmd <em>At Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XBeeAtRcvCmdImpl extends XBeeRcvCmdImpl implements XBeeAtRcvCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBeeAtRcvCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XbeecmdPackage.Literals.XBEE_AT_RCV_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATCmd getAtCmd() {
		return (ATCmd)eGet(XbeecmdPackage.Literals.XBEE_AT_RCV_CMD__AT_CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtCmd(ATCmd newAtCmd) {
		eSet(XbeecmdPackage.Literals.XBEE_AT_RCV_CMD__AT_CMD, newAtCmd);
	}

} //XBeeAtRcvCmdImpl
