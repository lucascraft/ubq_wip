/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.JZConfigurationManager;
import net.sf.smbt.jzmui.JzKBTarget;
import net.sf.smbt.jzmui.JzMidiTarget;
import net.sf.smbt.jzmui.JzOscTarget;
import net.sf.smbt.jzmui.JzmuiPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JZ Configuration Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZConfigurationManagerImpl#getKbTargets <em>Kb Targets</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZConfigurationManagerImpl#getOscTargets <em>Osc Targets</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.impl.JZConfigurationManagerImpl#getMidiTargets <em>Midi Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JZConfigurationManagerImpl extends MinimalEObjectImpl.Container implements JZConfigurationManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JZConfigurationManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmuiPackage.Literals.JZ_CONFIGURATION_MANAGER;
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
	@SuppressWarnings("unchecked")
	public EList<JzKBTarget> getKbTargets() {
		return (EList<JzKBTarget>)eGet(JzmuiPackage.Literals.JZ_CONFIGURATION_MANAGER__KB_TARGETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JzOscTarget> getOscTargets() {
		return (EList<JzOscTarget>)eGet(JzmuiPackage.Literals.JZ_CONFIGURATION_MANAGER__OSC_TARGETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<JzMidiTarget> getMidiTargets() {
		return (EList<JzMidiTarget>)eGet(JzmuiPackage.Literals.JZ_CONFIGURATION_MANAGER__MIDI_TARGETS, true);
	}

} //JZConfigurationManagerImpl
