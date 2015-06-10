/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.BREAK_POINT_PHYSICS;
import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.FONT_SIZE;
import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KBDynaProperties;
import net.sf.smbt.jzmui.LEMUR_MIDI_TARGET;
import net.sf.smbt.jzmui.LEMUR_OSC_TARGET;
import net.sf.smbt.jzmui.LemurPreferences;
import net.sf.smbt.jzmui.MidiDynaProperties;
import net.sf.smbt.jzmui.OSCDynaProperties;

import net.sf.smbt.jzmui.Script;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.PathData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Break Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getOscProps <em>Osc Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getMidiProps <em>Midi Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getParentTarget <em>Parent Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getTargetFeatures <em>Target Features</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getPrimaryOscTarget <em>Primary Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getPrimaryMidiTarget <em>Primary Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#isLiveEditing <em>Live Editing</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#isCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getFirstPoint <em>First Point</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getHoldX <em>Hold X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getHoldY <em>Hold Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getEdit <em>Edit</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getValues <em>Values</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getPathData <em>Path Data</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#isGrid <em>Grid</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getGridX <em>Grid X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getGridY <em>Grid Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#isFreeForm <em>Free Form</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZBreakPointImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZBreakPointImpl extends MinimalEObjectImpl.Container implements JZBreakPoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZBreakPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_BREAK_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontStyle() {
		return (Integer)eGet(JzmuiPackage.Literals.JZUI_ELEM__FONT_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontStyle(int newFontStyle) {
		eSet(JzmuiPackage.Literals.JZUI_ELEM__FONT_STYLE, newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getBounds() {
		return (Rectangle)eGet(JzmuiPackage.Literals.JZUI_ELEM__BOUNDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Rectangle newBounds) {
		eSet(JzmuiPackage.Literals.JZUI_ELEM__BOUNDS, newBounds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return (String)eGet(JzmuiPackage.Literals.JZUI_ELEM__FONT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		eSet(JzmuiPackage.Literals.JZUI_ELEM__FONT_NAME, newFontName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(JzmuiPackage.Literals.JZUI_ELEM__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(JzmuiPackage.Literals.JZUI_ELEM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JzOscVar> getOscProps() {
		return (EList<JzOscVar>)eGet(JzmuiPackage.Literals.JZUI_ELEM__OSC_PROPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JzMidiVar> getMidiProps() {
		return (EList<JzMidiVar>)eGet(JzmuiPackage.Literals.JZUI_ELEM__MIDI_PROPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurPreferences getParentTarget() {
		return (LemurPreferences)eGet(JzmuiPackage.Literals.JZUI_ELEM__PARENT_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentTarget(LemurPreferences newParentTarget) {
		eSet(JzmuiPackage.Literals.JZUI_ELEM__PARENT_TARGET, newParentTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Script> getScripts() {
		return (EList<Script>)eGet(JzmuiPackage.Literals.JZUI_ELEM__SCRIPTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EStructuralFeature> getTargetFeatures() {
		return (EList<EStructuralFeature>)eGet(JzmuiPackage.Literals.JZUI_ELEM__TARGET_FEATURES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEMUR_OSC_TARGET getPrimaryOscTarget() {
		return (LEMUR_OSC_TARGET)eGet(JzmuiPackage.Literals.JZ_WIDGET__PRIMARY_OSC_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryOscTarget(LEMUR_OSC_TARGET newPrimaryOscTarget) {
		eSet(JzmuiPackage.Literals.JZ_WIDGET__PRIMARY_OSC_TARGET, newPrimaryOscTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEMUR_MIDI_TARGET getPrimaryMidiTarget() {
		return (LEMUR_MIDI_TARGET)eGet(JzmuiPackage.Literals.JZ_WIDGET__PRIMARY_MIDI_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryMidiTarget(LEMUR_MIDI_TARGET newPrimaryMidiTarget) {
		eSet(JzmuiPackage.Literals.JZ_WIDGET__PRIMARY_MIDI_TARGET, newPrimaryMidiTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLiveEditing() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__LIVE_EDITING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiveEditing(boolean newLiveEditing) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__LIVE_EDITING, newLiveEditing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoints() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__POINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__POINTS, newPoints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCoordinates() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__COORDINATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(boolean newCoordinates) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__COORDINATES, newCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackground() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__BACKGROUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(Color newBackground) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__BACKGROUND, newBackground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstPoint() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__FIRST_POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstPoint(int newFirstPoint) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__FIRST_POINT, newFirstPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLight() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__LIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(float newLight) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__LIGHT, newLight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFriction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__FRICTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(float newFriction) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__FRICTION, newFriction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHold() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHold(float newHold) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD, newHold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoldX() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldX(float newHoldX) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_X, newHoldX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoldY() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldY(float newHoldY) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__HOLD_Y, newHoldY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttraction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__ATTRACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttraction(float newAttraction) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__ATTRACTION, newAttraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getEdit() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__EDIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdit(float newEdit) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__EDIT, newEdit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRest() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__REST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(float newRest) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__REST, newRest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__SPEED, newSpeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Float> getValues() {
		return (EList<Float>)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__VALUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathData getPathData() {
		return (PathData)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__PATH_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathData(PathData newPathData) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__PATH_DATA, newPathData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrid() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__GRID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(boolean newGrid) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__GRID, newGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridX() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__GRID_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridX(int newGridX) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__GRID_X, newGridX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridY() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__GRID_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridY(int newGridY) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__GRID_Y, newGridY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFreeForm() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__FREE_FORM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeForm(boolean newFreeForm) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__FREE_FORM, newFreeForm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BREAK_POINT_PHYSICS getPhysics() {
		return (BREAK_POINT_PHYSICS)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__PHYSICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysics(BREAK_POINT_PHYSICS newPhysics) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__PHYSICS, newPhysics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_BREAK_POINT__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		eSet(JzmuiPackage.Literals.JZ_BREAK_POINT__Y, newY);
	}

} //JZBreakPointImpl
