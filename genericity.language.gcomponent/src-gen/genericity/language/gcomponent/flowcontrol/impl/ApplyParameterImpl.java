/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.language.gcomponent.flowcontrol.impl;

import genericity.language.gcomponent.flowcontrol.ApplyParameter;
import genericity.language.gcomponent.flowcontrol.FlowcontrolPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apply Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.impl.ApplyParameterImpl#getCalledModelName <em>Called Model Name</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.impl.ApplyParameterImpl#getBindingName <em>Binding Name</em>}</li>
 *   <li>{@link genericity.language.gcomponent.flowcontrol.impl.ApplyParameterImpl#getCalleeModelName <em>Callee Model Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplyParameterImpl extends EObjectImpl implements ApplyParameter {
	/**
	 * The default value of the '{@link #getCalledModelName() <em>Called Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLED_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalledModelName() <em>Called Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledModelName()
	 * @generated
	 * @ordered
	 */
	protected String calledModelName = CALLED_MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBindingName() <em>Binding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingName()
	 * @generated
	 * @ordered
	 */
	protected static final String BINDING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBindingName() <em>Binding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingName()
	 * @generated
	 * @ordered
	 */
	protected String bindingName = BINDING_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalleeModelName() <em>Callee Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLEE_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalleeModelName() <em>Callee Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalleeModelName()
	 * @generated
	 * @ordered
	 */
	protected String calleeModelName = CALLEE_MODEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplyParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowcontrolPackage.Literals.APPLY_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalledModelName() {
		return calledModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledModelName(String newCalledModelName) {
		String oldCalledModelName = calledModelName;
		calledModelName = newCalledModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY_PARAMETER__CALLED_MODEL_NAME, oldCalledModelName, calledModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBindingName() {
		return bindingName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingName(String newBindingName) {
		String oldBindingName = bindingName;
		bindingName = newBindingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY_PARAMETER__BINDING_NAME, oldBindingName, bindingName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalleeModelName() {
		return calleeModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalleeModelName(String newCalleeModelName) {
		String oldCalleeModelName = calleeModelName;
		calleeModelName = newCalleeModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowcontrolPackage.APPLY_PARAMETER__CALLEE_MODEL_NAME, oldCalleeModelName, calleeModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowcontrolPackage.APPLY_PARAMETER__CALLED_MODEL_NAME:
				return getCalledModelName();
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING_NAME:
				return getBindingName();
			case FlowcontrolPackage.APPLY_PARAMETER__CALLEE_MODEL_NAME:
				return getCalleeModelName();
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
			case FlowcontrolPackage.APPLY_PARAMETER__CALLED_MODEL_NAME:
				setCalledModelName((String)newValue);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING_NAME:
				setBindingName((String)newValue);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__CALLEE_MODEL_NAME:
				setCalleeModelName((String)newValue);
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
			case FlowcontrolPackage.APPLY_PARAMETER__CALLED_MODEL_NAME:
				setCalledModelName(CALLED_MODEL_NAME_EDEFAULT);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING_NAME:
				setBindingName(BINDING_NAME_EDEFAULT);
				return;
			case FlowcontrolPackage.APPLY_PARAMETER__CALLEE_MODEL_NAME:
				setCalleeModelName(CALLEE_MODEL_NAME_EDEFAULT);
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
			case FlowcontrolPackage.APPLY_PARAMETER__CALLED_MODEL_NAME:
				return CALLED_MODEL_NAME_EDEFAULT == null ? calledModelName != null : !CALLED_MODEL_NAME_EDEFAULT.equals(calledModelName);
			case FlowcontrolPackage.APPLY_PARAMETER__BINDING_NAME:
				return BINDING_NAME_EDEFAULT == null ? bindingName != null : !BINDING_NAME_EDEFAULT.equals(bindingName);
			case FlowcontrolPackage.APPLY_PARAMETER__CALLEE_MODEL_NAME:
				return CALLEE_MODEL_NAME_EDEFAULT == null ? calleeModelName != null : !CALLEE_MODEL_NAME_EDEFAULT.equals(calleeModelName);
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (calledModelName: ");
		result.append(calledModelName);
		result.append(", bindingName: ");
		result.append(bindingName);
		result.append(", calleeModelName: ");
		result.append(calleeModelName);
		result.append(')');
		return result.toString();
	}

} //ApplyParameterImpl
