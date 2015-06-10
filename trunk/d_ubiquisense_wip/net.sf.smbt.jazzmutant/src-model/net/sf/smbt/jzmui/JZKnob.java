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
 * A representation of the model object '<em><b>JZ Knob</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#isEndlessKnob <em>Endless Knob</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getUnit <em>Unit</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getPrecision <em>Precision</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getBackgroud <em>Backgroud</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getForeground <em>Foreground</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getAttack <em>Attack</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getSustain <em>Sustain</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getDecay <em>Decay</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getRelease <em>Release</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#isLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#isValueActive <em>Value Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#isGrid <em>Grid</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getCursorMode <em>Cursor Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getControlMode <em>Control Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZKnob#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob()
 * @model
 * @generated
 */
public interface JZKnob extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Endless Knob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endless Knob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endless Knob</em>' attribute.
	 * @see #setEndlessKnob(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_EndlessKnob()
	 * @model
	 * @generated
	 */
	boolean isEndlessKnob();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#isEndlessKnob <em>Endless Knob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endless Knob</em>' attribute.
	 * @see #isEndlessKnob()
	 * @generated
	 */
	void setEndlessKnob(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getValue <em>Value</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getUnit <em>Unit</em>}' attribute.
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
	 * @see #setPrecision(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Precision()
	 * @model
	 * @generated
	 */
	float getPrecision();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(float value);

	/**
	 * Returns the value of the '<em><b>Backgroud</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backgroud</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backgroud</em>' attribute.
	 * @see #setBackgroud(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Backgroud()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getBackgroud();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getBackgroud <em>Backgroud</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backgroud</em>' attribute.
	 * @see #getBackgroud()
	 * @generated
	 */
	void setBackgroud(Color value);

	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground</em>' attribute.
	 * @see #setForeground(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Foreground()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getForeground();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getForeground <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' attribute.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(Color value);

	/**
	 * Returns the value of the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack</em>' attribute.
	 * @see #setAttack(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Attack()
	 * @model
	 * @generated
	 */
	float getAttack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getAttack <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack</em>' attribute.
	 * @see #getAttack()
	 * @generated
	 */
	void setAttack(float value);

	/**
	 * Returns the value of the '<em><b>Sustain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sustain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sustain</em>' attribute.
	 * @see #setSustain(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Sustain()
	 * @model
	 * @generated
	 */
	float getSustain();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getSustain <em>Sustain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sustain</em>' attribute.
	 * @see #getSustain()
	 * @generated
	 */
	void setSustain(float value);

	/**
	 * Returns the value of the '<em><b>Decay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decay</em>' attribute.
	 * @see #setDecay(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Decay()
	 * @model
	 * @generated
	 */
	float getDecay();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getDecay <em>Decay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decay</em>' attribute.
	 * @see #getDecay()
	 * @generated
	 */
	void setDecay(float value);

	/**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #setRelease(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Release()
	 * @model
	 * @generated
	 */
	float getRelease();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(float value);

	/**
	 * Returns the value of the '<em><b>Hold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' attribute.
	 * @see #setHold(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Hold()
	 * @model
	 * @generated
	 */
	float getHold();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #getHold()
	 * @generated
	 */
	void setHold(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Label()
	 * @model
	 * @generated
	 */
	boolean isLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#isLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isLabel()
	 * @generated
	 */
	void setLabel(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_ValueActive()
	 * @model
	 * @generated
	 */
	boolean isValueActive();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#isValueActive <em>Value Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Active</em>' attribute.
	 * @see #isValueActive()
	 * @generated
	 */
	void setValueActive(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Grid()
	 * @model
	 * @generated
	 */
	boolean isGrid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#isGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' attribute.
	 * @see #isGrid()
	 * @generated
	 */
	void setGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Cursor Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.KNOB_CURSOR_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.KNOB_CURSOR_MODE
	 * @see #setCursorMode(KNOB_CURSOR_MODE)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_CursorMode()
	 * @model
	 * @generated
	 */
	KNOB_CURSOR_MODE getCursorMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getCursorMode <em>Cursor Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.KNOB_CURSOR_MODE
	 * @see #getCursorMode()
	 * @generated
	 */
	void setCursorMode(KNOB_CURSOR_MODE value);

	/**
	 * Returns the value of the '<em><b>Control Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.KNOB_CONTROL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.KNOB_CONTROL
	 * @see #setControlMode(KNOB_CONTROL)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_ControlMode()
	 * @model
	 * @generated
	 */
	KNOB_CONTROL getControlMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getControlMode <em>Control Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.KNOB_CONTROL
	 * @see #getControlMode()
	 * @generated
	 */
	void setControlMode(KNOB_CONTROL value);

	/**
	 * Returns the value of the '<em><b>Physics</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.KNOB_PHYSICS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.KNOB_PHYSICS
	 * @see #setPhysics(KNOB_PHYSICS)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Physics()
	 * @model
	 * @generated
	 */
	KNOB_PHYSICS getPhysics();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getPhysics <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.KNOB_PHYSICS
	 * @see #getPhysics()
	 * @generated
	 */
	void setPhysics(KNOB_PHYSICS value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Attraction()
	 * @model
	 * @generated
	 */
	float getAttraction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getAttraction <em>Attraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attraction</em>' attribute.
	 * @see #getAttraction()
	 * @generated
	 */
	void setAttraction(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZKnob_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZKnob#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

} // JZKnob
