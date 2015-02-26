/**
 */
package bento.language.bentocomp.core;

import bento.language.bentocomp.flowcontrol.Composition;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bento.language.bentocomp.core.CompositeComponent#getUses <em>Uses</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.CompositeComponent#getComposition <em>Composition</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.CompositeComponent#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see bento.language.bentocomp.core.CorePackage#getCompositeComponent()
 * @model
 * @generated
 */
public interface CompositeComponent extends Component {
	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getCompositeComponent_Uses()
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
	 * @see bento.language.bentocomp.core.CorePackage#getCompositeComponent_Composition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.CompositeComponent#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.BindingDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getCompositeComponent_Bindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<BindingDeclaration> getBindings();

} // CompositeComponent
