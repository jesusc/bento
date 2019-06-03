/**
 */
package bento.sirius.tests.metamodels.stepeasy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aws Lambda Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getArn <em>Arn</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getFunctionTimeout <em>Function Timeout</em>}</li>
 * </ul>
 *
 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyPackage#getAwsLambdaTask()
 * @model
 * @generated
 */
public interface AwsLambdaTask extends Task {
	/**
	 * Returns the value of the '<em><b>Arn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arn</em>' attribute.
	 * @see #setArn(String)
	 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyPackage#getAwsLambdaTask_Arn()
	 * @model required="true"
	 * @generated
	 */
	String getArn();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getArn <em>Arn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arn</em>' attribute.
	 * @see #getArn()
	 * @generated
	 */
	void setArn(String value);

	/**
	 * Returns the value of the '<em><b>Function Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Timeout</em>' attribute.
	 * @see #setFunctionTimeout(int)
	 * @see bento.sirius.tests.metamodels.stepeasy.StepeasyPackage#getAwsLambdaTask_FunctionTimeout()
	 * @model required="true"
	 * @generated
	 */
	int getFunctionTimeout();

	/**
	 * Sets the value of the '{@link bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask#getFunctionTimeout <em>Function Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Timeout</em>' attribute.
	 * @see #getFunctionTimeout()
	 * @generated
	 */
	void setFunctionTimeout(int value);

} // AwsLambdaTask
