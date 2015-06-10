/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezsequence.AbstractPort;
import net.sf.smbt.ezsequence.Circle;
import net.sf.smbt.ezsequence.CueNode;
import net.sf.smbt.ezsequence.EmitInfo;
import net.sf.smbt.ezsequence.EventCue;
import net.sf.smbt.ezsequence.EventElem;
import net.sf.smbt.ezsequence.EventListener;
import net.sf.smbt.ezsequence.EventSynchro;
import net.sf.smbt.ezsequence.EventTarget;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequenceFactory;
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
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzsequencePackageImpl extends EPackageImpl implements EzsequencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCursorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedObjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventCueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventSynchroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emitInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timedLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeFloatParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeIntegerParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeDoubleParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass starEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cueNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seQ_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cuE_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType polylineEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzsequencePackageImpl() {
		super(eNS_URI, EzsequenceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzsequencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzsequencePackage init() {
		if (isInited) return (EzsequencePackage)EPackage.Registry.INSTANCE.getEPackage(EzsequencePackage.eNS_URI);

		// Obtain or create and register package
		EzsequencePackageImpl theEzsequencePackage = (EzsequencePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzsequencePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzsequencePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TemporalPackage.eINSTANCE.eClass();
		EzmidiPackage.eINSTANCE.eClass();
		EzdmxctrlPackage.eINSTANCE.eClass();
		EzdmxPackage.eINSTANCE.eClass();
		EzmojoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzsequencePackage.createPackageContents();

		// Initialize created meta-data
		theEzsequencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzsequencePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzsequencePackage.eNS_URI, theEzsequencePackage);
		return theEzsequencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequencer() {
		return sequencerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_ID() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Timelines() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Timebar() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Boxes() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Links() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Triggers() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_TimeCursors() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Commands() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Listeners() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Cues() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Synchros() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_Offset() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_StoredCommands() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Selection() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_Mojo() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_DmxUniverse() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_MidiCommands() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_Dragged() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_MouseX() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_MouseY() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_CmdTypeCache() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_ZoomFactor() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_Surface() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencer_CurrentActionMode() {
		return (EAttribute)sequencerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequencer_DefaultTargets() {
		return (EReference)sequencerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBox() {
		return timeBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBox_ID() {
		return (EAttribute)timeBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBox_In() {
		return (EReference)timeBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBox_Out() {
		return (EReference)timeBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBox_Duration() {
		return (EAttribute)timeBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBox_Events() {
		return (EReference)timeBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBox_Timeline() {
		return (EReference)timeBoxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBox_Dist() {
		return (EAttribute)timeBoxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBox_OnEnter() {
		return (EReference)timeBoxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBox_OnExit() {
		return (EReference)timeBoxEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedEvent() {
		return timedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedEvent_Script() {
		return (EReference)timedEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedEvent_Trigger() {
		return (EReference)timedEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedEvent_Command() {
		return (EReference)timedEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCursor() {
		return timeCursorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCursor_Completion() {
		return (EAttribute)timeCursorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCursor_Length() {
		return (EAttribute)timeCursorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCursor_Direction() {
		return (EAttribute)timeCursorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeCursor_Accel() {
		return (EAttribute)timeCursorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeBar() {
		return timeBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBar_Timecursor() {
		return (EReference)timeBarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBar_Slots() {
		return (EReference)timeBarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBar_Label() {
		return (EAttribute)timeBarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeBar_Nodes() {
		return (EReference)timeBarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBar_Scale() {
		return (EAttribute)timeBarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBar_Speed() {
		return (EAttribute)timeBarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBar_SeqKind() {
		return (EAttribute)timeBarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeBar_Direction() {
		return (EAttribute)timeBarEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPort() {
		return abstractPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractPort_Label() {
		return (EAttribute)abstractPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortIn() {
		return portInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortOut() {
		return portOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedObj() {
		return timedObjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedObj_Time() {
		return (EAttribute)timedObjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedObj_Label() {
		return (EAttribute)timedObjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Body() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSlot() {
		return timeSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeSlot_TriggerLink() {
		return (EReference)timeSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedLink() {
		return timedLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedLink_Before() {
		return (EReference)timedLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimedLink_After() {
		return (EReference)timedLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTrigger() {
		return eventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_Emits() {
		return (EReference)eventTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_After() {
		return (EReference)eventTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_Before() {
		return (EReference)eventTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTrigger_Targets() {
		return (EReference)eventTriggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventListener() {
		return eventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventListener_OscTags() {
		return (EAttribute)eventListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventCue() {
		return eventCueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventCue_Jump() {
		return (EAttribute)eventCueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventCue_Kind() {
		return (EAttribute)eventCueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventSynchro() {
		return eventSynchroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmitInfo() {
		return emitInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmitInfo_Cmd() {
		return (EReference)emitInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmitInfo_Targets() {
		return (EReference)emitInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTarget() {
		return eventTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTarget_Source() {
		return (EReference)eventTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventTarget_Triggers() {
		return (EReference)eventTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimedLine() {
		return timedLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedLine_Start() {
		return (EAttribute)timedLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedLine_Finish() {
		return (EAttribute)timedLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedLine_Time() {
		return (EAttribute)timedLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedLine_Id() {
		return (EAttribute)timedLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedLine_Status() {
		return (EAttribute)timedLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedLine_Factor() {
		return (EAttribute)timedLineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimedLine_Speed() {
		return (EAttribute)timedLineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeNode() {
		return timeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNode_Point() {
		return (EAttribute)timeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeNode_Parameters() {
		return (EReference)timeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeNode_Completion() {
		return (EAttribute)timeNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeFloatParam() {
		return nodeFloatParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeFloatParam_Val() {
		return (EAttribute)nodeFloatParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeParam() {
		return nodeParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeParam_Id() {
		return (EAttribute)nodeParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeParam_Desc() {
		return (EAttribute)nodeParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeIntegerParam() {
		return nodeIntegerParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeIntegerParam_Val() {
		return (EAttribute)nodeIntegerParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodeDoubleParam() {
		return nodeDoubleParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNodeDoubleParam_Val() {
		return (EAttribute)nodeDoubleParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircle_Center() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCircle_Radius() {
		return (EAttribute)circleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStar() {
		return starEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStar_Center() {
		return (EAttribute)starEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStar_Radius() {
		return (EAttribute)starEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSquare() {
		return squareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_TopLeft() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_TopRight() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_BottomRight() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSquare_BottomLeft() {
		return (EAttribute)squareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrack() {
		return trackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrack_Polyline() {
		return (EAttribute)trackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCueNode() {
		return cueNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCueNode_Kind() {
		return (EAttribute)cueNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIElem() {
		return uiElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElem_Bounds() {
		return (EAttribute)uiElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElem_Fg() {
		return (EAttribute)uiElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElem_Bg() {
		return (EAttribute)uiElemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElem_Visible() {
		return (EAttribute)uiElemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElem_Selected() {
		return (EAttribute)uiElemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIElem_Disabled() {
		return (EAttribute)uiElemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventElem() {
		return eventElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventElem_Bang() {
		return (EAttribute)eventElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventElem_Radius() {
		return (EAttribute)eventElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventElem_Center() {
		return (EAttribute)eventElemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventElem_Id() {
		return (EAttribute)eventElemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSEQ_TYPE() {
		return seQ_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCUE_TYPE() {
		return cuE_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPolyline() {
		return polylineEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsequenceFactory getEzsequenceFactory() {
		return (EzsequenceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sequencerEClass = createEClass(SEQUENCER);
		createEAttribute(sequencerEClass, SEQUENCER__ID);
		createEReference(sequencerEClass, SEQUENCER__TIMELINES);
		createEReference(sequencerEClass, SEQUENCER__TIMEBAR);
		createEReference(sequencerEClass, SEQUENCER__BOXES);
		createEReference(sequencerEClass, SEQUENCER__LINKS);
		createEReference(sequencerEClass, SEQUENCER__TRIGGERS);
		createEReference(sequencerEClass, SEQUENCER__TIME_CURSORS);
		createEReference(sequencerEClass, SEQUENCER__COMMANDS);
		createEReference(sequencerEClass, SEQUENCER__CMD_TYPE_CACHE);
		createEAttribute(sequencerEClass, SEQUENCER__ZOOM_FACTOR);
		createEAttribute(sequencerEClass, SEQUENCER__SURFACE);
		createEAttribute(sequencerEClass, SEQUENCER__CURRENT_ACTION_MODE);
		createEReference(sequencerEClass, SEQUENCER__DEFAULT_TARGETS);
		createEReference(sequencerEClass, SEQUENCER__LISTENERS);
		createEReference(sequencerEClass, SEQUENCER__CUES);
		createEReference(sequencerEClass, SEQUENCER__SYNCHROS);
		createEAttribute(sequencerEClass, SEQUENCER__OFFSET);
		createEReference(sequencerEClass, SEQUENCER__STORED_COMMANDS);
		createEReference(sequencerEClass, SEQUENCER__SELECTION);
		createEReference(sequencerEClass, SEQUENCER__MOJO);
		createEReference(sequencerEClass, SEQUENCER__DMX_UNIVERSE);
		createEReference(sequencerEClass, SEQUENCER__MIDI_COMMANDS);
		createEAttribute(sequencerEClass, SEQUENCER__DRAGGED);
		createEAttribute(sequencerEClass, SEQUENCER__MOUSE_X);
		createEAttribute(sequencerEClass, SEQUENCER__MOUSE_Y);

		timeBoxEClass = createEClass(TIME_BOX);
		createEAttribute(timeBoxEClass, TIME_BOX__ID);
		createEReference(timeBoxEClass, TIME_BOX__IN);
		createEReference(timeBoxEClass, TIME_BOX__OUT);
		createEAttribute(timeBoxEClass, TIME_BOX__DURATION);
		createEReference(timeBoxEClass, TIME_BOX__EVENTS);
		createEReference(timeBoxEClass, TIME_BOX__TIMELINE);
		createEAttribute(timeBoxEClass, TIME_BOX__DIST);
		createEReference(timeBoxEClass, TIME_BOX__ON_ENTER);
		createEReference(timeBoxEClass, TIME_BOX__ON_EXIT);

		timedEventEClass = createEClass(TIMED_EVENT);
		createEReference(timedEventEClass, TIMED_EVENT__SCRIPT);
		createEReference(timedEventEClass, TIMED_EVENT__TRIGGER);
		createEReference(timedEventEClass, TIMED_EVENT__COMMAND);

		timeCursorEClass = createEClass(TIME_CURSOR);
		createEAttribute(timeCursorEClass, TIME_CURSOR__COMPLETION);
		createEAttribute(timeCursorEClass, TIME_CURSOR__LENGTH);
		createEAttribute(timeCursorEClass, TIME_CURSOR__DIRECTION);
		createEAttribute(timeCursorEClass, TIME_CURSOR__ACCEL);

		timeBarEClass = createEClass(TIME_BAR);
		createEReference(timeBarEClass, TIME_BAR__TIMECURSOR);
		createEReference(timeBarEClass, TIME_BAR__SLOTS);
		createEAttribute(timeBarEClass, TIME_BAR__LABEL);
		createEReference(timeBarEClass, TIME_BAR__NODES);
		createEAttribute(timeBarEClass, TIME_BAR__SCALE);
		createEAttribute(timeBarEClass, TIME_BAR__SPEED);
		createEAttribute(timeBarEClass, TIME_BAR__SEQ_KIND);
		createEAttribute(timeBarEClass, TIME_BAR__DIRECTION);

		abstractPortEClass = createEClass(ABSTRACT_PORT);
		createEAttribute(abstractPortEClass, ABSTRACT_PORT__LABEL);

		portInEClass = createEClass(PORT_IN);

		portOutEClass = createEClass(PORT_OUT);

		timedObjEClass = createEClass(TIMED_OBJ);
		createEAttribute(timedObjEClass, TIMED_OBJ__TIME);
		createEAttribute(timedObjEClass, TIMED_OBJ__LABEL);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__BODY);

		timeSlotEClass = createEClass(TIME_SLOT);
		createEReference(timeSlotEClass, TIME_SLOT__TRIGGER_LINK);

		timedLinkEClass = createEClass(TIMED_LINK);
		createEReference(timedLinkEClass, TIMED_LINK__BEFORE);
		createEReference(timedLinkEClass, TIMED_LINK__AFTER);

		eventTriggerEClass = createEClass(EVENT_TRIGGER);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__EMITS);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__AFTER);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__BEFORE);
		createEReference(eventTriggerEClass, EVENT_TRIGGER__TARGETS);

		eventTargetEClass = createEClass(EVENT_TARGET);
		createEReference(eventTargetEClass, EVENT_TARGET__SOURCE);
		createEReference(eventTargetEClass, EVENT_TARGET__TRIGGERS);

		timedLineEClass = createEClass(TIMED_LINE);
		createEAttribute(timedLineEClass, TIMED_LINE__START);
		createEAttribute(timedLineEClass, TIMED_LINE__FINISH);
		createEAttribute(timedLineEClass, TIMED_LINE__TIME);
		createEAttribute(timedLineEClass, TIMED_LINE__ID);
		createEAttribute(timedLineEClass, TIMED_LINE__STATUS);
		createEAttribute(timedLineEClass, TIMED_LINE__FACTOR);
		createEAttribute(timedLineEClass, TIMED_LINE__SPEED);

		timeNodeEClass = createEClass(TIME_NODE);
		createEAttribute(timeNodeEClass, TIME_NODE__POINT);
		createEReference(timeNodeEClass, TIME_NODE__PARAMETERS);
		createEAttribute(timeNodeEClass, TIME_NODE__COMPLETION);

		nodeFloatParamEClass = createEClass(NODE_FLOAT_PARAM);
		createEAttribute(nodeFloatParamEClass, NODE_FLOAT_PARAM__VAL);

		nodeParamEClass = createEClass(NODE_PARAM);
		createEAttribute(nodeParamEClass, NODE_PARAM__ID);
		createEAttribute(nodeParamEClass, NODE_PARAM__DESC);

		nodeIntegerParamEClass = createEClass(NODE_INTEGER_PARAM);
		createEAttribute(nodeIntegerParamEClass, NODE_INTEGER_PARAM__VAL);

		nodeDoubleParamEClass = createEClass(NODE_DOUBLE_PARAM);
		createEAttribute(nodeDoubleParamEClass, NODE_DOUBLE_PARAM__VAL);

		circleEClass = createEClass(CIRCLE);
		createEAttribute(circleEClass, CIRCLE__CENTER);
		createEAttribute(circleEClass, CIRCLE__RADIUS);

		starEClass = createEClass(STAR);
		createEAttribute(starEClass, STAR__CENTER);
		createEAttribute(starEClass, STAR__RADIUS);

		squareEClass = createEClass(SQUARE);
		createEAttribute(squareEClass, SQUARE__TOP_LEFT);
		createEAttribute(squareEClass, SQUARE__TOP_RIGHT);
		createEAttribute(squareEClass, SQUARE__BOTTOM_RIGHT);
		createEAttribute(squareEClass, SQUARE__BOTTOM_LEFT);

		trackEClass = createEClass(TRACK);
		createEAttribute(trackEClass, TRACK__POLYLINE);

		cueNodeEClass = createEClass(CUE_NODE);
		createEAttribute(cueNodeEClass, CUE_NODE__KIND);

		uiElemEClass = createEClass(UI_ELEM);
		createEAttribute(uiElemEClass, UI_ELEM__BOUNDS);
		createEAttribute(uiElemEClass, UI_ELEM__FG);
		createEAttribute(uiElemEClass, UI_ELEM__BG);
		createEAttribute(uiElemEClass, UI_ELEM__VISIBLE);
		createEAttribute(uiElemEClass, UI_ELEM__SELECTED);
		createEAttribute(uiElemEClass, UI_ELEM__DISABLED);

		eventElemEClass = createEClass(EVENT_ELEM);
		createEAttribute(eventElemEClass, EVENT_ELEM__BANG);
		createEAttribute(eventElemEClass, EVENT_ELEM__RADIUS);
		createEAttribute(eventElemEClass, EVENT_ELEM__CENTER);
		createEAttribute(eventElemEClass, EVENT_ELEM__ID);

		eventListenerEClass = createEClass(EVENT_LISTENER);
		createEAttribute(eventListenerEClass, EVENT_LISTENER__OSC_TAGS);

		eventCueEClass = createEClass(EVENT_CUE);
		createEAttribute(eventCueEClass, EVENT_CUE__JUMP);
		createEAttribute(eventCueEClass, EVENT_CUE__KIND);

		eventSynchroEClass = createEClass(EVENT_SYNCHRO);

		emitInfoEClass = createEClass(EMIT_INFO);
		createEReference(emitInfoEClass, EMIT_INFO__CMD);
		createEReference(emitInfoEClass, EMIT_INFO__TARGETS);

		// Create enums
		seQ_TYPEEEnum = createEEnum(SEQ_TYPE);
		cuE_TYPEEEnum = createEEnum(CUE_TYPE);

		// Create data types
		pointEDataType = createEDataType(POINT);
		rectangleEDataType = createEDataType(RECTANGLE);
		colorEDataType = createEDataType(COLOR);
		polylineEDataType = createEDataType(POLYLINE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EzmojoPackage theEzmojoPackage = (EzmojoPackage)EPackage.Registry.INSTANCE.getEPackage(EzmojoPackage.eNS_URI);
		EzdmxctrlPackage theEzdmxctrlPackage = (EzdmxctrlPackage)EPackage.Registry.INSTANCE.getEPackage(EzdmxctrlPackage.eNS_URI);
		EzmidiPackage theEzmidiPackage = (EzmidiPackage)EPackage.Registry.INSTANCE.getEPackage(EzmidiPackage.eNS_URI);
		TemporalPackage theTemporalPackage = (TemporalPackage)EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sequencerEClass.getESuperTypes().add(this.getTimedObj());
		sequencerEClass.getESuperTypes().add(this.getUIElem());
		timeBoxEClass.getESuperTypes().add(this.getTimedObj());
		timedEventEClass.getESuperTypes().add(this.getTimedObj());
		timeCursorEClass.getESuperTypes().add(this.getTimedObj());
		timeBarEClass.getESuperTypes().add(this.getUIElem());
		portInEClass.getESuperTypes().add(this.getAbstractPort());
		portOutEClass.getESuperTypes().add(this.getAbstractPort());
		timedLinkEClass.getESuperTypes().add(this.getTimedObj());
		eventTriggerEClass.getESuperTypes().add(this.getTimedObj());
		eventTriggerEClass.getESuperTypes().add(this.getEventElem());
		nodeFloatParamEClass.getESuperTypes().add(this.getNodeParam());
		nodeIntegerParamEClass.getESuperTypes().add(this.getNodeParam());
		nodeDoubleParamEClass.getESuperTypes().add(this.getNodeParam());
		circleEClass.getESuperTypes().add(this.getTimeBar());
		starEClass.getESuperTypes().add(this.getTimeBar());
		squareEClass.getESuperTypes().add(this.getTimeBar());
		trackEClass.getESuperTypes().add(this.getTimeBar());
		cueNodeEClass.getESuperTypes().add(this.getTimeNode());
		eventElemEClass.getESuperTypes().add(this.getUIElem());
		eventListenerEClass.getESuperTypes().add(this.getEventElem());
		eventCueEClass.getESuperTypes().add(this.getEventElem());
		eventSynchroEClass.getESuperTypes().add(this.getEventElem());

		// Initialize classes and features; add operations and parameters
		initEClass(sequencerEClass, Sequencer.class, "Sequencer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequencer_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Timelines(), this.getTimedLine(), null, "timelines", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Timebar(), this.getTimeBar(), null, "timebar", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Boxes(), this.getTimeBox(), null, "boxes", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Links(), this.getTimedLink(), null, "links", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Triggers(), this.getEventTrigger(), null, "triggers", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_TimeCursors(), this.getTimeCursor(), null, "timeCursors", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Commands(), theCmdPackage.getCmd(), null, "commands", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_CmdTypeCache(), theEcorePackage.getEClassifier(), null, "cmdTypeCache", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequencer_ZoomFactor(), theEcorePackage.getEFloat(), "zoomFactor", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequencer_Surface(), this.getRectangle(), "surface", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequencer_CurrentActionMode(), theEcorePackage.getEString(), "currentActionMode", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_DefaultTargets(), theEzmojoPackage.getEZMojoTarget(), null, "defaultTargets", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Listeners(), this.getEventListener(), null, "listeners", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Cues(), this.getEventCue(), null, "cues", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Synchros(), this.getEventSynchro(), null, "synchros", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequencer_Offset(), this.getPoint(), "offset", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_StoredCommands(), theCmdPackage.getCmd(), null, "storedCommands", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Selection(), this.getUIElem(), null, "selection", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_Mojo(), theEzmojoPackage.getEZMojoRoot(), null, "mojo", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_DmxUniverse(), theEzdmxctrlPackage.getDMXUniverseCtrl(), null, "dmxUniverse", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequencer_MidiCommands(), theEzmidiPackage.getDSLMidiMessage(), null, "midiCommands", null, 0, -1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequencer_Dragged(), theEcorePackage.getEBoolean(), "dragged", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequencer_MouseX(), theEcorePackage.getEDouble(), "mouseX", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequencer_MouseY(), theEcorePackage.getEDouble(), "mouseY", null, 0, 1, Sequencer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBoxEClass, TimeBox.class, "TimeBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeBox_ID(), ecorePackage.getEString(), "ID", "T", 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBox_In(), this.getPortIn(), null, "in", null, 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBox_Out(), this.getPortOut(), null, "out", null, 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBox_Duration(), ecorePackage.getELong(), "duration", null, 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBox_Events(), this.getTimedEvent(), null, "events", null, 0, -1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBox_Timeline(), this.getTimedLine(), null, "timeline", null, 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBox_Dist(), ecorePackage.getEInt(), "dist", null, 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBox_OnEnter(), this.getEventTrigger(), null, "onEnter", null, 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBox_OnExit(), this.getEventTrigger(), null, "onExit", null, 0, 1, TimeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedEventEClass, TimedEvent.class, "TimedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedEvent_Script(), this.getScript(), null, "script", null, 0, 1, TimedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedEvent_Trigger(), this.getEventTrigger(), null, "trigger", null, 0, 1, TimedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedEvent_Command(), theCmdPackage.getCmd(), null, "command", null, 0, -1, TimedEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeCursorEClass, TimeCursor.class, "TimeCursor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeCursor_Completion(), theEcorePackage.getEFloat(), "completion", null, 0, 1, TimeCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCursor_Length(), theEcorePackage.getEInt(), "length", null, 0, 1, TimeCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCursor_Direction(), theEcorePackage.getEInt(), "direction", null, 0, 1, TimeCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeCursor_Accel(), theEcorePackage.getEFloat(), "accel", null, 0, 1, TimeCursor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeBarEClass, TimeBar.class, "TimeBar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeBar_Timecursor(), this.getTimeCursor(), null, "timecursor", null, 0, 1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBar_Slots(), this.getTimeSlot(), null, "slots", null, 0, -1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBar_Label(), ecorePackage.getEString(), "label", null, 0, 1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeBar_Nodes(), this.getTimeNode(), null, "nodes", null, 0, -1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBar_Scale(), theEcorePackage.getEFloat(), "scale", null, 0, 1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBar_Speed(), theEcorePackage.getEFloat(), "speed", null, 0, 1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBar_SeqKind(), this.getSEQ_TYPE(), "seqKind", null, 0, 1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeBar_Direction(), theEcorePackage.getEInt(), "direction", null, 0, 1, TimeBar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPortEClass, AbstractPort.class, "AbstractPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPort_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portInEClass, PortIn.class, "PortIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portOutEClass, PortOut.class, "PortOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timedObjEClass, TimedObj.class, "TimedObj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedObj_Time(), ecorePackage.getELong(), "time", null, 0, 1, TimedObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedObj_Label(), ecorePackage.getEString(), "label", null, 0, 1, TimedObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Body(), ecorePackage.getEString(), "body", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeSlotEClass, TimeSlot.class, "TimeSlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeSlot_TriggerLink(), this.getAbstractPort(), null, "triggerLink", null, 0, 1, TimeSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedLinkEClass, TimedLink.class, "TimedLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimedLink_Before(), this.getAbstractPort(), null, "before", null, 0, 1, TimedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimedLink_After(), this.getAbstractPort(), null, "after", null, 0, 1, TimedLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTriggerEClass, EventTrigger.class, "EventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventTrigger_Emits(), this.getEmitInfo(), null, "emits", null, 0, -1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventTrigger_After(), this.getTimedEvent(), null, "after", null, 0, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventTrigger_Before(), this.getTimedEvent(), null, "before", null, 0, 1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventTrigger_Targets(), theEzmojoPackage.getEZMojoTarget(), null, "targets", null, 0, -1, EventTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventTargetEClass, EventTarget.class, "EventTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventTarget_Source(), theEcorePackage.getEClassifier(), null, "source", null, 0, 1, EventTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventTarget_Triggers(), this.getEventTrigger(), null, "triggers", null, 0, -1, EventTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timedLineEClass, TimedLine.class, "TimedLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimedLine_Start(), theEcorePackage.getELong(), "start", null, 0, 1, TimedLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedLine_Finish(), theEcorePackage.getELong(), "finish", null, 0, 1, TimedLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedLine_Time(), theEcorePackage.getELong(), "time", null, 0, 1, TimedLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedLine_Id(), theEcorePackage.getEString(), "id", null, 0, 1, TimedLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedLine_Status(), theTemporalPackage.getEXECUTION_STATUS(), "status", null, 0, 1, TimedLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedLine_Factor(), theEcorePackage.getEFloat(), "factor", null, 0, 1, TimedLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimedLine_Speed(), theEcorePackage.getEFloat(), "speed", null, 0, 1, TimedLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeNodeEClass, TimeNode.class, "TimeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeNode_Point(), this.getPoint(), "point", null, 0, 1, TimeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimeNode_Parameters(), this.getNodeParam(), null, "parameters", null, 0, -1, TimeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeNode_Completion(), theEcorePackage.getEFloat(), "completion", null, 0, 1, TimeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeFloatParamEClass, NodeFloatParam.class, "NodeFloatParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeFloatParam_Val(), theEcorePackage.getEFloat(), "val", null, 0, 1, NodeFloatParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeParamEClass, NodeParam.class, "NodeParam", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeParam_Id(), theEcorePackage.getEString(), "id", null, 0, 1, NodeParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNodeParam_Desc(), theEcorePackage.getEString(), "desc", null, 0, 1, NodeParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeIntegerParamEClass, NodeIntegerParam.class, "NodeIntegerParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeIntegerParam_Val(), theEcorePackage.getEInt(), "val", null, 0, 1, NodeIntegerParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeDoubleParamEClass, NodeDoubleParam.class, "NodeDoubleParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNodeDoubleParam_Val(), theEcorePackage.getEDouble(), "val", null, 0, 1, NodeDoubleParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircle_Center(), this.getPoint(), "center", null, 0, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCircle_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, Circle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(starEClass, Star.class, "Star", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStar_Center(), this.getPoint(), "center", null, 0, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStar_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(squareEClass, Square.class, "Square", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSquare_TopLeft(), this.getPoint(), "topLeft", null, 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquare_TopRight(), this.getPoint(), "topRight", null, 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquare_BottomRight(), this.getPoint(), "bottomRight", null, 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSquare_BottomLeft(), this.getPoint(), "bottomLeft", null, 0, 1, Square.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trackEClass, Track.class, "Track", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrack_Polyline(), this.getPolyline(), "polyline", null, 0, 1, Track.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cueNodeEClass, CueNode.class, "CueNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCueNode_Kind(), this.getCUE_TYPE(), "kind", null, 0, 1, CueNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiElemEClass, UIElem.class, "UIElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIElem_Bounds(), this.getRectangle(), "bounds", null, 0, 1, UIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElem_Fg(), this.getColor(), "fg", null, 0, 1, UIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElem_Bg(), this.getColor(), "bg", null, 0, 1, UIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElem_Visible(), theEcorePackage.getEBoolean(), "visible", null, 0, 1, UIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElem_Selected(), theEcorePackage.getEBoolean(), "selected", null, 0, 1, UIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIElem_Disabled(), theEcorePackage.getEBoolean(), "disabled", null, 0, 1, UIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventElemEClass, EventElem.class, "EventElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventElem_Bang(), theEcorePackage.getEFloat(), "bang", null, 0, 1, EventElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventElem_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, EventElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventElem_Center(), this.getPoint(), "center", null, 0, 1, EventElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventElem_Id(), theEcorePackage.getEString(), "id", null, 0, 1, EventElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventListenerEClass, EventListener.class, "EventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventListener_OscTags(), theEcorePackage.getEString(), "oscTags", null, 0, -1, EventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventCueEClass, EventCue.class, "EventCue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventCue_Jump(), theEcorePackage.getELong(), "jump", null, 0, 1, EventCue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventCue_Kind(), this.getCUE_TYPE(), "kind", null, 0, 1, EventCue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventSynchroEClass, EventSynchro.class, "EventSynchro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emitInfoEClass, EmitInfo.class, "EmitInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmitInfo_Cmd(), theCmdPackage.getCmd(), null, "cmd", null, 0, -1, EmitInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmitInfo_Targets(), theEzmojoPackage.getEZMojoTarget(), null, "targets", null, 0, -1, EmitInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(seQ_TYPEEEnum, net.sf.smbt.ezsequence.SEQ_TYPE.class, "SEQ_TYPE");
		addEEnumLiteral(seQ_TYPEEEnum, net.sf.smbt.ezsequence.SEQ_TYPE.LOOP);
		addEEnumLiteral(seQ_TYPEEEnum, net.sf.smbt.ezsequence.SEQ_TYPE.PING_PONG);
		addEEnumLiteral(seQ_TYPEEEnum, net.sf.smbt.ezsequence.SEQ_TYPE.ONCE);
		addEEnumLiteral(seQ_TYPEEEnum, net.sf.smbt.ezsequence.SEQ_TYPE.INVERSE);

		initEEnum(cuE_TYPEEEnum, net.sf.smbt.ezsequence.CUE_TYPE.class, "CUE_TYPE");
		addEEnumLiteral(cuE_TYPEEEnum, net.sf.smbt.ezsequence.CUE_TYPE.RESET);
		addEEnumLiteral(cuE_TYPEEEnum, net.sf.smbt.ezsequence.CUE_TYPE.TO_PREV);
		addEEnumLiteral(cuE_TYPEEEnum, net.sf.smbt.ezsequence.CUE_TYPE.TO_FIRST);
		addEEnumLiteral(cuE_TYPEEEnum, net.sf.smbt.ezsequence.CUE_TYPE.TO_NEXT);
		addEEnumLiteral(cuE_TYPEEEnum, net.sf.smbt.ezsequence.CUE_TYPE.FLIP);

		// Initialize data types
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(polylineEDataType, Polyline.class, "Polyline", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzsequencePackageImpl
