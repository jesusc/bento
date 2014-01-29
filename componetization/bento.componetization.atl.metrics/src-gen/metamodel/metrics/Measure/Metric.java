/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metamodel.metrics.Measure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.metrics.Measure.Metric#getName <em>Name</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.Metric#getDesc <em>Desc</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.Metric#getPreferredValue <em>Preferred Value</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.Metric#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.metrics.Measure.MeasurePackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMetric_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.Metric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMetric_Desc()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.Metric#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Preferred Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Value</em>' attribute.
	 * @see #setPreferredValue(String)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMetric_PreferredValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPreferredValue();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.Metric#getPreferredValue <em>Preferred Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Value</em>' attribute.
	 * @see #getPreferredValue()
	 * @generated
	 */
	void setPreferredValue(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.Category#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMetric_Category()
	 * @see metamodel.metrics.Measure.Category#getMetrics
	 * @model opposite="metrics" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.Metric#getCategory <em>Category</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

} // Metric
