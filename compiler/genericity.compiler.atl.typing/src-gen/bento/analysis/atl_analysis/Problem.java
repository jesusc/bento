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
 *   <li>{@link bento.analysis.atl_analysis.Problem#getDescription <em>Description</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.Problem#getSeverity <em>Severity</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.Problem#isNeedsCSP <em>Needs CSP</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see bento.analysis.atl_analysis.AtlAnalysisPackage#getProblem_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.Problem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link bento.analysis.atl_analysis.SeverityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see bento.analysis.atl_analysis.SeverityKind
	 * @see #setSeverity(SeverityKind)
	 * @see bento.analysis.atl_analysis.AtlAnalysisPackage#getProblem_Severity()
	 * @model required="true"
	 * @generated
	 */
	SeverityKind getSeverity();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.Problem#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see bento.analysis.atl_analysis.SeverityKind
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(SeverityKind value);

	/**
	 * Returns the value of the '<em><b>Needs CSP</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs CSP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs CSP</em>' attribute.
	 * @see #setNeedsCSP(boolean)
	 * @see bento.analysis.atl_analysis.AtlAnalysisPackage#getProblem_NeedsCSP()
	 * @model default="false"
	 * @generated
	 */
	boolean isNeedsCSP();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.Problem#isNeedsCSP <em>Needs CSP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs CSP</em>' attribute.
	 * @see #isNeedsCSP()
	 * @generated
	 */
	void setNeedsCSP(boolean value);
} // Problem
