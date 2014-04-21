/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.Type;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.HelperAnn;

import genericity.typing.atl_types.annotations.ModuleCallableAnn;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Helper Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl#getCalledBy <em>Called By</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl#getNames <em>Names</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl#getName <em>Name</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.HelperAnnImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class HelperAnnImpl extends AtlAnnotationImpl implements HelperAnn {
	/**
	 * The cached value of the '{@link #getCalledBy() <em>Called By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<CallExprAnn> calledBy;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> arguments;

	/**
	 * The cached value of the '{@link #getNames() <em>Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> names;

	/**
	 * The cached value of the '{@link #getHelper() <em>Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper()
	 * @generated
	 * @ordered
	 */
	protected EObject helper;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelperAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.HELPER_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallExprAnn> getCalledBy() {
		if (calledBy == null) {
			calledBy = new EObjectWithInverseResolvingEList<CallExprAnn>(CallExprAnn.class, this, AnnotationsPackage.HELPER_ANN__CALLED_BY, AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER);
		}
		return calledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getHelper() {
		if (helper != null && helper.eIsProxy()) {
			InternalEObject oldHelper = (InternalEObject)helper;
			helper = eResolveProxy(oldHelper);
			if (helper != oldHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.HELPER_ANN__HELPER, oldHelper, helper));
			}
		}
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetHelper() {
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelper(EObject newHelper) {
		EObject oldHelper = helper;
		helper = newHelper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.HELPER_ANN__HELPER, oldHelper, helper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.HELPER_ANN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Type)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.HELPER_ANN__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.HELPER_ANN__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<Type>(Type.class, this, AnnotationsPackage.HELPER_ANN__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNames() {
		if (names == null) {
			names = new EDataTypeUniqueEList<String>(String.class, this, AnnotationsPackage.HELPER_ANN__NAMES);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(ExpressionAnnotation newExpr, NotificationChain msgs) {
		ExpressionAnnotation oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.HELPER_ANN__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(ExpressionAnnotation newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.HELPER_ANN__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.HELPER_ANN__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.HELPER_ANN__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.HELPER_ANN__CALLED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalledBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.HELPER_ANN__CALLED_BY:
				return ((InternalEList<?>)getCalledBy()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.HELPER_ANN__EXPR:
				return basicSetExpr(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.HELPER_ANN__CALLED_BY:
				return getCalledBy();
			case AnnotationsPackage.HELPER_ANN__ARGUMENTS:
				return getArguments();
			case AnnotationsPackage.HELPER_ANN__NAMES:
				return getNames();
			case AnnotationsPackage.HELPER_ANN__HELPER:
				if (resolve) return getHelper();
				return basicGetHelper();
			case AnnotationsPackage.HELPER_ANN__NAME:
				return getName();
			case AnnotationsPackage.HELPER_ANN__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case AnnotationsPackage.HELPER_ANN__EXPR:
				return getExpr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AnnotationsPackage.HELPER_ANN__CALLED_BY:
				getCalledBy().clear();
				getCalledBy().addAll((Collection<? extends CallExprAnn>)newValue);
				return;
			case AnnotationsPackage.HELPER_ANN__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Type>)newValue);
				return;
			case AnnotationsPackage.HELPER_ANN__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends String>)newValue);
				return;
			case AnnotationsPackage.HELPER_ANN__HELPER:
				setHelper((EObject)newValue);
				return;
			case AnnotationsPackage.HELPER_ANN__NAME:
				setName((String)newValue);
				return;
			case AnnotationsPackage.HELPER_ANN__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case AnnotationsPackage.HELPER_ANN__EXPR:
				setExpr((ExpressionAnnotation)newValue);
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
			case AnnotationsPackage.HELPER_ANN__CALLED_BY:
				getCalledBy().clear();
				return;
			case AnnotationsPackage.HELPER_ANN__ARGUMENTS:
				getArguments().clear();
				return;
			case AnnotationsPackage.HELPER_ANN__NAMES:
				getNames().clear();
				return;
			case AnnotationsPackage.HELPER_ANN__HELPER:
				setHelper((EObject)null);
				return;
			case AnnotationsPackage.HELPER_ANN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnnotationsPackage.HELPER_ANN__RETURN_TYPE:
				setReturnType((Type)null);
				return;
			case AnnotationsPackage.HELPER_ANN__EXPR:
				setExpr((ExpressionAnnotation)null);
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
			case AnnotationsPackage.HELPER_ANN__CALLED_BY:
				return calledBy != null && !calledBy.isEmpty();
			case AnnotationsPackage.HELPER_ANN__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case AnnotationsPackage.HELPER_ANN__NAMES:
				return names != null && !names.isEmpty();
			case AnnotationsPackage.HELPER_ANN__HELPER:
				return helper != null;
			case AnnotationsPackage.HELPER_ANN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnnotationsPackage.HELPER_ANN__RETURN_TYPE:
				return returnType != null;
			case AnnotationsPackage.HELPER_ANN__EXPR:
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModuleCallableAnn.class) {
			switch (derivedFeatureID) {
				case AnnotationsPackage.HELPER_ANN__CALLED_BY: return AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY;
				case AnnotationsPackage.HELPER_ANN__ARGUMENTS: return AnnotationsPackage.MODULE_CALLABLE_ANN__ARGUMENTS;
				case AnnotationsPackage.HELPER_ANN__NAMES: return AnnotationsPackage.MODULE_CALLABLE_ANN__NAMES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModuleCallableAnn.class) {
			switch (baseFeatureID) {
				case AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY: return AnnotationsPackage.HELPER_ANN__CALLED_BY;
				case AnnotationsPackage.MODULE_CALLABLE_ANN__ARGUMENTS: return AnnotationsPackage.HELPER_ANN__ARGUMENTS;
				case AnnotationsPackage.MODULE_CALLABLE_ANN__NAMES: return AnnotationsPackage.HELPER_ANN__NAMES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (names: ");
		result.append(names);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //HelperAnnImpl
