/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.FONT_SIZE;
import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KBDynaProperties;
import net.sf.smbt.jzmui.KNOB_CONTROL;
import net.sf.smbt.jzmui.KNOB_CURSOR_MODE;
import net.sf.smbt.jzmui.KNOB_PHYSICS;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Knob</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getOscProps <em>Osc Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getMidiProps <em>Midi Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getParentTarget <em>Parent Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getTargetFeatures <em>Target Features</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getPrimaryOscTarget <em>Primary Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getPrimaryMidiTarget <em>Primary Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#isEndlessKnob <em>Endless Knob</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getBackgroud <em>Backgroud</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getSustain <em>Sustain</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getDecay <em>Decay</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#isLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#isValueActive <em>Value Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#isGrid <em>Grid</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getCursorMode <em>Cursor Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getControlMode <em>Control Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getPhysics <em>Physics</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZKnobImpl#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZKnobImpl extends MinimalEObjectImpl.Container implements JZKnob {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZKnobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_KNOB;
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
	public boolean isEndlessKnob() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_KNOB__ENDLESS_KNOB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndlessKnob(boolean newEndlessKnob) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__ENDLESS_KNOB, newEndlessKnob);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return (String)eGet(JzmuiPackage.Literals.JZ_KNOB__UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__UNIT, newUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrecision() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(float newPrecision) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroud() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_KNOB__BACKGROUD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroud(Color newBackgroud) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__BACKGROUD, newBackgroud);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getForeground() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_KNOB__FOREGROUND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(Color newForeground) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__FOREGROUND, newForeground);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttack() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__ATTACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttack(float newAttack) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__ATTACK, newAttack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSustain() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__SUSTAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSustain(float newSustain) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__SUSTAIN, newSustain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDecay() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__DECAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecay(float newDecay) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__DECAY, newDecay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRelease() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__RELEASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(float newRelease) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__RELEASE, newRelease);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHold() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__HOLD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHold(float newHold) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__HOLD, newHold);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLabel() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_KNOB__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(boolean newLabel) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValueActive() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_KNOB__VALUE_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueActive(boolean newValueActive) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__VALUE_ACTIVE, newValueActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGrid() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_KNOB__GRID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(boolean newGrid) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__GRID, newGrid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNOB_CURSOR_MODE getCursorMode() {
		return (KNOB_CURSOR_MODE)eGet(JzmuiPackage.Literals.JZ_KNOB__CURSOR_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursorMode(KNOB_CURSOR_MODE newCursorMode) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__CURSOR_MODE, newCursorMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNOB_CONTROL getControlMode() {
		return (KNOB_CONTROL)eGet(JzmuiPackage.Literals.JZ_KNOB__CONTROL_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlMode(KNOB_CONTROL newControlMode) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__CONTROL_MODE, newControlMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNOB_PHYSICS getPhysics() {
		return (KNOB_PHYSICS)eGet(JzmuiPackage.Literals.JZ_KNOB__PHYSICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysics(KNOB_PHYSICS newPhysics) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__PHYSICS, newPhysics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttraction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__ATTRACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttraction(float newAttraction) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__ATTRACTION, newAttraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFriction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__FRICTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(float newFriction) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__FRICTION, newFriction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_KNOB__SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__SPEED, newSpeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_KNOB__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		eSet(JzmuiPackage.Literals.JZ_KNOB__X, newX);
	}

} //JZKnobImpl
