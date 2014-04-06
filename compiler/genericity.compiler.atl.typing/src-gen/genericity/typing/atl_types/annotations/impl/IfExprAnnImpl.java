/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.IfExprAnn;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.IfExprAnnImpl#getIfCondition <em>If Condition</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.IfExprAnnImpl#getThenPart <em>Then Part</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.IfExprAnnImpl#getElsePart <em>Else Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfExprAnnImpl extends ExpressionAnnotationImpl implements IfExprAnn {
	/**
	 * The cached value of the '{@link #getIfCondition() <em>If Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfCondition()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation ifCondition;

	/**
	 * The cached value of the '{@link #getThenPart() <em>Then Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenPart()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation thenPart;

	/**
	 * The cached value of the '{@link #getElsePart() <em>Else Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsePart()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation elsePart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfExprAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.IF_EXPR_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getIfCondition() {
		return ifCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfCondition(ExpressionAnnotation newIfCondition, NotificationChain msgs) {
		ExpressionAnnotation oldIfCondition = ifCondition;
		ifCondition = newIfCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION, oldIfCondition, newIfCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfCondition(ExpressionAnnotation newIfCondition) {
		if (newIfCondition != ifCondition) {
			NotificationChain msgs = null;
			if (ifCondition != null)
				msgs = ((InternalEObject)ifCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION, null, msgs);
			if (newIfCondition != null)
				msgs = ((InternalEObject)newIfCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION, null, msgs);
			msgs = basicSetIfCondition(newIfCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION, newIfCondition, newIfCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getThenPart() {
		return thenPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenPart(ExpressionAnnotation newThenPart, NotificationChain msgs) {
		ExpressionAnnotation oldThenPart = thenPart;
		thenPart = newThenPart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IF_EXPR_ANN__THEN_PART, oldThenPart, newThenPart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenPart(ExpressionAnnotation newThenPart) {
		if (newThenPart != thenPart) {
			NotificationChain msgs = null;
			if (thenPart != null)
				msgs = ((InternalEObject)thenPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.IF_EXPR_ANN__THEN_PART, null, msgs);
			if (newThenPart != null)
				msgs = ((InternalEObject)newThenPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.IF_EXPR_ANN__THEN_PART, null, msgs);
			msgs = basicSetThenPart(newThenPart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IF_EXPR_ANN__THEN_PART, newThenPart, newThenPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getElsePart() {
		return elsePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElsePart(ExpressionAnnotation newElsePart, NotificationChain msgs) {
		ExpressionAnnotation oldElsePart = elsePart;
		elsePart = newElsePart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IF_EXPR_ANN__ELSE_PART, oldElsePart, newElsePart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElsePart(ExpressionAnnotation newElsePart) {
		if (newElsePart != elsePart) {
			NotificationChain msgs = null;
			if (elsePart != null)
				msgs = ((InternalEObject)elsePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.IF_EXPR_ANN__ELSE_PART, null, msgs);
			if (newElsePart != null)
				msgs = ((InternalEObject)newElsePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.IF_EXPR_ANN__ELSE_PART, null, msgs);
			msgs = basicSetElsePart(newElsePart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.IF_EXPR_ANN__ELSE_PART, newElsePart, newElsePart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION:
				return basicSetIfCondition(null, msgs);
			case AnnotationsPackage.IF_EXPR_ANN__THEN_PART:
				return basicSetThenPart(null, msgs);
			case AnnotationsPackage.IF_EXPR_ANN__ELSE_PART:
				return basicSetElsePart(null, msgs);
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
			case AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION:
				return getIfCondition();
			case AnnotationsPackage.IF_EXPR_ANN__THEN_PART:
				return getThenPart();
			case AnnotationsPackage.IF_EXPR_ANN__ELSE_PART:
				return getElsePart();
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
			case AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION:
				setIfCondition((ExpressionAnnotation)newValue);
				return;
			case AnnotationsPackage.IF_EXPR_ANN__THEN_PART:
				setThenPart((ExpressionAnnotation)newValue);
				return;
			case AnnotationsPackage.IF_EXPR_ANN__ELSE_PART:
				setElsePart((ExpressionAnnotation)newValue);
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
			case AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION:
				setIfCondition((ExpressionAnnotation)null);
				return;
			case AnnotationsPackage.IF_EXPR_ANN__THEN_PART:
				setThenPart((ExpressionAnnotation)null);
				return;
			case AnnotationsPackage.IF_EXPR_ANN__ELSE_PART:
				setElsePart((ExpressionAnnotation)null);
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
			case AnnotationsPackage.IF_EXPR_ANN__IF_CONDITION:
				return ifCondition != null;
			case AnnotationsPackage.IF_EXPR_ANN__THEN_PART:
				return thenPart != null;
			case AnnotationsPackage.IF_EXPR_ANN__ELSE_PART:
				return elsePart != null;
		}
		return super.eIsSet(featureID);
	}

} //IfExprAnnImpl
