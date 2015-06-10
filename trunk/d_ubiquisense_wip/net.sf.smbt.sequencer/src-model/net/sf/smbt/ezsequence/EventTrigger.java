/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.EventTrigger#getEmits <em>Emits</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventTrigger#getAfter <em>After</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventTrigger#getBefore <em>Before</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventTrigger#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTrigger()
 * @model
 * @generated
 */
public interface EventTrigger extends TimedObj, EventElem {
	/**
	 * Returns the value of the '<em><b>Emits</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.EmitInfo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emits</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTrigger_Emits()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmitInfo> getEmits();

	/**
	 * Returns the value of the '<em><b>After</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference.
	 * @see #setAfter(TimedEvent)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTrigger_After()
	 * @model
	 * @generated
	 */
	TimedEvent getAfter();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventTrigger#getAfter <em>After</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(TimedEvent value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' reference.
	 * @see #setBefore(TimedEvent)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTrigger_Before()
	 * @model
	 * @generated
	 */
	TimedEvent getBefore();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventTrigger#getBefore <em>Before</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' reference.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(TimedEvent value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventTrigger_Targets()
	 * @model
	 * @generated
	 */
	EList<EZMojoTarget> getTargets();

} // EventTrigger
