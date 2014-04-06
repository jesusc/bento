/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.Problem#getDependents <em>Dependents</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.AtlAnalysisPackage#getProblem()
 * @model abstract="true"
 * @generated
 */
public interface Problem extends AnalysisInfo {

	/**
	 * Returns the value of the '<em><b>Dependents</b></em>' containment reference list.
	 * The list contents are of type {@link bento.analysis.atl_analysis.Problem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependents</em>' containment reference list.
	 * @see bento.analysis.atl_analysis.AtlAnalysisPackage#getProblem_Dependents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Problem> getDependents();
} // Problem
