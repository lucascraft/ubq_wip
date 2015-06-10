/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.swt.graphics.Color;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Lemur Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMonitor#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMonitor#getUnit <em>Unit</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMonitor#getPrecision <em>Precision</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMonitor#getFont <em>Font</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMonitor#isTransparent <em>Transparent</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLemurMonitor#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMonitor()
 * @model
 * @generated
 */
public interface JZLemurMonitor extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMonitor_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMonitor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMonitor_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMonitor#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMonitor_Precision()
	 * @model
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMonitor#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMonitor_Font()
	 * @model
	 * @generated
	 */
	String getFont();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMonitor#getFont <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' attribute.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(String value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMonitor_Transparent()
	 * @model
	 * @generated
	 */
	boolean isTransparent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMonitor#isTransparent <em>Transparent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparent</em>' attribute.
	 * @see #isTransparent()
	 * @generated
	 */
	void setTransparent(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLemurMonitor_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLemurMonitor#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // JZLemurMonitor
