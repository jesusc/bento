/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.annotations.AbstractIteratorExprAnn;
import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Iterator Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.AbstractIteratorExprAnnImpl#getSource <em>Source</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.AbstractIteratorExprAnnImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractIteratorExprAnnImpl extends ExpressionAnnotationImpl implements AbstractIteratorExprAnn {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation source;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected ExpressionAnnotation body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractIteratorExprAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.ABSTRACT_ITERATOR_EXPR_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ExpressionAnnotation newSource, NotificationChain msgs) {
		ExpressionAnnotation oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ExpressionAnnotation newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAnnotation getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(ExpressionAnnotation newBody, NotificationChain msgs) {
		ExpressionAnnotation oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(ExpressionAnnotation newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE:
				return basicSetSource(null, msgs);
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY:
				return basicSetBody(null, msgs);
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
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE:
				return getSource();
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY:
				return getBody();
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
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE:
				setSource((ExpressionAnnotation)newValue);
				return;
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY:
				setBody((ExpressionAnnotation)newValue);
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
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE:
				setSource((ExpressionAnnotation)null);
				return;
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY:
				setBody((ExpressionAnnotation)null);
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
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__SOURCE:
				return source != null;
			case AnnotationsPackage.ABSTRACT_ITERATOR_EXPR_ANN__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractIteratorExprAnnImpl
