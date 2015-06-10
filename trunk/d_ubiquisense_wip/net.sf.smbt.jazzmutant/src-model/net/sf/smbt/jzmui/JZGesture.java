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
 * A representation of the model object '<em><b>JZ Gesture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZGesture#isTransparent <em>Transparent</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZGesture#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZGesture#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZGesture#getPan <em>Pan</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZGesture#getPinch <em>Pinch</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZGesture()
 * @model
 * @generated
 */
public interface JZGesture extends JZWidget {
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZGesture_Transparent()
	 * @model
	 * @generated
	 */
	boolean isTransparent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZGesture#isTransparent <em>Transparent</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZGesture_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZGesture#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' attribute.
	 * @see #setAngle(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZGesture_Angle()
	 * @model
	 * @generated
	 */
	float getAngle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZGesture#getAngle <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' attribute.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(float value);

	/**
	 * Returns the value of the '<em><b>Pan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan</em>' attribute.
	 * @see #setPan(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZGesture_Pan()
	 * @model
	 * @generated
	 */
	float getPan();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZGesture#getPan <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan</em>' attribute.
	 * @see #getPan()
	 * @generated
	 */
	void setPan(float value);

	/**
	 * Returns the value of the '<em><b>Pinch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinch</em>' attribute.
	 * @see #setPinch(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZGesture_Pinch()
	 * @model
	 * @generated
	 */
	float getPinch();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZGesture#getPinch <em>Pinch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pinch</em>' attribute.
	 * @see #getPinch()
	 * @generated
	 */
	void setPinch(float value);

} // JZGesture
