/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touch Osc Tab Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getFadersH <em>Faders H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getXyPads <em>Xy Pads</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getFadersV <em>Faders V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLabelsH <em>Labels H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getPushes <em>Pushes</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLabelsV <em>Labels V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiToggles <em>Multi Toggles</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLeds <em>Leds</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getRotariesV <em>Rotaries V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getRotariesH <em>Rotaries H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getToggles <em>Toggles</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getEncoders <em>Encoders</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getBatteriesH <em>Batteries H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getBatteriesV <em>Batteries V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getTimesV <em>Times V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getTimesH <em>Times H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiPushes <em>Multi Pushes</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiFadersH <em>Multi Faders H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getMultiFadersV <em>Multi Faders V</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage()
 * @model
 * @generated
 */
public interface TouchOscTabPage extends EObject {
	/**
	 * Returns the value of the '<em><b>Faders H</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faders H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faders H</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_FadersH()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscFaderH> getFadersH();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Xy Pads</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xy Pads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xy Pads</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_XyPads()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscXYPad> getXyPads();

	/**
	 * Returns the value of the '<em><b>Faders V</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faders V</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faders V</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_FadersV()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscFaderV> getFadersV();

	/**
	 * Returns the value of the '<em><b>Labels H</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels H</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_LabelsH()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscLabelH> getLabelsH();

	/**
	 * Returns the value of the '<em><b>Pushes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pushes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pushes</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_Pushes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscPush> getPushes();

	/**
	 * Returns the value of the '<em><b>Labels V</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels V</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels V</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_LabelsV()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscLabelV> getLabelsV();

	/**
	 * Returns the value of the '<em><b>Multi Toggles</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Toggles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Toggles</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_MultiToggles()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscMultiToggle> getMultiToggles();

	/**
	 * Returns the value of the '<em><b>Leds</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Leds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leds</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_Leds()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscLED> getLeds();

	/**
	 * Returns the value of the '<em><b>Rotaries V</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotaries V</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotaries V</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_RotariesV()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscRotaryV> getRotariesV();

	/**
	 * Returns the value of the '<em><b>Rotaries H</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotaries H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotaries H</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_RotariesH()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscRotaryH> getRotariesH();

	/**
	 * Returns the value of the '<em><b>Toggles</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toggles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggles</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_Toggles()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscToggle> getToggles();

	/**
	 * Returns the value of the '<em><b>Encoders</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoders</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_Encoders()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscEncoder> getEncoders();

	/**
	 * Returns the value of the '<em><b>Batteries H</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batteries H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batteries H</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_BatteriesH()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscBatteryH> getBatteriesH();

	/**
	 * Returns the value of the '<em><b>Batteries V</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Batteries V</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batteries V</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_BatteriesV()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscBatteryV> getBatteriesV();

	/**
	 * Returns the value of the '<em><b>Times V</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times V</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times V</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_TimesV()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscTimeV> getTimesV();

	/**
	 * Returns the value of the '<em><b>Times H</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times H</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times H</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_TimesH()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscTimeH> getTimesH();

	/**
	 * Returns the value of the '<em><b>Multi Pushes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Pushes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Pushes</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_MultiPushes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscMultiPush> getMultiPushes();

	/**
	 * Returns the value of the '<em><b>Multi Faders H</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Faders H</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Faders H</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_MultiFadersH()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscMultiFaderH> getMultiFadersH();

	/**
	 * Returns the value of the '<em><b>Multi Faders V</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Faders V</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Faders V</em>' containment reference list.
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_MultiFadersV()
	 * @model containment="true"
	 * @generated
	 */
	EList<TouchOscMultiFaderV> getMultiFadersV();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' reference.
	 * @see #setLayout(TouchOscLayout)
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#getTouchOscTabPage_Layout()
	 * @model
	 * @generated
	 */
	TouchOscLayout getLayout();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage#getLayout <em>Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(TouchOscLayout value);

} // TouchOscTabPage
