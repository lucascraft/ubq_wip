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
 * A representation of the model object '<em><b>JZ Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#isHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#isLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#isGrid <em>Grid</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getGridValue <em>Grid Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#isPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getTension <em>Tension</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getMin_height <em>Min height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getMax_height <em>Max height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getDrag <em>Drag</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZRange#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange()
 * @model
 * @generated
 */
public interface JZRange extends JZWidget {
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Horizontal()
	 * @model
	 * @generated
	 */
	boolean isHorizontal();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#isHorizontal <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal</em>' attribute.
	 * @see #isHorizontal()
	 * @generated
	 */
	void setHorizontal(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_LabelVisible()
	 * @model
	 * @generated
	 */
	boolean isLabelVisible();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#isLabelVisible <em>Label Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Visible</em>' attribute.
	 * @see #isLabelVisible()
	 * @generated
	 */
	void setLabelVisible(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Capture()
	 * @model
	 * @generated
	 */
	boolean isCapture();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#isCapture <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capture</em>' attribute.
	 * @see #isCapture()
	 * @generated
	 */
	void setCapture(boolean value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' attribute.
	 * @see #setGrid(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Grid()
	 * @model
	 * @generated
	 */
	boolean isGrid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#isGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' attribute.
	 * @see #isGrid()
	 * @generated
	 */
	void setGrid(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_GridValue()
	 * @model
	 * @generated
	 */
	int getGridValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getGridValue <em>Grid Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Value</em>' attribute.
	 * @see #getGridValue()
	 * @generated
	 */
	void setGridValue(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Physics()
	 * @model
	 * @generated
	 */
	boolean isPhysics();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#isPhysics <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics</em>' attribute.
	 * @see #isPhysics()
	 * @generated
	 */
	void setPhysics(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Tension()
	 * @model
	 * @generated
	 */
	float getTension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getTension <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension</em>' attribute.
	 * @see #getTension()
	 * @generated
	 */
	void setTension(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(float value);

	/**
	 * Returns the value of the '<em><b>Min height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min height</em>' attribute.
	 * @see #setMin_height(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Min_height()
	 * @model
	 * @generated
	 */
	float getMin_height();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getMin_height <em>Min height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min height</em>' attribute.
	 * @see #getMin_height()
	 * @generated
	 */
	void setMin_height(float value);

	/**
	 * Returns the value of the '<em><b>Max height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max height</em>' attribute.
	 * @see #setMax_height(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Max_height()
	 * @model
	 * @generated
	 */
	float getMax_height();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getMax_height <em>Max height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max height</em>' attribute.
	 * @see #getMax_height()
	 * @generated
	 */
	void setMax_height(float value);

	/**
	 * Returns the value of the '<em><b>Drag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drag</em>' attribute.
	 * @see #setDrag(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Drag()
	 * @model
	 * @generated
	 */
	float getDrag();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getDrag <em>Drag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drag</em>' attribute.
	 * @see #getDrag()
	 * @generated
	 */
	void setDrag(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZRange_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZRange#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

} // JZRange
