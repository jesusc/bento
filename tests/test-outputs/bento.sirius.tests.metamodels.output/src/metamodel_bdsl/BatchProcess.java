/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Batch Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.BatchProcess#getPercentageOfSuccess <em>Percentage Of Success</em>}</li>
 *   <li>{@link metamodel_bdsl.BatchProcess#getNumberOfChains <em>Number Of Chains</em>}</li>
 *   <li>{@link metamodel_bdsl.BatchProcess#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link metamodel_bdsl.BatchProcess#getContainsnameBatchProcess <em>Containsname Batch Process</em>}</li>
 *   <li>{@link metamodel_bdsl.BatchProcess#getContainspercentageOfSuccessBatchProcess <em>Containspercentage Of Success Batch Process</em>}</li>
 *   <li>{@link metamodel_bdsl.BatchProcess#getContainsnumberOfChainsBatchProcess <em>Containsnumber Of Chains Batch Process</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getBatchProcess()
 * @model
 * @generated
 */
public interface BatchProcess extends metamodel_bdsl.Process, BindingElement {
	/**
	 * Returns the value of the '<em><b>Percentage Of Success</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Success</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Success</em>' attribute.
	 * @see #setPercentageOfSuccess(Double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getBatchProcess_PercentageOfSuccess()
	 * @model default="100" dataType="metamodel_bdsl.Percent"
	 * @generated
	 */
	Double getPercentageOfSuccess();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.BatchProcess#getPercentageOfSuccess <em>Percentage Of Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Success</em>' attribute.
	 * @see #getPercentageOfSuccess()
	 * @generated
	 */
	void setPercentageOfSuccess(Double value);

	/**
	 * Returns the value of the '<em><b>Number Of Chains</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Chains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Chains</em>' attribute.
	 * @see #setNumberOfChains(Integer)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getBatchProcess_NumberOfChains()
	 * @model default="3" dataType="metamodel_bdsl.PositiveIntNotNull"
	 * @generated
	 */
	Integer getNumberOfChains();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.BatchProcess#getNumberOfChains <em>Number Of Chains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Chains</em>' attribute.
	 * @see #getNumberOfChains()
	 * @generated
	 */
	void setNumberOfChains(Integer value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getBatchProcess_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

	/**
	 * Returns the value of the '<em><b>Containsname Batch Process</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.nameBatchProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsname Batch Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsname Batch Process</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getBatchProcess_ContainsnameBatchProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<nameBatchProcess> getContainsnameBatchProcess();

	/**
	 * Returns the value of the '<em><b>Containspercentage Of Success Batch Process</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.percentageOfSuccessBatchProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containspercentage Of Success Batch Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containspercentage Of Success Batch Process</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getBatchProcess_ContainspercentageOfSuccessBatchProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<percentageOfSuccessBatchProcess> getContainspercentageOfSuccessBatchProcess();

	/**
	 * Returns the value of the '<em><b>Containsnumber Of Chains Batch Process</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.numberOfChainsBatchProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsnumber Of Chains Batch Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsnumber Of Chains Batch Process</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getBatchProcess_ContainsnumberOfChainsBatchProcess()
	 * @model containment="true"
	 * @generated
	 */
	EList<numberOfChainsBatchProcess> getContainsnumberOfChainsBatchProcess();

} // BatchProcess
