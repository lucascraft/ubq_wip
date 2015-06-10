/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;

import net.sf.xqz.model.engine.IConnectedUnit;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touch Osc App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getTabs <em>Tabs</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getTouchOscApp()
 * @model
 * @generated
 */
public interface TouchOscApp extends IConnectedUnit {

	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.touchoscapp.Tab}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getTouchOscApp_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tab> getTabs();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.touchosc.touchoscapp.Orientation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see net.sf.smbt.touchosc.touchoscapp.Orientation
	 * @see #setOrientation(Orientation)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getTouchOscApp_Orientation()
	 * @model
	 * @generated
	 */
	Orientation getOrientation();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see net.sf.smbt.touchosc.touchoscapp.Orientation
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(Orientation value);

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
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getTouchOscApp_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

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
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getTouchOscApp_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getTouchOscApp_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getTouchOscApp_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.TouchOscApp#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);
} // TouchOscApp
