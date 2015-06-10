/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.jzmui.JzmuiPackage
 * @generated
 */
public class JzmuiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JzmuiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzmuiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JzmuiPackage.eINSTANCE;
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
	protected JzmuiSwitch<Adapter> modelSwitch =
		new JzmuiSwitch<Adapter>() {
			@Override
			public Adapter caseLemurLiveApp(LemurLiveApp object) {
				return createLemurLiveAppAdapter();
			}
			@Override
			public Adapter caseJZUIElem(JZUIElem object) {
				return createJZUIElemAdapter();
			}
			@Override
			public Adapter caseJZContainer(JZContainer object) {
				return createJZContainerAdapter();
			}
			@Override
			public Adapter caseJZWidget(JZWidget object) {
				return createJZWidgetAdapter();
			}
			@Override
			public Adapter caseJZBreakPoint(JZBreakPoint object) {
				return createJZBreakPointAdapter();
			}
			@Override
			public Adapter caseJZFader(JZFader object) {
				return createJZFaderAdapter();
			}
			@Override
			public Adapter caseJZGesture(JZGesture object) {
				return createJZGestureAdapter();
			}
			@Override
			public Adapter caseJZKnob(JZKnob object) {
				return createJZKnobAdapter();
			}
			@Override
			public Adapter caseJZLed(JZLed object) {
				return createJZLedAdapter();
			}
			@Override
			public Adapter caseJZLemurMenu(JZLemurMenu object) {
				return createJZLemurMenuAdapter();
			}
			@Override
			public Adapter caseJZLemurMonitor(JZLemurMonitor object) {
				return createJZLemurMonitorAdapter();
			}
			@Override
			public Adapter caseJZPads(JZPads object) {
				return createJZPadsAdapter();
			}
			@Override
			public Adapter caseJZSurfaceLCD(JZSurfaceLCD object) {
				return createJZSurfaceLCDAdapter();
			}
			@Override
			public Adapter caseJZSwitches(JZSwitches object) {
				return createJZSwitchesAdapter();
			}
			@Override
			public Adapter caseJZText(JZText object) {
				return createJZTextAdapter();
			}
			@Override
			public Adapter caseJZCustomButton(JZCustomButton object) {
				return createJZCustomButtonAdapter();
			}
			@Override
			public Adapter caseJZSignalScope(JZSignalScope object) {
				return createJZSignalScopeAdapter();
			}
			@Override
			public Adapter caseJZRange(JZRange object) {
				return createJZRangeAdapter();
			}
			@Override
			public Adapter caseJZMultiBalls(JZMultiBalls object) {
				return createJZMultiBallsAdapter();
			}
			@Override
			public Adapter caseJZTrack(JZTrack object) {
				return createJZTrackAdapter();
			}
			@Override
			public Adapter caseJZmultiSlider(JZmultiSlider object) {
				return createJZmultiSliderAdapter();
			}
			@Override
			public Adapter caseJZMenuItem(JZMenuItem object) {
				return createJZMenuItemAdapter();
			}
			@Override
			public Adapter caseJZRingArea(JZRingArea object) {
				return createJZRingAreaAdapter();
			}
			@Override
			public Adapter caseOSCDynaProperties(OSCDynaProperties object) {
				return createOSCDynaPropertiesAdapter();
			}
			@Override
			public Adapter caseMidiDynaProperties(MidiDynaProperties object) {
				return createMidiDynaPropertiesAdapter();
			}
			@Override
			public Adapter caseDMXDynaProperties(DMXDynaProperties object) {
				return createDMXDynaPropertiesAdapter();
			}
			@Override
			public Adapter caseJZJazzInterface(JZJazzInterface object) {
				return createJZJazzInterfaceAdapter();
			}
			@Override
			public Adapter caseJZTarget(JZTarget object) {
				return createJZTargetAdapter();
			}
			@Override
			public Adapter caseJzOscTarget(JzOscTarget object) {
				return createJzOscTargetAdapter();
			}
			@Override
			public Adapter caseJzMidiTarget(JzMidiTarget object) {
				return createJzMidiTargetAdapter();
			}
			@Override
			public Adapter caseJzKBTarget(JzKBTarget object) {
				return createJzKBTargetAdapter();
			}
			@Override
			public Adapter caseKBDynaProperties(KBDynaProperties object) {
				return createKBDynaPropertiesAdapter();
			}
			@Override
			public Adapter caseJZConfigurationManager(JZConfigurationManager object) {
				return createJZConfigurationManagerAdapter();
			}
			@Override
			public Adapter caseJzOscVar(JzOscVar object) {
				return createJzOscVarAdapter();
			}
			@Override
			public Adapter caseJZVar(JZVar object) {
				return createJZVarAdapter();
			}
			@Override
			public Adapter caseJzMidiVar(JzMidiVar object) {
				return createJzMidiVarAdapter();
			}
			@Override
			public Adapter caseScript(Script object) {
				return createScriptAdapter();
			}
			@Override
			public Adapter caseMidiVar80NoteOff(MidiVar80NoteOff object) {
				return createMidiVar80NoteOffAdapter();
			}
			@Override
			public Adapter caseMidiVar90NoteOn(MidiVar90NoteOn object) {
				return createMidiVar90NoteOnAdapter();
			}
			@Override
			public Adapter caseMidiVarA0KeyPressure(MidiVarA0KeyPressure object) {
				return createMidiVarA0KeyPressureAdapter();
			}
			@Override
			public Adapter caseMidiVarB0ControlChange(MidiVarB0ControlChange object) {
				return createMidiVarB0ControlChangeAdapter();
			}
			@Override
			public Adapter caseMidiVarC0ProgramChange(MidiVarC0ProgramChange object) {
				return createMidiVarC0ProgramChangeAdapter();
			}
			@Override
			public Adapter caseMidiVarD0ChannelPressure(MidiVarD0ChannelPressure object) {
				return createMidiVarD0ChannelPressureAdapter();
			}
			@Override
			public Adapter caseMidiVarE0PitchBend(MidiVarE0PitchBend object) {
				return createMidiVarE0PitchBendAdapter();
			}
			@Override
			public Adapter caseMidiVarF0SystemExclusive(MidiVarF0SystemExclusive object) {
				return createMidiVarF0SystemExclusiveAdapter();
			}
			@Override
			public Adapter caseMidiVarF2SngPosition(MidiVarF2SngPosition object) {
				return createMidiVarF2SngPositionAdapter();
			}
			@Override
			public Adapter caseMidiVarF3SongSelect(MidiVarF3SongSelect object) {
				return createMidiVarF3SongSelectAdapter();
			}
			@Override
			public Adapter caseMidiVarF5BusSelect(MidiVarF5BusSelect object) {
				return createMidiVarF5BusSelectAdapter();
			}
			@Override
			public Adapter caseMidiVarF6TuneRequest(MidiVarF6TuneRequest object) {
				return createMidiVarF6TuneRequestAdapter();
			}
			@Override
			public Adapter caseMidiVarF8TimingTick(MidiVarF8TimingTick object) {
				return createMidiVarF8TimingTickAdapter();
			}
			@Override
			public Adapter caseMidiVarFAStartSong(MidiVarFAStartSong object) {
				return createMidiVarFAStartSongAdapter();
			}
			@Override
			public Adapter caseMidiVarFBContinueSong(MidiVarFBContinueSong object) {
				return createMidiVarFBContinueSongAdapter();
			}
			@Override
			public Adapter caseMidiVarFCStopSong(MidiVarFCStopSong object) {
				return createMidiVarFCStopSongAdapter();
			}
			@Override
			public Adapter caseMidiVarFEActiveSensing(MidiVarFEActiveSensing object) {
				return createMidiVarFEActiveSensingAdapter();
			}
			@Override
			public Adapter caseMidiVarFFSystemReset(MidiVarFFSystemReset object) {
				return createMidiVarFFSystemResetAdapter();
			}
			@Override
			public Adapter caseAbstractMidiVarNote(AbstractMidiVarNote object) {
				return createAbstractMidiVarNoteAdapter();
			}
			@Override
			public Adapter caseMidiVar(MidiVar object) {
				return createMidiVarAdapter();
			}
			@Override
			public Adapter caseIConnectedUnit(IConnectedUnit object) {
				return createIConnectedUnitAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.LemurLiveApp <em>Lemur Live App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.LemurLiveApp
	 * @generated
	 */
	public Adapter createLemurLiveAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZUIElem <em>JZUI Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZUIElem
	 * @generated
	 */
	public Adapter createJZUIElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZContainer <em>JZ Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZContainer
	 * @generated
	 */
	public Adapter createJZContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZWidget <em>JZ Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZWidget
	 * @generated
	 */
	public Adapter createJZWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZBreakPoint <em>JZ Break Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZBreakPoint
	 * @generated
	 */
	public Adapter createJZBreakPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZFader <em>JZ Fader</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZFader
	 * @generated
	 */
	public Adapter createJZFaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZGesture <em>JZ Gesture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZGesture
	 * @generated
	 */
	public Adapter createJZGestureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZKnob <em>JZ Knob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZKnob
	 * @generated
	 */
	public Adapter createJZKnobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZLed <em>JZ Led</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZLed
	 * @generated
	 */
	public Adapter createJZLedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZLemurMenu <em>JZ Lemur Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZLemurMenu
	 * @generated
	 */
	public Adapter createJZLemurMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZLemurMonitor <em>JZ Lemur Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZLemurMonitor
	 * @generated
	 */
	public Adapter createJZLemurMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZPads <em>JZ Pads</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZPads
	 * @generated
	 */
	public Adapter createJZPadsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZSurfaceLCD <em>JZ Surface LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZSurfaceLCD
	 * @generated
	 */
	public Adapter createJZSurfaceLCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZSwitches <em>JZ Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZSwitches
	 * @generated
	 */
	public Adapter createJZSwitchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZText <em>JZ Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZText
	 * @generated
	 */
	public Adapter createJZTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZCustomButton <em>JZ Custom Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZCustomButton
	 * @generated
	 */
	public Adapter createJZCustomButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZSignalScope <em>JZ Signal Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZSignalScope
	 * @generated
	 */
	public Adapter createJZSignalScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZRange <em>JZ Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZRange
	 * @generated
	 */
	public Adapter createJZRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZMultiBalls <em>JZ Multi Balls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZMultiBalls
	 * @generated
	 */
	public Adapter createJZMultiBallsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZTrack <em>JZ Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZTrack
	 * @generated
	 */
	public Adapter createJZTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZmultiSlider <em>JZmulti Slider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZmultiSlider
	 * @generated
	 */
	public Adapter createJZmultiSliderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZMenuItem <em>JZ Menu Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZMenuItem
	 * @generated
	 */
	public Adapter createJZMenuItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZRingArea <em>JZ Ring Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZRingArea
	 * @generated
	 */
	public Adapter createJZRingAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.OSCDynaProperties <em>OSC Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.OSCDynaProperties
	 * @generated
	 */
	public Adapter createOSCDynaPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiDynaProperties <em>Midi Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiDynaProperties
	 * @generated
	 */
	public Adapter createMidiDynaPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.DMXDynaProperties <em>DMX Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.DMXDynaProperties
	 * @generated
	 */
	public Adapter createDMXDynaPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZJazzInterface <em>JZ Jazz Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZJazzInterface
	 * @generated
	 */
	public Adapter createJZJazzInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZTarget <em>JZ Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZTarget
	 * @generated
	 */
	public Adapter createJZTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JzOscTarget <em>Jz Osc Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JzOscTarget
	 * @generated
	 */
	public Adapter createJzOscTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JzMidiTarget <em>Jz Midi Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JzMidiTarget
	 * @generated
	 */
	public Adapter createJzMidiTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JzKBTarget <em>Jz KB Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JzKBTarget
	 * @generated
	 */
	public Adapter createJzKBTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.KBDynaProperties <em>KB Dyna Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.KBDynaProperties
	 * @generated
	 */
	public Adapter createKBDynaPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZConfigurationManager <em>JZ Configuration Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZConfigurationManager
	 * @generated
	 */
	public Adapter createJZConfigurationManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JzOscVar <em>Jz Osc Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JzOscVar
	 * @generated
	 */
	public Adapter createJzOscVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JZVar <em>JZ Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JZVar
	 * @generated
	 */
	public Adapter createJZVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.JzMidiVar <em>Jz Midi Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.JzMidiVar
	 * @generated
	 */
	public Adapter createJzMidiVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVar80NoteOff <em>Midi Var80 Note Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVar80NoteOff
	 * @generated
	 */
	public Adapter createMidiVar80NoteOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVar90NoteOn <em>Midi Var90 Note On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVar90NoteOn
	 * @generated
	 */
	public Adapter createMidiVar90NoteOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarA0KeyPressure <em>Midi Var A0 Key Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarA0KeyPressure
	 * @generated
	 */
	public Adapter createMidiVarA0KeyPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarB0ControlChange <em>Midi Var B0 Control Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarB0ControlChange
	 * @generated
	 */
	public Adapter createMidiVarB0ControlChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarC0ProgramChange <em>Midi Var C0 Program Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarC0ProgramChange
	 * @generated
	 */
	public Adapter createMidiVarC0ProgramChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarD0ChannelPressure <em>Midi Var D0 Channel Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarD0ChannelPressure
	 * @generated
	 */
	public Adapter createMidiVarD0ChannelPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarE0PitchBend <em>Midi Var E0 Pitch Bend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarE0PitchBend
	 * @generated
	 */
	public Adapter createMidiVarE0PitchBendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarF0SystemExclusive <em>Midi Var F0 System Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarF0SystemExclusive
	 * @generated
	 */
	public Adapter createMidiVarF0SystemExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarF2SngPosition <em>Midi Var F2 Sng Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarF2SngPosition
	 * @generated
	 */
	public Adapter createMidiVarF2SngPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarF3SongSelect <em>Midi Var F3 Song Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarF3SongSelect
	 * @generated
	 */
	public Adapter createMidiVarF3SongSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarF5BusSelect <em>Midi Var F5 Bus Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarF5BusSelect
	 * @generated
	 */
	public Adapter createMidiVarF5BusSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarF6TuneRequest <em>Midi Var F6 Tune Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarF6TuneRequest
	 * @generated
	 */
	public Adapter createMidiVarF6TuneRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarF8TimingTick <em>Midi Var F8 Timing Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarF8TimingTick
	 * @generated
	 */
	public Adapter createMidiVarF8TimingTickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarFAStartSong <em>Midi Var FA Start Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarFAStartSong
	 * @generated
	 */
	public Adapter createMidiVarFAStartSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarFBContinueSong <em>Midi Var FB Continue Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarFBContinueSong
	 * @generated
	 */
	public Adapter createMidiVarFBContinueSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarFCStopSong <em>Midi Var FC Stop Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarFCStopSong
	 * @generated
	 */
	public Adapter createMidiVarFCStopSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarFEActiveSensing <em>Midi Var FE Active Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarFEActiveSensing
	 * @generated
	 */
	public Adapter createMidiVarFEActiveSensingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVarFFSystemReset <em>Midi Var FF System Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVarFFSystemReset
	 * @generated
	 */
	public Adapter createMidiVarFFSystemResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.AbstractMidiVarNote <em>Abstract Midi Var Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.AbstractMidiVarNote
	 * @generated
	 */
	public Adapter createAbstractMidiVarNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.jzmui.MidiVar <em>Midi Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.jzmui.MidiVar
	 * @generated
	 */
	public Adapter createMidiVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	public Adapter createIConnectedUnitAdapter() {
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

} //JzmuiAdapterFactory
