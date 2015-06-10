/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdaap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DAAP COMM CST</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezdaap.EzdaapPackage#getDAAP_COMM_CST()
 * @model
 * @generated
 */
public enum DAAP_COMM_CST implements Enumerator {
	/**
	 * The '<em><b>MAX SIMULTATNEOUS CONNECTIONS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_SIMULTATNEOUS_CONNECTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_SIMULTATNEOUS_CONNECTIONS(10, "MAX_SIMULTATNEOUS_CONNECTIONS", "MAX_SIMULTATNEOUS_CONNECTIONS"),

	/**
	 * The '<em><b>MAX USER CONNECTIONS PER SESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_USER_CONNECTIONS_PER_SESSION_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_USER_CONNECTIONS_PER_SESSION(5, "MAX_USER_CONNECTIONS_PER_SESSION", "MAX_USER_CONNECTIONS_PER_SESSION"),

	/**
	 * The '<em><b>MAX USER SIMULTANEOUS CONNECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_USER_SIMULTANEOUS_CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_USER_SIMULTANEOUS_CONNECTION(2, "MAX_USER_SIMULTANEOUS_CONNECTION", "MAX_USER_SIMULTANEOUS_CONNECTION");

	/**
	 * The '<em><b>MAX SIMULTATNEOUS CONNECTIONS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAX SIMULTATNEOUS CONNECTIONS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_SIMULTATNEOUS_CONNECTIONS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_SIMULTATNEOUS_CONNECTIONS_VALUE = 10;

	/**
	 * The '<em><b>MAX USER CONNECTIONS PER SESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAX USER CONNECTIONS PER SESSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_USER_CONNECTIONS_PER_SESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_USER_CONNECTIONS_PER_SESSION_VALUE = 5;

	/**
	 * The '<em><b>MAX USER SIMULTANEOUS CONNECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAX USER SIMULTANEOUS CONNECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_USER_SIMULTANEOUS_CONNECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_USER_SIMULTANEOUS_CONNECTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>DAAP COMM CST</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DAAP_COMM_CST[] VALUES_ARRAY =
		new DAAP_COMM_CST[] {
			MAX_SIMULTATNEOUS_CONNECTIONS,
			MAX_USER_CONNECTIONS_PER_SESSION,
			MAX_USER_SIMULTANEOUS_CONNECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>DAAP COMM CST</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DAAP_COMM_CST> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DAAP COMM CST</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DAAP_COMM_CST get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DAAP_COMM_CST result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAAP COMM CST</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DAAP_COMM_CST getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DAAP_COMM_CST result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DAAP COMM CST</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DAAP_COMM_CST get(int value) {
		switch (value) {
			case MAX_SIMULTATNEOUS_CONNECTIONS_VALUE: return MAX_SIMULTATNEOUS_CONNECTIONS;
			case MAX_USER_CONNECTIONS_PER_SESSION_VALUE: return MAX_USER_CONNECTIONS_PER_SESSION;
			case MAX_USER_SIMULTANEOUS_CONNECTION_VALUE: return MAX_USER_SIMULTANEOUS_CONNECTION;
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
	private DAAP_COMM_CST(int value, String name, String literal) {
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
	
} //DAAP_COMM_CST
