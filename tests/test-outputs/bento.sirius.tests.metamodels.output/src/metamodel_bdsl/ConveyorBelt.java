/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conveyor Belt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.ConveyorBelt#getMinimalSeparationBetweenBatches <em>Minimal Separation Between Batches</em>}</li>
 *   <li>{@link metamodel_bdsl.ConveyorBelt#getOutput <em>Output</em>}</li>
 *   <li>{@link metamodel_bdsl.ConveyorBelt#getEref_storageOutputFlowConveyorBelt131 <em>Eref storage Output Flow Conveyor Belt131</em>}</li>
 *   <li>{@link metamodel_bdsl.ConveyorBelt#getEref_durationConveyorBelt132 <em>Eref duration Conveyor Belt132</em>}</li>
 *   <li>{@link metamodel_bdsl.ConveyorBelt#getEref_outputConveyorBelt133 <em>Eref output Conveyor Belt133</em>}</li>
 *   <li>{@link metamodel_bdsl.ConveyorBelt#getContainsnameConveyorBelt <em>Containsname Conveyor Belt</em>}</li>
 *   <li>{@link metamodel_bdsl.ConveyorBelt#getContainsminimalSeparationBetweenBatchesConveyorBelt <em>Containsminimal Separation Between Batches Conveyor Belt</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt()
 * @model
 * @generated
 */
public interface ConveyorBelt extends metamodel_bdsl.Process, BindingElement {
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
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt_MinimalSeparationBetweenBatches()
	 * @model default="1" dataType="metamodel_bdsl.PositiveDouble"
	 * @generated
	 */
	Double getMinimalSeparationBetweenBatches();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ConveyorBelt#getMinimalSeparationBetweenBatches <em>Minimal Separation Between Batches</em>}' attribute.
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
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt_Output()
	 * @model containment="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ConveyorBelt#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Eref storage Output Flow Conveyor Belt131</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref storage Output Flow Conveyor Belt131</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref storage Output Flow Conveyor Belt131</em>' containment reference.
	 * @see #setEref_storageOutputFlowConveyorBelt131(storageOutputFlowConveyorBelt131)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt_Eref_storageOutputFlowConveyorBelt131()
	 * @model containment="true"
	 * @generated
	 */
	storageOutputFlowConveyorBelt131 getEref_storageOutputFlowConveyorBelt131();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ConveyorBelt#getEref_storageOutputFlowConveyorBelt131 <em>Eref storage Output Flow Conveyor Belt131</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref storage Output Flow Conveyor Belt131</em>' containment reference.
	 * @see #getEref_storageOutputFlowConveyorBelt131()
	 * @generated
	 */
	void setEref_storageOutputFlowConveyorBelt131(storageOutputFlowConveyorBelt131 value);

	/**
	 * Returns the value of the '<em><b>Eref duration Conveyor Belt132</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref duration Conveyor Belt132</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref duration Conveyor Belt132</em>' containment reference.
	 * @see #setEref_durationConveyorBelt132(durationConveyorBelt132)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt_Eref_durationConveyorBelt132()
	 * @model containment="true"
	 * @generated
	 */
	durationConveyorBelt132 getEref_durationConveyorBelt132();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ConveyorBelt#getEref_durationConveyorBelt132 <em>Eref duration Conveyor Belt132</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref duration Conveyor Belt132</em>' containment reference.
	 * @see #getEref_durationConveyorBelt132()
	 * @generated
	 */
	void setEref_durationConveyorBelt132(durationConveyorBelt132 value);

	/**
	 * Returns the value of the '<em><b>Eref output Conveyor Belt133</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eref output Conveyor Belt133</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eref output Conveyor Belt133</em>' containment reference.
	 * @see #setEref_outputConveyorBelt133(outputConveyorBelt133)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt_Eref_outputConveyorBelt133()
	 * @model containment="true"
	 * @generated
	 */
	outputConveyorBelt133 getEref_outputConveyorBelt133();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.ConveyorBelt#getEref_outputConveyorBelt133 <em>Eref output Conveyor Belt133</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eref output Conveyor Belt133</em>' containment reference.
	 * @see #getEref_outputConveyorBelt133()
	 * @generated
	 */
	void setEref_outputConveyorBelt133(outputConveyorBelt133 value);

	/**
	 * Returns the value of the '<em><b>Containsname Conveyor Belt</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.nameConveyorBelt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Conveyor Belt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Conveyor Belt</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt_ContainsnameConveyorBelt()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameConveyorBelt> getContainsnameConveyorBelt();

	/**
	 * Returns the value of the '<em><b>Containsminimal Separation Between Batches Conveyor Belt</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.minimalSeparationBetweenBatchesConveyorBelt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsminimal Separation Between Batches Conveyor Belt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsminimal Separation Between Batches Conveyor Belt</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getConveyorBelt_ContainsminimalSeparationBetweenBatchesConveyorBelt()
	 * @model containment="true"
	 * @generated
	 */
	EList<minimalSeparationBetweenBatchesConveyorBelt> getContainsminimalSeparationBetweenBatchesConveyorBelt();

} // ConveyorBelt
