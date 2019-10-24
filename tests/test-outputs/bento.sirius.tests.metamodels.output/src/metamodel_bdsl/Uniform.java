/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Uniform#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link metamodel_bdsl.Uniform#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link metamodel_bdsl.Uniform#getContainsminimumUniform <em>Containsminimum Uniform</em>}</li>
 *   <li>{@link metamodel_bdsl.Uniform#getContainsmaximumUniform <em>Containsmaximum Uniform</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getUniform()
 * @model
 * @generated
 */
public interface Uniform extends Distribution, BindingElement {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getUniform_Minimum()
	 * @model default="0.0"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Uniform#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getUniform_Maximum()
	 * @model default="0.0"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Uniform#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Returns the value of the '<em><b>Containsminimum Uniform</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.minimumUniform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsminimum Uniform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsminimum Uniform</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getUniform_ContainsminimumUniform()
	 * @model containment="true"
	 * @generated
	 */
	EList<minimumUniform> getContainsminimumUniform();

	/**
	 * Returns the value of the '<em><b>Containsmaximum Uniform</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.maximumUniform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsmaximum Uniform</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsmaximum Uniform</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getUniform_ContainsmaximumUniform()
	 * @model containment="true"
	 * @generated
	 */
	EList<maximumUniform> getContainsmaximumUniform();

} // Uniform
