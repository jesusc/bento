/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.core;

import genericity.language.gcomponent.flowcontrol.Composition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.core.CompositeComponent#getUses <em>Uses</em>}</li>
 *   <li>{@link genericity.language.gcomponent.core.CompositeComponent#getComposition <em>Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.core.CorePackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.core.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see genericity.language.gcomponent.core.CorePackage#getCompositeComponent_Uses()
	 * @model required="true"
	 * @generated
	 */
	EList<Component> getUses();

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(Composition)
	 * @see genericity.language.gcomponent.core.CorePackage#getCompositeComponent_Composition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link genericity.language.gcomponent.core.CompositeComponent#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

} // CompositeComponent
