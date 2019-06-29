/**
 */
package metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Flow#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getFlow()
 * @model abstract="true"
 * @generated
 */
public interface Flow extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Probability)
	 * @see metamodel.MetamodelPackage#getFlow_Quantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Probability getQuantity();

	/**
	 * Sets the value of the '{@link metamodel.Flow#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Probability value);

} // Flow
