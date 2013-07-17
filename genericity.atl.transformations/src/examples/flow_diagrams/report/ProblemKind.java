/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package examples.flow_diagrams.report;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Problem Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see examples.flow_diagrams.report.ReportPackage#getProblemKind()
 * @model
 * @generated
 */
public final class ProblemKind extends AbstractEnumerator {
	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR = 0;

	/**
	 * The '<em><b>WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARNING_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARNING = 1;

	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @generated
	 * @ordered
	 */
	public static final ProblemKind ERROR_LITERAL = new ProblemKind(ERROR, "ERROR", "ERROR");

	/**
	 * The '<em><b>WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @generated
	 * @ordered
	 */
	public static final ProblemKind WARNING_LITERAL = new ProblemKind(WARNING, "WARNING", "WARNING");

	/**
	 * An array of all the '<em><b>Problem Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProblemKind[] VALUES_ARRAY =
		new ProblemKind[] {
			ERROR_LITERAL,
			WARNING_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Problem Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Problem Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProblemKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Problem Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProblemKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Problem Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemKind get(int value) {
		switch (value) {
			case ERROR: return ERROR_LITERAL;
			case WARNING: return WARNING_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProblemKind(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ProblemKind
