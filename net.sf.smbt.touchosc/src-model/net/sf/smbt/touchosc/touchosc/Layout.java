/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Layout#getTabpage <em>Tabpage</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Layout#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Layout#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.Layout#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getLayout()
 * @model extendedMetaData="name='layout' kind='elementOnly'"
 * @generated
 */
public interface Layout extends EObject {
	/**
	 * Returns the value of the '<em><b>Tabpage</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.touchosc.Tabpage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabpage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabpage</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getLayout_Tabpage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tabpage'"
	 * @generated
	 */
	EList<Tabpage> getTabpage();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getLayout_Mode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mode'"
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Layout#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see #setOrientation(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getLayout_Orientation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='orientation'"
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Layout#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getLayout_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.Layout#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Layout
