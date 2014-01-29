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
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metamodel.metrics.Measure.MeasureSet#getElementName <em>Element Name</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.MeasureSet#getElementType <em>Element Type</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.MeasureSet#getMeasures <em>Measures</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.MeasureSet#getRoot <em>Root</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.MeasureSet#getSubsets <em>Subsets</em>}</li>
 *   <li>{@link metamodel.metrics.Measure.MeasureSet#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see metamodel.metrics.Measure.MeasurePackage#getMeasureSet()
 * @model
 * @generated
 */
public interface MeasureSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasureSet_ElementName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.MeasureSet#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metamodel.metrics.Measure.ElementKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see metamodel.metrics.Measure.ElementKind
	 * @see #setElementType(ElementKind)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasureSet_ElementType()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	ElementKind getElementType();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.MeasureSet#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see metamodel.metrics.Measure.ElementKind
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(ElementKind value);

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.metrics.Measure.Measure}.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.Measure#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference list.
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasureSet_Measures()
	 * @see metamodel.metrics.Measure.Measure#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.RootMeasureSet#getMeasureSets <em>Measure Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(RootMeasureSet)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasureSet_Root()
	 * @see metamodel.metrics.Measure.RootMeasureSet#getMeasureSets
	 * @model opposite="measureSets" transient="false" ordered="false"
	 * @generated
	 */
	RootMeasureSet getRoot();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.MeasureSet#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(RootMeasureSet value);

	/**
	 * Returns the value of the '<em><b>Subsets</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel.metrics.Measure.MeasureSet}.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.MeasureSet#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsets</em>' containment reference list.
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasureSet_Subsets()
	 * @see metamodel.metrics.Measure.MeasureSet#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<MeasureSet> getSubsets();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link metamodel.metrics.Measure.MeasureSet#getSubsets <em>Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(MeasureSet)
	 * @see metamodel.metrics.Measure.MeasurePackage#getMeasureSet_Parent()
	 * @see metamodel.metrics.Measure.MeasureSet#getSubsets
	 * @model opposite="subsets" transient="false" ordered="false"
	 * @generated
	 */
	MeasureSet getParent();

	/**
	 * Sets the value of the '{@link metamodel.metrics.Measure.MeasureSet#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(MeasureSet value);

} // MeasureSet
