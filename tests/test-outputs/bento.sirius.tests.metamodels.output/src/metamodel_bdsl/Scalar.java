/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Scalar#getValue <em>Value</em>}</li>
 *   <li>{@link metamodel_bdsl.Scalar#getContainsvalueScalar <em>Containsvalue Scalar</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getScalar()
 * @model
 * @generated
 */
public interface Scalar extends Probability, BindingElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getScalar_Value()
	 * @model default="1.0" dataType="metamodel_bdsl.PositiveDouble"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Scalar#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

	/**
	 * Returns the value of the '<em><b>Containsvalue Scalar</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.valueScalar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsvalue Scalar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsvalue Scalar</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getScalar_ContainsvalueScalar()
	 * @model containment="true"
	 * @generated
	 */
	EList<valueScalar> getContainsvalueScalar();

} // Scalar
