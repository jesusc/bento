/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.dsl;

import genericity.language.gcomponent.core.Component;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.dsl.DefinitionRoot#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.dsl.DslPackage#getDefinitionRoot()
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
	 * @see genericity.language.gcomponent.dsl.DslPackage#getDefinitionRoot_Component()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.dsl.DefinitionRoot#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // DefinitionRoot
