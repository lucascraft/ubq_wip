/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MASTER CTRL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getMASTER_CTRL()
 * @model
 * @generated
 */
public enum MASTER_CTRL implements Enumerator {
	/**
	 * The '<em><b>PLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	PLAY(0, "PLAY", "PLAY"),

	/**
	 * The '<em><b>PAUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSE(1, "PAUSE", "PAUSE"),

	/**
	 * The '<em><b>STOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP(2, "STOP", "STOP"),

	/**
	 * The '<em><b>RECORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD(3, "RECORD", "RECORD"),

	/**
	 * The '<em><b>PREC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREC_VALUE
	 * @generated
	 * @ordered
	 */
	PREC(4, "PREC", "PREC"),

	/**
	 * The '<em><b>NEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT(5, "NEXT", "NEXT"), /**
	 * The '<em><b>CONTINUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUE(6, "CONTINUE", "CONTINUE"), /**
	 * The '<em><b>UNDO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDO_VALUE
	 * @generated
	 * @ordered
	 */
	UNDO(7, "UNDO", "UNDO"), /**
	 * The '<em><b>REDO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDO_VALUE
	 * @generated
	 * @ordered
	 */
	REDO(8, "REDO", "REDO");

	/**
	 * The '<em><b>PLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAY_VALUE = 0;

	/**
	 * The '<em><b>PAUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAUSE_VALUE = 1;

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
	public static final int STOP_VALUE = 2;

	/**
	 * The '<em><b>RECORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_VALUE = 3;

	/**
	 * The '<em><b>PREC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREC_VALUE = 4;

	/**
	 * The '<em><b>NEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_VALUE = 5;

	/**
	 * The '<em><b>CONTINUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTINUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUE_VALUE = 6;

	/**
	 * The '<em><b>UNDO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDO_VALUE = 7;

	/**
	 * The '<em><b>REDO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REDO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REDO_VALUE = 8;

	/**
	 * An array of all the '<em><b>MASTER CTRL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MASTER_CTRL[] VALUES_ARRAY =
		new MASTER_CTRL[] {
			PLAY,
			PAUSE,
			STOP,
			RECORD,
			PREC,
			NEXT,
			CONTINUE,
			UNDO,
			REDO,
		};

	/**
	 * A public read-only list of all the '<em><b>MASTER CTRL</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MASTER_CTRL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MASTER CTRL</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MASTER_CTRL get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MASTER_CTRL result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MASTER CTRL</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MASTER_CTRL getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MASTER_CTRL result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MASTER CTRL</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MASTER_CTRL get(int value) {
		switch (value) {
			case PLAY_VALUE: return PLAY;
			case PAUSE_VALUE: return PAUSE;
			case STOP_VALUE: return STOP;
			case RECORD_VALUE: return RECORD;
			case PREC_VALUE: return PREC;
			case NEXT_VALUE: return NEXT;
			case CONTINUE_VALUE: return CONTINUE;
			case UNDO_VALUE: return UNDO;
			case REDO_VALUE: return REDO;
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
	private MASTER_CTRL(int value, String name, String literal) {
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
	
} //MASTER_CTRL
