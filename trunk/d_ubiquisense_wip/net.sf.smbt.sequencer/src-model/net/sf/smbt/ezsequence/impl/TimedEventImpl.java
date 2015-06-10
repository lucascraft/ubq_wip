/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Script;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedEventImpl#getScript <em>Script</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedEventImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedEventImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedEventImpl extends TimedObjImpl implements TimedEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIMED_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScript() {
		return (Script)eGet(EzsequencePackage.Literals.TIMED_EVENT__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Script newScript) {
		eSet(EzsequencePackage.Literals.TIMED_EVENT__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTrigger getTrigger() {
		return (EventTrigger)eGet(EzsequencePackage.Literals.TIMED_EVENT__TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(EventTrigger newTrigger) {
		eSet(EzsequencePackage.Literals.TIMED_EVENT__TRIGGER, newTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Cmd> getCommand() {
		return (EList<Cmd>)eGet(EzsequencePackage.Literals.TIMED_EVENT__COMMAND, true);
	}

} //TimedEventImpl
