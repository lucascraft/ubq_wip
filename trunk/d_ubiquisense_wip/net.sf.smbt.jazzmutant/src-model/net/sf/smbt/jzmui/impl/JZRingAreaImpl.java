/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.FONT_SIZE;
import net.sf.smbt.jzmui.JZRingArea;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Ring Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getOscProps <em>Osc Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getMidiProps <em>Midi Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getParentTarget <em>Parent Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getTargetFeatures <em>Target Features</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getPrimaryOscTarget <em>Primary Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getPrimaryMidiTarget <em>Primary Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getAttraction_x <em>Attraction x</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getAttraction_y <em>Attraction y</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#isValueActive <em>Value Active</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZRingAreaImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZRingAreaImpl extends MinimalEObjectImpl.Container implements JZRingArea {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZRingAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_RING_AREA;
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
	public float getSpeed() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_RING_AREA__SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__SPEED, newSpeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFriction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_RING_AREA__FRICTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(float newFriction) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__FRICTION, newFriction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttraction() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttraction(float newAttraction) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION, newAttraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttraction_x() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttraction_x(float newAttraction_x) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_X, newAttraction_x);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAttraction_y() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttraction_y(float newAttraction_y) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__ATTRACTION_Y, newAttraction_y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_RING_AREA__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValueActive() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_RING_AREA__VALUE_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueActive(boolean newValueActive) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__VALUE_ACTIVE, newValueActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCapture() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_RING_AREA__CAPTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapture(boolean newCapture) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__CAPTURE, newCapture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_RING_AREA__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_RING_AREA__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		eSet(JzmuiPackage.Literals.JZ_RING_AREA__Y, newY);
	}

} //JZRingAreaImpl
