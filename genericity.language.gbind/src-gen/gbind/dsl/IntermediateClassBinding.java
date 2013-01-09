/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermediate Class Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcreteSource <em>Concrete Source</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcreteReferenceSource <em>Concrete Reference Source</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcreteTarget <em>Concrete Target</em>}</li>
 *   <li>{@link gbind.dsl.IntermediateClassBinding#getConcreteReferenceTarget <em>Concrete Reference Target</em>}</li>
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
	 * Returns the value of the '<em><b>Concrete Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Source</em>' reference.
	 * @see #setConcreteSource(ConcreteMetaclass)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConcreteSource()
	 * @model required="true"
	 * @generated
	 */
	ConcreteMetaclass getConcreteSource();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConcreteSource <em>Concrete Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Source</em>' reference.
	 * @see #getConcreteSource()
	 * @generated
	 */
	void setConcreteSource(ConcreteMetaclass value);

	/**
	 * Returns the value of the '<em><b>Concrete Reference Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Reference Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Reference Source</em>' attribute.
	 * @see #setConcreteReferenceSource(String)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConcreteReferenceSource()
	 * @model required="true"
	 * @generated
	 */
	String getConcreteReferenceSource();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConcreteReferenceSource <em>Concrete Reference Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Reference Source</em>' attribute.
	 * @see #getConcreteReferenceSource()
	 * @generated
	 */
	void setConcreteReferenceSource(String value);

	/**
	 * Returns the value of the '<em><b>Concrete Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Target</em>' reference.
	 * @see #setConcreteTarget(ConcreteMetaclass)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConcreteTarget()
	 * @model required="true"
	 * @generated
	 */
	ConcreteMetaclass getConcreteTarget();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConcreteTarget <em>Concrete Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Target</em>' reference.
	 * @see #getConcreteTarget()
	 * @generated
	 */
	void setConcreteTarget(ConcreteMetaclass value);

	/**
	 * Returns the value of the '<em><b>Concrete Reference Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Reference Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Reference Target</em>' attribute.
	 * @see #setConcreteReferenceTarget(String)
	 * @see gbind.dsl.DslPackage#getIntermediateClassBinding_ConcreteReferenceTarget()
	 * @model
	 * @generated
	 */
	String getConcreteReferenceTarget();

	/**
	 * Sets the value of the '{@link gbind.dsl.IntermediateClassBinding#getConcreteReferenceTarget <em>Concrete Reference Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Reference Target</em>' attribute.
	 * @see #getConcreteReferenceTarget()
	 * @generated
	 */
	void setConcreteReferenceTarget(String value);

} // IntermediateClassBinding
