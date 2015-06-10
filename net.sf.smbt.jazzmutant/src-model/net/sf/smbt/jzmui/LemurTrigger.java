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
 * A representation of the literals of the enumeration '<em><b>Lemur Trigger</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.jzmui.JzmuiPackage#getLemurTrigger()
 * @model
 * @generated
 */
public enum LemurTrigger implements Enumerator {
	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(0, "ANY", "ANY"),

	/**
	 * The '<em><b>PASSES OVER ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSES_OVER_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	PASSES_OVER_ZERO(1, "PASSES_OVER_ZERO", "Passes Over Zero"),

	/**
	 * The '<em><b>PASSES UNDER ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSES_UNDER_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	PASSES_UNDER_ZERO(2, "PASSES_UNDER_ZERO", "Passes Under Zero"),

	/**
	 * The '<em><b>CROSS ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CROSS_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	CROSS_ZERO(3, "CROSS_ZERO", "Cross Zero"),

	/**
	 * The '<em><b>INCREASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCREASE_VALUE
	 * @generated
	 * @ordered
	 */
	INCREASE(4, "INCREASE", "Increase"),

	/**
	 * The '<em><b>DECREASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECREASE_VALUE
	 * @generated
	 * @ordered
	 */
	DECREASE(5, "DECREASE", "Decrease"), /**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(6, "NONE", "NONE");

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>PASSES OVER ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSES OVER ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSES_OVER_ZERO
	 * @model literal="Passes Over Zero"
	 * @generated
	 * @ordered
	 */
	public static final int PASSES_OVER_ZERO_VALUE = 1;

	/**
	 * The '<em><b>PASSES UNDER ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSES UNDER ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSES_UNDER_ZERO
	 * @model literal="Passes Under Zero"
	 * @generated
	 * @ordered
	 */
	public static final int PASSES_UNDER_ZERO_VALUE = 2;

	/**
	 * The '<em><b>CROSS ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CROSS ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CROSS_ZERO
	 * @model literal="Cross Zero"
	 * @generated
	 * @ordered
	 */
	public static final int CROSS_ZERO_VALUE = 3;

	/**
	 * The '<em><b>INCREASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCREASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCREASE
	 * @model literal="Increase"
	 * @generated
	 * @ordered
	 */
	public static final int INCREASE_VALUE = 4;

	/**
	 * The '<em><b>DECREASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECREASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECREASE
	 * @model literal="Decrease"
	 * @generated
	 * @ordered
	 */
	public static final int DECREASE_VALUE = 5;

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
	public static final int NONE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Lemur Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LemurTrigger[] VALUES_ARRAY =
		new LemurTrigger[] {
			ANY,
			PASSES_OVER_ZERO,
			PASSES_UNDER_ZERO,
			CROSS_ZERO,
			INCREASE,
			DECREASE,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Lemur Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LemurTrigger> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lemur Trigger</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LemurTrigger get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LemurTrigger result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lemur Trigger</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LemurTrigger getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LemurTrigger result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lemur Trigger</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LemurTrigger get(int value) {
		switch (value) {
			case ANY_VALUE: return ANY;
			case PASSES_OVER_ZERO_VALUE: return PASSES_OVER_ZERO;
			case PASSES_UNDER_ZERO_VALUE: return PASSES_UNDER_ZERO;
			case CROSS_ZERO_VALUE: return CROSS_ZERO;
			case INCREASE_VALUE: return INCREASE;
			case DECREASE_VALUE: return DECREASE;
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
	private LemurTrigger(int value, String name, String literal) {
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
	
} //LemurTrigger
