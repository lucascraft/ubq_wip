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
 * A representation of the model object '<em><b>JZmulti Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#isBipolar <em>Bipolar</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getSlider <em>Slider</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getGradient <em>Gradient</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#isMulticolor <em>Multicolor</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getValues <em>Values</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getTension <em>Tension</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#isLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#isPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#isGridActive <em>Grid Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getGridValue <em>Grid Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZmultiSlider#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider()
 * @model
 * @generated
 */
public interface JZmultiSlider extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal</em>' attribute.
	 * @see #setHorizontal(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Horizontal()
	 * @model
	 * @generated
	 */
	boolean isHorizontal();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#isHorizontal <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal</em>' attribute.
	 * @see #isHorizontal()
	 * @generated
	 */
	void setHorizontal(boolean value);

	/**
	 * Returns the value of the '<em><b>Bipolar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bipolar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bipolar</em>' attribute.
	 * @see #setBipolar(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Bipolar()
	 * @model
	 * @generated
	 */
	boolean isBipolar();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#isBipolar <em>Bipolar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bipolar</em>' attribute.
	 * @see #isBipolar()
	 * @generated
	 */
	void setBipolar(boolean value);

	/**
	 * Returns the value of the '<em><b>Slider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slider</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slider</em>' attribute.
	 * @see #setSlider(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Slider()
	 * @model
	 * @generated
	 */
	int getSlider();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getSlider <em>Slider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slider</em>' attribute.
	 * @see #getSlider()
	 * @generated
	 */
	void setSlider(int value);

	/**
	 * Returns the value of the '<em><b>Gradient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient</em>' attribute.
	 * @see #setGradient(String)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Gradient()
	 * @model
	 * @generated
	 */
	String getGradient();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getGradient <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient</em>' attribute.
	 * @see #getGradient()
	 * @generated
	 */
	void setGradient(String value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Multicolor()
	 * @model
	 * @generated
	 */
	boolean isMulticolor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#isMulticolor <em>Multicolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicolor</em>' attribute.
	 * @see #isMulticolor()
	 * @generated
	 */
	void setMulticolor(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(float value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getValues();

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Tension()
	 * @model
	 * @generated
	 */
	float getTension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getTension <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension</em>' attribute.
	 * @see #getTension()
	 * @generated
	 */
	void setTension(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_LabelVisible()
	 * @model
	 * @generated
	 */
	boolean isLabelVisible();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#isLabelVisible <em>Label Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Visible</em>' attribute.
	 * @see #isLabelVisible()
	 * @generated
	 */
	void setLabelVisible(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Physics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics</em>' attribute.
	 * @see #setPhysics(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Physics()
	 * @model
	 * @generated
	 */
	boolean isPhysics();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#isPhysics <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics</em>' attribute.
	 * @see #isPhysics()
	 * @generated
	 */
	void setPhysics(boolean value);

	/**
	 * Returns the value of the '<em><b>Grid Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Active</em>' attribute.
	 * @see #setGridActive(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_GridActive()
	 * @model
	 * @generated
	 */
	boolean isGridActive();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#isGridActive <em>Grid Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Active</em>' attribute.
	 * @see #isGridActive()
	 * @generated
	 */
	void setGridActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Capture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capture</em>' attribute.
	 * @see #setCapture(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_Capture()
	 * @model
	 * @generated
	 */
	boolean isCapture();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#isCapture <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capture</em>' attribute.
	 * @see #isCapture()
	 * @generated
	 */
	void setCapture(boolean value);

	/**
	 * Returns the value of the '<em><b>Grid Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Value</em>' attribute.
	 * @see #setGridValue(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_GridValue()
	 * @model
	 * @generated
	 */
	int getGridValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getGridValue <em>Grid Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Value</em>' attribute.
	 * @see #getGridValue()
	 * @generated
	 */
	void setGridValue(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZmultiSlider_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZmultiSlider#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

} // JZmultiSlider
