/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.Color;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Lemur Menu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMenu#isScaleOutput <em>Scale Output</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMenu#isTransparent <em>Transparent</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMenu#getFont <em>Font</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMenu#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMenu#getItems <em>Items</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMenu#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMenu()
 * @model
 * @generated
 */
public interface JZLemurMenu extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Scale Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Output</em>' attribute.
	 * @see #setScaleOutput(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMenu_ScaleOutput()
	 * @model
	 * @generated
	 */
	boolean isScaleOutput();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMenu#isScaleOutput <em>Scale Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Output</em>' attribute.
	 * @see #isScaleOutput()
	 * @generated
	 */
	void setScaleOutput(boolean value);

	/**
	 * Returns the value of the '<em><b>Transparent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparent</em>' attribute.
	 * @see #setTransparent(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMenu_Transparent()
	 * @model
	 * @generated
	 */
	boolean isTransparent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMenu#isTransparent <em>Transparent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparent</em>' attribute.
	 * @see #isTransparent()
	 * @generated
	 */
	void setTransparent(boolean value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' attribute.
	 * @see #setFont(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMenu_Font()
	 * @model
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMenu#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMenu_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMenu#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jzmui.JZMenuItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMenu_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<JZMenuItem> getItems();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMenu_Selection()
	 * @model
	 * @generated
	 */
	int getSelection();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMenu#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(int value);

} // JZLemurMenu
