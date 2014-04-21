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
import genericity.typing.atl_types.annotations.ModuleCallableAnn;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Callable Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ModuleCallableAnnImpl#getCalledBy <em>Called By</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ModuleCallableAnnImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ModuleCallableAnnImpl#getNames <em>Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ModuleCallableAnnImpl extends AtlAnnotationImpl implements ModuleCallableAnn {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleCallableAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.MODULE_CALLABLE_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallExprAnn> getCalledBy() {
		if (calledBy == null) {
			calledBy = new EObjectWithInverseResolvingEList<CallExprAnn>(CallExprAnn.class, this, AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY, AnnotationsPackage.CALL_EXPR_ANN__STATIC_RESOLVER);
		}
		return calledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getArguments() {
		if (arguments == null) {
			arguments = new EObjectResolvingEList<Type>(Type.class, this, AnnotationsPackage.MODULE_CALLABLE_ANN__ARGUMENTS);
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
			names = new EDataTypeUniqueEList<String>(String.class, this, AnnotationsPackage.MODULE_CALLABLE_ANN__NAMES);
		}
		return names;
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
			case AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY:
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
			case AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY:
				return ((InternalEList<?>)getCalledBy()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY:
				return getCalledBy();
			case AnnotationsPackage.MODULE_CALLABLE_ANN__ARGUMENTS:
				return getArguments();
			case AnnotationsPackage.MODULE_CALLABLE_ANN__NAMES:
				return getNames();
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
			case AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY:
				getCalledBy().clear();
				getCalledBy().addAll((Collection<? extends CallExprAnn>)newValue);
				return;
			case AnnotationsPackage.MODULE_CALLABLE_ANN__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Type>)newValue);
				return;
			case AnnotationsPackage.MODULE_CALLABLE_ANN__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends String>)newValue);
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
			case AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY:
				getCalledBy().clear();
				return;
			case AnnotationsPackage.MODULE_CALLABLE_ANN__ARGUMENTS:
				getArguments().clear();
				return;
			case AnnotationsPackage.MODULE_CALLABLE_ANN__NAMES:
				getNames().clear();
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
			case AnnotationsPackage.MODULE_CALLABLE_ANN__CALLED_BY:
				return calledBy != null && !calledBy.isEmpty();
			case AnnotationsPackage.MODULE_CALLABLE_ANN__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case AnnotationsPackage.MODULE_CALLABLE_ANN__NAMES:
				return names != null && !names.isEmpty();
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
		result.append(" (names: ");
		result.append(names);
		result.append(')');
		return result.toString();
	}

} //ModuleCallableAnnImpl
