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
 * A representation of the model object '<em><b>JZ Fader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getUnit <em>Unit</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getPrecision <em>Precision</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getDrag <em>Drag</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getTension <em>Tension</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#isValueActive <em>Value Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#isLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#isGridActive <em>Grid Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getGridValue <em>Grid Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getCursorMode <em>Cursor Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZFader#getZ <em>Z</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader()
 * @model
 * @generated
 */
public interface JZFader extends JZWidget {
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getValue <em>Value</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getUnit <em>Unit</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Precision()
	 * @model
	 * @generated
	 */
	int getPrecision();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Drag()
	 * @model
	 * @generated
	 */
	float getDrag();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getDrag <em>Drag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drag</em>' attribute.
	 * @see #getDrag()
	 * @generated
	 */
	void setDrag(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getFriction <em>Friction</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getHeight <em>Height</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getLight <em>Light</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Tension()
	 * @model
	 * @generated
	 */
	float getTension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getTension <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension</em>' attribute.
	 * @see #getTension()
	 * @generated
	 */
	void setTension(float value);

	/**
	 * Returns the value of the '<em><b>Value Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Active</em>' attribute.
	 * @see #setValueActive(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_ValueActive()
	 * @model
	 * @generated
	 */
	boolean isValueActive();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#isValueActive <em>Value Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Active</em>' attribute.
	 * @see #isValueActive()
	 * @generated
	 */
	void setValueActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Label()
	 * @model
	 * @generated
	 */
	boolean isLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#isLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isLabel()
	 * @generated
	 */
	void setLabel(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_GridActive()
	 * @model
	 * @generated
	 */
	boolean isGridActive();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#isGridActive <em>Grid Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Active</em>' attribute.
	 * @see #isGridActive()
	 * @generated
	 */
	void setGridActive(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_GridValue()
	 * @model
	 * @generated
	 */
	int getGridValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getGridValue <em>Grid Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Value</em>' attribute.
	 * @see #getGridValue()
	 * @generated
	 */
	void setGridValue(int value);

	/**
	 * Returns the value of the '<em><b>Attraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attraction</em>' attribute.
	 * @see #setAttraction(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Attraction()
	 * @model
	 * @generated
	 */
	float getAttraction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getAttraction <em>Attraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attraction</em>' attribute.
	 * @see #getAttraction()
	 * @generated
	 */
	void setAttraction(float value);

	/**
	 * Returns the value of the '<em><b>Cursor Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.FADER_CURSOR_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.FADER_CURSOR_MODE
	 * @see #setCursorMode(FADER_CURSOR_MODE)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_CursorMode()
	 * @model
	 * @generated
	 */
	FADER_CURSOR_MODE getCursorMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getCursorMode <em>Cursor Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.FADER_CURSOR_MODE
	 * @see #getCursorMode()
	 * @generated
	 */
	void setCursorMode(FADER_CURSOR_MODE value);

	/**
	 * Returns the value of the '<em><b>Physics</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.FADER_PHYSICS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.FADER_PHYSICS
	 * @see #setPhysics(FADER_PHYSICS)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Physics()
	 * @model
	 * @generated
	 */
	FADER_PHYSICS getPhysics();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getPhysics <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.FADER_PHYSICS
	 * @see #getPhysics()
	 * @generated
	 */
	void setPhysics(FADER_PHYSICS value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Capture()
	 * @model
	 * @generated
	 */
	boolean isCapture();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#isCapture <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capture</em>' attribute.
	 * @see #isCapture()
	 * @generated
	 */
	void setCapture(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZFader_Z()
	 * @model
	 * @generated
	 */
	int getZ();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZFader#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(int value);

} // JZFader
