/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbee;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xbee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xbee.Xbee#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.Xbee#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.Xbee#getFreq <em>Freq</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.Xbee#getModes <em>Modes</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.Xbee#getFirmaware <em>Firmaware</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xbee.XbeePackage#getXbee()
 * @model
 * @generated
 */
public interface Xbee extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.xbee.XbeePackage#getXbee_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbee.Xbee#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.xbee.XBEE_SERIES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' attribute.
	 * @see net.sf.smbt.xbee.XBEE_SERIES
	 * @see #setSeries(XBEE_SERIES)
	 * @see net.sf.smbt.xbee.XbeePackage#getXbee_Series()
	 * @model
	 * @generated
	 */
	XBEE_SERIES getSeries();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbee.Xbee#getSeries <em>Series</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' attribute.
	 * @see net.sf.smbt.xbee.XBEE_SERIES
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(XBEE_SERIES value);

	/**
	 * Returns the value of the '<em><b>Freq</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.xbee.XBEE_FREQ}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freq</em>' attribute.
	 * @see net.sf.smbt.xbee.XBEE_FREQ
	 * @see #setFreq(XBEE_FREQ)
	 * @see net.sf.smbt.xbee.XbeePackage#getXbee_Freq()
	 * @model
	 * @generated
	 */
	XBEE_FREQ getFreq();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbee.Xbee#getFreq <em>Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freq</em>' attribute.
	 * @see net.sf.smbt.xbee.XBEE_FREQ
	 * @see #getFreq()
	 * @generated
	 */
	void setFreq(XBEE_FREQ value);

	/**
	 * Returns the value of the '<em><b>Modes</b></em>' attribute list.
	 * The list contents are of type {@link net.sf.smbt.xbee.XBEE_COMM_MODE}.
	 * The literals are from the enumeration {@link net.sf.smbt.xbee.XBEE_COMM_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modes</em>' attribute list.
	 * @see net.sf.smbt.xbee.XBEE_COMM_MODE
	 * @see net.sf.smbt.xbee.XbeePackage#getXbee_Modes()
	 * @model
	 * @generated
	 */
	EList<XBEE_COMM_MODE> getModes();

	/**
	 * Returns the value of the '<em><b>Firmaware</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.xbee.XBEE_FIRMAWARE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firmaware</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firmaware</em>' attribute.
	 * @see net.sf.smbt.xbee.XBEE_FIRMAWARE
	 * @see #setFirmaware(XBEE_FIRMAWARE)
	 * @see net.sf.smbt.xbee.XbeePackage#getXbee_Firmaware()
	 * @model
	 * @generated
	 */
	XBEE_FIRMAWARE getFirmaware();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbee.Xbee#getFirmaware <em>Firmaware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firmaware</em>' attribute.
	 * @see net.sf.smbt.xbee.XBEE_FIRMAWARE
	 * @see #getFirmaware()
	 * @generated
	 */
	void setFirmaware(XBEE_FIRMAWARE value);

} // Xbee
