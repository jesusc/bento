/**
 */
package dart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dart.Library#getParts <em>Parts</em>}</li>
 *   <li>{@link dart.Library#getTypedefs <em>Typedefs</em>}</li>
 *   <li>{@link dart.Library#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link dart.Library#getVariables <em>Variables</em>}</li>
 *   <li>{@link dart.Library#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see dart.DartPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends DartResource {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' reference list.
	 * The list contents are of type {@link dart.Part}.
	 * It is bidirectional and its opposite is '{@link dart.Part#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' reference list.
	 * @see dart.DartPackage#getLibrary_Parts()
	 * @see dart.Part#getPartOf
	 * @model opposite="partOf"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Typedefs</b></em>' containment reference list.
	 * The list contents are of type {@link dart.Typedef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typedefs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typedefs</em>' containment reference list.
	 * @see dart.DartPackage#getLibrary_Typedefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Typedef> getTypedefs();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' reference list.
	 * The list contents are of type {@link dart.Metadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' reference list.
	 * @see dart.DartPackage#getLibrary_Metadata()
	 * @model
	 * @generated
	 */
	EList<Metadata> getMetadata();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link dart.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see dart.DartPackage#getLibrary_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link dart.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see dart.DartPackage#getLibrary_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

} // Library
