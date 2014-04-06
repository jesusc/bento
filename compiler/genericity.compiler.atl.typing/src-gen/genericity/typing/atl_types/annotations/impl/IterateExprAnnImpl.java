/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.IterateExprAnn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterate Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.IterateExprAnnImpl#getResultVar <em>Result Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IterateExprAnnImpl extends AbstractIteratorExprAnnImpl implements IterateExprAnn {
	/**
	 * The cached value of the '{@link #getResultVar() <em>Result Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultVar()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation resultVar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterateExprAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.ITERATE_EXPR_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getResultVar() {
		return resultVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultVar(ExpressionAnnotation newResultVar, NotificationChain msgs) {
		ExpressionAnnotation oldResultVar = resultVar;
		resultVar = newResultVar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR, oldResultVar, newResultVar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultVar(ExpressionAnnotation newResultVar) {
		if (newResultVar != resultVar) {
			NotificationChain msgs = null;
			if (resultVar != null)
				msgs = ((InternalEObject)resultVar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR, null, msgs);
			if (newResultVar != null)
				msgs = ((InternalEObject)newResultVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR, null, msgs);
			msgs = basicSetResultVar(newResultVar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR, newResultVar, newResultVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR:
				return basicSetResultVar(null, msgs);
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
			case AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR:
				return getResultVar();
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
			case AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR:
				setResultVar((ExpressionAnnotation)newValue);
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
			case AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR:
				setResultVar((ExpressionAnnotation)null);
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
			case AnnotationsPackage.ITERATE_EXPR_ANN__RESULT_VAR:
				return resultVar != null;
		}
		return super.eIsSet(featureID);
	}

} //IterateExprAnnImpl
