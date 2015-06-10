/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.ezlemur.LemurMidiCmd;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.LemurTrigger;
import net.sf.smbt.jzmui.MidiDynaProperties;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Midi Dyna Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl#isCustomMidiMsg <em>Custom Midi Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl#getLemurTrigger <em>Lemur Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl#getMidiMsg <em>Midi Msg</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl#getEStructuralFeature <em>EStructural Feature</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiDynaPropertiesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MidiDynaPropertiesImpl extends MinimalEObjectImpl.Container implements MidiDynaProperties {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidiDynaPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES;
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
	public boolean isCustomMidiMsg() {
		return (Boolean)eGet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__CUSTOM_MIDI_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomMidiMsg(boolean newCustomMidiMsg) {
		eSet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__CUSTOM_MIDI_MSG, newCustomMidiMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurTrigger getLemurTrigger() {
		return (LemurTrigger)eGet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__LEMUR_TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLemurTrigger(LemurTrigger newLemurTrigger) {
		eSet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__LEMUR_TRIGGER, newLemurTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurMidiCmd getMidiMsg() {
		return (LemurMidiCmd)eGet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__MIDI_MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiMsg(LemurMidiCmd newMidiMsg) {
		eSet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__MIDI_MSG, newMidiMsg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getEStructuralFeature() {
		return (EStructuralFeature)eGet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEStructuralFeature(EStructuralFeature newEStructuralFeature) {
		eSet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE, newEStructuralFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return (String)eGet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		eSet(JzmuiPackage.Literals.MIDI_DYNA_PROPERTIES__TARGET, newTarget);
	}

} //MidiDynaPropertiesImpl
