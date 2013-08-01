/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import gbind.simpleocl.OclExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.ClassBinding#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.ClassBinding#getConcrete <em>Concrete</em>}</li>
 *   <li>{@link gbind.dsl.ClassBinding#getWhenClause <em>When Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getClassBinding()
 * @model
 * @generated
 */
public interface ClassBinding extends ConceptBinding {
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
	 * @see gbind.dsl.DslPackage#getClassBinding_Concept()
	 * @model required="true"
	 * @generated
	 */
	ConceptMetaclass getConcept();

	/**
	 * Sets the value of the '{@link gbind.dsl.ClassBinding#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(ConceptMetaclass value);

	/**
	 * Returns the value of the '<em><b>Concrete</b></em>' reference list.
	 * The list contents are of type {@link gbind.dsl.ConcreteMetaclass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete</em>' reference list.
	 * @see gbind.dsl.DslPackage#getClassBinding_Concrete()
	 * @model required="true"
	 * @generated
	 */
	EList<ConcreteMetaclass> getConcrete();

	/**
	 * Returns the value of the '<em><b>When Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When Clause</em>' containment reference.
	 * @see #setWhenClause(OclExpression)
	 * @see gbind.dsl.DslPackage#getClassBinding_WhenClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OclExpression getWhenClause();

	/**
	 * Sets the value of the '{@link gbind.dsl.ClassBinding#getWhenClause <em>When Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When Clause</em>' containment reference.
	 * @see #getWhenClause()
	 * @generated
	 */
	void setWhenClause(OclExpression value);

} // ClassBinding
