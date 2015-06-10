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
 * A representation of the literals of the enumeration '<em><b>XBEE MANUFACTURER ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbee.XbeePackage#getXBEE_MANUFACTURER_ID()
 * @model
 * @generated
 */
public enum XBEE_MANUFACTURER_ID implements Enumerator {
	/**
	 * The '<em><b>XSTREAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XSTREAM_VALUE
	 * @generated
	 * @ordered
	 */
	XSTREAM(0, "XSTREAM", "XSTREAM"),

	/**
	 * The '<em><b>XBEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XBEE_VALUE
	 * @generated
	 * @ordered
	 */
	XBEE(1, "XBEE", "XBEE");

	/**
	 * The '<em><b>XSTREAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XSTREAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XSTREAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XSTREAM_VALUE = 0;

	/**
	 * The '<em><b>XBEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XBEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XBEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XBEE_VALUE = 1;

	/**
	 * An array of all the '<em><b>XBEE MANUFACTURER ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XBEE_MANUFACTURER_ID[] VALUES_ARRAY =
		new XBEE_MANUFACTURER_ID[] {
			XSTREAM,
			XBEE,
		};

	/**
	 * A public read-only list of all the '<em><b>XBEE MANUFACTURER ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XBEE_MANUFACTURER_ID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XBEE MANUFACTURER ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XBEE_MANUFACTURER_ID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XBEE_MANUFACTURER_ID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XBEE MANUFACTURER ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XBEE_MANUFACTURER_ID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XBEE_MANUFACTURER_ID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XBEE MANUFACTURER ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XBEE_MANUFACTURER_ID get(int value) {
		switch (value) {
			case XSTREAM_VALUE: return XSTREAM;
			case XBEE_VALUE: return XBEE;
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
	private XBEE_MANUFACTURER_ID(int value, String name, String literal) {
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
	
} //XBEE_MANUFACTURER_ID
