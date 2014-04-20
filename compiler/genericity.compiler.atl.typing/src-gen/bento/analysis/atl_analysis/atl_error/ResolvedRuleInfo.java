/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Rule Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getLocation <em>Location</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getElement <em>Element</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getOutputType <em>Output Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getResolvedRuleInfo()
 * @model
 * @generated
 */
public interface ResolvedRuleInfo extends EObject {
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
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getResolvedRuleInfo_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getLocation <em>Location</em>}' attribute.
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
	 * If the meaning of the '<em>Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(EObject)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getResolvedRuleInfo_Element()
	 * @model required="true"
	 * @generated
	 */
	EObject getElement();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Name</em>' attribute.
	 * @see #setRuleName(String)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getResolvedRuleInfo_RuleName()
	 * @model required="true"
	 * @generated
	 */
	String getRuleName();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getRuleName <em>Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Name</em>' attribute.
	 * @see #getRuleName()
	 * @generated
	 */
	void setRuleName(String value);

	/**
	 * Returns the value of the '<em><b>Output Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Type</em>' reference.
	 * @see #setOutputType(EClass)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getResolvedRuleInfo_OutputType()
	 * @model
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo#getOutputType <em>Output Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Type</em>' reference.
	 * @see #getOutputType()
	 * @generated
	 */
	void setOutputType(EClass value);

} // ResolvedRuleInfo
