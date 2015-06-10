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
 * A representation of the literals of the enumeration '<em><b>BREAK POINT PHYSICS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.jzmui.JzmuiPackage#getBREAK_POINT_PHYSICS()
 * @model
 * @generated
 */
public enum BREAK_POINT_PHYSICS implements Enumerator {
	/**
	 * The '<em><b>INTERPOLATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERPOLATE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERPOLATE(0, "INTERPOLATE", "Interpolate"),

	/**
	 * The '<em><b>MASS SPRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASS_SPRING_VALUE
	 * @generated
	 * @ordered
	 */
	MASS_SPRING(1, "MASS_SPRING", "Mass-Spring"),

	/**
	 * The '<em><b>SUPER SPRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPER_SPRING_VALUE
	 * @generated
	 * @ordered
	 */
	SUPER_SPRING(2, "SUPER_SPRING", "Super-Spring"), /**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "NONE", "NONE");

	/**
	 * The '<em><b>INTERPOLATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERPOLATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERPOLATE
	 * @model literal="Interpolate"
	 * @generated
	 * @ordered
	 */
	public static final int INTERPOLATE_VALUE = 0;

	/**
	 * The '<em><b>MASS SPRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MASS SPRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASS_SPRING
	 * @model literal="Mass-Spring"
	 * @generated
	 * @ordered
	 */
	public static final int MASS_SPRING_VALUE = 1;

	/**
	 * The '<em><b>SUPER SPRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUPER SPRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPER_SPRING
	 * @model literal="Super-Spring"
	 * @generated
	 * @ordered
	 */
	public static final int SUPER_SPRING_VALUE = 2;

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
	public static final int NONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>BREAK POINT PHYSICS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BREAK_POINT_PHYSICS[] VALUES_ARRAY =
		new BREAK_POINT_PHYSICS[] {
			INTERPOLATE,
			MASS_SPRING,
			SUPER_SPRING,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>BREAK POINT PHYSICS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BREAK_POINT_PHYSICS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BREAK POINT PHYSICS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BREAK_POINT_PHYSICS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BREAK_POINT_PHYSICS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BREAK POINT PHYSICS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BREAK_POINT_PHYSICS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BREAK_POINT_PHYSICS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BREAK POINT PHYSICS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BREAK_POINT_PHYSICS get(int value) {
		switch (value) {
			case INTERPOLATE_VALUE: return INTERPOLATE;
			case MASS_SPRING_VALUE: return MASS_SPRING;
			case SUPER_SPRING_VALUE: return SUPER_SPRING;
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
	private BREAK_POINT_PHYSICS(int value, String name, String literal) {
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
	
} //BREAK_POINT_PHYSICS
