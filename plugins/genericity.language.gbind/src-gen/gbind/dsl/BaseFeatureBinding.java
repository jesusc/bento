/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Feature Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.BaseFeatureBinding#getConceptFeature <em>Concept Feature</em>}</li>
 *   <li>{@link gbind.dsl.BaseFeatureBinding#getConceptClass <em>Concept Class</em>}</li>
 *   <li>{@link gbind.dsl.BaseFeatureBinding#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getBaseFeatureBinding()
 * @model
 * @generated
 */
public interface BaseFeatureBinding extends ConceptBinding {
	/**
	 * Returns the value of the '<em><b>Concept Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Feature</em>' attribute.
	 * @see #setConceptFeature(String)
	 * @see gbind.dsl.DslPackage#getBaseFeatureBinding_ConceptFeature()
	 * @model required="true"
	 * @generated
	 */
	String getConceptFeature();

	/**
	 * Sets the value of the '{@link gbind.dsl.BaseFeatureBinding#getConceptFeature <em>Concept Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Feature</em>' attribute.
	 * @see #getConceptFeature()
	 * @generated
	 */
	void setConceptFeature(String value);

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
	 * @see gbind.dsl.DslPackage#getBaseFeatureBinding_ConceptClass()
	 * @model required="true"
	 * @generated
	 */
	ConceptMetaclass getConceptClass();

	/**
	 * Sets the value of the '{@link gbind.dsl.BaseFeatureBinding#getConceptClass <em>Concept Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Class</em>' reference.
	 * @see #getConceptClass()
	 * @generated
	 */
	void setConceptClass(ConceptMetaclass value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference.
	 * @see #setQualifier(ConcreteMetaclass)
	 * @see gbind.dsl.DslPackage#getBaseFeatureBinding_Qualifier()
	 * @model
	 * @generated
	 */
	ConcreteMetaclass getQualifier();

	/**
	 * Sets the value of the '{@link gbind.dsl.BaseFeatureBinding#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(ConcreteMetaclass value);

} // BaseFeatureBinding
