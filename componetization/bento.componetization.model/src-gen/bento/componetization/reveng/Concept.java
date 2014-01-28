/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bento.componetization.reveng;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.componetization.reveng.Concept#getName <em>Name</em>}</li>
 *   <li>{@link bento.componetization.reveng.Concept#getNsURI <em>Ns URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.componetization.reveng.RevengPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends Resource {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bento.componetization.reveng.RevengPackage#getConcept_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Concept#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see bento.componetization.reveng.RevengPackage#getConcept_NsURI()
	 * @model required="true"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Concept#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);
} // Concept
