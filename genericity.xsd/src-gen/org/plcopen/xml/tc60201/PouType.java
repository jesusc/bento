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
 * A representation of the literals of the enumeration '<em><b>Pou Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines the different types of a POU
 * <!-- end-model-doc -->
 * @see org.plcopen.xml.tc60201.Tc60201Package#getPouType()
 * @model extendedMetaData="name='pouType'"
 * @generated
 */
public enum PouType implements Enumerator {
	/**
	 * The '<em><b>Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(0, "function", "function"),

	/**
	 * The '<em><b>Function Block</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION_BLOCK(1, "functionBlock", "functionBlock"),

	/**
	 * The '<em><b>Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	PROGRAM(2, "program", "program");

	/**
	 * The '<em><b>Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model name="function"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 0;

	/**
	 * The '<em><b>Function Block</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function Block</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_BLOCK
	 * @model name="functionBlock"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_BLOCK_VALUE = 1;

	/**
	 * The '<em><b>Program</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Program</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROGRAM
	 * @model name="program"
	 * @generated
	 * @ordered
	 */
	public static final int PROGRAM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Pou Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PouType[] VALUES_ARRAY =
		new PouType[] {
			FUNCTION,
			FUNCTION_BLOCK,
			PROGRAM,
		};

	/**
	 * A public read-only list of all the '<em><b>Pou Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PouType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pou Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PouType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PouType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pou Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PouType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PouType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pou Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PouType get(int value) {
		switch (value) {
			case FUNCTION_VALUE: return FUNCTION;
			case FUNCTION_BLOCK_VALUE: return FUNCTION_BLOCK;
			case PROGRAM_VALUE: return PROGRAM;
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
	private PouType(int value, String name, String literal) {
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
	
} //PouType
