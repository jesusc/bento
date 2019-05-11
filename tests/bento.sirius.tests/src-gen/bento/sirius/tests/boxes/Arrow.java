/**
 */
package bento.sirius.tests.boxes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arrow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.boxes.Arrow#getLabel <em>Label</em>}</li>
 *   <li>{@link bento.sirius.tests.boxes.Arrow#getSrc <em>Src</em>}</li>
 *   <li>{@link bento.sirius.tests.boxes.Arrow#getTgt <em>Tgt</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.boxes.BoxesPackage#getArrow()
 * @model
 * @generated
 */
public interface Arrow extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see bento.sirius.tests.boxes.BoxesPackage#getArrow_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.boxes.Arrow#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(BoxNode)
	 * @see bento.sirius.tests.boxes.BoxesPackage#getArrow_Src()
	 * @model required="true"
	 * @generated
	 */
	BoxNode getSrc();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.boxes.Arrow#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(BoxNode value);

	/**
	 * Returns the value of the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt</em>' reference.
	 * @see #setTgt(BoxNode)
	 * @see bento.sirius.tests.boxes.BoxesPackage#getArrow_Tgt()
	 * @model required="true"
	 * @generated
	 */
	BoxNode getTgt();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.boxes.Arrow#getTgt <em>Tgt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt</em>' reference.
	 * @see #getTgt()
	 * @generated
	 */
	void setTgt(BoxNode value);

} // Arrow
