/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.FONT_SIZE;
import net.sf.smbt.jzmui.JZSurfaceLCD;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Surface LCD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getOscProps <em>Osc Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getMidiProps <em>Midi Props</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getParentTarget <em>Parent Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getScripts <em>Scripts</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getTargetFeatures <em>Target Features</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getPrimaryOscTarget <em>Primary Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getPrimaryMidiTarget <em>Primary Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#isTransparent <em>Transparent</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getFont <em>Font</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getTop <em>Top</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZSurfaceLCDImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZSurfaceLCDImpl extends MinimalEObjectImpl.Container implements JZSurfaceLCD {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZSurfaceLCDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_SURFACE_LCD;
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
	public boolean isTransparent() {
		return (Boolean)eGet(JzmuiPackage.Literals.JZ_SURFACE_LCD__TRANSPARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransparent(boolean newTransparent) {
		eSet(JzmuiPackage.Literals.JZ_SURFACE_LCD__TRANSPARENT, newTransparent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return (String)eGet(JzmuiPackage.Literals.JZ_SURFACE_LCD__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		eSet(JzmuiPackage.Literals.JZ_SURFACE_LCD__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay() {
		return (String)eGet(JzmuiPackage.Literals.JZ_SURFACE_LCD__DISPLAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(String newDisplay) {
		eSet(JzmuiPackage.Literals.JZ_SURFACE_LCD__DISPLAY, newDisplay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont() {
		return (String)eGet(JzmuiPackage.Literals.JZ_SURFACE_LCD__FONT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(String newFont) {
		eSet(JzmuiPackage.Literals.JZ_SURFACE_LCD__FONT, newFont);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTop() {
		return (String)eGet(JzmuiPackage.Literals.JZ_SURFACE_LCD__TOP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTop(String newTop) {
		eSet(JzmuiPackage.Literals.JZ_SURFACE_LCD__TOP, newTop);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBottom() {
		return (String)eGet(JzmuiPackage.Literals.JZ_SURFACE_LCD__BOTTOM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(String newBottom) {
		eSet(JzmuiPackage.Literals.JZ_SURFACE_LCD__BOTTOM, newBottom);
	}

} //JZSurfaceLCDImpl
