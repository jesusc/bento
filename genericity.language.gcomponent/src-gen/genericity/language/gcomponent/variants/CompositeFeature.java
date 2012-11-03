/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.variants;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.variants.CompositeFeature#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see genericity.language.gcomponent.variants.VariantsPackage#getCompositeFeature()
 * @model abstract="true"
 * @generated
 */
public interface CompositeFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link genericity.language.gcomponent.variants.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see genericity.language.gcomponent.variants.VariantsPackage#getCompositeFeature_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getChildren();

} // CompositeFeature
