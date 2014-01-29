/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.metrics.Measure.impl;

import java.util.Collection;

import metamodel.metrics.Measure.Category;
import metamodel.metrics.Measure.MeasurePackage;
import metamodel.metrics.Measure.MeasureSet;
import metamodel.metrics.Measure.ModelKind;
import metamodel.metrics.Measure.RootMeasureSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Measure Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metamodel.metrics.Measure.impl.RootMeasureSetImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.impl.RootMeasureSetImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.impl.RootMeasureSetImpl#getMeasureSets <em>Measure Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RootMeasureSetImpl extends EObjectImpl implements RootMeasureSet {
	/**
	 * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected static final ModelKind MODEL_TYPE_EDEFAULT = ModelKind.KM3;

	/**
	 * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelType()
	 * @generated
	 * @ordered
	 */
	protected ModelKind modelType = MODEL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getMeasureSets() <em>Measure Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureSets()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureSet> measureSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootMeasureSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurePackage.Literals.ROOT_MEASURE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelKind getModelType() {
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelType(ModelKind newModelType) {
		ModelKind oldModelType = modelType;
		modelType = newModelType == null ? MODEL_TYPE_EDEFAULT : newModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.ROOT_MEASURE_SET__MODEL_TYPE, oldModelType, modelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentWithInverseEList<Category>(Category.class, this, MeasurePackage.ROOT_MEASURE_SET__CATEGORIES, MeasurePackage.CATEGORY__ROOT);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureSet> getMeasureSets() {
		if (measureSets == null) {
			measureSets = new EObjectContainmentWithInverseEList<MeasureSet>(MeasureSet.class, this, MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS, MeasurePackage.MEASURE_SET__ROOT);
		}
		return measureSets;
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
			case MeasurePackage.ROOT_MEASURE_SET__CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategories()).basicAdd(otherEnd, msgs);
			case MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasureSets()).basicAdd(otherEnd, msgs);
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
			case MeasurePackage.ROOT_MEASURE_SET__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS:
				return ((InternalEList<?>)getMeasureSets()).basicRemove(otherEnd, msgs);
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
			case MeasurePackage.ROOT_MEASURE_SET__MODEL_TYPE:
				return getModelType();
			case MeasurePackage.ROOT_MEASURE_SET__CATEGORIES:
				return getCategories();
			case MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS:
				return getMeasureSets();
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
			case MeasurePackage.ROOT_MEASURE_SET__MODEL_TYPE:
				setModelType((ModelKind)newValue);
				return;
			case MeasurePackage.ROOT_MEASURE_SET__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS:
				getMeasureSets().clear();
				getMeasureSets().addAll((Collection<? extends MeasureSet>)newValue);
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
			case MeasurePackage.ROOT_MEASURE_SET__MODEL_TYPE:
				setModelType(MODEL_TYPE_EDEFAULT);
				return;
			case MeasurePackage.ROOT_MEASURE_SET__CATEGORIES:
				getCategories().clear();
				return;
			case MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS:
				getMeasureSets().clear();
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
			case MeasurePackage.ROOT_MEASURE_SET__MODEL_TYPE:
				return modelType != MODEL_TYPE_EDEFAULT;
			case MeasurePackage.ROOT_MEASURE_SET__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case MeasurePackage.ROOT_MEASURE_SET__MEASURE_SETS:
				return measureSets != null && !measureSets.isEmpty();
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
		result.append(" (modelType: ");
		result.append(modelType);
		result.append(')');
		return result.toString();
	}

} //RootMeasureSetImpl
