/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Class Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcreteClass <em>Concrete Class</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcreteReference <em>Concrete Reference</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConceptContext <em>Concept Context</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConceptReferenceName <em>Concept Reference Name</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getFeatureBindings <em>Feature Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getIntermediateClassBinding()
 * @model
 * @generated
 */
public interface IntermediateClassBinding extends ConceptBinding {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(ConceptMetaclass)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_Concept()
	 * @model required="true"
	 * @generated
	 */
	ConceptMetaclass getConcept();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(ConceptMetaclass value);

	/**
	 * Returns the value of the '<em><b>Concrete Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Class</em>' reference.
	 * @see #setConcreteClass(ConcreteMetaclass)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConcreteClass()
	 * @model required="true"
	 * @generated
	 */
	ConcreteMetaclass getConcreteClass();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConcreteClass <em>Concrete Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Class</em>' reference.
	 * @see #getConcreteClass()
	 * @generated
	 */
	void setConcreteClass(ConcreteMetaclass value);

	/**
	 * Returns the value of the '<em><b>Concrete Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Reference</em>' containment reference.
	 * @see #setConcreteReference(ConcreteReferencDeclaringVar)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConcreteReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConcreteReferencDeclaringVar getConcreteReference();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConcreteReference <em>Concrete Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Reference</em>' containment reference.
	 * @see #getConcreteReference()
	 * @generated
	 */
	void setConcreteReference(ConcreteReferencDeclaringVar value);

	/**
	 * Returns the value of the '<em><b>Concept Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Context</em>' reference.
	 * @see #setConceptContext(ConceptMetaclass)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConceptContext()
	 * @model required="true"
	 * @generated
	 */
	ConceptMetaclass getConceptContext();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConceptContext <em>Concept Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Context</em>' reference.
	 * @see #getConceptContext()
	 * @generated
	 */
	void setConceptContext(ConceptMetaclass value);

	/**
	 * Returns the value of the '<em><b>Concept Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept Reference Name</em>' attribute.
	 * @see #setConceptReferenceName(String)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConceptReferenceName()
	 * @model required="true"
	 * @generated
	 */
	String getConceptReferenceName();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConceptReferenceName <em>Concept Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Reference Name</em>' attribute.
	 * @see #getConceptReferenceName()
	 * @generated
	 */
	void setConceptReferenceName(String value);

	/**
	 * Returns the value of the '<em><b>Feature Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.BaseFeatureBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Bindings</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_FeatureBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<BaseFeatureBinding> getFeatureBindings();

} // IntermediateClassBinding
