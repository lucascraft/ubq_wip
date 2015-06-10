/**
 */
package net.sf.smbt.ezmppt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MPPT</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMPPT()
 * @model
 * @generated
 */
public enum MPPT implements Enumerator {
	/**
	 * The '<em><b>SYNCHRO1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCHRO1_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCHRO1(0, "SYNCHRO1", "0xEB"),

	/**
	 * The '<em><b>SYNCHRO2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCHRO2_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCHRO2(1, "SYNCHRO2", "0x90"),

	/**
	 * The '<em><b>EOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EOM_VALUE
	 * @generated
	 * @ordered
	 */
	EOM(2, "EOM", "0x7f");

	/**
	 * The '<em><b>SYNCHRO1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYNCHRO1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCHRO1
	 * @model literal="0xEB"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRO1_VALUE = 0;

	/**
	 * The '<em><b>SYNCHRO2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYNCHRO2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCHRO2
	 * @model literal="0x90"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCHRO2_VALUE = 1;

	/**
	 * The '<em><b>EOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EOM
	 * @model literal="0x7f"
	 * @generated
	 * @ordered
	 */
	public static final int EOM_VALUE = 2;

	/**
	 * An array of all the '<em><b>MPPT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MPPT[] VALUES_ARRAY =
		new MPPT[] {
			SYNCHRO1,
			SYNCHRO2,
			EOM,
		};

	/**
	 * A public read-only list of all the '<em><b>MPPT</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MPPT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MPPT</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPPT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MPPT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MPPT</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPPT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MPPT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MPPT</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MPPT get(int value) {
		switch (value) {
			case SYNCHRO1_VALUE: return SYNCHRO1;
			case SYNCHRO2_VALUE: return SYNCHRO2;
			case EOM_VALUE: return EOM;
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
	private MPPT(int value, String name, String literal) {
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
	
} //MPPT
