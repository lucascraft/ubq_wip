/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TOP#getLayouts <em>Layouts</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTOP()
 * @model
 * @generated
 */
public interface TOP extends EObject {
	/**
	 * Returns the value of the '<em><b>Layouts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layouts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layouts</em>' containment reference.
	 * @see #setLayouts(TouchOscLayout)
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTOP_Layouts()
	 * @model containment="true"
	 * @generated
	 */
	TouchOscLayout getLayouts();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TOP#getLayouts <em>Layouts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layouts</em>' containment reference.
	 * @see #getLayouts()
	 * @generated
	 */
	void setLayouts(TouchOscLayout value);

} // TOP
