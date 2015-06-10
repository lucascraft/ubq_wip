/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveParam;
import net.sf.smbt.ezabletonctrl.PlaceHolderDevice;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place Holder Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.PlaceHolderDeviceImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceHolderDeviceImpl extends MinimalEObjectImpl.Container implements PlaceHolderDevice {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceHolderDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.PLACE_HOLDER_DEVICE;
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
	public String getDeviceName() {
		return (String)eGet(EzabletonctrlPackage.Literals.ABSTRACT_LIVE_DEVICE__DEVICE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		eSet(EzabletonctrlPackage.Literals.ABSTRACT_LIVE_DEVICE__DEVICE_NAME, newDeviceName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeviceID() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.ABSTRACT_LIVE_DEVICE__DEVICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceID(int newDeviceID) {
		eSet(EzabletonctrlPackage.Literals.ABSTRACT_LIVE_DEVICE__DEVICE_ID, newDeviceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastSeen() {
		return (Long)eGet(EzabletonctrlPackage.Literals.ABSTRACT_LIVE_DEVICE__LAST_SEEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSeen(long newLastSeen) {
		eSet(EzabletonctrlPackage.Literals.ABSTRACT_LIVE_DEVICE__LAST_SEEN, newLastSeen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LiveParam> getParameters() {
		return (EList<LiveParam>)eGet(EzabletonctrlPackage.Literals.ABSTRACT_LIVE_DEVICE__PARAMETERS, true);
	}

} //PlaceHolderDeviceImpl
