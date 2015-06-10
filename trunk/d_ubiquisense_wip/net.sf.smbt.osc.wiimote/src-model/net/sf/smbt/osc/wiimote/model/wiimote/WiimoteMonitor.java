/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor#getWiimotes <em>Wiimotes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteMonitor()
 * @model
 * @generated
 */
public interface WiimoteMonitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Wiimotes</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wiimotes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiimotes</em>' reference list.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage#getWiimoteMonitor_Wiimotes()
	 * @model
	 * @generated
	 */
	EList<WiimoteLiveSettings> getWiimotes();

} // WiimoteMonitor
