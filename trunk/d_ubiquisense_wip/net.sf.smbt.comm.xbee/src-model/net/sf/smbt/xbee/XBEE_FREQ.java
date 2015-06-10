/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XBEE FREQ</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbee.XbeePackage#getXBEE_FREQ()
 * @model
 * @generated
 */
public enum XBEE_FREQ implements Enumerator {
	/**
	 * The '<em><b>RF 2400 MHZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF_2400_MHZ_VALUE
	 * @generated
	 * @ordered
	 */
	RF_2400_MHZ(2400, "RF_2400_MHZ", "RF_2400_MHZ"),

	/**
	 * The '<em><b>RF 900 MHZ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RF_900_MHZ_VALUE
	 * @generated
	 * @ordered
	 */
	RF_900_MHZ(900, "RF_900_MHZ", "RF_900_MHZ");

	/**
	 * The '<em><b>RF 2400 MHZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RF 2400 MHZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RF_2400_MHZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RF_2400_MHZ_VALUE = 2400;

	/**
	 * The '<em><b>RF 900 MHZ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RF 900 MHZ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RF_900_MHZ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RF_900_MHZ_VALUE = 900;

	/**
	 * An array of all the '<em><b>XBEE FREQ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XBEE_FREQ[] VALUES_ARRAY =
		new XBEE_FREQ[] {
			RF_2400_MHZ,
			RF_900_MHZ,
		};

	/**
	 * A public read-only list of all the '<em><b>XBEE FREQ</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XBEE_FREQ> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XBEE FREQ</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XBEE_FREQ get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XBEE_FREQ result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XBEE FREQ</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XBEE_FREQ getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XBEE_FREQ result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XBEE FREQ</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XBEE_FREQ get(int value) {
		switch (value) {
			case RF_2400_MHZ_VALUE: return RF_2400_MHZ;
			case RF_900_MHZ_VALUE: return RF_900_MHZ;
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
	private XBEE_FREQ(int value, String name, String literal) {
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
	
} //XBEE_FREQ
