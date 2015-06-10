/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.MidiVar;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Midi Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiVarImpl#getScaleFrom <em>Scale From</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiVarImpl#getScaleTo <em>Scale To</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiVarImpl#getChannelFrom <em>Channel From</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.MidiVarImpl#getChannelTo <em>Channel To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MidiVarImpl extends MinimalEObjectImpl.Container implements MidiVar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidiVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.MIDI_VAR;
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
	public int getScaleFrom() {
		return (Integer)eGet(JzmuiPackage.Literals.MIDI_VAR__SCALE_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleFrom(int newScaleFrom) {
		eSet(JzmuiPackage.Literals.MIDI_VAR__SCALE_FROM, newScaleFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScaleTo() {
		return (Integer)eGet(JzmuiPackage.Literals.MIDI_VAR__SCALE_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleTo(int newScaleTo) {
		eSet(JzmuiPackage.Literals.MIDI_VAR__SCALE_TO, newScaleTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannelFrom() {
		return (Integer)eGet(JzmuiPackage.Literals.MIDI_VAR__CHANNEL_FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelFrom(int newChannelFrom) {
		eSet(JzmuiPackage.Literals.MIDI_VAR__CHANNEL_FROM, newChannelFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannelTo() {
		return (Integer)eGet(JzmuiPackage.Literals.MIDI_VAR__CHANNEL_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannelTo(int newChannelTo) {
		eSet(JzmuiPackage.Literals.MIDI_VAR__CHANNEL_TO, newChannelTo);
	}

} //MidiVarImpl
