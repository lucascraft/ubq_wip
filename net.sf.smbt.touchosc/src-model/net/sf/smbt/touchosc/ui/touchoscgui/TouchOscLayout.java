/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touch Osc Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getTabs <em>Tabs</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout()
 * @model
 * @generated
 */
public interface TouchOscLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Tabs</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabs</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout_Tabs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscTabPage> getTabs();

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
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getMode <em>Mode</em>}' attribute.
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
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout_Orientation()
	 * @model
	 * @generated
	 */
	String getOrientation();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getOrientation <em>Orientation</em>}' attribute.
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
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout_Widgets()
	 * @model
	 * @generated
	 */
	EList<TouchOscControl> getWidgets();

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
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getWidth <em>Width</em>}' attribute.
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
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscLayout_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // TouchOscLayout
