/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timed Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.TimedEvent#getScript <em>Script</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimedEvent#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimedEvent#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimedEvent()
 * @model
 * @generated
 */
public interface TimedEvent extends TimedObj {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' containment reference.
	 * @see #setScript(Script)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimedEvent_Script()
	 * @model containment="true"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimedEvent#getScript <em>Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' containment reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(EventTrigger)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimedEvent_Trigger()
	 * @model
	 * @generated
	 */
	EventTrigger getTrigger();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimedEvent#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(EventTrigger value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.cmd.Cmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimedEvent_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cmd> getCommand();

} // TimedEvent
