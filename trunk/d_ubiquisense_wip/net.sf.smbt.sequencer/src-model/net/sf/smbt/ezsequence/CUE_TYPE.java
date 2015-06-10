/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CUE TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getCUE_TYPE()
 * @model
 * @generated
 */
public enum CUE_TYPE implements Enumerator {
	/**
	 * The '<em><b>RESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(2, "RESET", "RESET"), /**
	 * The '<em><b>TO PREV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PREV_VALUE
	 * @generated
	 * @ordered
	 */
	TO_PREV(0, "TO_PREV", "TO_PREV"),

	/**
	 * The '<em><b>TO FIRST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_FIRST_VALUE
	 * @generated
	 * @ordered
	 */
	TO_FIRST(1, "TO_FIRST", "TO_FIRST"), /**
	 * The '<em><b>TO NEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TO_NEXT(3, "TO_NEXT", "TO_NEXT"), /**
	 * The '<em><b>FLIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIP_VALUE
	 * @generated
	 * @ordered
	 */
	FLIP(4, "FLIP", "FLIP");

	/**
	 * The '<em><b>RESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 2;

	/**
	 * The '<em><b>TO PREV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TO PREV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_PREV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_PREV_VALUE = 0;

	/**
	 * The '<em><b>TO FIRST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TO FIRST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_FIRST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_FIRST_VALUE = 1;

	/**
	 * The '<em><b>TO NEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TO NEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_NEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TO_NEXT_VALUE = 3;

	/**
	 * The '<em><b>FLIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLIP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLIP_VALUE = 4;

	/**
	 * An array of all the '<em><b>CUE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CUE_TYPE[] VALUES_ARRAY =
		new CUE_TYPE[] {
			RESET,
			TO_PREV,
			TO_FIRST,
			TO_NEXT,
			FLIP,
		};

	/**
	 * A public read-only list of all the '<em><b>CUE TYPE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CUE_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CUE TYPE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CUE_TYPE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CUE_TYPE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CUE TYPE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CUE_TYPE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CUE_TYPE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CUE TYPE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CUE_TYPE get(int value) {
		switch (value) {
			case RESET_VALUE: return RESET;
			case TO_PREV_VALUE: return TO_PREV;
			case TO_FIRST_VALUE: return TO_FIRST;
			case TO_NEXT_VALUE: return TO_NEXT;
			case FLIP_VALUE: return FLIP;
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
	private CUE_TYPE(int value, String name, String literal) {
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
	
} //CUE_TYPE
