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
 * A representation of the model object '<em><b>Virtual Class Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.VirtualClassBinding#getConcept <em>Concept</em>}</li>
 *   <li>{@link gbind.dsl.VirtualClassBinding#getVirtual <em>Virtual</em>}</li>
 *   <li>{@link gbind.dsl.VirtualClassBinding#getRefFeatures <em>Ref Features</em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getVirtualClassBinding()
 * @model
 * @generated
 */
public interface VirtualClassBinding extends ConceptBinding {
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
	 * @see gbind.dsl.DslPackage#getVirtualClassBinding_Concept()
	 * @model required="true"
	 * @generated
	 */
	ConceptMetaclass getConcept();

	/**
	 * Sets the value of the '{@link gbind.dsl.VirtualClassBinding#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(ConceptMetaclass value);

	/**
	 * Returns the value of the '<em><b>Virtual</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual</em>' reference.
	 * @see #setVirtual(VirtualMetaclass)
	 * @see gbind.dsl.DslPackage#getVirtualClassBinding_Virtual()
	 * @model required="true"
	 * @generated
	 */
	VirtualMetaclass getVirtual();

	/**
	 * Sets the value of the '{@link gbind.dsl.VirtualClassBinding#getVirtual <em>Virtual</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' reference.
	 * @see #getVirtual()
	 * @generated
	 */
	void setVirtual(VirtualMetaclass value);

	/**
	 * Returns the value of the '<em><b>Ref Features</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.dsl.ConceptFeatureRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Features</em>' containment reference list.
	 * @see gbind.dsl.DslPackage#getVirtualClassBinding_RefFeatures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConceptFeatureRef> getRefFeatures();

} // VirtualClassBinding
