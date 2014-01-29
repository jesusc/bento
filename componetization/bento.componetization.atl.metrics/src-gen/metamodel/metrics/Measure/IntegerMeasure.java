/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.metrics.Measure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.metrics.Measure.IntegerMeasure#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.metrics.Measure.MeasurePackage#getIntegerMeasure()
 * @model
 * @generated
 */
public interface IntegerMeasure extends Measure {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Integer)
	 * @see metamodel.metrics.Measure.MeasurePackage#getIntegerMeasure_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.IntegerMeasure#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

} // IntegerMeasure
