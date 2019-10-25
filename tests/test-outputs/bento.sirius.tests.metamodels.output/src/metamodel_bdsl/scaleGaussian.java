/**
 */
package metamodel_bdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>scale Gaussian</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.scaleGaussian#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getscaleGaussian()
 * @model
 * @generated
 */
public interface scaleGaussian extends BindingAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getscaleGaussian_Value()
	 * @model dataType="metamodel_bdsl.PositiveDoubleNotNull"
	 * @generated
	 */
	Double getValue();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.scaleGaussian#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Double value);

} // scaleGaussian