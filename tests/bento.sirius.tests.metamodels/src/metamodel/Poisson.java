/**
 */
package metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poisson</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.Poisson#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getPoisson()
 * @model
 * @generated
 */
public interface Poisson extends Distribution {
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
	 * @see metamodel.MetamodelPackage#getPoisson_Interval()
	 * @model default="1" dataType="metamodel.PositiveDoubleNotNull"
	 * @generated
	 */
	Double getInterval();

	/**
	 * Sets the value of the '{@link metamodel.Poisson#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(Double value);

} // Poisson
