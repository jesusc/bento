/**
 */
package metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel.ConveyorBelt#getMinimalSeparationBetweenBatches <em>Minimal Separation Between Batches</em>}</li>
 *   <li>{@link metamodel.ConveyorBelt#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getConveyorBelt()
 * @model
 * @generated
 */
public interface ConveyorBelt extends metamodel.Process {
	/**
	 * Returns the value of the '<em><b>Minimal Separation Between Batches</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimal Separation Between Batches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimal Separation Between Batches</em>' attribute.
	 * @see #setMinimalSeparationBetweenBatches(Double)
	 * @see metamodel.MetamodelPackage#getConveyorBelt_MinimalSeparationBetweenBatches()
	 * @model default="1" dataType="metamodel.PositiveDouble"
	 * @generated
	 */
	Double getMinimalSeparationBetweenBatches();

	/**
	 * Sets the value of the '{@link metamodel.ConveyorBelt#getMinimalSeparationBetweenBatches <em>Minimal Separation Between Batches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimal Separation Between Batches</em>' attribute.
	 * @see #getMinimalSeparationBetweenBatches()
	 * @generated
	 */
	void setMinimalSeparationBetweenBatches(Double value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see metamodel.MetamodelPackage#getConveyorBelt_Output()
	 * @model containment="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link metamodel.ConveyorBelt#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

} // ConveyorBelt
