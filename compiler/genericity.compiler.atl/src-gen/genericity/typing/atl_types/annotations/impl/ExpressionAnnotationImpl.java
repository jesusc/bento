/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.Type;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl#getType <em>Type</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.ExpressionAnnotationImpl#getUsedFeature <em>Used Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionAnnotationImpl extends AtlAnnotationImpl implements ExpressionAnnotation {
	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected EObject expr;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getUsedFeature() <em>Used Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedFeature()
	 * @generated
	 * @ordered
	 */
	protected EObject usedFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.EXPRESSION_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getExpr() {
		if (expr != null && expr.eIsProxy()) {
			InternalEObject oldExpr = (InternalEObject)expr;
			expr = eResolveProxy(oldExpr);
			if (expr != oldExpr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.EXPRESSION_ANNOTATION__EXPR, oldExpr, expr));
			}
		}
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(EObject newExpr) {
		EObject oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.EXPRESSION_ANNOTATION__EXPR, oldExpr, expr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.EXPRESSION_ANNOTATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.EXPRESSION_ANNOTATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getUsedFeature() {
		if (usedFeature != null && usedFeature.eIsProxy()) {
			InternalEObject oldUsedFeature = (InternalEObject)usedFeature;
			usedFeature = eResolveProxy(oldUsedFeature);
			if (usedFeature != oldUsedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotationsPackage.EXPRESSION_ANNOTATION__USED_FEATURE, oldUsedFeature, usedFeature));
			}
		}
		return usedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetUsedFeature() {
		return usedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedFeature(EObject newUsedFeature) {
		EObject oldUsedFeature = usedFeature;
		usedFeature = newUsedFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.EXPRESSION_ANNOTATION__USED_FEATURE, oldUsedFeature, usedFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnnotationsPackage.EXPRESSION_ANNOTATION__EXPR:
				if (resolve) return getExpr();
				return basicGetExpr();
			case AnnotationsPackage.EXPRESSION_ANNOTATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case AnnotationsPackage.EXPRESSION_ANNOTATION__USED_FEATURE:
				if (resolve) return getUsedFeature();
				return basicGetUsedFeature();
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
			case AnnotationsPackage.EXPRESSION_ANNOTATION__EXPR:
				setExpr((EObject)newValue);
				return;
			case AnnotationsPackage.EXPRESSION_ANNOTATION__TYPE:
				setType((Type)newValue);
				return;
			case AnnotationsPackage.EXPRESSION_ANNOTATION__USED_FEATURE:
				setUsedFeature((EObject)newValue);
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
			case AnnotationsPackage.EXPRESSION_ANNOTATION__EXPR:
				setExpr((EObject)null);
				return;
			case AnnotationsPackage.EXPRESSION_ANNOTATION__TYPE:
				setType((Type)null);
				return;
			case AnnotationsPackage.EXPRESSION_ANNOTATION__USED_FEATURE:
				setUsedFeature((EObject)null);
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
			case AnnotationsPackage.EXPRESSION_ANNOTATION__EXPR:
				return expr != null;
			case AnnotationsPackage.EXPRESSION_ANNOTATION__TYPE:
				return type != null;
			case AnnotationsPackage.EXPRESSION_ANNOTATION__USED_FEATURE:
				return usedFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpressionAnnotationImpl
