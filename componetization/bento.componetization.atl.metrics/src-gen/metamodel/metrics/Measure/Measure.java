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
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.metrics.Measure.Measure#getMetric <em>Metric</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.Measure#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.metrics.Measure.MeasurePackage#getMeasure()
 * @model abstract="true"
 * @generated
 */
public interface Measure extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasure_Metric()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.Measure#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.MeasureSet#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(MeasureSet)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasure_Owner()
	 * @see metamodel.metrics.Measure.MeasureSet#getMeasures
	 * @model opposite="measures" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MeasureSet getOwner();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.Measure#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(MeasureSet value);

} // Measure
