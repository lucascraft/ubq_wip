/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.PathData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Break Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#isLiveEditing <em>Live Editing</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getPoints <em>Points</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#isCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getBackground <em>Background</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getFirstPoint <em>First Point</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getHoldX <em>Hold X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getHoldY <em>Hold Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getEdit <em>Edit</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getRest <em>Rest</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getValues <em>Values</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getPathData <em>Path Data</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#isGrid <em>Grid</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getGridX <em>Grid X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getGridY <em>Grid Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#isFreeForm <em>Free Form</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZBreakPoint#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint()
 * @model
 * @generated
 */
public interface JZBreakPoint extends JZWidget {
	/**
	 * Returns the value of the '<em><b>Live Editing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Live Editing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Live Editing</em>' attribute.
	 * @see #setLiveEditing(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_LiveEditing()
	 * @model
	 * @generated
	 */
	boolean isLiveEditing();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#isLiveEditing <em>Live Editing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Live Editing</em>' attribute.
	 * @see #isLiveEditing()
	 * @generated
	 */
	void setLiveEditing(boolean value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Coordinates()
	 * @model
	 * @generated
	 */
	boolean isCoordinates();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#isCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #isCoordinates()
	 * @generated
	 */
	void setCoordinates(boolean value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(Color)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Background()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getBackground();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(Color value);

	/**
	 * Returns the value of the '<em><b>First Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Point</em>' attribute.
	 * @see #setFirstPoint(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_FirstPoint()
	 * @model
	 * @generated
	 */
	int getFirstPoint();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getFirstPoint <em>First Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Point</em>' attribute.
	 * @see #getFirstPoint()
	 * @generated
	 */
	void setFirstPoint(int value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Light()
	 * @model
	 * @generated
	 */
	float getLight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see #getLight()
	 * @generated
	 */
	void setLight(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Friction()
	 * @model
	 * @generated
	 */
	float getFriction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getFriction <em>Friction</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Hold()
	 * @model
	 * @generated
	 */
	float getHold();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getHold <em>Hold</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_HoldX()
	 * @model
	 * @generated
	 */
	float getHoldX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getHoldX <em>Hold X</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_HoldY()
	 * @model
	 * @generated
	 */
	float getHoldY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getHoldY <em>Hold Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold Y</em>' attribute.
	 * @see #getHoldY()
	 * @generated
	 */
	void setHoldY(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Attraction()
	 * @model
	 * @generated
	 */
	float getAttraction();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getAttraction <em>Attraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attraction</em>' attribute.
	 * @see #getAttraction()
	 * @generated
	 */
	void setAttraction(float value);

	/**
	 * Returns the value of the '<em><b>Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit</em>' attribute.
	 * @see #setEdit(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Edit()
	 * @model
	 * @generated
	 */
	float getEdit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getEdit <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit</em>' attribute.
	 * @see #getEdit()
	 * @generated
	 */
	void setEdit(float value);

	/**
	 * Returns the value of the '<em><b>Rest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest</em>' attribute.
	 * @see #setRest(float)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Rest()
	 * @model
	 * @generated
	 */
	float getRest();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getRest <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest</em>' attribute.
	 * @see #getRest()
	 * @generated
	 */
	void setRest(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<Float> getValues();

	/**
	 * Returns the value of the '<em><b>Path Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Data</em>' attribute.
	 * @see #setPathData(PathData)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_PathData()
	 * @model dataType="net.sf.smbt.jzmui.PathData"
	 * @generated
	 */
	PathData getPathData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getPathData <em>Path Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Data</em>' attribute.
	 * @see #getPathData()
	 * @generated
	 */
	void setPathData(PathData value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Grid()
	 * @model
	 * @generated
	 */
	boolean isGrid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#isGrid <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' attribute.
	 * @see #isGrid()
	 * @generated
	 */
	void setGrid(boolean value);

	/**
	 * Returns the value of the '<em><b>Grid X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid X</em>' attribute.
	 * @see #setGridX(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_GridX()
	 * @model
	 * @generated
	 */
	int getGridX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getGridX <em>Grid X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid X</em>' attribute.
	 * @see #getGridX()
	 * @generated
	 */
	void setGridX(int value);

	/**
	 * Returns the value of the '<em><b>Grid Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Y</em>' attribute.
	 * @see #setGridY(int)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_GridY()
	 * @model
	 * @generated
	 */
	int getGridY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getGridY <em>Grid Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Y</em>' attribute.
	 * @see #getGridY()
	 * @generated
	 */
	void setGridY(int value);

	/**
	 * Returns the value of the '<em><b>Free Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Form</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Form</em>' attribute.
	 * @see #setFreeForm(boolean)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_FreeForm()
	 * @model
	 * @generated
	 */
	boolean isFreeForm();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#isFreeForm <em>Free Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Form</em>' attribute.
	 * @see #isFreeForm()
	 * @generated
	 */
	void setFreeForm(boolean value);

	/**
	 * Returns the value of the '<em><b>Physics</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.jzmui.BREAK_POINT_PHYSICS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.BREAK_POINT_PHYSICS
	 * @see #setPhysics(BREAK_POINT_PHYSICS)
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Physics()
	 * @model
	 * @generated
	 */
	BREAK_POINT_PHYSICS getPhysics();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getPhysics <em>Physics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physics</em>' attribute.
	 * @see net.sf.smbt.jzmui.BREAK_POINT_PHYSICS
	 * @see #getPhysics()
	 * @generated
	 */
	void setPhysics(BREAK_POINT_PHYSICS value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Color()
	 * @model dataType="net.sf.smbt.jzmui.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getX <em>X</em>}' attribute.
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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZBreakPoint_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jzmui.JZBreakPoint#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

} // JZBreakPoint
