/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Master</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveMaster#getMasterDevices <em>Master Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveMaster()
 * @model
 * @generated
 */
public interface LiveMaster extends LiveTrack {
	/**
	 * Returns the value of the '<em><b>Master Devices</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.AbstractLiveDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Devices</em>' containment reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveMaster_MasterDevices()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractLiveDevice> getMasterDevices();

} // LiveMaster
