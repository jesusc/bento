/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;

import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.Recovery;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getLocation <em>Location</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getElement <em>Element</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getRecovery <em>Recovery</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getLocalProblem()
 * @model abstract="true"
 * @generated
 */
public interface LocalProblem extends Problem {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getLocalProblem_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getLocalProblem_Element()
	 * @model required="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Recovery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recovery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recovery</em>' containment reference.
	 * @see #setRecovery(Recovery)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getLocalProblem_Recovery()
	 * @model containment="true"
	 * @generated
	 */
	Recovery getRecovery();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.LocalProblem#getRecovery <em>Recovery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recovery</em>' containment reference.
	 * @see #getRecovery()
	 * @generated
	 */
	void setRecovery(Recovery value);

} // LocalProblem
