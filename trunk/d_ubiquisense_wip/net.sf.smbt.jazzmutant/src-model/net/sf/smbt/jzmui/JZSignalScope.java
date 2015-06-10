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
 * A representation of the model object '<em><b>JZ Signal Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#isModeXY <em>Mode XY</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#isTransparent <em>Transparent</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getTension <em>Tension</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#isLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getXb <em>Xb</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getYb <em>Yb</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getTimebase <em>Timebase</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZSignalScope#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope()
 * @model
 * @generated
 */
public interface JZSignalScope extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Mode XY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode XY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode XY</em>' attribute.
	 * @see #setModeXY(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_ModeXY()
	 * @model
	 * @generated
	 */
	boolean isModeXY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#isModeXY <em>Mode XY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode XY</em>' attribute.
	 * @see #isModeXY()
	 * @generated
	 */
	void setModeXY(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Transparent()
	 * @model
	 * @generated
	 */
	boolean isTransparent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#isTransparent <em>Transparent</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Data()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getData();

	/**
	 * Returns the value of the '<em><b>Friction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friction</em>' attribute.
	 * @see #setFriction(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(float value);

	/**
	 * Returns the value of the '<em><b>Tension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tension</em>' attribute.
	 * @see #setTension(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Tension()
	 * @model
	 * @generated
	 */
	float getTension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getTension <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension</em>' attribute.
	 * @see #getTension()
	 * @generated
	 */
	void setTension(float value);

	/**
	 * Returns the value of the '<em><b>Label Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Visible</em>' attribute.
	 * @see #setLabelVisible(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_LabelVisible()
	 * @model
	 * @generated
	 */
	boolean isLabelVisible();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#isLabelVisible <em>Label Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Visible</em>' attribute.
	 * @see #isLabelVisible()
	 * @generated
	 */
	void setLabelVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Xb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xb</em>' attribute.
	 * @see #setXb(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Xb()
	 * @model
	 * @generated
	 */
	String getXb();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getXb <em>Xb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xb</em>' attribute.
	 * @see #getXb()
	 * @generated
	 */
	void setXb(String value);

	/**
	 * Returns the value of the '<em><b>Yb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yb</em>' attribute.
	 * @see #setYb(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Yb()
	 * @model
	 * @generated
	 */
	String getYb();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getYb <em>Yb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yb</em>' attribute.
	 * @see #getYb()
	 * @generated
	 */
	void setYb(String value);

	/**
	 * Returns the value of the '<em><b>Timebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timebase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timebase</em>' attribute.
	 * @see #setTimebase(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Timebase()
	 * @model
	 * @generated
	 */
	float getTimebase();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getTimebase <em>Timebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timebase</em>' attribute.
	 * @see #getTimebase()
	 * @generated
	 */
	void setTimebase(float value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZSignalScope_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZSignalScope#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

} // JZSignalScope
