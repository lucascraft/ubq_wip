/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecfg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XBee Firmware Cfg Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getFields <em>Fields</em>}</li>
 *   <li>{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareCfgCategory()
 * @model
 * @generated
 */
public interface XBeeFirmwareCfgCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Categories</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' containment reference list.
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareCfgCategory_SubCategories()
	 * @model containment="true"
	 * @generated
	 */
	EList<XBeeFirmwareCfgCategory> getSubCategories();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY
	 * @see #setKind(XBEE_FIRMWARE_CONF_CATEGORY)
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareCfgCategory_Kind()
	 * @model
	 * @generated
	 */
	XBEE_FIRMWARE_CONF_CATEGORY getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_CATEGORY
	 * @see #getKind()
	 * @generated
	 */
	void setKind(XBEE_FIRMWARE_CONF_CATEGORY value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.xbeecfg.XBEE_FIRMWARE_CONF_AT_FIELD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareCfgCategory_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<XBEE_FIRMWARE_CONF_AT_FIELD> getFields();

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
	 * @see net.sf.smbt.xbeecfg.XbeecfgPackage#getXBeeFirmwareCfgCategory_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xbeecfg.XBeeFirmwareCfgCategory#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // XBeeFirmwareCfgCategory
