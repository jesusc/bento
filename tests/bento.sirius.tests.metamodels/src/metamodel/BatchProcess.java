/**
 */
package metamodel;

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
 *   <li>{@link metamodel.BatchProcess#getPercentageOfSuccess <em>Percentage Of Success</em>}</li>
 *   <li>{@link metamodel.BatchProcess#getNumberOfChains <em>Number Of Chains</em>}</li>
 *   <li>{@link metamodel.BatchProcess#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see metamodel.MetamodelPackage#getBatchProcess()
 * @model
 * @generated
 */
public interface BatchProcess extends metamodel.Process {
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
	 * @see metamodel.MetamodelPackage#getBatchProcess_PercentageOfSuccess()
	 * @model default="100" dataType="metamodel.Percent"
	 * @generated
	 */
	Double getPercentageOfSuccess();

	/**
	 * Sets the value of the '{@link metamodel.BatchProcess#getPercentageOfSuccess <em>Percentage Of Success</em>}' attribute.
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
	 * @see metamodel.MetamodelPackage#getBatchProcess_NumberOfChains()
	 * @model default="3" dataType="metamodel.PositiveIntNotNull"
	 * @generated
	 */
	Integer getNumberOfChains();

	/**
	 * Sets the value of the '{@link metamodel.BatchProcess#getNumberOfChains <em>Number Of Chains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Chains</em>' attribute.
	 * @see #getNumberOfChains()
	 * @generated
	 */
	void setNumberOfChains(Integer value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.Output}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see metamodel.MetamodelPackage#getBatchProcess_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Output> getOutputs();

} // BatchProcess
