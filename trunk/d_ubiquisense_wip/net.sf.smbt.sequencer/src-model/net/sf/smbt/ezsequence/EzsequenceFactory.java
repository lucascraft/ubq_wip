/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezsequence.EzsequencePackage
 * @generated
 */
public interface EzsequenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzsequenceFactory eINSTANCE = net.sf.smbt.ezsequence.impl.EzsequenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequencer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequencer</em>'.
	 * @generated
	 */
	Sequencer createSequencer();

	/**
	 * Returns a new object of class '<em>Time Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Box</em>'.
	 * @generated
	 */
	TimeBox createTimeBox();

	/**
	 * Returns a new object of class '<em>Timed Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Event</em>'.
	 * @generated
	 */
	TimedEvent createTimedEvent();

	/**
	 * Returns a new object of class '<em>Time Cursor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Cursor</em>'.
	 * @generated
	 */
	TimeCursor createTimeCursor();

	/**
	 * Returns a new object of class '<em>Time Bar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Bar</em>'.
	 * @generated
	 */
	TimeBar createTimeBar();

	/**
	 * Returns a new object of class '<em>Abstract Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Port</em>'.
	 * @generated
	 */
	AbstractPort createAbstractPort();

	/**
	 * Returns a new object of class '<em>Port In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port In</em>'.
	 * @generated
	 */
	PortIn createPortIn();

	/**
	 * Returns a new object of class '<em>Port Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Out</em>'.
	 * @generated
	 */
	PortOut createPortOut();

	/**
	 * Returns a new object of class '<em>Timed Obj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Obj</em>'.
	 * @generated
	 */
	TimedObj createTimedObj();

	/**
	 * Returns a new object of class '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script</em>'.
	 * @generated
	 */
	Script createScript();

	/**
	 * Returns a new object of class '<em>Time Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Slot</em>'.
	 * @generated
	 */
	TimeSlot createTimeSlot();

	/**
	 * Returns a new object of class '<em>Timed Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Link</em>'.
	 * @generated
	 */
	TimedLink createTimedLink();

	/**
	 * Returns a new object of class '<em>Event Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Trigger</em>'.
	 * @generated
	 */
	EventTrigger createEventTrigger();

	/**
	 * Returns a new object of class '<em>Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Listener</em>'.
	 * @generated
	 */
	EventListener createEventListener();

	/**
	 * Returns a new object of class '<em>Event Cue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Cue</em>'.
	 * @generated
	 */
	EventCue createEventCue();

	/**
	 * Returns a new object of class '<em>Event Synchro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Synchro</em>'.
	 * @generated
	 */
	EventSynchro createEventSynchro();

	/**
	 * Returns a new object of class '<em>Emit Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emit Info</em>'.
	 * @generated
	 */
	EmitInfo createEmitInfo();

	/**
	 * Returns a new object of class '<em>Event Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Target</em>'.
	 * @generated
	 */
	EventTarget createEventTarget();

	/**
	 * Returns a new object of class '<em>Timed Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed Line</em>'.
	 * @generated
	 */
	TimedLine createTimedLine();

	/**
	 * Returns a new object of class '<em>Time Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Node</em>'.
	 * @generated
	 */
	TimeNode createTimeNode();

	/**
	 * Returns a new object of class '<em>Node Float Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Float Param</em>'.
	 * @generated
	 */
	NodeFloatParam createNodeFloatParam();

	/**
	 * Returns a new object of class '<em>Node Integer Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Integer Param</em>'.
	 * @generated
	 */
	NodeIntegerParam createNodeIntegerParam();

	/**
	 * Returns a new object of class '<em>Node Double Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Double Param</em>'.
	 * @generated
	 */
	NodeDoubleParam createNodeDoubleParam();

	/**
	 * Returns a new object of class '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circle</em>'.
	 * @generated
	 */
	Circle createCircle();

	/**
	 * Returns a new object of class '<em>Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Star</em>'.
	 * @generated
	 */
	Star createStar();

	/**
	 * Returns a new object of class '<em>Square</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Square</em>'.
	 * @generated
	 */
	Square createSquare();

	/**
	 * Returns a new object of class '<em>Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Track</em>'.
	 * @generated
	 */
	Track createTrack();

	/**
	 * Returns a new object of class '<em>Cue Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cue Node</em>'.
	 * @generated
	 */
	CueNode createCueNode();

	/**
	 * Returns a new object of class '<em>UI Elem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Elem</em>'.
	 * @generated
	 */
	UIElem createUIElem();

	/**
	 * Returns a new object of class '<em>Event Elem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Elem</em>'.
	 * @generated
	 */
	EventElem createEventElem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzsequencePackage getEzsequencePackage();

} //EzsequenceFactory
