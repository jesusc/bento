/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Renaming Feature Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.dsl.RenamingFeatureBinding#getConcreteFeature <em>Concrete Feature</em>}</li>
 * </ul>
 *
 * @see gbind.dsl.DslPackage#getRenamingFeatureBinding()
 * @model
 * @generated
 */
public interface RenamingFeatureBinding extends BaseFeatureBinding {
	/**
	 * Returns the value of the '<em><b>Concrete Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concrete Feature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concrete Feature</em>' attribute.
	 * @see #setConcreteFeature(String)
	 * @see gbind.dsl.DslPackage#getRenamingFeatureBinding_ConcreteFeature()
	 * @model required="true"
	 * @generated
	 */
	String getConcreteFeature();

	/**
	 * Sets the value of the '{@link gbind.dsl.RenamingFeatureBinding#getConcreteFeature <em>Concrete Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concrete Feature</em>' attribute.
	 * @see #getConcreteFeature()
	 * @generated
	 */
	void setConcreteFeature(String value);

} // RenamingFeatureBinding
