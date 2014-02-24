/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.analysis.atl_analysis.atl_error;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Not Found In Union Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getFeatureNotFoundInUnionType()
 * @model
 * @generated
 */
public interface FeatureNotFoundInUnionType extends NavigationProblem {
	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see bento.analysis.atl_analysis.atl_error.AtlErrorsPackage#getFeatureNotFoundInUnionType_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link bento.analysis.atl_analysis.atl_error.FeatureNotFoundInUnionType#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // FeatureNotFoundInUnionType
