/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.ConceptHelper#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link gbind.dsl.ConceptHelper#getContextClass <em>Context Class</em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getConceptHelper()
 * @model
 * @generated
 */
public interface ConceptHelper extends BaseHelper {
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
	 * @see gbind.dsl.DslPackage#getConceptHelper_Qualifier()
	 * @model
	 * @generated
	 */
	ConcreteMetaclass getQualifier();

	/**
	 * Sets the value of the '{@link gbind.dsl.ConceptHelper#getQualifier <em>Qualifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualifier</em>' reference.
	 * @see #getQualifier()
	 * @generated
	 */
	void setQualifier(ConcreteMetaclass value);

	/**
	 * Returns the value of the '<em><b>Context Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Class</em>' reference.
	 * @see #setContextClass(ConceptMetaclass)
	 * @see gbind.dsl.DslPackage#getConceptHelper_ContextClass()
	 * @model required="true"
	 * @generated
	 */
	ConceptMetaclass getContextClass();

	/**
	 * Sets the value of the '{@link gbind.dsl.ConceptHelper#getContextClass <em>Context Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Class</em>' reference.
	 * @see #getContextClass()
	 * @generated
	 */
	void setContextClass(ConceptMetaclass value);

} // ConceptHelper
