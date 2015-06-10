/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Mixer Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getPanning <em>Panning</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getSends <em>Sends</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbstractMixerDevice()
 * @model
 * @generated
 */
public interface AbstractMixerDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' reference.
	 * @see #setVolume(LiveParam)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbstractMixerDevice_Volume()
	 * @model
	 * @generated
	 */
	LiveParam getVolume();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getVolume <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(LiveParam value);

	/**
	 * Returns the value of the '<em><b>Panning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panning</em>' reference.
	 * @see #setPanning(LiveParam)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbstractMixerDevice_Panning()
	 * @model
	 * @generated
	 */
	LiveParam getPanning();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.AbstractMixerDevice#getPanning <em>Panning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panning</em>' reference.
	 * @see #getPanning()
	 * @generated
	 */
	void setPanning(LiveParam value);

	/**
	 * Returns the value of the '<em><b>Sends</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezabletonctrl.LiveParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends</em>' containment reference list.
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getAbstractMixerDevice_Sends()
	 * @model containment="true"
	 * @generated
	 */
	EList<LiveParam> getSends();

} // AbstractMixerDevice
