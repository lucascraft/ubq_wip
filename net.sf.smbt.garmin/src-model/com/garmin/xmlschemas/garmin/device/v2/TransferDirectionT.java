/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transfer Direction T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#getTransferDirectionT()
 * @model extendedMetaData="name='TransferDirection_t'"
 * @generated
 */
public enum TransferDirectionT implements Enumerator {
	/**
	 * The '<em><b>Input Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_OUTPUT(0, "InputOutput", "InputOutput"),

	/**
	 * The '<em><b>Input To Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_TO_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_TO_UNIT(1, "InputToUnit", "InputToUnit"),

	/**
	 * The '<em><b>Output From Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_FROM_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT_FROM_UNIT(2, "OutputFromUnit", "OutputFromUnit");

	/**
	 * The '<em><b>Input Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Input Output</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT_OUTPUT
	 * @model name="InputOutput"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_OUTPUT_VALUE = 0;

	/**
	 * The '<em><b>Input To Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Input To Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT_TO_UNIT
	 * @model name="InputToUnit"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_TO_UNIT_VALUE = 1;

	/**
	 * The '<em><b>Output From Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Output From Unit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_FROM_UNIT
	 * @model name="OutputFromUnit"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_FROM_UNIT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transfer Direction T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransferDirectionT[] VALUES_ARRAY =
		new TransferDirectionT[] {
			INPUT_OUTPUT,
			INPUT_TO_UNIT,
			OUTPUT_FROM_UNIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Transfer Direction T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransferDirectionT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transfer Direction T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransferDirectionT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransferDirectionT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Direction T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransferDirectionT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransferDirectionT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Direction T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransferDirectionT get(int value) {
		switch (value) {
			case INPUT_OUTPUT_VALUE: return INPUT_OUTPUT;
			case INPUT_TO_UNIT_VALUE: return INPUT_TO_UNIT;
			case OUTPUT_FROM_UNIT_VALUE: return OUTPUT_FROM_UNIT;
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
	private TransferDirectionT(int value, String name, String literal) {
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
	
} //TransferDirectionT
