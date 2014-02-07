/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_errors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_errors.AnalysisResult#getErrors <em>Errors</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_errors.AtlAnalysisPackage#getAnalysisResult()
 * @model
 * @generated
 */
public interface AnalysisResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Errors</b></em>' containment reference list.
	 * The list contents are of type {@link bento.analysis.atl_errors.Error}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Errors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Errors</em>' containment reference list.
	 * @see bento.analysis.atl_errors.AtlAnalysisPackage#getAnalysisResult_Errors()
	 * @model containment="true"
	 * @generated
	 */
	EList<bento.analysis.atl_errors.Error> getErrors();

} // AnalysisResult
