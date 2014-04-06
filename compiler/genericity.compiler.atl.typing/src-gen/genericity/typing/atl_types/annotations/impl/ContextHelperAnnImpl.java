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
import genericity.typing.atl_types.annotations.ContextHelperAnn;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Helper Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ContextHelperAnnImpl#getContextType <em>Context Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ContextHelperAnnImpl#getCalledBy <em>Called By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextHelperAnnImpl extends HelperAnnImpl implements ContextHelperAnn {
	/**
	 * The cached value of the '{@link #getContextType() <em>Context Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextType()
	 * @generated
	 * @ordered
	 */
	protected Type contextType;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextHelperAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.CONTEXT_HELPER_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getContextType() {
		if (contextType != null && contextType.eIsProxy()) {
			InternalEObject oldContextType = (InternalEObject)contextType;
			contextType = (Type)eResolveProxy(oldContextType);
			if (contextType != oldContextType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.CONTEXT_HELPER_ANN__CONTEXT_TYPE, oldContextType, contextType));
			}
		}
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetContextType() {
		return contextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextType(Type newContextType) {
		Type oldContextType = contextType;
		contextType = newContextType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.CONTEXT_HELPER_ANN__CONTEXT_TYPE, oldContextType, contextType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallExprAnn> getCalledBy() {
		if (calledBy == null) {
			calledBy = new EObjectWithInverseResolvingEList.ManyInverse<CallExprAnn>(CallExprAnn.class, this, AnnotationsPackage.CONTEXT_HELPER_ANN__CALLED_BY, AnnotationsPackage.CALL_EXPR_ANN__DYNAMIC_RESOLVERS);
		}
		return calledBy;
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
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CALLED_BY:
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
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CALLED_BY:
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
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CONTEXT_TYPE:
				if (resolve) return getContextType();
				return basicGetContextType();
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CALLED_BY:
				return getCalledBy();
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
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CONTEXT_TYPE:
				setContextType((Type)newValue);
				return;
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CALLED_BY:
				getCalledBy().clear();
				getCalledBy().addAll((Collection<? extends CallExprAnn>)newValue);
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
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CONTEXT_TYPE:
				setContextType((Type)null);
				return;
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CALLED_BY:
				getCalledBy().clear();
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
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CONTEXT_TYPE:
				return contextType != null;
			case AnnotationsPackage.CONTEXT_HELPER_ANN__CALLED_BY:
				return calledBy != null && !calledBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContextHelperAnnImpl
