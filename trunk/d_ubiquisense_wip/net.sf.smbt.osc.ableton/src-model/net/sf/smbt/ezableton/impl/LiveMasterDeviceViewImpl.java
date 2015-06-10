/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveMasterDeviceView;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Master Device View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveMasterDeviceViewImpl#getDeviceID <em>Device ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveMasterDeviceViewImpl extends AbletonLiveSndCmdImpl implements LiveMasterDeviceView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveMasterDeviceViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_MASTER_DEVICE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeviceID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_MASTER_DEVICE_VIEW__DEVICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(int newDeviceID) {
		eSet(EzabletonPackage.Literals.LIVE_MASTER_DEVICE_VIEW__DEVICE_ID, newDeviceID);
	}

} //LiveMasterDeviceViewImpl
