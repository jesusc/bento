/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.plcopen.xml.tc60201;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Handle Unknown Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package#getHandleUnknownType()
 * @model extendedMetaData="name='handleUnknown_._type'"
 * @generated
 */
public enum HandleUnknownType implements Enumerator {
	/**
	 * The '<em><b>Preserve</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESERVE_VALUE
	 * @generated
	 * @ordered
	 */
	PRESERVE(0, "preserve", "preserve"),

	/**
	 * The '<em><b>Discard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCARD_VALUE
	 * @generated
	 * @ordered
	 */
	DISCARD(1, "discard", "discard"),

	/**
	 * The '<em><b>Implementation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION(2, "implementation", "implementation");

	/**
	 * The '<em><b>Preserve</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preserve</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESERVE
	 * @model name="preserve"
	 * @generated
	 * @ordered
	 */
	public static final int PRESERVE_VALUE = 0;

	/**
	 * The '<em><b>Discard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCARD
	 * @model name="discard"
	 * @generated
	 * @ordered
	 */
	public static final int DISCARD_VALUE = 1;

	/**
	 * The '<em><b>Implementation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implementation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION
	 * @model name="implementation"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Handle Unknown Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HandleUnknownType[] VALUES_ARRAY =
		new HandleUnknownType[] {
			PRESERVE,
			DISCARD,
			IMPLEMENTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Handle Unknown Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HandleUnknownType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Handle Unknown Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HandleUnknownType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HandleUnknownType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Handle Unknown Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HandleUnknownType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HandleUnknownType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Handle Unknown Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HandleUnknownType get(int value) {
		switch (value) {
			case PRESERVE_VALUE: return PRESERVE;
			case DISCARD_VALUE: return DISCARD;
			case IMPLEMENTATION_VALUE: return IMPLEMENTATION;
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
	private HandleUnknownType(int value, String name, String literal) {
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
	
} //HandleUnknownType
