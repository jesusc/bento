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
 * A representation of the model object '<em><b>Has Needless Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link examples.flow_diagrams.report.HasNeedlessElements#getNeedlessPlaces <em>Needless Places</em>}</li>
 *   <li>{@link examples.flow_diagrams.report.HasNeedlessElements#getNeedlessTransitions <em>Needless Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see examples.flow_diagrams.report.ReportPackage#getHasNeedlessElements()
 * @model
 * @generated
 */
public interface HasNeedlessElements extends Problem {
	/**
	 * Returns the value of the '<em><b>Needless Places</b></em>' containment reference list.
	 * The list contents are of type {@link examples.flow_diagrams.report.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needless Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needless Places</em>' containment reference list.
	 * @see examples.flow_diagrams.report.ReportPackage#getHasNeedlessElements_NeedlessPlaces()
	 * @model type="examples.flow_diagrams.report.Place" containment="true"
	 * @generated
	 */
	EList getNeedlessPlaces();

	/**
	 * Returns the value of the '<em><b>Needless Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link examples.flow_diagrams.report.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needless Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needless Transitions</em>' containment reference list.
	 * @see examples.flow_diagrams.report.ReportPackage#getHasNeedlessElements_NeedlessTransitions()
	 * @model type="examples.flow_diagrams.report.Transition" containment="true"
	 * @generated
	 */
	EList getNeedlessTransitions();

} // HasNeedlessElements
