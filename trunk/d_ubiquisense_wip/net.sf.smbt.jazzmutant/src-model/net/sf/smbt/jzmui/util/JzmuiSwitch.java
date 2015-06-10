/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.util;

import java.util.List;

import net.sf.smbt.jzmui.*;
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
import net.sf.smbt.jzmui.JZWidget;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.JzKBTarget;
import net.sf.smbt.jzmui.JzMidiTarget;
import net.sf.smbt.jzmui.JzOscTarget;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.KBDynaProperties;
import net.sf.smbt.jzmui.LemurLiveApp;
import net.sf.smbt.jzmui.MidiDynaProperties;
import net.sf.smbt.jzmui.OSCDynaProperties;
import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.jzmui.JzmuiPackage
 * @generated
 */
public class JzmuiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JzmuiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzmuiSwitch() {
		if (modelPackage == null) {
			modelPackage = JzmuiPackage.eINSTANCE;
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
			case JzmuiPackage.LEMUR_LIVE_APP: {
				LemurLiveApp lemurLiveApp = (LemurLiveApp)theEObject;
				T result = caseLemurLiveApp(lemurLiveApp);
				if (result == null) result = caseIConnectedUnit(lemurLiveApp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZUI_ELEM: {
				JZUIElem jzuiElem = (JZUIElem)theEObject;
				T result = caseJZUIElem(jzuiElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_CONTAINER: {
				JZContainer jzContainer = (JZContainer)theEObject;
				T result = caseJZContainer(jzContainer);
				if (result == null) result = caseJZUIElem(jzContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_WIDGET: {
				JZWidget jzWidget = (JZWidget)theEObject;
				T result = caseJZWidget(jzWidget);
				if (result == null) result = caseJZUIElem(jzWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_BREAK_POINT: {
				JZBreakPoint jzBreakPoint = (JZBreakPoint)theEObject;
				T result = caseJZBreakPoint(jzBreakPoint);
				if (result == null) result = caseJZWidget(jzBreakPoint);
				if (result == null) result = caseJZUIElem(jzBreakPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_FADER: {
				JZFader jzFader = (JZFader)theEObject;
				T result = caseJZFader(jzFader);
				if (result == null) result = caseJZWidget(jzFader);
				if (result == null) result = caseJZUIElem(jzFader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_GESTURE: {
				JZGesture jzGesture = (JZGesture)theEObject;
				T result = caseJZGesture(jzGesture);
				if (result == null) result = caseJZWidget(jzGesture);
				if (result == null) result = caseJZUIElem(jzGesture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_KNOB: {
				JZKnob jzKnob = (JZKnob)theEObject;
				T result = caseJZKnob(jzKnob);
				if (result == null) result = caseJZWidget(jzKnob);
				if (result == null) result = caseJZUIElem(jzKnob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_LED: {
				JZLed jzLed = (JZLed)theEObject;
				T result = caseJZLed(jzLed);
				if (result == null) result = caseJZWidget(jzLed);
				if (result == null) result = caseJZUIElem(jzLed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_LEMUR_MENU: {
				JZLemurMenu jzLemurMenu = (JZLemurMenu)theEObject;
				T result = caseJZLemurMenu(jzLemurMenu);
				if (result == null) result = caseJZWidget(jzLemurMenu);
				if (result == null) result = caseJZUIElem(jzLemurMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_LEMUR_MONITOR: {
				JZLemurMonitor jzLemurMonitor = (JZLemurMonitor)theEObject;
				T result = caseJZLemurMonitor(jzLemurMonitor);
				if (result == null) result = caseJZWidget(jzLemurMonitor);
				if (result == null) result = caseJZUIElem(jzLemurMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_PADS: {
				JZPads jzPads = (JZPads)theEObject;
				T result = caseJZPads(jzPads);
				if (result == null) result = caseJZWidget(jzPads);
				if (result == null) result = caseJZUIElem(jzPads);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_SURFACE_LCD: {
				JZSurfaceLCD jzSurfaceLCD = (JZSurfaceLCD)theEObject;
				T result = caseJZSurfaceLCD(jzSurfaceLCD);
				if (result == null) result = caseJZWidget(jzSurfaceLCD);
				if (result == null) result = caseJZUIElem(jzSurfaceLCD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_SWITCHES: {
				JZSwitches jzSwitches = (JZSwitches)theEObject;
				T result = caseJZSwitches(jzSwitches);
				if (result == null) result = caseJZWidget(jzSwitches);
				if (result == null) result = caseJZUIElem(jzSwitches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_TEXT: {
				JZText jzText = (JZText)theEObject;
				T result = caseJZText(jzText);
				if (result == null) result = caseJZWidget(jzText);
				if (result == null) result = caseJZUIElem(jzText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_CUSTOM_BUTTON: {
				JZCustomButton jzCustomButton = (JZCustomButton)theEObject;
				T result = caseJZCustomButton(jzCustomButton);
				if (result == null) result = caseJZWidget(jzCustomButton);
				if (result == null) result = caseJZUIElem(jzCustomButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_SIGNAL_SCOPE: {
				JZSignalScope jzSignalScope = (JZSignalScope)theEObject;
				T result = caseJZSignalScope(jzSignalScope);
				if (result == null) result = caseJZWidget(jzSignalScope);
				if (result == null) result = caseJZUIElem(jzSignalScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_RANGE: {
				JZRange jzRange = (JZRange)theEObject;
				T result = caseJZRange(jzRange);
				if (result == null) result = caseJZWidget(jzRange);
				if (result == null) result = caseJZUIElem(jzRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_MULTI_BALLS: {
				JZMultiBalls jzMultiBalls = (JZMultiBalls)theEObject;
				T result = caseJZMultiBalls(jzMultiBalls);
				if (result == null) result = caseJZWidget(jzMultiBalls);
				if (result == null) result = caseJZUIElem(jzMultiBalls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_TRACK: {
				JZTrack jzTrack = (JZTrack)theEObject;
				T result = caseJZTrack(jzTrack);
				if (result == null) result = caseJZWidget(jzTrack);
				if (result == null) result = caseJZUIElem(jzTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZMULTI_SLIDER: {
				JZmultiSlider jZmultiSlider = (JZmultiSlider)theEObject;
				T result = caseJZmultiSlider(jZmultiSlider);
				if (result == null) result = caseJZWidget(jZmultiSlider);
				if (result == null) result = caseJZUIElem(jZmultiSlider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_MENU_ITEM: {
				JZMenuItem jzMenuItem = (JZMenuItem)theEObject;
				T result = caseJZMenuItem(jzMenuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_RING_AREA: {
				JZRingArea jzRingArea = (JZRingArea)theEObject;
				T result = caseJZRingArea(jzRingArea);
				if (result == null) result = caseJZWidget(jzRingArea);
				if (result == null) result = caseJZUIElem(jzRingArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.OSC_DYNA_PROPERTIES: {
				OSCDynaProperties oscDynaProperties = (OSCDynaProperties)theEObject;
				T result = caseOSCDynaProperties(oscDynaProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_DYNA_PROPERTIES: {
				MidiDynaProperties midiDynaProperties = (MidiDynaProperties)theEObject;
				T result = caseMidiDynaProperties(midiDynaProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.DMX_DYNA_PROPERTIES: {
				DMXDynaProperties dmxDynaProperties = (DMXDynaProperties)theEObject;
				T result = caseDMXDynaProperties(dmxDynaProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_JAZZ_INTERFACE: {
				JZJazzInterface jzJazzInterface = (JZJazzInterface)theEObject;
				T result = caseJZJazzInterface(jzJazzInterface);
				if (result == null) result = caseJZContainer(jzJazzInterface);
				if (result == null) result = caseJZUIElem(jzJazzInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_TARGET: {
				JZTarget jzTarget = (JZTarget)theEObject;
				T result = caseJZTarget(jzTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_OSC_TARGET: {
				JzOscTarget jzOscTarget = (JzOscTarget)theEObject;
				T result = caseJzOscTarget(jzOscTarget);
				if (result == null) result = caseJZTarget(jzOscTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_MIDI_TARGET: {
				JzMidiTarget jzMidiTarget = (JzMidiTarget)theEObject;
				T result = caseJzMidiTarget(jzMidiTarget);
				if (result == null) result = caseJZTarget(jzMidiTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_KB_TARGET: {
				JzKBTarget jzKBTarget = (JzKBTarget)theEObject;
				T result = caseJzKBTarget(jzKBTarget);
				if (result == null) result = caseJZTarget(jzKBTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.KB_DYNA_PROPERTIES: {
				KBDynaProperties kbDynaProperties = (KBDynaProperties)theEObject;
				T result = caseKBDynaProperties(kbDynaProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_CONFIGURATION_MANAGER: {
				JZConfigurationManager jzConfigurationManager = (JZConfigurationManager)theEObject;
				T result = caseJZConfigurationManager(jzConfigurationManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_OSC_VAR: {
				JzOscVar jzOscVar = (JzOscVar)theEObject;
				T result = caseJzOscVar(jzOscVar);
				if (result == null) result = caseJZVar(jzOscVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_VAR: {
				JZVar jzVar = (JZVar)theEObject;
				T result = caseJZVar(jzVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.JZ_MIDI_VAR: {
				JzMidiVar jzMidiVar = (JzMidiVar)theEObject;
				T result = caseJzMidiVar(jzMidiVar);
				if (result == null) result = caseJZVar(jzMidiVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR80_NOTE_OFF: {
				MidiVar80NoteOff midiVar80NoteOff = (MidiVar80NoteOff)theEObject;
				T result = caseMidiVar80NoteOff(midiVar80NoteOff);
				if (result == null) result = caseAbstractMidiVarNote(midiVar80NoteOff);
				if (result == null) result = caseMidiVar(midiVar80NoteOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR90_NOTE_ON: {
				MidiVar90NoteOn midiVar90NoteOn = (MidiVar90NoteOn)theEObject;
				T result = caseMidiVar90NoteOn(midiVar90NoteOn);
				if (result == null) result = caseAbstractMidiVarNote(midiVar90NoteOn);
				if (result == null) result = caseMidiVar(midiVar90NoteOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_A0_KEY_PRESSURE: {
				MidiVarA0KeyPressure midiVarA0KeyPressure = (MidiVarA0KeyPressure)theEObject;
				T result = caseMidiVarA0KeyPressure(midiVarA0KeyPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_B0_CONTROL_CHANGE: {
				MidiVarB0ControlChange midiVarB0ControlChange = (MidiVarB0ControlChange)theEObject;
				T result = caseMidiVarB0ControlChange(midiVarB0ControlChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_C0_PROGRAM_CHANGE: {
				MidiVarC0ProgramChange midiVarC0ProgramChange = (MidiVarC0ProgramChange)theEObject;
				T result = caseMidiVarC0ProgramChange(midiVarC0ProgramChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_D0_CHANNEL_PRESSURE: {
				MidiVarD0ChannelPressure midiVarD0ChannelPressure = (MidiVarD0ChannelPressure)theEObject;
				T result = caseMidiVarD0ChannelPressure(midiVarD0ChannelPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_E0_PITCH_BEND: {
				MidiVarE0PitchBend midiVarE0PitchBend = (MidiVarE0PitchBend)theEObject;
				T result = caseMidiVarE0PitchBend(midiVarE0PitchBend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_F0_SYSTEM_EXCLUSIVE: {
				MidiVarF0SystemExclusive midiVarF0SystemExclusive = (MidiVarF0SystemExclusive)theEObject;
				T result = caseMidiVarF0SystemExclusive(midiVarF0SystemExclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_F2_SNG_POSITION: {
				MidiVarF2SngPosition midiVarF2SngPosition = (MidiVarF2SngPosition)theEObject;
				T result = caseMidiVarF2SngPosition(midiVarF2SngPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_F3_SONG_SELECT: {
				MidiVarF3SongSelect midiVarF3SongSelect = (MidiVarF3SongSelect)theEObject;
				T result = caseMidiVarF3SongSelect(midiVarF3SongSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_F5_BUS_SELECT: {
				MidiVarF5BusSelect midiVarF5BusSelect = (MidiVarF5BusSelect)theEObject;
				T result = caseMidiVarF5BusSelect(midiVarF5BusSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_F6_TUNE_REQUEST: {
				MidiVarF6TuneRequest midiVarF6TuneRequest = (MidiVarF6TuneRequest)theEObject;
				T result = caseMidiVarF6TuneRequest(midiVarF6TuneRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_F8_TIMING_TICK: {
				MidiVarF8TimingTick midiVarF8TimingTick = (MidiVarF8TimingTick)theEObject;
				T result = caseMidiVarF8TimingTick(midiVarF8TimingTick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_FA_START_SONG: {
				MidiVarFAStartSong midiVarFAStartSong = (MidiVarFAStartSong)theEObject;
				T result = caseMidiVarFAStartSong(midiVarFAStartSong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_FB_CONTINUE_SONG: {
				MidiVarFBContinueSong midiVarFBContinueSong = (MidiVarFBContinueSong)theEObject;
				T result = caseMidiVarFBContinueSong(midiVarFBContinueSong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_FC_STOP_SONG: {
				MidiVarFCStopSong midiVarFCStopSong = (MidiVarFCStopSong)theEObject;
				T result = caseMidiVarFCStopSong(midiVarFCStopSong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_FE_ACTIVE_SENSING: {
				MidiVarFEActiveSensing midiVarFEActiveSensing = (MidiVarFEActiveSensing)theEObject;
				T result = caseMidiVarFEActiveSensing(midiVarFEActiveSensing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR_FF_SYSTEM_RESET: {
				MidiVarFFSystemReset midiVarFFSystemReset = (MidiVarFFSystemReset)theEObject;
				T result = caseMidiVarFFSystemReset(midiVarFFSystemReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.ABSTRACT_MIDI_VAR_NOTE: {
				AbstractMidiVarNote abstractMidiVarNote = (AbstractMidiVarNote)theEObject;
				T result = caseAbstractMidiVarNote(abstractMidiVarNote);
				if (result == null) result = caseMidiVar(abstractMidiVarNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JzmuiPackage.MIDI_VAR: {
				MidiVar midiVar = (MidiVar)theEObject;
				T result = caseMidiVar(midiVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lemur Live App</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lemur Live App</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLemurLiveApp(LemurLiveApp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZUI Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZUI Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZUIElem(JZUIElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZContainer(JZContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZWidget(JZWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Break Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Break Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZBreakPoint(JZBreakPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Fader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Fader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZFader(JZFader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Gesture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Gesture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZGesture(JZGesture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Knob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Knob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZKnob(JZKnob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Led</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Led</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZLed(JZLed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Lemur Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Lemur Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZLemurMenu(JZLemurMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Lemur Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Lemur Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZLemurMonitor(JZLemurMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Pads</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Pads</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZPads(JZPads object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Surface LCD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Surface LCD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZSurfaceLCD(JZSurfaceLCD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Switches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Switches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZSwitches(JZSwitches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZText(JZText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Custom Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Custom Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZCustomButton(JZCustomButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Signal Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Signal Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZSignalScope(JZSignalScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZRange(JZRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Multi Balls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Multi Balls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZMultiBalls(JZMultiBalls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZTrack(JZTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZmulti Slider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZmulti Slider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZmultiSlider(JZmultiSlider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Menu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Menu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZMenuItem(JZMenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Ring Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Ring Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZRingArea(JZRingArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OSC Dyna Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OSC Dyna Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSCDynaProperties(OSCDynaProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Dyna Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Dyna Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiDynaProperties(MidiDynaProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Dyna Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Dyna Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXDynaProperties(DMXDynaProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Jazz Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Jazz Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZJazzInterface(JZJazzInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZTarget(JZTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jz Osc Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jz Osc Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJzOscTarget(JzOscTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jz Midi Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jz Midi Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJzMidiTarget(JzMidiTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jz KB Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jz KB Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJzKBTarget(JzKBTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>KB Dyna Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>KB Dyna Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKBDynaProperties(KBDynaProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Configuration Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Configuration Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZConfigurationManager(JZConfigurationManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jz Osc Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jz Osc Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJzOscVar(JzOscVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JZ Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JZ Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJZVar(JZVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jz Midi Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jz Midi Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJzMidiVar(JzMidiVar object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var80 Note Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var80 Note Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVar80NoteOff(MidiVar80NoteOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var90 Note On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var90 Note On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVar90NoteOn(MidiVar90NoteOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var A0 Key Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var A0 Key Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarA0KeyPressure(MidiVarA0KeyPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var B0 Control Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var B0 Control Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarB0ControlChange(MidiVarB0ControlChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var C0 Program Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var C0 Program Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarC0ProgramChange(MidiVarC0ProgramChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var D0 Channel Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var D0 Channel Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarD0ChannelPressure(MidiVarD0ChannelPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var E0 Pitch Bend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var E0 Pitch Bend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarE0PitchBend(MidiVarE0PitchBend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var F0 System Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var F0 System Exclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarF0SystemExclusive(MidiVarF0SystemExclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var F2 Sng Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var F2 Sng Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarF2SngPosition(MidiVarF2SngPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var F3 Song Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var F3 Song Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarF3SongSelect(MidiVarF3SongSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var F5 Bus Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var F5 Bus Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarF5BusSelect(MidiVarF5BusSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var F6 Tune Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var F6 Tune Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarF6TuneRequest(MidiVarF6TuneRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var F8 Timing Tick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var F8 Timing Tick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarF8TimingTick(MidiVarF8TimingTick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var FA Start Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var FA Start Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarFAStartSong(MidiVarFAStartSong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var FB Continue Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var FB Continue Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarFBContinueSong(MidiVarFBContinueSong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var FC Stop Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var FC Stop Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarFCStopSong(MidiVarFCStopSong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var FE Active Sensing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var FE Active Sensing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarFEActiveSensing(MidiVarFEActiveSensing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var FF System Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var FF System Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVarFFSystemReset(MidiVarFFSystemReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Midi Var Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Midi Var Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMidiVarNote(AbstractMidiVarNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiVar(MidiVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConnectedUnit(IConnectedUnit object) {
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

} //JzmuiSwitch
