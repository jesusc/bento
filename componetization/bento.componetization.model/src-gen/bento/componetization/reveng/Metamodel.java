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
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.componetization.reveng.Metamodel#getName <em>Name</em>}</li>
 *   <li>{@link bento.componetization.reveng.Metamodel#getModelName <em>Model Name</em>}</li>
 *   <li>{@link bento.componetization.reveng.Metamodel#isBecomeConcept <em>Become Concept</em>}</li>
 *   <li>{@link bento.componetization.reveng.Metamodel#getKind <em>Kind</em>}</li>
 *   <li>{@link bento.componetization.reveng.Metamodel#getExtractedConcept <em>Extracted Concept</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.componetization.reveng.RevengPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends Resource {
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
	 * @see bento.componetization.reveng.RevengPackage#getMetamodel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Metamodel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see bento.componetization.reveng.RevengPackage#getMetamodel_ModelName()
	 * @model required="true"
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Metamodel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

	/**
	 * Returns the value of the '<em><b>Become Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Become Concept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Become Concept</em>' attribute.
	 * @see #setBecomeConcept(boolean)
	 * @see bento.componetization.reveng.RevengPackage#getMetamodel_BecomeConcept()
	 * @model
	 * @generated
	 */
	boolean isBecomeConcept();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Metamodel#isBecomeConcept <em>Become Concept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Become Concept</em>' attribute.
	 * @see #isBecomeConcept()
	 * @generated
	 */
	void setBecomeConcept(boolean value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link bento.componetization.reveng.ModelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see bento.componetization.reveng.ModelKind
	 * @see #setKind(ModelKind)
	 * @see bento.componetization.reveng.RevengPackage#getMetamodel_Kind()
	 * @model
	 * @generated
	 */
	ModelKind getKind();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Metamodel#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see bento.componetization.reveng.ModelKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ModelKind value);

	/**
	 * Returns the value of the '<em><b>Extracted Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extracted Concept</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extracted Concept</em>' containment reference.
	 * @see #setExtractedConcept(Concept)
	 * @see bento.componetization.reveng.RevengPackage#getMetamodel_ExtractedConcept()
	 * @model containment="true"
	 * @generated
	 */
	Concept getExtractedConcept();

	/**
	 * Sets the value of the '{@link bento.componetization.reveng.Metamodel#getExtractedConcept <em>Extracted Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extracted Concept</em>' containment reference.
	 * @see #getExtractedConcept()
	 * @generated
	 */
	void setExtractedConcept(Concept value);

} // Metamodel
