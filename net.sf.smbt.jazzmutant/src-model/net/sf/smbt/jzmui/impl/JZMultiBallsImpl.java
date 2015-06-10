/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.FONT_SIZE;
import net.sf.smbt.jzmui.JZMenuItem;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KBDynaProperties;
import net.sf.smbt.jzmui.LEMUR_MIDI_TARGET;
import net.sf.smbt.jzmui.LEMUR_OSC_TARGET;
import net.sf.smbt.jzmui.LemurPreferences;
import net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE;
import net.sf.smbt.jzmui.MULTIBALLS_PHYSICS;
import net.sf.smbt.jzmui.MidiDynaProperties;
import net.sf.smbt.jzmui.OSCDynaProperties;

import net.sf.smbt.jzmui.Script;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Multi Balls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getOscProps <em>Osc Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getMidiProps <em>Midi Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getParentTarget <em>Parent Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getTargetFeatures <em>Target Features</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getPrimaryOscTarget <em>Primary Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getPrimaryMidiTarget <em>Primary Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isNumbers <em>Numbers</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isMultilabel <em>Multilabel</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isMultiColor <em>Multi Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getZ <em>Z</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getDecay <em>Decay</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getHoldX <em>Hold X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getHoldY <em>Hold Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getSustain <em>Sustain</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getGridStepX <em>Grid Step X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getGridStepY <em>Grid Step Y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getTension <em>Tension</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isNumbersVisible <em>Numbers Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getBalls <em>Balls</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getCursorMode <em>Cursor Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isGridActive <em>Grid Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZMultiBallsImpl#isEphemeral <em>Ephemeral</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZMultiBallsImpl extends MinimalEObjectImpl.Container implements JZMultiBalls {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZMultiBallsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_MULTI_BALLS;
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
	public boolean isNumbers() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbers(boolean newNumbers) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS, newNumbers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultilabel() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTILABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultilabel(boolean newMultilabel) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTILABEL, newMultilabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiColor() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTI_COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiColor(boolean newMultiColor) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__MULTI_COLOR, newMultiColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Point> getData() {
		return (EList<Point>)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNumbersVisible() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS_VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbersVisible(boolean newNumbersVisible) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__NUMBERS_VISIBLE, newNumbersVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBalls() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__BALLS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalls(int newBalls) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__BALLS, newBalls);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLabelVisible() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__LABEL_VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelVisible(boolean newLabelVisible) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__LABEL_VISIBLE, newLabelVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MULTIBALLS_PHYSICS getPhysics() {
		return (MULTIBALLS_PHYSICS)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__PHYSICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysics(MULTIBALLS_PHYSICS newPhysics) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__PHYSICS, newPhysics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MULTIBALLS_CURSOR_MODE getCursorMode() {
		return (MULTIBALLS_CURSOR_MODE)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__CURSOR_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorMode(MULTIBALLS_CURSOR_MODE newCursorMode) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__CURSOR_MODE, newCursorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttraction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTRACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttraction(float newAttraction) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTRACTION, newAttraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCapture() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__CAPTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapture(boolean newCapture) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__CAPTURE, newCapture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGridActive() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridActive(boolean newGridActive) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_ACTIVE, newGridActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEphemeral() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__EPHEMERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEphemeral(boolean newEphemeral) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__EPHEMERAL, newEphemeral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__Z, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(float newZ) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__Z, newZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttack() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttack(float newAttack) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__ATTACK, newAttack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDecay() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__DECAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecay(float newDecay) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__DECAY, newDecay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFriction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__FRICTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(float newFriction) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__FRICTION, newFriction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHold() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHold(float newHold) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD, newHold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoldX() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldX(float newHoldX) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_X, newHoldX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHoldY() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldY(float newHoldY) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HOLD_Y, newHoldY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRelease() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__RELEASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(float newRelease) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__RELEASE, newRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__SPEED, newSpeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSustain() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__SUSTAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSustain(float newSustain) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__SUSTAIN, newSustain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridStepX() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridStepX(int newGridStepX) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_X, newGridStepX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGridStepY() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridStepY(int newGridStepY) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__GRID_STEP_Y, newGridStepY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLight() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__LIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(float newLight) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__LIGHT, newLight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTension() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_MULTI_BALLS__TENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTension(float newTension) {
		eSet(JzmuiPackage.Literals.JZ_MULTI_BALLS__TENSION, newTension);
	}

} //JZMultiBallsImpl
