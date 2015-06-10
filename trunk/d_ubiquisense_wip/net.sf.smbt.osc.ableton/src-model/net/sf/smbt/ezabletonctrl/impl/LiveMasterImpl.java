/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezabletonctrl.AbstractLiveDevice;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveMaster;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Master</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveMasterImpl#getMasterDevices <em>Master Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveMasterImpl extends LiveTrackImpl implements LiveMaster {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveMasterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.LIVE_MASTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractLiveDevice> getMasterDevices() {
		return (EList<AbstractLiveDevice>)eGet(EzabletonctrlPackage.Literals.LIVE_MASTER__MASTER_DEVICES, true);
	}

} //LiveMasterImpl
