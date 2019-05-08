/**
 */
package bento.language.bentocomp.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.language.bentocomp.core.TransformationComponent#isIsM2M <em>Is M2M</em>}</li>
 *   <li>{@link bento.language.bentocomp.core.TransformationComponent#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see bento.language.bentocomp.core.CorePackage#getTransformationComponent()
 * @model
 * @generated
 */
public interface TransformationComponent extends TemplateBasedComponent {
	/**
	 * Returns the value of the '<em><b>Is M2M</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is M2M</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is M2M</em>' attribute.
	 * @see #setIsM2M(boolean)
	 * @see bento.language.bentocomp.core.CorePackage#getTransformationComponent_IsM2M()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsM2M();

	/**
	 * Sets the value of the '{@link bento.language.bentocomp.core.TransformationComponent#isIsM2M <em>Is M2M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is M2M</em>' attribute.
	 * @see #isIsM2M()
	 * @generated
	 */
	void setIsM2M(boolean value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link bento.language.bentocomp.core.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see bento.language.bentocomp.core.CorePackage#getTransformationComponent_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

} // TransformationComponent
