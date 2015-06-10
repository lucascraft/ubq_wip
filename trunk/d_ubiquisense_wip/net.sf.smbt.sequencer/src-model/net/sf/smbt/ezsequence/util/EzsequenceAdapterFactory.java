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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezsequence.EzsequencePackage
 * @generated
 */
public class EzsequenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzsequencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsequenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzsequencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzsequenceSwitch<Adapter> modelSwitch =
		new EzsequenceSwitch<Adapter>() {
			@Override
			public Adapter caseSequencer(Sequencer object) {
				return createSequencerAdapter();
			}
			@Override
			public Adapter caseTimeBox(TimeBox object) {
				return createTimeBoxAdapter();
			}
			@Override
			public Adapter caseTimedEvent(TimedEvent object) {
				return createTimedEventAdapter();
			}
			@Override
			public Adapter caseTimeCursor(TimeCursor object) {
				return createTimeCursorAdapter();
			}
			@Override
			public Adapter caseTimeBar(TimeBar object) {
				return createTimeBarAdapter();
			}
			@Override
			public Adapter caseAbstractPort(AbstractPort object) {
				return createAbstractPortAdapter();
			}
			@Override
			public Adapter casePortIn(PortIn object) {
				return createPortInAdapter();
			}
			@Override
			public Adapter casePortOut(PortOut object) {
				return createPortOutAdapter();
			}
			@Override
			public Adapter caseTimedObj(TimedObj object) {
				return createTimedObjAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseTimeSlot(TimeSlot object) {
				return createTimeSlotAdapter();
			}
			@Override
			public Adapter caseTimedLink(TimedLink object) {
				return createTimedLinkAdapter();
			}
			@Override
			public Adapter caseEventTrigger(EventTrigger object) {
				return createEventTriggerAdapter();
			}
			@Override
			public Adapter caseEventTarget(EventTarget object) {
				return createEventTargetAdapter();
			}
			@Override
			public Adapter caseTimedLine(TimedLine object) {
				return createTimedLineAdapter();
			}
			@Override
			public Adapter caseTimeNode(TimeNode object) {
				return createTimeNodeAdapter();
			}
			@Override
			public Adapter caseNodeFloatParam(NodeFloatParam object) {
				return createNodeFloatParamAdapter();
			}
			@Override
			public Adapter caseNodeParam(NodeParam object) {
				return createNodeParamAdapter();
			}
			@Override
			public Adapter caseNodeIntegerParam(NodeIntegerParam object) {
				return createNodeIntegerParamAdapter();
			}
			@Override
			public Adapter caseNodeDoubleParam(NodeDoubleParam object) {
				return createNodeDoubleParamAdapter();
			}
			@Override
			public Adapter caseCircle(Circle object) {
				return createCircleAdapter();
			}
			@Override
			public Adapter caseStar(Star object) {
				return createStarAdapter();
			}
			@Override
			public Adapter caseSquare(Square object) {
				return createSquareAdapter();
			}
			@Override
			public Adapter caseTrack(Track object) {
				return createTrackAdapter();
			}
			@Override
			public Adapter caseCueNode(CueNode object) {
				return createCueNodeAdapter();
			}
			@Override
			public Adapter caseUIElem(UIElem object) {
				return createUIElemAdapter();
			}
			@Override
			public Adapter caseEventElem(EventElem object) {
				return createEventElemAdapter();
			}
			@Override
			public Adapter caseEventListener(EventListener object) {
				return createEventListenerAdapter();
			}
			@Override
			public Adapter caseEventCue(EventCue object) {
				return createEventCueAdapter();
			}
			@Override
			public Adapter caseEventSynchro(EventSynchro object) {
				return createEventSynchroAdapter();
			}
			@Override
			public Adapter caseEmitInfo(EmitInfo object) {
				return createEmitInfoAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.Sequencer <em>Sequencer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.Sequencer
	 * @generated
	 */
	public Adapter createSequencerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimeBox <em>Time Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimeBox
	 * @generated
	 */
	public Adapter createTimeBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimedEvent <em>Timed Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimedEvent
	 * @generated
	 */
	public Adapter createTimedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimeCursor <em>Time Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimeCursor
	 * @generated
	 */
	public Adapter createTimeCursorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimeBar <em>Time Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimeBar
	 * @generated
	 */
	public Adapter createTimeBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.AbstractPort <em>Abstract Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.AbstractPort
	 * @generated
	 */
	public Adapter createAbstractPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.PortIn <em>Port In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.PortIn
	 * @generated
	 */
	public Adapter createPortInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.PortOut <em>Port Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.PortOut
	 * @generated
	 */
	public Adapter createPortOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimedObj <em>Timed Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimedObj
	 * @generated
	 */
	public Adapter createTimedObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimeSlot <em>Time Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimeSlot
	 * @generated
	 */
	public Adapter createTimeSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimedLink <em>Timed Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimedLink
	 * @generated
	 */
	public Adapter createTimedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.EventTrigger <em>Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.EventTrigger
	 * @generated
	 */
	public Adapter createEventTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.EventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.EventListener
	 * @generated
	 */
	public Adapter createEventListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.EventCue <em>Event Cue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.EventCue
	 * @generated
	 */
	public Adapter createEventCueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.EventSynchro <em>Event Synchro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.EventSynchro
	 * @generated
	 */
	public Adapter createEventSynchroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.EmitInfo <em>Emit Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.EmitInfo
	 * @generated
	 */
	public Adapter createEmitInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.EventTarget <em>Event Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.EventTarget
	 * @generated
	 */
	public Adapter createEventTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimedLine <em>Timed Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimedLine
	 * @generated
	 */
	public Adapter createTimedLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.TimeNode <em>Time Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.TimeNode
	 * @generated
	 */
	public Adapter createTimeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.NodeFloatParam <em>Node Float Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.NodeFloatParam
	 * @generated
	 */
	public Adapter createNodeFloatParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.NodeParam <em>Node Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.NodeParam
	 * @generated
	 */
	public Adapter createNodeParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.NodeIntegerParam <em>Node Integer Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.NodeIntegerParam
	 * @generated
	 */
	public Adapter createNodeIntegerParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.NodeDoubleParam <em>Node Double Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.NodeDoubleParam
	 * @generated
	 */
	public Adapter createNodeDoubleParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.Star <em>Star</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.Star
	 * @generated
	 */
	public Adapter createStarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.Square
	 * @generated
	 */
	public Adapter createSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.Track
	 * @generated
	 */
	public Adapter createTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.CueNode <em>Cue Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.CueNode
	 * @generated
	 */
	public Adapter createCueNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.UIElem <em>UI Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.UIElem
	 * @generated
	 */
	public Adapter createUIElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsequence.EventElem <em>Event Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsequence.EventElem
	 * @generated
	 */
	public Adapter createEventElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzsequenceAdapterFactory
