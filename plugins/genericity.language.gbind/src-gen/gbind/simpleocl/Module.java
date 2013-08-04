/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gbind.simpleocl.Module#getMetamodels <em>Metamodels</em>}</li>
 *   <li>{@link gbind.simpleocl.Module#getImports <em>Imports</em>}</li>
 *   <li>{@link gbind.simpleocl.Module#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Metamodels</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.simpleocl.OclMetamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodels</em>' containment reference list.
	 * @see gbind.simpleocl.SimpleoclPackage#getModule_Metamodels()
	 * @model containment="true"
	 * @generated
	 */
	EList<OclMetamodel> getMetamodels();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.simpleocl.Import}.
	 * It is bidirectional and its opposite is '{@link gbind.simpleocl.Import#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see gbind.simpleocl.SimpleoclPackage#getModule_Imports()
	 * @see gbind.simpleocl.Import#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link gbind.simpleocl.ModuleElement}.
	 * It is bidirectional and its opposite is '{@link gbind.simpleocl.ModuleElement#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see gbind.simpleocl.SimpleoclPackage#getModule_Elements()
	 * @see gbind.simpleocl.ModuleElement#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<ModuleElement> getElements();

} // Module
