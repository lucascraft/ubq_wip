/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg.impl;

import net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES;
import net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD;
import net.sf.smbt.xbeecfg.XbeecfgPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XBEE FIRMWARE CONF AT FIELD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecfg.impl.XBEE_FIRMWARE_CONF_AT_FIELDImpl#getAtCmd <em>At Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XBEE_FIRMWARE_CONF_AT_FIELDImpl extends MinimalEObjectImpl.Container implements XBEE_FIRMWARE_CONF_AT_FIELD {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBEE_FIRMWARE_CONF_AT_FIELDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XbeecfgPackage.Literals.XBEE_FIRMWARE_CONF_AT_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_COMMAND_TYPES getAtCmd() {
		return (AT_COMMAND_TYPES)eGet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CONF_AT_FIELD__AT_CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtCmd(AT_COMMAND_TYPES newAtCmd) {
		eSet(XbeecfgPackage.Literals.XBEE_FIRMWARE_CONF_AT_FIELD__AT_CMD, newAtCmd);
	}

} //XBEE_FIRMWARE_CONF_AT_FIELDImpl
