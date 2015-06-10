/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.*;
import net.sf.smbt.sequencer.engine.GroovixUtils;
import net.sf.xqz.model.temporal.EXECUTION_STATUS;

import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzsequenceFactoryImpl extends EFactoryImpl implements EzsequenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzsequenceFactory init() {
		try {
			EzsequenceFactory theEzsequenceFactory = (EzsequenceFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezsequence/1.0"); 
			if (theEzsequenceFactory != null) {
				return theEzsequenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzsequenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsequenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzsequencePackage.SEQUENCER: return createSequencer();
			case EzsequencePackage.TIME_BOX: return createTimeBox();
			case EzsequencePackage.TIMED_EVENT: return createTimedEvent();
			case EzsequencePackage.TIME_CURSOR: return createTimeCursor();
			case EzsequencePackage.TIME_BAR: return createTimeBar();
			case EzsequencePackage.ABSTRACT_PORT: return createAbstractPort();
			case EzsequencePackage.PORT_IN: return createPortIn();
			case EzsequencePackage.PORT_OUT: return createPortOut();
			case EzsequencePackage.TIMED_OBJ: return createTimedObj();
			case EzsequencePackage.SCRIPT: return createScript();
			case EzsequencePackage.TIME_SLOT: return createTimeSlot();
			case EzsequencePackage.TIMED_LINK: return createTimedLink();
			case EzsequencePackage.EVENT_TRIGGER: return createEventTrigger();
			case EzsequencePackage.EVENT_TARGET: return createEventTarget();
			case EzsequencePackage.TIMED_LINE: return createTimedLine();
			case EzsequencePackage.TIME_NODE: return createTimeNode();
			case EzsequencePackage.NODE_FLOAT_PARAM: return createNodeFloatParam();
			case EzsequencePackage.NODE_INTEGER_PARAM: return createNodeIntegerParam();
			case EzsequencePackage.NODE_DOUBLE_PARAM: return createNodeDoubleParam();
			case EzsequencePackage.CIRCLE: return createCircle();
			case EzsequencePackage.STAR: return createStar();
			case EzsequencePackage.SQUARE: return createSquare();
			case EzsequencePackage.TRACK: return createTrack();
			case EzsequencePackage.CUE_NODE: return createCueNode();
			case EzsequencePackage.UI_ELEM: return createUIElem();
			case EzsequencePackage.EVENT_ELEM: return createEventElem();
			case EzsequencePackage.EVENT_LISTENER: return createEventListener();
			case EzsequencePackage.EVENT_CUE: return createEventCue();
			case EzsequencePackage.EVENT_SYNCHRO: return createEventSynchro();
			case EzsequencePackage.EMIT_INFO: return createEmitInfo();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzsequencePackage.SEQ_TYPE:
				return createSEQ_TYPEFromString(eDataType, initialValue);
			case EzsequencePackage.CUE_TYPE:
				return createCUE_TYPEFromString(eDataType, initialValue);
			case EzsequencePackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case EzsequencePackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case EzsequencePackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case EzsequencePackage.POLYLINE:
				return createPolylineFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzsequencePackage.SEQ_TYPE:
				return convertSEQ_TYPEToString(eDataType, instanceValue);
			case EzsequencePackage.CUE_TYPE:
				return convertCUE_TYPEToString(eDataType, instanceValue);
			case EzsequencePackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case EzsequencePackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case EzsequencePackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case EzsequencePackage.POLYLINE:
				return convertPolylineToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Sequencer createSequencer() {
		SequencerImpl sequencer = new SequencerImpl();
		
		
		TimedLine timedLine = createTimedLine();
		timedLine.setFactor(2.5f);
		timedLine.setSpeed(1f);
		timedLine.setFinish(0);
		timedLine.setStart(0);
		timedLine.setTime(0);
		timedLine.setStatus(EXECUTION_STATUS.STOP);
		
		sequencer.getTimelines().add(timedLine);

		sequencer.setOffset(new Point(0, 0));
		
		return sequencer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBox createTimeBox() {
		TimeBoxImpl timeBox = new TimeBoxImpl();
		return timeBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedEvent createTimedEvent() {
		TimedEventImpl timedEvent = new TimedEventImpl();
		return timedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCursor createTimeCursor() {
		TimeCursorImpl timeCursor = new TimeCursorImpl();
		return timeCursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBar createTimeBar() {
		TimeBarImpl timeBar = new TimeBarImpl();
		return timeBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPort createAbstractPort() {
		AbstractPortImpl abstractPort = new AbstractPortImpl();
		return abstractPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortIn createPortIn() {
		PortInImpl portIn = new PortInImpl();
		return portIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortOut createPortOut() {
		PortOutImpl portOut = new PortOutImpl();
		return portOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedObj createTimedObj() {
		TimedObjImpl timedObj = new TimedObjImpl();
		return timedObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script createScript() {
		ScriptImpl script = new ScriptImpl();
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSlot createTimeSlot() {
		TimeSlotImpl timeSlot = new TimeSlotImpl();
		return timeSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedLink createTimedLink() {
		TimedLinkImpl timedLink = new TimedLinkImpl();
		return timedLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTrigger createEventTrigger() {
		EventTriggerImpl eventTrigger = new EventTriggerImpl();
		return eventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListener createEventListener() {
		EventListenerImpl eventListener = new EventListenerImpl();
		return eventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCue createEventCue() {
		EventCueImpl eventCue = new EventCueImpl();
		return eventCue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSynchro createEventSynchro() {
		EventSynchroImpl eventSynchro = new EventSynchroImpl();
		return eventSynchro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmitInfo createEmitInfo() {
		EmitInfoImpl emitInfo = new EmitInfoImpl();
		return emitInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTarget createEventTarget() {
		EventTargetImpl eventTarget = new EventTargetImpl();
		return eventTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedLine createTimedLine() {
		TimedLineImpl timedLine = new TimedLineImpl();
		return timedLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeNode createTimeNode() {
		TimeNodeImpl timeNode = new TimeNodeImpl();
		return timeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFloatParam createNodeFloatParam() {
		NodeFloatParamImpl nodeFloatParam = new NodeFloatParamImpl();
		return nodeFloatParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeIntegerParam createNodeIntegerParam() {
		NodeIntegerParamImpl nodeIntegerParam = new NodeIntegerParamImpl();
		return nodeIntegerParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeDoubleParam createNodeDoubleParam() {
		NodeDoubleParamImpl nodeDoubleParam = new NodeDoubleParamImpl();
		return nodeDoubleParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Star createStar() {
		StarImpl star = new StarImpl();
		return star;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square createSquare() {
		SquareImpl square = new SquareImpl();
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Track createTrack() {
		TrackImpl track = new TrackImpl();
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CueNode createCueNode() {
		CueNodeImpl cueNode = new CueNodeImpl();
		return cueNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIElem createUIElem() {
		UIElemImpl uiElem = new UIElemImpl();
		return uiElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventElem createEventElem() {
		EventElemImpl eventElem = new EventElemImpl();
		return eventElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ_TYPE createSEQ_TYPEFromString(EDataType eDataType, String initialValue) {
		SEQ_TYPE result = SEQ_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSEQ_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUE_TYPE createCUE_TYPEFromString(EDataType eDataType, String initialValue) {
		CUE_TYPE result = CUE_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCUE_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		return GroovixUtils.INSTANCE.computePointID2(initialValue);
		//return (Point)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		return GroovixUtils.INSTANCE.computeRectID2(initialValue);
		//return (Rectangle)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return GroovixUtils.INSTANCE.computeColorID2(initialValue);
//		return (Color)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Polyline createPolylineFromString(EDataType eDataType, String initialValue) {
		return GroovixUtils.INSTANCE.computePolyline(initialValue);
//		return (Polyline)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPolylineToString(EDataType eDataType, Object instanceValue) {
		return GroovixUtils.INSTANCE.toXMI((Polyline)instanceValue);
		//return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsequencePackage getEzsequencePackage() {
		return (EzsequencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzsequencePackage getPackage() {
		return EzsequencePackage.eINSTANCE;
	}

} //EzsequenceFactoryImpl
