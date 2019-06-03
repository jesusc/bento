/**
 */
package bento.sirius.tests.metamodels.stepeasy.impl;

import bento.sirius.tests.metamodels.stepeasy.AwsLambdaTask;
import bento.sirius.tests.metamodels.stepeasy.StepeasyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aws Lambda Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bento.sirius.tests.metamodels.stepeasy.impl.AwsLambdaTaskImpl#getArn <em>Arn</em>}</li>
 *   <li>{@link bento.sirius.tests.metamodels.stepeasy.impl.AwsLambdaTaskImpl#getFunctionTimeout <em>Function Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AwsLambdaTaskImpl extends TaskImpl implements AwsLambdaTask {
	/**
	 * The default value of the '{@link #getArn() <em>Arn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArn()
	 * @generated
	 * @ordered
	 */
	protected static final String ARN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArn() <em>Arn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArn()
	 * @generated
	 * @ordered
	 */
	protected String arn = ARN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionTimeout() <em>Function Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int FUNCTION_TIMEOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFunctionTimeout() <em>Function Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionTimeout()
	 * @generated
	 * @ordered
	 */
	protected int functionTimeout = FUNCTION_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwsLambdaTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepeasyPackage.Literals.AWS_LAMBDA_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArn() {
		return arn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArn(String newArn) {
		String oldArn = arn;
		arn = newArn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepeasyPackage.AWS_LAMBDA_TASK__ARN, oldArn, arn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFunctionTimeout() {
		return functionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionTimeout(int newFunctionTimeout) {
		int oldFunctionTimeout = functionTimeout;
		functionTimeout = newFunctionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StepeasyPackage.AWS_LAMBDA_TASK__FUNCTION_TIMEOUT, oldFunctionTimeout, functionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StepeasyPackage.AWS_LAMBDA_TASK__ARN:
				return getArn();
			case StepeasyPackage.AWS_LAMBDA_TASK__FUNCTION_TIMEOUT:
				return getFunctionTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StepeasyPackage.AWS_LAMBDA_TASK__ARN:
				setArn((String)newValue);
				return;
			case StepeasyPackage.AWS_LAMBDA_TASK__FUNCTION_TIMEOUT:
				setFunctionTimeout((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StepeasyPackage.AWS_LAMBDA_TASK__ARN:
				setArn(ARN_EDEFAULT);
				return;
			case StepeasyPackage.AWS_LAMBDA_TASK__FUNCTION_TIMEOUT:
				setFunctionTimeout(FUNCTION_TIMEOUT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StepeasyPackage.AWS_LAMBDA_TASK__ARN:
				return ARN_EDEFAULT == null ? arn != null : !ARN_EDEFAULT.equals(arn);
			case StepeasyPackage.AWS_LAMBDA_TASK__FUNCTION_TIMEOUT:
				return functionTimeout != FUNCTION_TIMEOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (arn: ");
		result.append(arn);
		result.append(", functionTimeout: ");
		result.append(functionTimeout);
		result.append(')');
		return result.toString();
	}

} //AwsLambdaTaskImpl
