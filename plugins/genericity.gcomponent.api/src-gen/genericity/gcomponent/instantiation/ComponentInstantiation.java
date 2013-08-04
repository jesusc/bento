/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.gcomponent.instantiation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.gcomponent.instantiation.ComponentInstantiation#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getComponentInstantiation()
 * @model
 * @generated
 */
public interface ComponentInstantiation extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(ExecutableTransformation)
	 * @see genericity.gcomponent.instantiation.ComponentInstantiationPackage#getComponentInstantiation_Transformation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExecutableTransformation getTransformation();

	/**
	 * Sets the value of the '{@link genericity.gcomponent.instantiation.ComponentInstantiation#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(ExecutableTransformation value);

} // ComponentInstantiation
