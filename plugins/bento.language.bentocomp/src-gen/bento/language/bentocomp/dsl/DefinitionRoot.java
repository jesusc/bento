/**
 */
package bento.language.bentocomp.dsl;

import bento.language.bentocomp.core.Component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.dsl.DefinitionRoot#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.dsl.DslPackage#getDefinitionRoot()
 * @model
 * @generated
 */
public interface DefinitionRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Component)
	 * @see bento.language.bentocomp.dsl.DslPackage#getDefinitionRoot_Component()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.dsl.DefinitionRoot#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // DefinitionRoot
