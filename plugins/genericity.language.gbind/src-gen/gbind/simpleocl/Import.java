/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gbind.simpleocl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gbind.simpleocl.Import#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see gbind.simpleocl.SimpleoclPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link gbind.simpleocl.Module#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see gbind.simpleocl.SimpleoclPackage#getImport_Module()
	 * @see gbind.simpleocl.Module#getImports
	 * @model opposite="imports" required="true" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link gbind.simpleocl.Import#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // Import
