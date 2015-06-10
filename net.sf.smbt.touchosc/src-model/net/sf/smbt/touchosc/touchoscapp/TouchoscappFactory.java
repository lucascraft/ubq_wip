/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage
 * @generated
 */
public interface TouchoscappFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouchoscappFactory eINSTANCE = net.sf.smbt.touchosc.touchoscapp.impl.TouchoscappFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Touch Osc App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Touch Osc App</em>'.
	 * @generated
	 */
	TouchOscApp createTouchOscApp();

	/**
	 * Returns a new object of class '<em>Fader V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fader V</em>'.
	 * @generated
	 */
	FaderV createFaderV();

	/**
	 * Returns a new object of class '<em>Fader H</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fader H</em>'.
	 * @generated
	 */
	FaderH createFaderH();

	/**
	 * Returns a new object of class '<em>XY Pad</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XY Pad</em>'.
	 * @generated
	 */
	XYPad createXYPad();

	/**
	 * Returns a new object of class '<em>Rotary H</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotary H</em>'.
	 * @generated
	 */
	RotaryH createRotaryH();

	/**
	 * Returns a new object of class '<em>Rotary V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotary V</em>'.
	 * @generated
	 */
	RotaryV createRotaryV();

	/**
	 * Returns a new object of class '<em>Label H</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label H</em>'.
	 * @generated
	 */
	LabelH createLabelH();

	/**
	 * Returns a new object of class '<em>Label V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label V</em>'.
	 * @generated
	 */
	LabelV createLabelV();

	/**
	 * Returns a new object of class '<em>Multi Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Toggle</em>'.
	 * @generated
	 */
	MultiToggle createMultiToggle();

	/**
	 * Returns a new object of class '<em>Multi Fader H</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Fader H</em>'.
	 * @generated
	 */
	MultiFaderH createMultiFaderH();

	/**
	 * Returns a new object of class '<em>Multi Fader V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Fader V</em>'.
	 * @generated
	 */
	MultiFaderV createMultiFaderV();

	/**
	 * Returns a new object of class '<em>LED</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LED</em>'.
	 * @generated
	 */
	LED createLED();

	/**
	 * Returns a new object of class '<em>Tab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tab</em>'.
	 * @generated
	 */
	Tab createTab();

	/**
	 * Returns a new object of class '<em>Push</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push</em>'.
	 * @generated
	 */
	Push createPush();

	/**
	 * Returns a new object of class '<em>Time H</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time H</em>'.
	 * @generated
	 */
	TimeH createTimeH();

	/**
	 * Returns a new object of class '<em>Time V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time V</em>'.
	 * @generated
	 */
	TimeV createTimeV();

	/**
	 * Returns a new object of class '<em>Battery H</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery H</em>'.
	 * @generated
	 */
	BatteryH createBatteryH();

	/**
	 * Returns a new object of class '<em>Battery V</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Battery V</em>'.
	 * @generated
	 */
	BatteryV createBatteryV();

	/**
	 * Returns a new object of class '<em>Encoder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encoder</em>'.
	 * @generated
	 */
	Encoder createEncoder();

	/**
	 * Returns a new object of class '<em>Multi Push</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Push</em>'.
	 * @generated
	 */
	MultiPush createMultiPush();

	/**
	 * Returns a new object of class '<em>Toggle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Toggle</em>'.
	 * @generated
	 */
	Toggle createToggle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TouchoscappPackage getTouchoscappPackage();

} //TouchoscappFactory
