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
 * A representation of the literals of the enumeration '<em><b>MULTIBALLS CURSOR MODE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.jzmui.JzmuiPackage#getMULTIBALLS_CURSOR_MODE()
 * @model
 * @generated
 */
public enum MULTIBALLS_CURSOR_MODE implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>LIMITED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIMITED_VALUE
	 * @generated
	 * @ordered
	 */
	LIMITED(1, "LIMITED", "Limited"),

	/**
	 * The '<em><b>BARYCENTRIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARYCENTRIC_VALUE
	 * @generated
	 * @ordered
	 */
	BARYCENTRIC(2, "BARYCENTRIC", "Barycentric"),

	/**
	 * The '<em><b>GET OLDEST BALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_OLDEST_BALL_VALUE
	 * @generated
	 * @ordered
	 */
	GET_OLDEST_BALL(3, "GET_OLDEST_BALL", "Get Oldest Ball"),

	/**
	 * The '<em><b>GET NEWEST BALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_NEWEST_BALL_VALUE
	 * @generated
	 * @ordered
	 */
	GET_NEWEST_BALL(4, "GET_NEWEST_BALL", "Get Newest Ball");

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
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>LIMITED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIMITED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIMITED
	 * @model literal="Limited"
	 * @generated
	 * @ordered
	 */
	public static final int LIMITED_VALUE = 1;

	/**
	 * The '<em><b>BARYCENTRIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BARYCENTRIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARYCENTRIC
	 * @model literal="Barycentric"
	 * @generated
	 * @ordered
	 */
	public static final int BARYCENTRIC_VALUE = 2;

	/**
	 * The '<em><b>GET OLDEST BALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET OLDEST BALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_OLDEST_BALL
	 * @model literal="Get Oldest Ball"
	 * @generated
	 * @ordered
	 */
	public static final int GET_OLDEST_BALL_VALUE = 3;

	/**
	 * The '<em><b>GET NEWEST BALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET NEWEST BALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_NEWEST_BALL
	 * @model literal="Get Newest Ball"
	 * @generated
	 * @ordered
	 */
	public static final int GET_NEWEST_BALL_VALUE = 4;

	/**
	 * An array of all the '<em><b>MULTIBALLS CURSOR MODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MULTIBALLS_CURSOR_MODE[] VALUES_ARRAY =
		new MULTIBALLS_CURSOR_MODE[] {
			NONE,
			LIMITED,
			BARYCENTRIC,
			GET_OLDEST_BALL,
			GET_NEWEST_BALL,
		};

	/**
	 * A public read-only list of all the '<em><b>MULTIBALLS CURSOR MODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MULTIBALLS_CURSOR_MODE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MULTIBALLS CURSOR MODE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MULTIBALLS_CURSOR_MODE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MULTIBALLS_CURSOR_MODE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MULTIBALLS CURSOR MODE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MULTIBALLS_CURSOR_MODE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MULTIBALLS_CURSOR_MODE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MULTIBALLS CURSOR MODE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MULTIBALLS_CURSOR_MODE get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case LIMITED_VALUE: return LIMITED;
			case BARYCENTRIC_VALUE: return BARYCENTRIC;
			case GET_OLDEST_BALL_VALUE: return GET_OLDEST_BALL;
			case GET_NEWEST_BALL_VALUE: return GET_NEWEST_BALL;
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
	private MULTIBALLS_CURSOR_MODE(int value, String name, String literal) {
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
	
} //MULTIBALLS_CURSOR_MODE
