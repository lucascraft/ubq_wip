/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.FONT_SIZE;
import net.sf.smbt.jzmui.JZSwitches;
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
 * An implementation of the model object '<em><b>JZ Switches</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getOscProps <em>Osc Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getMidiProps <em>Midi Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getParentTarget <em>Parent Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getTargetFeatures <em>Target Features</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getPrimaryOscTarget <em>Primary Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getPrimaryMidiTarget <em>Primary Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getNumbers <em>Numbers</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#isRadio <em>Radio</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#isMultilabel <em>Multilabel</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#isMulticolor <em>Multicolor</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getColorOn <em>Color On</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getColorOff <em>Color Off</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#isLabelVisible <em>Label Visible</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#isCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#isPaint <em>Paint</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSwitchesImpl#getX <em>X</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZSwitchesImpl extends MinimalEObjectImpl.Container implements JZSwitches {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZSwitchesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_SWITCHES;
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
	public int getNumbers() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_SWITCHES__NUMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumbers(int newNumbers) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__NUMBERS, newNumbers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRadio() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_SWITCHES__RADIO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadio(boolean newRadio) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__RADIO, newRadio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_SWITCHES__COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__COLUMNS, newColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_SWITCHES__ROWS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(int newRows) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__ROWS, newRows);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultilabel() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_SWITCHES__MULTILABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultilabel(boolean newMultilabel) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__MULTILABEL, newMultilabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulticolor() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_SWITCHES__MULTICOLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticolor(boolean newMulticolor) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__MULTICOLOR, newMulticolor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColorOn() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorOn(Color newColorOn) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_ON, newColorOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColorOff() {
		return (Color)eGet(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_OFF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorOff(Color newColorOff) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_OFF, newColorOff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLight() {
		return (Float)eGet(JzmuiPackage.Literals.JZ_SWITCHES__LIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(float newLight) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__LIGHT, newLight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLabelVisible() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_SWITCHES__LABEL_VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelVisible(boolean newLabelVisible) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__LABEL_VISIBLE, newLabelVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCapture() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_SWITCHES__CAPTURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapture(boolean newCapture) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__CAPTURE, newCapture);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaint() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_SWITCHES__PAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaint(boolean newPaint) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__PAINT, newPaint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return (Integer)eGet(JzmuiPackage.Literals.JZ_SWITCHES__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		eSet(JzmuiPackage.Literals.JZ_SWITCHES__X, newX);
	}

} //JZSwitchesImpl
