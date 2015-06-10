/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.Color;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Multi Balls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isNumbers <em>Numbers</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isMultilabel <em>Multilabel</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isMultiColor <em>Multi Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getZ <em>Z</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getAttack <em>Attack</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getDecay <em>Decay</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getHoldX <em>Hold X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getHoldY <em>Hold Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getRelease <em>Release</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getSustain <em>Sustain</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getGridStepX <em>Grid Step X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getGridStepY <em>Grid Step Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getTension <em>Tension</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isNumbersVisible <em>Numbers Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getBalls <em>Balls</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getCursorMode <em>Cursor Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isGridActive <em>Grid Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZMultiBalls#isEphemeral <em>Ephemeral</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls()
 * @model
 * @generated
 */
public interface JZMultiBalls extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Numbers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbers</em>' attribute.
	 * @see #setNumbers(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Numbers()
	 * @model
	 * @generated
	 */
	boolean isNumbers();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isNumbers <em>Numbers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbers</em>' attribute.
	 * @see #isNumbers()
	 * @generated
	 */
	void setNumbers(boolean value);

	/**
	 * Returns the value of the '<em><b>Multilabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multilabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multilabel</em>' attribute.
	 * @see #setMultilabel(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Multilabel()
	 * @model
	 * @generated
	 */
	boolean isMultilabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isMultilabel <em>Multilabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multilabel</em>' attribute.
	 * @see #isMultilabel()
	 * @generated
	 */
	void setMultilabel(boolean value);

	/**
	 * Returns the value of the '<em><b>Multi Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Color</em>' attribute.
	 * @see #setMultiColor(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_MultiColor()
	 * @model
	 * @generated
	 */
	boolean isMultiColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isMultiColor <em>Multi Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Color</em>' attribute.
	 * @see #isMultiColor()
	 * @generated
	 */
	void setMultiColor(boolean value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Data()
	 * @model dataType="net.sf.smbt.jzmui.Point"
	 * @generated
	 */
	EList<Point> getData();

	/**
	 * Returns the value of the '<em><b>Numbers Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numbers Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numbers Visible</em>' attribute.
	 * @see #setNumbersVisible(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_NumbersVisible()
	 * @model
	 * @generated
	 */
	boolean isNumbersVisible();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isNumbersVisible <em>Numbers Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numbers Visible</em>' attribute.
	 * @see #isNumbersVisible()
	 * @generated
	 */
	void setNumbersVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Balls</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balls</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balls</em>' attribute.
	 * @see #setBalls(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Balls()
	 * @model
	 * @generated
	 */
	int getBalls();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getBalls <em>Balls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balls</em>' attribute.
	 * @see #getBalls()
	 * @generated
	 */
	void setBalls(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_LabelVisible()
	 * @model
	 * @generated
	 */
	boolean isLabelVisible();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isLabelVisible <em>Label Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Visible</em>' attribute.
	 * @see #isLabelVisible()
	 * @generated
	 */
	void setLabelVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Physics</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.MULTIBALLS_PHYSICS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.MULTIBALLS_PHYSICS
	 * @see #setPhysics(MULTIBALLS_PHYSICS)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Physics()
	 * @model
	 * @generated
	 */
	MULTIBALLS_PHYSICS getPhysics();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getPhysics <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.MULTIBALLS_PHYSICS
	 * @see #getPhysics()
	 * @generated
	 */
	void setPhysics(MULTIBALLS_PHYSICS value);

	/**
	 * Returns the value of the '<em><b>Cursor Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cursor Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cursor Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE
	 * @see #setCursorMode(MULTIBALLS_CURSOR_MODE)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_CursorMode()
	 * @model
	 * @generated
	 */
	MULTIBALLS_CURSOR_MODE getCursorMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getCursorMode <em>Cursor Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cursor Mode</em>' attribute.
	 * @see net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE
	 * @see #getCursorMode()
	 * @generated
	 */
	void setCursorMode(MULTIBALLS_CURSOR_MODE value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Attraction()
	 * @model
	 * @generated
	 */
	float getAttraction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getAttraction <em>Attraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attraction</em>' attribute.
	 * @see #getAttraction()
	 * @generated
	 */
	void setAttraction(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Capture()
	 * @model
	 * @generated
	 */
	boolean isCapture();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isCapture <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capture</em>' attribute.
	 * @see #isCapture()
	 * @generated
	 */
	void setCapture(boolean value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_GridActive()
	 * @model
	 * @generated
	 */
	boolean isGridActive();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isGridActive <em>Grid Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Active</em>' attribute.
	 * @see #isGridActive()
	 * @generated
	 */
	void setGridActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Ephemeral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ephemeral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ephemeral</em>' attribute.
	 * @see #setEphemeral(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Ephemeral()
	 * @model
	 * @generated
	 */
	boolean isEphemeral();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#isEphemeral <em>Ephemeral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ephemeral</em>' attribute.
	 * @see #isEphemeral()
	 * @generated
	 */
	void setEphemeral(boolean value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_X()
	 * @model
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Y()
	 * @model
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Z()
	 * @model
	 * @generated
	 */
	float getZ();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
	void setZ(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Attack()
	 * @model
	 * @generated
	 */
	float getAttack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getAttack <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack</em>' attribute.
	 * @see #getAttack()
	 * @generated
	 */
	void setAttack(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Decay()
	 * @model
	 * @generated
	 */
	float getDecay();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getDecay <em>Decay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decay</em>' attribute.
	 * @see #getDecay()
	 * @generated
	 */
	void setDecay(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getFriction <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friction</em>' attribute.
	 * @see #getFriction()
	 * @generated
	 */
	void setFriction(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Hold()
	 * @model
	 * @generated
	 */
	float getHold();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getHold <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' attribute.
	 * @see #getHold()
	 * @generated
	 */
	void setHold(float value);

	/**
	 * Returns the value of the '<em><b>Hold X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold X</em>' attribute.
	 * @see #setHoldX(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_HoldX()
	 * @model
	 * @generated
	 */
	float getHoldX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getHoldX <em>Hold X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold X</em>' attribute.
	 * @see #getHoldX()
	 * @generated
	 */
	void setHoldX(float value);

	/**
	 * Returns the value of the '<em><b>Hold Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hold Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold Y</em>' attribute.
	 * @see #setHoldY(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_HoldY()
	 * @model
	 * @generated
	 */
	float getHoldY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getHoldY <em>Hold Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Y</em>' attribute.
	 * @see #getHoldY()
	 * @generated
	 */
	void setHoldY(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Release()
	 * @model
	 * @generated
	 */
	float getRelease();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Sustain()
	 * @model
	 * @generated
	 */
	float getSustain();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getSustain <em>Sustain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sustain</em>' attribute.
	 * @see #getSustain()
	 * @generated
	 */
	void setSustain(float value);

	/**
	 * Returns the value of the '<em><b>Grid Step X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Step X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Step X</em>' attribute.
	 * @see #setGridStepX(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_GridStepX()
	 * @model
	 * @generated
	 */
	int getGridStepX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getGridStepX <em>Grid Step X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Step X</em>' attribute.
	 * @see #getGridStepX()
	 * @generated
	 */
	void setGridStepX(int value);

	/**
	 * Returns the value of the '<em><b>Grid Step Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Step Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Step Y</em>' attribute.
	 * @see #setGridStepY(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_GridStepY()
	 * @model
	 * @generated
	 */
	int getGridStepY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getGridStepY <em>Grid Step Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Step Y</em>' attribute.
	 * @see #getGridStepY()
	 * @generated
	 */
	void setGridStepY(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getHeight <em>Height</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getLight <em>Light</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZMultiBalls_Tension()
	 * @model
	 * @generated
	 */
	float getTension();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZMultiBalls#getTension <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tension</em>' attribute.
	 * @see #getTension()
	 * @generated
	 */
	void setTension(float value);

} // JZMultiBalls
