/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package genericity.typing.atl_types.annotations.impl;

import genericity.typing.atl_types.annotations.AnnotationsPackage;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.MapExprAnn;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Expr Ann</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.MapExprAnnImpl#getKeyInitializers <em>Key Initializers</em>}</li>
 *   <li>{@link genericity.typing.atl_types.annotations.impl.MapExprAnnImpl#getValueInitializers <em>Value Initializers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapExprAnnImpl extends ExpressionAnnotationImpl implements MapExprAnn {
	/**
	 * The cached value of the '{@link #getKeyInitializers() <em>Key Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionAnnotation> keyInitializers;

	/**
	 * The cached value of the '{@link #getValueInitializers() <em>Value Initializers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInitializers()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpressionAnnotation> valueInitializers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapExprAnnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotationsPackage.Literals.MAP_EXPR_ANN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionAnnotation> getKeyInitializers() {
		if (keyInitializers == null) {
			keyInitializers = new EObjectContainmentEList<ExpressionAnnotation>(ExpressionAnnotation.class, this, AnnotationsPackage.MAP_EXPR_ANN__KEY_INITIALIZERS);
		}
		return keyInitializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpressionAnnotation> getValueInitializers() {
		if (valueInitializers == null) {
			valueInitializers = new EObjectContainmentEList<ExpressionAnnotation>(ExpressionAnnotation.class, this, AnnotationsPackage.MAP_EXPR_ANN__VALUE_INITIALIZERS);
		}
		return valueInitializers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotationsPackage.MAP_EXPR_ANN__KEY_INITIALIZERS:
				return ((InternalEList<?>)getKeyInitializers()).basicRemove(otherEnd, msgs);
			case AnnotationsPackage.MAP_EXPR_ANN__VALUE_INITIALIZERS:
				return ((InternalEList<?>)getValueInitializers()).basicRemove(otherEnd, msgs);
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
			case AnnotationsPackage.MAP_EXPR_ANN__KEY_INITIALIZERS:
				return getKeyInitializers();
			case AnnotationsPackage.MAP_EXPR_ANN__VALUE_INITIALIZERS:
				return getValueInitializers();
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
			case AnnotationsPackage.MAP_EXPR_ANN__KEY_INITIALIZERS:
				getKeyInitializers().clear();
				getKeyInitializers().addAll((Collection<? extends ExpressionAnnotation>)newValue);
				return;
			case AnnotationsPackage.MAP_EXPR_ANN__VALUE_INITIALIZERS:
				getValueInitializers().clear();
				getValueInitializers().addAll((Collection<? extends ExpressionAnnotation>)newValue);
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
			case AnnotationsPackage.MAP_EXPR_ANN__KEY_INITIALIZERS:
				getKeyInitializers().clear();
				return;
			case AnnotationsPackage.MAP_EXPR_ANN__VALUE_INITIALIZERS:
				getValueInitializers().clear();
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
			case AnnotationsPackage.MAP_EXPR_ANN__KEY_INITIALIZERS:
				return keyInitializers != null && !keyInitializers.isEmpty();
			case AnnotationsPackage.MAP_EXPR_ANN__VALUE_INITIALIZERS:
				return valueInitializers != null && !valueInitializers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MapExprAnnImpl
