/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package examples.flow_diagrams.report;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Option To Complete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link examples.flow_diagrams.report.NoOptionToComplete#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see examples.flow_diagrams.report.ReportPackage#getNoOptionToComplete()
 * @model
 * @generated
 */
public interface NoOptionToComplete extends Problem {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link examples.flow_diagrams.report.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see examples.flow_diagrams.report.ReportPackage#getNoOptionToComplete_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // NoOptionToComplete
