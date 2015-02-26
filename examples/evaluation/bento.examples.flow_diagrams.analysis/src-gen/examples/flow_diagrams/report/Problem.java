/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package examples.flow_diagrams.report;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link examples.flow_diagrams.report.Problem#getProblemKind <em>Problem Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see examples.flow_diagrams.report.ReportPackage#getProblem()
 * @model abstract="true"
 * @generated
 */
public interface Problem extends EObject {
	/**
	 * Returns the value of the '<em><b>Problem Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link examples.flow_diagrams.report.ProblemKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Kind</em>' attribute.
	 * @see examples.flow_diagrams.report.ProblemKind
	 * @see #setProblemKind(ProblemKind)
	 * @see examples.flow_diagrams.report.ReportPackage#getProblem_ProblemKind()
	 * @model
	 * @generated
	 */
	ProblemKind getProblemKind();

	/**
	 * Sets the value of the '{@link examples.flow_diagrams.report.Problem#getProblemKind <em>Problem Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Kind</em>' attribute.
	 * @see examples.flow_diagrams.report.ProblemKind
	 * @see #getProblemKind()
	 * @generated
	 */
	void setProblemKind(ProblemKind value);

} // Problem
