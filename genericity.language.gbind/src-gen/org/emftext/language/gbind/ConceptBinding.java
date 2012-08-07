/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.emftext.language.gbind;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.gbind.ConceptBinding#getDebugName <em>Debug Name</em>}</li>
 *   <li>{@link org.emftext.language.gbind.ConceptBinding#getModel_ <em>Model </em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.gbind.GbindPackage#getConceptBinding()
 * @model abstract="true"
 * @generated
 */
public interface ConceptBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Debug Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Name</em>' attribute.
	 * @see #setDebugName(String)
	 * @see org.emftext.language.gbind.GbindPackage#getConceptBinding_DebugName()
	 * @model
	 * @generated
	 */
	String getDebugName();

	/**
	 * Sets the value of the '{@link org.emftext.language.gbind.ConceptBinding#getDebugName <em>Debug Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Name</em>' attribute.
	 * @see #getDebugName()
	 * @generated
	 */
	void setDebugName(String value);

	/**
	 * Returns the value of the '<em><b>Model </b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.emftext.language.gbind.BindingModel#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model </em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model </em>' container reference.
	 * @see #setModel_(BindingModel)
	 * @see org.emftext.language.gbind.GbindPackage#getConceptBinding_Model_()
	 * @see org.emftext.language.gbind.BindingModel#getBindings
	 * @model opposite="bindings" transient="false"
	 * @generated
	 */
	BindingModel getModel_();

	/**
	 * Sets the value of the '{@link org.emftext.language.gbind.ConceptBinding#getModel_ <em>Model </em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model </em>' container reference.
	 * @see #getModel_()
	 * @generated
	 */
	void setModel_(BindingModel value);

} // ConceptBinding
