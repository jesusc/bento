/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.metrics.Measure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Measure Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.metrics.Measure.RootMeasureSet#getModelType <em>Model Type</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.RootMeasureSet#getCategories <em>Categories</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.RootMeasureSet#getMeasureSets <em>Measure Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.metrics.Measure.MeasurePackage#getRootMeasureSet()
 * @model
 * @generated
 */
public interface RootMeasureSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel.metrics.Measure.ModelKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Type</em>' attribute.
	 * @see metamodel.metrics.Measure.ModelKind
	 * @see #setModelType(ModelKind)
	 * @see metamodel.metrics.Measure.MeasurePackage#getRootMeasureSet_ModelType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ModelKind getModelType();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.RootMeasureSet#getModelType <em>Model Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Type</em>' attribute.
	 * @see metamodel.metrics.Measure.ModelKind
	 * @see #getModelType()
	 * @generated
	 */
	void setModelType(ModelKind value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.metrics.Measure.Category}.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.Category#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see metamodel.metrics.Measure.MeasurePackage#getRootMeasureSet_Categories()
	 * @see metamodel.metrics.Measure.Category#getRoot
	 * @model opposite="root" containment="true" required="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Measure Sets</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.metrics.Measure.MeasureSet}.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.MeasureSet#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Sets</em>' containment reference list.
	 * @see metamodel.metrics.Measure.MeasurePackage#getRootMeasureSet_MeasureSets()
	 * @see metamodel.metrics.Measure.MeasureSet#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<MeasureSet> getMeasureSets();

} // RootMeasureSet
