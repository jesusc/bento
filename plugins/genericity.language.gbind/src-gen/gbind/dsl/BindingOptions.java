/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.dsl.BindingOptions#isEnableClassMerge <em>Enable Class Merge</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.dsl.DslPackage#getBindingOptions()
 * @model
 * @generated
 */
public interface BindingOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Enable Class Merge</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Class Merge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Class Merge</em>' attribute.
	 * @see #setEnableClassMerge(boolean)
	 * @see gbind.dsl.DslPackage#getBindingOptions_EnableClassMerge()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnableClassMerge();

	/**
	 * Sets the value of the '{@link gbind.dsl.BindingOptions#isEnableClassMerge <em>Enable Class Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Class Merge</em>' attribute.
	 * @see #isEnableClassMerge()
	 * @generated
	 */
	void setEnableClassMerge(boolean value);

} // BindingOptions
