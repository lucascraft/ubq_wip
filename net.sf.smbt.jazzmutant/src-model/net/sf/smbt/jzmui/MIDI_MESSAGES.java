/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jzmui;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MIDI MESSAGES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.jzmui.JzmuiPackage#getMIDI_MESSAGES()
 * @model
 * @generated
 */
public enum MIDI_MESSAGES implements Enumerator {
	/**
	 * The '<em><b>80 NOTE OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_80_NOTE_OF_VALUE
	 * @generated
	 * @ordered
	 */
	_80_NOTE_OF(0, "_80_NOTE_OF", "80 - Note Off"),

	/**
	 * The '<em><b>90 NOTE ON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_90_NOTE_ON_VALUE
	 * @generated
	 * @ordered
	 */
	_90_NOTE_ON(1, "_90_NOTE_ON", "90 - Note On"),

	/**
	 * The '<em><b>A0 KEY PRESSURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A0_KEY_PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	A0_KEY_PRESSURE(2, "A0_KEY_PRESSURE", "A0 - Key Pressure"),

	/**
	 * The '<em><b>B0 CONTROL CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B0_CONTROL_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	B0_CONTROL_CHANGE(3, "B0_CONTROL_CHANGE", "B0 - Control Change"),

	/**
	 * The '<em><b>C0 PROGRAM CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C0_PROGRAM_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	C0_PROGRAM_CHANGE(4, "C0_PROGRAM_CHANGE", "C0 - Program Change"),

	/**
	 * The '<em><b>D0 CHANNEL PRESSURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D0_CHANNEL_PRESSURE_VALUE
	 * @generated
	 * @ordered
	 */
	D0_CHANNEL_PRESSURE(5, "D0_CHANNEL_PRESSURE", "D0 - Channel Pressure"),

	/**
	 * The '<em><b>E0 PITCH BEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #E0_PITCH_BEND_VALUE
	 * @generated
	 * @ordered
	 */
	E0_PITCH_BEND(6, "E0_PITCH_BEND", "E0 - Pitch Bend"),

	/**
	 * The '<em><b>F0 SYSTEM EXCLUSIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F0_SYSTEM_EXCLUSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	F0_SYSTEM_EXCLUSIVE(7, "F0_SYSTEM_EXCLUSIVE", "F0 - System Eclusive"),

	/**
	 * The '<em><b>F2 SONG POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F2_SONG_POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	F2_SONG_POSITION(8, "F2_SONG_POSITION", "F2 - Song Position"),

	/**
	 * The '<em><b>F3 SONG SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F3_SONG_SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	F3_SONG_SELECT(9, "F3_SONG_SELECT", "F3 - Song Select"),

	/**
	 * The '<em><b>F5 BUS SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F5_BUS_SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	F5_BUS_SELECT(10, "F5_BUS_SELECT", "F5 - Bus Select"),

	/**
	 * The '<em><b>F6 TUNE REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F6_TUNE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	F6_TUNE_REQUEST(11, "F6_TUNE_REQUEST", "F6 - Tune Request"),

	/**
	 * The '<em><b>F8 TIMING TICK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F8_TIMING_TICK_VALUE
	 * @generated
	 * @ordered
	 */
	F8_TIMING_TICK(12, "F8_TIMING_TICK", "F8 - Timing Tick"),

	/**
	 * The '<em><b>FA START SONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FA_START_SONG_VALUE
	 * @generated
	 * @ordered
	 */
	FA_START_SONG(13, "FA_START_SONG", "FA - Start Song"),

	/**
	 * The '<em><b>FB CONTINUE SONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FB_CONTINUE_SONG_VALUE
	 * @generated
	 * @ordered
	 */
	FB_CONTINUE_SONG(14, "FB_CONTINUE_SONG", "FB - Continue Song"),

	/**
	 * The '<em><b>FC STOP SONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FC_STOP_SONG_VALUE
	 * @generated
	 * @ordered
	 */
	FC_STOP_SONG(15, "FC_STOP_SONG", "FC - Stop Song"),

	/**
	 * The '<em><b>FE ACTIVE SENSING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FE_ACTIVE_SENSING_VALUE
	 * @generated
	 * @ordered
	 */
	FE_ACTIVE_SENSING(16, "FE_ACTIVE_SENSING", "FE - Active Sensing"),

	/**
	 * The '<em><b>FF SYSTEM RESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FF_SYSTEM_RESET_VALUE
	 * @generated
	 * @ordered
	 */
	FF_SYSTEM_RESET(17, "FF_SYSTEM_RESET", "FF - System Reset"), /**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(18, "NONE", "NONE");

	/**
	 * The '<em><b>80 NOTE OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>80 NOTE OF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_80_NOTE_OF
	 * @model literal="80 - Note Off"
	 * @generated
	 * @ordered
	 */
	public static final int _80_NOTE_OF_VALUE = 0;

	/**
	 * The '<em><b>90 NOTE ON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>90 NOTE ON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_90_NOTE_ON
	 * @model literal="90 - Note On"
	 * @generated
	 * @ordered
	 */
	public static final int _90_NOTE_ON_VALUE = 1;

	/**
	 * The '<em><b>A0 KEY PRESSURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A0 KEY PRESSURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A0_KEY_PRESSURE
	 * @model literal="A0 - Key Pressure"
	 * @generated
	 * @ordered
	 */
	public static final int A0_KEY_PRESSURE_VALUE = 2;

	/**
	 * The '<em><b>B0 CONTROL CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>B0 CONTROL CHANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #B0_CONTROL_CHANGE
	 * @model literal="B0 - Control Change"
	 * @generated
	 * @ordered
	 */
	public static final int B0_CONTROL_CHANGE_VALUE = 3;

	/**
	 * The '<em><b>C0 PROGRAM CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>C0 PROGRAM CHANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #C0_PROGRAM_CHANGE
	 * @model literal="C0 - Program Change"
	 * @generated
	 * @ordered
	 */
	public static final int C0_PROGRAM_CHANGE_VALUE = 4;

	/**
	 * The '<em><b>D0 CHANNEL PRESSURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D0 CHANNEL PRESSURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D0_CHANNEL_PRESSURE
	 * @model literal="D0 - Channel Pressure"
	 * @generated
	 * @ordered
	 */
	public static final int D0_CHANNEL_PRESSURE_VALUE = 5;

	/**
	 * The '<em><b>E0 PITCH BEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>E0 PITCH BEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #E0_PITCH_BEND
	 * @model literal="E0 - Pitch Bend"
	 * @generated
	 * @ordered
	 */
	public static final int E0_PITCH_BEND_VALUE = 6;

	/**
	 * The '<em><b>F0 SYSTEM EXCLUSIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F0 SYSTEM EXCLUSIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F0_SYSTEM_EXCLUSIVE
	 * @model literal="F0 - System Eclusive"
	 * @generated
	 * @ordered
	 */
	public static final int F0_SYSTEM_EXCLUSIVE_VALUE = 7;

	/**
	 * The '<em><b>F2 SONG POSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F2 SONG POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F2_SONG_POSITION
	 * @model literal="F2 - Song Position"
	 * @generated
	 * @ordered
	 */
	public static final int F2_SONG_POSITION_VALUE = 8;

	/**
	 * The '<em><b>F3 SONG SELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F3 SONG SELECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F3_SONG_SELECT
	 * @model literal="F3 - Song Select"
	 * @generated
	 * @ordered
	 */
	public static final int F3_SONG_SELECT_VALUE = 9;

	/**
	 * The '<em><b>F5 BUS SELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F5 BUS SELECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F5_BUS_SELECT
	 * @model literal="F5 - Bus Select"
	 * @generated
	 * @ordered
	 */
	public static final int F5_BUS_SELECT_VALUE = 10;

	/**
	 * The '<em><b>F6 TUNE REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F6 TUNE REQUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F6_TUNE_REQUEST
	 * @model literal="F6 - Tune Request"
	 * @generated
	 * @ordered
	 */
	public static final int F6_TUNE_REQUEST_VALUE = 11;

	/**
	 * The '<em><b>F8 TIMING TICK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F8 TIMING TICK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F8_TIMING_TICK
	 * @model literal="F8 - Timing Tick"
	 * @generated
	 * @ordered
	 */
	public static final int F8_TIMING_TICK_VALUE = 12;

	/**
	 * The '<em><b>FA START SONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FA START SONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FA_START_SONG
	 * @model literal="FA - Start Song"
	 * @generated
	 * @ordered
	 */
	public static final int FA_START_SONG_VALUE = 13;

	/**
	 * The '<em><b>FB CONTINUE SONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FB CONTINUE SONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FB_CONTINUE_SONG
	 * @model literal="FB - Continue Song"
	 * @generated
	 * @ordered
	 */
	public static final int FB_CONTINUE_SONG_VALUE = 14;

	/**
	 * The '<em><b>FC STOP SONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FC STOP SONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FC_STOP_SONG
	 * @model literal="FC - Stop Song"
	 * @generated
	 * @ordered
	 */
	public static final int FC_STOP_SONG_VALUE = 15;

	/**
	 * The '<em><b>FE ACTIVE SENSING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FE ACTIVE SENSING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FE_ACTIVE_SENSING
	 * @model literal="FE - Active Sensing"
	 * @generated
	 * @ordered
	 */
	public static final int FE_ACTIVE_SENSING_VALUE = 16;

	/**
	 * The '<em><b>FF SYSTEM RESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FF SYSTEM RESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FF_SYSTEM_RESET
	 * @model literal="FF - System Reset"
	 * @generated
	 * @ordered
	 */
	public static final int FF_SYSTEM_RESET_VALUE = 17;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 18;

	/**
	 * An array of all the '<em><b>MIDI MESSAGES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MIDI_MESSAGES[] VALUES_ARRAY =
		new MIDI_MESSAGES[] {
			_80_NOTE_OF,
			_90_NOTE_ON,
			A0_KEY_PRESSURE,
			B0_CONTROL_CHANGE,
			C0_PROGRAM_CHANGE,
			D0_CHANNEL_PRESSURE,
			E0_PITCH_BEND,
			F0_SYSTEM_EXCLUSIVE,
			F2_SONG_POSITION,
			F3_SONG_SELECT,
			F5_BUS_SELECT,
			F6_TUNE_REQUEST,
			F8_TIMING_TICK,
			FA_START_SONG,
			FB_CONTINUE_SONG,
			FC_STOP_SONG,
			FE_ACTIVE_SENSING,
			FF_SYSTEM_RESET,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>MIDI MESSAGES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MIDI_MESSAGES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MIDI MESSAGES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MIDI_MESSAGES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MIDI_MESSAGES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MIDI MESSAGES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MIDI_MESSAGES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MIDI_MESSAGES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MIDI MESSAGES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MIDI_MESSAGES get(int value) {
		switch (value) {
			case _80_NOTE_OF_VALUE: return _80_NOTE_OF;
			case _90_NOTE_ON_VALUE: return _90_NOTE_ON;
			case A0_KEY_PRESSURE_VALUE: return A0_KEY_PRESSURE;
			case B0_CONTROL_CHANGE_VALUE: return B0_CONTROL_CHANGE;
			case C0_PROGRAM_CHANGE_VALUE: return C0_PROGRAM_CHANGE;
			case D0_CHANNEL_PRESSURE_VALUE: return D0_CHANNEL_PRESSURE;
			case E0_PITCH_BEND_VALUE: return E0_PITCH_BEND;
			case F0_SYSTEM_EXCLUSIVE_VALUE: return F0_SYSTEM_EXCLUSIVE;
			case F2_SONG_POSITION_VALUE: return F2_SONG_POSITION;
			case F3_SONG_SELECT_VALUE: return F3_SONG_SELECT;
			case F5_BUS_SELECT_VALUE: return F5_BUS_SELECT;
			case F6_TUNE_REQUEST_VALUE: return F6_TUNE_REQUEST;
			case F8_TIMING_TICK_VALUE: return F8_TIMING_TICK;
			case FA_START_SONG_VALUE: return FA_START_SONG;
			case FB_CONTINUE_SONG_VALUE: return FB_CONTINUE_SONG;
			case FC_STOP_SONG_VALUE: return FC_STOP_SONG;
			case FE_ACTIVE_SENSING_VALUE: return FE_ACTIVE_SENSING;
			case FF_SYSTEM_RESET_VALUE: return FF_SYSTEM_RESET;
			case NONE_VALUE: return NONE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MIDI_MESSAGES(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MIDI_MESSAGES
