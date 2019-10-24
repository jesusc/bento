/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poisson</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Poisson#getInterval <em>Interval</em>}</li>
 *   <li>{@link metamodel_bdsl.Poisson#getContainsintervalPoisson <em>Containsinterval Poisson</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getPoisson()
 * @model
 * @generated
 */
public interface Poisson extends Distribution, BindingElement {
	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(Double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getPoisson_Interval()
	 * @model default="1" dataType="metamodel_bdsl.PositiveDoubleNotNull"
	 * @generated
	 */
	Double getInterval();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Poisson#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Double value);

	/**
	 * Returns the value of the '<em><b>Containsinterval Poisson</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.intervalPoisson}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsinterval Poisson</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsinterval Poisson</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getPoisson_ContainsintervalPoisson()
	 * @model containment="true"
	 * @generated
	 */
	EList<intervalPoisson> getContainsintervalPoisson();

} // Poisson
