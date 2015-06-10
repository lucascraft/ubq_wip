/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CLIP STATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezableton.EzabletonPackage#getCLIP_STATE()
 * @model
 * @generated
 */
public enum CLIP_STATE implements Enumerator {
	/**
	 * The '<em><b>NO CLIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CLIP_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CLIP(4, "NO_CLIP", "NO_CLIP"),

	/**
	 * The '<em><b>HAS CLIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_CLIP_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_CLIP(1, "HAS_CLIP", "HAS_CLIP"),

	/**
	 * The '<em><b>PLAYING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAYING_VALUE
	 * @generated
	 * @ordered
	 */
	PLAYING(2, "PLAYING", "PLAYING"),

	/**
	 * The '<em><b>TRIGGERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGERED_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGERED(3, "TRIGGERED", "TRIGGERED"), /**
	 * The '<em><b>STOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP(0, "STOP", "STOP");

	/**
	 * The '<em><b>NO CLIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO CLIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CLIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_CLIP_VALUE = 4;

	/**
	 * The '<em><b>HAS CLIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HAS CLIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAS_CLIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HAS_CLIP_VALUE = 1;

	/**
	 * The '<em><b>PLAYING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAYING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAYING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAYING_VALUE = 2;

	/**
	 * The '<em><b>TRIGGERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIGGERED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIGGERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGERED_VALUE = 3;

	/**
	 * The '<em><b>STOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOP_VALUE = 0;

	/**
	 * An array of all the '<em><b>CLIP STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CLIP_STATE[] VALUES_ARRAY =
		new CLIP_STATE[] {
			NO_CLIP,
			HAS_CLIP,
			PLAYING,
			TRIGGERED,
			STOP,
		};

	/**
	 * A public read-only list of all the '<em><b>CLIP STATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CLIP_STATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CLIP STATE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CLIP_STATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CLIP_STATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CLIP STATE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CLIP_STATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CLIP_STATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CLIP STATE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CLIP_STATE get(int value) {
		switch (value) {
			case NO_CLIP_VALUE: return NO_CLIP;
			case HAS_CLIP_VALUE: return HAS_CLIP;
			case PLAYING_VALUE: return PLAYING;
			case TRIGGERED_VALUE: return TRIGGERED;
			case STOP_VALUE: return STOP;
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
	private CLIP_STATE(int value, String name, String literal) {
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
	
} //CLIP_STATE
