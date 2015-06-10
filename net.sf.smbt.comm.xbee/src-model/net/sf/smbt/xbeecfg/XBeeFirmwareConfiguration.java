/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg;

import net.sf.smbt.xbee.XBEE_SERIES;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBee Firmware Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getCategories <em>Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareConfiguration()
 * @model
 * @generated
 */
public interface XBeeFirmwareConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Series</b></em>' attribute list.
	 * The list contents are of type {@link net.sf.smbt.xbee.XBEE_SERIES}.
	 * The literals are from the enumeration {@link net.sf.smbt.xbee.XBEE_SERIES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' attribute list.
	 * @see net.sf.smbt.xbee.XBEE_SERIES
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareConfiguration_Series()
	 * @model
	 * @generated
	 */
	EList<XBEE_SERIES> getSeries();

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
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareConfiguration_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbeecfg.XBeeFirmwareConfiguration#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareConfiguration_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<XBeeFirmwareCfgCategory> getCategories();

} // XBeeFirmwareConfiguration
