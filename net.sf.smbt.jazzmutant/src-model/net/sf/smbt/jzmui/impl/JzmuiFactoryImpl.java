/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.impl;

import net.sf.smbt.jzmui.*;
import net.sf.smbt.jazzmutant.utils.JzmlUiUtils;
import net.sf.smbt.jzmui.BREAK_POINT_PHYSICS;
import net.sf.smbt.jzmui.CUSTOM_BUTTON_MODE;
import net.sf.smbt.jzmui.DMXDynaProperties;
import net.sf.smbt.jzmui.FADER_CURSOR_MODE;
import net.sf.smbt.jzmui.FADER_PHYSICS;
import net.sf.smbt.jzmui.FONT_SIZE;
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
import net.sf.smbt.jzmui.JZML_MODE;
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
import net.sf.smbt.jzmui.JZVar;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.JzKBTarget;
import net.sf.smbt.jzmui.JzMidiTarget;
import net.sf.smbt.jzmui.JzMidiVar;
import net.sf.smbt.jzmui.JzOscTarget;
import net.sf.smbt.jzmui.JzOscVar;
import net.sf.smbt.jzmui.JzmuiFactory;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KBDynaProperties;
import net.sf.smbt.jzmui.KNOB_CONTROL;
import net.sf.smbt.jzmui.KNOB_CURSOR_MODE;
import net.sf.smbt.jzmui.KNOB_PHYSICS;
import net.sf.smbt.jzmui.KNOB_STYLE;
import net.sf.smbt.jzmui.LEMUR_MIDI_TARGET;
import net.sf.smbt.jzmui.LEMUR_OSC_TARGET;
import net.sf.smbt.jzmui.LEMUR_STYLE;
import net.sf.smbt.jzmui.LemurIncomingPorts;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.smbt.jzmui.LemurPreferences;
import net.sf.smbt.jzmui.LemurTrigger;
import net.sf.smbt.jzmui.MIDI_MESSAGES;
import net.sf.smbt.jzmui.MULTIBALLS_CURSOR_MODE;
import net.sf.smbt.jzmui.MULTIBALLS_PHYSICS;
import net.sf.smbt.jzmui.MidiDynaProperties;
import net.sf.smbt.jzmui.OSCDynaProperties;
import net.sf.smbt.jzmui.Script;
import net.sf.smbt.jzmui.TEXT_ALIGN;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.PathData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JzmuiFactoryImpl extends EFactoryImpl implements JzmuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JzmuiFactory init() {
		try {
			JzmuiFactory theJzmuiFactory = (JzmuiFactory)EPackage.Registry.INSTANCE.getEFactory("http://jzmui/1.0"); 
			if (theJzmuiFactory != null) {
				return theJzmuiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JzmuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzmuiFactoryImpl() {
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
			case JzmuiPackage.LEMUR_LIVE_APP: return createLemurLiveApp();
			case JzmuiPackage.JZ_CONTAINER: return createJZContainer();
			case JzmuiPackage.JZ_BREAK_POINT: return createJZBreakPoint();
			case JzmuiPackage.JZ_FADER: return createJZFader();
			case JzmuiPackage.JZ_GESTURE: return createJZGesture();
			case JzmuiPackage.JZ_KNOB: return createJZKnob();
			case JzmuiPackage.JZ_LED: return createJZLed();
			case JzmuiPackage.JZ_LEMUR_MENU: return createJZLemurMenu();
			case JzmuiPackage.JZ_LEMUR_MONITOR: return createJZLemurMonitor();
			case JzmuiPackage.JZ_PADS: return createJZPads();
			case JzmuiPackage.JZ_SURFACE_LCD: return createJZSurfaceLCD();
			case JzmuiPackage.JZ_SWITCHES: return createJZSwitches();
			case JzmuiPackage.JZ_TEXT: return createJZText();
			case JzmuiPackage.JZ_CUSTOM_BUTTON: return createJZCustomButton();
			case JzmuiPackage.JZ_SIGNAL_SCOPE: return createJZSignalScope();
			case JzmuiPackage.JZ_RANGE: return createJZRange();
			case JzmuiPackage.JZ_MULTI_BALLS: return createJZMultiBalls();
			case JzmuiPackage.JZ_TRACK: return createJZTrack();
			case JzmuiPackage.JZMULTI_SLIDER: return createJZmultiSlider();
			case JzmuiPackage.JZ_MENU_ITEM: return createJZMenuItem();
			case JzmuiPackage.JZ_RING_AREA: return createJZRingArea();
			case JzmuiPackage.OSC_DYNA_PROPERTIES: return createOSCDynaProperties();
			case JzmuiPackage.MIDI_DYNA_PROPERTIES: return createMidiDynaProperties();
			case JzmuiPackage.DMX_DYNA_PROPERTIES: return createDMXDynaProperties();
			case JzmuiPackage.JZ_JAZZ_INTERFACE: return createJZJazzInterface();
			case JzmuiPackage.JZ_TARGET: return createJZTarget();
			case JzmuiPackage.JZ_OSC_TARGET: return createJzOscTarget();
			case JzmuiPackage.JZ_MIDI_TARGET: return createJzMidiTarget();
			case JzmuiPackage.JZ_KB_TARGET: return createJzKBTarget();
			case JzmuiPackage.KB_DYNA_PROPERTIES: return createKBDynaProperties();
			case JzmuiPackage.JZ_CONFIGURATION_MANAGER: return createJZConfigurationManager();
			case JzmuiPackage.JZ_OSC_VAR: return createJzOscVar();
			case JzmuiPackage.JZ_VAR: return createJZVar();
			case JzmuiPackage.JZ_MIDI_VAR: return createJzMidiVar();
			case JzmuiPackage.SCRIPT: return createScript();
			case JzmuiPackage.MIDI_VAR80_NOTE_OFF: return createMidiVar80NoteOff();
			case JzmuiPackage.MIDI_VAR90_NOTE_ON: return createMidiVar90NoteOn();
			case JzmuiPackage.MIDI_VAR_A0_KEY_PRESSURE: return createMidiVarA0KeyPressure();
			case JzmuiPackage.MIDI_VAR_B0_CONTROL_CHANGE: return createMidiVarB0ControlChange();
			case JzmuiPackage.MIDI_VAR_C0_PROGRAM_CHANGE: return createMidiVarC0ProgramChange();
			case JzmuiPackage.MIDI_VAR_D0_CHANNEL_PRESSURE: return createMidiVarD0ChannelPressure();
			case JzmuiPackage.MIDI_VAR_E0_PITCH_BEND: return createMidiVarE0PitchBend();
			case JzmuiPackage.MIDI_VAR_F0_SYSTEM_EXCLUSIVE: return createMidiVarF0SystemExclusive();
			case JzmuiPackage.MIDI_VAR_F2_SNG_POSITION: return createMidiVarF2SngPosition();
			case JzmuiPackage.MIDI_VAR_F3_SONG_SELECT: return createMidiVarF3SongSelect();
			case JzmuiPackage.MIDI_VAR_F5_BUS_SELECT: return createMidiVarF5BusSelect();
			case JzmuiPackage.MIDI_VAR_F6_TUNE_REQUEST: return createMidiVarF6TuneRequest();
			case JzmuiPackage.MIDI_VAR_F8_TIMING_TICK: return createMidiVarF8TimingTick();
			case JzmuiPackage.MIDI_VAR_FA_START_SONG: return createMidiVarFAStartSong();
			case JzmuiPackage.MIDI_VAR_FB_CONTINUE_SONG: return createMidiVarFBContinueSong();
			case JzmuiPackage.MIDI_VAR_FC_STOP_SONG: return createMidiVarFCStopSong();
			case JzmuiPackage.MIDI_VAR_FE_ACTIVE_SENSING: return createMidiVarFEActiveSensing();
			case JzmuiPackage.MIDI_VAR_FF_SYSTEM_RESET: return createMidiVarFFSystemReset();
			case JzmuiPackage.ABSTRACT_MIDI_VAR_NOTE: return createAbstractMidiVarNote();
			case JzmuiPackage.MIDI_VAR: return createMidiVar();
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
			case JzmuiPackage.LEMUR_TRIGGER:
				return createLemurTriggerFromString(eDataType, initialValue);
			case JzmuiPackage.LEMUR_PREFERENCES:
				return createLemurPreferencesFromString(eDataType, initialValue);
			case JzmuiPackage.LEMUR_INCOMING_PORTS:
				return createLemurIncomingPortsFromString(eDataType, initialValue);
			case JzmuiPackage.MIDI_MESSAGES:
				return createMIDI_MESSAGESFromString(eDataType, initialValue);
			case JzmuiPackage.KNOB_STYLE:
				return createKNOB_STYLEFromString(eDataType, initialValue);
			case JzmuiPackage.LEMUR_STYLE:
				return createLEMUR_STYLEFromString(eDataType, initialValue);
			case JzmuiPackage.FONT_SIZE:
				return createFONT_SIZEFromString(eDataType, initialValue);
			case JzmuiPackage.TEXT_ALIGN:
				return createTEXT_ALIGNFromString(eDataType, initialValue);
			case JzmuiPackage.JZML_MODE:
				return createJZML_MODEFromString(eDataType, initialValue);
			case JzmuiPackage.BREAK_POINT_PHYSICS:
				return createBREAK_POINT_PHYSICSFromString(eDataType, initialValue);
			case JzmuiPackage.LEMUR_OSC_TARGET:
				return createLEMUR_OSC_TARGETFromString(eDataType, initialValue);
			case JzmuiPackage.LEMUR_MIDI_TARGET:
				return createLEMUR_MIDI_TARGETFromString(eDataType, initialValue);
			case JzmuiPackage.CUSTOM_BUTTON_MODE:
				return createCUSTOM_BUTTON_MODEFromString(eDataType, initialValue);
			case JzmuiPackage.KNOB_CURSOR_MODE:
				return createKNOB_CURSOR_MODEFromString(eDataType, initialValue);
			case JzmuiPackage.KNOB_CONTROL:
				return createKNOB_CONTROLFromString(eDataType, initialValue);
			case JzmuiPackage.KNOB_PHYSICS:
				return createKNOB_PHYSICSFromString(eDataType, initialValue);
			case JzmuiPackage.FADER_CURSOR_MODE:
				return createFADER_CURSOR_MODEFromString(eDataType, initialValue);
			case JzmuiPackage.FADER_PHYSICS:
				return createFADER_PHYSICSFromString(eDataType, initialValue);
			case JzmuiPackage.MULTIBALLS_CURSOR_MODE:
				return createMULTIBALLS_CURSOR_MODEFromString(eDataType, initialValue);
			case JzmuiPackage.MULTIBALLS_PHYSICS:
				return createMULTIBALLS_PHYSICSFromString(eDataType, initialValue);
			case JzmuiPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			case JzmuiPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case JzmuiPackage.PATH_DATA:
				return createPathDataFromString(eDataType, initialValue);
			case JzmuiPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
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
			case JzmuiPackage.LEMUR_TRIGGER:
				return convertLemurTriggerToString(eDataType, instanceValue);
			case JzmuiPackage.LEMUR_PREFERENCES:
				return convertLemurPreferencesToString(eDataType, instanceValue);
			case JzmuiPackage.LEMUR_INCOMING_PORTS:
				return convertLemurIncomingPortsToString(eDataType, instanceValue);
			case JzmuiPackage.MIDI_MESSAGES:
				return convertMIDI_MESSAGESToString(eDataType, instanceValue);
			case JzmuiPackage.KNOB_STYLE:
				return convertKNOB_STYLEToString(eDataType, instanceValue);
			case JzmuiPackage.LEMUR_STYLE:
				return convertLEMUR_STYLEToString(eDataType, instanceValue);
			case JzmuiPackage.FONT_SIZE:
				return convertFONT_SIZEToString(eDataType, instanceValue);
			case JzmuiPackage.TEXT_ALIGN:
				return convertTEXT_ALIGNToString(eDataType, instanceValue);
			case JzmuiPackage.JZML_MODE:
				return convertJZML_MODEToString(eDataType, instanceValue);
			case JzmuiPackage.BREAK_POINT_PHYSICS:
				return convertBREAK_POINT_PHYSICSToString(eDataType, instanceValue);
			case JzmuiPackage.LEMUR_OSC_TARGET:
				return convertLEMUR_OSC_TARGETToString(eDataType, instanceValue);
			case JzmuiPackage.LEMUR_MIDI_TARGET:
				return convertLEMUR_MIDI_TARGETToString(eDataType, instanceValue);
			case JzmuiPackage.CUSTOM_BUTTON_MODE:
				return convertCUSTOM_BUTTON_MODEToString(eDataType, instanceValue);
			case JzmuiPackage.KNOB_CURSOR_MODE:
				return convertKNOB_CURSOR_MODEToString(eDataType, instanceValue);
			case JzmuiPackage.KNOB_CONTROL:
				return convertKNOB_CONTROLToString(eDataType, instanceValue);
			case JzmuiPackage.KNOB_PHYSICS:
				return convertKNOB_PHYSICSToString(eDataType, instanceValue);
			case JzmuiPackage.FADER_CURSOR_MODE:
				return convertFADER_CURSOR_MODEToString(eDataType, instanceValue);
			case JzmuiPackage.FADER_PHYSICS:
				return convertFADER_PHYSICSToString(eDataType, instanceValue);
			case JzmuiPackage.MULTIBALLS_CURSOR_MODE:
				return convertMULTIBALLS_CURSOR_MODEToString(eDataType, instanceValue);
			case JzmuiPackage.MULTIBALLS_PHYSICS:
				return convertMULTIBALLS_PHYSICSToString(eDataType, instanceValue);
			case JzmuiPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			case JzmuiPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case JzmuiPackage.PATH_DATA:
				return convertPathDataToString(eDataType, instanceValue);
			case JzmuiPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurLiveApp createLemurLiveApp() {
		LemurLiveAppImpl lemurLiveApp = new LemurLiveAppImpl();
		return lemurLiveApp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZContainer createJZContainer() {
		JZContainerImpl jzContainer = new JZContainerImpl();
		return jzContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZBreakPoint createJZBreakPoint() {
		JZBreakPointImpl jzBreakPoint = new JZBreakPointImpl();
		
		jzBreakPoint.setBackground(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_BREAK_POINT__BACKGROUND));
		jzBreakPoint.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_BREAK_POINT__COLOR));
		
		return jzBreakPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZFader createJZFader() {
		JZFaderImpl jzFader = new JZFaderImpl();
		
		jzFader.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_FADER__COLOR));

		return jzFader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZGesture createJZGesture() {
		JZGestureImpl jzGesture = new JZGestureImpl();
		return jzGesture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZKnob createJZKnob() {
		JZKnobImpl jzKnob = new JZKnobImpl();
		
		Color bg = JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_KNOB__BACKGROUD);
		Color fg = JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_KNOB__FOREGROUND);
		
		jzKnob.setBackgroud(bg);
		jzKnob.setForeground(fg);

		return jzKnob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZLed createJZLed() {
		JZLedImpl jzLed = new JZLedImpl();

		jzLed.setColorOff(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_LED__COLOR_OFF));
		jzLed.setColorOn(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_LED__COLOR_ON));

		return jzLed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZLemurMenu createJZLemurMenu() {
		JZLemurMenuImpl jzLemurMenu = new JZLemurMenuImpl();
		
		jzLemurMenu.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_LEMUR_MENU__COLOR));

		return jzLemurMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZLemurMonitor createJZLemurMonitor() {
		JZLemurMonitorImpl jzLemurMonitor = new JZLemurMonitorImpl();
		
		jzLemurMonitor.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_LEMUR_MONITOR__COLOR));

		return jzLemurMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZPads createJZPads() {
		JZPadsImpl jzPads = new JZPadsImpl();
		
		jzPads.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_PADS__COLOR_OFF));
		jzPads.setColorOff(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_PADS__COLOR_OFF));
		jzPads.setColorOn(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_PADS__COLOR_ON));

		return jzPads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZSurfaceLCD createJZSurfaceLCD() {
		JZSurfaceLCDImpl jzSurfaceLCD = new JZSurfaceLCDImpl();
		return jzSurfaceLCD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZSwitches createJZSwitches() {
		JZSwitchesImpl jzSwitches = new JZSwitchesImpl();

		jzSwitches.setColorOff(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_OFF));
		jzSwitches.setColorOn(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_SWITCHES__COLOR_ON));

		return jzSwitches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZText createJZText() {
		JZTextImpl jzText = new JZTextImpl();
		
		jzText.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_TEXT__COLOR));

		return jzText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZCustomButton createJZCustomButton() {
		JZCustomButtonImpl jzCustomButton = new JZCustomButtonImpl();

		jzCustomButton.setColorOff(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__COLOR_OFF));
		jzCustomButton.setColorOn(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_CUSTOM_BUTTON__COLOR_ON));

		return jzCustomButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZSignalScope createJZSignalScope() {
		JZSignalScopeImpl jzSignalScope = new JZSignalScopeImpl();

		jzSignalScope.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_SIGNAL_SCOPE__COLOR));

		return jzSignalScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZRange createJZRange() {
		JZRangeImpl jzRange = new JZRangeImpl();
		
		jzRange.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_RANGE__COLOR));

		return jzRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZMultiBalls createJZMultiBalls() {
		JZMultiBallsImpl jzMultiBalls = new JZMultiBallsImpl();
		
		jzMultiBalls.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_MULTI_BALLS__COLOR));

		return jzMultiBalls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZTrack createJZTrack() {
		JZTrackImpl jzTrack = new JZTrackImpl();
		return jzTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZmultiSlider createJZmultiSlider() {
		JZmultiSliderImpl jZmultiSlider = new JZmultiSliderImpl();
		
		jZmultiSlider.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZMULTI_SLIDER__COLOR));

		return jZmultiSlider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZMenuItem createJZMenuItem() {
		JZMenuItemImpl jzMenuItem = new JZMenuItemImpl();
		return jzMenuItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JZRingArea createJZRingArea() {
		JZRingAreaImpl jzRingArea = new JZRingAreaImpl();
		
		jzRingArea.setColor(JzmlUiUtils.INSTANCE.getDefaultColor(JzmuiPackage.Literals.JZ_RING_AREA__COLOR));

		return jzRingArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCDynaProperties createOSCDynaProperties() {
		OSCDynaPropertiesImpl oscDynaProperties = new OSCDynaPropertiesImpl();
		return oscDynaProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiDynaProperties createMidiDynaProperties() {
		MidiDynaPropertiesImpl midiDynaProperties = new MidiDynaPropertiesImpl();
		return midiDynaProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXDynaProperties createDMXDynaProperties() {
		DMXDynaPropertiesImpl dmxDynaProperties = new DMXDynaPropertiesImpl();
		return dmxDynaProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZJazzInterface createJZJazzInterface() {
		JZJazzInterfaceImpl jzJazzInterface = new JZJazzInterfaceImpl();
		return jzJazzInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZTarget createJZTarget() {
		JZTargetImpl jzTarget = new JZTargetImpl();
		return jzTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzOscTarget createJzOscTarget() {
		JzOscTargetImpl jzOscTarget = new JzOscTargetImpl();
		return jzOscTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzMidiTarget createJzMidiTarget() {
		JzMidiTargetImpl jzMidiTarget = new JzMidiTargetImpl();
		return jzMidiTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzKBTarget createJzKBTarget() {
		JzKBTargetImpl jzKBTarget = new JzKBTargetImpl();
		return jzKBTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KBDynaProperties createKBDynaProperties() {
		KBDynaPropertiesImpl kbDynaProperties = new KBDynaPropertiesImpl();
		return kbDynaProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZConfigurationManager createJZConfigurationManager() {
		JZConfigurationManagerImpl jzConfigurationManager = new JZConfigurationManagerImpl();
		return jzConfigurationManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzOscVar createJzOscVar() {
		JzOscVarImpl jzOscVar = new JzOscVarImpl();
		return jzOscVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZVar createJZVar() {
		JZVarImpl jzVar = new JZVarImpl();
		return jzVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzMidiVar createJzMidiVar() {
		JzMidiVarImpl jzMidiVar = new JzMidiVarImpl();
		return jzMidiVar;
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
	public MidiVar80NoteOff createMidiVar80NoteOff() {
		MidiVar80NoteOffImpl midiVar80NoteOff = new MidiVar80NoteOffImpl();
		return midiVar80NoteOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVar90NoteOn createMidiVar90NoteOn() {
		MidiVar90NoteOnImpl midiVar90NoteOn = new MidiVar90NoteOnImpl();
		return midiVar90NoteOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarA0KeyPressure createMidiVarA0KeyPressure() {
		MidiVarA0KeyPressureImpl midiVarA0KeyPressure = new MidiVarA0KeyPressureImpl();
		return midiVarA0KeyPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarB0ControlChange createMidiVarB0ControlChange() {
		MidiVarB0ControlChangeImpl midiVarB0ControlChange = new MidiVarB0ControlChangeImpl();
		return midiVarB0ControlChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarC0ProgramChange createMidiVarC0ProgramChange() {
		MidiVarC0ProgramChangeImpl midiVarC0ProgramChange = new MidiVarC0ProgramChangeImpl();
		return midiVarC0ProgramChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarD0ChannelPressure createMidiVarD0ChannelPressure() {
		MidiVarD0ChannelPressureImpl midiVarD0ChannelPressure = new MidiVarD0ChannelPressureImpl();
		return midiVarD0ChannelPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarE0PitchBend createMidiVarE0PitchBend() {
		MidiVarE0PitchBendImpl midiVarE0PitchBend = new MidiVarE0PitchBendImpl();
		return midiVarE0PitchBend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarF0SystemExclusive createMidiVarF0SystemExclusive() {
		MidiVarF0SystemExclusiveImpl midiVarF0SystemExclusive = new MidiVarF0SystemExclusiveImpl();
		return midiVarF0SystemExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarF2SngPosition createMidiVarF2SngPosition() {
		MidiVarF2SngPositionImpl midiVarF2SngPosition = new MidiVarF2SngPositionImpl();
		return midiVarF2SngPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarF3SongSelect createMidiVarF3SongSelect() {
		MidiVarF3SongSelectImpl midiVarF3SongSelect = new MidiVarF3SongSelectImpl();
		return midiVarF3SongSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarF5BusSelect createMidiVarF5BusSelect() {
		MidiVarF5BusSelectImpl midiVarF5BusSelect = new MidiVarF5BusSelectImpl();
		return midiVarF5BusSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarF6TuneRequest createMidiVarF6TuneRequest() {
		MidiVarF6TuneRequestImpl midiVarF6TuneRequest = new MidiVarF6TuneRequestImpl();
		return midiVarF6TuneRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarF8TimingTick createMidiVarF8TimingTick() {
		MidiVarF8TimingTickImpl midiVarF8TimingTick = new MidiVarF8TimingTickImpl();
		return midiVarF8TimingTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarFAStartSong createMidiVarFAStartSong() {
		MidiVarFAStartSongImpl midiVarFAStartSong = new MidiVarFAStartSongImpl();
		return midiVarFAStartSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarFBContinueSong createMidiVarFBContinueSong() {
		MidiVarFBContinueSongImpl midiVarFBContinueSong = new MidiVarFBContinueSongImpl();
		return midiVarFBContinueSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarFCStopSong createMidiVarFCStopSong() {
		MidiVarFCStopSongImpl midiVarFCStopSong = new MidiVarFCStopSongImpl();
		return midiVarFCStopSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarFEActiveSensing createMidiVarFEActiveSensing() {
		MidiVarFEActiveSensingImpl midiVarFEActiveSensing = new MidiVarFEActiveSensingImpl();
		return midiVarFEActiveSensing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVarFFSystemReset createMidiVarFFSystemReset() {
		MidiVarFFSystemResetImpl midiVarFFSystemReset = new MidiVarFFSystemResetImpl();
		return midiVarFFSystemReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMidiVarNote createAbstractMidiVarNote() {
		AbstractMidiVarNoteImpl abstractMidiVarNote = new AbstractMidiVarNoteImpl();
		return abstractMidiVarNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiVar createMidiVar() {
		MidiVarImpl midiVar = new MidiVarImpl();
		return midiVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurTrigger createLemurTriggerFromString(EDataType eDataType, String initialValue) {
		LemurTrigger result = LemurTrigger.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLemurTriggerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurPreferences createLemurPreferencesFromString(EDataType eDataType, String initialValue) {
		LemurPreferences result = LemurPreferences.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLemurPreferencesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurIncomingPorts createLemurIncomingPortsFromString(EDataType eDataType, String initialValue) {
		LemurIncomingPorts result = LemurIncomingPorts.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLemurIncomingPortsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIDI_MESSAGES createMIDI_MESSAGESFromString(EDataType eDataType, String initialValue) {
		MIDI_MESSAGES result = MIDI_MESSAGES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMIDI_MESSAGESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNOB_STYLE createKNOB_STYLEFromString(EDataType eDataType, String initialValue) {
		KNOB_STYLE result = KNOB_STYLE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKNOB_STYLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEMUR_STYLE createLEMUR_STYLEFromString(EDataType eDataType, String initialValue) {
		LEMUR_STYLE result = LEMUR_STYLE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEMUR_STYLEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FONT_SIZE createFONT_SIZEFromString(EDataType eDataType, String initialValue) {
		FONT_SIZE result = FONT_SIZE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFONT_SIZEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEXT_ALIGN createTEXT_ALIGNFromString(EDataType eDataType, String initialValue) {
		TEXT_ALIGN result = TEXT_ALIGN.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTEXT_ALIGNToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZML_MODE createJZML_MODEFromString(EDataType eDataType, String initialValue) {
		JZML_MODE result = JZML_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJZML_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BREAK_POINT_PHYSICS createBREAK_POINT_PHYSICSFromString(EDataType eDataType, String initialValue) {
		BREAK_POINT_PHYSICS result = BREAK_POINT_PHYSICS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBREAK_POINT_PHYSICSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEMUR_OSC_TARGET createLEMUR_OSC_TARGETFromString(EDataType eDataType, String initialValue) {
		LEMUR_OSC_TARGET result = LEMUR_OSC_TARGET.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEMUR_OSC_TARGETToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEMUR_MIDI_TARGET createLEMUR_MIDI_TARGETFromString(EDataType eDataType, String initialValue) {
		LEMUR_MIDI_TARGET result = LEMUR_MIDI_TARGET.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLEMUR_MIDI_TARGETToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CUSTOM_BUTTON_MODE createCUSTOM_BUTTON_MODEFromString(EDataType eDataType, String initialValue) {
		CUSTOM_BUTTON_MODE result = CUSTOM_BUTTON_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCUSTOM_BUTTON_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNOB_CURSOR_MODE createKNOB_CURSOR_MODEFromString(EDataType eDataType, String initialValue) {
		KNOB_CURSOR_MODE result = KNOB_CURSOR_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKNOB_CURSOR_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNOB_CONTROL createKNOB_CONTROLFromString(EDataType eDataType, String initialValue) {
		KNOB_CONTROL result = KNOB_CONTROL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKNOB_CONTROLToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KNOB_PHYSICS createKNOB_PHYSICSFromString(EDataType eDataType, String initialValue) {
		KNOB_PHYSICS result = KNOB_PHYSICS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKNOB_PHYSICSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FADER_CURSOR_MODE createFADER_CURSOR_MODEFromString(EDataType eDataType, String initialValue) {
		FADER_CURSOR_MODE result = FADER_CURSOR_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFADER_CURSOR_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FADER_PHYSICS createFADER_PHYSICSFromString(EDataType eDataType, String initialValue) {
		FADER_PHYSICS result = FADER_PHYSICS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFADER_PHYSICSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MULTIBALLS_CURSOR_MODE createMULTIBALLS_CURSOR_MODEFromString(EDataType eDataType, String initialValue) {
		MULTIBALLS_CURSOR_MODE result = MULTIBALLS_CURSOR_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMULTIBALLS_CURSOR_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MULTIBALLS_PHYSICS createMULTIBALLS_PHYSICSFromString(EDataType eDataType, String initialValue) {
		MULTIBALLS_PHYSICS result = MULTIBALLS_PHYSICS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMULTIBALLS_PHYSICSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
		String vals = initialValue.replace("Rectangle(", "");
		vals = vals.replace(")", "");
		String[] tokens = vals.split(",");
		
		int x = Integer.parseInt(tokens[0].trim());
		int y = Integer.parseInt(tokens[1].trim());
		int w = Integer.parseInt(tokens[2].trim());
		int h = Integer.parseInt(tokens[3].trim());
		
		return new Rectangle(x, y, w, h);
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
	public Point createPointFromString(EDataType eDataType, String initialValue) {
		String vals = initialValue.replace("Point(", "");
		vals = vals.replace(")", "");
		String[] tokens = vals.split(",");
		
		int x = Integer.parseInt(tokens[0].trim());
		int y = Integer.parseInt(tokens[1].trim());
		
		return new Point(x, y);
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
	 * @generated
	 */
	public PathData createPathDataFromString(EDataType eDataType, String initialValue) {
		return (PathData)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathDataToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return JzmlUiUtils.INSTANCE.getColorFromXMI(initialValue);
		//return (Color)super.createFromString(eDataType, initialValue);
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
	 * @generated
	 */
	public JzmuiPackage getJzmuiPackage() {
		return (JzmuiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JzmuiPackage getPackage() {
		return JzmuiPackage.eINSTANCE;
	}

} //JzmuiFactoryImpl
