/**
 */
package bento.language.bentocomp.variants;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.variants.CompositeFeature#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.variants.VariantsPackage#getCompositeFeature()
 * @model abstract="true"
 * @generated
 */
public interface CompositeFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.variants.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see bento.language.bentocomp.variants.VariantsPackage#getCompositeFeature_Children()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getChildren();

} // CompositeFeature
