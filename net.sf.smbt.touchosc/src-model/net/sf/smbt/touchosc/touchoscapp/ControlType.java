/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getControlType()
 * @model
 * @generated
 */
public enum ControlType implements Enumerator {
	/**
	 * The '<em><b>LABEL V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_V_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL_V(1, "LABEL_V", "labelv"),

	/**
	 * The '<em><b>FADER H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADER_H_VALUE
	 * @generated
	 * @ordered
	 */
	FADER_H(2, "FADER_H", "faderh"),

	/**
	 * The '<em><b>FADER V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADER_V_VALUE
	 * @generated
	 * @ordered
	 */
	FADER_V(3, "FADER_V", "faderv"),

	/**
	 * The '<em><b>LED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LED_VALUE
	 * @generated
	 * @ordered
	 */
	LED(4, "LED", "led"),

	/**
	 * The '<em><b>ROTARY H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTARY_H_VALUE
	 * @generated
	 * @ordered
	 */
	ROTARY_H(5, "ROTARY_H", "rotaryh"),

	/**
	 * The '<em><b>ROTARY V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROTARY_V_VALUE
	 * @generated
	 * @ordered
	 */
	ROTARY_V(6, "ROTARY_V", "rotaryv"),

	/**
	 * The '<em><b>XYPAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XYPAD_VALUE
	 * @generated
	 * @ordered
	 */
	XYPAD(7, "XYPAD", "xy"),

	/**
	 * The '<em><b>LABEL H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_H_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL_H(0, "LABEL_H", "labelh"),

	/**
	 * The '<em><b>MULTI TOGGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_TOGGLE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_TOGGLE(8, "MULTI_TOGGLE", "multitoggle"),

	/**
	 * The '<em><b>MULTI FADER H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_FADER_H_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_FADER_H(9, "MULTI_FADER_H", "multifaderh"),

	/**
	 * The '<em><b>MULTI FADER V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_FADER_V_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_FADER_V(10, "MULTI_FADER_V", "multifaderv"), /**
	 * The '<em><b>PUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH(11, "PUSH", "push"), /**
	 * The '<em><b>ENCODER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCODER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCODER(12, "ENCODER", "encoder"), /**
	 * The '<em><b>MULTI PUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_PUSH(13, "MULTI_PUSH", "multipush"), /**
	 * The '<em><b>BATTERY H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_H_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY_H(14, "BATTERY_H", "batteryh"), /**
	 * The '<em><b>BATTERY V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BATTERY_V_VALUE
	 * @generated
	 * @ordered
	 */
	BATTERY_V(15, "BATTERY_V", "batteryv"), /**
	 * The '<em><b>TIME H</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_H_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_H(16, "TIME_H", "timeh"), /**
	 * The '<em><b>TIME V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_V_VALUE
	 * @generated
	 * @ordered
	 */
	TIME_V(17, "TIME_V", "timev"), /**
	 * The '<em><b>TOGGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOGGLE_VALUE
	 * @generated
	 * @ordered
	 */
	TOGGLE(18, "TOGGLE", "toggle");

	/**
	 * The '<em><b>LABEL V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABEL V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL_V
	 * @model literal="labelv"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_V_VALUE = 1;

	/**
	 * The '<em><b>FADER H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FADER H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FADER_H
	 * @model literal="faderh"
	 * @generated
	 * @ordered
	 */
	public static final int FADER_H_VALUE = 2;

	/**
	 * The '<em><b>FADER V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FADER V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FADER_V
	 * @model literal="faderv"
	 * @generated
	 * @ordered
	 */
	public static final int FADER_V_VALUE = 3;

	/**
	 * The '<em><b>LED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LED
	 * @model literal="led"
	 * @generated
	 * @ordered
	 */
	public static final int LED_VALUE = 4;

	/**
	 * The '<em><b>ROTARY H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTARY H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTARY_H
	 * @model literal="rotaryh"
	 * @generated
	 * @ordered
	 */
	public static final int ROTARY_H_VALUE = 5;

	/**
	 * The '<em><b>ROTARY V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROTARY V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROTARY_V
	 * @model literal="rotaryv"
	 * @generated
	 * @ordered
	 */
	public static final int ROTARY_V_VALUE = 6;

	/**
	 * The '<em><b>XYPAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XYPAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XYPAD
	 * @model literal="xy"
	 * @generated
	 * @ordered
	 */
	public static final int XYPAD_VALUE = 7;

	/**
	 * The '<em><b>LABEL H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LABEL H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL_H
	 * @model literal="labelh"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_H_VALUE = 0;

	/**
	 * The '<em><b>MULTI TOGGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI TOGGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_TOGGLE
	 * @model literal="multitoggle"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_TOGGLE_VALUE = 8;

	/**
	 * The '<em><b>MULTI FADER H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI FADER H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_FADER_H
	 * @model literal="multifaderh"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_FADER_H_VALUE = 9;

	/**
	 * The '<em><b>MULTI FADER V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI FADER V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_FADER_V
	 * @model literal="multifaderv"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_FADER_V_VALUE = 10;

	/**
	 * The '<em><b>PUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUSH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSH
	 * @model literal="push"
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_VALUE = 11;

	/**
	 * The '<em><b>ENCODER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENCODER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENCODER
	 * @model literal="encoder"
	 * @generated
	 * @ordered
	 */
	public static final int ENCODER_VALUE = 12;

	/**
	 * The '<em><b>MULTI PUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI PUSH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI_PUSH
	 * @model literal="multipush"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_PUSH_VALUE = 13;

	/**
	 * The '<em><b>BATTERY H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BATTERY H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATTERY_H
	 * @model literal="batteryh"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_H_VALUE = 14;

	/**
	 * The '<em><b>BATTERY V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BATTERY V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BATTERY_V
	 * @model literal="batteryv"
	 * @generated
	 * @ordered
	 */
	public static final int BATTERY_V_VALUE = 15;

	/**
	 * The '<em><b>TIME H</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME H</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_H
	 * @model literal="timeh"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_H_VALUE = 16;

	/**
	 * The '<em><b>TIME V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_V
	 * @model literal="timev"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_V_VALUE = 17;

	/**
	 * The '<em><b>TOGGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOGGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOGGLE
	 * @model literal="toggle"
	 * @generated
	 * @ordered
	 */
	public static final int TOGGLE_VALUE = 18;

	/**
	 * An array of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlType[] VALUES_ARRAY =
		new ControlType[] {
			LABEL_V,
			FADER_H,
			FADER_V,
			LED,
			ROTARY_H,
			ROTARY_V,
			XYPAD,
			LABEL_H,
			MULTI_TOGGLE,
			MULTI_FADER_H,
			MULTI_FADER_V,
			PUSH,
			ENCODER,
			MULTI_PUSH,
			BATTERY_H,
			BATTERY_V,
			TIME_H,
			TIME_V,
			TOGGLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControlType get(int value) {
		switch (value) {
			case LABEL_V_VALUE: return LABEL_V;
			case FADER_H_VALUE: return FADER_H;
			case FADER_V_VALUE: return FADER_V;
			case LED_VALUE: return LED;
			case ROTARY_H_VALUE: return ROTARY_H;
			case ROTARY_V_VALUE: return ROTARY_V;
			case XYPAD_VALUE: return XYPAD;
			case LABEL_H_VALUE: return LABEL_H;
			case MULTI_TOGGLE_VALUE: return MULTI_TOGGLE;
			case MULTI_FADER_H_VALUE: return MULTI_FADER_H;
			case MULTI_FADER_V_VALUE: return MULTI_FADER_V;
			case PUSH_VALUE: return PUSH;
			case ENCODER_VALUE: return ENCODER;
			case MULTI_PUSH_VALUE: return MULTI_PUSH;
			case BATTERY_H_VALUE: return BATTERY_H;
			case BATTERY_V_VALUE: return BATTERY_V;
			case TIME_H_VALUE: return TIME_H;
			case TIME_V_VALUE: return TIME_V;
			case TOGGLE_VALUE: return TOGGLE;
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
	private ControlType(int value, String name, String literal) {
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
	
} //ControlType
