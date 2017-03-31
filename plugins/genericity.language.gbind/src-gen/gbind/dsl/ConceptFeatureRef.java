/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Feature Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.ConceptFeatureRef#getConceptClass <em>Concept Class</em>}</li>
 *   <li>{@link gbind.dsl.ConceptFeatureRef#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getConceptFeatureRef()
 * @model
 * @generated
 */
public interface ConceptFeatureRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Class</em>' reference.
	 * @see #setConceptClass(ConceptMetaclass)
	 * @see gbind.dsl.DslPackage#getConceptFeatureRef_ConceptClass()
	 * @model required="true"
	 * @generated
	 */
	ConceptMetaclass getConceptClass();

	/**
	 * Sets the value of the '{@link gbind.dsl.ConceptFeatureRef#getConceptClass <em>Concept Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Class</em>' reference.
	 * @see #getConceptClass()
	 * @generated
	 */
	void setConceptClass(ConceptMetaclass value);

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
	 * @see gbind.dsl.DslPackage#getConceptFeatureRef_FeatureName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link gbind.dsl.ConceptFeatureRef#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // ConceptFeatureRef
