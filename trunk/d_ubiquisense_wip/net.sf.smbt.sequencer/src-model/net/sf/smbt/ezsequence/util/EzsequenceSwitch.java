/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.util;

import net.sf.smbt.ezsequence.*;
import net.sf.smbt.ezsequence.AbstractPort;
import net.sf.smbt.ezsequence.Circle;
import net.sf.smbt.ezsequence.CueNode;
import net.sf.smbt.ezsequence.EventListener;
import net.sf.smbt.ezsequence.EventTarget;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.NodeDoubleParam;
import net.sf.smbt.ezsequence.NodeFloatParam;
import net.sf.smbt.ezsequence.NodeIntegerParam;
import net.sf.smbt.ezsequence.NodeParam;
import net.sf.smbt.ezsequence.PortIn;
import net.sf.smbt.ezsequence.PortOut;
import net.sf.smbt.ezsequence.Script;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.Square;
import net.sf.smbt.ezsequence.Star;
import net.sf.smbt.ezsequence.TimeBar;
import net.sf.smbt.ezsequence.TimeBox;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.TimeNode;
import net.sf.smbt.ezsequence.TimeSlot;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.TimedLine;
import net.sf.smbt.ezsequence.TimedLink;
import net.sf.smbt.ezsequence.TimedObj;
import net.sf.smbt.ezsequence.Track;
import net.sf.smbt.ezsequence.UIElem;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezsequence.EzsequencePackage
 * @generated
 */
public class EzsequenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzsequencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsequenceSwitch() {
		if (modelPackage == null) {
			modelPackage = EzsequencePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzsequencePackage.SEQUENCER: {
				Sequencer sequencer = (Sequencer)theEObject;
				T result = caseSequencer(sequencer);
				if (result == null) result = caseTimedObj(sequencer);
				if (result == null) result = caseUIElem(sequencer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIME_BOX: {
				TimeBox timeBox = (TimeBox)theEObject;
				T result = caseTimeBox(timeBox);
				if (result == null) result = caseTimedObj(timeBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIMED_EVENT: {
				TimedEvent timedEvent = (TimedEvent)theEObject;
				T result = caseTimedEvent(timedEvent);
				if (result == null) result = caseTimedObj(timedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIME_CURSOR: {
				TimeCursor timeCursor = (TimeCursor)theEObject;
				T result = caseTimeCursor(timeCursor);
				if (result == null) result = caseTimedObj(timeCursor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIME_BAR: {
				TimeBar timeBar = (TimeBar)theEObject;
				T result = caseTimeBar(timeBar);
				if (result == null) result = caseUIElem(timeBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.ABSTRACT_PORT: {
				AbstractPort abstractPort = (AbstractPort)theEObject;
				T result = caseAbstractPort(abstractPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.PORT_IN: {
				PortIn portIn = (PortIn)theEObject;
				T result = casePortIn(portIn);
				if (result == null) result = caseAbstractPort(portIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.PORT_OUT: {
				PortOut portOut = (PortOut)theEObject;
				T result = casePortOut(portOut);
				if (result == null) result = caseAbstractPort(portOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIMED_OBJ: {
				TimedObj timedObj = (TimedObj)theEObject;
				T result = caseTimedObj(timedObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIME_SLOT: {
				TimeSlot timeSlot = (TimeSlot)theEObject;
				T result = caseTimeSlot(timeSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIMED_LINK: {
				TimedLink timedLink = (TimedLink)theEObject;
				T result = caseTimedLink(timedLink);
				if (result == null) result = caseTimedObj(timedLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.EVENT_TRIGGER: {
				EventTrigger eventTrigger = (EventTrigger)theEObject;
				T result = caseEventTrigger(eventTrigger);
				if (result == null) result = caseTimedObj(eventTrigger);
				if (result == null) result = caseEventElem(eventTrigger);
				if (result == null) result = caseUIElem(eventTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.EVENT_TARGET: {
				EventTarget eventTarget = (EventTarget)theEObject;
				T result = caseEventTarget(eventTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIMED_LINE: {
				TimedLine timedLine = (TimedLine)theEObject;
				T result = caseTimedLine(timedLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TIME_NODE: {
				TimeNode timeNode = (TimeNode)theEObject;
				T result = caseTimeNode(timeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.NODE_FLOAT_PARAM: {
				NodeFloatParam nodeFloatParam = (NodeFloatParam)theEObject;
				T result = caseNodeFloatParam(nodeFloatParam);
				if (result == null) result = caseNodeParam(nodeFloatParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.NODE_PARAM: {
				NodeParam nodeParam = (NodeParam)theEObject;
				T result = caseNodeParam(nodeParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.NODE_INTEGER_PARAM: {
				NodeIntegerParam nodeIntegerParam = (NodeIntegerParam)theEObject;
				T result = caseNodeIntegerParam(nodeIntegerParam);
				if (result == null) result = caseNodeParam(nodeIntegerParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.NODE_DOUBLE_PARAM: {
				NodeDoubleParam nodeDoubleParam = (NodeDoubleParam)theEObject;
				T result = caseNodeDoubleParam(nodeDoubleParam);
				if (result == null) result = caseNodeParam(nodeDoubleParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.CIRCLE: {
				Circle circle = (Circle)theEObject;
				T result = caseCircle(circle);
				if (result == null) result = caseTimeBar(circle);
				if (result == null) result = caseUIElem(circle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.STAR: {
				Star star = (Star)theEObject;
				T result = caseStar(star);
				if (result == null) result = caseTimeBar(star);
				if (result == null) result = caseUIElem(star);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.SQUARE: {
				Square square = (Square)theEObject;
				T result = caseSquare(square);
				if (result == null) result = caseTimeBar(square);
				if (result == null) result = caseUIElem(square);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.TRACK: {
				Track track = (Track)theEObject;
				T result = caseTrack(track);
				if (result == null) result = caseTimeBar(track);
				if (result == null) result = caseUIElem(track);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.CUE_NODE: {
				CueNode cueNode = (CueNode)theEObject;
				T result = caseCueNode(cueNode);
				if (result == null) result = caseTimeNode(cueNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.UI_ELEM: {
				UIElem uiElem = (UIElem)theEObject;
				T result = caseUIElem(uiElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.EVENT_ELEM: {
				EventElem eventElem = (EventElem)theEObject;
				T result = caseEventElem(eventElem);
				if (result == null) result = caseUIElem(eventElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.EVENT_LISTENER: {
				EventListener eventListener = (EventListener)theEObject;
				T result = caseEventListener(eventListener);
				if (result == null) result = caseEventElem(eventListener);
				if (result == null) result = caseUIElem(eventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.EVENT_CUE: {
				EventCue eventCue = (EventCue)theEObject;
				T result = caseEventCue(eventCue);
				if (result == null) result = caseEventElem(eventCue);
				if (result == null) result = caseUIElem(eventCue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.EVENT_SYNCHRO: {
				EventSynchro eventSynchro = (EventSynchro)theEObject;
				T result = caseEventSynchro(eventSynchro);
				if (result == null) result = caseEventElem(eventSynchro);
				if (result == null) result = caseUIElem(eventSynchro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsequencePackage.EMIT_INFO: {
				EmitInfo emitInfo = (EmitInfo)theEObject;
				T result = caseEmitInfo(emitInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequencer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequencer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencer(Sequencer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBox(TimeBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedEvent(TimedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Cursor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Cursor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCursor(TimeCursor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBar(TimeBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPort(AbstractPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortIn(PortIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortOut(PortOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedObj(TimedObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSlot(TimeSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedLink(TimedLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTrigger(EventTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventListener(EventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Cue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Cue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventCue(EventCue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Synchro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Synchro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventSynchro(EventSynchro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emit Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emit Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmitInfo(EmitInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventTarget(EventTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedLine(TimedLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeNode(TimeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Float Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Float Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeFloatParam(NodeFloatParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeParam(NodeParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Integer Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Integer Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeIntegerParam(NodeIntegerParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Double Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Double Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeDoubleParam(NodeDoubleParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Star</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStar(Star object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Square</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Square</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSquare(Square object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrack(Track object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cue Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cue Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCueNode(CueNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIElem(UIElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventElem(EventElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzsequenceSwitch
