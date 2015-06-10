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
 * A representation of the model object '<em><b>JZ Led</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#isTransparent <em>Transparent</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#getRows <em>Rows</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#isMulticolor <em>Multicolor</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#isBargraph <em>Bargraph</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#getColorOff <em>Color Off</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#getColorOn <em>Color On</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZLed#isLabelActive <em>Label Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed()
 * @model
 * @generated
 */
public interface JZLed extends JZWidget {
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_Transparent()
	 * @model
	 * @generated
	 */
	boolean isTransparent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#isTransparent <em>Transparent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparent</em>' attribute.
	 * @see #isTransparent()
	 * @generated
	 */
	void setTransparent(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Multicolor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicolor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicolor</em>' attribute.
	 * @see #setMulticolor(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_Multicolor()
	 * @model
	 * @generated
	 */
	boolean isMulticolor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#isMulticolor <em>Multicolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicolor</em>' attribute.
	 * @see #isMulticolor()
	 * @generated
	 */
	void setMulticolor(boolean value);

	/**
	 * Returns the value of the '<em><b>Bargraph</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bargraph</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bargraph</em>' attribute.
	 * @see #setBargraph(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_Bargraph()
	 * @model
	 * @generated
	 */
	boolean isBargraph();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#isBargraph <em>Bargraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bargraph</em>' attribute.
	 * @see #isBargraph()
	 * @generated
	 */
	void setBargraph(boolean value);

	/**
	 * Returns the value of the '<em><b>Color Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Off</em>' attribute.
	 * @see #setColorOff(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_ColorOff()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColorOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#getColorOff <em>Color Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Off</em>' attribute.
	 * @see #getColorOff()
	 * @generated
	 */
	void setColorOff(Color value);

	/**
	 * Returns the value of the '<em><b>Color On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color On</em>' attribute.
	 * @see #setColorOn(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_ColorOn()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColorOn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#getColorOn <em>Color On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color On</em>' attribute.
	 * @see #getColorOn()
	 * @generated
	 */
	void setColorOn(Color value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light</em>' attribute.
	 * @see #setLight(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(float value);

	/**
	 * Returns the value of the '<em><b>Label Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Active</em>' attribute.
	 * @see #setLabelActive(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZLed_LabelActive()
	 * @model
	 * @generated
	 */
	boolean isLabelActive();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZLed#isLabelActive <em>Label Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Active</em>' attribute.
	 * @see #isLabelActive()
	 * @generated
	 */
	void setLabelActive(boolean value);

} // JZLed
