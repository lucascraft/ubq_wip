/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZ Configuration Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jzmui.JZConfigurationManager#getKbTargets <em>Kb Targets</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZConfigurationManager#getOscTargets <em>Osc Targets</em>}</li>
 *   <li>{@link net.sf.smbt.jzmui.JZConfigurationManager#getMidiTargets <em>Midi Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZConfigurationManager()
 * @model
 * @generated
 */
public interface JZConfigurationManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Kb Targets</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jzmui.JzKBTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kb Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kb Targets</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZConfigurationManager_KbTargets()
	 * @model containment="true"
	 * @generated
	 */
	EList<JzKBTarget> getKbTargets();

	/**
	 * Returns the value of the '<em><b>Osc Targets</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jzmui.JzOscTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc Targets</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZConfigurationManager_OscTargets()
	 * @model containment="true"
	 * @generated
	 */
	EList<JzOscTarget> getOscTargets();

	/**
	 * Returns the value of the '<em><b>Midi Targets</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jzmui.JzMidiTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Targets</em>' containment reference list.
	 * @see net.sf.smbt.jzmui.JzmuiPackage#getJZConfigurationManager_MidiTargets()
	 * @model containment="true"
	 * @generated
	 */
	EList<JzMidiTarget> getMidiTargets();

} // JZConfigurationManager
