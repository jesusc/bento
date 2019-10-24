/**
 */
package metamodel_bdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gaussian</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metamodel_bdsl.Gaussian#getLocation <em>Location</em>}</li>
 *   <li>{@link metamodel_bdsl.Gaussian#getScale <em>Scale</em>}</li>
 *   <li>{@link metamodel_bdsl.Gaussian#getContainslocationGaussian <em>Containslocation Gaussian</em>}</li>
 *   <li>{@link metamodel_bdsl.Gaussian#getContainsscaleGaussian <em>Containsscale Gaussian</em>}</li>
 * </ul>
 *
 * @see metamodel_bdsl.Metamodel_bdslPackage#getGaussian()
 * @model
 * @generated
 */
public interface Gaussian extends Distribution, BindingElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getGaussian_Location()
	 * @model default="1"
	 * @generated
	 */
	double getLocation();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Gaussian#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(double value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Double)
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getGaussian_Scale()
	 * @model default="1" dataType="metamodel_bdsl.PositiveDoubleNotNull"
	 * @generated
	 */
	Double getScale();

	/**
	 * Sets the value of the '{@link metamodel_bdsl.Gaussian#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Double value);

	/**
	 * Returns the value of the '<em><b>Containslocation Gaussian</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.locationGaussian}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containslocation Gaussian</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containslocation Gaussian</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getGaussian_ContainslocationGaussian()
	 * @model containment="true"
	 * @generated
	 */
	EList<locationGaussian> getContainslocationGaussian();

	/**
	 * Returns the value of the '<em><b>Containsscale Gaussian</b></em>' containment reference list.
	 * The list contents are of type {@link metamodel_bdsl.scaleGaussian}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containsscale Gaussian</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containsscale Gaussian</em>' containment reference list.
	 * @see metamodel_bdsl.Metamodel_bdslPackage#getGaussian_ContainsscaleGaussian()
	 * @model containment="true"
	 * @generated
	 */
	EList<scaleGaussian> getContainsscaleGaussian();

} // Gaussian
