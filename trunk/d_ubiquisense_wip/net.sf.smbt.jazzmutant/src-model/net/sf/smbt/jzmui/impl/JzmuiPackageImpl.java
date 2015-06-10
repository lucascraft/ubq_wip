/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.ezlemur.EzlemurPackage;
import net.sf.smbt.ezlemur.impl.EzlemurPackageImpl;
import net.sf.smbt.jzmui.AbstractMidiVarNote;
import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JZConfigurationManager;
import net.sf.smbt.jzmui.JZContainer;
import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JZFader;
import net.sf.smbt.jzmui.JZGesture;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JZLemurMenu;
import net.sf.smbt.jzmui.JZLemurMonitor;
import net.sf.smbt.jzmui.JZMenuItem;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JZPads;
import net.sf.smbt.jzmui.JZRange;
import net.sf.smbt.jzmui.JZRingArea;
import net.sf.smbt.jzmui.JZSignalScope;
import net.sf.smbt.jzmui.JZSurfaceLCD;
import net.sf.smbt.jzmui.JZSwitches;
import net.sf.smbt.jzmui.JZTarget;
import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.jzmui.JZTrack;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.JZVar;
import net.sf.smbt.jzmui.JZWidget;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.JzKBTarget;
import net.sf.smbt.jzmui.JzMidiTarget;
import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzOscTarget;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiFactory;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KBDynaProperties;
import net.sf.smbt.jzmui.LemurIncomingPorts;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.smbt.jzmui.LemurPreferences;
import net.sf.smbt.jzmui.LemurTrigger;
import net.sf.smbt.jzmui.MidiDynaProperties;
import net.sf.smbt.jzmui.MidiVar;
import net.sf.smbt.jzmui.MidiVar80NoteOff;
import net.sf.smbt.jzmui.MidiVar90NoteOn;
import net.sf.smbt.jzmui.MidiVarA0KeyPressure;
import net.sf.smbt.jzmui.MidiVarB0ControlChange;
import net.sf.smbt.jzmui.MidiVarC0ProgramChange;
import net.sf.smbt.jzmui.MidiVarD0ChannelPressure;
import net.sf.smbt.jzmui.MidiVarE0PitchBend;
import net.sf.smbt.jzmui.MidiVarF0SystemExclusive;
import net.sf.smbt.jzmui.MidiVarF2SngPosition;
import net.sf.smbt.jzmui.MidiVarF3SongSelect;
import net.sf.smbt.jzmui.MidiVarF5BusSelect;
import net.sf.smbt.jzmui.MidiVarF6TuneRequest;
import net.sf.smbt.jzmui.MidiVarF8TimingTick;
import net.sf.smbt.jzmui.MidiVarFAStartSong;
import net.sf.smbt.jzmui.MidiVarFBContinueSong;
import net.sf.smbt.jzmui.MidiVarFCStopSong;
import net.sf.smbt.jzmui.MidiVarFEActiveSensing;
import net.sf.smbt.jzmui.MidiVarFFSystemReset;
import net.sf.smbt.jzmui.OSCDynaProperties;
import net.sf.smbt.jzmui.Script;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

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
import org.eclipse.swt.graphics.PathData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JzmuiPackageImpl extends EPackageImpl implements JzmuiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lemurLiveAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzuiElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzBreakPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzFaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzGestureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzKnobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzLedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzLemurMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzLemurMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzPadsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzSurfaceLCDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzSwitchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzCustomButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzSignalScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzMultiBallsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jZmultiSliderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzMenuItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzRingAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscDynaPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiDynaPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxDynaPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzJazzInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzOscTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzMidiTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzKBTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kbDynaPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzConfigurationManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzOscVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzMidiVarEClass = null;

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
	private EClass midiVar80NoteOffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVar90NoteOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarA0KeyPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarB0ControlChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarC0ProgramChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarD0ChannelPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarE0PitchBendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarF0SystemExclusiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarF2SngPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarF3SongSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarF5BusSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarF6TuneRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarF8TimingTickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarFAStartSongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarFBContinueSongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarFCStopSongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarFEActiveSensingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarFFSystemResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMidiVarNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lemurTriggerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lemurPreferencesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lemurIncomingPortsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum midI_MESSAGESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum knoB_STYLEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lemuR_STYLEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fonT_SIZEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum texT_ALIGNEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jzmL_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum breaK_POINT_PHYSICSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lemuR_OSC_TARGETEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lemuR_MIDI_TARGETEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum custoM_BUTTON_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum knoB_CURSOR_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum knoB_CONTROLEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum knoB_PHYSICSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fadeR_CURSOR_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fadeR_PHYSICSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiballS_CURSOR_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiballS_PHYSICSEEnum = null;

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
	private EDataType pointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathDataEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

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
	 * @see net.sf.smbt.jzmui.JzmuiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JzmuiPackageImpl() {
		super(eNS_URI, JzmuiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JzmuiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JzmuiPackage init() {
		if (isInited) return (JzmuiPackage)EPackage.Registry.INSTANCE.getEPackage(JzmuiPackage.eNS_URI);

		// Obtain or create and register package
		JzmuiPackageImpl theJzmuiPackage = (JzmuiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JzmuiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JzmuiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzdmxPackage.eINSTANCE.eClass();
		EzmidiPackage.eINSTANCE.eClass();
		OsccmdPackage.eINSTANCE.eClass();
		EnginePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		EzlemurPackageImpl theEzlemurPackage = (EzlemurPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EzlemurPackage.eNS_URI) instanceof EzlemurPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EzlemurPackage.eNS_URI) : EzlemurPackage.eINSTANCE);

		// Create package meta-data objects
		theJzmuiPackage.createPackageContents();
		theEzlemurPackage.createPackageContents();

		// Initialize created meta-data
		theJzmuiPackage.initializePackageContents();
		theEzlemurPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJzmuiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JzmuiPackage.eNS_URI, theJzmuiPackage);
		return theJzmuiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLemurLiveApp() {
		return lemurLiveAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLemurLiveApp_Width() {
		return (EAttribute)lemurLiveAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLemurLiveApp_Height() {
		return (EAttribute)lemurLiveAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLemurLiveApp_Id() {
		return (EAttribute)lemurLiveAppEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLemurLiveApp_Elements() {
		return (EReference)lemurLiveAppEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLemurLiveApp_Configurations() {
		return (EReference)lemurLiveAppEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZUIElem() {
		return jzuiElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZUIElem_FontStyle() {
		return (EAttribute)jzuiElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZUIElem_Bounds() {
		return (EAttribute)jzuiElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZUIElem_FontName() {
		return (EAttribute)jzuiElemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZUIElem_Name() {
		return (EAttribute)jzuiElemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZUIElem_OscProps() {
		return (EReference)jzuiElemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZUIElem_MidiProps() {
		return (EReference)jzuiElemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZUIElem_ParentTarget() {
		return (EAttribute)jzuiElemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZUIElem_Scripts() {
		return (EReference)jzuiElemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZUIElem_TargetFeatures() {
		return (EReference)jzuiElemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZContainer() {
		return jzContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZContainer_Children() {
		return (EReference)jzContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZWidget() {
		return jzWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZWidget_PrimaryOscTarget() {
		return (EAttribute)jzWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZWidget_PrimaryMidiTarget() {
		return (EAttribute)jzWidgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZBreakPoint() {
		return jzBreakPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_LiveEditing() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Points() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Coordinates() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Background() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_FirstPoint() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Light() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Friction() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Hold() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_HoldX() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_HoldY() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Attraction() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Edit() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Rest() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Speed() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Values() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_PathData() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Grid() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_GridX() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_GridY() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_FreeForm() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Physics() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Color() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_X() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZBreakPoint_Y() {
		return (EAttribute)jzBreakPointEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZFader() {
		return jzFaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Value() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Unit() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Precision() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Color() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Drag() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Friction() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Height() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Light() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Tension() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_ValueActive() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Label() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_GridActive() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_GridValue() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Attraction() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_CursorMode() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Physics() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Speed() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Capture() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_X() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZFader_Z() {
		return (EAttribute)jzFaderEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZGesture() {
		return jzGestureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZGesture_Transparent() {
		return (EAttribute)jzGestureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZGesture_Color() {
		return (EAttribute)jzGestureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZGesture_Angle() {
		return (EAttribute)jzGestureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZGesture_Pan() {
		return (EAttribute)jzGestureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZGesture_Pinch() {
		return (EAttribute)jzGestureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZKnob() {
		return jzKnobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_EndlessKnob() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Value() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Unit() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Precision() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Backgroud() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Foreground() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Attack() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Sustain() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Decay() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Release() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Hold() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Label() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_ValueActive() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Grid() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_CursorMode() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_ControlMode() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Physics() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Attraction() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Friction() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_Speed() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZKnob_X() {
		return (EAttribute)jzKnobEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZLed() {
		return jzLedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_Transparent() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_Value() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_Columns() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_Rows() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_Multicolor() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_Bargraph() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_ColorOff() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_ColorOn() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_Light() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLed_LabelActive() {
		return (EAttribute)jzLedEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZLemurMenu() {
		return jzLemurMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMenu_ScaleOutput() {
		return (EAttribute)jzLemurMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMenu_Transparent() {
		return (EAttribute)jzLemurMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMenu_Font() {
		return (EAttribute)jzLemurMenuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMenu_Color() {
		return (EAttribute)jzLemurMenuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZLemurMenu_Items() {
		return (EReference)jzLemurMenuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMenu_Selection() {
		return (EAttribute)jzLemurMenuEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZLemurMonitor() {
		return jzLemurMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMonitor_Value() {
		return (EAttribute)jzLemurMonitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMonitor_Unit() {
		return (EAttribute)jzLemurMonitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMonitor_Precision() {
		return (EAttribute)jzLemurMonitorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMonitor_Font() {
		return (EAttribute)jzLemurMonitorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMonitor_Transparent() {
		return (EAttribute)jzLemurMonitorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZLemurMonitor_Color() {
		return (EAttribute)jzLemurMonitorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZPads() {
		return jzPadsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Numbers() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Columns() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Rows() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Multilabel() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Multicolor() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_ColorOn() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_ColorOff() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Values() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Attack() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Decay() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Hold() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Light() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Release() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Sustain() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Color() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_LabelVisible() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Capture() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_X() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Friction() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Height() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZPads_Tension() {
		return (EAttribute)jzPadsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZSurfaceLCD() {
		return jzSurfaceLCDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSurfaceLCD_Transparent() {
		return (EAttribute)jzSurfaceLCDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSurfaceLCD_Target() {
		return (EAttribute)jzSurfaceLCDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSurfaceLCD_Display() {
		return (EAttribute)jzSurfaceLCDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSurfaceLCD_Font() {
		return (EAttribute)jzSurfaceLCDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSurfaceLCD_Top() {
		return (EAttribute)jzSurfaceLCDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSurfaceLCD_Bottom() {
		return (EAttribute)jzSurfaceLCDEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZSwitches() {
		return jzSwitchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Numbers() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Radio() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Columns() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Rows() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Multilabel() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Multicolor() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_ColorOn() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_ColorOff() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Light() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_LabelVisible() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Capture() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_Paint() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSwitches_X() {
		return (EAttribute)jzSwitchesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZText() {
		return jzTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZText_Text() {
		return (EAttribute)jzTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZText_Font() {
		return (EAttribute)jzTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZText_Transparent() {
		return (EAttribute)jzTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZText_Color() {
		return (EAttribute)jzTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZText_Light() {
		return (EAttribute)jzTextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZText_FontSize() {
		return (EAttribute)jzTextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZText_FontAlign() {
		return (EAttribute)jzTextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZCustomButton() {
		return jzCustomButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_Outline() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_StyleOff() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_StyleOnText() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_FontSize() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_Capture() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_Mode() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_X() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_StyleOn() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_ColorOff() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_ColorOn() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_Light() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_StyleOffText() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZCustomButton_TextAlign() {
		return (EAttribute)jzCustomButtonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZSignalScope() {
		return jzSignalScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_ModeXY() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Transparent() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Color() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Data() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Friction() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Height() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Light() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Tension() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_LabelVisible() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Xb() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Yb() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Timebase() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_X() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZSignalScope_Y() {
		return (EAttribute)jzSignalScopeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZRange() {
		return jzRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Horizontal() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Color() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Light() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_LabelVisible() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Capture() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Grid() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_GridValue() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Physics() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Tension() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Friction() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Min_height() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Max_height() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Drag() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_X() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRange_Height() {
		return (EAttribute)jzRangeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZMultiBalls() {
		return jzMultiBallsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Numbers() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Multilabel() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_MultiColor() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Data() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_NumbersVisible() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Balls() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Color() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_LabelVisible() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Physics() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_CursorMode() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Attraction() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Capture() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_GridActive() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Ephemeral() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_X() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Y() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Z() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Attack() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Decay() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Friction() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Hold() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_HoldX() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_HoldY() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Release() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Speed() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Sustain() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_GridStepX() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_GridStepY() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Height() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Light() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMultiBalls_Tension() {
		return (EAttribute)jzMultiBallsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZTrack() {
		return jzTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZTrack_ModeXY() {
		return (EAttribute)jzTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZTrack_Transparent() {
		return (EAttribute)jzTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZTrack_Color() {
		return (EAttribute)jzTrackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZmultiSlider() {
		return jZmultiSliderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Horizontal() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Bipolar() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Slider() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Gradient() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Multicolor() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Light() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Values() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Friction() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Tension() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Height() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_LabelVisible() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Color() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Physics() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_GridActive() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_Capture() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_GridValue() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZmultiSlider_X() {
		return (EAttribute)jZmultiSliderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZMenuItem() {
		return jzMenuItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZMenuItem_Label() {
		return (EAttribute)jzMenuItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZRingArea() {
		return jzRingAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Speed() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Friction() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Attraction() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Attraction_x() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Attraction_y() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Color() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_ValueActive() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Capture() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_X() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZRingArea_Y() {
		return (EAttribute)jzRingAreaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSCDynaProperties() {
		return oscDynaPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCDynaProperties_CustomOscMsg() {
		return (EAttribute)oscDynaPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCDynaProperties_LemurTrigger() {
		return (EAttribute)oscDynaPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCDynaProperties_EStructuralFeature() {
		return (EReference)oscDynaPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOSCDynaProperties_OscMsg() {
		return (EReference)oscDynaPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOSCDynaProperties_Target() {
		return (EAttribute)oscDynaPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiDynaProperties() {
		return midiDynaPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiDynaProperties_CustomMidiMsg() {
		return (EAttribute)midiDynaPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiDynaProperties_LemurTrigger() {
		return (EAttribute)midiDynaPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMidiDynaProperties_MidiMsg() {
		return (EReference)midiDynaPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMidiDynaProperties_EStructuralFeature() {
		return (EReference)midiDynaPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiDynaProperties_Target() {
		return (EAttribute)midiDynaPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXDynaProperties() {
		return dmxDynaPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXDynaProperties_DmxMsg() {
		return (EReference)dmxDynaPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXDynaProperties_EStructuralFeature() {
		return (EReference)dmxDynaPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXDynaProperties_CustomDmxMsg() {
		return (EAttribute)dmxDynaPropertiesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXDynaProperties_LemurTrigger() {
		return (EAttribute)dmxDynaPropertiesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXDynaProperties_Target() {
		return (EAttribute)dmxDynaPropertiesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZJazzInterface() {
		return jzJazzInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZJazzInterface_Width() {
		return (EAttribute)jzJazzInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZJazzInterface_Height() {
		return (EAttribute)jzJazzInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZJazzInterface_Mode() {
		return (EAttribute)jzJazzInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZJazzInterface_Orientation() {
		return (EAttribute)jzJazzInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZTarget() {
		return jzTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZTarget_Addr() {
		return (EAttribute)jzTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZTarget_IncomingPorts() {
		return (EAttribute)jzTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZTarget_Id() {
		return (EAttribute)jzTargetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJzOscTarget() {
		return jzOscTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJzMidiTarget() {
		return jzMidiTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJzKBTarget() {
		return jzKBTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKBDynaProperties() {
		return kbDynaPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKBDynaProperties_LemurTrigger() {
		return (EAttribute)kbDynaPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKBDynaProperties_Target() {
		return (EAttribute)kbDynaPropertiesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZConfigurationManager() {
		return jzConfigurationManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZConfigurationManager_KbTargets() {
		return (EReference)jzConfigurationManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZConfigurationManager_OscTargets() {
		return (EReference)jzConfigurationManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZConfigurationManager_MidiTargets() {
		return (EReference)jzConfigurationManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJzOscVar() {
		return jzOscVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJzOscVar_CustomAddress() {
		return (EAttribute)jzOscVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJzOscVar_CustomMsg() {
		return (EAttribute)jzOscVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJzOscVar_OscTarget() {
		return (EAttribute)jzOscVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZVar() {
		return jzVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZVar_Attribute() {
		return (EReference)jzVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJZVar_Trigger() {
		return (EAttribute)jzVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJzMidiVar() {
		return jzMidiVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJzMidiVar_MidiMessage() {
		return (EAttribute)jzMidiVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJzMidiVar_MidiTarget() {
		return (EAttribute)jzMidiVarEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getScript_Expr() {
		return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVar80NoteOff() {
		return midiVar80NoteOffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVar90NoteOn() {
		return midiVar90NoteOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarA0KeyPressure() {
		return midiVarA0KeyPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarB0ControlChange() {
		return midiVarB0ControlChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarC0ProgramChange() {
		return midiVarC0ProgramChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarD0ChannelPressure() {
		return midiVarD0ChannelPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarE0PitchBend() {
		return midiVarE0PitchBendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarF0SystemExclusive() {
		return midiVarF0SystemExclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarF2SngPosition() {
		return midiVarF2SngPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarF3SongSelect() {
		return midiVarF3SongSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarF5BusSelect() {
		return midiVarF5BusSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarF6TuneRequest() {
		return midiVarF6TuneRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarF8TimingTick() {
		return midiVarF8TimingTickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarFAStartSong() {
		return midiVarFAStartSongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarFBContinueSong() {
		return midiVarFBContinueSongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarFCStopSong() {
		return midiVarFCStopSongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarFEActiveSensing() {
		return midiVarFEActiveSensingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVarFFSystemReset() {
		return midiVarFFSystemResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMidiVarNote() {
		return abstractMidiVarNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMidiVarNote_PitchFrom() {
		return (EAttribute)abstractMidiVarNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMidiVarNote_PitchTo() {
		return (EAttribute)abstractMidiVarNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiVar() {
		return midiVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiVar_ScaleFrom() {
		return (EAttribute)midiVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiVar_ScaleTo() {
		return (EAttribute)midiVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiVar_ChannelFrom() {
		return (EAttribute)midiVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidiVar_ChannelTo() {
		return (EAttribute)midiVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLemurTrigger() {
		return lemurTriggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLemurPreferences() {
		return lemurPreferencesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLemurIncomingPorts() {
		return lemurIncomingPortsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMIDI_MESSAGES() {
		return midI_MESSAGESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKNOB_STYLE() {
		return knoB_STYLEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLEMUR_STYLE() {
		return lemuR_STYLEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFONT_SIZE() {
		return fonT_SIZEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTEXT_ALIGN() {
		return texT_ALIGNEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJZML_MODE() {
		return jzmL_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBREAK_POINT_PHYSICS() {
		return breaK_POINT_PHYSICSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLEMUR_OSC_TARGET() {
		return lemuR_OSC_TARGETEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLEMUR_MIDI_TARGET() {
		return lemuR_MIDI_TARGETEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCUSTOM_BUTTON_MODE() {
		return custoM_BUTTON_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKNOB_CURSOR_MODE() {
		return knoB_CURSOR_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKNOB_CONTROL() {
		return knoB_CONTROLEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKNOB_PHYSICS() {
		return knoB_PHYSICSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFADER_CURSOR_MODE() {
		return fadeR_CURSOR_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFADER_PHYSICS() {
		return fadeR_PHYSICSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMULTIBALLS_CURSOR_MODE() {
		return multiballS_CURSOR_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMULTIBALLS_PHYSICS() {
		return multiballS_PHYSICSEEnum;
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
	public EDataType getPoint() {
		return pointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathData() {
		return pathDataEDataType;
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
	public JzmuiFactory getJzmuiFactory() {
		return (JzmuiFactory)getEFactoryInstance();
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
		lemurLiveAppEClass = createEClass(LEMUR_LIVE_APP);
		createEAttribute(lemurLiveAppEClass, LEMUR_LIVE_APP__WIDTH);
		createEAttribute(lemurLiveAppEClass, LEMUR_LIVE_APP__HEIGHT);
		createEAttribute(lemurLiveAppEClass, LEMUR_LIVE_APP__ID);
		createEReference(lemurLiveAppEClass, LEMUR_LIVE_APP__ELEMENTS);
		createEReference(lemurLiveAppEClass, LEMUR_LIVE_APP__CONFIGURATIONS);

		jzuiElemEClass = createEClass(JZUI_ELEM);
		createEAttribute(jzuiElemEClass, JZUI_ELEM__FONT_STYLE);
		createEAttribute(jzuiElemEClass, JZUI_ELEM__BOUNDS);
		createEAttribute(jzuiElemEClass, JZUI_ELEM__FONT_NAME);
		createEAttribute(jzuiElemEClass, JZUI_ELEM__NAME);
		createEReference(jzuiElemEClass, JZUI_ELEM__OSC_PROPS);
		createEReference(jzuiElemEClass, JZUI_ELEM__MIDI_PROPS);
		createEAttribute(jzuiElemEClass, JZUI_ELEM__PARENT_TARGET);
		createEReference(jzuiElemEClass, JZUI_ELEM__SCRIPTS);
		createEReference(jzuiElemEClass, JZUI_ELEM__TARGET_FEATURES);

		jzContainerEClass = createEClass(JZ_CONTAINER);
		createEReference(jzContainerEClass, JZ_CONTAINER__CHILDREN);

		jzWidgetEClass = createEClass(JZ_WIDGET);
		createEAttribute(jzWidgetEClass, JZ_WIDGET__PRIMARY_OSC_TARGET);
		createEAttribute(jzWidgetEClass, JZ_WIDGET__PRIMARY_MIDI_TARGET);

		jzBreakPointEClass = createEClass(JZ_BREAK_POINT);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__LIVE_EDITING);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__POINTS);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__COORDINATES);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__BACKGROUND);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__FIRST_POINT);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__LIGHT);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__FRICTION);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__HOLD);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__HOLD_X);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__HOLD_Y);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__ATTRACTION);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__EDIT);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__REST);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__SPEED);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__VALUES);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__PATH_DATA);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__GRID);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__GRID_X);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__GRID_Y);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__FREE_FORM);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__PHYSICS);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__COLOR);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__X);
		createEAttribute(jzBreakPointEClass, JZ_BREAK_POINT__Y);

		jzFaderEClass = createEClass(JZ_FADER);
		createEAttribute(jzFaderEClass, JZ_FADER__VALUE);
		createEAttribute(jzFaderEClass, JZ_FADER__UNIT);
		createEAttribute(jzFaderEClass, JZ_FADER__PRECISION);
		createEAttribute(jzFaderEClass, JZ_FADER__COLOR);
		createEAttribute(jzFaderEClass, JZ_FADER__DRAG);
		createEAttribute(jzFaderEClass, JZ_FADER__FRICTION);
		createEAttribute(jzFaderEClass, JZ_FADER__HEIGHT);
		createEAttribute(jzFaderEClass, JZ_FADER__LIGHT);
		createEAttribute(jzFaderEClass, JZ_FADER__TENSION);
		createEAttribute(jzFaderEClass, JZ_FADER__VALUE_ACTIVE);
		createEAttribute(jzFaderEClass, JZ_FADER__LABEL);
		createEAttribute(jzFaderEClass, JZ_FADER__GRID_ACTIVE);
		createEAttribute(jzFaderEClass, JZ_FADER__GRID_VALUE);
		createEAttribute(jzFaderEClass, JZ_FADER__ATTRACTION);
		createEAttribute(jzFaderEClass, JZ_FADER__CURSOR_MODE);
		createEAttribute(jzFaderEClass, JZ_FADER__PHYSICS);
		createEAttribute(jzFaderEClass, JZ_FADER__SPEED);
		createEAttribute(jzFaderEClass, JZ_FADER__CAPTURE);
		createEAttribute(jzFaderEClass, JZ_FADER__X);
		createEAttribute(jzFaderEClass, JZ_FADER__Z);

		jzGestureEClass = createEClass(JZ_GESTURE);
		createEAttribute(jzGestureEClass, JZ_GESTURE__TRANSPARENT);
		createEAttribute(jzGestureEClass, JZ_GESTURE__COLOR);
		createEAttribute(jzGestureEClass, JZ_GESTURE__ANGLE);
		createEAttribute(jzGestureEClass, JZ_GESTURE__PAN);
		createEAttribute(jzGestureEClass, JZ_GESTURE__PINCH);

		jzKnobEClass = createEClass(JZ_KNOB);
		createEAttribute(jzKnobEClass, JZ_KNOB__ENDLESS_KNOB);
		createEAttribute(jzKnobEClass, JZ_KNOB__VALUE);
		createEAttribute(jzKnobEClass, JZ_KNOB__UNIT);
		createEAttribute(jzKnobEClass, JZ_KNOB__PRECISION);
		createEAttribute(jzKnobEClass, JZ_KNOB__BACKGROUD);
		createEAttribute(jzKnobEClass, JZ_KNOB__FOREGROUND);
		createEAttribute(jzKnobEClass, JZ_KNOB__ATTACK);
		createEAttribute(jzKnobEClass, JZ_KNOB__SUSTAIN);
		createEAttribute(jzKnobEClass, JZ_KNOB__DECAY);
		createEAttribute(jzKnobEClass, JZ_KNOB__RELEASE);
		createEAttribute(jzKnobEClass, JZ_KNOB__HOLD);
		createEAttribute(jzKnobEClass, JZ_KNOB__LABEL);
		createEAttribute(jzKnobEClass, JZ_KNOB__VALUE_ACTIVE);
		createEAttribute(jzKnobEClass, JZ_KNOB__GRID);
		createEAttribute(jzKnobEClass, JZ_KNOB__CURSOR_MODE);
		createEAttribute(jzKnobEClass, JZ_KNOB__CONTROL_MODE);
		createEAttribute(jzKnobEClass, JZ_KNOB__PHYSICS);
		createEAttribute(jzKnobEClass, JZ_KNOB__ATTRACTION);
		createEAttribute(jzKnobEClass, JZ_KNOB__FRICTION);
		createEAttribute(jzKnobEClass, JZ_KNOB__SPEED);
		createEAttribute(jzKnobEClass, JZ_KNOB__X);

		jzLedEClass = createEClass(JZ_LED);
		createEAttribute(jzLedEClass, JZ_LED__TRANSPARENT);
		createEAttribute(jzLedEClass, JZ_LED__VALUE);
		createEAttribute(jzLedEClass, JZ_LED__COLUMNS);
		createEAttribute(jzLedEClass, JZ_LED__ROWS);
		createEAttribute(jzLedEClass, JZ_LED__MULTICOLOR);
		createEAttribute(jzLedEClass, JZ_LED__BARGRAPH);
		createEAttribute(jzLedEClass, JZ_LED__COLOR_OFF);
		createEAttribute(jzLedEClass, JZ_LED__COLOR_ON);
		createEAttribute(jzLedEClass, JZ_LED__LIGHT);
		createEAttribute(jzLedEClass, JZ_LED__LABEL_ACTIVE);

		jzLemurMenuEClass = createEClass(JZ_LEMUR_MENU);
		createEAttribute(jzLemurMenuEClass, JZ_LEMUR_MENU__SCALE_OUTPUT);
		createEAttribute(jzLemurMenuEClass, JZ_LEMUR_MENU__TRANSPARENT);
		createEAttribute(jzLemurMenuEClass, JZ_LEMUR_MENU__FONT);
		createEAttribute(jzLemurMenuEClass, JZ_LEMUR_MENU__COLOR);
		createEReference(jzLemurMenuEClass, JZ_LEMUR_MENU__ITEMS);
		createEAttribute(jzLemurMenuEClass, JZ_LEMUR_MENU__SELECTION);

		jzLemurMonitorEClass = createEClass(JZ_LEMUR_MONITOR);
		createEAttribute(jzLemurMonitorEClass, JZ_LEMUR_MONITOR__VALUE);
		createEAttribute(jzLemurMonitorEClass, JZ_LEMUR_MONITOR__UNIT);
		createEAttribute(jzLemurMonitorEClass, JZ_LEMUR_MONITOR__PRECISION);
		createEAttribute(jzLemurMonitorEClass, JZ_LEMUR_MONITOR__FONT);
		createEAttribute(jzLemurMonitorEClass, JZ_LEMUR_MONITOR__TRANSPARENT);
		createEAttribute(jzLemurMonitorEClass, JZ_LEMUR_MONITOR__COLOR);

		jzPadsEClass = createEClass(JZ_PADS);
		createEAttribute(jzPadsEClass, JZ_PADS__NUMBERS);
		createEAttribute(jzPadsEClass, JZ_PADS__COLUMNS);
		createEAttribute(jzPadsEClass, JZ_PADS__ROWS);
		createEAttribute(jzPadsEClass, JZ_PADS__MULTILABEL);
		createEAttribute(jzPadsEClass, JZ_PADS__MULTICOLOR);
		createEAttribute(jzPadsEClass, JZ_PADS__COLOR_ON);
		createEAttribute(jzPadsEClass, JZ_PADS__COLOR_OFF);
		createEAttribute(jzPadsEClass, JZ_PADS__VALUES);
		createEAttribute(jzPadsEClass, JZ_PADS__ATTACK);
		createEAttribute(jzPadsEClass, JZ_PADS__DECAY);
		createEAttribute(jzPadsEClass, JZ_PADS__HOLD);
		createEAttribute(jzPadsEClass, JZ_PADS__LIGHT);
		createEAttribute(jzPadsEClass, JZ_PADS__RELEASE);
		createEAttribute(jzPadsEClass, JZ_PADS__SUSTAIN);
		createEAttribute(jzPadsEClass, JZ_PADS__COLOR);
		createEAttribute(jzPadsEClass, JZ_PADS__LABEL_VISIBLE);
		createEAttribute(jzPadsEClass, JZ_PADS__CAPTURE);
		createEAttribute(jzPadsEClass, JZ_PADS__X);
		createEAttribute(jzPadsEClass, JZ_PADS__FRICTION);
		createEAttribute(jzPadsEClass, JZ_PADS__HEIGHT);
		createEAttribute(jzPadsEClass, JZ_PADS__TENSION);

		jzSurfaceLCDEClass = createEClass(JZ_SURFACE_LCD);
		createEAttribute(jzSurfaceLCDEClass, JZ_SURFACE_LCD__TRANSPARENT);
		createEAttribute(jzSurfaceLCDEClass, JZ_SURFACE_LCD__TARGET);
		createEAttribute(jzSurfaceLCDEClass, JZ_SURFACE_LCD__DISPLAY);
		createEAttribute(jzSurfaceLCDEClass, JZ_SURFACE_LCD__FONT);
		createEAttribute(jzSurfaceLCDEClass, JZ_SURFACE_LCD__TOP);
		createEAttribute(jzSurfaceLCDEClass, JZ_SURFACE_LCD__BOTTOM);

		jzSwitchesEClass = createEClass(JZ_SWITCHES);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__NUMBERS);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__RADIO);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__COLUMNS);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__ROWS);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__MULTILABEL);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__MULTICOLOR);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__COLOR_ON);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__COLOR_OFF);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__LIGHT);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__LABEL_VISIBLE);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__CAPTURE);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__PAINT);
		createEAttribute(jzSwitchesEClass, JZ_SWITCHES__X);

		jzTextEClass = createEClass(JZ_TEXT);
		createEAttribute(jzTextEClass, JZ_TEXT__TEXT);
		createEAttribute(jzTextEClass, JZ_TEXT__FONT);
		createEAttribute(jzTextEClass, JZ_TEXT__TRANSPARENT);
		createEAttribute(jzTextEClass, JZ_TEXT__COLOR);
		createEAttribute(jzTextEClass, JZ_TEXT__LIGHT);
		createEAttribute(jzTextEClass, JZ_TEXT__FONT_SIZE);
		createEAttribute(jzTextEClass, JZ_TEXT__FONT_ALIGN);

		jzCustomButtonEClass = createEClass(JZ_CUSTOM_BUTTON);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__OUTLINE);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__COLOR_OFF);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__COLOR_ON);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__LIGHT);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__STYLE_OFF_TEXT);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__TEXT_ALIGN);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__STYLE_ON);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__STYLE_OFF);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__STYLE_ON_TEXT);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__FONT_SIZE);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__CAPTURE);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__MODE);
		createEAttribute(jzCustomButtonEClass, JZ_CUSTOM_BUTTON__X);

		jzSignalScopeEClass = createEClass(JZ_SIGNAL_SCOPE);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__MODE_XY);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__TRANSPARENT);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__COLOR);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__DATA);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__FRICTION);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__HEIGHT);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__LIGHT);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__TENSION);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__LABEL_VISIBLE);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__XB);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__YB);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__TIMEBASE);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__X);
		createEAttribute(jzSignalScopeEClass, JZ_SIGNAL_SCOPE__Y);

		jzRangeEClass = createEClass(JZ_RANGE);
		createEAttribute(jzRangeEClass, JZ_RANGE__HORIZONTAL);
		createEAttribute(jzRangeEClass, JZ_RANGE__COLOR);
		createEAttribute(jzRangeEClass, JZ_RANGE__LIGHT);
		createEAttribute(jzRangeEClass, JZ_RANGE__LABEL_VISIBLE);
		createEAttribute(jzRangeEClass, JZ_RANGE__CAPTURE);
		createEAttribute(jzRangeEClass, JZ_RANGE__GRID);
		createEAttribute(jzRangeEClass, JZ_RANGE__GRID_VALUE);
		createEAttribute(jzRangeEClass, JZ_RANGE__PHYSICS);
		createEAttribute(jzRangeEClass, JZ_RANGE__TENSION);
		createEAttribute(jzRangeEClass, JZ_RANGE__FRICTION);
		createEAttribute(jzRangeEClass, JZ_RANGE__MIN_HEIGHT);
		createEAttribute(jzRangeEClass, JZ_RANGE__MAX_HEIGHT);
		createEAttribute(jzRangeEClass, JZ_RANGE__DRAG);
		createEAttribute(jzRangeEClass, JZ_RANGE__X);
		createEAttribute(jzRangeEClass, JZ_RANGE__HEIGHT);

		jzMultiBallsEClass = createEClass(JZ_MULTI_BALLS);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__NUMBERS);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__MULTILABEL);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__MULTI_COLOR);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__X);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__Y);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__Z);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__ATTACK);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__DECAY);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__FRICTION);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__HOLD);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__HOLD_X);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__HOLD_Y);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__RELEASE);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__SPEED);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__SUSTAIN);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__GRID_STEP_X);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__GRID_STEP_Y);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__HEIGHT);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__LIGHT);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__TENSION);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__DATA);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__NUMBERS_VISIBLE);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__BALLS);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__COLOR);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__LABEL_VISIBLE);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__PHYSICS);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__CURSOR_MODE);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__ATTRACTION);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__CAPTURE);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__GRID_ACTIVE);
		createEAttribute(jzMultiBallsEClass, JZ_MULTI_BALLS__EPHEMERAL);

		jzTrackEClass = createEClass(JZ_TRACK);
		createEAttribute(jzTrackEClass, JZ_TRACK__MODE_XY);
		createEAttribute(jzTrackEClass, JZ_TRACK__TRANSPARENT);
		createEAttribute(jzTrackEClass, JZ_TRACK__COLOR);

		jZmultiSliderEClass = createEClass(JZMULTI_SLIDER);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__HORIZONTAL);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__BIPOLAR);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__SLIDER);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__GRADIENT);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__MULTICOLOR);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__LIGHT);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__VALUES);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__FRICTION);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__TENSION);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__HEIGHT);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__LABEL_VISIBLE);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__COLOR);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__PHYSICS);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__GRID_ACTIVE);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__CAPTURE);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__GRID_VALUE);
		createEAttribute(jZmultiSliderEClass, JZMULTI_SLIDER__X);

		jzMenuItemEClass = createEClass(JZ_MENU_ITEM);
		createEAttribute(jzMenuItemEClass, JZ_MENU_ITEM__LABEL);

		jzRingAreaEClass = createEClass(JZ_RING_AREA);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__SPEED);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__FRICTION);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__ATTRACTION);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__ATTRACTION_X);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__ATTRACTION_Y);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__COLOR);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__VALUE_ACTIVE);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__CAPTURE);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__X);
		createEAttribute(jzRingAreaEClass, JZ_RING_AREA__Y);

		oscDynaPropertiesEClass = createEClass(OSC_DYNA_PROPERTIES);
		createEAttribute(oscDynaPropertiesEClass, OSC_DYNA_PROPERTIES__CUSTOM_OSC_MSG);
		createEAttribute(oscDynaPropertiesEClass, OSC_DYNA_PROPERTIES__LEMUR_TRIGGER);
		createEReference(oscDynaPropertiesEClass, OSC_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE);
		createEReference(oscDynaPropertiesEClass, OSC_DYNA_PROPERTIES__OSC_MSG);
		createEAttribute(oscDynaPropertiesEClass, OSC_DYNA_PROPERTIES__TARGET);

		midiDynaPropertiesEClass = createEClass(MIDI_DYNA_PROPERTIES);
		createEAttribute(midiDynaPropertiesEClass, MIDI_DYNA_PROPERTIES__CUSTOM_MIDI_MSG);
		createEAttribute(midiDynaPropertiesEClass, MIDI_DYNA_PROPERTIES__LEMUR_TRIGGER);
		createEReference(midiDynaPropertiesEClass, MIDI_DYNA_PROPERTIES__MIDI_MSG);
		createEReference(midiDynaPropertiesEClass, MIDI_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE);
		createEAttribute(midiDynaPropertiesEClass, MIDI_DYNA_PROPERTIES__TARGET);

		dmxDynaPropertiesEClass = createEClass(DMX_DYNA_PROPERTIES);
		createEReference(dmxDynaPropertiesEClass, DMX_DYNA_PROPERTIES__DMX_MSG);
		createEReference(dmxDynaPropertiesEClass, DMX_DYNA_PROPERTIES__ESTRUCTURAL_FEATURE);
		createEAttribute(dmxDynaPropertiesEClass, DMX_DYNA_PROPERTIES__CUSTOM_DMX_MSG);
		createEAttribute(dmxDynaPropertiesEClass, DMX_DYNA_PROPERTIES__LEMUR_TRIGGER);
		createEAttribute(dmxDynaPropertiesEClass, DMX_DYNA_PROPERTIES__TARGET);

		jzJazzInterfaceEClass = createEClass(JZ_JAZZ_INTERFACE);
		createEAttribute(jzJazzInterfaceEClass, JZ_JAZZ_INTERFACE__WIDTH);
		createEAttribute(jzJazzInterfaceEClass, JZ_JAZZ_INTERFACE__HEIGHT);
		createEAttribute(jzJazzInterfaceEClass, JZ_JAZZ_INTERFACE__MODE);
		createEAttribute(jzJazzInterfaceEClass, JZ_JAZZ_INTERFACE__ORIENTATION);

		jzTargetEClass = createEClass(JZ_TARGET);
		createEAttribute(jzTargetEClass, JZ_TARGET__ADDR);
		createEAttribute(jzTargetEClass, JZ_TARGET__INCOMING_PORTS);
		createEAttribute(jzTargetEClass, JZ_TARGET__ID);

		jzOscTargetEClass = createEClass(JZ_OSC_TARGET);

		jzMidiTargetEClass = createEClass(JZ_MIDI_TARGET);

		jzKBTargetEClass = createEClass(JZ_KB_TARGET);

		kbDynaPropertiesEClass = createEClass(KB_DYNA_PROPERTIES);
		createEAttribute(kbDynaPropertiesEClass, KB_DYNA_PROPERTIES__LEMUR_TRIGGER);
		createEAttribute(kbDynaPropertiesEClass, KB_DYNA_PROPERTIES__TARGET);

		jzConfigurationManagerEClass = createEClass(JZ_CONFIGURATION_MANAGER);
		createEReference(jzConfigurationManagerEClass, JZ_CONFIGURATION_MANAGER__KB_TARGETS);
		createEReference(jzConfigurationManagerEClass, JZ_CONFIGURATION_MANAGER__OSC_TARGETS);
		createEReference(jzConfigurationManagerEClass, JZ_CONFIGURATION_MANAGER__MIDI_TARGETS);

		jzOscVarEClass = createEClass(JZ_OSC_VAR);
		createEAttribute(jzOscVarEClass, JZ_OSC_VAR__CUSTOM_ADDRESS);
		createEAttribute(jzOscVarEClass, JZ_OSC_VAR__CUSTOM_MSG);
		createEAttribute(jzOscVarEClass, JZ_OSC_VAR__OSC_TARGET);

		jzVarEClass = createEClass(JZ_VAR);
		createEReference(jzVarEClass, JZ_VAR__ATTRIBUTE);
		createEAttribute(jzVarEClass, JZ_VAR__TRIGGER);

		jzMidiVarEClass = createEClass(JZ_MIDI_VAR);
		createEAttribute(jzMidiVarEClass, JZ_MIDI_VAR__MIDI_MESSAGE);
		createEAttribute(jzMidiVarEClass, JZ_MIDI_VAR__MIDI_TARGET);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__EXPR);

		midiVar80NoteOffEClass = createEClass(MIDI_VAR80_NOTE_OFF);

		midiVar90NoteOnEClass = createEClass(MIDI_VAR90_NOTE_ON);

		midiVarA0KeyPressureEClass = createEClass(MIDI_VAR_A0_KEY_PRESSURE);

		midiVarB0ControlChangeEClass = createEClass(MIDI_VAR_B0_CONTROL_CHANGE);

		midiVarC0ProgramChangeEClass = createEClass(MIDI_VAR_C0_PROGRAM_CHANGE);

		midiVarD0ChannelPressureEClass = createEClass(MIDI_VAR_D0_CHANNEL_PRESSURE);

		midiVarE0PitchBendEClass = createEClass(MIDI_VAR_E0_PITCH_BEND);

		midiVarF0SystemExclusiveEClass = createEClass(MIDI_VAR_F0_SYSTEM_EXCLUSIVE);

		midiVarF2SngPositionEClass = createEClass(MIDI_VAR_F2_SNG_POSITION);

		midiVarF3SongSelectEClass = createEClass(MIDI_VAR_F3_SONG_SELECT);

		midiVarF5BusSelectEClass = createEClass(MIDI_VAR_F5_BUS_SELECT);

		midiVarF6TuneRequestEClass = createEClass(MIDI_VAR_F6_TUNE_REQUEST);

		midiVarF8TimingTickEClass = createEClass(MIDI_VAR_F8_TIMING_TICK);

		midiVarFAStartSongEClass = createEClass(MIDI_VAR_FA_START_SONG);

		midiVarFBContinueSongEClass = createEClass(MIDI_VAR_FB_CONTINUE_SONG);

		midiVarFCStopSongEClass = createEClass(MIDI_VAR_FC_STOP_SONG);

		midiVarFEActiveSensingEClass = createEClass(MIDI_VAR_FE_ACTIVE_SENSING);

		midiVarFFSystemResetEClass = createEClass(MIDI_VAR_FF_SYSTEM_RESET);

		abstractMidiVarNoteEClass = createEClass(ABSTRACT_MIDI_VAR_NOTE);
		createEAttribute(abstractMidiVarNoteEClass, ABSTRACT_MIDI_VAR_NOTE__PITCH_FROM);
		createEAttribute(abstractMidiVarNoteEClass, ABSTRACT_MIDI_VAR_NOTE__PITCH_TO);

		midiVarEClass = createEClass(MIDI_VAR);
		createEAttribute(midiVarEClass, MIDI_VAR__SCALE_FROM);
		createEAttribute(midiVarEClass, MIDI_VAR__SCALE_TO);
		createEAttribute(midiVarEClass, MIDI_VAR__CHANNEL_FROM);
		createEAttribute(midiVarEClass, MIDI_VAR__CHANNEL_TO);

		// Create enums
		lemurTriggerEEnum = createEEnum(LEMUR_TRIGGER);
		lemurPreferencesEEnum = createEEnum(LEMUR_PREFERENCES);
		lemurIncomingPortsEEnum = createEEnum(LEMUR_INCOMING_PORTS);
		midI_MESSAGESEEnum = createEEnum(MIDI_MESSAGES);
		knoB_STYLEEEnum = createEEnum(KNOB_STYLE);
		lemuR_STYLEEEnum = createEEnum(LEMUR_STYLE);
		fonT_SIZEEEnum = createEEnum(FONT_SIZE);
		texT_ALIGNEEnum = createEEnum(TEXT_ALIGN);
		jzmL_MODEEEnum = createEEnum(JZML_MODE);
		breaK_POINT_PHYSICSEEnum = createEEnum(BREAK_POINT_PHYSICS);
		lemuR_OSC_TARGETEEnum = createEEnum(LEMUR_OSC_TARGET);
		lemuR_MIDI_TARGETEEnum = createEEnum(LEMUR_MIDI_TARGET);
		custoM_BUTTON_MODEEEnum = createEEnum(CUSTOM_BUTTON_MODE);
		knoB_CURSOR_MODEEEnum = createEEnum(KNOB_CURSOR_MODE);
		knoB_CONTROLEEnum = createEEnum(KNOB_CONTROL);
		knoB_PHYSICSEEnum = createEEnum(KNOB_PHYSICS);
		fadeR_CURSOR_MODEEEnum = createEEnum(FADER_CURSOR_MODE);
		fadeR_PHYSICSEEnum = createEEnum(FADER_PHYSICS);
		multiballS_CURSOR_MODEEEnum = createEEnum(MULTIBALLS_CURSOR_MODE);
		multiballS_PHYSICSEEnum = createEEnum(MULTIBALLS_PHYSICS);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		pointEDataType = createEDataType(POINT);
		pathDataEDataType = createEDataType(PATH_DATA);
		colorEDataType = createEDataType(COLOR);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EzlemurPackage theEzlemurPackage = (EzlemurPackage)EPackage.Registry.INSTANCE.getEPackage(EzlemurPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lemurLiveAppEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());
		jzContainerEClass.getESuperTypes().add(this.getJZUIElem());
		jzWidgetEClass.getESuperTypes().add(this.getJZUIElem());
		jzBreakPointEClass.getESuperTypes().add(this.getJZWidget());
		jzFaderEClass.getESuperTypes().add(this.getJZWidget());
		jzGestureEClass.getESuperTypes().add(this.getJZWidget());
		jzKnobEClass.getESuperTypes().add(this.getJZWidget());
		jzLedEClass.getESuperTypes().add(this.getJZWidget());
		jzLemurMenuEClass.getESuperTypes().add(this.getJZWidget());
		jzLemurMonitorEClass.getESuperTypes().add(this.getJZWidget());
		jzPadsEClass.getESuperTypes().add(this.getJZWidget());
		jzSurfaceLCDEClass.getESuperTypes().add(this.getJZWidget());
		jzSwitchesEClass.getESuperTypes().add(this.getJZWidget());
		jzTextEClass.getESuperTypes().add(this.getJZWidget());
		jzCustomButtonEClass.getESuperTypes().add(this.getJZWidget());
		jzSignalScopeEClass.getESuperTypes().add(this.getJZWidget());
		jzRangeEClass.getESuperTypes().add(this.getJZWidget());
		jzMultiBallsEClass.getESuperTypes().add(this.getJZWidget());
		jzTrackEClass.getESuperTypes().add(this.getJZWidget());
		jZmultiSliderEClass.getESuperTypes().add(this.getJZWidget());
		jzRingAreaEClass.getESuperTypes().add(this.getJZWidget());
		jzJazzInterfaceEClass.getESuperTypes().add(this.getJZContainer());
		jzOscTargetEClass.getESuperTypes().add(this.getJZTarget());
		jzMidiTargetEClass.getESuperTypes().add(this.getJZTarget());
		jzKBTargetEClass.getESuperTypes().add(this.getJZTarget());
		jzOscVarEClass.getESuperTypes().add(this.getJZVar());
		jzMidiVarEClass.getESuperTypes().add(this.getJZVar());
		midiVar80NoteOffEClass.getESuperTypes().add(this.getAbstractMidiVarNote());
		midiVar90NoteOnEClass.getESuperTypes().add(this.getAbstractMidiVarNote());
		abstractMidiVarNoteEClass.getESuperTypes().add(this.getMidiVar());

		// Initialize classes and features; add operations and parameters
		initEClass(lemurLiveAppEClass, LemurLiveApp.class, "LemurLiveApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLemurLiveApp_Width(), ecorePackage.getEInt(), "width", null, 0, 1, LemurLiveApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLemurLiveApp_Height(), ecorePackage.getEInt(), "height", null, 0, 1, LemurLiveApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLemurLiveApp_Id(), ecorePackage.getEInt(), "id", null, 0, 1, LemurLiveApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLemurLiveApp_Elements(), this.getJZUIElem(), null, "elements", null, 0, -1, LemurLiveApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLemurLiveApp_Configurations(), this.getJZConfigurationManager(), null, "configurations", null, 0, 1, LemurLiveApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzuiElemEClass, JZUIElem.class, "JZUIElem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZUIElem_FontStyle(), theEcorePackage.getEInt(), "fontStyle", null, 0, 1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZUIElem_Bounds(), this.getRectangle(), "bounds", null, 0, 1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZUIElem_FontName(), theEcorePackage.getEString(), "fontName", null, 0, 1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZUIElem_Name(), ecorePackage.getEString(), "name", null, 0, 1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZUIElem_OscProps(), this.getJzOscVar(), null, "oscProps", null, 0, -1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZUIElem_MidiProps(), this.getJzMidiVar(), null, "midiProps", null, 0, -1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZUIElem_ParentTarget(), this.getLemurPreferences(), "parentTarget", null, 0, 1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZUIElem_Scripts(), this.getScript(), null, "scripts", null, 0, -1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZUIElem_TargetFeatures(), theEcorePackage.getEStructuralFeature(), null, "targetFeatures", null, 0, -1, JZUIElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzContainerEClass, JZContainer.class, "JZContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJZContainer_Children(), this.getJZUIElem(), null, "children", null, 0, -1, JZContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzWidgetEClass, JZWidget.class, "JZWidget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZWidget_PrimaryOscTarget(), this.getLEMUR_OSC_TARGET(), "primaryOscTarget", null, 0, 1, JZWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZWidget_PrimaryMidiTarget(), this.getLEMUR_MIDI_TARGET(), "primaryMidiTarget", null, 0, 1, JZWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzBreakPointEClass, JZBreakPoint.class, "JZBreakPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZBreakPoint_LiveEditing(), ecorePackage.getEBoolean(), "liveEditing", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Points(), ecorePackage.getEInt(), "points", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Coordinates(), ecorePackage.getEBoolean(), "coordinates", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Background(), this.getColor(), "background", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_FirstPoint(), ecorePackage.getEInt(), "firstPoint", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Hold(), theEcorePackage.getEFloat(), "hold", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_HoldX(), theEcorePackage.getEFloat(), "holdX", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_HoldY(), theEcorePackage.getEFloat(), "holdY", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Attraction(), theEcorePackage.getEFloat(), "attraction", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Edit(), theEcorePackage.getEFloat(), "edit", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Rest(), theEcorePackage.getEFloat(), "rest", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Speed(), theEcorePackage.getEFloat(), "speed", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Values(), theEcorePackage.getEFloat(), "values", null, 0, -1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_PathData(), this.getPathData(), "pathData", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Grid(), theEcorePackage.getEBoolean(), "grid", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_GridX(), theEcorePackage.getEInt(), "gridX", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_GridY(), theEcorePackage.getEInt(), "gridY", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_FreeForm(), theEcorePackage.getEBoolean(), "freeForm", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Physics(), this.getBREAK_POINT_PHYSICS(), "physics", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Color(), this.getColor(), "color", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZBreakPoint_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, JZBreakPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzFaderEClass, JZFader.class, "JZFader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZFader_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Color(), this.getColor(), "color", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Drag(), theEcorePackage.getEFloat(), "drag", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Height(), theEcorePackage.getEFloat(), "height", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Tension(), theEcorePackage.getEFloat(), "tension", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_ValueActive(), theEcorePackage.getEBoolean(), "valueActive", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Label(), theEcorePackage.getEBoolean(), "label", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_GridActive(), theEcorePackage.getEBoolean(), "gridActive", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_GridValue(), theEcorePackage.getEInt(), "gridValue", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Attraction(), theEcorePackage.getEFloat(), "attraction", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_CursorMode(), this.getFADER_CURSOR_MODE(), "cursorMode", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Physics(), this.getFADER_PHYSICS(), "Physics", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Speed(), theEcorePackage.getEFloat(), "speed", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZFader_Z(), theEcorePackage.getEInt(), "z", null, 0, 1, JZFader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzGestureEClass, JZGesture.class, "JZGesture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZGesture_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZGesture_Color(), this.getColor(), "color", null, 0, 1, JZGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZGesture_Angle(), theEcorePackage.getEFloat(), "angle", null, 0, 1, JZGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZGesture_Pan(), theEcorePackage.getEFloat(), "pan", null, 0, 1, JZGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZGesture_Pinch(), theEcorePackage.getEFloat(), "pinch", null, 0, 1, JZGesture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzKnobEClass, JZKnob.class, "JZKnob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZKnob_EndlessKnob(), ecorePackage.getEBoolean(), "endlessKnob", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Precision(), ecorePackage.getEFloat(), "precision", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Backgroud(), this.getColor(), "backgroud", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Foreground(), this.getColor(), "foreground", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Attack(), theEcorePackage.getEFloat(), "attack", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Sustain(), theEcorePackage.getEFloat(), "sustain", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Decay(), theEcorePackage.getEFloat(), "decay", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Release(), theEcorePackage.getEFloat(), "release", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Hold(), theEcorePackage.getEFloat(), "hold", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Label(), theEcorePackage.getEBoolean(), "label", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_ValueActive(), theEcorePackage.getEBoolean(), "valueActive", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Grid(), theEcorePackage.getEBoolean(), "grid", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_CursorMode(), this.getKNOB_CURSOR_MODE(), "cursorMode", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_ControlMode(), this.getKNOB_CONTROL(), "controlMode", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Physics(), this.getKNOB_PHYSICS(), "physics", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Attraction(), theEcorePackage.getEFloat(), "attraction", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_Speed(), theEcorePackage.getEFloat(), "speed", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZKnob_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZKnob.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzLedEClass, JZLed.class, "JZLed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZLed_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_Rows(), ecorePackage.getEInt(), "rows", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_Multicolor(), ecorePackage.getEBoolean(), "multicolor", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_Bargraph(), ecorePackage.getEBoolean(), "bargraph", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_ColorOff(), this.getColor(), "colorOff", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_ColorOn(), this.getColor(), "colorOn", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLed_LabelActive(), theEcorePackage.getEBoolean(), "labelActive", null, 0, 1, JZLed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzLemurMenuEClass, JZLemurMenu.class, "JZLemurMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZLemurMenu_ScaleOutput(), ecorePackage.getEBoolean(), "scaleOutput", null, 0, 1, JZLemurMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMenu_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZLemurMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMenu_Font(), ecorePackage.getEString(), "font", null, 0, 1, JZLemurMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMenu_Color(), this.getColor(), "color", null, 0, 1, JZLemurMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZLemurMenu_Items(), this.getJZMenuItem(), null, "items", null, 0, -1, JZLemurMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMenu_Selection(), theEcorePackage.getEInt(), "selection", null, 0, 1, JZLemurMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzLemurMonitorEClass, JZLemurMonitor.class, "JZLemurMonitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZLemurMonitor_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, JZLemurMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMonitor_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, JZLemurMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMonitor_Precision(), ecorePackage.getEInt(), "precision", null, 0, 1, JZLemurMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMonitor_Font(), ecorePackage.getEString(), "font", null, 0, 1, JZLemurMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMonitor_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZLemurMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZLemurMonitor_Color(), this.getColor(), "color", null, 0, 1, JZLemurMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzPadsEClass, JZPads.class, "JZPads", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZPads_Numbers(), ecorePackage.getEInt(), "numbers", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Rows(), ecorePackage.getEInt(), "rows", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Multilabel(), theEcorePackage.getEBoolean(), "multilabel", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Multicolor(), ecorePackage.getEBoolean(), "multicolor", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_ColorOn(), this.getColor(), "colorOn", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_ColorOff(), this.getColor(), "colorOff", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Values(), theEcorePackage.getEInt(), "values", null, 0, -1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Attack(), theEcorePackage.getEFloat(), "attack", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Decay(), theEcorePackage.getEFloat(), "decay", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Hold(), theEcorePackage.getEFloat(), "hold", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Release(), theEcorePackage.getEFloat(), "release", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Sustain(), theEcorePackage.getEFloat(), "sustain", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Color(), this.getColor(), "color", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_LabelVisible(), theEcorePackage.getEBoolean(), "labelVisible", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Height(), theEcorePackage.getEFloat(), "height", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZPads_Tension(), theEcorePackage.getEFloat(), "tension", null, 0, 1, JZPads.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzSurfaceLCDEClass, JZSurfaceLCD.class, "JZSurfaceLCD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZSurfaceLCD_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZSurfaceLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSurfaceLCD_Target(), ecorePackage.getEString(), "target", null, 0, 1, JZSurfaceLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSurfaceLCD_Display(), ecorePackage.getEString(), "display", null, 0, 1, JZSurfaceLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSurfaceLCD_Font(), ecorePackage.getEString(), "font", null, 0, 1, JZSurfaceLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSurfaceLCD_Top(), ecorePackage.getEString(), "top", null, 0, 1, JZSurfaceLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSurfaceLCD_Bottom(), ecorePackage.getEString(), "bottom", null, 0, 1, JZSurfaceLCD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzSwitchesEClass, JZSwitches.class, "JZSwitches", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZSwitches_Numbers(), ecorePackage.getEInt(), "numbers", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Radio(), ecorePackage.getEBoolean(), "radio", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Rows(), ecorePackage.getEInt(), "rows", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Multilabel(), ecorePackage.getEBoolean(), "multilabel", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Multicolor(), ecorePackage.getEBoolean(), "multicolor", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_ColorOn(), this.getColor(), "colorOn", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_ColorOff(), this.getColor(), "colorOff", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_LabelVisible(), theEcorePackage.getEBoolean(), "labelVisible", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_Paint(), theEcorePackage.getEBoolean(), "paint", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSwitches_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZSwitches.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzTextEClass, JZText.class, "JZText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZText_Text(), ecorePackage.getEString(), "text", null, 0, 1, JZText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZText_Font(), ecorePackage.getEString(), "font", null, 0, 1, JZText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZText_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZText_Color(), this.getColor(), "color", null, 0, 1, JZText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZText_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZText_FontSize(), this.getFONT_SIZE(), "fontSize", null, 0, 1, JZText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZText_FontAlign(), this.getTEXT_ALIGN(), "fontAlign", null, 0, 1, JZText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzCustomButtonEClass, JZCustomButton.class, "JZCustomButton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZCustomButton_Outline(), ecorePackage.getEBoolean(), "outline", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_ColorOff(), this.getColor(), "colorOff", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_ColorOn(), this.getColor(), "colorOn", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_StyleOffText(), theEcorePackage.getEString(), "styleOffText", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_TextAlign(), this.getTEXT_ALIGN(), "textAlign", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_StyleOn(), this.getLEMUR_STYLE(), "styleOn", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_StyleOff(), this.getLEMUR_STYLE(), "styleOff", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_StyleOnText(), theEcorePackage.getEString(), "styleOnText", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_FontSize(), this.getFONT_SIZE(), "fontSize", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_Mode(), this.getCUSTOM_BUTTON_MODE(), "mode", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZCustomButton_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZCustomButton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzSignalScopeEClass, JZSignalScope.class, "JZSignalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZSignalScope_ModeXY(), theEcorePackage.getEBoolean(), "modeXY", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Color(), this.getColor(), "color", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Data(), theEcorePackage.getEFloat(), "data", null, 0, -1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Height(), theEcorePackage.getEFloat(), "height", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Tension(), theEcorePackage.getEFloat(), "tension", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_LabelVisible(), theEcorePackage.getEBoolean(), "labelVisible", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Xb(), theEcorePackage.getEString(), "xb", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Yb(), theEcorePackage.getEString(), "yb", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Timebase(), theEcorePackage.getEFloat(), "timebase", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZSignalScope_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, JZSignalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzRangeEClass, JZRange.class, "JZRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZRange_Horizontal(), ecorePackage.getEBoolean(), "horizontal", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Color(), this.getColor(), "color", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Light(), ecorePackage.getEFloat(), "light", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_LabelVisible(), theEcorePackage.getEBoolean(), "labelVisible", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Grid(), theEcorePackage.getEBoolean(), "grid", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_GridValue(), theEcorePackage.getEInt(), "gridValue", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Physics(), theEcorePackage.getEBoolean(), "physics", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Tension(), theEcorePackage.getEFloat(), "tension", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Min_height(), theEcorePackage.getEFloat(), "min_height", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Max_height(), theEcorePackage.getEFloat(), "max_height", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Drag(), theEcorePackage.getEFloat(), "drag", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRange_Height(), theEcorePackage.getEFloat(), "height", null, 0, 1, JZRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzMultiBallsEClass, JZMultiBalls.class, "JZMultiBalls", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZMultiBalls_Numbers(), theEcorePackage.getEBoolean(), "numbers", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Multilabel(), ecorePackage.getEBoolean(), "multilabel", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_MultiColor(), ecorePackage.getEBoolean(), "multiColor", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_X(), theEcorePackage.getEFloat(), "x", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Y(), theEcorePackage.getEFloat(), "y", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Z(), theEcorePackage.getEFloat(), "z", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Attack(), theEcorePackage.getEFloat(), "attack", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Decay(), theEcorePackage.getEFloat(), "decay", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Hold(), theEcorePackage.getEFloat(), "hold", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_HoldX(), theEcorePackage.getEFloat(), "holdX", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_HoldY(), theEcorePackage.getEFloat(), "holdY", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Release(), theEcorePackage.getEFloat(), "release", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Speed(), theEcorePackage.getEFloat(), "speed", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Sustain(), theEcorePackage.getEFloat(), "sustain", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_GridStepX(), theEcorePackage.getEInt(), "gridStepX", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_GridStepY(), theEcorePackage.getEInt(), "gridStepY", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Height(), theEcorePackage.getEFloat(), "height", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Tension(), theEcorePackage.getEFloat(), "tension", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Data(), this.getPoint(), "data", null, 0, -1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_NumbersVisible(), theEcorePackage.getEBoolean(), "numbersVisible", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Balls(), theEcorePackage.getEInt(), "balls", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Color(), this.getColor(), "color", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_LabelVisible(), theEcorePackage.getEBoolean(), "labelVisible", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Physics(), this.getMULTIBALLS_PHYSICS(), "physics", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_CursorMode(), this.getMULTIBALLS_CURSOR_MODE(), "cursorMode", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Attraction(), theEcorePackage.getEFloat(), "attraction", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_GridActive(), theEcorePackage.getEBoolean(), "gridActive", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZMultiBalls_Ephemeral(), theEcorePackage.getEBoolean(), "ephemeral", null, 0, 1, JZMultiBalls.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzTrackEClass, JZTrack.class, "JZTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZTrack_ModeXY(), ecorePackage.getEString(), "modeXY", null, 0, 1, JZTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZTrack_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, JZTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZTrack_Color(), ecorePackage.getEString(), "color", null, 0, 1, JZTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jZmultiSliderEClass, JZmultiSlider.class, "JZmultiSlider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZmultiSlider_Horizontal(), ecorePackage.getEBoolean(), "horizontal", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Bipolar(), ecorePackage.getEBoolean(), "bipolar", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Slider(), ecorePackage.getEInt(), "slider", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Gradient(), ecorePackage.getEString(), "gradient", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Multicolor(), ecorePackage.getEBoolean(), "multicolor", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Light(), theEcorePackage.getEFloat(), "light", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Values(), theEcorePackage.getEFloat(), "values", null, 0, -1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Tension(), theEcorePackage.getEFloat(), "tension", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Height(), theEcorePackage.getEFloat(), "height", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_LabelVisible(), theEcorePackage.getEBoolean(), "labelVisible", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Color(), this.getColor(), "color", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Physics(), theEcorePackage.getEBoolean(), "physics", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_GridActive(), theEcorePackage.getEBoolean(), "gridActive", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_GridValue(), theEcorePackage.getEInt(), "gridValue", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZmultiSlider_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZmultiSlider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzMenuItemEClass, JZMenuItem.class, "JZMenuItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZMenuItem_Label(), ecorePackage.getEString(), "label", null, 0, 1, JZMenuItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzRingAreaEClass, JZRingArea.class, "JZRingArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZRingArea_Speed(), theEcorePackage.getEFloat(), "speed", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_Friction(), theEcorePackage.getEFloat(), "friction", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_Attraction(), theEcorePackage.getEFloat(), "attraction", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_Attraction_x(), theEcorePackage.getEFloat(), "attraction_x", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_Attraction_y(), theEcorePackage.getEFloat(), "attraction_y", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_Color(), this.getColor(), "color", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_ValueActive(), theEcorePackage.getEBoolean(), "valueActive", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_Capture(), theEcorePackage.getEBoolean(), "capture", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_X(), theEcorePackage.getEInt(), "x", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZRingArea_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, JZRingArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscDynaPropertiesEClass, OSCDynaProperties.class, "OSCDynaProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOSCDynaProperties_CustomOscMsg(), ecorePackage.getEBoolean(), "customOscMsg", null, 0, 1, OSCDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSCDynaProperties_LemurTrigger(), this.getLemurTrigger(), "lemurTrigger", null, 0, 1, OSCDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSCDynaProperties_EStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 0, 1, OSCDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOSCDynaProperties_OscMsg(), theEzlemurPackage.getLemurOscCmd(), null, "oscMsg", null, 0, 1, OSCDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOSCDynaProperties_Target(), theEcorePackage.getEString(), "target", null, 0, 1, OSCDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(midiDynaPropertiesEClass, MidiDynaProperties.class, "MidiDynaProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMidiDynaProperties_CustomMidiMsg(), theEcorePackage.getEBoolean(), "customMidiMsg", null, 0, 1, MidiDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidiDynaProperties_LemurTrigger(), this.getLemurTrigger(), "lemurTrigger", null, 0, 1, MidiDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMidiDynaProperties_MidiMsg(), theEzlemurPackage.getLemurMidiCmd(), null, "midiMsg", null, 0, 1, MidiDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMidiDynaProperties_EStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 0, 1, MidiDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidiDynaProperties_Target(), theEcorePackage.getEString(), "target", null, 0, 1, MidiDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxDynaPropertiesEClass, DMXDynaProperties.class, "DMXDynaProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXDynaProperties_DmxMsg(), theEzlemurPackage.getLemurDmxCmd(), null, "dmxMsg", null, 0, 1, DMXDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXDynaProperties_EStructuralFeature(), theEcorePackage.getEStructuralFeature(), null, "eStructuralFeature", null, 0, 1, DMXDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXDynaProperties_CustomDmxMsg(), theEcorePackage.getEBoolean(), "customDmxMsg", null, 0, 1, DMXDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXDynaProperties_LemurTrigger(), this.getLemurTrigger(), "lemurTrigger", null, 0, 1, DMXDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXDynaProperties_Target(), theEcorePackage.getEString(), "target", null, 0, 1, DMXDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzJazzInterfaceEClass, JZJazzInterface.class, "JZJazzInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZJazzInterface_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, JZJazzInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZJazzInterface_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, JZJazzInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZJazzInterface_Mode(), theEcorePackage.getEString(), "mode", null, 0, 1, JZJazzInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZJazzInterface_Orientation(), theEcorePackage.getEString(), "orientation", null, 0, 1, JZJazzInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzTargetEClass, JZTarget.class, "JZTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJZTarget_Addr(), theEcorePackage.getEString(), "addr", null, 0, 1, JZTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZTarget_IncomingPorts(), theEcorePackage.getEInt(), "incomingPorts", null, 0, -1, JZTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZTarget_Id(), theEcorePackage.getEString(), "id", null, 0, 1, JZTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzOscTargetEClass, JzOscTarget.class, "JzOscTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jzMidiTargetEClass, JzMidiTarget.class, "JzMidiTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jzKBTargetEClass, JzKBTarget.class, "JzKBTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(kbDynaPropertiesEClass, KBDynaProperties.class, "KBDynaProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKBDynaProperties_LemurTrigger(), this.getLemurTrigger(), "lemurTrigger", null, 0, 1, KBDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKBDynaProperties_Target(), theEcorePackage.getEString(), "target", null, 0, 1, KBDynaProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzConfigurationManagerEClass, JZConfigurationManager.class, "JZConfigurationManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJZConfigurationManager_KbTargets(), this.getJzKBTarget(), null, "kbTargets", null, 0, -1, JZConfigurationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZConfigurationManager_OscTargets(), this.getJzOscTarget(), null, "oscTargets", null, 0, -1, JZConfigurationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZConfigurationManager_MidiTargets(), this.getJzMidiTarget(), null, "midiTargets", null, 0, -1, JZConfigurationManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzOscVarEClass, JzOscVar.class, "JzOscVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJzOscVar_CustomAddress(), theEcorePackage.getEBoolean(), "customAddress", null, 0, 1, JzOscVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJzOscVar_CustomMsg(), theEcorePackage.getEString(), "customMsg", null, 0, 1, JzOscVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJzOscVar_OscTarget(), this.getLEMUR_OSC_TARGET(), "oscTarget", null, 0, 1, JzOscVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzVarEClass, JZVar.class, "JZVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJZVar_Attribute(), theEcorePackage.getEStructuralFeature(), null, "attribute", null, 0, 1, JZVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJZVar_Trigger(), this.getLemurTrigger(), "trigger", null, 0, 1, JZVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jzMidiVarEClass, JzMidiVar.class, "JzMidiVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJzMidiVar_MidiMessage(), this.getMIDI_MESSAGES(), "midiMessage", null, 0, 1, JzMidiVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJzMidiVar_MidiTarget(), this.getLEMUR_MIDI_TARGET(), "midiTarget", null, 0, 1, JzMidiVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Expr(), theEcorePackage.getEString(), "expr", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(midiVar80NoteOffEClass, MidiVar80NoteOff.class, "MidiVar80NoteOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVar90NoteOnEClass, MidiVar90NoteOn.class, "MidiVar90NoteOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarA0KeyPressureEClass, MidiVarA0KeyPressure.class, "MidiVarA0KeyPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarB0ControlChangeEClass, MidiVarB0ControlChange.class, "MidiVarB0ControlChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarC0ProgramChangeEClass, MidiVarC0ProgramChange.class, "MidiVarC0ProgramChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarD0ChannelPressureEClass, MidiVarD0ChannelPressure.class, "MidiVarD0ChannelPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarE0PitchBendEClass, MidiVarE0PitchBend.class, "MidiVarE0PitchBend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarF0SystemExclusiveEClass, MidiVarF0SystemExclusive.class, "MidiVarF0SystemExclusive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarF2SngPositionEClass, MidiVarF2SngPosition.class, "MidiVarF2SngPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarF3SongSelectEClass, MidiVarF3SongSelect.class, "MidiVarF3SongSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarF5BusSelectEClass, MidiVarF5BusSelect.class, "MidiVarF5BusSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarF6TuneRequestEClass, MidiVarF6TuneRequest.class, "MidiVarF6TuneRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarF8TimingTickEClass, MidiVarF8TimingTick.class, "MidiVarF8TimingTick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarFAStartSongEClass, MidiVarFAStartSong.class, "MidiVarFAStartSong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarFBContinueSongEClass, MidiVarFBContinueSong.class, "MidiVarFBContinueSong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarFCStopSongEClass, MidiVarFCStopSong.class, "MidiVarFCStopSong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarFEActiveSensingEClass, MidiVarFEActiveSensing.class, "MidiVarFEActiveSensing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiVarFFSystemResetEClass, MidiVarFFSystemReset.class, "MidiVarFFSystemReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractMidiVarNoteEClass, AbstractMidiVarNote.class, "AbstractMidiVarNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMidiVarNote_PitchFrom(), theEcorePackage.getEInt(), "pitchFrom", null, 0, 1, AbstractMidiVarNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMidiVarNote_PitchTo(), theEcorePackage.getEInt(), "pitchTo", null, 0, 1, AbstractMidiVarNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(midiVarEClass, MidiVar.class, "MidiVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMidiVar_ScaleFrom(), theEcorePackage.getEInt(), "scaleFrom", null, 0, 1, MidiVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidiVar_ScaleTo(), theEcorePackage.getEInt(), "scaleTo", null, 0, 1, MidiVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidiVar_ChannelFrom(), theEcorePackage.getEInt(), "channelFrom", null, 0, 1, MidiVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidiVar_ChannelTo(), theEcorePackage.getEInt(), "channelTo", null, 0, 1, MidiVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lemurTriggerEEnum, LemurTrigger.class, "LemurTrigger");
		addEEnumLiteral(lemurTriggerEEnum, LemurTrigger.ANY);
		addEEnumLiteral(lemurTriggerEEnum, LemurTrigger.PASSES_OVER_ZERO);
		addEEnumLiteral(lemurTriggerEEnum, LemurTrigger.PASSES_UNDER_ZERO);
		addEEnumLiteral(lemurTriggerEEnum, LemurTrigger.CROSS_ZERO);
		addEEnumLiteral(lemurTriggerEEnum, LemurTrigger.INCREASE);
		addEEnumLiteral(lemurTriggerEEnum, LemurTrigger.DECREASE);
		addEEnumLiteral(lemurTriggerEEnum, LemurTrigger.NONE);

		initEEnum(lemurPreferencesEEnum, LemurPreferences.class, "LemurPreferences");
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC0_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC1_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC2_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC3_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC4_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC5_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC6_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC7_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC8_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.LEMUR_OSC9_TARGET_PREF);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.NONE);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.PARENT);
		addEEnumLiteral(lemurPreferencesEEnum, LemurPreferences.PROJECT);

		initEEnum(lemurIncomingPortsEEnum, LemurIncomingPorts.class, "LemurIncomingPorts");
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC0_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC1_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC2_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC3_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC4_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC5_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC6_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC7_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC8_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.LEMUR_OSC9_PORT_IN_PREF);
		addEEnumLiteral(lemurIncomingPortsEEnum, LemurIncomingPorts.NONE);

		initEEnum(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.class, "MIDI_MESSAGES");
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES._80_NOTE_OF);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES._90_NOTE_ON);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.A0_KEY_PRESSURE);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.B0_CONTROL_CHANGE);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.C0_PROGRAM_CHANGE);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.D0_CHANNEL_PRESSURE);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.E0_PITCH_BEND);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.F0_SYSTEM_EXCLUSIVE);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.F2_SONG_POSITION);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.F3_SONG_SELECT);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.F5_BUS_SELECT);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.F6_TUNE_REQUEST);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.F8_TIMING_TICK);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.FA_START_SONG);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.FB_CONTINUE_SONG);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.FC_STOP_SONG);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.FE_ACTIVE_SENSING);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.FF_SYSTEM_RESET);
		addEEnumLiteral(midI_MESSAGESEEnum, net.sf.smbt.jzmui.MIDI_MESSAGES.NONE);

		initEEnum(knoB_STYLEEEnum, net.sf.smbt.jzmui.KNOB_STYLE.class, "KNOB_STYLE");
		addEEnumLiteral(knoB_STYLEEEnum, net.sf.smbt.jzmui.KNOB_STYLE.STANDARD);
		addEEnumLiteral(knoB_STYLEEEnum, net.sf.smbt.jzmui.KNOB_STYLE.BIPOLAR);
		addEEnumLiteral(knoB_STYLEEEnum, net.sf.smbt.jzmui.KNOB_STYLE.ENDLESS);
		addEEnumLiteral(knoB_STYLEEEnum, net.sf.smbt.jzmui.KNOB_STYLE.NONE);

		initEEnum(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.class, "LEMUR_STYLE");
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.TEXT);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.FILL_RECT);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.CIRCLE);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.CIRCLE_BOLD);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.PREV_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.NEXT_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.UP_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.DOWN_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.RWD_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.FWD_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.END_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.BEGINING_CURSOR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.QUIT);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.DELETE);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.NORTH_SOUTH);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.EAST_WEST);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.RAISE_UP);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.RAISE_DOWN);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.LEFT);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.RIGHT);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.UP);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.DOWN);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.DECREASE);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.INCREASE);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.BANG);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.PLUS);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.MINUS);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.REFRESH);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.SIN);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.TRI);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.SAW);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.SQR);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.SAW_INV);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.PATH);
		addEEnumLiteral(lemuR_STYLEEEnum, net.sf.smbt.jzmui.LEMUR_STYLE.NONE);

		initEEnum(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.class, "FONT_SIZE");
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_8PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_9PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_10_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_11_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_12_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_13_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_14_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_15_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_16_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_17_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_18_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_19_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_20_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_21_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_22_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_23_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.FONT_24_PT);
		addEEnumLiteral(fonT_SIZEEEnum, net.sf.smbt.jzmui.FONT_SIZE.NONE);

		initEEnum(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.class, "TEXT_ALIGN");
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.N);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.S);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.E);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.W);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.NE);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.NW);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.SE);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.SW);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.CENTER);
		addEEnumLiteral(texT_ALIGNEEnum, net.sf.smbt.jzmui.TEXT_ALIGN.NONE);

		initEEnum(jzmL_MODEEEnum, net.sf.smbt.jzmui.JZML_MODE.class, "JZML_MODE");
		addEEnumLiteral(jzmL_MODEEEnum, net.sf.smbt.jzmui.JZML_MODE.IPHONE);
		addEEnumLiteral(jzmL_MODEEEnum, net.sf.smbt.jzmui.JZML_MODE.IPAD);
		addEEnumLiteral(jzmL_MODEEEnum, net.sf.smbt.jzmui.JZML_MODE.LEGACY);

		initEEnum(breaK_POINT_PHYSICSEEnum, net.sf.smbt.jzmui.BREAK_POINT_PHYSICS.class, "BREAK_POINT_PHYSICS");
		addEEnumLiteral(breaK_POINT_PHYSICSEEnum, net.sf.smbt.jzmui.BREAK_POINT_PHYSICS.INTERPOLATE);
		addEEnumLiteral(breaK_POINT_PHYSICSEEnum, net.sf.smbt.jzmui.BREAK_POINT_PHYSICS.MASS_SPRING);
		addEEnumLiteral(breaK_POINT_PHYSICSEEnum, net.sf.smbt.jzmui.BREAK_POINT_PHYSICS.SUPER_SPRING);
		addEEnumLiteral(breaK_POINT_PHYSICSEEnum, net.sf.smbt.jzmui.BREAK_POINT_PHYSICS.NONE);

		initEEnum(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.class, "LEMUR_OSC_TARGET");
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_1);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_2);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_3);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_4);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_5);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_6);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_7);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_8);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.OSC_9);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.NONE);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.PARENT);
		addEEnumLiteral(lemuR_OSC_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_OSC_TARGET.PROJECT);

		initEEnum(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.class, "LEMUR_MIDI_TARGET");
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_1);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_2);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_3);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_4);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_5);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_6);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_8);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_7);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.MIDI_9);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.NONE);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.PARENT);
		addEEnumLiteral(lemuR_MIDI_TARGETEEnum, net.sf.smbt.jzmui.LEMUR_MIDI_TARGET.PROJECT);

		initEEnum(custoM_BUTTON_MODEEEnum, net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE.class, "CUSTOM_BUTTON_MODE");
		addEEnumLiteral(custoM_BUTTON_MODEEEnum, net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE.SWITCH);
		addEEnumLiteral(custoM_BUTTON_MODEEEnum, net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE.PAD);
		addEEnumLiteral(custoM_BUTTON_MODEEEnum, net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE.NONE);

		initEEnum(knoB_CURSOR_MODEEEnum, net.sf.smbt.jzmui.KNOB_CURSOR_MODE.class, "KNOB_CURSOR_MODE");
		addEEnumLiteral(knoB_CURSOR_MODEEEnum, net.sf.smbt.jzmui.KNOB_CURSOR_MODE.NONE);
		addEEnumLiteral(knoB_CURSOR_MODEEEnum, net.sf.smbt.jzmui.KNOB_CURSOR_MODE.LIMITED);
		addEEnumLiteral(knoB_CURSOR_MODEEEnum, net.sf.smbt.jzmui.KNOB_CURSOR_MODE.BARYCENTRIC);
		addEEnumLiteral(knoB_CURSOR_MODEEEnum, net.sf.smbt.jzmui.KNOB_CURSOR_MODE.GET_NEWER);

		initEEnum(knoB_CONTROLEEnum, net.sf.smbt.jzmui.KNOB_CONTROL.class, "KNOB_CONTROL");
		addEEnumLiteral(knoB_CONTROLEEnum, net.sf.smbt.jzmui.KNOB_CONTROL.LINEAR);
		addEEnumLiteral(knoB_CONTROLEEnum, net.sf.smbt.jzmui.KNOB_CONTROL.POLAR);
		addEEnumLiteral(knoB_CONTROLEEnum, net.sf.smbt.jzmui.KNOB_CONTROL.NONE);

		initEEnum(knoB_PHYSICSEEnum, net.sf.smbt.jzmui.KNOB_PHYSICS.class, "KNOB_PHYSICS");
		addEEnumLiteral(knoB_PHYSICSEEnum, net.sf.smbt.jzmui.KNOB_PHYSICS.INTERPOLATE);
		addEEnumLiteral(knoB_PHYSICSEEnum, net.sf.smbt.jzmui.KNOB_PHYSICS.MASS_SPRING);
		addEEnumLiteral(knoB_PHYSICSEEnum, net.sf.smbt.jzmui.KNOB_PHYSICS.NONE);

		initEEnum(fadeR_CURSOR_MODEEEnum, net.sf.smbt.jzmui.FADER_CURSOR_MODE.class, "FADER_CURSOR_MODE");
		addEEnumLiteral(fadeR_CURSOR_MODEEEnum, net.sf.smbt.jzmui.FADER_CURSOR_MODE.NONE);
		addEEnumLiteral(fadeR_CURSOR_MODEEEnum, net.sf.smbt.jzmui.FADER_CURSOR_MODE.LIMITED);
		addEEnumLiteral(fadeR_CURSOR_MODEEEnum, net.sf.smbt.jzmui.FADER_CURSOR_MODE.BARYCENTRIC);
		addEEnumLiteral(fadeR_CURSOR_MODEEEnum, net.sf.smbt.jzmui.FADER_CURSOR_MODE.GET_NEWER);
		addEEnumLiteral(fadeR_CURSOR_MODEEEnum, net.sf.smbt.jzmui.FADER_CURSOR_MODE.CAP_ONLY);

		initEEnum(fadeR_PHYSICSEEnum, net.sf.smbt.jzmui.FADER_PHYSICS.class, "FADER_PHYSICS");
		addEEnumLiteral(fadeR_PHYSICSEEnum, net.sf.smbt.jzmui.FADER_PHYSICS.NONE);
		addEEnumLiteral(fadeR_PHYSICSEEnum, net.sf.smbt.jzmui.FADER_PHYSICS.INTERPOLATE);
		addEEnumLiteral(fadeR_PHYSICSEEnum, net.sf.smbt.jzmui.FADER_PHYSICS.MASS_SPRING);

		initEEnum(multiballS_CURSOR_MODEEEnum, net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE.class, "MULTIBALLS_CURSOR_MODE");
		addEEnumLiteral(multiballS_CURSOR_MODEEEnum, net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE.NONE);
		addEEnumLiteral(multiballS_CURSOR_MODEEEnum, net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE.LIMITED);
		addEEnumLiteral(multiballS_CURSOR_MODEEEnum, net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE.BARYCENTRIC);
		addEEnumLiteral(multiballS_CURSOR_MODEEEnum, net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE.GET_OLDEST_BALL);
		addEEnumLiteral(multiballS_CURSOR_MODEEEnum, net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE.GET_NEWEST_BALL);

		initEEnum(multiballS_PHYSICSEEnum, net.sf.smbt.jzmui.MULTIBALLS_PHYSICS.class, "MULTIBALLS_PHYSICS");
		addEEnumLiteral(multiballS_PHYSICSEEnum, net.sf.smbt.jzmui.MULTIBALLS_PHYSICS.NONE);
		addEEnumLiteral(multiballS_PHYSICSEEnum, net.sf.smbt.jzmui.MULTIBALLS_PHYSICS.INTERPOLATE);
		addEEnumLiteral(multiballS_PHYSICSEEnum, net.sf.smbt.jzmui.MULTIBALLS_PHYSICS.MASS_SPRING);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pathDataEDataType, PathData.class, "PathData", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JzmuiPackageImpl
